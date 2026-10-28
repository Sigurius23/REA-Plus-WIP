package p031b9;

import android.media.MediaFormat;
import p454r9.InterfaceC31088m;
import p484s9.C32284i;
import p484s9.InterfaceC32276a;
import p516u8.C34610p;

/* JADX INFO: renamed from: b9.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2824d0 implements InterfaceC31088m, InterfaceC32276a, InterfaceC2828e1 {

    /* JADX INFO: renamed from: w */
    public InterfaceC31088m f11067w;

    /* JADX INFO: renamed from: x */
    public InterfaceC32276a f11068x;

    /* JADX INFO: renamed from: y */
    public InterfaceC31088m f11069y;

    /* JADX INFO: renamed from: z */
    public InterfaceC32276a f11070z;

    @Override // p031b9.InterfaceC2828e1
    /* JADX INFO: renamed from: a */
    public final void mo8047a(int i13, Object obj) {
        if (i13 == 7) {
            this.f11067w = (InterfaceC31088m) obj;
            return;
        }
        if (i13 == 8) {
            this.f11068x = (InterfaceC32276a) obj;
            return;
        }
        if (i13 != 10000) {
            return;
        }
        C32284i c32284i = (C32284i) obj;
        if (c32284i == null) {
            this.f11069y = null;
            this.f11070z = null;
        } else {
            this.f11069y = c32284i.getVideoFrameMetadataListener();
            this.f11070z = c32284i.getCameraMotionListener();
        }
    }

    @Override // p484s9.InterfaceC32276a
    /* JADX INFO: renamed from: b */
    public final void mo8048b(long j7, float[] fArr) {
        InterfaceC32276a interfaceC32276a = this.f11070z;
        if (interfaceC32276a != null) {
            interfaceC32276a.mo8048b(j7, fArr);
        }
        InterfaceC32276a interfaceC32276a2 = this.f11068x;
        if (interfaceC32276a2 != null) {
            interfaceC32276a2.mo8048b(j7, fArr);
        }
    }

    @Override // p484s9.InterfaceC32276a
    /* JADX INFO: renamed from: c */
    public final void mo8049c() {
        InterfaceC32276a interfaceC32276a = this.f11070z;
        if (interfaceC32276a != null) {
            interfaceC32276a.mo8049c();
        }
        InterfaceC32276a interfaceC32276a2 = this.f11068x;
        if (interfaceC32276a2 != null) {
            interfaceC32276a2.mo8049c();
        }
    }

    @Override // p454r9.InterfaceC31088m
    /* JADX INFO: renamed from: d */
    public final void mo8050d(long j7, long j13, C34610p c34610p, MediaFormat mediaFormat) {
        long j14;
        long j15;
        C34610p c34610p2;
        MediaFormat mediaFormat2;
        InterfaceC31088m interfaceC31088m = this.f11069y;
        if (interfaceC31088m != null) {
            interfaceC31088m.mo8050d(j7, j13, c34610p, mediaFormat);
            mediaFormat2 = mediaFormat;
            c34610p2 = c34610p;
            j15 = j13;
            j14 = j7;
        } else {
            j14 = j7;
            j15 = j13;
            c34610p2 = c34610p;
            mediaFormat2 = mediaFormat;
        }
        InterfaceC31088m interfaceC31088m2 = this.f11067w;
        if (interfaceC31088m2 != null) {
            interfaceC31088m2.mo8050d(j14, j15, c34610p2, mediaFormat2);
        }
    }
}
