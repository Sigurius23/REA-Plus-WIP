package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageReactionsKt;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic;
import io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import java.util.Date;
import l83.C23454a0;
import l83.C23465k;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u0014\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteReactionListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V", "", "cid", "messageId", "reactionType", "Lio/getstream/chat/android/models/User;", "currentUser", "Ll83/a0;", "onDeleteReactionRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "onDeleteReactionResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteReactionPrecondition", "(Lio/getstream/chat/android/models/User;)Ln23/h;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DeleteReactionListenerState implements DeleteReactionListener {
    private final ClientState clientState;
    private final LogicRegistry logic;

    public DeleteReactionListenerState(LogicRegistry logic, ClientState clientState) {
        AbstractC22676k.m65750j(logic, "logic");
        AbstractC22676k.m65750j(clientState, "clientState");
        this.logic = logic;
        this.clientState = clientState;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    public final AbstractC26205h onDeleteReactionPrecondition(User currentUser) {
        return currentUser != null ? new C26204g(C23454a0.f92919a) : new C26203f(new C26198a("Current user is null!"));
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    public final Object onDeleteReactionRequest(String str, String str2, String str3, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ChannelLogic channelLogicChannelFromMessageId;
        Message message$stream_chat_android_client_release;
        Message message;
        Reaction reaction = new Reaction(str2, str3, 0, user, user.getId(), null, null, null, new Date(), this.clientState.isNetworkAvailable() ? SyncStatus.IN_PROGRESS : SyncStatus.SYNC_NEEDED, null, false, false, null, 15588, null);
        if (str != null) {
            C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(str);
            channelLogicChannelFromMessageId = this.logic.channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
        } else {
            channelLogicChannelFromMessageId = this.logic.channelFromMessageId(reaction.getMessageId());
        }
        Message messageRemoveMyReaction = null;
        Message messageRemoveMyReaction2 = (channelLogicChannelFromMessageId == null || (message = channelLogicChannelFromMessageId.getMessage(reaction.getMessageId())) == null) ? null : MessageReactionsKt.removeMyReaction(message, reaction);
        if (messageRemoveMyReaction2 != null) {
            channelLogicChannelFromMessageId.upsertMessage(messageRemoveMyReaction2);
        }
        for (QueryThreadsLogic queryThreadsLogic : this.logic.getActiveQueryThreadsLogic()) {
            Message message$stream_chat_android_client_release2 = queryThreadsLogic.getMessage$stream_chat_android_client_release(reaction.getMessageId());
            Message messageRemoveMyReaction3 = message$stream_chat_android_client_release2 != null ? MessageReactionsKt.removeMyReaction(message$stream_chat_android_client_release2, reaction) : null;
            if (messageRemoveMyReaction3 != null) {
                queryThreadsLogic.upsertMessage$stream_chat_android_client_release(messageRemoveMyReaction3);
            }
        }
        ThreadLogic threadLogicThreadFromMessageId = this.logic.threadFromMessageId(str2);
        if (threadLogicThreadFromMessageId != null && (message$stream_chat_android_client_release = threadLogicThreadFromMessageId.getMessage$stream_chat_android_client_release(reaction.getMessageId())) != null) {
            messageRemoveMyReaction = MessageReactionsKt.removeMyReaction(message$stream_chat_android_client_release, reaction);
        }
        if (messageRemoveMyReaction != null) {
            threadLogicThreadFromMessageId.upsertMessage$stream_chat_android_client_release(messageRemoveMyReaction);
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    public final Object onDeleteReactionResult(String str, String str2, String str3, User user, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }
}
