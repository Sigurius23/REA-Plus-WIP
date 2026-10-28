package p032bc;

import android.view.ViewGroup;
import com.whoop.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p002a0.C0022g;

/* JADX INFO: renamed from: bc.a0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2938a0 {

    /* JADX INFO: renamed from: a */
    public static final C2937a f11823a = new C2937a();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f11824b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    public static final ArrayList f11825c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static void m8568a(ViewGroup viewGroup, AbstractC2974w abstractC2974w) {
        ArrayList arrayList = f11825c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC2974w == null) {
            abstractC2974w = f11823a;
        }
        AbstractC2974w abstractC2974wClone = abstractC2974w.clone();
        m8570c(viewGroup, abstractC2974wClone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC2977z viewTreeObserverOnPreDrawListenerC2977z = new ViewTreeObserverOnPreDrawListenerC2977z();
        viewTreeObserverOnPreDrawListenerC2977z.f11939w = abstractC2974wClone;
        viewTreeObserverOnPreDrawListenerC2977z.f11940x = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2977z);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2977z);
    }

    /* JADX INFO: renamed from: b */
    public static C0022g m8569b() {
        C0022g c0022g;
        ThreadLocal threadLocal = f11824b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0022g = (C0022g) weakReference.get()) != null) {
            return c0022g;
        }
        C0022g c0022g2 = new C0022g(0);
        threadLocal.set(new WeakReference(c0022g2));
        return c0022g2;
    }

    /* JADX INFO: renamed from: c */
    public static void m8570c(ViewGroup viewGroup, AbstractC2974w abstractC2974w) {
        ArrayList arrayList = (ArrayList) m8569b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC2974w) it.next()).mo8574A(viewGroup);
            }
        }
        if (abstractC2974w != null) {
            abstractC2974w.m8648h(viewGroup, true);
        }
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
    }
}
