package p157fv;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.mapbox.maps.threading.AnimationThreadController;
import java.util.Iterator;
import kr.C22788g;
import la.C23548b;
import p000.AbstractC11266d;
import p127ev.C13667h;
import p176gv.AbstractC16218d;
import p314m.C24855n0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fv.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C14796b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f54917b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f54918c;

    public /* synthetic */ C14796b(int i13, Object obj, Object obj2) {
        this.f54916a = i13;
        this.f54917b = obj;
        this.f54918c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        int i13 = this.f54916a;
        Object obj = this.f54918c;
        Object obj2 = this.f54917b;
        switch (i13) {
            case 0:
                AbstractC16218d animator = (AbstractC16218d) obj;
                AbstractC22676k.m65750j(animator, "$animator");
                AbstractC22676k.m65750j(it, "it");
                AnimationThreadController.INSTANCE.postOnMainThread(new C13667h((C14802h) obj2, animator, it, 1));
                return;
            case 1:
                ((View) ((C24855n0) ((C23548b) obj2).f93280x).f97356d.getParent()).invalidate();
                return;
            default:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i14 = AppBarLayout.f20678c0;
                float fFloatValue = ((Float) it.getAnimatedValue()).floatValue();
                ((C22788g) obj).m66010l(fFloatValue);
                Drawable drawable = appBarLayout.f20696V;
                if (drawable instanceof C22788g) {
                    ((C22788g) drawable).m66010l(fFloatValue);
                }
                Iterator it3 = appBarLayout.f20692R.iterator();
                if (it3.hasNext()) {
                    throw AbstractC11266d.m30454h(it3);
                }
                return;
        }
    }
}
