package gn2;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import in2.AbstractC18738j;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: gn2.d */
/* JADX INFO: loaded from: classes10.dex */
public class C16008d extends StateListDrawable {

    /* JADX INFO: renamed from: E */
    private float f60590E;

    /* JADX INFO: renamed from: F */
    private int f60591F;

    /* JADX INFO: renamed from: G */
    private float f60592G;

    /* JADX INFO: renamed from: H */
    private boolean f60593H;

    /* JADX INFO: renamed from: I */
    private boolean f60594I;

    /* JADX INFO: renamed from: w */
    private C16007c f60595w;

    /* JADX INFO: renamed from: x */
    private C16005a f60596x;

    /* JADX INFO: renamed from: y */
    private C16005a f60597y;

    /* JADX INFO: renamed from: z */
    private int f60598z;

    public C16008d(Context context) {
        this(context, true);
    }

    /* JADX INFO: renamed from: a */
    private void m45313a() {
        if (this.f60593H) {
            addState(new int[]{R.attr.state_pressed}, this.f60596x);
        }
        addState(new int[]{R.attr.state_focused}, this.f60596x);
        addState(new int[]{R.attr.state_enabled}, this.f60595w);
        addState(new int[0], this.f60597y);
    }

    /* JADX INFO: renamed from: e */
    private void m45314e(boolean z4) {
        this.f60593H = z4;
    }

    /* JADX INFO: renamed from: b */
    public void m45315b(int i13) {
        this.f60598z = i13;
        this.f60596x.m45300a(i13);
        this.f60595w.m45308f(i13);
        this.f60597y.m45300a(i13);
        invalidateDrawable(this.f60596x);
        invalidateDrawable(this.f60595w);
        invalidateDrawable(this.f60597y);
        m45313a();
    }

    /* JADX INFO: renamed from: c */
    public void m45316c(float f13) {
        this.f60592G = f13;
        m45317d(this.f60591F);
    }

    /* JADX INFO: renamed from: d */
    public void m45317d(int i13) {
        this.f60591F = i13;
        this.f60595w.m45310h(i13);
        if (this.f60594I) {
            this.f60595w.m45309g(AbstractC18738j.m54484b(this.f60592G, i13));
        } else {
            this.f60595w.m45309g(Color.argb((int) (this.f60592G * 255.0f), Color.red(i13), Color.green(i13), Color.blue(i13)));
        }
        this.f60596x.m45301b(i13);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: f */
    public void m45318f(int i13) {
        this.f60595w.m45310h(i13);
    }

    /* JADX INFO: renamed from: g */
    public void m45319g(boolean z4) {
        this.f60595w.m45311i(z4);
        this.f60596x.setAlpha(!z4 ? 1 : 0);
        this.f60597y.setAlpha(!z4 ? 1 : 0);
    }

    /* JADX INFO: renamed from: h */
    public void m45320h(float f13) {
        this.f60590E = f13;
        this.f60595w.m45312j(f13);
    }

    /* JADX INFO: renamed from: i */
    public void m45321i(boolean z4) {
        this.f60594I = z4;
        m45317d(this.f60591F);
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        m45315b(rect.height());
        super.onBoundsChange(rect);
    }

    public C16008d(Context context, boolean z4) {
        this.f60592G = 0.2f;
        this.f60593H = true;
        this.f60594I = true;
        this.f60595w = new C16007c();
        this.f60596x = new C16005a();
        this.f60597y = new C16005a();
        m45314e(z4);
        m45313a();
        this.f60597y.m45301b(AbstractC18738j.m54485c(context, AbstractC36510a.f156031j));
        m45320h(12.0f);
    }
}
