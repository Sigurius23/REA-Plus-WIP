package com.whoop.archv2.feature.domain;

import a12.AbstractC0142b;
import a12.C0141a;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.archv2.model.template.PaginatedListResponse;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u02.InterfaceC34385a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;", "", "Lu02/c;", "apiClient", "Ltr2/n;", "logger", "<init>", "(Lu02/c;Ltr2/n;)V", "Lcom/whoop/navigation/models/ApiRequest;", "Lcom/whoop/network/request/GetApiRequest;", "d", "(Lcom/whoop/navigation/models/ApiRequest;)Lcom/whoop/network/request/GetApiRequest;", "request", "Lu02/a;", "Lcom/whoop/archv2/model/template/PaginatedListResponse;", "c", "(Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)Ljava/lang/Object;", "a", "Lu02/c;", "b", "Ltr2/n;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GenericLoadMoreInteractor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.GenericLoadMoreInteractor$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericLoadMoreInteractor$fetch$2", m100430f = "GenericLoadMoreInteractor.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER, 36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/archv2/model/template/PaginatedListResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C5992a extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ ApiRequest f23681E;

        /* JADX INFO: renamed from: w */
        Object f23682w;

        /* JADX INFO: renamed from: x */
        int f23683x;

        /* JADX INFO: renamed from: y */
        int f23684y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5992a(ApiRequest apiRequest, InterfaceC30057d<? super C5992a> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f23681E = apiRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return GenericLoadMoreInteractor.this.new C5992a(this.f23681E, interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        
            if (r9 == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.f23684y
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r8.f23682w
                f63.c r0 = (f63.AbstractC14155c) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L77
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L4e
            L20:
                p505ts.AbstractC34132o.m107864I(r9)
                com.whoop.archv2.feature.domain.GenericLoadMoreInteractor r9 = com.whoop.archv2.feature.domain.GenericLoadMoreInteractor.this
                u02.c r9 = com.whoop.archv2.feature.domain.GenericLoadMoreInteractor.m17873a(r9)
                com.whoop.archv2.feature.domain.GenericLoadMoreInteractor r1 = com.whoop.archv2.feature.domain.GenericLoadMoreInteractor.this
                com.whoop.navigation.models.ApiRequest r4 = r8.f23681E
                com.whoop.network.request.GetApiRequest r1 = com.whoop.archv2.feature.domain.GenericLoadMoreInteractor.m17874b(r1, r4)
                java.lang.Class<com.whoop.network.request.GetApiRequest> r4 = com.whoop.network.request.GetApiRequest.class
                j93.a0 r5 = p715kotlin.jvm.internal.AbstractC22671h0.m65691d(r4)
                java.lang.reflect.Type r6 = j93.AbstractC21478l0.m60396B(r5)
                kotlin.jvm.internal.i0 r7 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r4 = r7.getOrCreateKotlinClass(r4)
                s63.a r4 = ge3.AbstractC15751g.m44445Y(r4, r5, r6)
                r8.f23684y = r3
                java.lang.Object r9 = r9.m108748d(r1, r4, r8)
                if (r9 != r0) goto L4e
                goto L76
            L4e:
                f63.c r9 = (f63.AbstractC14155c) r9
                w53.b r9 = r9.mo13321a()
                java.lang.Class<com.whoop.archv2.model.template.PaginatedListResponse> r1 = com.whoop.archv2.model.template.PaginatedListResponse.class
                j93.a0 r3 = p715kotlin.jvm.internal.AbstractC22671h0.m65691d(r1)
                java.lang.reflect.Type r4 = j93.AbstractC21478l0.m60396B(r3)
                kotlin.jvm.internal.i0 r5 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r1 = r5.getOrCreateKotlinClass(r1)
                s63.a r1 = ge3.AbstractC15751g.m44445Y(r1, r3, r4)
                r3 = 0
                r8.f23682w = r3
                r3 = 0
                r8.f23683x = r3
                r8.f23684y = r2
                java.lang.Object r9 = r9.m118137a(r1, r8)
                if (r9 != r0) goto L77
            L76:
                return r0
            L77:
                if (r9 == 0) goto L7c
                com.whoop.archv2.model.template.PaginatedListResponse r9 = (com.whoop.archv2.model.template.PaginatedListResponse) r9
                return r9
            L7c:
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type com.whoop.archv2.model.template.PaginatedListResponse"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.GenericLoadMoreInteractor.C5992a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PaginatedListResponse> interfaceC30057d) {
            return ((C5992a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public GenericLoadMoreInteractor(C34387c apiClient, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(logger, "logger");
        this.apiClient = apiClient;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final GetApiRequest m17875d(ApiRequest apiRequest) {
        final C0141a c0141aM360e = AbstractC0142b.m360e(apiRequest.getPath());
        return new GetApiRequest(c0141aM360e) { // from class: com.whoop.archv2.feature.domain.GenericLoadMoreInteractor$toGetApiRequest$1
            private final Map<String, String> parameters;
            private final String path;
            private final String tag = "load_more";

            {
                this.path = c0141aM360e.getBasePath();
                this.parameters = c0141aM360e.m354b();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ boolean getHasBody() {
                return super.getHasBody();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ Map<String, String> getHeaders() {
                return super.getHeaders();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
                return super.getHttpTimeoutConfig();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ C18181t getMethod() {
                return super.getMethod();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public Map<String, String> getParameters() {
                return this.parameters;
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public String getPath() {
                return this.path;
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public String getTag() {
                return this.tag;
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ String url(AbstractC32943y abstractC32943y) {
                return super.url(abstractC32943y);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, l83.a0] */
            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ C23454a0 getBody() {
                return super.getBody();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final Object m17876c(ApiRequest apiRequest, InterfaceC30057d<? super InterfaceC34385a<PaginatedListResponse>> interfaceC30057d) {
        return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, AbstractC11266d.m30461o("Failed to load more at path ", apiRequest.getPath()), new C5992a(apiRequest, null), interfaceC30057d, 2, null);
    }

    public /* synthetic */ GenericLoadMoreInteractor(C34387c c34387c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34387c, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("GenericLoadMoreInteractor") : interfaceC34116n);
    }
}
