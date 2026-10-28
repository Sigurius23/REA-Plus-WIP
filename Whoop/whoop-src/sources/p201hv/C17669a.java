package p201hv;

import com.mapbox.maps.Style;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p127ev.C13668i;
import p127ev.InterfaceC13669j;
import p127ev.InterfaceC13671l;
import p127ev.InterfaceC13672m;

/* JADX INFO: renamed from: hv.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17669a implements InterfaceC13669j, InterfaceC13671l, InterfaceC13672m {

    /* JADX INFO: renamed from: w */
    public final ArrayList f68534w = new ArrayList();

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: a */
    public final void mo38544a() {
        ArrayList arrayList = this.f68534w;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() != null) {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    @Override // p127ev.InterfaceC13672m
    /* JADX INFO: renamed from: b */
    public final void mo38548b(Style style) {
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: f */
    public final void mo38545f(C13668i c13668i) {
    }

    @Override // p127ev.InterfaceC13669j
    public final void initialize() {
    }

    @Override // p127ev.InterfaceC13671l
    public final void onSizeChanged(int i13, int i14) {
        Iterator it = this.f68534w.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() != null) {
                throw new ClassCastException();
            }
        }
    }
}
