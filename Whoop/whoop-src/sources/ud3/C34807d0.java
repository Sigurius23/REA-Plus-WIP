package ud3;

import d93.InterfaceC11820a;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import l83.C23465k;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22677k0;
import r80.AbstractC31061c;
import wd3.AbstractC37172f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ud3.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34807d0 implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: x */
    public static final C34807d0 f146547x = new C34807d0(new String[0]);

    /* JADX INFO: renamed from: w */
    public final String[] f146548w;

    public C34807d0(String[] namesAndValues) {
        AbstractC22676k.m65750j(namesAndValues, "namesAndValues");
        this.f146548w = namesAndValues;
    }

    /* JADX INFO: renamed from: a */
    public final String m109863a(String str) {
        String[] namesAndValues = this.f146548w;
        AbstractC22676k.m65750j(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int iM60400F = AbstractC21478l0.m60400F(length, 0, -2);
        if (iM60400F > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(namesAndValues[length])) {
            if (length == iM60400F) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    /* JADX INFO: renamed from: c */
    public final String m109864c(int i13) {
        String str = (String) AbstractC25260n.m74084y0(i13 * 2, this.f146548w);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(AbstractC31061c.m95639o("name[", i13, ']'));
    }

    /* JADX INFO: renamed from: d */
    public final C22677k0 m109865d() {
        C22677k0 c22677k0 = new C22677k0(2, false);
        AbstractC25265s.m74139o0(c22677k0.f89339a, this.f146548w);
        return c22677k0;
    }

    /* JADX INFO: renamed from: e */
    public final TreeMap m109866e() {
        AbstractC39421y.m125922G();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            String strM109864c = m109864c(i13);
            Locale locale = Locale.US;
            String strM95641q = AbstractC31061c.m95641q(locale, "US", strM109864c, locale, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(strM95641q);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strM95641q, arrayList);
            }
            arrayList.add(m109867g(i13));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34807d0) {
            return Arrays.equals(this.f146548w, ((C34807d0) obj).f146548w);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final String m109867g(int i13) {
        String str = (String) AbstractC25260n.m74084y0((i13 * 2) + 1, this.f146548w);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(AbstractC31061c.m95639o("value[", i13, ']'));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f146548w);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C23465k[] c23465kArr = new C23465k[size];
        for (int i13 = 0; i13 < size; i13++) {
            c23465kArr[i13] = new C23465k(m109864c(i13), m109867g(i13));
        }
        return AbstractC22681m0.m65777h(c23465kArr);
    }

    /* JADX INFO: renamed from: j */
    public final List m109868j(String name) {
        AbstractC22676k.m65750j(name, "name");
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i13 = 0; i13 < size; i13++) {
            if (name.equalsIgnoreCase(m109864c(i13))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m109867g(i13));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC22676k.m65749i(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? C25271y.f99162w : listUnmodifiableList;
    }

    public final int size() {
        return this.f146548w.length / 2;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            String strM109864c = m109864c(i13);
            String strM109867g = m109867g(i13);
            sb4.append(strM109864c);
            sb4.append(": ");
            if (AbstractC37172f.m119128m(strM109864c)) {
                strM109867g = "██";
            }
            sb4.append(strM109867g);
            sb4.append("\n");
        }
        return sb4.toString();
    }
}
