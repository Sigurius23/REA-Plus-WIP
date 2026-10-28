package p208i2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l83.C23465k;

/* JADX INFO: renamed from: i2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C17909s {
    /* JADX INFO: renamed from: a */
    public static C17894k0 m51483a(C17909s c17909s, List list, float f13, float f14, int i13) {
        float f15 = (i13 & 2) != 0 ? 0.0f : f13;
        float f16 = (i13 & 4) != 0 ? Float.POSITIVE_INFINITY : f14;
        c17909s.getClass();
        return new C17894k0(list, null, (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0);
    }

    /* JADX INFO: renamed from: b */
    public static C17894k0 m51484b(C17909s c17909s, C23465k[] c23465kArr) {
        c17909s.getClass();
        return m51485c((C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32), 0);
    }

    /* JADX INFO: renamed from: c */
    public static C17894k0 m51485c(C23465k[] c23465kArr, long j7, long j13, int i13) {
        ArrayList arrayList = new ArrayList(c23465kArr.length);
        for (C23465k c23465k : c23465kArr) {
            arrayList.add(new C17919x(((C17919x) c23465k.f92938x).f69639a));
        }
        ArrayList arrayList2 = new ArrayList(c23465kArr.length);
        for (C23465k c23465k2 : c23465kArr) {
            arrayList2.add(Float.valueOf(((Number) c23465k2.f92937w).floatValue()));
        }
        return new C17894k0(arrayList, arrayList2, j7, j13, i13);
    }

    /* JADX INFO: renamed from: d */
    public static C17894k0 m51486d(C17909s c17909s, List list, long j7, long j13, int i13) {
        if ((i13 & 2) != 0) {
            j7 = 0;
        }
        long j14 = j7;
        if ((i13 & 4) != 0) {
            j13 = 9187343241974906880L;
        }
        c17909s.getClass();
        return new C17894k0(list, null, j14, j13, 0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C17894k0 m51487e(C17909s c17909s, C23465k[] c23465kArr, long j7, long j13, int i13) {
        if ((i13 & 2) != 0) {
            j7 = 0;
        }
        long j14 = j7;
        if ((i13 & 4) != 0) {
            j13 = 9187343241974906880L;
        }
        c17909s.getClass();
        return m51485c(c23465kArr, j14, j13, 0);
    }

    /* JADX INFO: renamed from: f */
    public static C17914u0 m51488f(C23465k[] c23465kArr, long j7, float f13, int i13) {
        ArrayList arrayList = new ArrayList(c23465kArr.length);
        for (C23465k c23465k : c23465kArr) {
            arrayList.add(new C17919x(((C17919x) c23465k.f92938x).f69639a));
        }
        ArrayList arrayList2 = new ArrayList(c23465kArr.length);
        for (C23465k c23465k2 : c23465kArr) {
            arrayList2.add(Float.valueOf(((Number) c23465k2.f92937w).floatValue()));
        }
        return new C17914u0(arrayList, arrayList2, j7, f13, i13);
    }

    /* JADX INFO: renamed from: g */
    public static C17914u0 m51489g(C17909s c17909s, List list, long j7, float f13, int i13) {
        if ((i13 & 2) != 0) {
            j7 = 9205357640488583168L;
        }
        long j13 = j7;
        if ((i13 & 4) != 0) {
            f13 = Float.POSITIVE_INFINITY;
        }
        c17909s.getClass();
        return new C17914u0(list, null, j13, f13, 0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C17914u0 m51490h(C17909s c17909s, C23465k[] c23465kArr, long j7, float f13, int i13) {
        if ((i13 & 2) != 0) {
            j7 = 9205357640488583168L;
        }
        if ((i13 & 4) != 0) {
            f13 = Float.POSITIVE_INFINITY;
        }
        c17909s.getClass();
        return m51488f(c23465kArr, j7, f13, 0);
    }

    /* JADX INFO: renamed from: i */
    public static C17878d1 m51491i(C17909s c17909s, List list) {
        c17909s.getClass();
        return new C17878d1(list, null);
    }

    /* JADX INFO: renamed from: j */
    public static C17878d1 m51492j(C17909s c17909s, C23465k[] c23465kArr) {
        c17909s.getClass();
        ArrayList arrayList = new ArrayList(c23465kArr.length);
        for (C23465k c23465k : c23465kArr) {
            arrayList.add(new C17919x(((C17919x) c23465k.f92938x).f69639a));
        }
        ArrayList arrayList2 = new ArrayList(c23465kArr.length);
        for (C23465k c23465k2 : c23465kArr) {
            arrayList2.add(Float.valueOf(((Number) c23465k2.f92937w).floatValue()));
        }
        return new C17878d1(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: k */
    public static C17894k0 m51493k(C17909s c17909s, List list, float f13, float f14, int i13) {
        float f15 = (i13 & 2) != 0 ? 0.0f : f13;
        float f16 = (i13 & 4) != 0 ? Float.POSITIVE_INFINITY : f14;
        c17909s.getClass();
        return new C17894k0(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L), 0);
    }

    /* JADX INFO: renamed from: l */
    public static C17894k0 m51494l(C17909s c17909s, C23465k[] c23465kArr, float f13, float f14, int i13) {
        if ((i13 & 2) != 0) {
            f13 = 0.0f;
        }
        if ((i13 & 4) != 0) {
            f14 = Float.POSITIVE_INFINITY;
        }
        c17909s.getClass();
        return m51485c((C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length), (((long) Float.floatToRawIntBits(f13)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), 0);
    }
}
