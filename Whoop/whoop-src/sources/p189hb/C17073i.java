package p189hb;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import l83.C23465k;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p114eb.C12982q;
import p114eb.C12988t;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C17073i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C12988t f65613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C17070f f65614b;

    public C17073i(C12988t c12988t, C17070f c17070f) {
        this.f65613a = c12988t;
        this.f65614b = c17070f;
    }

    /* JADX INFO: renamed from: a */
    public final void m48198a(AbstractComponentCallbacksC1320m0 fragment, boolean z4) {
        Object obj;
        Object objPrevious;
        C17070f c17070f = this.f65614b;
        ArrayList arrayList = c17070f.f65607g;
        AbstractC22676k.m65750j(fragment, "fragment");
        C12988t c12988t = this.f65613a;
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1((Collection) c12988t.f44870e.f45200w.getValue(), (Iterable) c12988t.f44871f.f45200w.getValue());
        ListIterator listIterator = arrayListM74129g1.listIterator(arrayListM74129g1.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!AbstractC22676k.m65745e(((C12982q) objPrevious).f44835F, fragment.getTag()));
        C12982q c12982q = (C12982q) objPrevious;
        boolean z13 = z4 && arrayList.isEmpty() && fragment.isRemoving();
        for (Object obj2 : arrayList) {
            if (AbstractC22676k.m65745e(((C23465k) obj2).f92937w, fragment.getTag())) {
                obj = obj2;
                break;
            }
        }
        C23465k c23465k = (C23465k) obj;
        if (c23465k != null) {
            arrayList.remove(c23465k);
        }
        if (!z13 && C17070f.m48194n()) {
            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + c12982q);
        }
        boolean z14 = c23465k != null && ((Boolean) c23465k.f92938x).booleanValue();
        if (!z4 && !z14 && c12982q == null) {
            throw new IllegalArgumentException(AbstractC11266d.m30458l(fragment, "The fragment ", " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (c12982q != null) {
            c17070f.m48195l(fragment, c12982q, c12988t);
            if (z13) {
                if (C17070f.m48194n()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + c12982q + " via system back");
                }
                c12988t.m36496f(c12982q, false);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m48199b(AbstractComponentCallbacksC1320m0 fragment, boolean z4) {
        Object objPrevious;
        AbstractC22676k.m65750j(fragment, "fragment");
        if (z4) {
            C12988t c12988t = this.f65613a;
            List list = (List) c12988t.f44870e.f45200w.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!AbstractC22676k.m65745e(((C12982q) objPrevious).f44835F, fragment.getTag()));
            C12982q c12982q = (C12982q) objPrevious;
            if (C17070f.m48194n()) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + c12982q);
            }
            if (c12982q != null) {
                c12988t.m36497g(c12982q);
            }
        }
    }
}
