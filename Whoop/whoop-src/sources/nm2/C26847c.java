package nm2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.featureFlags.CoreFeatureFlagsKt;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FdaFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagRepositoryImpl;
import com.whoop.data.repositories.FeatureFlagRepositoryImplKt;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13105z1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21154m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import lq0.C24656d;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import or2.C28180m;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wr2.AbstractC37575c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: nm2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0019\u0010 \u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002¢\u0006\u0004\b \u0010\u001bJ#\u0010$\u001a\u00020\u00192\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0019¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0019¢\u0006\u0004\b/\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00104R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\f058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\"098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010:R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\"0<8\u0006¢\u0006\f\n\u0004\b+\u0010=\u001a\u0004\b6\u0010>¨\u0006@"}, m65681d2 = {"Lnm2/c;", "Landroidx/lifecycle/w1;", "Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;", "featureFlagRepository", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lin2/d;", "dispatcherFactory", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;Lcom/whoop/data/local/prefs/PreferenceHelper;Lin2/d;Lbc3/c0;)V", "", "searchQuery", "", "Lnm2/e;", "C", "(Ljava/lang/String;)Ljava/util/List;", "featureFlag", "", "F", "(Ljava/lang/String;)Z", "z", "()Ljava/util/List;", "", "Ll83/a0;", "t", "(Ljava/util/List;)V", "v", "u", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "r", "q", "Lkotlin/Function1;", "Lnm2/d;", "update", "M", "(Lkotlin/jvm/functions/Function1;)V", "forceToggleFeatureFlag", "A", "(Ljava/lang/String;Z)V", "H", "(Lq83/d;)Ljava/lang/Object;", "G", "()V", "K", "(Ljava/lang/String;)V", "y", "Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;", "x", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "Lin2/d;", "Lbc3/c0;", "", "E", "Ljava/util/Set;", "featureFlagsFromRemote", "Lec3/p1;", "Lec3/p1;", "_viewState", "Lec3/t1;", "Lec3/t1;", "()Lec3/t1;", "viewState", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26847c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private Set<String> featureFlagsFromRemote;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13075p1 _viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final FeatureFlagRepositoryImpl featureFlagRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: nm2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsViewModel$refreshViewState$1", m100430f = "DebugFeatureFlagSettingsViewModel.kt", m100431l = {568}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107135w;

        /* JADX INFO: renamed from: nm2.c$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsViewModel$refreshViewState$1$overridingDefaults$1", m100430f = "DebugFeatureFlagSettingsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42070a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f107137w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26847c f107138x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42070a(C26847c c26847c, InterfaceC30057d<? super C42070a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f107138x = c26847c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42070a(this.f107138x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((C42070a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f107137w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(PreferenceHelper.getBooleanValueFromFeaturePrefs$default(this.f107138x.preferenceHelper, FeatureFlagRepositoryImplKt.OVERRIDE_FEATURE_FLAGS, false, 2, null));
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C26848d m80152h(C26847c c26847c, boolean z4, C26848d c26848d) {
            return C26848d.m80153b(c26848d, C26847c.m80127D(c26847c, null, 1, null), z4, null, 4, null);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26847c.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f107135w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30063j interfaceC30063jMo54465b = C26847c.this.dispatcherFactory.mo54465b();
                C42070a c42070a = new C42070a(C26847c.this, null);
                this.f107135w = 1;
                obj = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, c42070a, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            final C26847c c26847c = C26847c.this;
            c26847c.m80131M(new Function1() { // from class: nm2.b
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C26847c.a.m80152h(c26847c, zBooleanValue, (C26848d) obj2);
                }
            });
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nm2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsViewModel", m100430f = "DebugFeatureFlagSettingsViewModel.kt", m100431l = {552}, m100432m = "resetFeatureFlagsToNormal", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f107139w;

        /* JADX INFO: renamed from: y */
        int f107141y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f107139w = obj;
            this.f107141y |= Integer.MIN_VALUE;
            return C26847c.this.m80148H(this);
        }
    }

    /* JADX INFO: renamed from: nm2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsViewModel$resetFeatureFlagsToNormal$2$2", m100430f = "DebugFeatureFlagSettingsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107142w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26847c.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f107142w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C26847c.this.preferenceHelper.putBooleanValueIntoFeaturePrefs(FeatureFlagRepositoryImplKt.OVERRIDE_FEATURE_FLAGS, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26847c(FeatureFlagRepositoryImpl featureFlagRepository, PreferenceHelper preferenceHelper, InterfaceC18732d dispatcherFactory, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.featureFlagRepository = featureFlagRepository;
        this.preferenceHelper = preferenceHelper;
        this.dispatcherFactory = dispatcherFactory;
        this.coroutineScope = coroutineScope;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C26848d(m80144z(), false, null, 6, null));
        this._viewState = c13045h2M36593c;
        this.viewState = AbstractC13091v.m36586L(c13045h2M36593c, coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C26848d m80125B(C26847c c26847c, C26848d updateViewState) {
        AbstractC22676k.m65750j(updateViewState, "$this$updateViewState");
        return C26848d.m80153b(updateViewState, m80127D(c26847c, null, 1, null), true, null, 4, null);
    }

    /* JADX INFO: renamed from: C */
    private final List<C26849e> m80126C(String searchQuery) {
        return AbstractC39414r.m125890i0(searchQuery) ? m80144z() : AbstractC37575c.m120636o(m80144z(), searchQuery, null, 2, null);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ List m80127D(C26847c c26847c, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = ((C26848d) ((C13045h2) c26847c._viewState).getValue()).getSearchQuery();
        }
        return c26847c.m80126C(str);
    }

    /* JADX INFO: renamed from: F */
    private final boolean m80128F(String featureFlag) {
        Set<String> setFetchFeatureFlagForDebugSettings = this.featureFlagRepository.fetchFeatureFlagForDebugSettings();
        this.featureFlagsFromRemote = setFetchFeatureFlagForDebugSettings;
        if (setFetchFeatureFlagForDebugSettings != null) {
            return setFetchFeatureFlagForDebugSettings.contains(featureFlag);
        }
        AbstractC22676k.m65757q("featureFlagsFromRemote");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C26848d m80129I(C26847c c26847c, C26848d updateViewState) {
        AbstractC22676k.m65750j(updateViewState, "$this$updateViewState");
        return C26848d.m80153b(updateViewState, m80127D(c26847c, null, 1, null), false, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C26848d m80130L(C26847c c26847c, String str, C26848d updateViewState) {
        AbstractC22676k.m65750j(updateViewState, "$this$updateViewState");
        return C26848d.m80153b(updateViewState, c26847c.m80126C(str), false, str, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final void m80131M(Function1 update) {
        InterfaceC13075p1 interfaceC13075p1 = this._viewState;
        ((C13045h2) interfaceC13075p1).m36570j(update.invoke(((C13045h2) interfaceC13075p1).getValue()));
    }

    /* JADX INFO: renamed from: q */
    private final void m80138q(List<String> list) {
        list.add("aix-coach-drawer");
        list.add("wce-padding-keyboard-fix");
        list.add("wce-polling-preview-update");
        list.add("wce-dynamic-bdn-deeplink-support");
        list.add("whoop-coach-fetch-suggestions-on-load");
        list.add("backend-driven-suggested-question-visibility");
        list.add("android-coach-early-message-emit");
    }

    /* JADX INFO: renamed from: r */
    private final void m80139r(List<String> list) {
        list.add(AbstractC21154m.m59009b("home"));
        list.add(AbstractC21154m.m59009b("health_tab"));
        list.add(AbstractC21154m.m59009b("Community"));
        list.add(AbstractC21154m.m59009b("ViewSettings"));
    }

    /* JADX INFO: renamed from: t */
    private final void m80140t(List<String> list) {
        list.add("coach-everywhere-homescreen-bdn");
        list.add("device-settings-charging-education-overlay");
        list.add("dismiss-tilt-graph-when-backgrounded");
        list.add(CoreFeatureFlagsKt.TILT_LARGE_SCREEN_ORIENTATION_DECOUPLE);
        list.add(FeatureFlagRepositoryKt.HIDE_SHARE);
        list.add("share-high-res-export-android");
        list.add(FeatureFlagRepositoryKt.HOME_FUTURE_IA);
        list.add(FeatureFlagRepositoryKt.HOME_IA_CARET);
        list.add(FeatureFlagRepositoryKt.HOME_REDESIGN_REFRESH_FIX);
        list.add(FeatureFlagRepositoryKt.HOME_NAVIGATION_REDUCER);
        list.add("suppress-home-fetch-no-device-android");
        list.add("my-journal-home-tile-loading-fix");
        list.add(FeatureFlagRepositoryKt.EDUCATION_STICKY_HEADER_NAV);
    }

    /* JADX INFO: renamed from: u */
    private final void m80141u(List<String> list) {
        list.add("add_manual_measurement_health_connect");
        list.add("hours-vs-needed-percentage-trend");
        list.add(FeatureFlagRepositoryKt.START_ACTIVITY_SKIP_COUNTDOWN_TIMER_START_RECORDING);
        list.add("vo2-max-delete-states-android");
        list.add("trends-api-call-error-handling-android");
    }

    /* JADX INFO: renamed from: v */
    private final void m80142v(List<String> list) {
        list.add(FeatureFlagRepositoryKt.SKIP_TIMESTAMP_RECALCULATION);
        list.add(FeatureFlagRepositoryKt.WEIGHTLIFTING_START_STOP_SETS_VIA_STRAP);
        list.add(FeatureFlagRepositoryKt.WEIGHTLIFTING_AUTO_START_STOP_SETS);
        list.add(FeatureFlagRepositoryKt.WEIGHTLIFTING_INTERACTIVE_NOTIFICATIONS);
        list.add(FeatureFlagRepositoryKt.AUTO_RESUME_TO_STRAIN_COACH_WORKOUT);
        list.add(FeatureFlagRepositoryKt.AUTO_RESUME_TO_ST_WORKOUT);
        list.add("st-cascade-set-values");
        list.add("android-st-simpler-strength-logging-poc");
        list.add(ConnectivityFeatureFlagsKt.SC_GEN5_CONNECTIVITY_ANALYTICS);
        list.add(FeatureFlagRepositoryKt.STRENGTH_TRAINER_UNDO_SETS);
        list.add(FeatureFlagRepositoryKt.STRENGTH_TRAINER_REMEMBER_DEVICE_LOCATION);
        list.add(FeatureFlagRepositoryKt.STRENGTH_TRAINER_SELECT_EXERCISE_BOTTOM_SHEET_LOGIC);
        list.add("kt-serialization-weightlifting");
        list.add("exercise-details-image-navigation-android");
        list.add("exercise-details-v2");
        list.add("estimated-one-rep-max");
    }

    /* JADX INFO: renamed from: w */
    private final void m80143w(List<String> list) {
        list.add("dwl-landing-v2");
        list.add("dwl-android-connection-maintainer-fix");
        list.add("dwl-android-bthr-periodic-upload");
        list.add("whoop-labs-remote-study-android");
    }

    /* JADX INFO: renamed from: z */
    private final List<C26849e> m80144z() {
        ArrayList arrayList = new ArrayList();
        for (OnboardingFeatureFlag onboardingFeatureFlag : OnboardingFeatureFlag.values()) {
            arrayList.add(onboardingFeatureFlag.getFlagName());
        }
        AbstractC11266d.m30445C(arrayList, "android-activity-details-menu-popover", "activity_detection_graph_10", FeatureFlagRepositoryKt.ADD_ACTIVITY_REMEMBER_STRAP_LOCATION, FeatureFlagRepositoryKt.AI_CHAT_ENTRY_GRADIENT_BORDER);
        AbstractC11266d.m30445C(arrayList, "android-arch-v2-generic-interactor", "android-arch-v2-flow-step-reconcile", FeatureFlagRepositoryKt.ANDROID_BACKGROUND_GPS_COLLECTION, "droid-hrm-connectivity-analytics");
        AbstractC11266d.m30445C(arrayList, "android-enable-amplitude-survey-sdk", FeatureFlagRepositoryKt.ANDROID_FOREGROUND_GPS_COLLECTION, FeatureFlagRepositoryKt.ANDROID_GPS_SETTINGS_PAGE, "android-oom-observability-memory");
        AbstractC11266d.m30445C(arrayList, "advanced-labs-onboarding-exit-tab-fix", FeatureFlagRepositoryKt.ADVANCED_LABS_STANDALONE, FeatureFlagRepositoryKt.PROFILE_USERNAME_FIELD, CoreFeatureFlagsKt.ANDROID_TILT_MODE_ANGLES);
        AbstractC11266d.m30445C(arrayList, "android-more-tab-gift-icon", FeatureFlagRepositoryKt.APP_WIDGET_V2_DONT_KILL_APP, FeatureFlagRepositoryKt.ARABIC_FEEDBACK_BUTTON_ENABLED_ANDROID, FeatureFlagRepositoryKt.ARABIC_OPT_OUT_SETTINGS_BUTTON_ENABLED_ANDROID);
        AbstractC11266d.m30445C(arrayList, "autopop-retry-pending-puts-android", CoreFeatureFlagsKt.BATTERY_NOTIFICATIONS_TO_DEVICE_SETTINGS, "bff-cache-persistence", "alabs-dial-v2");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.BODY_COMPOSITION, FeatureFlagRepositoryKt.CACHED_VIEWED_ACTIVITY, FeatureFlagRepositoryKt.CANCEL_MEMBERSHIP_BUTTON, "commerce-success-haptics-android");
        AbstractC11266d.m30445C(arrayList, "community-followers-android", FeatureFlagRepositoryKt.COMMUNITY_TEAMS_CRASH, FeatureFlagRepositoryKt.CUSTOMIZE_JOURNAL_ONBOARDING, FeatureFlagRepositoryKt.CUSTOM_BOTTOM_SHEET);
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.DAILY_OUTLOOK_PUSH_NOTIFICATION, FeatureFlagRepositoryKt.DESIGN_LOTTIE_LOADING, FeatureFlagRepositoryKt.DEVICE_SETTINGS_REGULATORY_TILES, FeatureFlagRepositoryKt.DISABLE_GPS_SOUTH_KOREA);
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.DROID_COMPRESS_IMAGE, "family-plan-feature-flag-android", "android-family-plan-community-entry-point", "generate-authenticated-url-in-authenticated-web-view-android");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.GENERIC_PUSH_NOTIFICATIONS_ENABLED, "gift-hub-android", FeatureFlagRepositoryKt.GIFT_WHOOP_EXTENSION, "graph-scrub-on-long-press-android");
        AbstractC11266d.m30445C(arrayList, "enable-cross-score-type-activity-edits", FeatureFlagRepositoryKt.HAL_ADDITIONAL_CONTEXT_CONTRACT, FeatureFlagRepositoryKt.HAL_BFF_BETA_TAG, FeatureFlagRepositoryKt.HAL_DYNAMIC_SUGGESTIONS_CONTAINER);
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.HAL_EDUCATION_HUB, FeatureFlagRepositoryKt.HAL_OPTIMIZATIONS, FeatureFlagRepositoryKt.HAL_OPTIMIZATIONS, "hal-preset-questions");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.HAL_STRENGTH_TRAINER_ROUNDED_CORNERS, FeatureFlagRepositoryKt.HAL_SUGGESTIONS_MARKDOWN, FeatureFlagRepositoryKt.HAL_WAKE_UP_REPORT_BETA_TAG, FeatureFlagRepositoryKt.HEALTHSPAN_COACHING);
        AbstractC11266d.m30445C(arrayList, "healthspan-coaching-bottom-sheet-swipe", "health-tab-no-hr", "hide-unknown-destinations-android", "hormonal-insights-updates");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.HOLIDAY_STYLING_ANDROID, FeatureFlagRepositoryKt.HOLIDAY_TAG_IN_SETTINGS, "hormonal-insights-arch-v2", FeatureFlagRepositoryKt.HOME_ERROR_ANALYTICS_FIX);
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.HOME_PILLAR_BEHAVIOR_FIX, "home-navigation-tab-switch-android", FeatureFlagRepositoryKt.INTERNATIONALIZED_TEAM_VIEWS, "jj-coach-screen-model-deeplink");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.JOURNAL_CYCLE_ID_FIX, "journal-show-untracked-behaviors", "kt-serialization-advanced-labs-management", "kt-serialization-console-packets");
        AbstractC11266d.m30445C(arrayList, "kt-serialization-community", FeatureFlagRepositoryKt.KT_SERIALIZATION_CYCLE_METADATA, "kt-serialization-help-center", "kt-serialization-home-notifications-center");
        AbstractC11266d.m30445C(arrayList, "kt-serialization-journal", "kt-serialization-member-data-export", "kt-serialization-nested-bff", "kt-serialization-sleep-coach-onboarding");
        AbstractC11266d.m30445C(arrayList, "kt-serialization-refer-a-friend", "kt-serialization-recovery-impacts", "kt-serialization-settings", "kt-serialization-settings-banner");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.KT_SERIALIZATION_HEALTH_MONITOR_USERS_API, "kt-serialization-sleep-coach", "kt-serialization-smart-alarm", FeatureFlagRepositoryKt.KT_SERIALIZATION_USERS_PREFERENCE);
        AbstractC11266d.m30445C(arrayList, "kt-serialization-payments-module", "kt-serialization-universal-checkout", "kt-serialization-limited-time-offer", "kt-serialization-strap-location");
        AbstractC11266d.m30445C(arrayList, "kt-serialization-feedback-survey", FdaFeatureFlagsKt.LABRADOR_FEATURE_ANDROID, "ecg-connectivity-analytics", "maverick-membership-management-android");
        AbstractC11266d.m30445C(arrayList, "maverick-regulatory-labels-android", "MccSettings", "membership-adjustment-android", "kt-serialization-pairing-membership-adjustment-module");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.MEMBERSHIP_PAUSE_BUTTON, FeatureFlagRepositoryKt.MEMBER_DATA_EXPORT, "metrics-app-version-name-android", "membership-affiliate-from-msv2-android");
        AbstractC11266d.m30445C(arrayList, "membership-status-from-msv2-android", "card-expiration-status-from-msv2-android", FeatureFlagRepositoryKt.MX_CONTENT_SEARCH, FeatureFlagRepositoryKt.MY_ACCOUNT_REFRESH_FIX);
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.MY_ACCOUNT_TRIALS_HEADER, FeatureFlagRepositoryKt.NATIVE_EDUCATION_RECOVERY, FeatureFlagRepositoryKt.NATIVE_EDUCATION_SLEEP, FeatureFlagRepositoryKt.NATIVE_EDUCATION_STRAIN);
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.NEW_AUTH_STORAGE_MONITORING, FeatureFlagRepositoryKt.NEW_AUTH_USER_STORAGE, FeatureFlagRepositoryKt.NEW_CYCLE_STORAGE, "new-pairing-flow");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS, "password-reset-enforcement-enabled-android", FeatureFlagRepositoryKt.PREVENT_JOURNAL_AUTOPOP_RECOVERY_COUNT, FeatureFlagRepositoryKt.PRIVACY_ARCHV2_SCREEN);
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.PROFILE_ACHIEVEMENTS_OVERLAY, FeatureFlagRepositoryKt.PROFILE_NAVIGATION_FIX, FeatureFlagRepositoryKt.PROFILE_SETTINGS_GEAR, FeatureFlagRepositoryKt.RAF_HUB);
        AbstractC11266d.m30445C(arrayList, "refetch-membership-info-after-membership-action", "refetch-membership-info-device-settings-action", FeatureFlagRepositoryKt.REGULATORY_LABELS_SCREEN, FeatureFlagRepositoryKt.REMOVE_COACHING_HEALTH_MONITOR);
        AbstractC11266d.m30445C(arrayList, "sanguine-waitlist", FeatureFlagRepositoryKt.SETTINGS_BANNERS, FeatureFlagRepositoryKt.SHEPHERD_NOTIFICATION_FEATURE_ANDROID, FeatureFlagRepositoryKt.START_ACTIVITY_REVAMP);
        AbstractC11266d.m30445C(arrayList, "start-activity-prefetch", "stripe-tile-owns-set-default-android", FeatureFlagRepositoryKt.SLEEP_PLANNER_CEREAL_BOX, FeatureFlagRepositoryKt.BEDTIME_OFF_BODY_EXPERIMENT);
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.SMART_ALARM_POLL_TRIGGER, FeatureFlagRepositoryKt.STEALTH_MODE, "streaks-animation-android", "st-packet-debug-logs");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.STRESS_TREND_CTA, "tag-selector-allow-default-tag", FeatureFlagRepositoryKt.TAPPABLE_EFFECT_CARDS, "track-activity-targets");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.REMOVE_TEAM_CHAT_IMPLICIT_BROADCAST, FeatureFlagRepositoryKt.TRENDS_EDUCATION_CAROUSEL, FeatureFlagRepositoryKt.TRENDS_EDUCATION_CAROUSEL_V2, FeatureFlagRepositoryKt.TRIAL_CANCEL_SETTINGS);
        AbstractC11266d.m30445C(arrayList, CoreFeatureFlagsKt.URL_VALIDATION_ENCODED_QUERY_FIX, FeatureFlagRepositoryKt.USER_JOURNEY_CUSTOM_ANIMATIONS, "use-markdown-in-alert-tile-android", "use-membership-management-checkout-screen");
        AbstractC11266d.m30445C(arrayList, "use-refer-a-friend-menu-cache-android", "validate-is-paying-member-android", ConnectivityFeatureFlagsKt.VERBOSE_SYNCING_LOGGING, "webview-nav-bar-android");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX, FeatureFlagRepositoryKt.WEEKLY_PLAN_IN_JOURNAL_NON_ONBOARDING, FeatureFlagRepositoryKt.WEEKLY_PLAN_STRAIN_COACH, FeatureFlagRepositoryKt.WEEKLY_PLAN_TOP_LEVEL_SCREEN);
        AbstractC11266d.m30445C(arrayList, "weekly-plan-home-tile-expanded-state-fix", "weekly-plan-add-activity-cta", FeatureFlagRepositoryKt.WEIGHTLIFTING_INTERACTIVE_NOTIFICATIONS, FeatureFlagRepositoryKt.WHOOP_COACH_FEEDBACK_V3);
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.AICHAT_CONVERSATION_SCROLL_POSITIONING, "android-coach-smooth-streaming", "ai-show-preamble-loading-indicator", "coach-message-streaming-android-v2");
        AbstractC11266d.m30445C(arrayList, FeatureFlagRepositoryKt.WHOOP_COACH_TYPEWRITER_EFFECT_FIX, FeatureFlagRepositoryKt.WHOOP_PRO_SUBSCRIPTION, FeatureFlagRepositoryKt.WTE_NEW_GAUGE, "whoop-coach-weather-gps-android");
        AbstractC11266d.m30445C(arrayList, "kt-serialization-onboarding-story", FeatureFlagRepositoryKt.KT_SERIALIZATION_USERS_SERVICE, "whoop-coach-tool-calling-mobile", "wce-android-horizontal-scrolling");
        m80140t(arrayList);
        m80142v(arrayList);
        m80141u(arrayList);
        m80143w(arrayList);
        m80138q(arrayList);
        m80139r(arrayList);
        Set<String> setM74103I1 = AbstractC25265s.m74103I1(AbstractC25265s.m74150t1(arrayList));
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(setM74103I1, 10));
        for (String str : setM74103I1) {
            arrayList2.add(new C26849e(str, m80128F(str)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: A */
    public final void m80145A(String featureFlag, boolean forceToggleFeatureFlag) {
        AbstractC22676k.m65750j(featureFlag, "featureFlag");
        if (forceToggleFeatureFlag) {
            Set<String> set = this.featureFlagsFromRemote;
            if (set == null) {
                AbstractC22676k.m65757q("featureFlagsFromRemote");
                throw null;
            }
            set.add(featureFlag);
        } else {
            Set<String> set2 = this.featureFlagsFromRemote;
            if (set2 == null) {
                AbstractC22676k.m65757q("featureFlagsFromRemote");
                throw null;
            }
            set2.remove(featureFlag);
        }
        PreferenceHelper preferenceHelper = this.preferenceHelper;
        Set<String> set3 = this.featureFlagsFromRemote;
        if (set3 == null) {
            AbstractC22676k.m65757q("featureFlagsFromRemote");
            throw null;
        }
        preferenceHelper.putListOfStringsIntoFeaturePrefs(FeatureFlagRepositoryImplKt.TAG_FEATURES, AbstractC25265s.m74093D1(set3));
        this.preferenceHelper.putBooleanValueIntoFeaturePrefs(FeatureFlagRepositoryImplKt.OVERRIDE_FEATURE_FLAGS, true);
        FeatureFlagRepositoryImpl featureFlagRepositoryImpl = this.featureFlagRepository;
        Set<String> set4 = this.featureFlagsFromRemote;
        if (set4 == null) {
            AbstractC22676k.m65757q("featureFlagsFromRemote");
            throw null;
        }
        featureFlagRepositoryImpl.addValueToStreams(set4);
        m80131M(new C26845a(this, 1));
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: G */
    public final void m80147G() {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: H */
    public final Object m80148H(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f107141y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f107141y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objResetFeatureFlagsToNormalFromDebugSettings = bVar.f107139w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f107141y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objResetFeatureFlagsToNormalFromDebugSettings);
            FeatureFlagRepositoryImpl featureFlagRepositoryImpl = this.featureFlagRepository;
            bVar.f107141y = 1;
            objResetFeatureFlagsToNormalFromDebugSettings = featureFlagRepositoryImpl.resetFeatureFlagsToNormalFromDebugSettings(bVar);
            if (objResetFeatureFlagsToNormalFromDebugSettings == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objResetFeatureFlagsToNormalFromDebugSettings);
        }
        if (((Boolean) objResetFeatureFlagsToNormalFromDebugSettings).booleanValue()) {
            m80131M(new C26845a(this, 0));
            AbstractC3006f0.m8732z(this.coroutineScope, this.dispatcherFactory.mo54465b(), null, new c(null), 2);
        }
        return objResetFeatureFlagsToNormalFromDebugSettings;
    }

    /* JADX INFO: renamed from: K */
    public final void m80149K(String searchQuery) {
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        m80131M(new C24656d(27, this, searchQuery));
    }

    /* JADX INFO: renamed from: y */
    public final void m80150y() {
        m80149K("");
    }

    public /* synthetic */ C26847c(FeatureFlagRepositoryImpl featureFlagRepositoryImpl, PreferenceHelper preferenceHelper, InterfaceC18732d interfaceC18732d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagRepositoryImpl, preferenceHelper, interfaceC18732d, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
