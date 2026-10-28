package p208i2;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.Arrays;

/* JADX INFO: renamed from: i2.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C17923z extends AbstractC17921y {

    /* JADX INFO: renamed from: b */
    public float[] f69667b;

    public C17923z(float[] fArr) {
        super(new ColorMatrixColorFilter(fArr));
        this.f69667b = fArr;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m51566a() {
        float[] fArr = this.f69667b;
        if (fArr != null) {
            return fArr;
        }
        ColorFilter colorFilter = this.f69663a;
        if (!(colorFilter instanceof ColorMatrixColorFilter)) {
            throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
        float[] array = colorMatrix.getArray();
        this.f69667b = array;
        return array;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17923z) && Arrays.equals(m51566a(), ((C17923z) obj).m51566a());
    }

    public final int hashCode() {
        float[] fArr = this.f69667b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f69667b;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb4.append((Object) str);
        sb4.append(')');
        return sb4.toString();
    }
}
