package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiActivityAttachmentBinding implements InterfaceC13008a {
    public final ImageView ivImage;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final WebView webView;

    private StreamUiActivityAttachmentBinding(ConstraintLayout constraintLayout, ImageView imageView, ProgressBar progressBar, WebView webView) {
        this.rootView = constraintLayout;
        this.ivImage = imageView;
        this.progressBar = progressBar;
        this.webView = webView;
    }

    public static StreamUiActivityAttachmentBinding bind(View view) {
        int i13 = C19469R.id.ivImage;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
            if (progressBar != null) {
                i13 = C19469R.id.webView;
                WebView webView = (WebView) AbstractC34235f.m108203J(view, i13);
                if (webView != null) {
                    return new StreamUiActivityAttachmentBinding((ConstraintLayout) view, imageView, progressBar, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiActivityAttachmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiActivityAttachmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_activity_attachment, viewGroup, false);
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
