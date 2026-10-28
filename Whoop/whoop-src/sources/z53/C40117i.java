package z53;

import io.ktor.utils.p228io.InterfaceC20024q;
import io.ktor.utils.p228io.jvm.javaio.AbstractC20010d;
import ne3.AbstractC26604b;
import ne3.C26645y;
import ne3.InterfaceC26618i;
import p320m5.C25067k;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import ud3.AbstractC34846v0;
import ud3.C34818h0;

/* JADX INFO: renamed from: z53.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C40117i extends AbstractC34846v0 {

    /* JADX INFO: renamed from: a */
    public final Long f173160a;

    /* JADX INFO: renamed from: b */
    public final C25067k f173161b;

    public C40117i(Long l7, C25067k c25067k) {
        this.f173160a = l7;
        this.f173161b = c25067k;
    }

    @Override // ud3.AbstractC34846v0
    public final long contentLength() {
        Long l7 = this.f173160a;
        if (l7 != null) {
            return l7.longValue();
        }
        return -1L;
    }

    @Override // ud3.AbstractC34846v0
    /* JADX INFO: renamed from: contentType */
    public final C34818h0 getContentType() {
        return null;
    }

    @Override // ud3.AbstractC34846v0
    public final boolean isOneShot() {
        return true;
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i interfaceC26618i) throws Throwable {
        Long lValueOf;
        Throwable th3 = null;
        C26645y c26645yM79166k = AbstractC26604b.m79166k(AbstractC20010d.m55815a(null, (InterfaceC20024q) this.f173161b.invoke()));
        try {
            lValueOf = Long.valueOf(interfaceC26618i.mo79189N0(c26645yM79166k));
        } catch (Throwable th4) {
            th3 = th4;
            lValueOf = null;
        }
        try {
            c26645yM79166k.close();
        } catch (Throwable th5) {
            if (th3 == null) {
                th3 = th5;
            } else {
                AbstractC29125c.m88530g(th3, th5);
            }
        }
        if (th3 != null) {
            throw th3;
        }
        AbstractC22676k.m65747g(lValueOf);
    }
}
