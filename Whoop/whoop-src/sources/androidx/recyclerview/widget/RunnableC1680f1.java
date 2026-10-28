package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f1 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1680f1 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6650w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ RecyclerView f6651x;

    public /* synthetic */ RunnableC1680f1(RecyclerView recyclerView, int i13) {
        this.f6650w = i13;
        this.f6651x = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        int i13 = this.f6650w;
        RecyclerView recyclerView = this.f6651x;
        switch (i13) {
            case 0:
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.mLayoutSuppressed) {
                        recyclerView.mLayoutWasDefered = true;
                    } else {
                        recyclerView.consumePendingUpdateOperations();
                    }
                    break;
                }
                break;
            default:
                AbstractC1720p1 abstractC1720p1 = recyclerView.mItemAnimator;
                if (abstractC1720p1 != null) {
                    C1722q c1722q = (C1722q) abstractC1720p1;
                    long j7 = c1722q.f6805d;
                    ArrayList<AbstractC1717o2> arrayList = c1722q.f6812h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c1722q.f6814j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c1722q.f6815k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c1722q.f6813i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z4 = false;
                    } else {
                        for (AbstractC1717o2 abstractC1717o2 : arrayList) {
                            View view = abstractC1717o2.itemView;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            c1722q.f6821q.add(abstractC1717o2);
                            viewPropertyAnimatorAnimate.setDuration(j7).alpha(0.0f).setListener(new C1702l(c1722q, abstractC1717o2, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z13 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c1722q.f6817m.add(arrayList5);
                            arrayList2.clear();
                            RunnableC1698k runnableC1698k = new RunnableC1698k(c1722q, arrayList5, 0);
                            if (z13) {
                                runnableC1698k.run();
                            } else {
                                View view2 = ((C1718p) arrayList5.get(0)).f6797a.itemView;
                                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                                view2.postOnAnimationDelayed(runnableC1698k, j7);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c1722q.f6818n.add(arrayList6);
                            arrayList3.clear();
                            RunnableC1698k runnableC1698k2 = new RunnableC1698k(c1722q, arrayList6, 1);
                            if (z13) {
                                runnableC1698k2.run();
                            } else {
                                View view3 = ((C1714o) arrayList6.get(0)).f6761a.itemView;
                                WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                                view3.postOnAnimationDelayed(runnableC1698k2, j7);
                            }
                        }
                        if (zIsEmpty4) {
                            z4 = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c1722q.f6816l.add(arrayList7);
                            arrayList4.clear();
                            RunnableC1698k runnableC1698k3 = new RunnableC1698k(c1722q, arrayList7, 2);
                            if (z13 && zIsEmpty2 && zIsEmpty3) {
                                runnableC1698k3.run();
                                z4 = false;
                            } else {
                                if (z13) {
                                    j7 = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? c1722q.f6806e : 0L, zIsEmpty3 ? 0L : c1722q.f6807f) + j7;
                                z4 = false;
                                View view4 = ((AbstractC1717o2) arrayList7.get(0)).itemView;
                                WeakHashMap weakHashMap3 = AbstractC16901p0.f64851a;
                                view4.postOnAnimationDelayed(runnableC1698k3, jMax);
                            }
                        }
                    }
                } else {
                    z4 = false;
                }
                recyclerView.mPostedAnimatorRunner = z4;
                break;
        }
    }
}
