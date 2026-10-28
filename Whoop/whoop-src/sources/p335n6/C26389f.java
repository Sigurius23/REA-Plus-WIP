package p335n6;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: n6.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C26389f implements InterfaceC26401r {

    /* JADX INFO: renamed from: a */
    public final Bitmap f104837a;

    public C26389f(Bitmap bitmap) {
        this.f104837a = bitmap;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BitmapImageProvider(bitmap=Bitmap(");
        Bitmap bitmap = this.f104837a;
        sb4.append(bitmap.getWidth());
        sb4.append("px x ");
        sb4.append(bitmap.getHeight());
        sb4.append("px))");
        return sb4.toString();
    }
}
