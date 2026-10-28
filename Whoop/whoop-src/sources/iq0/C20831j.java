package iq0;

import bc3.InterfaceC2994c0;
import io.getstream.chat.android.models.Message;
import n23.AbstractC26205h;
import o23.InterfaceC27471a;

/* JADX INFO: renamed from: iq0.j */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20831j implements InterfaceC27471a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78213w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20834m f78214x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f78215y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f78216z;

    public /* synthetic */ C20831j(C20834m c20834m, Object obj, Object obj2, int i13) {
        this.f78213w = i13;
        this.f78214x = c20834m;
        this.f78215y = obj;
        this.f78216z = obj2;
    }

    @Override // o23.InterfaceC27471a
    public final void onResult(AbstractC26205h abstractC26205h) {
        switch (this.f78213w) {
            case 0:
                C20834m.m57491g0(this.f78214x, (String) this.f78215y, (String) this.f78216z, abstractC26205h);
                break;
            case 1:
                C20834m.m57487Z(this.f78214x, (String) this.f78215y, (String) this.f78216z, abstractC26205h);
                break;
            default:
                C20834m.n.m57553l(this.f78214x, (Message) this.f78215y, (InterfaceC2994c0) this.f78216z, abstractC26205h);
                break;
        }
    }
}
