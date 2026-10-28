package i63;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: i63.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18164d0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f70479w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C18166e0 f70480x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18164d0(C18166e0 c18166e0, int i13) {
        super(0);
        this.f70479w = i13;
        this.f70480x = c18166e0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iM125887f0;
        int i13 = this.f70479w;
        C18166e0 c18166e0 = this.f70480x;
        switch (i13) {
            case 0:
                String str = c18166e0.f70487g;
                int iM125887f1 = AbstractC39414r.m125887f0(str, '#', 0, false, 6) + 1;
                if (iM125887f1 == 0) {
                    return "";
                }
                String strSubstring = str.substring(iM125887f1);
                AbstractC22676k.m65749i(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            case 1:
                String str2 = c18166e0.f70487g;
                String str3 = c18166e0.f70486f;
                if (str3 == null) {
                    return null;
                }
                if (str3.length() == 0) {
                    return "";
                }
                String strSubstring2 = str2.substring(AbstractC39414r.m125887f0(str2, ':', c18166e0.f70481a.f70472a.length() + 3, false, 4) + 1, AbstractC39414r.m125887f0(str2, '@', 0, false, 6));
                AbstractC22676k.m65749i(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            case 2:
                ArrayList arrayList = c18166e0.f70484d;
                String str4 = c18166e0.f70487g;
                if (arrayList.isEmpty() || (iM125887f0 = AbstractC39414r.m125887f0(str4, '/', c18166e0.f70481a.f70472a.length() + 3, false, 4)) == -1) {
                    return "";
                }
                int iM125889h0 = AbstractC39414r.m125889h0(str4, new char[]{'?', '#'}, iM125887f0, false);
                if (iM125889h0 == -1) {
                    String strSubstring3 = str4.substring(iM125887f0);
                    AbstractC22676k.m65749i(strSubstring3, "this as java.lang.String).substring(startIndex)");
                    return strSubstring3;
                }
                String strSubstring4 = str4.substring(iM125887f0, iM125889h0);
                AbstractC22676k.m65749i(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring4;
            case 3:
                String str5 = c18166e0.f70487g;
                int iM125887f2 = AbstractC39414r.m125887f0(str5, '/', c18166e0.f70481a.f70472a.length() + 3, false, 4);
                if (iM125887f2 == -1) {
                    return "";
                }
                int iM125887f3 = AbstractC39414r.m125887f0(str5, '#', iM125887f2, false, 4);
                if (iM125887f3 == -1) {
                    String strSubstring5 = str5.substring(iM125887f2);
                    AbstractC22676k.m65749i(strSubstring5, "this as java.lang.String).substring(startIndex)");
                    return strSubstring5;
                }
                String strSubstring6 = str5.substring(iM125887f2, iM125887f3);
                AbstractC22676k.m65749i(strSubstring6, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring6;
            case 4:
                String str6 = c18166e0.f70487g;
                int iM125887f4 = AbstractC39414r.m125887f0(str6, '?', 0, false, 6) + 1;
                if (iM125887f4 == 0) {
                    return "";
                }
                int iM125887f5 = AbstractC39414r.m125887f0(str6, '#', iM125887f4, false, 4);
                if (iM125887f5 == -1) {
                    String strSubstring7 = str6.substring(iM125887f4);
                    AbstractC22676k.m65749i(strSubstring7, "this as java.lang.String).substring(startIndex)");
                    return strSubstring7;
                }
                String strSubstring8 = str6.substring(iM125887f4, iM125887f5);
                AbstractC22676k.m65749i(strSubstring8, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring8;
            default:
                String str7 = c18166e0.f70487g;
                String str8 = c18166e0.f70485e;
                if (str8 == null) {
                    return null;
                }
                if (str8.length() == 0) {
                    return "";
                }
                int length = c18166e0.f70481a.f70472a.length() + 3;
                String strSubstring9 = str7.substring(length, AbstractC39414r.m125889h0(str7, new char[]{':', '@'}, length, false));
                AbstractC22676k.m65749i(strSubstring9, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring9;
        }
    }
}
