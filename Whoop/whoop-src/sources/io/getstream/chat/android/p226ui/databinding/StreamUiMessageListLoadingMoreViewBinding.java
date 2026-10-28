package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageListLoadingMoreViewBinding implements InterfaceC13008a {
    public final ProgressBar progressBar;
    private final FrameLayout rootView;

    private StreamUiMessageListLoadingMoreViewBinding(FrameLayout frameLayout, ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.progressBar = progressBar;
    }

    public static StreamUiMessageListLoadingMoreViewBinding bind(View view) {
        int i13 = C19469R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
        if (progressBar != null) {
            return new StreamUiMessageListLoadingMoreViewBinding((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageListLoadingMoreViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiMessageListLoadingMoreViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_message_list_loading_more_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final FrameLayout getRoot() {
        return this.rootView;
    }
}
