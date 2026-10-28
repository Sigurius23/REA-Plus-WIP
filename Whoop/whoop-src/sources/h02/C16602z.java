package h02;

import c93.InterfaceC4339a;
import h11.AbstractC16611f;
import j93.InterfaceC21456a0;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import rs2.AbstractC31795a;

/* JADX INFO: renamed from: h02.z */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16602z implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63865w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f63866x;

    public /* synthetic */ C16602z(List list, int i13) {
        this.f63865w = i13;
        this.f63866x = list;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f63865w) {
            case 0:
                return Integer.valueOf(AbstractC16563b0.m46904l(this.f63866x));
            case 1:
                return Integer.valueOf(AbstractC16611f.m47151i(this.f63866x));
            case 2:
                Object obj = this.f63866x.get(2);
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            case 3:
                return Integer.valueOf(AbstractC31795a.m98742m(this.f63866x));
            case 4:
                return ((InterfaceC21456a0) this.f63866x.get(0)).getClassifier();
            default:
                return ((InterfaceC21456a0) this.f63866x.get(0)).getClassifier();
        }
    }
}
