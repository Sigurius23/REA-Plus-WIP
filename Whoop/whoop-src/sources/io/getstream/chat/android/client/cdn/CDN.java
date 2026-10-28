package io.getstream.chat.android.client.cdn;

import io.getstream.chat.android.client.api.QueryParams;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/cdn/CDN;", "", "", QueryParams.URL, "Lio/getstream/chat/android/client/cdn/CDNRequest;", "imageRequest", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "fileRequest", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface CDN {
    static /* synthetic */ Object fileRequest$suspendImpl(CDN cdn, String str, InterfaceC30057d<? super CDNRequest> interfaceC30057d) {
        return new CDNRequest(str, null, 2, null);
    }

    static /* synthetic */ Object imageRequest$suspendImpl(CDN cdn, String str, InterfaceC30057d<? super CDNRequest> interfaceC30057d) {
        return new CDNRequest(str, null, 2, null);
    }

    default Object fileRequest(String str, InterfaceC30057d<? super CDNRequest> interfaceC30057d) {
        return fileRequest$suspendImpl(this, str, interfaceC30057d);
    }

    default Object imageRequest(String str, InterfaceC30057d<? super CDNRequest> interfaceC30057d) {
        return imageRequest$suspendImpl(this, str, interfaceC30057d);
    }
}
