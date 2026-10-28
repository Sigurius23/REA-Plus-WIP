package le3;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: le3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C23887h {

    /* JADX INFO: renamed from: a */
    public final boolean f94469a;

    /* JADX INFO: renamed from: b */
    public final Integer f94470b;

    /* JADX INFO: renamed from: c */
    public final boolean f94471c;

    /* JADX INFO: renamed from: d */
    public final Integer f94472d;

    /* JADX INFO: renamed from: e */
    public final boolean f94473e;

    /* JADX INFO: renamed from: f */
    public final boolean f94474f;

    public C23887h(boolean z4, Integer num, boolean z13, Integer num2, boolean z14, boolean z15) {
        this.f94469a = z4;
        this.f94470b = num;
        this.f94471c = z13;
        this.f94472d = num2;
        this.f94473e = z14;
        this.f94474f = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23887h)) {
            return false;
        }
        C23887h c23887h = (C23887h) obj;
        return this.f94469a == c23887h.f94469a && AbstractC22676k.m65745e(this.f94470b, c23887h.f94470b) && this.f94471c == c23887h.f94471c && AbstractC22676k.m65745e(this.f94472d, c23887h.f94472d) && this.f94473e == c23887h.f94473e && this.f94474f == c23887h.f94474f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f94469a) * 31;
        Integer num = this.f94470b;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f94471c);
        Integer num2 = this.f94472d;
        return Boolean.hashCode(this.f94474f) + AbstractC2875y.m8289b((iM8289b + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f94473e);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb4.append(this.f94469a);
        sb4.append(", clientMaxWindowBits=");
        sb4.append(this.f94470b);
        sb4.append(", clientNoContextTakeover=");
        sb4.append(this.f94471c);
        sb4.append(", serverMaxWindowBits=");
        sb4.append(this.f94472d);
        sb4.append(", serverNoContextTakeover=");
        sb4.append(this.f94473e);
        sb4.append(", unknownValues=");
        return AbstractC2875y.m8305r(sb4, this.f94474f, ')');
    }
}
