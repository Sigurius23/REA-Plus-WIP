package ji0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import j02.InterfaceC21164r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ji0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lji0/g;", "Lj02/r;", "Lji0/f;", "config", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "scope", "<init>", "(Lji0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V", "", "d", "()Z", "", "Lcom/whoop/appconfiguration/TabConfiguration;", "tabs", "c", "(Ljava/util/List;)Z", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lec3/l;", "b", "Lec3/l;", "suppressHomeFetchNoDeviceFlow", "Lec3/f2;", "Lec3/f2;", "isAvailable", "()Lec3/f2;", "app-configuration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21719g implements InterfaceC21164r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13058l suppressHomeFetchNoDeviceFlow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13037f2 isAvailable;

    /* JADX INFO: renamed from: ji0.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.appconfiguration.DeviceHomeDestinationSourceImpl$isAvailable$1", m100430f = "DeviceHomeDestinationSourceImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m65681d2 = {"<anonymous>", "", "suppressHomeFetchNoDevice", "tabs", "", "Lcom/whoop/appconfiguration/TabConfiguration;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f83408w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ boolean f83409x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83410y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Boolean) obj).booleanValue(), (List<TabConfiguration>) obj2, (InterfaceC30057d<? super Boolean>) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4 = this.f83409x;
            List list = (List) this.f83410y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f83408w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(!z4 || C21719g.this.m61193c(list));
        }

        public final Object invoke(boolean z4, List<TabConfiguration> list, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            a aVar = C21719g.this.new a(interfaceC30057d);
            aVar.f83409x = z4;
            aVar.f83410y = list;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ji0.g$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f83412w;

        /* JADX INFO: renamed from: ji0.g$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f83413w;

            /* JADX INFO: renamed from: ji0.g$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.appconfiguration.DeviceHomeDestinationSourceImpl$special$$inlined$map$1$2", m100430f = "DeviceHomeDestinationSourceImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41847a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f83414E;

                /* JADX INFO: renamed from: F */
                Object f83415F;

                /* JADX INFO: renamed from: G */
                Object f83416G;

                /* JADX INFO: renamed from: H */
                int f83417H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f83418w;

                /* JADX INFO: renamed from: x */
                int f83419x;

                /* JADX INFO: renamed from: y */
                Object f83420y;

                public C41847a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f83418w = obj;
                    this.f83419x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f83413w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41847a c41847a;
                if (interfaceC30057d instanceof C41847a) {
                    c41847a = (C41847a) interfaceC30057d;
                    int i13 = c41847a.f83419x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41847a.f83419x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41847a = new C41847a(interfaceC30057d);
                    }
                } else {
                    c41847a = new C41847a(interfaceC30057d);
                }
                Object obj2 = c41847a.f83418w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41847a.f83419x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f83413w;
                    Boolean boolValueOf = Boolean.valueOf(((Set) obj).contains("suppress-home-fetch-no-device-android"));
                    c41847a.f83420y = null;
                    c41847a.f83414E = null;
                    c41847a.f83415F = null;
                    c41847a.f83416G = null;
                    c41847a.f83417H = 0;
                    c41847a.f83419x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c41847a) == enumC31071a) {
                        return enumC31071a;
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
            this.f83412w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f83412w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ji0.g$c */
    @InterfaceC32271e(m100429c = "com.whoop.appconfiguration.DeviceHomeDestinationSourceImpl$suppressHomeFetchNoDeviceFlow$2", m100430f = "DeviceHomeDestinationSourceImpl.kt", m100431l = {24}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83422w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f83423x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C21719g.this.new c(interfaceC30057d);
            cVar.f83423x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f83423x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83422w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Boolean boolValueOf = Boolean.valueOf(C21719g.this.m61194d());
                this.f83423x = null;
                this.f83422w = 1;
                if (interfaceC13062m.emit(boolValueOf, this) == enumC31071a) {
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

    public C21719g(InterfaceC21718f config, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(scope, "scope");
        this.featureFlagChecker = featureFlagChecker;
        InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(new C13015a0(new c(null), new b(featureFlagChecker.getFeatureFlagsFlow())));
        this.suppressHomeFetchNoDeviceFlow = interfaceC13058lM36610t;
        this.isAvailable = AbstractC13091v.m36587M(AbstractC13091v.m36610t(new C13060l1(interfaceC13058lM36610t, config.getTabsFlow(), new a(null), 1)), scope, C13105z1.f45288a, Boolean.valueOf(!m61194d() || m61193c((List) config.getTabsFlow().getValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final boolean m61193c(List<TabConfiguration> tabs) {
        List<TabConfiguration> list = tabs;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C9598e destination = ((TabConfiguration) it.next()).getDestination();
            if (AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9426u2.f27963w)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final boolean m61194d() {
        return this.featureFlagChecker.isFeatureEnabled("suppress-home-fetch-no-device-android");
    }

    @Override // j02.InterfaceC21164r
    /* JADX INFO: renamed from: isAvailable, reason: from getter */
    public InterfaceC13037f2 getIsAvailable() {
        return this.isAvailable;
    }
}
