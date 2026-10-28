package p032bc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p035bp.AbstractC3511b;
import u00.C34377e;

/* JADX INFO: renamed from: bc.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C2947f extends AbstractC2974w {

    /* JADX INFO: renamed from: e0 */
    public static final String[] f11846e0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: f0 */
    public static final C2939b f11847f0;

    /* JADX INFO: renamed from: g0 */
    public static final C2939b f11848g0;

    /* JADX INFO: renamed from: h0 */
    public static final C2939b f11849h0;

    /* JADX INFO: renamed from: i0 */
    public static final C2939b f11850i0;

    /* JADX INFO: renamed from: j0 */
    public static final C2939b f11851j0;

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        f11847f0 = new C2939b(cls, str, 0);
        String str2 = "bottomRight";
        f11848g0 = new C2939b(cls, str2, 1);
        f11849h0 = new C2939b(cls, str2, 2);
        f11850i0 = new C2939b(cls, str, 3);
        f11851j0 = new C2939b(cls, "position", 4);
    }

    /* JADX INFO: renamed from: P */
    public static void m8603P(C2946e0 c2946e0) {
        View view = c2946e0.f11844b;
        HashMap map = c2946e0.f11843a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: d */
    public final void mo8592d(C2946e0 c2946e0) {
        m8603P(c2946e0);
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: g */
    public final void mo8594g(C2946e0 c2946e0) {
        m8603P(c2946e0);
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: k */
    public final Animator mo8604k(ViewGroup viewGroup, C2946e0 c2946e0, C2946e0 c2946e1) {
        int i13;
        C2947f c2947f;
        Animator animatorM8637a;
        if (c2946e0 != null) {
            HashMap map = c2946e0.f11843a;
            if (c2946e1 != null) {
                HashMap map2 = c2946e1.f11843a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = c2946e1.f11844b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i14 = rect.left;
                    int i15 = rect2.left;
                    int i16 = rect.top;
                    int i17 = rect2.top;
                    int i18 = rect.right;
                    int i19 = rect2.right;
                    int i24 = rect.bottom;
                    int i25 = rect2.bottom;
                    int i26 = i18 - i14;
                    int i27 = i24 - i16;
                    int i28 = i19 - i15;
                    int i29 = i25 - i17;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i26 == 0 || i27 == 0) && (i28 == 0 || i29 == 0)) {
                        i13 = 0;
                    } else {
                        i13 = (i14 == i15 && i16 == i17) ? 0 : 1;
                        if (i18 != i19 || i24 != i25) {
                            i13++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i13++;
                    }
                    int i34 = i13;
                    if (i34 > 0) {
                        AbstractC2950g0.m8609a(view, i14, i16, i18, i24);
                        if (i34 != 2) {
                            c2947f = this;
                            if (i14 == i15 && i16 == i17) {
                                c2947f.f11929W.getClass();
                                animatorM8637a = AbstractC2965o.m8637a(view, f11849h0, C34377e.m108676t(i18, i24, i19, i25));
                            } else {
                                c2947f.f11929W.getClass();
                                animatorM8637a = AbstractC2965o.m8637a(view, f11850i0, C34377e.m108676t(i14, i16, i15, i17));
                            }
                        } else if (i26 == i28 && i27 == i29) {
                            c2947f = this;
                            c2947f.f11929W.getClass();
                            animatorM8637a = AbstractC2965o.m8637a(view, f11851j0, C34377e.m108676t(i14, i16, i15, i17));
                        } else {
                            c2947f = this;
                            C2945e c2945e = new C2945e(view);
                            c2947f.f11929W.getClass();
                            ObjectAnimator objectAnimatorM8637a = AbstractC2965o.m8637a(c2945e, f11847f0, C34377e.m108676t(i14, i16, i15, i17));
                            c2947f.f11929W.getClass();
                            ObjectAnimator objectAnimatorM8637a2 = AbstractC2965o.m8637a(c2945e, f11848g0, C34377e.m108676t(i18, i24, i19, i25));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorM8637a, objectAnimatorM8637a2);
                            animatorSet.addListener(new C2941c(c2945e));
                            animatorM8637a = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            AbstractC3511b.m10370J(viewGroup4, true);
                            c2947f.m8652q().m8646a(new C2943d(viewGroup4));
                        }
                        return animatorM8637a;
                    }
                }
            }
        }
        return null;
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: s */
    public final String[] mo8605s() {
        return f11846e0;
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: v */
    public final boolean mo8599v() {
        return true;
    }
}
