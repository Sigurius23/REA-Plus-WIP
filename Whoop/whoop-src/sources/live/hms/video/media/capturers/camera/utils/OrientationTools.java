package live.hms.video.media.capturers.camera.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import lc0.C23825g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m65681d2 = {"Llive/hms/video/media/capturers/camera/utils/OrientationTools;", "", "<init>", "()V", "correctOrientation", "Landroid/graphics/Bitmap;", "bitmap", "orientation", "", "(Landroid/graphics/Bitmap;Ljava/lang/Integer;)Landroid/graphics/Bitmap;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OrientationTools {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix correctOrientation$lambda$0(BitMatrix applyMatrix) {
        AbstractC22676k.m65750j(applyMatrix, "$this$applyMatrix");
        return applyMatrix.flipHorizontally();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix correctOrientation$lambda$1(BitMatrix applyMatrix) {
        AbstractC22676k.m65750j(applyMatrix, "$this$applyMatrix");
        return applyMatrix.rotate(180.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix correctOrientation$lambda$2(BitMatrix applyMatrix) {
        AbstractC22676k.m65750j(applyMatrix, "$this$applyMatrix");
        return applyMatrix.flipVertically();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix correctOrientation$lambda$3(BitMatrix applyMatrix) {
        AbstractC22676k.m65750j(applyMatrix, "$this$applyMatrix");
        applyMatrix.flipHorizontally();
        return applyMatrix.rotate(-90.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix correctOrientation$lambda$4(BitMatrix applyMatrix) {
        AbstractC22676k.m65750j(applyMatrix, "$this$applyMatrix");
        return applyMatrix.rotate(90.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix correctOrientation$lambda$5(BitMatrix applyMatrix) {
        AbstractC22676k.m65750j(applyMatrix, "$this$applyMatrix");
        applyMatrix.flipVertically();
        return applyMatrix.rotate(270.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix correctOrientation$lambda$6(BitMatrix applyMatrix) {
        AbstractC22676k.m65750j(applyMatrix, "$this$applyMatrix");
        return applyMatrix.rotate(270.0f);
    }

    public final Bitmap correctOrientation(Bitmap bitmap, Integer orientation) {
        if (bitmap == null) {
            return null;
        }
        if ((orientation != null && orientation.intValue() == 0) || (orientation != null && orientation.intValue() == 1)) {
            return bitmap;
        }
        if (orientation != null && orientation.intValue() == 2) {
            return OrientationToolsKt.applyMatrix(bitmap, new C23825g(25));
        }
        if (orientation != null && orientation.intValue() == 3) {
            return OrientationToolsKt.applyMatrix(bitmap, new C23825g(26));
        }
        if (orientation != null && orientation.intValue() == 4) {
            return OrientationToolsKt.applyMatrix(bitmap, new C23825g(27));
        }
        if (orientation != null && orientation.intValue() == 5) {
            return OrientationToolsKt.applyMatrix(bitmap, new C23825g(28));
        }
        if (orientation != null && orientation.intValue() == 6) {
            return OrientationToolsKt.applyMatrix(bitmap, new C23825g(29));
        }
        if (orientation != null && orientation.intValue() == 7) {
            return OrientationToolsKt.applyMatrix(bitmap, new C24174a(0));
        }
        if (orientation != null && orientation.intValue() == 8) {
            return OrientationToolsKt.applyMatrix(bitmap, new C24174a(1));
        }
        return null;
    }
}
