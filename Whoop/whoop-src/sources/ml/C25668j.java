package ml;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p429ql.InterfaceC30463i;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: ml.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C25668j implements InterfaceC25662d {

    /* JADX INFO: renamed from: w */
    public final Set f100937w = Collections.newSetFromMap(new WeakHashMap());

    @Override // ml.InterfaceC25662d
    public final void onDestroy() {
        Iterator it = AbstractC33913l.m107269d(this.f100937w).iterator();
        while (it.hasNext()) {
            ((InterfaceC30463i) it.next()).onDestroy();
        }
    }

    @Override // ml.InterfaceC25662d
    public final void onStart() {
        Iterator it = AbstractC33913l.m107269d(this.f100937w).iterator();
        while (it.hasNext()) {
            ((InterfaceC30463i) it.next()).onStart();
        }
    }

    @Override // ml.InterfaceC25662d
    public final void onStop() {
        Iterator it = AbstractC33913l.m107269d(this.f100937w).iterator();
        while (it.hasNext()) {
            ((InterfaceC30463i) it.next()).onStop();
        }
    }
}
