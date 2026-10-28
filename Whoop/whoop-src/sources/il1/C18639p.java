package il1;

import am1.C1005b;
import androidx.profileinstaller.ProfileVerifier;
import bm1.InterfaceC3420c;
import c93.InterfaceC4339a;
import cm1.C4810a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.home.domain.models.HomeBffFeedResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import em1.EnumC13344r;
import fc3.AbstractC14371b;
import java.time.LocalDate;
import jl1.C21770a;
import kl1.C22565e;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import ol1.AbstractC28015a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sl1.AbstractC32703b;
import sl1.C32702a;
import tl1.C33917a;
import ul1.AbstractC35065b;
import vl1.C36103a;
import wl1.AbstractC37356b;
import xl1.C38453c;

/* JADX INFO: renamed from: il1.p */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJÓ\u0001\u00104\u001a\u0002032\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J¡\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020F062\f\u00108\u001a\b\u0012\u0004\u0012\u000207062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u0011062\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0013062\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0015062\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0019062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b062\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001f062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020!062\f\u0010@\u001a\b\u0012\u0004\u0012\u00020#062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%062\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)062\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\b062\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\b062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u0006062\f\u00100\u001a\b\u0012\u0004\u0012\u00020/062\u001e\u0010E\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002010D\u0012\u0004\u0012\u0002010C06¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010I¨\u0006J"}, m65681d2 = {"Lil1/p;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Ljl1/a;", "autoPopDomainState", "", "d", "(Ljl1/a;)Z", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "bffFeed", "Ljava/time/LocalDate;", "currentDateTime", "", "currentPillarIndex", "Lkl1/e;", "calendar", "Lsl1/a;", "indicator", "Lsl1/b;", "tile", "Lxl1/c;", "journal", "Lul1/b;", "dialog", "Lol1/a;", "processNow", "Lem1/r;", "refreshType", "Lam1/b;", "onboarding", "Lil1/h;", "dismissConfigCtaState", "Lil1/f;", "dismissAlertTileState", "Lvl1/a;", "hideRecoveryDomainState", "Ltl1/a;", "dayOneTransitionDomainState", "Lcm1/a;", "weeklyPlanHomeTileDomainState", "shouldShowGiftIconNewIndicator", "shouldRequestPermissions", "Lbm1/c;", "streaksDomainState", "Lwl1/b;", "inAppReviewDomainState", "", "currentUserId", "Lil1/n;", "b", "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILkl1/e;Lsl1/a;Lsl1/b;Lxl1/c;Lul1/b;Lol1/a;Lem1/r;Lam1/b;Lil1/h;Lil1/f;Lvl1/a;Ltl1/a;Lcm1/a;ZZLbm1/c;Ljl1/a;Lwl1/b;Ljava/lang/String;)Lil1/n;", "Lec3/l;", "Lil1/v;", "feedResult", "calendarResult", "strapStatusIndicatorResult", "alertTileResult", "dialogDomainResult", "processNowDomainResult", "homeOnboardingDomainResult", "dismissConfigResult", "dismissAlertResult", "homeToolbarGiftIconNewIndicatorDomainResult", "requiredPermissionsCheckResult", "Ll83/k;", "", "ltoDismissedOfferIdsAndUserId", "Lil1/q;", "a", "(Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;)Lec3/l;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18639p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: il1.p$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l[] f72961w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18639p f72962x;

        /* JADX INFO: renamed from: il1.p$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41752a implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l[] f72963w;

            public C41752a(InterfaceC13058l[] interfaceC13058lArr) {
                this.f72963w = interfaceC13058lArr;
            }

            @Override // c93.InterfaceC4339a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f72963w.length];
            }
        }

        /* JADX INFO: renamed from: il1.p$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeDomainCombiner$combine$$inlined$combine$2$3", m100430f = "HomeDomainCombiner.kt", m100431l = {234}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"R", "T", "Lec3/m;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lkotlin/Array;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f72964w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f72965x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f72966y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C18639p f72967z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC30057d interfaceC30057d, C18639p c18639p) {
                super(3, interfaceC30057d);
                this.f72967z = c18639p;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC13062m interfaceC13062m, Object[] objArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                b bVar = new b(interfaceC30057d, this.f72967z);
                bVar.f72965x = interfaceC13062m;
                bVar.f72966y = objArr;
                return bVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                Object cVar;
                Object obj2;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f72964w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f72965x;
                    Object[] objArr = (Object[]) this.f72966y;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    Object obj6 = objArr[3];
                    Object obj7 = objArr[4];
                    Object obj8 = objArr[5];
                    Object obj9 = objArr[6];
                    Object obj10 = objArr[7];
                    Object obj11 = objArr[8];
                    Object obj12 = objArr[9];
                    Object obj13 = objArr[10];
                    Object obj14 = objArr[11];
                    Object obj15 = objArr[12];
                    Object obj16 = objArr[13];
                    Object obj17 = objArr[14];
                    Object obj18 = objArr[15];
                    Object obj19 = objArr[16];
                    C23465k c23465k = (C23465k) objArr[17];
                    AbstractC37356b abstractC37356b = (AbstractC37356b) obj19;
                    C21770a c21770a = (C21770a) obj18;
                    InterfaceC3420c interfaceC3420c = (InterfaceC3420c) obj17;
                    boolean zBooleanValue = ((Boolean) obj16).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) obj15).booleanValue();
                    C4810a c4810a = (C4810a) obj14;
                    C33917a c33917a = (C33917a) obj13;
                    C36103a c36103a = (C36103a) obj12;
                    C18629f c18629f = (C18629f) obj11;
                    InterfaceC18631h interfaceC18631h = (InterfaceC18631h) obj10;
                    C1005b c1005b = (C1005b) obj9;
                    AbstractC28015a abstractC28015a = (AbstractC28015a) obj8;
                    AbstractC35065b abstractC35065b = (AbstractC35065b) obj7;
                    AbstractC32703b abstractC32703b = (AbstractC32703b) obj6;
                    C32702a c32702a = (C32702a) obj5;
                    C22565e c22565e = (C22565e) obj4;
                    AbstractC18645v abstractC18645v = (AbstractC18645v) obj3;
                    if (abstractC18645v instanceof AbstractC18645v.b) {
                        obj2 = InterfaceC18640q.b.f72970a;
                    } else {
                        if (abstractC18645v instanceof AbstractC18645v.a) {
                            AbstractC18645v.a aVar = (AbstractC18645v.a) abstractC18645v;
                            cVar = new InterfaceC18640q.a(C18639p.m53964c(this.f72967z, aVar.getBffFeed(), aVar.getCurrentDateTime(), aVar.getCurrentPillarIndex(), c22565e, c32702a, abstractC32703b, aVar.getJournalDomainResult(), abstractC35065b, abstractC28015a, null, null, null, null, c36103a, c33917a, c4810a, zBooleanValue2, false, null, c21770a, abstractC37356b, (String) c23465k.f92938x, 400896, null), aVar.getNetworkError());
                        } else if (abstractC18645v instanceof AbstractC18645v.d) {
                            AbstractC18645v.d dVar = (AbstractC18645v.d) abstractC18645v;
                            cVar = new InterfaceC18640q.d(C18639p.m53964c(this.f72967z, dVar.getBffFeed(), dVar.getCurrentDateTime(), dVar.getCurrentPillarIndex(), c22565e, c32702a, abstractC32703b, dVar.getJournalDomainResult(), abstractC35065b, abstractC28015a, dVar.getRefreshType(), c1005b, interfaceC18631h, c18629f, c36103a, c33917a, c4810a, zBooleanValue2, false, interfaceC3420c, c21770a, abstractC37356b, (String) c23465k.f92938x, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ, null));
                        } else {
                            if (!(abstractC18645v instanceof AbstractC18645v.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AbstractC18645v.c cVar2 = (AbstractC18645v.c) abstractC18645v;
                            cVar = new InterfaceC18640q.c(C18639p.m53964c(this.f72967z, cVar2.getBffFeed(), cVar2.getCurrentDateTime(), cVar2.getCurrentPillarIndex(), c22565e, c32702a, abstractC32703b, cVar2.getJournalDomainResult(), abstractC35065b, abstractC28015a, null, c1005b, interfaceC18631h, c18629f, c36103a, c33917a, c4810a, zBooleanValue2, zBooleanValue, interfaceC3420c, c21770a, abstractC37356b, (String) c23465k.f92938x, 512, null));
                        }
                        obj2 = cVar;
                    }
                    this.f72965x = null;
                    this.f72966y = null;
                    this.f72964w = 1;
                    if (interfaceC13062m.emit(obj2, this) == enumC31071a) {
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
        }

        public a(InterfaceC13058l[] interfaceC13058lArr, C18639p c18639p) {
            this.f72961w = interfaceC13058lArr;
            this.f72962x = c18639p;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            InterfaceC13058l[] interfaceC13058lArr = this.f72961w;
            Object objM41038a = AbstractC14371b.m41038a(new C41752a(interfaceC13058lArr), interfaceC13062m, new b(null, this.f72962x), interfaceC30057d, interfaceC13058lArr);
            return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
        }
    }

    public C18639p(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: b */
    private final C18637n m53963b(HomeBffFeedResponse bffFeed, LocalDate currentDateTime, int currentPillarIndex, C22565e calendar, C32702a indicator, AbstractC32703b tile, C38453c journal, AbstractC35065b dialog, AbstractC28015a processNow, EnumC13344r refreshType, C1005b onboarding, InterfaceC18631h dismissConfigCtaState, C18629f dismissAlertTileState, C36103a hideRecoveryDomainState, C33917a dayOneTransitionDomainState, C4810a weeklyPlanHomeTileDomainState, boolean shouldShowGiftIconNewIndicator, boolean shouldRequestPermissions, InterfaceC3420c streaksDomainState, C21770a autoPopDomainState, AbstractC37356b inAppReviewDomainState, String currentUserId) {
        LocalDate localDateNow = currentDateTime == null ? LocalDate.now() : currentDateTime;
        AbstractC22676k.m65747g(localDateNow);
        return new C18637n(calendar, bffFeed, localDateNow, calendar.getCalendarAccumulatedList().getMonthOffsetIndex(), indicator, journal, tile, dialog, processNow, currentPillarIndex, refreshType, onboarding, dismissConfigCtaState, dismissAlertTileState, hideRecoveryDomainState, dayOneTransitionDomainState, shouldShowGiftIconNewIndicator, shouldRequestPermissions && !m53965d(autoPopDomainState), weeklyPlanHomeTileDomainState, streaksDomainState, autoPopDomainState, inAppReviewDomainState, currentUserId);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C18637n m53964c(C18639p c18639p, HomeBffFeedResponse homeBffFeedResponse, LocalDate localDate, int i13, C22565e c22565e, C32702a c32702a, AbstractC32703b abstractC32703b, C38453c c38453c, AbstractC35065b abstractC35065b, AbstractC28015a abstractC28015a, EnumC13344r enumC13344r, C1005b c1005b, InterfaceC18631h interfaceC18631h, C18629f c18629f, C36103a c36103a, C33917a c33917a, C4810a c4810a, boolean z4, boolean z13, InterfaceC3420c interfaceC3420c, C21770a c21770a, AbstractC37356b abstractC37356b, String str, int i14, Object obj) {
        return c18639p.m53963b(homeBffFeedResponse, localDate, i13, c22565e, c32702a, abstractC32703b, c38453c, abstractC35065b, abstractC28015a, (i14 & 512) != 0 ? EnumC13344r.NONE : enumC13344r, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C1005b(false, false, 3, null) : c1005b, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? InterfaceC18631h.a.f72867a : interfaceC18631h, (i14 & 4096) != 0 ? new C18629f(null, 1, null) : c18629f, c36103a, c33917a, c4810a, z4, (131072 & i14) != 0 ? false : z13, (262144 & i14) != 0 ? InterfaceC3420c.a.f13330a : interfaceC3420c, c21770a, (1048576 & i14) != 0 ? AbstractC37356b.a.f159779a : abstractC37356b, (i14 & 2097152) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: d */
    private final boolean m53965d(C21770a autoPopDomainState) {
        return this.featureFlagChecker.isFeatureEnabled("day-zero-delay-push-prompt-droid") && C21770a.INSTANCE.m61543d(autoPopDomainState);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m53966a(InterfaceC13058l feedResult, InterfaceC13058l calendarResult, InterfaceC13058l strapStatusIndicatorResult, InterfaceC13058l alertTileResult, InterfaceC13058l dialogDomainResult, InterfaceC13058l processNowDomainResult, InterfaceC13058l homeOnboardingDomainResult, InterfaceC13058l dismissConfigResult, InterfaceC13058l dismissAlertResult, InterfaceC13058l hideRecoveryDomainState, InterfaceC13058l dayOneTransitionDomainState, InterfaceC13058l weeklyPlanHomeTileDomainState, InterfaceC13058l homeToolbarGiftIconNewIndicatorDomainResult, InterfaceC13058l requiredPermissionsCheckResult, InterfaceC13058l streaksDomainState, InterfaceC13058l autoPopDomainState, InterfaceC13058l inAppReviewDomainState, InterfaceC13058l ltoDismissedOfferIdsAndUserId) {
        AbstractC22676k.m65750j(feedResult, "feedResult");
        AbstractC22676k.m65750j(calendarResult, "calendarResult");
        AbstractC22676k.m65750j(strapStatusIndicatorResult, "strapStatusIndicatorResult");
        AbstractC22676k.m65750j(alertTileResult, "alertTileResult");
        AbstractC22676k.m65750j(dialogDomainResult, "dialogDomainResult");
        AbstractC22676k.m65750j(processNowDomainResult, "processNowDomainResult");
        AbstractC22676k.m65750j(homeOnboardingDomainResult, "homeOnboardingDomainResult");
        AbstractC22676k.m65750j(dismissConfigResult, "dismissConfigResult");
        AbstractC22676k.m65750j(dismissAlertResult, "dismissAlertResult");
        AbstractC22676k.m65750j(hideRecoveryDomainState, "hideRecoveryDomainState");
        AbstractC22676k.m65750j(dayOneTransitionDomainState, "dayOneTransitionDomainState");
        AbstractC22676k.m65750j(weeklyPlanHomeTileDomainState, "weeklyPlanHomeTileDomainState");
        AbstractC22676k.m65750j(homeToolbarGiftIconNewIndicatorDomainResult, "homeToolbarGiftIconNewIndicatorDomainResult");
        AbstractC22676k.m65750j(requiredPermissionsCheckResult, "requiredPermissionsCheckResult");
        AbstractC22676k.m65750j(streaksDomainState, "streaksDomainState");
        AbstractC22676k.m65750j(autoPopDomainState, "autoPopDomainState");
        AbstractC22676k.m65750j(inAppReviewDomainState, "inAppReviewDomainState");
        AbstractC22676k.m65750j(ltoDismissedOfferIdsAndUserId, "ltoDismissedOfferIdsAndUserId");
        return new a(new InterfaceC13058l[]{feedResult, calendarResult, strapStatusIndicatorResult, alertTileResult, dialogDomainResult, processNowDomainResult, homeOnboardingDomainResult, dismissConfigResult, dismissAlertResult, hideRecoveryDomainState, dayOneTransitionDomainState, weeklyPlanHomeTileDomainState, homeToolbarGiftIconNewIndicatorDomainResult, requiredPermissionsCheckResult, streaksDomainState, autoPopDomainState, inAppReviewDomainState, ltoDismissedOfferIdsAndUserId}, this);
    }
}
