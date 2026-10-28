package c43;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c43.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C4198n {

    /* JADX INFO: renamed from: a */
    public String f17053a;

    /* JADX INFO: renamed from: b */
    public String f17054b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4198n)) {
            return false;
        }
        C4198n c4198n = (C4198n) obj;
        return AbstractC22676k.m65745e(this.f17053a, c4198n.f17053a) && AbstractC22676k.m65745e(this.f17054b, c4198n.f17054b);
    }

    public final int hashCode() {
        return this.f17054b.hashCode() + (this.f17053a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("RTMP(address=", this.f17053a, ", streamKey=", this.f17054b, ")");
    }
}
