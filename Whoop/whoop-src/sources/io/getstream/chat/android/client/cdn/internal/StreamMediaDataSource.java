package io.getstream.chat.android.client.cdn.internal;

import android.content.Context;
import io.getstream.chat.android.client.cdn.CDN;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p674z8.InterfaceC40169e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29203o;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/getstream/chat/android/client/cdn/CDN;", "cdn", "Lz8/e;", "factory", "(Landroid/content/Context;Lio/getstream/chat/android/client/cdn/CDN;)Lz8/e;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamMediaDataSource {
    public static final StreamMediaDataSource INSTANCE = new StreamMediaDataSource();

    private StreamMediaDataSource() {
    }

    public final InterfaceC40169e factory(Context context, CDN cdn) {
        AbstractC22676k.m65750j(context, "context");
        C29203o c29203o = new C29203o(context, 10);
        return cdn != null ? new CDNDataSourceFactory(cdn, c29203o) : c29203o;
    }
}
