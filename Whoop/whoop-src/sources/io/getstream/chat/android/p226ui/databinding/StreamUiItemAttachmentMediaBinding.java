package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemAttachmentMediaBinding implements InterfaceC13008a {
    public final ImageView mediaThumbnailImageView;
    private final ConstraintLayout rootView;
    public final ImageView selectionMarkImageView;
    public final View selectionOverlayView;
    public final ConstraintLayout videoInformationConstraintLayout;
    public final TextView videoLengthTextView;
    public final ImageView videoLogoImageView;

    private StreamUiItemAttachmentMediaBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, View view, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView3) {
        this.rootView = constraintLayout;
        this.mediaThumbnailImageView = imageView;
        this.selectionMarkImageView = imageView2;
        this.selectionOverlayView = view;
        this.videoInformationConstraintLayout = constraintLayout2;
        this.videoLengthTextView = textView;
        this.videoLogoImageView = imageView3;
    }

    public static StreamUiItemAttachmentMediaBinding bind(View view) {
        View viewM108203J;
        int i13 = C19469R.id.mediaThumbnailImageView;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.selectionMarkImageView;
            ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView2 != null && (viewM108203J = AbstractC34235f.m108203J(view, (i13 = C19469R.id.selectionOverlayView))) != null) {
                i13 = C19469R.id.videoInformationConstraintLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                if (constraintLayout != null) {
                    i13 = C19469R.id.videoLengthTextView;
                    TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView != null) {
                        i13 = C19469R.id.videoLogoImageView;
                        ImageView imageView3 = (ImageView) AbstractC34235f.m108203J(view, i13);
                        if (imageView3 != null) {
                            return new StreamUiItemAttachmentMediaBinding((ConstraintLayout) view, imageView, imageView2, viewM108203J, constraintLayout, textView, imageView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemAttachmentMediaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemAttachmentMediaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_attachment_media, viewGroup, false);
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
