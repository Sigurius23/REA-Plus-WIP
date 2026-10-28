package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentChannelActionsBinding implements InterfaceC13008a {
    public final LinearLayout channelActionsContainer;
    public final TextView channelMembersInfoTextView;
    public final TextView channelMembersTextView;
    public final LinearLayout optionsContainer;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;

    private StreamUiFragmentChannelActionsBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, LinearLayout linearLayout3, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.channelActionsContainer = linearLayout2;
        this.channelMembersInfoTextView = textView;
        this.channelMembersTextView = textView2;
        this.optionsContainer = linearLayout3;
        this.recyclerView = recyclerView;
    }

    public static StreamUiFragmentChannelActionsBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i13 = C19469R.id.channelMembersInfoTextView;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.channelMembersTextView;
            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView2 != null) {
                i13 = C19469R.id.optionsContainer;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC34235f.m108203J(view, i13);
                if (linearLayout2 != null) {
                    i13 = C19469R.id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                    if (recyclerView != null) {
                        return new StreamUiFragmentChannelActionsBinding(linearLayout, linearLayout, textView, textView2, linearLayout2, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiFragmentChannelActionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentChannelActionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_channel_actions, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final LinearLayout getRoot() {
        return this.rootView;
    }
}
