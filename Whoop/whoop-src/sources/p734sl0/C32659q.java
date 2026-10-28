package p734sl0;

import androidx.core.app.NotificationCompat;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.User;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kh2.AbstractC22486a;
import l83.C23454a0;
import ld1.AbstractC23864c;
import m32.InterfaceC25005a;
import ml0.AbstractC25669a;
import ml0.C25671c;
import nl0.AbstractC26802d;
import nl0.C26804f;
import p007a6.InterfaceC0422g;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import xk0.C38423a;
import xk0.C38424b;
import z92.InterfaceC40205a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: sl0.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B[\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ6\u0010#\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u001e2\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b#\u0010$J)\u0010%\u001a\u00020\u001a2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u001e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b%\u0010&J,\u0010'\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u001eH\u0086@¢\u0006\u0004\b'\u0010(J,\u0010)\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u001eH\u0086@¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\u001a2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u001a¢\u0006\u0004\b4\u0010\u001cJ%\u00109\u001a\u00020\u001a2\u0006\u00106\u001a\u0002052\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u000107¢\u0006\u0004\b9\u0010:R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010DR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010ER\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010FR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010GR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010HR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010J¨\u0006L"}, m65681d2 = {"Lsl0/q;", "", "Lld1/c;", "Lnl0/f;", "Lnl0/d;", "viewModel", "Lml0/c;", "navigationRouter", "Lxk0/a;", "analyticsHelper", "Lz92/a;", "userInfoAccessor", "La6/g;", "Lf6/f;", "dataStore", "Lm32/a;", "permissionChecker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lld1/c;Lml0/c;Lxk0/a;Lz92/a;La6/g;Lm32/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lzr2/a;)V", "", "i", "(Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "m", "()V", "shouldRequestPermissions", "Lkotlin/Function1;", "Lnl0/d$h;", "onLoadSuggestion", "Lsl0/n0;", "screenArgs", "a", "(ZLkotlin/jvm/functions/Function1;Lsl0/n0;Lq83/d;)Ljava/lang/Object;", "g", "(Lkotlin/jvm/functions/Function1;Lsl0/n0;)V", "e", "(Lsl0/n0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "f", "j", "()Z", "", "conversationId", "l", "(Ljava/lang/String;)V", "Lbc3/c0;", "scope", "k", "(Lbc3/c0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lml0/a;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/Function0;", "onNavigationEvent", "d", "(Lml0/a;Lc93/a;)V", "Lld1/c;", "c", "()Lld1/c;", "b", "Lml0/c;", "()Lml0/c;", "Lxk0/a;", "getAnalyticsHelper$bot_release", "()Lxk0/a;", "Lz92/a;", "La6/g;", "Lm32/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lzr2/a;", "Lxk0/b;", "Lxk0/b;", "analyticsTracker", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32659q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC23864c<C26804f, AbstractC26802d> viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25671c navigationRouter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C38423a analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC25005a permissionChecker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C38424b analyticsTracker;

    /* JADX INFO: renamed from: sl0.q$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiCoachWrapperScreenCoordinator", m100430f = "AiCoachWrapperScreenCoordinator.kt", m100431l = {74}, m100432m = "checkPermissionsAndStartConversation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f135475F;

        /* JADX INFO: renamed from: w */
        boolean f135476w;

        /* JADX INFO: renamed from: x */
        Object f135477x;

        /* JADX INFO: renamed from: y */
        Object f135478y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f135479z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f135479z = obj;
            this.f135475F |= Integer.MIN_VALUE;
            return C32659q.this.m102227a(false, null, null, this);
        }
    }

    /* JADX INFO: renamed from: sl0.q$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiCoachWrapperScreenCoordinator", m100430f = "AiCoachWrapperScreenCoordinator.kt", m100431l = {115, 116}, m100432m = "handlePermissionApproved", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f135480E;

        /* JADX INFO: renamed from: w */
        Object f135481w;

        /* JADX INFO: renamed from: x */
        Object f135482x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f135483y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f135483y = obj;
            this.f135480E |= Integer.MIN_VALUE;
            return C32659q.this.m102231e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: sl0.q$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiCoachWrapperScreenCoordinator", m100430f = "AiCoachWrapperScreenCoordinator.kt", m100431l = {127, 128}, m100432m = "handlePermissionDismissed", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f135485E;

        /* JADX INFO: renamed from: w */
        Object f135486w;

        /* JADX INFO: renamed from: x */
        Object f135487x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f135488y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f135488y = obj;
            this.f135485E |= Integer.MIN_VALUE;
            return C32659q.this.m102232f(null, null, this);
        }
    }

    /* JADX INFO: renamed from: sl0.q$d */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiCoachWrapperScreenCoordinator", m100430f = "AiCoachWrapperScreenCoordinator.kt", m100431l = {58}, m100432m = "shouldShowPermissionDisclaimerModal", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f135490w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f135491x;

        /* JADX INFO: renamed from: z */
        int f135493z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f135491x = obj;
            this.f135493z |= Integer.MIN_VALUE;
            return C32659q.this.m102235i(this);
        }
    }

    public C32659q(AbstractC23864c<C26804f, AbstractC26802d> viewModel, C25671c navigationRouter, C38423a analyticsHelper, InterfaceC40205a userInfoAccessor, InterfaceC0422g dataStore, InterfaceC25005a permissionChecker, FeatureFlagChecker featureFlagChecker, InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(navigationRouter, "navigationRouter");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(permissionChecker, "permissionChecker");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.viewModel = viewModel;
        this.navigationRouter = navigationRouter;
        this.analyticsHelper = analyticsHelper;
        this.userInfoAccessor = userInfoAccessor;
        this.dataStore = dataStore;
        this.permissionChecker = permissionChecker;
        this.featureFlagChecker = featureFlagChecker;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.analyticsTracker = new C38424b(viewModel.getViewState(), analyticsHelper, dateAndTimeProvider, null, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m102227a(boolean z4, Function1 function1, C32645n0 c32645n0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        String country;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f135475F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f135475F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo129089c = aVar.f135479z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f135475F;
        boolean zMo73346a = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            if (z4) {
                InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
                aVar.f135477x = function1;
                aVar.f135478y = c32645n0;
                aVar.f135476w = z4;
                aVar.f135475F = 1;
                objMo129089c = interfaceC40205a.mo129089c(aVar);
                if (objMo129089c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                zMo73346a = this.permissionChecker.mo73346a("android.permission.ACCESS_COARSE_LOCATION");
            }
            function1.invoke(new AbstractC26802d.h(c32645n0.m102019d(), c32645n0.getConversationIdSeed(), c32645n0.getSourceType(), c32645n0.getPresetQuestion(), c32645n0.getIncludeInitialMessage(), z, c32645n0.getSourceId(), c32645n0.m102016a()));
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c32645n0 = (C32645n0) aVar.f135478y;
        function1 = (Function1) aVar.f135477x;
        AbstractC34132o.m107864I(objMo129089c);
        User user = (User) objMo129089c;
        boolean z13 = ((user == null || (country = user.getCountry()) == null || !country.equalsIgnoreCase("KR")) && this.permissionChecker.mo73346a("android.permission.ACCESS_COARSE_LOCATION")) ? zMo73346a : false;
        function1.invoke(new AbstractC26802d.h(c32645n0.m102019d(), c32645n0.getConversationIdSeed(), c32645n0.getSourceType(), c32645n0.getPresetQuestion(), c32645n0.getIncludeInitialMessage(), z13, c32645n0.getSourceId(), c32645n0.m102016a()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C25671c getNavigationRouter() {
        return this.navigationRouter;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC23864c<C26804f, AbstractC26802d> m102229c() {
        return this.viewModel;
    }

    /* JADX INFO: renamed from: d */
    public final void m102230d(AbstractC25669a event, InterfaceC4339a onNavigationEvent) {
        AbstractC22676k.m65750j(event, "event");
        if (onNavigationEvent != null) {
            onNavigationEvent.invoke();
        }
        this.navigationRouter.m75588c(event);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (m102227a(true, r8, r7, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m102231e(p734sl0.C32645n0 r7, p715kotlin.jvm.functions.Function1 r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p734sl0.C32659q.b
            if (r0 == 0) goto L13
            r0 = r9
            sl0.q$b r0 = (p734sl0.C32659q.b) r0
            int r1 = r0.f135480E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135480E = r1
            goto L18
        L13:
            sl0.q$b r0 = new sl0.q$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f135483y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f135480E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f135482x
            kotlin.jvm.functions.Function1 r7 = (p715kotlin.jvm.functions.Function1) r7
            java.lang.Object r7 = r0.f135481w
            sl0.n0 r7 = (p734sl0.C32645n0) r7
            p505ts.AbstractC34132o.m107864I(r9)
            goto L6d
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r7 = r0.f135482x
            r8 = r7
            kotlin.jvm.functions.Function1 r8 = (p715kotlin.jvm.functions.Function1) r8
            java.lang.Object r7 = r0.f135481w
            sl0.n0 r7 = (p734sl0.C32645n0) r7
            p505ts.AbstractC34132o.m107864I(r9)
            goto L5f
        L47:
            p505ts.AbstractC34132o.m107864I(r9)
            a6.g r9 = r6.dataStore
            f6.d r2 = p734sl0.AbstractC32669s.m102283d()
            r0.f135481w = r7
            r0.f135482x = r8
            r0.f135480E = r4
            java.lang.String r5 = "true"
            java.lang.Object r9 = kh2.AbstractC22486a.m64987c(r9, r2, r5, r0)
            if (r9 != r1) goto L5f
            goto L6c
        L5f:
            r9 = 0
            r0.f135481w = r9
            r0.f135482x = r9
            r0.f135480E = r3
            java.lang.Object r7 = r6.m102227a(r4, r8, r7, r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p734sl0.C32659q.m102231e(sl0.n0, kotlin.jvm.functions.Function1, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (m102227a(false, r7, r6, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m102232f(p734sl0.C32645n0 r6, p715kotlin.jvm.functions.Function1 r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p734sl0.C32659q.c
            if (r0 == 0) goto L13
            r0 = r8
            sl0.q$c r0 = (p734sl0.C32659q.c) r0
            int r1 = r0.f135485E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135485E = r1
            goto L18
        L13:
            sl0.q$c r0 = new sl0.q$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f135488y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f135485E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f135487x
            kotlin.jvm.functions.Function1 r6 = (p715kotlin.jvm.functions.Function1) r6
            java.lang.Object r6 = r0.f135486w
            sl0.n0 r6 = (p734sl0.C32645n0) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto L6e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f135487x
            r7 = r6
            kotlin.jvm.functions.Function1 r7 = (p715kotlin.jvm.functions.Function1) r7
            java.lang.Object r6 = r0.f135486w
            sl0.n0 r6 = (p734sl0.C32645n0) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto L5f
        L47:
            p505ts.AbstractC34132o.m107864I(r8)
            a6.g r8 = r5.dataStore
            f6.d r2 = p734sl0.AbstractC32669s.m102283d()
            r0.f135486w = r6
            r0.f135487x = r7
            r0.f135485E = r4
            java.lang.String r4 = "true"
            java.lang.Object r8 = kh2.AbstractC22486a.m64987c(r8, r2, r4, r0)
            if (r8 != r1) goto L5f
            goto L6d
        L5f:
            r8 = 0
            r0.f135486w = r8
            r0.f135487x = r8
            r0.f135485E = r3
            r8 = 0
            java.lang.Object r6 = r5.m102227a(r8, r7, r6, r0)
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p734sl0.C32659q.m102232f(sl0.n0, kotlin.jvm.functions.Function1, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public final void m102233g(Function1 onLoadSuggestion, C32645n0 screenArgs) {
        AbstractC22676k.m65750j(onLoadSuggestion, "onLoadSuggestion");
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        onLoadSuggestion.invoke(new AbstractC26802d.h(screenArgs.getContextualMessage(), screenArgs.getConversationIdSeed(), screenArgs.getSourceType(), screenArgs.getPresetQuestion(), screenArgs.getIncludeInitialMessage(), false, screenArgs.getSourceId(), screenArgs.m102016a(), 32, null));
    }

    /* JADX INFO: renamed from: h */
    public final void m102234h() {
        this.analyticsTracker.m123095h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m102235i(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f135493z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f135493z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM64985a = dVar.f135491x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f135493z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM64985a);
            boolean zMo73346a = this.permissionChecker.mo73346a("android.permission.ACCESS_COARSE_LOCATION");
            if (zMo73346a) {
                return Boolean.FALSE;
            }
            InterfaceC0422g interfaceC0422g = this.dataStore;
            C14132d c14132d = AbstractC32669s.f135536a;
            dVar.f135490w = zMo73346a;
            dVar.f135493z = 1;
            objM64985a = AbstractC22486a.m64985a(interfaceC0422g, c14132d, dVar);
            if (objM64985a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM64985a);
        }
        return Boolean.valueOf(!((Boolean) objM64985a).booleanValue() && this.featureFlagChecker.isFeatureEnabled("whoop-coach-weather-gps-android"));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m102236j() {
        return this.featureFlagChecker.isFeatureEnabled("whoop-coach-weather-gps-android");
    }

    /* JADX INFO: renamed from: k */
    public final void m102237k(InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        this.analyticsTracker.m123096i(scope);
    }

    /* JADX INFO: renamed from: l */
    public final void m102238l(String conversationId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        this.analyticsHelper.m123068f(conversationId);
    }

    /* JADX INFO: renamed from: m */
    public final void m102239m() {
        this.analyticsHelper.m123078p();
        this.analyticsHelper.m123073k();
    }
}
