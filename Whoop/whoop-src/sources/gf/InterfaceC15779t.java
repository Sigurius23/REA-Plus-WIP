package gf;

import c93.InterfaceC4351m;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25265s;

/* JADX INFO: renamed from: gf.t */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC15779t {
    /* JADX INFO: renamed from: b */
    Set mo44479b();

    /* JADX INFO: renamed from: c */
    default void m44480c(InterfaceC4351m interfaceC4351m) {
        for (Map.Entry entry : mo44479b()) {
            interfaceC4351m.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: d */
    boolean mo44481d();

    /* JADX INFO: renamed from: e */
    List mo44482e(String str);

    /* JADX INFO: renamed from: f */
    boolean mo44483f();

    default Object get(String str) {
        List listMo44482e = mo44482e(str);
        if (listMo44482e != null) {
            return AbstractC25265s.m74100H0(listMo44482e);
        }
        return null;
    }

    boolean isEmpty();
}
