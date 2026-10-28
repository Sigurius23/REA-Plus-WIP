package aa3;

import ca3.C4384k;
import ca3.InterfaceC4385l;
import ea3.C12932c;
import ea3.C12933d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0664y0 {

    /* JADX INFO: renamed from: a */
    public int f2298a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2299b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f2300c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f2301d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f2302e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2303f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f2304g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f2305h;

    public C0664y0(int i13, String name) {
        AbstractC22676k.m65750j(name, "name");
        this.f2298a = i13;
        this.f2299b = new ArrayList(0);
        this.f2300c = new ArrayList(0);
        new ArrayList(0);
        this.f2301d = new ArrayList();
        this.f2302e = new ArrayList();
        this.f2303f = new ArrayList(0);
        this.f2304g = new ArrayList(0);
        InterfaceC4385l.f17711a.getClass();
        List listM13764a = C4384k.m13764a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM13764a, 10));
        Iterator it = listM13764a.iterator();
        while (it.hasNext()) {
            ((C12933d) ((InterfaceC4385l) it.next())).getClass();
            arrayList.add(new C12932c());
        }
        this.f2305h = arrayList;
    }
}
