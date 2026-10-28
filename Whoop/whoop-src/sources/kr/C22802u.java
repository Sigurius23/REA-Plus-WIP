package kr;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: kr.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C22802u {

    /* JADX INFO: renamed from: a */
    public float f89809a;

    /* JADX INFO: renamed from: b */
    public float f89810b;

    /* JADX INFO: renamed from: c */
    public float f89811c;

    /* JADX INFO: renamed from: d */
    public float f89812d;

    /* JADX INFO: renamed from: e */
    public float f89813e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f89814f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f89815g = new ArrayList();

    public C22802u() {
        m66038d(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m66035a(float f13) {
        float f14 = this.f89812d;
        if (f14 == f13) {
            return;
        }
        float f15 = ((f13 - f14) + 360.0f) % 360.0f;
        if (f15 > 180.0f) {
            return;
        }
        float f16 = this.f89810b;
        float f17 = this.f89811c;
        C22798q c22798q = new C22798q(f16, f17, f16, f17);
        c22798q.f89802f = this.f89812d;
        c22798q.f89803g = f15;
        this.f89815g.add(new C22796o(c22798q));
        this.f89812d = f13;
    }

    /* JADX INFO: renamed from: b */
    public final void m66036b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f89814f;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((AbstractC22800s) arrayList.get(i13)).mo66034a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m66037c(float f13, float f14) {
        C22799r c22799r = new C22799r();
        c22799r.f89804b = f13;
        c22799r.f89805c = f14;
        this.f89814f.add(c22799r);
        C22797p c22797p = new C22797p(c22799r, this.f89810b, this.f89811c);
        float fM66033b = c22797p.m66033b() + 270.0f;
        float fM66033b2 = c22797p.m66033b() + 270.0f;
        m66035a(fM66033b);
        this.f89815g.add(c22797p);
        this.f89812d = fM66033b2;
        this.f89810b = f13;
        this.f89811c = f14;
    }

    /* JADX INFO: renamed from: d */
    public final void m66038d(float f13, float f14, float f15) {
        this.f89809a = f13;
        this.f89810b = 0.0f;
        this.f89811c = f13;
        this.f89812d = f14;
        this.f89813e = (f14 + f15) % 360.0f;
        this.f89814f.clear();
        this.f89815g.clear();
    }
}
