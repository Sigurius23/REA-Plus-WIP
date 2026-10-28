package ij0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13050j;
import ec3.C13084s1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ek0.C13273b;
import ek0.C13275c;
import ek0.C13277d;
import ek0.C13279e;
import ih0.AbstractC18489d0;
import ih0.C18510t;
import j93.InterfaceC21461d;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import m83.AbstractC25260n;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import xj0.C38361k;
import xs0.C38637a;
import xs0.InterfaceC38638b;
import zj0.C40746o;

/* JADX INFO: renamed from: ij0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lij0/a;", "Lxs0/b;", "Lci2/b;", "whoopStrapProvider", "Lbc3/c0;", "applicationScope", "<init>", "(Lci2/b;Lbc3/c0;)V", "Lec3/l;", "Lxs0/a;", "d", "()Lec3/l;", "e", "(Lq83/d;)Ljava/lang/Object;", "a", "Lci2/b;", "b", "Lec3/l;", "batteryPackEventFlow", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18595a implements InterfaceC38638b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13058l batteryPackEventFlow;

    /* JADX INFO: renamed from: ij0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f72629a;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f72629a = iArr;
        }
    }

    /* JADX INFO: renamed from: ij0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.batteryPack.BatteryPackServiceImpl$createChargingFlow$$inlined$flatMapLatest$1", m100430f = "BatteryPackServiceImpl.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f72630w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f72631x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f72632y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C18595a f72633z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C18595a c18595a) {
            super(3, interfaceC30057d);
            this.f72633z = c18595a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f72633z);
            bVar.f72631x = interfaceC13062m;
            bVar.f72632y = interfaceC21750d;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f72630w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f72631x;
                InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f72632y;
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C13050j c13050jM36611u = AbstractC13091v.m36611u(new e(interfaceC21750d.mo24750v(AbstractC25260n.m74059b1(new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(C13277d.class), c22673i0.getOrCreateKotlinClass(C13273b.class), c22673i0.getOrCreateKotlinClass(C13275c.class), c22673i0.getOrCreateKotlinClass(C13279e.class)})), this.f72633z), c.f72634w, AbstractC13091v.f45232b);
                this.f72631x = null;
                this.f72632y = null;
                this.f72630w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13050jM36611u, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ij0.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f72634w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C38637a it) {
            AbstractC22676k.m65750j(it, "it");
            return Boolean.valueOf(it.getIsChargingStrap());
        }
    }

    /* JADX INFO: renamed from: ij0.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.batteryPack.BatteryPackServiceImpl$createChargingFlow$2", m100430f = "BatteryPackServiceImpl.kt", m100431l = {65, 65}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lxs0/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f72635w;

        /* JADX INFO: renamed from: x */
        int f72636x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f72637y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C18595a.this.new d(interfaceC30057d);
            dVar.f72637y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f72637y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f72636x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L44
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f72635w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                ij0.a r7 = ij0.C18595a.this
                r6.f72637y = r5
                r6.f72635w = r0
                r6.f72636x = r4
                java.lang.Object r7 = ij0.C18595a.m53807c(r7, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.f72637y = r5
                r6.f72635w = r5
                r6.f72636x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L44
            L43:
                return r1
            L44:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ij0.C18595a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ij0.a$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f72639w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18595a f72640x;

        /* JADX INFO: renamed from: ij0.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f72641w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18595a f72642x;

            /* JADX INFO: renamed from: ij0.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.batteryPack.BatteryPackServiceImpl$createChargingFlow$lambda$0$$inlined$map$1$2", m100430f = "BatteryPackServiceImpl.kt", m100431l = {53, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41747a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f72643E;

                /* JADX INFO: renamed from: F */
                Object f72644F;

                /* JADX INFO: renamed from: G */
                Object f72645G;

                /* JADX INFO: renamed from: H */
                Object f72646H;

                /* JADX INFO: renamed from: I */
                Object f72647I;

                /* JADX INFO: renamed from: J */
                Object f72648J;

                /* JADX INFO: renamed from: K */
                int f72649K;

                /* JADX INFO: renamed from: L */
                int f72650L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f72651w;

                /* JADX INFO: renamed from: x */
                int f72652x;

                /* JADX INFO: renamed from: y */
                Object f72653y;

                public C41747a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f72651w = obj;
                    this.f72652x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18595a c18595a) {
                this.f72641w = interfaceC13062m;
                this.f72642x = c18595a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L35;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof ij0.C18595a.e.a.C41747a
                    if (r0 == 0) goto L13
                    r0 = r9
                    ij0.a$e$a$a r0 = (ij0.C18595a.e.a.C41747a) r0
                    int r1 = r0.f72652x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f72652x = r1
                    goto L18
                L13:
                    ij0.a$e$a$a r0 = new ij0.a$e$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f72651w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f72652x
                    r3 = 1
                    r4 = 2
                    r5 = 0
                    if (r2 == 0) goto L56
                    if (r2 == r3) goto L3c
                    if (r2 != r4) goto L34
                    java.lang.Object r8 = r0.f72645G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f72643E
                    ij0.a$e$a$a r8 = (ij0.C18595a.e.a.C41747a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto Lc4
                L34:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3c:
                    int r8 = r0.f72649K
                    java.lang.Object r2 = r0.f72648J
                    ot0.a r2 = (ot0.C28323a) r2
                    java.lang.Object r2 = r0.f72647I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f72646H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r3 = r0.f72645G
                    ec3.m r3 = (ec3.InterfaceC13062m) r3
                    java.lang.Object r3 = r0.f72643E
                    ij0.a$e$a$a r3 = (ij0.C18595a.e.a.C41747a) r3
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L90
                L56:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f72641w
                    ot0.a r8 = (ot0.C28323a) r8
                    boolean r9 = r8 instanceof ek0.C13277d
                    r6 = 0
                    if (r9 == 0) goto L6e
                    xs0.a r9 = new xs0.a
                    ek0.d r8 = (ek0.C13277d) r8
                    com.whoop.connectivityCore.batteryPack.models.BatteryPackType r8 = r8.getHardwareFamily()
                    r9.<init>(r3, r8)
                    goto Lab
                L6e:
                    boolean r9 = r8 instanceof ek0.C13273b
                    if (r9 == 0) goto L92
                    ij0.a r8 = r7.f72642x
                    r0.f72653y = r5
                    r0.f72643E = r5
                    r0.f72644F = r5
                    r0.f72645G = r5
                    r0.f72646H = r2
                    r0.f72647I = r5
                    r0.f72648J = r5
                    r0.f72649K = r6
                    r0.f72650L = r6
                    r0.f72652x = r3
                    java.lang.Object r9 = ij0.C18595a.m53807c(r8, r0)
                    if (r9 != r1) goto L8f
                    goto Lc3
                L8f:
                    r8 = r6
                L90:
                    r6 = r8
                    goto Lab
                L92:
                    boolean r9 = r8 instanceof ek0.C13275c
                    if (r9 == 0) goto L9c
                    xs0.a r9 = new xs0.a
                    r9.<init>(r3, r5, r4, r5)
                    goto Lab
                L9c:
                    boolean r8 = r8 instanceof ek0.C13279e
                    if (r8 == 0) goto La6
                    xs0.a r9 = new xs0.a
                    r9.<init>(r6, r5, r4, r5)
                    goto Lab
                La6:
                    xs0.a r9 = new xs0.a
                    r9.<init>(r6, r5, r4, r5)
                Lab:
                    r0.f72653y = r5
                    r0.f72643E = r5
                    r0.f72644F = r5
                    r0.f72645G = r5
                    r0.f72646H = r5
                    r0.f72647I = r5
                    r0.f72648J = r5
                    r0.f72649K = r6
                    r0.f72652x = r4
                    java.lang.Object r8 = r2.emit(r9, r0)
                    if (r8 != r1) goto Lc4
                Lc3:
                    return r1
                Lc4:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ij0.C18595a.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public e(InterfaceC13058l interfaceC13058l, C18595a c18595a) {
            this.f72639w = interfaceC13058l;
            this.f72640x = c18595a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f72639w.collect(new a(interfaceC13062m, this.f72640x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ij0.a$f */
    @InterfaceC32271e(m100429c = "com.whoop.batteryPack.BatteryPackServiceImpl", m100430f = "BatteryPackServiceImpl.kt", m100431l = {78}, m100432m = "getBatteryPack", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f72655w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f72656x;

        /* JADX INFO: renamed from: z */
        int f72658z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f72656x = obj;
            this.f72658z |= Integer.MIN_VALUE;
            return C18595a.this.m53809e(this);
        }
    }

    /* JADX INFO: renamed from: ij0.a$g */
    @InterfaceC32271e(m100429c = "com.whoop.batteryPack.BatteryPackServiceImpl$getBatteryPackEventFlow$$inlined$transform$1", m100430f = "BatteryPackServiceImpl.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f72659w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f72660x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f72661y;

        /* JADX INFO: renamed from: ij0.a$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f72662w;

            /* JADX INFO: renamed from: ij0.a$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.batteryPack.BatteryPackServiceImpl$getBatteryPackEventFlow$$inlined$transform$1$1", m100430f = "BatteryPackServiceImpl.kt", m100431l = {39}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41748a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f72663E;

                /* JADX INFO: renamed from: F */
                Object f72664F;

                /* JADX INFO: renamed from: G */
                Object f72665G;

                /* JADX INFO: renamed from: H */
                int f72666H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f72667w;

                /* JADX INFO: renamed from: x */
                int f72668x;

                /* JADX INFO: renamed from: z */
                Object f72670z;

                public C41748a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f72667w = obj;
                    this.f72668x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f72662w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C41748a c41748a;
                if (interfaceC30057d instanceof C41748a) {
                    c41748a = (C41748a) interfaceC30057d;
                    int i13 = c41748a.f72668x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41748a.f72668x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41748a = new C41748a(interfaceC30057d);
                    }
                } else {
                    c41748a = new C41748a(interfaceC30057d);
                }
                Object obj = c41748a.f72667w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41748a.f72668x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    c41748a.f72670z = null;
                    c41748a.f72663E = null;
                    c41748a.f72664F = null;
                    c41748a.f72665G = null;
                    c41748a.f72666H = 0;
                    c41748a.f72668x = 1;
                    if (this.f72662w.emit((C38637a) t14, c41748a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f72661y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f72661y, interfaceC30057d);
            gVar.f72660x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f72659w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f72660x;
                InterfaceC13058l interfaceC13058l = this.f72661y;
                a aVar = new a(interfaceC13062m);
                this.f72660x = null;
                this.f72659w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    public C18595a(InterfaceC4733b whoopStrapProvider, InterfaceC2994c0 applicationScope) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        this.whoopStrapProvider = whoopStrapProvider;
        this.batteryPackEventFlow = AbstractC13091v.m36586L(m53808d(), applicationScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC13058l m53808d() {
        return new C13015a0(new d(null), AbstractC13091v.m36590P(AbstractC13091v.m36610t(new C4588i(this.whoopStrapProvider.mo14818b(), 2)), new b(null, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m53809e(InterfaceC30057d<? super C38637a> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f72658z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f72658z = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM61385y = fVar2.f72656x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f72658z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM61385y);
            InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
            if (interfaceC21750d == null) {
                return new C38637a(false, null, 2, null);
            }
            if (interfaceC21750d.getChargeStatus().m65149d()) {
                switch (a.f72629a[interfaceC21750d.mo24752w0().ordinal()]) {
                    case 1:
                        return new C38637a(true, null, 2, null);
                    case 2:
                    case 3:
                        C38361k c38361k = new C38361k();
                        fVar2.f72655w = null;
                        fVar2.f72658z = 1;
                        objM61385y = InterfaceC21750d.m61385y(interfaceC21750d, c38361k, 0L, fVar2, 2, null);
                        if (objM61385y == enumC31071a) {
                            return enumC31071a;
                        }
                        break;
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            return new C38637a(false, null, 2, null);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM61385y);
        C40746o c40746o = (C40746o) objM61385y;
        if (c40746o != null && c40746o.m132198W()) {
            return new C38637a(true, c40746o.getHardwareFamily());
        }
        return new C38637a(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final boolean m53810f(C38637a it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getIsChargingStrap();
    }

    @Override // xs0.InterfaceC38638b
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo53811a() {
        return new C13084s1(new g(AbstractC13091v.m36611u(this.batteryPackEventFlow, new C18510t(13), AbstractC13091v.f45232b), null));
    }
}
