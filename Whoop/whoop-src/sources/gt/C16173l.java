package gt;

import st.InterfaceC32956a;

/* JADX INFO: renamed from: gt.l */
/* JADX INFO: loaded from: classes.dex */
public final class C16173l implements InterfaceC32956a {

    /* JADX INFO: renamed from: c */
    public static final Object f61457c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile Object f61458a = f61457c;

    /* JADX INFO: renamed from: b */
    public volatile InterfaceC32956a f61459b;

    public C16173l(InterfaceC32956a interfaceC32956a) {
        this.f61459b = interfaceC32956a;
    }

    @Override // st.InterfaceC32956a
    public final Object get() {
        Object obj;
        Object obj2 = this.f61458a;
        Object obj3 = f61457c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f61458a;
                if (obj == obj3) {
                    obj = this.f61459b.get();
                    this.f61458a = obj;
                    this.f61459b = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj;
    }
}
