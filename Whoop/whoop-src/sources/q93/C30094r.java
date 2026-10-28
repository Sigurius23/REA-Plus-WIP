package q93;

import androidx.lifecycle.C1591h2;
import dc3.C11934s;
import hb3.C17119i;
import ib3.C18342a;
import ib3.C18344c;
import ib3.C18345d;
import j93.AbstractC21478l0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kb3.C22342k;
import kb3.EnumC22341j;
import m83.C25235a0;
import o93.AbstractC27742n;
import p014aj.C0929d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31124g0;
import r93.InterfaceC31133j0;
import u93.C34673e0;
import ub3.AbstractC34756j;
import va3.C35847e;
import va3.C35850h;

/* JADX INFO: renamed from: q93.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C30094r implements InterfaceC31133j0 {

    /* JADX INFO: renamed from: a */
    public final C22342k f122807a;

    /* JADX INFO: renamed from: b */
    public final C34673e0 f122808b;

    /* JADX INFO: renamed from: c */
    public C17119i f122809c;

    /* JADX INFO: renamed from: d */
    public final C1591h2 f122810d;

    public C30094r(C22342k c22342k, C0929d c0929d, C34673e0 c34673e0) {
        this.f122807a = c22342k;
        this.f122808b = c34673e0;
        this.f122810d = c22342k.m64224c(new C11934s(this, 3));
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: a */
    public final void mo52690a(C35847e fqName, ArrayList arrayList) {
        AbstractC22676k.m65750j(fqName, "fqName");
        AbstractC34756j.m109751a(arrayList, this.f122810d.invoke(fqName));
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: b */
    public final boolean mo52691b(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        C1591h2 c1591h2 = this.f122810d;
        Object obj = ((ConcurrentHashMap) c1591h2.f6243y).get(fqName);
        return ((obj == null || obj == EnumC22341j.f87179x) ? m92225c(fqName) : (InterfaceC31124g0) c1591h2.invoke(fqName)) == null;
    }

    /* JADX INFO: renamed from: c */
    public final C18344c m92225c(C35847e fqName) throws IOException {
        InputStream inputStreamM52853a;
        AbstractC22676k.m65750j(fqName, "fqName");
        C35850h segment = AbstractC27742n.f111885j;
        AbstractC22676k.m65750j(segment, "segment");
        if (fqName.f152613a.m113797h(segment)) {
            C18342a.f71436m.getClass();
            inputStreamM52853a = C18345d.m52853a(C18342a.m52849a(fqName));
        } else {
            inputStreamM52853a = null;
        }
        if (inputStreamM52853a != null) {
            return AbstractC21478l0.m60449t(fqName, this.f122807a, this.f122808b, inputStreamM52853a);
        }
        return null;
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: f */
    public final Collection mo52693f(C35847e fqName, Function1 function1) {
        AbstractC22676k.m65750j(fqName, "fqName");
        return C25235a0.f99113w;
    }
}
