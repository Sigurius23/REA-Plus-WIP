package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.whoop.android.R;
import j93.AbstractC21478l0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1295g extends AbstractC1315l {

    /* JADX INFO: renamed from: b */
    public final boolean f5601b;

    /* JADX INFO: renamed from: c */
    public boolean f5602c;

    /* JADX INFO: renamed from: d */
    public C1344s0 f5603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1295g(C1334p2 operation, boolean z4) {
        super(operation);
        AbstractC22676k.m65750j(operation, "operation");
        this.f5601b = z4;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00f4 A[Catch: RuntimeException -> 0x00fa, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fa, blocks: (B:72:0x00ee, B:74:0x00f4), top: B:85:0x00ee }] */
    /* JADX INFO: renamed from: b */
    public final C1344s0 m4084b(Context context) {
        int enterAnim;
        C1344s0 c1344s0;
        Animator animatorLoadAnimator;
        int iM60432f0;
        if (this.f5602c) {
            return this.f5603d;
        }
        C1334p2 c1334p2 = this.f5663a;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1334p2.f5751c;
        boolean z4 = c1334p2.f5749a == 2;
        int nextTransition = abstractComponentCallbacksC1320m0.getNextTransition();
        if (this.f5601b) {
            enterAnim = z4 ? abstractComponentCallbacksC1320m0.getPopEnterAnim() : abstractComponentCallbacksC1320m0.getPopExitAnim();
        } else {
            enterAnim = z4 ? abstractComponentCallbacksC1320m0.getEnterAnim() : abstractComponentCallbacksC1320m0.getExitAnim();
        }
        abstractComponentCallbacksC1320m0.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC1320m0.mContainer;
        C1344s0 c1344s1 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC1320m0.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC1320m0.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = abstractComponentCallbacksC1320m0.onCreateAnimation(nextTransition, z4, enterAnim);
            if (animationOnCreateAnimation != null) {
                c1344s1 = new C1344s0(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = abstractComponentCallbacksC1320m0.onCreateAnimator(nextTransition, z4, enterAnim);
                if (animatorOnCreateAnimator != null) {
                    c1344s1 = new C1344s0(animatorOnCreateAnimator);
                } else {
                    if (enterAnim == 0 && nextTransition != 0) {
                        if (nextTransition == 4097) {
                            iM60432f0 = z4 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        } else if (nextTransition == 8194) {
                            iM60432f0 = z4 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                        } else if (nextTransition == 8197) {
                            iM60432f0 = z4 ? AbstractC21478l0.m60432f0(context, android.R.attr.activityCloseEnterAnimation) : AbstractC21478l0.m60432f0(context, android.R.attr.activityCloseExitAnimation);
                        } else if (nextTransition == 4099) {
                            iM60432f0 = z4 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                        } else if (nextTransition != 4100) {
                            iM60432f0 = -1;
                        } else {
                            iM60432f0 = z4 ? AbstractC21478l0.m60432f0(context, android.R.attr.activityOpenEnterAnimation) : AbstractC21478l0.m60432f0(context, android.R.attr.activityOpenExitAnimation);
                        }
                        enterAnim = iM60432f0;
                    }
                    if (enterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                        if (zEquals) {
                            try {
                                Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                if (animationLoadAnimation != null) {
                                    c1344s0 = new C1344s0(animationLoadAnimation);
                                    c1344s1 = c1344s0;
                                }
                            } catch (Resources.NotFoundException e5) {
                                throw e5;
                            } catch (RuntimeException unused) {
                                try {
                                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                    if (animatorLoadAnimator != null) {
                                        c1344s0 = new C1344s0(animatorLoadAnimator);
                                        c1344s1 = c1344s0;
                                    }
                                } catch (RuntimeException e13) {
                                    if (zEquals) {
                                        throw e13;
                                    }
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        c1344s1 = new C1344s0(animationLoadAnimation2);
                                    }
                                }
                            }
                        } else {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                            if (animatorLoadAnimator != null) {
                                c1344s0 = new C1344s0(animatorLoadAnimator);
                                c1344s1 = c1344s0;
                            }
                        }
                    }
                }
            }
        }
        this.f5603d = c1344s1;
        this.f5602c = true;
        return c1344s1;
    }
}
