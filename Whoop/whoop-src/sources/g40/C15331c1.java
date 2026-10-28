package g40;

import java.util.ArrayList;
import java.util.Iterator;
import ke3.AbstractC22424a;
import p412q3.InterfaceC29884r;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34801b0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g40.c1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15331c1 implements InterfaceC29884r {

    /* JADX INFO: renamed from: w */
    public final ArrayList f57604w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f57605x;

    public C15331c1(ArrayList arrayList, ArrayList arrayList2) {
        this.f57604w = arrayList;
        this.f57605x = arrayList2;
    }

    /* JADX INFO: renamed from: a */
    public void m43541a(String name, String str) {
        AbstractC22676k.m65750j(name, "name");
        this.f57604w.add(AbstractC22424a.m64604b(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        this.f57605x.add(AbstractC22424a.m64604b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    /* JADX INFO: renamed from: b */
    public void m43542b(String name, String str) {
        AbstractC22676k.m65750j(name, "name");
        this.f57604w.add(AbstractC22424a.m64604b(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        this.f57605x.add(AbstractC22424a.m64604b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
    }

    /* JADX INFO: renamed from: c */
    public C34801b0 m43543c() {
        return new C34801b0(this.f57604w, this.f57605x);
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: n */
    public int mo15743n(int i13) {
        ArrayList arrayList = this.f57605x;
        int i14 = 0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() < i13 && (i14 = i14 + 1) < 0) {
                    AbstractC37056f.m118976c0();
                    throw null;
                }
            }
        }
        return i13 - i14;
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: x */
    public int mo15749x(int i13) {
        return ((Number) this.f57604w.get(i13)).intValue();
    }

    public C15331c1() {
        this.f57604w = new ArrayList();
        this.f57605x = new ArrayList();
    }
}
