package io.ktor.client.plugins;

import f63.AbstractC14155c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/ktor/client/plugins/ResponseException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public class ResponseException extends IllegalStateException {

    /* JADX INFO: renamed from: w */
    public final transient AbstractC14155c f74974w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseException(AbstractC14155c response, String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + '\"');
        AbstractC22676k.m65750j(response, "response");
        AbstractC22676k.m65750j(cachedResponseText, "cachedResponseText");
        this.f74974w = response;
    }
}
