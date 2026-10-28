package gs;

import com.google.crypto.tink.internal.AbstractC5079a0;
import java.security.GeneralSecurityException;
import p075ct.C11105a;

/* JADX INFO: renamed from: gs.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16130e0 extends AbstractC16123b {

    /* JADX INFO: renamed from: b */
    public final C16132f0 f61263b;

    /* JADX INFO: renamed from: c */
    public final C11105a f61264c;

    /* JADX INFO: renamed from: d */
    public final Integer f61265d;

    public C16130e0(C16132f0 c16132f0, C11105a c11105a, Integer num) {
        super(0);
        this.f61263b = c16132f0;
        this.f61264c = c11105a;
        this.f61265d = num;
    }

    /* JADX INFO: renamed from: Y */
    public static C16130e0 m45686Y(C16132f0 c16132f0, Integer num) throws GeneralSecurityException {
        C11105a c11105aM15952b;
        C16124b0 c16124b0 = c16132f0.f61268a;
        if (c16124b0 == C16124b0.f61250l) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            c11105aM15952b = AbstractC5079a0.f21389a;
        } else {
            if (c16124b0 != C16124b0.f61249k) {
                throw new GeneralSecurityException("Unknown Variant: " + c16124b0);
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            c11105aM15952b = AbstractC5079a0.m15952b(num.intValue());
        }
        return new C16130e0(c16132f0, c11105aM15952b, num);
    }

    @Override // gs.AbstractC16123b, p505ts.AbstractC34132o
    /* JADX INFO: renamed from: z */
    public final Integer mo16076z() {
        throw null;
    }
}
