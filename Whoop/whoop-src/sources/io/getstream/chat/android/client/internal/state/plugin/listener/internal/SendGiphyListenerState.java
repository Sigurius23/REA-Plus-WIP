package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadStateLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic;
import io.getstream.chat.android.client.plugin.listeners.SendGiphyListener;
import io.getstream.chat.android.models.Message;
import java.util.Iterator;
import n23.AbstractC26205h;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/SendGiphyListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V", "", "cid", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "onGiphySendResult", "(Ljava/lang/String;Ln23/h;)V", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SendGiphyListenerState implements SendGiphyListener {
    private final LogicRegistry logic;

    public SendGiphyListenerState(LogicRegistry logic) {
        AbstractC22676k.m65750j(logic, "logic");
        this.logic = logic;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.SendGiphyListener
    public final void onGiphySendResult(String cid, AbstractC26205h result) {
        ThreadStateLogic threadStateLogic;
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C26204g) {
            Message message = (Message) ((C26204g) result).f103919a;
            ChannelLogic channelLogicChannelFromMessage = this.logic.channelFromMessage(message);
            if (channelLogicChannelFromMessage != null) {
                channelLogicChannelFromMessage.upsertMessage(message);
            }
            Iterator<T> it = this.logic.getActiveQueryThreadsLogic().iterator();
            while (it.hasNext()) {
                ((QueryThreadsLogic) it.next()).upsertMessage$stream_chat_android_client_release(message);
            }
            ThreadLogic threadLogicThreadFromMessage = this.logic.threadFromMessage(message);
            if (threadLogicThreadFromMessage == null || (threadStateLogic = threadLogicThreadFromMessage.getThreadStateLogic()) == null) {
                return;
            }
            threadStateLogic.upsertMessage(message);
        }
    }
}
