package mh;

import android.graphics.drawable.Drawable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mh.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C25537e extends AbstractC25543k {

    /* JADX INFO: renamed from: a */
    public final Drawable f100072a;

    /* JADX INFO: renamed from: b */
    public final C25542j f100073b;

    /* JADX INFO: renamed from: c */
    public final Throwable f100074c;

    public C25537e(Drawable drawable, C25542j c25542j, Throwable th3) {
        this.f100072a = drawable;
        this.f100073b = c25542j;
        this.f100074c = th3;
    }

    @Override // mh.AbstractC25543k
    /* JADX INFO: renamed from: a */
    public final Drawable mo75114a() {
        return this.f100072a;
    }

    @Override // mh.AbstractC25543k
    /* JADX INFO: renamed from: b */
    public final C25542j mo75115b() {
        return this.f100073b;
    }

    /* JADX INFO: renamed from: c */
    public final Throwable m75116c() {
        return this.f100074c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25537e)) {
            return false;
        }
        C25537e c25537e = (C25537e) obj;
        return AbstractC22676k.m65745e(this.f100072a, c25537e.f100072a) && AbstractC22676k.m65745e(this.f100073b, c25537e.f100073b) && AbstractC22676k.m65745e(this.f100074c, c25537e.f100074c);
    }

    public final int hashCode() {
        Drawable drawable = this.f100072a;
        return this.f100074c.hashCode() + ((this.f100073b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
