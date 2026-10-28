package gn2;

import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import java.util.Arrays;

/* JADX INFO: renamed from: gn2.b */
/* JADX INFO: loaded from: classes10.dex */
public class C16006b {

    /* JADX INFO: renamed from: a */
    private float[] f60584a = new float[8];

    /* JADX INFO: renamed from: a */
    public Shape m45302a(int i13) {
        Arrays.fill(this.f60584a, i13 / 2.0f);
        return new RoundRectShape(this.f60584a, null, null);
    }
}
