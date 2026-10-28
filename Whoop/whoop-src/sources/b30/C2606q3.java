package b30;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.mapbox.maps.MapboxCameraAnimationException;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.threading.AnimationThreadController;
import j93.InterfaceC21493z;
import java.util.LinkedHashSet;
import p003a1.C0111j;
import p108e4.AbstractC12682p;
import p114eb.C12986s;
import p157fv.C14796b;
import p157fv.C14799e;
import p157fv.C14802h;
import p157fv.EnumC14804j;
import p176gv.AbstractC16218d;
import p289kv.C22839b;
import p289kv.C22841d;
import p289kv.InterfaceC22838a;
import p694zv.C41160a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.q3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2606q3 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10157a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10158b;

    public /* synthetic */ C2606q3(Object obj, int i13) {
        this.f10157a = i13;
        this.f10158b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final void m7516a(C2606q3 c2606q3, Animator animator, int i13) {
        AbstractC16218d abstractC16218d = animator instanceof AbstractC16218d ? (AbstractC16218d) animator : null;
        if (abstractC16218d == null) {
            throw new MapboxCameraAnimationException("Could not finish animation as it must be an instance of CameraAnimator and not null!");
        }
        C14802h c14802h = (C14802h) c2606q3.f10158b;
        LinkedHashSet linkedHashSet = c14802h.f54951x;
        int i14 = 1;
        boolean z4 = false;
        if (abstractC16218d.f61608K) {
            AnimationThreadController.INSTANCE.postOnMainThread(new C12986s(new ValueAnimator[]{abstractC16218d}, c14802h, z4, i14));
        }
        if (abstractC16218d.f61609L) {
            return;
        }
        linkedHashSet.remove(animator);
        if (linkedHashSet.isEmpty()) {
            MapboxMap mapboxMap = c14802h.f54947T;
            if (mapboxMap == null) {
                AbstractC22676k.m65757q("mapTransformDelegate");
                throw null;
            }
            mapboxMap.setUserAnimationInProgress(false);
        }
        for (C41160a c41160a : c14802h.f54937J) {
            int iM35485e = AbstractC12682p.m35485e(i13);
            if (iM35485e == 0) {
                EnumC14804j type = abstractC16218d.mo45908k();
                c41160a.getClass();
                AbstractC22676k.m65750j(type, "type");
            } else if (iM35485e == 1) {
                EnumC14804j type2 = abstractC16218d.mo45908k();
                c41160a.getClass();
                AbstractC22676k.m65750j(type2, "type");
            }
        }
        if (linkedHashSet.isEmpty()) {
            c14802h.m42549e();
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m7517b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m7518c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m7519d(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f10157a) {
            case 0:
                break;
            case 1:
                AbstractC22676k.m65750j(animation, "animation");
                AnimationThreadController.INSTANCE.postOnMainThread(new C14799e(this, animation, 0));
                break;
            default:
                AbstractC22676k.m65750j(animation, "animator");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f10157a) {
            case 0:
                ((C0111j) this.f10158b).invoke();
                return;
            case 1:
                AbstractC22676k.m65750j(animation, "animation");
                AnimationThreadController.INSTANCE.postOnMainThread(new C14799e(this, animation, 1));
                return;
            default:
                AbstractC22676k.m65750j(animation, "animator");
                InterfaceC22838a interfaceC22838a = ((C22841d) this.f10158b).f90053y;
                if (interfaceC22838a != null) {
                    ((C22839b) interfaceC22838a).setCompassVisible(false);
                    return;
                } else {
                    AbstractC22676k.m65757q("compassView");
                    throw null;
                }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        String str;
        switch (this.f10157a) {
            case 0:
                return;
            case 1:
                str = "animation";
                break;
            default:
                str = "animator";
                break;
        }
        AbstractC22676k.m65750j(animator, str);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f10157a) {
            case 0:
                break;
            case 1:
                AbstractC22676k.m65750j(animation, "animation");
                AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
                if (animationThreadController.getUsingBackgroundThread() && animation.getDuration() == 0) {
                    C14802h c14802h = (C14802h) this.f10158b;
                    AbstractC16218d abstractC16218d = (AbstractC16218d) animation;
                    InterfaceC21493z[] interfaceC21493zArr = C14802h.f54931W;
                    abstractC16218d.m45918j(new C14796b(0, c14802h, abstractC16218d));
                }
                animationThreadController.postOnMainThread(new C14799e(this, animation, 2));
                break;
            default:
                AbstractC22676k.m65750j(animation, "animator");
                break;
        }
    }
}
