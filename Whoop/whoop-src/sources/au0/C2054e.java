package au0;

import hu0.C17642c;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import qu0.C30624c;

/* JADX INFO: renamed from: au0.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2054e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8168w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f8169x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f8170y;

    public /* synthetic */ C2054e(int i13, int i14, int i15) {
        this.f8168w = i15;
        this.f8169x = i13;
        this.f8170y = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8168w) {
            case 0:
                return C2055f.m6471r(this.f8169x, this.f8170y, (InterfaceC33687a) obj);
            case 1:
                return C17642c.m50268j(this.f8169x, this.f8170y, (InterfaceC33687a) obj);
            default:
                return C30624c.m94017i(this.f8169x, this.f8170y, (InterfaceC33687a) obj);
        }
    }
}
