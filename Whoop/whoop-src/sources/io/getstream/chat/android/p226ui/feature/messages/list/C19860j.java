package io.getstream.chat.android.p226ui.feature.messages.list;

import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.MessageListScrollHelper;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.MessageOptionsDialogFragment;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.j */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19860j implements MessageListView.ConfirmDeleteMessageHandler, MessageListView.ConfirmFlagMessageHandler, MessageListView.ErrorEventHandler, MessageListView.OnModeratedMessageLongClickListener, MessageOptionsDialogFragment.ReactionClickListener, MessageOptionsDialogFragment.UserReactionClickListener, MessageListScrollHelper.MessageReadListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MessageListView f74771a;

    public /* synthetic */ C19860j(MessageListView messageListView) {
        this.f74771a = messageListView;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.ConfirmDeleteMessageHandler
    public void onConfirmDeleteMessage(Message message, InterfaceC4339a interfaceC4339a) {
        MessageListView.confirmDeleteMessageHandler$lambda$25(this.f74771a, message, interfaceC4339a);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.ConfirmFlagMessageHandler
    public void onConfirmFlagMessage(Message message, InterfaceC4339a interfaceC4339a) {
        MessageListView.confirmFlagMessageHandler$lambda$28(this.f74771a, message, interfaceC4339a);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.ErrorEventHandler
    public void onErrorEvent(MessageListController.ErrorEvent errorEvent) {
        MessageListView.errorEventHandler$lambda$41(this.f74771a, errorEvent);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.internal.MessageListScrollHelper.MessageReadListener
    public void onLastMessageRead() {
        MessageListView.m55395m(this.f74771a);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnModeratedMessageLongClickListener
    public boolean onModeratedMessageLongClick(Message message) {
        MessageListView.moderatedMessageLongClickListener$lambda$52(this.f74771a, message);
        return true;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.options.message.MessageOptionsDialogFragment.ReactionClickListener
    public void onReactionClick(Message message, String str) {
        MessageListView.m55381x99b7758f(this.f74771a, message, str);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.options.message.MessageOptionsDialogFragment.UserReactionClickListener
    public void onUserReactionClick(Message message, User user, Reaction reaction) {
        MessageListView.m55382x99b77590(this.f74771a, message, user, reaction);
    }
}
