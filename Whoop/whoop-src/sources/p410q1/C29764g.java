package p410q1;

import b83.C2813i;
import java.util.List;
import p390p1.C28626i2;
import p390p1.InterfaceC28599c;
import p602x1.C37818d;
import p602x1.C37822h;

/* JADX INFO: renamed from: q1.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C29764g extends AbstractC29771j0 {

    /* JADX INFO: renamed from: d */
    public static final C29764g f121768d = new C29764g(0, 2, 1);

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: d */
    public final void mo91224d(C2813i c2813i, InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0) {
        int i13 = ((C37818d) c2813i.m7996c(0)).f161963a;
        List list = (List) c2813i.m7996c(1);
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = list.get(i14);
            int i15 = i13 + i14;
            interfaceC28599c.mo705k(i15, obj);
            interfaceC28599c.mo702g(i15, obj);
        }
    }
}
