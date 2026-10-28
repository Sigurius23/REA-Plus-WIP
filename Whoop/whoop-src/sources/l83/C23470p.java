package l83;

import c93.InterfaceC4339a;
import java.io.Serializable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C23470p implements InterfaceC23462h, Serializable {

    /* JADX INFO: renamed from: w */
    public InterfaceC4339a f92944w;

    /* JADX INFO: renamed from: x */
    public volatile Object f92945x;

    /* JADX INFO: renamed from: y */
    public final Object f92946y;

    public C23470p(InterfaceC4339a initializer) {
        AbstractC22676k.m65750j(initializer, "initializer");
        this.f92944w = initializer;
        this.f92945x = C23478x.f92956a;
        this.f92946y = this;
    }

    @Override // l83.InterfaceC23462h
    /* JADX INFO: renamed from: b */
    public final boolean mo5046b() {
        return this.f92945x != C23478x.f92956a;
    }

    @Override // l83.InterfaceC23462h
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f92945x;
        C23478x c23478x = C23478x.f92956a;
        if (obj != c23478x) {
            return obj;
        }
        synchronized (this.f92946y) {
            objInvoke = this.f92945x;
            if (objInvoke == c23478x) {
                InterfaceC4339a interfaceC4339a = this.f92944w;
                AbstractC22676k.m65747g(interfaceC4339a);
                objInvoke = interfaceC4339a.invoke();
                this.f92945x = objInvoke;
                this.f92944w = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return mo5046b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
