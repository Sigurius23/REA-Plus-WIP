package ka2;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4351m;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ja2.C21498a;
import l83.C23454a0;
import la2.AbstractC23553a;
import la2.AbstractC23555c;
import la2.C23554b;
import oa2.InterfaceC27755c;
import od1.AbstractC27845h;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vc2.AbstractC35878a;
import vc2.AbstractC35880c;
import vc2.C35879b;

/* JADX INFO: renamed from: ka2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lka2/a;", "Lod1/g;", "Loa2/c;", "Lja2/a;", "Lla2/b;", "myAccountHeaderInteractor", "Lvc2/b;", "switchBillingPlanModalInteractor", "<init>", "(Lla2/b;Lvc2/b;)V", "Lec3/l;", "upstream", "Lla2/c;", "f", "(Lec3/l;)Lec3/l;", "Lvc2/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, NotificationCompat.CATEGORY_EVENT, "Lla2/a;", "e", "(Loa2/c;)Lla2/a;", "Lvc2/a;", "g", "(Loa2/c;)Lvc2/a;", "interact", "a", "Lla2/b;", "b", "Lvc2/b;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22308a implements InterfaceC27844g<InterfaceC27755c, C21498a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23554b myAccountHeaderInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35879b switchBillingPlanModalInteractor;

    /* JADX INFO: renamed from: ka2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.accountheader.domain.combiner.MyAccountHeaderDomainCombiner$interact$1", m100430f = "MyAccountHeaderDomainCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lla2/c;", "myAccountHeaderResult", "Lvc2/c;", "switchBillingPlanModalResult", "Lja2/a;", "<anonymous>", "(Lla2/c;Lvc2/c;)Lja2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f87034w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f87035x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f87036y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC23555c abstractC23555c, AbstractC35880c abstractC35880c, InterfaceC30057d<? super C21498a> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f87035x = abstractC23555c;
            aVar.f87036y = abstractC35880c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC23555c abstractC23555c = (AbstractC23555c) this.f87035x;
            AbstractC35880c abstractC35880c = (AbstractC35880c) this.f87036y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f87034w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C21498a(abstractC23555c, abstractC35880c);
        }
    }

    /* JADX INFO: renamed from: ka2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87037w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22308a f87038x;

        /* JADX INFO: renamed from: ka2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87039w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22308a f87040x;

            /* JADX INFO: renamed from: ka2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.accountheader.domain.combiner.MyAccountHeaderDomainCombiner$myAccountHeaderInteractor$$inlined$mapNotNull$1$2", m100430f = "MyAccountHeaderDomainCombiner.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41880a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87041E;

                /* JADX INFO: renamed from: F */
                Object f87042F;

                /* JADX INFO: renamed from: G */
                Object f87043G;

                /* JADX INFO: renamed from: H */
                Object f87044H;

                /* JADX INFO: renamed from: I */
                int f87045I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87046w;

                /* JADX INFO: renamed from: x */
                int f87047x;

                /* JADX INFO: renamed from: y */
                Object f87048y;

                public C41880a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87046w = obj;
                    this.f87047x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22308a c22308a) {
                this.f87039w = interfaceC13062m;
                this.f87040x = c22308a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41880a c41880a;
                if (interfaceC30057d instanceof C41880a) {
                    c41880a = (C41880a) interfaceC30057d;
                    int i13 = c41880a.f87047x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41880a.f87047x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41880a = new C41880a(interfaceC30057d);
                    }
                } else {
                    c41880a = new C41880a(interfaceC30057d);
                }
                Object obj2 = c41880a.f87046w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41880a.f87047x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87039w;
                    AbstractC23553a abstractC23553aM64103e = this.f87040x.m64103e((InterfaceC27755c) obj);
                    if (abstractC23553aM64103e != null) {
                        c41880a.f87048y = null;
                        c41880a.f87041E = null;
                        c41880a.f87042F = null;
                        c41880a.f87043G = null;
                        c41880a.f87044H = null;
                        c41880a.f87045I = 0;
                        c41880a.f87047x = 1;
                        if (interfaceC13062m.emit(abstractC23553aM64103e, c41880a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C22308a c22308a) {
            this.f87037w = interfaceC13058l;
            this.f87038x = c22308a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87037w.collect(new a(interfaceC13062m, this.f87038x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ka2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87050w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22308a f87051x;

        /* JADX INFO: renamed from: ka2.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87052w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22308a f87053x;

            /* JADX INFO: renamed from: ka2.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.accountheader.domain.combiner.MyAccountHeaderDomainCombiner$switchBillingPlanModalInteractor$$inlined$mapNotNull$1$2", m100430f = "MyAccountHeaderDomainCombiner.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41881a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87054E;

                /* JADX INFO: renamed from: F */
                Object f87055F;

                /* JADX INFO: renamed from: G */
                Object f87056G;

                /* JADX INFO: renamed from: H */
                Object f87057H;

                /* JADX INFO: renamed from: I */
                int f87058I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87059w;

                /* JADX INFO: renamed from: x */
                int f87060x;

                /* JADX INFO: renamed from: y */
                Object f87061y;

                public C41881a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87059w = obj;
                    this.f87060x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22308a c22308a) {
                this.f87052w = interfaceC13062m;
                this.f87053x = c22308a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41881a c41881a;
                if (interfaceC30057d instanceof C41881a) {
                    c41881a = (C41881a) interfaceC30057d;
                    int i13 = c41881a.f87060x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41881a.f87060x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41881a = new C41881a(interfaceC30057d);
                    }
                } else {
                    c41881a = new C41881a(interfaceC30057d);
                }
                Object obj2 = c41881a.f87059w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41881a.f87060x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87052w;
                    AbstractC35878a abstractC35878aM64105g = this.f87053x.m64105g((InterfaceC27755c) obj);
                    if (abstractC35878aM64105g != null) {
                        c41881a.f87061y = null;
                        c41881a.f87054E = null;
                        c41881a.f87055F = null;
                        c41881a.f87056G = null;
                        c41881a.f87057H = null;
                        c41881a.f87058I = 0;
                        c41881a.f87060x = 1;
                        if (interfaceC13062m.emit(abstractC35878aM64105g, c41881a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C22308a c22308a) {
            this.f87050w = interfaceC13058l;
            this.f87051x = c22308a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87050w.collect(new a(interfaceC13062m, this.f87051x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ka2.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.accountheader.domain.combiner.MyAccountHeaderDomainCombiner$switchBillingPlanModalInteractor$2", m100430f = "MyAccountHeaderDomainCombiner.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvc2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87063w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f87064x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f87064x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f87064x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87063w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC35880c.c cVar = AbstractC35880c.c.f152797a;
                this.f87064x = null;
                this.f87063w = 1;
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

    public C22308a(C23554b myAccountHeaderInteractor, C35879b switchBillingPlanModalInteractor) {
        AbstractC22676k.m65750j(myAccountHeaderInteractor, "myAccountHeaderInteractor");
        AbstractC22676k.m65750j(switchBillingPlanModalInteractor, "switchBillingPlanModalInteractor");
        this.myAccountHeaderInteractor = myAccountHeaderInteractor;
        this.switchBillingPlanModalInteractor = switchBillingPlanModalInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final AbstractC23553a m64103e(InterfaceC27755c event) {
        if (event instanceof InterfaceC27755c.a) {
            return AbstractC23553a.a.f93403a;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC13058l m64104f(InterfaceC13058l upstream) {
        return AbstractC27845h.m83945a(new b(upstream, this), this.myAccountHeaderInteractor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final AbstractC35878a m64105g(InterfaceC27755c event) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC13058l m64106h(InterfaceC13058l upstream) {
        return new C13015a0(new d(null), AbstractC27845h.m83945a(new c(upstream, this), this.switchBillingPlanModalInteractor));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(m64104f(upstream), m64106h(upstream), new a(null), 1);
    }
}
