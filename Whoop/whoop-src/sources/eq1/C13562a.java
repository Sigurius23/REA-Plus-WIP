package eq1;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.domain.model.Login;
import com.whoop.hrZones.network.HrZones;
import com.whoop.hrZones.network.HrZonesApi;
import com.whoop.hrZones.network.Zone;
import com.whoop.hrZones.network.ZoneID;
import dq1.C12288a;
import dq1.InterfaceC12289b;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25267u;
import od1.InterfaceC27837a0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: eq1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 82\u00020\u0001:\u00019B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110#¢\u0006\u0004\b$\u0010%J\u001e\u0010'\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0086@¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, m65681d2 = {"Leq1/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lod1/a0;", "userSessionManager", "Lbc3/c0;", "scope", "Ltr2/n;", "logger", "Lcom/whoop/hrZones/network/HrZonesApi;", "hrZonesApi", "Ldq1/b;", "hrZonesDao", "<init>", "(Lod1/a0;Lbc3/c0;Ltr2/n;Lcom/whoop/hrZones/network/HrZonesApi;Ldq1/b;)V", "Ll83/a0;", "g", "(Lq83/d;)Ljava/lang/Object;", "", "Ldq1/a;", "j", "()Ljava/util/List;", "Lcom/whoop/hrZones/network/ZoneID;", "zoneID", "", "minPercentage", "maxPercentage", "f", "(Lcom/whoop/hrZones/network/ZoneID;DD)Ldq1/a;", "Lcom/whoop/hrZones/network/Zone;", "o", "(Ljava/util/List;)Ljava/util/List;", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "Lec3/l;", "l", "()Lec3/l;", "zones", "p", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "hrZones", "", "currentHr", "n", "(Ljava/util/List;I)Lcom/whoop/hrZones/network/ZoneID;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lod1/a0;", "x", "Lbc3/c0;", "y", "Ltr2/n;", "z", "Lcom/whoop/hrZones/network/HrZonesApi;", "E", "Ldq1/b;", "F", "a", "hrZones-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13562a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC12289b hrZonesDao;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final HrZonesApi hrZonesApi;

    /* JADX INFO: renamed from: eq1.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.hrZones.domain.HrZonesRepository", m100430f = "HrZonesRepository.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 85}, m100432m = "fetchHrZoneSettings", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f47822w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f47823x;

        /* JADX INFO: renamed from: z */
        int f47825z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f47823x = obj;
            this.f47825z |= Integer.MIN_VALUE;
            return C13562a.this.m38280g(this);
        }
    }

    /* JADX INFO: renamed from: eq1.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.hrZones.domain.HrZonesRepository$fetchHrZoneSettings$response$1", m100430f = "HrZonesRepository.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"", "Ldq1/a;", "<anonymous>", "()Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        Object f47826w;

        /* JADX INFO: renamed from: x */
        int f47827x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13562a.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13562a c13562a;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f47827x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13562a c13562a2 = C13562a.this;
                HrZonesApi hrZonesApi = c13562a2.hrZonesApi;
                this.f47826w = c13562a2;
                this.f47827x = 1;
                Object hrZones = hrZonesApi.getHrZones(this);
                if (hrZones == enumC31071a) {
                    return enumC31071a;
                }
                c13562a = c13562a2;
                obj = hrZones;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c13562a = (C13562a) this.f47826w;
                AbstractC34132o.m107864I(obj);
            }
            return c13562a.m38282o(((HrZones) obj).getZones());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<C12288a>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: eq1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f47829w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13562a f47830x;

        /* JADX INFO: renamed from: eq1.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f47831w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13562a f47832x;

            /* JADX INFO: renamed from: eq1.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hrZones.domain.HrZonesRepository$getHrZones$$inlined$map$1$2", m100430f = "HrZonesRepository.kt", m100431l = {53, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41562a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f47833E;

                /* JADX INFO: renamed from: F */
                Object f47834F;

                /* JADX INFO: renamed from: G */
                Object f47835G;

                /* JADX INFO: renamed from: H */
                Object f47836H;

                /* JADX INFO: renamed from: I */
                Object f47837I;

                /* JADX INFO: renamed from: J */
                Object f47838J;

                /* JADX INFO: renamed from: K */
                int f47839K;

                /* JADX INFO: renamed from: L */
                int f47840L;

                /* JADX INFO: renamed from: M */
                int f47841M;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f47842w;

                /* JADX INFO: renamed from: x */
                int f47843x;

                /* JADX INFO: renamed from: y */
                Object f47844y;

                public C41562a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f47842w = obj;
                    this.f47843x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13562a c13562a) {
                this.f47831w = interfaceC13062m;
                this.f47832x = c13562a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L25;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, q83.InterfaceC30057d r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof eq1.C13562a.d.a.C41562a
                    if (r0 == 0) goto L13
                    r0 = r10
                    eq1.a$d$a$a r0 = (eq1.C13562a.d.a.C41562a) r0
                    int r1 = r0.f47843x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47843x = r1
                    goto L18
                L13:
                    eq1.a$d$a$a r0 = new eq1.a$d$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f47842w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f47843x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L56
                    if (r2 == r4) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r9 = r0.f47835G
                    ec3.m r9 = (ec3.InterfaceC13062m) r9
                    java.lang.Object r9 = r0.f47833E
                    eq1.a$d$a$a r9 = (eq1.C13562a.d.a.C41562a) r9
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto Lb4
                L34:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L3c:
                    int r9 = r0.f47839K
                    java.lang.Object r2 = r0.f47838J
                    java.util.List r2 = (java.util.List) r2
                    java.lang.Object r2 = r0.f47837I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f47836H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f47835G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f47833E
                    eq1.a$d$a$a r4 = (eq1.C13562a.d.a.C41562a) r4
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto L93
                L56:
                    p505ts.AbstractC34132o.m107864I(r10)
                    ec3.m r2 = r8.f47831w
                    java.util.List r9 = (java.util.List) r9
                    java.util.Collection r9 = (java.util.Collection) r9
                    boolean r10 = r9.isEmpty()
                    r6 = 0
                    if (r10 == 0) goto L9b
                    eq1.a r9 = r8.f47832x
                    tr2.n r9 = eq1.C13562a.m38277d(r9)
                    java.lang.String r10 = "HrZones list is empty, making an api call and returning default zones"
                    qr2.a$a[] r7 = new qr2.AbstractC30556a.a[r6]
                    r9.mo85222m(r10, r7)
                    eq1.a r9 = r8.f47832x
                    r0.f47844y = r5
                    r0.f47833E = r5
                    r0.f47834F = r5
                    r0.f47835G = r5
                    r0.f47836H = r2
                    r0.f47837I = r5
                    r0.f47838J = r5
                    r0.f47839K = r6
                    r0.f47840L = r6
                    r0.f47841M = r6
                    r0.f47843x = r4
                    java.lang.Object r9 = eq1.C13562a.m38274a(r9, r0)
                    if (r9 != r1) goto L92
                    goto Lb3
                L92:
                    r9 = r6
                L93:
                    eq1.a r10 = r8.f47832x
                    java.util.List r10 = eq1.C13562a.m38275b(r10)
                    r6 = r9
                    r9 = r10
                L9b:
                    r0.f47844y = r5
                    r0.f47833E = r5
                    r0.f47834F = r5
                    r0.f47835G = r5
                    r0.f47836H = r5
                    r0.f47837I = r5
                    r0.f47838J = r5
                    r0.f47839K = r6
                    r0.f47843x = r3
                    java.lang.Object r9 = r2.emit(r9, r0)
                    if (r9 != r1) goto Lb4
                Lb3:
                    return r1
                Lb4:
                    l83.a0 r9 = l83.C23454a0.f92919a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: eq1.C13562a.d.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public d(InterfaceC13058l interfaceC13058l, C13562a c13562a) {
            this.f47829w = interfaceC13058l;
            this.f47830x = c13562a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f47829w.collect(new a(interfaceC13062m, this.f47830x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: eq1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hrZones.domain.HrZonesRepository$getHrZones$1", m100430f = "HrZonesRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "Ldq1/a;", "it", "Ll83/a0;", "<anonymous>", "(Ljava/util/List;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f47846w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f47847x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C13562a.this.new e(interfaceC30057d);
            eVar.f47847x = obj;
            return eVar;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f47847x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f47846w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C13562a.this.logger.mo85228t(AbstractC11895b.m31998q("HrZones: List ", list), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(List<C12288a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(list, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: eq1.a$f */
    @InterfaceC32271e(m100429c = "com.whoop.hrZones.domain.HrZonesRepository$onCreate$1", m100430f = "HrZonesRepository.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/domain/model/Login;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/domain/model/Login;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f47849w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13562a.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Login login, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(login, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f47849w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13562a c13562a = C13562a.this;
                this.f47849w = 1;
                if (c13562a.m38280g(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: eq1.a$g */
    @InterfaceC32271e(m100429c = "com.whoop.hrZones.domain.HrZonesRepository$onCreate$2", m100430f = "HrZonesRepository.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/domain/model/Login;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f47851w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13562a.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f47851w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13562a c13562a = C13562a.this;
                this.f47851w = 1;
                if (c13562a.m38280g(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: eq1.a$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hrZones.domain.HrZonesRepository", m100430f = "HrZonesRepository.kt", m100431l = {59}, m100432m = "updateHrZones", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f47853w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f47854x;

        /* JADX INFO: renamed from: z */
        int f47856z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f47854x = obj;
            this.f47856z |= Integer.MIN_VALUE;
            return C13562a.this.m38285p(null, this);
        }
    }

    public C13562a(InterfaceC27837a0 userSessionManager, InterfaceC2994c0 scope, InterfaceC34116n logger, HrZonesApi hrZonesApi, InterfaceC12289b hrZonesDao) {
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(hrZonesApi, "hrZonesApi");
        AbstractC22676k.m65750j(hrZonesDao, "hrZonesDao");
        this.userSessionManager = userSessionManager;
        this.scope = scope;
        this.logger = logger;
        this.hrZonesApi = hrZonesApi;
        this.hrZonesDao = hrZonesDao;
    }

    /* JADX INFO: renamed from: f */
    private final C12288a m38279f(ZoneID zoneID, double minPercentage, double maxPercentage) {
        double d3 = 200;
        return new C12288a(zoneID, (int) (minPercentage * d3), zoneID != ZoneID.ZONE_5 ? ((int) (d3 * maxPercentage)) - 1 : 200);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r1.mo34208d(r13, r6) == r0) goto L31;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m38280g(q83.InterfaceC30057d<? super l83.C23454a0> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof eq1.C13562a.b
            if (r0 == 0) goto L14
            r0 = r13
            eq1.a$b r0 = (eq1.C13562a.b) r0
            int r1 = r0.f47825z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f47825z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            eq1.a$b r0 = new eq1.a$b
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f47823x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f47825z
            r9 = 0
            r10 = 0
            r11 = 2
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 == r2) goto L3d
            if (r1 != r11) goto L35
            java.lang.Object r0 = r6.f47822w
            u02.a r0 = (u02.InterfaceC34385a) r0
            p505ts.AbstractC34132o.m107864I(r13)     // Catch: java.lang.Exception -> L32
            goto L9c
        L32:
            r0 = move-exception
            r13 = r0
            goto L8f
        L35:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3d:
            p505ts.AbstractC34132o.m107864I(r13)
            goto L5c
        L41:
            p505ts.AbstractC34132o.m107864I(r13)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r13 = r2
            tr2.n r2 = r12.logger
            eq1.a$c r5 = new eq1.a$c
            r5.<init>(r10)
            r6.f47825z = r13
            r3 = 0
            java.lang.String r4 = "Failed to fetch Hr zones"
            r7 = 2
            r8 = 0
            java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L5c
            goto L8e
        L5c:
            u02.a r13 = (u02.InterfaceC34385a) r13
            boolean r1 = r13 instanceof u02.InterfaceC34385a.b
            if (r1 == 0) goto L76
            tr2.n r0 = r12.logger
            u02.a$b r13 = (u02.InterfaceC34385a.b) r13
            java.lang.String r13 = r13.getErrorMessage()
            java.lang.String r1 = "failed to fetch hrZones: "
            java.lang.String r13 = p000.AbstractC11266d.m30461o(r1, r13)
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r9]
            r0.mo85222m(r13, r1)
            goto L9c
        L76:
            boolean r1 = r13 instanceof u02.InterfaceC34385a.c
            if (r1 == 0) goto L9f
            dq1.b r1 = r12.hrZonesDao     // Catch: java.lang.Exception -> L32
            u02.a$c r13 = (u02.InterfaceC34385a.c) r13     // Catch: java.lang.Exception -> L32
            java.lang.Object r13 = r13.m108735a()     // Catch: java.lang.Exception -> L32
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Exception -> L32
            r6.f47822w = r10     // Catch: java.lang.Exception -> L32
            r6.f47825z = r11     // Catch: java.lang.Exception -> L32
            java.lang.Object r13 = r1.mo34208d(r13, r6)     // Catch: java.lang.Exception -> L32
            if (r13 != r0) goto L9c
        L8e:
            return r0
        L8f:
            tr2.n r0 = r12.logger
            java.lang.String r1 = "failed to save hrZones: "
            java.lang.String r13 = p031b9.AbstractC2875y.m8297j(r13, r1)
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r9]
            r0.mo85222m(r13, r1)
        L9c:
            l83.a0 r13 = l83.C23454a0.f92919a
            return r13
        L9f:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.C13562a.m38280g(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final List<C12288a> m38281j() {
        return AbstractC37056f.m118959K(m38279f(ZoneID.ZONE_0, 0.0d, 0.5d), m38279f(ZoneID.ZONE_1, 0.5d, 0.6d), m38279f(ZoneID.ZONE_2, 0.6d, 0.7d), m38279f(ZoneID.ZONE_3, 0.7d, 0.8d), m38279f(ZoneID.ZONE_4, 0.8d, 0.9d), m38279f(ZoneID.ZONE_5, 0.9d, 1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final List<C12288a> m38282o(List<Zone> list) {
        List<Zone> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (Zone zone : list2) {
            arrayList.add(new C12288a(zone.getId(), zone.getMin(), zone.getMax()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m38283l() {
        return new d(new C13052j1(this.hrZonesDao.mo34206a(), new e(null), 0), this);
    }

    /* JADX INFO: renamed from: n */
    public final ZoneID m38284n(List<C12288a> hrZones, int currentHr) {
        AbstractC22676k.m65750j(hrZones, "hrZones");
        for (C12288a c12288a : hrZones) {
            int min = c12288a.getMin();
            if (currentHr <= c12288a.getMax() && min <= currentHr) {
                return c12288a.getZoneID();
            }
        }
        return ZoneID.ZONE_0;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC13091v.m36582H(new C13015a0(new g(null), new C13052j1(this.userSessionManager.getLoginFlow(), new f(null), 0)), this.scope);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m38285p(List<Zone> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f47856z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f47856z = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object obj = hVar.f47854x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f47856z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC12289b interfaceC12289b = this.hrZonesDao;
                List<C12288a> listM38282o = m38282o(list);
                hVar.f47853w = null;
                hVar.f47856z = 1;
                if (interfaceC12289b.mo34208d(listM38282o, hVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            this.logger.mo85222m(AbstractC2875y.m8297j(e5, "failed to save hrZones: "), new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }
}
