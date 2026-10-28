package kl1;

import c93.InterfaceC4351m;
import com.whoop.home.domain.HomeApi;
import com.whoop.home.domain.models.CalendarResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fm1.EnumC14603g;
import il1.AbstractC18636m;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;

/* JADX INFO: renamed from: kl1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lkl1/c;", "Lod1/g;", "Lil1/m;", "Lkl1/e;", "Lcom/whoop/home/domain/HomeApi;", "homeApi", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/home/domain/HomeApi;Ltr2/n;)V", "", "monthOffset", "Ljava/time/LocalDate;", "requestDate", "", "e", "(ILjava/time/LocalDate;)Ljava/lang/String;", "Lil1/m$a;", "action", "Lcom/whoop/home/domain/models/CalendarResponse;", "d", "(Lil1/m$a;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/home/domain/HomeApi;", "b", "Ltr2/n;", "c", "Lkl1/e;", "initialAcc", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22563c implements InterfaceC27844g<AbstractC18636m, C22565e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HomeApi homeApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C22565e initialAcc;

    /* JADX INFO: renamed from: kl1.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.calendar.CalendarDomainInteractor", m100430f = "CalendarDomainInteractor.kt", m100431l = {86}, m100432m = "fetchCalendarFromApi", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f88768E;

        /* JADX INFO: renamed from: w */
        Object f88769w;

        /* JADX INFO: renamed from: x */
        Object f88770x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88771y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f88771y = obj;
            this.f88768E |= Integer.MIN_VALUE;
            return C22563c.this.m65302d(null, this);
        }
    }

    /* JADX INFO: renamed from: kl1.c$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f88773w;

        /* JADX INFO: renamed from: kl1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f88774w;

            /* JADX INFO: renamed from: kl1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.calendar.CalendarDomainInteractor$interact$$inlined$filterIsInstance$1$2", m100430f = "CalendarDomainInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41914a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f88776F;

                /* JADX INFO: renamed from: G */
                Object f88777G;

                /* JADX INFO: renamed from: H */
                int f88778H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f88779w;

                /* JADX INFO: renamed from: x */
                int f88780x;

                /* JADX INFO: renamed from: y */
                Object f88781y;

                /* JADX INFO: renamed from: z */
                Object f88782z;

                public C41914a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f88779w = obj;
                    this.f88780x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f88774w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41914a c41914a;
                if (interfaceC30057d instanceof C41914a) {
                    c41914a = (C41914a) interfaceC30057d;
                    int i13 = c41914a.f88780x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41914a.f88780x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41914a = new C41914a(interfaceC30057d);
                    }
                } else {
                    c41914a = new C41914a(interfaceC30057d);
                }
                Object obj2 = c41914a.f88779w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41914a.f88780x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f88774w;
                    if (obj instanceof AbstractC18636m.a) {
                        c41914a.f88781y = null;
                        c41914a.f88782z = null;
                        c41914a.f88776F = null;
                        c41914a.f88777G = null;
                        c41914a.f88778H = 0;
                        c41914a.f88780x = 1;
                        if (interfaceC13062m.emit(obj, c41914a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f88773w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f88773w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kl1.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.calendar.CalendarDomainInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CalendarDomainInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88783w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f88784x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88785y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22563c f88786z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C22563c c22563c) {
            super(3, interfaceC30057d);
            this.f88786z = c22563c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC18636m.a aVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f88786z);
            cVar.f88784x = interfaceC13062m;
            cVar.f88785y = aVar;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88783w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f88784x;
                C13084s1 c13084s1 = new C13084s1(this.f88786z.new d((AbstractC18636m.a) this.f88785y, null));
                this.f88784x = null;
                this.f88785y = null;
                this.f88783w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC18636m.a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kl1.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.calendar.CalendarDomainInteractor$interact$1$1", m100430f = "CalendarDomainInteractor.kt", m100431l = {43, 44, 45, 46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lkl1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC18636m.a f88787E;

        /* JADX INFO: renamed from: w */
        Object f88788w;

        /* JADX INFO: renamed from: x */
        int f88789x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f88790y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC18636m.a aVar, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88787E = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C22563c.this.new d(this.f88787E, interfaceC30057d);
            dVar.f88790y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x005e A[PHI: r8
          0x005e: PHI (r8v7 java.lang.Object) = (r8v6 java.lang.Object), (r8v0 java.lang.Object) binds: [B:21:0x005b, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f88790y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f88789x
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L32
                if (r2 == r6) goto L2e
                if (r2 == r5) goto L2a
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r0 = r7.f88788w
                com.whoop.home.domain.models.CalendarResponse r0 = (com.whoop.home.domain.models.CalendarResponse) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L7f
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L26:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L5e
            L2a:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L4f
            L2e:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L42
            L32:
                p505ts.AbstractC34132o.m107864I(r8)
                kl1.b$b r8 = kl1.AbstractC22562b.b.f88761a
                r7.f88790y = r0
                r7.f88789x = r6
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L42
                goto L7e
            L42:
                kl1.b$a r8 = kl1.AbstractC22562b.a.f88760a
                r7.f88790y = r0
                r7.f88789x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L4f
                goto L7e
            L4f:
                kl1.c r8 = kl1.C22563c.this
                il1.m$a r2 = r7.f88787E
                r7.f88790y = r0
                r7.f88789x = r4
                java.lang.Object r8 = kl1.C22563c.m65301c(r8, r2, r7)
                if (r8 != r1) goto L5e
                goto L7e
            L5e:
                com.whoop.home.domain.models.CalendarResponse r8 = (com.whoop.home.domain.models.CalendarResponse) r8
                kl1.b$c r2 = new kl1.b$c
                il1.m$a r4 = r7.f88787E
                fm1.g r4 = r4.getPillarType()
                il1.m$a r5 = r7.f88787E
                int r5 = r5.getMonthOffset()
                r2.<init>(r8, r4, r5)
                r8 = 0
                r7.f88790y = r8
                r7.f88788w = r8
                r7.f88789x = r3
                java.lang.Object r8 = r0.emit(r2, r7)
                if (r8 != r1) goto L7f
            L7e:
                return r1
            L7f:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kl1.C22563c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kl1.c$e */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.calendar.CalendarDomainInteractor$interact$2", m100430f = "CalendarDomainInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lkl1/e;", "accumulator", "Lkl1/b;", "action", "<anonymous>", "(Lkl1/e;Lkl1/b;)Lkl1/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88792w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f88793x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88794y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22565e c22565e, AbstractC22562b abstractC22562b, InterfaceC30057d<? super C22565e> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f88793x = c22565e;
            eVar.f88794y = abstractC22562b;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22565e c22565e = (C22565e) this.f88793x;
            AbstractC22562b abstractC22562b = (AbstractC22562b) this.f88794y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88792w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC22562b instanceof AbstractC22562b.b) {
                return new C22565e(AbstractC22564d.a.f88795a, c22565e.getCalendarAccumulatedList());
            }
            if (abstractC22562b instanceof AbstractC22562b.a) {
                return new C22565e(c22565e.getDomainResult(), c22565e.getCalendarAccumulatedList());
            }
            if (!(abstractC22562b instanceof AbstractC22562b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC22562b.c cVar = (AbstractC22562b.c) abstractC22562b;
            CalendarResponse response = cVar.getResponse();
            if (response == null) {
                return new C22565e(AbstractC22564d.b.f88796a, c22565e.getCalendarAccumulatedList());
            }
            Map<EnumC14603g, Map<Integer, CalendarResponse>> mapM65297b = c22565e.getCalendarAccumulatedList().m65297b();
            EnumC14603g enumC14603g = EnumC14603g.OVERVIEW;
            Map<Integer, CalendarResponse> map = mapM65297b.get(enumC14603g);
            return new C22565e(AbstractC22564d.b.f88796a, c22565e.getCalendarAccumulatedList().m65296a(AbstractC25247g0.m73996e0(c22565e.getCalendarAccumulatedList().m65297b(), new C23465k(enumC14603g, map != null ? AbstractC25247g0.m73996e0(map, new C23465k(new Integer(cVar.getMonthOffsetIndex()), response)) : C25272z.f99163w)), cVar.getMonthOffsetIndex()));
        }
    }

    public C22563c(HomeApi homeApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(homeApi, "homeApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.homeApi = homeApi;
        this.logger = logger;
        this.initialAcc = new C22565e(AbstractC22564d.a.f88795a, new C22561a(null, 0, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m65302d(AbstractC18636m.a aVar, InterfaceC30057d<? super CalendarResponse> interfaceC30057d) {
        a aVar2;
        if (interfaceC30057d instanceof a) {
            aVar2 = (a) interfaceC30057d;
            int i13 = aVar2.f88768E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar2.f88768E = i13 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(interfaceC30057d);
            }
        } else {
            aVar2 = new a(interfaceC30057d);
        }
        Object homeCalendar = aVar2.f88771y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f88768E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(homeCalendar);
                String strM65303e = m65303e(aVar.getMonthOffset(), aVar.getRequestDate());
                HomeApi homeApi = this.homeApi;
                String string = aVar.getPillarType().toString();
                aVar2.f88769w = null;
                aVar2.f88770x = null;
                aVar2.f88768E = 1;
                homeCalendar = homeApi.getHomeCalendar(string, strM65303e, aVar2);
                if (homeCalendar == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(homeCalendar);
            }
            return (CalendarResponse) homeCalendar;
        } catch (Exception e5) {
            AbstractC36685b.m117760b(e5, null, this.logger, null, 10, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private final String m65303e(int monthOffset, LocalDate requestDate) {
        String str = requestDate.minusMonths(monthOffset).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        AbstractC22676k.m65749i(str, "format(...)");
        return str;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(this.initialAcc, AbstractC13091v.m36590P(new b(upstream), new c(null, this)), new e(null));
    }
}
