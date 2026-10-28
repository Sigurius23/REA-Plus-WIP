package fc3;

import b52.C2741a;
import bc3.AbstractC3006f0;
import d30.C11552o;
import dc3.EnumC11916a;
import dc3.InterfaceC11936u;
import ec3.C13036f1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hc3.AbstractC17167b;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30058e;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: fc3.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14376g extends AbstractC14373d {

    /* JADX INFO: renamed from: z */
    public final InterfaceC13058l f52490z;

    public AbstractC14376g(int i13, EnumC11916a enumC11916a, InterfaceC13058l interfaceC13058l, InterfaceC30063j interfaceC30063j) {
        super(interfaceC30063j, i13, enumC11916a);
        this.f52490z = interfaceC13058l;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[RETURN] */
    @Override // fc3.AbstractC14373d, ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        Object objCollect;
        if (this.f52481x == -3) {
            InterfaceC30063j context = interfaceC30057d.getContext();
            Boolean bool = Boolean.FALSE;
            C2741a c2741a = new C2741a(3);
            InterfaceC30063j interfaceC30063j = this.f52480w;
            InterfaceC30063j interfaceC30063jPlus = !((Boolean) interfaceC30063j.fold(bool, c2741a)).booleanValue() ? context.plus(interfaceC30063j) : AbstractC3006f0.m8722p(context, interfaceC30063j, false);
            if (AbstractC22676k.m65745e(interfaceC30063jPlus, context)) {
                Object objMo41041i = mo41041i(interfaceC13062m, interfaceC30057d);
                if (objMo41041i == EnumC31071a.f128113w) {
                    return objMo41041i;
                }
            } else {
                C30058e c30058e = C30058e.f122675w;
                if (AbstractC22676k.m65745e(interfaceC30063jPlus.get(c30058e), context.get(c30058e))) {
                    InterfaceC30063j context2 = interfaceC30057d.getContext();
                    if (!(interfaceC13062m instanceof C14392w) && !(interfaceC13062m instanceof C14388s)) {
                        interfaceC13062m = new C13036f1(interfaceC13062m, context2);
                    }
                    Object objM41040c = AbstractC14371b.m41040c(interfaceC30063jPlus, interfaceC13062m, AbstractC17167b.m48486l(interfaceC30063jPlus), new C11552o(this, (InterfaceC30057d) null, 14), interfaceC30057d);
                    if (objM41040c == EnumC31071a.f128113w) {
                        return objM41040c;
                    }
                } else {
                    objCollect = super.collect(interfaceC13062m, interfaceC30057d);
                    if (objCollect == EnumC31071a.f128113w) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(interfaceC13062m, interfaceC30057d);
            if (objCollect == EnumC31071a.f128113w) {
                return objCollect;
            }
        }
        return C23454a0.f92919a;
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: e */
    public final Object mo36558e(InterfaceC11936u interfaceC11936u, InterfaceC30057d interfaceC30057d) {
        Object objMo41041i = mo41041i(new C14392w(interfaceC11936u), interfaceC30057d);
        return objMo41041i == EnumC31071a.f128113w ? objMo41041i : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo41041i(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d);

    @Override // fc3.AbstractC14373d
    public final String toString() {
        return this.f52490z + " -> " + super.toString();
    }
}
