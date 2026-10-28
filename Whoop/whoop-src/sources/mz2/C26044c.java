package mz2;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.whooplabs.p070io.HrDeviceConnection;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hc3.C17171d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.InterfaceC23462h;
import nf3.C26669a;
import nz2.AbstractC27308b;
import of3.InterfaceC27903a;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import yw2.C39830b;

/* JADX INFO: renamed from: mz2.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m65681d2 = {"Lmz2/c;", "Lof3/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lq83/j;", "maintenanceContext", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/j;)V", "", "p", "()Z", "Lmz2/d;", "hrDeviceScanner", "Ll83/a0;", "s", "(Lmz2/d;)V", "Lcom/whoop/whooplabs/io/HrDeviceConnection;", "hrDeviceConnection", "q", "(Lcom/whoop/whooplabs/io/HrDeviceConnection;)V", "r", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/data/repositories/FeatureFlagChecker;", "x", "Lq83/j;", "Ltr2/n;", "y", "Ltr2/n;", "m", "()Ltr2/n;", "logger", "Lbc3/c0;", "z", "Lbc3/c0;", "waitAndRescanScope", "E", "connectionMaintenanceScope", "F", "Lcom/whoop/whooplabs/io/HrDeviceConnection;", "G", "Ll83/h;", "l", "()Lmz2/d;", "hrDeviceScannerLegacy", "H", "Lmz2/d;", "activeRescanScanner", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26044c implements InterfaceC27903a {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private InterfaceC2994c0 connectionMaintenanceScope;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private HrDeviceConnection hrDeviceConnection;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h hrDeviceScannerLegacy;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private C26045d activeRescanScanner;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC30063j maintenanceContext;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private InterfaceC2994c0 waitAndRescanScope;

    /* JADX INFO: renamed from: mz2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrConnectionMaintainer$startMaintainingConnection$1$1", m100430f = "HrConnectionMaintainer.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f103038w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ HrDeviceConnection f103039x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26044c f103040y;

        /* JADX INFO: renamed from: mz2.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42036a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C26044c f103041w;

            public C42036a(C26044c c26044c) {
                this.f103041w = c26044c;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: e */
            public static final C34911a m77486e(C26044c c26044c) {
                return AbstractC15751g.m44431K(c26044c.waitAndRescanScope);
            }

            /* JADX INFO: renamed from: c */
            public final Object m77487c(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f103041w.getLogger().mo85216g(AbstractC2875y.m8295h(i13, "BTHR new state: "), new AbstractC30556a.a[0]);
                if (this.f103041w.m77480p()) {
                    C26045d c26045d = this.f103041w.activeRescanScanner;
                    if (c26045d != null) {
                        c26045d.m77504p();
                    }
                    InterfaceC2994c0 interfaceC2994c0 = this.f103041w.waitAndRescanScope;
                    if (interfaceC2994c0 != null) {
                        AbstractC3006f0.m8714h(interfaceC2994c0, null);
                    }
                    if (i13 == 0) {
                        this.f103041w.getLogger().mo85228t("Connection Disconnected; will wait and rescan", new AbstractC30556a.a[0]);
                        C26044c c26044c = this.f103041w;
                        c26044c.waitAndRescanScope = AbstractC3006f0.m8708b(c26044c.maintenanceContext.plus(AbstractC3006f0.m8710d()));
                        C26044c c26044c2 = this.f103041w;
                        C26045d c26045d2 = (C26045d) c26044c2.getKoin().f106046a.f159364d.m122602a(new C26043b(c26044c2, 0), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26045d.class), null);
                        this.f103041w.activeRescanScanner = c26045d2;
                        this.f103041w.m77481s(c26045d2);
                    } else {
                        this.f103041w.waitAndRescanScope = null;
                        this.f103041w.activeRescanScanner = null;
                    }
                } else {
                    InterfaceC2994c0 interfaceC2994c1 = this.f103041w.waitAndRescanScope;
                    if (interfaceC2994c1 != null) {
                        AbstractC3006f0.m8714h(interfaceC2994c1, null);
                    }
                    if (i13 == 0) {
                        this.f103041w.getLogger().mo85228t("Connection Disconnected; will wait and rescan", new AbstractC30556a.a[0]);
                        C26044c c26044c3 = this.f103041w;
                        c26044c3.waitAndRescanScope = AbstractC3006f0.m8708b(c26044c3.maintenanceContext.plus(AbstractC3006f0.m8710d()));
                        C26044c c26044c4 = this.f103041w;
                        c26044c4.m77481s(c26044c4.m77477l());
                    }
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m77487c(((Number) obj).intValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HrDeviceConnection hrDeviceConnection, C26044c c26044c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f103039x = hrDeviceConnection;
            this.f103040y = c26044c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f103039x, this.f103040y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f103038w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2M28598A = this.f103039x.getConnectionStateFlow();
                C42036a c42036a = new C42036a(this.f103040y);
                this.f103038w = 1;
                if (interfaceC13037f2M28598A.collect(c42036a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: mz2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrConnectionMaintainer$waitAndRescan$1", m100430f = "HrConnectionMaintainer.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f103042w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26045d f103043x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26044c f103044y;

        /* JADX INFO: renamed from: mz2.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C26044c f103045w;

            public a(C26044c c26044c) {
                this.f103045w = c26044c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C39830b c39830b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f103045w.getLogger().mo85228t(AbstractC31061c.m95640p("found device ", c39830b.getName(), " with address ", c39830b.getAddress()), new AbstractC30556a.a[0]);
                HrDeviceConnection hrDeviceConnection = this.f103045w.hrDeviceConnection;
                if (hrDeviceConnection != null) {
                    Object objM28606v = hrDeviceConnection.m28606v(c39830b.getAddress(), interfaceC30057d);
                    return objM28606v == EnumC31071a.f128113w ? objM28606v : C23454a0.f92919a;
                }
                AbstractC22676k.m65757q("hrDeviceConnection");
                throw null;
            }
        }

        /* JADX INFO: renamed from: mz2.c$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42037b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f103046w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26044c f103047x;

            /* JADX INFO: renamed from: mz2.c$b$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f103048w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C26044c f103049x;

                /* JADX INFO: renamed from: mz2.c$b$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrConnectionMaintainer$waitAndRescan$1$invokeSuspend$$inlined$filter$1$2", m100430f = "HrConnectionMaintainer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42038a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f103051F;

                    /* JADX INFO: renamed from: G */
                    Object f103052G;

                    /* JADX INFO: renamed from: H */
                    int f103053H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f103054w;

                    /* JADX INFO: renamed from: x */
                    int f103055x;

                    /* JADX INFO: renamed from: y */
                    Object f103056y;

                    /* JADX INFO: renamed from: z */
                    Object f103057z;

                    public C42038a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f103054w = obj;
                        this.f103055x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m, C26044c c26044c) {
                    this.f103048w = interfaceC13062m;
                    this.f103049x = c26044c;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42038a c42038a;
                    if (interfaceC30057d instanceof C42038a) {
                        c42038a = (C42038a) interfaceC30057d;
                        int i13 = c42038a.f103055x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42038a.f103055x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42038a = new C42038a(interfaceC30057d);
                        }
                    } else {
                        c42038a = new C42038a(interfaceC30057d);
                    }
                    Object obj2 = c42038a.f103054w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42038a.f103055x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f103048w;
                        String address = ((C39830b) obj).getAddress();
                        HrDeviceConnection hrDeviceConnection = this.f103049x.hrDeviceConnection;
                        if (hrDeviceConnection == null) {
                            AbstractC22676k.m65757q("hrDeviceConnection");
                            throw null;
                        }
                        if (AbstractC22676k.m65745e(address, hrDeviceConnection.m28601D())) {
                            c42038a.f103056y = null;
                            c42038a.f103057z = null;
                            c42038a.f103051F = null;
                            c42038a.f103052G = null;
                            c42038a.f103053H = 0;
                            c42038a.f103055x = 1;
                            if (interfaceC13062m.emit(obj, c42038a) == enumC31071a) {
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

            public C42037b(InterfaceC13058l interfaceC13058l, C26044c c26044c) {
                this.f103046w = interfaceC13058l;
                this.f103047x = c26044c;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f103046w.collect(new a(interfaceC13062m, this.f103047x), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26045d c26045d, C26044c c26044c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f103043x = c26045d;
            this.f103044y = c26044c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f103043x, this.f103044y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f103042w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C42037b c42037b = new C42037b(this.f103043x.m77502l(), this.f103044y);
                a aVar = new a(this.f103044y);
                this.f103042w = 1;
                if (c42037b.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mz2.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrConnectionMaintainer$waitAndRescan$2", m100430f = "HrConnectionMaintainer.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f103058w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f103059x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C26045d f103061z;

        /* JADX INFO: renamed from: mz2.c$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrConnectionMaintainer$waitAndRescan$2$1", m100430f = "HrConnectionMaintainer.kt", m100431l = {96}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f103062w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26045d f103063x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C26045d c26045d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f103063x = c26045d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f103063x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f103062w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f103062w = 1;
                    if (AbstractC3034m0.m8782b(20000L, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.f103063x.m77504p();
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C26045d c26045d, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f103061z = c26045d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C26044c.this.new c(this.f103061z, interfaceC30057d);
            cVar.f103059x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x003a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x004c A[Catch: all -> 0x0012, TRY_ENTER, TryCatch #0 {all -> 0x0012, blocks: (B:5:0x000e, B:15:0x003b, B:18:0x004c, B:20:0x0070, B:12:0x0021, B:21:0x0087, B:22:0x008a, B:23:0x008b, B:24:0x008e), top: B:27:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0070 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:5:0x000e, B:15:0x003b, B:18:0x004c, B:20:0x0070, B:12:0x0021, B:21:0x0087, B:22:0x008a, B:23:0x008b, B:24:0x008e), top: B:27:0x000e }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0038 -> B:15:0x003b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f103059x
                bc3.c0 r0 = (bc3.InterfaceC2994c0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f103058w
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L1e
                if (r2 != r3) goto L16
                p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Throwable -> L12
                goto L3b
            L12:
                r0 = move-exception
                r15 = r0
                goto L8f
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                p505ts.AbstractC34132o.m107864I(r15)
            L21:
                mz2.c r15 = mz2.C26044c.this     // Catch: java.lang.Throwable -> L12
                tr2.n r15 = r15.getLogger()     // Catch: java.lang.Throwable -> L12
                java.lang.String r2 = "waiting to rescan"
                qr2.a$a[] r5 = new qr2.AbstractC30556a.a[r4]     // Catch: java.lang.Throwable -> L12
                r15.mo85228t(r2, r5)     // Catch: java.lang.Throwable -> L12
                r14.f103059x = r0     // Catch: java.lang.Throwable -> L12
                r14.f103058w = r3     // Catch: java.lang.Throwable -> L12
                r5 = 30000(0x7530, double:1.4822E-319)
                java.lang.Object r15 = bc3.AbstractC3034m0.m8782b(r5, r14)     // Catch: java.lang.Throwable -> L12
                if (r15 != r1) goto L3b
                return r1
            L3b:
                mz2.c r15 = mz2.C26044c.this     // Catch: java.lang.Throwable -> L12
                tr2.n r15 = r15.getLogger()     // Catch: java.lang.Throwable -> L12
                mz2.c r2 = mz2.C26044c.this     // Catch: java.lang.Throwable -> L12
                com.whoop.whooplabs.io.HrDeviceConnection r2 = mz2.C26044c.m77469d(r2)     // Catch: java.lang.Throwable -> L12
                java.lang.String r5 = "hrDeviceConnection"
                r6 = 0
                if (r2 == 0) goto L8b
                java.lang.String r2 = r2.m28601D()     // Catch: java.lang.Throwable -> L12
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
                r7.<init>()     // Catch: java.lang.Throwable -> L12
                java.lang.String r8 = "finished waiting to rescan; starting scan for "
                r7.append(r8)     // Catch: java.lang.Throwable -> L12
                r7.append(r2)     // Catch: java.lang.Throwable -> L12
                java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L12
                qr2.a$a[] r7 = new qr2.AbstractC30556a.a[r4]     // Catch: java.lang.Throwable -> L12
                r15.mo85228t(r2, r7)     // Catch: java.lang.Throwable -> L12
                mz2.d r8 = r14.f103061z     // Catch: java.lang.Throwable -> L12
                mz2.c r15 = mz2.C26044c.this     // Catch: java.lang.Throwable -> L12
                com.whoop.whooplabs.io.HrDeviceConnection r15 = mz2.C26044c.m77469d(r15)     // Catch: java.lang.Throwable -> L12
                if (r15 == 0) goto L87
                java.lang.String r9 = r15.m28601D()     // Catch: java.lang.Throwable -> L12
                r12 = 6
                r13 = 0
                r10 = 0
                r11 = 0
                mz2.C26045d.m77500o(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L12
                mz2.c$c$a r15 = new mz2.c$c$a     // Catch: java.lang.Throwable -> L12
                mz2.d r2 = r14.f103061z     // Catch: java.lang.Throwable -> L12
                r15.<init>(r2, r6)     // Catch: java.lang.Throwable -> L12
                r2 = 3
                bc3.AbstractC3006f0.m8732z(r0, r6, r6, r15, r2)     // Catch: java.lang.Throwable -> L12
                goto L21
            L87:
                p715kotlin.jvm.internal.AbstractC22676k.m65757q(r5)     // Catch: java.lang.Throwable -> L12
                throw r6     // Catch: java.lang.Throwable -> L12
            L8b:
                p715kotlin.jvm.internal.AbstractC22676k.m65757q(r5)     // Catch: java.lang.Throwable -> L12
                throw r6     // Catch: java.lang.Throwable -> L12
            L8f:
                mz2.c r0 = mz2.C26044c.this
                tr2.n r0 = r0.getLogger()
                java.lang.String r1 = "waitAndRescanScope cancelled; stopping scan"
                qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r4]
                r0.mo85228t(r1, r2)
                mz2.d r0 = r14.f103061z
                r0.m77504p()
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: mz2.C26044c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C26044c(FeatureFlagChecker featureFlagChecker, InterfaceC30063j maintenanceContext) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(maintenanceContext, "maintenanceContext");
        this.featureFlagChecker = featureFlagChecker;
        this.maintenanceContext = maintenanceContext;
        this.logger = AbstractC27308b.m82458a("HrConnectionMaintainer");
        this.hrDeviceScannerLegacy = AbstractC30060g.m92088H(new C26043b(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final C26045d m77477l() {
        return (C26045d) this.hrDeviceScannerLegacy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C26045d m77478n(C26044c c26044c) {
        return (C26045d) c26044c.getKoin().f106046a.f159364d.m122602a(new C26043b(c26044c, 2), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26045d.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C34911a m77479o(C26044c c26044c) {
        return AbstractC15751g.m44431K(c26044c.waitAndRescanScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final boolean m77480p() {
        return this.featureFlagChecker.isFeatureEnabled("dwl-android-connection-maintainer-fix");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m77481s(C26045d hrDeviceScanner) {
        this.logger.mo85228t("going to waitAndRescan", new AbstractC30556a.a[0]);
        InterfaceC2994c0 interfaceC2994c0 = this.waitAndRescanScope;
        if (interfaceC2994c0 != null) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(hrDeviceScanner, this, null), 3);
        }
        InterfaceC2994c0 interfaceC2994c1 = this.waitAndRescanScope;
        if (interfaceC2994c1 != null) {
            AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new c(hrDeviceScanner, null), 3);
        }
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final InterfaceC34116n getLogger() {
        return this.logger;
    }

    /* JADX INFO: renamed from: q */
    public final void m77483q(HrDeviceConnection hrDeviceConnection) {
        AbstractC22676k.m65750j(hrDeviceConnection, "hrDeviceConnection");
        this.hrDeviceConnection = hrDeviceConnection;
        InterfaceC2994c0 interfaceC2994c0 = this.connectionMaintenanceScope;
        if (interfaceC2994c0 != null) {
            AbstractC3006f0.m8714h(interfaceC2994c0, null);
        }
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(this.maintenanceContext.plus(AbstractC3006f0.m8710d()));
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new a(hrDeviceConnection, this, null), 3);
        this.connectionMaintenanceScope = c17171dM8708b;
    }

    /* JADX INFO: renamed from: r */
    public final void m77484r() {
        C26045d c26045d;
        boolean zM77480p = m77480p();
        if (zM77480p && (c26045d = this.activeRescanScanner) != null) {
            c26045d.m77504p();
        }
        InterfaceC2994c0 interfaceC2994c0 = this.connectionMaintenanceScope;
        if (interfaceC2994c0 != null) {
            AbstractC3006f0.m8714h(interfaceC2994c0, null);
        }
        InterfaceC2994c0 interfaceC2994c1 = this.waitAndRescanScope;
        if (interfaceC2994c1 != null) {
            AbstractC3006f0.m8714h(interfaceC2994c1, null);
        }
        if (zM77480p) {
            this.waitAndRescanScope = null;
            this.activeRescanScanner = null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C26044c(FeatureFlagChecker featureFlagChecker, InterfaceC30063j interfaceC30063j, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = ExecutorC22364d.f87316w;
        }
        this(featureFlagChecker, interfaceC30063j);
    }
}
