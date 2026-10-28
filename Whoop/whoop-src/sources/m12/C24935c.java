package m12;

import c93.InterfaceC4339a;
import p181h2.C16617b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: m12.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24935c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97634w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f97635x;

    public /* synthetic */ C24935c(InterfaceC4339a interfaceC4339a, int i13) {
        this.f97634w = i13;
        this.f97635x = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f97634w) {
            case 0:
                return AbstractC24936d.a.m73082b(this.f97635x, (C16617b) obj);
            default:
                return AbstractC24936d.m73077w(this.f97635x, obj);
        }
    }
}
