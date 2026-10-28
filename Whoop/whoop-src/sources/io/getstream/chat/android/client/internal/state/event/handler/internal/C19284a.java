package io.getstream.chat.android.client.internal.state.event.handler.internal;

import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.ChatEventListener;
import io.getstream.chat.android.client.events.ChatEvent;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19284a implements ChatEventListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73883w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f73884x;

    public /* synthetic */ C19284a(Object obj, int i13) {
        this.f73883w = i13;
        this.f73884x = obj;
    }

    @Override // io.getstream.chat.android.client.ChatEventListener
    public final void onEvent(ChatEvent chatEvent) {
        switch (this.f73883w) {
            case 0:
                EventHandlerSequential.defaultSocketEventListener$lambda$3((EventHandlerSequential) this.f73884x, chatEvent);
                break;
            case 1:
                EventHandlerSequential.bufferedSocketEventListener$lambda$4((EventHandlerSequential) this.f73884x, chatEvent);
                break;
            default:
                ChatClient.subscribeForSingle$lambda$53((ChatEventListener) this.f73884x, chatEvent);
                break;
        }
    }
}
