package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.internal.StreamPlayerView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemAttachmentGalleryVideoBinding implements InterfaceC13008a {
    public final CardView playButtonCardView;
    public final ImageView playButtonImageView;
    public final StreamPlayerView playerView;
    public final ProgressBar progressBar;
    private final FrameLayout rootView;
    public final ImageView thumbnailImageView;

    private StreamUiItemAttachmentGalleryVideoBinding(FrameLayout frameLayout, CardView cardView, ImageView imageView, StreamPlayerView streamPlayerView, ProgressBar progressBar, ImageView imageView2) {
        this.rootView = frameLayout;
        this.playButtonCardView = cardView;
        this.playButtonImageView = imageView;
        this.playerView = streamPlayerView;
        this.progressBar = progressBar;
        this.thumbnailImageView = imageView2;
    }

    public static StreamUiItemAttachmentGalleryVideoBinding bind(View view) {
        int i13 = C19469R.id.playButtonCardView;
        CardView cardView = (CardView) AbstractC34235f.m108203J(view, i13);
        if (cardView != null) {
            i13 = C19469R.id.playButtonImageView;
            ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView != null) {
                i13 = C19469R.id.playerView;
                StreamPlayerView streamPlayerView = (StreamPlayerView) AbstractC34235f.m108203J(view, i13);
                if (streamPlayerView != null) {
                    i13 = C19469R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                    if (progressBar != null) {
                        i13 = C19469R.id.thumbnailImageView;
                        ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                        if (imageView2 != null) {
                            return new StreamUiItemAttachmentGalleryVideoBinding((FrameLayout) view, cardView, imageView, streamPlayerView, progressBar, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemAttachmentGalleryVideoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemAttachmentGalleryVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_attachment_gallery_video, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final FrameLayout getRoot() {
        return this.rootView;
    }
}
