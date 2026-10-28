package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiChannelListItemBackgroundViewBinding implements InterfaceC13008a {
    public final ConstraintLayout backgroundView;
    public final ImageView deleteImageView;
    public final ImageView moreOptionsImageView;
    private final ConstraintLayout rootView;

    private StreamUiChannelListItemBackgroundViewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2) {
        this.rootView = constraintLayout;
        this.backgroundView = constraintLayout2;
        this.deleteImageView = imageView;
        this.moreOptionsImageView = imageView2;
    }

    public static StreamUiChannelListItemBackgroundViewBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i13 = C19469R.id.deleteImageView;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.moreOptionsImageView;
            ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView2 != null) {
                return new StreamUiChannelListItemBackgroundViewBinding(constraintLayout, constraintLayout, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiChannelListItemBackgroundViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiChannelListItemBackgroundViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_channel_list_item_background_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }
}
