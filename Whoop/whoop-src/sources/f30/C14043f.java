package f30;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C14043f {

    /* JADX INFO: renamed from: a */
    public final String f50114a;

    public C14043f(String clientSecret) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f50114a = clientSecret;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14043f) && AbstractC22676k.m65745e(this.f50114a, ((C14043f) obj).f50114a);
    }

    public final int hashCode() {
        return this.f50114a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Config(clientSecret=", this.f50114a, ")");
    }
}
