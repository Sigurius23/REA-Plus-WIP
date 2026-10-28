package td1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q92.C30076h;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: td1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Ltd1/g;", "", "Ltd1/b;", "whoopStrapProxy", "Lq92/h;", "whoopStrapSharedPrefs", "Lbc3/c0;", "coroutineScope", "<init>", "(Ltd1/b;Lq92/h;Lbc3/c0;)V", "Lec3/l;", "Ltd1/f;", "a", "Lec3/l;", "()Lec3/l;", "whoopStrapStatusFlow", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33709g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13058l whoopStrapStatusFlow;

    /* JADX INFO: renamed from: td1.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f140920a;

        static {
            int[] iArr = new int[EnumC33708f.values().length];
            try {
                iArr[EnumC33708f.CONNECTION_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33708f.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f140920a = iArr;
        }
    }

    /* JADX INFO: renamed from: td1.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.domain.strap.WhoopStrapStatusFlowWrapper$special$$inlined$transform$1", m100430f = "WhoopStrapStatusFlowWrapper.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f140921w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f140922x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f140923y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C30076h f140924z;

        /* JADX INFO: renamed from: td1.g$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140925w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30076h f140926x;

            /* JADX INFO: renamed from: td1.g$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.domain.strap.WhoopStrapStatusFlowWrapper$special$$inlined$transform$1$1", m100430f = "WhoopStrapStatusFlowWrapper.kt", m100431l = {40, 42, 44, 46}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42374a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f140927E;

                /* JADX INFO: renamed from: F */
                Object f140928F;

                /* JADX INFO: renamed from: G */
                Object f140929G;

                /* JADX INFO: renamed from: H */
                int f140930H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140931w;

                /* JADX INFO: renamed from: x */
                int f140932x;

                /* JADX INFO: renamed from: z */
                Object f140934z;

                public C42374a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140931w = obj;
                    this.f140932x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C30076h c30076h) {
                this.f140926x = c30076h;
                this.f140925w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
            
                if (r12.emit(r11, r0) == r1) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
            
                if (r12.emit(r11, r0) == r1) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00c5, code lost:
            
                if (r12.emit(r11, r0) == r1) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
            
                if (r12.emit(r11, r0) == r1) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
            
                return r1;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r11, q83.InterfaceC30057d<? super l83.C23454a0> r12) {
                /*
                    Method dump skipped, instruction units count: 228
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: td1.C33709g.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C30076h c30076h) {
            super(2, interfaceC30057d);
            this.f140923y = interfaceC13058l;
            this.f140924z = c30076h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f140923y, interfaceC30057d, this.f140924z);
            bVar.f140922x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140921w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f140922x;
                InterfaceC13058l interfaceC13058l = this.f140923y;
                a aVar = new a(interfaceC13062m, this.f140924z);
                this.f140922x = null;
                this.f140921w = 1;
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

    /* JADX INFO: renamed from: td1.g$c */
    @InterfaceC32271e(m100429c = "com.whoop.domain.strap.WhoopStrapStatusFlowWrapper$special$$inlined$transform$2", m100430f = "WhoopStrapStatusFlowWrapper.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f140935w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f140936x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f140937y;

        /* JADX INFO: renamed from: td1.g$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140938w;

            /* JADX INFO: renamed from: td1.g$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.domain.strap.WhoopStrapStatusFlowWrapper$special$$inlined$transform$2$1", m100430f = "WhoopStrapStatusFlowWrapper.kt", m100431l = {42, 43, 44, 46}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42375a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f140939E;

                /* JADX INFO: renamed from: F */
                Object f140940F;

                /* JADX INFO: renamed from: G */
                Object f140941G;

                /* JADX INFO: renamed from: H */
                int f140942H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140943w;

                /* JADX INFO: renamed from: x */
                int f140944x;

                /* JADX INFO: renamed from: z */
                Object f140946z;

                public C42375a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140943w = obj;
                    this.f140944x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f140938w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x00bb A[PHI: r2 r10
              0x00bb: PHI (r2v5 ec3.m) = (r2v4 ec3.m), (r2v9 ec3.m) binds: [B:30:0x00b8, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
              0x00bb: PHI (r10v6 int) = (r10v5 int), (r10v10 int) binds: [B:30:0x00b8, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
            
                if (r11.emit(r10, r0) == r1) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L34;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
                /*
                    Method dump skipped, instruction units count: 211
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: td1.C33709g.c.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f140937y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f140937y, interfaceC30057d);
            cVar.f140936x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140935w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f140936x;
                InterfaceC13058l interfaceC13058l = this.f140937y;
                a aVar = new a(interfaceC13062m);
                this.f140936x = null;
                this.f140935w = 1;
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

    /* JADX INFO: renamed from: td1.g$d */
    @InterfaceC32271e(m100429c = "com.whoop.domain.strap.WhoopStrapStatusFlowWrapper$whoopStrapStatusFlow$2", m100430f = "WhoopStrapStatusFlowWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ltd1/f;", "accumulator", "value", "<anonymous>", "(Ltd1/f;Ltd1/f;)Ltd1/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f140947w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f140948x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f140949y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(EnumC33708f enumC33708f, EnumC33708f enumC33708f2, InterfaceC30057d<? super EnumC33708f> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f140948x = enumC33708f;
            dVar.f140949y = enumC33708f2;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC33708f enumC33708f;
            EnumC33708f enumC33708f2 = (EnumC33708f) this.f140948x;
            EnumC33708f enumC33708f3 = (EnumC33708f) this.f140949y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f140947w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return (enumC33708f3 == EnumC33708f.PAIR_DEVICE || enumC33708f3 == (enumC33708f = EnumC33708f.CONNECTING) || (enumC33708f2 == enumC33708f && enumC33708f3 == EnumC33708f.CONNECTED) || (enumC33708f2 == enumC33708f && enumC33708f3 == EnumC33708f.CONNECTION_FAILED)) ? enumC33708f3 : EnumC33708f.NA;
        }
    }

    public C33709g(InterfaceC33704b whoopStrapProxy, C30076h whoopStrapSharedPrefs, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.whoopStrapStatusFlow = AbstractC13091v.m36586L(new C13084s1(new c(new C13060l1(EnumC33708f.NA, new C13084s1(new b(whoopStrapProxy.mo106503r(), null, whoopStrapSharedPrefs)), new d(null)), null)), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC13058l getWhoopStrapStatusFlow() {
        return this.whoopStrapStatusFlow;
    }
}
