package p649yi;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: yi.l */
/* JADX INFO: loaded from: classes.dex */
public final class C39557l {

    /* JADX INFO: renamed from: a */
    public final ArrayList f170183a;

    /* JADX INFO: renamed from: b */
    public PointF f170184b;

    /* JADX INFO: renamed from: c */
    public boolean f170185c;

    public C39557l(PointF pointF, boolean z4, List list) {
        this.f170184b = pointF;
        this.f170185c = z4;
        this.f170183a = new ArrayList(list);
    }

    /* JADX INFO: renamed from: a */
    public final void m126329a(float f13, float f14) {
        if (this.f170184b == null) {
            this.f170184b = new PointF();
        }
        this.f170184b.set(f13, f14);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ShapeData{numCurves=");
        sb4.append(this.f170183a.size());
        sb4.append("closed=");
        return AbstractC2875y.m8305r(sb4, this.f170185c, '}');
    }

    public C39557l() {
        this.f170183a = new ArrayList();
    }
}
