package p114eb;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import io.sentry.hints.C20363j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m83.AbstractC25247g0;
import p027b3.C2441t;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: eb.t0 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12961h1(NotificationCompat.CATEGORY_NAVIGATION)
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Leb/t0;", "Leb/i1;", "Leb/r0;", "navigation-common_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public class C12989t0 extends AbstractC12964i1 {

    /* JADX INFO: renamed from: c */
    public final C12967j1 f44874c;

    public C12989t0(C12967j1 navigatorProvider) {
        AbstractC22676k.m65750j(navigatorProvider, "navigatorProvider");
        this.f44874c = navigatorProvider;
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: d */
    public final void mo36436d(List list, C12997x0 c12997x0) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12982q c12982q = (C12982q) it.next();
            C12977n0 c12977n0 = c12982q.f44844x;
            AbstractC22676k.m65748h(c12977n0, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            C12985r0 c12985r0 = (C12985r0) c12977n0;
            C22669g0 c22669g0 = new C22669g0();
            c22669g0.f89336w = c12982q.m36479a();
            int i13 = c12985r0.f44856M;
            String str = c12985r0.f44858O;
            if (i13 == 0 && str == null) {
                throw new IllegalStateException(("no start destination defined via app:startDestination for " + c12985r0.mo36467g()).toString());
            }
            C12977n0 c12977n0M36485q = str != null ? c12985r0.m36485q(str, false) : (C12977n0) c12985r0.f44855L.m55d(i13);
            if (c12977n0M36485q == null) {
                if (c12985r0.f44857N == null) {
                    String strValueOf = c12985r0.f44858O;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(c12985r0.f44856M);
                    }
                    c12985r0.f44857N = strValueOf;
                }
                String str2 = c12985r0.f44857N;
                AbstractC22676k.m65747g(str2);
                throw new IllegalArgumentException(AbstractC11895b.m31996o("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            LinkedHashMap linkedHashMap = c12977n0M36485q.f44818G;
            if (str != null) {
                if (!str.equals(c12977n0M36485q.f44820I)) {
                    C12972l0 c12972l0M36469l = c12977n0M36485q.m36469l(str);
                    Bundle bundle = c12972l0M36469l != null ? c12972l0M36469l.f44805x : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) c22669g0.f89336w;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        c22669g0.f89336w = bundle2;
                    }
                }
                if (AbstractC25247g0.m74001j0(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListM88498G = AbstractC29125c.m88498G(AbstractC25247g0.m74001j0(linkedHashMap), new C2441t(c22669g0, 1));
                    if (!arrayListM88498G.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + c12977n0M36485q + ". Missing required arguments [" + arrayListM88498G + ']').toString());
                    }
                }
            }
            AbstractC12964i1 abstractC12964i1Mo36434b = this.f44874c.mo36434b(c12977n0M36485q.f44822w);
            C12988t c12988tM36435b = m36435b();
            Bundle bundleM36464c = c12977n0M36485q.m36464c((Bundle) c22669g0.f89336w);
            AbstractC12939a0 abstractC12939a0 = c12988tM36435b.f44873h;
            abstractC12964i1Mo36434b.mo36436d(AbstractC37056f.m118958J(C20363j.m56531o(abstractC12939a0.f44680a, c12977n0M36485q, bundleM36464c, abstractC12939a0.m36397l(), abstractC12939a0.f44696q)), c12997x0);
        }
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C12985r0 mo36423a() {
        return new C12985r0(this);
    }
}
