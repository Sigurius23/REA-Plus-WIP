package mb3;

import ab3.C0723o;
import bd3.C3119e0;
import io.sentry.config.AbstractC20301a;
import java.util.Collection;
import java.util.List;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23773f1;
import lb3.AbstractC23791o;
import lb3.AbstractC23797r;
import lb3.AbstractC23800s0;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import lb3.C23772f0;
import lb3.C23785l;
import lb3.C23794p0;
import lb3.C23806v0;
import lb3.C23809x;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import ob3.EnumC27792b;
import ob3.EnumC27806p;
import ob3.InterfaceC27793c;
import ob3.InterfaceC27794d;
import ob3.InterfaceC27796f;
import ob3.InterfaceC27797g;
import ob3.InterfaceC27798h;
import ob3.InterfaceC27799i;
import ob3.InterfaceC27800j;
import ob3.InterfaceC27801k;
import ob3.InterfaceC27802l;
import ob3.InterfaceC27803m;
import ob3.InterfaceC27804n;
import p319m4.AbstractC25012a;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import r93.AbstractC31166y;
import r93.C31164x;
import r93.EnumC31120f;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import se.AbstractC32417h;
import va3.C35847e;

/* JADX INFO: renamed from: mb3.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25390g {

    /* JADX INFO: renamed from: a */
    public static final C3119e0 f99475a = new C3119e0("KotlinTypeRefiner");

    /* JADX INFO: renamed from: A */
    public static boolean m74464A(InterfaceC27802l interfaceC27802l) {
        if (!(interfaceC27802l instanceof InterfaceC23796q0)) {
            throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27802l.getClass(), AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", interfaceC27802l, ", ")).toString());
        }
        InterfaceC31126h interfaceC31126hMo1784d = ((InterfaceC23796q0) interfaceC27802l).mo1784d();
        InterfaceC31117e interfaceC31117e = interfaceC31126hMo1784d instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31126hMo1784d : null;
        return (interfaceC31117e == null || !AbstractC31166y.m95884b(interfaceC31117e) || interfaceC31117e.getKind() == EnumC31120f.f128331z || interfaceC31117e.getKind() == EnumC31120f.f128325E) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m74465B(InterfaceC27802l interfaceC27802l) {
        if (interfaceC27802l instanceof InterfaceC23796q0) {
            return ((InterfaceC23796q0) interfaceC27802l).mo1785f();
        }
        StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", interfaceC27802l, ", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27802l.getClass(), sbM73380m).toString());
    }

    /* JADX INFO: renamed from: C */
    public static boolean m74466C(InterfaceC27797g receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23811y) {
            return AbstractC23791o.m69886e((AbstractC23811y) receiver);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: D */
    public static boolean m74467D(InterfaceC27802l receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (!(receiver instanceof InterfaceC23796q0)) {
            throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", receiver, ", ")).toString());
        }
        InterfaceC31126h interfaceC31126hMo1784d = ((InterfaceC23796q0) receiver).mo1784d();
        InterfaceC31117e interfaceC31117e = interfaceC31126hMo1784d instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31126hMo1784d : null;
        return (interfaceC31117e != null ? interfaceC31117e.mo60488I() : null) instanceof C31164x;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m74468E(InterfaceC27802l receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof InterfaceC23796q0) {
            return receiver instanceof C0723o;
        }
        StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sbM73380m).toString());
    }

    /* JADX INFO: renamed from: F */
    public static boolean m74469F(InterfaceC27802l receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof InterfaceC23796q0) {
            return receiver instanceof C23809x;
        }
        StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sbM73380m).toString());
    }

    /* JADX INFO: renamed from: G */
    public static boolean m74470G(InterfaceC27797g receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        return (receiver instanceof AbstractC23763c0) && ((AbstractC23763c0) receiver).mo69814k0();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m74471H(InterfaceC27802l receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof InterfaceC23796q0) {
            return AbstractC27736h.m83807I((InterfaceC23796q0) receiver, AbstractC27741m.f111845b);
        }
        StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sbM73380m).toString());
    }

    /* JADX INFO: renamed from: I */
    public static boolean m74472I(InterfaceC27797g receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23811y) {
            return AbstractC23767d1.m69849e((AbstractC23811y) receiver);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public static boolean m74473J(InterfaceC27799i interfaceC27799i) {
        if (interfaceC27799i instanceof AbstractC23811y) {
            return AbstractC27736h.m83805G((AbstractC23811y) interfaceC27799i);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27799i);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27799i.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: K */
    public static boolean m74474K(InterfaceC27794d receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof C25391h) {
            return ((C25391h) receiver).m74522z0();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: L */
    public static boolean m74475L(InterfaceC27801k receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23804u0) {
            return ((AbstractC23804u0) receiver).mo69869c();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public static void m74476M(InterfaceC27798h receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23763c0) {
            AbstractC20301a.m56314M((AbstractC23811y) receiver);
            return;
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: N */
    public static void m74477N(InterfaceC27798h interfaceC27798h) {
        if (interfaceC27798h instanceof AbstractC23763c0) {
            return;
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27798h);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27798h.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: O */
    public static AbstractC23763c0 m74478O(InterfaceC27796f interfaceC27796f) {
        if (interfaceC27796f instanceof AbstractC23797r) {
            return ((AbstractC23797r) interfaceC27796f).f94187x;
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27796f);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27796f.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: P */
    public static AbstractC23773f1 m74479P(InterfaceC27794d interfaceC27794d) {
        if (interfaceC27794d instanceof C25391h) {
            return ((C25391h) interfaceC27794d).m74521y0();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27794d);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27794d.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: Q */
    public static AbstractC23773f1 m74480Q(InterfaceC27797g interfaceC27797g) {
        if (interfaceC27797g instanceof AbstractC23773f1) {
            return AbstractC32417h.m101212u((AbstractC23773f1) interfaceC27797g);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27797g);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27797g.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: R */
    public static int m74481R(InterfaceC27802l receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof InterfaceC23796q0) {
            return ((InterfaceC23796q0) receiver).getParameters().size();
        }
        StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sbM73380m).toString());
    }

    /* JADX INFO: renamed from: S */
    public static Collection m74482S(InterfaceC25385b interfaceC25385b, InterfaceC27798h interfaceC27798h) {
        InterfaceC27802l interfaceC27802lMo74544T = interfaceC25385b.mo74544T(interfaceC27798h);
        if (interfaceC27802lMo74544T instanceof C0723o) {
            return ((C0723o) interfaceC27802lMo74544T).m1782a();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27798h);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27798h.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: T */
    public static AbstractC23804u0 m74483T(InterfaceC27793c receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof C25392i) {
            return ((C25392i) receiver).mo74523b();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: U */
    public static AbstractC23811y m74484U(InterfaceC27804n receiver, InterfaceC27797g type) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        AbstractC22676k.m65750j(type, "type");
        if (!(type instanceof AbstractC23773f1)) {
            StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb4.append(type);
            sb4.append(", ");
            throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, type.getClass(), sb4).toString());
        }
        if (receiver instanceof C23758a1) {
            return ((C23758a1) receiver).m69822g((AbstractC23811y) type, EnumC23776g1.INVARIANT);
        }
        StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb5.append(receiver);
        sb5.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb5).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public static C25384a m74485V(InterfaceC25385b interfaceC25385b, InterfaceC27798h interfaceC27798h) {
        if (interfaceC27798h instanceof AbstractC23763c0) {
            AbstractC23811y abstractC23811y = (AbstractC23811y) interfaceC27798h;
            return new C25384a(interfaceC25385b, new C23758a1(AbstractC23800s0.f94190b.m69841f(abstractC23811y.mo69844i0(), abstractC23811y.mo69842X())));
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27798h);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27798h.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: W */
    public static Collection m74486W(InterfaceC27802l receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof InterfaceC23796q0) {
            Collection supertypes = ((InterfaceC23796q0) receiver).getSupertypes();
            AbstractC22676k.m65749i(supertypes, "getSupertypes(...)");
            return supertypes;
        }
        StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sbM73380m).toString());
    }

    /* JADX INFO: renamed from: X */
    public static InterfaceC23796q0 m74487X(InterfaceC27798h receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23763c0) {
            return ((AbstractC23763c0) receiver).mo69844i0();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: Y */
    public static C25392i m74488Y(InterfaceC27794d interfaceC27794d) {
        if (interfaceC27794d instanceof C25391h) {
            return ((C25391h) interfaceC27794d).m74520x0();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27794d);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27794d.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: Z */
    public static AbstractC23763c0 m74489Z(InterfaceC27796f interfaceC27796f) {
        if (interfaceC27796f instanceof AbstractC23797r) {
            return ((AbstractC23797r) interfaceC27796f).f94188y;
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27796f);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27796f.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74490a(InterfaceC27802l c3, InterfaceC27802l c7) {
        AbstractC22676k.m65750j(c3, "c1");
        AbstractC22676k.m65750j(c7, "c2");
        if (!(c3 instanceof InterfaceC23796q0)) {
            StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", c3, ", ");
            throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, c3.getClass(), sbM73380m).toString());
        }
        if (c7 instanceof InterfaceC23796q0) {
            return c3.equals(c7);
        }
        StringBuilder sbM73380m2 = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", c7, ", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, c7.getClass(), sbM73380m2).toString());
    }

    /* JADX INFO: renamed from: a0 */
    public static AbstractC23763c0 m74491a0(InterfaceC27798h receiver, boolean z4) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23763c0) {
            return ((AbstractC23763c0) receiver).mo64125r0(z4);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: b */
    public static int m74492b(InterfaceC27797g receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23811y) {
            return ((AbstractC23811y) receiver).mo69842X().size();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: b0 */
    public static InterfaceC27797g m74493b0(InterfaceC25385b interfaceC25385b, InterfaceC27797g interfaceC27797g) {
        if (interfaceC27797g instanceof InterfaceC27798h) {
            return interfaceC25385b.mo74460d((InterfaceC27798h) interfaceC27797g);
        }
        if (!(interfaceC27797g instanceof InterfaceC27796f)) {
            throw new IllegalStateException("sealed");
        }
        InterfaceC27796f interfaceC27796f = (InterfaceC27796f) interfaceC27797g;
        return interfaceC25385b.mo74461w(interfaceC25385b.mo74460d((InterfaceC27798h) interfaceC25385b.mo74458b(interfaceC27796f)), interfaceC25385b.mo74460d((InterfaceC27798h) interfaceC25385b.mo74457a(interfaceC27796f)));
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC27800j m74494c(InterfaceC27798h receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23763c0) {
            return (InterfaceC27800j) receiver;
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC27794d m74495d(InterfaceC25385b interfaceC25385b, InterfaceC27799i receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23763c0) {
            if (receiver instanceof C23772f0) {
                return interfaceC25385b.mo74587y(((C23772f0) receiver).m69862z0());
            }
            if (receiver instanceof C25391h) {
                return (C25391h) receiver;
            }
            return null;
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: e */
    public static C23785l m74496e(InterfaceC27798h receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23763c0) {
            if (receiver instanceof C23785l) {
                return (C23785l) receiver;
            }
            return null;
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC23797r m74497f(InterfaceC27797g receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23811y) {
            AbstractC23773f1 abstractC23773f1Mo69863p0 = ((AbstractC23811y) receiver).mo69863p0();
            if (abstractC23773f1Mo69863p0 instanceof AbstractC23797r) {
                return (AbstractC23797r) abstractC23773f1Mo69863p0;
            }
            return null;
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC23763c0 m74498g(InterfaceC27797g receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23811y) {
            AbstractC23773f1 abstractC23773f1Mo69863p0 = ((AbstractC23811y) receiver).mo69863p0();
            if (abstractC23773f1Mo69863p0 instanceof AbstractC23763c0) {
                return (AbstractC23763c0) abstractC23773f1Mo69863p0;
            }
            return null;
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: h */
    public static C23806v0 m74499h(InterfaceC27797g interfaceC27797g) {
        if (interfaceC27797g instanceof AbstractC23811y) {
            return AbstractC20301a.m56346n((AbstractC23811y) interfaceC27797g);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27797g);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27797g.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC23763c0 m74500i(InterfaceC27798h interfaceC27798h) {
        EnumC27792b enumC27792b = EnumC27792b.f112043w;
        if (interfaceC27798h instanceof AbstractC23763c0) {
            return AbstractC34870c0.m109969D((AbstractC23763c0) interfaceC27798h);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27798h);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27798h.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: j */
    public static EnumC27792b m74501j(InterfaceC27794d interfaceC27794d) {
        if (interfaceC27794d instanceof C25391h) {
            return ((C25391h) interfaceC27794d).m74519w0();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(interfaceC27794d);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27794d.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: k */
    public static C23794p0 m74502k(boolean z4, C25396m c25396m, C25388e c25388e, int i13) {
        if ((i13 & 4) != 0) {
            c25396m = C25396m.f99492w;
        }
        C25396m c25396m2 = c25396m;
        if ((i13 & 8) != 0) {
            c25388e = C25388e.f99473a;
        }
        return new C23794p0(z4, true, c25396m2, c25388e, C25389f.f99474a);
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC23773f1 m74503l(InterfaceC25385b interfaceC25385b, InterfaceC27798h lowerBound, InterfaceC27798h upperBound) {
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
        if (!(lowerBound instanceof AbstractC23763c0)) {
            StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb4.append(interfaceC25385b);
            sb4.append(", ");
            throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC25385b.getClass(), sb4).toString());
        }
        if (upperBound instanceof AbstractC23763c0) {
            return AbstractC23791o.m69883b((AbstractC23763c0) lowerBound, (AbstractC23763c0) upperBound);
        }
        StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb5.append(interfaceC25385b);
        sb5.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC25385b.getClass(), sb5).toString());
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC27801k m74504m(InterfaceC27797g receiver, int i13) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23811y) {
            return (InterfaceC27801k) ((AbstractC23811y) receiver).mo69842X().get(i13);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: n */
    public static List m74505n(InterfaceC27797g receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23811y) {
            return ((AbstractC23811y) receiver).mo69842X();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: o */
    public static InterfaceC27803m m74506o(InterfaceC27802l receiver, int i13) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof InterfaceC23796q0) {
            Object obj = ((InterfaceC23796q0) receiver).getParameters().get(i13);
            AbstractC22676k.m65749i(obj, "get(...)");
            return (InterfaceC27803m) obj;
        }
        StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sbM73380m).toString());
    }

    /* JADX INFO: renamed from: p */
    public static List m74507p(InterfaceC27802l receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof InterfaceC23796q0) {
            List parameters = ((InterfaceC23796q0) receiver).getParameters();
            AbstractC22676k.m65749i(parameters, "getParameters(...)");
            return parameters;
        }
        StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sbM73380m).toString());
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC23811y m74508q(InterfaceC27803m receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof InterfaceC31165x0) {
            return AbstractC20301a.m56306E((InterfaceC31165x0) receiver);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC23773f1 m74509r(InterfaceC25385b interfaceC25385b, InterfaceC27801k receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (interfaceC25385b.mo74527B(receiver)) {
            return null;
        }
        if (receiver instanceof AbstractC23804u0) {
            return ((AbstractC23804u0) receiver).mo69868b().mo69863p0();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: s */
    public static InterfaceC31165x0 m74510s(InterfaceC27802l receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (!(receiver instanceof InterfaceC23796q0)) {
            StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sbM73380m).toString());
        }
        InterfaceC31126h interfaceC31126hMo1784d = ((InterfaceC23796q0) receiver).mo1784d();
        if (interfaceC31126hMo1784d instanceof InterfaceC31165x0) {
            return (InterfaceC31165x0) interfaceC31126hMo1784d;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static EnumC27806p m74511t(InterfaceC27801k receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof AbstractC23804u0) {
            EnumC23776g1 enumC23776g1Mo69867a = ((AbstractC23804u0) receiver).mo69867a();
            AbstractC22676k.m65749i(enumC23776g1Mo69867a, "getProjectionKind(...)");
            return AbstractC34870c0.m109973H(enumC23776g1Mo69867a);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: u */
    public static EnumC27806p m74512u(InterfaceC27803m receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof InterfaceC31165x0) {
            EnumC23776g1 variance = ((InterfaceC31165x0) receiver).getVariance();
            AbstractC22676k.m65749i(variance, "getVariance(...)");
            return AbstractC34870c0.m109973H(variance);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: v */
    public static boolean m74513v(InterfaceC27797g receiver, C35847e fqName) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        AbstractC22676k.m65750j(fqName, "fqName");
        if (receiver instanceof AbstractC23811y) {
            return ((AbstractC23811y) receiver).getAnnotations().mo52688J(fqName);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sb4).toString());
    }

    /* JADX INFO: renamed from: w */
    public static boolean m74514w(InterfaceC27803m interfaceC27803m, InterfaceC27802l interfaceC27802l) {
        if (!(interfaceC27803m instanceof InterfaceC31165x0)) {
            StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb4.append(interfaceC27803m);
            sb4.append(", ");
            throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27803m.getClass(), sb4).toString());
        }
        InterfaceC31165x0 interfaceC31165x0 = (InterfaceC31165x0) interfaceC27803m;
        if (interfaceC27802l == null ? true : interfaceC27802l instanceof InterfaceC23796q0) {
            return AbstractC20301a.m56311J(interfaceC31165x0, (InterfaceC23796q0) interfaceC27802l, 4);
        }
        StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb5.append(interfaceC31165x0);
        sb5.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC31165x0.getClass(), sb5).toString());
    }

    /* JADX INFO: renamed from: x */
    public static boolean m74515x(InterfaceC27798h a5, InterfaceC27798h b) {
        AbstractC22676k.m65750j(a5, "a");
        AbstractC22676k.m65750j(b, "b");
        if (!(a5 instanceof AbstractC23763c0)) {
            StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb4.append(a5);
            sb4.append(", ");
            throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, a5.getClass(), sb4).toString());
        }
        if (b instanceof AbstractC23763c0) {
            return ((AbstractC23763c0) a5).mo69842X() == ((AbstractC23763c0) b).mo69842X();
        }
        StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb5.append(b);
        sb5.append(", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, b.getClass(), sb5).toString());
    }

    /* JADX INFO: renamed from: y */
    public static boolean m74516y(InterfaceC27802l interfaceC27802l) {
        if (interfaceC27802l instanceof InterfaceC23796q0) {
            return AbstractC27736h.m83807I((InterfaceC23796q0) interfaceC27802l, AbstractC27741m.f111843a);
        }
        StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", interfaceC27802l, ", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27802l.getClass(), sbM73380m).toString());
    }

    /* JADX INFO: renamed from: z */
    public static boolean m74517z(InterfaceC27802l receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        if (receiver instanceof InterfaceC23796q0) {
            return ((InterfaceC23796q0) receiver).mo1784d() instanceof InterfaceC31117e;
        }
        StringBuilder sbM73380m = AbstractC25012a.m73380m("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, receiver.getClass(), sbM73380m).toString());
    }
}
