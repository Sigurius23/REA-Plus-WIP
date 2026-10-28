package p012ab;

import p499t9.InterfaceC33639k0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C0693n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2502a;

    /* JADX INFO: renamed from: b */
    public boolean f2503b;

    /* JADX INFO: renamed from: c */
    public boolean f2504c;

    /* JADX INFO: renamed from: d */
    public boolean f2505d;

    /* JADX INFO: renamed from: e */
    public int f2506e;

    /* JADX INFO: renamed from: f */
    public int f2507f;

    /* JADX INFO: renamed from: g */
    public long f2508g;

    /* JADX INFO: renamed from: h */
    public long f2509h;

    /* JADX INFO: renamed from: i */
    public final Object f2510i;

    public /* synthetic */ C0693n(Object obj, int i13) {
        this.f2502a = i13;
        this.f2510i = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m1747a(byte[] bArr, int i13, int i14) {
        switch (this.f2502a) {
            case 0:
                if (this.f2504c) {
                    int i15 = this.f2507f;
                    int i16 = (i13 + 1) - i15;
                    if (i16 >= i14) {
                        this.f2507f = (i14 - i13) + i15;
                    } else {
                        this.f2505d = ((bArr[i16] & 192) >> 6) == 0;
                        this.f2504c = false;
                    }
                }
                break;
            default:
                if (this.f2504c) {
                    int i17 = this.f2507f;
                    int i18 = (i13 + 1) - i17;
                    if (i18 >= i14) {
                        this.f2507f = (i14 - i13) + i17;
                    } else {
                        this.f2505d = ((bArr[i18] & 192) >> 6) == 0;
                        this.f2504c = false;
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1748b(int i13, long j7, boolean z4) {
        AbstractC35849g.m113807i(this.f2509h != -9223372036854775807L);
        if (this.f2506e == 182 && z4 && this.f2503b) {
            ((InterfaceC33639k0) this.f2510i).mo36174b(this.f2509h, this.f2505d ? 1 : 0, (int) (j7 - this.f2508g), i13, null);
        }
        if (this.f2506e != 179) {
            this.f2508g = j7;
        }
    }
}
