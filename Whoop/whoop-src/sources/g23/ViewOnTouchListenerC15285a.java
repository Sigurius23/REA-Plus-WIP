package g23;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import androidx.room.C1836v0;
import ar.C1916d;
import m23.C24967a;
import p077d0.C11412w1;
import p087db.C11845e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC15285a implements View.OnTouchListener {

    /* JADX INFO: renamed from: E */
    public final int f57422E;

    /* JADX INFO: renamed from: F */
    public boolean f57423F;

    /* JADX INFO: renamed from: G */
    public float f57424G;

    /* JADX INFO: renamed from: w */
    public final View f57425w;

    /* JADX INFO: renamed from: x */
    public final C24967a f57426x;

    /* JADX INFO: renamed from: y */
    public final C1836v0 f57427y;

    /* JADX INFO: renamed from: z */
    public final C24967a f57428z;

    public ViewOnTouchListenerC15285a(View swipeView, C24967a c24967a, C1836v0 c1836v0, C24967a c24967a2) {
        AbstractC22676k.m65750j(swipeView, "swipeView");
        this.f57425w = swipeView;
        this.f57426x = c24967a;
        this.f57427y = c1836v0;
        this.f57428z = c24967a2;
        this.f57422E = swipeView.getHeight() / 4;
    }

    /* JADX INFO: renamed from: a */
    public final void m43400a(float f13) {
        ViewPropertyAnimator updateListener = this.f57425w.animate().translationY(f13).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setUpdateListener(new C11845e(this, 1));
        AbstractC22676k.m65749i(updateListener, "setUpdateListener(...)");
        ViewPropertyAnimator listener = updateListener.setListener(new C1916d(new C11412w1(f13, this, 3), 6));
        AbstractC22676k.m65749i(listener, "setListener(...)");
        listener.start();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v13, MotionEvent event) {
        int height;
        float f13;
        AbstractC22676k.m65750j(v13, "v");
        AbstractC22676k.m65750j(event, "event");
        int action = event.getAction();
        View view = this.f57425w;
        if (action == 0) {
            Rect rect = new Rect();
            if (view != null) {
                view.getHitRect(rect);
            }
            if (rect.contains((int) event.getX(), (int) event.getY())) {
                this.f57423F = true;
            }
            this.f57424G = event.getY();
            return true;
        }
        int i13 = this.f57422E;
        if (action == 1) {
            if (this.f57423F) {
                this.f57423F = false;
                height = v13.getHeight();
                if (view.getTranslationY() < (-i13)) {
                    f13 = -height;
                } else if (view.getTranslationY() > i13) {
                    f13 = height;
                } else {
                    f13 = 0.0f;
                }
                if (f13 != 0.0f && !((Boolean) this.f57428z.invoke()).booleanValue()) {
                    this.f57426x.invoke();
                    return true;
                }
                m43400a(f13);
            }
        } else if (action != 2) {
            if (action != 3) {
                return false;
            }
            if (this.f57423F) {
                this.f57423F = false;
                height = v13.getHeight();
                if (view.getTranslationY() < (-i13)) {
                    f13 = -height;
                } else if (view.getTranslationY() > i13) {
                    f13 = height;
                } else {
                    f13 = 0.0f;
                }
                if (f13 != 0.0f) {
                    this.f57426x.invoke();
                    return true;
                }
                m43400a(f13);
            }
        } else if (this.f57423F) {
            float y13 = event.getY() - this.f57424G;
            view.setTranslationY(y13);
            this.f57427y.invoke(Float.valueOf(y13), Integer.valueOf(i13));
            return true;
        }
        return true;
    }
}
