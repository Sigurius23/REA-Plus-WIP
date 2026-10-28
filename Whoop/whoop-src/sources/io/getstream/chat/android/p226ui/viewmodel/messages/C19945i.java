package io.getstream.chat.android.p226ui.viewmodel.messages;

import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.state.messages.list.GiphyAction;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.i */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19945i implements MessageListView.MessageUserBlockHandler, MessageListView.EndRegionReachedHandler, MessageListView.MessageUserUnblockHandler, MessageListView.OnPauseAudioRecordingAttachmentsHandler, MessageListView.MessageUnpinHandler, MessageListView.OnUnreadLabelClickListener, MessageListView.BottomEndRegionReachedHandler, MessageListView.LastMessageReadHandler, MessageListView.MessageDeleteHandler, MessageListView.MessageMarkAsUnreadHandler, MessageListView.ThreadStartHandler, MessageListView.OpenThreadHandler, MessageListView.ToggleOriginalTextHandler, MessageListView.MessagePinHandler, MessageListView.GiphySendHandler, MessageListView.MessageRetryHandler, MessageListView.MessageReactionHandler, MessageListView.MessageReplyHandler, MessageListView.OnReplyMessageClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ MessageListViewModel f74880w;

    public /* synthetic */ C19945i(MessageListViewModel messageListViewModel) {
        this.f74880w = messageListViewModel;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.BottomEndRegionReachedHandler
    public void onBottomEndRegionReached(String str) {
        MessageListViewModelBinding.bindView$lambda$2(this.f74880w, str);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.EndRegionReachedHandler
    public void onEndRegionReached() {
        this.f74880w.onEvent(MessageListViewModel.Event.EndRegionReached.INSTANCE);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.LastMessageReadHandler
    public void onLastMessageRead() {
        this.f74880w.onEvent(MessageListViewModel.Event.LastMessageRead.INSTANCE);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageDeleteHandler
    public void onMessageDelete(Message message) {
        MessageListViewModelBinding.bindView$lambda$4(this.f74880w, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageMarkAsUnreadHandler
    public void onMessageMarkAsUnread(Message message) {
        MessageListViewModelBinding.bindView$lambda$11(this.f74880w, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessagePinHandler
    public void onMessagePin(Message message) {
        MessageListViewModelBinding.bindView$lambda$9(this.f74880w, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageReactionHandler
    public void onMessageReaction(Message message, String str) {
        MessageListViewModelBinding.bindView$lambda$14(this.f74880w, message, str);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageReplyHandler
    public void onMessageReply(String str, Message message) {
        MessageListViewModelBinding.bindView$lambda$15(this.f74880w, str, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageRetryHandler
    public void onMessageRetry(Message message) {
        MessageListViewModelBinding.bindView$lambda$13(this.f74880w, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageUnpinHandler
    public void onMessageUnpin(Message message) {
        MessageListViewModelBinding.bindView$lambda$10(this.f74880w, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OpenThreadHandler
    public void onOpenThread(Message message) {
        MessageListViewModelBinding.bindView$lambda$6(this.f74880w, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnPauseAudioRecordingAttachmentsHandler
    public void onPauseAudioRecordingAttachments() {
        this.f74880w.pauseAudioRecordingAttachments();
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnReplyMessageClickListener
    public boolean onReplyClick(Message message) {
        MessageListViewModelBinding.bindView$lambda$18(this.f74880w, message);
        return true;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.GiphySendHandler
    public void onSendGiphy(GiphyAction giphyAction) {
        MessageListViewModelBinding.bindView$lambda$12(this.f74880w, giphyAction);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.ThreadStartHandler
    public void onStartThread(Message message) {
        MessageListViewModelBinding.bindView$lambda$5(this.f74880w, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.ToggleOriginalTextHandler
    public void onToggleOriginalText(Message message) {
        MessageListViewModelBinding.bindView$lambda$7(this.f74880w, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnUnreadLabelClickListener
    public void onUnreadLabelClick() {
        MessageListViewModelBinding.bindView$lambda$31(this.f74880w);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageUserBlockHandler
    public void onUserBlocked(Message message) {
        MessageListViewModelBinding.bindView$lambda$21(this.f74880w, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageUserUnblockHandler
    public void onUserUnblocked(Message message) {
        MessageListViewModelBinding.bindView$lambda$22(this.f74880w, message);
    }
}
