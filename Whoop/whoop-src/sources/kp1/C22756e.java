package kp1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.hormonalinsights.api.HormonalInsightsApi;
import com.whoop.hormonalinsights.api.PregnancyInsightsGetByIdRequest;
import com.whoop.hormonalinsights.api.PregnancyInsightsGetRequest;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
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
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: kp1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lkp1/e;", "Lod1/g;", "Lkp1/c;", "Lkp1/d;", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "api", "Lnm0/e;", "cachedApiSource", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Lnm0/e;Ltr2/n;)V", "", "id", "Lec3/l;", "i", "(Ljava/lang/String;)Lec3/l;", HttpHeaders.DATE, "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "b", "Lnm0/e;", "c", "Ltr2/n;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22756e implements InterfaceC27844g<AbstractC22754c, AbstractC22755d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HormonalInsightsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: kp1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.domain.PregnancyInsightsInteractor", m100430f = "PregnancyInsightsInteractor.kt", m100431l = {91}, m100432m = "deletePregnancy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f89508w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f89509x;

        /* JADX INFO: renamed from: z */
        int f89511z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f89509x = obj;
            this.f89511z |= Integer.MIN_VALUE;
            return C22756e.this.m65888h(null, this);
        }
    }

    /* JADX INFO: renamed from: kp1.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.domain.PregnancyInsightsInteractor$deletePregnancy$response$1", m100430f = "PregnancyInsightsInteractor.kt", m100431l = {92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f89512w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f89514y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f89514y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22756e.this.new b(this.f89514y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89512w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C22756e.this.api;
            String str = this.f89514y;
            this.f89512w = 1;
            Object objDeletePregnancy = hormonalInsightsApi.deletePregnancy(str, this);
            return objDeletePregnancy == enumC31071a ? enumC31071a : objDeletePregnancy;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: kp1.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.domain.PregnancyInsightsInteractor$getDataByIdFromCache$$inlined$cacheAPI$1", m100430f = "PregnancyInsightsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89515w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89516x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89517y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f89518z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f89518z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f89518z);
            cVar.f89516x = interfaceC13062m;
            cVar.f89517y = c26832c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89515w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89516x;
                C26832c c26832c = (C26832c) this.f89517y;
                InterfaceC26834e interfaceC26834e = this.f89518z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(PregnancyInsightsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(PregnancyInsightsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f89516x = null;
                this.f89517y = null;
                this.f89515w = 1;
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

    /* JADX INFO: renamed from: kp1.e$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f89519w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22756e f89520x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f89521y;

        /* JADX INFO: renamed from: kp1.e$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f89522w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22756e f89523x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f89524y;

            /* JADX INFO: renamed from: kp1.e$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.domain.PregnancyInsightsInteractor$getDataByIdFromCache$$inlined$map$1$2", m100430f = "PregnancyInsightsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41918a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f89525E;

                /* JADX INFO: renamed from: F */
                Object f89526F;

                /* JADX INFO: renamed from: G */
                Object f89527G;

                /* JADX INFO: renamed from: H */
                int f89528H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f89529w;

                /* JADX INFO: renamed from: x */
                int f89530x;

                /* JADX INFO: renamed from: y */
                Object f89531y;

                public C41918a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f89529w = obj;
                    this.f89530x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22756e c22756e, String str) {
                this.f89522w = interfaceC13062m;
                this.f89523x = c22756e;
                this.f89524y = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41918a c41918a;
                Object eVar;
                Object eVar2;
                if (interfaceC30057d instanceof C41918a) {
                    c41918a = (C41918a) interfaceC30057d;
                    int i13 = c41918a.f89530x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41918a.f89530x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41918a = new C41918a(interfaceC30057d);
                    }
                } else {
                    c41918a = new C41918a(interfaceC30057d);
                }
                Object obj2 = c41918a.f89529w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41918a.f89530x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f89522w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        eVar = AbstractC22755d.f.f89502a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            eVar2 = new AbstractC22755d.h((PregnancyInsightsResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            eVar2 = new AbstractC22755d.g((PregnancyInsightsResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                            this.f89523x.logger.mo85222m(AbstractC11266d.m30461o("Fetching pregnancy insights failed ", dVar.getErrorMessage()), new AbstractC30556a.a[0]);
                            eVar2 = new AbstractC22755d.e(dVar.getErrorMessage(), this.f89524y);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.c) {
                            InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
                            this.f89523x.logger.mo85222m(AbstractC11266d.m30461o("Fetching pregnancy insights failed ", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
                            eVar2 = new AbstractC22755d.e(cVar.getErrorMessage(), this.f89524y);
                        } else {
                            this.f89523x.logger.mo85222m("Fetching pregnancy insights failed with unknown error", new AbstractC30556a.a[0]);
                            eVar = new AbstractC22755d.e("Fetching weekly plan failed with unknown error", this.f89524y);
                        }
                        eVar = eVar2;
                    }
                    c41918a.f89531y = null;
                    c41918a.f89525E = null;
                    c41918a.f89526F = null;
                    c41918a.f89527G = null;
                    c41918a.f89528H = 0;
                    c41918a.f89530x = 1;
                    if (interfaceC13062m.emit(eVar, c41918a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C22756e c22756e, String str) {
            this.f89519w = interfaceC13058l;
            this.f89520x = c22756e;
            this.f89521y = str;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f89519w.collect(new a(interfaceC13062m, this.f89520x, this.f89521y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kp1.e$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.domain.PregnancyInsightsInteractor$getDataFromCache$$inlined$cacheAPI$1", m100430f = "PregnancyInsightsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89533w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89534x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89535y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f89536z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f89536z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f89536z);
            eVar.f89534x = interfaceC13062m;
            eVar.f89535y = c26832c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89533w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89534x;
                C26832c c26832c = (C26832c) this.f89535y;
                InterfaceC26834e interfaceC26834e = this.f89536z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(PregnancyInsightsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(PregnancyInsightsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f89534x = null;
                this.f89535y = null;
                this.f89533w = 1;
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

    /* JADX INFO: renamed from: kp1.e$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f89537w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22756e f89538x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f89539y;

        /* JADX INFO: renamed from: kp1.e$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f89540w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22756e f89541x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f89542y;

            /* JADX INFO: renamed from: kp1.e$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.domain.PregnancyInsightsInteractor$getDataFromCache$$inlined$map$1$2", m100430f = "PregnancyInsightsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41919a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f89543E;

                /* JADX INFO: renamed from: F */
                Object f89544F;

                /* JADX INFO: renamed from: G */
                Object f89545G;

                /* JADX INFO: renamed from: H */
                int f89546H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f89547w;

                /* JADX INFO: renamed from: x */
                int f89548x;

                /* JADX INFO: renamed from: y */
                Object f89549y;

                public C41919a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f89547w = obj;
                    this.f89548x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22756e c22756e, String str) {
                this.f89540w = interfaceC13062m;
                this.f89541x = c22756e;
                this.f89542y = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41919a c41919a;
                Object dVar;
                Object dVar2;
                if (interfaceC30057d instanceof C41919a) {
                    c41919a = (C41919a) interfaceC30057d;
                    int i13 = c41919a.f89548x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41919a.f89548x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41919a = new C41919a(interfaceC30057d);
                    }
                } else {
                    c41919a = new C41919a(interfaceC30057d);
                }
                Object obj2 = c41919a.f89547w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41919a.f89548x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f89540w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        dVar = AbstractC22755d.f.f89502a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            dVar2 = new AbstractC22755d.h((PregnancyInsightsResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            dVar2 = new AbstractC22755d.g((PregnancyInsightsResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            InterfaceC29354a.d dVar3 = (InterfaceC29354a.d) interfaceC29354a;
                            this.f89541x.logger.mo85222m(AbstractC11266d.m30461o("Fetching pregnancy insights failed ", dVar3.getErrorMessage()), new AbstractC30556a.a[0]);
                            dVar2 = new AbstractC22755d.d(dVar3.getErrorMessage(), this.f89542y);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.c) {
                            InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
                            this.f89541x.logger.mo85222m(AbstractC11266d.m30461o("Fetching pregnancy insights failed ", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
                            dVar2 = new AbstractC22755d.d(cVar.getErrorMessage(), this.f89542y);
                        } else {
                            this.f89541x.logger.mo85222m("Fetching pregnancy insights failed with unknown error", new AbstractC30556a.a[0]);
                            dVar = new AbstractC22755d.d("Fetching weekly plan failed with unknown error", this.f89542y);
                        }
                        dVar = dVar2;
                    }
                    c41919a.f89549y = null;
                    c41919a.f89543E = null;
                    c41919a.f89544F = null;
                    c41919a.f89545G = null;
                    c41919a.f89546H = 0;
                    c41919a.f89548x = 1;
                    if (interfaceC13062m.emit(dVar, c41919a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C22756e c22756e, String str) {
            this.f89537w = interfaceC13058l;
            this.f89538x = c22756e;
            this.f89539y = str;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f89537w.collect(new a(interfaceC13062m, this.f89538x, this.f89539y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kp1.e$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.domain.PregnancyInsightsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "PregnancyInsightsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89551w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89552x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89553y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22756e f89554z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, C22756e c22756e) {
            super(3, interfaceC30057d);
            this.f89554z = c22756e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC22754c abstractC22754c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f89554z);
            gVar.f89552x = interfaceC13062m;
            gVar.f89553y = abstractC22754c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89551w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89552x;
                AbstractC22754c abstractC22754c = (AbstractC22754c) this.f89553y;
                if (abstractC22754c instanceof AbstractC22754c.b) {
                    c13084s1 = this.f89554z.m65890j(((AbstractC22754c.b) abstractC22754c).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
                } else if (abstractC22754c instanceof AbstractC22754c.c) {
                    c13084s1 = this.f89554z.m65889i(((AbstractC22754c.c) abstractC22754c).getId());
                } else {
                    if (!(abstractC22754c instanceof AbstractC22754c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(this.f89554z.new h(abstractC22754c, null));
                }
                this.f89552x = null;
                this.f89553y = null;
                this.f89551w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC22754c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kp1.e$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.domain.PregnancyInsightsInteractor$interact$1$1", m100430f = "PregnancyInsightsInteractor.kt", m100431l = {36, 37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lkp1/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89555w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89556x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC22754c f89558z;

        /* JADX INFO: renamed from: kp1.e$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.domain.PregnancyInsightsInteractor$interact$1$1$1", m100430f = "PregnancyInsightsInteractor.kt", m100431l = {38, 38}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ AbstractC22754c f89559E;

            /* JADX INFO: renamed from: w */
            Object f89560w;

            /* JADX INFO: renamed from: x */
            int f89561x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f89562y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C22756e f89563z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13062m interfaceC13062m, C22756e c22756e, AbstractC22754c abstractC22754c, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f89562y = interfaceC13062m;
                this.f89563z = c22756e;
                this.f89559E = abstractC22754c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f89562y, this.f89563z, this.f89559E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            
                if (r1.emit(r6, r5) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r5.f89561x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L46
                L10:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L18:
                    java.lang.Object r1 = r5.f89560w
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L3a
                L20:
                    p505ts.AbstractC34132o.m107864I(r6)
                    ec3.m r1 = r5.f89562y
                    kp1.e r6 = r5.f89563z
                    kp1.c r4 = r5.f89559E
                    kp1.c$a r4 = (kp1.AbstractC22754c.a) r4
                    java.lang.String r4 = r4.getId()
                    r5.f89560w = r1
                    r5.f89561x = r3
                    java.lang.Object r6 = kp1.C22756e.m65883c(r6, r4, r5)
                    if (r6 != r0) goto L3a
                    goto L45
                L3a:
                    r3 = 0
                    r5.f89560w = r3
                    r5.f89561x = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L46
                L45:
                    return r0
                L46:
                    l83.a0 r6 = l83.C23454a0.f92919a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kp1.C22756e.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC22754c abstractC22754c, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f89558z = abstractC22754c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = C22756e.this.new h(this.f89558z, interfaceC30057d);
            hVar.f89556x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (or2.AbstractC28190p0.m85321a(1000, r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f89556x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f89555w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L47
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                kp1.d$c r7 = kp1.AbstractC22755d.c.f89497a
                r6.f89556x = r0
                r6.f89555w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L30
                goto L46
            L30:
                kp1.e$h$a r7 = new kp1.e$h$a
                kp1.e r2 = kp1.C22756e.this
                kp1.c r4 = r6.f89558z
                r5 = 0
                r7.<init>(r0, r2, r4, r5)
                r6.f89556x = r5
                r6.f89555w = r3
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = or2.AbstractC28190p0.m85321a(r2, r7, r6)
                if (r7 != r1) goto L47
            L46:
                return r1
            L47:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kp1.C22756e.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C22756e(HormonalInsightsApi api, InterfaceC26834e cachedApiSource, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.cachedApiSource = cachedApiSource;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m65888h(String str, InterfaceC30057d<? super AbstractC22755d> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f89511z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f89511z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f89509x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f89511z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f89508w = str;
            aVar2.f89511z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.f89508w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return AbstractC22755d.b.f89496a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new AbstractC22755d.a(str);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m65889i(String id4) {
        return new d(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new PregnancyInsightsGetByIdRequest(id4), 1), null, null, 3, null), new c(null, this.cachedApiSource)), this, id4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m65890j(String date) {
        return new f(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new PregnancyInsightsGetRequest(date), 1), null, null, 3, null), new e(null, this.cachedApiSource)), this, date);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new g(null, this));
    }

    public /* synthetic */ C22756e(HormonalInsightsApi hormonalInsightsApi, InterfaceC26834e interfaceC26834e, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hormonalInsightsApi, interfaceC26834e, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PregnancyInsightsInteractor") : interfaceC34116n);
    }
}
