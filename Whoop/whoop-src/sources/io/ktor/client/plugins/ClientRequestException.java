package io.ktor.client.plugins;

import f63.AbstractC14155c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lio/ktor/client/plugins/ClientRequestException;", "Lio/ktor/client/plugins/ResponseException;", "ktor-client-core"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ClientRequestException extends ResponseException {

    /* JADX INFO: renamed from: x */
    public final String f74972x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientRequestException(AbstractC14155c response, String cachedResponseText) {
        super(response, cachedResponseText);
        AbstractC22676k.m65750j(response, "response");
        AbstractC22676k.m65750j(cachedResponseText, "cachedResponseText");
        this.f74972x = "Client request(" + response.mo13321a().m118139c().getMethod().f70515a + ' ' + response.mo13321a().m118139c().getUrl() + ") invalid: " + response.mo13325e() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f74972x;
    }
}
