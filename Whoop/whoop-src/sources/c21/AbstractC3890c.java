package c21;

import androidx.compose.runtime.Composer;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "Lc21/d;", "a", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3890c {
    /* JADX INFO: renamed from: a */
    public static final List<C3891d> m11880a(Composer composer, int i13) {
        C38072d c38072d = C38072d.f163053a;
        int respiratoryRate = c38072d.m121951d().getRecovery().getRespiratoryRate();
        int iM8290c = AbstractC2875y.m8290c(c38072d);
        EnumC39333f enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
        EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_POSITIVE_TREND_15;
        C3892e c3892e = new C3892e(respiratoryRate, "RESP.", iM8290c, enumC39333f, enumC39333f2);
        int bloodOxygen = c38072d.m121951d().getVarious().getBloodOxygen();
        int iM53362c = AbstractC18489d0.m53362c(c38072d);
        EnumC39333f enumC39333f3 = EnumC39333f.ACCENT_NEGATIVE_TREND;
        EnumC39333f enumC39333f4 = EnumC39333f.ACCENT_NEGATIVE_TREND_15;
        C3892e c3892e2 = new C3892e(bloodOxygen, "SPO2", iM53362c, enumC39333f3, enumC39333f4);
        int rhr = c38072d.m121951d().getRecovery().getRhr();
        int iM53362c2 = AbstractC18489d0.m53362c(c38072d);
        EnumC39333f enumC39333f5 = EnumC39333f.ACCENT_ALERT;
        EnumC39333f enumC39333f6 = EnumC39333f.ACCENT_ALERT_TREND_15;
        C3892e c3892e3 = new C3892e(rhr, "RHR", iM53362c2, enumC39333f5, enumC39333f6);
        C3892e c3892e4 = new C3892e(c38072d.m121951d().getRecovery().getHrvOutline(), "HRV", AbstractC2875y.m8290c(c38072d), enumC39333f, enumC39333f2);
        int maxHeartRate = c38072d.m121951d().getRecovery().getMaxHeartRate();
        int triangleUp = c38072d.m121951d().getTinyIcons().getTriangleUp();
        EnumC39333f enumC39333f7 = EnumC39333f.BRAND_WHITE;
        EnumC39333f enumC39333f8 = EnumC39333f.WHITE_10;
        return AbstractC37056f.m118959K(new C3891d("HEALTH MONITOR", AbstractC37056f.m118959K(c3892e, c3892e2, c3892e3, c3892e4, new C3892e(maxHeartRate, "MAX", triangleUp, enumC39333f7, enumC39333f8)), null), new C3891d("HEALTH MONITOR", AbstractC37056f.m118959K(new C3892e(c38072d.m121951d().getRecovery().getRespiratoryRate(), "RESP.", AbstractC2875y.m8290c(c38072d), enumC39333f, enumC39333f2), new C3892e(c38072d.m121951d().getVarious().getBloodOxygen(), "SPO2", AbstractC18489d0.m53362c(c38072d), enumC39333f3, enumC39333f4), new C3892e(c38072d.m121951d().getRecovery().getRhr(), "RHR", AbstractC18489d0.m53362c(c38072d), enumC39333f5, enumC39333f6), new C3892e(c38072d.m121951d().getRecovery().getHrvOutline(), "HRV", AbstractC2875y.m8290c(c38072d), enumC39333f, enumC39333f2), new C3892e(c38072d.m121951d().getRecovery().getMaxHeartRate(), "MAX", c38072d.m121951d().getTinyIcons().getTriangleUp(), enumC39333f7, enumC39333f8)), new C9598e(null, null, null, 7, null)));
    }
}
