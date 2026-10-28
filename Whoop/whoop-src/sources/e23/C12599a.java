package e23;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import m23.C24968b;
import mx.C25988a;
import p312lx.AbstractC24783d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12599a extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42991w = 0;

    /* JADX INFO: renamed from: x */
    public final Object f42992x;

    /* JADX INFO: renamed from: y */
    public final Object f42993y;

    public C12599a(C24968b c24968b, C24968b c24968b2) {
        this.f42992x = c24968b;
        this.f42993y = c24968b2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent event) {
        switch (this.f42991w) {
            case 0:
                AbstractC22676k.m65750j(event, "event");
                C24968b c24968b = (C24968b) this.f42993y;
                if (c24968b == null) {
                    return false;
                }
                c24968b.invoke(event);
                return Boolean.FALSE.booleanValue();
            default:
                return super.onDoubleTap(event);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        switch (this.f42991w) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f42992x;
                View viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if (viewFindChildViewUnder != null) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindChildViewUnder);
                    AbstractC24783d abstractC24783d = (AbstractC24783d) recyclerView.getChildViewHolder(viewFindChildViewUnder);
                    C25988a c25988a = (C25988a) this.f42993y;
                    motionEvent.getX();
                    motionEvent.getY();
                    c25988a.f102689b.f102690a.m77102P(childAdapterPosition, abstractC24783d);
                }
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent event) {
        switch (this.f42991w) {
            case 0:
                AbstractC22676k.m65750j(event, "event");
                C24968b c24968b = (C24968b) this.f42992x;
                if (c24968b == null) {
                    return false;
                }
                c24968b.invoke(event);
                return Boolean.FALSE.booleanValue();
            default:
                return super.onSingleTapConfirmed(event);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f42991w) {
            case 1:
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }

    public C12599a(C25988a c25988a, RecyclerView recyclerView) {
        this.f42993y = c25988a;
        this.f42992x = recyclerView;
    }
}
