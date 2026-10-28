package p416q7;

import java.time.Instant;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q7.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C30008a {

    /* JADX INFO: renamed from: a */
    public final Instant f122516a;

    /* JADX INFO: renamed from: b */
    public final Instant f122517b;

    public C30008a(Instant instant, Instant instant2) {
        this.f122516a = instant;
        this.f122517b = instant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30008a)) {
            return false;
        }
        C30008a c30008a = (C30008a) obj;
        return AbstractC22676k.m65745e(this.f122516a, c30008a.f122516a) && AbstractC22676k.m65745e(this.f122517b, c30008a.f122517b);
    }

    public final int hashCode() {
        Instant instant = this.f122516a;
        int iHashCode = (instant != null ? instant.hashCode() : 0) * 31;
        Instant instant2 = this.f122517b;
        return (iHashCode + (instant2 != null ? instant2.hashCode() : 0)) * 961;
    }
}
