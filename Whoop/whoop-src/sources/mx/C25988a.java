package mx;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.InterfaceC1756y1;
import androidx.recyclerview.widget.RecyclerView;
import e23.C12599a;
import p312lx.AbstractC24783d;

/* JADX INFO: renamed from: mx.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C25988a implements InterfaceC1756y1 {

    /* JADX INFO: renamed from: a */
    public GestureDetector f102688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C25989b f102689b;

    public C25988a(C25989b c25989b) {
        this.f102689b = c25989b;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1756y1
    /* JADX INFO: renamed from: b */
    public final boolean mo5222b(RecyclerView recyclerView, MotionEvent motionEvent) {
        View viewFindChildViewUnder;
        if (this.f102688a == null) {
            GestureDetector gestureDetector = new GestureDetector(recyclerView.getContext(), new C12599a(this, recyclerView));
            this.f102688a = gestureDetector;
            gestureDetector.setIsLongpressEnabled(true);
        }
        if (!this.f102688a.onTouchEvent(motionEvent) || (viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null) {
            return false;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindChildViewUnder);
        AbstractC24783d abstractC24783d = (AbstractC24783d) recyclerView.getChildViewHolder(viewFindChildViewUnder);
        motionEvent.getX();
        motionEvent.getY();
        C25989b c25989b = this.f102689b;
        if (!c25989b.f102690a.m77091A(childAdapterPosition)) {
            return false;
        }
        c25989b.f102690a.m77101O(childAdapterPosition, abstractC24783d);
        return false;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1756y1
    /* JADX INFO: renamed from: d */
    public final void mo5223d(boolean z4) {
    }

    @Override // androidx.recyclerview.widget.InterfaceC1756y1
    public final void onTouchEvent(MotionEvent motionEvent) {
    }
}
