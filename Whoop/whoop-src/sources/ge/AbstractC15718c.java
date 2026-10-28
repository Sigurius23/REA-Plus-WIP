package ge;

import ga1.C15621b;
import l83.C23467m;
import l83.C23470p;
import p505ts.AbstractC34132o;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: ge.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15718c {

    /* JADX INFO: renamed from: a */
    public static final C23470p f59224a = AbstractC30060g.m92088H(new C15621b(2));

    /* JADX INFO: renamed from: a */
    public static String m44299a(String str) {
        Object objM107888l;
        try {
            objM107888l = System.getProperty(str);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = "unknown";
        }
        return (String) objM107888l;
    }
}
