package io.ktor.client.network.sockets;

import java.net.ConnectException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lio/ktor/client/network/sockets/ConnectTimeoutException;", "Ljava/net/ConnectException;", "ktor-client-core"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ConnectTimeoutException extends ConnectException {

    /* JADX INFO: renamed from: w */
    public final java.net.SocketTimeoutException f74970w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectTimeoutException(String message, java.net.SocketTimeoutException socketTimeoutException) {
        super(message);
        AbstractC22676k.m65750j(message, "message");
        this.f74970w = socketTimeoutException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f74970w;
    }
}
