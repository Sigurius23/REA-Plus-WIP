package p382ou;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashSet;
import nh3.AbstractC26725a;

/* JADX INFO: renamed from: ou.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C28365k extends AbstractC28362h {

    /* JADX INFO: renamed from: y */
    public static final HashSet f114448y;

    /* JADX INFO: renamed from: v */
    public float f114449v;

    /* JADX INFO: renamed from: w */
    public float f114450w;

    /* JADX INFO: renamed from: x */
    public float f114451x;

    static {
        HashSet hashSet = new HashSet();
        f114448y = hashSet;
        hashSet.add(14);
    }

    @Override // p382ou.AbstractC28359e, p382ou.AbstractC28355a
    /* JADX INFO: renamed from: b */
    public final boolean mo86029b(int i13) {
        return Math.abs(this.f114451x) >= this.f114450w && super.mo86029b(14);
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: c */
    public final boolean mo86030c() {
        MotionEvent motionEvent = this.f114404e;
        ArrayList arrayList = this.f114425l;
        float x3 = motionEvent.getX(motionEvent.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent2 = this.f114404e;
        float x5 = (motionEvent2.getX(motionEvent2.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + x3) / 2.0f;
        MotionEvent motionEvent3 = this.f114403d;
        float x9 = motionEvent3.getX(motionEvent3.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent4 = this.f114403d;
        float x13 = ((motionEvent4.getX(motionEvent4.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + x9) / 2.0f) - x5;
        this.f114451x += x13;
        if (this.f114435q && x13 != 0.0f) {
            throw AbstractC26725a.m79500d(this.f114407h);
        }
        if (mo86029b(14)) {
            throw AbstractC26725a.m79500d(this.f114407h);
        }
        return false;
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: e */
    public final boolean mo86035e() {
        if (!super.mo86035e()) {
            ArrayList arrayList = this.f114425l;
            C28358d c28358d = (C28358d) this.f114426m.get(new C28361g((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
            if (Math.abs(Math.toDegrees(Math.abs(Math.atan2(c28358d.f114420d, c28358d.f114419c))) - 90.0d) <= this.f114449v) {
                return false;
            }
        }
        return true;
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: g */
    public final void mo86032g() {
        this.f114451x = 0.0f;
    }

    @Override // p382ou.AbstractC28362h
    /* JADX INFO: renamed from: i */
    public final void mo86033i() {
        super.mo86033i();
        throw AbstractC26725a.m79500d(this.f114407h);
    }

    @Override // p382ou.AbstractC28362h
    /* JADX INFO: renamed from: j */
    public final HashSet mo86034j() {
        return f114448y;
    }
}
