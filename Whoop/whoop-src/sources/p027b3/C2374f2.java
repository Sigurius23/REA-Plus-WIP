package p027b3;

import android.view.ViewParent;
import androidx.compose.p018ui.platform.AndroidComposeView;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p005a3.C0227m1;
import p005a3.InterfaceC0180a2;
import p181h2.C16616a;
import p181h2.C16617b;
import p208i2.AbstractC17904p0;
import p208i2.AbstractC17918w0;
import p208i2.C17881e1;
import p208i2.C17896l0;
import p208i2.InterfaceC17883f0;
import p249jc.AbstractC21598x;
import p270k2.C22128b;
import p293l2.C23226c;
import p293l2.InterfaceC23228e;
import p549vb.AbstractC35862g;
import p636y3.C39178j;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: b3.f2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2374f2 implements InterfaceC0180a2 {

    /* JADX INFO: renamed from: E */
    public InterfaceC4339a f9360E;

    /* JADX INFO: renamed from: F */
    public long f9361F;

    /* JADX INFO: renamed from: G */
    public boolean f9362G;

    /* JADX INFO: renamed from: I */
    public float[] f9364I;

    /* JADX INFO: renamed from: J */
    public boolean f9365J;

    /* JADX INFO: renamed from: N */
    public int f9369N;

    /* JADX INFO: renamed from: P */
    public AbstractC17904p0 f9371P;

    /* JADX INFO: renamed from: Q */
    public boolean f9372Q;

    /* JADX INFO: renamed from: R */
    public boolean f9373R;

    /* JADX INFO: renamed from: T */
    public boolean f9375T;

    /* JADX INFO: renamed from: w */
    public C23226c f9377w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC17883f0 f9378x;

    /* JADX INFO: renamed from: y */
    public final AndroidComposeView f9379y;

    /* JADX INFO: renamed from: z */
    public InterfaceC4351m f9380z;

    /* JADX INFO: renamed from: H */
    public final float[] f9363H = C17896l0.m51471a();

    /* JADX INFO: renamed from: K */
    public InterfaceC39171c f9366K = AbstractC35862g.m113838a();

    /* JADX INFO: renamed from: L */
    public EnumC39181m f9367L = EnumC39181m.f168423w;

    /* JADX INFO: renamed from: M */
    public final C22128b f9368M = new C22128b();

    /* JADX INFO: renamed from: O */
    public long f9370O = C17881e1.f69566b;

    /* JADX INFO: renamed from: S */
    public boolean f9374S = true;

    /* JADX INFO: renamed from: U */
    public final C0227m1 f9376U = new C0227m1(this, 6);

    public C2374f2(C23226c c23226c, InterfaceC17883f0 interfaceC17883f0, AndroidComposeView androidComposeView, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a) {
        this.f9377w = c23226c;
        this.f9378x = interfaceC17883f0;
        this.f9379y = androidComposeView;
        this.f9380z = interfaceC4351m;
        this.f9360E = interfaceC4339a;
        long j7 = Integer.MAX_VALUE;
        this.f9361F = (j7 & 4294967295L) | (j7 << 32);
    }

    /* JADX INFO: renamed from: a */
    public final float[] m7306a() {
        float[] fArrM51471a = this.f9364I;
        if (fArrM51471a == null) {
            fArrM51471a = C17896l0.m51471a();
            this.f9364I = fArrM51471a;
        }
        if (this.f9373R) {
            this.f9373R = false;
            float[] fArrM7307b = m7307b();
            if (this.f9374S) {
                return fArrM7307b;
            }
            if (!AbstractC2417o0.m7421m(fArrM7307b, fArrM51471a)) {
                fArrM51471a[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM51471a[0])) {
            return null;
        }
        return fArrM51471a;
    }

    /* JADX INFO: renamed from: b */
    public final float[] m7307b() {
        boolean z4 = this.f9372Q;
        float[] fArr = this.f9363H;
        if (z4) {
            C23226c c23226c = this.f9377w;
            long jM60656L = c23226c.f91986v;
            InterfaceC23228e interfaceC23228e = c23226c.f91965a;
            if ((9223372034707292159L & jM60656L) == 9205357640488583168L) {
                jM60656L = AbstractC21598x.m60656L(AbstractC35744b.m113239l(this.f9361F));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM60656L >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM60656L & 4294967295L));
            float fMo67223J = interfaceC23228e.mo67223J();
            float fMo67222I = interfaceC23228e.mo67222I();
            float fMo67224K = interfaceC23228e.mo67224K();
            float fMo67237i = interfaceC23228e.mo67237i();
            float fMo67239k = interfaceC23228e.mo67239k();
            float fMo67254z = interfaceC23228e.mo67254z();
            float fMo67228O = interfaceC23228e.mo67228O();
            double d3 = ((double) fMo67224K) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d3);
            float fCos = (float) Math.cos(d3);
            float f13 = -fSin;
            float f14 = (fMo67222I * fCos) - (1.0f * fSin);
            float f15 = (1.0f * fCos) + (fMo67222I * fSin);
            double d14 = ((double) fMo67237i) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d14);
            float fCos2 = (float) Math.cos(d14);
            float f16 = -fSin2;
            float f17 = fSin * fSin2;
            float f18 = fSin * fCos2;
            float f19 = fCos * fSin2;
            float f24 = fCos * fCos2;
            float f25 = (f15 * fSin2) + (fMo67223J * fCos2);
            float f26 = (f15 * fCos2) + ((-fMo67223J) * fSin2);
            double d15 = ((double) fMo67239k) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d15);
            float fCos3 = (float) Math.cos(d15);
            float f27 = -fSin3;
            float f28 = (fCos3 * f17) + (f27 * fCos2);
            float f29 = (f17 * fSin3) + (fCos2 * fCos3);
            float f34 = fSin3 * fCos;
            float f35 = f29 * fMo67254z;
            float f36 = f34 * fMo67254z;
            float f37 = ((fSin3 * f18) + (fCos3 * f16)) * fMo67254z;
            float f38 = f28 * fMo67228O;
            float f39 = fCos * fCos3 * fMo67228O;
            float f43 = ((fCos3 * f18) + (f27 * f16)) * fMo67228O;
            float f44 = f19 * 1.0f;
            float f45 = f13 * 1.0f;
            float f46 = f24 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f35;
                fArr[1] = f36;
                fArr[2] = f37;
                fArr[3] = 0.0f;
                fArr[4] = f38;
                fArr[5] = f39;
                fArr[6] = f43;
                fArr[7] = 0.0f;
                fArr[8] = f44;
                fArr[9] = f45;
                fArr[10] = f46;
                fArr[11] = 0.0f;
                float f47 = -fIntBitsToFloat;
                fArr[12] = ((f35 * f47) - (fIntBitsToFloat2 * f38)) + f25 + fIntBitsToFloat;
                fArr[13] = ((f36 * f47) - (fIntBitsToFloat2 * f39)) + f14 + fIntBitsToFloat2;
                fArr[14] = ((f47 * f37) - (fIntBitsToFloat2 * f43)) + f26;
                fArr[15] = 1.0f;
            }
            this.f9372Q = false;
            this.f9374S = AbstractC17918w0.m51534v(fArr);
        }
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m7308c(C16616a c16616a, boolean z4) {
        float[] fArrM7306a = z4 ? m7306a() : m7307b();
        if (this.f9374S) {
            return;
        }
        if (fArrM7306a != null) {
            C17896l0.m51473c(fArrM7306a, c16616a);
            return;
        }
        c16616a.f63933a = 0.0f;
        c16616a.f63934b = 0.0f;
        c16616a.f63935c = 0.0f;
        c16616a.f63936d = 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final long m7309d(long j7, boolean z4) {
        float[] fArrM7307b;
        if (z4) {
            fArrM7307b = m7306a();
            if (fArrM7307b == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM7307b = m7307b();
        }
        return this.f9374S ? j7 : C17896l0.m51472b(j7, fArrM7307b);
    }

    /* JADX INFO: renamed from: e */
    public final void m7310e(long j7) {
        AndroidComposeView androidComposeView = this.f9379y;
        if (androidComposeView.f4898F) {
            androidComposeView.m3583P(-4.0f);
        }
        C23226c c23226c = this.f9377w;
        if (!C39178j.m124792b(c23226c.f91984t, j7)) {
            c23226c.f91984t = j7;
            c23226c.f91965a.mo67234f((int) (j7 >> 32), c23226c.f91985u, (int) (j7 & 4294967295L));
        }
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7311f(long j7) {
        if (C39180l.m124799a(j7, this.f9361F)) {
            return;
        }
        AndroidComposeView androidComposeView = this.f9379y;
        if (androidComposeView.f4898F) {
            androidComposeView.m3583P(-4.0f);
        }
        this.f9361F = j7;
        if (this.f9365J || this.f9362G) {
            return;
        }
        androidComposeView.invalidate();
        if (true != this.f9365J) {
            this.f9365J = true;
            androidComposeView.m3594z(this, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7312g() {
        if (this.f9365J) {
            if (!C17881e1.m51436a(this.f9370O, C17881e1.f69566b) && !C39180l.m124799a(this.f9377w.f91985u, this.f9361F)) {
                C23226c c23226c = this.f9377w;
                float fM51437b = C17881e1.m51437b(this.f9370O) * ((int) (this.f9361F >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C17881e1.m51438c(this.f9370O) * ((int) (this.f9361F & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fM51437b) << 32);
                if (!C16617b.m47187c(c23226c.f91986v, jFloatToRawIntBits)) {
                    c23226c.f91986v = jFloatToRawIntBits;
                    c23226c.f91965a.mo67220G(jFloatToRawIntBits);
                }
            }
            C23226c c23226c2 = this.f9377w;
            InterfaceC39171c interfaceC39171c = this.f9366K;
            EnumC39181m enumC39181m = this.f9367L;
            long j7 = this.f9361F;
            long j13 = c23226c2.f91985u;
            InterfaceC23228e interfaceC23228e = c23226c2.f91965a;
            if (!C39180l.m124799a(j13, j7)) {
                c23226c2.f91985u = j7;
                long j14 = c23226c2.f91984t;
                interfaceC23228e.mo67234f((int) (j14 >> 32), j7, (int) (4294967295L & j14));
                if (c23226c2.f91973i == 9205357640488583168L) {
                    c23226c2.f91971g = true;
                    c23226c2.m67208a();
                }
            }
            c23226c2.f91966b = interfaceC39171c;
            c23226c2.f91967c = enumC39181m;
            c23226c2.f91968d = this.f9376U;
            interfaceC23228e.mo67214A(interfaceC39171c, enumC39181m, c23226c2, c23226c2.f91969e);
            if (this.f9365J) {
                this.f9365J = false;
                this.f9379y.m3594z(this, false);
            }
        }
    }

    @Override // p005a3.InterfaceC0180a2
    public final void invalidate() {
        if (this.f9365J || this.f9362G) {
            return;
        }
        AndroidComposeView androidComposeView = this.f9379y;
        androidComposeView.invalidate();
        if (true != this.f9365J) {
            this.f9365J = true;
            androidComposeView.m3594z(this, true);
        }
    }
}
