package vu;

import com.mapbox.bindgen.Value;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: vu.a */
/* JADX INFO: loaded from: classes6.dex */
public class C36500a {

    /* JADX INFO: renamed from: a */
    public final String f155938a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f155939b = new ArrayList();

    public C36500a(String str) {
        this.f155938a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m116998a(C36503d expression) {
        AbstractC22676k.m65750j(expression, "expression");
        this.f155939b.add(expression);
    }

    /* JADX INFO: renamed from: b */
    public final C36503d m116999b() {
        if (!this.f155938a.equals("match")) {
            return new C36503d(this);
        }
        C36500a c36500a = new C36500a("match");
        ArrayList arrayList = this.f155939b;
        int size = arrayList.size() - 1;
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C36503d c36503d = (C36503d) obj;
            if (i13 % 2 == 1 && i13 != size) {
                AbstractC22676k.m65750j(c36503d, "<this>");
                if (c36503d.getContents() instanceof List) {
                    Object contents = c36503d.getContents();
                    AbstractC22676k.m65748h(contents, "null cannot be cast to non-null type kotlin.collections.List<com.mapbox.bindgen.Value>");
                    List list = (List) contents;
                    Object contents2 = ((Value) AbstractC25265s.m74096F0(list)).getContents();
                    if ("literal".equals(contents2 instanceof String ? (String) contents2 : null)) {
                        Object contents3 = ((Value) AbstractC25265s.m74112P0(list)).getContents();
                        if (contents3 instanceof List) {
                            c36503d = new C36503d((List) contents3);
                        }
                    }
                }
            }
            c36500a.m116998a(c36503d);
            i13 = i14;
        }
        return new C36503d(c36500a);
    }

    /* JADX INFO: renamed from: c */
    public final void m117000c(double d3) {
        this.f155939b.add(new C36503d(d3));
    }
}
