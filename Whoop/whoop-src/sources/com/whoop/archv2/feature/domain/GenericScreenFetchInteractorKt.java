package com.whoop.archv2.feature.domain;

import a12.AbstractC0142b;
import a12.C0141a;
import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pi0.C29249a;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lpi0/a;", "", "requestName", "Lcom/whoop/network/request/GetApiRequest;", "a", "(Lpi0/a;Ljava/lang/String;)Lcom/whoop/network/request/GetApiRequest;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class GenericScreenFetchInteractorKt {
    /* JADX INFO: renamed from: a */
    public static final GetApiRequest m17877a(final C29249a c29249a, final String requestName) {
        AbstractC22676k.m65750j(c29249a, "<this>");
        AbstractC22676k.m65750j(requestName, "requestName");
        final C0141a c0141aM360e = AbstractC0142b.m360e(c29249a.getApiRequest().getPath());
        if (c29249a.getManualRefresh()) {
            requestName = requestName.concat("_manualRefresh");
        }
        return new GetApiRequest(c0141aM360e, c29249a, requestName) { // from class: com.whoop.archv2.feature.domain.GenericScreenFetchInteractorKt$toGetApiRequest$1
            private final Map<String, String> parameters;
            private final String path;
            private final String tag;

            {
                this.path = c0141aM360e.getBasePath();
                this.parameters = AbstractC25247g0.m73995d0(c0141aM360e.m354b(), c29249a.m88855d());
                this.tag = requestName;
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
}
