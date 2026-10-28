package p114eb;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;
import m83.AbstractC25265s;
import p026b2.C2320z;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import vb1.C35868a;
import xb3.AbstractC38176k;
import xb3.C38170e;
import xb3.C38171f;

/* JADX INFO: renamed from: eb.i1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12964i1 {

    /* JADX INFO: renamed from: a */
    public C12988t f44778a;

    /* JADX INFO: renamed from: b */
    public boolean f44779b;

    /* JADX INFO: renamed from: a */
    public abstract C12977n0 mo36423a();

    /* JADX INFO: renamed from: b */
    public final C12988t m36435b() {
        C12988t c12988t = this.f44778a;
        if (c12988t != null) {
            return c12988t;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* JADX INFO: renamed from: c */
    public C12977n0 mo36424c(C12977n0 c12977n0, Bundle bundle, C12997x0 c12997x0) {
        return c12977n0;
    }

    /* JADX INFO: renamed from: d */
    public void mo36436d(List list, C12997x0 c12997x0) {
        C38170e c38170e = new C38170e(new C38171f(AbstractC38176k.m122272A(AbstractC25265s.m74145r0(list), new C2320z(8, this, c12997x0)), false, new C35868a(16)));
        while (c38170e.hasNext()) {
            m36435b().m36498h((C12982q) c38170e.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo36437e(C12988t c12988t) {
        this.f44778a = c12988t;
        this.f44779b = true;
    }

    /* JADX INFO: renamed from: f */
    public void mo36438f(C12982q c12982q) {
        C12977n0 c12977n0 = c12982q.f44844x;
        if (c12977n0 == null) {
            c12977n0 = null;
        }
        if (c12977n0 == null) {
            return;
        }
        mo36424c(c12977n0, null, AbstractC32417h.m101185P(C12992v.f44878H));
        m36435b().m36493c(c12982q);
    }

    /* JADX INFO: renamed from: g */
    public void mo36439g(Bundle bundle) {
    }

    /* JADX INFO: renamed from: h */
    public Bundle mo36440h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void mo36441i(C12982q popUpTo, boolean z4) {
        AbstractC22676k.m65750j(popUpTo, "popUpTo");
        List list = (List) m36435b().f44870e.f45200w.getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C12982q c12982q = null;
        while (mo36425j()) {
            c12982q = (C12982q) listIterator.previous();
            if (AbstractC22676k.m65745e(c12982q, popUpTo)) {
                break;
            }
        }
        if (c12982q != null) {
            m36435b().m36494d(c12982q, z4);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean mo36425j() {
        return true;
    }
}
