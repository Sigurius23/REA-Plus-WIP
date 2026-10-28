package p013ah;

import java.util.Arrays;

/* JADX INFO: renamed from: ah.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C0867b extends AbstractC0868c {

    /* JADX INFO: renamed from: d */
    public final byte[] f3159d;

    public C0867b(byte[] bArr) {
        super(4);
        if (bArr == null) {
            this.f3159d = null;
        } else {
            this.f3159d = bArr;
        }
    }

    @Override // p013ah.AbstractC0868c, p013ah.AbstractC0869d
    public final boolean equals(Object obj) {
        if (obj instanceof C0867b) {
            C0867b c0867b = (C0867b) obj;
            if (super.equals(obj) && Arrays.equals(this.f3159d, c0867b.f3159d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p013ah.AbstractC0868c, p013ah.AbstractC0869d
    public final int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.f3159d);
    }
}
