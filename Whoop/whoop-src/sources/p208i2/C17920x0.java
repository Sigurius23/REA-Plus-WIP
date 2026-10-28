package p208i2;

import al.AbstractC0954a;
import androidx.profileinstaller.ProfileVerifier;
import no.nordicsemi.android.dfu.DfuBaseService;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17920x0 implements InterfaceC17886g0 {

    /* JADX INFO: renamed from: E */
    public float f69640E;

    /* JADX INFO: renamed from: F */
    public float f69641F;

    /* JADX INFO: renamed from: G */
    public float f69642G;

    /* JADX INFO: renamed from: H */
    public long f69643H;

    /* JADX INFO: renamed from: I */
    public long f69644I;

    /* JADX INFO: renamed from: J */
    public float f69645J;

    /* JADX INFO: renamed from: K */
    public float f69646K;

    /* JADX INFO: renamed from: L */
    public float f69647L;

    /* JADX INFO: renamed from: M */
    public float f69648M;

    /* JADX INFO: renamed from: N */
    public long f69649N;

    /* JADX INFO: renamed from: O */
    public InterfaceC17869a1 f69650O;

    /* JADX INFO: renamed from: P */
    public boolean f69651P;

    /* JADX INFO: renamed from: Q */
    public int f69652Q;

    /* JADX INFO: renamed from: R */
    public long f69653R;

    /* JADX INFO: renamed from: S */
    public InterfaceC39171c f69654S;

    /* JADX INFO: renamed from: T */
    public EnumC39181m f69655T;

    /* JADX INFO: renamed from: U */
    public AbstractC0954a f69656U;

    /* JADX INFO: renamed from: V */
    public int f69657V;

    /* JADX INFO: renamed from: W */
    public AbstractC17904p0 f69658W;

    /* JADX INFO: renamed from: w */
    public int f69659w;

    /* JADX INFO: renamed from: x */
    public float f69660x;

    /* JADX INFO: renamed from: y */
    public float f69661y;

    /* JADX INFO: renamed from: z */
    public float f69662z;

    /* JADX INFO: renamed from: C */
    public final void m51549C(float f13) {
        if (this.f69640E == f13) {
            return;
        }
        this.f69659w |= 8;
        this.f69640E = f13;
    }

    /* JADX INFO: renamed from: E */
    public final void m51550E(float f13) {
        if (this.f69641F == f13) {
            return;
        }
        this.f69659w |= 16;
        this.f69641F = f13;
    }

    /* JADX INFO: renamed from: a */
    public final void m51551a(float f13) {
        if (this.f69662z == f13) {
            return;
        }
        this.f69659w |= 4;
        this.f69662z = f13;
    }

    /* JADX INFO: renamed from: b */
    public final void m51552b(long j7) {
        if (C17919x.m51542d(this.f69643H, j7)) {
            return;
        }
        this.f69659w |= 64;
        this.f69643H = j7;
    }

    /* JADX INFO: renamed from: c */
    public final void m51553c(float f13) {
        if (this.f69648M == f13) {
            return;
        }
        this.f69659w |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        this.f69648M = f13;
    }

    /* JADX INFO: renamed from: e */
    public final void m51554e(boolean z4) {
        if (this.f69651P != z4) {
            this.f69659w |= DfuBaseService.ERROR_CONNECTION_MASK;
            this.f69651P = z4;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m51555f(int i13) {
        if (this.f69652Q == i13) {
            return;
        }
        this.f69659w |= 32768;
        this.f69652Q = i13;
    }

    /* JADX INFO: renamed from: g */
    public final void m51556g(AbstractC0954a abstractC0954a) {
        if (AbstractC22676k.m65745e(this.f69656U, abstractC0954a)) {
            return;
        }
        this.f69659w |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        this.f69656U = abstractC0954a;
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f69654S.getDensity();
    }

    /* JADX INFO: renamed from: k */
    public final void m51557k(float f13) {
        if (this.f69645J == f13) {
            return;
        }
        this.f69659w |= 256;
        this.f69645J = f13;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f69654S.getFontScale();
    }

    /* JADX INFO: renamed from: n */
    public final void m51558n(float f13) {
        if (this.f69646K == f13) {
            return;
        }
        this.f69659w |= 512;
        this.f69646K = f13;
    }

    /* JADX INFO: renamed from: o */
    public final void m51559o(float f13) {
        if (this.f69647L == f13) {
            return;
        }
        this.f69659w |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        this.f69647L = f13;
    }

    /* JADX INFO: renamed from: p */
    public final void m51560p(float f13) {
        if (this.f69660x == f13) {
            return;
        }
        this.f69659w |= 1;
        this.f69660x = f13;
    }

    /* JADX INFO: renamed from: r */
    public final void m51561r(float f13) {
        if (this.f69661y == f13) {
            return;
        }
        this.f69659w |= 2;
        this.f69661y = f13;
    }

    /* JADX INFO: renamed from: s */
    public final void m51562s(float f13) {
        if (this.f69642G == f13) {
            return;
        }
        this.f69659w |= 32;
        this.f69642G = f13;
    }

    /* JADX INFO: renamed from: t */
    public final void m51563t(InterfaceC17869a1 interfaceC17869a1) {
        if (AbstractC22676k.m65745e(this.f69650O, interfaceC17869a1)) {
            return;
        }
        this.f69659w |= DfuBaseService.ERROR_REMOTE_MASK;
        this.f69650O = interfaceC17869a1;
    }

    /* JADX INFO: renamed from: v */
    public final void m51564v(long j7) {
        if (C17919x.m51542d(this.f69644I, j7)) {
            return;
        }
        this.f69659w |= 128;
        this.f69644I = j7;
    }

    /* JADX INFO: renamed from: y */
    public final void m51565y(long j7) {
        if (C17881e1.m51436a(this.f69649N, j7)) {
            return;
        }
        this.f69659w |= 4096;
        this.f69649N = j7;
    }
}
