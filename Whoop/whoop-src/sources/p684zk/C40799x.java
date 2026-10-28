package p684zk;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p167g5.InterfaceC15485d;
import p474s.C31983m2;
import p586wk.C37330h;
import p618xk.InterfaceC38416g;
import pf.AbstractC29125c;
import pg3.C29205p;

/* JADX INFO: renamed from: zk.x */
/* JADX INFO: loaded from: classes.dex */
public final class C40799x {

    /* JADX INFO: renamed from: a */
    public final InterfaceC15485d f175952a;

    /* JADX INFO: renamed from: b */
    public final List f175953b;

    /* JADX INFO: renamed from: c */
    public final String f175954c;

    public C40799x(Class cls, Class cls2, Class cls3, List list, C31983m2 c31983m2) {
        this.f175952a = c31983m2;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f175953b = list;
        this.f175954c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC40801z m132306a(InterfaceC38416g interfaceC38416g, C37330h c37330h, int i13, int i14, C29205p c29205p, List list) throws GlideException {
        List list2 = this.f175953b;
        int size = list2.size();
        InterfaceC40801z interfaceC40801zMo714t = null;
        for (int i15 = 0; i15 < size; i15++) {
            C40785j c40785j = (C40785j) list2.get(i15);
            try {
                InterfaceC15485d interfaceC15485d = c40785j.f175889d;
                Object objMo43684b = interfaceC15485d.mo43684b();
                AbstractC29125c.m88539p(objMo43684b, "Argument must not be null");
                List list3 = (List) objMo43684b;
                try {
                    InterfaceC40801z interfaceC40801zM132285a = c40785j.m132285a(interfaceC38416g, i13, i14, c37330h, list3);
                    interfaceC15485d.mo43683a(list3);
                    try {
                        interfaceC40801zMo714t = c40785j.f175888c.mo714t(c29205p.m88711h(interfaceC40801zM132285a), c37330h);
                    } catch (GlideException e5) {
                        e = e5;
                        list.add(e);
                    }
                    if (interfaceC40801zMo714t != null) {
                        break;
                    }
                } catch (Throwable th3) {
                    interfaceC15485d.mo43683a(list3);
                    throw th3;
                }
            } catch (GlideException e13) {
                e = e13;
            }
        }
        if (interfaceC40801zMo714t != null) {
            return interfaceC40801zMo714t;
        }
        throw new GlideException(this.f175954c, new ArrayList(list));
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f175953b.toArray()) + '}';
    }
}
