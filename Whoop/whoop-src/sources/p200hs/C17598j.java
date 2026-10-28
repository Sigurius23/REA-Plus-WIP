package p200hs;

import androidx.glance.appwidget.protobuf.AbstractC1400l;
import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import p027b3.AbstractC2351b;

/* JADX INFO: renamed from: hs.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C17598j extends AbstractC2351b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f68172d;

    public C17598j(byte[] bArr, int i13) throws GeneralSecurityException {
        this.f68172d = i13;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f9291b = mo7270y(1, bArr);
        this.f9292c = mo7270y(0, bArr);
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: y */
    public final AbstractC1400l mo7270y(int i13, byte[] bArr) {
        switch (this.f68172d) {
            case 0:
                return new C17597i(bArr, i13, 0);
            default:
                return new C17597i(bArr, i13, 1);
        }
    }
}
