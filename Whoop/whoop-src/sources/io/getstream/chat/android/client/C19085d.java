package io.getstream.chat.android.client;

import io.getstream.chat.android.client.internal.state.plugin.factory.StreamStatePluginFactory;
import io.getstream.chat.android.models.Message;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19085d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73785w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChatClient f73786x;

    public /* synthetic */ C19085d(ChatClient chatClient, int i13) {
        this.f73785w = i13;
        this.f73786x = chatClient;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73785w) {
            case 0:
                return ChatClient.sendLocationMessage$lambda$65(this.f73786x, (Message) obj);
            default:
                return StreamStatePluginFactory.m54787b(this.f73786x, (ChatEventListener) obj);
        }
    }
}
