package p269k1;

import android.content.Context;
import android.view.ViewGroup;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m83.AbstractC25265s;
import p005a3.AbstractC0201g;
import qg3.C30352d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: k1.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C22113d extends ViewGroup {

    /* JADX INFO: renamed from: E */
    public int f85795E;

    /* JADX INFO: renamed from: w */
    public final int f85796w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f85797x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f85798y;

    /* JADX INFO: renamed from: z */
    public final C30352d f85799z;

    public C22113d(Context context) {
        super(context);
        this.f85796w = 5;
        ArrayList arrayList = new ArrayList();
        this.f85797x = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f85798y = arrayList2;
        this.f85799z = new C30352d(20, (byte) 0);
        setClipChildren(false);
        C22114e c22114e = new C22114e(context);
        addView(c22114e);
        arrayList.add(c22114e);
        arrayList2.add(c22114e);
        this.f85795E = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a */
    public final void m63314a(C22110a c22110a) {
        c22110a.f85789Y = null;
        AbstractC0201g.m508h(c22110a);
        C30352d c30352d = this.f85799z;
        C22114e c22114e = (C22114e) ((LinkedHashMap) c30352d.f124535x).get(c22110a);
        if (c22114e != null) {
            c22114e.m63318c();
            LinkedHashMap linkedHashMap = (LinkedHashMap) c30352d.f124535x;
            C22114e c22114e2 = (C22114e) linkedHashMap.get(c22110a);
            if (c22114e2 != null) {
            }
            linkedHashMap.remove(c22110a);
            this.f85798y.add(c22114e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C22114e m63315b(C22110a c22110a) {
        C30352d c30352d = this.f85799z;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c30352d.f124535x;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c30352d.f124535x;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c30352d.f124536y;
        C22114e c22114e = (C22114e) linkedHashMap.get(c22110a);
        if (c22114e != null) {
            return c22114e;
        }
        C22114e c22114e2 = (C22114e) AbstractC25265s.m74133k1(this.f85798y);
        if (c22114e2 == null) {
            int i13 = this.f85795E;
            ArrayList arrayList = this.f85797x;
            if (i13 > AbstractC37056f.m118951C(arrayList)) {
                c22114e2 = new C22114e(getContext());
                addView(c22114e2);
                arrayList.add(c22114e2);
            } else {
                c22114e2 = (C22114e) arrayList.get(this.f85795E);
                C22110a c22110a2 = (C22110a) linkedHashMap3.get(c22114e2);
                if (c22110a2 != null) {
                    c22110a2.f85789Y = null;
                    AbstractC0201g.m508h(c22110a2);
                    C22114e c22114e3 = (C22114e) linkedHashMap2.get(c22110a2);
                    if (c22114e3 != null) {
                    }
                    linkedHashMap2.remove(c22110a2);
                    c22114e2.m63318c();
                }
            }
            int i14 = this.f85795E;
            if (i14 < this.f85796w - 1) {
                this.f85795E = i14 + 1;
            } else {
                this.f85795E = 0;
            }
        }
        linkedHashMap2.put(c22110a, c22114e2);
        linkedHashMap3.put(c22114e2, c22110a);
        return c22114e2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
