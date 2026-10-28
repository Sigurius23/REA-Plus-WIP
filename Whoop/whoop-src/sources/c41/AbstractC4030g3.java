package c41;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import hy0.C17750h1;
import hy0.EnumC17775o1;
import java.util.List;
import ny0.C27273p0;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: c41.g3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\u0001\u0010\u0004\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lc41/h3;", "a", "Lc41/h3;", "b", "()Lc41/h3;", "metricStatusTileWithDataSample", "metricStatusTileNoDataSample", "", "c", "Ljava/util/List;", "getListOfMetricStatusTileSamples", "()Ljava/util/List;", "listOfMetricStatusTileSamples", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4030g3 {

    /* JADX INFO: renamed from: a */
    private static final C4037h3 f16368a;

    /* JADX INFO: renamed from: b */
    private static final C4037h3 f16369b;

    /* JADX INFO: renamed from: c */
    private static final List<C4037h3> f16370c;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Blood Pressure");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Aug 12, 2026");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("134/98");
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("mmHg");
        TextResource textResourceM21267a = AbstractC8693b.m21267a();
        C38072d c38072d = C38072d.f163053a;
        C4037h3 c4037h3 = new C4037h3(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, new C17750h1(textResourceM21267a, new C39274g(AbstractC2875y.m8290c(c38072d), null, 2, null), EnumC39333f.ACCENT_POSITIVE_TREND_15, null, EnumC39333f.ACCENT_POSITIVE_TREND, null, null, EnumC17775o1.SYMPTOMS, false, AbstractC33253j.m105489e(2 * 4), 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4193640, null), new C27273p0(AbstractC8693b.m21278l("Update Readings"), new C9598e(null, null, null, 7, null), new C39274g(AbstractC25012a.m73365A(c38072d), null, 2, null), null, null, null, false, null, null, null, null, false, null, false, 16376, null), null, 64, null);
        f16368a = c4037h3;
        C4037h3 c4037h4 = new C4037h3(AbstractC8693b.m21278l("Blood Pressure"), null, null, null, null, new C27273p0(AbstractC8693b.m21278l("Update"), new C9598e(null, null, null, 7, null), null, null, null, null, false, null, null, null, null, false, null, false, 16380, null), null, 94, null);
        f16369b = c4037h4;
        f16370c = AbstractC37056f.m118959K(c4037h3, C4037h3.m12297b(c4037h3, AbstractC8693b.m21278l("Weight"), AbstractC8693b.m21278l("Today"), AbstractC8693b.m21278l("170"), AbstractC8693b.m21278l("lbs"), null, null, null, 112, null), c4037h4);
    }

    /* JADX INFO: renamed from: a */
    public static final C4037h3 m12279a() {
        return f16369b;
    }

    /* JADX INFO: renamed from: b */
    public static final C4037h3 m12280b() {
        return f16368a;
    }
}
