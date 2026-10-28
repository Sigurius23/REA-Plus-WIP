package p715kotlin.jvm.internal;

import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import p306ll.C24499b;
import ud3.C34807d0;
import va3.AbstractC35844b;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: kotlin.jvm.internal.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22677k0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f89339a;

    public C22677k0(int i13, boolean z4) {
        switch (i13) {
            case 2:
                this.f89339a = new ArrayList(20);
                break;
            default:
                this.f89339a = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m65760a(Object obj) {
        this.f89339a.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public void m65761b(String name, String value) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(value, "value");
        AbstractC35844b.m113764e(name);
        AbstractC35844b.m113765f(value, name);
        AbstractC35844b.m113761b(this, name, value);
    }

    /* JADX INFO: renamed from: c */
    public void m65762c(String str) {
        int iM125887f0 = AbstractC39414r.m125887f0(str, ':', 1, false, 4);
        if (iM125887f0 != -1) {
            String strSubstring = str.substring(0, iM125887f0);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(iM125887f0 + 1);
            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
            m65763d(strSubstring, strSubstring2);
            return;
        }
        if (str.charAt(0) != ':') {
            m65763d("", str);
            return;
        }
        String strSubstring3 = str.substring(1);
        AbstractC22676k.m65749i(strSubstring3, "substring(...)");
        m65763d("", strSubstring3);
    }

    /* JADX INFO: renamed from: d */
    public void m65763d(String name, String value) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(value, "value");
        AbstractC35844b.m113761b(this, name, value);
    }

    /* JADX INFO: renamed from: e */
    public void m65764e(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z4 = obj instanceof Object[];
        ArrayList arrayList = this.f89339a;
        if (z4) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it3 = (Iterator) obj;
            while (it3.hasNext()) {
                arrayList.add(it3.next());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m65765f(String name, String value) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(value, "value");
        AbstractC35844b.m113764e(name);
        m65763d(name, value);
    }

    /* JADX INFO: renamed from: g */
    public C34807d0 m65766g() {
        return new C34807d0((String[]) this.f89339a.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: h */
    public String m65767h(String name) {
        AbstractC22676k.m65750j(name, "name");
        ArrayList arrayList = this.f89339a;
        int size = arrayList.size() - 2;
        int iM60400F = AbstractC21478l0.m60400F(size, 0, -2);
        if (iM60400F > size) {
            return null;
        }
        while (!name.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iM60400F) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    /* JADX INFO: renamed from: i */
    public synchronized ArrayList m65768i(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C24499b c24499b : this.f89339a) {
            if (c24499b.f95554a.isAssignableFrom(cls) && cls2.isAssignableFrom(c24499b.f95555b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public void m65769j(String name) {
        AbstractC22676k.m65750j(name, "name");
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f89339a;
            if (i13 >= arrayList.size()) {
                return;
            }
            if (name.equalsIgnoreCase((String) arrayList.get(i13))) {
                arrayList.remove(i13);
                arrayList.remove(i13);
                i13 -= 2;
            }
            i13 += 2;
        }
    }

    public C22677k0(int i13) {
        this.f89339a = new ArrayList(i13);
    }
}
