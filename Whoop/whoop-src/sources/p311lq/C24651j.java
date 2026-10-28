package p311lq;

import android.view.View;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: lq.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C24651j {

    /* JADX INFO: renamed from: a */
    public final View f96417a;

    /* JADX INFO: renamed from: b */
    public int f96418b;

    /* JADX INFO: renamed from: c */
    public int f96419c;

    /* JADX INFO: renamed from: d */
    public int f96420d;

    public C24651j(View view) {
        this.f96417a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m72003a() {
        int i13 = this.f96420d;
        View view = this.f96417a;
        int top = i13 - (view.getTop() - this.f96418b);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f96419c));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m72004b(int i13) {
        if (this.f96420d == i13) {
            return false;
        }
        this.f96420d = i13;
        m72003a();
        return true;
    }
}
