package p322m7;

import java.time.Instant;
import java.util.Set;
import jh3.AbstractC21702c;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import n83.C26466i;
import p000.AbstractC11266d;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C25177v {

    /* JADX INFO: renamed from: e */
    public static final Set f98766e = AbstractC25260n.m74059b1(new Integer[]{10, 36, 0});

    /* JADX INFO: renamed from: f */
    public static final Set f98767f = AbstractC25260n.m74059b1(new Integer[]{38, 39, 44, 54, 0});

    /* JADX INFO: renamed from: g */
    public static final Object f98768g;

    /* JADX INFO: renamed from: a */
    public final Instant f98769a;

    /* JADX INFO: renamed from: b */
    public final Instant f98770b;

    /* JADX INFO: renamed from: c */
    public final int f98771c;

    /* JADX INFO: renamed from: d */
    public final int f98772d;

    static {
        Set setM74059b1 = AbstractC25260n.m74059b1(new Integer[]{1, 2, 3, 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 25, 26, 28, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37, 41, 42, 43, 48, 49, 50, 51, 63, 65});
        Set setM74059b2 = AbstractC25260n.m74059b1(new Integer[]{55, 56, 58, 57, 59, 61});
        C23465k c23465k = new C23465k(8, AbstractC12350b.m34570S(7));
        C23465k c23465k2 = new C23465k(9, AbstractC12350b.m34570S(8));
        C23465k c23465k3 = new C23465k(13, setM74059b1);
        C23465k c23465k4 = new C23465k(25, AbstractC12350b.m34570S(21));
        C23465k c23465k5 = new C23465k(26, AbstractC25260n.m74059b1(new Integer[]{67, 8, 40, 24}));
        C23465k c23465k6 = new C23465k(34, setM74059b1);
        C23465k c23465k7 = new C23465k(37, AbstractC25260n.m74059b1(new Integer[]{64, 66}));
        C23465k c23465k8 = new C23465k(48, AbstractC12350b.m34570S(40));
        C23465k c23465k9 = new C23465k(54, AbstractC12350b.m34570S(45));
        C23465k c23465k10 = new C23465k(56, AbstractC25260n.m74059b1(new Integer[]{46, 64}));
        C23465k c23465k11 = new C23465k(57, AbstractC12350b.m34570S(47));
        C23465k c23465k12 = new C23465k(70, setM74059b1);
        C23465k c23465k13 = new C23465k(68, AbstractC12350b.m34570S(52));
        C23465k c23465k14 = new C23465k(69, AbstractC12350b.m34570S(53));
        C26466i c26466i = new C26466i();
        c26466i.add(60);
        Set set = setM74059b2;
        c26466i.addAll(set);
        C23465k c23465k15 = new C23465k(73, AbstractC12350b.m34586g(c26466i));
        C26466i c26466i2 = new C26466i();
        c26466i2.add(62);
        c26466i2.addAll(set);
        f98768g = AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, c23465k6, c23465k7, c23465k8, c23465k9, c23465k10, c23465k11, c23465k12, c23465k13, c23465k14, c23465k15, new C23465k(74, AbstractC12350b.m34586g(c26466i2)), new C23465k(79, AbstractC12350b.m34570S(64)), new C23465k(82, AbstractC12350b.m34570S(66)), new C23465k(81, setM74059b1), new C23465k(83, AbstractC12350b.m34570S(67)));
    }

    public C25177v(Instant instant, Instant instant2, int i13, int i14) {
        this.f98769a = instant;
        this.f98770b = instant2;
        this.f98771c = i13;
        this.f98772d = i14;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("repetitions can not be negative.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final Instant m73701a() {
        return this.f98770b;
    }

    /* JADX INFO: renamed from: b */
    public final Instant m73702b() {
        return this.f98769a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public final boolean m73703c(int i13) {
        if (f98766e.contains(Integer.valueOf(i13))) {
            return true;
        }
        Set set = f98767f;
        int i14 = this.f98771c;
        if (set.contains(Integer.valueOf(i14))) {
            return true;
        }
        Set set2 = (Set) f98768g.get(Integer.valueOf(i13));
        if (set2 != null) {
            return set2.contains(Integer.valueOf(i14));
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25177v)) {
            return false;
        }
        C25177v c25177v = (C25177v) obj;
        return AbstractC22676k.m65745e(this.f98769a, c25177v.f98769a) && AbstractC22676k.m65745e(this.f98770b, c25177v.f98770b) && this.f98771c == c25177v.f98771c && this.f98772d == c25177v.f98772d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98772d) + AbstractC11266d.m30448b(this.f98771c, AbstractC21702c.m61131b(this.f98770b, this.f98769a.hashCode() * 31, 31), 31);
    }
}
