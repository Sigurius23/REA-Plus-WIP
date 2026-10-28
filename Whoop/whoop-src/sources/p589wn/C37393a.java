package p589wn;

import ai.C0904j;
import android.net.Uri;
import android.os.SystemClock;
import bb.C2919f;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: wn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C37393a implements InterfaceC37409q {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C37395c f159978w;

    public C37393a(C37395c c37395c) {
        this.f159978w = c37395c;
    }

    @Override // p589wn.InterfaceC37409q
    /* JADX INFO: renamed from: l */
    public final boolean mo115123l(Uri uri, C0904j c0904j, boolean z4) {
        C37394b c37394b;
        int i13;
        C37395c c37395c = this.f159978w;
        HashMap map = c37395c.f160004z;
        if (c37395c.f159998L == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C37405m c37405m = c37395c.f159996J;
            int i14 = AbstractC24567y.f95875a;
            List list = c37405m.f160058e;
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                C37394b c37394b2 = (C37394b) map.get(((C37404l) list.get(i16)).f160050a);
                if (c37394b2 != null && jElapsedRealtime < c37394b2.f159982H) {
                    i15++;
                }
            }
            int size = c37395c.f159996J.f160058e.size();
            c37395c.f160003y.getClass();
            IOException iOException = (IOException) c0904j.f3302x;
            C2919f c2919f = ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i13 = ((HttpDataSource$InvalidResponseCodeException) iOException).f20438y) == 403 || i13 == 404 || i13 == 410 || i13 == 416 || i13 == 500 || i13 == 503) && size - i15 > 1) ? new C2919f(2, 60000L, 2) : null;
            if (c2919f != null && c2919f.f11740a == 2 && (c37394b = (C37394b) map.get(uri)) != null) {
                C37394b.m119747a(c37394b, c2919f.f11741b);
            }
        }
        return false;
    }

    @Override // p589wn.InterfaceC37409q
    /* JADX INFO: renamed from: o */
    public final void mo115124o() {
        this.f159978w.f159991E.remove(this);
    }
}
