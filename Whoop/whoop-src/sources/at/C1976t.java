package at;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: at.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C1976t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7817a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1978v f7818b;

    public /* synthetic */ C1976t(InterfaceC1978v interfaceC1978v, int i13) {
        this.f7817a = i13;
        this.f7818b = interfaceC1978v;
    }

    /* JADX INFO: renamed from: a */
    public final Object m6025a(String str) throws GeneralSecurityException {
        switch (this.f7817a) {
            case 0:
                Iterator it = C1977u.m6027b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
                Exception exc = null;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    InterfaceC1978v interfaceC1978v = this.f7818b;
                    if (!zHasNext) {
                        return interfaceC1978v.mo6029f(str, null);
                    }
                    try {
                        return interfaceC1978v.mo6029f(str, (Provider) it.next());
                    } catch (Exception e5) {
                        if (exc == null) {
                            exc = e5;
                        }
                    }
                }
                break;
            case 1:
                return this.f7818b.mo6029f(str, null);
            default:
                Iterator it3 = C1977u.m6027b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
                Exception exc2 = null;
                while (it3.hasNext()) {
                    try {
                        return this.f7818b.mo6029f(str, (Provider) it3.next());
                    } catch (Exception e13) {
                        if (exc2 == null) {
                            exc2 = e13;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m6026b(String str, ArrayList arrayList) {
        switch (this.f7817a) {
            case 0:
                return m6025a(str);
            case 1:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        return this.f7818b.mo6029f(str, (Provider) it.next());
                    } catch (Exception unused) {
                    }
                }
                return m6025a(str);
            default:
                return m6025a(str);
        }
    }
}
