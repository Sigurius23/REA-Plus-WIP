package p382ou;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.mapbox.maps.ScreenCoordinate;
import m83.AbstractC25265s;
import p157fv.C14802h;
import p157fv.InterfaceC14795a;
import p383ov.C28388j;
import p383ov.C28393o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ou.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C28360f extends AbstractC28359e {

    /* JADX INFO: renamed from: p */
    public long f114429p;

    /* JADX INFO: renamed from: q */
    public float f114430q;

    /* JADX INFO: renamed from: r */
    public boolean f114431r;

    /* JADX INFO: renamed from: s */
    public boolean f114432s;

    /* JADX INFO: renamed from: t */
    public int f114433t;

    @Override // p382ou.AbstractC28359e, p382ou.AbstractC28355a
    /* JADX INFO: renamed from: a */
    public final boolean mo86028a(MotionEvent motionEvent) {
        super.mo86028a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        boolean z13 = true;
        if (actionMasked == 1) {
            if (mo86029b(4)) {
                C28388j c28388j = (C28388j) this.f114407h;
                int i13 = this.f114433t;
                c28388j.getClass();
                C28393o c28393o = c28388j.f114502a;
                if (c28393o.f114558u0.f120663H && i13 == 2) {
                    InterfaceC14795a interfaceC14795a = c28393o.f114522K;
                    if (interfaceC14795a == null) {
                        AbstractC22676k.m65757q("cameraAnimationsPlugin");
                        throw null;
                    }
                    ((C14802h) interfaceC14795a).m42548b(AbstractC25265s.m74093D1(c28393o.f114523L));
                    ScreenCoordinate screenCoordinate = c28393o.f114558u0.f120665J;
                    if (screenCoordinate != null) {
                        c28393o.m86080l(false, screenCoordinate);
                    } else {
                        PointF pointF = this.f114427n;
                        c28393o.m86080l(false, new ScreenCoordinate(pointF.x, pointF.y));
                    }
                    z4 = true;
                }
            }
            mo86032g();
            return z4;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (this.f114432s) {
                    this.f114431r = true;
                }
                this.f114433t = this.f114425l.size();
                return false;
            }
            if (actionMasked == 6) {
                this.f114432s = true;
                return false;
            }
        } else if (!this.f114431r) {
            for (C28358d c28358d : this.f114426m.values()) {
                float fAbs = Math.abs(c28358d.f114419c - c28358d.f114417a);
                float fAbs2 = Math.abs(c28358d.f114420d - c28358d.f114418b);
                float f13 = this.f114430q;
                boolean z14 = fAbs > f13 || fAbs2 > f13;
                this.f114431r = z14;
                if (z14) {
                    this.f114431r = z13;
                    return false;
                }
            }
            z13 = false;
            this.f114431r = z13;
            return false;
        }
        return false;
    }

    @Override // p382ou.AbstractC28359e, p382ou.AbstractC28355a
    /* JADX INFO: renamed from: b */
    public final boolean mo86029b(int i13) {
        return this.f114433t > 1 && !this.f114431r && this.f114405f < this.f114429p && super.mo86029b(4);
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: g */
    public final void mo86032g() {
        this.f114433t = 0;
        this.f114431r = false;
        this.f114432s = false;
    }
}
