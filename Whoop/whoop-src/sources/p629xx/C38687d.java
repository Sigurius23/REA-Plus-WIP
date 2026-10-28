package p629xx;

import java.util.Map;
import m83.C25272z;

/* JADX INFO: renamed from: xx.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C38687d implements InterfaceC38688e {

    /* JADX INFO: renamed from: w */
    public static final C38687d f166494w = new C38687d();

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        return "elements.attestation.confirmation.request_token";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C38687d);
    }

    @Override // p629xx.InterfaceC38688e
    public final Map getParams() {
        return C25272z.f99163w;
    }

    public final int hashCode() {
        return -1668146451;
    }

    public final String toString() {
        return "RequestToken";
    }
}
