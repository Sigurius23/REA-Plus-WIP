package rq1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.impacts.api.BehaviorImpactGetRequest;
import com.whoop.impacts.impacts.domain.requests.BehaviorImpactResponse;
import com.whoop.impacts.impacts.domain.requests.MetaData;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.List;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: rq1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lrq1/c;", "Lod1/g;", "Lrq1/a;", "Lrq1/b;", "Lnm0/e;", "cachedApiSource", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Ltr2/n;)V", "Lec3/l;", "Lpm0/a;", "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;", "e", "()Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Ltr2/n;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31711c implements InterfaceC27844g<AbstractC31709a, AbstractC31710b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: rq1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.impacts.domain.BehaviorImpactInteractor$getDataFromCache$$inlined$cacheAPI$1", m100430f = "BehaviorImpactInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f131352w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f131353x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f131354y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f131355z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f131355z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f131355z);
            aVar.f131353x = interfaceC13062m;
            aVar.f131354y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131352w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f131353x;
                C26832c c26832c = (C26832c) this.f131354y;
                InterfaceC26834e interfaceC26834e = this.f131355z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(BehaviorImpactResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(BehaviorImpactResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f131353x = null;
                this.f131354y = null;
                this.f131352w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: rq1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f131356w;

        /* JADX INFO: renamed from: rq1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f131357w;

            /* JADX INFO: renamed from: rq1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.impacts.impacts.domain.BehaviorImpactInteractor$interact$$inlined$filterIsInstance$1$2", m100430f = "BehaviorImpactInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42286a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f131359F;

                /* JADX INFO: renamed from: G */
                Object f131360G;

                /* JADX INFO: renamed from: H */
                int f131361H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f131362w;

                /* JADX INFO: renamed from: x */
                int f131363x;

                /* JADX INFO: renamed from: y */
                Object f131364y;

                /* JADX INFO: renamed from: z */
                Object f131365z;

                public C42286a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f131362w = obj;
                    this.f131363x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f131357w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42286a c42286a;
                if (interfaceC30057d instanceof C42286a) {
                    c42286a = (C42286a) interfaceC30057d;
                    int i13 = c42286a.f131363x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42286a.f131363x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42286a = new C42286a(interfaceC30057d);
                    }
                } else {
                    c42286a = new C42286a(interfaceC30057d);
                }
                Object obj2 = c42286a.f131362w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42286a.f131363x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f131357w;
                    if (obj instanceof AbstractC31709a.a) {
                        c42286a.f131364y = null;
                        c42286a.f131365z = null;
                        c42286a.f131359F = null;
                        c42286a.f131360G = null;
                        c42286a.f131361H = 0;
                        c42286a.f131363x = 1;
                        if (interfaceC13062m.emit(obj, c42286a) == enumC31071a) {
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
            this.f131356w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f131356w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.impacts.domain.BehaviorImpactInteractor$interact$$inlined$flatMapLatest$1", m100430f = "BehaviorImpactInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f131366w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f131367x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f131368y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C31711c f131369z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C31711c c31711c) {
            super(3, interfaceC30057d);
            this.f131369z = c31711c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC31709a.a aVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f131369z);
            cVar.f131367x = interfaceC13062m;
            cVar.f131368y = aVar;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131366w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f131367x;
                InterfaceC13058l interfaceC13058lM98368e = this.f131369z.m98368e();
                this.f131367x = null;
                this.f131368y = null;
                this.f131366w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM98368e, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC31709a.a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: rq1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f131370w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31711c f131371x;

        /* JADX INFO: renamed from: rq1.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f131372w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31711c f131373x;

            /* JADX INFO: renamed from: rq1.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.impacts.impacts.domain.BehaviorImpactInteractor$interact$$inlined$map$1$2", m100430f = "BehaviorImpactInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42287a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f131374E;

                /* JADX INFO: renamed from: F */
                Object f131375F;

                /* JADX INFO: renamed from: G */
                Object f131376G;

                /* JADX INFO: renamed from: H */
                int f131377H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f131378w;

                /* JADX INFO: renamed from: x */
                int f131379x;

                /* JADX INFO: renamed from: y */
                Object f131380y;

                public C42287a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f131378w = obj;
                    this.f131379x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31711c c31711c) {
                this.f131372w = interfaceC13062m;
                this.f131373x = c31711c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42287a c42287a;
                Object aVar;
                AbstractC31710b.c cVar;
                if (interfaceC30057d instanceof C42287a) {
                    c42287a = (C42287a) interfaceC30057d;
                    int i13 = c42287a.f131379x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42287a.f131379x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42287a = new C42287a(interfaceC30057d);
                    }
                } else {
                    c42287a = new C42287a(interfaceC30057d);
                }
                Object obj2 = c42287a.f131378w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42287a.f131379x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f131372w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        aVar = AbstractC31710b.b.f131344a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                            C31712d c31712d = new C31712d(((BehaviorImpactResponse) c42173a.getData()).getBehaviorImpactTitleTile().getLastRefreshTextDisplay(), ((BehaviorImpactResponse) c42173a.getData()).getBehaviorImpactTitleTile().getTitle(), ((BehaviorImpactResponse) c42173a.getData()).getBehaviorImpactTitleTile().getSubtitle());
                            List<DesignSystemModel> tiles = ((BehaviorImpactResponse) c42173a.getData()).getTiles();
                            boolean journalEnabled = ((BehaviorImpactResponse) c42173a.getData()).getJournalEnabled();
                            Long cycleId = ((BehaviorImpactResponse) c42173a.getData()).getCycleId();
                            MetaData metadata = ((BehaviorImpactResponse) c42173a.getData()).getMetadata();
                            cVar = new AbstractC31710b.c(c31712d, tiles, journalEnabled, cycleId, metadata != null ? metadata.getAiContextMetadata() : null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
                            C31712d c31712d2 = new C31712d(((BehaviorImpactResponse) bVar.getData()).getBehaviorImpactTitleTile().getLastRefreshTextDisplay(), ((BehaviorImpactResponse) bVar.getData()).getBehaviorImpactTitleTile().getTitle(), ((BehaviorImpactResponse) bVar.getData()).getBehaviorImpactTitleTile().getSubtitle());
                            List<DesignSystemModel> tiles2 = ((BehaviorImpactResponse) bVar.getData()).getTiles();
                            boolean journalEnabled2 = ((BehaviorImpactResponse) bVar.getData()).getJournalEnabled();
                            Long cycleId2 = ((BehaviorImpactResponse) bVar.getData()).getCycleId();
                            MetaData metadata2 = ((BehaviorImpactResponse) bVar.getData()).getMetadata();
                            cVar = new AbstractC31710b.c(c31712d2, tiles2, journalEnabled2, cycleId2, metadata2 != null ? metadata2.getAiContextMetadata() : null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                            this.f131373x.logger.mo85222m(AbstractC11266d.m30461o("Fetching behavior impact failed ", dVar.getErrorMessage()), new AbstractC30556a.a[0]);
                            C31712d c31712d3 = new C31712d(((BehaviorImpactResponse) dVar.getData()).getBehaviorImpactTitleTile().getLastRefreshTextDisplay(), ((BehaviorImpactResponse) dVar.getData()).getBehaviorImpactTitleTile().getTitle(), ((BehaviorImpactResponse) dVar.getData()).getBehaviorImpactTitleTile().getSubtitle());
                            List<DesignSystemModel> tiles3 = ((BehaviorImpactResponse) dVar.getData()).getTiles();
                            boolean journalEnabled3 = ((BehaviorImpactResponse) dVar.getData()).getJournalEnabled();
                            Long cycleId3 = ((BehaviorImpactResponse) dVar.getData()).getCycleId();
                            MetaData metadata3 = ((BehaviorImpactResponse) dVar.getData()).getMetadata();
                            aVar = new AbstractC31710b.c(c31712d3, tiles3, journalEnabled3, cycleId3, metadata3 != null ? metadata3.getAiContextMetadata() : null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.c) {
                            InterfaceC29354a.c cVar2 = (InterfaceC29354a.c) interfaceC29354a;
                            this.f131373x.logger.mo85222m(AbstractC11266d.m30461o("Fetching behavior impact failed ", cVar2.getErrorMessage()), new AbstractC30556a.a[0]);
                            aVar = new AbstractC31710b.a(AbstractC11266d.m30461o("Fetching behavior impact failed ", cVar2.getErrorMessage()));
                        } else {
                            this.f131373x.logger.mo85222m("Fetching behavior impact failed with unknown error", new AbstractC30556a.a[0]);
                            aVar = new AbstractC31710b.a("Fetching behavior impact failed with unknown error");
                        }
                        aVar = cVar;
                    }
                    c42287a.f131380y = null;
                    c42287a.f131374E = null;
                    c42287a.f131375F = null;
                    c42287a.f131376G = null;
                    c42287a.f131377H = 0;
                    c42287a.f131379x = 1;
                    if (interfaceC13062m.emit(aVar, c42287a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C31711c c31711c) {
            this.f131370w = interfaceC13058l;
            this.f131371x = c31711c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f131370w.collect(new a(interfaceC13062m, this.f131371x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C31711c(InterfaceC26834e cachedApiSource, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m98368e() {
        return AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(BehaviorImpactGetRequest.INSTANCE, 1), null, null, 3, null), new a(null, this.cachedApiSource));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new d(AbstractC13091v.m36590P(new b(upstream), new c(null, this)), this);
    }
}
