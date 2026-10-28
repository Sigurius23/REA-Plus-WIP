package p465rm;

import android.media.MediaFormat;
import mo.InterfaceC25730k;
import no.C26880m;
import no.InterfaceC26868a;

/* JADX INFO: renamed from: rm.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C31567s implements InterfaceC25730k, InterfaceC26868a, InterfaceC31522c1 {

    /* JADX INFO: renamed from: w */
    public InterfaceC25730k f130361w;

    /* JADX INFO: renamed from: x */
    public InterfaceC26868a f130362x;

    /* JADX INFO: renamed from: y */
    public InterfaceC25730k f130363y;

    /* JADX INFO: renamed from: z */
    public InterfaceC26868a f130364z;

    @Override // p465rm.InterfaceC31522c1
    /* JADX INFO: renamed from: a */
    public final void mo75855a(int i13, Object obj) {
        if (i13 == 7) {
            this.f130361w = (InterfaceC25730k) obj;
            return;
        }
        if (i13 == 8) {
            this.f130362x = (InterfaceC26868a) obj;
            return;
        }
        if (i13 != 10000) {
            return;
        }
        C26880m c26880m = (C26880m) obj;
        if (c26880m == null) {
            this.f130363y = null;
            this.f130364z = null;
        } else {
            this.f130363y = c26880m.getVideoFrameMetadataListener();
            this.f130364z = c26880m.getCameraMotionListener();
        }
    }

    @Override // no.InterfaceC26868a
    /* JADX INFO: renamed from: b */
    public final void mo80221b(long j7, float[] fArr) {
        InterfaceC26868a interfaceC26868a = this.f130364z;
        if (interfaceC26868a != null) {
            interfaceC26868a.mo80221b(j7, fArr);
        }
        InterfaceC26868a interfaceC26868a2 = this.f130362x;
        if (interfaceC26868a2 != null) {
            interfaceC26868a2.mo80221b(j7, fArr);
        }
    }

    @Override // no.InterfaceC26868a
    /* JADX INFO: renamed from: c */
    public final void mo80222c() {
        InterfaceC26868a interfaceC26868a = this.f130364z;
        if (interfaceC26868a != null) {
            interfaceC26868a.mo80222c();
        }
        InterfaceC26868a interfaceC26868a2 = this.f130362x;
        if (interfaceC26868a2 != null) {
            interfaceC26868a2.mo80222c();
        }
    }

    @Override // mo.InterfaceC25730k
    /* JADX INFO: renamed from: d */
    public final void mo75868d(long j7, long j13, C31521c0 c31521c0, MediaFormat mediaFormat) {
        long j14;
        long j15;
        C31521c0 c31521c1;
        MediaFormat mediaFormat2;
        InterfaceC25730k interfaceC25730k = this.f130363y;
        if (interfaceC25730k != null) {
            interfaceC25730k.mo75868d(j7, j13, c31521c0, mediaFormat);
            mediaFormat2 = mediaFormat;
            c31521c1 = c31521c0;
            j15 = j13;
            j14 = j7;
        } else {
            j14 = j7;
            j15 = j13;
            c31521c1 = c31521c0;
            mediaFormat2 = mediaFormat;
        }
        InterfaceC25730k interfaceC25730k2 = this.f130361w;
        if (interfaceC25730k2 != null) {
            interfaceC25730k2.mo75868d(j14, j15, c31521c1, mediaFormat2);
        }
    }
}
