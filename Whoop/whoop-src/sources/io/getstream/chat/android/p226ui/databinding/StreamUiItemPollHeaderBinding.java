package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemPollHeaderBinding implements InterfaceC13008a {
    private final LinearLayoutCompat rootView;
    public final TextView subtitle;
    public final TextView title;

    private StreamUiItemPollHeaderBinding(LinearLayoutCompat linearLayoutCompat, TextView textView, TextView textView2) {
        this.rootView = linearLayoutCompat;
        this.subtitle = textView;
        this.title = textView2;
    }

    public static StreamUiItemPollHeaderBinding bind(View view) {
        int i13 = C19469R.id.subtitle;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.title;
            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView2 != null) {
                return new StreamUiItemPollHeaderBinding((LinearLayoutCompat) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemPollHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemPollHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_poll_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
