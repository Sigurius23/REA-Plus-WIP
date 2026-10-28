package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1667c1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1740u1 f6588a;

    /* JADX INFO: renamed from: b */
    public int f6589b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public final Rect f6590c = new Rect();

    public AbstractC1667c1(AbstractC1740u1 abstractC1740u1) {
        this.f6588a = abstractC1740u1;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1667c1 m5193a(AbstractC1740u1 abstractC1740u1, int i13) {
        if (i13 == 0) {
            return new C1662b1(abstractC1740u1, 0);
        }
        if (i13 == 1) {
            return new C1662b1(abstractC1740u1, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo5178b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo5179c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo5180d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo5181e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo5182f();

    /* JADX INFO: renamed from: g */
    public abstract int mo5183g();

    /* JADX INFO: renamed from: h */
    public abstract int mo5184h();

    /* JADX INFO: renamed from: i */
    public abstract int mo5185i();

    /* JADX INFO: renamed from: j */
    public abstract int mo5186j();

    /* JADX INFO: renamed from: k */
    public abstract int mo5187k();

    /* JADX INFO: renamed from: l */
    public abstract int mo5188l();

    /* JADX INFO: renamed from: m */
    public abstract int mo5189m(View view);

    /* JADX INFO: renamed from: n */
    public abstract int mo5190n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo5191o(int i13);
}
