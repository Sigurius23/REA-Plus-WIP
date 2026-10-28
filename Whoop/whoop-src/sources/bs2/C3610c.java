package bs2;

import p390p1.C28624i0;
import p465rm.InterfaceC31544k;
import p715kotlin.jvm.functions.Function1;
import re1.AbstractC31323j;

/* JADX INFO: renamed from: bs2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3610c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14679w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC31544k f14680x;

    public /* synthetic */ C3610c(InterfaceC31544k interfaceC31544k, int i13) {
        this.f14679w = i13;
        this.f14680x = interfaceC31544k;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14679w) {
            case 0:
                return AbstractC3613f.m10970i(this.f14680x, (C28624i0) obj);
            default:
                return AbstractC31323j.m96364f0(this.f14680x, (C28624i0) obj);
        }
    }
}
