package sr;

import java.util.Set;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: sr.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C32907o {

    /* JADX INFO: renamed from: a */
    public final String f137127a;

    /* JADX INFO: renamed from: b */
    public final Set f137128b;

    public C32907o(String str, Set set) {
        this.f137127a = str;
        this.f137128b = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32907o) {
            C32907o c32907o = (C32907o) obj;
            String str = c32907o.f137127a;
            String str2 = this.f137127a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f137128b.equals(c32907o.f137128b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f137127a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f137128b.hashCode();
    }

    public final String toString() {
        return AbstractC11266d.m30464r(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f137127a, ", verdictOptOut=", this.f137128b.toString(), "}");
    }
}
