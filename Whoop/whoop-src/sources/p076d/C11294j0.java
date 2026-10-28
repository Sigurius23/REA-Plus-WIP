package p076d;

import java.io.IOException;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Map;
import live.hms.video.factories.MediaConstraintsFactory;
import p582wg.AbstractC37249b;
import p582wg.C37248a;
import ro.C31624i;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: d.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11294j0 extends AbstractC11272b1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f36222a;

    public C11294j0(byte[] bArr) {
        if (m30509l(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f36222a = bArr;
        int length = bArr.length - 1;
        int i13 = 0;
        while (i13 < length) {
            byte b = bArr[i13];
            i13++;
            if (b != (bArr[i13] >> 7)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m30509l(byte[] bArr) {
        boolean zEqualsIgnoreCase;
        Map map;
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length == 1) {
            return false;
        }
        if (bArr[0] == (bArr[1] >> 7)) {
            ThreadLocal threadLocal = AbstractC37249b.f159366a;
            try {
                String str = (String) AccessController.doPrivileged(new C37248a(0));
                if (str == null && ((map = (Map) AbstractC37249b.f159366a.get()) == null || (str = (String) map.get("org.bouncyseoncastle.asn1.allow_unsafe_integer")) == null)) {
                    str = (String) AccessController.doPrivileged(new C37248a(1));
                }
                zEqualsIgnoreCase = MediaConstraintsFactory.kValueTrue.equalsIgnoreCase(str);
            } catch (AccessControlException unused) {
                zEqualsIgnoreCase = false;
            }
            if (!zEqualsIgnoreCase) {
                return true;
            }
        }
        return false;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return C31624i.m97696b(this.f36222a.length, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97707f(2, z4, this.f36222a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (abstractC11272b1 instanceof C11294j0) {
            return Arrays.equals(this.f36222a, ((C11294j0) abstractC11272b1).f36222a);
        }
        return false;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return false;
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        return AbstractC32103e.m99883e(this.f36222a);
    }

    /* JADX INFO: renamed from: m */
    public final BigInteger m30510m() {
        return new BigInteger(this.f36222a);
    }

    public final String toString() {
        return m30510m().toString();
    }
}
