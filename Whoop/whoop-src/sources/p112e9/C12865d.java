package p112e9;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import bb.C2919f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import live.hms.video.error.ErrorCodes;
import p141f9.C14261c;
import p141f9.C14279u;
import p299l9.C23527t;
import p398p9.C28987k;
import p398p9.C28990n;
import p398p9.InterfaceC28983g;
import p398p9.InterfaceC28985i;
import p398p9.InterfaceC28988l;
import p418q9.AbstractC30067b;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import u00.C34377e;

/* JADX INFO: renamed from: e9.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C12865d implements InterfaceC28983g, InterfaceC28988l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C12869h f44237w;

    /* JADX INFO: renamed from: a */
    public void m36135a() {
        long j7;
        C12869h c12869h = this.f44237w;
        synchronized (AbstractC30067b.f122682b) {
            try {
                j7 = AbstractC30067b.f122683c ? AbstractC30067b.f122684d : -9223372036854775807L;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        c12869h.f44262L = j7;
        c12869h.m36154w(true);
    }

    @Override // p398p9.InterfaceC28988l
    /* JADX INFO: renamed from: c */
    public void mo36136c() throws IOException {
        C12869h c12869h = this.f44237w;
        c12869h.f44251A.mo36136c();
        DashManifestStaleException dashManifestStaleException = c12869h.f44253C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: p */
    public void mo36137p(InterfaceC28985i interfaceC28985i, long j7, long j13) {
        C28990n c28990n = (C28990n) interfaceC28985i;
        C12869h c12869h = this.f44237w;
        long j14 = c28990n.f117262w;
        Uri uri = c28990n.f117265z.f173387y;
        C23527t c23527t = new C23527t();
        c12869h.f44272m.getClass();
        c12869h.f44276q.m43886d(c23527t, c28990n.f117264y, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        C14261c c14261c = (C14261c) c28990n.f117261F;
        C14261c c14261c2 = c12869h.f44258H;
        int size = c14261c2 == null ? 0 : c14261c2.f52074m.size();
        long j15 = c14261c.m40728a(0).f52095b;
        int i13 = 0;
        while (i13 < size && c12869h.f44258H.m40728a(i13).f52095b < j15) {
            i13++;
        }
        if (c14261c.f52065d) {
            if (size - i13 > c14261c.f52074m.size()) {
                AbstractC38046a.m121826u("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j16 = c12869h.f44264N;
                if (j16 == -9223372036854775807L || c14261c.f52069h * 1000 > j16) {
                    c12869h.f44263M = 0;
                } else {
                    AbstractC38046a.m121826u("DashMediaSource", "Loaded stale dynamic manifest: " + c14261c.f52069h + ", " + c12869h.f44264N);
                }
            }
            int i14 = c12869h.f44263M;
            c12869h.f44263M = i14 + 1;
            if (i14 < c12869h.f44272m.m60616q(c28990n.f117264y)) {
                c12869h.f44254D.postDelayed(c12869h.f44281v, Math.min((c12869h.f44263M - 1) * 1000, ErrorCodes.WebsocketMethodErrors.cServerErrors));
                return;
            } else {
                c12869h.f44253C = new DashManifestStaleException();
                return;
            }
        }
        c12869h.f44258H = c14261c;
        c12869h.f44259I = c14261c.f52065d & c12869h.f44259I;
        c12869h.f44260J = j7 - j13;
        c12869h.f44261K = j7;
        c12869h.f44265O += i13;
        synchronized (c12869h.f44279t) {
            try {
                if (c28990n.f117263x.f173343a == c12869h.f44256F) {
                    Uri uri2 = c12869h.f44258H.f52072k;
                    if (uri2 == null) {
                        uri2 = c28990n.f117265z.f173387y;
                    }
                    c12869h.f44256F = uri2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C14261c c14261c3 = c12869h.f44258H;
        if (!c14261c3.f52065d || c12869h.f44262L != -9223372036854775807) {
            c12869h.m36154w(true);
            return;
        }
        C14279u c14279u = c14261c3.f52070i;
        if (c14279u == null) {
            c12869h.m36151t();
            return;
        }
        String str = c14279u.f52138b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                c12869h.f44262L = AbstractC38065t.m121899M(c14279u.f52139c) - c12869h.f44261K;
                c12869h.m36154w(true);
                return;
            } catch (ParserException e5) {
                c12869h.m36153v(e5);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            c12869h.m36155x(c14279u, new C12867f());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            c12869h.m36155x(c14279u, new C34377e(25));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            c12869h.m36151t();
        } else {
            c12869h.m36153v(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: q */
    public void mo36138q(InterfaceC28985i interfaceC28985i, long j7, long j13, boolean z4) {
        this.f44237w.m36152u((C28990n) interfaceC28985i);
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: r */
    public C2919f mo36139r(InterfaceC28985i interfaceC28985i, IOException iOException, int i13) {
        C28990n c28990n = (C28990n) interfaceC28985i;
        long j7 = c28990n.f117262w;
        Uri uri = c28990n.f117265z.f173387y;
        C23527t c23527t = new C23527t();
        int i14 = c28990n.f117264y;
        C12869h c12869h = this.f44237w;
        c12869h.f44272m.getClass();
        long jMin = ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException) || DataSourceException.m5052a(iOException)) ? -9223372036854775807L : Math.min((i13 - 1) * 1000, ErrorCodes.WebsocketMethodErrors.cServerErrors);
        C2919f c2919f = jMin == -9223372036854775807L ? C28987k.f117255E : new C2919f(0, jMin, (byte) 0);
        int i15 = c2919f.f11740a;
        c12869h.f44276q.m43887e(c23527t, i14, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !(i15 == 0 || i15 == 1));
        return c2919f;
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: w */
    public void mo36140w(InterfaceC28985i interfaceC28985i, long j7, int i13) {
        C23527t c23527t;
        C28990n c28990n = (C28990n) interfaceC28985i;
        if (i13 == 0) {
            long j13 = c28990n.f117262w;
            c23527t = new C23527t(c28990n.f117263x);
        } else {
            long j14 = c28990n.f117262w;
            Uri uri = c28990n.f117265z.f173387y;
            c23527t = new C23527t();
        }
        this.f44237w.f44276q.m43888f(c23527t, c28990n.f117264y, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i13);
    }
}
