package mr;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import cr.AbstractC11075m;
import cr.AbstractC11080r;

/* JADX INFO: renamed from: mr.e */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC25899e implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102226w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC25906l f102227x;

    public /* synthetic */ RunnableC25899e(AbstractC25906l abstractC25906l, int i13) {
        this.f102226w = i13;
        this.f102227x = abstractC25906l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        int i13 = this.f102226w;
        AbstractC25906l abstractC25906l = this.f102227x;
        switch (i13) {
            case 0:
                AbstractC25905k abstractC25905k = abstractC25906l.f102259i;
                if (abstractC25905k != null) {
                    Context context = abstractC25906l.f102258h;
                    int i14 = AbstractC11075m.f35035d;
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = AbstractC11080r.m29876a(windowManager);
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int iHeight = rect.height();
                    int[] iArr = new int[2];
                    abstractC25905k.getLocationInWindow(iArr);
                    int height = (iHeight - (abstractC25905k.getHeight() + iArr[1])) + ((int) abstractC25905k.getTranslationY());
                    int i15 = abstractC25906l.f102268r;
                    if (height < i15) {
                        ViewGroup.LayoutParams layoutParams = abstractC25905k.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(AbstractC25906l.f102247C, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        } else {
                            int i16 = abstractC25906l.f102268r;
                            abstractC25906l.f102269s = i16;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i16 - height) + marginLayoutParams.bottomMargin;
                            abstractC25905k.requestLayout();
                        }
                    } else {
                        abstractC25906l.f102269s = i15;
                    }
                }
                break;
            case 1:
                abstractC25906l.m76613d(3);
                break;
            default:
                AbstractC25905k abstractC25905k2 = abstractC25906l.f102259i;
                if (abstractC25905k2 != null) {
                    if (abstractC25905k2.getParent() != null) {
                        abstractC25905k2.setVisibility(0);
                    }
                    if (abstractC25905k2.getAnimationMode() != 1) {
                        int height2 = abstractC25905k2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = abstractC25905k2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        abstractC25905k2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(abstractC25906l.f102255e);
                        valueAnimator.setDuration(abstractC25906l.f102253c);
                        valueAnimator.addListener(new C25897c(abstractC25906l, 0));
                        valueAnimator.addUpdateListener(new C25896b(abstractC25906l, height2));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(abstractC25906l.f102254d);
                        valueAnimatorOfFloat.addUpdateListener(new C25896b(abstractC25906l, 0, (byte) 0));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(abstractC25906l.f102256f);
                        valueAnimatorOfFloat2.addUpdateListener(new C25896b(abstractC25906l, 1, (byte) 0));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(abstractC25906l.f102251a);
                        animatorSet.addListener(new C25897c(abstractC25906l, 1));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}
