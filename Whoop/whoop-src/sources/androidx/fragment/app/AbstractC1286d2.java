package androidx.fragment.app;

import android.view.View;
import androidx.core.app.SharedElementCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25265s;
import p002a0.C0004a;
import p002a0.C0022g;
import p032bc.C2963n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.d2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1286d2 {

    /* JADX INFO: renamed from: a */
    public static final C1306i2 f5586a = new C1306i2();

    /* JADX INFO: renamed from: b */
    public static final AbstractC1314k2 f5587b;

    static {
        AbstractC1314k2 abstractC1314k2 = null;
        try {
            abstractC1314k2 = (AbstractC1314k2) C2963n.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5587b = abstractC1314k2;
    }

    /* JADX INFO: renamed from: a */
    public static final void m4076a(AbstractComponentCallbacksC1320m0 inFragment, AbstractComponentCallbacksC1320m0 outFragment, boolean z4, C0022g c0022g, boolean z13) {
        AbstractC22676k.m65750j(inFragment, "inFragment");
        AbstractC22676k.m65750j(outFragment, "outFragment");
        SharedElementCallback enterTransitionCallback = z4 ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(c0022g.f50y);
            Iterator it = ((C0004a) c0022g.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(c0022g.f50y);
            Iterator it3 = ((C0004a) c0022g.entrySet()).iterator();
            while (it3.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it3.next()).getKey());
            }
            if (z13) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m4077b(C0022g c0022g, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (C0004a) c0022g.entrySet()) {
            if (AbstractC22676k.m65745e(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) AbstractC25265s.m74100H0(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static final void m4078c(C0022g c0022g, C0022g c0022g2) {
        int i13 = c0022g.f50y;
        while (true) {
            i13--;
            if (-1 >= i13) {
                return;
            }
            if (!c0022g2.containsKey((String) c0022g.m42k(i13))) {
                c0022g.mo40i(i13);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m4079d(ArrayList views, int i13) {
        AbstractC22676k.m65750j(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i13);
        }
    }
}
