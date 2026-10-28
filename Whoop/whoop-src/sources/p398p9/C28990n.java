package p398p9;

import android.net.Uri;
import java.io.IOException;
import p284ko.C22629m;
import p299l9.C23527t;
import p607x8.AbstractC38065t;
import p674z8.C40171g;
import p674z8.C40177m;
import p674z8.InterfaceC40170f;

/* JADX INFO: renamed from: p9.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C28990n implements InterfaceC28985i {

    /* JADX INFO: renamed from: E */
    public final InterfaceC28989m f117260E;

    /* JADX INFO: renamed from: F */
    public volatile Object f117261F;

    /* JADX INFO: renamed from: w */
    public final long f117262w = C23527t.f93159a.getAndIncrement();

    /* JADX INFO: renamed from: x */
    public final C40171g f117263x;

    /* JADX INFO: renamed from: y */
    public final int f117264y;

    /* JADX INFO: renamed from: z */
    public final C40177m f117265z;

    public C28990n(InterfaceC40170f interfaceC40170f, C40171g c40171g, int i13, InterfaceC28989m interfaceC28989m) {
        this.f117265z = new C40177m(interfaceC40170f);
        this.f117263x = c40171g;
        this.f117264y = i13;
        this.f117260E = interfaceC28989m;
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: b */
    public final void mo68093b() {
        this.f117265z.f173386x = 0L;
        C22629m c22629m = new C22629m(this.f117265z, this.f117263x);
        try {
            ((InterfaceC40170f) c22629m.f89012E).open((C40171g) c22629m.f89013F);
            c22629m.f89016y = true;
            Uri uri = this.f117265z.f173385w.getUri();
            uri.getClass();
            this.f117261F = this.f117260E.mo36141c(uri, c22629m);
        } finally {
            int i13 = AbstractC38065t.f163031a;
            try {
                c22629m.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: c */
    public final void mo68094c() {
    }
}
