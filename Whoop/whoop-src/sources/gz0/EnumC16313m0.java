package gz0;

import androidx.health.platform.client.proto.C1533u;
import androidx.recyclerview.widget.AbstractC1707m0;
import com.mapbox.common.logger.LogPriority;
import com.whoop.design.models.DesignSystemEnum;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import org.joda.time.DateTimeConstants;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import t83.InterfaceC33616a;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: gz0.m0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0003\b\u008c\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002¨\u0006\u0091\u0002"}, m65681d2 = {"Lgz0/m0;", "Lcom/whoop/design/models/DesignSystemEnum;", "", "<init>", "(Ljava/lang/String;I)V", "", "toWhoopIcon", "()I", "ADD", "CHECKMARK", "COPY", "CROSS", "CUSTOMIZE", "DELETE", "EDIT", "EMAIL", "JOURNAL", "SURVEY", "PENCIL", "REMOVE", "SEARCH", "START_ACTIVITY", "UNDO", "FILTER", "UPLOAD", "OTHER", "ACTIVITY", "WEIGHTLIFTING", "RUNNING", "BLUETOOTH", "CHARGING_CABLE", "CHARGING_PHONE", "NO_INTERNET", "INTEGRATIONS", "WHOOP_LOGO_CIRCLE", "WHOOP_PRO_ROUNDED", "WHOOP_LOGO_TEXT", "WHOOP_W_CIRCLE", "WHOOP_LOGO", "WHOOP_ROUND_ARROWS", "ARROW_LEFT", "ARROW_RIGHT", "ARROW_BACKWARD", "ARROW_FORWARD", "ANNUAL_REPORT", "CAMERA", "CARET_DOWN", "CARET_LEFT", "CARET_RIGHT", "CARET_FORWARD", "CARET_BACKWARD", "CARET_UP", "COACH", "COMMUNITY", "DOT_MENU", "HEALTH_TAB", "HOME", "MENU", "MONTHLY_PA", "PROFILE", "SETTINGS", "SLEEP_COACH", "STRAIN_COACH", "ZOOM_IN", "ZOOM_OUT", "HRV", "HRV_MAX", "HRV_MIN", "HRV_OUTLINE", "MENSTRUAL_CYCLE", "MAX_HEART_RATE", "RECOVERY", "RESPIRATORY_RATE", "RHR", "SKIN_TEMPERATURE", "CALORIES", "HEART_RATE", "LIST", "STEPS", "STRAIN", "STRENGTH_ACTIVITY_TIME", "SUPERSET", "TONNAGE", "TOTAL_VOLUME_LOAD", "VO2_MAX", "HR_ZONES_1_3", "HR_ZONES_4_5", "HR_ZONE_1", "HR_ZONE_2", "HR_ZONE_3", "HR_ZONE_4", "HR_ZONE_5", "HR_ZONES_ALL", "BEDTIME", "CONSISTENCY", "DISTURBANCES", "DURATION", "HOURS_OF_SLEEP", "NAP", "SLEEP", "SLEEP_CONSISTENCY", "SLEEP_CYCLE", "SLEEP_DEBT", "SLEEP_EFFICIENCY", "SLEEP_LATENCY", "SLEEP_NEED", "SUN", "WAKETIME", "ADVANCED_LABS", "ADVANCED_LABS_SETTINGS", "BARS_CHART", "CANCEL_MEMBERSHIP", "CHAT", "CHAT_BUBBLE", "CHAT_WITH_RED_DOT", "CREDIT_CARD", "DISCOUNT", "EXPIRES", "EXTEND_MEMBERSHIP", "GIFT", "GIFT_CARD", "HSA_FSA", "KEY", "MEMBERSHIP", "MXM_SUPPORT", "NATURAL_CYCLES", "NEW_ARRIVALS", "REFER_A_FRIEND", "REPORT", "RESTORE", "RETURN", "SELECTED_CHECK", "SEND", "SHIPPING", "SHIPPING_BOX", "SHOPPING_CART", "WHOOP_HELP", "STRAP", "REMOVE_STRAP", "STRAP_CUTOUT", "STRAP_VIBRATION", "STRAP_SETTINGS", "ADD_STRAP", "ADVICE", "AI_SPARKLE", "ALERT_CIRCLE", "ARTICLE", "BADGE_BRONZE", "BROWSE_TEAMS", "DATA", "DIAGNOSTIC_DATA", "DOWNLOAD", "DRAG", "EDUCATION", "FEEL_BETTER", "FIRMWARE", "FOUNDING_MEMBER", "GOALS", "BADGE_GOLD", "HELP_CENTER", "ID", "INCOGNITO", "JUMPSTART", "LIBRA", "LOCATION", "LOCATION_PIN", "LOCKED", "LOOK_BETTER", "MEDICINE", "MEMBERS_LIKE_YOU", "MISSING_DATA", "MY_ACCOUNT", "NOTES_AI", "NOTES_EDIT", "NOTIFICATIONS", "PERFORM", "PHONE", "PODCAST", "PREGNANCY", "PRIVACY", "PRIVACY_SETTINGS", "SCORE_HIDDEN", "SHARE", "BADGE_SILVER", "STRESS_MONITOR_DEFAULT", "STRESS_MONITOR_LOW", "TIME", "TUTORIALS", "NO_USER_INPUT", "VACATION", "WARNING", "WEEKLY_PLAN", "LANGUAGES", "FOLLOWER_SEARCH", "FOLLOWER_SHARE", "FILE", "KEYBOARD", "MICROPHONE", "PICTURE", "THUMB_UP", "THUMB_UP_FILLED", "THUMB_DOWN", "THUMB_DOWN_FILLED", "BLOOD_OXYGEN", "SAGE", "ECG", "FAST_PACE_OF_AGING", "OMRON", "POSTPARTUM", "PACE_OF_AGING", "PREGNANCY_FIRST_TRIMESTER", "PREGNANCY_SECOND_TRIMESTER", "PREGNANCY_THIRD_TRIMESTER", "BLOOD_PRESSURE", "CHOLESTEROL", "HBA1C", "SEGMENTAL_BODY_COMP", "SEGMENTAL_BODY_COMPOSITION", "SHEPHERD", "SINGLE_BABY", "SLOW_PACE_OF_AGING", "TRIPLETS_OR_MORE", "TWINS", "WEIGHT", "WHOOP_AGE", "PICKER", "CREAMY_CERVICAL_MUCUS", "DRY_CERVICAL_MUCUS", "EGG_WHITE_CERVICAL_MUCUS", "GLUE_LIKE_CERVICAL_MUCUS", "HEAVY_PERIOD_FLOW", "INTRAUTERINE_DEVICE", "LIGHT_PERIOD_FLOW", "MEDIUM_PERIOD_FLOW", "NONE_PERIOD_FLOW", "SOMETHING_WRONG_CERVICAL_MUCUS", "SPOTTING_CERVICAL_MUCUS", "SPOTTING_FLOW", "STICKY_CERVICAL_MUCUS", "WATERY_CERVICAL_MUCUS", "TINY_ATTENTION", "TINY_ATTENTION_ORANGE", "TINY_ATTENTION_WHITE", "TINY_BAR_GRAPH", "TINY_CHECKMARK", "TINY_BORDERED_CHECKMARK", "TINY_COLLAPSE", "TINY_CROSS", "TINY_CARET_DOWN", "TINY_ELLIPSE", "TINY_CARET_LEFT", "TINY_CARET_BACKWARD", "TINY_PILL", "TINY_PLAY", "TINY_CARET_RIGHT", "TINY_CARET_FORWARD", "TINY_CHARGING", "TINY_EXPAND", "TINY_HEART_RATE", "TINY_HELP", "TINY_INFORMATION", "TINY_TRIANGLE_DOWN", "TINY_TRIANGLE_UP", "TINY_TRAINGLE_UP", "TINY_CARET_UP", "TINY_ARROW_FWD", "TINY_STRAP", "TINY_SLEEP", "TINY_REFRESH", "IN_THE_GREEN", "START_STRONG", "SLEEP_RIGHT", "TRY_DRY", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC16313m0 implements DesignSystemEnum {
    ADD,
    CHECKMARK,
    COPY,
    CROSS,
    CUSTOMIZE,
    DELETE,
    EDIT,
    EMAIL,
    JOURNAL,
    SURVEY,
    PENCIL,
    REMOVE,
    SEARCH,
    START_ACTIVITY,
    UNDO,
    FILTER,
    UPLOAD,
    OTHER,
    ACTIVITY,
    WEIGHTLIFTING,
    RUNNING,
    BLUETOOTH,
    CHARGING_CABLE,
    CHARGING_PHONE,
    NO_INTERNET,
    INTEGRATIONS,
    WHOOP_LOGO_CIRCLE,
    WHOOP_PRO_ROUNDED,
    WHOOP_LOGO_TEXT,
    WHOOP_W_CIRCLE,
    WHOOP_LOGO,
    WHOOP_ROUND_ARROWS,
    ARROW_LEFT,
    ARROW_RIGHT,
    ARROW_BACKWARD,
    ARROW_FORWARD,
    ANNUAL_REPORT,
    CAMERA,
    CARET_DOWN,
    CARET_LEFT,
    CARET_RIGHT,
    CARET_FORWARD,
    CARET_BACKWARD,
    CARET_UP,
    COACH,
    COMMUNITY,
    DOT_MENU,
    HEALTH_TAB,
    HOME,
    MENU,
    MONTHLY_PA,
    PROFILE,
    SETTINGS,
    SLEEP_COACH,
    STRAIN_COACH,
    ZOOM_IN,
    ZOOM_OUT,
    HRV,
    HRV_MAX,
    HRV_MIN,
    HRV_OUTLINE,
    MENSTRUAL_CYCLE,
    MAX_HEART_RATE,
    RECOVERY,
    RESPIRATORY_RATE,
    RHR,
    SKIN_TEMPERATURE,
    CALORIES,
    HEART_RATE,
    LIST,
    STEPS,
    STRAIN,
    STRENGTH_ACTIVITY_TIME,
    SUPERSET,
    TONNAGE,
    TOTAL_VOLUME_LOAD,
    VO2_MAX,
    HR_ZONES_1_3,
    HR_ZONES_4_5,
    HR_ZONE_1,
    HR_ZONE_2,
    HR_ZONE_3,
    HR_ZONE_4,
    HR_ZONE_5,
    HR_ZONES_ALL,
    BEDTIME,
    CONSISTENCY,
    DISTURBANCES,
    DURATION,
    HOURS_OF_SLEEP,
    NAP,
    SLEEP,
    SLEEP_CONSISTENCY,
    SLEEP_CYCLE,
    SLEEP_DEBT,
    SLEEP_EFFICIENCY,
    SLEEP_LATENCY,
    SLEEP_NEED,
    SUN,
    WAKETIME,
    ADVANCED_LABS,
    ADVANCED_LABS_SETTINGS,
    BARS_CHART,
    CANCEL_MEMBERSHIP,
    CHAT,
    CHAT_BUBBLE,
    CHAT_WITH_RED_DOT,
    CREDIT_CARD,
    DISCOUNT,
    EXPIRES,
    EXTEND_MEMBERSHIP,
    GIFT,
    GIFT_CARD,
    HSA_FSA,
    KEY,
    MEMBERSHIP,
    MXM_SUPPORT,
    NATURAL_CYCLES,
    NEW_ARRIVALS,
    REFER_A_FRIEND,
    REPORT,
    RESTORE,
    RETURN,
    SELECTED_CHECK,
    SEND,
    SHIPPING,
    SHIPPING_BOX,
    SHOPPING_CART,
    WHOOP_HELP,
    STRAP,
    REMOVE_STRAP,
    STRAP_CUTOUT,
    STRAP_VIBRATION,
    STRAP_SETTINGS,
    ADD_STRAP,
    ADVICE,
    AI_SPARKLE,
    ALERT_CIRCLE,
    ARTICLE,
    BADGE_BRONZE,
    BROWSE_TEAMS,
    DATA,
    DIAGNOSTIC_DATA,
    DOWNLOAD,
    DRAG,
    EDUCATION,
    FEEL_BETTER,
    FIRMWARE,
    FOUNDING_MEMBER,
    GOALS,
    BADGE_GOLD,
    HELP_CENTER,
    ID,
    INCOGNITO,
    JUMPSTART,
    LIBRA,
    LOCATION,
    LOCATION_PIN,
    LOCKED,
    LOOK_BETTER,
    MEDICINE,
    MEMBERS_LIKE_YOU,
    MISSING_DATA,
    MY_ACCOUNT,
    NOTES_AI,
    NOTES_EDIT,
    NOTIFICATIONS,
    PERFORM,
    PHONE,
    PODCAST,
    PREGNANCY,
    PRIVACY,
    PRIVACY_SETTINGS,
    SCORE_HIDDEN,
    SHARE,
    BADGE_SILVER,
    STRESS_MONITOR_DEFAULT,
    STRESS_MONITOR_LOW,
    TIME,
    TUTORIALS,
    NO_USER_INPUT,
    VACATION,
    WARNING,
    WEEKLY_PLAN,
    LANGUAGES,
    FOLLOWER_SEARCH,
    FOLLOWER_SHARE,
    FILE,
    KEYBOARD,
    MICROPHONE,
    PICTURE,
    THUMB_UP,
    THUMB_UP_FILLED,
    THUMB_DOWN,
    THUMB_DOWN_FILLED,
    BLOOD_OXYGEN,
    SAGE,
    ECG,
    FAST_PACE_OF_AGING,
    OMRON,
    POSTPARTUM,
    PACE_OF_AGING,
    PREGNANCY_FIRST_TRIMESTER,
    PREGNANCY_SECOND_TRIMESTER,
    PREGNANCY_THIRD_TRIMESTER,
    BLOOD_PRESSURE,
    CHOLESTEROL,
    HBA1C,
    SEGMENTAL_BODY_COMP,
    SEGMENTAL_BODY_COMPOSITION,
    SHEPHERD,
    SINGLE_BABY,
    SLOW_PACE_OF_AGING,
    TRIPLETS_OR_MORE,
    TWINS,
    WEIGHT,
    WHOOP_AGE,
    PICKER,
    CREAMY_CERVICAL_MUCUS,
    DRY_CERVICAL_MUCUS,
    EGG_WHITE_CERVICAL_MUCUS,
    GLUE_LIKE_CERVICAL_MUCUS,
    HEAVY_PERIOD_FLOW,
    INTRAUTERINE_DEVICE,
    LIGHT_PERIOD_FLOW,
    MEDIUM_PERIOD_FLOW,
    NONE_PERIOD_FLOW,
    SOMETHING_WRONG_CERVICAL_MUCUS,
    SPOTTING_CERVICAL_MUCUS,
    SPOTTING_FLOW,
    STICKY_CERVICAL_MUCUS,
    WATERY_CERVICAL_MUCUS,
    TINY_ATTENTION,
    TINY_ATTENTION_ORANGE,
    TINY_ATTENTION_WHITE,
    TINY_BAR_GRAPH,
    TINY_CHECKMARK,
    TINY_BORDERED_CHECKMARK,
    TINY_COLLAPSE,
    TINY_CROSS,
    TINY_CARET_DOWN,
    TINY_ELLIPSE,
    TINY_CARET_LEFT,
    TINY_CARET_BACKWARD,
    TINY_PILL,
    TINY_PLAY,
    TINY_CARET_RIGHT,
    TINY_CARET_FORWARD,
    TINY_CHARGING,
    TINY_EXPAND,
    TINY_HEART_RATE,
    TINY_HELP,
    TINY_INFORMATION,
    TINY_TRIANGLE_DOWN,
    TINY_TRIANGLE_UP,
    TINY_TRAINGLE_UP,
    TINY_CARET_UP,
    TINY_ARROW_FWD,
    TINY_STRAP,
    TINY_SLEEP,
    TINY_REFRESH,
    IN_THE_GREEN,
    START_STRONG,
    SLEEP_RIGHT,
    TRY_DRY;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: gz0.m0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f62693a;

        static {
            int[] iArr = new int[EnumC16313m0.values().length];
            try {
                iArr[EnumC16313m0.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16313m0.CHECKMARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16313m0.COPY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC16313m0.CROSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC16313m0.CUSTOMIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC16313m0.DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC16313m0.EDIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC16313m0.EMAIL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC16313m0.JOURNAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC16313m0.SURVEY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC16313m0.PENCIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC16313m0.REMOVE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC16313m0.SEARCH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC16313m0.START_ACTIVITY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC16313m0.UNDO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC16313m0.FILTER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC16313m0.UPLOAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC16313m0.OTHER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC16313m0.ACTIVITY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC16313m0.WEIGHTLIFTING.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC16313m0.RUNNING.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC16313m0.BLUETOOTH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC16313m0.CHARGING_CABLE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC16313m0.CHARGING_PHONE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC16313m0.NO_INTERNET.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC16313m0.INTEGRATIONS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[EnumC16313m0.WHOOP_W_CIRCLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[EnumC16313m0.WHOOP_LOGO_TEXT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[EnumC16313m0.WHOOP_LOGO_CIRCLE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[EnumC16313m0.WHOOP_PRO_ROUNDED.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[EnumC16313m0.WHOOP_LOGO.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[EnumC16313m0.WHOOP_ROUND_ARROWS.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[EnumC16313m0.ARROW_LEFT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[EnumC16313m0.ARROW_BACKWARD.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[EnumC16313m0.ARROW_RIGHT.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[EnumC16313m0.ARROW_FORWARD.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[EnumC16313m0.ANNUAL_REPORT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[EnumC16313m0.CAMERA.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[EnumC16313m0.CARET_DOWN.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[EnumC16313m0.CARET_LEFT.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[EnumC16313m0.CARET_BACKWARD.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[EnumC16313m0.CARET_RIGHT.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[EnumC16313m0.CARET_FORWARD.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[EnumC16313m0.CARET_UP.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[EnumC16313m0.COACH.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[EnumC16313m0.COMMUNITY.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[EnumC16313m0.DOT_MENU.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[EnumC16313m0.HEALTH_TAB.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[EnumC16313m0.HOME.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[EnumC16313m0.MENU.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[EnumC16313m0.MONTHLY_PA.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[EnumC16313m0.PROFILE.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[EnumC16313m0.SETTINGS.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[EnumC16313m0.SLEEP_COACH.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[EnumC16313m0.STRAIN_COACH.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[EnumC16313m0.ZOOM_IN.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[EnumC16313m0.ZOOM_OUT.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[EnumC16313m0.HRV.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[EnumC16313m0.HRV_OUTLINE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[EnumC16313m0.HRV_MAX.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[EnumC16313m0.HRV_MIN.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[EnumC16313m0.MENSTRUAL_CYCLE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[EnumC16313m0.MAX_HEART_RATE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[EnumC16313m0.RECOVERY.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[EnumC16313m0.RESPIRATORY_RATE.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[EnumC16313m0.RHR.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[EnumC16313m0.SKIN_TEMPERATURE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[EnumC16313m0.CALORIES.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[EnumC16313m0.HEART_RATE.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[EnumC16313m0.HR_ZONES_1_3.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[EnumC16313m0.HR_ZONES_4_5.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[EnumC16313m0.HR_ZONE_1.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[EnumC16313m0.HR_ZONE_2.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[EnumC16313m0.HR_ZONE_3.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[EnumC16313m0.HR_ZONE_4.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[EnumC16313m0.HR_ZONE_5.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[EnumC16313m0.HR_ZONES_ALL.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[EnumC16313m0.LIST.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[EnumC16313m0.STEPS.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[EnumC16313m0.STRAIN.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[EnumC16313m0.STRENGTH_ACTIVITY_TIME.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[EnumC16313m0.SUPERSET.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[EnumC16313m0.TONNAGE.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[EnumC16313m0.TOTAL_VOLUME_LOAD.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[EnumC16313m0.VO2_MAX.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[EnumC16313m0.BEDTIME.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[EnumC16313m0.CONSISTENCY.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[EnumC16313m0.DISTURBANCES.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[EnumC16313m0.DURATION.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[EnumC16313m0.SLEEP_EFFICIENCY.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[EnumC16313m0.HOURS_OF_SLEEP.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[EnumC16313m0.SLEEP_LATENCY.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[EnumC16313m0.NAP.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[EnumC16313m0.SLEEP.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[EnumC16313m0.SLEEP_CONSISTENCY.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[EnumC16313m0.SLEEP_CYCLE.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[EnumC16313m0.SLEEP_DEBT.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[EnumC16313m0.SLEEP_NEED.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[EnumC16313m0.SUN.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[EnumC16313m0.WAKETIME.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[EnumC16313m0.ADVANCED_LABS_SETTINGS.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[EnumC16313m0.BARS_CHART.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[EnumC16313m0.CANCEL_MEMBERSHIP.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[EnumC16313m0.CHAT.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[EnumC16313m0.CHAT_BUBBLE.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[EnumC16313m0.CHAT_WITH_RED_DOT.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[EnumC16313m0.CREDIT_CARD.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[EnumC16313m0.DISCOUNT.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[EnumC16313m0.EXPIRES.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[EnumC16313m0.EXTEND_MEMBERSHIP.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[EnumC16313m0.GIFT.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[EnumC16313m0.GIFT_CARD.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[EnumC16313m0.HSA_FSA.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[EnumC16313m0.KEY.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[EnumC16313m0.MEMBERSHIP.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[EnumC16313m0.MXM_SUPPORT.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[EnumC16313m0.NATURAL_CYCLES.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[EnumC16313m0.NEW_ARRIVALS.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[EnumC16313m0.REFER_A_FRIEND.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[EnumC16313m0.REPORT.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[EnumC16313m0.RESTORE.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[EnumC16313m0.RETURN.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[EnumC16313m0.SELECTED_CHECK.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[EnumC16313m0.SEND.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[EnumC16313m0.SHIPPING.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[EnumC16313m0.SHIPPING_BOX.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[EnumC16313m0.SHOPPING_CART.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[EnumC16313m0.ADVANCED_LABS.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[EnumC16313m0.WHOOP_HELP.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[EnumC16313m0.STRAP.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[EnumC16313m0.REMOVE_STRAP.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[EnumC16313m0.STRAP_CUTOUT.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[EnumC16313m0.STRAP_VIBRATION.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[EnumC16313m0.STRAP_SETTINGS.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[EnumC16313m0.ADD_STRAP.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[EnumC16313m0.ADVICE.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr[EnumC16313m0.AI_SPARKLE.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr[EnumC16313m0.ALERT_CIRCLE.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr[EnumC16313m0.ARTICLE.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr[EnumC16313m0.BADGE_BRONZE.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr[EnumC16313m0.BROWSE_TEAMS.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr[EnumC16313m0.DATA.ordinal()] = 142;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr[EnumC16313m0.DIAGNOSTIC_DATA.ordinal()] = 143;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr[EnumC16313m0.DOWNLOAD.ordinal()] = 144;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr[EnumC16313m0.DRAG.ordinal()] = 145;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr[EnumC16313m0.EDUCATION.ordinal()] = 146;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr[EnumC16313m0.FEEL_BETTER.ordinal()] = 147;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr[EnumC16313m0.FIRMWARE.ordinal()] = 148;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr[EnumC16313m0.FOUNDING_MEMBER.ordinal()] = 149;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr[EnumC16313m0.GOALS.ordinal()] = 150;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr[EnumC16313m0.BADGE_GOLD.ordinal()] = 151;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr[EnumC16313m0.HELP_CENTER.ordinal()] = 152;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr[EnumC16313m0.ID.ordinal()] = 153;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr[EnumC16313m0.INCOGNITO.ordinal()] = 154;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr[EnumC16313m0.JUMPSTART.ordinal()] = 155;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr[EnumC16313m0.LIBRA.ordinal()] = 156;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr[EnumC16313m0.LOCATION.ordinal()] = 157;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr[EnumC16313m0.LOCATION_PIN.ordinal()] = 158;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr[EnumC16313m0.LOCKED.ordinal()] = 159;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr[EnumC16313m0.LOOK_BETTER.ordinal()] = 160;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr[EnumC16313m0.MEDICINE.ordinal()] = 161;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr[EnumC16313m0.MEMBERS_LIKE_YOU.ordinal()] = 162;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr[EnumC16313m0.MISSING_DATA.ordinal()] = 163;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr[EnumC16313m0.MY_ACCOUNT.ordinal()] = 164;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr[EnumC16313m0.NOTES_AI.ordinal()] = 165;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr[EnumC16313m0.NOTES_EDIT.ordinal()] = 166;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr[EnumC16313m0.NOTIFICATIONS.ordinal()] = 167;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr[EnumC16313m0.PERFORM.ordinal()] = 168;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr[EnumC16313m0.PHONE.ordinal()] = 169;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr[EnumC16313m0.PODCAST.ordinal()] = 170;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr[EnumC16313m0.PREGNANCY.ordinal()] = 171;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr[EnumC16313m0.PRIVACY.ordinal()] = 172;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr[EnumC16313m0.PRIVACY_SETTINGS.ordinal()] = 173;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr[EnumC16313m0.SCORE_HIDDEN.ordinal()] = 174;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr[EnumC16313m0.SHARE.ordinal()] = 175;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr[EnumC16313m0.BADGE_SILVER.ordinal()] = 176;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr[EnumC16313m0.STRESS_MONITOR_DEFAULT.ordinal()] = 177;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr[EnumC16313m0.STRESS_MONITOR_LOW.ordinal()] = 178;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr[EnumC16313m0.TIME.ordinal()] = 179;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr[EnumC16313m0.TUTORIALS.ordinal()] = 180;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr[EnumC16313m0.NO_USER_INPUT.ordinal()] = 181;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr[EnumC16313m0.VACATION.ordinal()] = 182;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr[EnumC16313m0.WARNING.ordinal()] = 183;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr[EnumC16313m0.WEEKLY_PLAN.ordinal()] = 184;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr[EnumC16313m0.LANGUAGES.ordinal()] = 185;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr[EnumC16313m0.FOLLOWER_SEARCH.ordinal()] = 186;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr[EnumC16313m0.FOLLOWER_SHARE.ordinal()] = 187;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr[EnumC16313m0.FILE.ordinal()] = 188;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr[EnumC16313m0.KEYBOARD.ordinal()] = 189;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr[EnumC16313m0.MICROPHONE.ordinal()] = 190;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr[EnumC16313m0.PICTURE.ordinal()] = 191;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr[EnumC16313m0.TINY_ATTENTION.ordinal()] = 192;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr[EnumC16313m0.TINY_ATTENTION_ORANGE.ordinal()] = 193;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr[EnumC16313m0.TINY_ATTENTION_WHITE.ordinal()] = 194;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr[EnumC16313m0.TINY_BAR_GRAPH.ordinal()] = 195;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr[EnumC16313m0.TINY_BORDERED_CHECKMARK.ordinal()] = 196;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr[EnumC16313m0.TINY_CHECKMARK.ordinal()] = 197;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr[EnumC16313m0.TINY_COLLAPSE.ordinal()] = 198;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr[EnumC16313m0.TINY_CROSS.ordinal()] = 199;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr[EnumC16313m0.TINY_CARET_DOWN.ordinal()] = 200;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr[EnumC16313m0.TINY_ELLIPSE.ordinal()] = 201;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr[EnumC16313m0.TINY_CARET_LEFT.ordinal()] = 202;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr[EnumC16313m0.TINY_CARET_BACKWARD.ordinal()] = 203;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr[EnumC16313m0.TINY_PLAY.ordinal()] = 204;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr[EnumC16313m0.TINY_CARET_RIGHT.ordinal()] = 205;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr[EnumC16313m0.TINY_CARET_FORWARD.ordinal()] = 206;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr[EnumC16313m0.TINY_CHARGING.ordinal()] = 207;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr[EnumC16313m0.TINY_EXPAND.ordinal()] = 208;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr[EnumC16313m0.TINY_HELP.ordinal()] = 209;
            } catch (NoSuchFieldError unused209) {
            }
            try {
                iArr[EnumC16313m0.TINY_INFORMATION.ordinal()] = 210;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr[EnumC16313m0.TINY_PILL.ordinal()] = 211;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr[EnumC16313m0.TINY_TRIANGLE_DOWN.ordinal()] = 212;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr[EnumC16313m0.TINY_TRIANGLE_UP.ordinal()] = 213;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr[EnumC16313m0.TINY_TRAINGLE_UP.ordinal()] = 214;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr[EnumC16313m0.TINY_CARET_UP.ordinal()] = 215;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr[EnumC16313m0.TINY_ARROW_FWD.ordinal()] = 216;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr[EnumC16313m0.TINY_SLEEP.ordinal()] = 217;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr[EnumC16313m0.TINY_STRAP.ordinal()] = 218;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr[EnumC16313m0.TINY_HEART_RATE.ordinal()] = 219;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr[EnumC16313m0.TINY_REFRESH.ordinal()] = 220;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr[EnumC16313m0.BLOOD_OXYGEN.ordinal()] = 221;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr[EnumC16313m0.SAGE.ordinal()] = 222;
            } catch (NoSuchFieldError unused222) {
            }
            try {
                iArr[EnumC16313m0.ECG.ordinal()] = 223;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr[EnumC16313m0.FAST_PACE_OF_AGING.ordinal()] = 224;
            } catch (NoSuchFieldError unused224) {
            }
            try {
                iArr[EnumC16313m0.OMRON.ordinal()] = 225;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr[EnumC16313m0.PACE_OF_AGING.ordinal()] = 226;
            } catch (NoSuchFieldError unused226) {
            }
            try {
                iArr[EnumC16313m0.POSTPARTUM.ordinal()] = 227;
            } catch (NoSuchFieldError unused227) {
            }
            try {
                iArr[EnumC16313m0.PREGNANCY_FIRST_TRIMESTER.ordinal()] = 228;
            } catch (NoSuchFieldError unused228) {
            }
            try {
                iArr[EnumC16313m0.PREGNANCY_SECOND_TRIMESTER.ordinal()] = 229;
            } catch (NoSuchFieldError unused229) {
            }
            try {
                iArr[EnumC16313m0.PREGNANCY_THIRD_TRIMESTER.ordinal()] = 230;
            } catch (NoSuchFieldError unused230) {
            }
            try {
                iArr[EnumC16313m0.SEGMENTAL_BODY_COMP.ordinal()] = 231;
            } catch (NoSuchFieldError unused231) {
            }
            try {
                iArr[EnumC16313m0.SEGMENTAL_BODY_COMPOSITION.ordinal()] = 232;
            } catch (NoSuchFieldError unused232) {
            }
            try {
                iArr[EnumC16313m0.BLOOD_PRESSURE.ordinal()] = 233;
            } catch (NoSuchFieldError unused233) {
            }
            try {
                iArr[EnumC16313m0.CHOLESTEROL.ordinal()] = 234;
            } catch (NoSuchFieldError unused234) {
            }
            try {
                iArr[EnumC16313m0.HBA1C.ordinal()] = 235;
            } catch (NoSuchFieldError unused235) {
            }
            try {
                iArr[EnumC16313m0.SHEPHERD.ordinal()] = 236;
            } catch (NoSuchFieldError unused236) {
            }
            try {
                iArr[EnumC16313m0.SINGLE_BABY.ordinal()] = 237;
            } catch (NoSuchFieldError unused237) {
            }
            try {
                iArr[EnumC16313m0.SLOW_PACE_OF_AGING.ordinal()] = 238;
            } catch (NoSuchFieldError unused238) {
            }
            try {
                iArr[EnumC16313m0.TRIPLETS_OR_MORE.ordinal()] = 239;
            } catch (NoSuchFieldError unused239) {
            }
            try {
                iArr[EnumC16313m0.TWINS.ordinal()] = 240;
            } catch (NoSuchFieldError unused240) {
            }
            try {
                iArr[EnumC16313m0.WEIGHT.ordinal()] = 241;
            } catch (NoSuchFieldError unused241) {
            }
            try {
                iArr[EnumC16313m0.WHOOP_AGE.ordinal()] = 242;
            } catch (NoSuchFieldError unused242) {
            }
            try {
                iArr[EnumC16313m0.CREAMY_CERVICAL_MUCUS.ordinal()] = 243;
            } catch (NoSuchFieldError unused243) {
            }
            try {
                iArr[EnumC16313m0.DRY_CERVICAL_MUCUS.ordinal()] = 244;
            } catch (NoSuchFieldError unused244) {
            }
            try {
                iArr[EnumC16313m0.EGG_WHITE_CERVICAL_MUCUS.ordinal()] = 245;
            } catch (NoSuchFieldError unused245) {
            }
            try {
                iArr[EnumC16313m0.GLUE_LIKE_CERVICAL_MUCUS.ordinal()] = 246;
            } catch (NoSuchFieldError unused246) {
            }
            try {
                iArr[EnumC16313m0.HEAVY_PERIOD_FLOW.ordinal()] = 247;
            } catch (NoSuchFieldError unused247) {
            }
            try {
                iArr[EnumC16313m0.INTRAUTERINE_DEVICE.ordinal()] = 248;
            } catch (NoSuchFieldError unused248) {
            }
            try {
                iArr[EnumC16313m0.LIGHT_PERIOD_FLOW.ordinal()] = 249;
            } catch (NoSuchFieldError unused249) {
            }
            try {
                iArr[EnumC16313m0.MEDIUM_PERIOD_FLOW.ordinal()] = 250;
            } catch (NoSuchFieldError unused250) {
            }
            try {
                iArr[EnumC16313m0.NONE_PERIOD_FLOW.ordinal()] = 251;
            } catch (NoSuchFieldError unused251) {
            }
            try {
                iArr[EnumC16313m0.SOMETHING_WRONG_CERVICAL_MUCUS.ordinal()] = 252;
            } catch (NoSuchFieldError unused252) {
            }
            try {
                iArr[EnumC16313m0.SPOTTING_CERVICAL_MUCUS.ordinal()] = 253;
            } catch (NoSuchFieldError unused253) {
            }
            try {
                iArr[EnumC16313m0.SPOTTING_FLOW.ordinal()] = 254;
            } catch (NoSuchFieldError unused254) {
            }
            try {
                iArr[EnumC16313m0.STICKY_CERVICAL_MUCUS.ordinal()] = 255;
            } catch (NoSuchFieldError unused255) {
            }
            try {
                iArr[EnumC16313m0.WATERY_CERVICAL_MUCUS.ordinal()] = 256;
            } catch (NoSuchFieldError unused256) {
            }
            try {
                iArr[EnumC16313m0.IN_THE_GREEN.ordinal()] = 257;
            } catch (NoSuchFieldError unused257) {
            }
            try {
                iArr[EnumC16313m0.START_STRONG.ordinal()] = 258;
            } catch (NoSuchFieldError unused258) {
            }
            try {
                iArr[EnumC16313m0.SLEEP_RIGHT.ordinal()] = 259;
            } catch (NoSuchFieldError unused259) {
            }
            try {
                iArr[EnumC16313m0.TRY_DRY.ordinal()] = 260;
            } catch (NoSuchFieldError unused260) {
            }
            try {
                iArr[EnumC16313m0.PICKER.ordinal()] = 261;
            } catch (NoSuchFieldError unused261) {
            }
            try {
                iArr[EnumC16313m0.THUMB_UP.ordinal()] = 262;
            } catch (NoSuchFieldError unused262) {
            }
            try {
                iArr[EnumC16313m0.THUMB_UP_FILLED.ordinal()] = 263;
            } catch (NoSuchFieldError unused263) {
            }
            try {
                iArr[EnumC16313m0.THUMB_DOWN.ordinal()] = 264;
            } catch (NoSuchFieldError unused264) {
            }
            try {
                iArr[EnumC16313m0.THUMB_DOWN_FILLED.ordinal()] = 265;
            } catch (NoSuchFieldError unused265) {
            }
            f62693a = iArr;
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int toWhoopIcon() {
        switch (a.f62693a[ordinal()]) {
            case 1:
                return C38072d.f163053a.m121951d().getAction().getAdd();
            case 2:
                return C38072d.f163053a.m121951d().getAction().getCheckMark();
            case 3:
                return C38072d.f163053a.m121951d().getAction().getCopy();
            case 4:
                return AbstractC39383f.m125595a(C38072d.f163053a);
            case 5:
                return C38072d.f163053a.m121951d().getAction().getCustomize();
            case 6:
                return C38072d.f163053a.m121951d().getAction().getDelete();
            case 7:
                return AbstractC25012a.m73365A(C38072d.f163053a);
            case 8:
                return C38072d.f163053a.m121951d().getAction().getEmail();
            case 9:
            case 10:
                return C38072d.f163053a.m121951d().getAction().getJournal();
            case 11:
                return AbstractC25012a.m73365A(C38072d.f163053a);
            case 12:
                return C38072d.f163053a.m121951d().getAction().getRemove();
            case 13:
                return C38072d.f163053a.m121951d().getAction().getSearch();
            case 14:
                return C38072d.f163053a.m121951d().getAction().getStartActivity();
            case 15:
                return C38072d.f163053a.m121951d().getAction().getUndo();
            case 16:
                return C38072d.f163053a.m121951d().getAction().getFilter();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C38072d.f163053a.m121951d().getAction().getUpload();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C38072d.f163053a.m121951d().getActivities().getOther();
            case 20:
                return C38072d.f163053a.m121951d().getActivities().getWeightlifting();
            case 21:
                return C38072d.f163053a.m121951d().getActivities().getRunning();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C38072d.f163053a.m121951d().getConnections().getBluetooth();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C38072d.f163053a.m121951d().getConnections().getChargingCable();
            case 24:
                return C38072d.f163053a.m121951d().getConnections().getChargingPhone();
            case 25:
                return C38072d.f163053a.m121951d().getConnections().getNoNetwork();
            case 26:
                return C38072d.f163053a.m121951d().getConnections().getIntegrations();
            case 27:
                return AbstractC11895b.m31985d(C38072d.f163053a);
            case 28:
                return C38072d.f163053a.m121951d().getLogo().getWhoopText();
            case 29:
                return AbstractC11895b.m31985d(C38072d.f163053a);
            case 30:
                return C38072d.f163053a.m121951d().getLogo().getWhoopProRounded();
            case 31:
                return C38072d.f163053a.m121951d().getLogo().getWhoop();
            case 32:
                return C38072d.f163053a.m121951d().getLogo().getWhoopRoundArrows();
            case 33:
                return C38072d.f163053a.m121951d().getNavigation().getArrowBackward();
            case 34:
                return C38072d.f163053a.m121951d().getNavigation().getArrowBackward();
            case 35:
                return AbstractC18489d0.m53359E(C38072d.f163053a);
            case 36:
                return AbstractC18489d0.m53359E(C38072d.f163053a);
            case 37:
                return C38072d.f163053a.m121951d().getNavigation().getCalendar();
            case 38:
                return C38072d.f163053a.m121951d().getNavigation().getCamera();
            case 39:
                return C38072d.f163053a.m121951d().getNavigation().getCaretDown();
            case 40:
                return AbstractC18489d0.m53357C(C38072d.f163053a);
            case 41:
                return AbstractC18489d0.m53357C(C38072d.f163053a);
            case 42:
                return AbstractC11895b.m31981D(C38072d.f163053a);
            case 43:
                return AbstractC11895b.m31981D(C38072d.f163053a);
            case 44:
                return C38072d.f163053a.m121951d().getNavigation().getCaretUp();
            case 45:
                return C38072d.f163053a.m121951d().getNavigation().getCoach();
            case 46:
                return C38072d.f163053a.m121951d().getNavigation().getCommunity();
            case 47:
                return C38072d.f163053a.m121951d().getNavigation().getDotMenu();
            case 48:
                return C38072d.f163053a.m121951d().getNavigation().getHealth();
            case 49:
                return C38072d.f163053a.m121951d().getNavigation().getHome();
            case 50:
                return C38072d.f163053a.m121951d().getNavigation().getMenu();
            case 51:
                return C38072d.f163053a.m121951d().getNavigation().getMonthlyPA();
            case 52:
                return C38072d.f163053a.m121951d().getNavigation().getProfile();
            case 53:
                return C38072d.f163053a.m121951d().getNavigation().getSettings();
            case 54:
                return C38072d.f163053a.m121951d().getNavigation().getSleepCoach();
            case 55:
                return C38072d.f163053a.m121951d().getNavigation().getStrainCoach();
            case 56:
                return C38072d.f163053a.m121951d().getNavigation().getZoomIn();
            case 57:
                return C38072d.f163053a.m121951d().getNavigation().getZoomOut();
            case 58:
            case 59:
                return C38072d.f163053a.m121951d().getRecovery().getHrvOutline();
            case 60:
                return C38072d.f163053a.m121951d().getRecovery().getHrvMax();
            case 61:
                return C38072d.f163053a.m121951d().getRecovery().getHrvMin();
            case 62:
                return C38072d.f163053a.m121951d().getRecovery().getMenstrualCycle();
            case 63:
                return C38072d.f163053a.m121951d().getRecovery().getMaxHeartRate();
            case 64:
                return C38072d.f163053a.m121951d().getRecovery().getRecovery();
            case 65:
                return C38072d.f163053a.m121951d().getRecovery().getRespiratoryRate();
            case 66:
                return C38072d.f163053a.m121951d().getRecovery().getRhr();
            case 67:
                return C38072d.f163053a.m121951d().getRecovery().getSkinTemperature();
            case 68:
                return C38072d.f163053a.m121951d().getStrain().getCalories();
            case 69:
                return C38072d.f163053a.m121951d().getStrain().getHeartRate();
            case 70:
                return C38072d.f163053a.m121951d().getStrain().getHrZones3();
            case 71:
                return C38072d.f163053a.m121951d().getStrain().getHrZones4_5();
            case 72:
                return C38072d.f163053a.m121951d().getStrain().getHrZone1();
            case 73:
                return C38072d.f163053a.m121951d().getStrain().getHrZone2();
            case 74:
                return C38072d.f163053a.m121951d().getStrain().getHrZone3();
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                return C38072d.f163053a.m121951d().getStrain().getHrZone4();
            case 76:
                return C38072d.f163053a.m121951d().getStrain().getHrZone5();
            case 77:
                return C38072d.f163053a.m121951d().getStrain().getHrZonesTraining();
            case 78:
                return C38072d.f163053a.m121951d().getStrain().getList();
            case 79:
                return C38072d.f163053a.m121951d().getStrain().getSteps();
            case 80:
                return C38072d.f163053a.m121951d().getStrain().getStrain();
            case 81:
                return C38072d.f163053a.m121951d().getStrain().getTonnage();
            case 82:
                return C38072d.f163053a.m121951d().getStrain().getSuperset();
            case 83:
                return C38072d.f163053a.m121951d().getStrain().getTonnage();
            case 84:
                return C38072d.f163053a.m121951d().getStrain().getTotalVolumeLoad();
            case 85:
                return C38072d.f163053a.m121951d().getStrain().getVo2Max();
            case 86:
                return C38072d.f163053a.m121951d().getSleep().getBedtime();
            case 87:
                return C38072d.f163053a.m121951d().getSleep().getConsistency();
            case 88:
                return C38072d.f163053a.m121951d().getSleep().getDisturbances();
            case 89:
                return C38072d.f163053a.m121951d().getSleep().getDuration();
            case 90:
                return C38072d.f163053a.m121951d().getSleep().getEfficiency();
            case 91:
                return C38072d.f163053a.m121951d().getSleep().getHoursOfSleep();
            case 92:
                return C38072d.f163053a.m121951d().getSleep().getLatency();
            case 93:
                return C38072d.f163053a.m121951d().getSleep().getNap();
            case 94:
                return AbstractC25012a.m73369b(C38072d.f163053a);
            case 95:
                return C38072d.f163053a.m121951d().getSleep().getConsistency();
            case 96:
                return C38072d.f163053a.m121951d().getSleep().getSleepCycle();
            case 97:
                return C38072d.f163053a.m121951d().getSleep().getSleepDebt();
            case 98:
                return C38072d.f163053a.m121951d().getSleep().getSleepNeed();
            case LogPriority.NONE /* 99 */:
                return C38072d.f163053a.m121951d().getSleep().getSun();
            case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
                return C38072d.f163053a.m121951d().getSleep().getWaketime();
            case 101:
                return C38072d.f163053a.m121951d().getGrowth().getAdvancedLabsSettings();
            case 102:
                return C38072d.f163053a.m121951d().getGrowth().getBarsChart();
            case 103:
                return C38072d.f163053a.m121951d().getGrowth().getCancelMembership();
            case 104:
                return C38072d.f163053a.m121951d().getGrowth().getChat();
            case 105:
                return C38072d.f163053a.m121951d().getGrowth().getChatBubble();
            case 106:
                return C38072d.f163053a.m121951d().getGrowth().getChatWithRedDot();
            case 107:
                return C38072d.f163053a.m121951d().getGrowth().getCreditCard();
            case 108:
                return C38072d.f163053a.m121951d().getGrowth().getDiscount();
            case 109:
                return C38072d.f163053a.m121951d().getGrowth().getExpires();
            case 110:
                return C38072d.f163053a.m121951d().getGrowth().getExtendMembership();
            case 111:
                return C38072d.f163053a.m121951d().getGrowth().getGift();
            case 112:
                return C38072d.f163053a.m121951d().getGrowth().getGiftCard();
            case 113:
                return C38072d.f163053a.m121951d().getGrowth().getHsaFsa();
            case 114:
                return C38072d.f163053a.m121951d().getGrowth().getKey();
            case 115:
                return C38072d.f163053a.m121951d().getGrowth().getMembershipManagement();
            case 116:
                return C38072d.f163053a.m121951d().getGrowth().getMxmSupport();
            case 117:
                return C38072d.f163053a.m121951d().getGrowth().getNaturalCycles();
            case 118:
                return C38072d.f163053a.m121951d().getGrowth().getNewArrivals();
            case 119:
                return C38072d.f163053a.m121951d().getGrowth().getReferral();
            case 120:
                return C38072d.f163053a.m121951d().getGrowth().getReport();
            case 121:
                return C38072d.f163053a.m121951d().getGrowth().getRestore();
            case 122:
                return C38072d.f163053a.m121951d().getGrowth().getReturnIcon();
            case 123:
                return C38072d.f163053a.m121951d().getGrowth().getSelectedCheck();
            case 124:
                return C38072d.f163053a.m121951d().getGrowth().getSend();
            case 125:
                return C38072d.f163053a.m121951d().getGrowth().getShipping();
            case 126:
                return C38072d.f163053a.m121951d().getGrowth().getShippingBox();
            case 127:
                return C38072d.f163053a.m121951d().getGrowth().getShoppingCart();
            case 128:
                return C38072d.f163053a.m121951d().getGrowth().getAdvancedLabs();
            case 129:
                return C38072d.f163053a.m121951d().getGrowth().getMxmSupport();
            case 130:
                return C38072d.f163053a.m121951d().getStrap().getStrap();
            case 131:
                return C38072d.f163053a.m121951d().getStrap().getRemoveStrap();
            case 132:
                return C38072d.f163053a.m121951d().getStrap().getStrapCutout();
            case 133:
                return C38072d.f163053a.m121951d().getStrap().getStrapVibration();
            case 134:
                return C38072d.f163053a.m121951d().getStrap().getStrapSettings();
            case 135:
                return C38072d.f163053a.m121951d().getStrap().getPairStrap();
            case 136:
                return C38072d.f163053a.m121951d().getVarious().getAdvice();
            case 137:
                return C38072d.f163053a.m121951d().getVarious().getAiSparkle();
            case 138:
                return C38072d.f163053a.m121951d().getVarious().getAlertCircle();
            case 139:
                return C38072d.f163053a.m121951d().getVarious().getArticle();
            case 140:
                return C38072d.f163053a.m121951d().getVarious().getBadgeBronze();
            case 141:
                return C38072d.f163053a.m121951d().getVarious().getTeamBrowse();
            case 142:
                return C38072d.f163053a.m121951d().getVarious().getData();
            case 143:
                return C38072d.f163053a.m121951d().getVarious().getDiagnosticData();
            case 144:
                return C38072d.f163053a.m121951d().getVarious().getDownload();
            case 145:
                return C38072d.f163053a.m121951d().getVarious().getDrag();
            case 146:
                return C38072d.f163053a.m121951d().getVarious().getEducation();
            case 147:
                return C38072d.f163053a.m121951d().getVarious().getFeelBetter();
            case 148:
                return C38072d.f163053a.m121951d().getVarious().getFirmware();
            case 149:
                return C38072d.f163053a.m121951d().getVarious().getFoundingMember();
            case 150:
                return C38072d.f163053a.m121951d().getVarious().getGoals();
            case 151:
                return C38072d.f163053a.m121951d().getVarious().getBadgeGold();
            case 152:
                return C38072d.f163053a.m121951d().getVarious().getHelpCenter();
            case 153:
                return C38072d.f163053a.m121951d().getVarious().getId();
            case 154:
                return C38072d.f163053a.m121951d().getVarious().getIncognito();
            case 155:
                return C38072d.f163053a.m121951d().getVarious().getJumpstart();
            case 156:
                return C38072d.f163053a.m121951d().getVarious().getLibra();
            case 157:
                return C38072d.f163053a.m121951d().getVarious().getLocation();
            case 158:
                return C38072d.f163053a.m121951d().getVarious().getLocationPin();
            case 159:
                return C38072d.f163053a.m121951d().getVarious().getLocked();
            case 160:
                return C38072d.f163053a.m121951d().getVarious().getLookBetter();
            case 161:
                return C38072d.f163053a.m121951d().getVarious().getMedicine();
            case 162:
                return C38072d.f163053a.m121951d().getVarious().getMembersLikeYou();
            case 163:
                return C38072d.f163053a.m121951d().getVarious().getMissingData();
            case 164:
                return C38072d.f163053a.m121951d().getVarious().getMyAccount();
            case 165:
                return C38072d.f163053a.m121951d().getVarious().getNotesAi();
            case 166:
                return C38072d.f163053a.m121951d().getVarious().getNotesEdit();
            case 167:
                return C38072d.f163053a.m121951d().getVarious().getNotifications();
            case DateTimeConstants.HOURS_PER_WEEK /* 168 */:
                return C38072d.f163053a.m121951d().getVarious().getPerform();
            case 169:
                return C38072d.f163053a.m121951d().getVarious().getPhone();
            case 170:
                return C38072d.f163053a.m121951d().getVarious().getPodcast();
            case 171:
                return C38072d.f163053a.m121951d().getHealth().getPregnancy();
            case 172:
                return C38072d.f163053a.m121951d().getVarious().getPrivacy2();
            case 173:
                return C38072d.f163053a.m121951d().getVarious().getPrivacySettings();
            case 174:
                return C38072d.f163053a.m121951d().getVarious().getStealthMode();
            case 175:
                return C38072d.f163053a.m121951d().getVarious().getShare();
            case 176:
                return C38072d.f163053a.m121951d().getVarious().getBadgeSilver();
            case 177:
                return C38072d.f163053a.m121951d().getVarious().getStressMonitor();
            case 178:
                return C38072d.f163053a.m121951d().getVarious().getStressMonitorLow();
            case 179:
                return C38072d.f163053a.m121951d().getVarious().getTime();
            case 180:
                return C38072d.f163053a.m121951d().getVarious().getTutorials();
            case 181:
                return C38072d.f163053a.m121951d().getVarious().getNoUserInput();
            case 182:
                return C38072d.f163053a.m121951d().getVarious().getVacation();
            case 183:
                return C38072d.f163053a.m121951d().getVarious().getWarning();
            case 184:
                return C38072d.f163053a.m121951d().getVarious().getWeeklyPlan();
            case 185:
                return C38072d.f163053a.m121951d().getVarious().getLanguages();
            case 186:
                return C38072d.f163053a.m121951d().getVarious().getFollowerSearch();
            case 187:
                return C38072d.f163053a.m121951d().getVarious().getFollowerShare();
            case 188:
                return C38072d.f163053a.m121951d().getVarious().getFile();
            case 189:
                return C38072d.f163053a.m121951d().getVarious().getKeyboard();
            case 190:
                return C38072d.f163053a.m121951d().getVarious().getMicrophone();
            case 191:
                return C38072d.f163053a.m121951d().getVarious().getPicture();
            case 192:
                return AbstractC18489d0.m53362c(C38072d.f163053a);
            case 193:
                return C38072d.f163053a.m121951d().getTinyIcons().getAttentionOrange();
            case 194:
                return C38072d.f163053a.m121951d().getTinyIcons().getAttentionWhite();
            case 195:
                return C38072d.f163053a.m121951d().getTinyIcons().getBarGraph();
            case 196:
                return C38072d.f163053a.m121951d().getTinyIcons().getBorderedCheckmark();
            case 197:
                return AbstractC2875y.m8290c(C38072d.f163053a);
            case 198:
                return C38072d.f163053a.m121951d().getTinyIcons().getTinyCollapse();
            case 199:
                return C38072d.f163053a.m121951d().getTinyIcons().getCross();
            case 200:
                return C38072d.f163053a.m121951d().getTinyIcons().getDownArrow();
            case 201:
                return C38072d.f163053a.m121951d().getTinyIcons().getEllipse();
            case 202:
                return C38072d.f163053a.m121951d().getTinyIcons().getBackwardArrow();
            case 203:
                return C38072d.f163053a.m121951d().getTinyIcons().getBackwardArrow();
            case 204:
                return C38072d.f163053a.m121951d().getTinyIcons().getPlay();
            case 205:
                return C38072d.f163053a.m121951d().getTinyIcons().getForwardArrow();
            case 206:
                return C38072d.f163053a.m121951d().getTinyIcons().getForwardArrow();
            case 207:
                return C38072d.f163053a.m121951d().getTinyIcons().getTinyCharging();
            case 208:
                return C38072d.f163053a.m121951d().getTinyIcons().getTinyExpand();
            case 209:
                return C38072d.f163053a.m121951d().getTinyIcons().getTinyHelp();
            case 210:
                return C38072d.f163053a.m121951d().getTinyIcons().getTinyInformation();
            case 211:
                return C38072d.f163053a.m121951d().getTinyIcons().getPill();
            case 212:
                return C38072d.f163053a.m121951d().getTinyIcons().getTriangleDown();
            case 213:
                return C38072d.f163053a.m121951d().getTinyIcons().getTriangleUp();
            case 214:
                return C38072d.f163053a.m121951d().getTinyIcons().getTriangleUp();
            case 215:
                return C38072d.f163053a.m121951d().getTinyIcons().getUpArrow();
            case 216:
                return AbstractC18489d0.m53359E(C38072d.f163053a);
            case 217:
                return C38072d.f163053a.m121951d().getTinyIcons().getTinySleep();
            case 218:
                return C38072d.f163053a.m121951d().getTinyIcons().getTinyStrap();
            case 219:
                return C38072d.f163053a.m121951d().getTinyIcons().getTinyHeartRate();
            case 220:
                return C38072d.f163053a.m121951d().getTinyIcons().getRefresh();
            case 221:
                return C38072d.f163053a.m121951d().getVarious().getBloodOxygen();
            case 222:
                return C38072d.f163053a.m121951d().getHealth().getSage();
            case 223:
                return C38072d.f163053a.m121951d().getHealth().getLabrador();
            case 224:
                return C38072d.f163053a.m121951d().getHealth().getFastPaceOfAging();
            case 225:
                return C38072d.f163053a.m121951d().getHealth().getOmron();
            case 226:
                return C38072d.f163053a.m121951d().getHealth().getPaceOfAging();
            case 227:
                return C38072d.f163053a.m121951d().getHealth().getPostpartum();
            case 228:
                return C38072d.f163053a.m121951d().getHealth().getPregnancyFirstTrimester();
            case 229:
                return C38072d.f163053a.m121951d().getHealth().getPregnancySecondTrimester();
            case 230:
                return C38072d.f163053a.m121951d().getHealth().getPregnancyThirdTrimester();
            case 231:
                return C38072d.f163053a.m121951d().getHealth().getSegmentalBodyComposition();
            case 232:
                return C38072d.f163053a.m121951d().getHealth().getSegmentalBodyComposition();
            case 233:
                return C38072d.f163053a.m121951d().getHealth().getBloodPressure();
            case 234:
                return C38072d.f163053a.m121951d().getHealth().getCholesterol();
            case 235:
                return C38072d.f163053a.m121951d().getHealth().getHba1c();
            case 236:
                return C38072d.f163053a.m121951d().getHealth().getShepherd();
            case 237:
                return C38072d.f163053a.m121951d().getHealth().getSingleBaby();
            case 238:
                return C38072d.f163053a.m121951d().getHealth().getSlowPaceOfAging();
            case 239:
                return C38072d.f163053a.m121951d().getHealth().getTripletsOrMore();
            case 240:
                return C38072d.f163053a.m121951d().getHealth().getTwins();
            case 241:
                return C38072d.f163053a.m121951d().getHealth().getWeight();
            case 242:
                return C38072d.f163053a.m121951d().getHealth().getWhoopAge();
            case 243:
                return C38072d.f163053a.m121951d().getHormonalHealth().getCreamyCervicalMucus();
            case 244:
                return C38072d.f163053a.m121951d().getHormonalHealth().getDryCervicalMucus();
            case 245:
                return C38072d.f163053a.m121951d().getHormonalHealth().getEggWhiteCervicalMucus();
            case 246:
                return C38072d.f163053a.m121951d().getHormonalHealth().getGlueLikeCervicalMucus();
            case 247:
                return C38072d.f163053a.m121951d().getHormonalHealth().getHeavyPeriodFlow();
            case 248:
                return C38072d.f163053a.m121951d().getHormonalHealth().getIntrauterineDevice();
            case 249:
                return C38072d.f163053a.m121951d().getHormonalHealth().getLightPeriodFlow();
            case AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                return C38072d.f163053a.m121951d().getHormonalHealth().getMediumPeriodFlow();
            case 251:
                return C38072d.f163053a.m121951d().getHormonalHealth().getNonePeriodFlow();
            case 252:
                return C38072d.f163053a.m121951d().getHormonalHealth().getSomethingWrongCervicalMucus();
            case 253:
                return C38072d.f163053a.m121951d().getHormonalHealth().getSpottingCervicalMucus();
            case 254:
                return C38072d.f163053a.m121951d().getHormonalHealth().getSpottingFlow();
            case 255:
                return C38072d.f163053a.m121951d().getHormonalHealth().getStickyCervicalMucus();
            case 256:
                return C38072d.f163053a.m121951d().getHormonalHealth().getWateryCervicalMucus();
            case 257:
                return C38072d.f163053a.m121951d().getPlan().getInTheGreen();
            case 258:
                return C38072d.f163053a.m121951d().getPlan().getStartStrong();
            case 259:
                return C38072d.f163053a.m121951d().getPlan().getSleepRight();
            case 260:
                return C38072d.f163053a.m121951d().getPlan().getTryDry();
            case 261:
                return C38072d.f163053a.m121951d().getHealth().getPicker();
            case 262:
                return C38072d.f163053a.m121951d().getVarious().getThumbUp();
            case 263:
                return C38072d.f163053a.m121951d().getVarious().getFeedbackThumbsUp();
            case 264:
                return C38072d.f163053a.m121951d().getVarious().getThumbDown();
            case 265:
                return C38072d.f163053a.m121951d().getVarious().getFeedbackThumbsDown();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
