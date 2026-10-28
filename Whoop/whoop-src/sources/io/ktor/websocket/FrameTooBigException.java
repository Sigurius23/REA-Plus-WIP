package io.ktor.websocket;

import bc3.InterfaceC3070x;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, m65681d2 = {"Lio/ktor/websocket/FrameTooBigException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lbc3/x;", "ktor-websockets"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class FrameTooBigException extends Exception implements InterfaceC3070x {
    @Override // bc3.InterfaceC3070x
    /* JADX INFO: renamed from: a */
    public final Throwable mo8826a() {
        FrameTooBigException frameTooBigException = new FrameTooBigException();
        frameTooBigException.initCause(this);
        return frameTooBigException;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Frame is too big: 0";
    }
}
