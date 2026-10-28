package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p189hb.C17073i;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: androidx.fragment.app.m1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1321m1 implements InterfaceC1313k1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1329o1 f5677a;

    public C1321m1(AbstractC1329o1 abstractC1329o1) {
        this.f5677a = abstractC1329o1;
    }

    @Override // androidx.fragment.app.InterfaceC1313k1
    /* JADX INFO: renamed from: a */
    public final boolean mo4041a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zM4152V;
        AbstractC1329o1 abstractC1329o1 = this.f5677a;
        ArrayList<C17073i> arrayList5 = abstractC1329o1.f5729o;
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + abstractC1329o1.f5715a);
        }
        if (abstractC1329o1.f5718d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zM4152V = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            C1271a c1271a = (C1271a) AbstractC25012a.m73371d(abstractC1329o1.f5718d, 1);
            abstractC1329o1.f5722h = c1271a;
            Iterator it = c1271a.f5563c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = ((C1278b2) it.next()).f5548b;
                if (abstractComponentCallbacksC1320m0 != null) {
                    abstractComponentCallbacksC1320m0.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zM4152V = abstractC1329o1.m4152V(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                linkedHashSet.addAll(AbstractC1329o1.m4131H((C1271a) it3.next()));
            }
            for (C17073i c17073i : arrayList5) {
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    c17073i.m48199b((AbstractComponentCallbacksC1320m0) it4.next(), zBooleanValue);
                }
            }
        }
        return zM4152V;
    }
}
