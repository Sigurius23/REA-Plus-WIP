package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiLinkAttachmentsViewBinding implements InterfaceC13008a {
    public final TextView descriptionTextView;
    public final FrameLayout labelContainer;
    public final TextView labelTextView;
    public final FrameLayout linkPreviewContainer;
    public final ImageView linkPreviewImageView;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final TextView titleTextView;

    private StreamUiLinkAttachmentsViewBinding(ConstraintLayout constraintLayout, TextView textView, FrameLayout frameLayout, TextView textView2, FrameLayout frameLayout2, ImageView imageView, ProgressBar progressBar, TextView textView3) {
        this.rootView = constraintLayout;
        this.descriptionTextView = textView;
        this.labelContainer = frameLayout;
        this.labelTextView = textView2;
        this.linkPreviewContainer = frameLayout2;
        this.linkPreviewImageView = imageView;
        this.progressBar = progressBar;
        this.titleTextView = textView3;
    }

    public static StreamUiLinkAttachmentsViewBinding bind(View view) {
        int i13 = C19469R.id.descriptionTextView;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.labelContainer;
            FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
            if (frameLayout != null) {
                i13 = C19469R.id.labelTextView;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    i13 = C19469R.id.linkPreviewContainer;
                    FrameLayout frameLayout2 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                    if (frameLayout2 != null) {
                        i13 = C19469R.id.linkPreviewImageView;
                        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                        if (imageView != null) {
                            i13 = C19469R.id.progressBar;
                            ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                            if (progressBar != null) {
                                i13 = C19469R.id.titleTextView;
                                TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                                if (textView3 != null) {
                                    return new StreamUiLinkAttachmentsViewBinding((ConstraintLayout) view, textView, frameLayout, textView2, frameLayout2, imageView, progressBar, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiLinkAttachmentsViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiLinkAttachmentsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_link_attachments_view, viewGroup, false);
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
