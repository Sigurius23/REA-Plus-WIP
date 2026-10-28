package p100dw;

import e10.C12554k0;
import p673z7.C40137a;

/* JADX INFO: renamed from: dw.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12397b {

    /* JADX INFO: renamed from: a */
    public C12400e f41987a;

    /* JADX INFO: renamed from: b */
    public String f41988b;

    /* JADX INFO: renamed from: a */
    public final C12398c m34832a() {
        C12400e c12400e = this.f41987a;
        if (c12400e == null) {
            throw new IllegalStateException("Memfault API must not be null");
        }
        String str = this.f41988b;
        if (str != null) {
            return new C12398c(c12400e, str, new C12554k0(9), new C40137a(1));
        }
        throw new IllegalStateException("Device serial number must not be null");
    }
}
