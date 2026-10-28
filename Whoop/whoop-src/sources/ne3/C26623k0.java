package ne3;

import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26623k0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f105874a;

    /* JADX INFO: renamed from: b */
    public int f105875b;

    /* JADX INFO: renamed from: c */
    public int f105876c;

    /* JADX INFO: renamed from: d */
    public boolean f105877d;

    /* JADX INFO: renamed from: e */
    public final boolean f105878e;

    /* JADX INFO: renamed from: f */
    public C26623k0 f105879f;

    /* JADX INFO: renamed from: g */
    public C26623k0 f105880g;

    public C26623k0() {
        this.f105874a = new byte[DfuBaseService.ERROR_REMOTE_MASK];
        this.f105878e = true;
        this.f105877d = false;
    }

    /* JADX INFO: renamed from: a */
    public final C26623k0 m79243a() {
        C26623k0 c26623k0 = this.f105879f;
        if (c26623k0 == this) {
            c26623k0 = null;
        }
        C26623k0 c26623k1 = this.f105880g;
        AbstractC22676k.m65747g(c26623k1);
        c26623k1.f105879f = this.f105879f;
        C26623k0 c26623k2 = this.f105879f;
        AbstractC22676k.m65747g(c26623k2);
        c26623k2.f105880g = this.f105880g;
        this.f105879f = null;
        this.f105880g = null;
        return c26623k0;
    }

    /* JADX INFO: renamed from: b */
    public final void m79244b(C26623k0 segment) {
        AbstractC22676k.m65750j(segment, "segment");
        segment.f105880g = this;
        segment.f105879f = this.f105879f;
        C26623k0 c26623k0 = this.f105879f;
        AbstractC22676k.m65747g(c26623k0);
        c26623k0.f105880g = segment;
        this.f105879f = segment;
    }

    /* JADX INFO: renamed from: c */
    public final C26623k0 m79245c() {
        this.f105877d = true;
        return new C26623k0(this.f105874a, this.f105875b, this.f105876c, true, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m79246d(C26623k0 sink, int i13) {
        AbstractC22676k.m65750j(sink, "sink");
        byte[] bArr = sink.f105874a;
        if (!sink.f105878e) {
            throw new IllegalStateException("only owner can write");
        }
        int i14 = sink.f105876c;
        int i15 = i14 + i13;
        if (i15 > 8192) {
            if (sink.f105877d) {
                throw new IllegalArgumentException();
            }
            int i16 = sink.f105875b;
            if (i15 - i16 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC25260n.m74067h0(i16, i14, 2, bArr, bArr);
            sink.f105876c -= sink.f105875b;
            sink.f105875b = 0;
        }
        int i17 = sink.f105876c;
        int i18 = this.f105875b;
        AbstractC25260n.m74060c0(i17, i18, i18 + i13, this.f105874a, bArr);
        sink.f105876c += i13;
        this.f105875b += i13;
    }

    public C26623k0(byte[] data, int i13, int i14, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(data, "data");
        this.f105874a = data;
        this.f105875b = i13;
        this.f105876c = i14;
        this.f105877d = z4;
        this.f105878e = z13;
    }
}
