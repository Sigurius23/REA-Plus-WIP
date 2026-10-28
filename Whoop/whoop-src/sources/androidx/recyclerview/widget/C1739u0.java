package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1739u0 {

    /* JADX INFO: renamed from: a */
    public boolean f6871a;

    /* JADX INFO: renamed from: b */
    public int f6872b;

    /* JADX INFO: renamed from: c */
    public int f6873c;

    /* JADX INFO: renamed from: d */
    public int f6874d;

    /* JADX INFO: renamed from: e */
    public int f6875e;

    /* JADX INFO: renamed from: f */
    public int f6876f;

    /* JADX INFO: renamed from: g */
    public int f6877g;

    /* JADX INFO: renamed from: h */
    public int f6878h;

    /* JADX INFO: renamed from: i */
    public int f6879i;

    /* JADX INFO: renamed from: j */
    public int f6880j;

    /* JADX INFO: renamed from: k */
    public List f6881k;

    /* JADX INFO: renamed from: l */
    public boolean f6882l;

    /* JADX INFO: renamed from: a */
    public final void m5328a(View view) {
        int layoutPosition;
        int size = this.f6881k.size();
        View view2 = null;
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < size; i14++) {
            View view3 = ((AbstractC1717o2) this.f6881k.get(i14)).itemView;
            C1744v1 c1744v1 = (C1744v1) view3.getLayoutParams();
            if (view3 != view && !c1744v1.f6891a.isRemoved() && (layoutPosition = (c1744v1.f6891a.getLayoutPosition() - this.f6874d) * this.f6875e) >= 0 && layoutPosition < i13) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i13 = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f6874d = -1;
        } else {
            this.f6874d = ((C1744v1) view2.getLayoutParams()).f6891a.getLayoutPosition();
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m5329b(C1668c2 c1668c2) {
        List list = this.f6881k;
        if (list == null) {
            View view = c1668c2.m5205l(this.f6874d, Long.MAX_VALUE).itemView;
            this.f6874d += this.f6875e;
            return view;
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = ((AbstractC1717o2) this.f6881k.get(i13)).itemView;
            C1744v1 c1744v1 = (C1744v1) view2.getLayoutParams();
            if (!c1744v1.f6891a.isRemoved() && this.f6874d == c1744v1.f6891a.getLayoutPosition()) {
                m5328a(view2);
                return view2;
            }
        }
        return null;
    }
}
