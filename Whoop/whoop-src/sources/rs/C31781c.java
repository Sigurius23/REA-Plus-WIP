package rs;

import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import p436qs.InterfaceC30561e;

/* JADX INFO: renamed from: rs.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C31781c implements InterfaceC30561e {
    public C31781c(int i13) throws GeneralSecurityException {
        switch (i13) {
            case 1:
                if (!AbstractC18489d0.m53361b(2)) {
                    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                }
                return;
            default:
                if (!AbstractC18489d0.m53360a(1)) {
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                return;
        }
    }
}
