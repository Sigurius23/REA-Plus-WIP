package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19213b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73834w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f73835x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f73836y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ MessageDao_Impl f73837z;

    public /* synthetic */ C19213b(String str, int i13, MessageDao_Impl messageDao_Impl, int i14) {
        this.f73834w = i14;
        this.f73835x = str;
        this.f73836y = i13;
        this.f73837z = messageDao_Impl;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73834w) {
            case 0:
                return MessageDao_Impl.m54725p(this.f73835x, this.f73836y, this.f73837z, (InterfaceC33687a) obj);
            default:
                return MessageDao_Impl.m54730u(this.f73835x, this.f73836y, this.f73837z, (InterfaceC33687a) obj);
        }
    }
}
