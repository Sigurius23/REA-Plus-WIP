package f73;

import a73.C0530e;
import b30.C2570m;
import p171g9.C15594k;
import z63.InterfaceC40133e;

/* JADX INFO: renamed from: f73.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C14237g implements InterfaceC40133e {

    /* JADX INFO: renamed from: a */
    public final C14231a f52002a;

    public C14237g(C14231a c14231a) {
        this.f52002a = c14231a;
    }

    @Override // z63.InterfaceC40133e
    /* JADX INFO: renamed from: a */
    public final Object mo7932a(C2570m c2570m, C15594k c15594k) {
        C0530e c0530e = (C0530e) c2570m.f9987x;
        Object obj = Boolean.FALSE;
        Object obj2 = c15594k.f58544a.get(AbstractC14235e.f51996a);
        if (obj2 != null) {
            obj = obj2;
        }
        return new C14236f(c0530e, this.f52002a, ((Boolean) obj).booleanValue());
    }
}
