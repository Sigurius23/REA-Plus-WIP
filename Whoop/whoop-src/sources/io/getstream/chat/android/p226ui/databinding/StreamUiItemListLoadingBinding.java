package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemListLoadingBinding implements InterfaceC13008a {
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;

    private StreamUiItemListLoadingBinding(ConstraintLayout constraintLayout, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.progressBar = progressBar;
    }

    public static StreamUiItemListLoadingBinding bind(View view) {
        int i13 = C19469R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
        if (progressBar != null) {
            return new StreamUiItemListLoadingBinding((ConstraintLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemListLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemListLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_list_loading, viewGroup, false);
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
