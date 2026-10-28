package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiUnsupportedAttachmentPreviewBinding implements InterfaceC13008a {
    public final ConstraintLayout attachmentContainer;
    public final ImageView iconImageView;
    public final ImageButton removeButton;
    private final ConstraintLayout rootView;
    public final TextView titleImageView;

    private StreamUiUnsupportedAttachmentPreviewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageButton imageButton, TextView textView) {
        this.rootView = constraintLayout;
        this.attachmentContainer = constraintLayout2;
        this.iconImageView = imageView;
        this.removeButton = imageButton;
        this.titleImageView = textView;
    }

    public static StreamUiUnsupportedAttachmentPreviewBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i13 = C19469R.id.iconImageView;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.removeButton;
            ImageButton imageButton = (ImageButton) AbstractC34235f.m108203J(view, i13);
            if (imageButton != null) {
                i13 = C19469R.id.titleImageView;
                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView != null) {
                    return new StreamUiUnsupportedAttachmentPreviewBinding(constraintLayout, constraintLayout, imageView, imageButton, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiUnsupportedAttachmentPreviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiUnsupportedAttachmentPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_unsupported_attachment_preview, viewGroup, false);
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
