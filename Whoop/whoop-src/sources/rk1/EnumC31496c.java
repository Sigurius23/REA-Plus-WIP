package rk1;

import ge3.AbstractC15751g;
import i93.C18284j;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pk1.AbstractC29335a;
import sk1.C32573b;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SinusRhythm' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: rk1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bBC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019j\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, m65681d2 = {"Lrk1/c;", "", "", "id", "analyticsId", "", "displayTitle", "displayBody", "checkResult", "", "Lsk1/b;", "determinations", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getAnalyticsId", "I", "getDisplayTitle", "()I", "getDisplayBody", "getCheckResult", "Ljava/util/List;", "getDeterminations", "()Ljava/util/List;", "Companion", "a", "SinusRhythm", "Unreadable", "LowHeartRate", "Shepherd", "HighHeartRate", "Inconclusive", "ShepherdHighHeartRate", "HighHeartRateNoShepherdDetected", "heart-health-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC31496c {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC31496c[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EnumC31496c HighHeartRate;
    public static final EnumC31496c HighHeartRateNoShepherdDetected;
    public static final EnumC31496c Inconclusive;
    public static final EnumC31496c LowHeartRate;
    public static final EnumC31496c Shepherd;
    public static final EnumC31496c ShepherdHighHeartRate;
    public static final EnumC31496c SinusRhythm;
    public static final EnumC31496c Unreadable;
    private final String analyticsId;
    private final int checkResult;
    private final List<C32573b> determinations;
    private final int displayBody;
    private final int displayTitle;
    private final String id;

    /* JADX INFO: renamed from: rk1.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lrk1/c$a;", "", "<init>", "()V", "", "checkResult", "Lrk1/c;", "a", "(I)Lrk1/c;", "averageHeartRate", "b", "(II)Lrk1/c;", "heart-health-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC31496c m97036a(int checkResult) {
            for (EnumC31496c enumC31496c : EnumC31496c.values()) {
                if (enumC31496c.getCheckResult() == checkResult) {
                    if (enumC31496c == null) {
                        return EnumC31496c.Inconclusive;
                    }
                    return enumC31496c;
                }
            }
            enumC31496c = null;
            if (enumC31496c == null) {
                return EnumC31496c.Inconclusive;
            }
            return enumC31496c;
        }

        /* JADX INFO: renamed from: b */
        public final EnumC31496c m97037b(int checkResult, int averageHeartRate) {
            switch (checkResult) {
                case 0:
                case 2:
                    return EnumC31496c.Unreadable;
                case 1:
                    return new C18284j(51, 99, 1).m52655e(averageHeartRate) ? EnumC31496c.SinusRhythm : EnumC31496c.Unreadable;
                case 3:
                    return averageHeartRate <= 50 ? EnumC31496c.LowHeartRate : EnumC31496c.Unreadable;
                case 4:
                    if (new C18284j(51, 99, 1).m52655e(averageHeartRate)) {
                        return EnumC31496c.Shepherd;
                    }
                    if (new C18284j(100, 150, 1).m52655e(averageHeartRate)) {
                        return EnumC31496c.ShepherdHighHeartRate;
                    }
                    return new C18284j(151, 200, 1).m52655e(averageHeartRate) ? EnumC31496c.HighHeartRate : EnumC31496c.Unreadable;
                case 5:
                    if (new C18284j(100, 150, 1).m52655e(averageHeartRate)) {
                        return EnumC31496c.HighHeartRateNoShepherdDetected;
                    }
                    return new C18284j(151, 200, 1).m52655e(averageHeartRate) ? EnumC31496c.HighHeartRate : EnumC31496c.Unreadable;
                case 6:
                    return EnumC31496c.Inconclusive;
                default:
                    return EnumC31496c.Unreadable;
            }
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EnumC31496c[] $values() {
        return new EnumC31496c[]{SinusRhythm, Unreadable, LowHeartRate, Shepherd, HighHeartRate, Inconclusive, ShepherdHighHeartRate, HighHeartRateNoShepherdDetected};
    }

    static {
        int i13 = AbstractC29335a.f118847s;
        int i14 = AbstractC29335a.f118838j;
        C31494a c31494a = C31494a.f129909a;
        SinusRhythm = new EnumC31496c("SinusRhythm", 0, "SINUS_RHYTHM", "normal_sinus_rhythm", i13, i14, 1, AbstractC37056f.m118959K(c31494a.m97029i(), c31494a.m97022b(), c31494a.m97025e(), c31494a.m97026f()));
        Unreadable = new EnumC31496c("Unreadable", 1, "UNREADABLE", "unreadable", AbstractC29335a.f118828A, AbstractC29335a.f118841m, 0, AbstractC37056f.m118958J(c31494a.m97032l()));
        LowHeartRate = new EnumC31496c("LowHeartRate", 2, "LOW_HEART_RATE", "low_heart_rate", AbstractC29335a.f118844p, AbstractC29335a.f118836h, 2, AbstractC37056f.m118959K(c31494a.m97031k(), c31494a.m97024d(), c31494a.m97026f()));
        Shepherd = new EnumC31496c("Shepherd", 3, "AFIB", "possible_afib", AbstractC29335a.f118849u, AbstractC29335a.f118840l, 3, AbstractC37056f.m118959K(c31494a.m97028h(), c31494a.m97022b(), c31494a.m97025e(), c31494a.m97027g()));
        HighHeartRate = new EnumC31496c("HighHeartRate", 4, "HIGH_HEART_RATE", "high_heart_rate", AbstractC29335a.f118831c, AbstractC29335a.f118834f, 4, AbstractC37056f.m118959K(c31494a.m97030j(), c31494a.m97021a(), c31494a.m97027g()));
        Inconclusive = new EnumC31496c("Inconclusive", 5, "INCONCLUSIVE", "inconclusive", AbstractC29335a.f118833e, AbstractC29335a.f118835g, 5, AbstractC37056f.m118959K(c31494a.m97029i(), c31494a.m97022b(), c31494a.m97025e(), c31494a.m97027g(), c31494a.m97023c()));
        ShepherdHighHeartRate = new EnumC31496c("ShepherdHighHeartRate", 6, "AFIB_HIGH_HEART_RATE", "high_heart_rate_afib", AbstractC29335a.f118848t, AbstractC29335a.f118839k, 6, AbstractC37056f.m118959K(c31494a.m97028h(), c31494a.m97021a(), c31494a.m97027g()));
        HighHeartRateNoShepherdDetected = new EnumC31496c("HighHeartRateNoShepherdDetected", 7, "HIGH_HEART_RATE_NO_AFIB_DETECTED", "high_heart_rate", AbstractC29335a.f118831c, AbstractC29335a.f118837i, 7, AbstractC37056f.m118959K(c31494a.m97029i(), c31494a.m97021a(), c31494a.m97027g()));
        EnumC31496c[] enumC31496cArr$values = $values();
        $VALUES = enumC31496cArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC31496cArr$values);
        INSTANCE = new Companion(null);
    }

    private EnumC31496c(String str, int i13, String str2, String str3, int i14, int i15, int i16, List list) {
        super(str, i13);
        this.id = str2;
        this.analyticsId = str3;
        this.displayTitle = i14;
        this.displayBody = i15;
        this.checkResult = i16;
        this.determinations = list;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC31496c valueOf(String str) {
        return (EnumC31496c) Enum.valueOf(EnumC31496c.class, str);
    }

    public static EnumC31496c[] values() {
        return (EnumC31496c[]) $VALUES.clone();
    }

    public final String getAnalyticsId() {
        return this.analyticsId;
    }

    public final int getCheckResult() {
        return this.checkResult;
    }

    public final List<C32573b> getDeterminations() {
        return this.determinations;
    }

    public final int getDisplayBody() {
        return this.displayBody;
    }

    public final int getDisplayTitle() {
        return this.displayTitle;
    }

    public final String getId() {
        return this.id;
    }
}
