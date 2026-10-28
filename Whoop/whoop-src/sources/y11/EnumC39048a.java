package y11;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import ge3.AbstractC15751g;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p390p1.C28655q;
import p715kotlin.Metadata;
import r80.AbstractC31061c;
import t83.InterfaceC33616a;
import x81.C38072d;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BRAND_WHITE' uses external variables
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
/* JADX INFO: renamed from: y11.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, m65681d2 = {"Ly11/a;", "", "", "rgb", "highlightRgb", "<init>", "(Ljava/lang/String;III)V", "Li2/x;", "toComposableColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "toComposableColor", "I", "getRgb", "()I", "getHighlightRgb", "AWAKE_SLEEP", "LIGHT_SLEEP", "SWS_SLEEP", "REM", "BRAND_WHITE", "GREY_L1", "MAX", "HARD", "MODERATE", "LIGHT", "VERY_LIGHT", "RESTORATIVE", "SLEEP_HEART_RATE", "UNSELECTED", "HIGH_STRESS", "MEDIUM_STRESS", "LOW_STRESS", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC39048a {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC39048a[] $VALUES;
    public static final EnumC39048a BRAND_WHITE;
    public static final EnumC39048a GREY_L1;
    public static final EnumC39048a HARD;
    public static final EnumC39048a HIGH_STRESS;
    public static final EnumC39048a LIGHT;
    public static final EnumC39048a LOW_STRESS;
    public static final EnumC39048a MAX;
    public static final EnumC39048a MEDIUM_STRESS;
    public static final EnumC39048a MODERATE;
    public static final EnumC39048a RESTORATIVE;
    public static final EnumC39048a SLEEP_HEART_RATE;
    public static final EnumC39048a UNSELECTED;
    public static final EnumC39048a VERY_LIGHT;
    private final int highlightRgb;
    private final int rgb;
    public static final EnumC39048a AWAKE_SLEEP = new EnumC39048a("AWAKE_SLEEP", 0, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4291348680L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1305004232)));
    public static final EnumC39048a LIGHT_SLEEP = new EnumC39048a("LIGHT_SLEEP", 1, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4288979953L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1302635505)));
    public static final EnumC39048a SWS_SLEEP = new EnumC39048a("SWS_SLEEP", 2, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4294612474L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1308268026)));
    public static final EnumC39048a REM = new EnumC39048a("REM", 3, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4289485549L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1303141101)));

    /* JADX INFO: renamed from: y11.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f168032a;

        static {
            int[] iArr = new int[EnumC39048a.values().length];
            try {
                iArr[EnumC39048a.AWAKE_SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC39048a.LIGHT_SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC39048a.SWS_SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC39048a.REM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC39048a.BRAND_WHITE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC39048a.GREY_L1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC39048a.UNSELECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC39048a.MAX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC39048a.HARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC39048a.MODERATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC39048a.LIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC39048a.VERY_LIGHT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC39048a.RESTORATIVE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC39048a.SLEEP_HEART_RATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC39048a.HIGH_STRESS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC39048a.MEDIUM_STRESS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC39048a.LOW_STRESS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f168032a = iArr;
        }
    }

    private static final /* synthetic */ EnumC39048a[] $values() {
        return new EnumC39048a[]{AWAKE_SLEEP, LIGHT_SLEEP, SWS_SLEEP, REM, BRAND_WHITE, GREY_L1, MAX, HARD, MODERATE, LIGHT, VERY_LIGHT, RESTORATIVE, SLEEP_HEART_RATE, UNSELECTED, HIGH_STRESS, MEDIUM_STRESS, LOW_STRESS};
    }

    static {
        long j7 = C17919x.f69629f;
        BRAND_WHITE = new EnumC39048a("BRAND_WHITE", 4, AbstractC17918w0.m51506H(j7), AbstractC17918w0.m51506H(j7));
        GREY_L1 = new EnumC39048a("GREY_L1", 5, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4288059030L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4288059030L)));
        MAX = new EnumC39048a("MAX", 6, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4294927394L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1308582946)));
        HARD = new EnumC39048a("HARD", 7, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4294749277L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1308404829)));
        MODERATE = new EnumC39048a("MODERATE", 8, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4284070294L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1297725846)));
        LIGHT = new EnumC39048a("LIGHT", 9, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4282882754L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1296538306)));
        VERY_LIGHT = new EnumC39048a("VERY_LIGHT", 10, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4289577677L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1303233229)));
        RESTORATIVE = new EnumC39048a("RESTORATIVE", 11, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4294967295L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1308622847)));
        SLEEP_HEART_RATE = new EnumC39048a("SLEEP_HEART_RATE", 12, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4286292411L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1299947963)));
        UNSELECTED = new EnumC39048a("UNSELECTED", 13, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4286292411L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(1299947963)));
        HIGH_STRESS = new EnumC39048a("HIGH_STRESS", 14, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4294944546L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(654288674)));
        MEDIUM_STRESS = new EnumC39048a("MEDIUM_STRESS", 15, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4278251935L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(637596063)));
        LOW_STRESS = new EnumC39048a("LOW_STRESS", 16, AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4284985062L)), AbstractC17918w0.m51506H(AbstractC17918w0.m51515c(443002598)));
        EnumC39048a[] enumC39048aArr$values = $values();
        $VALUES = enumC39048aArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC39048aArr$values);
    }

    private EnumC39048a(String str, int i13, int i14, int i15) {
        super(str, i13);
        this.rgb = i14;
        this.highlightRgb = i15;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC39048a valueOf(String str) {
        return (EnumC39048a) Enum.valueOf(EnumC39048a.class, str);
    }

    public static EnumC39048a[] values() {
        return (EnumC39048a[]) $VALUES.clone();
    }

    public final int getHighlightRgb() {
        return this.highlightRgb;
    }

    public final int getRgb() {
        return this.rgb;
    }

    /* JADX INFO: renamed from: toComposableColor-WaAFU9c, reason: not valid java name */
    public final long m134583toComposableColorWaAFU9c(Composer composer, int i13) {
        switch (a.f168032a[ordinal()]) {
            case 1:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(-1652486049);
                long sleepAwake = C38072d.f163053a.m121949b(c28655q, 6).getSleepAwake();
                c28655q.m87173q(false);
                return sleepAwake;
            case 2:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(-1652484380);
                long sleepLightSleep = C38072d.f163053a.m121949b(c28655q2, 6).getSleepLightSleep();
                c28655q2.m87173q(false);
                return sleepLightSleep;
            case 3:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(-1652482621);
                long sleepDeepSleep = C38072d.f163053a.m121949b(c28655q3, 6).getSleepDeepSleep();
                c28655q3.m87173q(false);
                return sleepDeepSleep;
            case 4:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(-1652481086);
                long sleepRemSleep = C38072d.f163053a.m121949b(c28655q4, 6).getSleepRemSleep();
                c28655q4.m87173q(false);
                return sleepRemSleep;
            case 5:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(-1652479329);
                return AbstractC31061c.m95624D(C38072d.f163053a, c28655q5, 6, false);
            case 6:
                C28655q c28655q6 = (C28655q) composer;
                c28655q6.m87150e0(-1652477797);
                long greyL1 = C38072d.f163053a.m121949b(c28655q6, 6).getGreyL1();
                c28655q6.m87173q(false);
                return greyL1;
            case 7:
                C28655q c28655q7 = (C28655q) composer;
                c28655q7.m87150e0(-1652476294);
                long sleep = C38072d.f163053a.m121949b(c28655q7, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
                c28655q7.m87173q(false);
                return sleep;
            case 8:
                C28655q c28655q8 = (C28655q) composer;
                c28655q8.m87150e0(-1652475040);
                long strainZone5 = C38072d.f163053a.m121949b(c28655q8, 6).getStrainZone5();
                c28655q8.m87173q(false);
                return strainZone5;
            case 9:
                C28655q c28655q9 = (C28655q) composer;
                c28655q9.m87150e0(-1652473568);
                long strainZone4 = C38072d.f163053a.m121949b(c28655q9, 6).getStrainZone4();
                c28655q9.m87173q(false);
                return strainZone4;
            case 10:
                C28655q c28655q10 = (C28655q) composer;
                c28655q10.m87150e0(-1652471968);
                long strainZone3 = C38072d.f163053a.m121949b(c28655q10, 6).getStrainZone3();
                c28655q10.m87173q(false);
                return strainZone3;
            case 11:
                C28655q c28655q11 = (C28655q) composer;
                c28655q11.m87150e0(-1652470464);
                long strainZone2 = C38072d.f163053a.m121949b(c28655q11, 6).getStrainZone2();
                c28655q11.m87173q(false);
                return strainZone2;
            case 12:
                C28655q c28655q12 = (C28655q) composer;
                c28655q12.m87150e0(-1652468800);
                long strainZone1 = C38072d.f163053a.m121949b(c28655q12, 6).getStrainZone1();
                c28655q12.m87173q(false);
                return strainZone1;
            case 13:
                C28655q c28655q13 = (C28655q) composer;
                c28655q13.m87150e0(-1652467105);
                return AbstractC31061c.m95624D(C38072d.f163053a, c28655q13, 6, false);
            case 14:
                C28655q c28655q14 = (C28655q) composer;
                c28655q14.m87150e0(-1652465286);
                long sleep2 = C38072d.f163053a.m121949b(c28655q14, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
                c28655q14.m87173q(false);
                return sleep2;
            case 15:
                C28655q c28655q15 = (C28655q) composer;
                c28655q15.m87150e0(-1652463768);
                long accentNegativeTrend = C38072d.f163053a.m121949b(c28655q15, 6).getAccentNegativeTrend();
                c28655q15.m87173q(false);
                return accentNegativeTrend;
            case 16:
                C28655q c28655q16 = (C28655q) composer;
                c28655q16.m87150e0(-1652461752);
                long accentPositiveTrend = C38072d.f163053a.m121949b(c28655q16, 6).getAccentPositiveTrend();
                c28655q16.m87173q(false);
                return accentPositiveTrend;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C28655q c28655q17 = (C28655q) composer;
                c28655q17.m87150e0(-1652459843);
                long recovery = C38072d.f163053a.m121949b(c28655q17, 6).getRecovery();
                c28655q17.m87173q(false);
                return recovery;
            default:
                throw AbstractC11895b.m32003v(-1652486931, (C28655q) composer, false);
        }
    }
}
