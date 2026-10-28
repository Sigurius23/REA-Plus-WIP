package io.getstream.chat.android.p226ui.common.images.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.common.disposable.Disposable;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000  2\u00020\u0001:\u0002 !JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000e\u0010\u000fJW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000e\u0010\u0012JX\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH¦@¢\u0006\u0004\b\u0013\u0010\u0014JW\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0001\u0001\"¨\u0006#À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;", "", "Landroid/widget/ImageView;", "target", "data", "", "placeholderResId", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;", "transformation", "Lkotlin/Function0;", "Ll83/a0;", "onStart", "onComplete", "Lio/getstream/chat/android/ui/common/disposable/Disposable;", "load", "(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;", "loadAndResize", "(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "loadVideoThumbnail", "(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;", "Landroid/content/Context;", "context", "", QueryParams.URL, "Landroid/graphics/Bitmap;", "loadAsBitmap", "(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/d;)Ljava/lang/Object;", "Companion", "ImageTransformation", "Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface StreamImageLoader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;", "", "<init>", "()V", "instance", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final StreamImageLoader instance() {
            return CoilStreamImageLoader.INSTANCE;
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;", "", "<init>", "()V", "None", "Circle", "RoundedCorners", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$Circle;", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class ImageTransformation {
        public static final int $stable = 0;

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$Circle;", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;", "<init>", "()V", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Circle extends ImageTransformation {
            public static final int $stable = 0;
            public static final Circle INSTANCE = new Circle();

            private Circle() {
            }

            public final String toString() {
                return "Circle";
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;", "<init>", "()V", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class None extends ImageTransformation {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            private None() {
            }

            public final String toString() {
                return "None";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;", "radius", "", "<init>", "(F)V", "getRadius", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class RoundedCorners extends ImageTransformation {
            public static final int $stable = 0;
            private final float radius;

            public RoundedCorners(float f13) {
                this.radius = f13;
            }

            public static RoundedCorners copy$default(RoundedCorners roundedCorners, float f13, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    f13 = roundedCorners.radius;
                }
                roundedCorners.getClass();
                return new RoundedCorners(f13);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final float getRadius() {
                return this.radius;
            }

            public final RoundedCorners copy(float radius) {
                return new RoundedCorners(radius);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RoundedCorners) && Float.compare(this.radius, ((RoundedCorners) other).radius) == 0;
            }

            public final float getRadius() {
                return this.radius;
            }

            public final int hashCode() {
                return Float.hashCode(this.radius);
            }

            public final String toString() {
                return "RoundedCorners(radius=" + this.radius + ")";
            }
        }

        private ImageTransformation() {
        }

        public ImageTransformation(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static /* synthetic */ Disposable load$default(StreamImageLoader streamImageLoader, ImageView imageView, Object obj, Integer num, ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
        if ((i13 & 4) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i13 & 8) != 0) {
            imageTransformation = ImageTransformation.None.INSTANCE;
        }
        ImageTransformation imageTransformation2 = imageTransformation;
        if ((i13 & 16) != 0) {
            interfaceC4339a = new C19383k(19);
        }
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
        if ((i13 & 32) != 0) {
            interfaceC4339a2 = new C19383k(19);
        }
        return streamImageLoader.load(imageView, obj, num2, imageTransformation2, interfaceC4339a3, interfaceC4339a2);
    }

    static /* synthetic */ Object loadAndResize$default(StreamImageLoader streamImageLoader, ImageView imageView, Object obj, Drawable drawable, ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC30057d interfaceC30057d, int i13, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAndResize");
        }
        if ((i13 & 4) != 0) {
            drawable = null;
        }
        Drawable drawable2 = drawable;
        if ((i13 & 8) != 0) {
            imageTransformation = ImageTransformation.None.INSTANCE;
        }
        ImageTransformation imageTransformation2 = imageTransformation;
        if ((i13 & 16) != 0) {
            interfaceC4339a = new C19383k(19);
        }
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
        if ((i13 & 32) != 0) {
            interfaceC4339a2 = new C19383k(19);
        }
        return streamImageLoader.loadAndResize(imageView, obj, drawable2, imageTransformation2, interfaceC4339a3, interfaceC4339a2, interfaceC30057d);
    }

    static /* synthetic */ Object loadAsBitmap$default(StreamImageLoader streamImageLoader, Context context, String str, ImageTransformation imageTransformation, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAsBitmap");
        }
        if ((i13 & 4) != 0) {
            imageTransformation = ImageTransformation.None.INSTANCE;
        }
        return streamImageLoader.loadAsBitmap(context, str, imageTransformation, interfaceC30057d);
    }

    static /* synthetic */ Disposable loadVideoThumbnail$default(StreamImageLoader streamImageLoader, ImageView imageView, Uri uri, Integer num, ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadVideoThumbnail");
        }
        if ((i13 & 4) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i13 & 8) != 0) {
            imageTransformation = ImageTransformation.None.INSTANCE;
        }
        ImageTransformation imageTransformation2 = imageTransformation;
        if ((i13 & 16) != 0) {
            interfaceC4339a = new C19383k(19);
        }
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
        if ((i13 & 32) != 0) {
            interfaceC4339a2 = new C19383k(19);
        }
        return streamImageLoader.loadVideoThumbnail(imageView, uri, num2, imageTransformation2, interfaceC4339a3, interfaceC4339a2);
    }

    Disposable load(ImageView target, Object data, Drawable placeholderDrawable, ImageTransformation transformation, InterfaceC4339a onStart, InterfaceC4339a onComplete);

    Disposable load(ImageView target, Object data, Integer placeholderResId, ImageTransformation transformation, InterfaceC4339a onStart, InterfaceC4339a onComplete);

    Object loadAndResize(ImageView imageView, Object obj, Drawable drawable, ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object loadAsBitmap(Context context, String str, ImageTransformation imageTransformation, InterfaceC30057d<? super Bitmap> interfaceC30057d);

    Disposable loadVideoThumbnail(ImageView target, Uri uri, Integer placeholderResId, ImageTransformation transformation, InterfaceC4339a onStart, InterfaceC4339a onComplete);

    static /* synthetic */ Disposable load$default(StreamImageLoader streamImageLoader, ImageView imageView, Object obj, Drawable drawable, ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
        if ((i13 & 4) != 0) {
            drawable = null;
        }
        Drawable drawable2 = drawable;
        if ((i13 & 8) != 0) {
            imageTransformation = ImageTransformation.None.INSTANCE;
        }
        ImageTransformation imageTransformation2 = imageTransformation;
        if ((i13 & 16) != 0) {
            interfaceC4339a = new C19383k(19);
        }
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
        if ((i13 & 32) != 0) {
            interfaceC4339a2 = new C19383k(19);
        }
        return streamImageLoader.load(imageView, obj, drawable2, imageTransformation2, interfaceC4339a3, interfaceC4339a2);
    }
}
