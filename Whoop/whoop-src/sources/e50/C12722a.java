package e50;

import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.service.network.MembershipApi;
import com.whoop.service.network.MembershipV2Api;
import ge3.AbstractC15751g;
import java.util.concurrent.TimeUnit;
import or2.C28169i0;
import pg3.AbstractC29199m;
import pg3.C29222x0;
import qg3.C30354f;
import rg3.C31410a;
import sr2.AbstractC32943y;
import u82.AbstractC34650k;
import ud3.C34824k0;
import ud3.C34826l0;
import vf3.C35953c;

/* JADX INFO: renamed from: e50.a */
/* JADX INFO: loaded from: classes.dex */
public class C12722a {

    /* JADX INFO: renamed from: a */
    private MembershipApi f43517a;

    /* JADX INFO: renamed from: b */
    private FileDownloaderApi f43518b;

    /* JADX INFO: renamed from: c */
    private final String f43519c;

    /* JADX INFO: renamed from: d */
    private final String f43520d;

    /* JADX INFO: renamed from: e */
    private final String f43521e;

    /* JADX INFO: renamed from: f */
    private C31410a f43522f;

    /* JADX INFO: renamed from: g */
    private final AbstractC29199m f43523g;

    /* JADX INFO: renamed from: h */
    private C30354f f43524h;

    public C12722a(AbstractC32943y abstractC32943y, AbstractC29199m abstractC29199m) {
        this.f43519c = abstractC32943y.getApiBaseUrl();
        this.f43520d = abstractC32943y.getApiBaseUrl() + "/membership/";
        this.f43521e = abstractC32943y.getApiBaseUrl() + "/membership-service/v1/";
        this.f43523g = abstractC29199m;
    }

    /* JADX INFO: renamed from: b */
    private AbstractC29199m m35559b() {
        if (this.f43522f == null) {
            this.f43522f = C31410a.m96728a(C28169i0.m85274d());
        }
        return this.f43522f;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    private C34826l0 m35560c() {
        return (C34826l0) AbstractC15751g.m44472y(C34826l0.class, new C35953c("defaultOkHttpClient"), null);
    }

    /* JADX INFO: renamed from: d */
    private C34826l0 m35561d() {
        C34824k0 c34824k0M109897a = m35560c().m109897a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c34824k0M109897a.m109892b(30L, timeUnit);
        c34824k0M109897a.m109895e(30L, timeUnit);
        c34824k0M109897a.m109896f(30L, timeUnit);
        return new C34826l0(c34824k0M109897a);
    }

    /* JADX INFO: renamed from: g */
    private C30354f m35562g() {
        if (this.f43524h == null) {
            this.f43524h = new C30354f();
        }
        return this.f43524h;
    }

    /* JADX INFO: renamed from: a */
    public FileDownloaderApi m35563a() {
        FileDownloaderApi fileDownloaderApi = this.f43518b;
        if (fileDownloaderApi != null) {
            return fileDownloaderApi;
        }
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(this.f43519c);
        c29222x0.m88728b(AbstractC34650k.m109497d());
        FileDownloaderApi fileDownloaderApi2 = (FileDownloaderApi) c29222x0.m88730d().m88733b(FileDownloaderApi.class);
        this.f43518b = fileDownloaderApi2;
        return fileDownloaderApi2;
    }

    /* JADX INFO: renamed from: e */
    public MembershipApi m35564e() {
        if (this.f43517a == null) {
            C29222x0 c29222x0 = new C29222x0();
            c29222x0.m88731e(m35560c());
            c29222x0.m88729c(this.f43520d);
            c29222x0.m88728b(m35559b());
            c29222x0.m88727a(m35562g());
            this.f43517a = (MembershipApi) c29222x0.m88730d().m88733b(MembershipApi.class);
        }
        return this.f43517a;
    }

    /* JADX INFO: renamed from: f */
    public MembershipV2Api m35565f() {
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88731e(m35561d());
        c29222x0.m88729c(this.f43521e);
        c29222x0.m88728b(this.f43523g);
        c29222x0.m88727a(m35562g());
        return (MembershipV2Api) c29222x0.m88730d().m88733b(MembershipV2Api.class);
    }
}
