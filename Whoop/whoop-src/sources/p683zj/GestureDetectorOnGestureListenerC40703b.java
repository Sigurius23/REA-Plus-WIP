package p683zj;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import bc3.AbstractC3006f0;
import fk.InterfaceC14544a;
import java.lang.ref.WeakReference;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p120ek.C13270d;
import p33.C28820m;
import p617xj.C38330b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: zj.b */
/* JADX INFO: loaded from: classes6.dex */
public final class GestureDetectorOnGestureListenerC40703b implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: w */
    public final C13270d f175608w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC14544a f175609x;

    /* JADX INFO: renamed from: y */
    public final List f175610y;

    /* JADX INFO: renamed from: z */
    public final WeakReference f175611z;

    public GestureDetectorOnGestureListenerC40703b(Activity activity, C13270d c13270d, InterfaceC14544a logger, List viewTargetLocators) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(viewTargetLocators, "viewTargetLocators");
        this.f175608w = c13270d;
        this.f175609x = logger;
        this.f175610y = viewTargetLocators;
        this.f175611z = new WeakReference(activity);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e5) {
        AbstractC22676k.m65750j(e5, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e5, float f13, float f14) {
        AbstractC22676k.m65750j(e5, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e5) {
        AbstractC22676k.m65750j(e5, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e5, float f13, float f14) {
        AbstractC22676k.m65750j(e5, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e5) {
        AbstractC22676k.m65750j(e5, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e5) {
        Window window;
        View decorView;
        CharSequence charSequenceLoadLabel;
        String string;
        AbstractC22676k.m65750j(e5, "e");
        WeakReference weakReference = this.f175611z;
        Activity activity = (Activity) weakReference.get();
        InterfaceC14544a logger = this.f175609x;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            logger.error("DecorView is null in onSingleTapUp()");
            return false;
        }
        C23465k c23465k = new C23465k(Float.valueOf(e5.getX()), Float.valueOf(e5.getY()));
        List viewTargetLocators = this.f175610y;
        AbstractC22676k.m65750j(viewTargetLocators, "viewTargetLocators");
        AbstractC22676k.m65750j(logger, "logger");
        C38330b c38330b = (C38330b) AbstractC3006f0.m8699E(C30064k.f122676w, new C28820m(decorView, logger, c23465k, viewTargetLocators, null, 15));
        if (c38330b == null) {
            logger.warn("Unable to find click target. No event captured.");
            return false;
        }
        C23465k c23465k2 = new C23465k("[Amplitude] Action", "touch");
        C23465k c23465k3 = new C23465k("[Amplitude] Target Class", c38330b.f164243b);
        C23465k c23465k4 = new C23465k("[Amplitude] Target Resource", c38330b.f164244c);
        C23465k c23465k5 = new C23465k("[Amplitude] Target Tag", c38330b.f164245d);
        C23465k c23465k6 = new C23465k("[Amplitude] Target Text", c38330b.f164246e);
        C23465k c23465k7 = new C23465k("[Amplitude] Target Source", AbstractC25265s.m74110N0(AbstractC39414r.m125906y0(AbstractC39421y.m125926K(c38330b.f164247f, "_", " ", false), new String[]{" "}, 6), " ", null, null, C40702a.f175607w, 30));
        C23465k c23465k8 = new C23465k("[Amplitude] Hierarchy", c38330b.f164248g);
        String str = null;
        try {
            Activity activity2 = (Activity) weakReference.get();
            if (activity2 != null) {
                PackageManager packageManager = activity2.getPackageManager();
                ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(activity2.getComponentName(), 128) : null;
                if (activityInfo != null && (charSequenceLoadLabel = activityInfo.loadLabel(packageManager)) != null && (string = charSequenceLoadLabel.toString()) != null) {
                    str = string;
                } else if (activityInfo != null) {
                    str = activityInfo.name;
                }
            }
        } catch (Exception e13) {
            logger.error("Error getting screen name: " + e13);
        }
        this.f175608w.invoke("[Amplitude] Element Interacted", AbstractC25247g0.m73990Y(c23465k2, c23465k3, c23465k4, c23465k5, c23465k6, c23465k7, c23465k8, new C23465k("[Amplitude] Screen Name", str)));
        return false;
    }
}
