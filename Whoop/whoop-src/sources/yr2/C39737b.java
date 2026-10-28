package yr2;

import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import fi0.InterfaceC14515a;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.C30064k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vb1.C35868a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: yr2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJa\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\"\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0010\u0010\u001e\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R,\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b$\u0010-¨\u0006/"}, m65681d2 = {"Lyr2/b;", "Lyr2/a;", "Ltr2/n;", "logger", "La6/g;", "Lf6/f;", "prefsDataStore", "Lfi0/a;", "analytics", "<init>", "(Ltr2/n;La6/g;Lfi0/a;)V", "", "g", "()Z", "T", "defaultValue", "Lkotlin/time/Duration;", "timeoutDuration", "Lkotlin/Function1;", "Lkotlinx/coroutines/TimeoutCancellationException;", "Ll83/a0;", "onTimeout", "Lkotlin/Function2;", "Lbc3/c0;", "Lq83/d;", "", "block", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/Object;JLkotlin/jvm/functions/Function1;Lc93/m;)Ljava/lang/Object;", "d", "b", "(Lq83/d;)Ljava/lang/Object;", "", "action", "c", "(Ljava/lang/String;)V", "a", "Ltr2/n;", "La6/g;", "Lfi0/a;", "", "Ll83/k;", "", "", "Ljava/util/List;", "()Ljava/util/List;", "splashVideoHapticsPattern", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39737b implements InterfaceC39736a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC0422g prefsDataStore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C23465k> splashVideoHapticsPattern;

    /* JADX INFO: renamed from: yr2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.util.splashvideo.SplashVideoHelperImpl$isFirstAppLaunch$1", m100430f = "SplashVideoHelperImpl.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171076w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39737b.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171076w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l data = C39737b.this.prefsDataStore.getData();
                this.f171076w = 1;
                obj = AbstractC13091v.m36575A(data, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Boolean bool = (Boolean) ((AbstractC14134f) obj).mo40227b(AbstractC39738c.m127158a());
            return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        }
    }

    /* JADX INFO: renamed from: yr2.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.util.splashvideo.SplashVideoHelperImpl", m100430f = "SplashVideoHelperImpl.kt", m100431l = {61}, m100432m = "recordIsFirstAppLaunch", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f171078w;

        /* JADX INFO: renamed from: y */
        int f171080y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171078w = obj;
            this.f171080y |= Integer.MIN_VALUE;
            return C39737b.this.mo127149b(this);
        }
    }

    /* JADX INFO: renamed from: yr2.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.util.splashvideo.SplashVideoHelperImpl$recordIsFirstAppLaunch$2", m100430f = "SplashVideoHelperImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171081w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171082x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f171082x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f171082x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171081w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(AbstractC39738c.m127158a(), Boolean.FALSE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yr2.b$d */
    @InterfaceC32271e(m100429c = "com.whoop.util.splashvideo.SplashVideoHelperImpl$runBlockingWithTimeout$2", m100430f = "SplashVideoHelperImpl.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m65681d2 = {"T", "Lbc3/c0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4351m f171083E;

        /* JADX INFO: renamed from: w */
        int f171084w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ long f171085x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f171086y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ T f171087z;

        /* JADX INFO: renamed from: yr2.b$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.util.splashvideo.SplashVideoHelperImpl$runBlockingWithTimeout$2$1", m100430f = "SplashVideoHelperImpl.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m65681d2 = {"T", "Lbc3/c0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f171088w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f171089x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC4351m f171090y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f171090y = interfaceC4351m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f171090y, interfaceC30057d);
                aVar.f171089x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super T> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f171089x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f171088w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC4351m interfaceC4351m = this.f171090y;
                this.f171089x = null;
                this.f171088w = 1;
                Object objInvoke = interfaceC4351m.invoke(interfaceC2994c0, this);
                return objInvoke == enumC31071a ? enumC31071a : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j7, Function1 function1, T t14, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171085x = j7;
            this.f171086y = function1;
            this.f171087z = t14;
            this.f171083E = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f171085x, this.f171086y, this.f171087z, this.f171083E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super T> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171084w;
            try {
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                long j7 = this.f171085x;
                a aVar = new a(this.f171083E, null);
                this.f171084w = 1;
                Object objM8749c = AbstractC3028k2.m8749c(j7, aVar, this);
                return objM8749c == enumC31071a ? enumC31071a : objM8749c;
            } catch (TimeoutCancellationException e5) {
                this.f171086y.invoke(e5);
                return this.f171087z;
            }
        }
    }

    public C39737b(InterfaceC34116n logger, InterfaceC0422g prefsDataStore, InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.logger = logger;
        this.prefsDataStore = prefsDataStore;
        this.analytics = analytics;
        this.splashVideoHapticsPattern = AbstractC37056f.m118959K(new C23465k(50L, 100), new C23465k(100L, 0), new C23465k(50L, 100), new C23465k(500L, 0), new C23465k(50L, 100), new C23465k(100L, 0), new C23465k(50L, 100), new C23465k(500L, 0), new C23465k(50L, 100), new C23465k(100L, 0), new C23465k(50L, 100), new C23465k(350L, 0), new C23465k(50L, 100), new C23465k(100L, 0), new C23465k(50L, 100), new C23465k(300L, 0), new C23465k(50L, 100), new C23465k(100L, 0), new C23465k(50L, 100), new C23465k(250L, 0), new C23465k(50L, 100), new C23465k(100L, 0), new C23465k(50L, 100), new C23465k(200L, 0), new C23465k(50L, 100), new C23465k(100L, 0), new C23465k(50L, 100));
    }

    /* JADX INFO: renamed from: g */
    private final boolean m127154g() {
        Boolean bool = (Boolean) m127156i(this, Boolean.FALSE, 0L, null, new a(null), 6, null);
        this.logger.mo85228t(AbstractC11266d.m30462p("isFirstAppLaunch: ", bool.booleanValue()), new AbstractC30556a.a[0]);
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: h */
    private final <T> T m127155h(T defaultValue, long timeoutDuration, Function1 onTimeout, InterfaceC4351m block) {
        return (T) AbstractC3006f0.m8699E(C30064k.f122676w, new d(timeoutDuration, onTimeout, defaultValue, block, null));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m127156i(C39737b c39737b, Object obj, long j7, Function1 function1, InterfaceC4351m interfaceC4351m, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            j7 = DurationKt.toDuration(1, DurationUnit.SECONDS);
        }
        long j13 = j7;
        if ((i13 & 4) != 0) {
            function1 = new C35868a(27);
        }
        return c39737b.m127155h(obj, j13, function1, interfaceC4351m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m127157j(TimeoutCancellationException it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    @Override // yr2.InterfaceC39736a
    /* JADX INFO: renamed from: a */
    public List<C23465k> mo127148a() {
        return this.splashVideoHapticsPattern;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yr2.InterfaceC39736a
    /* JADX INFO: renamed from: b */
    public Object mo127149b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f171080y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f171080y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f171078w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f171080y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = this.prefsDataStore;
                c cVar = new c(null);
                bVar.f171080y = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, cVar, bVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            this.logger.mo85218i("Failed to record first app launch", e5, new AbstractC30556a.a[0]);
            AbstractC3006f0.m8721o(bVar.getContext());
        }
        return C23454a0.f92919a;
    }

    @Override // yr2.InterfaceC39736a
    /* JADX INFO: renamed from: c */
    public void mo127150c(String action) {
        AbstractC22676k.m65750j(action, "action");
        try {
            this.analytics.mo41422d("branded_content", action, "video", "Activation Flow", "splash_video", AbstractC25247g0.m73989X(new C23465k("screen_name", "splash_video_screen")));
        } catch (Exception e5) {
            this.logger.mo85218i("Failed to record analytics event", e5, new AbstractC30556a.a[0]);
        }
    }

    @Override // yr2.InterfaceC39736a
    /* JADX INFO: renamed from: d */
    public boolean mo127151d() {
        return m127154g();
    }

    public /* synthetic */ C39737b(InterfaceC34116n interfaceC34116n, InterfaceC0422g interfaceC0422g, InterfaceC14515a interfaceC14515a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SplashVideoHelper") : interfaceC34116n, interfaceC0422g, interfaceC14515a);
    }
}
