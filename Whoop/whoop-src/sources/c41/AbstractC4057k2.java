package c41;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import java.util.List;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c41.k2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0003¨\u0006\b"}, m65681d2 = {"Lc41/l2;", "a", "Lc41/l2;", "()Lc41/l2;", "horizontalMetricTileSampleViewState", "b", "getHorizontalMetricTileLongLabelsViewState", "horizontalMetricTileLongLabelsViewState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4057k2 {

    /* JADX INFO: renamed from: a */
    private static final C4064l2 f16488a;

    /* JADX INFO: renamed from: b */
    private static final C4064l2 f16489b;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("HEALTH MONITOR");
        EnumC16313m0 enumC16313m0 = EnumC16313m0.RESPIRATORY_RATE;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("RESP");
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_CHECKMARK;
        EnumC4142w3 enumC4142w3 = EnumC4142w3.OK;
        C4079n3 c4079n3 = new C4079n3(textResourceM21278l2, enumC16313m0, enumC16313m1, enumC4142w3);
        EnumC16313m0 enumC16313m2 = EnumC16313m0.BLOOD_OXYGEN;
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("SPO2");
        EnumC16313m0 enumC16313m3 = EnumC16313m0.TINY_ATTENTION;
        EnumC4142w3 enumC4142w4 = EnumC4142w3.WARNING;
        C4079n3 c4079n4 = new C4079n3(textResourceM21278l3, enumC16313m2, enumC16313m3, enumC4142w4);
        EnumC16313m0 enumC16313m4 = EnumC16313m0.RHR;
        C4079n3 c4079n5 = new C4079n3(AbstractC8693b.m21278l("RHR"), enumC16313m4, enumC16313m3, enumC4142w4);
        EnumC16313m0 enumC16313m5 = EnumC16313m0.HRV;
        C4079n3 c4079n6 = new C4079n3(AbstractC8693b.m21278l("HRV"), enumC16313m5, enumC16313m1, enumC4142w3);
        EnumC16313m0 enumC16313m6 = EnumC16313m0.SKIN_TEMPERATURE;
        List listM118959K = AbstractC37056f.m118959K(c4079n3, c4079n4, c4079n5, c4079n6, new C4079n3(AbstractC8693b.m21278l("TEMP"), enumC16313m6, enumC16313m3, EnumC4142w3.ALERT), new C4079n3(AbstractC8693b.m21278l("BP"), EnumC16313m0.SAGE, enumC16313m3, enumC4142w4));
        EnumC16313m0 enumC16313m7 = EnumC16313m0.CARET_FORWARD;
        f16488a = new C4064l2(textResourceM21278l, enumC16313m7, listM118959K, new C4036h2(AbstractC8693b.m21278l("2/6 Metrics within Range"), AbstractC8693b.m21278l("Needs 7 Recoveries"), enumC16313m3, enumC4142w4), null, null, 48, null);
        f16489b = new C4064l2(AbstractC8693b.m21278l("HEALTH MONITOR"), enumC16313m7, AbstractC37056f.m118959K(new C4079n3(AbstractC8693b.m21278l("Respiratory Rate"), enumC16313m0, enumC16313m1, enumC4142w3), new C4079n3(AbstractC8693b.m21278l("Blood Oxygen SPO2"), enumC16313m2, enumC16313m1, enumC4142w3), new C4079n3(AbstractC8693b.m21278l("Resting Heart Rate (RHR)"), enumC16313m4, enumC16313m1, enumC4142w3), new C4079n3(AbstractC8693b.m21278l("Heart Rate Variability (HRV)"), enumC16313m5, enumC16313m1, enumC4142w3), new C4079n3(AbstractC8693b.m21278l("Skin Temperature"), enumC16313m6, enumC16313m1, enumC4142w3)), new C4036h2(AbstractC8693b.m21278l("5/5 Metrics within Range"), AbstractC8693b.m21278l(""), enumC16313m1, enumC4142w3), null, null, 32, null);
    }

    /* JADX INFO: renamed from: a */
    public static final C4064l2 m12400a() {
        return f16488a;
    }
}
