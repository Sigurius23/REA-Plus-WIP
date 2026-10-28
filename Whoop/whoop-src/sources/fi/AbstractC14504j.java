package fi;

import eg.C13161j;
import f93.C14289a;
import gi.C15870a;
import gi.C15878i;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import p221ii.AbstractC18532b;
import p715kotlin.jvm.internal.C22665e0;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: fi.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14504j {

    /* JADX INFO: renamed from: a */
    public static final C14289a f52989a = new C14289a(C25271y.f99162w, 3);

    /* JADX INFO: renamed from: b */
    public static final C14289a f52990b = new C14289a(new C15878i(new C15870a(4096), new C15870a(4096)), 3);

    /* JADX INFO: renamed from: c */
    public static final C14289a f52991c = new C14289a(Boolean.FALSE, 3);

    /* JADX INFO: renamed from: d */
    public static final C14289a f52992d = new C14289a(Boolean.TRUE, 3);

    /* JADX INFO: renamed from: a */
    public static final void m41411a(C14499e c14499e, AbstractC18532b... abstractC18532bArr) {
        List listM74049W0 = AbstractC25260n.m74049W0(abstractC18532bArr);
        c14499e.m41409b().m96731a(f52989a, AbstractC37978j.m121637V(listM74049W0));
        String strM74110N0 = AbstractC25265s.m74110N0(listM74049W0, null, null, null, new C13161j(new C22665e0(), 11), 31);
        if (strM74110N0 != null) {
            c14499e.m41410c().put("coil#transformations", strM74110N0);
        } else {
            c14499e.m41410c().remove("coil#transformations");
        }
    }
}
