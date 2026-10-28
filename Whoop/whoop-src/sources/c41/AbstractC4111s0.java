package c41;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.s0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"", "Lc41/t0;", "a", "Ljava/util/List;", "()Ljava/util/List;", "coachingCtaTileStates", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4111s0 {

    /* JADX INFO: renamed from: a */
    private static final List<C4118t0> f16683a;

    static {
        C38072d c38072d = C38072d.f163053a;
        C4118t0 c4118t0 = new C4118t0(null, null, new AbstractC4125u0.d(AbstractC25012a.m73365A(c38072d), AbstractC8693b.m21278l("LOW RECOVERY WITH GOOD SLEEP?"), AbstractC8693b.m21278l("Learn why your Recovery is in the RED, although your Sleep Performance is above 85%.")), null, 11, null);
        C4118t0 c4118t1 = new C4118t0(null, null, new AbstractC4125u0.b(c38072d.m121951d().getAction().getCustomize(), null, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("In The Green"), AbstractC8693b.m21278l("CHARGE YOUR WHOOP\nFOR 8:00 WAKEUP"), false, 34, null), null, 11, null);
        C4118t0 c4118t2 = new C4118t0(null, null, new AbstractC4125u0.b(c38072d.m121951d().getAction().getCustomize(), null, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("100% Sleep Needed"), AbstractC8693b.m21278l("CHARGE YOUR WHOOP\nFOR 8:00 WAKEUP"), false, 34, null), null, 11, null);
        C4118t0 c4118t3 = new C4118t0(null, null, new AbstractC4125u0.e(c38072d.m121951d().getStrap().getStrap(), EnumC39333f.BRAND_WHITE, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("8:00am"), AbstractC8693b.m21278l("PLAN YOUR\nBEDTIME")), null, 11, null);
        int goals = c38072d.m121951d().getVarious().getGoals();
        EnumC39333f enumC39333f = EnumC39333f.WHITE_50;
        C4118t0 c4118t4 = new C4118t0(null, null, new AbstractC4125u0.e(goals, enumC39333f, AbstractC8693b.m21278l("STRAIN COACH"), null, AbstractC8693b.m21278l("START ACTIVITY"), 8, null), null, 11, null);
        C4118t0 c4118t5 = new C4118t0(null, null, new AbstractC4125u0.e(AbstractC25012a.m73369b(c38072d), EnumC39333f.RECOVERY_HIGH_RECOVERY, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("In The Green (8:00am)"), AbstractC8693b.m21278l("PLAN YOUR\nBEDTIME")), null, 11, null);
        int customize = c38072d.m121951d().getAction().getCustomize();
        EnumC39333f enumC39333f2 = EnumC39333f.BLACK_30;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Enable Your Journal");
        EnumC39333f enumC39333f3 = EnumC39333f.BRAND_BLACK;
        f16683a = AbstractC37056f.m118959K(c4118t0, c4118t1, c4118t2, c4118t3, c4118t4, c4118t5, new C4118t0(null, null, new AbstractC4125u0.c(customize, textResourceM21278l, AbstractC8693b.m21278l("Enable your journal to start tracking behaviors and see your recovery impacts"), enumC39333f2, enumC39333f3, enumC39333f3), null, 11, null), new C4118t0(null, null, new AbstractC4125u0.a(c38072d.m121951d().getVarious().getGoals(), enumC39333f, AbstractC8693b.m21278l("STRAIN COACH"), null, AbstractC8693b.m21278l("START ACTIVITY"), 8, null), null, 11, null));
    }

    /* JADX INFO: renamed from: a */
    public static final List<C4118t0> m12669a() {
        return f16683a;
    }
}
