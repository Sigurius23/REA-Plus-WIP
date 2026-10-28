package no;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import ed3.C13117a;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import mo.InterfaceC25730k;
import p012ab.C0684i0;
import p031b9.C2817b;
import p309lo.AbstractC24543a;
import p309lo.C24565w;
import p465rm.C31521c0;
import p477s2.AbstractC32073e;

/* JADX INFO: renamed from: no.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C26878k implements InterfaceC25730k, InterfaceC26868a {

    /* JADX INFO: renamed from: I */
    public int f107260I;

    /* JADX INFO: renamed from: J */
    public SurfaceTexture f107261J;

    /* JADX INFO: renamed from: M */
    public byte[] f107264M;

    /* JADX INFO: renamed from: w */
    public final AtomicBoolean f107265w = new AtomicBoolean();

    /* JADX INFO: renamed from: x */
    public final AtomicBoolean f107266x = new AtomicBoolean(true);

    /* JADX INFO: renamed from: y */
    public final C26876i f107267y = new C26876i();

    /* JADX INFO: renamed from: z */
    public final C2817b f107268z = new C2817b(6);

    /* JADX INFO: renamed from: E */
    public final C24565w f107256E = new C24565w(0);

    /* JADX INFO: renamed from: F */
    public final C24565w f107257F = new C24565w(0);

    /* JADX INFO: renamed from: G */
    public final float[] f107258G = new float[16];

    /* JADX INFO: renamed from: H */
    public final float[] f107259H = new float[16];

    /* JADX INFO: renamed from: K */
    public volatile int f107262K = 0;

    /* JADX INFO: renamed from: L */
    public int f107263L = -1;

    /* JADX INFO: renamed from: a */
    public final SurfaceTexture m80227a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        AbstractC24543a.m71571g();
        C26876i c26876i = this.f107267y;
        c26876i.getClass();
        C0684i0 c0684i0 = new C0684i0("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n", 5);
        c26876i.f107248c = c0684i0;
        c26876i.f107249d = GLES20.glGetUniformLocation(c0684i0.f2445x, "uMvpMatrix");
        c26876i.f107250e = GLES20.glGetUniformLocation(c26876i.f107248c.f2445x, "uTexMatrix");
        c26876i.f107251f = c26876i.f107248c.m1729t("aPosition");
        c26876i.f107252g = c26876i.f107248c.m1729t("aTexCoords");
        c26876i.f107253h = GLES20.glGetUniformLocation(c26876i.f107248c.f2445x, "uTexture");
        AbstractC24543a.m71571g();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        AbstractC24543a.m71571g();
        this.f107260I = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f107260I);
        this.f107261J = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C26877j(this, 0));
        return this.f107261J;
    }

    @Override // no.InterfaceC26868a
    /* JADX INFO: renamed from: b */
    public final void mo80221b(long j7, float[] fArr) {
        ((C24565w) this.f107268z.f11021E).m71651a(j7, fArr);
    }

    @Override // no.InterfaceC26868a
    /* JADX INFO: renamed from: c */
    public final void mo80222c() {
        this.f107256E.m71652b();
        C2817b c2817b = this.f107268z;
        ((C24565w) c2817b.f11021E).m71652b();
        c2817b.f11023x = false;
        this.f107266x.set(true);
    }

    @Override // mo.InterfaceC25730k
    /* JADX INFO: renamed from: d */
    public final void mo75868d(long j7, long j13, C31521c0 c31521c0, MediaFormat mediaFormat) {
        int i13;
        ArrayList arrayListM99726T;
        this.f107256E.m71651a(j13, Long.valueOf(j7));
        byte[] bArr = c31521c0.f130087V;
        int i14 = c31521c0.f130088W;
        byte[] bArr2 = this.f107264M;
        int i15 = this.f107263L;
        this.f107264M = bArr;
        if (i14 == -1) {
            i14 = this.f107262K;
        }
        this.f107263L = i14;
        if (i15 == i14 && Arrays.equals(bArr2, this.f107264M)) {
            return;
        }
        byte[] bArr3 = this.f107264M;
        int i16 = 1;
        C26874g c26874g = null;
        if (bArr3 != null) {
            int i17 = this.f107263L;
            C13117a c13117a = new C13117a(bArr3, 1, (byte) 0);
            try {
                c13117a.m36690L(4);
                int iM36699i = c13117a.m36699i();
                c13117a.m36689K(0);
                if (iM36699i == 1886547818) {
                    c13117a.m36690L(8);
                    int i18 = c13117a.f45382b;
                    int i19 = c13117a.f45383c;
                    while (true) {
                        if (i18 < i19) {
                            int iM36699i2 = c13117a.m36699i() + i18;
                            if (iM36699i2 > i18 && iM36699i2 <= i19) {
                                int iM36699i3 = c13117a.m36699i();
                                if (iM36699i3 != 2037673328 && iM36699i3 != 1836279920) {
                                    c13117a.m36689K(iM36699i2);
                                    i18 = iM36699i2;
                                }
                                c13117a.m36688J(iM36699i2);
                                arrayListM99726T = AbstractC32073e.m99726T(c13117a);
                            }
                        }
                        arrayListM99726T = null;
                    }
                } else {
                    arrayListM99726T = AbstractC32073e.m99726T(c13117a);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListM99726T != null) {
                int size = arrayListM99726T.size();
                if (size == 1) {
                    C26872e c26872e = (C26872e) arrayListM99726T.get(0);
                    c26874g = new C26874g(c26872e, c26872e, i17);
                } else if (size == 2) {
                    c26874g = new C26874g((C26872e) arrayListM99726T.get(0), (C26872e) arrayListM99726T.get(1), i17);
                }
            }
        }
        if (c26874g == null || !C26876i.m80226a(c26874g)) {
            int i24 = this.f107263L;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            int i25 = 36;
            float f13 = radians / 36;
            float f14 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i26 < i25) {
                float f15 = radians / 2.0f;
                float f16 = (i26 * f13) - f15;
                int i29 = i26 + 1;
                float f17 = (i29 * f13) - f15;
                int i34 = 0;
                while (i34 < 73) {
                    float f18 = radians;
                    float f19 = f16;
                    float f24 = radians2;
                    int i35 = i27;
                    int i36 = i28;
                    int i37 = 0;
                    int i38 = 2;
                    while (i37 < i38) {
                        float f25 = i37 == 0 ? f19 : f17;
                        int i39 = i29;
                        float f26 = i34 * f14;
                        float f27 = f17;
                        float f28 = f13;
                        double d3 = 50.0f;
                        double d14 = (f26 + 3.1415927f) - (f24 / 2.0f);
                        double d15 = f25;
                        fArr[i35] = -((float) (Math.cos(d15) * Math.sin(d14) * d3));
                        fArr[i35 + 1] = (float) (Math.sin(d15) * d3);
                        int i44 = i35 + 3;
                        fArr[i35 + 2] = (float) (Math.cos(d15) * Math.cos(d14) * d3);
                        fArr2[i36] = f26 / f24;
                        int i45 = i36 + 2;
                        fArr2[i36 + 1] = ((i26 + i37) * f28) / f18;
                        if ((i34 == 0 && i37 == 0) || (i34 == 72 && i37 == 1)) {
                            System.arraycopy(fArr, i35, fArr, i44, 3);
                            i35 += 6;
                            i13 = 2;
                            System.arraycopy(fArr2, i36, fArr2, i45, 2);
                            i36 += 4;
                        } else {
                            i13 = 2;
                            i35 = i44;
                            i36 = i45;
                        }
                        i37++;
                        i38 = i13;
                        i29 = i39;
                        f17 = f27;
                        f13 = f28;
                    }
                    i34++;
                    i27 = i35;
                    i28 = i36;
                    radians = f18;
                    f16 = f19;
                    radians2 = f24;
                    i29 = i29;
                    f13 = f13;
                }
                i26 = i29;
                i25 = 36;
                i16 = 1;
            }
            C26872e c26872e2 = new C26872e(new C26873f(0, fArr, fArr2, i16, 0));
            c26874g = new C26874g(c26872e2, c26872e2, i24);
        }
        this.f107257F.m71651a(j13, c26874g);
    }
}
