package qn1;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.NotificationCardModel;
import com.whoop.design.models.cards.TextAndImageCardModel;
import com.whoop.design.models.cards.TextOnlyCardModel;
import com.whoop.design.models.cards.TextWithDesignItemCardModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.homenotificationscenter.domain.models.HomeNotificationsCenterResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25235a0;
import m83.C25271y;
import nn1.C26866a;
import od1.AbstractC27845h;
import od1.InterfaceC27844g;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p741vn1.EnumC36197a;
import p741vn1.EnumC36205i;
import pn1.AbstractC29378a;
import pn1.AbstractC29379b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: qn1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010%\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b%\u0010&J9\u0010)\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010(\u001a\u00020'2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b)\u0010*J#\u0010.\u001a\b\u0012\u0004\u0012\u00020-0+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0002¢\u0006\u0004\b.\u0010/J#\u00100\u001a\b\u0012\u0004\u0012\u00020-0+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0002¢\u0006\u0004\b0\u0010/J+\u00104\u001a\u0002032\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b4\u00105J'\u00108\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u00107\u001a\u0002062\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b8\u00109J'\u0010;\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u00107\u001a\u00020:2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0016¢\u0006\u0004\b=\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001a\u0010N\u001a\u0004\u0018\u00010\u0015*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, m65681d2 = {"Lqn1/a;", "Lod1/g;", "Lpn1/a;", "Lpn1/b;", "Lqn1/b;", "fetchInteractor", "Lqn1/c;", "interactionInteractor", "Lnn1/a;", "homeNotificationsCenterAnalyticsHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lqn1/b;Lqn1/c;Lnn1/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/NotificationCardModel;", "q", "(Ljava/util/List;)Ljava/util/List;", "p", "", "", "dismissedCardIds", "n", "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;", "id", "notificationCards", "userCategory", "Ll83/a0;", "t", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "cardVariant", "label", "totalCards", "notificationType", "templateName", "u", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lvn1/a;", "dismissAction", "v", "(Ljava/lang/String;Ljava/util/List;Lvn1/a;Ljava/lang/String;)V", "Lec3/l;", "upstream", "Lqn1/d;", "o", "(Lec3/l;)Lec3/l;", "y", "currentCards", "newCards", "", "z", "(Ljava/util/List;Ljava/util/List;)Z", "Lpn1/b$c;", "currentState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Lpn1/b$c;Lvn1/a;)Lpn1/b;", "Lpn1/b$d;", "x", "(Ljava/lang/String;Lpn1/b$d;Lvn1/a;)Lpn1/b;", "interact", "a", "Lqn1/b;", "b", "Lqn1/c;", "c", "Lnn1/a;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Lpn1/b;", "initial", "s", "(Lpn1/b;)Ljava/util/Set;", "currentDismissedCardIds", "r", "(Lpn1/b;)Ljava/lang/String;", "currentCategory", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30518a implements InterfaceC27844g<AbstractC29378a, AbstractC29379b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C30519b fetchInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30520c interactionInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C26866a homeNotificationsCenterAnalyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC29379b initial;

    /* JADX INFO: renamed from: qn1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f125360a;

        static {
            int[] iArr = new int[EnumC36197a.values().length];
            try {
                iArr[EnumC36197a.SWIPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36197a.TAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f125360a = iArr;
        }
    }

    /* JADX INFO: renamed from: qn1.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f125361w;

        /* JADX INFO: renamed from: qn1.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f125362w;

            /* JADX INFO: renamed from: qn1.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsCenterDomainCombiner$fetchInteractorStream$$inlined$filterIsInstance$1$2", m100430f = "HomeNotificationsCenterDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42228a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f125364F;

                /* JADX INFO: renamed from: G */
                Object f125365G;

                /* JADX INFO: renamed from: H */
                int f125366H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f125367w;

                /* JADX INFO: renamed from: x */
                int f125368x;

                /* JADX INFO: renamed from: y */
                Object f125369y;

                /* JADX INFO: renamed from: z */
                Object f125370z;

                public C42228a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f125367w = obj;
                    this.f125368x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f125362w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42228a c42228a;
                if (interfaceC30057d instanceof C42228a) {
                    c42228a = (C42228a) interfaceC30057d;
                    int i13 = c42228a.f125368x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42228a.f125368x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42228a = new C42228a(interfaceC30057d);
                    }
                } else {
                    c42228a = new C42228a(interfaceC30057d);
                }
                Object obj2 = c42228a.f125367w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42228a.f125368x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f125362w;
                    if (obj instanceof AbstractC29378a.c) {
                        c42228a.f125369y = null;
                        c42228a.f125370z = null;
                        c42228a.f125364F = null;
                        c42228a.f125365G = null;
                        c42228a.f125366H = 0;
                        c42228a.f125368x = 1;
                        if (interfaceC13062m.emit(obj, c42228a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l) {
            this.f125361w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f125361w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qn1.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsCenterDomainCombiner$interact$1", m100430f = "HomeNotificationsCenterDomainCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lpn1/b;", "currentState", "Lqn1/d;", "internalAction", "<anonymous>", "(Lpn1/b;Lqn1/d;)Lpn1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f125371w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f125372x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f125373y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC29379b abstractC29379b, AbstractC30521d abstractC30521d, InterfaceC30057d<? super AbstractC29379b> interfaceC30057d) {
            c cVar = C30518a.this.new c(interfaceC30057d);
            cVar.f125372x = abstractC29379b;
            cVar.f125373y = abstractC30521d;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String id4;
            AbstractC29379b abstractC29379b = (AbstractC29379b) this.f125372x;
            AbstractC30521d abstractC30521d = (AbstractC30521d) this.f125373y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f125371w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            boolean z4 = abstractC30521d instanceof AbstractC30521d.k;
            C25271y c25271y = C25271y.f99162w;
            if (z4) {
                AbstractC30521d.k kVar = (AbstractC30521d.k) abstractC30521d;
                String userCategory = kVar.getUserCategory();
                if (userCategory == null) {
                    userCategory = C30518a.this.m93498r(abstractC29379b);
                }
                String str = userCategory;
                Set setM93499s = C30518a.this.m93499s(abstractC29379b);
                C30518a c30518a = C30518a.this;
                List<? extends NotificationCardModel> listM93494n = C30518a.this.m93494n(c30518a.m93496p(c30518a.m93497q(kVar.getCacheResponse().getNotificationCards())), setM93499s);
                boolean zM93506z = (abstractC29379b instanceof AbstractC29379b.d ? (AbstractC29379b.d) abstractC29379b : null) != null ? C30518a.this.m93506z(((AbstractC29379b.d) abstractC29379b).m89559c(), listM93494n) : false;
                if (!listM93494n.isEmpty()) {
                    C26866a c26866a = C30518a.this.homeNotificationsCenterAnalyticsHelper;
                    NotificationCardModel notificationCardModel = (NotificationCardModel) AbstractC25265s.m74100H0(listM93494n);
                    if (notificationCardModel == null || (id4 = notificationCardModel.getId()) == null) {
                        id4 = "";
                    }
                    C26866a.b bVarM80206h = c26866a.m80206h(id4, listM93494n);
                    if (bVarM80206h != null) {
                        C30518a.this.homeNotificationsCenterAnalyticsHelper.m80212q(bVarM80206h.getAppNotificationType(), bVarM80206h.getCardTitle(), bVarM80206h.getTotalCards(), bVarM80206h.getVariant(), str, bVarM80206h.getTemplateName());
                    }
                }
                return new AbstractC29379b.c(new HomeNotificationsCenterResponse(c25271y, 0), listM93494n, kVar.getPlayShimmer() || zM93506z, false, zM93506z ? EnumC36205i.SCALE_OUT : EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT, setM93499s, str, 8, null);
            }
            if (abstractC30521d instanceof AbstractC30521d.l) {
                AbstractC30521d.l lVar = (AbstractC30521d.l) abstractC30521d;
                String userCategory2 = lVar.getUserCategory();
                if (userCategory2 == null) {
                    userCategory2 = C30518a.this.m93498r(abstractC29379b);
                }
                Set setM93499s2 = C30518a.this.m93499s(abstractC29379b);
                C30518a c30518a2 = C30518a.this;
                return new AbstractC29379b.d(new HomeNotificationsCenterResponse(c25271y, 0), C30518a.this.m93494n(c30518a2.m93496p(c30518a2.m93497q(lVar.getCacheResponse().getNotificationCards())), setM93499s2), setM93499s2, userCategory2);
            }
            if (abstractC30521d instanceof AbstractC30521d.e) {
                return AbstractC29379b.b.f119177a;
            }
            if (abstractC30521d instanceof AbstractC30521d.c) {
                String userCategory3 = ((AbstractC30521d.c) abstractC30521d).getUserCategory();
                if (userCategory3 == null) {
                    userCategory3 = C30518a.this.m93498r(abstractC29379b);
                }
                C30518a.this.homeNotificationsCenterAnalyticsHelper.m80208j(userCategory3);
                return new AbstractC29379b.a("placeholder message");
            }
            if (abstractC30521d instanceof AbstractC30521d.i) {
                if (abstractC29379b instanceof AbstractC29379b.c) {
                    AbstractC30521d.i iVar = (AbstractC30521d.i) abstractC30521d;
                    return C30518a.this.m93503w(iVar.getId(), (AbstractC29379b.c) abstractC29379b, iVar.getDismissAction());
                }
                if (abstractC29379b instanceof AbstractC29379b.d) {
                    AbstractC30521d.i iVar2 = (AbstractC30521d.i) abstractC30521d;
                    return C30518a.this.m93504x(iVar2.getId(), (AbstractC29379b.d) abstractC29379b, iVar2.getDismissAction());
                }
            } else if (AbstractC22676k.m65745e(abstractC30521d, AbstractC30521d.j.f125511a)) {
                if (abstractC29379b instanceof AbstractC29379b.c) {
                    return AbstractC29379b.c.m89549b((AbstractC29379b.c) abstractC29379b, null, null, false, false, null, null, null, 123, null);
                }
            } else if (abstractC30521d instanceof AbstractC30521d.a) {
                if (abstractC29379b instanceof AbstractC29379b.c) {
                    return AbstractC29379b.c.m89549b((AbstractC29379b.c) abstractC29379b, null, null, false, false, ((AbstractC30521d.a) abstractC30521d).getNotificationCardDismissAnimation(), null, null, 111, null);
                }
            } else {
                if (abstractC30521d instanceof AbstractC30521d.b) {
                    AbstractC30521d.b bVar = (AbstractC30521d.b) abstractC30521d;
                    C30518a.this.homeNotificationsCenterAnalyticsHelper.m80204f(bVar.getAppNotificationType(), bVar.getCardTitle(), bVar.getTotalCards(), C30518a.this.m93498r(abstractC29379b));
                    return abstractC29379b;
                }
                if (!(abstractC30521d instanceof AbstractC30521d.f)) {
                    if (abstractC30521d instanceof AbstractC30521d.d) {
                        HomeNotificationsCenterResponse homeNotificationsCenterResponse = new HomeNotificationsCenterResponse(c25271y, 0);
                        String userCategory4 = ((AbstractC30521d.d) abstractC30521d).getUserCategory();
                        if (userCategory4 == null) {
                            userCategory4 = C30518a.this.m93498r(abstractC29379b);
                        }
                        return new AbstractC29379b.c(homeNotificationsCenterResponse, null, false, false, null, null, userCategory4, 62, null);
                    }
                    if (!(abstractC30521d instanceof AbstractC30521d.g)) {
                        if (!(abstractC30521d instanceof AbstractC30521d.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC30521d.h hVar = (AbstractC30521d.h) abstractC30521d;
                        C30518a.this.m93501u(hVar.getCardVariant(), hVar.getLabel(), hVar.getTotalCards(), hVar.getNotificationType(), C30518a.this.m93498r(abstractC29379b), hVar.getTemplateName());
                        return abstractC29379b;
                    }
                    if (abstractC29379b instanceof AbstractC29379b.c) {
                        AbstractC29379b.c cVar = (AbstractC29379b.c) abstractC29379b;
                        C30518a.this.m93500t(((AbstractC30521d.g) abstractC30521d).getId(), cVar.m89551c(), cVar.getUserCategory());
                    }
                }
            }
            return abstractC29379b;
        }
    }

    /* JADX INFO: renamed from: qn1.a$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f125375w;

        /* JADX INFO: renamed from: qn1.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f125376w;

            /* JADX INFO: renamed from: qn1.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsCenterDomainCombiner$interactionInteractorStream$$inlined$filterNot$1$2", m100430f = "HomeNotificationsCenterDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42229a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f125378F;

                /* JADX INFO: renamed from: G */
                Object f125379G;

                /* JADX INFO: renamed from: H */
                int f125380H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f125381w;

                /* JADX INFO: renamed from: x */
                int f125382x;

                /* JADX INFO: renamed from: y */
                Object f125383y;

                /* JADX INFO: renamed from: z */
                Object f125384z;

                public C42229a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f125381w = obj;
                    this.f125382x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f125376w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42229a c42229a;
                if (interfaceC30057d instanceof C42229a) {
                    c42229a = (C42229a) interfaceC30057d;
                    int i13 = c42229a.f125382x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42229a.f125382x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42229a = new C42229a(interfaceC30057d);
                    }
                } else {
                    c42229a = new C42229a(interfaceC30057d);
                }
                Object obj2 = c42229a.f125381w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42229a.f125382x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f125376w;
                    if (!(((AbstractC29378a) obj) instanceof AbstractC29378a.c)) {
                        c42229a.f125383y = null;
                        c42229a.f125384z = null;
                        c42229a.f125378F = null;
                        c42229a.f125379G = null;
                        c42229a.f125380H = 0;
                        c42229a.f125382x = 1;
                        if (interfaceC13062m.emit(obj, c42229a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC13058l interfaceC13058l) {
            this.f125375w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f125375w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C30518a(C30519b fetchInteractor, C30520c interactionInteractor, C26866a homeNotificationsCenterAnalyticsHelper, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(fetchInteractor, "fetchInteractor");
        AbstractC22676k.m65750j(interactionInteractor, "interactionInteractor");
        AbstractC22676k.m65750j(homeNotificationsCenterAnalyticsHelper, "homeNotificationsCenterAnalyticsHelper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.fetchInteractor = fetchInteractor;
        this.interactionInteractor = interactionInteractor;
        this.homeNotificationsCenterAnalyticsHelper = homeNotificationsCenterAnalyticsHelper;
        this.featureFlagChecker = featureFlagChecker;
        this.initial = AbstractC29379b.b.f119177a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final List<NotificationCardModel> m93494n(List<? extends NotificationCardModel> list, Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!set.contains(((NotificationCardModel) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m93495o(InterfaceC13058l upstream) {
        return AbstractC27845h.m83945a(new b(upstream), this.fetchInteractor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final List<NotificationCardModel> m93496p(List<? extends NotificationCardModel> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String androidFeatureFlagName = ((NotificationCardModel) obj).getAndroidFeatureFlagName();
            if (androidFeatureFlagName != null ? this.featureFlagChecker.isFeatureEnabled(androidFeatureFlagName) : true) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final List<NotificationCardModel> m93497q(List<? extends DesignSystemModel> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof NotificationCardModel) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            NotificationCardModel notificationCardModel = (NotificationCardModel) obj2;
            if ((notificationCardModel instanceof TextOnlyCardModel) || (notificationCardModel instanceof TextWithIllustrationCardModel) || (notificationCardModel instanceof TextAndImageCardModel) || (notificationCardModel instanceof TextWithDesignItemCardModel)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final String m93498r(AbstractC29379b abstractC29379b) {
        if (abstractC29379b instanceof AbstractC29379b.c) {
            return ((AbstractC29379b.c) abstractC29379b).getUserCategory();
        }
        if (abstractC29379b instanceof AbstractC29379b.d) {
            return ((AbstractC29379b.d) abstractC29379b).getUserCategory();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final Set<String> m93499s(AbstractC29379b abstractC29379b) {
        if (abstractC29379b instanceof AbstractC29379b.c) {
            return ((AbstractC29379b.c) abstractC29379b).m89552d();
        }
        return abstractC29379b instanceof AbstractC29379b.d ? ((AbstractC29379b.d) abstractC29379b).m89560d() : C25235a0.f99113w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m93500t(String id4, List<? extends NotificationCardModel> notificationCards, String userCategory) {
        C26866a.b bVarM80206h = this.homeNotificationsCenterAnalyticsHelper.m80206h(id4, notificationCards);
        if (bVarM80206h == null) {
            return;
        }
        this.homeNotificationsCenterAnalyticsHelper.m80201b(bVarM80206h.getAppNotificationType(), bVarM80206h.getCardTitle(), bVarM80206h.getTotalCards(), userCategory, bVarM80206h.getTemplateName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m93501u(Integer cardVariant, String label, int totalCards, String notificationType, String userCategory, String templateName) {
        this.homeNotificationsCenterAnalyticsHelper.m80203d(cardVariant, label, totalCards, notificationType, userCategory, templateName);
    }

    /* JADX INFO: renamed from: v */
    private final void m93502v(String id4, List<? extends NotificationCardModel> notificationCards, EnumC36197a dismissAction, String userCategory) {
        C26866a.b bVarM80206h = this.homeNotificationsCenterAnalyticsHelper.m80206h(id4, notificationCards);
        if (bVarM80206h == null) {
            return;
        }
        int i13 = a.f125360a[dismissAction.ordinal()];
        if (i13 == 1) {
            this.homeNotificationsCenterAnalyticsHelper.m80211o(bVarM80206h.getAppNotificationType(), bVarM80206h.getCardTitle(), bVarM80206h.getTotalCards(), userCategory, bVarM80206h.getTemplateName());
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.homeNotificationsCenterAnalyticsHelper.m80202c(bVarM80206h.getAppNotificationType(), bVarM80206h.getCardTitle(), bVarM80206h.getTotalCards(), userCategory, bVarM80206h.getTemplateName());
        }
        if (notificationCards.size() == 1) {
            this.homeNotificationsCenterAnalyticsHelper.m80200a(userCategory);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final AbstractC29379b m93503w(String id4, AbstractC29379b.c currentState, EnumC36197a dismissAction) {
        m93502v(id4, currentState.m89551c(), dismissAction, currentState.getUserCategory());
        if (((NotificationCardModel) AbstractC25265s.m74100H0(currentState.m89551c())) == null) {
            return currentState;
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(currentState.m89551c());
        arrayListM74097F1.remove(0);
        AbstractC29379b.c cVarM89549b = AbstractC29379b.c.m89549b(currentState, null, arrayListM74097F1, false, true, null, AbstractC12350b.m34555D(id4, currentState.m89552d()), null, 85, null);
        return cVarM89549b != null ? cVarM89549b : currentState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final AbstractC29379b m93504x(String id4, AbstractC29379b.d currentState, EnumC36197a dismissAction) {
        m93502v(id4, currentState.m89559c(), dismissAction, currentState.getUserCategory());
        if (((NotificationCardModel) AbstractC25265s.m74100H0(currentState.m89559c())) == null) {
            return currentState;
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(currentState.m89559c());
        arrayListM74097F1.remove(0);
        AbstractC29379b.d dVarM89557b = AbstractC29379b.d.m89557b(currentState, null, arrayListM74097F1, AbstractC12350b.m34555D(id4, currentState.m89560d()), null, 9, null);
        return dVarM89557b != null ? dVarM89557b : currentState;
    }

    /* JADX INFO: renamed from: y */
    private final InterfaceC13058l m93505y(InterfaceC13058l upstream) {
        return AbstractC27845h.m83945a(new d(upstream), this.interactionInteractor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final boolean m93506z(List<? extends NotificationCardModel> currentCards, List<? extends NotificationCardModel> newCards) {
        NotificationCardModel notificationCardModel = (NotificationCardModel) AbstractC25265s.m74100H0(currentCards);
        String id4 = notificationCardModel != null ? notificationCardModel.getId() : null;
        NotificationCardModel notificationCardModel2 = (NotificationCardModel) AbstractC25265s.m74100H0(newCards);
        String id5 = notificationCardModel2 != null ? notificationCardModel2.getId() : null;
        return (id4 == null || id5 == null || id4.equals(id5)) ? false : true;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(this.initial, AbstractC13091v.m36584J(m93495o(upstream), m93505y(upstream)), new c(null));
    }
}
