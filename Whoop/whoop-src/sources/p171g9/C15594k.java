package p171g9;

import ce3.C4497a0;
import java.util.HashMap;
import z63.InterfaceC40130b;
import z63.InterfaceC40133e;

/* JADX INFO: renamed from: g9.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C15594k {

    /* JADX INFO: renamed from: a */
    public final HashMap f58544a;

    public C15594k(int i13) {
        switch (i13) {
            case 2:
                this.f58544a = new HashMap();
                break;
            case 3:
                this.f58544a = new HashMap(3);
                break;
            default:
                this.f58544a = new HashMap(3);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m43893a(Class cls, InterfaceC40130b interfaceC40130b) {
        this.f58544a.put(cls, interfaceC40130b);
    }

    /* JADX INFO: renamed from: b */
    public void m43894b(Class cls, InterfaceC40133e interfaceC40133e) {
        this.f58544a.put(cls, interfaceC40133e);
    }

    /* JADX INFO: renamed from: c */
    public void m43895c(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.f58544a) {
            this.f58544a.put(str, str2);
        }
    }

    public C15594k(String str, C4497a0 c4497a0) {
        this.f58544a = new HashMap();
    }
}
