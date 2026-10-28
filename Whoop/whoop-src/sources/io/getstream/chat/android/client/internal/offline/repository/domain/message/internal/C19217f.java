package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import java.util.Date;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19217f implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f73848E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73849w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f73850x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ MessageDao_Impl f73851y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Date f73852z;

    public /* synthetic */ C19217f(String str, MessageDao_Impl messageDao_Impl, Date date, int i13, int i14) {
        this.f73849w = i14;
        this.f73850x = str;
        this.f73851y = messageDao_Impl;
        this.f73852z = date;
        this.f73848E = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73849w) {
            case 0:
                return MessageDao_Impl.m54715f(this.f73850x, this.f73851y, this.f73852z, this.f73848E, (InterfaceC33687a) obj);
            case 1:
                return MessageDao_Impl.m54728s(this.f73850x, this.f73851y, this.f73852z, this.f73848E, (InterfaceC33687a) obj);
            case 2:
                return MessageDao_Impl.m54724o(this.f73850x, this.f73851y, this.f73852z, this.f73848E, (InterfaceC33687a) obj);
            default:
                return MessageDao_Impl.m54699B(this.f73850x, this.f73851y, this.f73852z, this.f73848E, (InterfaceC33687a) obj);
        }
    }
}
