package j02;

import p114eb.C12977n0;
import p715kotlin.Metadata;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: j02.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Leb/n0;", "prefix", "d", "(Leb/n0;Ljava/lang/String;)Ljava/lang/String;", "feature_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21162q {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final String m59404c(String str) {
        return AbstractC39421y.m125926K(AbstractC39421y.m125926K(AbstractC39421y.m125926K(AbstractC39421y.m125926K(str, " ", "_", false), ":", "_", false), "/", "_", false), "\\", "_", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final String m59405d(C12977n0 c12977n0, String str) {
        CharSequence charSequence = c12977n0.f44825z;
        if (charSequence != null) {
            if (charSequence.length() == 0) {
                charSequence = null;
            }
            if (charSequence != null) {
                return AbstractC39414r.m125869O0(str + " " + ((Object) charSequence)).toString();
            }
        }
        String str2 = c12977n0.f44820I;
        if (str2 != null) {
            String str3 = str2.length() != 0 ? str2 : null;
            if (str3 != null) {
                return AbstractC39414r.m125869O0(str + " " + str3).toString();
            }
        }
        return AbstractC39414r.m125869O0(str + " unknown").toString();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m59406e(C12977n0 c12977n0, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "";
        }
        return m59405d(c12977n0, str);
    }
}
