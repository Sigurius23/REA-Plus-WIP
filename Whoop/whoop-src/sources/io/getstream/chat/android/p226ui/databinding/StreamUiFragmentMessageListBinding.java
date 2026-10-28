package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerView;
import io.getstream.chat.android.p226ui.feature.messages.header.ChannelHeaderView;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentMessageListBinding implements InterfaceC13008a {
    public final ChannelHeaderView channelHeaderView;
    public final MessageComposerView messageComposerView;
    public final MessageListView messageListView;
    private final ConstraintLayout rootView;

    private StreamUiFragmentMessageListBinding(ConstraintLayout constraintLayout, ChannelHeaderView channelHeaderView, MessageComposerView messageComposerView, MessageListView messageListView) {
        this.rootView = constraintLayout;
        this.channelHeaderView = channelHeaderView;
        this.messageComposerView = messageComposerView;
        this.messageListView = messageListView;
    }

    public static StreamUiFragmentMessageListBinding bind(View view) {
        int i13 = C19469R.id.channelHeaderView;
        ChannelHeaderView channelHeaderView = (ChannelHeaderView) AbstractC34235f.m108203J(view, i13);
        if (channelHeaderView != null) {
            i13 = C19469R.id.messageComposerView;
            MessageComposerView messageComposerView = (MessageComposerView) AbstractC34235f.m108203J(view, i13);
            if (messageComposerView != null) {
                i13 = C19469R.id.messageListView;
                MessageListView messageListView = (MessageListView) AbstractC34235f.m108203J(view, i13);
                if (messageListView != null) {
                    return new StreamUiFragmentMessageListBinding((ConstraintLayout) view, channelHeaderView, messageComposerView, messageListView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiFragmentMessageListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentMessageListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_message_list, viewGroup, false);
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
