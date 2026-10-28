package p363ob;

import java.util.ArrayList;
import java.util.List;
import p088dc.AbstractC11895b;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39415s;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ob.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C27787j {

    /* JADX INFO: renamed from: a */
    public final String f112032a;

    /* JADX INFO: renamed from: b */
    public final boolean f112033b;

    /* JADX INFO: renamed from: c */
    public final List f112034c;

    /* JADX INFO: renamed from: d */
    public final List f112035d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public C27787j(String name, List columns, List orders, boolean z4) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(columns, "columns");
        AbstractC22676k.m65750j(orders, "orders");
        this.f112032a = name;
        this.f112033b = z4;
        this.f112034c = columns;
        this.f112035d = orders;
        List arrayList = orders;
        if (arrayList.isEmpty()) {
            int size = columns.size();
            arrayList = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList.add("ASC");
            }
        }
        this.f112035d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27787j) {
            C27787j c27787j = (C27787j) obj;
            String str = c27787j.f112032a;
            if (this.f112033b == c27787j.f112033b && AbstractC22676k.m65745e(this.f112034c, c27787j.f112034c) && AbstractC22676k.m65745e(this.f112035d, c27787j.f112035d)) {
                String str2 = this.f112032a;
                return AbstractC39421y.m125930O(str2, "index_", false) ? AbstractC39421y.m125930O(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f112032a;
        return this.f112035d.hashCode() + AbstractC11895b.m31983b((((AbstractC39421y.m125930O(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f112033b ? 1 : 0)) * 31, 31, this.f112034c);
    }

    public final String toString() {
        return AbstractC39415s.m125908r(AbstractC39415s.m125910t("\n            |Index {\n            |   name = '" + this.f112032a + "',\n            |   unique = '" + this.f112033b + "',\n            |   columns = {" + AbstractC34235f.m108212T(this.f112034c) + "\n            |   orders = {" + AbstractC34235f.m108211S(this.f112035d) + "\n            |}\n        "), "    ");
    }
}
