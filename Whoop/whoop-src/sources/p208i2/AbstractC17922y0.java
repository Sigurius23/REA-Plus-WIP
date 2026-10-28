package p208i2;

import android.graphics.Matrix;
import android.graphics.Shader;
import p181h2.C16620e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.y0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17922y0 extends AbstractC17911t {

    /* JADX INFO: renamed from: c */
    private C17884f1 f69664c;

    /* JADX INFO: renamed from: d */
    private long f69665d = 9205357640488583168L;

    /* JADX INFO: renamed from: e */
    private float[] f69666e;

    @Override // p208i2.AbstractC17911t
    /* JADX INFO: renamed from: a */
    public final void mo51432a(long j7, InterfaceC17906q0 interfaceC17906q0, float f13) {
        C17884f1 c17884f1 = this.f69664c;
        if (c17884f1 == null || !C16620e.m47210b(this.f69665d, j7)) {
            if (C16620e.m47214f(j7)) {
                this.f69664c = null;
                this.f69665d = 9205357640488583168L;
                c17884f1 = null;
            } else {
                c17884f1 = this.f69664c;
                if (c17884f1 == null) {
                    c17884f1 = new C17884f1();
                    this.f69664c = c17884f1;
                }
                float[] fArr = this.f69666e;
                if (fArr != null) {
                    Matrix matrix = c17884f1.f69575a;
                    if (matrix == null) {
                        matrix = new Matrix();
                        c17884f1.f69575a = matrix;
                    }
                    AbstractC17918w0.m51499A(matrix, fArr);
                    Shader shader = c17884f1.f69576b;
                    if (shader != null) {
                        shader.setLocalMatrix(matrix);
                    }
                }
                Shader shaderMo29549b = mo29549b(j7);
                Matrix matrix2 = c17884f1.f69575a;
                if (matrix2 != null && shaderMo29549b != null) {
                    shaderMo29549b.setLocalMatrix(matrix2);
                }
                c17884f1.f69576b = shaderMo29549b;
                this.f69664c = c17884f1;
                this.f69665d = j7;
            }
        }
        C17887h c17887h = (C17887h) interfaceC17906q0;
        long jM51515c = AbstractC17918w0.m51515c(c17887h.f69578a.getColor());
        long j13 = C17919x.f69625b;
        if (!C17919x.m51542d(jM51515c, j13)) {
            c17887h.m51447e(j13);
        }
        if (!AbstractC22676k.m65745e(c17887h.f69580c, c17884f1 != null ? c17884f1.f69576b : null)) {
            c17887h.m51451i(c17884f1 != null ? c17884f1.f69576b : null);
        }
        if (c17887h.f69578a.getAlpha() / 255.0f == f13) {
            return;
        }
        c17887h.m51445c(f13);
    }

    /* JADX INFO: renamed from: b */
    public abstract Shader mo29549b(long j7);
}
