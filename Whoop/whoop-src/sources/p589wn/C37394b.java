package p589wn;

import ai.C0904j;
import android.net.Uri;
import android.os.SystemClock;
import bb.C2919f;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistResetException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistStuckException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import g73.C15556d;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p284ko.C22611c0;
import p284ko.C22615e0;
import p284ko.InterfaceC22607a0;
import p284ko.InterfaceC22626k;
import p284ko.InterfaceC22628l;
import p284ko.InterfaceC22641y;
import p309lo.AbstractC24567y;
import p450r5.RunnableC30928b;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import sn.C32745m;
import sn.C32770z;

/* JADX INFO: renamed from: wn.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C37394b implements InterfaceC22641y {

    /* JADX INFO: renamed from: E */
    public long f159979E;

    /* JADX INFO: renamed from: F */
    public long f159980F;

    /* JADX INFO: renamed from: G */
    public long f159981G;

    /* JADX INFO: renamed from: H */
    public long f159982H;

    /* JADX INFO: renamed from: I */
    public boolean f159983I;

    /* JADX INFO: renamed from: J */
    public IOException f159984J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C37395c f159985K;

    /* JADX INFO: renamed from: w */
    public final Uri f159986w;

    /* JADX INFO: renamed from: x */
    public final C22611c0 f159987x = new C22611c0("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: y */
    public final InterfaceC22628l f159988y;

    /* JADX INFO: renamed from: z */
    public C37402j f159989z;

    public C37394b(C37395c c37395c, Uri uri) {
        this.f159985K = c37395c;
        this.f159986w = uri;
        this.f159988y = ((InterfaceC22626k) c37395c.f160001w.f143660x).createDataSource();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m119747a(C37394b c37394b, long j7) {
        c37394b.f159982H = SystemClock.elapsedRealtime() + j7;
        Uri uri = c37394b.f159986w;
        C37395c c37395c = c37394b.f159985K;
        if (!uri.equals(c37395c.f159997K)) {
            return false;
        }
        List list = c37395c.f159996J.f160058e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i13 = 0; i13 < size; i13++) {
            C37394b c37394b2 = (C37394b) c37395c.f160004z.get(((C37404l) list.get(i13)).f160050a);
            c37394b2.getClass();
            if (jElapsedRealtime > c37394b2.f159982H) {
                Uri uri2 = c37394b2.f159986w;
                c37395c.f159997K = uri2;
                c37394b2.m119749d(c37395c.m119752b(uri2));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m119748b(Uri uri) {
        C37395c c37395c = this.f159985K;
        C22615e0 c22615e0 = new C22615e0(this.f159988y, uri, c37395c.f160002x.mo106245f(c37395c.f159996J, this.f159989z));
        C15556d c15556d = c37395c.f160003y;
        int i13 = c22615e0.f88963c;
        this.f159987x.m65556d(c22615e0, this, c15556d.m43809h(i13));
        c37395c.f159992F.m102767i(new C32745m(c22615e0.f88962b), i13, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: c */
    public final void mo65586c(InterfaceC22607a0 interfaceC22607a0) {
        C22615e0 c22615e0 = (C22615e0) interfaceC22607a0;
        AbstractC37406n abstractC37406n = (AbstractC37406n) c22615e0.f88966f;
        Uri uri = c22615e0.f88964d.f88998y;
        C32745m c32745m = new C32745m();
        if (abstractC37406n instanceof C37402j) {
            m119750e((C37402j) abstractC37406n);
            this.f159985K.f159992F.m102763e(c32745m, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException parserExceptionM15563b = ParserException.m15563b("Loaded playlist has unexpected type.");
            this.f159984J = parserExceptionM15563b;
            this.f159985K.f159992F.m102765g(c32745m, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, parserExceptionM15563b, true);
        }
        this.f159985K.f160003y.getClass();
    }

    /* JADX INFO: renamed from: d */
    public final void m119749d(Uri uri) {
        this.f159982H = 0L;
        if (this.f159983I) {
            return;
        }
        C22611c0 c22611c0 = this.f159987x;
        if (c22611c0.m65554b() || c22611c0.f88959c != null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = this.f159981G;
        if (jElapsedRealtime >= j7) {
            m119748b(uri);
        } else {
            this.f159983I = true;
            this.f159985K.f159994H.postDelayed(new RunnableC30928b(17, this, uri), j7 - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0273  */
    /* JADX WARN: Code duplicated, block: B:112:0x0280  */
    /* JADX WARN: Code duplicated, block: B:114:0x028c  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0141  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dc A[LOOP:0: B:78:0x01d6->B:80:0x01dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0203  */
    /* JADX WARN: Code duplicated, block: B:88:0x0216  */
    /* JADX WARN: Code duplicated, block: B:90:0x021d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0221  */
    /* JADX WARN: Code duplicated, block: B:95:0x0234 A[LOOP:1: B:93:0x022e->B:95:0x0234, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0248 A[DONT_INVERT] */
    /* JADX INFO: renamed from: e */
    public final void m119750e(C37402j c37402j) {
        boolean z4;
        AbstractC41023g0 abstractC41023g0;
        long j7;
        long j13;
        boolean z13;
        C37402j c37402j2;
        long j14;
        long j15;
        AbstractC41023g0 abstractC41023g1;
        long j16;
        int size;
        int i13;
        C37399g c37399g;
        long j17;
        C37402j c37402j3;
        int i14;
        int i15;
        AbstractC41023g0 abstractC41023g2;
        C37399g c37399g2;
        int i16;
        C37402j c37402j4;
        IOException iOException;
        Uri uriBuild;
        long size2;
        C37402j c37402j5;
        IOException hlsPlaylistTracker$PlaylistStuckException;
        boolean z14;
        C0904j c0904j;
        Iterator it;
        C37402j c37402j6;
        C37401i c37401i;
        long j18;
        C37402j c37402j7;
        C37401i c37401i2;
        Uri.Builder builderBuildUpon;
        C37402j c37402j8;
        C37401i c37401i3;
        String str;
        C37402j c37402j9;
        AbstractC41023g0 abstractC41023g3;
        int size3;
        Iterator it3;
        int size4;
        int size5;
        int size6;
        C37402j c37402j10 = this.f159989z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f159979E = jElapsedRealtime;
        C37395c c37395c = this.f159985K;
        CopyOnWriteArrayList copyOnWriteArrayList = c37395c.f159991E;
        if (c37402j10 != null) {
            long j19 = c37402j.f160035k;
            long j24 = c37402j10.f160035k;
            z4 = j19 > j24 || (j19 >= j24 && ((size4 = c37402j.f160042r.size() - c37402j10.f160042r.size()) == 0 ? (size5 = c37402j.f160043s.size()) > (size6 = c37402j10.f160043s.size()) || (size5 == size6 && c37402j.f160039o && !c37402j10.f160039o) : size4 > 0));
            abstractC41023g0 = c37402j.f160042r;
            j7 = c37402j.f160035k;
            j13 = 0;
            if (z4) {
                copyOnWriteArrayList = copyOnWriteArrayList;
                z13 = true;
                if (c37402j.f160040p) {
                    j14 = c37402j.f160032h;
                } else {
                    c37402j2 = c37395c.f159998L;
                    if (c37402j2 != null) {
                        j14 = c37402j2.f160032h;
                    } else {
                        j14 = 0;
                    }
                    if (c37402j10 == null) {
                        long j25 = c37402j10.f160032h;
                        j15 = c37402j10.f160035k;
                        abstractC41023g1 = c37402j10.f160042r;
                        j16 = j14;
                        size = abstractC41023g1.size();
                        i13 = (int) (j7 - j15);
                        if (i13 < abstractC41023g1.size()) {
                            c37399g = (C37399g) abstractC41023g1.get(i13);
                        } else {
                            c37399g = null;
                        }
                        if (c37399g != null) {
                            j17 = c37399g.f160012E;
                        } else if (size == j7 - j15) {
                            j17 = c37402j10.f160045u;
                        }
                        j14 = j25 + j17;
                    }
                    if (c37402j.f160033i) {
                        i16 = c37402j.f160034j;
                    } else {
                        c37402j3 = c37395c.f159998L;
                        if (c37402j3 != null) {
                            i14 = c37402j3.f160034j;
                        } else {
                            i14 = 0;
                        }
                        if (c37402j10 == null) {
                            i15 = (int) (j7 - c37402j10.f160035k);
                            abstractC41023g2 = c37402j10.f160042r;
                            if (i15 < abstractC41023g2.size()) {
                                c37399g2 = (C37399g) abstractC41023g2.get(i15);
                            } else {
                                c37399g2 = null;
                            }
                            if (c37399g2 != null) {
                                i14 = (c37402j10.f160034j + c37399g2.f160022z) - ((C37399g) abstractC41023g0.get(0)).f160022z;
                            }
                        }
                        i16 = i14;
                    }
                    iOException = null;
                    j7 = j7;
                    c37402j4 = new C37402j(c37402j.f160028d, c37402j.f160067a, c37402j.f160068b, c37402j.f160029e, c37402j.f160031g, j16, true, i16, c37402j.f160035k, c37402j.f160036l, c37402j.f160037m, c37402j.f160038n, c37402j.f160069c, c37402j.f160039o, c37402j.f160040p, c37402j.f160041q, abstractC41023g0, c37402j.f160043s, c37402j.f160046v, c37402j.f160044t);
                }
                j16 = j14;
                if (c37402j.f160033i) {
                    i16 = c37402j.f160034j;
                } else {
                    c37402j3 = c37395c.f159998L;
                    if (c37402j3 != null) {
                        i14 = c37402j3.f160034j;
                    } else {
                        i14 = 0;
                    }
                    if (c37402j10 == null) {
                        i15 = (int) (j7 - c37402j10.f160035k);
                        abstractC41023g2 = c37402j10.f160042r;
                        if (i15 < abstractC41023g2.size()) {
                            c37399g2 = (C37399g) abstractC41023g2.get(i15);
                        } else {
                            c37399g2 = null;
                        }
                        if (c37399g2 != null) {
                            i14 = (c37402j10.f160034j + c37399g2.f160022z) - ((C37399g) abstractC41023g0.get(0)).f160022z;
                        }
                    }
                    i16 = i14;
                }
                iOException = null;
                j7 = j7;
                c37402j4 = new C37402j(c37402j.f160028d, c37402j.f160067a, c37402j.f160068b, c37402j.f160029e, c37402j.f160031g, j16, true, i16, c37402j.f160035k, c37402j.f160036l, c37402j.f160037m, c37402j.f160038n, c37402j.f160069c, c37402j.f160039o, c37402j.f160040p, c37402j.f160041q, abstractC41023g0, c37402j.f160043s, c37402j.f160046v, c37402j.f160044t);
            } else {
                if (c37402j.f160039o) {
                    z13 = true;
                    c37402j4 = c37402j10;
                } else if (c37402j10.f160039o) {
                    c37402j4 = c37402j10;
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    j7 = j7;
                    iOException = null;
                    z13 = true;
                } else {
                    z13 = true;
                    c37402j4 = new C37402j(c37402j10.f160028d, c37402j10.f160067a, c37402j10.f160068b, c37402j10.f160029e, c37402j10.f160031g, c37402j10.f160032h, c37402j10.f160033i, c37402j10.f160034j, c37402j10.f160035k, c37402j10.f160036l, c37402j10.f160037m, c37402j10.f160038n, c37402j10.f160069c, true, c37402j10.f160040p, c37402j10.f160041q, c37402j10.f160042r, c37402j10.f160043s, c37402j10.f160046v, c37402j10.f160044t);
                }
                iOException = null;
            }
            this.f159989z = c37402j4;
            uriBuild = this.f159986w;
            if (c37402j4 != c37402j10) {
                this.f159984J = iOException;
                this.f159980F = jElapsedRealtime;
                if (uriBuild.equals(c37395c.f159997K)) {
                    if (c37395c.f159998L == null) {
                        c37395c.f159999M = !c37402j4.f160039o;
                        c37395c.f160000N = c37402j4.f160032h;
                    }
                    c37395c.f159998L = c37402j4;
                    c37395c.f159995I.m115128q(c37402j4);
                }
                it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC37409q) it3.next()).mo115124o();
                }
            } else if (!c37402j4.f160039o) {
                size2 = j7 + ((long) c37402j.f160042r.size());
                c37402j5 = this.f159989z;
                if (size2 < c37402j5.f160035k) {
                    hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistResetException();
                    z14 = z13;
                } else {
                    if (jElapsedRealtime - this.f159980F > AbstractC24567y.m71669G(c37402j5.f160037m) * 3.5d) {
                        hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistStuckException();
                    } else {
                        hlsPlaylistTracker$PlaylistStuckException = iOException;
                    }
                    z14 = false;
                }
                if (hlsPlaylistTracker$PlaylistStuckException != null) {
                    this.f159984J = hlsPlaylistTracker$PlaylistStuckException;
                    c0904j = new C0904j(hlsPlaylistTracker$PlaylistStuckException, z13 ? 1 : 0);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC37409q) it.next()).mo115123l(uriBuild, c0904j, z14);
                    }
                }
            }
            c37402j6 = this.f159989z;
            c37401i = c37402j6.f160046v;
            j18 = c37402j6.f160037m;
            if (!c37401i.f160027e) {
                if (c37402j6 == c37402j10) {
                    j18 /= 2;
                }
                j13 = j18;
            }
            this.f159981G = AbstractC24567y.m71669G(j13) + jElapsedRealtime;
            if (this.f159989z.f160038n == -9223372036854775807L || uriBuild.equals(c37395c.f159997K)) {
                c37402j7 = this.f159989z;
                if (c37402j7.f160039o) {
                }
                c37401i2 = c37402j7.f160046v;
                if (c37401i2.f160023a == -9223372036854775807L || c37401i2.f160027e) {
                    builderBuildUpon = uriBuild.buildUpon();
                    c37402j8 = this.f159989z;
                    if (c37402j8.f160046v.f160027e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c37402j8.f160035k + ((long) c37402j8.f160042r.size())));
                        c37402j9 = this.f159989z;
                        if (c37402j9.f160038n != -9223372036854775807L) {
                            abstractC41023g3 = c37402j9.f160043s;
                            size3 = abstractC41023g3.size();
                            if (!abstractC41023g3.isEmpty() && ((C37397e) AbstractC41047q.m133279i(abstractC41023g3)).f160006M) {
                                size3--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                        }
                    }
                    c37401i3 = this.f159989z.f160046v;
                    if (c37401i3.f160023a != -9223372036854775807L) {
                        if (c37401i3.f160024b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                m119749d(uriBuild);
            }
            return;
        }
        c37402j.getClass();
        abstractC41023g0 = c37402j.f160042r;
        j7 = c37402j.f160035k;
        j13 = 0;
        if (z4) {
            if (c37402j.f160039o) {
                z13 = true;
                c37402j4 = c37402j10;
            } else if (c37402j10.f160039o) {
                c37402j4 = c37402j10;
                copyOnWriteArrayList = copyOnWriteArrayList;
                j7 = j7;
                iOException = null;
                z13 = true;
            } else {
                z13 = true;
                c37402j4 = new C37402j(c37402j10.f160028d, c37402j10.f160067a, c37402j10.f160068b, c37402j10.f160029e, c37402j10.f160031g, c37402j10.f160032h, c37402j10.f160033i, c37402j10.f160034j, c37402j10.f160035k, c37402j10.f160036l, c37402j10.f160037m, c37402j10.f160038n, c37402j10.f160069c, true, c37402j10.f160040p, c37402j10.f160041q, c37402j10.f160042r, c37402j10.f160043s, c37402j10.f160046v, c37402j10.f160044t);
            }
            iOException = null;
        } else {
            copyOnWriteArrayList = copyOnWriteArrayList;
            z13 = true;
            if (c37402j.f160040p) {
                j14 = c37402j.f160032h;
            } else {
                c37402j2 = c37395c.f159998L;
                if (c37402j2 != null) {
                    j14 = c37402j2.f160032h;
                } else {
                    j14 = 0;
                }
                if (c37402j10 == null) {
                    long j26 = c37402j10.f160032h;
                    j15 = c37402j10.f160035k;
                    abstractC41023g1 = c37402j10.f160042r;
                    j16 = j14;
                    size = abstractC41023g1.size();
                    i13 = (int) (j7 - j15);
                    if (i13 < abstractC41023g1.size()) {
                        c37399g = (C37399g) abstractC41023g1.get(i13);
                    } else {
                        c37399g = null;
                    }
                    if (c37399g != null) {
                        j17 = c37399g.f160012E;
                    } else if (size == j7 - j15) {
                        j17 = c37402j10.f160045u;
                    }
                    j14 = j26 + j17;
                }
                if (c37402j.f160033i) {
                    i16 = c37402j.f160034j;
                } else {
                    c37402j3 = c37395c.f159998L;
                    if (c37402j3 != null) {
                        i14 = c37402j3.f160034j;
                    } else {
                        i14 = 0;
                    }
                    if (c37402j10 == null) {
                        i15 = (int) (j7 - c37402j10.f160035k);
                        abstractC41023g2 = c37402j10.f160042r;
                        if (i15 < abstractC41023g2.size()) {
                            c37399g2 = (C37399g) abstractC41023g2.get(i15);
                        } else {
                            c37399g2 = null;
                        }
                        if (c37399g2 != null) {
                            i14 = (c37402j10.f160034j + c37399g2.f160022z) - ((C37399g) abstractC41023g0.get(0)).f160022z;
                        }
                    }
                    i16 = i14;
                }
                iOException = null;
                j7 = j7;
                c37402j4 = new C37402j(c37402j.f160028d, c37402j.f160067a, c37402j.f160068b, c37402j.f160029e, c37402j.f160031g, j16, true, i16, c37402j.f160035k, c37402j.f160036l, c37402j.f160037m, c37402j.f160038n, c37402j.f160069c, c37402j.f160039o, c37402j.f160040p, c37402j.f160041q, abstractC41023g0, c37402j.f160043s, c37402j.f160046v, c37402j.f160044t);
            }
            j16 = j14;
            if (c37402j.f160033i) {
                i16 = c37402j.f160034j;
            } else {
                c37402j3 = c37395c.f159998L;
                if (c37402j3 != null) {
                    i14 = c37402j3.f160034j;
                } else {
                    i14 = 0;
                }
                if (c37402j10 == null) {
                    i15 = (int) (j7 - c37402j10.f160035k);
                    abstractC41023g2 = c37402j10.f160042r;
                    if (i15 < abstractC41023g2.size()) {
                        c37399g2 = (C37399g) abstractC41023g2.get(i15);
                    } else {
                        c37399g2 = null;
                    }
                    if (c37399g2 != null) {
                        i14 = (c37402j10.f160034j + c37399g2.f160022z) - ((C37399g) abstractC41023g0.get(0)).f160022z;
                    }
                }
                i16 = i14;
            }
            iOException = null;
            j7 = j7;
            c37402j4 = new C37402j(c37402j.f160028d, c37402j.f160067a, c37402j.f160068b, c37402j.f160029e, c37402j.f160031g, j16, true, i16, c37402j.f160035k, c37402j.f160036l, c37402j.f160037m, c37402j.f160038n, c37402j.f160069c, c37402j.f160039o, c37402j.f160040p, c37402j.f160041q, abstractC41023g0, c37402j.f160043s, c37402j.f160046v, c37402j.f160044t);
        }
        this.f159989z = c37402j4;
        uriBuild = this.f159986w;
        if (c37402j4 != c37402j10) {
            this.f159984J = iOException;
            this.f159980F = jElapsedRealtime;
            if (uriBuild.equals(c37395c.f159997K)) {
                if (c37395c.f159998L == null) {
                    c37395c.f159999M = !c37402j4.f160039o;
                    c37395c.f160000N = c37402j4.f160032h;
                }
                c37395c.f159998L = c37402j4;
                c37395c.f159995I.m115128q(c37402j4);
            }
            it3 = copyOnWriteArrayList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC37409q) it3.next()).mo115124o();
            }
        } else if (!c37402j4.f160039o) {
            size2 = j7 + ((long) c37402j.f160042r.size());
            c37402j5 = this.f159989z;
            if (size2 < c37402j5.f160035k) {
                hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistResetException();
                z14 = z13;
            } else {
                if (jElapsedRealtime - this.f159980F > AbstractC24567y.m71669G(c37402j5.f160037m) * 3.5d) {
                    hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistStuckException();
                } else {
                    hlsPlaylistTracker$PlaylistStuckException = iOException;
                }
                z14 = false;
            }
            if (hlsPlaylistTracker$PlaylistStuckException != null) {
                this.f159984J = hlsPlaylistTracker$PlaylistStuckException;
                c0904j = new C0904j(hlsPlaylistTracker$PlaylistStuckException, z13 ? 1 : 0);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC37409q) it.next()).mo115123l(uriBuild, c0904j, z14);
                }
            }
        }
        c37402j6 = this.f159989z;
        c37401i = c37402j6.f160046v;
        j18 = c37402j6.f160037m;
        if (!c37401i.f160027e) {
            if (c37402j6 == c37402j10) {
                j18 /= 2;
            }
            j13 = j18;
        }
        this.f159981G = AbstractC24567y.m71669G(j13) + jElapsedRealtime;
        if (this.f159989z.f160038n == -9223372036854775807L) {
        }
        c37402j7 = this.f159989z;
        if (c37402j7.f160039o) {
            c37401i2 = c37402j7.f160046v;
            if (c37401i2.f160023a == -9223372036854775807L) {
                builderBuildUpon = uriBuild.buildUpon();
                c37402j8 = this.f159989z;
                if (c37402j8.f160046v.f160027e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c37402j8.f160035k + ((long) c37402j8.f160042r.size())));
                    c37402j9 = this.f159989z;
                    if (c37402j9.f160038n != -9223372036854775807L) {
                        abstractC41023g3 = c37402j9.f160043s;
                        size3 = abstractC41023g3.size();
                        if (!abstractC41023g3.isEmpty()) {
                            size3--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                    }
                }
                c37401i3 = this.f159989z.f160046v;
                if (c37401i3.f160023a != -9223372036854775807L) {
                    if (c37401i3.f160024b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            } else {
                builderBuildUpon = uriBuild.buildUpon();
                c37402j8 = this.f159989z;
                if (c37402j8.f160046v.f160027e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c37402j8.f160035k + ((long) c37402j8.f160042r.size())));
                    c37402j9 = this.f159989z;
                    if (c37402j9.f160038n != -9223372036854775807L) {
                        abstractC41023g3 = c37402j9.f160043s;
                        size3 = abstractC41023g3.size();
                        if (!abstractC41023g3.isEmpty()) {
                            size3--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                    }
                }
                c37401i3 = this.f159989z.f160046v;
                if (c37401i3.f160023a != -9223372036854775807L) {
                    if (c37401i3.f160024b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            }
            m119749d(uriBuild);
        }
    }

    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: p */
    public final void mo65587p(InterfaceC22607a0 interfaceC22607a0, boolean z4) {
        C22615e0 c22615e0 = (C22615e0) interfaceC22607a0;
        long j7 = c22615e0.f88961a;
        Uri uri = c22615e0.f88964d.f88998y;
        C32745m c32745m = new C32745m();
        C37395c c37395c = this.f159985K;
        c37395c.f160003y.getClass();
        c37395c.f159992F.m102761c(c32745m, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: q */
    public final C2919f mo65588q(InterfaceC22607a0 interfaceC22607a0, IOException iOException, int i13) {
        C22615e0 c22615e0 = (C22615e0) interfaceC22607a0;
        long j7 = c22615e0.f88961a;
        int i14 = c22615e0.f88963c;
        Uri uri = c22615e0.f88964d.f88998y;
        C32745m c32745m = new C32745m();
        boolean z4 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z13 = iOException instanceof HlsPlaylistParser$DeltaUpdateException;
        C2919f c2919f = C22611c0.f88955e;
        Uri uri2 = this.f159986w;
        C37395c c37395c = this.f159985K;
        if (z4 || z13) {
            int i15 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).f20438y : Integer.MAX_VALUE;
            if (z13 || i15 == 400 || i15 == 503) {
                this.f159981G = SystemClock.elapsedRealtime();
                m119749d(uri2);
                C32770z c32770z = c37395c.f159992F;
                int i16 = AbstractC24567y.f95875a;
                c32770z.m102765g(c32745m, i14, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                return c2919f;
            }
        }
        C0904j c0904j = new C0904j(iOException, i13);
        Iterator it = c37395c.f159991E.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            z14 |= !((InterfaceC37409q) it.next()).mo115123l(uri2, c0904j, false);
        }
        C15556d c15556d = c37395c.f160003y;
        if (z14) {
            c15556d.getClass();
            long jM43805i = C15556d.m43805i(c0904j);
            c2919f = jM43805i != -9223372036854775807L ? new C2919f(0, jM43805i, (byte) 0) : C22611c0.f88956f;
        }
        int i17 = c2919f.f11740a;
        boolean z15 = i17 == 0 || i17 == 1;
        c37395c.f159992F.m102765g(c32745m, i14, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !z15);
        if (!z15) {
            c15556d.getClass();
        }
        return c2919f;
    }
}
