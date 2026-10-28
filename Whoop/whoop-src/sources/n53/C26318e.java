package n53;

import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.List;
import l83.InterfaceC23459e;
import n43.C26285a;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22680m;
import q40.C29964b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n53.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C26318e implements InterfaceC13037f2 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f104633w = 0;

    /* JADX INFO: renamed from: x */
    public final InterfaceC13058l f104634x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC23459e f104635y;

    public C26318e(InterfaceC13058l interfaceC13058l, InterfaceC4339a interfaceC4339a) {
        this.f104634x = interfaceC13058l;
        this.f104635y = interfaceC4339a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        C26315d c26315d;
        C29964b c29964b;
        InterfaceC3027k1 interfaceC3027k1;
        switch (this.f104633w) {
            case 0:
                if (interfaceC30057d instanceof C26315d) {
                    c26315d = (C26315d) interfaceC30057d;
                    int i13 = c26315d.f104628y;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c26315d.f104628y = i13 - Integer.MIN_VALUE;
                    } else {
                        c26315d = new C26315d(this, interfaceC30057d);
                    }
                } else {
                    c26315d = new C26315d(this, interfaceC30057d);
                }
                Object obj = c26315d.f104626w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c26315d.f104628y;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C26285a c26285a = new C26285a(this, interfaceC13062m, (InterfaceC30057d) null, 1);
                    c26315d.f104628y = 1;
                    if (AbstractC3006f0.m8719m(c26285a, c26315d) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            default:
                if (interfaceC30057d instanceof C29964b) {
                    c29964b = (C29964b) interfaceC30057d;
                    int i15 = c29964b.f122389z;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c29964b.f122389z = i15 - Integer.MIN_VALUE;
                    } else {
                        c29964b = new C29964b(this, interfaceC30057d);
                    }
                } else {
                    c29964b = new C29964b(this, interfaceC30057d);
                }
                Object obj2 = c29964b.f122387x;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = c29964b.f122389z;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) c29964b.getContext().get(C3023j1.f12041w);
                    InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(this.f104634x);
                    c29964b.f122386w = interfaceC3027k2;
                    c29964b.f122389z = 1;
                    if (interfaceC13058lM36610t.collect(interfaceC13062m, c29964b) == enumC31071a2) {
                        return enumC31071a2;
                    }
                    interfaceC3027k1 = interfaceC3027k2;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC3027k1 interfaceC3027k3 = c29964b.f122386w;
                    AbstractC34132o.m107864I(obj2);
                    interfaceC3027k1 = interfaceC3027k3;
                }
                while (true) {
                    if (interfaceC3027k1 != null && !interfaceC3027k1.isActive()) {
                        throw interfaceC3027k1.getCancellationException();
                    }
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // ec3.InterfaceC13087t1
    public final List getReplayCache() {
        switch (this.f104633w) {
            case 0:
                return AbstractC37056f.m118958J(((AbstractC22680m) this.f104635y).invoke());
            default:
                return AbstractC37056f.m118958J(((InterfaceC4339a) this.f104635y).invoke());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // ec3.InterfaceC13037f2
    public final Object getValue() {
        switch (this.f104633w) {
            case 0:
                return ((AbstractC22680m) this.f104635y).invoke();
            default:
                return ((InterfaceC4339a) this.f104635y).invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C26318e(InterfaceC4339a interfaceC4339a, InterfaceC13058l interfaceC13058l) {
        this.f104635y = (AbstractC22680m) interfaceC4339a;
        this.f104634x = interfaceC13058l;
    }
}
