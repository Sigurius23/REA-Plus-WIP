package p454r9;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p012ab.C0684i0;
import p607x8.AbstractC38046a;

/* JADX INFO: renamed from: r9.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C31085j implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: H */
    public static final String[] f128205H = {"y_tex", "u_tex", "v_tex"};

    /* JADX INFO: renamed from: I */
    public static final FloatBuffer f128206I = AbstractC38046a.m121810e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* JADX INFO: renamed from: G */
    public C0684i0 f128209G;

    /* JADX INFO: renamed from: w */
    public final C31086k f128210w;

    /* JADX INFO: renamed from: x */
    public final int[] f128211x = new int[3];

    /* JADX INFO: renamed from: y */
    public final int[] f128212y = new int[3];

    /* JADX INFO: renamed from: z */
    public final int[] f128213z = new int[3];

    /* JADX INFO: renamed from: E */
    public final int[] f128207E = new int[3];

    /* JADX INFO: renamed from: F */
    public final AtomicReference f128208F = new AtomicReference();

    public C31085j(C31086k c31086k) {
        this.f128210w = c31086k;
        for (int i13 = 0; i13 < 3; i13++) {
            int[] iArr = this.f128213z;
            this.f128207E[i13] = -1;
            iArr[i13] = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m95740a() {
        int[] iArr = this.f128211x;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i13 = 0; i13 < 3; i13++) {
                C0684i0 c0684i0 = this.f128209G;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(c0684i0.f2445x, f128205H[i13]), i13);
                GLES20.glActiveTexture(33984 + i13);
                AbstractC38046a.m121807b(3553, iArr[i13]);
            }
            AbstractC38046a.m121808c();
        } catch (GlUtil$GlException e5) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures", e5);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.f128208F.getAndSet(null) != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i13, int i14) {
        GLES20.glViewport(0, 0, i13, i14);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f128212y;
        try {
            C0684i0 c0684i0 = new C0684i0("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n", 10);
            this.f128209G = c0684i0;
            GLES20.glVertexAttribPointer(c0684i0.m1729t("in_pos"), 2, 5126, false, 0, (Buffer) f128206I);
            iArr[0] = this.f128209G.m1729t("in_tc_y");
            iArr[1] = this.f128209G.m1729t("in_tc_u");
            iArr[2] = this.f128209G.m1729t("in_tc_v");
            GLES20.glGetUniformLocation(this.f128209G.f2445x, "mColorConversion");
            AbstractC38046a.m121808c();
            m95740a();
            AbstractC38046a.m121808c();
        } catch (GlUtil$GlException e5) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e5);
        }
    }
}
