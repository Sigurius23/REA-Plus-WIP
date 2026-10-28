package gt;

import java.util.Collections;
import java.util.HashSet;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: gt.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16162a {

    /* JADX INFO: renamed from: a */
    public String f61421a = null;

    /* JADX INFO: renamed from: b */
    public final HashSet f61422b;

    /* JADX INFO: renamed from: c */
    public final HashSet f61423c;

    /* JADX INFO: renamed from: d */
    public int f61424d;

    /* JADX INFO: renamed from: e */
    public final int f61425e;

    /* JADX INFO: renamed from: f */
    public InterfaceC16166e f61426f;

    /* JADX INFO: renamed from: g */
    public final HashSet f61427g;

    public C16162a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f61422b = hashSet;
        this.f61423c = new HashSet();
        this.f61424d = 0;
        this.f61425e = 0;
        this.f61427g = new HashSet();
        hashSet.add(C16177p.m45715a(cls));
        for (Class cls2 : clsArr) {
            AbstractC34132o.m107884h(cls2, "Null interface");
            this.f61422b.add(C16177p.m45715a(cls2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m45705a(C16171j c16171j) {
        if (this.f61422b.contains(c16171j.f61451a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f61423c.add(c16171j);
    }

    /* JADX INFO: renamed from: b */
    public final C16163b m45706b() {
        if (this.f61426f != null) {
            return new C16163b(this.f61421a, new HashSet(this.f61422b), new HashSet(this.f61423c), this.f61424d, this.f61425e, this.f61426f, this.f61427g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public C16162a(C16177p c16177p, C16177p[] c16177pArr) {
        HashSet hashSet = new HashSet();
        this.f61422b = hashSet;
        this.f61423c = new HashSet();
        this.f61424d = 0;
        this.f61425e = 0;
        this.f61427g = new HashSet();
        hashSet.add(c16177p);
        for (C16177p c16177p2 : c16177pArr) {
            AbstractC34132o.m107884h(c16177p2, "Null interface");
        }
        Collections.addAll(this.f61422b, c16177pArr);
    }
}
