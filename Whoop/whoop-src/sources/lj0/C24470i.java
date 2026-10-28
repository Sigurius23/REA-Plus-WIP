package lj0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import dk0.C12108h;
import ec3.AbstractC13091v;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import fi0.InterfaceC14515a;
import hj0.C17345d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.concurrent.CancellationException;
import jk0.InterfaceC21750d;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import l83.C23465k;
import lt0.AbstractC24734k;
import lt0.C24731h;
import lt0.C24736m;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.EnumC33703a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: lj0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 22\u00020\u0001:\u00013B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, m65681d2 = {"Llj0/i;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "Lci2/b;", "whoopStrapProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljs0/c;", "configurationRepository", "Lfi0/a;", "baseAnalytics", "Lhj0/d;", "applicationLifecycle", "<init>", "(Lbc3/c0;Ltr2/n;Lci2/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljs0/c;Lfi0/a;Lhj0/d;)V", "Ll83/a0;", "p", "()V", "Lec3/t1;", "Llj0/f;", "l", "()Lec3/t1;", "q", "", "invalidPacketsCounter", "o", "(I)V", "imuPacketSuccessfullyParsedCounter", "n", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "Ltr2/n;", "y", "Lci2/b;", "z", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "Ljs0/c;", "F", "Lfi0/a;", "G", "Lhj0/d;", "H", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24470i implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C17345d applicationLifecycle;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: lj0.i$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ble.analytics.PacketSnifferAnalytics$packetCountsFlow$$inlined$flatMapLatest$1", m100430f = "PacketSnifferAnalytics.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f95426w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f95427x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f95428y;

        public b(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f95427x = interfaceC13062m;
            bVar.f95428y = interfaceC21750d;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lMo24699N;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95426w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f95427x;
                InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f95428y;
                if (interfaceC21750d == null || (interfaceC13058lMo24699N = interfaceC21750d.mo24699N()) == null) {
                    interfaceC13058lMo24699N = C13054k.f45116w;
                }
                this.f95427x = null;
                this.f95428y = null;
                this.f95426w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo24699N, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: lj0.i$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ble.analytics.PacketSnifferAnalytics$packetCountsFlow$2", m100430f = "PacketSnifferAnalytics.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Llj0/f;", "currentCount", "Llt0/k;", "packetType", "<anonymous>", "(Llj0/f;Llt0/k;)Llj0/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f95429w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f95430x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f95431y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C24467f c24467f, AbstractC24734k abstractC24734k, InterfaceC30057d<? super C24467f> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f95430x = c24467f;
            cVar.f95431y = abstractC24734k;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C24467f c24467f = (C24467f) this.f95430x;
            AbstractC24734k abstractC24734k = (AbstractC24734k) this.f95431y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f95429w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC24734k instanceof C24731h) {
                return AbstractC24468g.m71204c(c24467f);
            }
            if (abstractC24734k instanceof C24736m) {
                return abstractC24734k.getPacket() instanceof C12108h ? AbstractC24468g.m71203b(c24467f) : c24467f;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: lj0.i$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ble.analytics.PacketSnifferAnalytics$startSniffingDataPacketsForAnalytics$1", m100430f = "PacketSnifferAnalytics.kt", m100431l = {87}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f95433w;

        /* JADX INFO: renamed from: x */
        Object f95434x;

        /* JADX INFO: renamed from: y */
        int f95435y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f95436z;

        /* JADX INFO: renamed from: lj0.i$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13087t1 f95437w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24470i f95438x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC3027k1 f95439y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC2994c0 f95440z;

            public a(InterfaceC13087t1 interfaceC13087t1, C24470i c24470i, InterfaceC3027k1 interfaceC3027k1, InterfaceC2994c0 interfaceC2994c0) {
                this.f95437w = interfaceC13087t1;
                this.f95438x = c24470i;
                this.f95439y = interfaceC3027k1;
                this.f95440z = interfaceC2994c0;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0050  */
            /* JADX INFO: renamed from: b */
            public final Object m71230b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objM125868N0;
                C24467f c24467f = (C24467f) AbstractC25265s.m74100H0(this.f95437w.getReplayCache());
                if (c24467f == null) {
                    c24467f = new C24467f(0, 0, 3, null);
                }
                int iM71202a = AbstractC24468g.m71202a(c24467f);
                AbstractC21909c abstractC21909c = this.f95438x.configurationRepository;
                Companion.C41952a c41952a = Companion.C41952a.f95425a;
                C21908b configurations = abstractC21909c.getConfigurations();
                String name = c41952a.getName();
                Object defaultValue = c41952a.getDefaultValue();
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    String str = (String) configurations.get(name);
                    if (str != null) {
                        objM125868N0 = AbstractC39421y.m125932Q(str);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    String str2 = (String) configurations.get(name);
                    if (str2 != null) {
                        objM125868N0 = AbstractC39421y.m125933R(str2);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    String str3 = (String) configurations.get(name);
                    if (str3 != null) {
                        objM125868N0 = AbstractC39420x.m125915y(str3);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    String str4 = (String) configurations.get(name);
                    if (str4 != null) {
                        objM125868N0 = AbstractC39420x.m125914x(str4);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                    String str5 = (String) configurations.get(name);
                    if (str5 != null) {
                        objM125868N0 = AbstractC39414r.m125868N0(str5);
                    } else {
                        objM125868N0 = null;
                    }
                } else {
                    objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
                }
                if (objM125868N0 != null) {
                    defaultValue = objM125868N0;
                }
                if (defaultValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (iM71202a > ((Integer) defaultValue).intValue()) {
                    this.f95438x.m71226o(c24467f.getInvalidPacketCount());
                    this.f95438x.m71225n(c24467f.getImuStreamDataPacketCount());
                    this.f95438x.m71228q();
                    this.f95439y.cancel((CancellationException) null);
                    AbstractC3006f0.m8714h(this.f95440z, null);
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m71230b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: lj0.i$d$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f95441w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24470i f95442x;

            /* JADX INFO: renamed from: lj0.i$d$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f95443w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C24470i f95444x;

                /* JADX INFO: renamed from: lj0.i$d$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.ble.analytics.PacketSnifferAnalytics$startSniffingDataPacketsForAnalytics$1$invokeSuspend$$inlined$filter$1$2", m100430f = "PacketSnifferAnalytics.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41953a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f95446F;

                    /* JADX INFO: renamed from: G */
                    Object f95447G;

                    /* JADX INFO: renamed from: H */
                    int f95448H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f95449w;

                    /* JADX INFO: renamed from: x */
                    int f95450x;

                    /* JADX INFO: renamed from: y */
                    Object f95451y;

                    /* JADX INFO: renamed from: z */
                    Object f95452z;

                    public C41953a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f95449w = obj;
                        this.f95450x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m, C24470i c24470i) {
                    this.f95443w = interfaceC13062m;
                    this.f95444x = c24470i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41953a c41953a;
                    if (interfaceC30057d instanceof C41953a) {
                        c41953a = (C41953a) interfaceC30057d;
                        int i13 = c41953a.f95450x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41953a.f95450x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41953a = new C41953a(interfaceC30057d);
                        }
                    } else {
                        c41953a = new C41953a(interfaceC30057d);
                    }
                    Object obj2 = c41953a.f95449w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41953a.f95450x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f95443w;
                        if (((Boolean) obj).booleanValue() && this.f95444x.featureFlagChecker.isFeatureEnabled(ConnectivityFeatureFlagsKt.PACKET_ANALYTICS)) {
                            c41953a.f95451y = null;
                            c41953a.f95452z = null;
                            c41953a.f95446F = null;
                            c41953a.f95447G = null;
                            c41953a.f95448H = 0;
                            c41953a.f95450x = 1;
                            if (interfaceC13062m.emit(obj, c41953a) == enumC31071a) {
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

            public b(InterfaceC13058l interfaceC13058l, C24470i c24470i) {
                this.f95441w = interfaceC13058l;
                this.f95442x = c24470i;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f95441w.collect(new a(interfaceC13062m, this.f95442x), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C24470i.this.new d(interfaceC30057d);
            dVar.f95436z = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f95436z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95435y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 interfaceC13087t1M71224l = C24470i.this.m71224l();
                InterfaceC3027k1 interfaceC3027k1M36582H = AbstractC13091v.m36582H(interfaceC13087t1M71224l, C24470i.this.coroutineScope);
                b bVar = new b(C24470i.this.applicationLifecycle.getAppForegroundFlow(), C24470i.this);
                a aVar = new a(interfaceC13087t1M71224l, C24470i.this, interfaceC3027k1M36582H, interfaceC2994c0);
                this.f95436z = null;
                this.f95433w = null;
                this.f95434x = null;
                this.f95435y = 1;
                if (bVar.collect(aVar, this) == enumC31071a) {
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

    public C24470i(InterfaceC2994c0 coroutineScope, InterfaceC34116n logger, InterfaceC4733b whoopStrapProvider, FeatureFlagChecker featureFlagChecker, AbstractC21909c configurationRepository, InterfaceC14515a baseAnalytics, C17345d applicationLifecycle) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(applicationLifecycle, "applicationLifecycle");
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        this.whoopStrapProvider = whoopStrapProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.configurationRepository = configurationRepository;
        this.baseAnalytics = baseAnalytics;
        this.applicationLifecycle = applicationLifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13087t1 m71224l() {
        return AbstractC13091v.m36586L(new C13060l1(new C24467f(0, 0, 3, null), AbstractC13091v.m36590P(this.whoopStrapProvider.mo14819c(), new b(null)), new c(null)), this.coroutineScope, C13105z1.m36630a(3, 0L), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m71225n(int imuPacketSuccessfullyParsedCounter) {
        EnumC33703a enumC33703aMo24721d;
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC25265s.m74100H0(this.whoopStrapProvider.mo14819c().getReplayCache());
        this.baseAnalytics.mo41422d("Connectivity", "Published Downstream", null, "Packets Published Counts", String.valueOf(imuPacketSuccessfullyParsedCounter), AbstractC25247g0.m73990Y(new C23465k("Packet Type", "Inertial Measurement Unit Data"), new C23465k("Strap Generation", (interfaceC21750d == null || (enumC33703aMo24721d = interfaceC21750d.mo24721d()) == null) ? null : enumC33703aMo24721d.analyticsName())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m71226o(int invalidPacketsCounter) {
        EnumC33703a enumC33703aMo24721d;
        if (invalidPacketsCounter > 0) {
            InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC25265s.m74100H0(this.whoopStrapProvider.mo14819c().getReplayCache());
            this.baseAnalytics.mo41422d("Connectivity", "Failed to Publish Downstream", null, "Packets Published Counts", String.valueOf(invalidPacketsCounter), AbstractC31061c.m95645u("Strap Generation", (interfaceC21750d == null || (enumC33703aMo24721d = interfaceC21750d.mo24721d()) == null) ? null : enumC33703aMo24721d.analyticsName()));
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m71227p() {
        if (this.featureFlagChecker.isFeatureEnabled(ConnectivityFeatureFlagsKt.PACKET_ANALYTICS)) {
            m71228q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m71228q() {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        m71227p();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }
}
