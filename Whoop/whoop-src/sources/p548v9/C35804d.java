package p548v9;

import p607x8.AbstractC38046a;

/* JADX INFO: renamed from: v9.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C35804d implements InterfaceC35801a {

    /* JADX INFO: renamed from: a */
    public final int f152304a;

    /* JADX INFO: renamed from: b */
    public final int f152305b;

    /* JADX INFO: renamed from: c */
    public final int f152306c;

    /* JADX INFO: renamed from: d */
    public final int f152307d;

    /* JADX INFO: renamed from: e */
    public final int f152308e;

    /* JADX INFO: renamed from: f */
    public final int f152309f;

    public C35804d(int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f152304a = i13;
        this.f152305b = i14;
        this.f152306c = i15;
        this.f152307d = i16;
        this.f152308e = i17;
        this.f152309f = i18;
    }

    /* JADX INFO: renamed from: a */
    public final int m113523a() {
        int i13 = this.f152304a;
        if (i13 == 1935960438) {
            return 2;
        }
        if (i13 == 1935963489) {
            return 1;
        }
        if (i13 == 1937012852) {
            return 3;
        }
        AbstractC38046a.m121826u("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i13));
        return -1;
    }

    @Override // p548v9.InterfaceC35801a
    public final int getType() {
        return 1752331379;
    }
}
