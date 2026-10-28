package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.photoview.PhotoView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemAttachmentGalleryImageBinding implements InterfaceC13008a {
    public final PhotoView photoView;
    public final ImageView placeHolderImageView;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;

    private StreamUiItemAttachmentGalleryImageBinding(ConstraintLayout constraintLayout, PhotoView photoView, ImageView imageView, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.photoView = photoView;
        this.placeHolderImageView = imageView;
        this.progressBar = progressBar;
    }

    public static StreamUiItemAttachmentGalleryImageBinding bind(View view) {
        int i13 = C19469R.id.photoView;
        PhotoView photoView = (PhotoView) AbstractC34235f.m108203J(view, i13);
        if (photoView != null) {
            i13 = C19469R.id.placeHolderImageView;
            ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView != null) {
                i13 = C19469R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                if (progressBar != null) {
                    return new StreamUiItemAttachmentGalleryImageBinding((ConstraintLayout) view, photoView, imageView, progressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemAttachmentGalleryImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemAttachmentGalleryImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_attachment_gallery_image, viewGroup, false);
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
