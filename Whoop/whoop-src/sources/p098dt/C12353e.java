package p098dt;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p437qt.C30581d;
import to.InterfaceC33963b;

/* JADX INFO: renamed from: dt.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12353e implements InterfaceC33963b {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f41514a = new AtomicReference();

    @Override // to.InterfaceC33963b
    /* JADX INFO: renamed from: a */
    public final void mo34606a(boolean z4) {
        synchronized (C12355g.f41517j) {
            try {
                for (C12355g c12355g : new ArrayList(C12355g.f41518k.values())) {
                    if (c12355g.f41523e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = c12355g.f41527i.iterator();
                        while (it.hasNext()) {
                            C12355g c12355g2 = ((C12352d) it.next()).f41513a;
                            if (!z4) {
                                ((C30581d) c12355g2.f41526h.get()).m93814b();
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
