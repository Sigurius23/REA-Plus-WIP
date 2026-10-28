package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1579e2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1348t1 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: G */
    public static final C1345s1 f5807G = new C1345s1(0);

    /* JADX INFO: renamed from: z */
    public final boolean f5813z;

    /* JADX INFO: renamed from: w */
    public final HashMap f5810w = new HashMap();

    /* JADX INFO: renamed from: x */
    public final HashMap f5811x = new HashMap();

    /* JADX INFO: renamed from: y */
    public final HashMap f5812y = new HashMap();

    /* JADX INFO: renamed from: E */
    public boolean f5808E = false;

    /* JADX INFO: renamed from: F */
    public boolean f5809F = false;

    public C1348t1(boolean z4) {
        this.f5813z = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1348t1.class == obj.getClass()) {
            C1348t1 c1348t1 = (C1348t1) obj;
            if (this.f5810w.equals(c1348t1.f5810w) && this.f5811x.equals(c1348t1.f5811x) && this.f5812y.equals(c1348t1.f5812y)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m4226g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (this.f5809F) {
            if (AbstractC1329o1.m4132M(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = abstractComponentCallbacksC1320m0.mWho;
        HashMap map = this.f5810w;
        if (map.containsKey(str)) {
            return;
        }
        map.put(abstractComponentCallbacksC1320m0.mWho, abstractComponentCallbacksC1320m0);
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + abstractComponentCallbacksC1320m0);
        }
    }

    public final int hashCode() {
        return this.f5812y.hashCode() + ((this.f5811x.hashCode() + (this.f5810w.hashCode() * 31)) * 31);
    }

    /* JADX INFO: renamed from: j */
    public final void m4227j(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, boolean z4) {
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC1320m0);
        }
        m4229n(abstractComponentCallbacksC1320m0.mWho, z4);
    }

    /* JADX INFO: renamed from: l */
    public final void m4228l(String str, boolean z4) {
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m4229n(str, z4);
    }

    /* JADX INFO: renamed from: n */
    public final void m4229n(String str, boolean z4) {
        HashMap map = this.f5811x;
        C1348t1 c1348t1 = (C1348t1) map.get(str);
        if (c1348t1 != null) {
            if (z4) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c1348t1.f5811x.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c1348t1.m4228l((String) it.next(), true);
                }
            }
            c1348t1.onCleared();
            map.remove(str);
        }
        HashMap map2 = this.f5812y;
        C1579e2 c1579e2 = (C1579e2) map2.get(str);
        if (c1579e2 != null) {
            c1579e2.m4975a();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m4230o(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (this.f5809F) {
            if (AbstractC1329o1.m4132M(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f5810w.remove(abstractComponentCallbacksC1320m0.mWho) == null || !AbstractC1329o1.m4132M(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC1320m0);
        }
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public final void onCleared() {
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f5808E = true;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("FragmentManagerViewModel{");
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append("} Fragments (");
        Iterator it = this.f5810w.values().iterator();
        while (it.hasNext()) {
            sb4.append(it.next());
            if (it.hasNext()) {
                sb4.append(", ");
            }
        }
        sb4.append(") Child Non Config (");
        Iterator it3 = this.f5811x.keySet().iterator();
        while (it3.hasNext()) {
            sb4.append((String) it3.next());
            if (it3.hasNext()) {
                sb4.append(", ");
            }
        }
        sb4.append(") ViewModelStores (");
        Iterator it4 = this.f5812y.keySet().iterator();
        while (it4.hasNext()) {
            sb4.append((String) it4.next());
            if (it4.hasNext()) {
                sb4.append(", ");
            }
        }
        sb4.append(')');
        return sb4.toString();
    }
}
