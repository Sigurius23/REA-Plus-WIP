package bd3;

import l83.C23472r;

/* JADX INFO: renamed from: bd3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C3134m extends C3130k {

    /* JADX INFO: renamed from: d */
    public final boolean f12289d;

    public C3134m(C3143v c3143v, boolean z4) {
        super(c3143v);
        this.f12289d = z4;
    }

    @Override // bd3.C3130k
    /* JADX INFO: renamed from: f */
    public final void mo8995f(byte b) {
        boolean z4 = this.f12289d;
        String strM68039a = C23472r.m68039a(b);
        if (z4) {
            mo9001l(strM68039a);
        } else {
            m8999j(strM68039a);
        }
    }

    @Override // bd3.C3130k
    /* JADX INFO: renamed from: h */
    public final void mo8997h(int i13) {
        boolean z4 = this.f12289d;
        String unsignedString = Integer.toUnsignedString(i13);
        if (z4) {
            mo9001l(unsignedString);
        } else {
            m8999j(unsignedString);
        }
    }

    @Override // bd3.C3130k
    /* JADX INFO: renamed from: i */
    public final void mo8998i(long j7) {
        boolean z4 = this.f12289d;
        String unsignedString = Long.toUnsignedString(j7);
        if (z4) {
            mo9001l(unsignedString);
        } else {
            m8999j(unsignedString);
        }
    }

    @Override // bd3.C3130k
    /* JADX INFO: renamed from: k */
    public final void mo9000k(short s13) {
        if (this.f12289d) {
            mo9001l(String.valueOf(s13 & 65535));
        } else {
            m8999j(String.valueOf(s13 & 65535));
        }
    }
}
