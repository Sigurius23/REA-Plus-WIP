package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiGiphyMediaAttachmentViewBinding implements InterfaceC13008a {
    public final ImageView giphyLabel;
    public final ShapeableImageView imageView;
    public final FrameLayout loadImage;
    public final ProgressBar loadingProgressBar;
    public final ConstraintLayout mediaAttachmentContent;
    private final ConstraintLayout rootView;

    private StreamUiGiphyMediaAttachmentViewBinding(ConstraintLayout constraintLayout, ImageView imageView, ShapeableImageView shapeableImageView, FrameLayout frameLayout, ProgressBar progressBar, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.giphyLabel = imageView;
        this.imageView = shapeableImageView;
        this.loadImage = frameLayout;
        this.loadingProgressBar = progressBar;
        this.mediaAttachmentContent = constraintLayout2;
    }

    public static StreamUiGiphyMediaAttachmentViewBinding bind(View view) {
        int i13 = C19469R.id.giphyLabel;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.imageView;
            ShapeableImageView shapeableImageView = (ShapeableImageView) AbstractC34235f.m108203J(view, i13);
            if (shapeableImageView != null) {
                i13 = C19469R.id.loadImage;
                FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                if (frameLayout != null) {
                    i13 = C19469R.id.loadingProgressBar;
                    ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                    if (progressBar != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new StreamUiGiphyMediaAttachmentViewBinding(constraintLayout, imageView, shapeableImageView, frameLayout, progressBar, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiGiphyMediaAttachmentViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiGiphyMediaAttachmentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_giphy_media_attachment_view, viewGroup, false);
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
