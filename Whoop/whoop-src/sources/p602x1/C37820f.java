package p602x1;

import p390p1.AbstractC28669t1;
import p390p1.InterfaceC28682w2;
import p511u1.C34398e;
import p511u1.C34408o;
import p569w1.C36688b;

/* JADX INFO: renamed from: x1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C37820f extends C34398e {

    /* JADX INFO: renamed from: G */
    public C37821g f161966G;

    @Override // p511u1.C34398e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC28669t1) {
            return super.containsKey((AbstractC28669t1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC28682w2) {
            return super.containsValue((InterfaceC28682w2) obj);
        }
        return false;
    }

    @Override // p511u1.C34398e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC28669t1) {
            return (InterfaceC28682w2) super.get((AbstractC28669t1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC28669t1) ? obj2 : (InterfaceC28682w2) super.getOrDefault((AbstractC28669t1) obj, (InterfaceC28682w2) obj2);
    }

    @Override // p511u1.C34398e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C37821g build() {
        C34408o c34408o = this.f144611y;
        C37821g c37821g = this.f161966G;
        if (c34408o != c37821g.f144602w) {
            this.f144610x = new C36688b();
            c37821g = new C37821g(this.f144611y, mo74011c());
        }
        this.f161966G = c37821g;
        return c37821g;
    }

    @Override // p511u1.C34398e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC28669t1) {
            return (InterfaceC28682w2) super.remove((AbstractC28669t1) obj);
        }
        return null;
    }
}
