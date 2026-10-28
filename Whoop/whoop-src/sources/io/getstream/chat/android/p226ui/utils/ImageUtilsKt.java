package io.getstream.chat.android.p226ui.utils;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import c93.InterfaceC4339a;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.common.disposable.Disposable;
import io.getstream.chat.android.p226ui.common.images.internal.CoilStreamImageLoader;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import l83.C23454a0;
import ou1.C28376a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\f\u0010\u0010\u001aR\u0010\u0011\u001a\u00020\b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0087@¢\u0006\u0004\b\u0011\u0010\u0012\u001aS\u0010\u0015\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Landroid/widget/ImageView;", "", "data", "", "placeholderResId", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;", "transformation", "Lkotlin/Function0;", "Ll83/a0;", "onStart", "onComplete", "Lio/getstream/chat/android/ui/common/disposable/Disposable;", "load", "(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;", "loadAndResize", "(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "loadVideoThumbnail", "(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ImageUtilsKt {
    @InternalStreamChatApi
    public static final Disposable load(ImageView imageView, Object obj, Integer num, StreamImageLoader.ImageTransformation transformation, InterfaceC4339a onStart, InterfaceC4339a onComplete) {
        AbstractC22676k.m65750j(imageView, "<this>");
        AbstractC22676k.m65750j(transformation, "transformation");
        AbstractC22676k.m65750j(onStart, "onStart");
        AbstractC22676k.m65750j(onComplete, "onComplete");
        StreamImageLoader.INSTANCE.getClass();
        return CoilStreamImageLoader.INSTANCE.load(imageView, obj, num, transformation, onStart, onComplete);
    }

    public static /* synthetic */ Disposable load$default(ImageView imageView, Object obj, Integer num, StreamImageLoader.ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i13 & 4) != 0) {
            imageTransformation = StreamImageLoader.ImageTransformation.None.INSTANCE;
        }
        StreamImageLoader.ImageTransformation imageTransformation2 = imageTransformation;
        if ((i13 & 8) != 0) {
            interfaceC4339a = new C28376a(7);
        }
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
        if ((i13 & 16) != 0) {
            interfaceC4339a2 = new C28376a(7);
        }
        return load(imageView, obj, num2, imageTransformation2, interfaceC4339a3, interfaceC4339a2);
    }

    @InternalStreamChatApi
    public static final Object loadAndResize(ImageView imageView, Object obj, Drawable drawable, StreamImageLoader.ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        StreamImageLoader.INSTANCE.getClass();
        Object objLoadAndResize = CoilStreamImageLoader.INSTANCE.loadAndResize(imageView, obj, drawable, imageTransformation, interfaceC4339a, interfaceC4339a2, interfaceC30057d);
        return objLoadAndResize == EnumC31071a.f128113w ? objLoadAndResize : C23454a0.f92919a;
    }

    public static /* synthetic */ Object loadAndResize$default(ImageView imageView, Object obj, Drawable drawable, StreamImageLoader.ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC30057d interfaceC30057d, int i13, Object obj2) {
        if ((i13 & 4) != 0) {
            imageTransformation = StreamImageLoader.ImageTransformation.None.INSTANCE;
        }
        StreamImageLoader.ImageTransformation imageTransformation2 = imageTransformation;
        if ((i13 & 8) != 0) {
            interfaceC4339a = new C28376a(7);
        }
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
        if ((i13 & 16) != 0) {
            interfaceC4339a2 = new C28376a(7);
        }
        return loadAndResize(imageView, obj, drawable, imageTransformation2, interfaceC4339a3, interfaceC4339a2, interfaceC30057d);
    }

    @InternalStreamChatApi
    public static final Disposable loadVideoThumbnail(ImageView imageView, Uri uri, Integer num, StreamImageLoader.ImageTransformation transformation, InterfaceC4339a onStart, InterfaceC4339a onComplete) {
        AbstractC22676k.m65750j(imageView, "<this>");
        AbstractC22676k.m65750j(transformation, "transformation");
        AbstractC22676k.m65750j(onStart, "onStart");
        AbstractC22676k.m65750j(onComplete, "onComplete");
        StreamImageLoader.INSTANCE.getClass();
        return CoilStreamImageLoader.INSTANCE.loadVideoThumbnail(imageView, uri, num, transformation, onStart, onComplete);
    }

    public static /* synthetic */ Disposable loadVideoThumbnail$default(ImageView imageView, Uri uri, Integer num, StreamImageLoader.ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i13 & 4) != 0) {
            imageTransformation = StreamImageLoader.ImageTransformation.None.INSTANCE;
        }
        StreamImageLoader.ImageTransformation imageTransformation2 = imageTransformation;
        if ((i13 & 8) != 0) {
            interfaceC4339a = new C28376a(7);
        }
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
        if ((i13 & 16) != 0) {
            interfaceC4339a2 = new C28376a(7);
        }
        return loadVideoThumbnail(imageView, uri, num2, imageTransformation2, interfaceC4339a3, interfaceC4339a2);
    }

    @InternalStreamChatApi
    public static final Disposable load(ImageView imageView, Object obj, Drawable drawable, StreamImageLoader.ImageTransformation transformation, InterfaceC4339a onStart, InterfaceC4339a onComplete) {
        AbstractC22676k.m65750j(imageView, "<this>");
        AbstractC22676k.m65750j(transformation, "transformation");
        AbstractC22676k.m65750j(onStart, "onStart");
        AbstractC22676k.m65750j(onComplete, "onComplete");
        StreamImageLoader.INSTANCE.getClass();
        return CoilStreamImageLoader.INSTANCE.load(imageView, obj, drawable, transformation, onStart, onComplete);
    }

    public static /* synthetic */ Disposable load$default(ImageView imageView, Object obj, Drawable drawable, StreamImageLoader.ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Object obj2) {
        if ((i13 & 4) != 0) {
            imageTransformation = StreamImageLoader.ImageTransformation.None.INSTANCE;
        }
        StreamImageLoader.ImageTransformation imageTransformation2 = imageTransformation;
        if ((i13 & 8) != 0) {
            interfaceC4339a = new C28376a(7);
        }
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
        if ((i13 & 16) != 0) {
            interfaceC4339a2 = new C28376a(7);
        }
        return load(imageView, obj, drawable, imageTransformation2, interfaceC4339a3, interfaceC4339a2);
    }
}
