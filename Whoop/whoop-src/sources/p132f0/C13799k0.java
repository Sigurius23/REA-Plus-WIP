package p132f0;

import android.content.Context;
import android.widget.EdgeEffect;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: f0.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13799k0 extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    public final float f49242a;

    /* JADX INFO: renamed from: b */
    public float f49243b;

    public C13799k0(Context context) {
        super(context);
        this.f49242a = AbstractC35849g.m113799a(context).f168410w * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i13) {
        this.f49243b = 0.0f;
        super.onAbsorb(i13);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f13, float f14) {
        this.f49243b = 0.0f;
        super.onPull(f13, f14);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f49243b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f13) {
        this.f49243b = 0.0f;
        super.onPull(f13);
    }
}
