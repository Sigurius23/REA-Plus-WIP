package com.whoop.profile.view.edit.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import c93.InterfaceC4339a;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import java.io.InputStream;
import p273k6.C22222g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0011JM\u0010\u001c\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/net/Uri;", "uri", "Landroid/content/Context;", "context", "correctImageOrientation", "(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/content/Context;)Landroid/graphics/Bitmap;", "", "degrees", "rotateBitmap", "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "flipBitmapHorizontal", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "flipBitmapVertical", "selectedImageUri", "Lkotlin/Function1;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "Ll83/a0;", "onEvent", "Lkotlin/Function0;", "onDismiss", "Landroid/graphics/Rect;", "cropBounds", "processAndUploadAvatar", "(Landroid/net/Uri;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Landroid/graphics/Rect;)V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AvatarUploadUtils {
    public static final int $stable = 0;
    public static final AvatarUploadUtils INSTANCE = new AvatarUploadUtils();

    private AvatarUploadUtils() {
    }

    private final Bitmap correctImageOrientation(Bitmap bitmap, Uri uri, Context context) {
        Bitmap bitmapFlipBitmapHorizontal;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    int iM63691c = new C22222g(inputStreamOpenInputStream).m63691c();
                    if (iM63691c == 2) {
                        bitmapFlipBitmapHorizontal = INSTANCE.flipBitmapHorizontal(bitmap);
                    } else if (iM63691c == 3) {
                        bitmapFlipBitmapHorizontal = INSTANCE.rotateBitmap(bitmap, 180.0f);
                    } else if (iM63691c == 4) {
                        bitmapFlipBitmapHorizontal = INSTANCE.flipBitmapVertical(bitmap);
                    } else if (iM63691c != 6) {
                        bitmapFlipBitmapHorizontal = iM63691c != 8 ? bitmap : INSTANCE.rotateBitmap(bitmap, 270.0f);
                    } else {
                        bitmapFlipBitmapHorizontal = INSTANCE.rotateBitmap(bitmap, 90.0f);
                    }
                    inputStreamOpenInputStream.close();
                    if (bitmapFlipBitmapHorizontal != null) {
                        return bitmapFlipBitmapHorizontal;
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(inputStreamOpenInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return bitmap;
    }

    private final Bitmap flipBitmapHorizontal(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    private final Bitmap flipBitmapVertical(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ void processAndUploadAvatar$default(AvatarUploadUtils avatarUploadUtils, Uri uri, Context context, Function1 function1, InterfaceC4339a interfaceC4339a, Rect rect, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            rect = null;
        }
        avatarUploadUtils.processAndUploadAvatar(uri, context, function1, interfaceC4339a, rect);
    }

    private final Bitmap rotateBitmap(Bitmap bitmap, float degrees) {
        Matrix matrix = new Matrix();
        matrix.postRotate(degrees);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    public final void processAndUploadAvatar(Uri selectedImageUri, Context context, Function1 onEvent, InterfaceC4339a onDismiss, Rect cropBounds) {
        Bitmap bitmapCreateBitmap;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        if (selectedImageUri == null) {
            onDismiss.invoke();
            return;
        }
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(selectedImageUri);
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            if (bitmapDecodeStream != null) {
                Bitmap bitmapCorrectImageOrientation = INSTANCE.correctImageOrientation(bitmapDecodeStream, selectedImageUri, context);
                if (cropBounds != null) {
                    Rect rect = new Rect(Math.max(0, cropBounds.left), Math.max(0, cropBounds.top), Math.min(bitmapCorrectImageOrientation.getWidth(), cropBounds.right), Math.min(bitmapCorrectImageOrientation.getHeight(), cropBounds.bottom));
                    bitmapCreateBitmap = (rect.width() <= 0 || rect.height() <= 0) ? bitmapCorrectImageOrientation : Bitmap.createBitmap(bitmapCorrectImageOrientation, rect.left, rect.top, rect.width(), rect.height());
                    if (bitmapCreateBitmap == null) {
                        bitmapCreateBitmap = bitmapCorrectImageOrientation;
                    }
                } else {
                    bitmapCreateBitmap = bitmapCorrectImageOrientation;
                }
                ImageProcessingUtils imageProcessingUtils = ImageProcessingUtils.INSTANCE;
                Bitmap bitmapResizeBitmap = imageProcessingUtils.resizeBitmap(bitmapCreateBitmap, 512, 512);
                byte[] bArrBitmapToByteArray = imageProcessingUtils.bitmapToByteArray(bitmapResizeBitmap, 85);
                onDismiss.invoke();
                onEvent.invoke(new EditProfileEvent.UploadAvatar(bArrBitmapToByteArray));
                bitmapDecodeStream.recycle();
                if (!AbstractC22676k.m65745e(bitmapCorrectImageOrientation, bitmapDecodeStream)) {
                    bitmapCorrectImageOrientation.recycle();
                }
                if (!AbstractC22676k.m65745e(bitmapCreateBitmap, bitmapCorrectImageOrientation)) {
                    bitmapCreateBitmap.recycle();
                }
                bitmapResizeBitmap.recycle();
            }
        } catch (Exception unused) {
            onDismiss.invoke();
        }
    }
}
