package dm1;

import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import c41.C4046i5;
import c41.EnumC4142w3;
import c93.InterfaceC4351m;
import com.whoop.coacheverywherecommon.models.CoachEducationType;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.WeeklyPlanOverviewScreenModel;
import dh0.C12040a;
import dp0.InterfaceC12251g;
import e93.AbstractC12889b;
import ep0.C13404j;
import fm1.C14598b;
import fm1.C14600d;
import fm1.EnumC14603g;
import gl1.AbstractC15968c;
import gl1.AbstractC15969d;
import gl1.C15967b;
import hc3.AbstractC17182o;
import il1.EnumC18623a0;
import il1.EnumC18633j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.AbstractC21161p0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import kc3.C22365e;
import kd1.EnumC22400l;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import o02.AbstractC27355f;
import o02.C27354e;
import o02.InterfaceC27353d;
import or2.AbstractC28188o1;
import oz1.C28498a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import tr2.InterfaceC34116n;
import u92.C34660d;
import xm1.C38459a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: dm1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0019H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u001f2\u0006\u0010/\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u001f2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u001f2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u00192\u0006\u00106\u001a\u00020=¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010LR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010OR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010QR\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010TR\u0014\u0010W\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010V¨\u0006X"}, m65681d2 = {"Ldm1/b;", "", "Lj02/o0;", "navigator", "Lgl1/b;", "homeAnalyticsHelper", "Lu92/d;", "sharedPreferences", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lsr2/y;", "urlProvider", "Lxm1/a;", "requestDateGetter", "Ldp0/g;", "globalCoachManager", "Lo02/d;", "baseNavReducer", "Loz1/a;", "nativeStoreAnalyticsHelper", "<init>", "(Lj02/o0;Lgl1/b;Lu92/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lsr2/y;Lxm1/a;Ldp0/g;Lo02/d;Loz1/a;)V", "Lcom/whoop/navigation/e;", "action", "actionArgument", "", "fromMyDay", "d", "(Lcom/whoop/navigation/e;Ljava/lang/Object;Z)Z", "", "source", "Ll83/a0;", "i", "(Lcom/whoop/navigation/e;Ljava/lang/Object;Ljava/lang/String;)V", "Lj02/m0;", "navigationScreen", "c", "(Lj02/m0;Ljava/lang/Object;)Lj02/m0;", "", "cycleId", "isFromAutoPop", "k", "(JZ)Z", "Lj02/p0;", "f", "(Lj02/m0;)Lj02/p0;", "Lcom/whoop/navigation/CoachScreenModel;", "coachModel", "m", "(Lcom/whoop/navigation/CoachScreenModel;)V", "Lcom/whoop/navigation/AiCoachChatScreenModel;", "l", "(Lcom/whoop/navigation/AiCoachChatScreenModel;)V", "Ldm1/a$c;", NotificationCompat.CATEGORY_EVENT, "n", "(Ldm1/a$c;)V", "Lep0/j;", "context", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lep0/j;)V", "Ldm1/a;", "j", "(Ldm1/a;)Z", "a", "Lj02/o0;", "getNavigator", "()Lj02/o0;", "b", "Lgl1/b;", "getHomeAnalyticsHelper", "()Lgl1/b;", "Lu92/d;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Lsr2/y;", "Lxm1/a;", "g", "Ldp0/g;", "Loz1/a;", "Ltr2/n;", "Ltr2/n;", "logger", "Lbc3/c0;", "Lbc3/c0;", "routerScope", "Lo02/d;", "navigationReducer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12178b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C15967b homeAnalyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C34660d sharedPreferences;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C38459a requestDateGetter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C28498a nativeStoreAnalyticsHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC2994c0 routerScope;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    /* JADX INFO: renamed from: dm1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40595a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f40596b;

        static {
            int[] iArr = new int[EnumC18633j.values().length];
            try {
                iArr[EnumC18633j.SLEEP_NEED_LEARN_MORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f40595a = iArr;
            int[] iArr2 = new int[EnumC22400l.values().length];
            try {
                iArr2[EnumC22400l.MAJOR_OUTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[EnumC22400l.CRITICAL_OUTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC22400l.CARD_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC22400l.CARD_EXPIRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC22400l.NO_CARD_ON_FILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC22400l.PAYMENT_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC22400l.MEMBERSHIP_EXPIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC22400l.MEMBERSHIP_EXPIRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC22400l.MEMBERSHIP_PAUSED.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC22400l.STRAP_GEN_DEPRECATED.ordinal()] = 10;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC22400l.ADD_ACTIVITY.ordinal()] = 11;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC22400l.ONBOARDING_TASK_LIST.ordinal()] = 12;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EnumC22400l.SLEEP_COACH.ordinal()] = 13;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EnumC22400l.SLEEP_DETAILS.ordinal()] = 14;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EnumC22400l.FIRST_WEEK_IN_REVIEW.ordinal()] = 15;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EnumC22400l.YEAR_IN_REVIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EnumC22400l.COMMUNITY_YEAR_IN_REVIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[EnumC22400l.START_ACTIVITY.ordinal()] = 18;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[EnumC22400l.START_ACTIVITY_REVAMP.ordinal()] = 19;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[EnumC22400l.STEALTH_SETTING.ordinal()] = 20;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[EnumC22400l.WEEKLY_PLAN_OVERVIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[EnumC22400l.WHOOP_LABS.ordinal()] = 22;
            } catch (NoSuchFieldError unused23) {
            }
            f40596b = iArr2;
        }
    }

    /* JADX INFO: renamed from: dm1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC21134c invoke(InterfaceC21134c it) {
            AbstractC22676k.m65750j(it, "it");
            return AbstractC21155m0.q1.m59244c((AbstractC21155m0.q1) it, "home", null, null, null, null, 30, null);
        }
    }

    /* JADX INFO: renamed from: dm1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC21134c invoke(InterfaceC21134c it) {
            AbstractC22676k.m65750j(it, "it");
            return AbstractC21155m0.a5.m59020c((AbstractC21155m0.a5) it, null, "Overview Mini", null, 5, null);
        }
    }

    /* JADX INFO: renamed from: dm1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.navigation.HomeScreenNavigationRouter$showCoachEverywhereBottomSheet$1", m100430f = "HomeScreenNavigationRouter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f40597w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13404j f40599y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C13404j c13404j, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f40599y = c13404j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12178b.this.new d(this.f40599y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f40597w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12178b.this.m33770h(this.f40599y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dm1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.navigation.HomeScreenNavigationRouter$showCoachEverywhereBottomSheet$2", m100430f = "HomeScreenNavigationRouter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f40600w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13404j f40602y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C13404j c13404j, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f40602y = c13404j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12178b.this.new e(this.f40602y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f40600w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12178b.this.m33770h(this.f40602y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dm1.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.navigation.HomeScreenNavigationRouter$showCoachEverywhereBottomSheetForChatEntry$1", m100430f = "HomeScreenNavigationRouter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f40603w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13404j f40605y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C13404j c13404j, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f40605y = c13404j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12178b.this.new f(this.f40605y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f40603w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12178b.this.m33770h(this.f40605y);
            return C23454a0.f92919a;
        }
    }

    public C12178b(InterfaceC21159o0 navigator, C15967b homeAnalyticsHelper, C34660d sharedPreferences, FeatureFlagChecker featureFlagChecker, AbstractC32943y urlProvider, C38459a requestDateGetter, InterfaceC12251g globalCoachManager, InterfaceC27353d baseNavReducer, C28498a nativeStoreAnalyticsHelper) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(homeAnalyticsHelper, "homeAnalyticsHelper");
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(requestDateGetter, "requestDateGetter");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        AbstractC22676k.m65750j(baseNavReducer, "baseNavReducer");
        AbstractC22676k.m65750j(nativeStoreAnalyticsHelper, "nativeStoreAnalyticsHelper");
        this.navigator = navigator;
        this.homeAnalyticsHelper = homeAnalyticsHelper;
        this.sharedPreferences = sharedPreferences;
        this.featureFlagChecker = featureFlagChecker;
        this.urlProvider = urlProvider;
        this.requestDateGetter = requestDateGetter;
        this.globalCoachManager = globalCoachManager;
        this.nativeStoreAnalyticsHelper = nativeStoreAnalyticsHelper;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("HomeScreenNavigationRouter");
        C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
        C22365e c22365e = AbstractC3050q0.f12077a;
        this.routerScope = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(c3004e2M8710d, AbstractC17182o.f65999a.mo8825s()));
        this.navigationReducer = AbstractC27355f.m82533a(baseNavReducer, new C12040a(22));
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC21155m0 m33765c(AbstractC21155m0 navigationScreen, Object actionArgument) {
        if (navigationScreen instanceof AbstractC21155m0.q1) {
            return actionArgument instanceof EnumC4142w3 ? AbstractC21155m0.q1.m59244c((AbstractC21155m0.q1) navigationScreen, null, AbstractC15969d.m45106a((EnumC4142w3) actionArgument), null, null, null, 29, null) : (AbstractC21155m0.q1) navigationScreen;
        }
        if (navigationScreen instanceof AbstractC21155m0.f3) {
            AbstractC21155m0.f3 f3Var = (AbstractC21155m0.f3) navigationScreen;
            String id4 = f3Var.getId();
            if (AbstractC22676k.m65745e(id4, "STRAIN_VS_RECOVERY")) {
                return AbstractC21155m0.f3.m59112c(f3Var, null, null, "Overview Pillar", null, "Strain and Recovery", 11, null);
            }
            return AbstractC22676k.m65745e(id4, "WU") ? AbstractC21155m0.f3.m59112c(f3Var, null, null, null, null, f3Var.getId(), 15, null) : f3Var;
        }
        if (!(navigationScreen instanceof AbstractC21155m0.e2)) {
            if (navigationScreen instanceof AbstractC21155m0.y0) {
                return actionArgument instanceof String ? AbstractC21155m0.y0.m59347c((AbstractC21155m0.y0) navigationScreen, null, null, (String) actionArgument, null, 11, null) : (AbstractC21155m0.y0) navigationScreen;
            }
            return navigationScreen;
        }
        if (!(actionArgument instanceof C4046i5)) {
            return (AbstractC21155m0.e2) navigationScreen;
        }
        C4046i5 c4046i5 = (C4046i5) actionArgument;
        Object obj = c4046i5.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        C14600d c14600d = obj instanceof C14600d ? (C14600d) obj : null;
        String str = c4046i5.getCompleted() ? "complete" : "incomplete";
        if (c14600d == null) {
            return (AbstractC21155m0.e2) navigationScreen;
        }
        AbstractC21155m0.e2 e2Var = (AbstractC21155m0.e2) navigationScreen;
        long cycleId = c14600d.getCycleId();
        C14598b previousCycleDuring = c14600d.getJournalMeta().getPreviousCycleDuring();
        Long lValueOf = previousCycleDuring != null ? Long.valueOf(previousCycleDuring.getLowerEndpoint()) : null;
        C14598b previousCycleDuring2 = c14600d.getJournalMeta().getPreviousCycleDuring();
        return e2Var.m59078b((4608 & 1) != 0 ? e2Var.requestDate : this.requestDateGetter.m123250a(c14600d, this.featureFlagChecker), (4608 & 2) != 0 ? e2Var.isFromAutoPop : false, (4608 & 4) != 0 ? e2Var.shouldShowJournalTutorial : c14600d.getJournalMeta().getShouldShowJournalTutorial(), (4608 & 8) != 0 ? e2Var.cycleId : cycleId, (4608 & 16) != 0 ? e2Var.previousCycleStartTime : lValueOf, (4608 & 32) != 0 ? e2Var.previousCycleEndTime : previousCycleDuring2 != null ? Long.valueOf(previousCycleDuring2.getUpperEndpoint()) : null, (4608 & 64) != 0 ? e2Var.currentCycleStartDay : c14600d.getCurrentCycleStartDay(), (4608 & 128) != 0 ? e2Var.currentCycleEndDay : c14600d.getCurrentCycleEndDay(), (4608 & 256) != 0 ? e2Var.newHome : true, (4608 & 512) != 0 ? e2Var.source : null, (4608 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? e2Var.label : str, (4608 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? e2Var.fromFab : false, (4608 & 4096) != 0 ? e2Var.isAutoPop : false);
    }

    /* JADX INFO: renamed from: d */
    private final boolean m33766d(C9598e action, Object actionArgument, boolean fromMyDay) {
        NavigationScreenModel parameters = action.getParameters();
        if (parameters instanceof NavigationScreenModel.DeserializationError) {
            this.logger.mo85228t(AbstractC11895b.m31996o("handleNavigationAction: dropped ", action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName(), ", parameters failed to deserialize"), new AbstractC30556a.a[0]);
            return false;
        }
        if (this.featureFlagChecker.isFeatureEnabled("coach-everywhere-homescreen-bdn") && (parameters instanceof CoachScreenModel)) {
            m33774m((CoachScreenModel) parameters);
            return true;
        }
        if (this.featureFlagChecker.isFeatureEnabled("coach-everywhere-homescreen-bdn") && (parameters instanceof AiCoachChatScreenModel)) {
            m33773l((AiCoachChatScreenModel) parameters);
            return true;
        }
        if (AbstractC22676k.m65745e(action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9397q5.f27876w)) {
            m33771i(action, actionArgument, fromMyDay ? "my_day" : "Overview");
            m33768f(AbstractC12179c.m33779a());
            return true;
        }
        InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(parameters);
        if (!(interfaceC21134cMo67681a instanceof AbstractC21155m0)) {
            this.logger.mo85228t(AbstractC11895b.m31996o("handleNavigationAction: dropped ", action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName(), ", a reducer mapped it to a BaseNavigationScreen this router cannot navigate to"), new AbstractC30556a.a[0]);
            return false;
        }
        AbstractC21155m0 abstractC21155m0M33765c = m33765c((AbstractC21155m0) interfaceC21134cMo67681a, actionArgument);
        m33771i(action, actionArgument, fromMyDay ? "my_day" : "Overview");
        if (action.getTab() != null && this.featureFlagChecker.isFeatureEnabled("home-navigation-tab-switch-android")) {
            this.navigator.mo59392a(action);
            return true;
        }
        if (AbstractC22676k.m65745e(action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9316g4.f27625w) && InterfaceC21159o0.m59391c(this.navigator, null, 1, null)) {
            return true;
        }
        m33768f(abstractC21155m0M33765c);
        if (!interfaceC21134cMo67681a.equals(AbstractC21155m0.j3.f80414b)) {
            return true;
        }
        this.logger.mo85228t(AbstractC11895b.m31996o("handleNavigationAction: dropped ", action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName(), ", no reducer produced a screen for its parameters"), new AbstractC30556a.a[0]);
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m33767e(C12178b c12178b, C9598e c9598e, Object obj, boolean z4, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            obj = null;
        }
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c12178b.m33766d(c9598e, obj, z4);
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC21161p0 m33768f(AbstractC21155m0 navigationScreen) {
        return this.navigator.mo59393b(navigationScreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m33769g(C27354e buildNavigationReducer) {
        AbstractC22676k.m65750j(buildNavigationReducer, "$this$buildNavigationReducer");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        buildNavigationReducer.m82530a(c22673i0.getOrCreateKotlinClass(AbstractC21155m0.q1.class), new b());
        buildNavigationReducer.m82530a(c22673i0.getOrCreateKotlinClass(AbstractC21155m0.a5.class), new c());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m33770h(C13404j context) {
        this.globalCoachManager.mo34137g(0L, null, context);
    }

    /* JADX INFO: renamed from: i */
    private final void m33771i(C9598e action, Object actionArgument, String source) {
        Boolean boolIsInPlan;
        AppScreen appScreen = action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9461z.f28074w)) {
            this.homeAnalyticsHelper.m45075c(false, source, false, Boolean.FALSE, AbstractC22676k.m65745e(source, "my_day"));
            return;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9389p5.f27855w)) {
            this.homeAnalyticsHelper.m45075c(true, source, false, Boolean.FALSE, AbstractC22676k.m65745e(source, "my_day"));
            return;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9397q5.f27876w)) {
            this.homeAnalyticsHelper.m45075c(true, source, false, Boolean.FALSE, AbstractC22676k.m65745e(source, "my_day"));
            return;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9405r5.f27899w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9413s5.f27923w)) {
            this.homeAnalyticsHelper.m45075c(true, source, false, Boolean.FALSE, AbstractC22676k.m65745e(source, "my_day"));
            return;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9437v5.f27996w)) {
            this.homeAnalyticsHelper.m45050A(false, null, AbstractC22676k.m65745e(source, "my_day"));
            return;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9430u6.f27975w)) {
            this.homeAnalyticsHelper.m45073Y(null, false, AbstractC22676k.m65745e(source, "my_day"));
            return;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9358l6.f27757w)) {
            NavigationScreenModel parameters = action.getParameters();
            WeeklyPlanOverviewScreenModel weeklyPlanOverviewScreenModel = parameters instanceof WeeklyPlanOverviewScreenModel ? (WeeklyPlanOverviewScreenModel) parameters : null;
            if (weeklyPlanOverviewScreenModel == null || (boolIsInPlan = weeklyPlanOverviewScreenModel.isInPlan()) == null) {
                return;
            }
            this.homeAnalyticsHelper.m45072X(boolIsInPlan.booleanValue());
            return;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9427u3.f27966w)) {
            this.homeAnalyticsHelper.m45069U();
            return;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9426u2.f27963w)) {
            if (actionArgument == EnumC22400l.ACCESS_HOME_TILE) {
                this.homeAnalyticsHelper.m45054E();
            }
        } else if (AbstractC22676k.m65745e(appScreen, AppScreen.C9316g4.f27625w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9455y0.f28055w)) {
            this.nativeStoreAnalyticsHelper.m86810l(action);
        }
    }

    /* JADX INFO: renamed from: k */
    private final boolean m33772k(long cycleId, boolean isFromAutoPop) {
        long jM109532i = this.sharedPreferences.m109532i(SharedPreferenceConstants.KEY_HAS_JOURNAL_BEEN_SEEN_FOR_TODAY, -1L);
        boolean z4 = jM109532i == cycleId;
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sb4 = new StringBuilder("autoPop: lastJournalPopCycleId: ");
        sb4.append(jM109532i);
        sb4.append(", haveAlreadyAutopopped: ");
        sb4.append(z4);
        AbstractC2875y.m8285A(sb4, ", cycleId: ", cycleId, ", isFromAutoPop: ");
        sb4.append(isFromAutoPop);
        interfaceC34116n.mo85228t(sb4.toString(), new AbstractC30556a.a[0]);
        return (isFromAutoPop && z4) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    private final void m33773l(AiCoachChatScreenModel coachModel) {
        String sourceType = coachModel.getSourceType();
        String sourceId = coachModel.getSourceId();
        String fingerprint = coachModel.getFingerprint();
        String staticInitialMessage = coachModel.getStaticInitialMessage();
        boolean shouldOpenFullSize = coachModel.getShouldOpenFullSize();
        String staticInitialMessage2 = coachModel.getStaticInitialMessage();
        boolean z4 = !(staticInitialMessage2 == null || AbstractC39414r.m125890i0(staticInitialMessage2));
        Map<String, JsonElement> args = coachModel.getArgs();
        if (args == null) {
            args = C25272z.f99163w;
        }
        AbstractC3006f0.m8732z(this.routerScope, null, null, new e(new C13404j(null, null, true, null, sourceType, sourceId, null, fingerprint, staticInitialMessage, null, null, null, null, z4, CoachEducationType.INSTANCE.m18519a(coachModel.getEducationType()), coachModel.getSourceId(), args, null, shouldOpenFullSize, null, null, null, false, 8001099, null), null), 3);
    }

    /* JADX INFO: renamed from: m */
    private final void m33774m(CoachScreenModel coachModel) {
        String sourceType = coachModel.getSourceType();
        String sourceId = coachModel.getSourceId();
        String conversationSeedId = coachModel.getConversationSeedId();
        String entryText = coachModel.getEntryText();
        String presetQuestion = coachModel.getPresetQuestion();
        boolean includeInitialMessage = coachModel.getIncludeInitialMessage();
        Map<String, JsonElement> args = coachModel.getArgs();
        if (args == null) {
            args = C25272z.f99163w;
        }
        AbstractC3006f0.m8732z(this.routerScope, null, null, new d(new C13404j(null, null, true, null, sourceType, sourceId, conversationSeedId, null, entryText, null, null, presetQuestion, null, includeInitialMessage, CoachEducationType.INSTANCE.m18519a(coachModel.getEducationType()), coachModel.getSourceId(), args, null, false, null, null, null, false, 8263307, null), null), 3);
    }

    /* JADX INFO: renamed from: n */
    private final void m33775n(AbstractC12177a.c event) {
        String str;
        String str2;
        String strM33703h = event.getSourceType();
        if (strM33703h != null) {
            str = strM33703h;
        } else {
            EnumC14603g enumC14603gM33702g = event.getSourcePillar();
            if (enumC14603gM33702g != null) {
                strM33703h = AbstractC15968c.m45105h(enumC14603gM33702g);
                str = strM33703h;
            } else {
                str = null;
            }
        }
        String strM33701f = event.getSourceId();
        if (strM33701f != null) {
            str2 = strM33701f;
        } else {
            EnumC14603g enumC14603gM33702g2 = event.getSourcePillar();
            if (enumC14603gM33702g2 != null) {
                strM33701f = AbstractC15968c.m45104g(enumC14603gM33702g2);
                str2 = strM33701f;
            } else {
                str2 = null;
            }
        }
        String strM33697b = event.getConversationSeedId();
        if (strM33697b == null) {
            strM33697b = String.valueOf(event.getCycleId());
        }
        AbstractC3006f0.m8732z(this.routerScope, null, null, new f(new C13404j(null, null, true, null, str, str2, strM33697b, null, event.getContextualMessage(), null, null, null, null, true, CoachEducationType.INSTANCE.m18519a(event.getEducationType()), null, C25272z.f99163w, null, false, null, null, null, false, 8263307, null), null), 3);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m33776j(AbstractC12177a event) {
        AbstractC21155m0 fVar;
        AbstractC21155m0 r4Var;
        String strM85315e;
        String strM45104g;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC12177a.c) {
            if (this.featureFlagChecker.isFeatureEnabled("coach-everywhere-homescreen-bdn")) {
                m33775n((AbstractC12177a.c) event);
                return true;
            }
            AbstractC12177a.c cVar = (AbstractC12177a.c) event;
            String strName = cVar.getSuggestionCategory().name();
            String strM33700e = cVar.getHint();
            String strM33696a = cVar.getContextualMessage();
            String strValueOf = String.valueOf(cVar.getCycleId());
            EnumC14603g enumC14603gM33702g = cVar.getSourcePillar();
            String strM45104g2 = enumC14603gM33702g != null ? AbstractC15968c.m45104g(enumC14603gM33702g) : null;
            EnumC14603g enumC14603gM33702g2 = cVar.getSourcePillar();
            m33768f(new AbstractC21155m0.z(strName, strM33700e, strM33696a, strValueOf, strM45104g2, enumC14603gM33702g2 != null ? AbstractC15968c.m45105h(enumC14603gM33702g2) : null, null, null, false, null, null, null, 4032, null));
            return true;
        }
        if (event instanceof AbstractC12177a.a) {
            AbstractC12177a.a aVar = (AbstractC12177a.a) event;
            String strM33681a = aVar.getActivityIdV2();
            String strName2 = aVar.getActivityType().name();
            String strM33683c = aVar.getLocalDate();
            String strM33685e = aVar.getWhoopActivity();
            EnumC14603g enumC14603gM33684d = aVar.getSourcePillar();
            m33768f(new AbstractC21155m0.e(strM33681a, strName2, strM33683c, strM33685e, true, enumC14603gM33684d != null ? AbstractC15968c.m45104g(enumC14603gM33684d) : null, null, 64, null));
            return true;
        }
        if (event instanceof AbstractC12177a.b) {
            AbstractC12177a.b bVar = (AbstractC12177a.b) event;
            if (bVar.getIsSleepActivity()) {
                this.homeAnalyticsHelper.m45077e(bVar.getIsGdcFlow());
            } else {
                C15967b c15967b = this.homeAnalyticsHelper;
                EnumC14603g enumC14603gM33691e = bVar.getSourcePillar();
                c15967b.m45075c(false, enumC14603gM33691e != null ? AbstractC15968c.m45104g(enumC14603gM33691e) : null, bVar.getFromFab(), Boolean.valueOf(bVar.getIsGdcFlow()), bVar.getFromMyDay());
            }
            LocalDate localDateM33687a = bVar.getActivityDate();
            boolean zM33693g = bVar.getIsSleepActivity();
            boolean zM33692f = bVar.getIsGdcFlow();
            String strM33688b = bVar.getActivityInternalName();
            if (strM33688b == null) {
                strM33688b = "";
            }
            m33768f(new AbstractC21155m0.f(zM33693g, localDateM33687a, null, null, zM33692f, strM33688b, 12, null));
            return true;
        }
        if (event instanceof AbstractC12177a.g) {
            AbstractC12177a.g gVar = (AbstractC12177a.g) event;
            this.homeAnalyticsHelper.m45082j(gVar.getSourcePillar(), gVar.getConnectivityIndicatorState());
            m33768f(new AbstractC21155m0.r0(gVar.getConnectivityNavType().name()));
            return true;
        }
        if (event instanceof AbstractC12177a.i) {
            AbstractC12177a.i iVar = (AbstractC12177a.i) event;
            this.homeAnalyticsHelper.m45085m(iVar.getIsOnboardingState());
            m33768f(new AbstractC21155m0.x1(iVar.getIsOnboardingState()));
            return true;
        }
        if (event instanceof AbstractC12177a.h) {
            this.homeAnalyticsHelper.m45085m(((AbstractC12177a.h) event).getIsOnboardingState());
            m33768f(AbstractC21155m0.u0.f80562b);
            return true;
        }
        if (event instanceof AbstractC12177a.l) {
            AbstractC12177a.l lVar = (AbstractC12177a.l) event;
            if (a.f40595a[lVar.getDestination().ordinal()] == 1) {
                this.homeAnalyticsHelper.m45064P();
            }
            m33768f(new AbstractC21155m0.g1(lVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String()));
            return true;
        }
        if (event instanceof AbstractC12177a.m) {
            m33768f(AbstractC21155m0.l1.f80441b);
            return true;
        }
        if (event instanceof AbstractC12177a.q) {
            AbstractC12177a.q qVar = (AbstractC12177a.q) event;
            String strName3 = qVar.getTrendKey().name();
            LocalDate localDateM33733a = qVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
            if (localDateM33733a == null) {
                localDateM33733a = LocalDate.now();
            }
            LocalDate localDate = localDateM33733a;
            AbstractC22676k.m65747g(localDate);
            EnumC14603g enumC14603gM33736d = qVar.getSourcePillar();
            if (enumC14603gM33736d == null || (strM45104g = AbstractC15968c.m45104g(enumC14603gM33736d)) == null || (strM85315e = AbstractC28188o1.m85315e(strM45104g)) == null) {
                strM85315e = AbstractC28188o1.m85315e("Overview");
            }
            m33768f(new AbstractC21155m0.f5(strName3, localDate, strM85315e, AbstractC28188o1.m85315e(qVar.getSourceComponent().getSourceName()), qVar.getSourceComponent() == EnumC18623a0.TREND_GRAPH ? 0 : 1, qVar.getSendTileProperties(), null, 64, null));
            return true;
        }
        if (event instanceof AbstractC12177a.o) {
            m33768f(new AbstractC21155m0.q1("home", null, null, null, null, 30, null));
            return true;
        }
        if (event instanceof AbstractC12177a.p) {
            AbstractC12177a.p pVar = (AbstractC12177a.p) event;
            m33768f(new AbstractC21155m0.w1(pVar.getHelpType(), pVar.getFromTile() ? "Tile" : "Pillar", null, pVar.getSource(), 4, null));
            return true;
        }
        if (event instanceof AbstractC12177a.r) {
            AbstractC12177a.r rVar = (AbstractC12177a.r) event;
            if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_NAVIGATION_REDUCER) && !m33772k(rVar.getCycleId(), rVar.getIsFromAutoPop())) {
                return false;
            }
            m33768f(new AbstractC21155m0.e2(rVar.getRequestDate(), rVar.getIsFromAutoPop(), rVar.getShouldShowJournalTutorial(), rVar.getCycleId(), rVar.getPreviousCycleStartTime(), rVar.getPreviousCycleEndTime(), rVar.getCurrentCycleStartDay(), rVar.getCurrentCycleEndDay(), true, rVar.getSource(), null, rVar.getFromFab(), false, 5120, null));
            return true;
        }
        if (event instanceof AbstractC12177a.d) {
            AbstractC12177a.d dVar = (AbstractC12177a.d) event;
            this.homeAnalyticsHelper.m45078f(dVar.getNavType().name());
            switch (a.f40596b[dVar.getNavType().ordinal()]) {
                case 1:
                case 2:
                    m33768f(new AbstractC21155m0.g1("https://status.whoop.com/"));
                    return true;
                case 3:
                case 4:
                case 5:
                case 6:
                    m33768f(new AbstractC21155m0.p3("home"));
                    return true;
                case 7:
                    m33768f(new AbstractC21155m0.f1(null, false, 2, null));
                    return true;
                case 8:
                case 9:
                    m33768f(new AbstractC21155m0.d0("membership/", null, null, null, 14, null));
                    return true;
                case 10:
                    m33768f(new AbstractC21155m0.d0(null, AbstractC2875y.m8299l(this.urlProvider.getUpgradeBaseUrl(), "/upgrade"), null, null, 13, null));
                    return true;
                default:
                    return true;
            }
        }
        if (event instanceof AbstractC12177a.t) {
            m33768f(new AbstractC21155m0.w3(null, null, "home", null, 11, null));
            return true;
        }
        if (event instanceof AbstractC12177a.u) {
            m33768f(AbstractC21155m0.y3.f80645b);
            return true;
        }
        if (event instanceof AbstractC12177a.v) {
            AbstractC12177a.v vVar = (AbstractC12177a.v) event;
            this.homeAnalyticsHelper.m45063O(vVar.getSourcePillar());
            m33768f(new AbstractC21155m0.k4(vVar.getGaugeType(), vVar.getSelectedDate()));
            return true;
        }
        if (event instanceof AbstractC12177a.x) {
            C15967b c15967b2 = this.homeAnalyticsHelper;
            AbstractC12177a.x xVar = (AbstractC12177a.x) event;
            EnumC14603g enumC14603gM33756c = xVar.getSourcePillar();
            c15967b2.m45075c(true, enumC14603gM33756c != null ? AbstractC15968c.m45104g(enumC14603gM33756c) : null, xVar.getFromFab(), Boolean.FALSE, xVar.getFromMyDay());
            m33768f(new AbstractC21155m0.t4(null, null, null, 7, null));
            return true;
        }
        if (event instanceof AbstractC12177a.y) {
            C15967b c15967b3 = this.homeAnalyticsHelper;
            AbstractC12177a.y yVar = (AbstractC12177a.y) event;
            EnumC14603g enumC14603gM33759c = yVar.getSourcePillar();
            c15967b3.m45075c(true, enumC14603gM33759c != null ? AbstractC15968c.m45104g(enumC14603gM33759c) : null, yVar.getFromFab(), Boolean.FALSE, yVar.getFromMyDay());
            m33768f(AbstractC12179c.m33779a());
            return true;
        }
        if (event instanceof AbstractC12177a.h0) {
            AbstractC12177a.h0 h0Var = (AbstractC12177a.h0) event;
            this.homeAnalyticsHelper.m45073Y(h0Var.getSourcePillar(), h0Var.getFromFab(), h0Var.getFromMyDay());
            m33768f(new AbstractC21155m0.y5(h0Var.getCycleId(), h0Var.getLowerBound(), h0Var.getUpperBound(), h0Var.getDayStrainValue(), h0Var.getRecoveryScoreValue(), h0Var.getMillisOfSleep(), h0Var.getCalories(), h0Var.getIsComplete()));
            return true;
        }
        if (!(event instanceof AbstractC12177a.e0)) {
            if (event instanceof AbstractC12177a.b0) {
                AbstractC12177a.b0 b0Var = (AbstractC12177a.b0) event;
                m33768f(new AbstractC21155m0.c5(b0Var.getCycleDate(), b0Var.getSource()));
                return true;
            }
            if (event instanceof AbstractC12177a.w) {
                this.homeAnalyticsHelper.m45060L();
                m33768f(AbstractC21155m0.d5.f80310b);
                return true;
            }
            if (event instanceof AbstractC12177a.n) {
                this.homeAnalyticsHelper.m45057I();
                m33768f(AbstractC21155m0.d5.f80310b);
                return true;
            }
            if (event instanceof AbstractC12177a.z) {
                AbstractC12177a.z zVar = (AbstractC12177a.z) event;
                this.homeAnalyticsHelper.m45050A(zVar.getFromFab(), zVar.getSourcePillar(), zVar.getFromMyDay());
                m33768f(new AbstractC21155m0.y4(null, null, false, null, null, null, 63, null));
                return true;
            }
            if (event instanceof AbstractC12177a.a0) {
                LocalDate localDateM33686a = ((AbstractC12177a.a0) event).getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                m33768f(new AbstractC21155m0.a5(localDateM33686a != null ? DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDateM33686a) : null, "Overview Graph", null, 4, null));
                return true;
            }
            if (event.equals(AbstractC12177a.f.f40517a)) {
                m33768f(new AbstractC21155m0.f0(null, 1, null));
                return true;
            }
            if (event instanceof AbstractC12177a.f0) {
                m33768f(AbstractC21155m0.t5.f80560b);
                return true;
            }
            if (event instanceof AbstractC12177a.c0) {
                m33768f(new AbstractC21155m0.g5(((AbstractC12177a.c0) event).getNotificationTileId()));
                return true;
            }
            if (event instanceof AbstractC12177a.i0) {
                m33768f(AbstractC21155m0.b6.f80276b);
                return true;
            }
            if (event instanceof AbstractC12177a.k) {
                m33768f(AbstractC21155m0.a1.f80253b);
                return true;
            }
            if (event instanceof AbstractC12177a.g0) {
                m33768f(new AbstractC21155m0.x5(null, null, null, 7, null));
                return true;
            }
            if (event instanceof AbstractC12177a.s) {
                AbstractC12177a.s sVar = (AbstractC12177a.s) event;
                return m33766d(sVar.getNavigationAction(), sVar.getActionArgument(), sVar.getFromMyDay());
            }
            if (event instanceof AbstractC12177a.e) {
                return m33767e(this, ((AbstractC12177a.e) event).getNavigationAction(), null, false, 6, null);
            }
            if (event instanceof AbstractC12177a.d0) {
                return false;
            }
            if (!(event instanceof AbstractC12177a.j)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC12177a.j jVar = (AbstractC12177a.j) event;
            return m33767e(this, jVar.getNavigationAction(), jVar.getSource(), false, 4, null);
        }
        AbstractC12177a.e0 e0Var = (AbstractC12177a.e0) event;
        switch (a.f40596b[e0Var.getCtaNavType().ordinal()]) {
            case 11:
                LocalDate localDateNow = LocalDate.now();
                AbstractC22676k.m65749i(localDateNow, "now(...)");
                fVar = new AbstractC21155m0.f(false, localDateNow, null, null, false, null, 61, null);
                r4Var = fVar;
                m33768f(r4Var);
                return true;
            case 12:
                this.homeAnalyticsHelper.m45068T(e0Var.getSourcePillar());
                r4Var = AbstractC21155m0.w5.f80623b;
                m33768f(r4Var);
                return true;
            case 13:
                EnumC14603g enumC14603gM33709b = e0Var.getSourcePillar();
                r4Var = new AbstractC21155m0.r4(enumC14603gM33709b != null ? AbstractC15968c.m45104g(enumC14603gM33709b) : null);
                m33768f(r4Var);
                return true;
            case 14:
                String string = LocalDate.now().toString();
                EnumC14603g enumC14603gM33709b2 = e0Var.getSourcePillar();
                fVar = new AbstractC21155m0.e("", "SLEEP", string, "SLEEP", true, enumC14603gM33709b2 != null ? AbstractC15968c.m45104g(enumC14603gM33709b2) : null, null, 64, null);
                r4Var = fVar;
                m33768f(r4Var);
                return true;
            case 15:
                r4Var = AbstractC21155m0.q5.f80524b;
                m33768f(r4Var);
                return true;
            case 16:
                r4Var = new AbstractC21155m0.a6(2025);
                m33768f(r4Var);
                return true;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                r4Var = new AbstractC21155m0.g1("http://www.whoop.com/2024-year-in-review");
                m33768f(r4Var);
                return true;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                fVar = new AbstractC21155m0.t4(null, null, null, 7, null);
                r4Var = fVar;
                m33768f(r4Var);
                return true;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                r4Var = AbstractC12179c.m33779a();
                m33768f(r4Var);
                return true;
            case 20:
                r4Var = AbstractC21155m0.u4.f80569b;
                m33768f(r4Var);
                return true;
            case 21:
                this.homeAnalyticsHelper.m45071W();
                r4Var = AbstractC21155m0.t5.f80560b;
                m33768f(r4Var);
                return true;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                r4Var = new AbstractC21155m0.x5(null, null, null, 7, null);
                m33768f(r4Var);
                return true;
            default:
                throw new IllegalArgumentException("Could not identify a route for VoW " + e0Var.getCtaNavType());
        }
    }
}
