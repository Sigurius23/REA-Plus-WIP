package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh3.AbstractC21702c;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p318m3.C24977g;
import p336n7.C26413c;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m7.w */
/* JADX INFO: loaded from: classes.dex */
public final class C25179w implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: l */
    public static final Object f98779l;

    /* JADX INFO: renamed from: m */
    public static final LinkedHashMap f98780m;

    /* JADX INFO: renamed from: a */
    public final Instant f98781a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98782b;

    /* JADX INFO: renamed from: c */
    public final Instant f98783c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98784d;

    /* JADX INFO: renamed from: e */
    public final int f98785e;

    /* JADX INFO: renamed from: f */
    public final String f98786f;

    /* JADX INFO: renamed from: g */
    public final String f98787g;

    /* JADX INFO: renamed from: h */
    public final C26413c f98788h;

    /* JADX INFO: renamed from: i */
    public final List f98789i;

    /* JADX INFO: renamed from: j */
    public final List f98790j;

    /* JADX INFO: renamed from: k */
    public final AbstractC22674j f98791k;

    static {
        AbstractC35902e.m113980t();
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("back_extension", 13), new C23465k("badminton", 2), new C23465k("barbell_shoulder_press", 70), new C23465k("baseball", 4), new C23465k("basketball", 5), new C23465k("bench_press", 70), new C23465k("bench_sit_up", 13), new C23465k("biking", 8), new C23465k("biking_stationary", 9), new C23465k("boot_camp", 10), new C23465k("boxing", 11), new C23465k("burpee", 13), new C23465k("cricket", 14), new C23465k("crunch", 13), new C23465k("dancing", 16), new C23465k("deadlift", 70), new C23465k("dumbbell_curl_left_arm", 70), new C23465k("dumbbell_curl_right_arm", 70), new C23465k("dumbbell_front_raise", 70), new C23465k("dumbbell_lateral_raise", 70), new C23465k("dumbbell_triceps_extension_left_arm", 70), new C23465k("dumbbell_triceps_extension_right_arm", 70), new C23465k("dumbbell_triceps_extension_two_arm", 70), new C23465k("elliptical", 25), new C23465k("exercise_class", 26), new C23465k("fencing", 27), new C23465k("football_american", 28), new C23465k("football_australian", 29), new C23465k("forward_twist", 13), new C23465k("frisbee_disc", 31), new C23465k("golf", 32), new C23465k("guided_breathing", 33), new C23465k("gymnastics", 34), new C23465k("handball", 35), new C23465k("hiking", 37), new C23465k("ice_hockey", 38), new C23465k("ice_skating", 39), new C23465k("jumping_jack", 36), new C23465k("jump_rope", 36), new C23465k("lat_pull_down", 70), new C23465k("lunge", 13), new C23465k("martial_arts", 44), new C23465k("paddling", 46), new C23465k("para_gliding", 47), new C23465k("pilates", 48), new C23465k("plank", 13), new C23465k("racquetball", 50), new C23465k("rock_climbing", 51), new C23465k("roller_hockey", 52), new C23465k("rowing", 53), new C23465k("rowing_machine", 54), new C23465k("rugby", 55), new C23465k("running", 56), new C23465k("running_treadmill", 57), new C23465k("sailing", 58), new C23465k("scuba_diving", 59), new C23465k("skating", 60), new C23465k("skiing", 61), new C23465k("snowboarding", 62), new C23465k("snowshoeing", 63), new C23465k("soccer", 64), new C23465k("softball", 65), new C23465k("squash", 66), new C23465k("squat", 13), new C23465k("stair_climbing", 68), new C23465k("stair_climbing_machine", 69), new C23465k("stretching", 71), new C23465k("surfing", 72), new C23465k("swimming_open_water", 73), new C23465k("swimming_pool", 74), new C23465k("table_tennis", 75), new C23465k("tennis", 76), new C23465k("upper_twist", 13), new C23465k("volleyball", 78), new C23465k("walking", 79), new C23465k("water_polo", 80), new C23465k("weightlifting", 81), new C23465k("wheelchair", 82), new C23465k("workout", 0), new C23465k("yoga", 83), new C23465k("calisthenics", 13), new C23465k("high_intensity_interval_training", 36), new C23465k("strength_training", 70));
        f98779l = mapM73990Y;
        Set<Map.Entry> setEntrySet = mapM73990Y.entrySet();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        f98780m = linkedHashMap;
    }

    public C25179w(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, int i13, String str, String str2, C26413c c26413c, List list, List list2, AbstractC22674j abstractC22674j) {
        this.f98781a = instant;
        this.f98782b = zoneOffset;
        this.f98783c = instant2;
        this.f98784d = zoneOffset2;
        this.f98785e = i13;
        this.f98786f = str;
        this.f98787g = str2;
        this.f98788h = c26413c;
        this.f98789i = list;
        this.f98790j = list2;
        this.f98791k = abstractC22674j;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        int i14 = 0;
        if (!list.isEmpty()) {
            List listM74152u1 = AbstractC25265s.m74152u1(list, new C24977g(1));
            int iM118951C = AbstractC37056f.m118951C(listM74152u1);
            int i15 = 0;
            while (i15 < iM118951C) {
                Instant instantM73701a = ((C25177v) listM74152u1.get(i15)).m73701a();
                i15++;
                if (instantM73701a.isAfter(((C25177v) listM74152u1.get(i15)).m73702b())) {
                    throw new IllegalArgumentException("segments can not overlap.");
                }
            }
            if (((C25177v) AbstractC25265s.m74096F0(listM74152u1)).m73702b().isBefore(this.f98781a)) {
                throw new IllegalArgumentException("segments can not be out of parent time range.");
            }
            if (((C25177v) AbstractC25265s.m74112P0(listM74152u1)).m73701a().isAfter(this.f98783c)) {
                throw new IllegalArgumentException("segments can not be out of parent time range.");
            }
            Iterator it = listM74152u1.iterator();
            while (it.hasNext()) {
                if (!((C25177v) it.next()).m73703c(this.f98785e)) {
                    throw new IllegalArgumentException("segmentType and sessionType is not compatible.");
                }
            }
        }
        if (!this.f98790j.isEmpty()) {
            List listM74152u2 = AbstractC25265s.m74152u1(this.f98790j, new C24977g(2));
            int iM118951C2 = AbstractC37056f.m118951C(listM74152u2);
            while (i14 < iM118951C2) {
                Instant instantM73697a = ((C25165p) listM74152u2.get(i14)).m73697a();
                i14++;
                if (instantM73697a.isAfter(((C25165p) listM74152u2.get(i14)).m73698b())) {
                    throw new IllegalArgumentException("laps can not overlap.");
                }
            }
            if (((C25165p) AbstractC25265s.m74096F0(listM74152u2)).m73698b().isBefore(this.f98781a)) {
                throw new IllegalArgumentException("laps can not be out of parent time range.");
            }
            if (((C25165p) AbstractC25265s.m74112P0(listM74152u2)).m73697a().isAfter(this.f98783c)) {
                throw new IllegalArgumentException("laps can not be out of parent time range.");
            }
        }
        AbstractC22674j abstractC22674j2 = this.f98791k;
        if ((abstractC22674j2 instanceof C25173t) && !((C25173t) abstractC22674j2).m73700W().m73699a(this.f98781a, this.f98783c)) {
            throw new IllegalArgumentException("route can not be out of parent time range.");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98782b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98788h;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98783c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25179w)) {
            return false;
        }
        C25179w c25179w = (C25179w) obj;
        return this.f98785e == c25179w.f98785e && AbstractC22676k.m65745e(this.f98786f, c25179w.f98786f) && AbstractC22676k.m65745e(this.f98787g, c25179w.f98787g) && AbstractC22676k.m65745e(this.f98781a, c25179w.f98781a) && AbstractC22676k.m65745e(this.f98782b, c25179w.f98782b) && AbstractC22676k.m65745e(this.f98783c, c25179w.f98783c) && AbstractC22676k.m65745e(this.f98784d, c25179w.f98784d) && AbstractC22676k.m65745e(this.f98788h, c25179w.f98788h) && AbstractC22676k.m65745e(this.f98789i, c25179w.f98789i) && AbstractC22676k.m65745e(this.f98790j, c25179w.f98790j) && AbstractC22676k.m65745e(this.f98791k, c25179w.f98791k);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98784d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98781a;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f98785e) * 31;
        String str = this.f98786f;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f98787g;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ZoneOffset zoneOffset = this.f98782b;
        int iM61131b = AbstractC21702c.m61131b(this.f98783c, (iHashCode3 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98784d;
        return this.f98791k.hashCode() + ((this.f98788h.hashCode() + ((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31)) * 31);
    }
}
