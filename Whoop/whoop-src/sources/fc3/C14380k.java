package fc3;

import bc3.AbstractC3006f0;
import dc3.EnumC11916a;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: fc3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C14380k extends AbstractC14376g {

    /* JADX INFO: renamed from: E */
    public final AbstractC32275i f52502E;

    /* JADX WARN: Multi-variable type inference failed */
    public C14380k(Function3 function3, InterfaceC13058l interfaceC13058l, InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        super(i13, enumC11916a, interfaceC13058l, interfaceC30063j);
        this.f52502E = (AbstractC32275i) function3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function3, s83.i] */
    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: f */
    public final AbstractC14373d mo36559f(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        return new C14380k(this.f52502E, this.f52490z, interfaceC30063j, i13, enumC11916a);
    }

    @Override // fc3.AbstractC14376g
    /* JADX INFO: renamed from: i */
    public final Object mo41041i(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        Object objM8719m = AbstractC3006f0.m8719m(new C14378i(this, interfaceC13062m, null), interfaceC30057d);
        return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
    }
}
