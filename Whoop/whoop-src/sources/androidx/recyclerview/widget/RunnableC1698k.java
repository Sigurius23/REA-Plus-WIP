package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1698k implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6715w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ArrayList f6716x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1722q f6717y;

    public /* synthetic */ RunnableC1698k(C1722q c1722q, ArrayList arrayList, int i13) {
        this.f6715w = i13;
        this.f6717y = c1722q;
        this.f6716x = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6715w) {
            case 0:
                ArrayList arrayList = this.f6716x;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C1722q c1722q = this.f6717y;
                    if (!zHasNext) {
                        arrayList.clear();
                        c1722q.f6817m.remove(arrayList);
                    } else {
                        C1718p c1718p = (C1718p) it.next();
                        AbstractC1717o2 abstractC1717o2 = c1718p.f6797a;
                        int i13 = c1718p.f6798b;
                        int i14 = c1718p.f6799c;
                        int i15 = c1718p.f6800d;
                        int i16 = c1718p.f6801e;
                        c1722q.getClass();
                        View view = abstractC1717o2.itemView;
                        int i17 = i15 - i13;
                        int i18 = i16 - i14;
                        if (i17 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i18 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1722q.f6820p.add(abstractC1717o2);
                        viewPropertyAnimatorAnimate.setDuration(c1722q.f6806e).setListener(new C1706m(c1722q, abstractC1717o2, i17, view, i18, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f6716x;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it3.hasNext();
                    C1722q c1722q2 = this.f6717y;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c1722q2.f6818n.remove(arrayList2);
                        break;
                    } else {
                        C1714o c1714o = (C1714o) it3.next();
                        ArrayList arrayList3 = c1722q2.f6822r;
                        long j7 = c1722q2.f6807f;
                        AbstractC1717o2 abstractC1717o3 = c1714o.f6761a;
                        View view2 = abstractC1717o3 == null ? null : abstractC1717o3.itemView;
                        AbstractC1717o2 abstractC1717o4 = c1714o.f6762b;
                        View view3 = abstractC1717o4 != null ? abstractC1717o4.itemView : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j7);
                            arrayList3.add(c1714o.f6761a);
                            duration.translationX(c1714o.f6765e - c1714o.f6763c);
                            duration.translationY(c1714o.f6766f - c1714o.f6764d);
                            duration.alpha(0.0f).setListener(new C1710n(c1722q2, c1714o, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c1714o.f6762b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j7).alpha(1.0f).setListener(new C1710n(c1722q2, c1714o, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f6716x;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it4.hasNext();
                    C1722q c1722q3 = this.f6717y;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c1722q3.f6816l.remove(arrayList4);
                    } else {
                        AbstractC1717o2 abstractC1717o5 = (AbstractC1717o2) it4.next();
                        c1722q3.getClass();
                        View view4 = abstractC1717o5.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c1722q3.f6819o.add(abstractC1717o5);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c1722q3.f6804c).setListener(new C1702l(c1722q3, abstractC1717o5, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
