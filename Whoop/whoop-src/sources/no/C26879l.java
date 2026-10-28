package no;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import io.sentry.android.core.RunnableC20151r0;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.C2817b;
import p309lo.AbstractC24543a;
import p309lo.C24565w;
import p450r5.RunnableC30928b;
import p484s9.C32280e;
import p484s9.C32282g;
import p484s9.C32283h;
import p484s9.C32284i;
import p484s9.InterfaceC32278c;
import p607x8.AbstractC38046a;

/* JADX INFO: renamed from: no.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C26879l implements GLSurfaceView.Renderer, InterfaceC26870c, InterfaceC32278c {

    /* JADX INFO: renamed from: E */
    public final float[] f107269E;

    /* JADX INFO: renamed from: F */
    public final float[] f107270F;

    /* JADX INFO: renamed from: G */
    public float f107271G;

    /* JADX INFO: renamed from: H */
    public float f107272H;

    /* JADX INFO: renamed from: I */
    public final float[] f107273I;

    /* JADX INFO: renamed from: J */
    public final float[] f107274J;

    /* JADX INFO: renamed from: K */
    public final Object f107275K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ GLSurfaceView f107276L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107277w;

    /* JADX INFO: renamed from: x */
    public final float[] f107278x;

    /* JADX INFO: renamed from: y */
    public final float[] f107279y;

    /* JADX INFO: renamed from: z */
    public final float[] f107280z;

    public C26879l(C26880m c26880m, C26878k c26878k) {
        this.f107277w = 0;
        this.f107276L = c26880m;
        this.f107278x = new float[16];
        this.f107279y = new float[16];
        float[] fArr = new float[16];
        this.f107280z = fArr;
        float[] fArr2 = new float[16];
        this.f107269E = fArr2;
        float[] fArr3 = new float[16];
        this.f107270F = fArr3;
        this.f107273I = new float[16];
        this.f107274J = new float[16];
        this.f107275K = c26878k;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f107272H = 3.1415927f;
    }

    /* JADX INFO: renamed from: b */
    private final void m80228b(GL10 gl10) {
        float[] fArr;
        Object objM71654d;
        Object objM71654d2;
        Object objM71654d3;
        synchronized (this) {
            Matrix.multiplyMM(this.f107274J, 0, this.f107280z, 0, this.f107270F, 0);
            Matrix.multiplyMM(this.f107273I, 0, this.f107269E, 0, this.f107274J, 0);
        }
        Matrix.multiplyMM(this.f107279y, 0, this.f107278x, 0, this.f107273I, 0);
        C26878k c26878k = (C26878k) this.f107275K;
        float[] fArr2 = this.f107279y;
        GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
        AbstractC24543a.m71571g();
        if (c26878k.f107265w.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = c26878k.f107261J;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            AbstractC24543a.m71571g();
            if (c26878k.f107266x.compareAndSet(true, false)) {
                Matrix.setIdentityM(c26878k.f107258G, 0);
            }
            long timestamp = c26878k.f107261J.getTimestamp();
            C24565w c24565w = c26878k.f107256E;
            synchronized (c24565w) {
                objM71654d = c24565w.m71654d(timestamp, false);
            }
            Long l7 = (Long) objM71654d;
            if (l7 != null) {
                C2817b c2817b = c26878k.f107268z;
                float[] fArr3 = c26878k.f107258G;
                long jLongValue = l7.longValue();
                C24565w c24565w2 = (C24565w) c2817b.f11021E;
                synchronized (c24565w2) {
                    objM71654d3 = c24565w2.m71654d(jLongValue, true);
                }
                float[] fArr4 = (float[]) objM71654d3;
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) c2817b.f11025z;
                    float f13 = fArr4[0];
                    float f14 = -fArr4[1];
                    float f15 = -fArr4[2];
                    float length = Matrix.length(f13, f14, f15);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f13 / length, f14 / length, f15 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!c2817b.f11023x) {
                        C2817b.m8002g((float[]) c2817b.f11024y, (float[]) c2817b.f11025z);
                        c2817b.f11023x = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) c2817b.f11024y, 0, (float[]) c2817b.f11025z, 0);
                }
            }
            C24565w c24565w3 = c26878k.f107257F;
            synchronized (c24565w3) {
                objM71654d2 = c24565w3.m71654d(timestamp, true);
            }
            C26874g c26874g = (C26874g) objM71654d2;
            if (c26874g != null) {
                C26876i c26876i = c26878k.f107267y;
                c26876i.getClass();
                if (C26876i.m80226a(c26874g)) {
                    c26876i.f107246a = c26874g.f107237c;
                    c26876i.f107247b = new C26875h(c26874g.f107235a.f107230a[0]);
                    if (!c26874g.f107238d) {
                        C26873f c26873f = c26874g.f107236b.f107230a[0];
                        float[] fArr6 = c26873f.f107233c;
                        int length2 = fArr6.length;
                        AbstractC24543a.m71577m(fArr6);
                        AbstractC24543a.m71577m(c26873f.f107234d);
                    }
                }
            }
        }
        Matrix.multiplyMM(c26878k.f107259H, 0, fArr2, 0, c26878k.f107258G, 0);
        C26876i c26876i2 = c26878k.f107267y;
        int i13 = c26878k.f107260I;
        float[] fArr7 = c26878k.f107259H;
        C26875h c26875h = c26876i2.f107247b;
        if (c26875h == null) {
            return;
        }
        int i14 = c26876i2.f107246a;
        if (i14 == 1) {
            fArr = C26876i.f107244j;
        } else {
            fArr = i14 == 2 ? C26876i.f107245k : C26876i.f107243i;
        }
        GLES20.glUniformMatrix3fv(c26876i2.f107250e, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(c26876i2.f107249d, 1, false, fArr7, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i13);
        GLES20.glUniform1i(c26876i2.f107253h, 0);
        AbstractC24543a.m71571g();
        GLES20.glVertexAttribPointer(c26876i2.f107251f, 3, 5126, false, 12, (Buffer) c26875h.f107240b);
        AbstractC24543a.m71571g();
        GLES20.glVertexAttribPointer(c26876i2.f107252g, 2, 5126, false, 8, (Buffer) c26875h.f107241c);
        AbstractC24543a.m71571g();
        GLES20.glDrawArrays(c26875h.f107242d, 0, c26875h.f107239a);
        AbstractC24543a.m71571g();
    }

    @Override // no.InterfaceC26870c, p484s9.InterfaceC32278c
    /* JADX INFO: renamed from: a */
    public final synchronized void mo80223a(float[] fArr, float f13) {
        int i13 = this.f107277w;
        synchronized (this) {
            switch (i13) {
                case 0:
                    float[] fArr2 = this.f107280z;
                    System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                    float f14 = -f13;
                    this.f107272H = f14;
                    Matrix.setRotateM(this.f107269E, 0, -this.f107271G, (float) Math.cos(f14), (float) Math.sin(this.f107272H), 0.0f);
                    return;
                default:
                    float[] fArr3 = this.f107280z;
                    System.arraycopy(fArr, 0, fArr3, 0, fArr3.length);
                    float f15 = -f13;
                    this.f107272H = f15;
                    Matrix.setRotateM(this.f107269E, 0, -this.f107271G, (float) Math.cos(f15), (float) Math.sin(this.f107272H), 0.0f);
                    return;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object objM71654d;
        switch (this.f107277w) {
            case 0:
                m80228b(gl10);
                return;
            default:
                synchronized (this) {
                    Matrix.multiplyMM(this.f107274J, 0, this.f107280z, 0, this.f107270F, 0);
                    Matrix.multiplyMM(this.f107273I, 0, this.f107269E, 0, this.f107274J, 0);
                    break;
                }
                Matrix.multiplyMM(this.f107279y, 0, this.f107278x, 0, this.f107273I, 0);
                C32283h c32283h = (C32283h) this.f107275K;
                float[] fArr = this.f107279y;
                GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
                try {
                    AbstractC38046a.m121808c();
                } catch (GlUtil$GlException e5) {
                    AbstractC38046a.m121813h("SceneRenderer", "Failed to draw a frame", e5);
                }
                if (c32283h.f133603w.compareAndSet(true, false)) {
                    SurfaceTexture surfaceTexture = c32283h.f133599J;
                    surfaceTexture.getClass();
                    surfaceTexture.updateTexImage();
                    try {
                        AbstractC38046a.m121808c();
                    } catch (GlUtil$GlException e13) {
                        AbstractC38046a.m121813h("SceneRenderer", "Failed to draw a frame", e13);
                    }
                    if (c32283h.f133604x.compareAndSet(true, false)) {
                        Matrix.setIdentityM(c32283h.f133596G, 0);
                    }
                    long timestamp = c32283h.f133599J.getTimestamp();
                    C24565w c24565w = c32283h.f133594E;
                    synchronized (c24565w) {
                        objM71654d = c24565w.m71654d(timestamp, false);
                    }
                    Long l7 = (Long) objM71654d;
                    if (l7 != null) {
                        C2817b c2817b = c32283h.f133606z;
                        float[] fArr2 = c32283h.f133596G;
                        float[] fArr3 = (float[]) ((C24565w) c2817b.f11021E).m71656f(l7.longValue());
                        if (fArr3 != null) {
                            float[] fArr4 = (float[]) c2817b.f11025z;
                            float f13 = fArr3[0];
                            float f14 = -fArr3[1];
                            float f15 = -fArr3[2];
                            float length = Matrix.length(f13, f14, f15);
                            if (length != 0.0f) {
                                Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f13 / length, f14 / length, f15 / length);
                            } else {
                                Matrix.setIdentityM(fArr4, 0);
                            }
                            if (!c2817b.f11023x) {
                                C2817b.m8003h((float[]) c2817b.f11024y, (float[]) c2817b.f11025z);
                                c2817b.f11023x = true;
                            }
                            Matrix.multiplyMM(fArr2, 0, (float[]) c2817b.f11024y, 0, (float[]) c2817b.f11025z, 0);
                        }
                    }
                    C32280e c32280e = (C32280e) c32283h.f133595F.m71656f(timestamp);
                    if (c32280e != null) {
                        C32282g c32282g = c32283h.f133605y;
                        c32282g.getClass();
                        if (C32282g.m100458b(c32280e)) {
                            c32282g.f133586a = c32280e.f133581c;
                            c32282g.f133587b = new C26875h(c32280e.f133579a.f133578a[0], false);
                            if (!c32280e.f133582d) {
                                C26873f c26873f = c32280e.f133580b.f133578a[0];
                                float[] fArr5 = c26873f.f107233c;
                                int length2 = fArr5.length;
                                AbstractC38046a.m121810e(fArr5);
                                AbstractC38046a.m121810e(c26873f.f107234d);
                            }
                        }
                    }
                }
                Matrix.multiplyMM(c32283h.f133597H, 0, fArr, 0, c32283h.f133596G, 0);
                C32282g c32282g2 = c32283h.f133605y;
                int i13 = c32283h.f133598I;
                float[] fArr6 = c32283h.f133597H;
                C26875h c26875h = c32282g2.f133587b;
                if (c26875h == null) {
                    return;
                }
                int i14 = c32282g2.f133586a;
                GLES20.glUniformMatrix3fv(c32282g2.f133590e, 1, false, i14 == 1 ? C32282g.f133584j : i14 == 2 ? C32282g.f133585k : C32282g.f133583i, 0);
                GLES20.glUniformMatrix4fv(c32282g2.f133589d, 1, false, fArr6, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, i13);
                GLES20.glUniform1i(c32282g2.f133593h, 0);
                try {
                    AbstractC38046a.m121808c();
                } catch (GlUtil$GlException e14) {
                    Log.e("ProjectionRenderer", "Failed to bind uniforms", e14);
                }
                GLES20.glVertexAttribPointer(c32282g2.f133591f, 3, 5126, false, 12, (Buffer) c26875h.f107240b);
                try {
                    AbstractC38046a.m121808c();
                } catch (GlUtil$GlException e15) {
                    Log.e("ProjectionRenderer", "Failed to load position data", e15);
                }
                GLES20.glVertexAttribPointer(c32282g2.f133592g, 2, 5126, false, 8, (Buffer) c26875h.f107241c);
                try {
                    AbstractC38046a.m121808c();
                } catch (GlUtil$GlException e16) {
                    Log.e("ProjectionRenderer", "Failed to load texture data", e16);
                }
                GLES20.glDrawArrays(c26875h.f107242d, 0, c26875h.f107239a);
                try {
                    AbstractC38046a.m121808c();
                    return;
                } catch (GlUtil$GlException e17) {
                    Log.e("ProjectionRenderer", "Failed to render", e17);
                    return;
                }
                break;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i13, int i14) {
        switch (this.f107277w) {
            case 0:
                GLES20.glViewport(0, 0, i13, i14);
                float f13 = i13 / i14;
                Matrix.perspectiveM(this.f107278x, 0, f13 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f13))) * 2.0d) : 90.0f, f13, 0.1f, 100.0f);
                break;
            default:
                GLES20.glViewport(0, 0, i13, i14);
                float f14 = i13 / i14;
                Matrix.perspectiveM(this.f107278x, 0, f14 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f14))) * 2.0d) : 90.0f, f14, 0.1f, 100.0f);
                break;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int i13 = this.f107277w;
        synchronized (this) {
            switch (i13) {
                case 0:
                    C26880m c26880m = (C26880m) this.f107276L;
                    c26880m.f107281E.post(new RunnableC20151r0(24, c26880m, ((C26878k) this.f107275K).m80227a()));
                    return;
                default:
                    C32284i c32284i = (C32284i) this.f107276L;
                    c32284i.f133608E.post(new RunnableC30928b(10, c32284i, ((C32283h) this.f107275K).m100460a()));
                    return;
            }
        }
    }

    public C26879l(C32284i c32284i, C32283h c32283h) {
        this.f107277w = 1;
        this.f107276L = c32284i;
        this.f107278x = new float[16];
        this.f107279y = new float[16];
        float[] fArr = new float[16];
        this.f107280z = fArr;
        float[] fArr2 = new float[16];
        this.f107269E = fArr2;
        float[] fArr3 = new float[16];
        this.f107270F = fArr3;
        this.f107273I = new float[16];
        this.f107274J = new float[16];
        this.f107275K = c32283h;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f107272H = 3.1415927f;
    }
}
