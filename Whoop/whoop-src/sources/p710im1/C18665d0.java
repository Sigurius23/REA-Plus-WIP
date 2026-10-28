package p710im1;

import a11.C0140r;
import a11.EnumC0123a;
import a11.EnumC0124b;
import ad3.AbstractC0757c;
import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import b11.C2281h;
import c41.AbstractC4125u0;
import c41.AbstractC4145x;
import c41.C4015e2;
import c41.C4018e5;
import c41.C4044i3;
import c41.C4046i5;
import c41.C4069m0;
import c41.C4077n1;
import c41.C4084o1;
import c41.C4092p2;
import c41.C4118t0;
import c41.C4138w;
import c41.C4140w1;
import c41.C4151x5;
import c41.EnumC4033h;
import c41.EnumC4040i;
import c41.InterfaceC4027g0;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.design.util.TextResource;
import com.whoop.home.domain.models.CustomAnimationContainerViewState;
import com.whoop.home.domain.models.DayOneTransitionViewState;
import com.whoop.home.domain.models.DayZeroCardsViewState;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.ChallengeLandingScreenModel;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.HeartScreenerModel;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.PregnancyInsightsScreenModel;
import com.whoop.navigation.PregnancySettingsScreenModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.service.network.model.UserState;
import com.whoop.service.network.model.cycles.Activity;
import com.whoop.service.network.model.cycles.Period;
import com.whoop.util.TrendKey;
import com.whoop.whoopaction.domain.models.Action;
import d11.C11468c;
import d11.C11474i;
import d11.EnumC11472g;
import em1.AbstractC13341o;
import f01.C13851d;
import f01.EnumC13893r;
import fm1.C14600d;
import il1.AbstractC18642s;
import il1.EnumC18623a0;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.Locale;
import k41.C22190d;
import k51.C22204c;
import k71.C22245c0;
import k71.C22256m;
import kd1.EnumC22400l;
import mm1.C25697k;
import nm1.C26838c;
import nm1.EnumC26841f;
import ny0.C27256h;
import ny0.C27264l;
import o01.C27347c;
import o01.EnumC27349e;
import or2.C28169i0;
import org.joda.time.DateTime;
import p000.AbstractC11266d;
import p31.AbstractC28805p;
import p31.C28790a;
import p31.C28796g;
import p31.C28801l;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p741vn1.C36213q;
import qr2.AbstractC30556a;
import r71.C31053c;
import rz0.EnumC31927f;
import s21.C32085h;
import tr2.InterfaceC34116n;
import u71.C34576j;
import um1.AbstractC35087e;
import v71.AbstractC35769j;
import v71.C35768i;
import xz0.C38755f;
import z51.C40101l;
import z51.C40107r;
import z51.EnumC40105p;
import z51.EnumC40108s;

/* JADX INFO: renamed from: im1.d0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 82\u00020\u0001:\u0001IBC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020)2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b*\u0010+J5\u00101\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010$\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00042\u0006\u00104\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010$\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\u00042\u0006\u00104\u001a\u00020=2\u0006\u0010$\u001a\u00020:H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00042\u0006\u00104\u001a\u00020@2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bA\u0010BJ!\u0010E\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020C2\b\u0010\u0012\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bE\u0010FJ)\u0010I\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020G2\u0006\u0010$\u001a\u00020H2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\bI\u0010JJ!\u0010K\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020G2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\bK\u0010LJ!\u0010N\u001a\u00020\u00042\u0006\u0010$\u001a\u00020M2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\bN\u0010OJ)\u0010Q\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020P2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u00042\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u0019\u0010W\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bW\u0010\u001eJ\u0017\u0010Y\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020[2\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b]\u0010^J\u001b\u0010`\u001a\u0004\u0018\u00010_2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b`\u0010aR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\bI\u0010b\u001a\u0004\bc\u0010dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b]\u0010b\u001a\u0004\be\u0010dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bE\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010i¨\u0006j"}, m65681d2 = {"Lim1/d0;", "", "Lkotlin/Function1;", "Lil1/s;", "Ll83/a0;", "onPillarItemClicked", "Lem1/o;", "onItemViewed", "Ltr2/n;", "logger", "Lad3/c;", "json", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ltr2/n;Lad3/c;)V", "Lm91/u;", "viewState", "Lfm1/d;", "homeMetaData", NotificationCompat.CATEGORY_EVENT, "j", "(Lm91/u;Lfm1/d;Ljava/lang/Object;)V", "t", "(Lm91/u;)V", "Lf01/d;", "l", "(Lf01/d;Ljava/lang/Object;Lfm1/d;)V", "Lc41/i5;", "x", "(Lc41/i5;Lfm1/d;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/Object;)V", "La11/b;", "connectivityNavType", "f", "(Ljava/lang/Object;La11/b;)V", "Lcom/whoop/home/domain/models/DayZeroCardsViewState;", "navType", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/home/domain/models/DayZeroCardsViewState;Ljava/lang/Object;Lfm1/d;)V", "r", "(Lfm1/d;)V", "Lvn1/q;", "s", "(Lvn1/q;Ljava/lang/Object;)V", "Lkd1/l;", "Ld11/g;", "ctaTileNavType", "", "activityInternalName", "g", "(Lfm1/d;Lkd1/l;Ld11/g;Ljava/lang/String;)V", "Lk51/c;", "state", "d", "(Lk51/c;)V", "Lc41/t0;", "e", "(Lc41/t0;)V", "Lz51/p;", "u", "(Lz51/p;)V", "Lz51/r;", "v", "(Lz51/r;Lz51/p;)V", "Lp31/p$e;", "q", "(Lp31/p$e;Lfm1/d;)V", "Lc41/m0;", "Lc41/g0;", "c", "(Lc41/m0;Lc41/g0;)V", "Lc41/w;", "Lc41/h;", "a", "(Lc41/w;Lc41/h;Lfm1/d;)V", "k", "(Lc41/w;Lfm1/d;)V", "Lcom/whoop/util/TrendKey;", "i", "(Lcom/whoop/util/TrendKey;Lfm1/d;)V", "Lv71/i;", "o", "(Lv71/i;Lfm1/d;Ljava/lang/Object;)V", "Lny0/h;", "cardButtonState", "m", "(Lny0/h;)V", "n", "Ls21/h;", "p", "(Ls21/h;)V", "Lcom/whoop/navigation/e;", "action", "b", "(Lcom/whoop/navigation/e;)Lcom/whoop/navigation/e;", "Lcom/whoop/navigation/models/GenericInteraction;", "y", "(Ljava/lang/Object;)Lcom/whoop/navigation/models/GenericInteraction;", "Lkotlin/jvm/functions/Function1;", "getOnPillarItemClicked", "()Lkotlin/jvm/functions/Function1;", "getOnItemViewed", "Ltr2/n;", "getLogger", "()Ltr2/n;", "Lad3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18665d0 {

    /* JADX INFO: renamed from: f */
    public static final int f73232f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onPillarItemClicked;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 onItemViewed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: im1.d0$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f73237a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f73238b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f73239c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f73240d;

        static {
            int[] iArr = new int[EnumC0123a.values().length];
            try {
                iArr[EnumC0123a.PROCESS_FW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0123a.RETRY_FW_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0123a.RESET_FW_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0123a.LOCATION_PERMISSION_REQUIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC0123a.LOW_BATTERY_ONCE_A_DAY_DISMISS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC0123a.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f73237a = iArr;
            int[] iArr2 = new int[EnumC11472g.values().length];
            try {
                iArr2[EnumC11472g.TILE_CLICKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC11472g.TILE_DISMISSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f73238b = iArr2;
            int[] iArr3 = new int[EnumC22400l.values().length];
            try {
                iArr3[EnumC22400l.BEHAVIOR_IMPACTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC22400l.HEART_HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC22400l.JOURNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC22400l.SLEEP_GAUGE_HELP.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC22400l.STRAIN_GAUGE_HELP.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[EnumC22400l.RECOVERY_GAUGE_HELP.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[EnumC22400l.NEW_HOME_INTRODUCTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[EnumC22400l.ONBOARDING_TASK_LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[EnumC22400l.ADD_ACTIVITY.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[EnumC22400l.DEVICE_BATTERY.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[EnumC22400l.SLEEP_PILLAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[EnumC22400l.WEEKLY_PLAN_OVERVIEW.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[EnumC22400l.FIRST_WEEK_IN_REVIEW.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[EnumC22400l.YEAR_IN_REVIEW.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[EnumC22400l.COMMUNITY_YEAR_IN_REVIEW.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[EnumC22400l.TRIAL_INFORMATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[EnumC22400l.WHOOP_LABS.ordinal()] = 17;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[EnumC22400l.PREGNANCY_INSIGHTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[EnumC22400l.PREGNANCY_SETTINGS.ordinal()] = 19;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[EnumC22400l.CUSTOMIZE_MY_DASHBOARD.ordinal()] = 20;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[EnumC22400l.NONE.ordinal()] = 21;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[EnumC22400l.REFER_A_FRIEND.ordinal()] = 22;
            } catch (NoSuchFieldError unused30) {
            }
            f73239c = iArr3;
            int[] iArr4 = new int[EnumC4040i.values().length];
            try {
                iArr4[EnumC4040i.PROCESS_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[EnumC4040i.ADD_SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            f73240d = iArr4;
        }
    }

    public C18665d0(Function1 onPillarItemClicked, Function1 onItemViewed, InterfaceC34116n logger, AbstractC0757c json) {
        AbstractC22676k.m65750j(onPillarItemClicked, "onPillarItemClicked");
        AbstractC22676k.m65750j(onItemViewed, "onItemViewed");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(json, "json");
        this.onPillarItemClicked = onPillarItemClicked;
        this.onItemViewed = onItemViewed;
        this.logger = logger;
        this.json = json;
    }

    /* JADX INFO: renamed from: a */
    private final void m54149a(C4138w viewState, EnumC4033h navType, C14600d homeMetaData) {
        Object aVar;
        DateTime upper;
        DateTime lower;
        DateTime lower2;
        if (navType == EnumC4033h.BUTTON) {
            AbstractC4145x type = viewState.getType();
            AbstractC22676k.m65748h(type, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.ActivityTileType.Button");
            int i13 = b.f73240d[((AbstractC4145x.a) type).getButtonType().ordinal()];
            if (i13 == 1) {
                m54158k(viewState, homeMetaData);
                return;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.onPillarItemClicked.invoke(new AbstractC18642s.b(false, UserState.States.SLEEP));
                return;
            }
        }
        Function1 function1 = this.onPillarItemClicked;
        if (viewState.getIsEmpty()) {
            aVar = AbstractC18642s.a0.f73092a;
        } else {
            String activityIdV1 = viewState.getActivityIdV1();
            String activityIdV2 = viewState.getActivityIdV2();
            ActivityDetailType activityDetailType = viewState.getActivityDetailType();
            Period during = viewState.getDuring();
            String string = null;
            String strValueOf = String.valueOf((during == null || (lower2 = during.getLower()) == null) ? null : lower2.toLocalDate());
            Activity whoopActivity = viewState.getWhoopActivity();
            String strM85278i = whoopActivity != null ? C28169i0.m85278i(whoopActivity) : null;
            TextResource title = viewState.getTitle();
            AbstractC22676k.m65748h(title, "null cannot be cast to non-null type com.whoop.design.util.TextResource.Value");
            String lowerCase = ((TextResource.C8691e) title).getValue().toString().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            Period during2 = viewState.getDuring();
            String string2 = (during2 == null || (lower = during2.getLower()) == null) ? null : lower.toString(StreamDateFormatter.DATE_FORMAT);
            Period during3 = viewState.getDuring();
            if (during3 != null && (upper = during3.getUpper()) != null) {
                string = upper.toString(StreamDateFormatter.DATE_FORMAT);
            }
            aVar = new AbstractC18642s.a(activityIdV1, activityIdV2, activityDetailType, strValueOf, strM85278i, lowerCase, string2, string);
        }
        function1.invoke(aVar);
    }

    /* JADX INFO: renamed from: b */
    private final C9598e m54150b(C9598e action) {
        NavigationScreenModel parameters = action.getParameters();
        ChallengeLandingScreenModel challengeLandingScreenModelCopy = parameters instanceof ChallengeLandingScreenModel ? (ChallengeLandingScreenModel) parameters : null;
        if (challengeLandingScreenModelCopy == null) {
            return action;
        }
        if (challengeLandingScreenModelCopy.getSource() == null) {
            challengeLandingScreenModelCopy = challengeLandingScreenModelCopy.copy("jj_tile_on_home");
        }
        C9598e c9598eM23127b = C9598e.m23127b(action, null, challengeLandingScreenModelCopy, null, 5, null);
        return c9598eM23127b == null ? action : c9598eM23127b;
    }

    /* JADX INFO: renamed from: c */
    private final void m54151c(C4069m0 viewState, InterfaceC4027g0 event) {
        if (event instanceof InterfaceC4027g0.a) {
            String dismissalId = viewState.getDismissalId();
            if (dismissalId != null) {
                this.onPillarItemClicked.invoke(new AbstractC18642s.e(dismissalId));
                return;
            }
            return;
        }
        if (viewState.getDestination() == null) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.f(viewState.getNavType()));
            return;
        }
        C9598e destination = viewState.getDestination();
        if (destination != null) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.g(destination, null, false, 6, null));
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m54152d(C22204c state) {
        C4118t0 coachingCtaTileState = state.getCoachingCtaTileState();
        if (coachingCtaTileState != null) {
            if (!(coachingCtaTileState.getType() instanceof AbstractC4125u0.e)) {
                AbstractC4125u0 type = coachingCtaTileState.getType();
                AbstractC22676k.m65748h(type, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.CoachingCtaType.Error");
                if (!((AbstractC4125u0.b) type).getShowLink()) {
                    return;
                }
            }
            if (coachingCtaTileState.getCtaType() != null) {
                Function1 function1 = this.onPillarItemClicked;
                EnumC22400l ctaType = coachingCtaTileState.getCtaType();
                AbstractC22676k.m65748h(ctaType, "null cannot be cast to non-null type com.whoop.design.util.HomeCtaType");
                function1.invoke(new AbstractC18642s.e0(ctaType));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m54153e(C4118t0 state) {
        EnumC22400l ctaType;
        AbstractC4125u0 type = state.getType();
        if (((type instanceof AbstractC4125u0.e) || (type instanceof AbstractC4125u0.b)) && (ctaType = state.getCtaType()) != null) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.e0(ctaType));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    private final void m54154f(Object event, EnumC0124b connectivityNavType) {
        int i13 = 2;
        C2281h c2281h = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (!(event instanceof EnumC0123a)) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.j(connectivityNavType, objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0));
            return;
        }
        switch (b.f73237a[((EnumC0123a) event).ordinal()]) {
            case 1:
                this.onPillarItemClicked.invoke(AbstractC18642s.v.f73143a);
                return;
            case 2:
                this.onPillarItemClicked.invoke(AbstractC18642s.x.f73145a);
                return;
            case 3:
                this.onPillarItemClicked.invoke(AbstractC18642s.w.f73144a);
                return;
            case 4:
                this.onPillarItemClicked.invoke(AbstractC18642s.r.f73137a);
                return;
            case 5:
                this.onPillarItemClicked.invoke(AbstractC18642s.s.f73138a);
                return;
            case 6:
                this.onPillarItemClicked.invoke(new AbstractC18642s.j(connectivityNavType, c2281h, i13, objArr3 == true ? 1 : 0));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m54155g(C14600d homeMetaData, EnumC22400l navType, EnumC11472g ctaTileNavType, String activityInternalName) {
        switch (b.f73239c[navType.ordinal()]) {
            case 1:
                if (ctaTileNavType == null) {
                    this.logger.mo85222m("Null CtaTileNavType for Behavior Impact CTA", new AbstractC30556a.a[0]);
                    return;
                }
                int i13 = b.f73238b[ctaTileNavType.ordinal()];
                if (i13 == 1) {
                    this.onPillarItemClicked.invoke(new AbstractC18642s.h(false));
                    return;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.onPillarItemClicked.invoke(new AbstractC18642s.h(true));
                    return;
                }
            case 2:
                this.onPillarItemClicked.invoke(new AbstractC18642s.g(new C9598e(AppScreen.C9410s2.f27914w, new HeartScreenerModel((String) null, 1, (DefaultConstructorMarker) null), null, 4, null), null, false, 6, null));
                return;
            case 3:
                this.onPillarItemClicked.invoke(new AbstractC18642s.q(homeMetaData));
                return;
            case 4:
                this.onPillarItemClicked.invoke(new AbstractC18642s.o("SLEEP", true, null, 4, null));
                return;
            case 5:
                this.onPillarItemClicked.invoke(new AbstractC18642s.o("STRAIN", true, null, 4, null));
                return;
            case 6:
                this.onPillarItemClicked.invoke(new AbstractC18642s.o("RECOVERY", true, null, 4, null));
                return;
            case 7:
                this.onPillarItemClicked.invoke(new AbstractC18642s.o("NEW_HOME_INTRODUCTION", false, null, 6, null));
                return;
            case 8:
                this.onPillarItemClicked.invoke(new AbstractC18642s.e0(EnumC22400l.ONBOARDING_TASK_LIST));
                return;
            case 9:
                if (ctaTileNavType == null) {
                    this.logger.mo85222m("Null CtaTileNavType for ADD_ACTIVITY CTA", new AbstractC30556a.a[0]);
                    return;
                }
                int i14 = b.f73238b[ctaTileNavType.ordinal()];
                if (i14 == 1) {
                    this.onPillarItemClicked.invoke(new AbstractC18642s.b(true, activityInternalName));
                    return;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.onPillarItemClicked.invoke(new AbstractC18642s.k(homeMetaData != null ? homeMetaData.getCycleId() : 0L));
                    return;
                }
            case 10:
                this.onPillarItemClicked.invoke(new AbstractC18642s.o("DEVICE_BATTERY", true, null, 4, null));
                return;
            case 11:
                this.onPillarItemClicked.invoke(new AbstractC18642s.e0(EnumC22400l.SLEEP_PILLAR));
                return;
            case 12:
                this.onPillarItemClicked.invoke(AbstractC18642s.f0.f73115a);
                return;
            case 13:
                this.onPillarItemClicked.invoke(new AbstractC18642s.e0(EnumC22400l.FIRST_WEEK_IN_REVIEW));
                return;
            case 14:
                this.onPillarItemClicked.invoke(new AbstractC18642s.e0(EnumC22400l.YEAR_IN_REVIEW));
                return;
            case 15:
                this.onPillarItemClicked.invoke(new AbstractC18642s.e0(EnumC22400l.COMMUNITY_YEAR_IN_REVIEW));
                return;
            case 16:
                this.onPillarItemClicked.invoke(new AbstractC18642s.o("TRIAL_INFORMATION", false, null, 6, null));
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                this.onPillarItemClicked.invoke(AbstractC18642s.g0.f73119a);
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                this.onPillarItemClicked.invoke(new AbstractC18642s.g(new C9598e(AppScreen.C9372n4.f27802w, new PregnancyInsightsScreenModel(homeMetaData != null ? homeMetaData.getCurrentDayDisplay() : null, "Home Screen", (AiAction) null, 4, (DefaultConstructorMarker) null), null, 4, null), null, false, 6, null));
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                this.onPillarItemClicked.invoke(new AbstractC18642s.g(new C9598e(AppScreen.C9380o4.f27828w, new PregnancySettingsScreenModel("DEFAULT", (String) null, 2, (DefaultConstructorMarker) null), null, 4, null), null, false, 6, null));
                return;
            case 20:
                this.onPillarItemClicked.invoke(new AbstractC18642s.g(new C9598e(AppScreen.C9417t1.f27936w, null, null, 6, null), null, false, 6, null));
                return;
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.logger.mo85222m("HomeCtaType cannot be of type None!", new AbstractC30556a.a[0]);
                return;
            default:
                throw new IllegalArgumentException(AbstractC11266d.m30461o("Unknown navigation for CTA tile event: ", navType.name()));
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m54156h(DayZeroCardsViewState viewState, Object navType, C14600d homeMetaData) {
        Object next;
        if (navType instanceof C27347c) {
            C27347c c27347c = (C27347c) navType;
            this.onPillarItemClicked.invoke(new AbstractC18642s.d(c27347c.getSuggestionCategory(), c27347c.getHintText(), c27347c.getContextualMessage(), homeMetaData.getCycleId(), c27347c.getEducationType(), c27347c.getConversationSeedId(), c27347c.getSourceType(), c27347c.getSourceId()));
            return;
        }
        if (navType instanceof C27256h) {
            m54160m((C27256h) navType);
            return;
        }
        if (navType instanceof AbstractC35769j.a) {
            Iterator<T> it = viewState.getContents().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((CustomAnimationContainerViewState) next).getCompleted() instanceof C35768i));
            CustomAnimationContainerViewState customAnimationContainerViewState = (CustomAnimationContainerViewState) next;
            InterfaceC25312u completed = customAnimationContainerViewState != null ? customAnimationContainerViewState.getCompleted() : null;
            C35768i c35768i = completed instanceof C35768i ? (C35768i) completed : null;
            if (c35768i != null) {
                m54162o(c35768i, homeMetaData, navType);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m54157i(TrendKey navType, C14600d homeMetaData) {
        if (navType != TrendKey.NONE) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.c0(navType, homeMetaData != null ? homeMetaData.getCurrentDay() : null, EnumC18623a0.TREND_GRAPH, false, 8, null));
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m54158k(C4138w viewState, C14600d homeMetaData) {
        if (viewState.getActivityDetailType() == ActivityDetailType.SLEEP) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.z(homeMetaData != null ? homeMetaData.getCycleId() : -1L, "Sleep Process Button"));
            return;
        }
        C4077n1 detectedActivityMetadata = viewState.getDetectedActivityMetadata();
        if (detectedActivityMetadata != null) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.c(detectedActivityMetadata.getGpsEnabled(), detectedActivityMetadata.getStartAt(), detectedActivityMetadata.getSportId()));
        } else {
            this.logger.mo85222m("Activity Tile is in Process state but metadata object is null.", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m54159l(C13851d viewState, Object event, C14600d homeMetaData) {
        if (event == EnumC13893r.SLEEP_PROCESS_NOW) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.z(homeMetaData.getCycleId(), "Sleep Process Card"));
        } else {
            this.logger.mo85222m(AbstractC11266d.m30461o("Unknown card action for ActionCardState ", viewState.getId()), new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m54160m(C27256h cardButtonState) {
        Action action = cardButtonState.getAction();
        if (action != null) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.u(action));
            return;
        }
        this.onPillarItemClicked.invoke(new AbstractC18642s.g(cardButtonState.getDestination(), null, false, 6, null));
    }

    /* JADX INFO: renamed from: n */
    private final void m54161n(Object event) {
        if (event instanceof C27256h) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.g(((C27256h) event).getDestination(), null, true, 2, null));
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m54162o(C35768i viewState, C14600d homeMetaData, Object event) {
        if (event instanceof AbstractC35769j.a) {
            AbstractC35769j.a aVar = (AbstractC35769j.a) event;
            InterfaceC25312u interfaceC25312u = viewState.m113365i().get(aVar.getIndex());
            if (interfaceC25312u instanceof C4138w) {
                m54172j(interfaceC25312u, homeMetaData, ((C4138w) interfaceC25312u).getType() instanceof AbstractC4145x.a ? EnumC4033h.BUTTON : EnumC4033h.TILE);
                return;
            } else {
                m54162o(viewState, homeMetaData, aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
                return;
            }
        }
        if (event instanceof C27256h) {
            m54160m((C27256h) event);
        } else if (event instanceof C27264l) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.g(((C27264l) event).getDestination(), null, false, 6, null));
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m54163p(C32085h viewState) {
        this.onPillarItemClicked.invoke(new AbstractC18642s.t(viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String(), viewState.getAnalytics()));
    }

    /* JADX INFO: renamed from: q */
    private final void m54164q(AbstractC28805p.e state, C14600d homeMetaData) {
        Object pVar;
        C9598e destination = state.getDestination();
        if (AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9417t1.f27936w)) {
            pVar = new AbstractC18642s.p(state.getCtaType(), state.getShouldShowOnboarding(), false, homeMetaData, 4, null);
        } else if (destination != null) {
            pVar = new AbstractC18642s.g(destination, null, false, 6, null);
        } else {
            pVar = new AbstractC18642s.p(state.getCtaType(), state.getShouldShowOnboarding(), false, homeMetaData, 4, null);
        }
        this.onPillarItemClicked.invoke(pVar);
    }

    /* JADX INFO: renamed from: r */
    private final void m54165r(C14600d homeMetaData) {
        if (homeMetaData != null) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.q(homeMetaData));
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m54166s(C36213q viewState, Object navType) {
        if (navType instanceof AbstractC35087e.a) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.d0(((AbstractC35087e.a) navType).getId()));
        } else if (navType instanceof EnumC22400l) {
            m54155g(null, (EnumC22400l) navType, EnumC11472g.TILE_CLICKED, null);
        } else if (navType instanceof EnumC40105p) {
            m54167u((EnumC40105p) navType);
        }
    }

    /* JADX INFO: renamed from: u */
    private final void m54167u(EnumC40105p navType) {
        if (navType == EnumC40105p.SHARE) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.y("OVERVIEW"));
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m54168v(C40107r state, EnumC40105p navType) {
        Object yVar;
        boolean z4 = navType == EnumC40105p.HELP;
        boolean z13 = navType == EnumC40105p.SHARE;
        boolean z14 = state.getType() == EnumC40108s.STRAIN;
        boolean z15 = state.getType() == EnumC40108s.RECOVERY_LOW || state.getType() == EnumC40108s.RECOVERY_MEDIUM || state.getType() == EnumC40108s.RECOVERY_HIGH || state.getType() == EnumC40108s.CALIBRATING;
        if (z4 && z14) {
            yVar = new AbstractC18642s.o("STRAIN", false, null, 6, null);
        } else if (z13 && z14) {
            yVar = new AbstractC18642s.y("STRAIN");
        } else if (z4 && z15) {
            yVar = new AbstractC18642s.o("RECOVERY", false, null, 6, null);
        } else {
            if (!z13 || !z15) {
                throw new IllegalArgumentException("Unknown Pillar Gauge Nav Type");
            }
            yVar = new AbstractC18642s.y("RECOVERY");
        }
        this.onPillarItemClicked.invoke(yVar);
    }

    /* JADX INFO: renamed from: w */
    private final void m54169w(Object event) {
        if (!(event instanceof InterfaceC25312u)) {
            this.logger.mo85222m("Unknown argument passed into SplitContainerCardState", new AbstractC30556a.a[0]);
            return;
        }
        if (!(event instanceof C4044i3)) {
            this.logger.mo85222m("Unknown ItemViewState passed into SplitContainerCardState", new AbstractC30556a.a[0]);
            return;
        }
        C4044i3 c4044i3 = (C4044i3) event;
        C9598e destination = c4044i3.getDestination();
        if (destination == null) {
            this.logger.mo85222m("no navigation action passed into this mini monitor", new AbstractC30556a.a[0]);
        } else {
            this.onPillarItemClicked.invoke(new AbstractC18642s.g(destination, c4044i3.getMetricStatus(), false, 4, null));
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m54170x(C4046i5 viewState, C14600d homeMetaData) {
        C9598e destination = viewState.getDestination();
        if (destination == null) {
            this.logger.mo85222m("No BE-driven navigation action attached to this StatusTileState", new AbstractC30556a.a[0]);
            return;
        }
        boolean z4 = false;
        this.onPillarItemClicked.invoke(new AbstractC18642s.g(destination, C4046i5.m12346b(viewState, null, null, null, false, null, null, homeMetaData, 63, null), z4, 4, null));
    }

    /* JADX INFO: renamed from: y */
    private final GenericInteraction m54171y(Object event) {
        if (event instanceof GenericInteraction) {
            return (GenericInteraction) event;
        }
        if (event instanceof AbstractC35769j.a) {
            return m54171y(((AbstractC35769j.a) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m54172j(InterfaceC25312u viewState, C14600d homeMetaData, Object event) {
        C4084o1 analyticEvents;
        AnalyticEventModel dismiss;
        String dismissalId;
        EnumC26841f style;
        C4084o1 analyticEvents2;
        AnalyticEventModel cta;
        C27347c aiChatEntryPointItem;
        C9598e navigation;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(homeMetaData, "homeMetaData");
        if (viewState instanceof C32085h) {
            m54163p((C32085h) viewState);
            return;
        }
        GenericInteraction genericInteractionM54171y = m54171y(event);
        if (genericInteractionM54171y != null) {
            DecodedGenericInteraction decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(genericInteractionM54171y, this.json);
            if (decodedGenericInteraction == null || (navigation = decodedGenericInteraction.getNavigation()) == null) {
                return;
            }
            this.onPillarItemClicked.invoke(new AbstractC18642s.g(navigation, null, false, 6, null));
            return;
        }
        if (event instanceof C9598e) {
            C9598e c9598e = (C9598e) event;
            NavigationScreenModel parameters = c9598e.getParameters();
            CoachScreenModel coachScreenModel = parameters instanceof CoachScreenModel ? (CoachScreenModel) parameters : null;
            if (AbstractC22676k.m65745e(coachScreenModel != null ? coachScreenModel.getSource() : null, "notifications_wrapper_chat_entry")) {
                if (viewState instanceof C36213q) {
                    aiChatEntryPointItem = ((C36213q) viewState).getAiChatEntryPointItem();
                } else {
                    aiChatEntryPointItem = viewState instanceof DayOneTransitionViewState ? ((DayOneTransitionViewState) viewState).getNotificationsCenterViewState().getAiChatEntryPointItem() : null;
                }
                if (aiChatEntryPointItem != null) {
                    Function1 function1 = this.onPillarItemClicked;
                    EnumC27349e suggestionCategory = aiChatEntryPointItem.getSuggestionCategory();
                    String hintText = aiChatEntryPointItem.getHintText();
                    String entryText = coachScreenModel.getEntryText();
                    if (entryText == null) {
                        entryText = "";
                    }
                    function1.invoke(new AbstractC18642s.d(suggestionCategory, hintText, entryText, homeMetaData.getCycleId(), aiChatEntryPointItem.getEducationType(), aiChatEntryPointItem.getConversationSeedId(), aiChatEntryPointItem.getSourceType(), aiChatEntryPointItem.getSourceId()));
                    return;
                }
            }
            if ((viewState instanceof C4140w1) && (analyticEvents2 = ((C4140w1) viewState).getAnalyticEvents()) != null && (cta = analyticEvents2.getCta()) != null) {
                this.onItemViewed.invoke(new AbstractC13341o.b(cta));
            }
            if (viewState instanceof C26838c) {
                C26838c c26838c = (C26838c) viewState;
                if (event.equals(c26838c.getDailyOutlookTile().getDestination()) && ((style = c26838c.getDailyOutlookTile().getStyle()) == EnumC26841f.WAKE_UP_REPORT || style == EnumC26841f.WIND_DOWN_REPORT || style == EnumC26841f.WAKE_UP_REPORT_OPENED || style == EnumC26841f.WIND_DOWN_REPORT_OPENED)) {
                    this.onPillarItemClicked.invoke(new AbstractC18642s.i(c9598e));
                }
            }
            C9598e c9598eM54150b = m54150b(c9598e);
            if (viewState instanceof C11474i) {
                C11474i c11474i = (C11474i) viewState;
                if (c11474i.getType() == EnumC22400l.ACCESS_HOME_TILE) {
                    NavigationScreenModel parameters2 = c9598e.getParameters();
                    HomeScreenModel homeScreenModel = parameters2 instanceof HomeScreenModel ? (HomeScreenModel) parameters2 : null;
                    if ((homeScreenModel != null ? homeScreenModel.getAiAction() : null) != null) {
                        this.onPillarItemClicked.invoke(new AbstractC18642s.g(c9598eM54150b, c11474i.getType(), false, 4, null));
                        return;
                    }
                }
            }
            this.onPillarItemClicked.invoke(new AbstractC18642s.g(c9598eM54150b, null, false, 6, null));
            return;
        }
        if (event instanceof C28790a) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.p(((C28790a) event).getHomeCtaType(), false, true, homeMetaData));
            return;
        }
        if (event instanceof C28796g) {
            this.onPillarItemClicked.invoke(AbstractC18642s.m.f73127a);
            return;
        }
        if (event instanceof DesignItemInteraction) {
            Object actionArgument = ((DesignItemInteraction) event).getActionArgument();
            Action action = actionArgument instanceof Action ? (Action) actionArgument : null;
            if (action == null) {
                return;
            }
            if (viewState instanceof C4092p2) {
                C4092p2 c4092p2 = (C4092p2) viewState;
                if (action.equals(c4092p2.getDismissAction()) && (dismissalId = c4092p2.getDismissalId()) != null) {
                    this.onPillarItemClicked.invoke(new AbstractC18642s.e(dismissalId));
                    return;
                }
            }
            this.onPillarItemClicked.invoke(new AbstractC18642s.u(action));
            return;
        }
        if (event instanceof Action) {
            if ((viewState instanceof C4140w1) && (analyticEvents = ((C4140w1) viewState).getAnalyticEvents()) != null && (dismiss = analyticEvents.getDismiss()) != null) {
                this.onItemViewed.invoke(new AbstractC13341o.c(dismiss));
            }
            this.onPillarItemClicked.invoke(new AbstractC18642s.u((Action) event));
            return;
        }
        if (viewState instanceof C27347c) {
            C27347c c27347c = (C27347c) viewState;
            this.onPillarItemClicked.invoke(new AbstractC18642s.d(c27347c.getSuggestionCategory(), c27347c.getHintText(), c27347c.getContextualMessage(), homeMetaData.getCycleId(), c27347c.getEducationType(), c27347c.getConversationSeedId(), c27347c.getSourceType(), c27347c.getSourceId()));
            return;
        }
        if (viewState instanceof C4069m0) {
            m54151c((C4069m0) viewState, event instanceof InterfaceC4027g0 ? (InterfaceC4027g0) event : null);
            return;
        }
        if (viewState instanceof C4138w) {
            AbstractC22676k.m65748h(event, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.ActivityNavType");
            m54149a((C4138w) viewState, (EnumC4033h) event, homeMetaData);
            return;
        }
        if (viewState instanceof C22204c) {
            m54152d((C22204c) viewState);
            return;
        }
        if (viewState instanceof C4118t0) {
            m54153e((C4118t0) viewState);
            return;
        }
        if (viewState instanceof C0140r) {
            m54154f(event, ((C0140r) viewState).getConnectivityNavType());
            return;
        }
        if (viewState instanceof C11474i) {
            C11474i c11474i2 = (C11474i) viewState;
            EnumC22400l type = c11474i2.getType();
            EnumC11472g enumC11472g = event instanceof EnumC11472g ? (EnumC11472g) event : null;
            C11468c ctaSupplementalInfoState = c11474i2.getCtaSupplementalInfoState();
            m54155g(homeMetaData, type, enumC11472g, ctaSupplementalInfoState != null ? ctaSupplementalInfoState.getActivityInternalName() : null);
            return;
        }
        if (viewState instanceof C22256m) {
            AbstractC22676k.m65748h(event, "null cannot be cast to non-null type com.whoop.util.TrendKey");
            m54157i((TrendKey) event, homeMetaData);
            return;
        }
        if (viewState instanceof C4015e2) {
            C4015e2 c4015e2 = (C4015e2) viewState;
            this.onPillarItemClicked.invoke(new AbstractC18642s.n(c4015e2.getDataAvailable() ? c4015e2.getType() : null));
            return;
        }
        if (viewState instanceof C28801l) {
            AbstractC28805p state = ((C28801l) viewState).getState();
            if (state instanceof AbstractC28805p.e) {
                m54164q((AbstractC28805p.e) state, homeMetaData);
                return;
            }
            return;
        }
        if (viewState instanceof C34576j) {
            m54165r(homeMetaData);
            return;
        }
        if (viewState instanceof C40101l) {
            AbstractC22676k.m65748h(event, "null cannot be cast to non-null type com.whoop.design.atomic.organism.gauge.PillarGaugeNavType");
            m54167u((EnumC40105p) event);
            return;
        }
        if (viewState instanceof DayZeroCardsViewState) {
            m54156h((DayZeroCardsViewState) viewState, event, homeMetaData);
            return;
        }
        if (viewState instanceof C36213q) {
            m54166s((C36213q) viewState, event);
            return;
        }
        if (viewState instanceof DayOneTransitionViewState) {
            m54166s(((DayOneTransitionViewState) viewState).getNotificationsCenterViewState(), event);
            return;
        }
        if (viewState instanceof C40107r) {
            AbstractC22676k.m65748h(event, "null cannot be cast to non-null type com.whoop.design.atomic.organism.gauge.PillarGaugeNavType");
            m54168v((C40107r) viewState, (EnumC40105p) event);
            return;
        }
        if (viewState instanceof C4018e5) {
            m54169w(event);
            return;
        }
        if (viewState instanceof C4046i5) {
            m54170x((C4046i5) viewState, homeMetaData);
            return;
        }
        if (viewState instanceof C22245c0) {
            this.onPillarItemClicked.invoke(AbstractC18642s.b0.f73095a);
            return;
        }
        if (viewState instanceof C4151x5) {
            C4151x5 c4151x5 = (C4151x5) viewState;
            this.onPillarItemClicked.invoke(new AbstractC18642s.c0(c4151x5.getTrendKey(), homeMetaData.getCurrentDay(), EnumC18623a0.KEY_STAT, c4151x5.getStyle() == EnumC31927f.ONBOARDING_GRADIENT_FILL));
            return;
        }
        if (viewState instanceof C22190d) {
            if (event instanceof C27256h) {
                m54160m((C27256h) event);
                return;
            } else {
                this.logger.mo85222m(AbstractC25012a.m73375h(event, "Unhandled event type for TimedContentState: "), new AbstractC30556a.a[0]);
                return;
            }
        }
        if (viewState instanceof C38755f) {
            if (event instanceof C27256h) {
                m54160m((C27256h) event);
                return;
            } else {
                this.logger.mo85222m(AbstractC25012a.m73375h(event, "Unhandled event type for AppointmentCardViewState: "), new AbstractC30556a.a[0]);
                return;
            }
        }
        if (viewState instanceof C4092p2) {
            if (event instanceof C27256h) {
                m54160m((C27256h) event);
                return;
            } else {
                this.logger.mo85222m(AbstractC25012a.m73375h(event, "Unhandled event type for InfoCalloutState: "), new AbstractC30556a.a[0]);
                return;
            }
        }
        if (viewState instanceof C35768i) {
            m54162o((C35768i) viewState, homeMetaData, event);
            return;
        }
        if (viewState instanceof C31053c) {
            m54161n(event);
        } else if (viewState instanceof C25697k) {
            this.onPillarItemClicked.invoke(new AbstractC18642s.o("STRAIN", false, "Day 0 Overview"));
        } else if (viewState instanceof C13851d) {
            m54159l((C13851d) viewState, event, homeMetaData);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m54173t(InterfaceC25312u viewState) {
        C4084o1 analyticEvents;
        AnalyticEventModel analyticEventModel;
        if (viewState instanceof C4069m0) {
            this.onItemViewed.invoke(new AbstractC13341o.a(((C4069m0) viewState).getNavType().name()));
        } else {
            if (!(viewState instanceof C4140w1) || (analyticEvents = ((C4140w1) viewState).getAnalyticEvents()) == null || (analyticEventModel = analyticEvents.getCom.whoop.profile.analytics.ProfileAnalyticsKt.VIEW java.lang.String()) == null) {
                return;
            }
            this.onItemViewed.invoke(new AbstractC13341o.d(analyticEventModel));
        }
    }

    public /* synthetic */ C18665d0(Function1 function1, Function1 function2, InterfaceC34116n interfaceC34116n, AbstractC0757c abstractC0757c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function2, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HomeItemViewEventHelper") : interfaceC34116n, (i13 & 8) != 0 ? AbstractC6728b.m20379d(null, null, null, null, null, 31, null) : abstractC0757c);
    }
}
