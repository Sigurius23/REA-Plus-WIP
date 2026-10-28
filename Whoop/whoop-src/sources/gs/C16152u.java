package gs;

import com.google.crypto.tink.internal.AbstractC5079a0;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import ro.C31624i;

/* JADX INFO: renamed from: gs.u */
/* JADX INFO: loaded from: classes.dex */
public final class C16152u extends AbstractC16123b {

    /* JADX INFO: renamed from: b */
    public final C16154w f61366b;

    /* JADX INFO: renamed from: c */
    public final C31624i f61367c;

    /* JADX INFO: renamed from: d */
    public final C11105a f61368d;

    /* JADX INFO: renamed from: e */
    public final Integer f61369e;

    public C16152u(C16154w c16154w, C31624i c31624i, C11105a c11105a, Integer num) {
        super(0);
        this.f61366b = c16154w;
        this.f61367c = c31624i;
        this.f61368d = c11105a;
        this.f61369e = num;
    }

    /* JADX INFO: renamed from: Y */
    public static C16152u m45695Y(C16139j c16139j, C31624i c31624i, Integer num) throws GeneralSecurityException {
        C11105a c11105aM15952b;
        C16139j c16139j2 = C16139j.f61315v;
        if (c16139j != c16139j2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c16139j + " the value of idRequirement must be non-null");
        }
        if (c16139j == c16139j2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c31624i.m97702E() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c31624i.m97702E());
        }
        C16154w c16154w = new C16154w(c16139j);
        if (c16139j == c16139j2) {
            c11105aM15952b = AbstractC5079a0.f21389a;
        } else if (c16139j == C16139j.f61314u) {
            c11105aM15952b = AbstractC5079a0.m15951a(num.intValue());
        } else {
            if (c16139j != C16139j.f61313t) {
                throw new IllegalStateException("Unknown Variant: " + c16139j);
            }
            c11105aM15952b = AbstractC5079a0.m15952b(num.intValue());
        }
        return new C16152u(c16154w, c31624i, c11105aM15952b, num);
    }

    @Override // gs.AbstractC16123b, p505ts.AbstractC34132o
    /* JADX INFO: renamed from: z */
    public final Integer mo16076z() {
        throw null;
    }
}
