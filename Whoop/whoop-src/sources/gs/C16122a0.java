package gs;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p075ct.C11105a;

/* JADX INFO: renamed from: gs.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16122a0 extends AbstractC16123b {

    /* JADX INFO: renamed from: b */
    public final C16126c0 f61237b;

    /* JADX INFO: renamed from: c */
    public final C11105a f61238c;

    /* JADX INFO: renamed from: d */
    public final Integer f61239d;

    public C16122a0(C16126c0 c16126c0, C11105a c11105a, Integer num) {
        super(0);
        this.f61237b = c16126c0;
        this.f61238c = c11105a;
        this.f61239d = num;
    }

    /* JADX INFO: renamed from: Y */
    public static C16122a0 m45677Y(C16126c0 c16126c0, Integer num) throws GeneralSecurityException {
        C11105a c11105aM30034a;
        C16124b0 c16124b0 = c16126c0.f61255b;
        if (c16124b0 == C16124b0.f61241c) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            c11105aM30034a = C11105a.m30034a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (c16124b0 != C16124b0.f61242d) {
                throw new GeneralSecurityException("Unknown Variant: " + c16124b0);
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            c11105aM30034a = C11105a.m30034a(new byte[0]);
        }
        return new C16122a0(c16126c0, c11105aM30034a, num);
    }

    @Override // gs.AbstractC16123b, p505ts.AbstractC34132o
    /* JADX INFO: renamed from: z */
    public final Integer mo16076z() {
        throw null;
    }
}
