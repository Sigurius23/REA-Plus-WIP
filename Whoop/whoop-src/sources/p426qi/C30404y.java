package p426qi;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: qi.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C30404y {

    /* JADX INFO: renamed from: a */
    public final int f124775a;

    /* JADX INFO: renamed from: b */
    public final int f124776b;

    /* JADX INFO: renamed from: c */
    public final String f124777c;

    /* JADX INFO: renamed from: d */
    public final String f124778d;

    /* JADX INFO: renamed from: e */
    public final String f124779e;

    /* JADX INFO: renamed from: f */
    public Bitmap f124780f;

    public C30404y(int i13, int i14, String str, String str2, String str3) {
        this.f124775a = i13;
        this.f124776b = i14;
        this.f124777c = str;
        this.f124778d = str2;
        this.f124779e = str3;
    }

    /* JADX INFO: renamed from: a */
    public final C30404y m92898a(float f13) {
        int i13 = (int) (this.f124775a * f13);
        int i14 = (int) (this.f124776b * f13);
        C30404y c30404y = new C30404y(i13, i14, this.f124777c, this.f124778d, this.f124779e);
        Bitmap bitmap = this.f124780f;
        if (bitmap != null) {
            c30404y.f124780f = Bitmap.createScaledBitmap(bitmap, i13, i14, true);
        }
        return c30404y;
    }

    /* JADX INFO: renamed from: b */
    public final String m92899b() {
        return this.f124778d;
    }

    /* JADX INFO: renamed from: c */
    public final int m92900c() {
        return this.f124776b;
    }

    /* JADX INFO: renamed from: d */
    public final String m92901d() {
        return this.f124777c;
    }

    /* JADX INFO: renamed from: e */
    public final int m92902e() {
        return this.f124775a;
    }

    /* JADX INFO: renamed from: f */
    public final void m92903f(Bitmap bitmap) {
        this.f124780f = bitmap;
    }
}
