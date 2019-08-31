package com.recycle.laundrymanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OverviewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<WashingMachine> mMachines;
    private LayoutInflater mInflater;

    private OnClickListener mClickListener;

    public interface OnClickListener{
        public void setItem(String item);
    }

    public void setClickListener(OverviewAdapter.OnClickListener callback) {
        mClickListener = callback;
    }


    public OverviewAdapter(Context context, List<WashingMachine> mMachines) {
        this.mInflater = LayoutInflater.from(context);
        this.mMachines = mMachines;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.washing_maching_item, parent, false);
        RecyclerView.ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ViewHolder viewHolder = (ViewHolder)holder;
        viewHolder.mTextView.setText(mMachines.get(position).getDrawable_label());
        viewHolder.mImageView.setImageResource(mMachines.get(position).getDrawable_id());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mClickListener != null) {
                    mClickListener.setItem(mMachines.get(position).getDrawable_label());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mMachines.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;
        ImageView mImageView;
        View mView;

        ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            mTextView = (TextView) itemView.findViewById(R.id.status_text);
            mImageView = (ImageView) itemView.findViewById(R.id.washing_machine_img);
        }
    }
}
