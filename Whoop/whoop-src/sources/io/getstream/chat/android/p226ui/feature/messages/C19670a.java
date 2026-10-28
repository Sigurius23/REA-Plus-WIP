package io.getstream.chat.android.p226ui.feature.messages;

import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.state.messages.list.ModeratedMessageOption;
import io.getstream.chat.android.p226ui.feature.messages.header.ChannelHeaderView;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModel;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19670a implements ChannelHeaderView.OnClickListener, MessageListView.ModeratedMessageOptionHandler, MessageListView.MessageReplyHandler, MessageListView.MessageEditHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74518w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChannelFragment f74519x;

    public /* synthetic */ C19670a(ChannelFragment channelFragment, int i13) {
        this.f74518w = i13;
        this.f74519x = channelFragment;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.header.ChannelHeaderView.OnClickListener
    public void onClick() {
        this.f74519x.getMessageListViewModel().onEvent(MessageListViewModel.Event.BackButtonPressed.INSTANCE);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageEditHandler
    public void onMessageEdit(Message message) {
        ChannelFragment.setupMessageComposer$lambda$17(this.f74519x, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageReplyHandler
    public void onMessageReply(String str, Message message) {
        ChannelFragment.setupMessageComposer$lambda$16(this.f74519x, str, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.ModeratedMessageOptionHandler
    public void onModeratedMessageOptionSelected(Message message, ModeratedMessageOption moderatedMessageOption) {
        switch (this.f74518w) {
            case 1:
                ChannelFragment.setupMessageList$lambda$14(this.f74519x, message, moderatedMessageOption);
                break;
            default:
                ChannelFragment.setupMessageComposer$lambda$18(this.f74519x, message, moderatedMessageOption);
                break;
        }
    }
}
