package p284ko;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import sn.C32745m;

/* JADX INFO: renamed from: ko.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C22615e0 implements InterfaceC22607a0 {

    /* JADX INFO: renamed from: a */
    public final long f88961a;

    /* JADX INFO: renamed from: b */
    public final C22630n f88962b;

    /* JADX INFO: renamed from: c */
    public final int f88963c;

    /* JADX INFO: renamed from: d */
    public final C22623i0 f88964d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC22613d0 f88965e;

    /* JADX INFO: renamed from: f */
    public volatile Object f88966f;

    public C22615e0(InterfaceC22628l interfaceC22628l, Uri uri, InterfaceC22613d0 interfaceC22613d0) {
        Map map = Collections.EMPTY_MAP;
        AbstractC24543a.m71575k(uri, "The uri must be set.");
        C22630n c22630n = new C22630n(uri, 1, null, map, 0L, -1L, 1);
        this.f88964d = new C22623i0(interfaceC22628l);
        this.f88962b = c22630n;
        this.f88963c = 4;
        this.f88965e = interfaceC22613d0;
        this.f88961a = C32745m.f136165a.getAndIncrement();
    }

    @Override // p284ko.InterfaceC22607a0
    /* JADX INFO: renamed from: b */
    public final void mo65549b() {
        this.f88964d.f88997x = 0L;
        C22629m c22629m = new C22629m(this.f88964d, this.f88962b);
        try {
            c22629m.m65565b();
            Uri uri = this.f88964d.f88996w.getUri();
            uri.getClass();
            this.f88966f = this.f88965e.mo30741c(uri, c22629m);
        } finally {
            int i13 = AbstractC24567y.f95875a;
            try {
                c22629m.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p284ko.InterfaceC22607a0
    /* JADX INFO: renamed from: c */
    public final void mo65550c() {
    }
}
