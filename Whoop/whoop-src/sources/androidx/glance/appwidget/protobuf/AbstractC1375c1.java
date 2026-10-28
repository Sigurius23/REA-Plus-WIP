package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.c1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1375c1 {

    /* JADX INFO: renamed from: a */
    public static final Class f5873a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC1378d1 f5874b;

    /* JADX INFO: renamed from: c */
    public static final C1384f1 f5875c;

    static {
        Class<?> cls;
        Class<?> cls2;
        C1430y0 c1430y0 = C1430y0.f5993c;
        AbstractC1378d1 abstractC1378d1 = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f5873a = cls;
        try {
            C1430y0 c1430y1 = C1430y0.f5993c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                abstractC1378d1 = (AbstractC1378d1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f5874b = abstractC1378d1;
        f5875c = new C1384f1();
    }

    /* JADX INFO: renamed from: a */
    public static int m4298a(List list) {
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1371b0)) {
            int iM4505k0 = 0;
            while (i13 < size) {
                iM4505k0 += AbstractC1411p.m4505k0(((Integer) list.get(i13)).intValue());
                i13++;
            }
            return iM4505k0;
        }
        C1371b0 c1371b0 = (C1371b0) list;
        int iM4505k1 = 0;
        while (i13 < size) {
            iM4505k1 += AbstractC1411p.m4505k0(c1371b0.m4285e(i13));
            i13++;
        }
        return iM4505k1;
    }

    /* JADX INFO: renamed from: b */
    public static int m4299b(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1411p.m4503i0(i13) + 4) * size;
    }

    /* JADX INFO: renamed from: c */
    public static int m4300c(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1411p.m4503i0(i13) + 8) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m4301d(List list) {
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1371b0)) {
            int iM4505k0 = 0;
            while (i13 < size) {
                iM4505k0 += AbstractC1411p.m4505k0(((Integer) list.get(i13)).intValue());
                i13++;
            }
            return iM4505k0;
        }
        C1371b0 c1371b0 = (C1371b0) list;
        int iM4505k1 = 0;
        while (i13 < size) {
            iM4505k1 += AbstractC1411p.m4505k0(c1371b0.m4285e(i13));
            i13++;
        }
        return iM4505k1;
    }

    /* JADX INFO: renamed from: e */
    public static int m4302e(List list) {
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC1398k0)) {
            int iM4505k0 = 0;
            while (i13 < size) {
                iM4505k0 += AbstractC1411p.m4505k0(((Long) list.get(i13)).longValue());
                i13++;
            }
            return iM4505k0;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) list;
        int iM4505k1 = 0;
        while (i13 < size) {
            iM4505k1 += AbstractC1411p.m4505k0(abstractC1398k0.m4407d(i13));
            i13++;
        }
        return iM4505k1;
    }

    /* JADX INFO: renamed from: f */
    public static int m4303f(List list) {
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1371b0)) {
            int iM4500f0 = 0;
            while (i13 < size) {
                iM4500f0 += AbstractC1411p.m4500f0(((Integer) list.get(i13)).intValue());
                i13++;
            }
            return iM4500f0;
        }
        C1371b0 c1371b0 = (C1371b0) list;
        int iM4500f1 = 0;
        while (i13 < size) {
            iM4500f1 += AbstractC1411p.m4500f0(c1371b0.m4285e(i13));
            i13++;
        }
        return iM4500f1;
    }

    /* JADX INFO: renamed from: g */
    public static int m4304g(List list) {
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC1398k0)) {
            int iM4501g0 = 0;
            while (i13 < size) {
                iM4501g0 += AbstractC1411p.m4501g0(((Long) list.get(i13)).longValue());
                i13++;
            }
            return iM4501g0;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) list;
        int iM4501g1 = 0;
        while (i13 < size) {
            iM4501g1 += AbstractC1411p.m4501g0(abstractC1398k0.m4407d(i13));
            i13++;
        }
        return iM4501g1;
    }

    /* JADX INFO: renamed from: h */
    public static int m4305h(List list) {
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1371b0)) {
            int iM4504j0 = 0;
            while (i13 < size) {
                iM4504j0 += AbstractC1411p.m4504j0(((Integer) list.get(i13)).intValue());
                i13++;
            }
            return iM4504j0;
        }
        C1371b0 c1371b0 = (C1371b0) list;
        int iM4504j1 = 0;
        while (i13 < size) {
            iM4504j1 += AbstractC1411p.m4504j0(c1371b0.m4285e(i13));
            i13++;
        }
        return iM4504j1;
    }

    /* JADX INFO: renamed from: i */
    public static int m4306i(List list) {
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC1398k0)) {
            int iM4505k0 = 0;
            while (i13 < size) {
                iM4505k0 += AbstractC1411p.m4505k0(((Long) list.get(i13)).longValue());
                i13++;
            }
            return iM4505k0;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) list;
        int iM4505k1 = 0;
        while (i13 < size) {
            iM4505k1 += AbstractC1411p.m4505k0(abstractC1398k0.m4407d(i13));
            i13++;
        }
        return iM4505k1;
    }

    /* JADX INFO: renamed from: j */
    public static Object m4307j(Object obj, int i13, InterfaceC1380e0 interfaceC1380e0, Object obj2, AbstractC1378d1 abstractC1378d1) {
        return obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public static void m4308k(AbstractC1378d1 abstractC1378d1, Object obj, Object obj2) {
        ((C1384f1) abstractC1378d1).getClass();
        AbstractC1368a0 abstractC1368a0 = (AbstractC1368a0) obj;
        C1381e1 c1381e1 = abstractC1368a0.unknownFields;
        C1381e1 c1381e2 = ((AbstractC1368a0) obj2).unknownFields;
        C1381e1 c1381e3 = C1381e1.f5880f;
        if (!c1381e3.equals(c1381e2)) {
            if (c1381e3.equals(c1381e1)) {
                int i13 = c1381e1.f5881a + c1381e2.f5881a;
                int[] iArrCopyOf = Arrays.copyOf(c1381e1.f5882b, i13);
                System.arraycopy(c1381e2.f5882b, 0, iArrCopyOf, c1381e1.f5881a, c1381e2.f5881a);
                Object[] objArrCopyOf = Arrays.copyOf(c1381e1.f5883c, i13);
                System.arraycopy(c1381e2.f5883c, 0, objArrCopyOf, c1381e1.f5881a, c1381e2.f5881a);
                c1381e1 = new C1381e1(i13, iArrCopyOf, objArrCopyOf, true);
            } else {
                c1381e1.getClass();
                if (!c1381e2.equals(c1381e3)) {
                    if (!c1381e1.f5885e) {
                        throw new UnsupportedOperationException();
                    }
                    int i14 = c1381e1.f5881a + c1381e2.f5881a;
                    c1381e1.m4329a(i14);
                    System.arraycopy(c1381e2.f5882b, 0, c1381e1.f5882b, c1381e1.f5881a, c1381e2.f5881a);
                    System.arraycopy(c1381e2.f5883c, 0, c1381e1.f5883c, c1381e1.f5881a, c1381e2.f5881a);
                    c1381e1.f5881a = i14;
                }
            }
        }
        abstractC1368a0.unknownFields = c1381e1;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m4309l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static void m4310m(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (list instanceof AbstractC1379e) {
            if (z4) {
                abstractC1411p.mo4480x0(i13, 2);
                abstractC1411p.mo4482z0(0);
                return;
            }
            return;
        }
        if (!z4) {
            while (i14 < list.size()) {
                abstractC1411p.mo4470n0(i13, ((Boolean) list.get(i14)).booleanValue());
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Boolean) list.get(i16)).getClass();
            Logger logger = AbstractC1411p.f5953e;
            i15++;
        }
        abstractC1411p.mo4482z0(i15);
        while (i14 < list.size()) {
            abstractC1411p.mo4469m0(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
            i14++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m4311n(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (list instanceof AbstractC1413q) {
            if (z4) {
                abstractC1411p.mo4480x0(i13, 2);
                abstractC1411p.mo4482z0(0);
                return;
            }
            return;
        }
        if (!z4) {
            while (i14 < list.size()) {
                double dDoubleValue = ((Double) list.get(i14)).doubleValue();
                abstractC1411p.getClass();
                abstractC1411p.mo4474r0(i13, Double.doubleToRawLongBits(dDoubleValue));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Double) list.get(i16)).getClass();
            Logger logger = AbstractC1411p.f5953e;
            i15 += 8;
        }
        abstractC1411p.mo4482z0(i15);
        while (i14 < list.size()) {
            abstractC1411p.mo4475s0(Double.doubleToRawLongBits(((Double) list.get(i14)).doubleValue()));
            i14++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m4312o(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (!(list instanceof C1371b0)) {
            if (!z4) {
                while (i14 < list.size()) {
                    abstractC1411p.mo4476t0(i13, ((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            abstractC1411p.mo4480x0(i13, 2);
            int iM4505k0 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                iM4505k0 += AbstractC1411p.m4505k0(((Integer) list.get(i15)).intValue());
            }
            abstractC1411p.mo4482z0(iM4505k0);
            while (i14 < list.size()) {
                abstractC1411p.mo4477u0(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        C1371b0 c1371b0 = (C1371b0) list;
        if (!z4) {
            while (i14 < c1371b0.f5870y) {
                abstractC1411p.mo4476t0(i13, c1371b0.m4285e(i14));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int iM4505k1 = 0;
        for (int i16 = 0; i16 < c1371b0.f5870y; i16++) {
            iM4505k1 += AbstractC1411p.m4505k0(c1371b0.m4285e(i16));
        }
        abstractC1411p.mo4482z0(iM4505k1);
        while (i14 < c1371b0.f5870y) {
            abstractC1411p.mo4477u0(c1371b0.m4285e(i14));
            i14++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m4313p(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (!(list instanceof C1371b0)) {
            if (!z4) {
                while (i14 < list.size()) {
                    abstractC1411p.mo4472p0(i13, ((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            abstractC1411p.mo4480x0(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Integer) list.get(i16)).getClass();
                Logger logger = AbstractC1411p.f5953e;
                i15 += 4;
            }
            abstractC1411p.mo4482z0(i15);
            while (i14 < list.size()) {
                abstractC1411p.mo4473q0(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        C1371b0 c1371b0 = (C1371b0) list;
        if (!z4) {
            while (i14 < c1371b0.f5870y) {
                abstractC1411p.mo4472p0(i13, c1371b0.m4285e(i14));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < c1371b0.f5870y; i18++) {
            c1371b0.m4285e(i18);
            Logger logger2 = AbstractC1411p.f5953e;
            i17 += 4;
        }
        abstractC1411p.mo4482z0(i17);
        while (i14 < c1371b0.f5870y) {
            abstractC1411p.mo4473q0(c1371b0.m4285e(i14));
            i14++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m4314q(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (!(list instanceof AbstractC1398k0)) {
            if (!z4) {
                while (i14 < list.size()) {
                    abstractC1411p.mo4474r0(i13, ((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            abstractC1411p.mo4480x0(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Long) list.get(i16)).getClass();
                Logger logger = AbstractC1411p.f5953e;
                i15 += 8;
            }
            abstractC1411p.mo4482z0(i15);
            while (i14 < list.size()) {
                abstractC1411p.mo4475s0(((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) list;
        if (!z4) {
            while (i14 < 0) {
                abstractC1411p.mo4474r0(i13, abstractC1398k0.m4407d(i14));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < 0; i18++) {
            abstractC1398k0.m4407d(i18);
            Logger logger2 = AbstractC1411p.f5953e;
            i17 += 8;
        }
        abstractC1411p.mo4482z0(i17);
        while (i14 < 0) {
            abstractC1411p.mo4475s0(abstractC1398k0.m4407d(i14));
            i14++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m4315r(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (list instanceof AbstractC1425w) {
            if (z4) {
                abstractC1411p.mo4480x0(i13, 2);
                abstractC1411p.mo4482z0(0);
                return;
            }
            return;
        }
        if (!z4) {
            while (i14 < list.size()) {
                float fFloatValue = ((Float) list.get(i14)).floatValue();
                abstractC1411p.getClass();
                abstractC1411p.mo4472p0(i13, Float.floatToRawIntBits(fFloatValue));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Float) list.get(i16)).getClass();
            Logger logger = AbstractC1411p.f5953e;
            i15 += 4;
        }
        abstractC1411p.mo4482z0(i15);
        while (i14 < list.size()) {
            abstractC1411p.mo4473q0(Float.floatToRawIntBits(((Float) list.get(i14)).floatValue()));
            i14++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m4316s(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (!(list instanceof C1371b0)) {
            if (!z4) {
                while (i14 < list.size()) {
                    abstractC1411p.mo4476t0(i13, ((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            abstractC1411p.mo4480x0(i13, 2);
            int iM4505k0 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                iM4505k0 += AbstractC1411p.m4505k0(((Integer) list.get(i15)).intValue());
            }
            abstractC1411p.mo4482z0(iM4505k0);
            while (i14 < list.size()) {
                abstractC1411p.mo4477u0(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        C1371b0 c1371b0 = (C1371b0) list;
        if (!z4) {
            while (i14 < c1371b0.f5870y) {
                abstractC1411p.mo4476t0(i13, c1371b0.m4285e(i14));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int iM4505k1 = 0;
        for (int i16 = 0; i16 < c1371b0.f5870y; i16++) {
            iM4505k1 += AbstractC1411p.m4505k0(c1371b0.m4285e(i16));
        }
        abstractC1411p.mo4482z0(iM4505k1);
        while (i14 < c1371b0.f5870y) {
            abstractC1411p.mo4477u0(c1371b0.m4285e(i14));
            i14++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m4317t(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (!(list instanceof AbstractC1398k0)) {
            if (!z4) {
                while (i14 < list.size()) {
                    abstractC1411p.mo4465A0(i13, ((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            abstractC1411p.mo4480x0(i13, 2);
            int iM4505k0 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                iM4505k0 += AbstractC1411p.m4505k0(((Long) list.get(i15)).longValue());
            }
            abstractC1411p.mo4482z0(iM4505k0);
            while (i14 < list.size()) {
                abstractC1411p.mo4466B0(((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) list;
        if (!z4) {
            while (i14 < 0) {
                abstractC1411p.mo4465A0(i13, abstractC1398k0.m4407d(i14));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int iM4505k1 = 0;
        for (int i16 = 0; i16 < 0; i16++) {
            iM4505k1 += AbstractC1411p.m4505k0(abstractC1398k0.m4407d(i16));
        }
        abstractC1411p.mo4482z0(iM4505k1);
        while (i14 < 0) {
            abstractC1411p.mo4466B0(abstractC1398k0.m4407d(i14));
            i14++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m4318u(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (!(list instanceof C1371b0)) {
            if (!z4) {
                while (i14 < list.size()) {
                    abstractC1411p.mo4472p0(i13, ((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            abstractC1411p.mo4480x0(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Integer) list.get(i16)).getClass();
                Logger logger = AbstractC1411p.f5953e;
                i15 += 4;
            }
            abstractC1411p.mo4482z0(i15);
            while (i14 < list.size()) {
                abstractC1411p.mo4473q0(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        C1371b0 c1371b0 = (C1371b0) list;
        if (!z4) {
            while (i14 < c1371b0.f5870y) {
                abstractC1411p.mo4472p0(i13, c1371b0.m4285e(i14));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < c1371b0.f5870y; i18++) {
            c1371b0.m4285e(i18);
            Logger logger2 = AbstractC1411p.f5953e;
            i17 += 4;
        }
        abstractC1411p.mo4482z0(i17);
        while (i14 < c1371b0.f5870y) {
            abstractC1411p.mo4473q0(c1371b0.m4285e(i14));
            i14++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m4319v(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (!(list instanceof AbstractC1398k0)) {
            if (!z4) {
                while (i14 < list.size()) {
                    abstractC1411p.mo4474r0(i13, ((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            abstractC1411p.mo4480x0(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Long) list.get(i16)).getClass();
                Logger logger = AbstractC1411p.f5953e;
                i15 += 8;
            }
            abstractC1411p.mo4482z0(i15);
            while (i14 < list.size()) {
                abstractC1411p.mo4475s0(((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) list;
        if (!z4) {
            while (i14 < 0) {
                abstractC1411p.mo4474r0(i13, abstractC1398k0.m4407d(i14));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < 0; i18++) {
            abstractC1398k0.m4407d(i18);
            Logger logger2 = AbstractC1411p.f5953e;
            i17 += 8;
        }
        abstractC1411p.mo4482z0(i17);
        while (i14 < 0) {
            abstractC1411p.mo4475s0(abstractC1398k0.m4407d(i14));
            i14++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m4320w(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (!(list instanceof C1371b0)) {
            if (!z4) {
                while (i14 < list.size()) {
                    int iIntValue = ((Integer) list.get(i14)).intValue();
                    abstractC1411p.mo4481y0(i13, (iIntValue >> 31) ^ (iIntValue << 1));
                    i14++;
                }
                return;
            }
            abstractC1411p.mo4480x0(i13, 2);
            int iM4500f0 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                iM4500f0 += AbstractC1411p.m4500f0(((Integer) list.get(i15)).intValue());
            }
            abstractC1411p.mo4482z0(iM4500f0);
            while (i14 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i14)).intValue();
                abstractC1411p.mo4482z0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i14++;
            }
            return;
        }
        C1371b0 c1371b0 = (C1371b0) list;
        if (!z4) {
            while (i14 < c1371b0.f5870y) {
                int iM4285e = c1371b0.m4285e(i14);
                abstractC1411p.mo4481y0(i13, (iM4285e >> 31) ^ (iM4285e << 1));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int iM4500f1 = 0;
        for (int i16 = 0; i16 < c1371b0.f5870y; i16++) {
            iM4500f1 += AbstractC1411p.m4500f0(c1371b0.m4285e(i16));
        }
        abstractC1411p.mo4482z0(iM4500f1);
        while (i14 < c1371b0.f5870y) {
            int iM4285e2 = c1371b0.m4285e(i14);
            abstractC1411p.mo4482z0((iM4285e2 >> 31) ^ (iM4285e2 << 1));
            i14++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m4321x(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (!(list instanceof AbstractC1398k0)) {
            if (!z4) {
                while (i14 < list.size()) {
                    long jLongValue = ((Long) list.get(i14)).longValue();
                    abstractC1411p.mo4465A0(i13, (jLongValue >> 63) ^ (jLongValue << 1));
                    i14++;
                }
                return;
            }
            abstractC1411p.mo4480x0(i13, 2);
            int iM4501g0 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                iM4501g0 += AbstractC1411p.m4501g0(((Long) list.get(i15)).longValue());
            }
            abstractC1411p.mo4482z0(iM4501g0);
            while (i14 < list.size()) {
                long jLongValue2 = ((Long) list.get(i14)).longValue();
                abstractC1411p.mo4466B0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i14++;
            }
            return;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) list;
        if (!z4) {
            while (i14 < 0) {
                long jM4407d = abstractC1398k0.m4407d(i14);
                abstractC1411p.mo4465A0(i13, (jM4407d >> 63) ^ (jM4407d << 1));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int iM4501g1 = 0;
        for (int i16 = 0; i16 < 0; i16++) {
            iM4501g1 += AbstractC1411p.m4501g0(abstractC1398k0.m4407d(i16));
        }
        abstractC1411p.mo4482z0(iM4501g1);
        while (i14 < 0) {
            long jM4407d2 = abstractC1398k0.m4407d(i14);
            abstractC1411p.mo4466B0((jM4407d2 >> 63) ^ (jM4407d2 << 1));
            i14++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m4322y(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (!(list instanceof C1371b0)) {
            if (!z4) {
                while (i14 < list.size()) {
                    abstractC1411p.mo4481y0(i13, ((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            abstractC1411p.mo4480x0(i13, 2);
            int iM4504j0 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                iM4504j0 += AbstractC1411p.m4504j0(((Integer) list.get(i15)).intValue());
            }
            abstractC1411p.mo4482z0(iM4504j0);
            while (i14 < list.size()) {
                abstractC1411p.mo4482z0(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        C1371b0 c1371b0 = (C1371b0) list;
        if (!z4) {
            while (i14 < c1371b0.f5870y) {
                abstractC1411p.mo4481y0(i13, c1371b0.m4285e(i14));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int iM4504j1 = 0;
        for (int i16 = 0; i16 < c1371b0.f5870y; i16++) {
            iM4504j1 += AbstractC1411p.m4504j0(c1371b0.m4285e(i16));
        }
        abstractC1411p.mo4482z0(iM4504j1);
        while (i14 < c1371b0.f5870y) {
            abstractC1411p.mo4482z0(c1371b0.m4285e(i14));
            i14++;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m4323z(int i13, List list, C1404m0 c1404m0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1411p abstractC1411p = (AbstractC1411p) c1404m0.f5942a;
        int i14 = 0;
        if (!(list instanceof AbstractC1398k0)) {
            if (!z4) {
                while (i14 < list.size()) {
                    abstractC1411p.mo4465A0(i13, ((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            abstractC1411p.mo4480x0(i13, 2);
            int iM4505k0 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                iM4505k0 += AbstractC1411p.m4505k0(((Long) list.get(i15)).longValue());
            }
            abstractC1411p.mo4482z0(iM4505k0);
            while (i14 < list.size()) {
                abstractC1411p.mo4466B0(((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        AbstractC1398k0 abstractC1398k0 = (AbstractC1398k0) list;
        if (!z4) {
            while (i14 < 0) {
                abstractC1411p.mo4465A0(i13, abstractC1398k0.m4407d(i14));
                i14++;
            }
            return;
        }
        abstractC1411p.mo4480x0(i13, 2);
        int iM4505k1 = 0;
        for (int i16 = 0; i16 < 0; i16++) {
            iM4505k1 += AbstractC1411p.m4505k0(abstractC1398k0.m4407d(i16));
        }
        abstractC1411p.mo4482z0(iM4505k1);
        while (i14 < 0) {
            abstractC1411p.mo4466B0(abstractC1398k0.m4407d(i14));
            i14++;
        }
    }
}
