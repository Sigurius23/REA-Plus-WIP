package p382ou;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import io.sentry.android.replay.video.C20245d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ng3.C26702o;

/* JADX INFO: renamed from: ou.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC28359e extends AbstractC28355a {

    /* JADX INFO: renamed from: i */
    public final float f114422i;

    /* JADX INFO: renamed from: j */
    public float f114423j;

    /* JADX INFO: renamed from: k */
    public final C26702o f114424k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f114425l;

    /* JADX INFO: renamed from: m */
    public final HashMap f114426m;

    /* JADX INFO: renamed from: n */
    public PointF f114427n;

    /* JADX INFO: renamed from: o */
    public DisplayMetrics f114428o;

    public AbstractC28359e(Context context, C20245d c20245d) {
        super(context, c20245d);
        this.f114424k = new C26702o(10, false);
        this.f114425l = new ArrayList();
        this.f114426m = new HashMap();
        this.f114427n = new PointF();
        this.f114422i = ViewConfiguration.get(context).getScaledEdgeSlop();
        m86036f();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:86:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[LOOP:4: B:28:0x005d->B:88:?, LOOP_END, SYNTHETIC] */
    @Override // p382ou.AbstractC28355a
    /* JADX INFO: renamed from: a */
    public boolean mo86028a(MotionEvent motionEvent) {
        long j7;
        boolean z4;
        Iterator it;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m86036f();
        }
        int pointerCount = motionEvent.getPointerCount();
        ArrayList arrayList = this.f114425l;
        int size = arrayList.size();
        this.f114424k.getClass();
        if (size == 0) {
            j7 = 0;
        } else if (Math.abs(pointerCount - size) > 1) {
            j7 = 255;
        } else if (pointerCount > size) {
            j7 = 5;
        } else if (pointerCount < size) {
            j7 = 255;
        } else {
            j7 = ((pointerCount == 1 ? 1L : 6L) << 8) + 2;
        }
        long j13 = actionMasked;
        if (j13 == j7) {
            if (actionMasked == 2) {
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (motionEvent.findPointerIndex(((Integer) it.next()).intValue()) == -1) {
                            z4 = true;
                        }
                    }
                }
            }
            z4 = false;
        } else {
            while (true) {
                if (j7 != 0) {
                    if (j13 == (j7 & 255)) {
                        if (actionMasked == 2) {
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (motionEvent.findPointerIndex(((Integer) it.next()).intValue()) == -1) {
                                    }
                                }
                            }
                        }
                        z4 = false;
                    } else {
                        j7 >>= 8;
                    }
                }
                z4 = true;
            }
        }
        HashMap map = this.f114426m;
        if (z4) {
            if (this instanceof AbstractC28362h) {
                AbstractC28362h abstractC28362h = (AbstractC28362h) this;
                if (abstractC28362h.f114435q) {
                    abstractC28362h.mo86033i();
                }
            }
            arrayList.clear();
            map.clear();
        }
        if (!z4 || actionMasked == 0) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0 || actionMasked2 == 5) {
                arrayList.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
            } else if (actionMasked2 == 1 || actionMasked2 == 6) {
                arrayList.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
            }
        }
        int pointerCount2 = motionEvent.getPointerCount();
        float x3 = 0.0f;
        float y13 = 0.0f;
        for (int i13 = 0; i13 < pointerCount2; i13++) {
            x3 += motionEvent.getX(i13);
            y13 += motionEvent.getY(i13);
        }
        float f13 = pointerCount2;
        this.f114427n = new PointF(x3 / f13, y13 / f13);
        if (z4) {
            Log.w("MultiFingerGesture", "Some MotionEvents were not passed to the library or events from different view trees are merged.");
            return false;
        }
        if (actionMasked == 2 && arrayList.size() >= mo86031d() && this.f114403d.getPressure() / this.f114404e.getPressure() > 0.67f) {
            map.clear();
            int i14 = 0;
            while (i14 < arrayList.size() - 1) {
                int i15 = i14 + 1;
                for (int i16 = i15; i16 < arrayList.size(); i16++) {
                    Integer num = (Integer) arrayList.get(i14);
                    int iIntValue = num.intValue();
                    Integer num2 = (Integer) arrayList.get(i16);
                    int iIntValue2 = num2.intValue();
                    MotionEvent motionEvent2 = this.f114404e;
                    float x5 = motionEvent2.getX(motionEvent2.findPointerIndex(iIntValue));
                    MotionEvent motionEvent3 = this.f114404e;
                    float y14 = motionEvent3.getY(motionEvent3.findPointerIndex(iIntValue));
                    MotionEvent motionEvent4 = this.f114404e;
                    float x9 = motionEvent4.getX(motionEvent4.findPointerIndex(iIntValue2));
                    MotionEvent motionEvent5 = this.f114404e;
                    float f14 = x9 - x5;
                    float y15 = motionEvent5.getY(motionEvent5.findPointerIndex(iIntValue2)) - y14;
                    MotionEvent motionEvent6 = this.f114403d;
                    float x13 = motionEvent6.getX(motionEvent6.findPointerIndex(iIntValue));
                    MotionEvent motionEvent7 = this.f114403d;
                    float y16 = motionEvent7.getY(motionEvent7.findPointerIndex(iIntValue));
                    MotionEvent motionEvent8 = this.f114403d;
                    float x14 = motionEvent8.getX(motionEvent8.findPointerIndex(iIntValue2));
                    MotionEvent motionEvent9 = this.f114403d;
                    map.put(new C28361g(num, num2), new C28358d(f14, y15, x14 - x13, motionEvent9.getY(motionEvent9.findPointerIndex(iIntValue2)) - y16));
                }
                i14 = i15;
            }
            if (!mo86035e()) {
                return mo86030c();
            }
        }
        return false;
    }

    @Override // p382ou.AbstractC28355a
    /* JADX INFO: renamed from: b */
    public boolean mo86029b(int i13) {
        return super.mo86029b(i13) && !mo86035e();
    }

    /* JADX INFO: renamed from: c */
    public boolean mo86030c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public int mo86031d() {
        return 2;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo86035e() {
        DisplayMetrics displayMetrics = this.f114428o;
        float f13 = displayMetrics.widthPixels;
        float f14 = this.f114422i;
        float f15 = f13 - f14;
        float f16 = displayMetrics.heightPixels - f14;
        Iterator it = this.f114425l.iterator();
        while (it.hasNext()) {
            int iFindPointerIndex = this.f114403d.findPointerIndex(((Integer) it.next()).intValue());
            MotionEvent motionEvent = this.f114403d;
            float x3 = iFindPointerIndex < motionEvent.getPointerCount() ? motionEvent.getX(iFindPointerIndex) + (motionEvent.getRawX() - motionEvent.getX()) : 0.0f;
            MotionEvent motionEvent2 = this.f114403d;
            float y13 = iFindPointerIndex < motionEvent2.getPointerCount() ? motionEvent2.getY(iFindPointerIndex) + (motionEvent2.getRawY() - motionEvent2.getY()) : 0.0f;
            if (x3 < f14 || y13 < f14 || x3 > f15 || y13 > f16) {
                return true;
            }
        }
        Iterator it3 = this.f114426m.values().iterator();
        while (it3.hasNext()) {
            if (((C28358d) it3.next()).f114421e < this.f114423j) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m86036f() {
        WindowManager windowManager = this.f114401b;
        if (windowManager == null) {
            this.f114428o = this.f114400a.getResources().getDisplayMetrics();
        } else {
            this.f114428o = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(this.f114428o);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo86032g();
}
