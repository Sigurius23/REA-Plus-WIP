package p429ql;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import pl.C29342e;

/* JADX INFO: renamed from: ql.d */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewTreeObserverOnPreDrawListenerC30458d implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125162w = 0;

    /* JADX INFO: renamed from: x */
    public final WeakReference f125163x;

    public ViewTreeObserverOnPreDrawListenerC30458d(C30459e c30459e) {
        this.f125163x = new WeakReference(c30459e);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        switch (this.f125162w) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C30459e c30459e = (C30459e) this.f125163x.get();
                if (c30459e != null) {
                    ArrayList arrayList = c30459e.f125166b;
                    View view = c30459e.f125165a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iM93221a = c30459e.m93221a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iM93221a2 = c30459e.m93221a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iM93221a > 0 || iM93221a == Integer.MIN_VALUE) {
                            if (iM93221a2 > 0 || iM93221a2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((C29342e) ((InterfaceC30462h) it.next())).m89342l(iM93221a, iM93221a2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(c30459e.f125167c);
                                }
                                c30459e.f125167c = null;
                                arrayList.clear();
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C30464j c30464j = (C30464j) this.f125163x.get();
                if (c30464j != null) {
                    ArrayList arrayList2 = c30464j.f125174b;
                    View view2 = c30464j.f125173a;
                    if (!arrayList2.isEmpty()) {
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int iM93222a = c30464j.m93222a(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        int iM93222a2 = c30464j.m93222a(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if (iM93222a > 0 || iM93222a == Integer.MIN_VALUE) {
                            if (iM93222a2 > 0 || iM93222a2 == Integer.MIN_VALUE) {
                                Iterator it3 = new ArrayList(arrayList2).iterator();
                                while (it3.hasNext()) {
                                    ((C29342e) ((InterfaceC30462h) it3.next())).m89342l(iM93222a, iM93222a2);
                                }
                                ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(c30464j.f125175c);
                                }
                                c30464j.f125175c = null;
                                arrayList2.clear();
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC30458d(C30464j c30464j) {
        this.f125163x = new WeakReference(c30464j);
    }
}
