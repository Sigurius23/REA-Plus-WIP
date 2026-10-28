package p484s9;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import no.C26873f;
import no.C26877j;
import p031b9.C2817b;
import p309lo.C24565w;
import p454r9.InterfaceC31088m;
import p516u8.C34610p;
import p607x8.AbstractC38046a;
import p607x8.C38059n;

/* JADX INFO: renamed from: s9.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C32283h implements InterfaceC31088m, InterfaceC32276a {

    /* JADX INFO: renamed from: I */
    public int f133598I;

    /* JADX INFO: renamed from: J */
    public SurfaceTexture f133599J;

    /* JADX INFO: renamed from: M */
    public byte[] f133602M;

    /* JADX INFO: renamed from: w */
    public final AtomicBoolean f133603w = new AtomicBoolean();

    /* JADX INFO: renamed from: x */
    public final AtomicBoolean f133604x = new AtomicBoolean(true);

    /* JADX INFO: renamed from: y */
    public final C32282g f133605y = new C32282g();

    /* JADX INFO: renamed from: z */
    public final C2817b f133606z = new C2817b(9);

    /* JADX INFO: renamed from: E */
    public final C24565w f133594E = new C24565w(1);

    /* JADX INFO: renamed from: F */
    public final C24565w f133595F = new C24565w(1);

    /* JADX INFO: renamed from: G */
    public final float[] f133596G = new float[16];

    /* JADX INFO: renamed from: H */
    public final float[] f133597H = new float[16];

    /* JADX INFO: renamed from: K */
    public volatile int f133600K = 0;

    /* JADX INFO: renamed from: L */
    public int f133601L = -1;

    /* JADX INFO: renamed from: a */
    public final SurfaceTexture m100460a() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC38046a.m121808c();
            this.f133605y.m100459a();
            AbstractC38046a.m121808c();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC38046a.m121808c();
            int i13 = iArr[0];
            AbstractC38046a.m121807b(36197, i13);
            this.f133598I = i13;
        } catch (GlUtil$GlException e5) {
            AbstractC38046a.m121813h("SceneRenderer", "Failed to initialize the renderer", e5);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f133598I);
        this.f133599J = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C26877j(this, 1));
        return this.f133599J;
    }

    @Override // p484s9.InterfaceC32276a
    /* JADX INFO: renamed from: b */
    public final void mo8048b(long j7, float[] fArr) {
        ((C24565w) this.f133606z.f11021E).m71651a(j7, fArr);
    }

    @Override // p484s9.InterfaceC32276a
    /* JADX INFO: renamed from: c */
    public final void mo8049c() {
        this.f133594E.m71652b();
        C2817b c2817b = this.f133606z;
        ((C24565w) c2817b.f11021E).m71652b();
        c2817b.f11023x = false;
        this.f133604x.set(true);
    }

    @Override // p454r9.InterfaceC31088m
    /* JADX INFO: renamed from: d */
    public final void mo8050d(long j7, long j13, C34610p c34610p, MediaFormat mediaFormat) {
        int i13;
        ArrayList arrayListM100456x;
        this.f133594E.m71651a(j13, Long.valueOf(j7));
        byte[] bArr = c34610p.f145795z;
        int i14 = c34610p.f145756A;
        byte[] bArr2 = this.f133602M;
        int i15 = this.f133601L;
        this.f133602M = bArr;
        if (i14 == -1) {
            i14 = this.f133600K;
        }
        this.f133601L = i14;
        if (i15 == i14 && Arrays.equals(bArr2, this.f133602M)) {
            return;
        }
        byte[] bArr3 = this.f133602M;
        int i16 = 1;
        C32280e c32280e = null;
        if (bArr3 != null) {
            int i17 = this.f133601L;
            C38059n c38059n = new C38059n(bArr3);
            try {
                c38059n.m121847G(4);
                int iM121854g = c38059n.m121854g();
                c38059n.m121846F(0);
                if (iM121854g == 1886547818) {
                    c38059n.m121847G(8);
                    int i18 = c38059n.f163018b;
                    int i19 = c38059n.f163019c;
                    while (true) {
                        if (i18 < i19) {
                            int iM121854g2 = c38059n.m121854g() + i18;
                            if (iM121854g2 > i18 && iM121854g2 <= i19) {
                                int iM121854g3 = c38059n.m121854g();
                                if (iM121854g3 != 2037673328 && iM121854g3 != 1836279920) {
                                    c38059n.m121846F(iM121854g2);
                                    i18 = iM121854g2;
                                }
                                c38059n.m121845E(iM121854g2);
                                arrayListM100456x = AbstractC32281f.m100456x(c38059n);
                            }
                        }
                        arrayListM100456x = null;
                    }
                } else {
                    arrayListM100456x = AbstractC32281f.m100456x(c38059n);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListM100456x != null) {
                int size = arrayListM100456x.size();
                if (size == 1) {
                    C32279d c32279d = (C32279d) arrayListM100456x.get(0);
                    c32280e = new C32280e(c32279d, c32279d, i17);
                } else if (size == 2) {
                    c32280e = new C32280e((C32279d) arrayListM100456x.get(0), (C32279d) arrayListM100456x.get(1), i17);
                }
            }
        }
        if (c32280e == null || !C32282g.m100458b(c32280e)) {
            int i24 = this.f133601L;
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
            C32279d c32279d2 = new C32279d(new C26873f(0, fArr, fArr2, i16, 1));
            c32280e = new C32280e(c32279d2, c32279d2, i24);
        }
        this.f133595F.m71651a(j13, c32280e);
    }
}
