package p382ou;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.ScreenCoordinate;
import io.sentry.android.replay.video.C20245d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import mv.InterfaceC25964c;
import p383ov.C28383e;
import p383ov.C28393o;

/* JADX INFO: renamed from: ou.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C28357c extends AbstractC28362h {

    /* JADX INFO: renamed from: y */
    public static final HashSet f114413y;

    /* JADX INFO: renamed from: v */
    public PointF f114414v;

    /* JADX INFO: renamed from: w */
    public boolean f114415w;

    /* JADX INFO: renamed from: x */
    public final HashMap f114416x;

    static {
        HashSet hashSet = new HashSet();
        f114413y = hashSet;
        hashSet.add(13);
    }

    public C28357c(Context context, C20245d c20245d) {
        super(context, c20245d);
        this.f114416x = new HashMap();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    @Override // p382ou.AbstractC28362h, p382ou.AbstractC28359e, p382ou.AbstractC28355a
    /* JADX INFO: renamed from: a */
    public final boolean mo86028a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        HashMap map = this.f114416x;
        if (actionMasked == 0) {
            this.f114415w = true;
            map.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new C28356b(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        } else if (actionMasked == 1 || actionMasked == 3) {
            map.clear();
        } else if (actionMasked == 5) {
            this.f114415w = true;
            map.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new C28356b(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        } else if (actionMasked == 6) {
            this.f114415w = true;
            map.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        }
        return super.mo86028a(motionEvent);
    }

    @Override // p382ou.AbstractC28359e, p382ou.AbstractC28355a
    /* JADX INFO: renamed from: b */
    public final boolean mo86029b(int i13) {
        if (!super.mo86029b(13)) {
            return false;
        }
        Iterator it = this.f114416x.values().iterator();
        if (!it.hasNext()) {
            return false;
        }
        C28356b c28356b = (C28356b) it.next();
        return Math.abs(c28356b.f114411d) >= 0.0f || Math.abs(c28356b.f114412e) >= 0.0f;
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: c */
    public final boolean mo86030c() {
        for (Integer num : this.f114425l) {
            int iIntValue = num.intValue();
            C28356b c28356b = (C28356b) this.f114416x.get(num);
            MotionEvent motionEvent = this.f114403d;
            float x3 = motionEvent.getX(motionEvent.findPointerIndex(iIntValue));
            MotionEvent motionEvent2 = this.f114403d;
            float y13 = motionEvent2.getY(motionEvent2.findPointerIndex(iIntValue));
            float f13 = c28356b.f114410c;
            c28356b.f114410c = x3;
            c28356b.f114411d = c28356b.f114408a - x3;
            c28356b.f114412e = c28356b.f114409b - y13;
        }
        if (this.f114435q) {
            PointF pointF = this.f114427n;
            PointF pointF2 = this.f114414v;
            float f14 = pointF2.x - pointF.x;
            float f15 = pointF2.y - pointF.y;
            this.f114414v = pointF;
            if (!this.f114415w) {
                ((C28383e) this.f114407h).m86075a(this, f14, f15);
                return false;
            }
            this.f114415w = false;
            ((C28383e) this.f114407h).m86075a(this, 0.0f, 0.0f);
            return false;
        }
        if (mo86029b(13)) {
            C28383e c28383e = (C28383e) this.f114407h;
            c28383e.getClass();
            C28357c c28357c = c28383e.f114495a;
            if (c28357c == null || c28357c != this) {
                c28383e.f114495a = this;
            }
            C28393o c28393o = c28383e.f114496b;
            if (c28393o.f114558u0.f120675y) {
                InterfaceC25964c interfaceC25964cM86079k = c28393o.m86079k();
                PlatformEventType platformEventType = PlatformEventType.DRAG_BEGIN;
                PointF pointF3 = this.f114427n;
                interfaceC25964cM86079k.dispatch(new PlatformEventInfo(platformEventType, new ScreenCoordinate(pointF3.x, pointF3.y)));
                m86037h();
                this.f114414v = this.f114427n;
                this.f114415w = false;
                return true;
            }
        }
        return false;
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: d */
    public final int mo86031d() {
        return 1;
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: g */
    public final void mo86032g() {
    }

    @Override // p382ou.AbstractC28362h
    /* JADX INFO: renamed from: i */
    public final void mo86033i() {
        super.mo86033i();
        C28383e c28383e = (C28383e) this.f114407h;
        c28383e.getClass();
        InterfaceC25964c interfaceC25964cM86079k = c28383e.f114496b.m86079k();
        PlatformEventType platformEventType = PlatformEventType.DRAG_END;
        PointF pointF = this.f114427n;
        interfaceC25964cM86079k.dispatch(new PlatformEventInfo(platformEventType, new ScreenCoordinate(pointF.x, pointF.y)));
    }

    @Override // p382ou.AbstractC28362h
    /* JADX INFO: renamed from: j */
    public final HashSet mo86034j() {
        return f114413y;
    }
}
