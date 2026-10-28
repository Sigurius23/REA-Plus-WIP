package iq0;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import io.getstream.chat.android.client.notifications.handler.NotificationConfig;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: iq0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroid/content/ContentResolver;", "contentResolver", "Landroid/net/Uri;", "imageUri", "Landroid/graphics/Bitmap;", "a", "(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "b", "()Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "community_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20830i {
    /* JADX INFO: renamed from: a */
    public static final Bitmap m57453a(ContentResolver contentResolver, Uri imageUri) {
        AbstractC22676k.m65750j(contentResolver, "contentResolver");
        AbstractC22676k.m65750j(imageUri, "imageUri");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("getBitmapFromUri");
        if (Build.VERSION.SDK_INT < 29) {
            try {
                return MediaStore.Images.Media.getBitmap(contentResolver, imageUri);
            } catch (Exception e5) {
                interfaceC34116nM107848a.mo85230v("Exception occurred while fetching bitmap on api less than 29", e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
        ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(contentResolver, imageUri);
        AbstractC22676k.m65749i(sourceCreateSource, "createSource(...)");
        try {
            return ImageDecoder.decodeBitmap(sourceCreateSource);
        } catch (Exception e13) {
            interfaceC34116nM107848a.mo85230v("Exception occurred while fetching bitmap on api >= than 29", e13, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final NotificationConfig m57454b() {
        return new NotificationConfig(false, null, null, null, null, false, null, 126, null);
    }
}
