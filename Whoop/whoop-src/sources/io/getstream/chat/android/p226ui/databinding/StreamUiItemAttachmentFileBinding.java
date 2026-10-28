package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemAttachmentFileBinding implements InterfaceC13008a {
    public final TextView fileNameTextView;
    public final TextView fileSizeTextView;
    public final ImageView fileTypeImageView;
    private final ConstraintLayout rootView;
    public final CheckedTextView selectionIndicator;

    private StreamUiItemAttachmentFileBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, CheckedTextView checkedTextView) {
        this.rootView = constraintLayout;
        this.fileNameTextView = textView;
        this.fileSizeTextView = textView2;
        this.fileTypeImageView = imageView;
        this.selectionIndicator = checkedTextView;
    }

    public static StreamUiItemAttachmentFileBinding bind(View view) {
        int i13 = C19469R.id.fileNameTextView;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.fileSizeTextView;
            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView2 != null) {
                i13 = C19469R.id.fileTypeImageView;
                ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                if (imageView != null) {
                    i13 = C19469R.id.selectionIndicator;
                    CheckedTextView checkedTextView = (CheckedTextView) AbstractC34235f.m108203J(view, i13);
                    if (checkedTextView != null) {
                        return new StreamUiItemAttachmentFileBinding((ConstraintLayout) view, textView, textView2, imageView, checkedTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemAttachmentFileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemAttachmentFileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_attachment_file, viewGroup, false);
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
