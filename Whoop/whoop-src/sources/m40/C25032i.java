package m40;

import android.graphics.Bitmap;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m40.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C25032i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC25031h f98052a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f98053b;

    public C25032i(String str, Bitmap bitmap) {
        Object next;
        Iterator it = EnumC25029f.f98046F.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((EnumC25029f) next).f98050w.equals(str));
        InterfaceC25031h interfaceC25031h = (EnumC25029f) next;
        this.f98052a = interfaceC25031h == null ? new C25030g(str) : interfaceC25031h;
        this.f98053b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25032i)) {
            return false;
        }
        C25032i c25032i = (C25032i) obj;
        return AbstractC22676k.m65745e(this.f98052a, c25032i.f98052a) && AbstractC22676k.m65745e(this.f98053b, c25032i.f98053b);
    }

    public final int hashCode() {
        return this.f98053b.hashCode() + (this.f98052a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadedImage(contentType=" + this.f98052a + ", bitmap=" + this.f98053b + ")";
    }
}
