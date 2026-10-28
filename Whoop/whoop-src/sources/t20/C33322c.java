package t20;

import nh3.AbstractC26725a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C33322c {

    /* JADX INFO: renamed from: a */
    public final String f139003a;

    /* JADX INFO: renamed from: b */
    public final boolean f139004b;

    public C33322c(String promoText, boolean z4) {
        AbstractC22676k.m65750j(promoText, "promoText");
        this.f139003a = promoText;
        this.f139004b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33322c)) {
            return false;
        }
        C33322c c33322c = (C33322c) obj;
        return AbstractC22676k.m65745e(this.f139003a, c33322c.f139003a) && this.f139004b == c33322c.f139004b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139004b) + (this.f139003a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC26725a.m79503g("PromoBadgeState(promoText=", this.f139003a, ", eligible=", ")", this.f139004b);
    }
}
