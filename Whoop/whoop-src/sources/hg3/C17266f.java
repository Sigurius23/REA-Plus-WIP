package hg3;

import fg3.InterfaceC14473a;
import fg3.InterfaceC14474b;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: hg3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C17266f implements InterfaceC14473a {

    /* JADX INFO: renamed from: w */
    public volatile boolean f66361w = false;

    /* JADX INFO: renamed from: x */
    public final ConcurrentHashMap f66362x = new ConcurrentHashMap();

    /* JADX INFO: renamed from: y */
    public final LinkedBlockingQueue f66363y = new LinkedBlockingQueue();

    @Override // fg3.InterfaceC14473a
    /* JADX INFO: renamed from: b */
    public final synchronized InterfaceC14474b mo41314b(String str) {
        C17265e c17265e;
        c17265e = (C17265e) this.f66362x.get(str);
        if (c17265e == null) {
            c17265e = new C17265e(str, this.f66363y, this.f66361w);
            this.f66362x.put(str, c17265e);
        }
        return c17265e;
    }
}
