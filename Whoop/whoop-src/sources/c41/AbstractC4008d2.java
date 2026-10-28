package c41;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.d2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"", "Lc41/e2;", "a", "Ljava/util/List;", "()Ljava/util/List;", "healthMonitorTileStates", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4008d2 {

    /* JADX INFO: renamed from: a */
    private static final List<C4015e2> f16297a;

    static {
        EnumC4022f2 enumC4022f2 = EnumC4022f2.POSITIVE;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("5/5 METRIC");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("WITHIN RANGE");
        C38072d c38072d = C38072d.f163053a;
        C4015e2 c4015e2 = new C4015e2(false, AbstractC2875y.m8290c(c38072d), textResourceM21278l, textResourceM21278l2, enumC4022f2, null, 33, null);
        EnumC4022f2 enumC4022f3 = EnumC4022f2.NEGATIVE;
        C4015e2 c4015e3 = new C4015e2(false, AbstractC18489d0.m53362c(c38072d), AbstractC8693b.m21278l("3/5 Metric"), AbstractC8693b.m21278l("WITHIN RANGE"), enumC4022f3, null, 33, null);
        EnumC4022f2 enumC4022f4 = EnumC4022f2.ALERT;
        f16297a = AbstractC37056f.m118959K(c4015e2, c4015e3, new C4015e2(false, AbstractC18489d0.m53362c(c38072d), AbstractC8693b.m21278l("RESPIRATORY RATE"), AbstractC8693b.m21278l("VERY ELEVATED"), enumC4022f4, null, 33, null), new C4015e2(false, AbstractC18489d0.m53362c(c38072d), AbstractC8693b.m21278l("RESPIRATORY RATE"), AbstractC8693b.m21278l("VERY ELEVATED"), enumC4022f4, EnumC39333f.ACCENT_ALERT_TREND_15, 1, null), new C4015e2(false, 0, AbstractC8693b.m21278l("DATA UNAVAILABLE"), null, null, null, 58, null));
    }

    /* JADX INFO: renamed from: a */
    public static final List<C4015e2> m12154a() {
        return f16297a;
    }
}
