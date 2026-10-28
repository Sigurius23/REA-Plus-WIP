package p589wn;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import bb.C2919f;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import com.whoop.service.network.model.UserSessionDto;
import g73.C15556d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import live.hms.video.error.ErrorCodes;
import p284ko.C22611c0;
import p284ko.C22615e0;
import p284ko.InterfaceC22607a0;
import p284ko.InterfaceC22641y;
import p309lo.AbstractC24567y;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p508ty.C34249c;
import p537ux.C35331f0;
import sn.C32745m;
import sn.C32770z;
import vn.C36181l;

/* JADX INFO: renamed from: wn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C37395c implements InterfaceC22641y {

    /* JADX INFO: renamed from: O */
    public static final C35331f0 f159990O = new C35331f0(4);

    /* JADX INFO: renamed from: F */
    public C32770z f159992F;

    /* JADX INFO: renamed from: G */
    public C22611c0 f159993G;

    /* JADX INFO: renamed from: H */
    public Handler f159994H;

    /* JADX INFO: renamed from: I */
    public C36181l f159995I;

    /* JADX INFO: renamed from: J */
    public C37405m f159996J;

    /* JADX INFO: renamed from: K */
    public Uri f159997K;

    /* JADX INFO: renamed from: L */
    public C37402j f159998L;

    /* JADX INFO: renamed from: M */
    public boolean f159999M;

    /* JADX INFO: renamed from: w */
    public final C34249c f160001w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC37408p f160002x;

    /* JADX INFO: renamed from: y */
    public final C15556d f160003y;

    /* JADX INFO: renamed from: E */
    public final CopyOnWriteArrayList f159991E = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: z */
    public final HashMap f160004z = new HashMap();

    /* JADX INFO: renamed from: N */
    public long f160000N = -9223372036854775807L;

    public C37395c(C34249c c34249c, C15556d c15556d, InterfaceC37408p interfaceC37408p) {
        this.f160001w = c34249c;
        this.f160002x = interfaceC37408p;
        this.f160003y = c15556d;
    }

    /* JADX INFO: renamed from: a */
    public final C37402j m119751a(boolean z4, Uri uri) {
        HashMap map = this.f160004z;
        C37402j c37402j = ((C37394b) map.get(uri)).f159989z;
        if (c37402j != null && z4 && !uri.equals(this.f159997K)) {
            List list = this.f159996J.f160058e;
            for (int i13 = 0; i13 < list.size(); i13++) {
                if (uri.equals(((C37404l) list.get(i13)).f160050a)) {
                    C37402j c37402j2 = this.f159998L;
                    if (c37402j2 != null && c37402j2.f160039o) {
                        break;
                    }
                    this.f159997K = uri;
                    C37394b c37394b = (C37394b) map.get(uri);
                    C37402j c37402j3 = c37394b.f159989z;
                    if (c37402j3 == null || !c37402j3.f160039o) {
                        c37394b.m119749d(m119752b(uri));
                        return c37402j;
                    }
                    this.f159998L = c37402j3;
                    this.f159995I.m115128q(c37402j3);
                    return c37402j;
                }
            }
        }
        return c37402j;
    }

    /* JADX INFO: renamed from: b */
    public final Uri m119752b(Uri uri) {
        C37398f c37398f;
        C37402j c37402j = this.f159998L;
        if (c37402j == null || !c37402j.f160046v.f160027e || (c37398f = (C37398f) c37402j.f160044t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c37398f.f160008b));
        int i13 = c37398f.f160009c;
        if (i13 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i13));
        }
        return builderBuildUpon.build();
    }

    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: c */
    public final void mo65586c(InterfaceC22607a0 interfaceC22607a0) {
        C37405m c37405m;
        C22615e0 c22615e0 = (C22615e0) interfaceC22607a0;
        AbstractC37406n abstractC37406n = (AbstractC37406n) c22615e0.f88966f;
        boolean z4 = abstractC37406n instanceof C37402j;
        if (z4) {
            String str = abstractC37406n.f160067a;
            C37405m c37405m2 = C37405m.f160056n;
            Uri uri = Uri.parse(str);
            C31518b0 c31518b0 = new C31518b0();
            c31518b0.f130037a = UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE;
            c31518b0.f130046j = "application/x-mpegURL";
            List listSingletonList = Collections.singletonList(new C37404l(uri, new C31521c0(c31518b0), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            c37405m = new C37405m("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            c37405m = (C37405m) abstractC37406n;
        }
        this.f159996J = c37405m;
        this.f159997K = ((C37404l) c37405m.f160058e.get(0)).f160050a;
        this.f159991E.add(new C37393a(this));
        List list2 = c37405m.f160057d;
        int size = list2.size();
        for (int i13 = 0; i13 < size; i13++) {
            Uri uri2 = (Uri) list2.get(i13);
            this.f160004z.put(uri2, new C37394b(this, uri2));
        }
        Uri uri3 = c22615e0.f88964d.f88998y;
        C32745m c32745m = new C32745m();
        C37394b c37394b = (C37394b) this.f160004z.get(this.f159997K);
        if (z4) {
            c37394b.m119750e((C37402j) abstractC37406n);
        } else {
            c37394b.m119749d(c37394b.f159986w);
        }
        this.f160003y.getClass();
        this.f159992F.m102763e(c32745m, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m119753d(Uri uri) {
        int i13;
        C37394b c37394b = (C37394b) this.f160004z.get(uri);
        if (c37394b.f159989z == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, AbstractC24567y.m71669G(c37394b.f159989z.f160045u));
        C37402j c37402j = c37394b.f159989z;
        return c37402j.f160039o || (i13 = c37402j.f160028d) == 2 || i13 == 1 || c37394b.f159979E + jMax > jElapsedRealtime;
    }

    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: p */
    public final void mo65587p(InterfaceC22607a0 interfaceC22607a0, boolean z4) {
        C22615e0 c22615e0 = (C22615e0) interfaceC22607a0;
        long j7 = c22615e0.f88961a;
        Uri uri = c22615e0.f88964d.f88998y;
        C32745m c32745m = new C32745m();
        this.f160003y.getClass();
        this.f159992F.m102761c(c32745m, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: q */
    public final C2919f mo65588q(InterfaceC22607a0 interfaceC22607a0, IOException iOException, int i13) {
        long jMin;
        C22615e0 c22615e0 = (C22615e0) interfaceC22607a0;
        long j7 = c22615e0.f88961a;
        Uri uri = c22615e0.f88964d.f88998y;
        C32745m c32745m = new C32745m();
        int i14 = c22615e0.f88963c;
        this.f160003y.getClass();
        if (!(iOException instanceof ParserException) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException instanceof Loader$UnexpectedLoaderException)) {
            int i15 = DataSourceException.f20436x;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i13 - 1) * 1000, ErrorCodes.WebsocketMethodErrors.cServerErrors);
                    break;
                }
                if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f20437w == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        boolean z4 = jMin == -9223372036854775807L;
        this.f159992F.m102765g(c32745m, i14, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z4);
        return z4 ? C22611c0.f88956f : new C2919f(0, jMin, (byte) 0);
    }
}
