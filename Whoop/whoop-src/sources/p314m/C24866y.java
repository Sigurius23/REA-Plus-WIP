package p314m;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p408q.C29660d;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: m.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C24866y extends ContentFrameLayout {

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ LayoutInflaterFactory2C24829a0 f97399I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24866y(LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0, C29660d c29660d) {
        super(c29660d, null);
        this.f97399I = layoutInflaterFactory2C24829a0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f97399I.m72811z(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x3 = (int) motionEvent.getX();
            int y13 = (int) motionEvent.getY();
            if (x3 < -5 || y13 < -5 || x3 > getWidth() + 5 || y13 > getHeight() + 5) {
                LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = this.f97399I;
                layoutInflaterFactory2C24829a0.m72810x(layoutInflaterFactory2C24829a0.m72786D(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i13) {
        setBackgroundDrawable(AbstractC30060g.m92133x(getContext(), i13));
    }
}
