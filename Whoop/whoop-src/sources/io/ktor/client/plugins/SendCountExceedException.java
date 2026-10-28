package io.ktor.client.plugins;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/ktor/client/plugins/SendCountExceedException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class SendCountExceedException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendCountExceedException(String message) {
        super(message);
        AbstractC22676k.m65750j(message, "message");
    }
}
