package ag;

import a30.C0332w0;
import cf.InterfaceC4526a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25258m;
import p091dg.C12002a;
import p459rf.C31341l;
import p485sf.C32433e;
import p485sf.C32434f;
import p505ts.AbstractC34132o;
import p522uf.AbstractC34881i;
import p522uf.C34877g;
import p522uf.C34887n;
import p522uf.C34894u;
import p522uf.InterfaceC34888o;
import p551vf.C35937b;
import p551vf.C35942g;
import p551vf.InterfaceC35936a;
import p647yf.InterfaceC39492e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s93.AbstractC32306h;
import s93.AbstractC32309k;
import wf.C37236a;
import x30.AbstractC37926s0;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: ag.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C0855e implements InterfaceC0852b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3059a;

    /* JADX INFO: renamed from: b */
    public final Object f3060b;

    public /* synthetic */ C0855e(Object obj, int i13) {
        this.f3059a = i13;
        this.f3060b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    @Override // ag.InterfaceC0852b
    /* JADX INFO: renamed from: a */
    public final Object mo2062a(Object obj, InterfaceC39492e interfaceC39492e, AbstractC32269c abstractC32269c) {
        C0854d c0854d;
        switch (this.f3059a) {
            case 0:
                if (abstractC32269c instanceof C0854d) {
                    c0854d = (C0854d) abstractC32269c;
                    int i13 = c0854d.f3058z;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0854d.f3058z = i13 - Integer.MIN_VALUE;
                    } else {
                        c0854d = new C0854d(this, abstractC32269c);
                    }
                } else {
                    c0854d = new C0854d(this, abstractC32269c);
                }
                Object objMo9062d = c0854d.f3056x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c0854d.f3058z;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(objMo9062d);
                    InterfaceC34888o interfaceC34888o = (InterfaceC34888o) this.f3060b;
                    c0854d.f3055w = interfaceC39492e;
                    c0854d.f3058z = 1;
                    objMo9062d = interfaceC34888o.mo9062d(obj, c0854d);
                    if (objMo9062d != enumC31071a) {
                    }
                    return enumC31071a;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(objMo9062d);
                    return objMo9062d;
                }
                interfaceC39492e = c0854d.f3055w;
                AbstractC34132o.m107864I(objMo9062d);
                c0854d.f3055w = null;
                c0854d.f3058z = 2;
                Object objMo2061a = interfaceC39492e.mo2061a(objMo9062d, c0854d);
                if (objMo2061a != enumC31071a) {
                    return objMo2061a;
                }
                return enumC31071a;
            case 1:
                C25258m c25258m = (C25258m) this.f3060b;
                if (c25258m.isEmpty()) {
                    return interfaceC39492e.mo2061a(obj, abstractC32269c);
                }
                InterfaceC0852b[] interfaceC0852bArr = (InterfaceC0852b[]) c25258m.toArray(new InterfaceC0852b[0]);
                return AbstractC37926s0.m121476n(interfaceC39492e, (InterfaceC0852b[]) Arrays.copyOf(interfaceC0852bArr, interfaceC0852bArr.length)).mo2061a(obj, abstractC32269c);
            case 2:
                return m2063b((C34894u) obj, interfaceC39492e, abstractC32269c);
            default:
                return m2063b((C34894u) obj, interfaceC39492e, abstractC32269c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0 A[LOOP:0: B:33:0x00ca->B:35:0x00d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [r83.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, rf.l] */
    /* JADX INFO: renamed from: b */
    public Object m2063b(C34894u c34894u, InterfaceC39492e interfaceC39492e, InterfaceC30057d interfaceC30057d) {
        C34877g c34877g;
        C34887n c34887n;
        InterfaceC35936a interfaceC35936a;
        C37236a c37236a;
        Object obj;
        C32434f c32434f;
        Iterator it;
        switch (this.f3059a) {
            case 2:
                ArrayList arrayList = (ArrayList) this.f3060b;
                if (interfaceC30057d instanceof C34877g) {
                    c34877g = (C34877g) interfaceC30057d;
                    int i13 = c34877g.f146907E;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c34877g.f146907E = i13 - Integer.MIN_VALUE;
                    } else {
                        c34877g = new C34877g(this, (AbstractC32269c) interfaceC30057d);
                    }
                } else {
                    c34877g = new C34877g(this, (AbstractC32269c) interfaceC30057d);
                }
                Object objMo2061a = c34877g.f146910y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c34877g.f146907E;
                if (i14 != 0) {
                    if (i14 == 1) {
                        interfaceC39492e = c34877g.f146909x;
                        c34894u = c34877g.f146908w;
                        AbstractC34132o.m107864I(objMo2061a);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c34894u = c34877g.f146908w;
                        AbstractC34132o.m107864I(objMo2061a);
                    }
                    C31341l c31341l = (C31341l) objMo2061a;
                    arrayList.add(c31341l);
                    c34894u.f146958a.mo33083c(AbstractC34881i.f146916d, arrayList);
                    return c31341l;
                }
                AbstractC34132o.m107864I(objMo2061a);
                if (!arrayList.isEmpty()) {
                    C31341l c31341l2 = (C31341l) AbstractC25265s.m74112P0(arrayList);
                    c34877g.f146908w = c34894u;
                    c34877g.f146909x = interfaceC39492e;
                    c34877g.f146907E = 1;
                    if (AbstractC37978j.m121656q(c31341l2, c34877g) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                c34877g.f146908w = c34894u;
                c34877g.f146909x = null;
                c34877g.f146907E = 2;
                objMo2061a = interfaceC39492e.mo2061a(c34894u, c34877g);
                if (objMo2061a == enumC31071a) {
                    return enumC31071a;
                }
                C31341l c31341l3 = (C31341l) objMo2061a;
                arrayList.add(c31341l3);
                c34894u.f146958a.mo33083c(AbstractC34881i.f146916d, arrayList);
                return c31341l3;
            default:
                C0332w0 c0332w0 = (C0332w0) this.f3060b;
                List list = (List) c0332w0.f1169y;
                C12002a c12002a = (C12002a) c0332w0.f1168x;
                if (interfaceC30057d instanceof C34887n) {
                    c34887n = (C34887n) interfaceC30057d;
                    int i15 = c34887n.f146927E;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c34887n.f146927E = i15 - Integer.MIN_VALUE;
                    } else {
                        c34887n = new C34887n(this, (AbstractC32269c) interfaceC30057d);
                    }
                } else {
                    c34887n = new C34887n(this, (AbstractC32269c) interfaceC30057d);
                }
                Object objM840C = c34887n.f146930y;
                Object call = EnumC31071a.f128113w;
                int i16 = c34887n.f146927E;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(objM840C);
                    C35937b c35937b = (C35937b) c34894u.f146959b;
                    AbstractC22676k.m65750j(c35937b, "<this>");
                    C35942g c35942g = new C35942g(c35937b, true);
                    c34887n.f146928w = c34894u;
                    c34887n.f146929x = interfaceC39492e;
                    c34887n.f146927E = 1;
                    objM840C = c0332w0.m840C(c35942g, c34887n);
                    if (objM840C != call) {
                    }
                    return call;
                }
                if (i16 == 1) {
                    interfaceC39492e = c34887n.f146929x;
                    c34894u = c34887n.f146928w;
                    AbstractC34132o.m107864I(objM840C);
                } else {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(objM840C);
                }
                call = (C31341l) objM840C;
                AbstractC22676k.m65750j(call, "call");
                interfaceC35936a = call.f128963w;
                c37236a = call.f128964x;
                obj = c0332w0.f1164E;
                if (obj != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                c32434f = new C32434f(obj, interfaceC35936a, c37236a, c12002a);
                it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4526a) it.next()).mo14179m(c32434f);
                }
                return call;
                C34894u c34894uM110032a = C34894u.m110032a(c34894u, AbstractC32309k.m100579i((InterfaceC35936a) objM840C));
                C35942g c35942gM100570s = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                c0332w0.f1165F = c35942gM100570s;
                Object obj2 = c0332w0.f1164E;
                if (obj2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                C32433e c32433e = new C32433e(obj2, c35942gM100570s, c12002a);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC4526a) it3.next()).mo14176j(c32433e);
                }
                c34887n.f146928w = null;
                c34887n.f146929x = null;
                c34887n.f146927E = 2;
                objM840C = interfaceC39492e.mo2061a(c34894uM110032a, c34887n);
                if (objM840C != call) {
                    call = (C31341l) objM840C;
                    AbstractC22676k.m65750j(call, "call");
                    interfaceC35936a = call.f128963w;
                    c37236a = call.f128964x;
                    obj = c0332w0.f1164E;
                    if (obj != null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    c32434f = new C32434f(obj, interfaceC35936a, c37236a, c12002a);
                    it = list.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4526a) it.next()).mo14179m(c32434f);
                    }
                }
                return call;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2064c(InterfaceC0852b interfaceC0852b, EnumC0856f enumC0856f) {
        C25258m c25258m = (C25258m) this.f3060b;
        int iOrdinal = enumC0856f.ordinal();
        if (iOrdinal == 0) {
            c25258m.addFirst(interfaceC0852b);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            c25258m.addLast(interfaceC0852b);
        }
    }

    public C0855e(int i13) {
        this.f3059a = i13;
        switch (i13) {
            case 2:
                this.f3060b = new ArrayList();
                break;
            default:
                this.f3060b = new C25258m();
                break;
        }
    }
}
