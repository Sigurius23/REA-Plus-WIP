package io.getstream.chat.android.client.socket;

import io.getstream.chat.android.core.internal.fsm.builder.FSMBuilder;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import ud3.AbstractC34814f1;
import ud3.C34832o0;

/* JADX INFO: renamed from: io.getstream.chat.android.client.socket.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19442c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73949w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f73950x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f73951y;

    public /* synthetic */ C19442c(int i13, Object obj, Object obj2) {
        this.f73949w = i13;
        this.f73951y = obj;
        this.f73950x = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73949w) {
            case 0:
                ChatSocket.C194321.AnonymousClass1.invokeSuspend$lambda$7((ChatSocket) this.f73951y, (ChatSocketStateService.State) this.f73950x, (SocketListener) obj);
                return C23454a0.f92919a;
            case 1:
                ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74((ChatSocketStateService.State) this.f73950x, (ChatSocketStateService) this.f73951y, (FSMBuilder) obj);
                return C23454a0.f92919a;
            default:
                return SocketFactory.m54972a((SocketFactory) this.f73951y, (C34832o0) this.f73950x, (AbstractC34814f1) obj);
        }
    }

    public /* synthetic */ C19442c(ChatSocketStateService.State state, ChatSocketStateService chatSocketStateService) {
        this.f73949w = 1;
        this.f73950x = state;
        this.f73951y = chatSocketStateService;
    }
}
