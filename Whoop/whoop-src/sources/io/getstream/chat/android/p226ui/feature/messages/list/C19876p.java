package io.getstream.chat.android.p226ui.feature.messages.list;

import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.messages.list.GiphyAction;
import io.getstream.chat.android.p226ui.common.state.messages.list.ModeratedMessageOption;
import j93.InterfaceC21493z;
import java.util.List;
import java.util.Map;
import n23.AbstractC26205h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.p */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19876p implements MessageListView.MessageListItemTransformer, MessageListView.MessageFlagHandler, MessageListView.MessageUserBlockHandler, MessageListView.MessageUserUnblockHandler, MessageListView.FlagMessageResultHandler, MessageListView.MessagePinHandler, MessageListView.MessageMarkAsUnreadHandler, MessageListView.MessageUnpinHandler, MessageListView.GiphySendHandler, MessageListView.MessageRetryHandler, MessageListView.MessageReactionHandler, MessageListView.EndRegionReachedHandler, MessageListView.CustomActionHandler, MessageListView.MessageReplyHandler, MessageListView.AttachmentDownloadHandler, MessageListView.BottomEndRegionReachedHandler, MessageListView.ModeratedMessageOptionHandler, MessageListView.LastMessageReadHandler, MessageListView.MessageEditHandler, MessageListView.OnEnterThreadListener, MessageListView.OnUserReactionClickListener, MessageListView.MessageDeleteHandler, MessageListView.ThreadStartHandler, MessageListView.OpenThreadHandler, MessageListView.ToggleOriginalTextHandler, MessageListView.OnReplyMessageClickListener {
    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.AttachmentDownloadHandler
    public void onAttachmentDownload(InterfaceC4339a interfaceC4339a) {
        MessageListView.m55406r0(interfaceC4339a);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.BottomEndRegionReachedHandler
    public void onBottomEndRegionReached(String str) {
        MessageListView.m55411u(str);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.CustomActionHandler
    public void onCustomAction(Message message, Map map) {
        MessageListView.m55368V0(message, map);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.EndRegionReachedHandler
    public void onEndRegionReached() {
        MessageListView.m55422z0();
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.FlagMessageResultHandler
    public void onHandleResult(AbstractC26205h abstractC26205h) {
        AbstractC22676k.m65750j(abstractC26205h, "it");
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.LastMessageReadHandler
    public void onLastMessageRead() {
        MessageListView.m55404q0();
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageDeleteHandler
    public void onMessageDelete(Message message) {
        MessageListView.m55396m0(message);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageEditHandler
    public void onMessageEdit(Message message) {
        MessageListView.m55417x(message);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageFlagHandler
    public void onMessageFlag(Message message) {
        MessageListView.m55375Z(message);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageMarkAsUnreadHandler
    public void onMessageMarkAsUnread(Message message) {
        MessageListView.m55415w(message);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessagePinHandler
    public void onMessagePin(Message message) {
        MessageListView.m55393l(message);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageReactionHandler
    public void onMessageReaction(Message message, String str) {
        MessageListView.m55360R0(message, str);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageReplyHandler
    public void onMessageReply(String str, Message message) {
        MessageListView.m55373Y(message, str);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageRetryHandler
    public void onMessageRetry(Message message) {
        MessageListView.m55398n0(message);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageUnpinHandler
    public void onMessageUnpin(Message message) {
        MessageListView.m55331D(message);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.ModeratedMessageOptionHandler
    public void onModeratedMessageOptionSelected(Message message, ModeratedMessageOption moderatedMessageOption) {
        MessageListView.m55408s0(message, moderatedMessageOption);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OpenThreadHandler
    public void onOpenThread(Message message) {
        MessageListView.m55357Q(message);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnReplyMessageClickListener
    public boolean onReplyClick(Message message) {
        MessageListView.replyMessageClickListener$lambda$9(message);
        return false;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.GiphySendHandler
    public void onSendGiphy(GiphyAction giphyAction) {
        MessageListView.m55388i0(giphyAction);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.ThreadStartHandler
    public void onStartThread(Message message) {
        MessageListView.m55401p(message);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnEnterThreadListener
    public boolean onThreadEntered(Message message) {
        MessageListView.defaultEnterThreadListener$lambda$75(message);
        return false;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.ToggleOriginalTextHandler
    public void onToggleOriginalText(Message message) {
        AbstractC22676k.m65750j(message, "it");
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageUserBlockHandler
    public void onUserBlocked(Message message) {
        MessageListView.m55361S(message);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnUserReactionClickListener
    public boolean onUserReactionClick(Message message, User user, Reaction reaction) {
        MessageListView.defaultUserReactionClickListener$lambda$76(message, user, reaction);
        return false;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageUserUnblockHandler
    public void onUserUnblocked(Message message) {
        MessageListView.m55330C0(message);
        throw null;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageListItemTransformer
    public List transform(List it) {
        InterfaceC21493z[] interfaceC21493zArr = MessageListView.$$delegatedProperties;
        AbstractC22676k.m65750j(it, "it");
        return it;
    }
}
