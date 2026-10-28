package p258jr;

import android.graphics.Paint;
import android.graphics.Path;
import p543v4.AbstractC35642a;

/* JADX INFO: renamed from: jr.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C21890a {

    /* JADX INFO: renamed from: i */
    public static final int[] f84578i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f84579j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f84580k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f84581l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f84582a;

    /* JADX INFO: renamed from: b */
    public final Paint f84583b;

    /* JADX INFO: renamed from: c */
    public final Paint f84584c;

    /* JADX INFO: renamed from: d */
    public int f84585d;

    /* JADX INFO: renamed from: e */
    public int f84586e;

    /* JADX INFO: renamed from: f */
    public int f84587f;

    /* JADX INFO: renamed from: g */
    public final Path f84588g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f84589h;

    public C21890a() {
        Paint paint = new Paint();
        this.f84589h = paint;
        this.f84582a = new Paint();
        m62150a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f84583b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f84584c = new Paint(paint2);
    }

    /* JADX INFO: renamed from: a */
    public final void m62150a(int i13) {
        this.f84585d = AbstractC35642a.m112838g(i13, 68);
        this.f84586e = AbstractC35642a.m112838g(i13, 20);
        this.f84587f = AbstractC35642a.m112838g(i13, 0);
        this.f84582a.setColor(this.f84585d);
    }
}
