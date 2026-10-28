package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1274a2 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5525a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final HashMap f5526b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f5527c = new HashMap();

    /* JADX INFO: renamed from: d */
    public C1348t1 f5528d;

    /* JADX INFO: renamed from: a */
    public final void m4054a(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (this.f5525a.contains(abstractComponentCallbacksC1320m0)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC1320m0);
        }
        synchronized (this.f5525a) {
            this.f5525a.add(abstractComponentCallbacksC1320m0);
        }
        abstractComponentCallbacksC1320m0.mAdded = true;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractComponentCallbacksC1320m0 m4055b(String str) {
        C1366z1 c1366z1 = (C1366z1) this.f5526b.get(str);
        if (c1366z1 != null) {
            return c1366z1.f5852c;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC1320m0 m4056c(String str) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0FindFragmentByWho;
        for (C1366z1 c1366z1 : this.f5526b.values()) {
            if (c1366z1 != null && (abstractComponentCallbacksC1320m0FindFragmentByWho = c1366z1.f5852c.findFragmentByWho(str)) != null) {
                return abstractComponentCallbacksC1320m0FindFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m4057d() {
        ArrayList arrayList = new ArrayList();
        for (C1366z1 c1366z1 : this.f5526b.values()) {
            if (c1366z1 != null) {
                arrayList.add(c1366z1);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m4058e() {
        ArrayList arrayList = new ArrayList();
        for (C1366z1 c1366z1 : this.f5526b.values()) {
            if (c1366z1 != null) {
                arrayList.add(c1366z1.f5852c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final List m4059f() {
        ArrayList arrayList;
        if (this.f5525a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f5525a) {
            arrayList = new ArrayList(this.f5525a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final void m4060g(C1366z1 c1366z1) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1366z1.f5852c;
        String str = abstractComponentCallbacksC1320m0.mWho;
        HashMap map = this.f5526b;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC1320m0.mWho, c1366z1);
        if (abstractComponentCallbacksC1320m0.mRetainInstanceChangedWhileDetached) {
            if (abstractComponentCallbacksC1320m0.mRetainInstance) {
                this.f5528d.m4226g(abstractComponentCallbacksC1320m0);
            } else {
                this.f5528d.m4230o(abstractComponentCallbacksC1320m0);
            }
            abstractComponentCallbacksC1320m0.mRetainInstanceChangedWhileDetached = false;
        }
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC1320m0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4061h(C1366z1 c1366z1) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1366z1.f5852c;
        if (abstractComponentCallbacksC1320m0.mRetainInstance) {
            this.f5528d.m4230o(abstractComponentCallbacksC1320m0);
        }
        String str = abstractComponentCallbacksC1320m0.mWho;
        HashMap map = this.f5526b;
        if (map.get(str) == c1366z1 && ((C1366z1) map.put(abstractComponentCallbacksC1320m0.mWho, null)) != null && AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC1320m0);
        }
    }

    /* JADX INFO: renamed from: i */
    public final Bundle m4062i(Bundle bundle, String str) {
        HashMap map = this.f5527c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
