package io.getstream.chat.android.client;

import androidx.lifecycle.InterfaceC1585g0;
import io.getstream.chat.android.client.channel.ChannelClient;
import io.getstream.chat.android.client.events.ChatEvent;

/* JADX INFO: renamed from: io.getstream.chat.android.client.h */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19090h implements ChatEventListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73800w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f73801x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ChatEventListener f73802y;

    public /* synthetic */ C19090h(Object obj, ChatEventListener chatEventListener, int i13) {
        this.f73800w = i13;
        this.f73801x = obj;
        this.f73802y = chatEventListener;
    }

    @Override // io.getstream.chat.android.client.ChatEventListener
    public final void onEvent(ChatEvent chatEvent) {
        switch (this.f73800w) {
            case 0:
                ChatClient.subscribeFor$lambda$47((InterfaceC1585g0) this.f73801x, this.f73802y, chatEvent);
                break;
            case 1:
                ChatClient.subscribeFor$lambda$50((InterfaceC1585g0) this.f73801x, this.f73802y, chatEvent);
                break;
            default:
                ChannelClient.filterRelevantEvents$lambda$0((ChannelClient) this.f73801x, this.f73802y, chatEvent);
                break;
        }
    }
}
