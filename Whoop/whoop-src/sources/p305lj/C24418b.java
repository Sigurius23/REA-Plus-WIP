package p305lj;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.types.BannerPlacement;
import com.amplitude.android.engagement.types.BannerPosition;
import com.amplitude.android.engagement.types.ButtonType;
import com.amplitude.android.engagement.types.ContentAlignment;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.FormFactorType;
import com.amplitude.android.engagement.types.GoalType;
import com.amplitude.android.engagement.types.IconType;
import com.amplitude.android.engagement.types.LinkOperation;
import com.amplitude.android.engagement.types.MarkerType;
import com.amplitude.android.engagement.types.MatchType;
import com.amplitude.android.engagement.types.NudgePosition;
import com.amplitude.android.engagement.types.NudgeStepLayout;
import com.amplitude.android.engagement.types.NudgeType;
import com.amplitude.android.engagement.types.OperatorType;
import com.amplitude.android.engagement.types.PinAlignment;
import com.amplitude.android.engagement.types.PinPointerType;
import com.amplitude.android.engagement.types.PinPosition;
import com.amplitude.android.engagement.types.PopoverPosition;
import com.amplitude.android.engagement.types.SimpleNudgeTriggerType;
import com.amplitude.android.engagement.types.SnoozeInterval;
import com.amplitude.android.engagement.types.StepCounterFormat;
import com.amplitude.android.engagement.types.SurveyRatingType;
import com.amplitude.android.engagement.types.TooltipPointerType;
import com.amplitude.android.engagement.types.TooltipPosition;
import com.amplitude.android.engagement.types.TooltipShowOn;
import com.amplitude.android.engagement.types.TriggerSourceType;
import com.amplitude.android.engagement.types.TriggerType;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumsKt;
import live.hms.video.utils.HMSConstantsKt;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: lj.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C24418b extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public static final C24418b f95286E;

    /* JADX INFO: renamed from: F */
    public static final C24418b f95287F;

    /* JADX INFO: renamed from: G */
    public static final C24418b f95288G;

    /* JADX INFO: renamed from: H */
    public static final C24418b f95289H;

    /* JADX INFO: renamed from: I */
    public static final C24418b f95290I;

    /* JADX INFO: renamed from: J */
    public static final C24418b f95291J;

    /* JADX INFO: renamed from: K */
    public static final C24418b f95292K;

    /* JADX INFO: renamed from: L */
    public static final C24418b f95293L;

    /* JADX INFO: renamed from: M */
    public static final C24418b f95294M;

    /* JADX INFO: renamed from: N */
    public static final C24418b f95295N;

    /* JADX INFO: renamed from: O */
    public static final C24418b f95296O;

    /* JADX INFO: renamed from: P */
    public static final C24418b f95297P;

    /* JADX INFO: renamed from: Q */
    public static final C24418b f95298Q;

    /* JADX INFO: renamed from: R */
    public static final C24418b f95299R;

    /* JADX INFO: renamed from: S */
    public static final C24418b f95300S;

    /* JADX INFO: renamed from: T */
    public static final C24418b f95301T;

    /* JADX INFO: renamed from: U */
    public static final C24418b f95302U;

    /* JADX INFO: renamed from: V */
    public static final C24418b f95303V;

    /* JADX INFO: renamed from: W */
    public static final C24418b f95304W;

    /* JADX INFO: renamed from: X */
    public static final C24418b f95305X;

    /* JADX INFO: renamed from: Y */
    public static final C24418b f95306Y;

    /* JADX INFO: renamed from: Z */
    public static final C24418b f95307Z;

    /* JADX INFO: renamed from: a0 */
    public static final C24418b f95308a0;

    /* JADX INFO: renamed from: b0 */
    public static final C24418b f95309b0;

    /* JADX INFO: renamed from: c0 */
    public static final C24418b f95310c0;

    /* JADX INFO: renamed from: x */
    public static final C24418b f95311x;

    /* JADX INFO: renamed from: y */
    public static final C24418b f95312y;

    /* JADX INFO: renamed from: z */
    public static final C24418b f95313z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95314w;

    static {
        int i13 = 0;
        f95311x = new C24418b(i13, 0);
        f95312y = new C24418b(i13, 1);
        f95313z = new C24418b(i13, 2);
        f95286E = new C24418b(i13, 3);
        f95287F = new C24418b(i13, 4);
        f95288G = new C24418b(i13, 5);
        f95289H = new C24418b(i13, 6);
        f95290I = new C24418b(i13, 7);
        f95291J = new C24418b(i13, 8);
        f95292K = new C24418b(i13, 9);
        f95293L = new C24418b(i13, 10);
        f95294M = new C24418b(i13, 11);
        f95295N = new C24418b(i13, 12);
        f95296O = new C24418b(i13, 13);
        f95297P = new C24418b(i13, 14);
        f95298Q = new C24418b(i13, 15);
        f95299R = new C24418b(i13, 16);
        f95300S = new C24418b(i13, 17);
        f95301T = new C24418b(i13, 18);
        f95302U = new C24418b(i13, 19);
        f95303V = new C24418b(i13, 20);
        f95304W = new C24418b(i13, 21);
        f95305X = new C24418b(i13, 22);
        f95306Y = new C24418b(i13, 23);
        f95307Z = new C24418b(i13, 24);
        f95308a0 = new C24418b(i13, 25);
        f95309b0 = new C24418b(i13, 26);
        f95310c0 = new C24418b(i13, 27);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24418b(int i13, int i14) {
        super(i13);
        this.f95314w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95314w) {
            case 0:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.BannerPlacement", BannerPlacement.values(), new String[]{HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "overlay"}, new Annotation[][]{null, null}, null);
            case 1:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.BannerPosition", BannerPosition.values(), new String[]{"top", "bottom"}, new Annotation[][]{null, null}, null);
            case 2:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.ButtonType", ButtonType.values(), new String[]{"primary", "secondary", "snooze", "tertiary"}, new Annotation[][]{null, null, null, null}, null);
            case 3:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.ContentAlignment", ContentAlignment.values(), new String[]{"start", "center", "end"}, new Annotation[][]{null, null, null}, null);
            case 4:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.DebugStatus", DebugStatus.values(), new String[]{"success", "warning", "info", "error"}, new Annotation[][]{null, null, null, null}, null);
            case 5:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.FormFactorType", FormFactorType.values(), new String[]{"modal", "popover", "banner", "pin", "tooltip"}, new Annotation[][]{null, null, null, null, null}, null);
            case 6:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.GoalType", GoalType.values(), new String[]{"page_visited", "element_clicked", "cta_clicked", "event_tracked", "unknown"}, new Annotation[][]{null, null, null, null, null}, null);
            case 7:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.IconType", IconType.values(), new String[]{"helpCircle", "helpSquare", "infoCircle", "bookClosed", "lightBulb", "lightning"}, new Annotation[][]{null, null, null, null, null, null}, null);
            case 8:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.LinkOperation", LinkOperation.values(), new String[]{"router", ProfileAnalyticsKt.SELF, "blank"}, new Annotation[][]{null, null, null}, null);
            case 9:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.MarkerType", MarkerType.values(), new String[]{"beacon", "icon", "image"}, new Annotation[][]{null, null, null}, null);
            case 10:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.MatchType", MatchType.values(), new String[]{"contains", "endsWith", "exact", "pattern", "regex", "simple", "startsWith"}, new Annotation[][]{null, null, null, null, null, null, null}, null);
            case 11:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.NudgePosition", NudgePosition.values(), new String[]{"bottomRight", "bottomLeft"}, new Annotation[][]{null, null}, null);
            case 12:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.NudgeStepLayout", NudgeStepLayout.values(), new String[]{"classic", "horizontal", "vertical"}, new Annotation[][]{null, null, null}, null);
            case 13:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.NudgeType", NudgeType.values(), new String[]{"survey", "tour", "banner", "tooltip", "checklist", "custom"}, new Annotation[][]{null, null, null, null, null, null}, null);
            case 14:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.OperatorType", OperatorType.values(), new String[]{"eq", "neq", "gt", "lt"}, new Annotation[][]{null, null, null, null}, null);
            case 15:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.PinAlignment", PinAlignment.values(), new String[]{"center", "top", "bottom", "left", "right"}, new Annotation[][]{null, null, null, null, null}, null);
            case 16:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.PinPointerType", PinPointerType.values(), new String[]{"beacon", "arrow"}, new Annotation[][]{null, null}, null);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.PinPosition", PinPosition.values(), new String[]{UserState.Sources.AUTO, "top", "bottom", "left", "right"}, new Annotation[][]{null, null, null, null, null}, null);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.PopoverPosition", PopoverPosition.values(), new String[]{"top-left", "top-right", "top-center", "bottom-right", "bottom-left", "bottom-center", "left-center", "right-center", "center"}, new Annotation[][]{null, null, null, null, null, null, null, null, null}, null);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.SimpleNudgeTriggerType", SimpleNudgeTriggerType.values(), new String[]{"immediately", "smart_delay", "rage_click", "user_confusion", "none"}, new Annotation[][]{null, null, null, null, null}, null);
            case 20:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.SnoozeInterval", SnoozeInterval.values(), new String[]{"hour", "day", "week"}, new Annotation[][]{null, null, null}, null);
            case 21:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.StepCounterFormat", StepCounterFormat.values(), new String[]{"verbose", "numeric", "dots"}, new Annotation[][]{null, null, null}, null);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.SurveyRatingType", SurveyRatingType.values(), new String[]{"emojis", "numbers", "stars", "nps"}, new Annotation[][]{null, null, null, null}, null);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.TooltipPointerType", TooltipPointerType.values(), new String[]{"none", "arrow"}, new Annotation[][]{null, null}, null);
            case 24:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.TooltipPosition", TooltipPosition.values(), new String[]{"left", "right", "inline_left", "inline_right"}, new Annotation[][]{null, null, null, null}, null);
            case 25:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.TooltipShowOn", TooltipShowOn.values(), new String[]{"hover", "click"}, new Annotation[][]{null, null}, null);
            case 26:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.TriggerSourceType", TriggerSourceType.values(), new String[]{"trigger", "debug", "active"}, new Annotation[][]{null, null, null}, null);
            default:
                return EnumsKt.createAnnotatedEnumSerializer("com.amplitude.android.engagement.types.TriggerType", TriggerType.values(), new String[]{"analytics_event", "element_appeared", "element_clicked", "after_time", "direct", "immediately", "active", "smart_delay", "rage_click", "user_confusion", "none"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null}, null);
        }
    }
}
