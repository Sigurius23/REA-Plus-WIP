package p465rm;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import p085d9.C11787e;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.InterfaceC24550h;
import p541v2.C35558a;
import p541v2.EnumC35559b;
import p603x2.AbstractC37831a;
import p715kotlin.NoWhenBranchMatchedException;
import sb3.AbstractC32350a;

/* JADX INFO: renamed from: rm.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31543j1 {

    /* JADX INFO: renamed from: a */
    public boolean f130195a;

    /* JADX INFO: renamed from: b */
    public int f130196b;

    /* JADX INFO: renamed from: c */
    public int f130197c;

    /* JADX INFO: renamed from: d */
    public final Object f130198d;

    /* JADX INFO: renamed from: e */
    public final Object f130199e;

    /* JADX INFO: renamed from: f */
    public final Object f130200f;

    /* JADX INFO: renamed from: g */
    public final Object f130201g;

    /* JADX INFO: renamed from: h */
    public Object f130202h;

    public C31543j1(Context context, Handler handler, SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r) {
        Context applicationContext = context.getApplicationContext();
        this.f130198d = applicationContext;
        this.f130199e = handler;
        this.f130200f = surfaceHolderCallbackC31565r;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        AbstractC24543a.m71574j(audioManager);
        this.f130201g = audioManager;
        this.f130196b = 3;
        this.f130197c = m97144c(audioManager, 3);
        int i13 = this.f130196b;
        this.f130195a = AbstractC24567y.f95875a >= 23 ? audioManager.isStreamMute(i13) : m97144c(audioManager, i13) == 0;
        C11787e c11787e = new C11787e(this, 4);
        try {
            applicationContext.registerReceiver(c11787e, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f130202h = c11787e;
        } catch (RuntimeException e5) {
            AbstractC24543a.m71564F("StreamVolumeManager", "Error registering stream volume receiver", e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m97144c(AudioManager audioManager, int i13) {
        try {
            return audioManager.getStreamVolume(i13);
        } catch (RuntimeException e5) {
            StringBuilder sb4 = new StringBuilder(60);
            sb4.append("Could not retrieve stream volume for stream type ");
            sb4.append(i13);
            AbstractC24543a.m71564F("StreamVolumeManager", sb4.toString(), e5);
            return audioManager.getStreamMaxVolume(i13);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m97145a(float f13, long j7) {
        int i13 = (this.f130197c + 1) % 20;
        this.f130197c = i13;
        C35558a[] c35558aArr = (C35558a[]) this.f130199e;
        C35558a c35558a = c35558aArr[i13];
        if (c35558a != null) {
            c35558a.f151278a = j7;
            c35558a.f151279b = f13;
        } else {
            C35558a c35558a2 = new C35558a();
            c35558a2.f151278a = j7;
            c35558a2.f151279b = f13;
            c35558aArr[i13] = c35558a2;
        }
    }

    /* JADX INFO: renamed from: b */
    public float m97146b(float f13) {
        float f14;
        boolean z4;
        int i13;
        float fSignum;
        float f15 = f13;
        float f16 = 0.0f;
        if (f15 <= 0.0f) {
            AbstractC37831a.m121374b("maximumVelocity should be a positive value. You specified=" + f15);
        }
        boolean z13 = this.f130195a;
        EnumC35559b enumC35559b = (EnumC35559b) this.f130198d;
        float[] fArr = (float[]) this.f130200f;
        float[] fArr2 = (float[]) this.f130201g;
        int i14 = this.f130197c;
        C35558a[] c35558aArr = (C35558a[]) this.f130199e;
        C35558a c35558a = c35558aArr[i14];
        if (c35558a == null) {
            f14 = 0.0f;
        } else {
            int i15 = 0;
            C35558a c35558a2 = c35558a;
            while (true) {
                C35558a c35558a3 = c35558aArr[i14];
                if (c35558a3 == null) {
                    f14 = f16;
                    z4 = z13;
                    i13 = 1;
                    break;
                }
                long j7 = c35558a.f151278a;
                f14 = f16;
                z4 = z13;
                long j13 = c35558a3.f151278a;
                float f17 = j7 - j13;
                i13 = 1;
                float fAbs = Math.abs(j13 - c35558a2.f151278a);
                c35558a2 = (enumC35559b == EnumC35559b.f151280w || z4) ? c35558a3 : c35558a;
                if (f17 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i15] = c35558a3.f151279b;
                fArr2[i15] = -f17;
                if (i14 == 0) {
                    i14 = 20;
                }
                i14--;
                i15++;
                if (i15 >= 20) {
                    break;
                }
                f16 = f14;
                z13 = z4;
            }
            if (i15 >= this.f130196b) {
                int iOrdinal = enumC35559b.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = (float[]) this.f130202h;
                        AbstractC32350a.m100708p(fArr2, fArr, i15, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f14;
                    }
                } else {
                    if (iOrdinal != i13) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i16 = i15 - i13;
                    float f18 = fArr2[i16];
                    int i17 = i16;
                    float fAbs2 = f14;
                    while (i17 > 0) {
                        int i18 = i17 - 1;
                        float f19 = fArr2[i18];
                        if (f18 != f19) {
                            float f24 = (z4 ? -fArr[i18] : fArr[i17] - fArr[i18]) / (f18 - f19);
                            fAbs2 += Math.abs(f24) * (f24 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i17 == i16) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i17--;
                        f18 = f19;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f16 = fSignum * 1000;
            } else {
                f16 = f14;
            }
        }
        if (f16 == f14 || Float.isNaN(f16)) {
            return f14;
        }
        if (f16 <= f14) {
            f15 = -f15;
            if (f16 >= f15) {
                return f16;
            }
        } else if (f16 <= f15) {
            f15 = f16;
        }
        return f15;
    }

    /* JADX INFO: renamed from: d */
    public void m97147d() {
        final boolean zIsStreamMute;
        AudioManager audioManager = (AudioManager) this.f130201g;
        final int iM97144c = m97144c(audioManager, this.f130196b);
        int i13 = this.f130196b;
        if (AbstractC24567y.f95875a >= 23) {
            zIsStreamMute = audioManager.isStreamMute(i13);
        } else {
            zIsStreamMute = m97144c(audioManager, i13) == 0;
        }
        if (this.f130197c == iM97144c && this.f130195a == zIsStreamMute) {
            return;
        }
        this.f130197c = iM97144c;
        this.f130195a = zIsStreamMute;
        ((SurfaceHolderCallbackC31565r) this.f130200f).f130359w.f130395M.m31625i(30, new InterfaceC24550h() { // from class: rm.q
            @Override // p309lo.InterfaceC24550h
            public final void invoke(Object obj) {
                ((InterfaceC31582z0) obj).mo97306f(iM97144c, zIsStreamMute);
            }
        });
    }

    public /* synthetic */ C31543j1() {
        this(false, EnumC35559b.f151280w);
    }

    public C31543j1(boolean z4, EnumC35559b enumC35559b) {
        int i13;
        this.f130195a = z4;
        this.f130198d = enumC35559b;
        if (z4 && enumC35559b.equals(EnumC35559b.f151280w)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = enumC35559b.ordinal();
        if (iOrdinal == 0) {
            i13 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 2;
        }
        this.f130196b = i13;
        this.f130199e = new C35558a[20];
        this.f130200f = new float[20];
        this.f130201g = new float[20];
        this.f130202h = new float[3];
    }

    public C31543j1(int i13) {
        this(true, EnumC35559b.f151281x);
    }
}
