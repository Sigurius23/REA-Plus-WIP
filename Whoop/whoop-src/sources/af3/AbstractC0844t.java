package af3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: af3.t */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0844t {

    /* JADX INFO: renamed from: a */
    public AbstractC0844t f3038a = null;

    /* JADX INFO: renamed from: b */
    public AbstractC0844t f3039b = null;

    /* JADX INFO: renamed from: c */
    public AbstractC0844t f3040c = null;

    /* JADX INFO: renamed from: d */
    public AbstractC0844t f3041d = null;

    /* JADX INFO: renamed from: e */
    public AbstractC0844t f3042e = null;

    /* JADX INFO: renamed from: f */
    public ArrayList f3043f = null;

    /* JADX INFO: renamed from: a */
    public abstract void mo2029a(InterfaceC0827c0 interfaceC0827c0);

    /* JADX INFO: renamed from: b */
    public final void m2054b(C0849y c0849y) {
        if (this.f3043f == null) {
            this.f3043f = new ArrayList();
        }
        this.f3043f.add(c0849y);
    }

    /* JADX INFO: renamed from: c */
    public final void m2055c(AbstractC0844t abstractC0844t) {
        abstractC0844t.m2059j();
        abstractC0844t.mo2028g(this);
        AbstractC0844t abstractC0844t2 = this.f3040c;
        if (abstractC0844t2 == null) {
            this.f3039b = abstractC0844t;
            this.f3040c = abstractC0844t;
        } else {
            abstractC0844t2.f3042e = abstractC0844t;
            abstractC0844t.f3041d = abstractC0844t2;
            this.f3040c = abstractC0844t;
        }
    }

    /* JADX INFO: renamed from: d */
    public AbstractC0844t mo2027d() {
        return this.f3038a;
    }

    /* JADX INFO: renamed from: e */
    public final List m2056e() {
        ArrayList arrayList = this.f3043f;
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: f */
    public final void m2057f(AbstractC0844t abstractC0844t) {
        abstractC0844t.m2059j();
        AbstractC0844t abstractC0844t2 = this.f3042e;
        abstractC0844t.f3042e = abstractC0844t2;
        if (abstractC0844t2 != null) {
            abstractC0844t2.f3041d = abstractC0844t;
        }
        abstractC0844t.f3041d = this;
        this.f3042e = abstractC0844t;
        AbstractC0844t abstractC0844t3 = this.f3038a;
        abstractC0844t.f3038a = abstractC0844t3;
        if (abstractC0844t.f3042e == null) {
            abstractC0844t3.f3040c = abstractC0844t;
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo2028g(AbstractC0844t abstractC0844t) {
        this.f3038a = abstractC0844t;
    }

    /* JADX INFO: renamed from: h */
    public final void m2058h(List list) {
        if (list.isEmpty()) {
            this.f3043f = null;
        } else {
            this.f3043f = new ArrayList(list);
        }
    }

    /* JADX INFO: renamed from: i */
    public String mo2030i() {
        return "";
    }

    /* JADX INFO: renamed from: j */
    public final void m2059j() {
        AbstractC0844t abstractC0844t = this.f3041d;
        if (abstractC0844t != null) {
            abstractC0844t.f3042e = this.f3042e;
        } else {
            AbstractC0844t abstractC0844t2 = this.f3038a;
            if (abstractC0844t2 != null) {
                abstractC0844t2.f3039b = this.f3042e;
            }
        }
        AbstractC0844t abstractC0844t3 = this.f3042e;
        if (abstractC0844t3 != null) {
            abstractC0844t3.f3041d = abstractC0844t;
        } else {
            AbstractC0844t abstractC0844t4 = this.f3038a;
            if (abstractC0844t4 != null) {
                abstractC0844t4.f3040c = abstractC0844t;
            }
        }
        this.f3038a = null;
        this.f3042e = null;
        this.f3041d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + mo2030i() + "}";
    }
}
