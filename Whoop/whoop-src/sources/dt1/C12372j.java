package dt1;

import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.time.Instant;
import java.util.List;
import l83.C23454a0;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qk1.C30443a;
import qk1.InterfaceC30444b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: dt1.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Ldt1/j;", "", "Lqk1/b;", "dao", "Ldt1/f;", "mapper", "<init>", "(Lqk1/b;Ldt1/f;)V", "Ldt1/a;", "dialogState", "Lec3/l;", "Ldt1/c;", "d", "(Ldt1/a;)Lec3/l;", "Ljava/time/Instant;", "timestamp", "c", "(Ljava/time/Instant;)Lec3/l;", "", "id", "", "symptoms", "notes", "f", "(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)Lec3/l;", "Ldt1/g;", "upstream", "e", "(Ldt1/g;)Lec3/l;", "a", "Lqk1/b;", "b", "Ldt1/f;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12372j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC30444b dao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12368f mapper;

    /* JADX INFO: renamed from: dt1.j$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsLocalInteractor$deleteLocal$1", m100430f = "LabradorDetailsLocalInteractor.kt", m100431l = {73, 74, 76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldt1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Instant f41779E;

        /* JADX INFO: renamed from: w */
        Object f41780w;

        /* JADX INFO: renamed from: x */
        int f41781x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f41782y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Instant instant, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41779E = instant;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C12372j.this.new a(this.f41779E, interfaceC30057d);
            aVar.f41782y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L22;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f41782y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f41781x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 == r5) goto L27
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                java.lang.Object r0 = r8.f41780w
                java.lang.Exception r0 = (java.lang.Exception) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L67
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Exception -> L52
                goto L67
            L27:
                p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Exception -> L52
                goto L45
            L2b:
                p505ts.AbstractC34132o.m107864I(r9)
                dt1.j r9 = dt1.C12372j.this     // Catch: java.lang.Exception -> L52
                qk1.b r9 = dt1.C12372j.m34702a(r9)     // Catch: java.lang.Exception -> L52
                java.time.Instant r2 = r8.f41779E     // Catch: java.lang.Exception -> L52
                long r6 = r2.toEpochMilli()     // Catch: java.lang.Exception -> L52
                r8.f41782y = r0     // Catch: java.lang.Exception -> L52
                r8.f41781x = r5     // Catch: java.lang.Exception -> L52
                java.lang.Object r9 = r9.mo93127c(r6, r8)     // Catch: java.lang.Exception -> L52
                if (r9 != r1) goto L45
                goto L66
            L45:
                dt1.c$b r9 = dt1.InterfaceC12365c.b.f41570a     // Catch: java.lang.Exception -> L52
                r8.f41782y = r0     // Catch: java.lang.Exception -> L52
                r8.f41781x = r4     // Catch: java.lang.Exception -> L52
                java.lang.Object r9 = r0.emit(r9, r8)     // Catch: java.lang.Exception -> L52
                if (r9 != r1) goto L67
                goto L66
            L52:
                dt1.c$a r9 = new dt1.c$a
                java.time.Instant r2 = r8.f41779E
                r9.<init>(r2)
                r2 = 0
                r8.f41782y = r2
                r8.f41780w = r2
                r8.f41781x = r3
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L67
            L66:
                return r1
            L67:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: dt1.C12372j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dt1.j$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsLocalInteractor$deleteLocal$2", m100430f = "LabradorDetailsLocalInteractor.kt", m100431l = {79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldt1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41784w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f41785x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Instant f41786y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Instant instant, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41786y = instant;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f41786y, interfaceC30057d);
            bVar.f41785x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f41785x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41784w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC12365c.c cVar = new InterfaceC12365c.c(this.f41786y);
                this.f41785x = null;
                this.f41784w = 1;
                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dt1.j$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsLocalInteractor$getLatestReading$1", m100430f = "LabradorDetailsLocalInteractor.kt", m100431l = {56, 58, 65}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldt1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C12363a f41788F;

        /* JADX INFO: renamed from: w */
        Object f41789w;

        /* JADX INFO: renamed from: x */
        Object f41790x;

        /* JADX INFO: renamed from: y */
        int f41791y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f41792z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C12363a c12363a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41788F = c12363a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C12372j.this.new c(this.f41788F, interfaceC30057d);
            cVar.f41792z = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        
            if (r0.emit(r5, r7) == r1) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f41792z
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f41791y
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                java.lang.Object r0 = r7.f41790x
                dt1.a r0 = (dt1.C12363a) r0
                goto L20
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f41789w
                qk1.a r0 = (qk1.C30443a) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L82
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L40
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                dt1.j r8 = dt1.C12372j.this
                qk1.b r8 = dt1.C12372j.m34702a(r8)
                r7.f41792z = r0
                r7.f41791y = r5
                java.lang.Object r8 = r8.mo93126b(r7)
                if (r8 != r1) goto L40
                goto L81
            L40:
                qk1.a r8 = (qk1.C30443a) r8
                r2 = 0
                if (r8 != 0) goto L54
                dt1.c$f r8 = dt1.InterfaceC12365c.f.f41574a
                r7.f41792z = r2
                r7.f41789w = r2
                r7.f41791y = r4
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L82
                goto L81
            L54:
                dt1.a r4 = r7.f41788F
                if (r4 == 0) goto L6d
                dt1.a r4 = new dt1.a
                long r5 = r8.getTimestamp()
                java.time.Instant r5 = java.time.Instant.ofEpochMilli(r5)
                java.lang.String r6 = "ofEpochMilli(...)"
                p715kotlin.jvm.internal.AbstractC22676k.m65749i(r5, r6)
                java.lang.String r6 = ""
                r4.<init>(r6, r5)
                goto L6e
            L6d:
                r4 = r2
            L6e:
                dt1.c$k r5 = new dt1.c$k
                r5.<init>(r8, r4)
                r7.f41792z = r2
                r7.f41789w = r2
                r7.f41790x = r2
                r7.f41791y = r3
                java.lang.Object r8 = r0.emit(r5, r7)
                if (r8 != r1) goto L82
            L81:
                return r1
            L82:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: dt1.C12372j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dt1.j$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41793w;

        /* JADX INFO: renamed from: dt1.j$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41794w;

            /* JADX INFO: renamed from: dt1.j$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsLocalInteractor$interact$$inlined$map$1$2", m100430f = "LabradorDetailsLocalInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41493a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41795E;

                /* JADX INFO: renamed from: F */
                Object f41796F;

                /* JADX INFO: renamed from: G */
                Object f41797G;

                /* JADX INFO: renamed from: H */
                int f41798H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41799w;

                /* JADX INFO: renamed from: x */
                int f41800x;

                /* JADX INFO: renamed from: y */
                Object f41801y;

                public C41493a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41799w = obj;
                    this.f41800x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f41794w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41493a c41493a;
                if (interfaceC30057d instanceof C41493a) {
                    c41493a = (C41493a) interfaceC30057d;
                    int i13 = c41493a.f41800x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41493a.f41800x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41493a = new C41493a(interfaceC30057d);
                    }
                } else {
                    c41493a = new C41493a(interfaceC30057d);
                }
                Object obj2 = c41493a.f41799w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41493a.f41800x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41794w;
                    InterfaceC12369g state = ((C12373k) obj).getState();
                    c41493a.f41801y = null;
                    c41493a.f41795E = null;
                    c41493a.f41796F = null;
                    c41493a.f41797G = null;
                    c41493a.f41798H = 0;
                    c41493a.f41800x = 1;
                    if (interfaceC13062m.emit(state, c41493a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f41793w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41793w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dt1.j$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsLocalInteractor$interact$1", m100430f = "LabradorDetailsLocalInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ldt1/k;", "internalState", "Ldt1/c;", "internalEvent", "<anonymous>", "(Ldt1/k;Ldt1/c;)Ldt1/k;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f41803w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f41804x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f41805y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12373k c12373k, InterfaceC12365c interfaceC12365c, InterfaceC30057d<? super C12373k> interfaceC30057d) {
            e eVar = C12372j.this.new e(interfaceC30057d);
            eVar.f41804x = c12373k;
            eVar.f41805y = interfaceC12365c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C12373k c12373k = (C12373k) this.f41804x;
            InterfaceC12365c interfaceC12365c = (InterfaceC12365c) this.f41805y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f41803w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(interfaceC12365c, InterfaceC12365c.g.f41575a)) {
                return C12373k.m34709b(c12373k, InterfaceC12369g.h.f41613a, null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(interfaceC12365c, InterfaceC12365c.f.f41574a)) {
                return C12373k.m34709b(c12373k, new InterfaceC12369g.d(null, 1, null), null, null, 6, null);
            }
            if (interfaceC12365c instanceof InterfaceC12365c.k) {
                InterfaceC12365c.k kVar = (InterfaceC12365c.k) interfaceC12365c;
                return C12373k.m34709b(c12373k, new InterfaceC12369g.g(C12372j.this.mapper.m34653a(kVar.getResponse()), kVar.getDialogState(), null, false, 12, null), null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(interfaceC12365c, InterfaceC12365c.j.f41577a)) {
                return C12373k.m34709b(c12373k, InterfaceC12369g.j.f41615a, null, null, 6, null);
            }
            if (interfaceC12365c instanceof InterfaceC12365c.l) {
                InterfaceC12365c.l lVar = (InterfaceC12365c.l) interfaceC12365c;
                return C12373k.m34709b(c12373k, new InterfaceC12369g.k(lVar.getId(), lVar.getTimestamp(), lVar.m34642c(), lVar.getNotes()), null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(interfaceC12365c, InterfaceC12365c.i.f41576a)) {
                return C12373k.m34709b(c12373k, InterfaceC12369g.i.f41614a, null, null, 2, null);
            }
            if (interfaceC12365c instanceof InterfaceC12365c.a) {
                return C12373k.m34709b(c12373k, new InterfaceC12369g.a(((InterfaceC12365c.a) interfaceC12365c).getTimestamp()), null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(interfaceC12365c, InterfaceC12365c.b.f41570a)) {
                return C12373k.m34709b(c12373k, InterfaceC12369g.b.f41604a, null, null, 2, null);
            }
            if (interfaceC12365c instanceof InterfaceC12365c.c) {
                return C12373k.m34709b(c12373k, new InterfaceC12369g.c(((InterfaceC12365c.c) interfaceC12365c).getTimestamp()), null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(interfaceC12365c, InterfaceC12365c.e.f41573a)) {
                return C12373k.m34709b(c12373k, InterfaceC12369g.f.f41608a, null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(interfaceC12365c, InterfaceC12365c.d.f41572a)) {
                return C12373k.m34709b(c12373k, InterfaceC12369g.e.f41607a, null, null, 6, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: dt1.j$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsLocalInteractor$updateSymptomsAndNotes$1", m100430f = "LabradorDetailsLocalInteractor.kt", m100431l = {86, 88, 90, 91, 92, 95}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldt1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Instant f41807E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ List<String> f41808F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f41809G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f41810H;

        /* JADX INFO: renamed from: w */
        Object f41811w;

        /* JADX INFO: renamed from: x */
        int f41812x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f41813y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Instant instant, List<String> list, String str, String str2, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41807E = instant;
            this.f41808F = list;
            this.f41809G = str;
            this.f41810H = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C12372j.this.new f(this.f41807E, this.f41808F, this.f41809G, this.f41810H, interfaceC30057d);
            fVar.f41813y = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x006d A[Catch: Exception -> 0x00c1, TryCatch #1 {Exception -> 0x00c1, blocks: (B:39:0x00ae, B:36:0x0098, B:27:0x0069, B:29:0x006d, B:32:0x0087, B:24:0x0061), top: B:50:0x0061 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x0086  */
        /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: Exception -> 0x00c1, TryCatch #1 {Exception -> 0x00c1, blocks: (B:39:0x00ae, B:36:0x0098, B:27:0x0069, B:29:0x006d, B:32:0x0087, B:24:0x0061), top: B:50:0x0061 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0096  */
        /* JADX WARN: Code duplicated, block: B:35:0x0097  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ae A[Catch: Exception -> 0x00c1, PHI: r2 r11
          0x00ae: PHI (r2v12 qk1.a) = (r2v9 qk1.a), (r2v15 qk1.a) binds: [B:37:0x00ab, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]
          0x00ae: PHI (r11v9 dt1.j$f) = (r11v5 dt1.j$f), (r11v10 dt1.j$f) binds: [B:37:0x00ab, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x00c1, blocks: (B:39:0x00ae, B:36:0x0098, B:27:0x0069, B:29:0x006d, B:32:0x0087, B:24:0x0061), top: B:50:0x0061 }] */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d9, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L44;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dt1.C12372j.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dt1.j$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsLocalInteractor$updateSymptomsAndNotes$2", m100430f = "LabradorDetailsLocalInteractor.kt", m100431l = {98}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldt1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41815w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f41816x;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f41816x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f41816x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41815w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC12365c.j jVar = InterfaceC12365c.j.f41577a;
                this.f41816x = null;
                this.f41815w = 1;
                if (interfaceC13062m.emit(jVar, this) == enumC31071a) {
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

    public C12372j(InterfaceC30444b dao, C12368f mapper) {
        AbstractC22676k.m65750j(dao, "dao");
        AbstractC22676k.m65750j(mapper, "mapper");
        this.dao = dao;
        this.mapper = mapper;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC13058l m34704c(Instant timestamp) {
        return new C13015a0(new b(timestamp, null), new C13084s1(new a(timestamp, null)));
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC13058l m34705d(C12363a dialogState) {
        return new C13084s1(new c(dialogState, null));
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC13058l m34706f(String id4, Instant timestamp, List<String> symptoms, String notes) {
        return new C13015a0(new g(null), new C13084s1(new f(timestamp, symptoms, notes, id4, null)));
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m34707e(InterfaceC12369g upstream) {
        C0456u c0456u;
        InterfaceC13058l interfaceC13058lM34704c;
        AbstractC22676k.m65750j(upstream, "upstream");
        if (upstream instanceof InterfaceC12369g.d) {
            interfaceC13058lM34704c = m34705d(((InterfaceC12369g.d) upstream).getDialogState());
        } else if (upstream instanceof InterfaceC12369g.k) {
            InterfaceC12369g.k kVar = (InterfaceC12369g.k) upstream;
            interfaceC13058lM34704c = m34706f(kVar.getId(), kVar.getTimestamp(), kVar.m34665c(), kVar.getNotes());
        } else {
            if (upstream.equals(InterfaceC12369g.h.f41613a)) {
                c0456u = new C0456u(InterfaceC12365c.g.f41575a, 1);
            } else if (upstream.equals(InterfaceC12369g.j.f41615a)) {
                c0456u = new C0456u(InterfaceC12365c.j.f41577a, 1);
            } else if (upstream.equals(InterfaceC12369g.i.f41614a)) {
                c0456u = new C0456u(InterfaceC12365c.i.f41576a, 1);
            } else if (upstream instanceof InterfaceC12369g.g) {
                interfaceC13058lM34704c = m34705d(((InterfaceC12369g.g) upstream).getDialogState());
            } else if (upstream instanceof InterfaceC12369g.a) {
                interfaceC13058lM34704c = m34704c(((InterfaceC12369g.a) upstream).getTimestamp());
            } else if (upstream.equals(InterfaceC12369g.b.f41604a)) {
                c0456u = new C0456u(InterfaceC12365c.b.f41570a, 1);
            } else if (upstream instanceof InterfaceC12369g.c) {
                interfaceC13058lM34704c = m34704c(((InterfaceC12369g.c) upstream).getTimestamp());
            } else if (upstream.equals(InterfaceC12369g.f.f41608a)) {
                c0456u = new C0456u(InterfaceC12365c.e.f41573a, 1);
            } else {
                if (!upstream.equals(InterfaceC12369g.e.f41607a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0456u = new C0456u(InterfaceC12365c.d.f41572a, 1);
            }
            interfaceC13058lM34704c = c0456u;
        }
        return new d(AbstractC13091v.m36612v(new C13060l1(new C12373k(InterfaceC12369g.h.f41613a, new C30443a(0.0f, 0, null, 0L, null, null, false, false, null, null, null, 2047, null), null, 4, null), interfaceC13058lM34704c, new e(null)), 1));
    }
}
