package vg0;

import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.AiPreambleLoadingIndicatorDelay;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import j93.InterfaceC21461d;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tg0.C33778c;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: vg0.b0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lvg0/b0;", "Lod1/g;", "Ltg0/c;", "Ljs0/c;", "configurationRepository", "<init>", "(Ljs0/c;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Ljs0/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35978b0 implements InterfaceC27844g<C33778c, C33778c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: vg0.b0$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.LoadingDebounceInteractor$interact$1", m100430f = "LoadingDebounceInteractor.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Ltg0/c;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f153244E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f153245F;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC13058l f153247H;

        /* JADX INFO: renamed from: w */
        Object f153248w;

        /* JADX INFO: renamed from: x */
        Object f153249x;

        /* JADX INFO: renamed from: y */
        Object f153250y;

        /* JADX INFO: renamed from: z */
        long f153251z;

        /* JADX INFO: renamed from: vg0.b0$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42533a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ long f153252E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f153253w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22669g0 f153254x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C22659b0 f153255y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC11936u f153256z;

            /* JADX INFO: renamed from: vg0.b0$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.LoadingDebounceInteractor$interact$1$1$1", m100430f = "LoadingDebounceInteractor.kt", m100431l = {40, 42}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C42534a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: E */
                final /* synthetic */ C22659b0 f153257E;

                /* JADX INFO: renamed from: F */
                final /* synthetic */ C22669g0 f153258F;

                /* JADX INFO: renamed from: G */
                final /* synthetic */ InterfaceC11936u f153259G;

                /* JADX INFO: renamed from: w */
                Object f153260w;

                /* JADX INFO: renamed from: x */
                int f153261x;

                /* JADX INFO: renamed from: y */
                int f153262y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ long f153263z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C42534a(long j7, C22659b0 c22659b0, C22669g0 c22669g0, InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C42534a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f153263z = j7;
                    this.f153257E = c22659b0;
                    this.f153258F = c22669g0;
                    this.f153259G = interfaceC11936u;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C42534a(this.f153263z, this.f153257E, this.f153258F, this.f153259G, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C42534a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
                
                    if (((dc3.C11935t) r1).f39041z.mo32219t(r7, r6) == r0) goto L17;
                 */
                @Override // s83.AbstractC32267a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        r83.a r0 = r83.EnumC31071a.f128113w
                        int r1 = r6.f153262y
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L20
                        if (r1 == r3) goto L1c
                        if (r1 != r2) goto L14
                        java.lang.Object r0 = r6.f153260w
                        tg0.c r0 = (tg0.C33778c) r0
                        p505ts.AbstractC34132o.m107864I(r7)
                        goto L53
                    L14:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1c:
                        p505ts.AbstractC34132o.m107864I(r7)
                        goto L2e
                    L20:
                        p505ts.AbstractC34132o.m107864I(r7)
                        long r4 = r6.f153263z
                        r6.f153262y = r3
                        java.lang.Object r7 = bc3.AbstractC3034m0.m8782b(r4, r6)
                        if (r7 != r0) goto L2e
                        goto L52
                    L2e:
                        kotlin.jvm.internal.b0 r7 = r6.f153257E
                        r7.f89329w = r3
                        kotlin.jvm.internal.g0 r7 = r6.f153258F
                        java.lang.Object r7 = r7.f89336w
                        tg0.c r7 = (tg0.C33778c) r7
                        if (r7 == 0) goto L53
                        dc3.u r1 = r6.f153259G
                        tg0.c r7 = vg0.AbstractC35981c0.m114258a(r7, r3)
                        r3 = 0
                        r6.f153260w = r3
                        r3 = 0
                        r6.f153261x = r3
                        r6.f153262y = r2
                        dc3.t r1 = (dc3.C11935t) r1
                        dc3.h r1 = r1.f39041z
                        java.lang.Object r7 = r1.mo32219t(r7, r6)
                        if (r7 != r0) goto L53
                    L52:
                        return r0
                    L53:
                        l83.a0 r7 = l83.C23454a0.f92919a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: vg0.C35978b0.a.C42533a.C42534a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: vg0.b0$a$a$b */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.LoadingDebounceInteractor$interact$1$1", m100430f = "LoadingDebounceInteractor.kt", m100431l = {30, 33, 35, 38}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class b extends AbstractC32269c {

                /* JADX INFO: renamed from: w */
                Object f153264w;

                /* JADX INFO: renamed from: x */
                /* synthetic */ Object f153265x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ C42533a<T> f153266y;

                /* JADX INFO: renamed from: z */
                int f153267z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C42533a<? super T> c42533a, InterfaceC30057d<? super b> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f153266y = c42533a;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f153265x = obj;
                    this.f153267z |= Integer.MIN_VALUE;
                    return this.f153266y.emit(null, this);
                }
            }

            public C42533a(C22669g0 c22669g0, C22669g0 c22669g1, C22659b0 c22659b0, InterfaceC11936u interfaceC11936u, long j7) {
                this.f153253w = c22669g0;
                this.f153254x = c22669g1;
                this.f153255y = c22659b0;
                this.f153256z = interfaceC11936u;
                this.f153252E = j7;
            }

            /* JADX WARN: Code duplicated, block: B:41:0x00ce A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:44:0x00e3 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
            
                if (((dc3.C11935t) r2).f39041z.mo32219t(r1, r3) == r4) goto L44;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(tg0.C33778c r20, q83.InterfaceC30057d<? super l83.C23454a0> r21) {
                /*
                    Method dump skipped, instruction units count: 256
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vg0.C35978b0.a.C42533a.emit(tg0.c, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC13058l interfaceC13058l, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153247H = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C35978b0.this.new a(this.f153247H, interfaceC30057d);
            aVar.f153245F = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0061  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM125868N0;
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f153245F;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153244E;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC21909c abstractC21909c = C35978b0.this.configurationRepository;
                AiPreambleLoadingIndicatorDelay aiPreambleLoadingIndicatorDelay = AiPreambleLoadingIndicatorDelay.INSTANCE;
                C21908b configurations = abstractC21909c.getConfigurations();
                String name = aiPreambleLoadingIndicatorDelay.getName();
                Object defaultValue = aiPreambleLoadingIndicatorDelay.getDefaultValue();
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
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
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
                long jLongValue = ((Long) defaultValue).longValue();
                C22669g0 c22669g0 = new C22669g0();
                C22659b0 c22659b0 = new C22659b0();
                C22669g0 c22669g1 = new C22669g0();
                InterfaceC13058l interfaceC13058l = this.f153247H;
                C42533a c42533a = new C42533a(c22669g1, c22669g0, c22659b0, interfaceC11936u, jLongValue);
                this.f153245F = null;
                this.f153248w = null;
                this.f153249x = null;
                this.f153250y = null;
                this.f153251z = jLongValue;
                this.f153244E = 1;
                if (interfaceC13058l.collect(c42533a, this) == enumC31071a) {
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

    public C35978b0(AbstractC21909c configurationRepository) {
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        this.configurationRepository = configurationRepository;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36602l(new a(upstream, null));
    }
}
