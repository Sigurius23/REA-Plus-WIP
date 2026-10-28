package nu2;

import c93.InterfaceC4351m;
import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import org.joda.time.DateTime;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: nu2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lnu2/f;", "", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "Lec3/l;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "upstream", "", "b", "(Lec3/l;)Lec3/l;", "a", "Lzr2/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27149f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: nu2.f$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.SetTimeInteractor$interact$$inlined$flatMapLatest$1", m100430f = "SetTimeInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f108648w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f108649x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f108650y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C27149f f108651z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C27149f c27149f) {
            super(3, interfaceC30057d);
            this.f108651z = c27149f;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, DateTime dateTime, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f108651z);
            aVar.f108649x = interfaceC13062m;
            aVar.f108650y = dateTime;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108648w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f108649x;
                DateTime dateTime = (DateTime) this.f108650y;
                InterfaceC13058l c0456u = dateTime == null ? new C0456u(null, 1) : new C13084s1(this.f108651z.new c(dateTime, null));
                this.f108649x = null;
                this.f108650y = null;
                this.f108648w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (DateTime) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: nu2.f$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108652w;

        /* JADX INFO: renamed from: nu2.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108653w;

            /* JADX INFO: renamed from: nu2.f$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.SetTimeInteractor$interact$$inlined$map$1$2", m100430f = "SetTimeInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42099a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108654E;

                /* JADX INFO: renamed from: F */
                Object f108655F;

                /* JADX INFO: renamed from: G */
                Object f108656G;

                /* JADX INFO: renamed from: H */
                int f108657H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108658w;

                /* JADX INFO: renamed from: x */
                int f108659x;

                /* JADX INFO: renamed from: y */
                Object f108660y;

                public C42099a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108658w = obj;
                    this.f108659x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f108653w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42099a c42099a;
                CurrentSetState currentSetState;
                if (interfaceC30057d instanceof C42099a) {
                    c42099a = (C42099a) interfaceC30057d;
                    int i13 = c42099a.f108659x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42099a.f108659x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42099a = new C42099a(interfaceC30057d);
                    }
                } else {
                    c42099a = new C42099a(interfaceC30057d);
                }
                Object obj2 = c42099a.f108658w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42099a.f108659x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108653w;
                    ActiveWorkout activeWorkout = (ActiveWorkout) obj;
                    DateTime startTime = (activeWorkout == null || (currentSetState = activeWorkout.getCurrentSetState()) == null) ? null : currentSetState.getStartTime();
                    c42099a.f108660y = null;
                    c42099a.f108654E = null;
                    c42099a.f108655F = null;
                    c42099a.f108656G = null;
                    c42099a.f108657H = 0;
                    c42099a.f108659x = 1;
                    if (interfaceC13062m.emit(startTime, c42099a) == enumC31071a) {
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
            this.f108652w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108652w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nu2.f$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.SetTimeInteractor$interact$2$1", m100430f = "SetTimeInteractor.kt", m100431l = {36, 37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ DateTime f108662E;

        /* JADX INFO: renamed from: w */
        int f108663w;

        /* JADX INFO: renamed from: x */
        int f108664x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f108665y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DateTime dateTime, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108662E = dateTime;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C27149f.this.new c(this.f108662E, interfaceC30057d);
            cVar.f108665y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        /* JADX WARN: Code duplicated, block: B:13:0x002c  */
        /* JADX WARN: Code duplicated, block: B:16:0x0054 A[PHI: r2
          0x0054: PHI (r2v2 int) = (r2v1 int), (r2v3 int) binds: [B:14:0x0051, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0066 -> B:11:0x0022). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f108665y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r9.f108664x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L19
                if (r2 != r3) goto L11
                goto L1f
            L11:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L19:
                int r2 = r9.f108663w
                p505ts.AbstractC34132o.m107864I(r10)
                goto L54
            L1f:
                p505ts.AbstractC34132o.m107864I(r10)
            L22:
                q83.j r10 = r9.getContext()
                boolean r10 = bc3.AbstractC3006f0.m8730x(r10)
                if (r10 == 0) goto L69
                nu2.f r10 = nu2.C27149f.this
                zr2.a r10 = nu2.C27149f.m81640a(r10)
                long r5 = r10.mo133363b()
                org.joda.time.DateTime r10 = r9.f108662E
                long r7 = r10.getMillis()
                long r5 = r5 - r7
                r10 = 1000(0x3e8, float:1.401E-42)
                long r7 = (long) r10
                long r5 = r5 / r7
                int r2 = (int) r5
                java.lang.Integer r10 = new java.lang.Integer
                r10.<init>(r2)
                r9.f108665y = r0
                r9.f108663w = r2
                r9.f108664x = r4
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r1) goto L54
                goto L68
            L54:
                kotlin.time.Duration$Companion r10 = p715kotlin.time.Duration.INSTANCE
                kotlin.time.DurationUnit r10 = p715kotlin.time.DurationUnit.SECONDS
                long r5 = p715kotlin.time.DurationKt.toDuration(r4, r10)
                r9.f108665y = r0
                r9.f108663w = r2
                r9.f108664x = r3
                java.lang.Object r10 = bc3.AbstractC3034m0.m8783c(r5, r9)
                if (r10 != r1) goto L22
            L68:
                return r1
            L69:
                l83.a0 r10 = l83.C23454a0.f92919a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: nu2.C27149f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C27149f(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m81641b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(AbstractC13091v.m36610t(new b(upstream)), new a(null, this));
    }
}
