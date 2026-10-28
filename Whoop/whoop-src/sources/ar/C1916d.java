package ar;

import a33.C0352d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.health.platform.client.proto.C1533u;
import cc.C4399f;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.C5053l;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.mapbox.maps.threading.AnimationThreadController;
import er.C13574g;
import fr.C14692c;
import fr.C14707r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p021av.C2088b;
import p032bc.AbstractC2974w;
import p077d0.C11412w1;
import p157fv.C14802h;
import p157fv.C14809o;
import p470rv.C31838r;
import p715kotlin.jvm.internal.AbstractC22676k;
import sv.C33029e;
import sv.C33031g;

/* JADX INFO: renamed from: ar.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C1916d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7583a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7584b;

    public /* synthetic */ C1916d(Object obj, int i13) {
        this.f7583a = i13;
        this.f7584b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7583a) {
            case 15:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f7584b;
                actionBarOverlayLayout.f4299W = null;
                actionBarOverlayLayout.f4286J = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        switch (this.f7583a) {
            case 0:
                AbstractC1923k abstractC1923k = (AbstractC1923k) this.f7584b;
                abstractC1923k.f7634r = 0;
                abstractC1923k.f7628l = null;
                break;
            case 1:
                ((AbstractC2974w) this.f7584b).m8650n();
                animation.removeListener(this);
                break;
            case 2:
                C4399f c4399f = (C4399f) this.f7584b;
                ArrayList arrayList = new ArrayList(c4399f.f17750E);
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((C14692c) arrayList.get(i13)).m42126a(c4399f);
                }
                break;
            case 3:
                C5053l c5053l = (C5053l) this.f7584b;
                c5053l.m15888p();
                c5053l.f21232r.start();
                break;
            case 4:
                C0352d c0352d = (C0352d) this.f7584b;
                if (((ValueAnimator) c0352d.f1238y) == animation) {
                    c0352d.f1238y = null;
                }
                break;
            case 5:
                AbstractC22676k.m65750j(animation, "animation");
                View view = (View) this.f7584b;
                AbstractC22676k.m65750j(view, "<this>");
                view.setVisibility(8);
                break;
            case 6:
                AbstractC22676k.m65750j(animation, "animation");
                ((C11412w1) this.f7584b).invoke(animation);
                break;
            case 7:
                C13574g c13574g = (C13574g) this.f7584b;
                c13574g.f47914b.setTranslationY(0.0f);
                c13574g.m38317b(0.0f);
                break;
            case 8:
            case 16:
            default:
                super.onAnimationEnd(animation);
                break;
            case 9:
                AbstractC22676k.m65750j(animation, "animation");
                AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
                C14802h c14802h = (C14802h) this.f7584b;
                animationThreadController.postOnMainThread(new C2088b(c14802h, 16));
                C14809o c14809o = c14802h.f54952y;
                if ((c14809o != null ? c14809o.f54992b : null) == animation) {
                    c14802h.f54952y = null;
                }
                break;
            case 10:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f7584b;
                sideSheetBehavior.m15776J(5);
                WeakReference weakReference = sideSheetBehavior.f21034p;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) sideSheetBehavior.f21034p.get()).requestLayout();
                    break;
                }
                break;
            case 11:
                ((HideBottomViewOnScrollBehavior) this.f7584b).f20764h = null;
                break;
            case 12:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f7584b;
                bottomSheetBehavior.m15702X(5);
                WeakReference weakReference2 = bottomSheetBehavior.f20793U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) bottomSheetBehavior.f20793U.get()).requestLayout();
                    break;
                }
                break;
            case 13:
                ((ExpandableTransformationBehavior) this.f7584b).f21368b = null;
                break;
            case 14:
                AbstractC22676k.m65750j(animation, "animation");
                ((C33029e) ((C31838r) this.f7584b).f131904e.f121230x).f137572G = false;
                animation.removeListener(this);
                break;
            case 15:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f7584b;
                actionBarOverlayLayout.f4299W = null;
                actionBarOverlayLayout.f4286J = false;
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(animation, "animation");
                ((LinearLayout) this.f7584b).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        switch (this.f7583a) {
            case 8:
                super.onAnimationRepeat(animation);
                C14707r c14707r = (C14707r) this.f7584b;
                c14707r.f54378g = (c14707r.f54378g + 1) % c14707r.f54377f.f54314c.length;
                c14707r.f54379h = true;
                break;
            case 16:
                AbstractC22676k.m65750j(animation, "animation");
                super.onAnimationRepeat(animation);
                C33031g c33031g = (C33031g) this.f7584b;
                c33031g.setObjectValues(Double.valueOf(0.0d), Double.valueOf(c33031g.f137576G));
                break;
            default:
                super.onAnimationRepeat(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        switch (this.f7583a) {
            case 0:
                AbstractC1923k abstractC1923k = (AbstractC1923k) this.f7584b;
                abstractC1923k.f7635s.m29875a(0, false);
                abstractC1923k.f7634r = 2;
                abstractC1923k.f7628l = animation;
                break;
            case 2:
                C4399f c4399f = (C4399f) this.f7584b;
                ArrayList arrayList = new ArrayList(c4399f.f17750E);
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((C14692c) arrayList.get(i13)).m42127b(c4399f);
                }
                break;
            case 6:
                AbstractC22676k.m65750j(animation, "animation");
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }
}
