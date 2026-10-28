package iq0;

import io.getstream.chat.android.models.Message;
import n23.AbstractC26205h;
import o23.InterfaceC27471a;

/* JADX INFO: renamed from: iq0.p */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20837p implements InterfaceC27471a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78350w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20834m f78351x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Message f78352y;

    public /* synthetic */ C20837p(C20834m c20834m, Message message, int i13) {
        this.f78350w = i13;
        this.f78351x = c20834m;
        this.f78352y = message;
    }

    @Override // o23.InterfaceC27471a
    public final void onResult(AbstractC26205h abstractC26205h) {
        switch (this.f78350w) {
            case 0:
                C20834m.o.m57555h(this.f78351x, this.f78352y, abstractC26205h);
                break;
            case 1:
                C20834m.m57486Y0(this.f78351x, this.f78352y, abstractC26205h);
                break;
            default:
                C20834m.m57494l1(this.f78351x, this.f78352y, abstractC26205h);
                break;
        }
    }
}
