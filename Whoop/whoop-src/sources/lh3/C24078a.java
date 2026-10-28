package lh3;

import bh3.InterfaceC3255b;
import ch3.AbstractC4677d;
import java.util.ArrayList;

/* JADX INFO: renamed from: lh3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C24078a implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C24091n f95125w;

    public C24078a(C24091n c24091n) {
        this.f95125w = c24091n;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x005d  */
    /* JADX WARN: Code duplicated, block: B:61:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) throws Throwable {
        C24090m c24090m = (C24090m) obj;
        Object obj2 = this.f95125w.f95164w;
        synchronized (c24090m) {
            if (c24090m.f95160x && !c24090m.f95161y) {
                c24090m.f95160x = false;
                boolean z4 = true;
                c24090m.f95161y = obj2 != null;
                if (obj2 != null) {
                    boolean z13 = true;
                    ArrayList arrayList = null;
                    while (true) {
                        if (arrayList != null) {
                            try {
                                for (Object obj3 : arrayList) {
                                    if (obj3 != null) {
                                        AbstractC4677d.m14744a(c24090m.f95159w, obj3);
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z4 = false;
                                if (!z4) {
                                    synchronized (c24090m) {
                                        c24090m.f95161y = false;
                                    }
                                }
                                throw th;
                            }
                        }
                        if (z13) {
                            AbstractC4677d.m14744a(c24090m.f95159w, obj2);
                            z13 = false;
                        }
                        try {
                            synchronized (c24090m) {
                                try {
                                    arrayList = c24090m.f95162z;
                                    c24090m.f95162z = null;
                                    if (arrayList == null) {
                                        c24090m.f95161y = false;
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    z4 = false;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        try {
                            throw th;
                        } catch (Throwable th6) {
                            th = th6;
                            if (!z4) {
                                synchronized (c24090m) {
                                    c24090m.f95161y = false;
                                }
                            }
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
