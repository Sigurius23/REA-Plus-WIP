package io.ktor.client.engine;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/ktor/client/engine/ClientEngineClosedException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ClientEngineClosedException extends IllegalStateException {
    public ClientEngineClosedException() {
        this(0);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    public ClientEngineClosedException(int i13) {
        super("Client already closed");
    }
}
