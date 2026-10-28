package vm2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.navigation.AppScreen;
import f70.AbstractC14206t;
import f70.C14208u;
import f70.EnumC14204s;
import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import o02.InterfaceC27353d;
import or2.AbstractC28152c1;
import p114eb.C12995w0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: vm2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lvm2/b;", "", "Lf70/u;", "appDestinationRouter", "Lo02/d;", "navigationReducer", "", "homeFragmentDestinationId", "homeGraphDestinationId", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lf70/u;Lo02/d;IILcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Lvm2/g;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lf70/u;", "b", "Lo02/d;", "c", "I", "d", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "f", "Ltr2/n;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36157b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14208u appDestinationRouter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int homeFragmentDestinationId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int homeGraphDestinationId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vm2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.presentation.AppDestinationHelper", m100430f = "AppDestinationHelper.kt", m100431l = {31}, m100432m = "resolveDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f154696E;

        /* JADX INFO: renamed from: w */
        boolean f154697w;

        /* JADX INFO: renamed from: x */
        int f154698x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f154699y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154699y = obj;
            this.f154696E |= Integer.MIN_VALUE;
            return C36157b.this.m115013a(this);
        }
    }

    public C36157b(C14208u appDestinationRouter, InterfaceC27353d navigationReducer, int i13, int i14, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(appDestinationRouter, "appDestinationRouter");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.appDestinationRouter = appDestinationRouter;
        this.navigationReducer = navigationReducer;
        this.homeFragmentDestinationId = i13;
        this.homeGraphDestinationId = i14;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: a */
    public final Object m115013a(InterfaceC30057d<? super C36162g> interfaceC30057d) {
        a aVar;
        int i13;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f154696E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f154696E = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM40606e = aVar2.f154699y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar2.f154696E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM40606e);
            boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("pop-to-home-graph");
            int i16 = zIsFeatureEnabled ? this.homeGraphDestinationId : this.homeFragmentDestinationId;
            this.logger.mo85228t("POP_TO_HOME_GRAPH enabled=" + zIsFeatureEnabled + ", popUpToId=" + i16, new AbstractC30556a.a[0]);
            C14208u c14208u = this.appDestinationRouter;
            EnumC14204s enumC14204s = EnumC14204s.APP_LAUNCH;
            aVar2.f154697w = zIsFeatureEnabled;
            aVar2.f154698x = i16;
            aVar2.f154696E = 1;
            objM40606e = C14208u.m40606e(c14208u, enumC14204s, null, aVar2, 2, null);
            if (objM40606e == enumC31071a) {
                return enumC31071a;
            }
            i13 = i16;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = aVar2.f154698x;
            AbstractC34132o.m107864I(objM40606e);
        }
        AbstractC14206t abstractC14206t = (AbstractC14206t) objM40606e;
        if (abstractC14206t instanceof AbstractC14206t.b) {
            AbstractC14206t.b bVar = (AbstractC14206t.b) abstractC14206t;
            if (!AbstractC22676k.m65745e(bVar.getAction().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9426u2.f27963w)) {
                InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(bVar.getAction().getParameters());
                if (interfaceC21134cMo67681a instanceof AbstractC21155m0.m1) {
                    boolean zIsFeatureEnabled2 = this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.FIX_HOME_FLASH_ON_REENTRY);
                    C12995w0 c12995w0 = new C12995w0();
                    C12995w0.m36507b(c12995w0, i13, true);
                    if (!zIsFeatureEnabled2) {
                        AbstractC28152c1.m85188f(c12995w0);
                    }
                    return new C36162g(AbstractC21155m0.m1.m59196c((AbstractC21155m0.m1) interfaceC21134cMo67681a, null, null, null, null, null, null, null, c12995w0.m36508a(), null, null, 895, null), false);
                }
                if (interfaceC21134cMo67681a instanceof AbstractC21155m0) {
                    return new C36162g((AbstractC21155m0) interfaceC21134cMo67681a, false);
                }
                this.logger.mo85226q("app/destination returned screen '" + bVar.getAction().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() + "' but NavigationReducer could not map it", new AbstractC30556a.a[0]);
                return null;
            }
        } else {
            if (abstractC14206t instanceof AbstractC14206t.a) {
                AbstractC14206t.a aVar3 = (AbstractC14206t.a) abstractC14206t;
                return new C36162g(new AbstractC21155m0.d(new Integer(i13), aVar3.getDestination().name(), aVar3.getSource()), false);
            }
            if (!(abstractC14206t instanceof AbstractC14206t.c)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public /* synthetic */ C36157b(C14208u c14208u, InterfaceC27353d interfaceC27353d, int i13, int i14, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(c14208u, interfaceC27353d, i13, i14, featureFlagChecker, (i15 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AppDestinationHelper") : interfaceC34116n);
    }
}
