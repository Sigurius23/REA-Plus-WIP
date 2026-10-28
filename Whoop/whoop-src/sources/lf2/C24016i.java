package lf2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import hj0.AbstractC17356o;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf2.AbstractC29151a;
import pf2.AbstractC29152b;
import pf2.AbstractC29153c;
import pf2.AbstractC29154d;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import xe2.AbstractC38235d;
import xe2.C38236e;

/* JADX INFO: renamed from: lf2.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u001a\u0010(\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, m65681d2 = {"Llf2/i;", "Lhj0/o;", "Lxe2/e;", "interactor", "Llf2/l;", "reducer", "Li92/e;", "networkMonitor", "Lbc3/c0;", "coroutineScope", "<init>", "(Lxe2/e;Llf2/l;Li92/e;Lbc3/c0;)V", "Lpf2/c;", "viewEvent", "Lxe2/d;", "D", "(Lpf2/c;)Lxe2/d;", "Lpf2/a;", "repeatDaysViewEvent", "B", "(Lpf2/a;)Lxe2/d;", "Lpf2/b;", "sleepGoalViewEvent", "C", "(Lpf2/b;)Lxe2/d;", "Lpf2/d;", "wakeTimeViewEvent", "E", "(Lpf2/d;)Lxe2/d;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "F", "(Lpf2/c;)V", "Lxe2/e;", "Llf2/l;", "", "G", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Lec3/o1;", "H", "Lec3/o1;", "eventFlow", "Lec3/l;", "Llf2/k;", "I", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24016i extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C38236e interactor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C24019l reducer;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: lf2.i$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.presentation.selectSchedule.SleepWakeTimeSchedulingViewModel$sendViewEvent$1", m100430f = "SleepWakeTimeSchedulingViewModel.kt", m100431l = {52, 53, 55, 58, 59, 62, 63, 64, 67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ long f94820E;

        /* JADX INFO: renamed from: w */
        int f94821w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC29153c f94822x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C24016i f94823y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f94824z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC29153c abstractC29153c, C24016i c24016i, long j7, long j13, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f94822x = abstractC29153c;
            this.f94823y = c24016i;
            this.f94824z = j7;
            this.f94820E = j13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f94822x, this.f94823y, this.f94824z, this.f94820E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005d  */
        /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L46;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lf2.C24016i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: lf2.i$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f94825w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24016i f94826x;

        /* JADX INFO: renamed from: lf2.i$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f94827w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24016i f94828x;

            /* JADX INFO: renamed from: lf2.i$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.presentation.selectSchedule.SleepWakeTimeSchedulingViewModel$special$$inlined$map$1$2", m100430f = "SleepWakeTimeSchedulingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41948a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f94829E;

                /* JADX INFO: renamed from: F */
                Object f94830F;

                /* JADX INFO: renamed from: G */
                Object f94831G;

                /* JADX INFO: renamed from: H */
                int f94832H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f94833w;

                /* JADX INFO: renamed from: x */
                int f94834x;

                /* JADX INFO: renamed from: y */
                Object f94835y;

                public C41948a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f94833w = obj;
                    this.f94834x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24016i c24016i) {
                this.f94827w = interfaceC13062m;
                this.f94828x = c24016i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41948a c41948a;
                if (interfaceC30057d instanceof C41948a) {
                    c41948a = (C41948a) interfaceC30057d;
                    int i13 = c41948a.f94834x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41948a.f94834x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41948a = new C41948a(interfaceC30057d);
                    }
                } else {
                    c41948a = new C41948a(interfaceC30057d);
                }
                Object obj2 = c41948a.f94833w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41948a.f94834x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f94827w;
                    AbstractC38235d abstractC38235dM70843D = this.f94828x.m70843D((AbstractC29153c) obj);
                    c41948a.f94835y = null;
                    c41948a.f94829E = null;
                    c41948a.f94830F = null;
                    c41948a.f94831G = null;
                    c41948a.f94832H = 0;
                    c41948a.f94834x = 1;
                    if (interfaceC13062m.emit(abstractC38235dM70843D, c41948a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C24016i c24016i) {
            this.f94825w = interfaceC13058l;
            this.f94826x = c24016i;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f94825w.collect(new a(interfaceC13062m, this.f94826x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lf2.i$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f94837w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24016i f94838x;

        /* JADX INFO: renamed from: lf2.i$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f94839w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24016i f94840x;

            /* JADX INFO: renamed from: lf2.i$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.presentation.selectSchedule.SleepWakeTimeSchedulingViewModel$special$$inlined$map$2$2", m100430f = "SleepWakeTimeSchedulingViewModel.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41949a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f94841E;

                /* JADX INFO: renamed from: F */
                Object f94842F;

                /* JADX INFO: renamed from: G */
                Object f94843G;

                /* JADX INFO: renamed from: H */
                Object f94844H;

                /* JADX INFO: renamed from: I */
                Object f94845I;

                /* JADX INFO: renamed from: J */
                Object f94846J;

                /* JADX INFO: renamed from: K */
                Object f94847K;

                /* JADX INFO: renamed from: L */
                int f94848L;

                /* JADX INFO: renamed from: M */
                int f94849M;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f94850w;

                /* JADX INFO: renamed from: x */
                int f94851x;

                /* JADX INFO: renamed from: y */
                Object f94852y;

                public C41949a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f94850w = obj;
                    this.f94851x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24016i c24016i) {
                this.f94839w = interfaceC13062m;
                this.f94840x = c24016i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
            
                if (r4.emit(r10, r0) == r1) goto L22;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, q83.InterfaceC30057d r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof lf2.C24016i.c.a.C41949a
                    if (r0 == 0) goto L13
                    r0 = r10
                    lf2.i$c$a$a r0 = (lf2.C24016i.c.a.C41949a) r0
                    int r1 = r0.f94851x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f94851x = r1
                    goto L18
                L13:
                    lf2.i$c$a$a r0 = new lf2.i$c$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f94850w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f94851x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L5a
                    if (r2 == r4) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r9 = r0.f94843G
                    ec3.m r9 = (ec3.InterfaceC13062m) r9
                    java.lang.Object r9 = r0.f94841E
                    lf2.i$c$a$a r9 = (lf2.C24016i.c.a.C41949a) r9
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto Laf
                L34:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L3c:
                    int r9 = r0.f94848L
                    java.lang.Object r2 = r0.f94847K
                    lf2.l r2 = (lf2.C24019l) r2
                    java.lang.Object r4 = r0.f94846J
                    xe2.d r4 = (xe2.AbstractC38235d) r4
                    java.lang.Object r4 = r0.f94845I
                    q83.d r4 = (q83.InterfaceC30057d) r4
                    java.lang.Object r4 = r0.f94844H
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r6 = r0.f94843G
                    ec3.m r6 = (ec3.InterfaceC13062m) r6
                    java.lang.Object r6 = r0.f94841E
                    lf2.i$c$a$a r6 = (lf2.C24016i.c.a.C41949a) r6
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto L8e
                L5a:
                    p505ts.AbstractC34132o.m107864I(r10)
                    ec3.m r10 = r8.f94839w
                    xe2.d r9 = (xe2.AbstractC38235d) r9
                    lf2.i r2 = r8.f94840x
                    lf2.l r2 = lf2.C24016i.m70847z(r2)
                    lf2.i r6 = r8.f94840x
                    xe2.e r6 = lf2.C24016i.m70846y(r6)
                    r0.f94852y = r5
                    r0.f94841E = r5
                    r0.f94842F = r5
                    r0.f94843G = r5
                    r0.f94844H = r10
                    r0.f94845I = r5
                    r0.f94846J = r5
                    r0.f94847K = r2
                    r7 = 0
                    r0.f94848L = r7
                    r0.f94849M = r7
                    r0.f94851x = r4
                    java.lang.Object r9 = r6.m122558q(r9, r0)
                    if (r9 != r1) goto L8b
                    goto Lae
                L8b:
                    r4 = r10
                    r10 = r9
                    r9 = r7
                L8e:
                    xe2.f r10 = (xe2.AbstractC38237f) r10
                    lf2.k r10 = r2.m70872e(r10)
                    r0.f94852y = r5
                    r0.f94841E = r5
                    r0.f94842F = r5
                    r0.f94843G = r5
                    r0.f94844H = r5
                    r0.f94845I = r5
                    r0.f94846J = r5
                    r0.f94847K = r5
                    r0.f94848L = r9
                    r0.f94851x = r3
                    java.lang.Object r9 = r4.emit(r10, r0)
                    if (r9 != r1) goto Laf
                Lae:
                    return r1
                Laf:
                    l83.a0 r9 = l83.C23454a0.f92919a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: lf2.C24016i.c.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C24016i c24016i) {
            this.f94837w = interfaceC13058l;
            this.f94838x = c24016i;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f94837w.collect(new a(interfaceC13062m, this.f94838x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lf2.i$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.presentation.selectSchedule.SleepWakeTimeSchedulingViewModel$viewState$3", m100430f = "SleepWakeTimeSchedulingViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Llf2/k;", "previousState", "Li92/h;", "network", "<anonymous>", "(Llf2/k;Li92/h;)Llf2/k;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f94854w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f94855x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f94856y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC24018k abstractC24018k, AbstractC18263h abstractC18263h, InterfaceC30057d<? super AbstractC24018k> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f94855x = abstractC24018k;
            dVar.f94856y = abstractC18263h;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC24018k abstractC24018k = (AbstractC24018k) this.f94855x;
            AbstractC18263h abstractC18263h = (AbstractC18263h) this.f94856y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f94854w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return !abstractC18263h.m52614a() ? AbstractC24018k.b.f94862a : abstractC24018k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24016i(C38236e interactor, C24019l reducer, InterfaceC18260e networkMonitor, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.logTag = "SleepWakeTimeSchedulingViewModel";
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = new C13060l1(AbstractC13091v.m36586L(new c(new b(c13096w1M36592b, this), this), AbstractC1640x1.m5043b(this), C13105z1.f45288a, 1), networkMonitor.getNetworkFlow(), new d(null), 1);
    }

    /* JADX INFO: renamed from: B */
    private final AbstractC38235d m70841B(AbstractC29151a repeatDaysViewEvent) {
        if (AbstractC22676k.m65745e(repeatDaysViewEvent, AbstractC29151a.a.f117997a)) {
            return AbstractC38235d.g.f163887a;
        }
        if (repeatDaysViewEvent instanceof AbstractC29151a.b) {
            return new AbstractC38235d.b(((AbstractC29151a.b) repeatDaysViewEvent).getWeekDayValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: C */
    private final AbstractC38235d m70842C(AbstractC29152b sleepGoalViewEvent) {
        if (AbstractC22676k.m65745e(sleepGoalViewEvent, AbstractC29152b.a.f117999a)) {
            return AbstractC38235d.i.f163889a;
        }
        if (sleepGoalViewEvent instanceof AbstractC29152b.b) {
            return new AbstractC38235d.k(EnumC24015h.INSTANCE.m70839b(((AbstractC29152b.b) sleepGoalViewEvent).getSleepGoalViewType()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final AbstractC38235d m70843D(AbstractC29153c viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, AbstractC29153c.c.f118003a)) {
            return AbstractC38235d.c.f163883a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC29153c.j.f118010a)) {
            return AbstractC38235d.j.f163890a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC29153c.i.f118009a)) {
            return AbstractC38235d.l.f163892a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC29153c.f.f118006a)) {
            return AbstractC38235d.h.f163888a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC29153c.b.f118002a)) {
            return AbstractC38235d.a.f163881a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC29153c.e.f118005a)) {
            return AbstractC38235d.e.f163885a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC29153c.g.f118007a)) {
            return AbstractC38235d.f.f163886a;
        }
        if (viewEvent instanceof AbstractC29153c.h) {
            return m70841B(((AbstractC29153c.h) viewEvent).getRepeatDaysViewEvent());
        }
        if (viewEvent instanceof AbstractC29153c.l) {
            return new AbstractC38235d.n(EnumC24009b.INSTANCE.m70818b(((AbstractC29153c.l) viewEvent).getAlarmMode()));
        }
        if (viewEvent instanceof AbstractC29153c.a) {
            return AbstractC38235d.m.f163893a;
        }
        if (viewEvent instanceof AbstractC29153c.k) {
            return m70842C(((AbstractC29153c.k) viewEvent).getSleepGoalViewEvent());
        }
        if (viewEvent instanceof AbstractC29153c.m) {
            return m70844E(((AbstractC29153c.m) viewEvent).getWakeTimeViewEvent());
        }
        if (viewEvent instanceof AbstractC29153c.d) {
            return new AbstractC38235d.d(((AbstractC29153c.d) viewEvent).getScheduleId());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: E */
    private final AbstractC38235d m70844E(AbstractC29154d wakeTimeViewEvent) {
        if (AbstractC22676k.m65745e(wakeTimeViewEvent, AbstractC29154d.a.f118014a)) {
            return AbstractC38235d.h.f163888a;
        }
        if (wakeTimeViewEvent instanceof AbstractC29154d.b) {
            return new AbstractC38235d.o(((AbstractC29154d.b) wakeTimeViewEvent).getLatestWakeTime());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: F */
    public final void m70848F(AbstractC29153c event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(event, this, 1000L, 2000L, null), 3);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C24016i(C38236e c38236e, C24019l c24019l, InterfaceC18260e interfaceC18260e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c38236e, c24019l, interfaceC18260e, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
