package dj;

import android.graphics.Color;
import android.graphics.Matrix;
import p462ri.C31441a;

/* JADX INFO: renamed from: dj.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12056a {

    /* JADX INFO: renamed from: a */
    public float f39976a;

    /* JADX INFO: renamed from: b */
    public float f39977b;

    /* JADX INFO: renamed from: c */
    public float f39978c;

    /* JADX INFO: renamed from: d */
    public int f39979d;

    /* JADX INFO: renamed from: e */
    public float[] f39980e = null;

    public C12056a(C12056a c12056a) {
        this.f39976a = 0.0f;
        this.f39977b = 0.0f;
        this.f39978c = 0.0f;
        this.f39979d = 0;
        this.f39976a = c12056a.f39976a;
        this.f39977b = c12056a.f39977b;
        this.f39978c = c12056a.f39978c;
        this.f39979d = c12056a.f39979d;
    }

    /* JADX INFO: renamed from: a */
    public final void m33235a(int i13, C31441a c31441a) {
        int iAlpha = Color.alpha(this.f39979d);
        int iM33253c = AbstractC12062g.m33253c(i13);
        Matrix matrix = AbstractC12064i.f40031a;
        int i14 = (int) ((((iAlpha / 255.0f) * iM33253c) / 255.0f) * 255.0f);
        if (i14 <= 0) {
            c31441a.clearShadowLayer();
        } else {
            c31441a.setShadowLayer(Math.max(this.f39976a, Float.MIN_VALUE), this.f39977b, this.f39978c, Color.argb(i14, Color.red(this.f39979d), Color.green(this.f39979d), Color.blue(this.f39979d)));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m33236b(int i13) {
        this.f39979d = Color.argb(Math.round((AbstractC12062g.m33253c(i13) * Color.alpha(this.f39979d)) / 255.0f), Color.red(this.f39979d), Color.green(this.f39979d), Color.blue(this.f39979d));
    }

    /* JADX INFO: renamed from: c */
    public final void m33237c(Matrix matrix) {
        if (this.f39980e == null) {
            this.f39980e = new float[2];
        }
        float[] fArr = this.f39980e;
        fArr[0] = this.f39977b;
        fArr[1] = this.f39978c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f39980e;
        this.f39977b = fArr2[0];
        this.f39978c = fArr2[1];
        this.f39976a = matrix.mapRadius(this.f39976a);
    }
}
