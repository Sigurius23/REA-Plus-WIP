package wz2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import bh3.InterfaceC3255b;
import e50.C12723b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import lh3.C24079b;
import lh3.C24082e;
import mh3.C25566c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p108e4.AbstractC12682p;
import qr2.AbstractC30556a;
import tr2.C34117o;
import tr2.InterfaceC34116n;
import uz2.EnumC35444a;
import vz2.AbstractC36615a;
import xg3.C38280g;

/* JADX INFO: renamed from: wz2.b */
/* JADX INFO: loaded from: classes11.dex */
public class C37783b extends Thread implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: m0 */
    private static float[] f161841m0 = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};

    /* JADX INFO: renamed from: n0 */
    private static short[] f161842n0 = {0, 1, 2, 1, 3, 2};

    /* JADX INFO: renamed from: E */
    private float f161843E;

    /* JADX INFO: renamed from: F */
    private SurfaceTexture f161844F;

    /* JADX INFO: renamed from: G */
    private C37784c f161845G;

    /* JADX INFO: renamed from: H */
    private SurfaceTexture f161846H;

    /* JADX INFO: renamed from: I */
    private C37782a f161847I;

    /* JADX INFO: renamed from: J */
    private String f161848J;

    /* JADX INFO: renamed from: K */
    private String f161849K;

    /* JADX INFO: renamed from: L */
    private FloatBuffer f161850L;

    /* JADX INFO: renamed from: N */
    private int f161852N;

    /* JADX INFO: renamed from: O */
    private FloatBuffer f161853O;

    /* JADX INFO: renamed from: P */
    private ShortBuffer f161854P;

    /* JADX INFO: renamed from: Q */
    private boolean f161855Q;

    /* JADX INFO: renamed from: R */
    private int f161856R;

    /* JADX INFO: renamed from: S */
    private int f161857S;

    /* JADX INFO: renamed from: T */
    private int f161858T;

    /* JADX INFO: renamed from: U */
    private int f161859U;

    /* JADX INFO: renamed from: V */
    private int f161860V;

    /* JADX INFO: renamed from: W */
    private int f161861W;

    /* JADX INFO: renamed from: X */
    private int f161862X;

    /* JADX INFO: renamed from: Y */
    private int f161863Y;

    /* JADX INFO: renamed from: Z */
    private int f161864Z;

    /* JADX INFO: renamed from: f0 */
    private int f161870f0;

    /* JADX INFO: renamed from: g0 */
    private int f161871g0;

    /* JADX INFO: renamed from: h0 */
    private EnumC35444a f161872h0;

    /* JADX INFO: renamed from: i0 */
    private float f161873i0;

    /* JADX INFO: renamed from: j0 */
    private float f161874j0;

    /* JADX INFO: renamed from: k0 */
    private float f161875k0;

    /* JADX INFO: renamed from: w */
    private Context f161877w;

    /* JADX INFO: renamed from: x */
    private Handler f161878x;

    /* JADX INFO: renamed from: y */
    private int f161879y;

    /* JADX INFO: renamed from: z */
    private int f161880z;

    /* JADX INFO: renamed from: M */
    private float[] f161851M = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: a0 */
    private int[] f161865a0 = new int[1];

    /* JADX INFO: renamed from: b0 */
    private float[] f161866b0 = new float[16];

    /* JADX INFO: renamed from: c0 */
    private C25566c f161867c0 = new C25566c();

    /* JADX INFO: renamed from: d0 */
    private C24082e f161868d0 = C24082e.m71000Y();

    /* JADX INFO: renamed from: e0 */
    private C24079b f161869e0 = C24079b.m70996Y(Boolean.FALSE, true);

    /* JADX INFO: renamed from: l0 */
    private InterfaceC34116n f161876l0 = new C34117o(C12723b.m35566a().m35569d(), "Selfie.EglRenderer");

    /* JADX INFO: renamed from: wz2.b$a */
    public class a implements InterfaceC3255b {
        public a() {
        }

        @Override // bh3.InterfaceC3255b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo9472b(Integer num) {
            int iIntValue = (num.intValue() >> 16) & 255;
            int iIntValue2 = (num.intValue() >> 8) & 255;
            int iIntValue3 = num.intValue() & 255;
            C37783b.this.f161873i0 = iIntValue / 256.0f;
            C37783b.this.f161874j0 = iIntValue2 / 256.0f;
            C37783b.this.f161875k0 = iIntValue3 / 256.0f;
        }
    }

    /* JADX INFO: renamed from: wz2.b$b */
    public class b implements InterfaceC3255b {
        public b() {
        }

        @Override // bh3.InterfaceC3255b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo9472b(EnumC35444a enumC35444a) {
            C37783b.this.f161872h0 = enumC35444a;
        }
    }

    public C37783b(Context context, SurfaceTexture surfaceTexture, int i13, int i14, C38280g<EnumC35444a> c38280g, C38280g<Integer> c38280g2) {
        this.f161877w = context;
        this.f161844F = surfaceTexture;
        this.f161879y = i13;
        this.f161880z = i14;
        this.f161843E = i13 / i14;
        this.f161867c0.m75179c(c38280g2.m122661K(new a()));
        this.f161867c0.m75179c(c38280g.m122661K(new b()));
    }

    /* JADX INFO: renamed from: e */
    private void m121256e(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            InterfaceC34116n interfaceC34116n = this.f161876l0;
            StringBuilder sbM35484d = AbstractC12682p.m35484d(str, ": glError ");
            sbM35484d.append(GLUtils.getEGLErrorString(iGlGetError));
            interfaceC34116n.mo85222m(sbM35484d.toString(), new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m121257f() {
        m121258g();
        this.f161845G.m121278b();
        this.f161847I.m121249e();
    }

    /* JADX INFO: renamed from: g */
    private void m121258g() {
        GLES20.glDeleteTextures(1, this.f161865a0, 0);
        GLES20.glDeleteProgram(this.f161852N);
        this.f161846H.release();
        this.f161846H.setOnFrameAvailableListener(null);
    }

    /* JADX INFO: renamed from: h */
    private void m121259h() {
        GLES20.glViewport(0, 0, this.f161870f0, this.f161871g0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
        GLES20.glUseProgram(this.f161852N);
        m121265q();
        GLES20.glDrawElements(4, f161842n0.length, 5123, this.f161854P);
        GLES20.glDisableVertexAttribArray(this.f161857S);
        GLES20.glDisableVertexAttribArray(this.f161856R);
    }

    /* JADX INFO: renamed from: k */
    private String m121260k(String str) throws IOException {
        InputStream inputStreamOpen = this.f161877w.getAssets().open(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
        StringBuilder sb4 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                inputStreamOpen.close();
                return sb4.toString();
            }
            sb4.append(line);
            sb4.append("\n");
        }
    }

    /* JADX INFO: renamed from: l */
    private void m121261l() {
        C37782a c37782a = new C37782a(3, this.f161876l0);
        this.f161847I = c37782a;
        C37784c c37784c = new C37784c(c37782a, this.f161844F, this.f161876l0);
        this.f161845G = c37784c;
        c37784c.m121277a();
        m121262m();
    }

    /* JADX INFO: renamed from: m */
    private void m121262m() {
        m121270v();
        m121269u();
        m121267s();
        m121268t();
        this.f161869e0.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: n */
    private void m121263n() {
        m121266r(this.f161879y, this.f161880z);
        if (TextUtils.isEmpty(this.f161848J) || TextUtils.isEmpty(this.f161849K)) {
            try {
                this.f161848J = m121260k("shaders/cameratint.frag.glsl");
                this.f161849K = m121260k("shaders/cameratint.vert.glsl");
            } catch (IOException e5) {
                this.f161876l0.mo85230v("Failed to load shaders", e5, new AbstractC30556a.a[0]);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private void m121264o() {
        this.f161858T = GLES20.glGetUniformLocation(this.f161852N, "camTexture");
        this.f161859U = GLES20.glGetUniformLocation(this.f161852N, "camTextureTransform");
        this.f161856R = GLES20.glGetAttribLocation(this.f161852N, "camTexCoordinate");
        this.f161857S = GLES20.glGetAttribLocation(this.f161852N, "position");
        this.f161860V = GLES20.glGetUniformLocation(this.f161852N, "overlay");
        this.f161861W = GLES20.glGetUniformLocation(this.f161852N, "tintEnabled");
        this.f161862X = GLES20.glGetUniformLocation(this.f161852N, "tintR");
        this.f161863Y = GLES20.glGetUniformLocation(this.f161852N, "tintG");
        this.f161864Z = GLES20.glGetUniformLocation(this.f161852N, "tintB");
        m121256e("attrib and uniform locations");
        this.f161855Q = true;
    }

    /* JADX INFO: renamed from: q */
    private void m121265q() {
        if (!this.f161855Q) {
            m121264o();
        }
        GLES20.glEnableVertexAttribArray(this.f161857S);
        GLES20.glVertexAttribPointer(this.f161857S, 2, 5126, false, 8, (Buffer) this.f161853O);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f161865a0[0]);
        GLES20.glUniform1i(this.f161858T, 0);
        GLES20.glEnableVertexAttribArray(this.f161856R);
        GLES20.glVertexAttribPointer(this.f161856R, 2, 5126, false, 8, (Buffer) this.f161850L);
        GLES20.glUniformMatrix4fv(this.f161859U, 1, false, this.f161866b0, 0);
        GLES20.glUniform1f(this.f161862X, this.f161873i0);
        GLES20.glUniform1f(this.f161863Y, this.f161874j0);
        GLES20.glUniform1f(this.f161864Z, this.f161875k0);
        GLES20.glUniform1i(this.f161861W, this.f161872h0 == EnumC35444a.TINTED ? 1 : 0);
        if (this.f161872h0 == EnumC35444a.DARK) {
            GLES20.glUniform4f(this.f161860V, 0.5f, 0.5f, 0.5f, 1.0f);
        } else {
            GLES20.glUniform4f(this.f161860V, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m121266r(int i13, int i14) {
        int iM117627b = AbstractC36615a.m117627b(i14);
        int iM117626a = AbstractC36615a.m117626a(i13);
        this.f161870f0 = i13;
        this.f161871g0 = i14;
        if (iM117627b > i13) {
            this.f161870f0 = iM117627b;
        }
        if (iM117626a > i14) {
            this.f161871g0 = iM117626a;
        }
    }

    /* JADX INFO: renamed from: s */
    private void m121267s() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f161865a0[0]);
        m121256e("Texture bound");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f161865a0[0]);
        this.f161846H = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX INFO: renamed from: t */
    private void m121268t() {
        int iGlCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader, this.f161849K);
        GLES20.glCompileShader(iGlCreateShader);
        m121256e("Vertex shader compile");
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, this.f161848J);
        GLES20.glCompileShader(iGlCreateShader2);
        m121256e("Pixel shader compile");
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f161852N = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(this.f161852N, iGlCreateShader2);
        GLES20.glLinkProgram(this.f161852N);
        m121256e("Shader program compile");
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f161852N, 35714, iArr, 0);
        if (iArr[0] != 1) {
            this.f161876l0.mo85222m(AbstractC11266d.m30461o("Error while linking program: ", GLES20.glGetProgramInfoLog(this.f161852N)), new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m121269u() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f161851M.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f161850L = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(this.f161851M);
        this.f161850L.position(0);
        GLES20.glGenTextures(1, this.f161865a0, 0);
        m121256e("Texture generated");
    }

    /* JADX INFO: renamed from: v */
    private void m121270v() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(f161842n0.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.f161854P = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(f161842n0);
        this.f161854P.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(f161841m0.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect2.asFloatBuffer();
        this.f161853O = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(f161841m0);
        this.f161853O.position(0);
    }

    /* JADX INFO: renamed from: i */
    public Handler m121271i() {
        return this.f161878x;
    }

    /* JADX INFO: renamed from: j */
    public SurfaceTexture m121272j() {
        return this.f161846H;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            try {
                this.f161846H.updateTexImage();
                this.f161846H.getTransformMatrix(this.f161866b0);
                m121259h();
                this.f161845G.m121277a();
                if (!this.f161845G.m121279c()) {
                    this.f161876l0.mo85222m("swapBuffers failed, killing renderer thread", new AbstractC30556a.a[0]);
                    m121274w();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public C38280g<Boolean> m121273p() {
        return this.f161869e0;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f161878x = new Handler();
        m121261l();
        Looper.loop();
        m121257f();
        this.f161868d0.onNext(Boolean.TRUE);
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        m121263n();
        super.start();
    }

    /* JADX INFO: renamed from: w */
    public void m121274w() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            looperMyLooper.quitSafely();
        }
        this.f161867c0.m75180d();
        this.f161877w = null;
    }
}
