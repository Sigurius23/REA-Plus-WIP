package com.whoop.whoopaction.domain.models;

import a12.AbstractC0142b;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;
import z02.InterfaceC39944a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/Request;", "", "requestName", "Lz02/a;", "toActionApiRequest", "(Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;)Lz02/a;", "whoop-action_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RequestExtensionsKt {
    public static final InterfaceC39944a<String> toActionApiRequest(Request request, String str) {
        AbstractC22676k.m65750j(request, "<this>");
        return new InterfaceC39944a<String>(AbstractC0142b.m360e(request.getPath()), request, str) { // from class: com.whoop.whoopaction.domain.models.RequestExtensionsKt.toActionApiRequest.1
            private final String body;
            private final boolean hasBody;
            private final HttpTimeoutConfig httpTimeoutConfig;
            private final C18181t method;
            private final Map<String, String> parameters;
            private final String path;
            private final String tag;

            {
                this.path = c0141a.getBasePath();
                this.parameters = c0141a.m354b();
                C18181t c18181t = C18181t.f70508b;
                String upperCase = request.getMethod().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                C18181t c18181t2 = C18181t.f70508b;
                if (!upperCase.equals(c18181t2.f70515a)) {
                    c18181t2 = C18181t.f70509c;
                    if (!upperCase.equals(c18181t2.f70515a)) {
                        c18181t2 = C18181t.f70510d;
                        if (!upperCase.equals(c18181t2.f70515a)) {
                            c18181t2 = C18181t.f70511e;
                            if (!upperCase.equals(c18181t2.f70515a)) {
                                c18181t2 = C18181t.f70512f;
                                if (!upperCase.equals(c18181t2.f70515a)) {
                                    c18181t2 = C18181t.f70513g;
                                    if (!upperCase.equals(c18181t2.f70515a)) {
                                        c18181t2 = C18181t.f70514h;
                                        if (!upperCase.equals(c18181t2.f70515a)) {
                                            c18181t2 = new C18181t(upperCase);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.method = c18181t2;
                JsonElement body = request.getBody();
                this.body = body != null ? body.toString() : null;
                this.hasBody = request.getBody() != null;
                Long timeoutMillis = request.getTimeoutMillis();
                this.httpTimeoutConfig = timeoutMillis != null ? new HttpTimeoutConfig(0L, 0L, timeoutMillis.longValue(), 3, (DefaultConstructorMarker) null) : null;
                this.tag = str;
            }

            @Override // z02.InterfaceC39944a
            public boolean getHasBody() {
                return this.hasBody;
            }

            @Override // z02.InterfaceC39944a
            public /* bridge */ Map<String, String> getHeaders() {
                return super.getHeaders();
            }

            @Override // z02.InterfaceC39944a
            public HttpTimeoutConfig getHttpTimeoutConfig() {
                return this.httpTimeoutConfig;
            }

            @Override // z02.InterfaceC39944a
            public C18181t getMethod() {
                return this.method;
            }

            @Override // z02.InterfaceC39944a
            public Map<String, String> getParameters() {
                return this.parameters;
            }

            @Override // z02.InterfaceC39944a
            public String getPath() {
                return this.path;
            }

            @Override // z02.InterfaceC39944a
            public String getTag() {
                return this.tag;
            }

            @Override // z02.InterfaceC39944a
            public /* bridge */ String url(AbstractC32943y abstractC32943y) {
                return super.url(abstractC32943y);
            }

            @Override // z02.InterfaceC39944a
            public String getBody() {
                return this.body;
            }
        };
    }

    public static /* synthetic */ InterfaceC39944a toActionApiRequest$default(Request request, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        return toActionApiRequest(request, str);
    }
}
