package gt;

import ht.EnumC17622k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p098dt.AbstractC12350b;
import p691zs.C41073a;
import pt.InterfaceC29508a;
import pt.InterfaceC29509b;

/* JADX INFO: renamed from: gt.k */
/* JADX INFO: loaded from: classes.dex */
public final class C16172k implements InterfaceC29509b, InterfaceC29508a {

    /* JADX INFO: renamed from: a */
    public final HashMap f61454a;

    /* JADX INFO: renamed from: b */
    public ArrayDeque f61455b;

    /* JADX INFO: renamed from: c */
    public final EnumC17622k f61456c;

    public C16172k() {
        EnumC17622k enumC17622k = EnumC17622k.f68344w;
        this.f61454a = new HashMap();
        this.f61455b = new ArrayDeque();
        this.f61456c = enumC17622k;
    }

    /* JADX INFO: renamed from: a */
    public final void m45714a(C41073a c41073a) {
        EnumC17622k enumC17622k = this.f61456c;
        synchronized (this) {
            try {
                enumC17622k.getClass();
                if (!this.f61454a.containsKey(AbstractC12350b.class)) {
                    this.f61454a.put(AbstractC12350b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f61454a.get(AbstractC12350b.class)).put(c41073a, enumC17622k);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
