package el1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13084s1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: el1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lel1/b;", "", "Ltr2/n;", "logger", "Lbc3/c0;", "coroutineScope", "Lci2/b;", "whoopStrapProvider", "<init>", "(Ltr2/n;Lbc3/c0;Lci2/b;)V", "a", "Ltr2/n;", "Lec3/l;", "Lel1/a;", "b", "Lec3/l;", "()Lec3/l;", "historySyncStatus", "Lec3/t1;", "c", "Lec3/t1;", "()Lec3/t1;", "historySyncStatusFlow", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13319b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13058l historySyncStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13087t1 historySyncStatusFlow;

    /* JADX INFO: renamed from: el1.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.history.HistorySyncStatusHook$historySyncStatus$3", m100430f = "HistorySyncStatusHook.kt", m100431l = {47}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lel1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46128w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46129x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f46129x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46129x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46128w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                EnumC13318a enumC13318a = EnumC13318a.NONE;
                this.f46129x = null;
                this.f46128w = 1;
                if (interfaceC13062m.emit(enumC13318a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: el1.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.history.HistorySyncStatusHook$special$$inlined$flatMapLatest$1", m100430f = "HistorySyncStatusHook.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f46130w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46131x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f46132y;

        public b(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f46131x = interfaceC13062m;
            bVar.f46132y = interfaceC21750d;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46130w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46131x;
                InterfaceC13087t1 interfaceC13087t1Mo24699N = ((InterfaceC21750d) this.f46132y).mo24699N();
                this.f46131x = null;
                this.f46132y = null;
                this.f46130w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13087t1Mo24699N, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: el1.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.history.HistorySyncStatusHook$special$$inlined$transform$1", m100430f = "HistorySyncStatusHook.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46133w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46134x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f46135y;

        /* JADX INFO: renamed from: el1.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46136w;

            /* JADX INFO: renamed from: el1.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.history.HistorySyncStatusHook$special$$inlined$transform$1$1", m100430f = "HistorySyncStatusHook.kt", m100431l = {41, 44, 45, 46}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41534a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46137E;

                /* JADX INFO: renamed from: F */
                Object f46138F;

                /* JADX INFO: renamed from: G */
                Object f46139G;

                /* JADX INFO: renamed from: H */
                int f46140H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46141w;

                /* JADX INFO: renamed from: x */
                int f46142x;

                /* JADX INFO: renamed from: z */
                Object f46144z;

                public C41534a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46141w = obj;
                    this.f46142x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f46136w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
            
                if (r11.emit(r10, r0) == r1) goto L38;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
                /*
                    Method dump skipped, instruction units count: 220
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: el1.C13319b.c.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f46135y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f46135y, interfaceC30057d);
            cVar.f46134x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46133w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46134x;
                InterfaceC13058l interfaceC13058l = this.f46135y;
                a aVar = new a(interfaceC13062m);
                this.f46134x = null;
                this.f46133w = 1;
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

    public C13319b(InterfaceC34116n logger, InterfaceC2994c0 coroutineScope, InterfaceC4733b whoopStrapProvider) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.logger = logger;
        InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(new C13015a0(new a(null), new C13084s1(new c(AbstractC13091v.m36590P(new C4588i(whoopStrapProvider.mo14819c(), 2), new b(null)), null))));
        this.historySyncStatus = interfaceC13058lM36610t;
        this.historySyncStatusFlow = AbstractC13091v.m36586L(interfaceC13058lM36610t, coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC13058l getHistorySyncStatus() {
        return this.historySyncStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC13087t1 getHistorySyncStatusFlow() {
        return this.historySyncStatusFlow;
    }
}
