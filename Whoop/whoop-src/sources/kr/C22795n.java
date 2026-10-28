package kr;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p258jr.C21890a;

/* JADX INFO: renamed from: kr.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C22795n extends AbstractC22801t {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f89791c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f89792d;

    public C22795n(ArrayList arrayList, Matrix matrix) {
        this.f89791c = arrayList;
        this.f89792d = matrix;
    }

    @Override // kr.AbstractC22801t
    /* JADX INFO: renamed from: a */
    public final void mo66032a(Matrix matrix, C21890a c21890a, int i13, Canvas canvas) {
        Iterator it = this.f89791c.iterator();
        while (it.hasNext()) {
            ((AbstractC22801t) it.next()).mo66032a(this.f89792d, c21890a, i13, canvas);
        }
    }
}
