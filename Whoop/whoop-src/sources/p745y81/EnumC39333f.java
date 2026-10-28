package p745y81;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import com.mapbox.common.logger.LogPriority;
import ge3.AbstractC15751g;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import t83.InterfaceC33616a;
import x81.C38072d;

/* JADX INFO: renamed from: y81.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0080\u0001\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001¨\u0006\u0087\u0001"}, m65681d2 = {"Ly81/f;", "Ly81/e;", "", "<init>", "(Ljava/lang/String;I)V", "Ly81/i;", "colors", "Li2/x;", "colorMap-vNxB06k", "(Ly81/i;)J", "colorMap", "toComposableColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "toComposableColor", "toTestableColor-0d7_KjU", "()J", "toTestableColor", "ACCENT_ACTION", "ACCENT_ALERT", "ACCENT_ALERT_TREND_15", "ACCENT_FOCUS", "ACCENT_FOCUS_15", "ACCENT_NEGATIVE_TREND", "ACCENT_NEGATIVE_TREND_15", "ACCENT_NOTE", "ACCENT_ONBOARDING_ACTION", "ACCENT_POSITIVE_TREND", "ACCENT_POSITIVE_TREND_15", "ACCENTS_ACTION", "AMERICA_250_BLUE", "AMERICA_250_RED", "BACKGROUND_DARK_ALT", "BACKGROUND_DARK_STD", "BLACK_10", "BLACK_20", "BLACK_30", "BLACK_5", "BLACK_50", "BLACK_70", "BLACK_90", "BRAND_BLACK", "BRAND_PRIMARY", "BRAND_WHITE", "BRAND_WHOOP_PRO", "BRONZE", "CHALLENGE_GAUGE_INACTIVE", "COACH_BLUE", "DARK_STD", "DEEP_SLEEP", "GOLD", "GREY_L1", "GREY_L2", "GREY_L3", "GREY_L4", "GREY_L5", "GREY_L6", "GREY_L7", "GREY_L8", "HEALTH_CALIBRATING", "HEALTH_NEUTRAL", "HEALTH_OLD", "HEALTH_YOUNG", "HIGH_RECOVERY", "LIGHT_SLEEP", "LOW_RECOVERY", "MCI_RED", "MCI_RED_50", "MEDIUM_RECOVERY", "NEGATIVE_TREND", "NEUTRAL_15", "PATRIOTIC_BLUE", "PATRIOTIC_RED", "PLATINUM", "POSITIVE_TREND", "RECOVERY", "RECOVERY_10", "RECOVERY_HIGH_RECOVERY", "RECOVERY_HIGH_RECOVERY_10", "RECOVERY_LOW_RECOVERY", "RECOVERY_MEDIUM_RECOVERY", "REM_SLEEP", "SECONDARY_TEXT", "SILVER", "SLEEP", "SLEEP_AWAKE", "SLEEP_DEEP_SLEEP", "SLEEP_LIGHT_SLEEP", "SLEEP_REM_SLEEP", "STRAIN", "STRAIN_ZONE_1", "STRAIN_ZONE_2", "STRAIN_ZONE_3", "STRAIN_ZONE_4", "STRAIN_ZONE_5", "SUFFICIENT_TREND", "SUFFICIENT_TREND_15", "SURFACE_MCI_BIRTH_CONTROL", "SURFACE_MCI_BIRTH_CONTROL_DIM", "SURFACE_MCI_FOLLICULAR", "SURFACE_MCI_FOLLICULAR_DIM", "SURFACE_MCI_LUTEAL", "SURFACE_MCI_LUTEAL_DIM", "SURFACE_MCI_MENSTRUAL", "SURFACE_MCI_MENSTRUAL_DIM", "SURFACE_MCI_OVULATORY", "SURFACE_MCI_OVULATORY_DIM", "SURFACE_PREGNANCY_TRIMESTER_1", "SURFACE_PREGNANCY_TRIMESTER_1_DIM", "SURFACE_PREGNANCY_TRIMESTER_2", "SURFACE_PREGNANCY_TRIMESTER_2_DIM", "SURFACE_PREGNANCY_TRIMESTER_3", "SURFACE_PREGNANCY_TRIMESTER_3_DIM", "SURFACE_PREGNANCY_TRIMESTER_4", "SURFACE_PREGNANCY_TRIMESTER_4_DIM", "SURFACE_SECONDARY_GREY", "TEXT_BASE_SECONDARY", "TEXT_MCI_BIRTH_CONTROL", "TEXT_MCI_FOLLICULAR", "TEXT_MCI_LUTEAL", "TEXT_MCI_MENSTRUAL", "TEXT_MCI_OVULATORY", "TEXT_PREGNANCY_TRIMESTER_1", "TEXT_PREGNANCY_TRIMESTER_2", "TEXT_PREGNANCY_TRIMESTER_3", "TEXT_PREGNANCY_TRIMESTER_4", "TRANSPARENT", "WHITE_10", "WHITE_20", "WHITE_30", "WHITE_40", "WHITE_5", "WHITE_50", "WHITE_70", "WHITE_90", "WITHINGS_PLAN", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC39333f implements InterfaceC39332e {
    ACCENT_ACTION,
    ACCENT_ALERT,
    ACCENT_ALERT_TREND_15,
    ACCENT_FOCUS,
    ACCENT_FOCUS_15,
    ACCENT_NEGATIVE_TREND,
    ACCENT_NEGATIVE_TREND_15,
    ACCENT_NOTE,
    ACCENT_ONBOARDING_ACTION,
    ACCENT_POSITIVE_TREND,
    ACCENT_POSITIVE_TREND_15,
    ACCENTS_ACTION,
    AMERICA_250_BLUE,
    AMERICA_250_RED,
    BACKGROUND_DARK_ALT,
    BACKGROUND_DARK_STD,
    BLACK_10,
    BLACK_20,
    BLACK_30,
    BLACK_5,
    BLACK_50,
    BLACK_70,
    BLACK_90,
    BRAND_BLACK,
    BRAND_PRIMARY,
    BRAND_WHITE,
    BRAND_WHOOP_PRO,
    BRONZE,
    CHALLENGE_GAUGE_INACTIVE,
    COACH_BLUE,
    DARK_STD,
    DEEP_SLEEP,
    GOLD,
    GREY_L1,
    GREY_L2,
    GREY_L3,
    GREY_L4,
    GREY_L5,
    GREY_L6,
    GREY_L7,
    GREY_L8,
    HEALTH_CALIBRATING,
    HEALTH_NEUTRAL,
    HEALTH_OLD,
    HEALTH_YOUNG,
    HIGH_RECOVERY,
    LIGHT_SLEEP,
    LOW_RECOVERY,
    MCI_RED,
    MCI_RED_50,
    MEDIUM_RECOVERY,
    NEGATIVE_TREND,
    NEUTRAL_15,
    PATRIOTIC_BLUE,
    PATRIOTIC_RED,
    PLATINUM,
    POSITIVE_TREND,
    RECOVERY,
    RECOVERY_10,
    RECOVERY_HIGH_RECOVERY,
    RECOVERY_HIGH_RECOVERY_10,
    RECOVERY_LOW_RECOVERY,
    RECOVERY_MEDIUM_RECOVERY,
    REM_SLEEP,
    SECONDARY_TEXT,
    SILVER,
    SLEEP,
    SLEEP_AWAKE,
    SLEEP_DEEP_SLEEP,
    SLEEP_LIGHT_SLEEP,
    SLEEP_REM_SLEEP,
    STRAIN,
    STRAIN_ZONE_1,
    STRAIN_ZONE_2,
    STRAIN_ZONE_3,
    STRAIN_ZONE_4,
    STRAIN_ZONE_5,
    SUFFICIENT_TREND,
    SUFFICIENT_TREND_15,
    SURFACE_MCI_BIRTH_CONTROL,
    SURFACE_MCI_BIRTH_CONTROL_DIM,
    SURFACE_MCI_FOLLICULAR,
    SURFACE_MCI_FOLLICULAR_DIM,
    SURFACE_MCI_LUTEAL,
    SURFACE_MCI_LUTEAL_DIM,
    SURFACE_MCI_MENSTRUAL,
    SURFACE_MCI_MENSTRUAL_DIM,
    SURFACE_MCI_OVULATORY,
    SURFACE_MCI_OVULATORY_DIM,
    SURFACE_PREGNANCY_TRIMESTER_1,
    SURFACE_PREGNANCY_TRIMESTER_1_DIM,
    SURFACE_PREGNANCY_TRIMESTER_2,
    SURFACE_PREGNANCY_TRIMESTER_2_DIM,
    SURFACE_PREGNANCY_TRIMESTER_3,
    SURFACE_PREGNANCY_TRIMESTER_3_DIM,
    SURFACE_PREGNANCY_TRIMESTER_4,
    SURFACE_PREGNANCY_TRIMESTER_4_DIM,
    SURFACE_SECONDARY_GREY,
    TEXT_BASE_SECONDARY,
    TEXT_MCI_BIRTH_CONTROL,
    TEXT_MCI_FOLLICULAR,
    TEXT_MCI_LUTEAL,
    TEXT_MCI_MENSTRUAL,
    TEXT_MCI_OVULATORY,
    TEXT_PREGNANCY_TRIMESTER_1,
    TEXT_PREGNANCY_TRIMESTER_2,
    TEXT_PREGNANCY_TRIMESTER_3,
    TEXT_PREGNANCY_TRIMESTER_4,
    TRANSPARENT,
    WHITE_10,
    WHITE_20,
    WHITE_30,
    WHITE_40,
    WHITE_5,
    WHITE_50,
    WHITE_70,
    WHITE_90,
    WITHINGS_PLAN;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: y81.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f169196a;

        static {
            int[] iArr = new int[EnumC39333f.values().length];
            try {
                iArr[EnumC39333f.ACCENT_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC39333f.ACCENT_ALERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC39333f.ACCENT_ALERT_TREND_15.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC39333f.ACCENT_FOCUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC39333f.ACCENT_FOCUS_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC39333f.ACCENT_NEGATIVE_TREND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC39333f.ACCENT_NEGATIVE_TREND_15.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC39333f.ACCENT_NOTE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC39333f.ACCENT_ONBOARDING_ACTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC39333f.ACCENT_POSITIVE_TREND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC39333f.ACCENT_POSITIVE_TREND_15.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC39333f.ACCENTS_ACTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC39333f.AMERICA_250_BLUE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC39333f.AMERICA_250_RED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC39333f.BACKGROUND_DARK_ALT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC39333f.BACKGROUND_DARK_STD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC39333f.BLACK_10.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC39333f.BLACK_20.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC39333f.BLACK_30.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC39333f.BLACK_5.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC39333f.BLACK_50.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC39333f.BLACK_70.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC39333f.BLACK_90.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC39333f.BRAND_BLACK.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC39333f.BRAND_PRIMARY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC39333f.BRAND_WHITE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[EnumC39333f.BRAND_WHOOP_PRO.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[EnumC39333f.BRONZE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[EnumC39333f.GOLD.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[EnumC39333f.PLATINUM.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[EnumC39333f.CHALLENGE_GAUGE_INACTIVE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[EnumC39333f.COACH_BLUE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[EnumC39333f.DARK_STD.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[EnumC39333f.DEEP_SLEEP.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[EnumC39333f.GREY_L1.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[EnumC39333f.GREY_L2.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[EnumC39333f.GREY_L3.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[EnumC39333f.GREY_L4.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[EnumC39333f.GREY_L5.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[EnumC39333f.GREY_L6.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[EnumC39333f.GREY_L7.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[EnumC39333f.GREY_L8.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[EnumC39333f.HEALTH_CALIBRATING.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[EnumC39333f.HEALTH_NEUTRAL.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[EnumC39333f.HEALTH_OLD.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[EnumC39333f.HEALTH_YOUNG.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[EnumC39333f.HIGH_RECOVERY.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[EnumC39333f.LIGHT_SLEEP.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[EnumC39333f.LOW_RECOVERY.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[EnumC39333f.MCI_RED.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[EnumC39333f.MCI_RED_50.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[EnumC39333f.MEDIUM_RECOVERY.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[EnumC39333f.NEGATIVE_TREND.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[EnumC39333f.NEUTRAL_15.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[EnumC39333f.PATRIOTIC_BLUE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[EnumC39333f.PATRIOTIC_RED.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[EnumC39333f.POSITIVE_TREND.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[EnumC39333f.RECOVERY.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[EnumC39333f.RECOVERY_10.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[EnumC39333f.RECOVERY_HIGH_RECOVERY.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[EnumC39333f.RECOVERY_HIGH_RECOVERY_10.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[EnumC39333f.RECOVERY_LOW_RECOVERY.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[EnumC39333f.RECOVERY_MEDIUM_RECOVERY.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[EnumC39333f.REM_SLEEP.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[EnumC39333f.SECONDARY_TEXT.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[EnumC39333f.SILVER.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[EnumC39333f.SLEEP.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[EnumC39333f.SLEEP_AWAKE.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[EnumC39333f.SLEEP_DEEP_SLEEP.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[EnumC39333f.SLEEP_LIGHT_SLEEP.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[EnumC39333f.SLEEP_REM_SLEEP.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[EnumC39333f.STRAIN.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[EnumC39333f.STRAIN_ZONE_1.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[EnumC39333f.STRAIN_ZONE_2.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[EnumC39333f.STRAIN_ZONE_3.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[EnumC39333f.STRAIN_ZONE_4.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[EnumC39333f.STRAIN_ZONE_5.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[EnumC39333f.SUFFICIENT_TREND.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[EnumC39333f.SUFFICIENT_TREND_15.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[EnumC39333f.SURFACE_MCI_BIRTH_CONTROL.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[EnumC39333f.SURFACE_MCI_BIRTH_CONTROL_DIM.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[EnumC39333f.SURFACE_MCI_FOLLICULAR.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[EnumC39333f.SURFACE_MCI_FOLLICULAR_DIM.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[EnumC39333f.SURFACE_MCI_LUTEAL.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[EnumC39333f.SURFACE_MCI_LUTEAL_DIM.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[EnumC39333f.SURFACE_MCI_MENSTRUAL.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[EnumC39333f.SURFACE_MCI_MENSTRUAL_DIM.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[EnumC39333f.SURFACE_MCI_OVULATORY.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[EnumC39333f.SURFACE_MCI_OVULATORY_DIM.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_1.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_1_DIM.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_2.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_2_DIM.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_3.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_3_DIM.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_4.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_4_DIM.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[EnumC39333f.SURFACE_SECONDARY_GREY.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[EnumC39333f.TEXT_BASE_SECONDARY.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[EnumC39333f.TEXT_MCI_BIRTH_CONTROL.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[EnumC39333f.TEXT_MCI_FOLLICULAR.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[EnumC39333f.TEXT_MCI_LUTEAL.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[EnumC39333f.TEXT_MCI_MENSTRUAL.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[EnumC39333f.TEXT_MCI_OVULATORY.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[EnumC39333f.TEXT_PREGNANCY_TRIMESTER_1.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[EnumC39333f.TEXT_PREGNANCY_TRIMESTER_2.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[EnumC39333f.TEXT_PREGNANCY_TRIMESTER_3.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[EnumC39333f.TEXT_PREGNANCY_TRIMESTER_4.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[EnumC39333f.TRANSPARENT.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[EnumC39333f.WHITE_5.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[EnumC39333f.WHITE_10.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[EnumC39333f.WHITE_20.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[EnumC39333f.WHITE_30.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[EnumC39333f.WHITE_50.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[EnumC39333f.WHITE_40.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[EnumC39333f.WHITE_70.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[EnumC39333f.WHITE_90.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[EnumC39333f.WITHINGS_PLAN.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            f169196a = iArr;
        }
    }

    /* JADX INFO: renamed from: colorMap-vNxB06k, reason: not valid java name */
    private final long m134586colorMapvNxB06k(C39336i colors) {
        switch (a.f169196a[ordinal()]) {
            case 1:
                return colors.getAccentAction();
            case 2:
                return colors.getAccentAlert();
            case 3:
                return colors.getAccentAlertTrend15();
            case 4:
                return colors.getAccentFocus();
            case 5:
                return colors.getAccentFocus15();
            case 6:
                return colors.getAccentNegativeTrend();
            case 7:
                return colors.getAccentNegativeTrend15();
            case 8:
                return colors.getAccentNote();
            case 9:
                return colors.getAccentOnboardingAction();
            case 10:
                return colors.getAccentPositiveTrend();
            case 11:
                return colors.getAccentPositiveTrend15();
            case 12:
                return colors.getAccentAction();
            case 13:
                return colors.getAmerica250Blue();
            case 14:
                return colors.getAmerica250Red();
            case 15:
                return colors.getBackgroundDarkAlt();
            case 16:
                return colors.getBackgroundDarkStd();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return colors.getBlack10();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return colors.getBlack20();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return colors.getBlack30();
            case 20:
                return colors.getBlack5();
            case 21:
                return colors.getBlack50();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return colors.getBlack70();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return colors.getBlack90();
            case 24:
                return colors.getBrandBlack();
            case 25:
                return colors.getBrandPrimary();
            case 26:
                return colors.getBrandWhite();
            case 27:
                return colors.getBrandWhoopPro();
            case 28:
                return colors.getBronze();
            case 29:
                return colors.getGold();
            case 30:
                return colors.getPlatinum();
            case 31:
                return colors.getChallengeGaugeInactive();
            case 32:
                return colors.getCoachBlue();
            case 33:
                return colors.getBackgroundDarkStd();
            case 34:
                return colors.getSleepDeepSleep();
            case 35:
                return colors.getGreyL1();
            case 36:
                return colors.getGreyL2();
            case 37:
                return colors.getGreyL3();
            case 38:
                return colors.getGreyL4();
            case 39:
                return colors.getGreyL5();
            case 40:
                return colors.getGreyL6();
            case 41:
                return colors.getGreyL7();
            case 42:
                return colors.getGreyL8();
            case 43:
                return colors.getHealthCalibrating();
            case 44:
                return colors.getHealthNeutral();
            case 45:
                return colors.getHealthOld();
            case 46:
                return colors.getHealthYoung();
            case 47:
                return colors.getRecoveryHighRecovery();
            case 48:
                return colors.getSleepLightSleep();
            case 49:
                return colors.getRecoveryLowRecovery();
            case 50:
                return colors.getMciRed();
            case 51:
                return colors.getMciRed50();
            case 52:
                return colors.getRecoveryMediumRecovery();
            case 53:
                return colors.getAccentNegativeTrend();
            case 54:
                return colors.getNeutral15();
            case 55:
                return colors.getPatrioticBlue();
            case 56:
                return colors.getPatrioticRed();
            case 57:
                return colors.getAccentPositiveTrend();
            case 58:
                return colors.getRecovery();
            case 59:
                return colors.getRecovery10();
            case 60:
                return colors.getRecoveryHighRecovery();
            case 61:
                return colors.getRecoveryHighRecovery10();
            case 62:
                return colors.getRecoveryLowRecovery();
            case 63:
                return colors.getRecoveryMediumRecovery();
            case 64:
                return colors.getSleepRemSleep();
            case 65:
                return colors.getSecondaryText();
            case 66:
                return colors.getSilver();
            case 67:
                return colors.getSleep();
            case 68:
                return colors.getSleepAwake();
            case 69:
                return colors.getSleepDeepSleep();
            case 70:
                return colors.getSleepLightSleep();
            case 71:
                return colors.getSleepRemSleep();
            case 72:
                return colors.getStrain();
            case 73:
                return colors.getStrainZone1();
            case 74:
                return colors.getStrainZone2();
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                return colors.getStrainZone3();
            case 76:
                return colors.getStrainZone4();
            case 77:
                return colors.getStrainZone5();
            case 78:
                return colors.getSufficientTrend();
            case 79:
                return colors.getSufficientTrend15();
            case 80:
                return colors.getSurfaceMciBirthControl();
            case 81:
                return colors.getSurfaceMciBirthControlDim();
            case 82:
                return colors.getSurfaceMciFollicular();
            case 83:
                return colors.getSurfaceMciFollicularDim();
            case 84:
                return colors.getSurfaceMciLuteal();
            case 85:
                return colors.getSurfaceMciLutealDim();
            case 86:
                return colors.getSurfaceMciMenstrual();
            case 87:
                return colors.getSurfaceMciMenstrualDim();
            case 88:
                return colors.getSurfaceMciOvulatory();
            case 89:
                return colors.getSurfaceMciOvulatoryDim();
            case 90:
                return colors.getSurfacePregnancyTrimester1();
            case 91:
                return colors.getSurfacePregnancyTrimester1Dim();
            case 92:
                return colors.getSurfacePregnancyTrimester2();
            case 93:
                return colors.getSurfacePregnancyTrimester2Dim();
            case 94:
                return colors.getSurfacePregnancyTrimester3();
            case 95:
                return colors.getSurfacePregnancyTrimester3Dim();
            case 96:
                return colors.getSurfacePregnancyTrimester4();
            case 97:
                return colors.getSurfacePregnancyTrimester4Dim();
            case 98:
                return colors.getSurfaceSecondaryGrey();
            case LogPriority.NONE /* 99 */:
                return colors.getTextBaseSecondary();
            case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
                return colors.getTextMciBirthControl();
            case 101:
                return colors.getTextMciFollicular();
            case 102:
                return colors.getTextMciLuteal();
            case 103:
                return colors.getTextMciMenstrual();
            case 104:
                return colors.getTextMciOvulatory();
            case 105:
                return colors.getTextPregnancyTrimester1();
            case 106:
                return colors.getTextPregnancyTrimester2();
            case 107:
                return colors.getTextPregnancyTrimester3();
            case 108:
                return colors.getTextPregnancyTrimester4();
            case 109:
                return colors.getTransparent();
            case 110:
                return colors.getWhite5();
            case 111:
                return colors.getWhite10();
            case 112:
                return colors.getWhite20();
            case 113:
                return colors.getWhite30();
            case 114:
                return colors.getWhite50();
            case 115:
                return colors.getWhite40();
            case 116:
                return colors.getWhite70();
            case 117:
                return colors.getWhite90();
            case 118:
                return colors.getWithingsPlan();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    @Override // p745y81.InterfaceC39332e
    /* JADX INFO: renamed from: toComposableColor-WaAFU9c */
    public long mo134584toComposableColorWaAFU9c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1580108471);
        long jM134586colorMapvNxB06k = m134586colorMapvNxB06k(C38072d.f163053a.m121949b(c28655q, 6));
        c28655q.m87173q(false);
        return jM134586colorMapvNxB06k;
    }

    @Override // p745y81.InterfaceC39332e
    /* JADX INFO: renamed from: toTestableColor-0d7_KjU */
    public long mo134585toTestableColor0d7_KjU() {
        return m134586colorMapvNxB06k(AbstractC42793j.m125436c());
    }
}
