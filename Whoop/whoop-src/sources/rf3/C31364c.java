package rf3;

import java.util.HashMap;
import p005a3.C0237p;
import p450r5.C30929c;
import p715kotlin.jvm.internal.AbstractC22676k;
import xf3.C38266c;

/* JADX INFO: renamed from: rf3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C31364c extends AbstractC31363b {

    /* JADX INFO: renamed from: b */
    public HashMap f129024b;

    @Override // rf3.AbstractC31363b
    /* JADX INFO: renamed from: a */
    public final Object mo96460a(C0237p c0237p) {
        HashMap map = this.f129024b;
        C38266c c38266c = (C38266c) c0237p.f813y;
        String str = c38266c.f164059b;
        String str2 = c38266c.f164059b;
        if (map.get(str) == null) {
            return super.mo96460a(c0237p);
        }
        Object obj = map.get(str2);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(("Scoped instance not found for " + str2 + " in " + this.f129023a).toString());
    }

    @Override // rf3.AbstractC31363b
    /* JADX INFO: renamed from: b */
    public final Object mo96459b(C0237p c0237p) {
        if (!AbstractC22676k.m65745e(((C38266c) c0237p.f813y).f164058a, this.f129023a.f124470a)) {
            throw new IllegalStateException(("Wrong Scope: trying to open instance for " + ((C38266c) c0237p.f813y).f164059b + " in " + this.f129023a).toString());
        }
        C30929c c30929c = new C30929c(1, this, c0237p);
        synchronized (this) {
            c30929c.invoke();
        }
        Object obj = this.f129024b.get(((C38266c) c0237p.f813y).f164059b);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(("Scoped instance not found for " + ((C38266c) c0237p.f813y).f164059b + " in " + this.f129023a).toString());
    }
}
