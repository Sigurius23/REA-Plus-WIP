package ws;

import com.google.crypto.tink.internal.AbstractC5078a;
import gs.AbstractC16123b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p154fs.C14738p;
import ro.C31624i;

/* JADX INFO: renamed from: ws.i */
/* JADX INFO: loaded from: classes.dex */
public final class C37587i extends AbstractC16123b {

    /* JADX INFO: renamed from: b */
    public final C37589k f160736b;

    /* JADX INFO: renamed from: c */
    public final C31624i f160737c;

    public C37587i(C37589k c37589k, C31624i c31624i) {
        super(5);
        this.f160736b = c37589k;
        this.f160737c = c31624i;
    }

    /* JADX INFO: renamed from: Y */
    public static C37587i m120651Y(C37589k c37589k, C31624i c31624i) throws GeneralSecurityException {
        if (c31624i.m97702E() == 32) {
            if (Arrays.equals(c37589k.f160745c.m30035b(), AbstractC5078a.m15943p(AbstractC5078a.m15935h(c31624i.m97703F(C14738p.f54475a))))) {
                return new C37587i(c37589k, c31624i);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + c31624i.m97702E());
    }

    @Override // gs.AbstractC16123b
    /* JADX INFO: renamed from: X */
    public final AbstractC16123b mo45680X() {
        return this.f160736b;
    }
}
