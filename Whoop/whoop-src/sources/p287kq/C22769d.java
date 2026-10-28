package p287kq;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: renamed from: kq.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C22769d extends Property {

    /* JADX INFO: renamed from: a */
    public final Matrix f89678a;

    public C22769d() {
        super(Matrix.class, "imageMatrixProperty");
        this.f89678a = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        Matrix imageMatrix = ((ImageView) obj).getImageMatrix();
        Matrix matrix = this.f89678a;
        matrix.set(imageMatrix);
        return matrix;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
