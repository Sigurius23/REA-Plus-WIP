package ja3;

import c93.InterfaceC4339a;
import cb3.AbstractC4393e;
import ia3.C18295a;
import ia3.InterfaceC18300f;
import java.util.ArrayList;
import m83.AbstractC25267u;
import p249jc.AbstractC21598x;
import r93.InterfaceC31165x0;
import x93.C38108b0;
import x93.C38122n;

/* JADX INFO: renamed from: ja3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C21511g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82501w;

    /* JADX INFO: renamed from: x */
    public final C21513i f82502x;

    public /* synthetic */ C21511g(C21513i c21513i, int i13) {
        this.f82501w = i13;
        this.f82502x = c21513i;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f82501w) {
            case 0:
                C21513i c21513i = this.f82502x;
                if (AbstractC4393e.m13808f(c21513i) == null) {
                    return null;
                }
                ((C18295a) c21513i.f82506G.f177224x).f71245w.getClass();
                return null;
            case 1:
                C21513i c21513i2 = this.f82502x;
                C38122n c38122n = c21513i2.f82507H;
                ArrayList<C38108b0> typeParameters = c38122n.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(typeParameters, 10));
                for (C38108b0 c38108b0 : typeParameters) {
                    InterfaceC31165x0 interfaceC31165x0Mo52687a = ((InterfaceC18300f) c21513i2.f82509J.f177225y).mo52687a(c38108b0);
                    if (interfaceC31165x0Mo52687a == null) {
                        throw new AssertionError("Parameter " + c38108b0 + " surely belongs to class " + c38122n + ", so it must be resolved");
                    }
                    arrayList.add(interfaceC31165x0Mo52687a);
                }
                return arrayList;
            default:
                return AbstractC21598x.m60704u(this.f82502x);
        }
    }
}
