package p616xi;

import al.AbstractC0954a;
import java.util.List;
import p502ti.AbstractC33821d;
import p502ti.C33822e;
import p502ti.C33826i;
import p502ti.C33830m;

/* JADX INFO: renamed from: xi.a */
/* JADX INFO: loaded from: classes.dex */
public final class C38313a extends AbstractC0954a {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f164193y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38313a(List list, int i13) {
        super(list, 7);
        this.f164193y = i13;
    }

    @Override // p616xi.InterfaceC38318f
    /* JADX INFO: renamed from: k0 */
    public final AbstractC33821d mo84473k0() {
        switch (this.f164193y) {
            case 0:
                return new C33822e((List) this.f3536x, 0);
            case 1:
                return new C33826i((List) this.f3536x, 0);
            case 2:
                return new C33822e((List) this.f3536x, 1);
            case 3:
                return new C33826i((List) this.f3536x, 1);
            case 4:
                return new C33826i((List) this.f3536x, 2);
            default:
                return new C33830m((List) this.f3536x);
        }
    }
}
