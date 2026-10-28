package p678ze;

import m83.AbstractC25260n;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.C17251l;
import p194hg.InterfaceC17242c;
import p194hg.InterfaceC17243d;
import p251jg.C21649b;
import p251jg.C21652e;
import p326mf.InterfaceC25488h;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import ye.C39476c;

/* JADX INFO: renamed from: ze.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC40581a {

    /* JADX INFO: renamed from: a */
    public static final C17248i f174777a;

    /* JADX INFO: renamed from: b */
    public static final C17248i f174778b;

    /* JADX INFO: renamed from: c */
    public static final C17248i f174779c;

    /* JADX INFO: renamed from: d */
    public static final C17248i f174780d;

    /* JADX INFO: renamed from: e */
    public static final C17248i f174781e;

    /* JADX INFO: renamed from: f */
    public static final C17249j f174782f;

    static {
        C17251l c17251l = C17251l.f66274e;
        C17248i c17248i = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("code")}), 0);
        f174777a = c17248i;
        C17248i c17248i2 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("__type")}), 0);
        f174778b = c17248i2;
        C17251l c17251l2 = C17251l.f66278i;
        C17248i c17248i3 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
        f174779c = c17248i3;
        C17248i c17248i4 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Message")}), 0);
        f174780d = c17248i4;
        C17248i c17248i5 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("errorMessage")}), 0);
        f174781e = c17248i5;
        C38445a c38445a = new C38445a(13);
        c38445a.m123180p(c17248i);
        c38445a.m123180p(c17248i2);
        c38445a.m123180p(c17248i3);
        c38445a.m123180p(c17248i4);
        c38445a.m123180p(c17248i5);
        f174782f = new C17249j(c38445a);
    }

    /* JADX INFO: renamed from: a */
    public static C39476c m131580a(InterfaceC25488h headers, byte[] bArr) {
        String strMo45166o;
        String strMo45166o2;
        AbstractC22676k.m65750j(headers, "headers");
        String strMo45166o3 = (String) headers.get("x-amzn-error-message");
        if (strMo45166o3 == null) {
            strMo45166o3 = (String) headers.get(":error-message");
        }
        String str = (String) headers.get("X-Amzn-Errortype");
        if (bArr != null) {
            InterfaceC17242c interfaceC17242cM60916d = new C21649b(bArr).m60916d(f174782f);
            strMo45166o = null;
            strMo45166o2 = null;
            while (true) {
                Integer numMo45167q = interfaceC17242cM60916d.mo45167q();
                int i13 = f174777a.f66267b;
                if (numMo45167q != null && numMo45167q.intValue() == i13) {
                    strMo45166o = interfaceC17242cM60916d.mo45166o();
                } else {
                    int i14 = f174778b.f66267b;
                    if (numMo45167q != null && numMo45167q.intValue() == i14) {
                        strMo45166o2 = interfaceC17242cM60916d.mo45166o();
                    } else {
                        int i15 = f174779c.f66267b;
                        if (numMo45167q == null || numMo45167q.intValue() != i15) {
                            int i16 = f174780d.f66267b;
                            if (numMo45167q == null || numMo45167q.intValue() != i16) {
                                int i17 = f174781e.f66267b;
                                if (numMo45167q == null || numMo45167q.intValue() != i17) {
                                    if (numMo45167q == null) {
                                        break;
                                    }
                                    interfaceC17242cM60916d.skipValue();
                                }
                            }
                        }
                        strMo45166o3 = interfaceC17242cM60916d.mo45166o();
                    }
                }
            }
        } else {
            strMo45166o = null;
            strMo45166o2 = null;
        }
        if (str == null) {
            str = strMo45166o == null ? strMo45166o2 : strMo45166o;
        }
        return new C39476c(str != null ? AbstractC39414r.m125863I0(AbstractC39414r.m125859E0(str, "#", str), ":") : null, strMo45166o3, null);
    }
}
