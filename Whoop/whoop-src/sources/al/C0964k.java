package al;

import android.graphics.Bitmap;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: al.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C0964k implements InterfaceC0962i {

    /* JADX INFO: renamed from: a */
    public final C0959f f3563a;

    /* JADX INFO: renamed from: b */
    public int f3564b;

    /* JADX INFO: renamed from: c */
    public Bitmap.Config f3565c;

    public C0964k(C0959f c0959f) {
        this.f3563a = c0959f;
    }

    @Override // al.InterfaceC0962i
    /* JADX INFO: renamed from: a */
    public final void mo2439a() {
        this.f3563a.m2413A0(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m2452b(int i13, Bitmap.Config config) {
        this.f3564b = i13;
        this.f3565c = config;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0964k) {
            C0964k c0964k = (C0964k) obj;
            if (this.f3564b == c0964k.f3564b && AbstractC33913l.m107266a(this.f3565c, c0964k.f3565c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f3564b * 31;
        Bitmap.Config config = this.f3565c;
        return i13 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C0965l.m2453c(this.f3564b, this.f3565c);
    }
}
