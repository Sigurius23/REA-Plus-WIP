package tp0;

import androidx.compose.runtime.Composer;
import b91.C2889d;
import p294l3.C23245b0;
import p294l3.C23248d;
import p294l3.C23254g;
import p294l3.C23267m0;
import p392p3.C28780r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: tp0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ll3/g;", "input", "a", "(Ll3/g;Landroidx/compose/runtime/Composer;I)Ll3/g;", "add-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34056a {
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX INFO: renamed from: a */
    public static final C23254g m107629a(C23254g input, Composer composer, int i13) {
        C39336i c39336i;
        C2889d c2889d;
        String str;
        String str2 = "**";
        String str3 = "substring(...)";
        AbstractC22676k.m65750j(input, "input");
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        C2889d c2889dM121952e = c38072d.m121952e(composer, i14);
        C39336i c39336iM121949b = c38072d.m121949b(composer, i14);
        C23248d c23248d = new C23248d();
        int iM67307i = c23248d.m67307i(new C23245b0(3, null, 510));
        try {
            int i15 = 6;
            ?? r14 = 0;
            int i16 = 0;
            for (Object obj : AbstractC39414r.m125906y0(input, new String[]{"\n"}, 6)) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                String str4 = (String) obj;
                int iM125888g0 = AbstractC39414r.m125888g0(str4, str2, r14, r14, i15);
                int iM125893l0 = AbstractC39414r.m125893l0(str4, str2, r14, i15);
                if (iM125888g0 == -1 || iM125893l0 == -1 || iM125888g0 >= iM125893l0) {
                    c39336i = c39336iM121949b;
                    c2889d = c2889dM121952e;
                    str = str3;
                    int iM67308j = c23248d.m67308j(C23267m0.m67325a(c2889d.getB2().getStyle().f92255a, c39336i.getWhite50(), null, 65534));
                    try {
                        c23248d.m67300b(str4);
                        c23248d.m67304f(iM67308j);
                    } catch (Throwable th3) {
                        c23248d.m67304f(iM67308j);
                        throw th3;
                    }
                } else {
                    c39336i = c39336iM121949b;
                    c2889d = c2889dM121952e;
                    int iM67308j2 = c23248d.m67308j(C23267m0.m67325a(c2889dM121952e.getB2().getStyle().f92255a, c39336i.getWhite50(), null, 65534));
                    try {
                        String strSubstring = str4.substring(0, iM125888g0);
                        AbstractC22676k.m65749i(strSubstring, str3);
                        c23248d.m67300b(strSubstring);
                        c23248d.m67304f(iM67308j2);
                        str = str3;
                        int iM67308j3 = c23248d.m67308j(C23267m0.m67325a(c2889d.getB2().getStyle().f92255a, c39336i.getBrandWhite(), C28780r.f116542I, 65530));
                        try {
                            String strSubstring2 = str4.substring(iM125888g0 + 2, iM125893l0);
                            AbstractC22676k.m65749i(strSubstring2, str);
                            c23248d.m67300b(strSubstring2);
                            c23248d.m67304f(iM67308j3);
                            int iM67308j4 = c23248d.m67308j(C23267m0.m67325a(c2889d.getB2().getStyle().f92255a, c39336i.getWhite50(), null, 65534));
                            try {
                                String strSubstring3 = str4.substring(iM125893l0 + 2);
                                AbstractC22676k.m65749i(strSubstring3, str);
                                c23248d.m67300b(strSubstring3);
                                c23248d.m67304f(iM67308j4);
                            } catch (Throwable th4) {
                                c23248d.m67304f(iM67308j4);
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            c23248d.m67304f(iM67308j3);
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        c23248d.m67304f(iM67308j2);
                        throw th6;
                    }
                }
                if (i16 != AbstractC37056f.m118951C(AbstractC39414r.m125906y0(input, new String[]{"\n"}, 6))) {
                    c23248d.m67300b("\n");
                }
                i15 = 6;
                str3 = str;
                i16 = i17;
                str2 = str2;
                c39336iM121949b = c39336i;
                c2889dM121952e = c2889d;
                r14 = 0;
            }
            c23248d.m67304f(iM67307i);
            return c23248d.m67309k();
        } catch (Throwable th7) {
            c23248d.m67304f(iM67307i);
            throw th7;
        }
    }
}
