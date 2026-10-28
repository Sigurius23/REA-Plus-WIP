package gw;

import java.io.Serializable;
import java.util.Objects;
import p628xw.AbstractC38676f;
import p628xw.C38672b;

/* JADX INFO: renamed from: gw.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C16267r implements Serializable {

    /* JADX INFO: renamed from: w */
    public final String f61874w;

    /* JADX INFO: renamed from: x */
    public final byte[] f61875x;

    /* JADX INFO: renamed from: y */
    public final C38672b f61876y;

    public C16267r(String str) {
        Objects.requireNonNull(str, "The string must not be null");
        this.f61874w = str;
        this.f61875x = null;
        this.f61876y = null;
    }

    public final String toString() {
        String str = this.f61874w;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.f61875x;
        if (bArr != null) {
            return new String(bArr, AbstractC38676f.f166480a);
        }
        C38672b c38672b = this.f61876y;
        if (c38672b != null) {
            return new String(c38672b.m124047a(), AbstractC38676f.f166480a);
        }
        return null;
    }

    public C16267r(byte[] bArr) {
        this.f61874w = null;
        Objects.requireNonNull(bArr, "The byte array must not be null");
        this.f61875x = bArr;
        this.f61876y = null;
    }

    public C16267r(C38672b c38672b) {
        this.f61874w = null;
        this.f61875x = null;
        Objects.requireNonNull(c38672b, "The Base64URL-encoded object must not be null");
        this.f61876y = c38672b;
    }
}
