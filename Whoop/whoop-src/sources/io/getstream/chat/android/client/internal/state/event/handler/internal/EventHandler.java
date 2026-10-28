package io.getstream.chat.android.client.internal.state.event.handler.internal;

import io.getstream.chat.android.client.events.ChatEvent;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J$\u0010\t\u001a\u00020\u00022\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;", "", "Ll83/a0;", "startListening", "()V", "stopListening", "", "Lio/getstream/chat/android/client/events/ChatEvent;", "events", "handleEvents", "([Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface EventHandler {
    Object handleEvents(ChatEvent[] chatEventArr, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void startListening();

    void stopListening();
}
