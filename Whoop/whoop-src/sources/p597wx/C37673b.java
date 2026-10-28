package p597wx;

import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wx.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C37673b {

    /* JADX INFO: renamed from: a */
    public final String f161425a;

    /* JADX INFO: renamed from: b */
    public final Set f161426b;

    public C37673b(String publishableKey, Set productUsage) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        this.f161425a = publishableKey;
        this.f161426b = productUsage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37673b)) {
            return false;
        }
        C37673b c37673b = (C37673b) obj;
        return AbstractC22676k.m65745e(this.f161425a, c37673b.f161425a) && AbstractC22676k.m65745e(this.f161426b, c37673b.f161426b);
    }

    public final int hashCode() {
        return this.f161426b.hashCode() + (this.f161425a.hashCode() * 31);
    }

    public final String toString() {
        return "Args(publishableKey=" + this.f161425a + ", productUsage=" + this.f161426b + ")";
    }
}
