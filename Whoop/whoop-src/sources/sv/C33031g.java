package sv;

import android.view.animation.PathInterpolator;
import ar.C1916d;
import e93.AbstractC12889b;
import live.hms.video.utils.HMSConstantsKt;
import p470rv.InterfaceC31836p;

/* JADX INFO: renamed from: sv.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C33031g extends AbstractC33028d {

    /* JADX INFO: renamed from: J */
    public static final PathInterpolator f137574J = new PathInterpolator(0.0f, 0.0f, 0.25f, 1.0f);

    /* JADX INFO: renamed from: F */
    public final float f137575F;

    /* JADX INFO: renamed from: G */
    public double f137576G;

    /* JADX INFO: renamed from: H */
    public int f137577H;

    /* JADX INFO: renamed from: I */
    public final boolean f137578I;

    public C33031g(float f13) {
        super(AbstractC33025a.f137560b);
        this.f137575F = f13;
        this.f137576G = ((double) f13) * 10.0d;
        this.f137577H = -16776961;
        this.f137578I = true;
        setDuration(HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS);
        setRepeatMode(1);
        setRepeatCount(-1);
        setInterpolator(f137574J);
    }

    @Override // sv.AbstractC33028d
    /* JADX INFO: renamed from: c */
    public final void mo104295c(Object obj, float f13) {
        double dDoubleValue = ((Number) obj).doubleValue();
        float fM36283m = this.f137578I ? AbstractC12889b.m36283m(1.0f - ((float) (dDoubleValue / this.f137576G)), 0.0f, 1.0f) : 1.0f;
        InterfaceC31836p interfaceC31836p = this.f137569y;
        if (interfaceC31836p != null) {
            interfaceC31836p.mo91122l(this.f137577H, (float) dDoubleValue, Float.valueOf(f13 > 0.1f ? fM36283m : 0.0f));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m104298d() {
        if (this.f137576G <= 0.0d) {
            this.f137576G = ((double) this.f137575F) * 10.0d;
        }
        if (!isRunning()) {
            m104296a(new Double[]{Double.valueOf(0.0d), Double.valueOf(this.f137576G)}, null);
        }
        addListener(new C1916d(this, 16));
    }
}
