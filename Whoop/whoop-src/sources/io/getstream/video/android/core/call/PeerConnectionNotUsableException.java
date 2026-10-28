package io.getstream.video.android.core.call;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio/getstream/video/android/core/call/PeerConnectionNotUsableException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class PeerConnectionNotUsableException extends Exception {
    public PeerConnectionNotUsableException() {
        super("Peer connections are not usable after fast reconnect");
    }
}
