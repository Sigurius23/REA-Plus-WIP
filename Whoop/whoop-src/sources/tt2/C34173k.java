package tt2;

import com.mapbox.common.HttpHeaders;
import com.whoop.weeklyplan.api.WeeklyPlanApi;
import com.whoop.weeklyplan.api.WeeklyPlanGetRequest;
import com.whoop.weeklyplan.weeklyplan.domain.models.GradientStyle;
import com.whoop.weeklyplan.weeklyplan.domain.models.MetaData;
import com.whoop.weeklyplan.weeklyplan.domain.models.WeeklyPlanResponse;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import ls2.AbstractC24716a;
import ls2.C24717b;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
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
import xt2.AbstractC38649c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: tt2.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Ltt2/k;", "Lod1/g;", "Ltt2/i;", "Ltt2/j;", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "api", "Lnm0/e;", "cachedApiSource", "Lzr2/a;", "dateAndTimeProvider", "Lls2/b;", "analytics", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Lnm0/e;Lzr2/a;Lls2/b;Ltr2/n;)V", "", HttpHeaders.DATE, "source", "Lec3/l;", "f", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;", "data", "Ll83/a0;", "g", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Ljava/lang/String;)V", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "b", "Lnm0/e;", "c", "Lzr2/a;", "getDateAndTimeProvider", "()Lzr2/a;", "d", "Lls2/b;", "getAnalytics", "()Lls2/b;", "e", "Ltr2/n;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34173k implements InterfaceC27844g<AbstractC34171i, AbstractC34172j> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WeeklyPlanApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C24717b analytics;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: tt2.k$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.WeeklyPlanInteractor$getDataFromCache$$inlined$cacheAPI$1", m100430f = "WeeklyPlanInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f143305w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f143306x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143307y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f143308z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f143308z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f143308z);
            aVar.f143306x = interfaceC13062m;
            aVar.f143307y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143305w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f143306x;
                C26832c c26832c = (C26832c) this.f143307y;
                InterfaceC26834e interfaceC26834e = this.f143308z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(WeeklyPlanResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(WeeklyPlanResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f143306x = null;
                this.f143307y = null;
                this.f143305w = 1;
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

    /* JADX INFO: renamed from: tt2.k$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f143309w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34173k f143310x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f143311y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f143312z;

        /* JADX INFO: renamed from: tt2.k$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f143313w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34173k f143314x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f143315y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f143316z;

            /* JADX INFO: renamed from: tt2.k$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.WeeklyPlanInteractor$getDataFromCache$$inlined$map$1$2", m100430f = "WeeklyPlanInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42419a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f143317E;

                /* JADX INFO: renamed from: F */
                Object f143318F;

                /* JADX INFO: renamed from: G */
                Object f143319G;

                /* JADX INFO: renamed from: H */
                int f143320H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f143321w;

                /* JADX INFO: renamed from: x */
                int f143322x;

                /* JADX INFO: renamed from: y */
                Object f143323y;

                public C42419a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f143321w = obj;
                    this.f143322x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34173k c34173k, String str, String str2) {
                this.f143313w = interfaceC13062m;
                this.f143314x = c34173k;
                this.f143315y = str;
                this.f143316z = str2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42419a c42419a;
                Object bVar;
                Object bVar2;
                if (interfaceC30057d instanceof C42419a) {
                    c42419a = (C42419a) interfaceC30057d;
                    int i13 = c42419a.f143322x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42419a.f143322x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42419a = new C42419a(interfaceC30057d);
                    }
                } else {
                    c42419a = new C42419a(interfaceC30057d);
                }
                Object obj2 = c42419a.f143321w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42419a.f143322x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f143313w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        bVar = AbstractC34172j.c.f143293a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                            this.f143314x.m107996g((WeeklyPlanResponse) c42173a.getData(), this.f143315y, this.f143316z);
                            WeeklyPlanResponse weeklyPlanResponse = (WeeklyPlanResponse) c42173a.getData();
                            String str = this.f143315y;
                            MetaData metadata = ((WeeklyPlanResponse) c42173a.getData()).getMetadata();
                            bVar2 = new AbstractC34172j.d(weeklyPlanResponse, str, metadata != null ? metadata.getAiContextMetadata() : null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            InterfaceC29354a.a.b bVar3 = (InterfaceC29354a.a.b) interfaceC29354a;
                            WeeklyPlanResponse weeklyPlanResponseCopy$default = WeeklyPlanResponse.copy$default((WeeklyPlanResponse) bVar3.getData(), null, null, null, 5, null);
                            String str2 = this.f143315y;
                            MetaData metadata2 = ((WeeklyPlanResponse) bVar3.getData()).getMetadata();
                            bVar2 = new AbstractC34172j.e(weeklyPlanResponseCopy$default, str2, metadata2 != null ? metadata2.getAiContextMetadata() : null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                            this.f143314x.logger.mo85222m(AbstractC11266d.m30461o("Fetching weekly plan failed ", dVar.getErrorMessage()), new AbstractC30556a.a[0]);
                            bVar2 = new AbstractC34172j.b(dVar.getErrorMessage(), this.f143315y);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.c) {
                            InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
                            this.f143314x.logger.mo85222m(AbstractC11266d.m30461o("Fetching weekly plan failed ", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
                            bVar2 = new AbstractC34172j.b(cVar.getErrorMessage(), this.f143315y);
                        } else {
                            this.f143314x.logger.mo85222m("Fetching weekly plan failed with unknown error", new AbstractC30556a.a[0]);
                            bVar = new AbstractC34172j.b("Fetching weekly plan failed with unknown error", this.f143315y);
                        }
                        bVar = bVar2;
                    }
                    c42419a.f143323y = null;
                    c42419a.f143317E = null;
                    c42419a.f143318F = null;
                    c42419a.f143319G = null;
                    c42419a.f143320H = 0;
                    c42419a.f143322x = 1;
                    if (interfaceC13062m.emit(bVar, c42419a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C34173k c34173k, String str, String str2) {
            this.f143309w = interfaceC13058l;
            this.f143310x = c34173k;
            this.f143311y = str;
            this.f143312z = str2;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f143309w.collect(new a(interfaceC13062m, this.f143310x, this.f143311y, this.f143312z), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tt2.k$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.WeeklyPlanInteractor$interact$$inlined$flatMapLatest$1", m100430f = "WeeklyPlanInteractor.kt", m100431l = {192, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f143325E;

        /* JADX INFO: renamed from: F */
        Object f143326F;

        /* JADX INFO: renamed from: G */
        Object f143327G;

        /* JADX INFO: renamed from: w */
        int f143328w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f143329x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143330y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34173k f143331z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C34173k c34173k) {
            super(3, interfaceC30057d);
            this.f143331z = c34173k;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC34171i abstractC34171i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f143331z);
            cVar.f143329x = interfaceC13062m;
            cVar.f143330y = abstractC34171i;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143328w;
            if (i13 != 0) {
                if (i13 == 1) {
                    interfaceC13062m = (InterfaceC13062m) this.f143325E;
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
            AbstractC34132o.m107864I(obj);
            interfaceC13062m = (InterfaceC13062m) this.f143329x;
            AbstractC34171i abstractC34171i = (AbstractC34171i) this.f143330y;
            if (!(abstractC34171i instanceof AbstractC34171i.a)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC34171i.a aVar = (AbstractC34171i.a) abstractC34171i;
            obj = this.f143331z.m107995f(aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), aVar.getSource());
            this.f143329x = null;
            this.f143330y = null;
            this.f143325E = null;
            this.f143326F = null;
            this.f143327G = null;
            this.f143328w = 2;
            if (AbstractC13091v.m36613w(interfaceC13062m, (InterfaceC13058l) obj, this) == enumC31071a) {
                return enumC31071a;
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC34171i) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C34173k(WeeklyPlanApi api, InterfaceC26834e cachedApiSource, InterfaceC41070a dateAndTimeProvider, C24717b analytics, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.cachedApiSource = cachedApiSource;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.analytics = analytics;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m107995f(String date, String source) {
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new WeeklyPlanGetRequest(date), 1), null, null, 3, null), new a(null, this.cachedApiSource)), this, date, source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m107996g(WeeklyPlanResponse data, String date, String source) {
        this.analytics.m72377q(new AbstractC24716a.t(AbstractC38649c.m123892a(data.getPlan().getGoalSection()), AbstractC38649c.m123893b(date, this.dateAndTimeProvider.mo133365d()), source, data.getPlan().getGradientStyle() == GradientStyle.JANUARY_JUMPSTART ? "jan_jump" : null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }
}
