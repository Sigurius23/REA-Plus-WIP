package i92;

import com.whoop.network.exception.DomainException;
import com.whoop.network.exception.HttpDomainException;
import e50.C12723b;
import java.io.IOException;
import p000.AbstractC11266d;
import qr2.AbstractC30556a;
import retrofit2.HttpException;
import tr2.C34117o;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: i92.k */
/* JADX INFO: loaded from: classes10.dex */
public class C18266k {

    /* JADX INFO: renamed from: a */
    private DomainException.InterfaceC9606b f71099a;

    /* JADX INFO: renamed from: b */
    private final Throwable f71100b;

    /* JADX INFO: renamed from: c */
    private InterfaceC34116n f71101c;

    public C18266k(Throwable th3) {
        this(th3, new C34117o(C12723b.m35566a().m35569d(), "RetrofitExceptionConverter"));
    }

    /* JADX INFO: renamed from: a */
    private String m52618a(HttpException httpException) {
        try {
            return httpException.f128922y.f118271c.m109860m();
        } catch (IOException unused) {
            return "could not read response body";
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC34116n m52619b() {
        return this.f71101c;
    }

    /* JADX INFO: renamed from: c */
    public DomainException.InterfaceC9606b m52620c() {
        return this.f71099a;
    }

    /* JADX INFO: renamed from: d */
    public Throwable m52621d() {
        return this.f71100b;
    }

    /* JADX INFO: renamed from: e */
    public DomainException m52622e() {
        Throwable thM52621d = m52621d();
        return thM52621d instanceof HttpException ? new HttpDomainException((HttpException) thM52621d) : new DomainException(m52620c(), m52621d());
    }

    public C18266k(Throwable th3, InterfaceC34116n interfaceC34116n) {
        this.f71099a = DomainException.EnumC9607c.UNKNOWN;
        this.f71101c = new C34117o(interfaceC34116n, "RetrofitExceptionConverter");
        this.f71100b = th3;
        if (th3 instanceof IOException) {
            this.f71099a = DomainException.EnumC9607c.NETWORK_ERROR;
        }
        if (th3 instanceof HttpException) {
            HttpException httpException = (HttpException) th3;
            int i13 = httpException.f128920w;
            if (i13 == 428) {
                this.f71099a = DomainException.EnumC9607c.MEMBERSHIP_ERROR;
                m52619b().mo85222m("Network error: Check Membership Status", new AbstractC30556a.a[0]);
                return;
            }
            this.f71099a = DomainException.EnumC9607c.HTTP_ERROR;
            InterfaceC34116n interfaceC34116nM52619b = m52619b();
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Response status = ", ",  response body = ");
            sbM30466t.append(m52618a(httpException));
            interfaceC34116nM52619b.mo85222m(sbM30466t.toString(), new AbstractC30556a.a[0]);
        }
    }
}
