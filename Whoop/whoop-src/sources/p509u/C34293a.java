package p509u;

import java.util.HashMap;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: loaded from: classes.dex */
public final class C34293a extends C34298f {

    /* JADX INFO: renamed from: E */
    public final HashMap f144029E = new HashMap();

    @Override // p509u.C34298f
    /* JADX INFO: renamed from: a */
    public final C34295c mo108605a(Object obj) {
        return (C34295c) this.f144029E.get(obj);
    }

    @Override // p509u.C34298f
    /* JADX INFO: renamed from: c */
    public final Object mo108606c(Object obj, Object obj2) {
        C34295c c34295cMo108605a = mo108605a(obj);
        if (c34295cMo108605a != null) {
            return c34295cMo108605a.f144034x;
        }
        C34295c c34295c = new C34295c(obj, obj2);
        this.f144043z++;
        C34295c c34295c2 = this.f144041x;
        if (c34295c2 == null) {
            this.f144040w = c34295c;
            this.f144041x = c34295c;
        } else {
            c34295c2.f144035y = c34295c;
            c34295c.f144036z = c34295c2;
            this.f144041x = c34295c;
        }
        this.f144029E.put(obj, c34295c);
        return null;
    }

    @Override // p509u.C34298f
    /* JADX INFO: renamed from: d */
    public final Object mo108607d(Object obj) {
        Object objMo108607d = super.mo108607d(obj);
        this.f144029E.remove(obj);
        return objMo108607d;
    }
}
