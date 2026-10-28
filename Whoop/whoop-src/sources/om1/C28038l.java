package om1;

import android.content.Context;
import c41.C4138w;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.home.domain.HomeApi;
import com.whoop.home.domain.models.BorderAnimation;
import com.whoop.home.domain.models.CustomAnimationContainerViewState;
import com.whoop.home.domain.models.DayZeroCardsViewState;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.InterfaceC14515a;
import h01.C16550q;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import od1.InterfaceC27844g;
import org.joda.time.DateTimeConstants;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import pg3.C29218v0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qm1.AbstractC30479a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;
import v71.C35768i;
import wb3.AbstractC37056f;
import wm0.C37378a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: om1.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000 q2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001`B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\"\u001a\u00020!*\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\"\u0010&\u001a\u00020!*\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b&\u0010#J,\u0010(\u001a\u00020!*\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010'\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b(\u0010)J\"\u0010*\u001a\u00020!*\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b*\u0010#J$\u0010-\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+H\u0082@¢\u0006\u0004\b-\u0010.J\u0014\u0010/\u001a\u00020\u0003*\u00020\u0003H\u0082@¢\u0006\u0004\b/\u00100J\u0014\u00101\u001a\u00020!*\u00020\u0003H\u0082@¢\u0006\u0004\b1\u00100J\u0019\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\u00020!2\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0002¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\u00020\u0003*\u00020\u00032\u0006\u0010<\u001a\u000202H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b?\u00106J[\u0010K\u001a\u00020\u0003*\u00020\u00032\u0006\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u0002022\u0006\u0010C\u001a\u0002022\b\b\u0002\u0010E\u001a\u00020D2\b\b\u0002\u0010F\u001a\u00020D2\b\b\u0002\u0010H\u001a\u00020G2\b\b\u0002\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bM\u0010NJ\u0019\u0010O\u001a\u0004\u0018\u0001022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bO\u00104J\u0017\u0010Q\u001a\u00020!2\u0006\u0010P\u001a\u000202H\u0002¢\u0006\u0004\bQ\u0010RJ!\u0010T\u001a\u00020!2\u0006\u0010P\u001a\u0002022\b\b\u0002\u0010S\u001a\u00020\u001bH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020!2\u0006\u0010P\u001a\u000202H\u0002¢\u0006\u0004\bV\u0010RJ\u0013\u0010W\u001a\u00020\u001b*\u000208H\u0002¢\u0006\u0004\bW\u0010XJ\u001f\u0010Y\u001a\b\u0012\u0004\u0012\u00020807*\b\u0012\u0004\u0012\u00020807H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u0002022\u0006\u0010P\u001a\u000202H\u0002¢\u0006\u0004\b[\u0010\\J\u001a\u0010^\u001a\u00020!2\b\u0010]\u001a\u0004\u0018\u000108H\u0082@¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006r"}, m65681d2 = {"Lom1/l;", "Lod1/g;", "Lom1/j;", "Lom1/k;", "Lcom/whoop/home/domain/HomeApi;", "homeApi", "Lu92/d;", "prefsStore", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwm0/a;", "scopeCoordinator", "Lfi0/a;", "baseAnalytics", "Landroid/content/Context;", "context", "<init>", "(Lcom/whoop/home/domain/HomeApi;Lu92/d;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwm0/a;Lfi0/a;Landroid/content/Context;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "L", "Lcom/whoop/home/domain/models/DayZeroCardsViewState;", "viewState", "", "F", "(Lcom/whoop/home/domain/models/DayZeroCardsViewState;)Z", "Lec3/m;", "Lom1/j$a;", "action", "Ll83/a0;", "C", "(Lec3/m;Lom1/j$a;Lq83/d;)Ljava/lang/Object;", "G", "(Lom1/j$a;)Z", "A", "haveInitialDelay", "x", "(Lec3/m;Lom1/j$a;ZLq83/d;)Ljava/lang/Object;", "z", "Lom1/i;", "animationStatus", "v", "(Lom1/k;Lcom/whoop/home/domain/models/DayZeroCardsViewState;Lom1/i;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lom1/k;Lq83/d;)Ljava/lang/Object;", "H", "", "t", "(Lcom/whoop/home/domain/models/DayZeroCardsViewState;)Ljava/lang/String;", "N", "(Lcom/whoop/home/domain/models/DayZeroCardsViewState;)Lom1/k;", "", "Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;", "contents", "M", "(Ljava/util/List;)V", "keyToAnimateItem", "K", "(Lom1/k;Ljava/lang/String;)Lom1/k;", "B", "initialCardVisibility", "finalCardVisibility", "initialCardStatus", "finalCardStatus", "Lcom/whoop/home/domain/models/BorderAnimation;", "initialBorderAnimation", "finalBorderAnimation", "Lom1/b;", "exitTransition", "Lom1/a;", "enterTransition", "m", "(Lom1/k;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/home/domain/models/BorderAnimation;Lcom/whoop/home/domain/models/BorderAnimation;Lom1/b;Lom1/a;)Lom1/k;", "r", "(Lcom/whoop/home/domain/models/DayZeroCardsViewState;)V", "s", "key", "q", "(Ljava/lang/String;)V", "value", "o", "(Ljava/lang/String;Z)V", "J", "E", "(Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;)Z", "D", "(Ljava/util/List;)Ljava/util/List;", "u", "(Ljava/lang/String;)Ljava/lang/String;", "notificationCard", "I", "(Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/home/domain/HomeApi;", "b", "Lu92/d;", "c", "Ltr2/n;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Lwm0/a;", "f", "Lfi0/a;", "g", "Landroid/content/Context;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lom1/k;", "initialState", "i", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28038l implements InterfaceC27844g<AbstractC28036j, C28037k> {

    /* JADX INFO: renamed from: j */
    public static final int f113118j = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HomeApi homeApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C28037k initialState;

    /* JADX INFO: renamed from: om1.l$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.domain.DayZeroNotificationCardsInteractor", m100430f = "DayZeroNotificationCardsInteractor.kt", m100431l = {227, 229}, m100432m = "handleCompleteAnimation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f113127E;

        /* JADX INFO: renamed from: w */
        Object f113128w;

        /* JADX INFO: renamed from: x */
        Object f113129x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113130y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113130y = obj;
            this.f113127E |= Integer.MIN_VALUE;
            return C28038l.this.m84570w(null, this);
        }
    }

    /* JADX INFO: renamed from: om1.l$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.domain.DayZeroNotificationCardsInteractor", m100430f = "DayZeroNotificationCardsInteractor.kt", m100431l = {164, 165, 166, 167, DateTimeConstants.HOURS_PER_WEEK, 169, 170, 171, 172, 173, 174, 175, 176}, m100432m = "handleCompleteAnimations", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f113133F;

        /* JADX INFO: renamed from: w */
        Object f113134w;

        /* JADX INFO: renamed from: x */
        Object f113135x;

        /* JADX INFO: renamed from: y */
        boolean f113136y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f113137z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113137z = obj;
            this.f113133F |= Integer.MIN_VALUE;
            return C28038l.this.m84571x(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: om1.l$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.domain.DayZeroNotificationCardsInteractor", m100430f = "DayZeroNotificationCardsInteractor.kt", m100431l = {180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196}, m100432m = "handleGlowAnimation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f113138E;

        /* JADX INFO: renamed from: w */
        Object f113139w;

        /* JADX INFO: renamed from: x */
        Object f113140x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113141y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113141y = obj;
            this.f113138E |= Integer.MIN_VALUE;
            return C28038l.this.m84573z(null, null, this);
        }
    }

    /* JADX INFO: renamed from: om1.l$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.domain.DayZeroNotificationCardsInteractor", m100430f = "DayZeroNotificationCardsInteractor.kt", m100431l = {151, 152, 153, 154, 155, 156, 157}, m100432m = "handleInCompleteAnimations", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f113143E;

        /* JADX INFO: renamed from: w */
        Object f113144w;

        /* JADX INFO: renamed from: x */
        Object f113145x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113146y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113146y = obj;
            this.f113143E |= Integer.MIN_VALUE;
            return C28038l.this.m84536A(null, null, this);
        }
    }

    /* JADX INFO: renamed from: om1.l$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.domain.DayZeroNotificationCardsInteractor$interact$1", m100430f = "DayZeroNotificationCardsInteractor.kt", m100431l = {202}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lom1/k;", "currentState", "Lom1/j;", "currentAction", "<anonymous>", "(Lom1/k;Lom1/j;)Lom1/k;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f113148w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113149x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113150y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C28037k c28037k, AbstractC28036j abstractC28036j, InterfaceC30057d<? super C28037k> interfaceC30057d) {
            f fVar = C28038l.this.new f(interfaceC30057d);
            fVar.f113149x = c28037k;
            fVar.f113150y = abstractC28036j;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C28037k c28037k = (C28037k) this.f113149x;
            AbstractC28036j abstractC28036j = (AbstractC28036j) this.f113150y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113148w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(abstractC28036j instanceof AbstractC28036j.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C28038l c28038l = C28038l.this;
                AbstractC28036j.a aVar = (AbstractC28036j.a) abstractC28036j;
                DayZeroCardsViewState viewState = aVar.getViewState();
                InterfaceC28035i animationStatus = aVar.getAnimationStatus();
                this.f113149x = null;
                this.f113150y = null;
                this.f113148w = 1;
                obj = c28038l.m84569v(c28037k, viewState, animationStatus, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C28037k) obj;
        }
    }

    /* JADX INFO: renamed from: om1.l$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.domain.DayZeroNotificationCardsInteractor$markAppNotificationAsExpired$2$1", m100430f = "DayZeroNotificationCardsInteractor.kt", m100431l = {461}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f113152w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ CustomAnimationContainerViewState f113154y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CustomAnimationContainerViewState customAnimationContainerViewState, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f113154y = customAnimationContainerViewState;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C28038l.this.new g(this.f113154y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113152w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HomeApi homeApi = C28038l.this.homeApi;
            String id4 = this.f113154y.getId();
            this.f113152w = 1;
            Object objMarkAppNotificationAsExpired = homeApi.markAppNotificationAsExpired(id4, this);
            return objMarkAppNotificationAsExpired == enumC31071a ? enumC31071a : objMarkAppNotificationAsExpired;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: om1.l$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.domain.DayZeroNotificationCardsInteractor$reduceCustomizeAction$$inlined$flatMapLatest$1", m100430f = "DayZeroNotificationCardsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f113155w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113156x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113157y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C28038l f113158z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, C28038l c28038l) {
            super(3, interfaceC30057d);
            this.f113158z = c28038l;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC28036j abstractC28036j, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f113158z);
            hVar.f113156x = interfaceC13062m;
            hVar.f113157y = abstractC28036j;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113155w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f113156x;
                AbstractC28036j abstractC28036j = (AbstractC28036j) this.f113157y;
                if (!(abstractC28036j instanceof AbstractC28036j.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C13084s1 c13084s1 = new C13084s1(new i(abstractC28036j, this.f113158z, null));
                this.f113156x = null;
                this.f113157y = null;
                this.f113155w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC28036j) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: om1.l$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.domain.DayZeroNotificationCardsInteractor$reduceCustomizeAction$1$1", m100430f = "DayZeroNotificationCardsInteractor.kt", m100431l = {103, 106, 107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lom1/j;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113159w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113160x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC28036j f113161y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C28038l f113162z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractC28036j abstractC28036j, C28038l c28038l, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113161y = abstractC28036j;
            this.f113162z = c28038l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(this.f113161y, this.f113162z, interfaceC30057d);
            iVar.f113160x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
        
            if (r0.emit(r6, r12) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
        
            if (r13.m84573z(r0, r3, r12) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        
            if (r13.m84538C(r0, r4, r12) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
        
            return r1;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f113160x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r12.f113159w
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L21
                if (r2 == r5) goto L1c
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1c:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L9c
            L21:
                p505ts.AbstractC34132o.m107864I(r13)
                om1.j r13 = r12.f113161y
                om1.j$a r13 = (om1.AbstractC28036j.a) r13
                java.lang.String r13 = r13.getRegisterCompletion()
                java.lang.String r2 = "WHOOP_COACH_ONBOARDING"
                boolean r13 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r13, r2)
                if (r13 == 0) goto L3f
                om1.l r13 = r12.f113162z
                u92.d r13 = om1.C28038l.m84553f(r13)
                java.lang.String r2 = "WHOOP_COACH_ONBOARDING_COMPLETED"
                r13.m109538q(r2, r5)
            L3f:
                om1.l r13 = r12.f113162z
                om1.j r2 = r12.f113161y
                om1.j$a r2 = (om1.AbstractC28036j.a) r2
                com.whoop.home.domain.models.DayZeroCardsViewState r2 = r2.getViewState()
                java.lang.String r13 = om1.C28038l.m84550c(r13, r2)
                r2 = 0
                if (r13 != 0) goto L6c
                om1.j$a r6 = new om1.j$a
                om1.j r13 = r12.f113161y
                om1.j$a r13 = (om1.AbstractC28036j.a) r13
                com.whoop.home.domain.models.DayZeroCardsViewState r7 = r13.getViewState()
                r10 = 6
                r11 = 0
                r8 = 0
                r9 = 0
                r6.<init>(r7, r8, r9, r10, r11)
                r12.f113160x = r2
                r12.f113159w = r5
                java.lang.Object r13 = r0.emit(r6, r12)
                if (r13 != r1) goto L9c
                goto L9b
            L6c:
                om1.l r13 = r12.f113162z
                com.whoop.data.repositories.FeatureFlagChecker r13 = om1.C28038l.m84551d(r13)
                com.whoop.data.repositories.OnboardingFeatureFlag r5 = com.whoop.data.repositories.OnboardingFeatureFlag.HOME_GLOW_HUG
                boolean r13 = r13.isFeatureEnabled(r5)
                if (r13 == 0) goto L8b
                om1.l r13 = r12.f113162z
                om1.j r3 = r12.f113161y
                om1.j$a r3 = (om1.AbstractC28036j.a) r3
                r12.f113160x = r2
                r12.f113159w = r4
                java.lang.Object r13 = om1.C28038l.m84557j(r13, r0, r3, r12)
                if (r13 != r1) goto L9c
                goto L9b
            L8b:
                om1.l r13 = r12.f113162z
                om1.j r4 = r12.f113161y
                om1.j$a r4 = (om1.AbstractC28036j.a) r4
                r12.f113160x = r2
                r12.f113159w = r3
                java.lang.Object r13 = om1.C28038l.m84559l(r13, r0, r4, r12)
                if (r13 != r1) goto L9c
            L9b:
                return r1
            L9c:
                l83.a0 r13 = l83.C23454a0.f92919a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: om1.C28038l.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: om1.l$j */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Integer.valueOf(((CustomAnimationContainerViewState) t14).getFinalIndex()), Integer.valueOf(((CustomAnimationContainerViewState) t15).getFinalIndex()));
        }
    }

    public C28038l(HomeApi homeApi, C34660d prefsStore, InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker, C37378a scopeCoordinator, InterfaceC14515a baseAnalytics, Context context) {
        AbstractC22676k.m65750j(homeApi, "homeApi");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(context, "context");
        this.homeApi = homeApi;
        this.prefsStore = prefsStore;
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
        this.scopeCoordinator = scopeCoordinator;
        this.baseAnalytics = baseAnalytics;
        this.context = context;
        this.initialState = new C28037k(null, null, null, null, false, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d3 A[PHI: r13 r14
      0x00d3: PHI (r13v9 om1.j$a) = (r13v6 om1.j$a), (r13v11 om1.j$a) binds: [B:27:0x00d0, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r14v8 ec3.m) = (r14v5 ec3.m), (r14v10 ec3.m) binds: [B:27:0x00d0, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1 A[PHI: r13 r14
      0x00e1: PHI (r13v12 om1.j$a) = (r13v9 om1.j$a), (r13v14 om1.j$a) binds: [B:30:0x00de, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r14v11 ec3.m) = (r14v8 ec3.m), (r14v13 ec3.m) binds: [B:30:0x00de, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fd A[PHI: r13 r14
      0x00fd: PHI (r13v15 om1.j$a) = (r13v12 om1.j$a), (r13v17 om1.j$a) binds: [B:33:0x00fa, B:14:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r14v14 ec3.m) = (r14v11 ec3.m), (r14v16 ec3.m) binds: [B:33:0x00fa, B:14:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x010b A[PHI: r13 r14
      0x010b: PHI (r13v18 om1.j$a) = (r13v15 om1.j$a), (r13v23 om1.j$a) binds: [B:36:0x0108, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r14v17 ec3.m) = (r14v14 ec3.m), (r14v19 ec3.m) binds: [B:36:0x0108, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0125, code lost:
    
        if (r14.emit(r2, r0) == r1) goto L40;
     */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m84536A(ec3.InterfaceC13062m r13, om1.AbstractC28036j.a r14, q83.InterfaceC30057d<? super l83.C23454a0> r15) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: om1.C28038l.m84536A(ec3.m, om1.j$a, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: B */
    private final C28037k m84537B(DayZeroCardsViewState viewState) {
        String strM84566s = m84566s(viewState);
        return strM84566s == null ? m84549N(viewState) : m84546K(m84549N(viewState), strM84566s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final Object m84538C(InterfaceC13062m interfaceC13062m, AbstractC28036j.a aVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zM84541F = m84541F(aVar.getViewState());
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zM84541F) {
            Object objM84536A = m84536A(interfaceC13062m, aVar, interfaceC30057d);
            return objM84536A == EnumC31071a.f128113w ? objM84536A : c23454a0;
        }
        if (this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.DISABLE_ANIMATIONS_UNTIL_ACTIVITY_GETS_UPDATED_LOGIC) || !AbstractC22676k.m65745e(m84567t(aVar.getViewState()), "START_ACTIVITY")) {
            Object objM84572y = m84572y(this, interfaceC13062m, aVar, false, interfaceC30057d, 2, null);
            return objM84572y == EnumC31071a.f128113w ? objM84572y : c23454a0;
        }
        if (m84542G(aVar)) {
            Object objEmit = interfaceC13062m.emit(new AbstractC28036j.a(aVar.getViewState(), null, null, 6, null), interfaceC30057d);
            return objEmit == EnumC31071a.f128113w ? objEmit : c23454a0;
        }
        Object objM84571x = m84571x(interfaceC13062m, aVar, false, interfaceC30057d);
        return objM84571x == EnumC31071a.f128113w ? objM84571x : c23454a0;
    }

    /* JADX INFO: renamed from: D */
    private final List<CustomAnimationContainerViewState> m84539D(List<CustomAnimationContainerViewState> list) {
        Iterator<CustomAnimationContainerViewState> it = list.iterator();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            if (m84540E(it.next())) {
                break;
            }
            i14++;
        }
        if (i14 == -1) {
            return list;
        }
        List<CustomAnimationContainerViewState> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (Object obj : list2) {
            int i15 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            CustomAnimationContainerViewState customAnimationContainerViewStateCopy$default = (CustomAnimationContainerViewState) obj;
            if (i13 == i14) {
                customAnimationContainerViewStateCopy$default = CustomAnimationContainerViewState.copy$default(customAnimationContainerViewStateCopy$default, null, null, 0, null, null, null, false, null, true, null, 767, null);
            }
            arrayList.add(customAnimationContainerViewStateCopy$default);
            i13 = i15;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    private final boolean m84540E(CustomAnimationContainerViewState customAnimationContainerViewState) {
        return AbstractC22676k.m65745e(customAnimationContainerViewState.getStatus(), "INITIAL");
    }

    /* JADX INFO: renamed from: F */
    private final boolean m84541F(DayZeroCardsViewState viewState) {
        Object next;
        String strM84567t = m84567t(viewState);
        Iterator<T> it = viewState.getContents().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((CustomAnimationContainerViewState) next).getKey(), strM84567t));
        CustomAnimationContainerViewState customAnimationContainerViewState = (CustomAnimationContainerViewState) next;
        return (customAnimationContainerViewState != null ? customAnimationContainerViewState.getCompleted() : null) == null;
    }

    /* JADX INFO: renamed from: G */
    private final boolean m84542G(AbstractC28036j.a action) {
        Object next;
        Iterator<T> it = action.getViewState().getContents().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((CustomAnimationContainerViewState) next).getKey(), "START_ACTIVITY"));
        CustomAnimationContainerViewState customAnimationContainerViewState = (CustomAnimationContainerViewState) next;
        InterfaceC25312u completed = customAnimationContainerViewState != null ? customAnimationContainerViewState.getCompleted() : null;
        C35768i c35768i = completed instanceof C35768i ? (C35768i) completed : null;
        if (c35768i == null) {
            return false;
        }
        Object objM74100H0 = AbstractC25265s.m74100H0(c35768i.m113365i());
        C4138w c4138w = objM74100H0 instanceof C4138w ? (C4138w) objM74100H0 : null;
        return c4138w != null && c4138w.getActivityIdV2().length() == 0;
    }

    /* JADX INFO: renamed from: H */
    private final Object m84543H(C28037k c28037k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        String key;
        List<CustomAnimationContainerViewState> listM84531c = c28037k.m84531c();
        CustomAnimationContainerViewState customAnimationContainerViewState = null;
        Object obj = null;
        if (listM84531c != null) {
            for (Object obj2 : listM84531c) {
                if (AbstractC22676k.m65745e(((CustomAnimationContainerViewState) obj2).getKey(), c28037k.getKeyToAnimate())) {
                    obj = obj2;
                    break;
                }
            }
            customAnimationContainerViewState = (CustomAnimationContainerViewState) obj;
        }
        if (customAnimationContainerViewState != null && (key = customAnimationContainerViewState.getKey()) != null) {
            m84545J(key);
        }
        Object objM84544I = m84544I(customAnimationContainerViewState, interfaceC30057d);
        return objM84544I == EnumC31071a.f128113w ? objM84544I : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private final Object m84544I(CustomAnimationContainerViewState customAnimationContainerViewState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (customAnimationContainerViewState != null) {
            Object objM108729b = InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, AbstractC11266d.m30461o("Failed to mark notification card as expired for ", customAnimationContainerViewState.getId()), new g(customAnimationContainerViewState, null), interfaceC30057d, 2, null);
            if (objM108729b == EnumC31071a.f128113w) {
                return objM108729b;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: J */
    private final void m84545J(String key) {
        switch (key.hashCode()) {
            case -1734717884:
                if (key.equals("WIDGET")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_WIDGET_ANIMATED, true);
                    break;
                }
                break;
            case -1595088104:
                if (key.equals("CHARGE_BATTERY_ONBOARDING")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_CHARGE_ANIMATED, true);
                    break;
                }
                break;
            case -1541697216:
                if (key.equals("WHOOP_COACH_ONBOARDING")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_COACH_ANIMATED, true);
                    break;
                }
                break;
            case -854910474:
                if (key.equals("ARRHYTHMIA_FEATURE")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ARRHYTHMIA_ANIMATED, true);
                    break;
                }
                break;
            case 481489516:
                if (key.equals("START_ACTIVITY")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ACTIVITY_ANIMATED, true);
                    break;
                }
                break;
            case 535222672:
                if (key.equals("SET_UP_JOURNAL")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_JOURNAL_ANIMATED, true);
                    break;
                }
                break;
            case 1306345417:
                if (key.equals("COMMUNITY")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_COMMUNITY_ANIMATED, true);
                    break;
                }
                break;
            case 1562173114:
                if (key.equals("PLAN_MY_SLEEP")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_SLEEP_ANIMATED, true);
                    break;
                }
                break;
            case 2049622046:
                if (key.equals("ADVANCED_LABS_EARLY_ACCESS_ONBOARDING")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ADVANCE_LABS_ANIMATED, true);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: K */
    private final C28037k m84546K(C28037k c28037k, String str) {
        CustomAnimationContainerViewState customAnimationContainerViewState;
        ArrayList arrayList;
        Object next;
        ArrayList arrayList2 = new ArrayList();
        List<CustomAnimationContainerViewState> listM84531c = c28037k.m84531c();
        ArrayList arrayListM74097F1 = null;
        ArrayList arrayListM74097F2 = listM84531c != null ? AbstractC25265s.m74097F1(listM84531c) : null;
        if (arrayListM74097F2 != null) {
            Iterator it = arrayListM74097F2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((CustomAnimationContainerViewState) next).getKey(), str));
            customAnimationContainerViewState = (CustomAnimationContainerViewState) next;
        } else {
            customAnimationContainerViewState = null;
        }
        CustomAnimationContainerViewState customAnimationContainerViewStateCopy$default = customAnimationContainerViewState != null ? CustomAnimationContainerViewState.copy$default(customAnimationContainerViewState, null, null, 0, "COMPLETED", null, null, false, null, false, null, 951, null) : null;
        if (arrayListM74097F2 != null) {
            arrayList = new ArrayList();
            for (Object obj : arrayListM74097F2) {
                if (AbstractC22676k.m65745e(((CustomAnimationContainerViewState) obj).getStatus(), "INITIAL")) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayListM74097F2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayListM74097F2) {
                if (AbstractC22676k.m65745e(((CustomAnimationContainerViewState) obj2).getStatus(), "COMPLETED")) {
                    arrayList3.add(obj2);
                }
            }
            arrayListM74097F1 = AbstractC25265s.m74097F1(arrayList3);
        }
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        if (customAnimationContainerViewStateCopy$default != null) {
            int i13 = -1;
            if (arrayListM74097F1 != null) {
                Iterator it3 = arrayListM74097F1.iterator();
                int i14 = 0;
                while (it3.hasNext()) {
                    if (((CustomAnimationContainerViewState) it3.next()).getFinalIndex() > customAnimationContainerViewStateCopy$default.getFinalIndex()) {
                        i13 = i14;
                        break;
                    }
                    i14++;
                }
            }
            if (i13 >= 0) {
                if (arrayListM74097F1 != null) {
                    arrayListM74097F1.add(i13, customAnimationContainerViewStateCopy$default);
                }
            } else if (arrayListM74097F1 != null) {
                arrayListM74097F1.add(customAnimationContainerViewStateCopy$default);
            }
        }
        if (arrayListM74097F1 != null) {
            arrayList2.addAll(arrayListM74097F1);
        }
        return new C28037k(arrayList2, str, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: L */
    private final InterfaceC13058l m84547L(InterfaceC13058l interfaceC13058l) {
        return AbstractC13091v.m36590P(interfaceC13058l, new h(null, this));
    }

    /* JADX INFO: renamed from: M */
    private final void m84548M(List<CustomAnimationContainerViewState> contents) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : contents) {
            CustomAnimationContainerViewState customAnimationContainerViewState = (CustomAnimationContainerViewState) obj;
            if (AbstractC22676k.m65745e(customAnimationContainerViewState.getStatus(), "INITIAL") && (customAnimationContainerViewState.getInitial() instanceof C16550q)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC25312u initial = ((CustomAnimationContainerViewState) it.next()).getInitial();
            C16550q c16550q = initial instanceof C16550q ? (C16550q) initial : null;
            if (c16550q != null) {
                arrayList2.add(c16550q);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AbstractC30479a.m93290b(this.baseAnalytics, ((C16550q) it3.next()).getTitle().resolve(this.context).toString());
        }
    }

    /* JADX INFO: renamed from: N */
    private final C28037k m84549N(DayZeroCardsViewState viewState) {
        List<CustomAnimationContainerViewState> contents = viewState.getContents();
        ArrayList arrayList = new ArrayList();
        for (Object obj : contents) {
            CustomAnimationContainerViewState customAnimationContainerViewState = (CustomAnimationContainerViewState) obj;
            if (customAnimationContainerViewState.getInitial() != null || customAnimationContainerViewState.getCompleted() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CustomAnimationContainerViewState customAnimationContainerViewState2 = (CustomAnimationContainerViewState) it.next();
            arrayList2.add(CustomAnimationContainerViewState.copy$default(customAnimationContainerViewState2, null, null, 0, (customAnimationContainerViewState2.getInitial() != null || customAnimationContainerViewState2.getCompleted() == null) ? m84568u(customAnimationContainerViewState2.getKey()) : "COMPLETED", null, null, false, null, false, null, MessageListItemViewType.LINK_ATTACHMENTS, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            CustomAnimationContainerViewState customAnimationContainerViewState3 = (CustomAnimationContainerViewState) obj2;
            if (AbstractC22676k.m65745e(customAnimationContainerViewState3.getStatus(), "COMPLETED") && customAnimationContainerViewState3.getCompleted() != null) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            List<CustomAnimationContainerViewState> listM84539D = m84539D(arrayList2);
            m84548M(listM84539D);
            return new C28037k(listM84539D, null, null, null, false, 28, null);
        }
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList3, new j());
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!AbstractC22676k.m65745e(((CustomAnimationContainerViewState) obj3).getStatus(), "COMPLETED")) {
                arrayList4.add(obj3);
            }
        }
        List<CustomAnimationContainerViewState> listM74129g1 = AbstractC25265s.m74129g1(m84539D(arrayList4), listM74152u1);
        m84548M(listM74129g1);
        return new C28037k(listM74129g1, null, null, null, false, 30, null);
    }

    /* JADX INFO: renamed from: m */
    private final C28037k m84560m(C28037k c28037k, boolean z4, boolean z13, String str, String str2, BorderAnimation borderAnimation, BorderAnimation borderAnimation2, InterfaceC28028b interfaceC28028b, InterfaceC28027a interfaceC28027a) {
        ArrayList arrayList;
        List<CustomAnimationContainerViewState> listM84531c = c28037k.m84531c();
        if (listM84531c != null) {
            List<CustomAnimationContainerViewState> list = listM84531c;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            boolean z14 = false;
            boolean z15 = false;
            for (CustomAnimationContainerViewState customAnimationContainerViewStateCopy$default : list) {
                if (!z14 && AbstractC22676k.m65745e(customAnimationContainerViewStateCopy$default.getKey(), c28037k.getKeyToAnimate())) {
                    customAnimationContainerViewStateCopy$default = CustomAnimationContainerViewState.copy$default(customAnimationContainerViewStateCopy$default, null, null, 0, str, null, null, z4, borderAnimation, false, null, 823, null);
                    z14 = true;
                } else if (!z15 && AbstractC22676k.m65745e(customAnimationContainerViewStateCopy$default.getKey(), c28037k.getKeyToAnimate())) {
                    customAnimationContainerViewStateCopy$default = CustomAnimationContainerViewState.copy$default(customAnimationContainerViewStateCopy$default, null, null, 0, str2, null, null, z13, borderAnimation2, false, null, 823, null);
                    z15 = true;
                }
                arrayList.add(customAnimationContainerViewStateCopy$default);
            }
        } else {
            arrayList = null;
        }
        return C28037k.m84529b(c28037k, arrayList, null, interfaceC28027a, interfaceC28028b, false, 18, null);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C28037k m84561n(C28038l c28038l, C28037k c28037k, boolean z4, boolean z13, String str, String str2, BorderAnimation borderAnimation, BorderAnimation borderAnimation2, InterfaceC28028b interfaceC28028b, InterfaceC28027a interfaceC28027a, int i13, Object obj) {
        return c28038l.m84560m(c28037k, z4, z13, str, str2, (i13 & 16) != 0 ? BorderAnimation.NONE : borderAnimation, (i13 & 32) != 0 ? BorderAnimation.NONE : borderAnimation2, (i13 & 64) != 0 ? C28031e.f113095a : interfaceC28028b, (i13 & 128) != 0 ? C28030d.f113094a : interfaceC28027a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: o */
    private final void m84562o(String key, boolean value) {
        if (this.prefsStore.m109526c(key)) {
            return;
        }
        String strM125900s0 = AbstractC39414r.m125900s0(key, "_ANIMATED");
        switch (strM125900s0.hashCode()) {
            case -1734717884:
                if (strM125900s0.equals("WIDGET")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_WIDGET_ANIMATED, value);
                    break;
                }
                break;
            case -1595088104:
                if (strM125900s0.equals("CHARGE_BATTERY_ONBOARDING")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_CHARGE_ANIMATED, value);
                    break;
                }
                break;
            case -1541697216:
                if (strM125900s0.equals("WHOOP_COACH_ONBOARDING")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_COACH_ANIMATED, value);
                    break;
                }
                break;
            case -854910474:
                if (strM125900s0.equals("ARRHYTHMIA_FEATURE")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ARRHYTHMIA_ANIMATED, value);
                    break;
                }
                break;
            case 481489516:
                if (strM125900s0.equals("START_ACTIVITY")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ACTIVITY_ANIMATED, value);
                    break;
                }
                break;
            case 535222672:
                if (strM125900s0.equals("SET_UP_JOURNAL")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_JOURNAL_ANIMATED, value);
                    break;
                }
                break;
            case 1306345417:
                if (strM125900s0.equals("COMMUNITY")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_COMMUNITY_ANIMATED, value);
                    break;
                }
                break;
            case 1562173114:
                if (strM125900s0.equals("PLAN_MY_SLEEP")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_SLEEP_ANIMATED, value);
                    break;
                }
                break;
            case 2049622046:
                if (strM125900s0.equals("ADVANCED_LABS_EARLY_ACCESS_ONBOARDING")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ADVANCE_LABS_ANIMATED, value);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m84563p(C28038l c28038l, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        c28038l.m84562o(str, z4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: q */
    private final void m84564q(String key) {
        if (this.prefsStore.m109526c(key)) {
            return;
        }
        String strM125900s0 = AbstractC39414r.m125900s0(key, "_COMPLETED");
        switch (strM125900s0.hashCode()) {
            case -1734717884:
                if (strM125900s0.equals("WIDGET")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_WIDGET_COMPLETED, false);
                    break;
                }
                break;
            case -1595088104:
                if (strM125900s0.equals("CHARGE_BATTERY_ONBOARDING")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_CHARGE_COMPLETED, false);
                    break;
                }
                break;
            case -1541697216:
                if (strM125900s0.equals("WHOOP_COACH_ONBOARDING")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_COACH_COMPLETED, false);
                    break;
                }
                break;
            case -854910474:
                if (strM125900s0.equals("ARRHYTHMIA_FEATURE")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ARRHYTHMIA_COMPLETED, false);
                    break;
                }
                break;
            case 481489516:
                if (strM125900s0.equals("START_ACTIVITY")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ACTIVITY_COMPLETED, false);
                    break;
                }
                break;
            case 535222672:
                if (strM125900s0.equals("SET_UP_JOURNAL")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_JOURNAL_COMPLETED, false);
                    break;
                }
                break;
            case 1306345417:
                if (strM125900s0.equals("COMMUNITY")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_COMMUNITY_COMPLETED, false);
                    break;
                }
                break;
            case 1562173114:
                if (strM125900s0.equals("PLAN_MY_SLEEP")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_SLEEP_COMPLETED, false);
                    break;
                }
                break;
            case 2049622046:
                if (strM125900s0.equals("ADVANCED_LABS_EARLY_ACCESS_ONBOARDING")) {
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ADVANCE_LABS_COMPLETED, false);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m84565r(DayZeroCardsViewState viewState) {
        for (CustomAnimationContainerViewState customAnimationContainerViewState : viewState.getContents()) {
            m84564q(AbstractC2875y.m8299l(customAnimationContainerViewState.getKey(), "_COMPLETED"));
            m84563p(this, AbstractC2875y.m8299l(customAnimationContainerViewState.getKey(), "_ANIMATED"), false, 2, null);
        }
    }

    /* JADX INFO: renamed from: s */
    private final String m84566s(DayZeroCardsViewState viewState) {
        Iterator<T> it = viewState.getContents().iterator();
        while (it.hasNext()) {
            String key = ((CustomAnimationContainerViewState) it.next()).getKey();
            String strM8299l = AbstractC2875y.m8299l(key, "_COMPLETED");
            String strM8299l2 = AbstractC2875y.m8299l(key, "_ANIMATED");
            boolean zM109528e = this.prefsStore.m109528e(strM8299l, false);
            boolean zM109528e2 = this.prefsStore.m109528e(strM8299l2, false);
            if (zM109528e && !zM109528e2) {
                return key;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final String m84567t(DayZeroCardsViewState viewState) {
        Object next;
        m84565r(viewState);
        String strM84566s = m84566s(viewState);
        Iterator<T> it = viewState.getContents().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((CustomAnimationContainerViewState) next).getKey(), strM84566s));
        CustomAnimationContainerViewState customAnimationContainerViewState = (CustomAnimationContainerViewState) next;
        if (customAnimationContainerViewState == null || customAnimationContainerViewState.getInitial() == null) {
            return null;
        }
        return strM84566s;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: u */
    private final String m84568u(String key) {
        switch (key.hashCode()) {
            case -1734717884:
                return (key.equals("WIDGET") && this.prefsStore.m109528e(SharedPreferenceConstants.DAY_ZERO_TASK_WIDGET_ANIMATED, false)) ? "COMPLETED" : "INITIAL";
            case -1595088104:
                return (key.equals("CHARGE_BATTERY_ONBOARDING") && this.prefsStore.m109528e(SharedPreferenceConstants.DAY_ZERO_TASK_CHARGE_ANIMATED, false)) ? "COMPLETED" : "INITIAL";
            case -1541697216:
                return (key.equals("WHOOP_COACH_ONBOARDING") && this.prefsStore.m109528e(SharedPreferenceConstants.DAY_ZERO_TASK_COACH_ANIMATED, false)) ? "COMPLETED" : "INITIAL";
            case -854910474:
                return (key.equals("ARRHYTHMIA_FEATURE") && this.prefsStore.m109528e(SharedPreferenceConstants.DAY_ZERO_TASK_ARRHYTHMIA_ANIMATED, false)) ? "COMPLETED" : "INITIAL";
            case 481489516:
                return (key.equals("START_ACTIVITY") && this.prefsStore.m109528e(SharedPreferenceConstants.DAY_ZERO_TASK_ACTIVITY_ANIMATED, false)) ? "COMPLETED" : "INITIAL";
            case 535222672:
                return (key.equals("SET_UP_JOURNAL") && this.prefsStore.m109528e(SharedPreferenceConstants.DAY_ZERO_TASK_JOURNAL_ANIMATED, false)) ? "COMPLETED" : "INITIAL";
            case 1306345417:
                return (key.equals("COMMUNITY") && this.prefsStore.m109528e(SharedPreferenceConstants.DAY_ZERO_TASK_COMMUNITY_ANIMATED, false)) ? "COMPLETED" : "INITIAL";
            case 1562173114:
                return (key.equals("PLAN_MY_SLEEP") && this.prefsStore.m109528e(SharedPreferenceConstants.DAY_ZERO_TASK_SLEEP_ANIMATED, false)) ? "COMPLETED" : "INITIAL";
            case 2049622046:
                return (key.equals("ADVANCED_LABS_EARLY_ACCESS_ONBOARDING") && this.prefsStore.m109528e(SharedPreferenceConstants.DAY_ZERO_TASK_ADVANCE_LABS_ANIMATED, false)) ? "COMPLETED" : "INITIAL";
            default:
                return "INITIAL";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final Object m84569v(C28037k c28037k, DayZeroCardsViewState dayZeroCardsViewState, InterfaceC28035i interfaceC28035i, InterfaceC30057d<? super C28037k> interfaceC30057d) {
        if (AbstractC22676k.m65745e(interfaceC28035i, InterfaceC28035i.f.f113104a)) {
            return m84537B(dayZeroCardsViewState);
        }
        if (AbstractC22676k.m65745e(interfaceC28035i, InterfaceC28035i.i.f113107a)) {
            return m84561n(this, c28037k, false, false, "INITIAL", "COMPLETED", null, null, C28033g.f113097a, null, 176, null);
        }
        if (AbstractC22676k.m65745e(interfaceC28035i, InterfaceC28035i.g.f113105a)) {
            return m84561n(this, c28037k, false, false, "COMPLETED", "COMPLETED", null, null, C28033g.f113097a, null, 176, null);
        }
        if (AbstractC22676k.m65745e(interfaceC28035i, InterfaceC28035i.h.f113106a)) {
            return m84561n(this, c28037k, true, false, "COMPLETED", "COMPLETED", null, null, null, C28032f.f113096a, 112, null);
        }
        if (AbstractC22676k.m65745e(interfaceC28035i, InterfaceC28035i.j.f113108a)) {
            return C28037k.m84529b(c28037k, null, null, null, null, true, 15, null);
        }
        if (AbstractC22676k.m65745e(interfaceC28035i, InterfaceC28035i.b.f113100a)) {
            return m84561n(this, c28037k, true, false, "COMPLETED", "COMPLETED", BorderAnimation.INITIAL, null, null, null, 224, null);
        }
        if (AbstractC22676k.m65745e(interfaceC28035i, InterfaceC28035i.e.f113103a)) {
            return m84561n(this, c28037k, false, true, "COMPLETED", "COMPLETED", null, null, C28034h.f113098a, C28029c.f113093a, 48, null);
        }
        if (AbstractC22676k.m65745e(interfaceC28035i, InterfaceC28035i.a.f113099a)) {
            return m84561n(this, c28037k, false, true, "COMPLETED", "COMPLETED", null, BorderAnimation.FINAL, null, null, 208, null);
        }
        if (AbstractC22676k.m65745e(interfaceC28035i, InterfaceC28035i.d.f113102a)) {
            return m84561n(this, c28037k, false, true, "COMPLETED", "COMPLETED", null, null, null, null, 240, null);
        }
        if (AbstractC22676k.m65745e(interfaceC28035i, InterfaceC28035i.c.f113101a)) {
            return m84570w(c28037k, interfaceC30057d);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (wm0.C37378a.m119655c(r15, null, r0, 1, null) == r1) goto L37;
     */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m84570w(om1.C28037k r14, q83.InterfaceC30057d<? super om1.C28037k> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof om1.C28038l.b
            if (r0 == 0) goto L13
            r0 = r15
            om1.l$b r0 = (om1.C28038l.b) r0
            int r1 = r0.f113127E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113127E = r1
            goto L18
        L13:
            om1.l$b r0 = new om1.l$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f113130y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f113127E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r14 = r0.f113129x
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r0 = r0.f113128w
            om1.k r0 = (om1.C28037k) r0
            p505ts.AbstractC34132o.m107864I(r15)
            goto La2
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            java.lang.Object r14 = r0.f113128w
            om1.k r14 = (om1.C28037k) r14
            p505ts.AbstractC34132o.m107864I(r15)
        L42:
            r5 = r14
            goto L52
        L44:
            p505ts.AbstractC34132o.m107864I(r15)
            r0.f113128w = r14
            r0.f113127E = r4
            java.lang.Object r15 = r13.m84543H(r14, r0)
            if (r15 != r1) goto L42
            goto La1
        L52:
            java.util.List r14 = r5.m84531c()
            if (r14 != 0) goto L69
            java.util.List r6 = r5.m84531c()
            om1.d r8 = om1.C28030d.f113094a
            om1.e r9 = om1.C28031e.f113095a
            r11 = 2
            r12 = 0
            r7 = 0
            r10 = 0
            om1.k r14 = om1.C28037k.m84529b(r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        L69:
            r15 = r14
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            boolean r2 = r15 instanceof java.util.Collection
            if (r2 == 0) goto L7a
            r2 = r15
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L7a
            goto L92
        L7a:
            java.util.Iterator r15 = r15.iterator()
        L7e:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r15.next()
            com.whoop.home.domain.models.CustomAnimationContainerViewState r2 = (com.whoop.home.domain.models.CustomAnimationContainerViewState) r2
            boolean r2 = r13.m84540E(r2)
            if (r2 == 0) goto L7e
        L90:
            r0 = r5
            goto La2
        L92:
            wm0.a r15 = r13.scopeCoordinator
            r0.f113128w = r5
            r0.f113129x = r14
            r0.f113127E = r3
            r2 = 0
            java.lang.Object r15 = wm0.C37378a.m119655c(r15, r2, r0, r4, r2)
            if (r15 != r1) goto L90
        La1:
            return r1
        La2:
            java.util.List r1 = r13.m84539D(r14)
            om1.d r3 = om1.C28030d.f113094a
            om1.e r4 = om1.C28031e.f113095a
            r6 = 2
            r7 = 0
            r2 = 0
            r5 = 0
            om1.k r14 = om1.C28037k.m84529b(r0, r1, r2, r3, r4, r5, r6, r7)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: om1.C28038l.m84570w(om1.k, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0117  */
    /* JADX WARN: Code duplicated, block: B:33:0x0128  */
    /* JADX WARN: Code duplicated, block: B:35:0x012e A[PHI: r0 r1 r4
      0x012e: PHI (r0v5 ec3.m) = (r0v1 ec3.m), (r0v8 ec3.m) binds: [B:29:0x0115, B:34:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r1v5 om1.j$a) = (r1v3 om1.j$a), (r1v6 om1.j$a) binds: [B:29:0x0115, B:34:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r4v7 boolean) = (r4v2 boolean), (r4v10 boolean) binds: [B:29:0x0115, B:34:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x014d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0163 A[PHI: r0 r4 r7
      0x0163: PHI (r0v12 boolean) = (r0v10 boolean), (r0v13 boolean) binds: [B:40:0x015f, B:21:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r4v16 om1.j$a) = (r4v13 om1.j$a), (r4v18 om1.j$a) binds: [B:40:0x015f, B:21:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r7v16 ec3.m) = (r7v13 ec3.m), (r7v18 ec3.m) binds: [B:40:0x015f, B:21:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0182 A[PHI: r0 r4 r7
      0x0182: PHI (r0v14 boolean) = (r0v12 boolean), (r0v15 boolean) binds: [B:43:0x017e, B:20:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r4v19 om1.j$a) = (r4v16 om1.j$a), (r4v21 om1.j$a) binds: [B:43:0x017e, B:20:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r7v19 ec3.m) = (r7v16 ec3.m), (r7v21 ec3.m) binds: [B:43:0x017e, B:20:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01a1 A[PHI: r0 r4 r7
      0x01a1: PHI (r0v16 boolean) = (r0v14 boolean), (r0v17 boolean) binds: [B:46:0x019d, B:19:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r4v22 om1.j$a) = (r4v19 om1.j$a), (r4v24 om1.j$a) binds: [B:46:0x019d, B:19:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r7v22 ec3.m) = (r7v19 ec3.m), (r7v24 ec3.m) binds: [B:46:0x019d, B:19:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b4 A[PHI: r0 r4 r7
      0x01b4: PHI (r0v18 boolean) = (r0v16 boolean), (r0v19 boolean) binds: [B:49:0x01b0, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r4v25 om1.j$a) = (r4v22 om1.j$a), (r4v27 om1.j$a) binds: [B:49:0x01b0, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r7v25 ec3.m) = (r7v22 ec3.m), (r7v27 ec3.m) binds: [B:49:0x01b0, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01d4 A[PHI: r0 r4 r7
      0x01d4: PHI (r0v20 boolean) = (r0v18 boolean), (r0v21 boolean) binds: [B:52:0x01d0, B:17:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r4v28 om1.j$a) = (r4v25 om1.j$a), (r4v30 om1.j$a) binds: [B:52:0x01d0, B:17:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r7v28 ec3.m) = (r7v25 ec3.m), (r7v30 ec3.m) binds: [B:52:0x01d0, B:17:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01f3 A[PHI: r0 r4 r7
      0x01f3: PHI (r0v22 boolean) = (r0v20 boolean), (r0v23 boolean) binds: [B:55:0x01f0, B:16:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r4v31 om1.j$a) = (r4v28 om1.j$a), (r4v33 om1.j$a) binds: [B:55:0x01f0, B:16:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r7v31 ec3.m) = (r7v28 ec3.m), (r7v33 ec3.m) binds: [B:55:0x01f0, B:16:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0204  */
    /* JADX WARN: Code duplicated, block: B:64:0x0224 A[PHI: r0 r4 r5
      0x0224: PHI (r0v26 boolean) = (r0v24 boolean), (r0v27 boolean) binds: [B:62:0x0221, B:14:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r4v37 om1.j$a) = (r4v34 om1.j$a), (r4v39 om1.j$a) binds: [B:62:0x0221, B:14:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r5v5 ec3.m) = (r5v2 ec3.m), (r5v7 ec3.m) binds: [B:62:0x0221, B:14:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0237 A[PHI: r0 r4 r5
      0x0237: PHI (r0v28 boolean) = (r0v26 boolean), (r0v31 boolean) binds: [B:65:0x0234, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r4v40 om1.j$a) = (r4v37 om1.j$a), (r4v42 om1.j$a) binds: [B:65:0x0234, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r5v8 ec3.m) = (r5v5 ec3.m), (r5v10 ec3.m) binds: [B:65:0x0234, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0254, code lost:
    
        if (r5.emit(r6, r2) == r3) goto L69;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m84571x(ec3.InterfaceC13062m r15, om1.AbstractC28036j.a r16, boolean r17, q83.InterfaceC30057d<? super l83.C23454a0> r18) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: om1.C28038l.m84571x(ec3.m, om1.j$a, boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Object m84572y(C28038l c28038l, InterfaceC13062m interfaceC13062m, AbstractC28036j.a aVar, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = true;
        }
        return c28038l.m84571x(interfaceC13062m, aVar, z4, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0134  */
    /* JADX WARN: Code duplicated, block: B:39:0x0154 A[PHI: r13 r14
      0x0154: PHI (r13v9 om1.j$a) = (r13v6 om1.j$a), (r13v11 om1.j$a) binds: [B:37:0x0150, B:26:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r14v8 ec3.m) = (r14v5 ec3.m), (r14v10 ec3.m) binds: [B:37:0x0150, B:26:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0165 A[PHI: r13 r14
      0x0165: PHI (r13v12 om1.j$a) = (r13v9 om1.j$a), (r13v14 om1.j$a) binds: [B:40:0x0161, B:25:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r14v11 ec3.m) = (r14v8 ec3.m), (r14v13 ec3.m) binds: [B:40:0x0161, B:25:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0182 A[PHI: r13 r14
      0x0182: PHI (r13v15 om1.j$a) = (r13v12 om1.j$a), (r13v17 om1.j$a) binds: [B:43:0x017e, B:24:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r14v14 ec3.m) = (r14v11 ec3.m), (r14v16 ec3.m) binds: [B:43:0x017e, B:24:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x019f A[PHI: r13 r14
      0x019f: PHI (r13v18 om1.j$a) = (r13v15 om1.j$a), (r13v20 om1.j$a) binds: [B:46:0x019b, B:23:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r14v17 ec3.m) = (r14v14 ec3.m), (r14v19 ec3.m) binds: [B:46:0x019b, B:23:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b0 A[PHI: r13 r14
      0x01b0: PHI (r13v21 om1.j$a) = (r13v18 om1.j$a), (r13v23 om1.j$a) binds: [B:49:0x01ac, B:22:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r14v20 ec3.m) = (r14v17 ec3.m), (r14v22 ec3.m) binds: [B:49:0x01ac, B:22:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ce A[PHI: r13 r14
      0x01ce: PHI (r13v24 om1.j$a) = (r13v21 om1.j$a), (r13v26 om1.j$a) binds: [B:52:0x01ca, B:21:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r14v23 ec3.m) = (r14v20 ec3.m), (r14v25 ec3.m) binds: [B:52:0x01ca, B:21:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01ec A[PHI: r13 r14
      0x01ec: PHI (r13v27 om1.j$a) = (r13v24 om1.j$a), (r13v29 om1.j$a) binds: [B:55:0x01e8, B:20:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r14v26 ec3.m) = (r14v23 ec3.m), (r14v28 ec3.m) binds: [B:55:0x01e8, B:20:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01fc A[PHI: r13 r14
      0x01fc: PHI (r13v30 om1.j$a) = (r13v27 om1.j$a), (r13v32 om1.j$a) binds: [B:58:0x01f8, B:19:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r14v29 ec3.m) = (r14v26 ec3.m), (r14v31 ec3.m) binds: [B:58:0x01f8, B:19:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x021a A[PHI: r13 r14
      0x021a: PHI (r13v33 om1.j$a) = (r13v30 om1.j$a), (r13v35 om1.j$a) binds: [B:61:0x0216, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r14v32 ec3.m) = (r14v29 ec3.m), (r14v34 ec3.m) binds: [B:61:0x0216, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x022c A[PHI: r13 r14
      0x022c: PHI (r13v36 om1.j$a) = (r13v33 om1.j$a), (r13v38 om1.j$a) binds: [B:64:0x0228, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r14v35 ec3.m) = (r14v32 ec3.m), (r14v37 ec3.m) binds: [B:64:0x0228, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0249 A[PHI: r13 r14
      0x0249: PHI (r13v39 om1.j$a) = (r13v36 om1.j$a), (r13v41 om1.j$a) binds: [B:67:0x0246, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r14v38 ec3.m) = (r14v35 ec3.m), (r14v40 ec3.m) binds: [B:67:0x0246, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0258 A[PHI: r13 r14
      0x0258: PHI (r13v42 om1.j$a) = (r13v39 om1.j$a), (r13v44 om1.j$a) binds: [B:70:0x0255, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r14v41 ec3.m) = (r14v38 ec3.m), (r14v43 ec3.m) binds: [B:70:0x0255, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0275 A[PHI: r13 r14
      0x0275: PHI (r13v45 om1.j$a) = (r13v42 om1.j$a), (r13v47 om1.j$a) binds: [B:73:0x0272, B:14:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r14v44 ec3.m) = (r14v41 ec3.m), (r14v46 ec3.m) binds: [B:73:0x0272, B:14:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0286 A[PHI: r13 r14
      0x0286: PHI (r13v48 om1.j$a) = (r13v45 om1.j$a), (r13v53 om1.j$a) binds: [B:76:0x0283, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r14v47 ec3.m) = (r14v44 ec3.m), (r14v49 ec3.m) binds: [B:76:0x0283, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02a1, code lost:
    
        if (r14.emit(r2, r0) == r1) goto L80;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m84573z(ec3.InterfaceC13062m r13, om1.AbstractC28036j.a r14, q83.InterfaceC30057d<? super l83.C23454a0> r15) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: om1.C28038l.m84573z(ec3.m, om1.j$a, q83.d):java.lang.Object");
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(this.initialState, m84547L(upstream), new f(null));
    }
}
