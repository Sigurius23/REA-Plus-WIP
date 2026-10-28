package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1199a1 {

    /* JADX INFO: renamed from: a */
    public static final Class f5350a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC1211e1 f5351b;

    /* JADX INFO: renamed from: c */
    public static final C1217g1 f5352c;

    static {
        Class<?> cls;
        Class<?> cls2;
        C1264w0 c1264w0 = C1264w0.f5502c;
        AbstractC1211e1 abstractC1211e1 = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f5350a = cls;
        try {
            C1264w0 c1264w1 = C1264w0.f5502c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                abstractC1211e1 = (AbstractC1211e1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f5351b = abstractC1211e1;
        f5352c = new C1217g1();
    }

    /* JADX INFO: renamed from: a */
    public static int m3750a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1198a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM3934u0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM3934u0 += C1236n.m3934u0(((Integer) list.get(i13)).intValue());
        }
        return iM3934u0;
    }

    /* JADX INFO: renamed from: b */
    public static int m3751b(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1236n.m3932s0(i13) + 4) * size;
    }

    /* JADX INFO: renamed from: c */
    public static int m3752c(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1236n.m3932s0(i13) + 8) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m3753d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1198a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM3934u0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM3934u0 += C1236n.m3934u0(((Integer) list.get(i13)).intValue());
        }
        return iM3934u0;
    }

    /* JADX INFO: renamed from: e */
    public static int m3754e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1219h0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM3934u0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM3934u0 += C1236n.m3934u0(((Long) list.get(i13)).longValue());
        }
        return iM3934u0;
    }

    /* JADX INFO: renamed from: f */
    public static int m3755f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof AbstractC1198a0)) {
                int iM3933t0 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    int iIntValue = ((Integer) list.get(i13)).intValue();
                    iM3933t0 += C1236n.m3933t0((iIntValue >> 31) ^ (iIntValue << 1));
                }
                return iM3933t0;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static int m3756g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof AbstractC1219h0)) {
                int iM3934u0 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    long jLongValue = ((Long) list.get(i13)).longValue();
                    iM3934u0 += C1236n.m3934u0((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iM3934u0;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static int m3757h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1198a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM3933t0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM3933t0 += C1236n.m3933t0(((Integer) list.get(i13)).intValue());
        }
        return iM3933t0;
    }

    /* JADX INFO: renamed from: i */
    public static int m3758i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1219h0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM3934u0 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM3934u0 += C1236n.m3934u0(((Long) list.get(i13)).longValue());
        }
        return iM3934u0;
    }

    /* JADX INFO: renamed from: j */
    public static Object m3759j(Object obj, int i13, AbstractC1200b abstractC1200b, Object obj2, AbstractC1211e1 abstractC1211e1) {
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
    public static void m3760k(AbstractC1211e1 abstractC1211e1, Object obj, Object obj2) {
        ((C1217g1) abstractC1211e1).getClass();
        AbstractC1269z abstractC1269z = (AbstractC1269z) obj;
        C1214f1 c1214f1 = abstractC1269z.unknownFields;
        C1214f1 c1214f2 = ((AbstractC1269z) obj2).unknownFields;
        C1214f1 c1214f3 = C1214f1.f5390f;
        if (!c1214f3.equals(c1214f2)) {
            if (c1214f3.equals(c1214f1)) {
                int i13 = c1214f1.f5391a + c1214f2.f5391a;
                int[] iArrCopyOf = Arrays.copyOf(c1214f1.f5392b, i13);
                System.arraycopy(c1214f2.f5392b, 0, iArrCopyOf, c1214f1.f5391a, c1214f2.f5391a);
                Object[] objArrCopyOf = Arrays.copyOf(c1214f1.f5393c, i13);
                System.arraycopy(c1214f2.f5393c, 0, objArrCopyOf, c1214f1.f5391a, c1214f2.f5391a);
                c1214f1 = new C1214f1(i13, iArrCopyOf, objArrCopyOf, true);
            } else {
                c1214f1.getClass();
                if (!c1214f2.equals(c1214f3)) {
                    if (!c1214f1.f5395e) {
                        throw new UnsupportedOperationException();
                    }
                    int i14 = c1214f1.f5391a + c1214f2.f5391a;
                    c1214f1.m3802a(i14);
                    System.arraycopy(c1214f2.f5392b, 0, c1214f1.f5392b, c1214f1.f5391a, c1214f2.f5391a);
                    System.arraycopy(c1214f2.f5393c, 0, c1214f1.f5393c, c1214f1.f5391a, c1214f2.f5391a);
                    c1214f1.f5391a = i14;
                }
            }
        }
        abstractC1269z.unknownFields = c1214f1;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m3761l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static void m3762m(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1206d) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1236n.m3961z0(i13, ((Boolean) list.get(i14)).booleanValue());
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Boolean) list.get(i16)).getClass();
            Logger logger = C1236n.f5438i;
            i15++;
        }
        c1236n.m3948N0(i15);
        while (i14 < list.size()) {
            c1236n.m3959x0(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
            i14++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m3763n(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1239o) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                double dDoubleValue = ((Double) list.get(i14)).doubleValue();
                c1236n.getClass();
                c1236n.m3939E0(i13, Double.doubleToRawLongBits(dDoubleValue));
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Double) list.get(i16)).getClass();
            Logger logger = C1236n.f5438i;
            i15 += 8;
        }
        c1236n.m3948N0(i15);
        while (i14 < list.size()) {
            c1236n.m3940F0(Double.doubleToRawLongBits(((Double) list.get(i14)).doubleValue()));
            i14++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m3764o(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1198a0) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1236n.m3941G0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int iM3934u0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM3934u0 += C1236n.m3934u0(((Integer) list.get(i15)).intValue());
        }
        c1236n.m3948N0(iM3934u0);
        while (i14 < list.size()) {
            c1236n.m3942H0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m3765p(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1198a0) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1236n.m3937C0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = C1236n.f5438i;
            i15 += 4;
        }
        c1236n.m3948N0(i15);
        while (i14 < list.size()) {
            c1236n.m3938D0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m3766q(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1219h0) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1236n.m3939E0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = C1236n.f5438i;
            i15 += 8;
        }
        c1236n.m3948N0(i15);
        while (i14 < list.size()) {
            c1236n.m3940F0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m3767r(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1260v) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                float fFloatValue = ((Float) list.get(i14)).floatValue();
                c1236n.getClass();
                c1236n.m3937C0(i13, Float.floatToRawIntBits(fFloatValue));
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Float) list.get(i16)).getClass();
            Logger logger = C1236n.f5438i;
            i15 += 4;
        }
        c1236n.m3948N0(i15);
        while (i14 < list.size()) {
            c1236n.m3938D0(Float.floatToRawIntBits(((Float) list.get(i14)).floatValue()));
            i14++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m3768s(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1198a0) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1236n.m3941G0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int iM3934u0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM3934u0 += C1236n.m3934u0(((Integer) list.get(i15)).intValue());
        }
        c1236n.m3948N0(iM3934u0);
        while (i14 < list.size()) {
            c1236n.m3942H0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m3769t(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1219h0) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1236n.m3949O0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int iM3934u0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM3934u0 += C1236n.m3934u0(((Long) list.get(i15)).longValue());
        }
        c1236n.m3948N0(iM3934u0);
        while (i14 < list.size()) {
            c1236n.m3950P0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m3770u(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1198a0) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1236n.m3937C0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = C1236n.f5438i;
            i15 += 4;
        }
        c1236n.m3948N0(i15);
        while (i14 < list.size()) {
            c1236n.m3938D0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m3771v(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1219h0) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1236n.m3939E0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = C1236n.f5438i;
            i15 += 8;
        }
        c1236n.m3948N0(i15);
        while (i14 < list.size()) {
            c1236n.m3940F0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m3772w(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1198a0) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                int iIntValue = ((Integer) list.get(i14)).intValue();
                c1236n.m3947M0(i13, (iIntValue >> 31) ^ (iIntValue << 1));
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int iM3933t0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            int iIntValue2 = ((Integer) list.get(i15)).intValue();
            iM3933t0 += C1236n.m3933t0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c1236n.m3948N0(iM3933t0);
        while (i14 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i14)).intValue();
            c1236n.m3948N0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i14++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m3773x(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1219h0) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                long jLongValue = ((Long) list.get(i14)).longValue();
                c1236n.m3949O0(i13, (jLongValue >> 63) ^ (jLongValue << 1));
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int iM3934u0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            long jLongValue2 = ((Long) list.get(i15)).longValue();
            iM3934u0 += C1236n.m3934u0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c1236n.m3948N0(iM3934u0);
        while (i14 < list.size()) {
            long jLongValue3 = ((Long) list.get(i14)).longValue();
            c1236n.m3950P0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i14++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m3774y(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1198a0) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1236n.m3947M0(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int iM3933t0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM3933t0 += C1236n.m3933t0(((Integer) list.get(i15)).intValue());
        }
        c1236n.m3948N0(iM3933t0);
        while (i14 < list.size()) {
            c1236n.m3948N0(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m3775z(int i13, List list, C1225j0 c1225j0, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        if (list instanceof AbstractC1219h0) {
            AbstractC30802r.m94775x(list);
            if (!z4) {
                throw null;
            }
            c1236n.m3946L0(i13, 2);
            throw null;
        }
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1236n.m3949O0(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c1236n.m3946L0(i13, 2);
        int iM3934u0 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM3934u0 += C1236n.m3934u0(((Long) list.get(i15)).longValue());
        }
        c1236n.m3948N0(iM3934u0);
        while (i14 < list.size()) {
            c1236n.m3950P0(((Long) list.get(i14)).longValue());
            i14++;
        }
    }
}
