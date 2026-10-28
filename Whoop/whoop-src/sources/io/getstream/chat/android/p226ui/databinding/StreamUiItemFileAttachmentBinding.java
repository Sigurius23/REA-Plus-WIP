package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemFileAttachmentBinding implements InterfaceC13008a {
    public final ImageView actionButton;
    public final TextView fileSize;
    public final TextView fileTitle;
    public final ImageView fileTypeIcon;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;

    private StreamUiItemFileAttachmentBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.actionButton = imageView;
        this.fileSize = textView;
        this.fileTitle = textView2;
        this.fileTypeIcon = imageView2;
        this.progressBar = progressBar;
    }

    public static StreamUiItemFileAttachmentBinding bind(View view) {
        int i13 = C19469R.id.actionButton;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.fileSize;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = C19469R.id.fileTitle;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    i13 = C19469R.id.fileTypeIcon;
                    ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                    if (imageView2 != null) {
                        i13 = C19469R.id.progressBar;
                        ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                        if (progressBar != null) {
                            return new StreamUiItemFileAttachmentBinding((ConstraintLayout) view, imageView, textView, textView2, imageView2, progressBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemFileAttachmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemFileAttachmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_file_attachment, viewGroup, false);
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
