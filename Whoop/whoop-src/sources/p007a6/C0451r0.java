package p007a6;

import hg3.AbstractC17269i;
import java.io.IOException;
import l83.C23454a0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0451r0 extends C0435k0 implements InterfaceC0439l1 {
    @Override // p007a6.InterfaceC0439l1
    /* JADX INFO: renamed from: d */
    public final Object mo1120d(Object obj, InterfaceC30057d interfaceC30057d) throws IOException {
        if (this.f1495c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
        Object objM48902m = AbstractC17269i.m48902m(this.f1493a, new C0420f0(this, obj, null), (AbstractC32269c) interfaceC30057d);
        return objM48902m == EnumC31071a.f128113w ? objM48902m : C23454a0.f92919a;
    }
}
