package aa3;

import ca3.C4384k;
import ca3.InterfaceC4385l;
import ea3.C12933d;
import ea3.C12937h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0612d1 {

    /* JADX INFO: renamed from: a */
    public int f2167a;

    /* JADX INFO: renamed from: b */
    public final String f2168b;

    /* JADX INFO: renamed from: c */
    public final int f2169c;

    /* JADX INFO: renamed from: d */
    public final EnumC0621g1 f2170d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f2171e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2172f;

    public C0612d1(int i13, String name, int i14, EnumC0621g1 enumC0621g1) {
        AbstractC22676k.m65750j(name, "name");
        this.f2167a = i13;
        this.f2168b = name;
        this.f2169c = i14;
        this.f2170d = enumC0621g1;
        this.f2171e = new ArrayList(1);
        InterfaceC4385l.f17711a.getClass();
        List listM13764a = C4384k.m13764a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM13764a, 10));
        Iterator it = listM13764a.iterator();
        while (it.hasNext()) {
            ((C12933d) ((InterfaceC4385l) it.next())).getClass();
            arrayList.add(new C12937h());
        }
        this.f2172f = arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0612d1(String name, int i13, EnumC0621g1 enumC0621g1) {
        this(0, name, i13, enumC0621g1);
        AbstractC22676k.m65750j(name, "name");
    }
}
