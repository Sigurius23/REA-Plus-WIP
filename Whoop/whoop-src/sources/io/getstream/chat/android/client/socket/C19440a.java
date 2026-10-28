package io.getstream.chat.android.client.socket;

import io.getstream.chat.android.client.events.ChatEvent;
import l83.C23454a0;
import n23.AbstractC26202e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.socket.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19440a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73947w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f73948x;

    public /* synthetic */ C19440a(Object obj, int i13) {
        this.f73947w = i13;
        this.f73948x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73947w) {
            case 0:
                ChatSocket.C194321.AnonymousClass1.invokeSuspend$lambda$4((ChatSocketStateService.State) this.f73948x, (SocketListener) obj);
                break;
            case 1:
                ChatSocket.handleEvent$lambda$5((ChatEvent) this.f73948x, (SocketListener) obj);
                break;
            default:
                ChatSocket.handleError$lambda$7((AbstractC26202e) this.f73948x, (SocketListener) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
