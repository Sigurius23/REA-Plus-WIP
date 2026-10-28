package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiDefaultLoadingViewBinding implements InterfaceC13008a {
    private final ProgressBar rootView;

    private StreamUiDefaultLoadingViewBinding(ProgressBar progressBar) {
        this.rootView = progressBar;
    }

    public static StreamUiDefaultLoadingViewBinding bind(View view) {
        if (view != null) {
            return new StreamUiDefaultLoadingViewBinding((ProgressBar) view);
        }
        throw new NullPointerException("rootView");
    }

    public static StreamUiDefaultLoadingViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiDefaultLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_default_loading_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final ProgressBar getRoot() {
        return this.rootView;
    }
}
