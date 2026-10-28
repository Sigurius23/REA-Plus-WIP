package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.plugin.listeners.MarkAllReadListener;
import java.util.Iterator;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/MarkAllReadListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/MarkAllReadListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V", "Ll83/a0;", "onMarkAllReadRequest", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MarkAllReadListenerState implements MarkAllReadListener {
    private final LogicRegistry logic;

    public MarkAllReadListenerState(LogicRegistry logic) {
        AbstractC22676k.m65750j(logic, "logic");
        this.logic = logic;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.MarkAllReadListener
    public final Object onMarkAllReadRequest(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Iterator<T> it = this.logic.getActiveChannelsLogic().iterator();
        while (it.hasNext()) {
            ((ChannelLogic) it.next()).markRead();
        }
        return C23454a0.f92919a;
    }
}
