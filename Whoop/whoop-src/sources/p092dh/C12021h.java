package p092dh;

import android.graphics.drawable.Drawable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dh.h */
/* JADX INFO: loaded from: classes.dex */
public final class C12021h {

    /* JADX INFO: renamed from: a */
    public final Drawable f39765a;

    /* JADX INFO: renamed from: b */
    public final boolean f39766b;

    public C12021h(Drawable drawable, boolean z4) {
        this.f39765a = drawable;
        this.f39766b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12021h)) {
            return false;
        }
        C12021h c12021h = (C12021h) obj;
        return AbstractC22676k.m65745e(this.f39765a, c12021h.f39765a) && this.f39766b == c12021h.f39766b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39766b) + (this.f39765a.hashCode() * 31);
    }
}
