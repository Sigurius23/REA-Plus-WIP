package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiChannelOptionItemBinding implements InterfaceC13008a {
    private final TextView rootView;

    private StreamUiChannelOptionItemBinding(TextView textView) {
        this.rootView = textView;
    }

    public static StreamUiChannelOptionItemBinding bind(View view) {
        if (view != null) {
            return new StreamUiChannelOptionItemBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static StreamUiChannelOptionItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiChannelOptionItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_channel_option_item, viewGroup, false);
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
