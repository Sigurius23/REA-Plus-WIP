package o53;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: o53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C27591b {

    /* JADX INFO: renamed from: a */
    public final String f111083a;

    /* JADX INFO: renamed from: b */
    public final boolean f111084b;

    /* JADX INFO: renamed from: c */
    public final float f111085c;

    public C27591b(float f13, String userId, boolean z4) {
        AbstractC22676k.m65750j(userId, "userId");
        this.f111083a = userId;
        this.f111084b = z4;
        this.f111085c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27591b)) {
            return false;
        }
        C27591b c27591b = (C27591b) obj;
        return AbstractC22676k.m65745e(this.f111083a, c27591b.f111083a) && this.f111084b == c27591b.f111084b && Float.compare(this.f111085c, c27591b.f111085c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f111085c) + AbstractC2875y.m8289b(this.f111083a.hashCode() * 31, 31, this.f111084b);
    }

    public final String toString() {
        return AbstractC30007c.m91837g(this.f111085c, ")", AbstractC25012a.m73379l("UserAudioLevel(userId=", this.f111083a, ", isSpeaking=", ", audioLevel=", this.f111084b));
    }
}
