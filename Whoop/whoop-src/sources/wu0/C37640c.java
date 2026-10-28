package wu0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import jk0.EnumC21747a;
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

/* JADX INFO: renamed from: wu0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lwu0/c;", "Lwu0/b;", "Lwu0/e;", "offBodyNotifier", "Lci2/b;", "whoopStrapProvider", "Lbc3/c0;", "coroutineScope", "<init>", "(Lwu0/e;Lci2/b;Lbc3/c0;)V", "", "withDelay", "Lec3/l;", "Ljk0/a;", "c", "(Z)Lec3/l;", "b", "a", "Lwu0/e;", "Lci2/b;", "Lbc3/c0;", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37640c implements InterfaceC37639b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC37642e offBodyNotifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: wu0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.StrapBodyStatusNotifierImpl$createStrapBodyStatusFlow$$inlined$flatMapLatest$1", m100430f = "StrapBodyStatusNotifier.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f161175w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f161176x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f161177y;

        public a(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f161176x = interfaceC13062m;
            aVar.f161177y = interfaceC21750d;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161175w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f161176x;
                InterfaceC13037f2 observeStrapIsOnBody = ((InterfaceC21750d) this.f161177y).mo24695J().getObserveStrapIsOnBody();
                this.f161176x = null;
                this.f161177y = null;
                this.f161175w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, observeStrapIsOnBody, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: wu0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.StrapBodyStatusNotifierImpl$createStrapBodyStatusFlow$$inlined$transform$1", m100430f = "StrapBodyStatusNotifier.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f161178w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f161179x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f161180y;

        /* JADX INFO: renamed from: wu0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f161181w;

            /* JADX INFO: renamed from: wu0.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.StrapBodyStatusNotifierImpl$createStrapBodyStatusFlow$$inlined$transform$1$1", m100430f = "StrapBodyStatusNotifier.kt", m100431l = {39}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42612a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f161182E;

                /* JADX INFO: renamed from: F */
                Object f161183F;

                /* JADX INFO: renamed from: G */
                Object f161184G;

                /* JADX INFO: renamed from: H */
                int f161185H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f161186w;

                /* JADX INFO: renamed from: x */
                int f161187x;

                /* JADX INFO: renamed from: z */
                Object f161189z;

                public C42612a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f161186w = obj;
                    this.f161187x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f161181w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C42612a c42612a;
                if (interfaceC30057d instanceof C42612a) {
                    c42612a = (C42612a) interfaceC30057d;
                    int i13 = c42612a.f161187x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42612a.f161187x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42612a = new C42612a(interfaceC30057d);
                    }
                } else {
                    c42612a = new C42612a(interfaceC30057d);
                }
                Object obj = c42612a.f161186w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42612a.f161187x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    c42612a.f161189z = null;
                    c42612a.f161182E = null;
                    c42612a.f161183F = null;
                    c42612a.f161184G = null;
                    c42612a.f161185H = 0;
                    c42612a.f161187x = 1;
                    if (this.f161181w.emit((EnumC21747a) t14, c42612a) == enumC31071a) {
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
        public b(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161180y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f161180y, interfaceC30057d);
            bVar.f161179x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161178w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f161179x;
                InterfaceC13058l interfaceC13058l = this.f161180y;
                a aVar = new a(interfaceC13062m);
                this.f161179x = null;
                this.f161178w = 1;
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

    /* JADX INFO: renamed from: wu0.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.StrapBodyStatusNotifierImpl$createStrapBodyStatusFlow$2", m100430f = "StrapBodyStatusNotifier.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ljk0/a;", "bodyStatus", "offBodyNotifier", "<anonymous>", "(Ljk0/a;Ljk0/a;)Ljk0/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f161190w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f161191x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f161192y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(EnumC21747a enumC21747a, EnumC21747a enumC21747a2, InterfaceC30057d<? super EnumC21747a> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f161191x = enumC21747a;
            cVar.f161192y = enumC21747a2;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC21747a enumC21747a = (EnumC21747a) this.f161191x;
            EnumC21747a enumC21747a2 = (EnumC21747a) this.f161192y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f161190w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            EnumC21747a enumC21747a3 = EnumC21747a.STRAP_ON_BODY;
            if (enumC21747a == enumC21747a3) {
                return enumC21747a3;
            }
            EnumC21747a enumC21747a4 = EnumC21747a.STRAP_OFF_BODY;
            return enumC21747a2 == enumC21747a4 ? enumC21747a4 : EnumC21747a.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: wu0.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.StrapBodyStatusNotifierImpl$createStrapBodyStatusFlow$3", m100430f = "StrapBodyStatusNotifier.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ljk0/a;", "accumulator", "value", "<anonymous>", "(Ljk0/a;Ljk0/a;)Ljk0/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f161193w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f161194x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f161195y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(EnumC21747a enumC21747a, EnumC21747a enumC21747a2, InterfaceC30057d<? super EnumC21747a> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f161194x = enumC21747a;
            dVar.f161195y = enumC21747a2;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC21747a enumC21747a = (EnumC21747a) this.f161194x;
            EnumC21747a enumC21747a2 = (EnumC21747a) this.f161195y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f161193w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return (enumC21747a == EnumC21747a.STRAP_ON_BODY && enumC21747a2 == EnumC21747a.STRAP_OFF_BODY) ? EnumC21747a.UNKNOWN : enumC21747a2;
        }
    }

    public C37640c(InterfaceC37642e offBodyNotifier, InterfaceC4733b whoopStrapProvider, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(offBodyNotifier, "offBodyNotifier");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.offBodyNotifier = offBodyNotifier;
        this.whoopStrapProvider = whoopStrapProvider;
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC13058l m120964c(boolean withDelay) {
        return AbstractC13091v.m36586L(new C13084s1(new b(new C13060l1(EnumC21747a.UNKNOWN, new C13060l1(AbstractC13091v.m36590P(new C4588i(this.whoopStrapProvider.mo14819c(), 2), new a(null)), this.offBodyNotifier.mo120967a(withDelay), new c(null), 1), new d(null)), null)), this.coroutineScope, C13105z1.f45288a, 1);
    }

    @Override // wu0.InterfaceC37639b
    /* JADX INFO: renamed from: b */
    public InterfaceC13058l mo120963b(boolean withDelay) {
        return m120964c(withDelay);
    }
}
