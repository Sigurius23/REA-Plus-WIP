package p461rh;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ki.AbstractC22500l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rh.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C31416e implements InterfaceC31421j {

    /* JADX INFO: renamed from: a */
    public final Drawable f129282a;

    public C31416e(Drawable drawable) {
        this.f129282a = drawable;
    }

    @Override // p461rh.InterfaceC31421j
    /* JADX INFO: renamed from: a */
    public final boolean mo96729a() {
        return false;
    }

    @Override // p461rh.InterfaceC31421j
    /* JADX INFO: renamed from: b */
    public final void mo96730b(Canvas canvas) {
        this.f129282a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31416e) && AbstractC22676k.m65745e(this.f129282a, ((C31416e) obj).f129282a);
    }

    @Override // p461rh.InterfaceC31421j
    public final int getHeight() {
        return AbstractC22500l.m64992a(this.f129282a);
    }

    @Override // p461rh.InterfaceC31421j
    public final long getSize() {
        Drawable drawable = this.f129282a;
        long jM64993b = ((long) AbstractC22500l.m64993b(drawable)) * 4 * ((long) AbstractC22500l.m64992a(drawable));
        if (jM64993b < 0) {
            return 0L;
        }
        return jM64993b;
    }

    @Override // p461rh.InterfaceC31421j
    public final int getWidth() {
        return AbstractC22500l.m64993b(this.f129282a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f129282a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f129282a + ", shareable=false)";
    }
}
