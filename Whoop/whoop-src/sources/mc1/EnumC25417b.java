package mc1;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: mc1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, m65681d2 = {"Lmc1/b;", "", "", "name", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ly81/f;", "defaultColorKey", "toWhoopColorKey", "(Ly81/f;)Ly81/f;", "EXHALE", "HARD", "HOLD", "HIGH_STRESS", "INHALE", "LIGHT", "LIGHT_SLEEP", "LOW_STRESS", "MAX", "MEDIUM_STRESS", "MODERATE", "NONE", "NO_DATA", "REM_SLEEP", "RESTORATIVE", "SWS_SLEEP", "VERY_LIGHT", "AWAKE", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC25417b {
    EXHALE("EXHALE"),
    HARD("HARD"),
    HOLD("HOLD"),
    HIGH_STRESS("HIGH_STRESS"),
    INHALE("INHALE"),
    LIGHT("LIGHT"),
    LIGHT_SLEEP("LIGHT_SLEEP"),
    LOW_STRESS("LOW_STRESS"),
    MAX("MAX"),
    MEDIUM_STRESS("MEDIUM_STRESS"),
    MODERATE("MODERATE"),
    NONE("NONE"),
    NO_DATA("NO_DATA"),
    REM_SLEEP("REM_SLEEP"),
    RESTORATIVE("RESTORATIVE"),
    SWS_SLEEP("SWS_SLEEP"),
    VERY_LIGHT("VERY_LIGHT"),
    AWAKE("AWAKE");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: mc1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99521a;

        static {
            int[] iArr = new int[EnumC25417b.values().length];
            try {
                iArr[EnumC25417b.LIGHT_SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25417b.REM_SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25417b.SWS_SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25417b.AWAKE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC25417b.EXHALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC25417b.HARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC25417b.INHALE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC25417b.LIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC25417b.MAX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC25417b.MODERATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC25417b.RESTORATIVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC25417b.VERY_LIGHT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC25417b.LOW_STRESS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC25417b.MEDIUM_STRESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC25417b.HIGH_STRESS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f99521a = iArr;
        }
    }

    EnumC25417b(String str) {
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ EnumC39333f toWhoopColorKey$default(EnumC25417b enumC25417b, EnumC39333f enumC39333f, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toWhoopColorKey");
        }
        if ((i13 & 1) != 0) {
            enumC39333f = EnumC39333f.SLEEP;
        }
        return enumC25417b.toWhoopColorKey(enumC39333f);
    }

    public final EnumC39333f toWhoopColorKey(EnumC39333f defaultColorKey) {
        AbstractC22676k.m65750j(defaultColorKey, "defaultColorKey");
        switch (a.f99521a[ordinal()]) {
            case 1:
                return EnumC39333f.SLEEP_LIGHT_SLEEP;
            case 2:
                return EnumC39333f.SLEEP_REM_SLEEP;
            case 3:
                return EnumC39333f.SLEEP_DEEP_SLEEP;
            case 4:
                return EnumC39333f.SLEEP_AWAKE;
            case 5:
                return EnumC39333f.STRAIN;
            case 6:
                return EnumC39333f.STRAIN_ZONE_4;
            case 7:
                return EnumC39333f.STRAIN_ZONE_5;
            case 8:
                return EnumC39333f.STRAIN_ZONE_2;
            case 9:
                return EnumC39333f.STRAIN_ZONE_5;
            case 10:
                return EnumC39333f.STRAIN_ZONE_3;
            case 11:
                return EnumC39333f.BRAND_WHITE;
            case 12:
                return EnumC39333f.STRAIN_ZONE_1;
            case 13:
                return EnumC39333f.RECOVERY;
            case 14:
                return EnumC39333f.ACCENT_POSITIVE_TREND;
            case 15:
                return EnumC39333f.ACCENT_NEGATIVE_TREND;
            default:
                return defaultColorKey;
        }
    }
}
