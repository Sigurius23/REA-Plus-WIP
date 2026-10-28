package io.getstream.chat.android.p226ui.common.images.internal;

import android.content.Context;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.common.images.StreamImageLoaderFactory;
import p461rh.InterfaceC31425n;
import p461rh.InterfaceC31432u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u00020\u0006*\u00020\u00048À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lrh/n;", "newImageLoader", "(Landroid/content/Context;)Lrh/n;", "Lrh/u;", "newImageLoaderFactory", "()Lrh/u;", "factory", "Ll83/a0;", "setImageLoader", "(Lrh/u;)V", "imageLoader$stream_chat_android_ui_common_release", "imageLoader", "Lrh/n;", "imageLoaderFactory", "Lrh/u;", "getStreamImageLoader$stream_chat_android_ui_common_release", "streamImageLoader", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamCoil {
    public static final int $stable = 8;
    public static final StreamCoil INSTANCE = new StreamCoil();
    private static InterfaceC31425n imageLoader;
    private static InterfaceC31432u imageLoaderFactory;

    private StreamCoil() {
    }

    private final synchronized InterfaceC31425n newImageLoader(Context context) {
        try {
            InterfaceC31425n interfaceC31425n = imageLoader;
            if (interfaceC31425n != null) {
                return interfaceC31425n;
            }
            InterfaceC31432u interfaceC31432uNewImageLoaderFactory = imageLoaderFactory;
            if (interfaceC31432uNewImageLoaderFactory == null) {
                interfaceC31432uNewImageLoaderFactory = newImageLoaderFactory();
            }
            InterfaceC31425n interfaceC31425nNewImageLoader = interfaceC31432uNewImageLoaderFactory.newImageLoader(context);
            imageLoader = interfaceC31425nNewImageLoader;
            return interfaceC31425nNewImageLoader;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final InterfaceC31432u newImageLoaderFactory() {
        Object[] objArr = 0 == true ? 1 : 0;
        StreamImageLoaderFactory streamImageLoaderFactory = new StreamImageLoaderFactory(AbstractC37056f.m118958J(new CDNImageInterceptor(null, 1, 0 == true ? 1 : 0)), objArr, 2, 0 == true ? 1 : 0);
        imageLoaderFactory = streamImageLoaderFactory;
        return streamImageLoaderFactory;
    }

    public final InterfaceC31425n getStreamImageLoader$stream_chat_android_ui_common_release(Context context) {
        AbstractC22676k.m65750j(context, "<this>");
        return imageLoader$stream_chat_android_ui_common_release(context);
    }

    public final InterfaceC31425n imageLoader$stream_chat_android_ui_common_release(Context context) {
        AbstractC22676k.m65750j(context, "context");
        InterfaceC31425n interfaceC31425n = imageLoader;
        return interfaceC31425n == null ? newImageLoader(context) : interfaceC31425n;
    }

    public final synchronized void setImageLoader(InterfaceC31432u factory) {
        AbstractC22676k.m65750j(factory, "factory");
        imageLoaderFactory = factory;
        imageLoader = null;
    }
}
