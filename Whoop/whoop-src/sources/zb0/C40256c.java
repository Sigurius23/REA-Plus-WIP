package zb0;

import c93.InterfaceC4351m;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.GetEditTestDetailsRequest;
import com.whoop.advancedlabs.domain.UpdateTestDetailsRequest;
import com.whoop.advancedlabs.domain.models.TestInputScreenResponse;
import com.whoop.data.repositories.FeatureFlagChecker;
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
import org.joda.time.DateTimeZone;
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
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: zb0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lzb0/c;", "Lod1/g;", "Lzb0/a;", "Lzb0/b;", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "", "testId", "Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Lec3/l;", "g", "i", "Lzb0/a$b;", "action", "j", "(Lzb0/a$b;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40256c implements InterfaceC27844g<AbstractC40254a, AbstractC40255b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: zb0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.edittestdetails.domain.EditTestDetailsInteractor$fetchCachedData$$inlined$cacheAPI$1", m100430f = "EditTestDetailsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f174086w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f174087x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f174088y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f174089z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f174089z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f174089z);
            aVar.f174087x = interfaceC13062m;
            aVar.f174088y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f174086w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f174087x;
                C26832c c26832c = (C26832c) this.f174088y;
                InterfaceC26834e interfaceC26834e = this.f174089z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(TestInputScreenResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(TestInputScreenResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f174087x = null;
                this.f174088y = null;
                this.f174086w = 1;
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

    /* JADX INFO: renamed from: zb0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f174090w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f174091x;

        /* JADX INFO: renamed from: zb0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f174092w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f174093x;

            /* JADX INFO: renamed from: zb0.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.edittestdetails.domain.EditTestDetailsInteractor$fetchCachedData$$inlined$map$1$2", m100430f = "EditTestDetailsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42740a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f174094E;

                /* JADX INFO: renamed from: F */
                Object f174095F;

                /* JADX INFO: renamed from: G */
                Object f174096G;

                /* JADX INFO: renamed from: H */
                int f174097H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f174098w;

                /* JADX INFO: renamed from: x */
                int f174099x;

                /* JADX INFO: renamed from: y */
                Object f174100y;

                public C42740a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f174098w = obj;
                    this.f174099x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str) {
                this.f174092w = interfaceC13062m;
                this.f174093x = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42740a c42740a;
                Object fVar;
                if (interfaceC30057d instanceof C42740a) {
                    c42740a = (C42740a) interfaceC30057d;
                    int i13 = c42740a.f174099x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42740a.f174099x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42740a = new C42740a(interfaceC30057d);
                    }
                } else {
                    c42740a = new C42740a(interfaceC30057d);
                }
                Object obj2 = c42740a.f174098w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42740a.f174099x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f174092w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a) {
                        fVar = new AbstractC40255b.f(this.f174093x, (TestInputScreenResponse) ((InterfaceC29354a.a) interfaceC29354a).getData());
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        fVar = new AbstractC40255b.f(this.f174093x, (TestInputScreenResponse) ((InterfaceC29354a.d) interfaceC29354a).getData());
                    } else if (interfaceC29354a instanceof InterfaceC29354a.c) {
                        fVar = AbstractC40255b.a.f174074a;
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fVar = AbstractC40255b.b.f174075a;
                    }
                    c42740a.f174100y = null;
                    c42740a.f174094E = null;
                    c42740a.f174095F = null;
                    c42740a.f174096G = null;
                    c42740a.f174097H = 0;
                    c42740a.f174099x = 1;
                    if (interfaceC13062m.emit(fVar, c42740a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, String str) {
            this.f174090w = interfaceC13058l;
            this.f174091x = str;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f174090w.collect(new a(interfaceC13062m, this.f174091x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zb0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.edittestdetails.domain.EditTestDetailsInteractor$fetchRemoteData$1", m100430f = "EditTestDetailsInteractor.kt", m100431l = {76, 80, 81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lzb0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f174102E;

        /* JADX INFO: renamed from: w */
        Object f174103w;

        /* JADX INFO: renamed from: x */
        int f174104x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f174105y;

        /* JADX INFO: renamed from: zb0.c$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.edittestdetails.domain.EditTestDetailsInteractor$fetchRemoteData$1$response$1", m100430f = "EditTestDetailsInteractor.kt", m100431l = {77}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f174107w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40256c f174108x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f174109y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C40256c c40256c, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f174108x = c40256c;
                this.f174109y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f174108x, this.f174109y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f174107w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AdvancedLabsApi advancedLabsApi = this.f174108x.api;
                String str = this.f174109y;
                this.f174107w = 1;
                Object editTestDetails = advancedLabsApi.getEditTestDetails(str, this);
                return editTestDetails == enumC31071a ? enumC31071a : editTestDetails;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super TestInputScreenResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f174102E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C40256c.this.new c(this.f174102E, interfaceC30057d);
            cVar.f174105y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f174105y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f174104x
                r10 = 3
                r11 = 2
                r1 = 1
                r12 = 0
                if (r0 == 0) goto L2b
                if (r0 == r1) goto L26
                if (r0 == r11) goto L1e
                if (r0 != r10) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1e:
                java.lang.Object r0 = r13.f174103w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L86
            L26:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L51
            L2b:
                p505ts.AbstractC34132o.m107864I(r14)
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                zb0.c r2 = zb0.C40256c.this
                tr2.n r2 = zb0.C40256c.m129260e(r2)
                zb0.c$c$a r4 = new zb0.c$c$a
                zb0.c r3 = zb0.C40256c.this
                java.lang.String r6 = r13.f174102E
                r4.<init>(r3, r6, r12)
                r13.f174105y = r8
                r13.f174104x = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "Failed to fetch edit test details"
                r6 = 2
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L51
                goto L85
            L51:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L73
                zb0.b$f r1 = new zb0.b$f
                java.lang.String r2 = r13.f174102E
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.advancedlabs.domain.models.TestInputScreenResponse r0 = (com.whoop.advancedlabs.domain.models.TestInputScreenResponse) r0
                r1.<init>(r2, r0)
                r13.f174105y = r12
                r13.f174103w = r12
                r13.f174104x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto L86
                goto L85
            L73:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L89
                zb0.b$a r0 = zb0.AbstractC40255b.a.f174074a
                r13.f174105y = r12
                r13.f174103w = r12
                r13.f174104x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L86
            L85:
                return r9
            L86:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L89:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zb0.C40256c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zb0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.edittestdetails.domain.EditTestDetailsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "EditTestDetailsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f174110w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f174111x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f174112y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C40256c f174113z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C40256c c40256c) {
            super(3, interfaceC30057d);
            this.f174113z = c40256c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC40254a abstractC40254a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f174113z);
            dVar.f174111x = interfaceC13062m;
            dVar.f174112y = abstractC40254a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f174110w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f174111x;
                C13084s1 c13084s1 = new C13084s1(new e((AbstractC40254a) this.f174112y, this.f174113z, null));
                this.f174111x = null;
                this.f174112y = null;
                this.f174110w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC40254a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: zb0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.edittestdetails.domain.EditTestDetailsInteractor$interact$1$1", m100430f = "EditTestDetailsInteractor.kt", m100431l = {37, 39, 41, 45, 46, 47}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lzb0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C40256c f174114E;

        /* JADX INFO: renamed from: w */
        Object f174115w;

        /* JADX INFO: renamed from: x */
        int f174116x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f174117y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC40254a f174118z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC40254a abstractC40254a, C40256c c40256c, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f174118z = abstractC40254a;
            this.f174114E = c40256c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f174118z, this.f174114E, interfaceC30057d);
            eVar.f174117y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:35:0x00a1 A[PHI: r6
          0x00a1: PHI (r6v20 java.lang.Object) = (r6v18 java.lang.Object), (r6v0 java.lang.Object) binds: [B:33:0x009e, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r6, r5) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
        
            if (r0.emit((zb0.AbstractC40255b) r6, r5) == r1) goto L37;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zb0.C40256c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zb0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.edittestdetails.domain.EditTestDetailsInteractor", m100430f = "EditTestDetailsInteractor.kt", m100431l = {93}, m100432m = "saveData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f174120F;

        /* JADX INFO: renamed from: w */
        Object f174121w;

        /* JADX INFO: renamed from: x */
        Object f174122x;

        /* JADX INFO: renamed from: y */
        Object f174123y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f174124z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f174124z = obj;
            this.f174120F |= Integer.MIN_VALUE;
            return C40256c.this.m129265j(null, this);
        }
    }

    /* JADX INFO: renamed from: zb0.c$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.edittestdetails.domain.EditTestDetailsInteractor$saveData$response$1", m100430f = "EditTestDetailsInteractor.kt", m100431l = {94}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f174125w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC40254a.b f174127y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ UpdateTestDetailsRequest f174128z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC40254a.b bVar, UpdateTestDetailsRequest updateTestDetailsRequest, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f174127y = bVar;
            this.f174128z = updateTestDetailsRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40256c.this.new g(this.f174127y, this.f174128z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f174125w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AdvancedLabsApi advancedLabsApi = C40256c.this.api;
                String testId = this.f174127y.getTestId();
                UpdateTestDetailsRequest updateTestDetailsRequest = this.f174128z;
                this.f174125w = 1;
                if (advancedLabsApi.updateTestDetails(testId, updateTestDetailsRequest, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C40256c(InterfaceC26834e cachedApiSource, AdvancedLabsApi api, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.api = api;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC13058l m129262g(String testId) {
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetEditTestDetailsRequest(testId), 1), AbstractC12350b.m34570S("AdvancedLabsScope"), null, 2, null), new a(null, this.cachedApiSource)), testId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m129263h(String testId) {
        return this.featureFlagChecker.isFeatureEnabled("advanced-labs-android-caching") ? m129262g(testId) : m129264i(testId);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC13058l m129264i(String testId) {
        return new C13084s1(new c(testId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m129265j(AbstractC40254a.b bVar, InterfaceC30057d<? super AbstractC40255b> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f174120F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f174120F = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM108729b = fVar2.f174124z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f174120F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            String string = bVar.getTestDateTime().toDateTime().withZone(DateTimeZone.UTC).toString("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
            String testName = bVar.getTestName();
            AbstractC22676k.m65747g(string);
            UpdateTestDetailsRequest updateTestDetailsRequest = new UpdateTestDetailsRequest(testName, string);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            g gVar = new g(bVar, updateTestDetailsRequest, null);
            fVar2.f174121w = null;
            fVar2.f174122x = null;
            fVar2.f174123y = null;
            fVar2.f174120F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to save test details", gVar, fVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return AbstractC40255b.e.f174078a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC40255b.c.f174076a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new d(null, this));
    }

    public /* synthetic */ C40256c(InterfaceC26834e interfaceC26834e, AdvancedLabsApi advancedLabsApi, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, advancedLabsApi, featureFlagChecker, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("EditTestDetailsInteractor") : interfaceC34116n);
    }
}
