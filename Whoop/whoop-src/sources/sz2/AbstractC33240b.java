package sz2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.whoop.whooplive.live.views.WhoopRecordableSurfaceView;
import e50.C12723b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import no.nordicsemi.android.dfu.DfuBaseService;
import p108e4.AbstractC12682p;
import qr2.AbstractC30556a;
import rz2.C31930c;
import tr2.C34117o;

/* JADX INFO: renamed from: sz2.b */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC33240b implements WhoopRecordableSurfaceView.InterfaceC10866b, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: d0 */
    private static float[] f138598d0 = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};

    /* JADX INFO: renamed from: e0 */
    private static short[] f138599e0 = {0, 1, 2, 1, 3, 2};

    /* JADX INFO: renamed from: f0 */
    private static final SparseIntArray f138600f0;

    /* JADX INFO: renamed from: E */
    protected WeakReference<Context> f138601E;

    /* JADX INFO: renamed from: F */
    protected int f138602F;

    /* JADX INFO: renamed from: G */
    protected int f138603G;

    /* JADX INFO: renamed from: H */
    protected SurfaceTexture f138604H;

    /* JADX INFO: renamed from: I */
    private String f138605I;

    /* JADX INFO: renamed from: J */
    private String f138606J;

    /* JADX INFO: renamed from: K */
    private FloatBuffer f138607K;

    /* JADX INFO: renamed from: M */
    protected int f138609M;

    /* JADX INFO: renamed from: N */
    private FloatBuffer f138610N;

    /* JADX INFO: renamed from: O */
    private ShortBuffer f138611O;

    /* JADX INFO: renamed from: P */
    private int f138612P;

    /* JADX INFO: renamed from: Q */
    private int f138613Q;

    /* JADX INFO: renamed from: T */
    private ArrayList<b> f138616T;

    /* JADX INFO: renamed from: W */
    private a f138619W;

    /* JADX INFO: renamed from: X */
    private int f138620X;

    /* JADX INFO: renamed from: Y */
    private int f138621Y;

    /* JADX INFO: renamed from: Z */
    private C31930c f138622Z;

    /* JADX INFO: renamed from: a0 */
    private String f138623a0;

    /* JADX INFO: renamed from: b0 */
    private String f138624b0;

    /* JADX INFO: renamed from: w */
    private C34117o f138626w;

    /* JADX INFO: renamed from: x */
    private int f138627x = 0;

    /* JADX INFO: renamed from: y */
    private String f138628y = "shaders/video.frag.glsl";

    /* JADX INFO: renamed from: z */
    private String f138629z = "shaders/video.vert.glsl";

    /* JADX INFO: renamed from: L */
    private float[] f138608L = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: R */
    private int[] f138614R = new int[16];

    /* JADX INFO: renamed from: S */
    private int[] f138615S = {33985, 33986, 33987, 33988, 33989, 33990, 33991, 33992, 33993, 33994, 33995, 33996, 33997, 33998, 33999, 34000};

    /* JADX INFO: renamed from: U */
    private float[] f138617U = new float[16];

    /* JADX INFO: renamed from: V */
    private float f138618V = 1.0f;

    /* JADX INFO: renamed from: c0 */
    private boolean f138625c0 = false;

    /* JADX INFO: renamed from: sz2.b$a */
    public interface a {
        /* JADX INFO: renamed from: n */
        void mo99416n();
    }

    /* JADX INFO: renamed from: sz2.b$b */
    public class b {

        /* JADX INFO: renamed from: a */
        public int f138630a;

        /* JADX INFO: renamed from: b */
        public int f138631b;

        /* JADX INFO: renamed from: c */
        public String f138632c;

        public /* synthetic */ b(AbstractC33240b abstractC33240b, int i13, int i14, String str, int i15) {
            this(i13, i14, str);
        }

        public String toString() {
            return "[Texture] num: " + this.f138630a + " id: " + this.f138631b + ", uniformName: " + this.f138632c;
        }

        private b(int i13, int i14, String str) {
            this.f138630a = i13;
            this.f138631b = i14;
            this.f138632c = str;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f138600f0 = sparseIntArray;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
    }

    public AbstractC33240b(Context context) {
        m105451o(context, "shaders/video.frag.glsl", "shaders/video.vert.glsl");
        this.f138626w = new C34117o(C12723b.m35566a().m35569d(), "WhoopVideoRendererBase");
    }

    /* JADX INFO: renamed from: o */
    private void m105451o(Context context, String str, String str2) {
        this.f138601E = new WeakReference<>(context);
        this.f138623a0 = str;
        this.f138624b0 = str2;
        m105452q(str, str2);
    }

    /* JADX INFO: renamed from: q */
    private void m105452q(String str, String str2) {
        try {
            this.f138606J = m105466m(this.f138601E.get(), str);
            this.f138605I = m105466m(this.f138601E.get(), str2);
        } catch (IOException e5) {
            Log.e("WhoopVideoRendererBase", "loadFromShadersFromAssets() failed. Check paths to assets.\n" + e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: s */
    private void m105453s() {
    }

    /* JADX INFO: renamed from: A */
    public void m105454A() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f138614R[0]);
        m105461h("Texture bind");
    }

    /* JADX INFO: renamed from: B */
    public void m105455B() {
        int iGlCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader, this.f138605I);
        GLES20.glCompileShader(iGlCreateShader);
        m105461h("Vertex shader compile");
        Log.d("WhoopVideoRendererBase", "vertexShader info log:\n " + GLES20.glGetShaderInfoLog(iGlCreateShader));
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, this.f138606J);
        GLES20.glCompileShader(iGlCreateShader2);
        m105461h("Pixel shader compile");
        Log.d("WhoopVideoRendererBase", "fragmentShader info log:\n " + GLES20.glGetShaderInfoLog(iGlCreateShader2));
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f138609M = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(this.f138609M, iGlCreateShader2);
        GLES20.glLinkProgram(this.f138609M);
        m105461h("Shader program compile");
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f138609M, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Log.e("SurfaceTest", "Error while linking program:\n" + GLES20.glGetProgramInfoLog(this.f138609M));
        }
    }

    /* JADX INFO: renamed from: C */
    public void m105456C() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f138608L.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f138607K = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(this.f138608L);
        this.f138607K.position(0);
        GLES20.glGenTextures(16, this.f138614R, 0);
        m105461h("Texture generate");
    }

    /* JADX INFO: renamed from: D */
    public void m105457D() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(f138599e0.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.f138611O = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(f138599e0);
        this.f138611O.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(f138598d0.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect2.asFloatBuffer();
        this.f138610N = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(f138598d0);
        this.f138610N.position(0);
    }

    /* JADX INFO: renamed from: E */
    public void m105458E(int i13, Bitmap bitmap) {
        GLES20.glActiveTexture(this.f138615S[i13 - 1]);
        m105461h("Texture generate");
        GLES20.glBindTexture(3553, this.f138614R[i13]);
        m105461h("Texture bind");
        GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
        m105461h("Tex Sub Image");
        bitmap.recycle();
    }

    @Override // com.whoop.whooplive.live.views.WhoopRecordableSurfaceView.InterfaceC10866b
    /* JADX INFO: renamed from: a */
    public void mo28679a() {
        m105462i();
        this.f138616T = new ArrayList<>();
        m105468p();
    }

    @Override // com.whoop.whooplive.live.views.WhoopRecordableSurfaceView.InterfaceC10866b
    /* JADX INFO: renamed from: b */
    public void mo28680b() {
    }

    @Override // com.whoop.whooplive.live.views.WhoopRecordableSurfaceView.InterfaceC10866b
    /* JADX INFO: renamed from: c */
    public void mo28681c() {
        SurfaceTexture surfaceTexture = this.f138604H;
        if (surfaceTexture != null) {
            if (this.f138625c0) {
                return;
            }
            surfaceTexture.setOnFrameAvailableListener(this);
            this.f138625c0 = true;
            return;
        }
        if (this.f138622Z.m99409K() != null) {
            this.f138604H = this.f138622Z.m99409K();
        } else {
            this.f138622Z.m99412N(m105465l());
        }
    }

    @Override // com.whoop.whooplive.live.views.WhoopRecordableSurfaceView.InterfaceC10866b
    /* JADX INFO: renamed from: d */
    public void mo28682d() {
        m105462i();
    }

    @Override // com.whoop.whooplive.live.views.WhoopRecordableSurfaceView.InterfaceC10866b
    /* JADX INFO: renamed from: e */
    public void mo28683e() {
        if (this.f138627x > 0) {
            for (int i13 = 0; i13 < this.f138627x; i13++) {
                try {
                    this.f138604H.updateTexImage();
                    this.f138604H.getTransformMatrix(this.f138617U);
                    this.f138627x--;
                } catch (RuntimeException e5) {
                    this.f138626w.mo85222m("Surface Texture Couldn't able to update tex image " + e5.getLocalizedMessage(), new AbstractC30556a.a[0]);
                }
            }
        }
        GLES20.glViewport(0, 0, this.f138620X, this.f138621Y);
        GLES20.glClearColor(0.329412f, 0.329412f, 0.329412f, 0.0f);
        GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
        GLES20.glUseProgram(this.f138609M);
        mo105450y();
        mo105449v();
        m105464k();
        m105469r();
    }

    /* JADX INFO: renamed from: f */
    public int m105459f(int i13, Bitmap bitmap, String str, boolean z4) {
        int size = this.f138616T.size() + 1;
        GLES20.glActiveTexture(i13);
        m105461h("Texture generate");
        GLES20.glBindTexture(3553, this.f138614R[size]);
        m105461h("Texture bind");
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9728.0f);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        if (z4) {
            bitmap.recycle();
        }
        b bVar = new b(this, size, i13, str, 0);
        if (!this.f138616T.contains(bVar)) {
            this.f138616T.add(bVar);
            Log.d("WhoopVideoRendererBase", "addedTexture() " + this.f138614R[size] + " : " + bVar);
        }
        return size;
    }

    /* JADX INFO: renamed from: g */
    public int m105460g(Bitmap bitmap, String str) {
        int i13 = this.f138615S[this.f138616T.size()];
        if (this.f138616T.size() + 1 < 16) {
            return m105459f(i13, bitmap, str, true);
        }
        throw new IllegalStateException("Too many textures! Please don't use so many :(");
    }

    /* JADX INFO: renamed from: h */
    public void m105461h(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            StringBuilder sbM35484d = AbstractC12682p.m35484d(str, ": glError ");
            sbM35484d.append(GLUtils.getEGLErrorString(iGlGetError));
            Log.e("SurfaceTest", sbM35484d.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public void m105462i() {
        m105463j();
    }

    /* JADX INFO: renamed from: j */
    public void m105463j() {
        GLES20.glDeleteTextures(16, this.f138614R, 0);
        GLES20.glDeleteProgram(this.f138609M);
    }

    /* JADX INFO: renamed from: k */
    public void m105464k() {
        GLES20.glDrawElements(4, f138599e0.length, 5123, this.f138611O);
    }

    /* JADX INFO: renamed from: l */
    public int m105465l() {
        int[] iArr = this.f138614R;
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        return iArr[0];
    }

    /* JADX INFO: renamed from: m */
    public String m105466m(Context context, String str) throws IOException {
        return m105467n(context, str, true);
    }

    /* JADX INFO: renamed from: n */
    public String m105467n(Context context, String str, boolean z4) throws IOException {
        InputStream inputStreamOpen = context.getAssets().open(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
        StringBuilder sb4 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                inputStreamOpen.close();
                return sb4.toString();
            }
            sb4.append(line.concat(z4 ? "\n" : ""));
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f138627x++;
        if (this.f138604H == null && this.f138622Z.m99409K() != null) {
            this.f138604H = this.f138622Z.m99409K();
        }
    }

    @Override // com.whoop.whooplive.live.views.WhoopRecordableSurfaceView.InterfaceC10866b
    public void onSurfaceChanged(int i13, int i14) {
        this.f138603G = i14;
        this.f138602F = i13;
        this.f138621Y = i14;
        this.f138620X = i13;
        this.f138618V = (i13 * 1.0f) / i14;
    }

    /* JADX INFO: renamed from: p */
    public void m105468p() {
        m105453s();
        m105457D();
        m105456C();
        m105454A();
        m105455B();
        mo105448t();
    }

    /* JADX INFO: renamed from: r */
    public void m105469r() {
        GLES20.glDisableVertexAttribArray(this.f138613Q);
        GLES20.glDisableVertexAttribArray(this.f138612P);
    }

    /* JADX INFO: renamed from: t */
    public void mo105448t() {
        a aVar = this.f138619W;
        if (aVar != null) {
            aVar.mo99416n();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m105470u(float f13) {
        this.f138618V = f13;
    }

    /* JADX INFO: renamed from: v */
    public void mo105449v() {
        for (int i13 = 0; i13 < this.f138616T.size(); i13++) {
            b bVar = this.f138616T.get(i13);
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f138609M, bVar.f138632c);
            GLES20.glActiveTexture(bVar.f138631b);
            GLES20.glBindTexture(3553, this.f138614R[bVar.f138630a]);
            GLES20.glUniform1i(iGlGetUniformLocation, bVar.f138630a);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m105471w(a aVar) {
        this.f138619W = aVar;
    }

    /* JADX INFO: renamed from: x */
    public void m105472x(SurfaceTexture surfaceTexture) {
        this.f138604H = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX INFO: renamed from: y */
    public void mo105450y() {
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f138609M, "camTexture");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f138609M, "camTextureTransform");
        this.f138612P = GLES20.glGetAttribLocation(this.f138609M, "camTexCoordinate");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f138609M, "position");
        this.f138613Q = iGlGetAttribLocation;
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(this.f138613Q, 2, 5126, false, 8, (Buffer) this.f138610N);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f138614R[0]);
        GLES20.glUniform1i(iGlGetUniformLocation, 0);
        GLES20.glEnableVertexAttribArray(this.f138612P);
        GLES20.glVertexAttribPointer(this.f138612P, 2, 5126, false, 8, (Buffer) this.f138607K);
        GLES20.glUniformMatrix4fv(iGlGetUniformLocation2, 1, false, this.f138617U, 0);
    }

    /* JADX INFO: renamed from: z */
    public void m105473z(C31930c c31930c) {
        this.f138622Z = c31930c;
        c31930c.m99412N(m105465l());
    }
}
