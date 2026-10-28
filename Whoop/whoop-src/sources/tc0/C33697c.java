package tc0;

import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.GetInsightsDeepDiveRequest;
import com.whoop.advancedlabs.domain.models.ClinicalInsightsResponse;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.C13054k;
import ec3.C13060l1;
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
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: tc0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010*\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010*\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Ltc0/c;", "Lod1/g;", "Ltc0/a;", "Ltc0/b;", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Lqw2/c;", "actionInteractor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lqw2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Lec3/l;", "Lqw2/a;", "Lqw2/b;", "i", "(Lec3/l;)Lec3/l;", "k", "Ltc0/c$a;", "j", "", "insightsId", "g", "(Ljava/lang/String;)Lec3/l;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "upstream", "interact", "a", "Lnm0/e;", "b", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "c", "Lqw2/c;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33697c implements InterfaceC27844g<AbstractC33695a, AbstractC33696b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: tc0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, m65681d2 = {"Ltc0/c$a;", "", "Ltc0/a;", "action", "", "savedInsightsId", "<init>", "(Ltc0/a;Ljava/lang/String;)V", "a", "()Ltc0/a;", "b", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltc0/a;", "getAction", "Ljava/lang/String;", "c", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33695a action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String savedInsightsId;

        public a(AbstractC33695a action, String str) {
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
            this.savedInsightsId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC33695a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSavedInsightsId() {
            return this.savedInsightsId;
        }

        /* JADX INFO: renamed from: c */
        public final String m106468c() {
            return this.savedInsightsId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.action, aVar.action) && AbstractC22676k.m65745e(this.savedInsightsId, aVar.savedInsightsId);
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            String str = this.savedInsightsId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ActionWithInsightsId(action=" + this.action + ", savedInsightsId=" + this.savedInsightsId + ")";
        }
    }

    /* JADX INFO: renamed from: tc0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$fetchCachedData$$inlined$cacheAPI$1", m100430f = "InsightsDeepDiveInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f140802w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f140803x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f140804y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f140805z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f140805z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f140805z);
            bVar.f140803x = interfaceC13062m;
            bVar.f140804y = c26832c;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140802w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f140803x;
                C26832c c26832c = (C26832c) this.f140804y;
                InterfaceC26834e interfaceC26834e = this.f140805z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ClinicalInsightsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ClinicalInsightsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f140803x = null;
                this.f140804y = null;
                this.f140802w = 1;
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

    /* JADX INFO: renamed from: tc0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f140806w;

        /* JADX INFO: renamed from: tc0.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140807w;

            /* JADX INFO: renamed from: tc0.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$fetchCachedData$$inlined$map$1$2", m100430f = "InsightsDeepDiveInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42368a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f140808E;

                /* JADX INFO: renamed from: F */
                Object f140809F;

                /* JADX INFO: renamed from: G */
                Object f140810G;

                /* JADX INFO: renamed from: H */
                int f140811H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140812w;

                /* JADX INFO: renamed from: x */
                int f140813x;

                /* JADX INFO: renamed from: y */
                Object f140814y;

                public C42368a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140812w = obj;
                    this.f140813x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f140807w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42368a c42368a;
                Object dVar;
                if (interfaceC30057d instanceof C42368a) {
                    c42368a = (C42368a) interfaceC30057d;
                    int i13 = c42368a.f140813x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42368a.f140813x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42368a = new C42368a(interfaceC30057d);
                    }
                } else {
                    c42368a = new C42368a(interfaceC30057d);
                }
                Object obj2 = c42368a.f140812w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42368a.f140813x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f140807w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a) {
                        dVar = new AbstractC33696b.d((ClinicalInsightsResponse) ((InterfaceC29354a.a) interfaceC29354a).getData());
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        dVar = new AbstractC33696b.d((ClinicalInsightsResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData());
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        dVar = new AbstractC33696b.d((ClinicalInsightsResponse) ((InterfaceC29354a.d) interfaceC29354a).getData());
                    } else if ((interfaceC29354a instanceof InterfaceC29354a.b) || (interfaceC29354a instanceof InterfaceC29354a.c)) {
                        dVar = AbstractC33696b.a.f140790a;
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = AbstractC33696b.b.f140791a;
                    }
                    c42368a.f140814y = null;
                    c42368a.f140808E = null;
                    c42368a.f140809F = null;
                    c42368a.f140810G = null;
                    c42368a.f140811H = 0;
                    c42368a.f140813x = 1;
                    if (interfaceC13062m.emit(dVar, c42368a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f140806w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f140806w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tc0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f140816w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33697c f140817x;

        /* JADX INFO: renamed from: tc0.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140818w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33697c f140819x;

            /* JADX INFO: renamed from: tc0.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$fetchRemoteData$$inlined$map$1$2", m100430f = "InsightsDeepDiveInteractor.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42369a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f140820E;

                /* JADX INFO: renamed from: F */
                Object f140821F;

                /* JADX INFO: renamed from: G */
                Object f140822G;

                /* JADX INFO: renamed from: H */
                Object f140823H;

                /* JADX INFO: renamed from: I */
                Object f140824I;

                /* JADX INFO: renamed from: J */
                Object f140825J;

                /* JADX INFO: renamed from: K */
                int f140826K;

                /* JADX INFO: renamed from: L */
                int f140827L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140828w;

                /* JADX INFO: renamed from: x */
                int f140829x;

                /* JADX INFO: renamed from: y */
                Object f140830y;

                public C42369a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140828w = obj;
                    this.f140829x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33697c c33697c) {
                this.f140818w = interfaceC13062m;
                this.f140819x = c33697c;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
            
                if (r1.emit(r2, r6) == r0) goto L29;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                /*
                    Method dump skipped, instruction units count: 207
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: tc0.C33697c.d.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public d(InterfaceC13058l interfaceC13058l, C33697c c33697c) {
            this.f140816w = interfaceC13058l;
            this.f140817x = c33697c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f140816w.collect(new a(interfaceC13062m, this.f140817x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tc0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$fetchRemoteData$1$response$1", m100430f = "InsightsDeepDiveInteractor.kt", m100431l = {161}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f140832w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f140834y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f140834y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C33697c.this.new e(this.f140834y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140832w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C33697c.this.api;
            String str = this.f140834y;
            this.f140832w = 1;
            Object insightsDeepDive = advancedLabsApi.getInsightsDeepDive(str, this);
            return insightsDeepDive == enumC31071a ? enumC31071a : insightsDeepDive;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ClinicalInsightsResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: tc0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f140835w;

        /* JADX INFO: renamed from: tc0.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140836w;

            /* JADX INFO: renamed from: tc0.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$interact$$inlined$filterIsInstance$1$2", m100430f = "InsightsDeepDiveInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42370a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f140838F;

                /* JADX INFO: renamed from: G */
                Object f140839G;

                /* JADX INFO: renamed from: H */
                int f140840H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140841w;

                /* JADX INFO: renamed from: x */
                int f140842x;

                /* JADX INFO: renamed from: y */
                Object f140843y;

                /* JADX INFO: renamed from: z */
                Object f140844z;

                public C42370a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140841w = obj;
                    this.f140842x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f140836w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42370a c42370a;
                if (interfaceC30057d instanceof C42370a) {
                    c42370a = (C42370a) interfaceC30057d;
                    int i13 = c42370a.f140842x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42370a.f140842x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42370a = new C42370a(interfaceC30057d);
                    }
                } else {
                    c42370a = new C42370a(interfaceC30057d);
                }
                Object obj2 = c42370a.f140841w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42370a.f140842x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f140836w;
                    if (obj instanceof AbstractC33695a.a) {
                        c42370a.f140843y = null;
                        c42370a.f140844z = null;
                        c42370a.f140838F = null;
                        c42370a.f140839G = null;
                        c42370a.f140840H = 0;
                        c42370a.f140842x = 1;
                        if (interfaceC13062m.emit(obj, c42370a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f140835w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f140835w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tc0.c$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f140845w;

        /* JADX INFO: renamed from: tc0.c$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140846w;

            /* JADX INFO: renamed from: tc0.c$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$interact$$inlined$filterNot$1$2", m100430f = "InsightsDeepDiveInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42371a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f140848F;

                /* JADX INFO: renamed from: G */
                Object f140849G;

                /* JADX INFO: renamed from: H */
                int f140850H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140851w;

                /* JADX INFO: renamed from: x */
                int f140852x;

                /* JADX INFO: renamed from: y */
                Object f140853y;

                /* JADX INFO: renamed from: z */
                Object f140854z;

                public C42371a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140851w = obj;
                    this.f140852x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f140846w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42371a c42371a;
                if (interfaceC30057d instanceof C42371a) {
                    c42371a = (C42371a) interfaceC30057d;
                    int i13 = c42371a.f140852x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42371a.f140852x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42371a = new C42371a(interfaceC30057d);
                    }
                } else {
                    c42371a = new C42371a(interfaceC30057d);
                }
                Object obj2 = c42371a.f140851w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42371a.f140852x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f140846w;
                    if (!(((AbstractC33695a) obj) instanceof AbstractC33695a.a)) {
                        c42371a.f140853y = null;
                        c42371a.f140854z = null;
                        c42371a.f140848F = null;
                        c42371a.f140849G = null;
                        c42371a.f140850H = 0;
                        c42371a.f140852x = 1;
                        if (interfaceC13062m.emit(obj, c42371a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f140845w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f140845w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tc0.c$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$interact$$inlined$flatMapLatest$1", m100430f = "InsightsDeepDiveInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f140855w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f140856x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f140857y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C33697c f140858z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, C33697c c33697c) {
            super(3, interfaceC30057d);
            this.f140858z = c33697c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, a aVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f140858z);
            hVar.f140856x = interfaceC13062m;
            hVar.f140857y = aVar;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140855w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f140856x;
                a aVar = (a) this.f140857y;
                AbstractC33695a action = aVar.getAction();
                String savedInsightsId = aVar.getSavedInsightsId();
                if ((action instanceof AbstractC33695a.c) || (action instanceof AbstractC33695a.e)) {
                    if (savedInsightsId == null || AbstractC39414r.m125890i0(savedInsightsId)) {
                        this.f140858z.logger.mo85222m("Refresh/LoadData action without valid insightsId", new AbstractC30556a.a[0]);
                        c0456u = new C0456u(AbstractC33696b.a.f140790a, 1);
                    } else {
                        c0456u = this.f140858z.m106461g(savedInsightsId);
                    }
                } else if (action instanceof AbstractC33695a.b) {
                    c0456u = new C0456u(((AbstractC33695a.b) action).getDomainState(), 1);
                } else {
                    if (!(action instanceof AbstractC33695a.a) && !(action instanceof AbstractC33695a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0456u = C13054k.f45116w;
                }
                this.f140856x = null;
                this.f140857y = null;
                this.f140855w = 1;
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
            return invoke((InterfaceC13062m) obj, (a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: tc0.c$i */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f140859w;

        /* JADX INFO: renamed from: tc0.c$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140860w;

            /* JADX INFO: renamed from: tc0.c$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$interact$$inlined$map$1$2", m100430f = "InsightsDeepDiveInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42372a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f140861E;

                /* JADX INFO: renamed from: F */
                Object f140862F;

                /* JADX INFO: renamed from: G */
                Object f140863G;

                /* JADX INFO: renamed from: H */
                int f140864H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140865w;

                /* JADX INFO: renamed from: x */
                int f140866x;

                /* JADX INFO: renamed from: y */
                Object f140867y;

                public C42372a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140865w = obj;
                    this.f140866x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f140860w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42372a c42372a;
                if (interfaceC30057d instanceof C42372a) {
                    c42372a = (C42372a) interfaceC30057d;
                    int i13 = c42372a.f140866x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42372a.f140866x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42372a = new C42372a(interfaceC30057d);
                    }
                } else {
                    c42372a = new C42372a(interfaceC30057d);
                }
                Object obj2 = c42372a.f140865w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42372a.f140866x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f140860w;
                    InterfaceC30693a actionDomainAction = ((AbstractC33695a.a) obj).getActionDomainAction();
                    c42372a.f140867y = null;
                    c42372a.f140861E = null;
                    c42372a.f140862F = null;
                    c42372a.f140863G = null;
                    c42372a.f140864H = 0;
                    c42372a.f140866x = 1;
                    if (interfaceC13062m.emit(actionDomainAction, c42372a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l) {
            this.f140859w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f140859w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tc0.c$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$saveInsightsIdForRefresh$1", m100430f = "InsightsDeepDiveInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ltc0/c$a;", "accumulator", "Ltc0/a;", "domainAction", "<anonymous>", "(Ltc0/c$a;Ltc0/a;)Ltc0/c$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f140869w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f140870x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f140871y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, AbstractC33695a abstractC33695a, InterfaceC30057d<? super a> interfaceC30057d) {
            j jVar = new j(interfaceC30057d);
            jVar.f140870x = aVar;
            jVar.f140871y = abstractC33695a;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String strM106468c;
            a aVar = (a) this.f140870x;
            AbstractC33695a abstractC33695a = (AbstractC33695a) this.f140871y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f140869w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC33695a instanceof AbstractC33695a.c) {
                AbstractC33695a.c cVar = (AbstractC33695a.c) abstractC33695a;
                strM106468c = !AbstractC39414r.m125890i0(cVar.getInsightsId()) ? cVar.getInsightsId() : aVar.m106468c();
            } else {
                strM106468c = aVar.m106468c();
            }
            return new a(abstractC33695a, strM106468c);
        }
    }

    /* JADX INFO: renamed from: tc0.c$k */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f140872w;

        /* JADX INFO: renamed from: tc0.c$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140873w;

            /* JADX INFO: renamed from: tc0.c$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$toInsightsDeepDiveDomainResult$$inlined$mapNotNull$1$2", m100430f = "InsightsDeepDiveInteractor.kt", m100431l = {68}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42373a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f140874E;

                /* JADX INFO: renamed from: F */
                Object f140875F;

                /* JADX INFO: renamed from: G */
                Object f140876G;

                /* JADX INFO: renamed from: H */
                Object f140877H;

                /* JADX INFO: renamed from: I */
                int f140878I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140879w;

                /* JADX INFO: renamed from: x */
                int f140880x;

                /* JADX INFO: renamed from: y */
                Object f140881y;

                public C42373a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140879w = obj;
                    this.f140880x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f140873w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42373a c42373a;
                Object bVar;
                if (interfaceC30057d instanceof C42373a) {
                    c42373a = (C42373a) interfaceC30057d;
                    int i13 = c42373a.f140880x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42373a.f140880x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42373a = new C42373a(interfaceC30057d);
                    }
                } else {
                    c42373a = new C42373a(interfaceC30057d);
                }
                Object obj2 = c42373a.f140879w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42373a.f140880x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f140873w;
                    AbstractC30694b abstractC30694b = (AbstractC30694b) obj;
                    if (abstractC30694b instanceof AbstractC30694b.a) {
                        bVar = new AbstractC33695a.b(AbstractC33696b.a.f140790a);
                    } else if (abstractC30694b instanceof AbstractC30694b.f) {
                        bVar = AbstractC33695a.e.f140789a;
                    } else if ((abstractC30694b instanceof AbstractC30694b.c) || (abstractC30694b instanceof AbstractC30694b.i)) {
                        bVar = new AbstractC33695a.b(AbstractC33696b.b.f140791a);
                    } else {
                        bVar = abstractC30694b instanceof AbstractC30694b.d ? new AbstractC33695a.b(new AbstractC33696b.c(((AbstractC30694b.d) abstractC30694b).getDestination())) : null;
                    }
                    if (bVar != null) {
                        c42373a.f140881y = null;
                        c42373a.f140874E = null;
                        c42373a.f140875F = null;
                        c42373a.f140876G = null;
                        c42373a.f140877H = null;
                        c42373a.f140878I = 0;
                        c42373a.f140880x = 1;
                        if (interfaceC13062m.emit(bVar, c42373a) == enumC31071a) {
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

        public k(InterfaceC13058l interfaceC13058l) {
            this.f140872w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f140872w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C33697c(InterfaceC26834e cachedApiSource, AdvancedLabsApi api, C30695c actionInteractor, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.api = api;
        this.actionInteractor = actionInteractor;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC13058l m106460f(String insightsId) {
        return new c(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetInsightsDeepDiveRequest(insightsId), 1), AbstractC12350b.m34570S("AdvancedLabsScope"), null, 2, null), new b(null, this.cachedApiSource)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m106461g(String insightsId) {
        return this.featureFlagChecker.isFeatureEnabled("advanced-labs-android-caching") ? m106460f(insightsId) : m106462h(insightsId);
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC13058l m106462h(String insightsId) {
        return new d(new C0456u(insightsId, 1), this);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC13058l m106463i(InterfaceC13058l interfaceC13058l) {
        return this.actionInteractor.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC13058l m106464j(InterfaceC13058l interfaceC13058l) {
        return AbstractC13091v.m36612v(new C13060l1(new a(AbstractC33695a.d.f140788a, null), interfaceC13058l, new j(null)), 1);
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC13058l m106465k(InterfaceC13058l interfaceC13058l) {
        return new k(interfaceC13058l);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(m106464j(AbstractC13091v.m36584J(m106465k(m106463i(new i(new f(upstream)))), new g(upstream))), new h(null, this));
    }

    public /* synthetic */ C33697c(InterfaceC26834e interfaceC26834e, AdvancedLabsApi advancedLabsApi, C30695c c30695c, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, advancedLabsApi, c30695c, featureFlagChecker, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("InsightsDeepDiveInteractor") : interfaceC34116n);
    }
}
