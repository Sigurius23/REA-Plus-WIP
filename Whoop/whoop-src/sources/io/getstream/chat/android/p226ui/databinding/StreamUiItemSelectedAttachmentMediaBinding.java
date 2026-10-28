package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemSelectedAttachmentMediaBinding implements InterfaceC13008a {
    public final ImageButton btnClose;
    public final ShapeableImageView ivMedia;
    private final ConstraintLayout rootView;
    public final TextView tvError;

    private StreamUiItemSelectedAttachmentMediaBinding(ConstraintLayout constraintLayout, ImageButton imageButton, ShapeableImageView shapeableImageView, TextView textView) {
        this.rootView = constraintLayout;
        this.btnClose = imageButton;
        this.ivMedia = shapeableImageView;
        this.tvError = textView;
    }

    public static StreamUiItemSelectedAttachmentMediaBinding bind(View view) {
        int i13 = C19469R.id.btnClose;
        ImageButton imageButton = (ImageButton) AbstractC34235f.m108203J(view, i13);
        if (imageButton != null) {
            i13 = C19469R.id.ivMedia;
            ShapeableImageView shapeableImageView = (ShapeableImageView) AbstractC34235f.m108203J(view, i13);
            if (shapeableImageView != null) {
                i13 = C19469R.id.tvError;
                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView != null) {
                    return new StreamUiItemSelectedAttachmentMediaBinding((ConstraintLayout) view, imageButton, shapeableImageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemSelectedAttachmentMediaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemSelectedAttachmentMediaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_selected_attachment_media, viewGroup, false);
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
