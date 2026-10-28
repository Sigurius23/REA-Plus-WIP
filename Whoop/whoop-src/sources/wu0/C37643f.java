package wu0;

import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13084s1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import j93.InterfaceC21461d;
import jk0.EnumC21747a;
import jk0.InterfaceC21750d;
import js0.AbstractC21909c;
import js0.C21908b;
import kk0.C22538a;
import l83.C23454a0;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: wu0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lwu0/f;", "Lwu0/e;", "Lci2/b;", "strapProvider", "Ljs0/c;", "configurationRepository", "Lwu0/a;", "analytics", "<init>", "(Lci2/b;Ljs0/c;Lwu0/a;)V", "", "debounce", "Lec3/l;", "Ljk0/a;", "e", "(Z)Lec3/l;", "a", "Lci2/b;", "b", "Ljs0/c;", "c", "Lwu0/a;", "", "f", "()J", "timeDelay", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37643f implements InterfaceC37642e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b strapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C37638a analytics;

    /* JADX INFO: renamed from: wu0.f$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f161201w;

        /* JADX INFO: renamed from: wu0.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42613a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f161202w;

            /* JADX INFO: renamed from: wu0.f$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes7.dex */
            @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.WhoopStrapOffBodyNotifierImpl$createOffBodyNotifier$$inlined$filter$1$2", m100430f = "WhoopStrapOffBodyNotifierImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42614a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f161204F;

                /* JADX INFO: renamed from: G */
                Object f161205G;

                /* JADX INFO: renamed from: H */
                int f161206H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f161207w;

                /* JADX INFO: renamed from: x */
                int f161208x;

                /* JADX INFO: renamed from: y */
                Object f161209y;

                /* JADX INFO: renamed from: z */
                Object f161210z;

                public C42614a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f161207w = obj;
                    this.f161208x |= Integer.MIN_VALUE;
                    return C42613a.this.emit(null, this);
                }
            }

            public C42613a(InterfaceC13062m interfaceC13062m) {
                this.f161202w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42614a c42614a;
                if (interfaceC30057d instanceof C42614a) {
                    c42614a = (C42614a) interfaceC30057d;
                    int i13 = c42614a.f161208x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42614a.f161208x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42614a = new C42614a(interfaceC30057d);
                    }
                } else {
                    c42614a = new C42614a(interfaceC30057d);
                }
                Object obj2 = c42614a.f161207w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42614a.f161208x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f161202w;
                    if (((Boolean) obj).booleanValue()) {
                        c42614a.f161209y = null;
                        c42614a.f161210z = null;
                        c42614a.f161204F = null;
                        c42614a.f161205G = null;
                        c42614a.f161206H = 0;
                        c42614a.f161208x = 1;
                        if (interfaceC13062m.emit(obj, c42614a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f161201w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f161201w.collect(new C42613a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wu0.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.WhoopStrapOffBodyNotifierImpl$createOffBodyNotifier$$inlined$flatMapLatest$1", m100430f = "WhoopStrapOffBodyNotifierImpl.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f161211w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f161212x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f161213y;

        public b(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f161212x = interfaceC13062m;
            bVar.f161213y = interfaceC21750d;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161211w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f161212x;
                InterfaceC13037f2 observeStrapIsOnBody = ((InterfaceC21750d) this.f161213y).mo24695J().getObserveStrapIsOnBody();
                this.f161212x = null;
                this.f161213y = null;
                this.f161211w = 1;
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

    /* JADX INFO: renamed from: wu0.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.WhoopStrapOffBodyNotifierImpl$createOffBodyNotifier$$inlined$transform$1", m100430f = "WhoopStrapOffBodyNotifierImpl.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f161214w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f161215x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f161216y;

        /* JADX INFO: renamed from: wu0.f$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f161217w;

            /* JADX INFO: renamed from: wu0.f$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.WhoopStrapOffBodyNotifierImpl$createOffBodyNotifier$$inlined$transform$1$1", m100430f = "WhoopStrapOffBodyNotifierImpl.kt", m100431l = {39}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42615a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f161218E;

                /* JADX INFO: renamed from: F */
                Object f161219F;

                /* JADX INFO: renamed from: G */
                Object f161220G;

                /* JADX INFO: renamed from: H */
                int f161221H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f161222w;

                /* JADX INFO: renamed from: x */
                int f161223x;

                /* JADX INFO: renamed from: z */
                Object f161225z;

                public C42615a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f161222w = obj;
                    this.f161223x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f161217w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C42615a c42615a;
                if (interfaceC30057d instanceof C42615a) {
                    c42615a = (C42615a) interfaceC30057d;
                    int i13 = c42615a.f161223x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42615a.f161223x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42615a = new C42615a(interfaceC30057d);
                    }
                } else {
                    c42615a = new C42615a(interfaceC30057d);
                }
                Object obj = c42615a.f161222w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42615a.f161223x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f161217w;
                    Boolean boolValueOf = Boolean.valueOf(((EnumC21747a) t14) == EnumC21747a.STRAP_OFF_BODY);
                    c42615a.f161225z = null;
                    c42615a.f161218E = null;
                    c42615a.f161219F = null;
                    c42615a.f161220G = null;
                    c42615a.f161221H = 0;
                    c42615a.f161223x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42615a) == enumC31071a) {
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
        public c(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161216y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f161216y, interfaceC30057d);
            cVar.f161215x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161214w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f161215x;
                InterfaceC13058l interfaceC13058l = this.f161216y;
                a aVar = new a(interfaceC13062m);
                this.f161215x = null;
                this.f161214w = 1;
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

    /* JADX INFO: renamed from: wu0.f$d */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.WhoopStrapOffBodyNotifierImpl$createOffBodyNotifier$$inlined$transform$2", m100430f = "WhoopStrapOffBodyNotifierImpl.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f161226w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f161227x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f161228y;

        /* JADX INFO: renamed from: wu0.f$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f161229w;

            /* JADX INFO: renamed from: wu0.f$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes7.dex */
            @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.WhoopStrapOffBodyNotifierImpl$createOffBodyNotifier$$inlined$transform$2$1", m100430f = "WhoopStrapOffBodyNotifierImpl.kt", m100431l = {39}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42616a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f161230E;

                /* JADX INFO: renamed from: F */
                Object f161231F;

                /* JADX INFO: renamed from: G */
                boolean f161232G;

                /* JADX INFO: renamed from: H */
                int f161233H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f161234w;

                /* JADX INFO: renamed from: x */
                int f161235x;

                /* JADX INFO: renamed from: z */
                Object f161237z;

                public C42616a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f161234w = obj;
                    this.f161235x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f161229w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C42616a c42616a;
                if (interfaceC30057d instanceof C42616a) {
                    c42616a = (C42616a) interfaceC30057d;
                    int i13 = c42616a.f161235x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42616a.f161235x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42616a = new C42616a(interfaceC30057d);
                    }
                } else {
                    c42616a = new C42616a(interfaceC30057d);
                }
                Object obj = c42616a.f161234w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42616a.f161235x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f161229w;
                    boolean zBooleanValue = ((Boolean) t14).booleanValue();
                    EnumC21747a enumC21747a = EnumC21747a.STRAP_OFF_BODY;
                    c42616a.f161237z = null;
                    c42616a.f161230E = null;
                    c42616a.f161231F = null;
                    c42616a.f161232G = zBooleanValue;
                    c42616a.f161233H = 0;
                    c42616a.f161235x = 1;
                    if (interfaceC13062m.emit(enumC21747a, c42616a) == enumC31071a) {
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
        public d(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161228y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f161228y, interfaceC30057d);
            dVar.f161227x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161226w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f161227x;
                InterfaceC13058l interfaceC13058l = this.f161228y;
                a aVar = new a(interfaceC13062m);
                this.f161227x = null;
                this.f161226w = 1;
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

    /* JADX INFO: renamed from: wu0.f$e */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.offbody.WhoopStrapOffBodyNotifierImpl$createOffBodyNotifier$3", m100430f = "WhoopStrapOffBodyNotifierImpl.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        /* synthetic */ boolean f161238E;

        /* JADX INFO: renamed from: w */
        Object f161240w;

        /* JADX INFO: renamed from: x */
        Object f161241x;

        /* JADX INFO: renamed from: y */
        int f161242y;

        /* JADX INFO: renamed from: z */
        int f161243z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C37643f.this.new e(interfaceC30057d);
            eVar.f161238E = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C37638a c37638a;
            int i13;
            String str;
            EnumC32978v enumC32978vMo24752w0;
            C22538a batteryLevel;
            boolean z4 = this.f161238E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f161243z;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                c37638a = C37643f.this.analytics;
                int i15 = !z4 ? 1 : 0;
                String strValueOf = String.valueOf((C37643f.this.m120972f() / ((long) 1000)) / ((long) 60));
                InterfaceC13037f2 interfaceC13037f2Mo14819c = C37643f.this.strapProvider.mo14819c();
                this.f161240w = c37638a;
                this.f161241x = strValueOf;
                this.f161238E = z4;
                this.f161242y = i15;
                this.f161243z = 1;
                Object objM36577C = AbstractC13091v.m36577C(interfaceC13037f2Mo14819c, this);
                if (objM36577C == enumC31071a) {
                    return enumC31071a;
                }
                i13 = i15;
                obj = objM36577C;
                str = strValueOf;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.f161242y;
                str = (String) this.f161241x;
                c37638a = (C37638a) this.f161240w;
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC21750d interfaceC21750d = (InterfaceC21750d) obj;
            String strM104089b = null;
            String strValueOf2 = String.valueOf((interfaceC21750d == null || (batteryLevel = interfaceC21750d.getBatteryLevel()) == null) ? null : new Integer(batteryLevel.getUserDisplayPercent()));
            InterfaceC21750d interfaceC21750d2 = (InterfaceC21750d) AbstractC25265s.m74100H0(C37643f.this.strapProvider.mo14818b().getReplayCache());
            if (interfaceC21750d2 != null && (enumC32978vMo24752w0 = interfaceC21750d2.mo24752w0()) != null) {
                strM104089b = EnumC32978v.INSTANCE.m104089b(enumC32978vMo24752w0);
            }
            c37638a.m120961b(str, strValueOf2, strM104089b, i13 != 0);
            return C23454a0.f92919a;
        }

        public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(Boolean.valueOf(z4), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C37643f(InterfaceC4733b strapProvider, AbstractC21909c configurationRepository, C37638a analytics) {
        AbstractC22676k.m65750j(strapProvider, "strapProvider");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.strapProvider = strapProvider;
        this.configurationRepository = configurationRepository;
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC13058l m120971e(boolean debounce) {
        InterfaceC13058l c13052j1 = new C13052j1(AbstractC13091v.m36610t(new C13084s1(new c(AbstractC13091v.m36590P(new C4588i(this.strapProvider.mo14819c(), 2), new b(null)), null))), new e(null), 0);
        if (debounce) {
            c13052j1 = AbstractC13091v.m36608r(c13052j1, m120972f());
        }
        return new C13084s1(new d(new a(c13052j1), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final long m120972f() {
        AbstractC21909c abstractC21909c = this.configurationRepository;
        C37641d c37641d = C37641d.f161196a;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = c37641d.getName();
        Object defaultValue = c37641d.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
        Object objM125868N0 = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue != null) {
            return ((Long) defaultValue).longValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    @Override // wu0.InterfaceC37642e
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo120967a(boolean debounce) {
        return m120971e(debounce);
    }
}
