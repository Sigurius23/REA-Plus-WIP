package p484s9;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import no.C26873f;
import no.C26875h;
import p012ab.C0684i0;

/* JADX INFO: renamed from: s9.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C32282g {

    /* JADX INFO: renamed from: i */
    public static final float[] f133583i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j */
    public static final float[] f133584j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final float[] f133585k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public int f133586a;

    /* JADX INFO: renamed from: b */
    public C26875h f133587b;

    /* JADX INFO: renamed from: c */
    public C0684i0 f133588c;

    /* JADX INFO: renamed from: d */
    public int f133589d;

    /* JADX INFO: renamed from: e */
    public int f133590e;

    /* JADX INFO: renamed from: f */
    public int f133591f;

    /* JADX INFO: renamed from: g */
    public int f133592g;

    /* JADX INFO: renamed from: h */
    public int f133593h;

    /* JADX INFO: renamed from: b */
    public static boolean m100458b(C32280e c32280e) {
        C32279d c32279d = c32280e.f133579a;
        C32279d c32279d2 = c32280e.f133580b;
        C26873f[] c26873fArr = c32279d.f133578a;
        if (c26873fArr.length == 1 && c26873fArr[0].f107231a == 0) {
            C26873f[] c26873fArr2 = c32279d2.f133578a;
            if (c26873fArr2.length == 1 && c26873fArr2[0].f107231a == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m100459a() {
        try {
            C0684i0 c0684i0 = new C0684i0("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n", 10);
            this.f133588c = c0684i0;
            this.f133589d = GLES20.glGetUniformLocation(c0684i0.f2445x, "uMvpMatrix");
            this.f133590e = GLES20.glGetUniformLocation(this.f133588c.f2445x, "uTexMatrix");
            this.f133591f = this.f133588c.m1729t("aPosition");
            this.f133592g = this.f133588c.m1729t("aTexCoords");
            this.f133593h = GLES20.glGetUniformLocation(this.f133588c.f2445x, "uTexture");
        } catch (GlUtil$GlException e5) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e5);
        }
    }
}
