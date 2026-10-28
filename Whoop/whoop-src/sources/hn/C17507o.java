package hn;

import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: hn.o */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C17507o implements InterfaceC17512t {

    /* JADX INFO: renamed from: x */
    public static final C17507o f67735x = new C17507o(0);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67736w;

    public /* synthetic */ C17507o(int i13) {
        this.f67736w = i13;
    }

    @Override // hn.InterfaceC17512t
    /* JADX INFO: renamed from: a */
    public int mo49749a(Object obj) {
        C17504l c17504l = (C17504l) obj;
        switch (this.f67736w) {
            case 1:
                String str = c17504l.f67657a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (AbstractC24567y.f95875a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return c17504l.f67657a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
