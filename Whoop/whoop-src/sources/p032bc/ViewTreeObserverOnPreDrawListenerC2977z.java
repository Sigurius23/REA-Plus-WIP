package p032bc;

import a00.C0072g;
import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;
import p002a0.C0022g;
import p002a0.C0062y;

/* JADX INFO: renamed from: bc.z */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnPreDrawListenerC2977z implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w */
    public AbstractC2974w f11939w;

    /* JADX INFO: renamed from: x */
    public ViewGroup f11940x;

    /* JADX WARN: Code duplicated, block: B:101:0x0220  */
    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:104:0x023a  */
    /* JADX WARN: Code duplicated, block: B:108:0x024c  */
    /* JADX WARN: Code duplicated, block: B:131:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:148:0x0304  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0313 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:154:0x01f8 A[EDGE_INSN: B:154:0x01f8->B:91:0x01f8 BREAK  A[LOOP:1: B:19:0x0087->B:90:0x01ee], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:65:0x0171  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x020d  */
    /* JADX WARN: Instruction removed from duplicated block: B:146:0x02f5, please report this as an issue */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i13;
        C0072g c0072g;
        C0072g c0072g2;
        C0022g c0022g;
        C0022g c0022g2;
        int i14;
        int[] iArr;
        boolean z4;
        int i15;
        int i16;
        C0022g c0022gM8643r;
        int i17;
        Animator animator;
        C2968q c2968q;
        C2946e0 c2946e0;
        C2946e0 c2946e1;
        int i18;
        C0072g c0072g3;
        boolean z13;
        int i19;
        View view;
        C2946e0 c2946e2;
        C0022g c0022g3;
        int i24;
        int i25;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i26;
        View view4;
        View view5;
        C0062y c0062y;
        int iM157i;
        int i27;
        View view6;
        C0072g c0072g4;
        Iterator it;
        AbstractC2974w abstractC2974w = this.f11939w;
        ViewGroup viewGroup = this.f11940x;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z14 = true;
        if (!AbstractC2938a0.f11825c.remove(viewGroup)) {
            return true;
        }
        C0022g c0022gM8569b = AbstractC2938a0.m8569b();
        ArrayList arrayList2 = (ArrayList) c0022gM8569b.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(abstractC2974w);
            abstractC2974w.m8646a(new C2976y(this, c0022gM8569b));
            i13 = 0;
            abstractC2974w.m8648h(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC2974w) it.next()).mo8578E(viewGroup);
                }
            }
            abstractC2974w.f11917K = new ArrayList();
            abstractC2974w.f11918L = new ArrayList();
            c0072g = abstractC2974w.f11913G;
            c0072g2 = abstractC2974w.f11914H;
            c0022g = new C0022g((C0022g) c0072g.f223x);
            c0022g2 = new C0022g((C0022g) c0072g2.f223x);
            i14 = 0;
            while (true) {
                iArr = abstractC2974w.f11916J;
                if (i14 < iArr.length) {
                    break;
                }
                i18 = iArr[i14];
                if (i18 != z14) {
                    c0072g3 = c0072g2;
                    z13 = z14;
                    for (i19 = c0022g.f50y - 1; i19 >= 0; i19--) {
                        view = (View) c0022g.m38g(i19);
                        if (view == null && abstractC2974w.m8654x(view) && (c2946e2 = (C2946e0) c0022g2.remove(view)) != null && abstractC2974w.m8654x(c2946e2.f11844b)) {
                            abstractC2974w.f11917K.add((C2946e0) c0022g.mo40i(i19));
                            abstractC2974w.f11918L.add(c2946e2);
                        }
                    }
                } else if (i18 != 2) {
                    c0072g3 = c0072g2;
                    z13 = z14;
                    c0022g3 = (C0022g) c0072g.f221E;
                    C0022g c0022g4 = (C0022g) c0072g3.f221E;
                    i24 = c0022g3.f50y;
                    for (i25 = 0; i25 < i24; i25++) {
                        view2 = (View) c0022g3.m42k(i25);
                        if (view2 == null && abstractC2974w.m8654x(view2) && (view3 = (View) c0022g4.get(c0022g3.m38g(i25))) != null && abstractC2974w.m8654x(view3)) {
                            C2946e0 c2946e3 = (C2946e0) c0022g.get(view2);
                            C2946e0 c2946e4 = (C2946e0) c0022g2.get(view3);
                            if (c2946e3 != null && c2946e4 != null) {
                                abstractC2974w.f11917K.add(c2946e3);
                                abstractC2974w.f11918L.add(c2946e4);
                                c0022g.remove(view2);
                                c0022g2.remove(view3);
                            }
                        }
                    }
                } else if (i18 != 3) {
                    z13 = z14;
                    sparseArray = (SparseArray) c0072g.f224y;
                    c0072g3 = c0072g2;
                    SparseArray sparseArray2 = (SparseArray) c0072g3.f224y;
                    size = sparseArray.size();
                    for (i26 = 0; i26 < size; i26++) {
                        view4 = (View) sparseArray.valueAt(i26);
                        if (view4 == null && abstractC2974w.m8654x(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i26))) != null && abstractC2974w.m8654x(view5)) {
                            C2946e0 c2946e5 = (C2946e0) c0022g.get(view4);
                            C2946e0 c2946e6 = (C2946e0) c0022g2.get(view5);
                            if (c2946e5 != null && c2946e6 != null) {
                                abstractC2974w.f11917K.add(c2946e5);
                                abstractC2974w.f11918L.add(c2946e6);
                                c0022g.remove(view4);
                                c0022g2.remove(view5);
                            }
                        }
                    }
                } else if (i18 != 4) {
                    c0072g3 = c0072g2;
                    z13 = z14;
                } else {
                    c0062y = (C0062y) c0072g.f225z;
                    C0062y c0062y2 = (C0062y) c0072g2.f225z;
                    iM157i = c0062y.m157i();
                    i27 = i13;
                    while (i27 < iM157i) {
                        view6 = (View) c0062y.m158j(i27);
                        if (view6 == null && abstractC2974w.m8654x(view6)) {
                            c0072g4 = c0072g2;
                            View view7 = (View) c0062y2.m151c(c0062y.m154f(i27));
                            if (view7 != null && abstractC2974w.m8654x(view7)) {
                                C2946e0 c2946e7 = (C2946e0) c0022g.get(view6);
                                C2946e0 c2946e8 = (C2946e0) c0022g2.get(view7);
                                if (c2946e7 != null && c2946e8 != null) {
                                    abstractC2974w.f11917K.add(c2946e7);
                                    abstractC2974w.f11918L.add(c2946e8);
                                    c0022g.remove(view6);
                                    c0022g2.remove(view7);
                                }
                            }
                            i27++;
                            c0072g2 = c0072g4;
                            z14 = z14;
                        } else {
                            c0072g4 = c0072g2;
                        }
                        i27++;
                        c0072g2 = c0072g4;
                        z14 = z14;
                    }
                    z13 = z14;
                    c0072g3 = c0072g2;
                }
                i14++;
                c0072g2 = c0072g3;
                z14 = z13;
                i13 = 0;
            }
            z4 = z14;
            for (i15 = 0; i15 < c0022g.f50y; i15++) {
                c2946e1 = (C2946e0) c0022g.m42k(i15);
                if (abstractC2974w.m8654x(c2946e1.f11844b)) {
                    abstractC2974w.f11917K.add(c2946e1);
                    abstractC2974w.f11918L.add(null);
                }
            }
            for (i16 = 0; i16 < c0022g2.f50y; i16++) {
                c2946e0 = (C2946e0) c0022g2.m42k(i16);
                if (abstractC2974w.m8654x(c2946e0.f11844b)) {
                    abstractC2974w.f11918L.add(c2946e0);
                    abstractC2974w.f11917K.add(null);
                }
            }
            c0022gM8643r = AbstractC2974w.m8643r();
            int i28 = c0022gM8643r.f50y;
            WindowId windowId = viewGroup.getWindowId();
            i17 = i28 - 1;
            while (i17 >= 0) {
                animator = (Animator) c0022gM8643r.m38g(i17);
                if (animator == null && (c2968q = (C2968q) c0022gM8643r.get(animator)) != null) {
                    AbstractC2974w abstractC2974w2 = c2968q.f11892e;
                    View view8 = c2968q.f11888a;
                    if (view8 != null && windowId.equals(c2968q.f11891d)) {
                        C2946e0 c2946e9 = c2968q.f11890c;
                        boolean z15 = z4;
                        C2946e0 c2946e0M8653t = abstractC2974w.m8653t(view8, z15);
                        C2946e0 c2946e0M8651p = abstractC2974w.m8651p(view8, z15);
                        if (c2946e0M8653t == null && c2946e0M8651p == null) {
                            c2946e0M8651p = (C2946e0) ((C0022g) abstractC2974w.f11914H.f223x).get(view8);
                        }
                        if ((c2946e0M8653t != null || c2946e0M8651p != null) && abstractC2974w2.mo8615w(c2946e9, c2946e0M8651p)) {
                            AbstractC2974w abstractC2974wM8652q = abstractC2974w2.m8652q();
                            ArrayList arrayList3 = abstractC2974w2.f11920N;
                            if (abstractC2974wM8652q.f11931Y != null) {
                                animator.cancel();
                                arrayList3.remove(animator);
                                c0022gM8643r.remove(animator);
                                if (arrayList3.size() == 0) {
                                    abstractC2974w2.m8655z(abstractC2974w2, InterfaceC2973v.f11904d, false);
                                    if (!abstractC2974w2.f11924R) {
                                        abstractC2974w2.f11924R = true;
                                        abstractC2974w2.m8655z(abstractC2974w2, InterfaceC2973v.f11903c, false);
                                    }
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c0022gM8643r.remove(animator);
                            }
                        }
                    }
                }
                i17--;
                z4 = true;
            }
            abstractC2974w.mo8596l(viewGroup, abstractC2974w.f11913G, abstractC2974w.f11914H, abstractC2974w.f11917K, abstractC2974w.f11918L);
            if (abstractC2974w.f11931Y == null) {
                abstractC2974w.mo8579F();
                return true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return true;
            }
            abstractC2974w.mo8575B();
            C2971t c2971t = abstractC2974w.f11931Y;
            C2942c0 c2942c0 = c2971t.f11901g;
            long j7 = c2942c0.f11930X == 0 ? 1L : 0L;
            c2942c0.mo8580G(j7, c2971t.f11895a);
            c2971t.f11895a = j7;
            abstractC2974w.f11931Y.f11896b = true;
            return true;
        }
        arrayList2 = new ArrayList();
        c0022gM8569b.put(viewGroup, arrayList2);
        arrayList2.add(abstractC2974w);
        abstractC2974w.m8646a(new C2976y(this, c0022gM8569b));
        i13 = 0;
        abstractC2974w.m8648h(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC2974w) it.next()).mo8578E(viewGroup);
            }
        }
        abstractC2974w.f11917K = new ArrayList();
        abstractC2974w.f11918L = new ArrayList();
        c0072g = abstractC2974w.f11913G;
        c0072g2 = abstractC2974w.f11914H;
        c0022g = new C0022g((C0022g) c0072g.f223x);
        c0022g2 = new C0022g((C0022g) c0072g2.f223x);
        i14 = 0;
        while (true) {
            iArr = abstractC2974w.f11916J;
            if (i14 < iArr.length) {
                break;
                break;
            }
            i18 = iArr[i14];
            if (i18 != z14) {
                c0072g3 = c0072g2;
                z13 = z14;
                while (i19 >= 0) {
                    view = (View) c0022g.m38g(i19);
                    if (view == null) {
                    }
                }
            } else if (i18 != 2) {
                c0072g3 = c0072g2;
                z13 = z14;
                c0022g3 = (C0022g) c0072g.f221E;
                C0022g c0022g5 = (C0022g) c0072g3.f221E;
                i24 = c0022g3.f50y;
                while (i25 < i24) {
                    view2 = (View) c0022g3.m42k(i25);
                    if (view2 == null) {
                    }
                }
            } else if (i18 != 3) {
                z13 = z14;
                sparseArray = (SparseArray) c0072g.f224y;
                c0072g3 = c0072g2;
                SparseArray sparseArray3 = (SparseArray) c0072g3.f224y;
                size = sparseArray.size();
                while (i26 < size) {
                    view4 = (View) sparseArray.valueAt(i26);
                    if (view4 == null) {
                    }
                }
            } else if (i18 != 4) {
                c0072g3 = c0072g2;
                z13 = z14;
            } else {
                c0062y = (C0062y) c0072g.f225z;
                C0062y c0062y3 = (C0062y) c0072g2.f225z;
                iM157i = c0062y.m157i();
                i27 = i13;
                while (i27 < iM157i) {
                    view6 = (View) c0062y.m158j(i27);
                    if (view6 == null) {
                        c0072g4 = c0072g2;
                    } else {
                        c0072g4 = c0072g2;
                    }
                    i27++;
                    c0072g2 = c0072g4;
                    z14 = z14;
                }
                z13 = z14;
                c0072g3 = c0072g2;
            }
            i14++;
            c0072g2 = c0072g3;
            z14 = z13;
            i13 = 0;
        }
        z4 = z14;
        while (i15 < c0022g.f50y) {
            c2946e1 = (C2946e0) c0022g.m42k(i15);
            if (abstractC2974w.m8654x(c2946e1.f11844b)) {
                abstractC2974w.f11917K.add(c2946e1);
                abstractC2974w.f11918L.add(null);
            }
        }
        while (i16 < c0022g2.f50y) {
            c2946e0 = (C2946e0) c0022g2.m42k(i16);
            if (abstractC2974w.m8654x(c2946e0.f11844b)) {
                abstractC2974w.f11918L.add(c2946e0);
                abstractC2974w.f11917K.add(null);
            }
        }
        c0022gM8643r = AbstractC2974w.m8643r();
        int i29 = c0022gM8643r.f50y;
        WindowId windowId2 = viewGroup.getWindowId();
        i17 = i29 - 1;
        while (i17 >= 0) {
            animator = (Animator) c0022gM8643r.m38g(i17);
            if (animator == null) {
            }
            i17--;
            z4 = true;
        }
        abstractC2974w.mo8596l(viewGroup, abstractC2974w.f11913G, abstractC2974w.f11914H, abstractC2974w.f11917K, abstractC2974w.f11918L);
        if (abstractC2974w.f11931Y == null) {
            abstractC2974w.mo8579F();
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        abstractC2974w.mo8575B();
        C2971t c2971t2 = abstractC2974w.f11931Y;
        C2942c0 c2942c1 = c2971t2.f11901g;
        if (c2942c1.f11930X == 0) {
        }
        c2942c1.mo8580G(j7, c2971t2.f11895a);
        c2971t2.f11895a = j7;
        abstractC2974w.f11931Y.f11896b = true;
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f11940x;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC2938a0.f11825c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC2938a0.m8569b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC2974w) it.next()).mo8578E(viewGroup);
            }
        }
        this.f11939w.m8649i(true);
    }
}
