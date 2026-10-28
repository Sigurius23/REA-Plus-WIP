package p382ou;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import io.sentry.android.replay.video.C20245d;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: ou.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC28362h extends AbstractC28359e {

    /* JADX INFO: renamed from: p */
    public final Set f114434p;

    /* JADX INFO: renamed from: q */
    public boolean f114435q;

    /* JADX INFO: renamed from: r */
    public boolean f114436r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f114437s;

    /* JADX INFO: renamed from: t */
    public float f114438t;

    /* JADX INFO: renamed from: u */
    public float f114439u;

    public AbstractC28362h(Context context, C20245d c20245d) {
        super(context, c20245d);
        this.f114434p = mo86034j();
    }

    @Override // p382ou.AbstractC28359e, p382ou.AbstractC28355a
    /* JADX INFO: renamed from: a */
    public boolean mo86028a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5 || actionMasked == 6 || actionMasked == 3) {
            mo86032g();
        }
        if (this.f114436r) {
            this.f114436r = false;
            mo86032g();
            mo86033i();
        }
        VelocityTracker velocityTracker = this.f114437s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(this.f114403d);
        }
        boolean zMo86028a = super.mo86028a(motionEvent);
        if (actionMasked == 1 || actionMasked == 6) {
            if (this.f114425l.size() < mo86031d() && this.f114435q) {
                mo86033i();
                return true;
            }
        } else if (actionMasked == 3 && this.f114435q) {
            mo86033i();
            return true;
        }
        return zMo86028a;
    }

    /* JADX INFO: renamed from: h */
    public final void m86037h() {
        this.f114435q = true;
        if (this.f114437s == null) {
            this.f114437s = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo86033i() {
        this.f114435q = false;
        VelocityTracker velocityTracker = this.f114437s;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
            this.f114438t = this.f114437s.getXVelocity();
            this.f114439u = this.f114437s.getYVelocity();
            this.f114437s.recycle();
            this.f114437s = null;
        }
        mo86032g();
    }

    /* JADX INFO: renamed from: j */
    public abstract HashSet mo86034j();
}
