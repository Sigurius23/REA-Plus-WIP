package p366oe;

import p087db.C11856j0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oe.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C27865a {

    /* JADX INFO: renamed from: a */
    public final String f112303a;

    public C27865a(C11856j0 c11856j0) {
        String str = c11856j0.f38685x;
        if (str == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter");
        }
        this.f112303a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m84112a() {
        return this.f112303a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27865a) {
            return AbstractC22676k.m65745e(this.f112303a, ((C27865a) obj).f112303a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f112303a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CognitoIdentityProviderAuthSchemeParameters(");
        sb4.append("operationName=" + this.f112303a + ')');
        return sb4.toString();
    }
}
