package ec3;

import c93.InterfaceC4351m;
import fc3.AbstractC14371b;
import l83.C23454a0;
import p040c0.C3723a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: ec3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C13050j implements InterfaceC13058l {

    /* JADX INFO: renamed from: w */
    public final InterfaceC13058l f45102w;

    /* JADX INFO: renamed from: x */
    public final Function1 f45103x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC4351m f45104y;

    public C13050j(InterfaceC13058l interfaceC13058l, Function1 function1, InterfaceC4351m interfaceC4351m) {
        this.f45102w = interfaceC13058l;
        this.f45103x = function1;
        this.f45104y = interfaceC4351m;
    }

    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        C22669g0 c22669g0 = new C22669g0();
        c22669g0.f89336w = AbstractC14371b.f52477b;
        Object objCollect = this.f45102w.collect(new C3723a0(this, c22669g0, interfaceC13062m, 1), interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }
}
