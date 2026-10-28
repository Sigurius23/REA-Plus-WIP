package hms.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    /* JADX INFO: renamed from: hms.webrtc.RendererCommon$1 */
    public static /* synthetic */ class C174591 {
        static final /* synthetic */ int[] $SwitchMap$hms$webrtc$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[ScalingType.values().length];
            $SwitchMap$hms$webrtc$RendererCommon$ScalingType = iArr;
            try {
                iArr[ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$hms$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$hms$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface GlDrawer {
        void drawOes(int i13, float[] fArr, int i14, int i15, int i16, int i17, int i18, int i19);

        void drawRgb(int i13, float[] fArr, int i14, int i15, int i16, int i17, int i18, int i19);

        void drawYuv(int[] iArr, float[] fArr, int i13, int i14, int i15, int i16, int i17, int i18);

        void release();
    }

    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i13, int i14, int i15);
    }

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    public static class VideoLayoutMeasure {
        private float visibleFractionMatchOrientation;
        private float visibleFractionMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
        }

        public Point measure(int i13, int i14, int i15, int i16) {
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i13);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i14);
            if (i15 == 0 || i16 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f13 = i15 / i16;
            Point displaySize = RendererCommon.getDisplaySize(((f13 > 1.0f ? 1 : (f13 == 1.0f ? 0 : -1)) > 0) == (((float) defaultSize) / ((float) defaultSize2) > 1.0f) ? this.visibleFractionMatchOrientation : this.visibleFractionMismatchOrientation, f13, defaultSize, defaultSize2);
            if (View.MeasureSpec.getMode(i13) == 1073741824) {
                displaySize.x = defaultSize;
            }
            if (View.MeasureSpec.getMode(i14) == 1073741824) {
                displaySize.y = defaultSize2;
            }
            return displaySize;
        }

        public void setScalingType(ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }

        public void setVisibleFraction(float f13, float f14) {
            this.visibleFractionMatchOrientation = f13;
            this.visibleFractionMismatchOrientation = f14;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType2);
        }
    }

    private static void adjustOrigin(float[] fArr) {
        float f13 = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f13;
        float f14 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f14;
        fArr[12] = f13 + 0.5f;
        fArr[13] = f14 + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int i13 = C174591.$SwitchMap$hms$webrtc$RendererCommon$ScalingType[scalingType.ordinal()];
        if (i13 == 1) {
            return 1.0f;
        }
        if (i13 == 2) {
            return 0.0f;
        }
        if (i13 == 3) {
            return BALANCED_VISIBLE_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    public static Point getDisplaySize(ScalingType scalingType, float f13, int i13, int i14) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f13, i13, i14);
    }

    public static float[] getLayoutMatrix(boolean z4, float f13, float f14) {
        float f15;
        float f16;
        if (f14 > f13) {
            f16 = f13 / f14;
            f15 = 1.0f;
        } else {
            f15 = f14 / f13;
            f16 = 1.0f;
        }
        if (z4) {
            f15 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f15, f16, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(float f13, float f14, int i13, int i14) {
        return (f13 == 0.0f || f14 == 0.0f) ? new Point(i13, i14) : new Point(Math.min(i13, Math.round((i14 / f13) * f14)), Math.min(i14, Math.round((i13 / f13) / f14)));
    }
}
