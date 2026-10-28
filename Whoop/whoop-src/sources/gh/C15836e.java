package gh;

import android.graphics.drawable.Drawable;
import p031b9.AbstractC2875y;
import p092dh.EnumC12020g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gh.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C15836e extends AbstractC15837f {

    /* JADX INFO: renamed from: a */
    public final Drawable f59825a;

    /* JADX INFO: renamed from: b */
    public final boolean f59826b;

    /* JADX INFO: renamed from: c */
    public final EnumC12020g f59827c;

    public C15836e(Drawable drawable, boolean z4, EnumC12020g enumC12020g) {
        this.f59825a = drawable;
        this.f59826b = z4;
        this.f59827c = enumC12020g;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC12020g m44671a() {
        return this.f59827c;
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m44672b() {
        return this.f59825a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m44673c() {
        return this.f59826b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15836e)) {
            return false;
        }
        C15836e c15836e = (C15836e) obj;
        return AbstractC22676k.m65745e(this.f59825a, c15836e.f59825a) && this.f59826b == c15836e.f59826b && this.f59827c == c15836e.f59827c;
    }

    public final int hashCode() {
        return this.f59827c.hashCode() + AbstractC2875y.m8289b(this.f59825a.hashCode() * 31, 31, this.f59826b);
    }
}
