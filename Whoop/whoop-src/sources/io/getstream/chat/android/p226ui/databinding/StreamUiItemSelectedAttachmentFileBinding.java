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
public final class StreamUiItemSelectedAttachmentFileBinding implements InterfaceC13008a {
    public final ImageView ivFileThumb;
    private final ConstraintLayout rootView;
    public final ImageButton tvClose;
    public final TextView tvFileSize;
    public final TextView tvFileTitle;

    private StreamUiItemSelectedAttachmentFileBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageButton imageButton, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.ivFileThumb = imageView;
        this.tvClose = imageButton;
        this.tvFileSize = textView;
        this.tvFileTitle = textView2;
    }

    public static StreamUiItemSelectedAttachmentFileBinding bind(View view) {
        int i13 = C19469R.id.ivFileThumb;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.tvClose;
            ImageButton imageButton = (ImageButton) AbstractC34235f.m108203J(view, i13);
            if (imageButton != null) {
                i13 = C19469R.id.tvFileSize;
                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView != null) {
                    i13 = C19469R.id.tvFileTitle;
                    TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView2 != null) {
                        return new StreamUiItemSelectedAttachmentFileBinding((ConstraintLayout) view, imageView, imageButton, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemSelectedAttachmentFileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemSelectedAttachmentFileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_selected_attachment_file, viewGroup, false);
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
