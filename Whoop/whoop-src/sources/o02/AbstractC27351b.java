package o02;

import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: o02.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "explicitSku", "Ll83/k;", "b", "(Ljava/lang/String;Ljava/lang/String;)Ll83/k;", "navigation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27351b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23465k m82527b(String str, String str2) {
        if (str2 != null) {
            return new C23465k(str, str2);
        }
        int iM125888g0 = AbstractC39414r.m125888g0(str, "&sku=", 0, false, 6);
        if (iM125888g0 < 0) {
            return new C23465k(str, null);
        }
        String strSubstring = str.substring(0, iM125888g0);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(iM125888g0 + 5);
        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
        return new C23465k(strSubstring, strSubstring2.length() > 0 ? strSubstring2 : null);
    }
}
