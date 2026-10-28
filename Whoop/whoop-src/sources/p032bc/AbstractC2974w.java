package p032bc;

import a00.C0072g;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import ar.C1916d;
import bi.AbstractC3269g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p002a0.C0022g;
import p002a0.C0062y;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import u00.C34377e;

/* JADX INFO: renamed from: bc.w */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2974w implements Cloneable {

    /* JADX INFO: renamed from: a0 */
    public static final Animator[] f11907a0 = new Animator[0];

    /* JADX INFO: renamed from: b0 */
    public static final int[] f11908b0 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: c0 */
    public static final C34377e f11909c0 = new C34377e(15);

    /* JADX INFO: renamed from: d0 */
    public static final ThreadLocal f11910d0 = new ThreadLocal();

    /* JADX INFO: renamed from: K */
    public ArrayList f11917K;

    /* JADX INFO: renamed from: L */
    public ArrayList f11918L;

    /* JADX INFO: renamed from: M */
    public InterfaceC2972u[] f11919M;

    /* JADX INFO: renamed from: V */
    public AbstractC3269g f11928V;

    /* JADX INFO: renamed from: X */
    public long f11930X;

    /* JADX INFO: renamed from: Y */
    public C2971t f11931Y;

    /* JADX INFO: renamed from: Z */
    public long f11932Z;

    /* JADX INFO: renamed from: w */
    public final String f11933w = getClass().getName();

    /* JADX INFO: renamed from: x */
    public long f11934x = -1;

    /* JADX INFO: renamed from: y */
    public long f11935y = -1;

    /* JADX INFO: renamed from: z */
    public TimeInterpolator f11936z = null;

    /* JADX INFO: renamed from: E */
    public final ArrayList f11911E = new ArrayList();

    /* JADX INFO: renamed from: F */
    public final ArrayList f11912F = new ArrayList();

    /* JADX INFO: renamed from: G */
    public C0072g f11913G = new C0072g(5);

    /* JADX INFO: renamed from: H */
    public C0072g f11914H = new C0072g(5);

    /* JADX INFO: renamed from: I */
    public C2942c0 f11915I = null;

    /* JADX INFO: renamed from: J */
    public final int[] f11916J = f11908b0;

    /* JADX INFO: renamed from: N */
    public final ArrayList f11920N = new ArrayList();

    /* JADX INFO: renamed from: O */
    public Animator[] f11921O = f11907a0;

    /* JADX INFO: renamed from: P */
    public int f11922P = 0;

    /* JADX INFO: renamed from: Q */
    public boolean f11923Q = false;

    /* JADX INFO: renamed from: R */
    public boolean f11924R = false;

    /* JADX INFO: renamed from: S */
    public AbstractC2974w f11925S = null;

    /* JADX INFO: renamed from: T */
    public ArrayList f11926T = null;

    /* JADX INFO: renamed from: U */
    public ArrayList f11927U = new ArrayList();

    /* JADX INFO: renamed from: W */
    public C34377e f11929W = f11909c0;

    /* JADX INFO: renamed from: c */
    public static void m8642c(C0072g c0072g, View view, C2946e0 c2946e0) {
        C0022g c0022g = (C0022g) c0072g.f223x;
        C0022g c0022g2 = (C0022g) c0072g.f221E;
        SparseArray sparseArray = (SparseArray) c0072g.f224y;
        C0062y c0062y = (C0062y) c0072g.f225z;
        c0022g.put(view, c2946e0);
        int id4 = view.getId();
        if (id4 >= 0) {
            if (sparseArray.indexOfKey(id4) >= 0) {
                sparseArray.put(id4, null);
            } else {
                sparseArray.put(id4, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        String strM47511f = AbstractC16877h0.m47511f(view);
        if (strM47511f != null) {
            if (c0022g2.containsKey(strM47511f)) {
                c0022g2.put(strM47511f, null);
            } else {
                c0022g2.put(strM47511f, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0062y.m152d(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0062y.m155g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0062y.m151c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c0062y.m155g(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static C0022g m8643r() {
        ThreadLocal threadLocal = f11910d0;
        C0022g c0022g = (C0022g) threadLocal.get();
        if (c0022g != null) {
            return c0022g;
        }
        C0022g c0022g2 = new C0022g(0);
        threadLocal.set(c0022g2);
        return c0022g2;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m8644y(C2946e0 c2946e0, C2946e0 c2946e1, String str) {
        Object obj = c2946e0.f11843a.get(str);
        Object obj2 = c2946e1.f11843a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: A */
    public void mo8574A(View view) {
        if (this.f11924R) {
            return;
        }
        ArrayList arrayList = this.f11920N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f11921O);
        this.f11921O = f11907a0;
        for (int i13 = size - 1; i13 >= 0; i13--) {
            Animator animator = animatorArr[i13];
            animatorArr[i13] = null;
            animator.pause();
        }
        this.f11921O = animatorArr;
        m8655z(this, InterfaceC2973v.f11905e, false);
        this.f11923Q = true;
    }

    /* JADX INFO: renamed from: B */
    public void mo8575B() {
        C0022g c0022gM8643r = m8643r();
        this.f11930X = 0L;
        for (int i13 = 0; i13 < this.f11927U.size(); i13++) {
            Animator animator = (Animator) this.f11927U.get(i13);
            C2968q c2968q = (C2968q) c0022gM8643r.get(animator);
            if (animator != null && c2968q != null) {
                Animator animator2 = c2968q.f11893f;
                long j7 = this.f11935y;
                if (j7 >= 0) {
                    animator2.setDuration(j7);
                }
                long j13 = this.f11934x;
                if (j13 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j13);
                }
                TimeInterpolator timeInterpolator = this.f11936z;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f11920N.add(animator);
                this.f11930X = Math.max(this.f11930X, AbstractC2969r.m8639a(animator));
            }
        }
        this.f11927U.clear();
    }

    /* JADX INFO: renamed from: C */
    public AbstractC2974w mo8576C(InterfaceC2972u interfaceC2972u) {
        AbstractC2974w abstractC2974w;
        ArrayList arrayList = this.f11926T;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC2972u) && (abstractC2974w = this.f11925S) != null) {
                abstractC2974w.mo8576C(interfaceC2972u);
            }
            if (this.f11926T.size() == 0) {
                this.f11926T = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: D */
    public void mo8577D(View view) {
        this.f11912F.remove(view);
    }

    /* JADX INFO: renamed from: E */
    public void mo8578E(View view) {
        if (this.f11923Q) {
            if (!this.f11924R) {
                ArrayList arrayList = this.f11920N;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f11921O);
                this.f11921O = f11907a0;
                for (int i13 = size - 1; i13 >= 0; i13--) {
                    Animator animator = animatorArr[i13];
                    animatorArr[i13] = null;
                    animator.resume();
                }
                this.f11921O = animatorArr;
                m8655z(this, InterfaceC2973v.f11906f, false);
            }
            this.f11923Q = false;
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo8579F() {
        m8645N();
        C0022g c0022gM8643r = m8643r();
        for (Animator animator : this.f11927U) {
            if (c0022gM8643r.containsKey(animator)) {
                m8645N();
                if (animator != null) {
                    animator.addListener(new C2967p(this, c0022gM8643r));
                    long j7 = this.f11935y;
                    if (j7 >= 0) {
                        animator.setDuration(j7);
                    }
                    long j13 = this.f11934x;
                    if (j13 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j13);
                    }
                    TimeInterpolator timeInterpolator = this.f11936z;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C1916d(this, 1));
                    animator.start();
                }
            }
        }
        this.f11927U.clear();
        m8650n();
    }

    /* JADX INFO: renamed from: G */
    public void mo8580G(long j7, long j13) {
        long j14 = this.f11930X;
        int i13 = 0;
        boolean z4 = j7 < j13;
        if ((j13 < 0 && j7 >= 0) || (j13 > j14 && j7 <= j14)) {
            this.f11924R = false;
            m8655z(this, InterfaceC2973v.f11902b, z4);
        }
        ArrayList arrayList = this.f11920N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f11921O);
        this.f11921O = f11907a0;
        while (i13 < size) {
            Animator animator = animatorArr[i13];
            animatorArr[i13] = null;
            AbstractC2969r.m8640b(animator, Math.min(Math.max(0L, j7), AbstractC2969r.m8639a(animator)));
            i13++;
            j14 = j14;
        }
        long j15 = j14;
        this.f11921O = animatorArr;
        if ((j7 <= j15 || j13 > j15) && (j7 >= 0 || j13 < 0)) {
            return;
        }
        if (j7 > j15) {
            this.f11924R = true;
        }
        m8655z(this, InterfaceC2973v.f11903c, z4);
    }

    /* JADX INFO: renamed from: H */
    public void mo8581H(long j7) {
        this.f11935y = j7;
    }

    /* JADX INFO: renamed from: I */
    public void mo8582I(AbstractC3269g abstractC3269g) {
        this.f11928V = abstractC3269g;
    }

    /* JADX INFO: renamed from: J */
    public void mo8583J(TimeInterpolator timeInterpolator) {
        this.f11936z = timeInterpolator;
    }

    /* JADX INFO: renamed from: K */
    public void mo8584K(C34377e c34377e) {
        if (c34377e == null) {
            this.f11929W = f11909c0;
        } else {
            this.f11929W = c34377e;
        }
    }

    /* JADX INFO: renamed from: L */
    public void mo8585L() {
    }

    /* JADX INFO: renamed from: M */
    public void mo8586M(long j7) {
        this.f11934x = j7;
    }

    /* JADX INFO: renamed from: N */
    public final void m8645N() {
        if (this.f11922P == 0) {
            m8655z(this, InterfaceC2973v.f11902b, false);
            this.f11924R = false;
        }
        this.f11922P++;
    }

    /* JADX INFO: renamed from: O */
    public String mo8587O(String str) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(getClass().getSimpleName());
        sb4.append("@");
        sb4.append(Integer.toHexString(hashCode()));
        sb4.append(": ");
        if (this.f11935y != -1) {
            sb4.append("dur(");
            sb4.append(this.f11935y);
            sb4.append(") ");
        }
        if (this.f11934x != -1) {
            sb4.append("dly(");
            sb4.append(this.f11934x);
            sb4.append(") ");
        }
        if (this.f11936z != null) {
            sb4.append("interp(");
            sb4.append(this.f11936z);
            sb4.append(") ");
        }
        ArrayList arrayList = this.f11911E;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f11912F;
        if (size > 0 || arrayList2.size() > 0) {
            sb4.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(arrayList.get(i13));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    if (i14 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(arrayList2.get(i14));
                }
            }
            sb4.append(")");
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m8646a(InterfaceC2972u interfaceC2972u) {
        if (this.f11926T == null) {
            this.f11926T = new ArrayList();
        }
        this.f11926T.add(interfaceC2972u);
    }

    /* JADX INFO: renamed from: b */
    public void mo8591b(View view) {
        this.f11912F.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f11920N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f11921O);
        this.f11921O = f11907a0;
        for (int i13 = size - 1; i13 >= 0; i13--) {
            Animator animator = animatorArr[i13];
            animatorArr[i13] = null;
            animator.cancel();
        }
        this.f11921O = animatorArr;
        m8655z(this, InterfaceC2973v.f11904d, false);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo8592d(C2946e0 c2946e0);

    /* JADX INFO: renamed from: e */
    public final void m8647e(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C2946e0 c2946e0 = new C2946e0(view);
            if (z4) {
                mo8594g(c2946e0);
            } else {
                mo8592d(c2946e0);
            }
            c2946e0.f11845c.add(this);
            mo8593f(c2946e0);
            if (z4) {
                m8642c(this.f11913G, view, c2946e0);
            } else {
                m8642c(this.f11914H, view, c2946e0);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                m8647e(viewGroup.getChildAt(i13), z4);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo8593f(C2946e0 c2946e0) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo8594g(C2946e0 c2946e0);

    /* JADX INFO: renamed from: h */
    public final void m8648h(ViewGroup viewGroup, boolean z4) {
        m8649i(z4);
        ArrayList arrayList = this.f11911E;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f11912F;
        if (size <= 0 && arrayList2.size() <= 0) {
            m8647e(viewGroup, z4);
            return;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i13)).intValue());
            if (viewFindViewById != null) {
                C2946e0 c2946e0 = new C2946e0(viewFindViewById);
                if (z4) {
                    mo8594g(c2946e0);
                } else {
                    mo8592d(c2946e0);
                }
                c2946e0.f11845c.add(this);
                mo8593f(c2946e0);
                if (z4) {
                    m8642c(this.f11913G, viewFindViewById, c2946e0);
                } else {
                    m8642c(this.f11914H, viewFindViewById, c2946e0);
                }
            }
        }
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            View view = (View) arrayList2.get(i14);
            C2946e0 c2946e1 = new C2946e0(view);
            if (z4) {
                mo8594g(c2946e1);
            } else {
                mo8592d(c2946e1);
            }
            c2946e1.f11845c.add(this);
            mo8593f(c2946e1);
            if (z4) {
                m8642c(this.f11913G, view, c2946e1);
            } else {
                m8642c(this.f11914H, view, c2946e1);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8649i(boolean z4) {
        if (z4) {
            ((C0022g) this.f11913G.f223x).clear();
            ((SparseArray) this.f11913G.f224y).clear();
            ((C0062y) this.f11913G.f225z).m149a();
        } else {
            ((C0022g) this.f11914H.f223x).clear();
            ((SparseArray) this.f11914H.f224y).clear();
            ((C0062y) this.f11914H.f225z).m149a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC2974w clone() {
        try {
            AbstractC2974w abstractC2974w = (AbstractC2974w) super.clone();
            abstractC2974w.f11927U = new ArrayList();
            abstractC2974w.f11913G = new C0072g(5);
            abstractC2974w.f11914H = new C0072g(5);
            abstractC2974w.f11917K = null;
            abstractC2974w.f11918L = null;
            abstractC2974w.f11931Y = null;
            abstractC2974w.f11925S = this;
            abstractC2974w.f11926T = null;
            return abstractC2974w;
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX INFO: renamed from: k */
    public Animator mo8604k(ViewGroup viewGroup, C2946e0 c2946e0, C2946e0 c2946e1) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void mo8596l(ViewGroup viewGroup, C0072g c0072g, C0072g c0072g2, ArrayList arrayList, ArrayList arrayList2) {
        int i13;
        boolean z4;
        View view;
        C2946e0 c2946e0;
        Animator animator;
        Object obj;
        Animator animator2;
        C2946e0 c2946e1;
        C0022g c0022gM8643r = m8643r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z13 = m8652q().f11931Y != null;
        int i14 = 0;
        while (i14 < size) {
            C2946e0 c2946e2 = (C2946e0) arrayList.get(i14);
            C2946e0 c2946e3 = (C2946e0) arrayList2.get(i14);
            if (c2946e2 != null && !c2946e2.f11845c.contains(this)) {
                c2946e2 = null;
            }
            if (c2946e3 != null && !c2946e3.f11845c.contains(this)) {
                c2946e3 = null;
            }
            if ((c2946e2 != null || c2946e3 != null) && (c2946e2 == null || c2946e3 == null || mo8615w(c2946e2, c2946e3))) {
                Animator animatorMo8604k = mo8604k(viewGroup, c2946e2, c2946e3);
                if (animatorMo8604k != null) {
                    String str = this.f11933w;
                    if (c2946e3 != null) {
                        view = c2946e3.f11844b;
                        String[] strArrMo8605s = mo8605s();
                        if (strArrMo8605s != null && strArrMo8605s.length > 0) {
                            c2946e1 = new C2946e0(view);
                            C2946e0 c2946e4 = (C2946e0) ((C0022g) c0072g2.f223x).get(view);
                            i13 = size;
                            z4 = z13;
                            if (c2946e4 != null) {
                                for (String str2 : strArrMo8605s) {
                                    c2946e1.f11843a.put(str2, c2946e4.f11843a.get(str2));
                                }
                            }
                            int i15 = c0022gM8643r.f50y;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= i15) {
                                    animator2 = animatorMo8604k;
                                    break;
                                }
                                C2968q c2968q = (C2968q) c0022gM8643r.get((Animator) c0022gM8643r.m38g(i16));
                                if (c2968q.f11890c != null && c2968q.f11888a == view && c2968q.f11889b.equals(str) && c2968q.f11890c.equals(c2946e1)) {
                                    animator2 = null;
                                    break;
                                }
                                i16++;
                            }
                        } else {
                            i13 = size;
                            z4 = z13;
                            animator2 = animatorMo8604k;
                            c2946e1 = null;
                        }
                        animator = animator2;
                        c2946e0 = c2946e1;
                    } else {
                        i13 = size;
                        z4 = z13;
                        view = c2946e2.f11844b;
                        c2946e0 = null;
                    }
                    if (animator != null) {
                        animator = animatorMo8604k;
                        WindowId windowId = viewGroup.getWindowId();
                        C2968q c2968q2 = new C2968q();
                        c2968q2.f11888a = view;
                        c2968q2.f11889b = str;
                        c2968q2.f11890c = c2946e0;
                        c2968q2.f11891d = windowId;
                        c2968q2.f11892e = this;
                        c2968q2.f11893f = animator;
                        if (z4) {
                            obj = animator;
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator);
                            obj = animatorSet;
                        }
                        obj = animator;
                        c0022gM8643r.put(obj, c2968q2);
                        this.f11927U.add(obj);
                    } else {
                        animator = animatorMo8604k;
                    }
                }
                i14++;
                size = i13;
                z13 = z4;
            }
            i13 = size;
            z4 = z13;
            i14++;
            size = i13;
            z13 = z4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i17 = 0; i17 < sparseIntArray.size(); i17++) {
                C2968q c2968q3 = (C2968q) c0022gM8643r.get((Animator) this.f11927U.get(sparseIntArray.keyAt(i17)));
                c2968q3.f11893f.setStartDelay(c2968q3.f11893f.getStartDelay() + (((long) sparseIntArray.valueAt(i17)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8650n() {
        int i13 = this.f11922P - 1;
        this.f11922P = i13;
        if (i13 == 0) {
            m8655z(this, InterfaceC2973v.f11903c, false);
            for (int i14 = 0; i14 < ((C0062y) this.f11913G.f225z).m157i(); i14++) {
                View view = (View) ((C0062y) this.f11913G.f225z).m158j(i14);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i15 = 0; i15 < ((C0062y) this.f11914H.f225z).m157i(); i15++) {
                View view2 = (View) ((C0062y) this.f11914H.f225z).m158j(i15);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f11924R = true;
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo8597o(ViewGroup viewGroup) {
        C0022g c0022gM8643r = m8643r();
        int i13 = c0022gM8643r.f50y;
        if (viewGroup == null || i13 == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        C0022g c0022g = new C0022g(c0022gM8643r);
        c0022gM8643r.clear();
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            C2968q c2968q = (C2968q) c0022g.m42k(i14);
            if (c2968q.f11888a != null && windowId.equals(c2968q.f11891d)) {
                ((Animator) c0022g.m38g(i14)).end();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final C2946e0 m8651p(View view, boolean z4) {
        C2942c0 c2942c0 = this.f11915I;
        if (c2942c0 != null) {
            return c2942c0.m8651p(view, z4);
        }
        ArrayList arrayList = z4 ? this.f11917K : this.f11918L;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i13 = -1;
                break;
            }
            C2946e0 c2946e0 = (C2946e0) arrayList.get(i13);
            if (c2946e0 == null) {
                return null;
            }
            if (c2946e0.f11844b == view) {
                break;
            }
            i13++;
        }
        if (i13 >= 0) {
            return (C2946e0) (z4 ? this.f11918L : this.f11917K).get(i13);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC2974w m8652q() {
        C2942c0 c2942c0 = this.f11915I;
        return c2942c0 != null ? c2942c0.m8652q() : this;
    }

    /* JADX INFO: renamed from: s */
    public String[] mo8605s() {
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final C2946e0 m8653t(View view, boolean z4) {
        C2942c0 c2942c0 = this.f11915I;
        if (c2942c0 != null) {
            return c2942c0.m8653t(view, z4);
        }
        return (C2946e0) ((C0022g) (z4 ? this.f11913G : this.f11914H).f223x).get(view);
    }

    public final String toString() {
        return mo8587O("");
    }

    /* JADX INFO: renamed from: u */
    public boolean mo8598u() {
        return !this.f11920N.isEmpty();
    }

    /* JADX INFO: renamed from: v */
    public abstract boolean mo8599v();

    /* JADX INFO: renamed from: w */
    public boolean mo8615w(C2946e0 c2946e0, C2946e0 c2946e1) {
        if (c2946e0 != null && c2946e1 != null) {
            String[] strArrMo8605s = mo8605s();
            if (strArrMo8605s != null) {
                for (String str : strArrMo8605s) {
                    if (m8644y(c2946e0, c2946e1, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c2946e0.f11843a.keySet().iterator();
                while (it.hasNext()) {
                    if (m8644y(c2946e0, c2946e1, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m8654x(View view) {
        int id4 = view.getId();
        ArrayList arrayList = this.f11911E;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f11912F;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id4)) || arrayList2.contains(view);
    }

    /* JADX INFO: renamed from: z */
    public final void m8655z(AbstractC2974w abstractC2974w, InterfaceC2973v interfaceC2973v, boolean z4) {
        AbstractC2974w abstractC2974w2 = this.f11925S;
        if (abstractC2974w2 != null) {
            abstractC2974w2.m8655z(abstractC2974w, interfaceC2973v, z4);
        }
        ArrayList arrayList = this.f11926T;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f11926T.size();
        InterfaceC2972u[] interfaceC2972uArr = this.f11919M;
        if (interfaceC2972uArr == null) {
            interfaceC2972uArr = new InterfaceC2972u[size];
        }
        this.f11919M = null;
        InterfaceC2972u[] interfaceC2972uArr2 = (InterfaceC2972u[]) this.f11926T.toArray(interfaceC2972uArr);
        for (int i13 = 0; i13 < size; i13++) {
            interfaceC2973v.mo1655b(interfaceC2972uArr2[i13], abstractC2974w, z4);
            interfaceC2972uArr2[i13] = null;
        }
        this.f11919M = interfaceC2972uArr2;
    }
}
