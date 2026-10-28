package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemPollCloseBinding implements InterfaceC13008a {
    public final TextView pollClose;
    private final FrameLayout rootView;

    private StreamUiItemPollCloseBinding(FrameLayout frameLayout, TextView textView) {
        this.rootView = frameLayout;
        this.pollClose = textView;
    }

    public static StreamUiItemPollCloseBinding bind(View view) {
        int i13 = C19469R.id.pollClose;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            return new StreamUiItemPollCloseBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemPollCloseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemPollCloseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_poll_close, viewGroup, false);
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
