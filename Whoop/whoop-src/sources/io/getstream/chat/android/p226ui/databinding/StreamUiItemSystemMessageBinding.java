package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemSystemMessageBinding implements InterfaceC13008a {
    public final TextView messageTextView;
    private final TextView rootView;

    private StreamUiItemSystemMessageBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.messageTextView = textView2;
    }

    public static StreamUiItemSystemMessageBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new StreamUiItemSystemMessageBinding(textView, textView);
    }

    public static StreamUiItemSystemMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemSystemMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_system_message, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final TextView getRoot() {
        return this.rootView;
    }
}
