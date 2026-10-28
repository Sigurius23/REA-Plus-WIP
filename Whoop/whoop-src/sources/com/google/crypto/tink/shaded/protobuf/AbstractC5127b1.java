package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.b1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5127b1 {

    /* JADX INFO: renamed from: a */
    public static final Class f21481a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC5130c1 f21482b;

    /* JADX INFO: renamed from: c */
    public static final C5136e1 f21483c;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC5130c1 abstractC5130c1 = null;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f21481a = cls;
        try {
            cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC5130c1 = (AbstractC5130c1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f21482b = abstractC5130c1;
        f21483c = new C5136e1();
    }

    /* JADX INFO: renamed from: a */
    public static int m16125a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5186y) {
            AbstractC5186y abstractC5186y = (AbstractC5186y) list;
            if (size <= 0) {
                return 0;
            }
            abstractC5186y.m16374d(0);
            throw null;
        }
        int iM16257k0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM16257k0 += C5158m.m16257k0(((Integer) list.get(i13)).intValue());
        }
        return iM16257k0;
    }

    /* JADX INFO: renamed from: b */
    public static int m16126b(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C5158m.m16255i0(i13) * size;
    }

    /* JADX INFO: renamed from: c */
    public static int m16127c(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C5158m.m16256j0(i13) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m16128d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5186y) {
            AbstractC5186y abstractC5186y = (AbstractC5186y) list;
            if (size <= 0) {
                return 0;
            }
            abstractC5186y.m16374d(0);
            throw null;
        }
        int iM16257k0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM16257k0 += C5158m.m16257k0(((Integer) list.get(i13)).intValue());
        }
        return iM16257k0;
    }

    /* JADX INFO: renamed from: e */
    public static int m16129e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5147i0) {
            AbstractC5147i0 abstractC5147i0 = (AbstractC5147i0) list;
            if (size <= 0) {
                return 0;
            }
            abstractC5147i0.m16176d(0);
            throw null;
        }
        int iM16262p0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM16262p0 += C5158m.m16262p0(((Long) list.get(i13)).longValue());
        }
        return iM16262p0;
    }

    /* JADX INFO: renamed from: f */
    public static int m16130f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5186y) {
            AbstractC5186y abstractC5186y = (AbstractC5186y) list;
            if (size <= 0) {
                return 0;
            }
            abstractC5186y.m16374d(0);
            throw null;
        }
        int iM16260n0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int iIntValue = ((Integer) list.get(i13)).intValue();
            iM16260n0 += C5158m.m16260n0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM16260n0;
    }

    /* JADX INFO: renamed from: g */
    public static int m16131g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5147i0) {
            AbstractC5147i0 abstractC5147i0 = (AbstractC5147i0) list;
            if (size <= 0) {
                return 0;
            }
            abstractC5147i0.m16176d(0);
            throw null;
        }
        int iM16262p0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            long jLongValue = ((Long) list.get(i13)).longValue();
            iM16262p0 += C5158m.m16262p0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM16262p0;
    }

    /* JADX INFO: renamed from: h */
    public static int m16132h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5186y) {
            AbstractC5186y abstractC5186y = (AbstractC5186y) list;
            if (size <= 0) {
                return 0;
            }
            abstractC5186y.m16374d(0);
            throw null;
        }
        int iM16260n0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM16260n0 += C5158m.m16260n0(((Integer) list.get(i13)).intValue());
        }
        return iM16260n0;
    }

    /* JADX INFO: renamed from: i */
    public static int m16133i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5147i0) {
            AbstractC5147i0 abstractC5147i0 = (AbstractC5147i0) list;
            if (size <= 0) {
                return 0;
            }
            abstractC5147i0.m16176d(0);
            throw null;
        }
        int iM16262p0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM16262p0 += C5158m.m16262p0(((Long) list.get(i13)).longValue());
        }
        return iM16262p0;
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
    /* JADX INFO: renamed from: j */
    public static void m16134j(AbstractC5130c1 abstractC5130c1, Object obj, Object obj2) {
        ((C5136e1) abstractC5130c1).getClass();
        AbstractC5184x abstractC5184x = (AbstractC5184x) obj;
        C5133d1 c5133d1 = abstractC5184x.unknownFields;
        C5133d1 c5133d2 = ((AbstractC5184x) obj2).unknownFields;
        C5133d1 c5133d3 = C5133d1.f21499f;
        if (!c5133d3.equals(c5133d2)) {
            if (c5133d3.equals(c5133d1)) {
                int i13 = c5133d1.f21500a + c5133d2.f21500a;
                int[] iArrCopyOf = Arrays.copyOf(c5133d1.f21501b, i13);
                System.arraycopy(c5133d2.f21501b, 0, iArrCopyOf, c5133d1.f21500a, c5133d2.f21500a);
                Object[] objArrCopyOf = Arrays.copyOf(c5133d1.f21502c, i13);
                System.arraycopy(c5133d2.f21502c, 0, objArrCopyOf, c5133d1.f21500a, c5133d2.f21500a);
                c5133d1 = new C5133d1(i13, iArrCopyOf, objArrCopyOf, true);
            } else {
                c5133d1.getClass();
                if (!c5133d2.equals(c5133d3)) {
                    if (!c5133d1.f21504e) {
                        throw new UnsupportedOperationException();
                    }
                    int i14 = c5133d1.f21500a + c5133d2.f21500a;
                    c5133d1.m16159a(i14);
                    System.arraycopy(c5133d2.f21501b, 0, c5133d1.f21501b, c5133d1.f21500a, c5133d2.f21500a);
                    System.arraycopy(c5133d2.f21502c, 0, c5133d1.f21502c, c5133d1.f21500a, c5133d2.f21500a);
                    c5133d1.f21500a = i14;
                }
            }
        }
        abstractC5184x.unknownFields = c5133d1;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16135k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m16136l(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        if (!z4) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                boolean zBooleanValue = ((Boolean) list.get(i14)).booleanValue();
                c5158m.m16274y0(i13, 0);
                c5158m.m16267r0(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Boolean) list.get(i16)).getClass();
            Logger logger = C5158m.f21543f;
            i15++;
        }
        c5158m.m16275z0(i15);
        for (int i17 = 0; i17 < list.size(); i17++) {
            c5158m.m16267r0(((Boolean) list.get(i17)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m16137m(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                double dDoubleValue = ((Double) list.get(i14)).doubleValue();
                c5158m.getClass();
                c5158m.m16271v0(i13, Double.doubleToRawLongBits(dDoubleValue));
                i14++;
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Double) list.get(i16)).getClass();
            Logger logger = C5158m.f21543f;
            i15 += 8;
        }
        c5158m.m16275z0(i15);
        while (i14 < list.size()) {
            c5158m.m16272w0(Double.doubleToRawLongBits(((Double) list.get(i14)).doubleValue()));
            i14++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m16138n(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        if (!z4) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                int iIntValue = ((Integer) list.get(i14)).intValue();
                c5158m.m16274y0(i13, 0);
                c5158m.m16273x0(iIntValue);
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int iM16257k0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM16257k0 += C5158m.m16257k0(((Integer) list.get(i15)).intValue());
        }
        c5158m.m16275z0(iM16257k0);
        for (int i16 = 0; i16 < list.size(); i16++) {
            c5158m.m16273x0(((Integer) list.get(i16)).intValue());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m16139o(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c5158m.m16269t0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = C5158m.f21543f;
            i15 += 4;
        }
        c5158m.m16275z0(i15);
        while (i14 < list.size()) {
            c5158m.m16270u0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m16140p(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c5158m.m16271v0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = C5158m.f21543f;
            i15 += 8;
        }
        c5158m.m16275z0(i15);
        while (i14 < list.size()) {
            c5158m.m16272w0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m16141q(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                float fFloatValue = ((Float) list.get(i14)).floatValue();
                c5158m.getClass();
                c5158m.m16269t0(i13, Float.floatToRawIntBits(fFloatValue));
                i14++;
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Float) list.get(i16)).getClass();
            Logger logger = C5158m.f21543f;
            i15 += 4;
        }
        c5158m.m16275z0(i15);
        while (i14 < list.size()) {
            c5158m.m16270u0(Float.floatToRawIntBits(((Float) list.get(i14)).floatValue()));
            i14++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m16142r(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        if (!z4) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                int iIntValue = ((Integer) list.get(i14)).intValue();
                c5158m.m16274y0(i13, 0);
                c5158m.m16273x0(iIntValue);
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int iM16257k0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM16257k0 += C5158m.m16257k0(((Integer) list.get(i15)).intValue());
        }
        c5158m.m16275z0(iM16257k0);
        for (int i16 = 0; i16 < list.size(); i16++) {
            c5158m.m16273x0(((Integer) list.get(i16)).intValue());
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m16143s(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c5158m.m16264A0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int iM16262p0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM16262p0 += C5158m.m16262p0(((Long) list.get(i15)).longValue());
        }
        c5158m.m16275z0(iM16262p0);
        while (i14 < list.size()) {
            c5158m.m16265B0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m16144t(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c5158m.m16269t0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = C5158m.f21543f;
            i15 += 4;
        }
        c5158m.m16275z0(i15);
        while (i14 < list.size()) {
            c5158m.m16270u0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m16145u(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c5158m.m16271v0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = C5158m.f21543f;
            i15 += 8;
        }
        c5158m.m16275z0(i15);
        while (i14 < list.size()) {
            c5158m.m16272w0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m16146v(int i13, List list, C5153k0 c5153k0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        if (!z4) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                int iIntValue = ((Integer) list.get(i14)).intValue();
                c5158m.m16274y0(i13, 0);
                c5158m.m16275z0((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int iM16260n0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            int iIntValue2 = ((Integer) list.get(i15)).intValue();
            iM16260n0 += C5158m.m16260n0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c5158m.m16275z0(iM16260n0);
        for (int i16 = 0; i16 < list.size(); i16++) {
            int iIntValue3 = ((Integer) list.get(i16)).intValue();
            c5158m.m16275z0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m16147w(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                long jLongValue = ((Long) list.get(i14)).longValue();
                c5158m.m16264A0(i13, (jLongValue >> 63) ^ (jLongValue << 1));
                i14++;
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int iM16262p0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            long jLongValue2 = ((Long) list.get(i15)).longValue();
            iM16262p0 += C5158m.m16262p0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c5158m.m16275z0(iM16262p0);
        while (i14 < list.size()) {
            long jLongValue3 = ((Long) list.get(i14)).longValue();
            c5158m.m16265B0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i14++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m16148x(int i13, List list, C5153k0 c5153k0, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        if (!z4) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                int iIntValue = ((Integer) list.get(i14)).intValue();
                c5158m.m16274y0(i13, 0);
                c5158m.m16275z0(iIntValue);
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int iM16260n0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM16260n0 += C5158m.m16260n0(((Integer) list.get(i15)).intValue());
        }
        c5158m.m16275z0(iM16260n0);
        for (int i16 = 0; i16 < list.size(); i16++) {
            c5158m.m16275z0(((Integer) list.get(i16)).intValue());
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m16149y(int i13, List list, C5153k0 c5153k0, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5158m c5158m = (C5158m) c5153k0.f21535a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c5158m.m16264A0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c5158m.m16274y0(i13, 2);
        int iM16262p0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM16262p0 += C5158m.m16262p0(((Long) list.get(i15)).longValue());
        }
        c5158m.m16275z0(iM16262p0);
        while (i14 < list.size()) {
            c5158m.m16265B0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }
}
