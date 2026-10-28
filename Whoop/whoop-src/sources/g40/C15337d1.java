package g40;

import e10.C12554k0;
import java.util.ArrayList;
import m83.AbstractC25265s;
import p031b9.AbstractC2875y;
import p294l3.C23254g;
import p412q3.C29869e0;
import p412q3.C29883q;
import p412q3.InterfaceC29873g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: g40.d1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15337d1 implements InterfaceC29873g0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57630a;

    /* JADX INFO: renamed from: b */
    public final Object f57631b;

    public /* synthetic */ C15337d1(Object obj, int i13) {
        this.f57630a = i13;
        this.f57631b = obj;
    }

    @Override // p412q3.InterfaceC29873g0
    /* JADX INFO: renamed from: a */
    public final C29869e0 mo43546a(C23254g text) {
        switch (this.f57630a) {
            case 0:
                AbstractC22676k.m65750j(text, "text");
                String str = text.f92135x;
                if (AbstractC22676k.m65745e(str, (String) this.f57631b)) {
                    return new C29869e0(text, C29883q.f122109a);
                }
                int i13 = 0;
                int i14 = (((!AbstractC39414r.m125890i0(text) && str.charAt(0) != '0' && str.charAt(0) != '1') || (str.length() > 1 && Integer.parseInt(AbstractC39414r.m125866L0(2, str)) > 12)) ? 1 : 0) ^ 1;
                StringBuilder sb4 = new StringBuilder();
                for (int i15 = 0; i15 < str.length(); i15++) {
                    sb4.append(str.charAt(i15));
                    if (i15 == i14) {
                        sb4.append(" / ");
                    }
                }
                String string = sb4.toString();
                ArrayList arrayList = new ArrayList();
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    if (i16 >= string.length()) {
                        ArrayList arrayListM74128f1 = AbstractC25265s.m74128f1(Integer.valueOf(string.length()), AbstractC25265s.m74129g1(AbstractC37056f.m118958J(0), AbstractC25265s.m74086A0(1, arrayList)));
                        ArrayList arrayList2 = new ArrayList();
                        int i18 = 0;
                        while (i13 < string.length()) {
                            char cCharAt = string.charAt(i13);
                            int i19 = i18 + 1;
                            Integer numValueOf = Integer.valueOf(i18);
                            if (Character.isDigit(cCharAt)) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                arrayList2.add(numValueOf);
                            }
                            i13++;
                            i18 = i19;
                        }
                        return new C29869e0(new C23254g(6, string, null), new C15331c1(arrayListM74128f1, arrayList2));
                    }
                    char cCharAt2 = string.charAt(i16);
                    int i24 = i17 + 1;
                    Integer numValueOf2 = Integer.valueOf(i17);
                    if (!Character.isDigit(cCharAt2)) {
                        numValueOf2 = null;
                    }
                    Integer numValueOf3 = numValueOf2 != null ? Integer.valueOf(numValueOf2.intValue() + 1) : null;
                    if (numValueOf3 != null) {
                        arrayList.add(numValueOf3);
                    }
                    i16++;
                    i17 = i24;
                }
                break;
            case 1:
                AbstractC22676k.m65750j(text, "text");
                C15374j2 c15374j2 = (C15374j2) this.f57631b;
                return new C29869e0(new C23254g(6, c15374j2.m43584g(text.f92135x), null), new C12554k0(c15374j2, 19));
            default:
                AbstractC22676k.m65750j(text, "text");
                String str2 = text.f92135x;
                if (!(((AbstractC15405p2) this.f57631b) instanceof C15385l2)) {
                    return new C29869e0(text, C29883q.f122109a);
                }
                int length = str2.length();
                String strM8299l = "";
                for (int i25 = 0; i25 < length; i25++) {
                    strM8299l = strM8299l + Character.toUpperCase(str2.charAt(i25));
                    if (i25 == 2) {
                        strM8299l = AbstractC2875y.m8299l(strM8299l, " ");
                    }
                }
                return new C29869e0(new C23254g(6, strM8299l, null), new C15383l0(4));
        }
    }

    public C15337d1(AbstractC15405p2 format) {
        this.f57630a = 2;
        AbstractC22676k.m65750j(format, "format");
        this.f57631b = format;
    }
}
