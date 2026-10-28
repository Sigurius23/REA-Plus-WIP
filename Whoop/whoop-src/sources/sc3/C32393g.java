package sc3;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: sc3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C32393g implements InterfaceC32403q {

    /* JADX INFO: renamed from: a */
    public final ArrayList f134137a;

    public C32393g(ArrayList arrayList) {
        this.f134137a = arrayList;
    }

    @Override // sc3.InterfaceC32403q
    public final boolean test(Object obj) {
        ArrayList arrayList = this.f134137a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC32403q) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
