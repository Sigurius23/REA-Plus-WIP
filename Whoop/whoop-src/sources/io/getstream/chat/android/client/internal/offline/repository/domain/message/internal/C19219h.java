package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import l83.C23454a0;
import p002a0.C0022g;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.h */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19219h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73856w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageDao_Impl f73857x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC33687a f73858y;

    public /* synthetic */ C19219h(MessageDao_Impl messageDao_Impl, InterfaceC33687a interfaceC33687a, int i13) {
        this.f73856w = i13;
        this.f73857x = messageDao_Impl;
        this.f73858y = interfaceC33687a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f73856w) {
            case 0:
                MessageDao_Impl.m54709xb5b13ae8(this.f73857x, this.f73858y, (C0022g) obj);
                break;
            default:
                MessageDao_Impl.m54707x47866bf9(this.f73857x, this.f73858y, (C0022g) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
