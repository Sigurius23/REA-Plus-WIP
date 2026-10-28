package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic;
import io.getstream.chat.android.client.plugin.listeners.SendAttachmentListener;
import io.getstream.chat.android.models.Message;
import java.util.Iterator;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendAttachmentListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V", "", "channelType", "channelId", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onAttachmentSendRequest", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SendAttachmentListenerState implements SendAttachmentListener {
    private final LogicRegistry logic;

    public SendAttachmentListenerState(LogicRegistry logic) {
        AbstractC22676k.m65750j(logic, "logic");
        this.logic = logic;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.SendAttachmentListener
    public final Object onAttachmentSendRequest(String str, String str2, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ChannelLogic channelLogicChannel = this.logic.channel(str, str2);
        channelLogicChannel.upsertMessage(message);
        channelLogicChannel.updateLastMessageAt(message);
        Iterator<T> it = this.logic.getActiveQueryThreadsLogic().iterator();
        while (it.hasNext()) {
            ((QueryThreadsLogic) it.next()).upsertMessage$stream_chat_android_client_release(message);
        }
        ThreadLogic threadLogicThreadFromMessage = this.logic.threadFromMessage(message);
        if (threadLogicThreadFromMessage != null) {
            threadLogicThreadFromMessage.upsertMessage$stream_chat_android_client_release(message);
        }
        Iterator<T> it3 = this.logic.getActiveQueryChannelsLogic().iterator();
        while (it3.hasNext()) {
            ((QueryChannelsLogic) it3.next()).refreshChannelState$stream_chat_android_client_release(channelLogicChannel.getCid());
        }
        return C23454a0.f92919a;
    }
}
