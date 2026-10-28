package mr;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;
import la.C23548b;
import p184h5.AbstractC16901p0;
import p413q4.C29960e;
import p429ql.C30460f;

/* JADX INFO: renamed from: mr.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C25898d implements Handler.Callback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102225w;

    public /* synthetic */ C25898d(int i13) {
        this.f102225w = i13;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i13 = 1;
        int height = 0;
        switch (this.f102225w) {
            case 0:
                int i14 = message.what;
                if (i14 != 0) {
                    if (i14 != 1) {
                        return false;
                    }
                    AbstractC25906l abstractC25906l = (AbstractC25906l) message.obj;
                    int i15 = message.arg1;
                    AbstractC25905k abstractC25905k = abstractC25906l.f102259i;
                    AccessibilityManager accessibilityManager = abstractC25906l.f102272v;
                    if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || abstractC25905k.getVisibility() != 0) {
                        abstractC25906l.m76613d(i15);
                        return true;
                    }
                    if (abstractC25905k.getAnimationMode() == 1) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.setInterpolator(abstractC25906l.f102254d);
                        valueAnimatorOfFloat.addUpdateListener(new C25896b(abstractC25906l, 0, (byte) 0));
                        valueAnimatorOfFloat.setDuration(abstractC25906l.f102252b);
                        valueAnimatorOfFloat.addListener(new C25895a(abstractC25906l, i15, height));
                        valueAnimatorOfFloat.start();
                        return true;
                    }
                    ValueAnimator valueAnimator = new ValueAnimator();
                    AbstractC25905k abstractC25905k2 = abstractC25906l.f102259i;
                    int height2 = abstractC25905k2.getHeight();
                    ViewGroup.LayoutParams layoutParams = abstractC25905k2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        height2 += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    valueAnimator.setIntValues(0, height2);
                    valueAnimator.setInterpolator(abstractC25906l.f102255e);
                    valueAnimator.setDuration(abstractC25906l.f102253c);
                    valueAnimator.addListener(new C25895a(abstractC25906l, i15, i13));
                    valueAnimator.addUpdateListener(new C25896b(abstractC25906l, 3, (byte) 0));
                    valueAnimator.start();
                    return true;
                }
                AbstractC25906l abstractC25906l2 = (AbstractC25906l) message.obj;
                AbstractC25905k abstractC25905k3 = abstractC25906l2.f102259i;
                ViewGroup viewGroup = abstractC25906l2.f102257g;
                if (abstractC25905k3.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams2 = abstractC25905k3.getLayoutParams();
                    if (layoutParams2 instanceof C29960e) {
                        C29960e c29960e = (C29960e) layoutParams2;
                        BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                        C23548b c23548b = baseTransientBottomBar$Behavior.f21042i;
                        c23548b.getClass();
                        c23548b.f93280x = abstractC25906l2.f102273w;
                        baseTransientBottomBar$Behavior.f20766b = new C25900f(abstractC25906l2);
                        c29960e.m91654b(baseTransientBottomBar$Behavior);
                        if (abstractC25906l2.m76611b() == null) {
                            c29960e.f122370g = 80;
                        }
                    }
                    abstractC25905k3.f102240K = true;
                    viewGroup.addView(abstractC25905k3);
                    abstractC25905k3.f102240K = false;
                    if (abstractC25906l2.m76611b() != null) {
                        int[] iArr = new int[2];
                        abstractC25906l2.m76611b().getLocationOnScreen(iArr);
                        int i16 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        height = (viewGroup.getHeight() + iArr2[1]) - i16;
                    }
                    abstractC25906l2.f102267q = height;
                    abstractC25906l2.m76616g();
                    abstractC25905k3.setVisibility(4);
                }
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                if (abstractC25905k3.isLaidOut()) {
                    abstractC25906l2.m76615f();
                    return true;
                }
                abstractC25906l2.f102270t = true;
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                C30460f c30460f = (C30460f) message.obj;
                c30460f.f125169z.m15547k(c30460f);
                return true;
        }
    }
}
