package c81;

import com.whoop.service.network.model.UserSessionDto;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import or2.AbstractC28145a1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c81.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Lc81/a;", "", "a", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4301a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: b */
    private static final C4307g f17421b;

    /* JADX INFO: renamed from: c */
    private static final C4307g f17422c;

    /* JADX INFO: renamed from: d */
    private static final C4307g f17423d;

    /* JADX INFO: renamed from: e */
    private static final C4307g f17424e;

    /* JADX INFO: renamed from: f */
    private static final C4307g f17425f;

    /* JADX INFO: renamed from: g */
    private static final C4307g f17426g;

    /* JADX INFO: renamed from: h */
    private static final C4307g f17427h;

    /* JADX INFO: renamed from: i */
    private static final C4307g f17428i;

    /* JADX INFO: renamed from: j */
    private static final C4307g f17429j;

    /* JADX INFO: renamed from: k */
    private static final List<C4305e> f17430k;

    /* JADX INFO: renamed from: l */
    private static final C4307g f17431l;

    /* JADX INFO: renamed from: m */
    private static final C4307g f17432m;

    /* JADX INFO: renamed from: n */
    private static final C4307g f17433n;

    /* JADX INFO: renamed from: o */
    private static final C4307g f17434o;

    /* JADX INFO: renamed from: p */
    private static final C4307g f17435p;

    /* JADX INFO: renamed from: c81.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, m65681d2 = {"Lc81/a$a;", "", "<init>", "()V", "", "currentValueIndex", "", "Lc81/e;", "f", "(I)Ljava/util/List;", "Lc81/g;", "realisticPaceOfAgingFixture", "Lc81/g;", "c", "()Lc81/g;", "realisticPaceOfAgingFixtureAnimation", "d", "realisticPaceOfAgingFixtureAnimationReversed", "e", "leftCurrentPaceOfAgingFixture", "a", "numberedPaceOfAgingFixture", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4307g m13548a() {
            return AbstractC4301a.f17426g;
        }

        /* JADX INFO: renamed from: b */
        public final C4307g m13549b() {
            return AbstractC4301a.f17431l;
        }

        /* JADX INFO: renamed from: c */
        public final C4307g m13550c() {
            return AbstractC4301a.f17421b;
        }

        /* JADX INFO: renamed from: d */
        public final C4307g m13551d() {
            return AbstractC4301a.f17422c;
        }

        /* JADX INFO: renamed from: e */
        public final C4307g m13552e() {
            return AbstractC4301a.f17423d;
        }

        /* JADX INFO: renamed from: f */
        public final List<C4305e> m13553f(int currentValueIndex) {
            String str;
            List listM118958J = AbstractC37056f.m118958J(new C4305e("-1.0x", "-1.0x", currentValueIndex == 0, currentValueIndex == 0 ? "CURRENT_VALUE" : "HIGHLIGHT"));
            ArrayList arrayList = new ArrayList(78);
            int i13 = 0;
            while (i13 < 78) {
                i13++;
                boolean z4 = i13 == currentValueIndex;
                if (z4) {
                    str = "CURRENT_VALUE";
                } else {
                    str = (i13 == 19 || i13 == 39 || i13 == 59) ? "HIGHLIGHT" : "NEUTRAL";
                }
                arrayList.add(new C4305e(String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(AbstractC28145a1.m85170f(i13 * 0.05f, 0.1f) - 1)}, 1)).concat("x"), i13 == 39 ? "1.0x" : null, z4, str));
            }
            return AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(listM118958J, arrayList), AbstractC37056f.m118958J(new C4305e("3.0x", "3.0x", currentValueIndex == 79, currentValueIndex == 79 ? "CURRENT_VALUE" : "HIGHLIGHT")));
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        List<C4305e> listM13553f = companion.m13553f(36);
        EnumC16313m0 enumC16313m0 = EnumC16313m0.SLOW_PACE_OF_AGING;
        EnumC16313m0 enumC16313m1 = EnumC16313m0.FAST_PACE_OF_AGING;
        C4307g c4307g = new C4307g(listM13553f, "Slow", enumC16313m0, "Fast", enumC16313m1, "PACE OF AGING", AbstractC28145a1.m85167c(55, 36), false, false, null, 896, null);
        f17421b = c4307g;
        f17422c = new C4307g(companion.m13553f(30), "Slow", enumC16313m0, "Fast", enumC16313m1, "PACE OF AGING", AbstractC28145a1.m85167c(39, 30), false, false, null, 768, null);
        f17423d = new C4307g(companion.m13553f(50), "Slow", enumC16313m0, "Fast", enumC16313m1, "PACE OF AGING", AbstractC28145a1.m85167c(39, 50), false, false, null, 768, null);
        f17424e = new C4307g(companion.m13553f(35), "Slow", enumC16313m0, "Fast", enumC16313m1, "PACE OF AGING", AbstractC28145a1.m85167c(25, 35), false, false, null, 768, null);
        f17425f = new C4307g(companion.m13553f(50), "Slow", enumC16313m0, "Fast", enumC16313m1, "PACE OF AGING", AbstractC28145a1.m85167c(35, 50), false, false, null, 768, null);
        f17426g = C4307g.m13579b(c4307g, companion.m13553f(9), null, null, null, null, null, AbstractC28145a1.m85167c(55, 9), false, false, null, 952, null);
        f17427h = new C4307g(C25271y.f99162w, null, null, null, null, null, AbstractC28145a1.m85167c(-1, -1), false, false, null, 896, null);
        f17428i = new C4307g(companion.m13553f(73), "Slow", enumC16313m0, "Fast", enumC16313m1, "PACE OF AGING", AbstractC28145a1.m85167c(71, 73), false, false, null, 896, null);
        f17429j = new C4307g(companion.m13553f(73), "Slow", enumC16313m0, "Fast", enumC16313m1, "PACE OF AGING", AbstractC28145a1.m85167c(73, 73), false, false, null, 896, null);
        List listM118958J = AbstractC37056f.m118958J(new C4305e(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, null, false, "HIGHLIGHT"));
        ArrayList arrayList = new ArrayList(78);
        for (int i13 = 0; i13 < 78; i13++) {
            int i14 = i13 + 2;
            arrayList.add(new C4305e(i14 % 5 == 0 ? String.valueOf(i14) : null, (i13 + 5) % 5 == 0 ? String.valueOf(i14) : null, false, "NEUTRAL"));
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(listM118958J, arrayList), AbstractC37056f.m118958J(new C4305e("80", null, true, "CURRENT_VALUE")));
        f17430k = arrayListM74129g1;
        f17431l = new C4307g(arrayListM74129g1, null, null, null, null, "PACE OF AGING", AbstractC28145a1.m85167c(0, 80), false, true, null, 640, null);
        C4307g c4307g2 = f17421b;
        Companion companion2 = INSTANCE;
        f17432m = C4307g.m13579b(c4307g2, companion2.m13553f(79), null, null, null, null, null, AbstractC28145a1.m85167c(55, 79), false, false, null, 958, null);
        f17433n = C4307g.m13579b(c4307g2, companion2.m13553f(0), null, null, null, null, null, AbstractC28145a1.m85167c(55, 0), false, false, null, 958, null);
        f17434o = C4307g.m13579b(c4307g2, companion2.m13553f(74), null, null, null, null, null, AbstractC28145a1.m85167c(50, 74), false, false, null, 958, null);
        f17435p = C4307g.m13579b(c4307g2, companion2.m13553f(5), null, null, null, null, null, AbstractC28145a1.m85167c(60, 5), false, false, null, 958, null);
    }
}
