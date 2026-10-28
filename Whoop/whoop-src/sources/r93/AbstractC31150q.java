package r93;

import fb3.InterfaceC14343d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import m83.AbstractC25260n;
import rb3.C31207o;
import u93.C34703t0;
import u93.InterfaceC34701s0;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: r93.q */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31150q {

    /* JADX INFO: renamed from: a */
    public static final C31148p f128349a;

    /* JADX INFO: renamed from: b */
    public static final C31148p f128350b;

    /* JADX INFO: renamed from: c */
    public static final C31148p f128351c;

    /* JADX INFO: renamed from: d */
    public static final C31148p f128352d;

    /* JADX INFO: renamed from: e */
    public static final C31148p f128353e;

    /* JADX INFO: renamed from: f */
    public static final C31148p f128354f;

    /* JADX INFO: renamed from: g */
    public static final C31148p f128355g;

    /* JADX INFO: renamed from: h */
    public static final C31148p f128356h;

    /* JADX INFO: renamed from: i */
    public static final C31148p f128357i;

    /* JADX INFO: renamed from: j */
    public static final C31148p f128358j;

    /* JADX INFO: renamed from: k */
    public static final C31161v0 f128359k;

    /* JADX INFO: renamed from: l */
    public static final C31161v0 f128360l;

    /* JADX INFO: renamed from: m */
    public static final C31161v0 f128361m;

    /* JADX INFO: renamed from: n */
    public static final C31207o f128362n;

    /* JADX INFO: renamed from: o */
    public static final HashMap f128363o;

    static {
        C31148p c31148p = new C31148p(C31125g1.f128336c, 0);
        f128349a = c31148p;
        C31148p c31148p2 = new C31148p(C31128h1.f128339c, 1);
        f128350b = c31148p2;
        C31148p c31148p3 = new C31148p(C31131i1.f128341c, 2);
        f128351c = c31148p3;
        C31148p c31148p4 = new C31148p(C31116d1.f128321c, 3);
        f128352d = c31148p4;
        C31148p c31148p5 = new C31148p(C31134j1.f128342c, 4);
        f128353e = c31148p5;
        C31148p c31148p6 = new C31148p(C31122f1.f128335c, 5);
        f128354f = c31148p6;
        C31148p c31148p7 = new C31148p(C31113c1.f128315c, 6);
        f128355g = c31148p7;
        C31148p c31148p8 = new C31148p(C31119e1.f128324c, 7);
        f128356h = c31148p8;
        C31148p c31148p9 = new C31148p(C31137k1.f128343c, 8);
        f128357i = c31148p9;
        Collections.unmodifiableSet(AbstractC25260n.m74059b1(new AbstractC31152r[]{c31148p, c31148p2, c31148p4, c31148p6}));
        HashMap map = new HashMap(6);
        map.put(c31148p2, 0);
        map.put(c31148p, 0);
        map.put(c31148p4, 1);
        map.put(c31148p3, 1);
        map.put(c31148p5, 2);
        Collections.unmodifiableMap(map);
        f128358j = c31148p5;
        f128359k = new C31161v0(1);
        f128360l = new C31161v0(2);
        f128361m = new C31161v0(3);
        try {
            Iterator it = Arrays.asList(new C31207o[0]).iterator();
            f128362n = it.hasNext() ? (C31207o) it.next() : C31207o.f128549a;
            f128363o = new HashMap();
            m95878f(c31148p);
            m95878f(c31148p2);
            m95878f(c31148p3);
            m95878f(c31148p4);
            m95878f(c31148p5);
            m95878f(c31148p6);
            m95878f(c31148p7);
            m95878f(c31148p8);
            m95878f(c31148p9);
        } catch (Throwable th3) {
            throw new ServiceConfigurationError(th3.getMessage(), th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m95873a(int i13) {
        String str = i13 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 16 ? 3 : 2];
        if (i13 != 1 && i13 != 3 && i13 != 5 && i13 != 7) {
            switch (i13) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i13 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i13) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Integer m95874b(AbstractC31152r abstractC31152r, AbstractC31152r abstractC31152r2) {
        if (abstractC31152r == null) {
            m95873a(12);
            throw null;
        }
        if (abstractC31152r2 == null) {
            m95873a(13);
            throw null;
        }
        AbstractC31143m1 abstractC31143m1 = ((AbstractC31146o) abstractC31152r).f128347a;
        AbstractC31143m1 abstractC31143m2 = ((AbstractC31146o) abstractC31152r2).f128347a;
        Integer numMo95871a = abstractC31143m1.mo95871a(abstractC31143m2);
        if (numMo95871a != null) {
            return numMo95871a;
        }
        Integer numMo95871a2 = abstractC31143m2.mo95871a(abstractC31143m1);
        if (numMo95871a2 != null) {
            return Integer.valueOf(-numMo95871a2.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC31144n m95875c(InterfaceC14343d interfaceC14343d, InterfaceC31144n interfaceC31144n, InterfaceC31135k interfaceC31135k) {
        InterfaceC31144n interfaceC31144nM95875c;
        if (interfaceC31144n == null) {
            m95873a(8);
            throw null;
        }
        if (interfaceC31135k == null) {
            m95873a(9);
            throw null;
        }
        for (InterfaceC31144n interfaceC31144n2 = (InterfaceC31144n) interfaceC31144n.mo78660a(); interfaceC31144n2 != null && interfaceC31144n2.getVisibility() != f128354f; interfaceC31144n2 = (InterfaceC31144n) AbstractC39363f.m125526h(interfaceC31144n2, InterfaceC31144n.class, true)) {
            if (!interfaceC31144n2.getVisibility().mo40931a(interfaceC14343d, interfaceC31144n2, interfaceC31135k)) {
                return interfaceC31144n2;
            }
        }
        if (!(interfaceC31144n instanceof InterfaceC34701s0) || (interfaceC31144nM95875c = m95875c(interfaceC14343d, ((C34703t0) ((InterfaceC34701s0) interfaceC31144n)).m109613V0(), interfaceC31135k)) == null) {
            return null;
        }
        return interfaceC31144nM95875c;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m95876d(InterfaceC31144n interfaceC31144n, InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k == null) {
            m95873a(7);
            throw null;
        }
        C31157t0 c31157t0M125523e = AbstractC39363f.m125523e(interfaceC31135k);
        if (c31157t0M125523e != C31157t0.f128377a) {
            return c31157t0M125523e.equals(AbstractC39363f.m125523e(interfaceC31144n));
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m95877e(AbstractC31152r abstractC31152r) {
        if (abstractC31152r != null) {
            return abstractC31152r == f128349a || abstractC31152r == f128350b;
        }
        m95873a(14);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static void m95878f(AbstractC31146o abstractC31146o) {
        f128363o.put(abstractC31146o.f128347a, abstractC31146o);
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC31152r m95879g(AbstractC31143m1 abstractC31143m1) {
        if (abstractC31143m1 == null) {
            m95873a(15);
            throw null;
        }
        AbstractC31152r abstractC31152r = (AbstractC31152r) f128363o.get(abstractC31143m1);
        if (abstractC31152r != null) {
            return abstractC31152r;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + abstractC31143m1);
    }
}
