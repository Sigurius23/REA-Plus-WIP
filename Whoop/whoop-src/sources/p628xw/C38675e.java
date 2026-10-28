package p628xw;

import javax.crypto.SecretKey;

/* JADX INFO: renamed from: xw.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C38675e implements SecretKey {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ SecretKey f166479w;

    public C38675e(SecretKey secretKey) {
        this.f166479w = secretKey;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "AES";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.f166479w.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return this.f166479w.getFormat();
    }
}
