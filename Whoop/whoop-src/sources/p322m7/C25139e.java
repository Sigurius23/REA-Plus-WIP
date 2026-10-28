package p322m7;

import g40.C15352f4;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import jh3.AbstractC21702c;
import l83.C23465k;
import m83.AbstractC25247g0;
import p336n7.C26413c;
import p452r7.C31019j0;
import p477s2.AbstractC32073e;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;

/* JADX INFO: renamed from: m7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C25139e implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: h */
    public static final Object f98556h;

    /* JADX INFO: renamed from: i */
    public static final LinkedHashMap f98557i;

    /* JADX INFO: renamed from: j */
    public static final Object f98558j;

    /* JADX INFO: renamed from: k */
    public static final LinkedHashMap f98559k;

    /* JADX INFO: renamed from: l */
    public static final C31019j0 f98560l;

    /* JADX INFO: renamed from: m */
    public static final C31019j0 f98561m;

    /* JADX INFO: renamed from: n */
    public static final C31019j0 f98562n;

    /* JADX INFO: renamed from: o */
    public static final C31019j0 f98563o;

    /* JADX INFO: renamed from: a */
    public final Instant f98564a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98565b;

    /* JADX INFO: renamed from: c */
    public final C31019j0 f98566c;

    /* JADX INFO: renamed from: d */
    public final C31019j0 f98567d;

    /* JADX INFO: renamed from: e */
    public final int f98568e;

    /* JADX INFO: renamed from: f */
    public final int f98569f;

    /* JADX INFO: renamed from: g */
    public final C26413c f98570g;

    static {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("left_upper_arm", 3), new C23465k("left_wrist", 1), new C23465k("right_upper_arm", 4), new C23465k("right_wrist", 2));
        f98556h = mapM73990Y;
        f98557i = AbstractC32073e.m99740d0(mapM73990Y);
        Map mapM73990Y2 = AbstractC25247g0.m73990Y(new C23465k("lying_down", 3), new C23465k("reclining", 4), new C23465k("sitting_down", 2), new C23465k("standing_up", 1));
        f98558j = mapM73990Y2;
        f98559k = AbstractC32073e.m99740d0(mapM73990Y2);
        f98560l = AbstractC32411b.m101062F(20);
        f98561m = AbstractC32411b.m101062F(200);
        f98562n = AbstractC32411b.m101062F(10);
        f98563o = AbstractC32411b.m101062F(180);
        AbstractC35902e.m113978q(2, "BloodPressure", "systolic", new C15352f4(22));
        AbstractC35902e.m113978q(3, "BloodPressure", "systolic", new C15352f4(24));
        AbstractC35902e.m113978q(4, "BloodPressure", "systolic", new C15352f4(23));
        AbstractC35902e.m113978q(2, "BloodPressure", "diastolic", new C15352f4(19));
        AbstractC35902e.m113978q(3, "BloodPressure", "diastolic", new C15352f4(21));
        AbstractC35902e.m113978q(4, "BloodPressure", "diastolic", new C15352f4(20));
    }

    public C25139e(Instant instant, ZoneOffset zoneOffset, C31019j0 c31019j0, C31019j0 c31019j1, int i13, int i14, C26413c c26413c) {
        this.f98564a = instant;
        this.f98565b = zoneOffset;
        this.f98566c = c31019j0;
        this.f98567d = c31019j1;
        this.f98568e = i13;
        this.f98569f = i14;
        this.f98570g = c26413c;
        AbstractC32073e.m99736b0(c31019j0, f98560l, "systolic");
        AbstractC32073e.m99738c0(c31019j0, f98561m, "systolic");
        AbstractC32073e.m99736b0(c31019j1, f98562n, "diastolic");
        AbstractC32073e.m99738c0(c31019j1, f98563o, "diastolic");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98570g;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98565b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25139e)) {
            return false;
        }
        C25139e c25139e = (C25139e) obj;
        return AbstractC22676k.m65745e(this.f98566c, c25139e.f98566c) && AbstractC22676k.m65745e(this.f98567d, c25139e.f98567d) && this.f98568e == c25139e.f98568e && this.f98569f == c25139e.f98569f && AbstractC22676k.m65745e(this.f98564a, c25139e.f98564a) && AbstractC22676k.m65745e(this.f98565b, c25139e.f98565b) && AbstractC22676k.m65745e(this.f98570g, c25139e.f98570g);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98564a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98564a, (((((this.f98567d.hashCode() + (this.f98566c.hashCode() * 31)) * 31) + this.f98568e) * 31) + this.f98569f) * 31, 31);
        ZoneOffset zoneOffset = this.f98565b;
        return this.f98570g.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
