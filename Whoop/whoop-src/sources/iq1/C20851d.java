package iq1;

import a12.AbstractC0142b;
import a12.C0141a;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.impacts.details.domain.journaltrends.BehaviorDetailsImpactJournalTrendsGetRequest;
import com.whoop.impacts.details.domain.requests.JournalTrendsMiniArchResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import l83.C23465k;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: iq1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Liq1/d;", "Lod1/g;", "Liq1/b;", "Liq1/f;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "", "path", "g", "(Ljava/lang/String;)Ljava/lang/String;", "Lec3/l;", "Liq1/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Lec3/l;", "La12/a;", "parsedPath", "", "showLoading", "i", "(La12/a;Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;", "cacheResult", "j", "(Lpm0/a$c;Ljava/lang/String;)Liq1/f;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20851d implements InterfaceC27844g<AbstractC20849b, C20853f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: iq1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f78393w;

        /* JADX INFO: renamed from: iq1.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41781a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f78394w;

            /* JADX INFO: renamed from: iq1.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.journaltrends.BehaviorDetailsImpactJournalTrendsInteractor$fetchCalendarNavigationData$$inlined$map$1$2", m100430f = "BehaviorDetailsImpactJournalTrendsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41782a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f78395E;

                /* JADX INFO: renamed from: F */
                Object f78396F;

                /* JADX INFO: renamed from: G */
                Object f78397G;

                /* JADX INFO: renamed from: H */
                int f78398H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f78399w;

                /* JADX INFO: renamed from: x */
                int f78400x;

                /* JADX INFO: renamed from: y */
                Object f78401y;

                public C41782a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f78399w = obj;
                    this.f78400x |= Integer.MIN_VALUE;
                    return C41781a.this.emit(null, this);
                }
            }

            public C41781a(InterfaceC13062m interfaceC13062m) {
                this.f78394w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41782a c41782a;
                if (interfaceC30057d instanceof C41782a) {
                    c41782a = (C41782a) interfaceC30057d;
                    int i13 = c41782a.f78400x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41782a.f78400x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41782a = new C41782a(interfaceC30057d);
                    }
                } else {
                    c41782a = new C41782a(interfaceC30057d);
                }
                Object obj2 = c41782a.f78399w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41782a.f78400x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f78394w;
                    AbstractC20854g.a aVar = new AbstractC20854g.a((C20853f) obj);
                    c41782a.f78401y = null;
                    c41782a.f78395E = null;
                    c41782a.f78396F = null;
                    c41782a.f78397G = null;
                    c41782a.f78398H = 0;
                    c41782a.f78400x = 1;
                    if (interfaceC13062m.emit(aVar, c41782a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f78393w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f78393w.collect(new C41781a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iq1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.journaltrends.BehaviorDetailsImpactJournalTrendsInteractor$fetchData$$inlined$cacheAPI$1", m100430f = "BehaviorDetailsImpactJournalTrendsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f78403w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f78404x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f78405y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f78406z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f78406z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f78406z);
            bVar.f78404x = interfaceC13062m;
            bVar.f78405y = c26832c;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78403w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f78404x;
                C26832c c26832c = (C26832c) this.f78405y;
                InterfaceC26834e interfaceC26834e = this.f78406z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(JournalTrendsMiniArchResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(JournalTrendsMiniArchResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f78404x = null;
                this.f78405y = null;
                this.f78403w = 1;
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

    /* JADX INFO: renamed from: iq1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f78407w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f78408x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C20851d f78409y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C0141a f78410z;

        /* JADX INFO: renamed from: iq1.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f78411w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f78412x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C20851d f78413y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C0141a f78414z;

            /* JADX INFO: renamed from: iq1.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.journaltrends.BehaviorDetailsImpactJournalTrendsInteractor$fetchData$$inlined$map$1$2", m100430f = "BehaviorDetailsImpactJournalTrendsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41783a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f78415E;

                /* JADX INFO: renamed from: F */
                Object f78416F;

                /* JADX INFO: renamed from: G */
                Object f78417G;

                /* JADX INFO: renamed from: H */
                int f78418H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f78419w;

                /* JADX INFO: renamed from: x */
                int f78420x;

                /* JADX INFO: renamed from: y */
                Object f78421y;

                public C41783a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f78419w = obj;
                    this.f78420x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, C20851d c20851d, C0141a c0141a) {
                this.f78411w = interfaceC13062m;
                this.f78412x = z4;
                this.f78413y = c20851d;
                this.f78414z = c0141a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41783a c41783a;
                C20853f c20853fM57598j;
                C20853f c20853f;
                if (interfaceC30057d instanceof C41783a) {
                    c41783a = (C41783a) interfaceC30057d;
                    int i13 = c41783a.f78420x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41783a.f78420x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41783a = new C41783a(interfaceC30057d);
                    }
                } else {
                    c41783a = new C41783a(interfaceC30057d);
                }
                Object obj2 = c41783a.f78419w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41783a.f78420x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f78411w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c20853fM57598j = this.f78412x ? new C20853f(InterfaceC20852e.a.f78444a, null, 2, null) : new C20853f(null, null, 3, null);
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            c20853f = new C20853f(null, (JournalTrendsMiniArchResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), 1, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            c20853f = new C20853f(null, (JournalTrendsMiniArchResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), 1, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            c20853f = new C20853f(null, (JournalTrendsMiniArchResponse) ((InterfaceC29354a.d) interfaceC29354a).getData(), 1, null);
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c20853fM57598j = this.f78413y.m57598j((InterfaceC29354a.c) interfaceC29354a, this.f78414z.getPath());
                        }
                        c20853fM57598j = c20853f;
                    }
                    c41783a.f78421y = null;
                    c41783a.f78415E = null;
                    c41783a.f78416F = null;
                    c41783a.f78417G = null;
                    c41783a.f78418H = 0;
                    c41783a.f78420x = 1;
                    if (interfaceC13062m.emit(c20853fM57598j, c41783a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, boolean z4, C20851d c20851d, C0141a c0141a) {
            this.f78407w = interfaceC13058l;
            this.f78408x = z4;
            this.f78409y = c20851d;
            this.f78410z = c0141a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f78407w.collect(new a(interfaceC13062m, this.f78408x, this.f78409y, this.f78410z), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iq1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.journaltrends.BehaviorDetailsImpactJournalTrendsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "BehaviorDetailsImpactJournalTrendsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f78423w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f78424x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f78425y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C20851d f78426z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C20851d c20851d) {
            super(3, interfaceC30057d);
            this.f78426z = c20851d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C23465k c23465k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f78426z);
            dVar.f78424x = interfaceC13062m;
            dVar.f78425y = c23465k;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l gVar;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78423w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f78424x;
                C23465k c23465k = (C23465k) this.f78425y;
                AbstractC20849b abstractC20849b = (AbstractC20849b) c23465k.f92937w;
                String str = (String) c23465k.f92938x;
                if (abstractC20849b == null) {
                    gVar = new C0456u(AbstractC20854g.b.f78450a, 1);
                } else if ((abstractC20849b instanceof AbstractC20849b.a) || (abstractC20849b instanceof AbstractC20849b.d)) {
                    gVar = new g(this.f78426z.m57597i(AbstractC0142b.m360e(str), true));
                } else if (abstractC20849b instanceof AbstractC20849b.c) {
                    gVar = this.f78426z.m57596h(AbstractC18489d0.m53370k(str, "?endDate=", AbstractC39414r.m125863I0(((AbstractC20849b.c) abstractC20849b).getNextDateTime(), "T")));
                } else if (abstractC20849b instanceof AbstractC20849b.b) {
                    gVar = this.f78426z.m57596h(AbstractC18489d0.m53370k(str, "?startDate=", AbstractC39414r.m125863I0(((AbstractC20849b.b) abstractC20849b).getPreviousDateTime(), "T")));
                } else {
                    gVar = new C0456u(new AbstractC20854g.c(abstractC20849b), 1);
                }
                this.f78424x = null;
                this.f78425y = null;
                this.f78423w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, gVar, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C23465k) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: iq1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.journaltrends.BehaviorDetailsImpactJournalTrendsInteractor$interact$1", m100430f = "BehaviorDetailsImpactJournalTrendsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ll83/k;", "Liq1/b;", "", "<destruct>", "action", "<anonymous>", "(Ll83/k;Liq1/b;)Ll83/k;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f78427w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f78428x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f78429y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C23465k c23465k, AbstractC20849b abstractC20849b, InterfaceC30057d<? super C23465k> interfaceC30057d) {
            e eVar = C20851d.this.new e(interfaceC30057d);
            eVar.f78428x = c23465k;
            eVar.f78429y = abstractC20849b;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C23465k c23465k = (C23465k) this.f78428x;
            AbstractC20849b abstractC20849b = (AbstractC20849b) this.f78429y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f78427w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM57595g = (String) c23465k.f92938x;
            if (abstractC20849b instanceof AbstractC20849b.a) {
                strM57595g = C20851d.this.m57595g(((AbstractC20849b.a) abstractC20849b).getPath());
            }
            return new C23465k(abstractC20849b, strM57595g);
        }
    }

    /* JADX INFO: renamed from: iq1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.journaltrends.BehaviorDetailsImpactJournalTrendsInteractor$interact$3", m100430f = "BehaviorDetailsImpactJournalTrendsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Liq1/f;", "previousState", "Liq1/g;", "internalAction", "<anonymous>", "(Liq1/f;Liq1/g;)Liq1/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f78431w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f78432x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f78433y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C20853f c20853f, AbstractC20854g abstractC20854g, InterfaceC30057d<? super C20853f> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f78432x = c20853f;
            fVar.f78433y = abstractC20854g;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C20853f c20853f = (C20853f) this.f78432x;
            AbstractC20854g abstractC20854g = (AbstractC20854g) this.f78433y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f78431w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!(abstractC20854g instanceof AbstractC20854g.b)) {
                if (abstractC20854g instanceof AbstractC20854g.a) {
                    C20853f domainState = ((AbstractC20854g.a) abstractC20854g).getDomainState();
                    return ((domainState.getCurrentDialogType() instanceof InterfaceC20852e.a) && domainState.getResponse() == null) ? C20853f.m57601b(domainState, null, c20853f.getResponse(), 1, null) : domainState;
                }
                if (!(abstractC20854g instanceof AbstractC20854g.c)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return c20853f;
        }
    }

    /* JADX INFO: renamed from: iq1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f78434w;

        /* JADX INFO: renamed from: iq1.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f78435w;

            /* JADX INFO: renamed from: iq1.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.impacts.details.domain.journaltrends.BehaviorDetailsImpactJournalTrendsInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "BehaviorDetailsImpactJournalTrendsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41784a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f78436E;

                /* JADX INFO: renamed from: F */
                Object f78437F;

                /* JADX INFO: renamed from: G */
                Object f78438G;

                /* JADX INFO: renamed from: H */
                int f78439H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f78440w;

                /* JADX INFO: renamed from: x */
                int f78441x;

                /* JADX INFO: renamed from: y */
                Object f78442y;

                public C41784a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f78440w = obj;
                    this.f78441x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f78435w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41784a c41784a;
                if (interfaceC30057d instanceof C41784a) {
                    c41784a = (C41784a) interfaceC30057d;
                    int i13 = c41784a.f78441x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41784a.f78441x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41784a = new C41784a(interfaceC30057d);
                    }
                } else {
                    c41784a = new C41784a(interfaceC30057d);
                }
                Object obj2 = c41784a.f78440w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41784a.f78441x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f78435w;
                    AbstractC20854g.a aVar = new AbstractC20854g.a((C20853f) obj);
                    c41784a.f78442y = null;
                    c41784a.f78436E = null;
                    c41784a.f78437F = null;
                    c41784a.f78438G = null;
                    c41784a.f78439H = 0;
                    c41784a.f78441x = 1;
                    if (interfaceC13062m.emit(aVar, c41784a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f78434w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f78434w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C20851d(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final String m57595g(String path) {
        return AbstractC39414r.m125863I0(path, "?");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m57596h(String path) {
        return new a(m57597i(AbstractC0142b.m360e(path), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m57597i(C0141a parsedPath, boolean showLoading) {
        return new c(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new BehaviorDetailsImpactJournalTrendsGetRequest(parsedPath.getBasePath(), parsedPath.m354b()), 1), AbstractC12350b.m34570S(SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE), null, 2, null), new b(null, this.cachedApiSource)), showLoading, this, parsedPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C20853f m57598j(InterfaceC29354a.c<JournalTrendsMiniArchResponse> cacheResult, String path) {
        return AbstractC29355b.m89462a(cacheResult) ? new C20853f(new InterfaceC20852e.d(path), null, 2, null) : new C20853f(InterfaceC20852e.c.f78445a, null, 2, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C20853f(InterfaceC20852e.a.f78444a, null, 2, null), AbstractC13091v.m36590P(new C13060l1(new C23465k(null, ""), upstream, new e(null)), new d(null, this)), new f(null));
    }
}
