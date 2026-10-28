package p617xj;

import android.view.View;
import android.view.ViewGroup;
import fk.InterfaceC14544a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l83.C23465k;
import m83.C25258m;
import p015ak.InterfaceC0935c;
import p184h5.C16907r0;

/* JADX INFO: renamed from: xj.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C38329a {
    /* JADX INFO: renamed from: a */
    public static final C38330b m122889a(View view, C23465k c23465k, List list, InterfaceC14544a interfaceC14544a) {
        boolean z4;
        C25258m c25258m = new C25258m();
        c25258m.addLast(view);
        C38330b c38330b = null;
        while (!c25258m.isEmpty()) {
            try {
                View view2 = (View) c25258m.removeFirst();
                if (view2 instanceof ViewGroup) {
                    C16907r0 c16907r0 = new C16907r0((ViewGroup) view2);
                    while (c16907r0.hasNext()) {
                        c25258m.add(c16907r0.next());
                    }
                }
                try {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            C38330b c38330bMo2366a = ((InterfaceC0935c) it.next()).mo2366a(view2, c23465k);
                            if (c38330bMo2366a != null) {
                                z4 = true;
                            } else {
                                c38330bMo2366a = c38330b;
                                z4 = false;
                            }
                            if (z4) {
                                c38330b = c38330bMo2366a;
                                break;
                            }
                            c38330b = c38330bMo2366a;
                        }
                    }
                } catch (ClassCastException e5) {
                    interfaceC14544a.error("Error while locating target in view hierarchy: " + e5);
                }
            } catch (NoSuchElementException unused) {
                interfaceC14544a.error("Unable to get view from queue");
            }
        }
        return c38330b;
    }
}
