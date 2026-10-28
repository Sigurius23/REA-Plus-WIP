package sc3;

import ih0.AbstractC18489d0;
import java.util.List;
import m83.C25271y;
import n83.C26460c;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import rc3.AbstractC31237b;
import tc3.C33699a;
import uc3.C34763a;
import uc3.C34768f;
import uc3.C34774l;
import uc3.C34775m;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: sc3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C32394h implements InterfaceC32400n {

    /* JADX INFO: renamed from: a */
    public final String f134138a;

    public C32394h(String string) {
        AbstractC22676k.m65750j(string, "string");
        this.f134138a = string;
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: a */
    public final C33699a mo100966a() {
        String string = this.f134138a;
        AbstractC22676k.m65750j(string, "string");
        return new C33699a();
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: b */
    public final C34774l mo100967b() {
        List listM118988k;
        String strSubstring;
        String strSubstring2 = this.f134138a;
        int length = strSubstring2.length();
        C25271y c25271y = C25271y.f99162w;
        if (length == 0) {
            listM118988k = c25271y;
        } else {
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            String strM53368i = "";
            if (AbstractC31237b.m96190b(strSubstring2.charAt(0))) {
                int length2 = strSubstring2.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!AbstractC31237b.m96190b(strSubstring2.charAt(i13))) {
                        strSubstring = strSubstring2.substring(0, i13);
                        AbstractC22676k.m65749i(strSubstring, "substring(...)");
                        break;
                    }
                    i13++;
                }
                c26460cM119000x.add(new C34768f(AbstractC37056f.m118958J(new C34763a(strSubstring))));
                int length3 = strSubstring2.length();
                int i14 = 0;
                while (true) {
                    if (i14 >= length3) {
                        strSubstring2 = "";
                        break;
                    }
                    if (!AbstractC31237b.m96190b(strSubstring2.charAt(i14))) {
                        strSubstring2 = strSubstring2.substring(i14);
                        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                        break;
                    }
                    i14++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (AbstractC31237b.m96190b(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    for (int iM125884c0 = AbstractC39414r.m125884c0(strSubstring2); -1 < iM125884c0; iM125884c0--) {
                        if (!AbstractC31237b.m96190b(strSubstring2.charAt(iM125884c0))) {
                            strM53368i = AbstractC18489d0.m53368i(iM125884c0, strSubstring2, 1, 0, "substring(...)");
                            break;
                        }
                    }
                    c26460cM119000x.add(new C34775m(strM53368i));
                    for (int iM125884c1 = AbstractC39414r.m125884c0(strSubstring2); -1 < iM125884c1; iM125884c1--) {
                        if (!AbstractC31237b.m96190b(strSubstring2.charAt(iM125884c1))) {
                            strSubstring2 = strSubstring2.substring(iM125884c1 + 1);
                            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                            break;
                        }
                    }
                    c26460cM119000x.add(new C34768f(AbstractC37056f.m118958J(new C34763a(strSubstring2))));
                } else {
                    c26460cM119000x.add(new C34775m(strSubstring2));
                }
            }
            listM118988k = AbstractC37056f.m118988k(c26460cM119000x);
        }
        return new C34774l(listM118988k, c25271y);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32394h) {
            return AbstractC22676k.m65745e(this.f134138a, ((C32394h) obj).f134138a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f134138a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("ConstantFormatStructure("), this.f134138a, ')');
    }
}
