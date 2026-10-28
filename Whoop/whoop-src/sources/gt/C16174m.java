package gt;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import st.InterfaceC32956a;

/* JADX INFO: renamed from: gt.m */
/* JADX INFO: loaded from: classes.dex */
public final class C16174m implements InterfaceC32956a {

    /* JADX INFO: renamed from: a */
    public volatile Set f61460a;

    /* JADX INFO: renamed from: b */
    public volatile Set f61461b;

    @Override // st.InterfaceC32956a
    public final Object get() {
        if (this.f61461b == null) {
            synchronized (this) {
                try {
                    if (this.f61461b == null) {
                        this.f61461b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f61460a.iterator();
                                while (it.hasNext()) {
                                    this.f61461b.add(((InterfaceC32956a) it.next()).get());
                                }
                                this.f61460a = null;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return Collections.unmodifiableSet(this.f61461b);
    }
}
