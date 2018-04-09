package org.impactit.rssfeedparser;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bikram Koju on 4/9/18.
 * ImpactIT
 * info@impactit.org
 */
public class RssFeedListAdapter extends RecyclerView.Adapter<RssFeedListAdapter.FeedModelViewHolder> {
    private List<RssFeedModel> mRssFeedModels;

    RssFeedListAdapter(List<RssFeedModel> rssFeedModels) {
        mRssFeedModels = rssFeedModels;
    }

    @NonNull
    @Override
    public FeedModelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int type) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rss_feed, parent, false);
        return new FeedModelViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedModelViewHolder holder, int position) {
        final RssFeedModel rssFeedModel = mRssFeedModels.get(position);
        ((TextView) holder.rssFeedView.findViewById(R.id.titleText)).setText(rssFeedModel.title);
        ((TextView) holder.rssFeedView.findViewById(R.id.descriptionText)).setText(rssFeedModel.description);
        ((TextView) holder.rssFeedView.findViewById(R.id.linkText)).setText(rssFeedModel.link);
    }

    @Override
    public int getItemCount() {
        return mRssFeedModels.size();
    }

    static class FeedModelViewHolder extends RecyclerView.ViewHolder {
        View rssFeedView;

        FeedModelViewHolder(View v) {
            super(v);
            rssFeedView = v;

        }
    }
}
