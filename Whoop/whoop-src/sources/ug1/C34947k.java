package ug1;

import ch.C4588i;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gt0.AbstractC16184f;
import gt0.InterfaceC16186h;
import jk0.InterfaceC21750d;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.C32970n;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ug1.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lug1/k;", "Lug1/e;", "Lug1/b;", "defaultUpdateStrategy", "Lug1/c;", "dfuUpdateStrategy", "Lci2/b;", "whoopStrapProvider", "Ltr2/n;", "logger", "<init>", "(Lug1/b;Lug1/c;Lci2/b;Ltr2/n;)V", "Lec3/l;", "Lug1/i;", "upstream", "Lgt0/h;", "interact", "(Lec3/l;)Lec3/l;", "a", "Lug1/b;", "b", "Lug1/c;", "c", "Lci2/b;", "d", "Ltr2/n;", "e", "()Ltr2/n;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34947k implements InterfaceC34941e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34938b defaultUpdateStrategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34939c dfuUpdateStrategy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ug1.k$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.UnifiedUpdateStrategy$interact$$inlined$flatMapLatest$1", m100430f = "UnifiedUpdateStrategy.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC13058l f147873E;

        /* JADX INFO: renamed from: w */
        int f147874w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f147875x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f147876y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34947k f147877z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C34947k c34947k, InterfaceC13058l interfaceC13058l) {
            super(3, interfaceC30057d);
            this.f147877z = c34947k;
            this.f147873E = interfaceC13058l;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC16186h interfaceC16186h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f147877z, this.f147873E);
            aVar.f147875x = interfaceC13062m;
            aVar.f147876y = interfaceC16186h;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147874w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f147875x;
                InterfaceC16186h interfaceC16186h = (InterfaceC16186h) this.f147876y;
                if (interfaceC16186h instanceof InterfaceC16186h.e) {
                    InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(new c(new C4588i(this.f147877z.whoopStrapProvider.mo14818b(), 2)));
                    Duration.Companion companion = Duration.INSTANCE;
                    c0456u = new C13015a0(AbstractC13091v.m36590P(AbstractC13091v.m36589O(interfaceC13058lM36610t, DurationKt.toDuration(120, DurationUnit.SECONDS)), new d(null, this.f147877z, this.f147873E)), this.f147877z.new b(null));
                } else {
                    c0456u = new C0456u(interfaceC16186h, 1);
                }
                this.f147875x = null;
                this.f147876y = null;
                this.f147874w = 1;
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
            return invoke((InterfaceC13062m) obj, (InterfaceC16186h) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ug1.k$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.UnifiedUpdateStrategy$interact$1$3", m100430f = "UnifiedUpdateStrategy.kt", m100431l = {49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lgt0/h;", "", "cause", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f147878w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f147879x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f147880y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = C34947k.this.new b(interfaceC30057d);
            bVar.f147879x = interfaceC13062m;
            bVar.f147880y = th3;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f147879x;
            Throwable th3 = (Throwable) this.f147880y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147878w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(th3 instanceof TimeoutCancellationException)) {
                    throw th3;
                }
                C34947k.this.getLogger().mo85222m("Timing out DFU update strategy after 120 seconds", new AbstractC30556a.a[0]);
                InterfaceC16186h.b bVar = new InterfaceC16186h.b(AbstractC16184f.i.f61477b, false, 2, null);
                this.f147879x = null;
                this.f147880y = null;
                this.f147878w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ug1.k$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f147882w;

        /* JADX INFO: renamed from: ug1.k$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f147883w;

            /* JADX INFO: renamed from: ug1.k$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.UnifiedUpdateStrategy$interact$lambda$0$$inlined$filter$1$2", m100430f = "UnifiedUpdateStrategy.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42481a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f147885F;

                /* JADX INFO: renamed from: G */
                Object f147886G;

                /* JADX INFO: renamed from: H */
                int f147887H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f147888w;

                /* JADX INFO: renamed from: x */
                int f147889x;

                /* JADX INFO: renamed from: y */
                Object f147890y;

                /* JADX INFO: renamed from: z */
                Object f147891z;

                public C42481a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f147888w = obj;
                    this.f147889x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f147883w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42481a c42481a;
                if (interfaceC30057d instanceof C42481a) {
                    c42481a = (C42481a) interfaceC30057d;
                    int i13 = c42481a.f147889x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42481a.f147889x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42481a = new C42481a(interfaceC30057d);
                    }
                } else {
                    c42481a = new C42481a(interfaceC30057d);
                }
                Object obj2 = c42481a.f147888w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42481a.f147889x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f147883w;
                    if (AbstractC22676k.m65745e(((InterfaceC21750d) obj).getConnectionState(), C32970n.f137298a)) {
                        c42481a.f147890y = null;
                        c42481a.f147891z = null;
                        c42481a.f147885F = null;
                        c42481a.f147886G = null;
                        c42481a.f147887H = 0;
                        c42481a.f147889x = 1;
                        if (interfaceC13062m.emit(obj, c42481a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f147882w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f147882w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug1.k$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.UnifiedUpdateStrategy$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "UnifiedUpdateStrategy.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC13058l f147892E;

        /* JADX INFO: renamed from: w */
        int f147893w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f147894x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f147895y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34947k f147896z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C34947k c34947k, InterfaceC13058l interfaceC13058l) {
            super(3, interfaceC30057d);
            this.f147896z = c34947k;
            this.f147892E = interfaceC13058l;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f147896z, this.f147892E);
            dVar.f147894x = interfaceC13062m;
            dVar.f147895y = interfaceC21750d;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147893w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f147894x;
                InterfaceC13058l interfaceC13058lInteract = this.f147896z.dfuUpdateStrategy.interact(this.f147892E);
                this.f147894x = null;
                this.f147895y = null;
                this.f147893w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lInteract, this) == enumC31071a) {
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

    public C34947k(C34938b defaultUpdateStrategy, C34939c dfuUpdateStrategy, InterfaceC4733b whoopStrapProvider, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(defaultUpdateStrategy, "defaultUpdateStrategy");
        AbstractC22676k.m65750j(dfuUpdateStrategy, "dfuUpdateStrategy");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(logger, "logger");
        this.defaultUpdateStrategy = defaultUpdateStrategy;
        this.dfuUpdateStrategy = dfuUpdateStrategy;
        this.whoopStrapProvider = whoopStrapProvider;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC34116n getLogger() {
        return this.logger;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(this.defaultUpdateStrategy.interact(upstream), new a(null, this, upstream));
    }
}
