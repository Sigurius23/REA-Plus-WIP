package ne3;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C26643w extends AbstractC26636r {

    /* JADX INFO: renamed from: w */
    public final MessageDigest f105923w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26643w(C26610e c26610e) throws NoSuchAlgorithmException {
        super(c26610e);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        AbstractC22676k.m65749i(messageDigest, "getInstance(...)");
        this.f105923w = messageDigest;
    }

    /* JADX INFO: renamed from: b */
    public final C26624l m79285b() {
        MessageDigest messageDigest = this.f105923w;
        if (messageDigest == null) {
            AbstractC22676k.m65747g(null);
            throw null;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC22676k.m65747g(bArrDigest);
        return new C26624l(bArrDigest);
    }

    @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC26604b.m79160e(source.f105866x, 0L, j7);
        C26623k0 c26623k0 = source.f105865w;
        AbstractC22676k.m65747g(c26623k0);
        long j13 = 0;
        while (j13 < j7) {
            int iMin = (int) Math.min(j7 - j13, c26623k0.f105876c - c26623k0.f105875b);
            MessageDigest messageDigest = this.f105923w;
            if (messageDigest == null) {
                AbstractC22676k.m65747g(null);
                throw null;
            }
            messageDigest.update(c26623k0.f105874a, c26623k0.f105875b, iMin);
            j13 += (long) iMin;
            c26623k0 = c26623k0.f105879f;
            AbstractC22676k.m65747g(c26623k0);
        }
        super.write(source, j7);
    }
}
