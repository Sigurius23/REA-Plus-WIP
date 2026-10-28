package live.hms.video.media.capturers.camera.utils;

import android.graphics.Bitmap;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Llive/hms/video/media/capturers/camera/utils/BitMatrix;", "Landroid/graphics/Matrix;", "operations", "applyMatrix", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)Landroid/graphics/Bitmap;", "lib_release"}, m65682k = 2, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OrientationToolsKt {
    public static final Bitmap applyMatrix(Bitmap bitmap, Function1 operations) {
        AbstractC22676k.m65750j(bitmap, "<this>");
        AbstractC22676k.m65750j(operations, "operations");
        BitMatrix bitMatrix = new BitMatrix(bitmap);
        operations.invoke(bitMatrix);
        return bitMatrix.build();
    }
}
