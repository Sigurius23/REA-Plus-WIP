package p333n4;

import g73.C15556d;
import ih0.AbstractC18489d0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import p108e4.AbstractC12682p;
import p136f4.C14051c;
import p319m4.AbstractC25022k;
import p319m4.C25016e;
import p319m4.C25017f;

/* JADX INFO: renamed from: n4.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C26259o {

    /* JADX INFO: renamed from: f */
    public static int f104399f;

    /* JADX INFO: renamed from: a */
    public ArrayList f104400a;

    /* JADX INFO: renamed from: b */
    public int f104401b;

    /* JADX INFO: renamed from: c */
    public int f104402c;

    /* JADX INFO: renamed from: d */
    public ArrayList f104403d;

    /* JADX INFO: renamed from: e */
    public int f104404e;

    /* JADX INFO: renamed from: a */
    public final boolean m77935a(C25016e c25016e) {
        ArrayList arrayList = this.f104400a;
        if (arrayList.contains(c25016e)) {
            return false;
        }
        arrayList.add(c25016e);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m77936b(ArrayList arrayList) {
        int size = this.f104400a.size();
        if (this.f104404e != -1 && size > 0) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                C26259o c26259o = (C26259o) arrayList.get(i13);
                if (this.f104404e == c26259o.f104401b) {
                    m77938d(this.f104402c, c26259o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m77937c(C14051c c14051c, int i13) {
        int iM39994n;
        int iM39994n2;
        ArrayList arrayList = this.f104400a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C25017f c25017f = ((C25016e) arrayList.get(0)).f97901U;
        c14051c.m40013t();
        c25017f.mo67544c(c14051c, false);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((C25016e) arrayList.get(i14)).mo67544c(c14051c, false);
        }
        if (i13 == 0 && c25017f.f97950A0 > 0) {
            AbstractC25022k.m73475a(c25017f, c14051c, arrayList, 0);
        }
        if (i13 == 1 && c25017f.f97951B0 > 0) {
            AbstractC25022k.m73475a(c25017f, c14051c, arrayList, 1);
        }
        try {
            c14051c.m40009p();
        } catch (Exception e5) {
            System.err.println(e5.toString() + "\n" + Arrays.toString(e5.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f104403d = new ArrayList();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            C25016e c25016e = (C25016e) arrayList.get(i15);
            C15556d c15556d = new C15556d(28);
            new WeakReference(c25016e);
            C14051c.m39994n(c25016e.f97890J);
            C14051c.m39994n(c25016e.f97891K);
            C14051c.m39994n(c25016e.f97892L);
            C14051c.m39994n(c25016e.f97893M);
            C14051c.m39994n(c25016e.f97894N);
            this.f104403d.add(c15556d);
        }
        if (i13 == 0) {
            iM39994n = C14051c.m39994n(c25017f.f97890J);
            iM39994n2 = C14051c.m39994n(c25017f.f97892L);
            c14051c.m40013t();
        } else {
            iM39994n = C14051c.m39994n(c25017f.f97891K);
            iM39994n2 = C14051c.m39994n(c25017f.f97893M);
            c14051c.m40013t();
        }
        return iM39994n2 - iM39994n;
    }

    /* JADX INFO: renamed from: d */
    public final void m77938d(int i13, C26259o c26259o) {
        int i14 = c26259o.f104401b;
        for (C25016e c25016e : this.f104400a) {
            c26259o.m77935a(c25016e);
            if (i13 == 0) {
                c25016e.f97936o0 = i14;
            } else {
                c25016e.f97938p0 = i14;
            }
        }
        this.f104404e = i14;
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder();
        int i13 = this.f104402c;
        if (i13 == 0) {
            str = "Horizontal";
        } else if (i13 == 1) {
            str = "Vertical";
        } else {
            str = i13 == 2 ? "Both" : "Unknown";
        }
        sb4.append(str);
        sb4.append(" [");
        String strM53371l = AbstractC18489d0.m53371l(sb4, this.f104401b, "] <");
        for (C25016e c25016e : this.f104400a) {
            StringBuilder sbM35484d = AbstractC12682p.m35484d(strM53371l, " ");
            sbM35484d.append(c25016e.f97924i0);
            strM53371l = sbM35484d.toString();
        }
        return AbstractC2875y.m8299l(strM53371l, " >");
    }
}
