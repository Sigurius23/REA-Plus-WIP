package t72;

import c93.InterfaceC4351m;
import com.whoop.sanguine.domain.SanguineApi;
import com.whoop.sanguine.domain.models.SanguineWaitlistResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: t72.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lt72/f;", "Lod1/g;", "Lt72/d;", "Lt72/e;", "Lcom/whoop/sanguine/domain/SanguineApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/sanguine/domain/SanguineApi;Ltr2/n;)V", "f", "(Lq83/d;)Ljava/lang/Object;", "g", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/sanguine/domain/SanguineApi;", "b", "Ltr2/n;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33587f implements InterfaceC27844g<InterfaceC33585d, InterfaceC33586e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SanguineApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: t72.f$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.domain.SanguineWaitlistInteractor", m100430f = "SanguineWaitlistInteractor.kt", m100431l = {35}, m100432m = "executeJoinWaitlistOperation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f140137w;

        /* JADX INFO: renamed from: y */
        int f140139y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f140137w = obj;
            this.f140139y |= Integer.MIN_VALUE;
            return C33587f.this.m106085f(this);
        }
    }

    /* JADX INFO: renamed from: t72.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.domain.SanguineWaitlistInteractor$executeJoinWaitlistOperation$response$1", m100430f = "SanguineWaitlistInteractor.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f140140w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C33587f.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140140w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SanguineApi sanguineApi = C33587f.this.api;
            this.f140140w = 1;
            Object objJoinSanguineWaitlist = sanguineApi.joinSanguineWaitlist(this);
            return objJoinSanguineWaitlist == enumC31071a ? enumC31071a : objJoinSanguineWaitlist;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SanguineWaitlistResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: t72.f$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.domain.SanguineWaitlistInteractor", m100430f = "SanguineWaitlistInteractor.kt", m100431l = {45}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f140142w;

        /* JADX INFO: renamed from: y */
        int f140144y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f140142w = obj;
            this.f140144y |= Integer.MIN_VALUE;
            return C33587f.this.m106086g(this);
        }
    }

    /* JADX INFO: renamed from: t72.f$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.domain.SanguineWaitlistInteractor$fetchData$response$1", m100430f = "SanguineWaitlistInteractor.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f140145w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C33587f.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140145w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SanguineApi sanguineApi = C33587f.this.api;
            this.f140145w = 1;
            Object sanguineWaitlistRequest = sanguineApi.getSanguineWaitlistRequest(this);
            return sanguineWaitlistRequest == enumC31071a ? enumC31071a : sanguineWaitlistRequest;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SanguineWaitlistResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: t72.f$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.domain.SanguineWaitlistInteractor$interact$$inlined$flatMapLatest$1", m100430f = "SanguineWaitlistInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f140147w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f140148x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f140149y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C33587f f140150z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C33587f c33587f) {
            super(3, interfaceC30057d);
            this.f140150z = c33587f;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC33586e interfaceC33586e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f140150z);
            eVar.f140148x = interfaceC13062m;
            eVar.f140149y = interfaceC33586e;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140147w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f140148x;
                InterfaceC33586e interfaceC33586e = (InterfaceC33586e) this.f140149y;
                InterfaceC13058l c13084s1 = interfaceC33586e instanceof InterfaceC33586e.e ? new C13084s1(this.f140150z.new g(null)) : new C0456u(interfaceC33586e, 1);
                this.f140148x = null;
                this.f140149y = null;
                this.f140147w = 1;
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
            return invoke((InterfaceC13062m) obj, (InterfaceC33586e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: t72.f$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.domain.SanguineWaitlistInteractor$interact$$inlined$transform$1", m100430f = "SanguineWaitlistInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f140151w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f140152x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f140153y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C33587f f140154z;

        /* JADX INFO: renamed from: t72.f$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140155w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33587f f140156x;

            /* JADX INFO: renamed from: t72.f$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sanguine.domain.SanguineWaitlistInteractor$interact$$inlined$transform$1$1", m100430f = "SanguineWaitlistInteractor.kt", m100431l = {40, 40, 41, 42}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42364a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f140157E;

                /* JADX INFO: renamed from: F */
                Object f140158F;

                /* JADX INFO: renamed from: G */
                Object f140159G;

                /* JADX INFO: renamed from: H */
                Object f140160H;

                /* JADX INFO: renamed from: I */
                int f140161I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140162w;

                /* JADX INFO: renamed from: x */
                int f140163x;

                /* JADX INFO: renamed from: z */
                Object f140165z;

                public C42364a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140162w = obj;
                    this.f140163x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33587f c33587f) {
                this.f140156x = c33587f;
                this.f140155w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
            
                if (r2.emit(r10, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
            
                if (r2.emit(r10, r0) == r1) goto L37;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
                /*
                    Method dump skipped, instruction units count: 209
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t72.C33587f.f.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C33587f c33587f) {
            super(2, interfaceC30057d);
            this.f140153y = interfaceC13058l;
            this.f140154z = c33587f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f140153y, interfaceC30057d, this.f140154z);
            fVar.f140152x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140151w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f140152x;
                InterfaceC13058l interfaceC13058l = this.f140153y;
                a aVar = new a(interfaceC13062m, this.f140154z);
                this.f140152x = null;
                this.f140151w = 1;
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

    /* JADX INFO: renamed from: t72.f$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.domain.SanguineWaitlistInteractor$interact$2$1", m100430f = "SanguineWaitlistInteractor.kt", m100431l = {27, 28, 28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lt72/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f140166w;

        /* JADX INFO: renamed from: x */
        int f140167x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f140168y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C33587f.this.new g(interfaceC30057d);
            gVar.f140168y = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f140168y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f140167x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r8)
                goto L58
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f140166w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L4b
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3c
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                t72.e$e r8 = t72.InterfaceC33586e.e.f140133a
                r7.f140168y = r0
                r7.f140167x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L3c
                goto L57
            L3c:
                t72.f r8 = t72.C33587f.this
                r7.f140168y = r6
                r7.f140166w = r0
                r7.f140167x = r4
                java.lang.Object r8 = t72.C33587f.m106082c(r8, r7)
                if (r8 != r1) goto L4b
                goto L57
            L4b:
                r7.f140168y = r6
                r7.f140166w = r6
                r7.f140167x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L58
            L57:
                return r1
            L58:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: t72.C33587f.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C33587f(SanguineApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m106085f(InterfaceC30057d<? super InterfaceC33586e> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f140139y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f140139y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f140137w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f140139y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f140139y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC33586e.d((SanguineWaitlistResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC33586e.b.f140130a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m106086g(InterfaceC30057d<? super InterfaceC33586e> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f140144y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f140144y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f140142w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f140144y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(null);
            cVar2.f140144y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, dVar, cVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC33586e.f((SanguineWaitlistResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC33586e.a.f140129a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(new C13084s1(new f(upstream, null, this)), new e(null, this));
    }

    public /* synthetic */ C33587f(SanguineApi sanguineApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(sanguineApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SanguineWaitlistInteractor") : interfaceC34116n);
    }
}
