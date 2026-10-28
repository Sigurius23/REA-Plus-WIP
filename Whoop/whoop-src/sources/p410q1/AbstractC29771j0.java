package p410q1;

import b83.C2813i;
import p390p1.C28591a;
import p390p1.C28626i2;
import p390p1.InterfaceC28599c;
import p602x1.C37822h;
import p715kotlin.jvm.internal.AbstractC22671h0;
import sa3.C32328b;
import sa3.C32329c;
import wa3.InterfaceC37014q;

/* JADX INFO: renamed from: q1.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC29771j0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121775a;

    /* JADX INFO: renamed from: b */
    public final int f121776b;

    /* JADX INFO: renamed from: c */
    public final int f121777c;

    public /* synthetic */ AbstractC29771j0(int i13, int i14, int i15, byte b) {
        this.f121775a = i15;
        this.f121776b = i13;
        this.f121777c = i14;
    }

    /* JADX INFO: renamed from: a */
    public static C32329c m91230a(AbstractC29771j0 abstractC29771j0, InterfaceC37014q[] interfaceC37014qArr) {
        return new C32329c(abstractC29771j0.f121776b + abstractC29771j0.f121777c, interfaceC37014qArr);
    }

    /* JADX INFO: renamed from: b */
    public static C32328b m91231b(AbstractC29771j0 abstractC29771j0) {
        return new C32328b(abstractC29771j0.f121776b + abstractC29771j0.f121777c, 1, 1, (byte) 0);
    }

    /* JADX INFO: renamed from: c */
    public static C32328b m91232c() {
        return new C32328b(0, 1, 1, (byte) 0);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo91224d(C2813i c2813i, InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0);

    /* JADX INFO: renamed from: e */
    public abstract Object mo91233e(int i13);

    /* JADX INFO: renamed from: f */
    public C28591a mo91234f(C2813i c2813i) {
        return null;
    }

    public String toString() {
        switch (this.f121775a) {
            case 0:
                String simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(getClass()).getSimpleName();
                return simpleName == null ? "" : simpleName;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC29771j0(int i13, int i14, int i15) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? 0 : i14, 0, (byte) 0);
        this.f121775a = 0;
    }
}
