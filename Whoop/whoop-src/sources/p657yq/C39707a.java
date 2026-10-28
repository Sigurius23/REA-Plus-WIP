package p657yq;

import android.content.Context;
import android.graphics.Color;
import com.whoop.android.R;
import io.sentry.config.AbstractC20301a;
import p463rj.AbstractC31484o;
import p543v4.AbstractC35642a;

/* JADX INFO: renamed from: yq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39707a {

    /* JADX INFO: renamed from: f */
    public static final int f170934f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f170935a;

    /* JADX INFO: renamed from: b */
    public final int f170936b;

    /* JADX INFO: renamed from: c */
    public final int f170937c;

    /* JADX INFO: renamed from: d */
    public final int f170938d;

    /* JADX INFO: renamed from: e */
    public final float f170939e;

    public C39707a(Context context) {
        boolean zM56324W = AbstractC20301a.m56324W(context, R.attr.elevationOverlayEnabled, false);
        int iM96968t = AbstractC31484o.m96968t(context, R.attr.elevationOverlayColor, 0);
        int iM96968t2 = AbstractC31484o.m96968t(context, R.attr.elevationOverlayAccentColor, 0);
        int iM96968t3 = AbstractC31484o.m96968t(context, R.attr.colorSurface, 0);
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f170935a = zM56324W;
        this.f170936b = iM96968t;
        this.f170937c = iM96968t2;
        this.f170938d = iM96968t3;
        this.f170939e = f13;
    }

    /* JADX INFO: renamed from: a */
    public final int m127046a(float f13, int i13) {
        int i14;
        if (!this.f170935a || AbstractC35642a.m112838g(i13, 255) != this.f170938d) {
            return i13;
        }
        float f14 = this.f170939e;
        float fMin = (f14 <= 0.0f || f13 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f13 / f14)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i13);
        int iM96972x = AbstractC31484o.m96972x(fMin, AbstractC35642a.m112838g(i13, 255), this.f170936b);
        if (fMin > 0.0f && (i14 = this.f170937c) != 0) {
            iM96972x = AbstractC35642a.m112836e(AbstractC35642a.m112838g(i14, f170934f), iM96972x);
        }
        return AbstractC35642a.m112838g(iM96972x, iAlpha);
    }
}
