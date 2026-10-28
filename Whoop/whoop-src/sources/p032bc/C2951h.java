package p032bc;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.whoop.android.R;
import java.util.HashMap;
import p031b9.C2843j1;

/* JADX INFO: renamed from: bc.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C2951h extends AbstractC2974w {

    /* JADX INFO: renamed from: f0 */
    public static final String[] f11856f0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: e0 */
    public final int f11857e0;

    public C2951h(int i13) {
        this((Object) null);
        this.f11857e0 = i13;
    }

    /* JADX INFO: renamed from: P */
    public static void m8611P(C2946e0 c2946e0) {
        View view = c2946e0.f11844b;
        int visibility = view.getVisibility();
        HashMap map = c2946e0.f11843a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: R */
    public static float m8612R(C2946e0 c2946e0, float f13) {
        Float f14;
        return (c2946e0 == null || (f14 = (Float) c2946e0.f11843a.get("android:fade:transitionAlpha")) == null) ? f13 : f14.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: S */
    public static C2843j1 m8613S(C2946e0 c2946e0, C2946e0 c2946e1) {
        C2843j1 c2843j1 = new C2843j1();
        c2843j1.f11229a = false;
        c2843j1.f11230b = false;
        if (c2946e0 != null) {
            HashMap map = c2946e0.f11843a;
            if (map.containsKey("android:visibility:visibility")) {
                c2843j1.f11231c = ((Integer) map.get("android:visibility:visibility")).intValue();
                c2843j1.f11233e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c2843j1.f11231c = -1;
                c2843j1.f11233e = null;
            }
        } else {
            c2843j1.f11231c = -1;
            c2843j1.f11233e = null;
        }
        if (c2946e1 != null) {
            HashMap map2 = c2946e1.f11843a;
            if (map2.containsKey("android:visibility:visibility")) {
                c2843j1.f11232d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c2843j1.f11234f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c2843j1.f11232d = -1;
                c2843j1.f11234f = null;
            }
        } else {
            c2843j1.f11232d = -1;
            c2843j1.f11234f = null;
        }
        if (c2946e0 != null && c2946e1 != null) {
            int i13 = c2843j1.f11231c;
            int i14 = c2843j1.f11232d;
            if (i13 != i14 || ((ViewGroup) c2843j1.f11233e) != ((ViewGroup) c2843j1.f11234f)) {
                if (i13 != i14) {
                    if (i13 == 0) {
                        c2843j1.f11230b = false;
                        c2843j1.f11229a = true;
                        return c2843j1;
                    }
                    if (i14 == 0) {
                        c2843j1.f11230b = true;
                        c2843j1.f11229a = true;
                        return c2843j1;
                    }
                } else {
                    if (((ViewGroup) c2843j1.f11234f) == null) {
                        c2843j1.f11230b = false;
                        c2843j1.f11229a = true;
                        return c2843j1;
                    }
                    if (((ViewGroup) c2843j1.f11233e) == null) {
                        c2843j1.f11230b = true;
                        c2843j1.f11229a = true;
                        return c2843j1;
                    }
                }
            }
        } else {
            if (c2946e0 == null && c2843j1.f11232d == 0) {
                c2843j1.f11230b = true;
                c2843j1.f11229a = true;
                return c2843j1;
            }
            if (c2946e1 == null && c2843j1.f11231c == 0) {
                c2843j1.f11230b = false;
                c2843j1.f11229a = true;
            }
        }
        return c2843j1;
    }

    /* JADX INFO: renamed from: Q */
    public final ObjectAnimator m8614Q(View view, float f13, float f14) {
        if (f13 == f14) {
            return null;
        }
        AbstractC2950g0.f11854a.mo8634e0(view, f13);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC2950g0.f11855b, f14);
        C2949g c2949g = new C2949g(view);
        objectAnimatorOfFloat.addListener(c2949g);
        m8652q().m8646a(c2949g);
        return objectAnimatorOfFloat;
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: d */
    public final void mo8592d(C2946e0 c2946e0) {
        m8611P(c2946e0);
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: g */
    public final void mo8594g(C2946e0 c2946e0) {
        m8611P(c2946e0);
        View view = c2946e0.f11844b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC2950g0.f11854a.mo8633S(view)) : Float.valueOf(0.0f);
        }
        c2946e0.f11843a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0134  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:69:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x0206  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (m8613S(m8651p(r3, false), m8653t(r3, false)).f11229a != false) goto L9;
     */
    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator mo8604k(android.view.ViewGroup r24, p032bc.C2946e0 r25, p032bc.C2946e0 r26) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p032bc.C2951h.mo8604k(android.view.ViewGroup, bc.e0, bc.e0):android.animation.Animator");
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: s */
    public final String[] mo8605s() {
        return f11856f0;
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: v */
    public final boolean mo8599v() {
        return true;
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: w */
    public final boolean mo8615w(C2946e0 c2946e0, C2946e0 c2946e1) {
        if (c2946e0 == null && c2946e1 == null) {
            return false;
        }
        if (c2946e0 != null && c2946e1 != null && c2946e1.f11843a.containsKey("android:visibility:visibility") != c2946e0.f11843a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C2843j1 c2843j1M8613S = m8613S(c2946e0, c2946e1);
        if (c2843j1M8613S.f11229a) {
            return c2843j1M8613S.f11231c == 0 || c2843j1M8613S.f11232d == 0;
        }
        return false;
    }

    public C2951h(Object obj) {
        this.f11857e0 = 3;
    }
}
