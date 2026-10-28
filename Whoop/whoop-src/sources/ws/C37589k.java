package ws;

import com.google.crypto.tink.internal.AbstractC5079a0;
import gs.AbstractC16123b;
import java.security.GeneralSecurityException;
import p075ct.C11105a;

/* JADX INFO: renamed from: ws.k */
/* JADX INFO: loaded from: classes.dex */
public final class C37589k extends AbstractC16123b {

    /* JADX INFO: renamed from: b */
    public final C37586h f160744b;

    /* JADX INFO: renamed from: c */
    public final C11105a f160745c;

    /* JADX INFO: renamed from: d */
    public final C11105a f160746d;

    /* JADX INFO: renamed from: e */
    public final Integer f160747e;

    public C37589k(C37586h c37586h, C11105a c11105a, C11105a c11105a2, Integer num) {
        super(6);
        this.f160744b = c37586h;
        this.f160745c = c11105a;
        this.f160746d = c11105a2;
        this.f160747e = num;
    }

    /* JADX INFO: renamed from: Y */
    public static C37589k m120652Y(C37585g c37585g, C11105a c11105a, Integer num) throws GeneralSecurityException {
        C11105a c11105aM15951a;
        byte[] bArr = c11105a.f35302a;
        C37586h c37586h = new C37586h(c37585g);
        C37585g c37585g2 = C37585g.f160733e;
        if (!c37585g.equals(c37585g2) && num == null) {
            throw new GeneralSecurityException("For given Variant " + c37585g + " the value of idRequirement must be non-null");
        }
        if (c37585g.equals(c37585g2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bArr.length != 32) {
            throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + bArr.length);
        }
        if (c37585g == c37585g2) {
            c11105aM15951a = AbstractC5079a0.f21389a;
        } else if (c37585g == C37585g.f160731c || c37585g == C37585g.f160732d) {
            c11105aM15951a = AbstractC5079a0.m15951a(num.intValue());
        } else {
            if (c37585g != C37585g.f160730b) {
                throw new IllegalStateException("Unknown Variant: " + c37585g);
            }
            c11105aM15951a = AbstractC5079a0.m15952b(num.intValue());
        }
        return new C37589k(c37586h, c11105a, c11105aM15951a, num);
    }

    @Override // gs.AbstractC16123b
    /* JADX INFO: renamed from: V */
    public final C11105a mo45678V() {
        return this.f160746d;
    }

    @Override // gs.AbstractC16123b, p505ts.AbstractC34132o
    /* JADX INFO: renamed from: z */
    public final Integer mo16076z() {
        return this.f160747e;
    }
}
