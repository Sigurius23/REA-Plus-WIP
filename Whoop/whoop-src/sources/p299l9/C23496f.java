package p299l9;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;
import p284ko.C22631o;
import p516u8.AbstractC34609o0;
import p516u8.C34607n0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C23496f extends AbstractC23504h1 {

    /* JADX INFO: renamed from: l */
    public final long f93004l;

    /* JADX INFO: renamed from: m */
    public final boolean f93005m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f93006n;

    /* JADX INFO: renamed from: o */
    public final C34607n0 f93007o;

    /* JADX INFO: renamed from: p */
    public C23493e f93008p;

    /* JADX INFO: renamed from: q */
    public ClippingMediaSource$IllegalClippingException f93009q;

    /* JADX INFO: renamed from: r */
    public long f93010r;

    /* JADX INFO: renamed from: s */
    public long f93011s;

    public C23496f(C23490d c23490d) {
        super(c23490d.f92984a);
        this.f93004l = c23490d.f92985b;
        this.f93005m = c23490d.f92986c;
        this.f93006n = new ArrayList();
        this.f93007o = new C34607n0();
    }

    /* JADX INFO: renamed from: B */
    public final void m68056B(AbstractC34609o0 abstractC34609o0) {
        long j7;
        C34607n0 c34607n0 = this.f93007o;
        abstractC34609o0.m109407n(0, c34607n0);
        long j13 = c34607n0.f145716p;
        C23493e c23493e = this.f93008p;
        long j14 = this.f93004l;
        ArrayList arrayList = this.f93006n;
        if (c23493e == null || arrayList.isEmpty()) {
            this.f93010r = j13;
            this.f93011s = j14 != Long.MIN_VALUE ? j13 + j14 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C23487c c23487c = (C23487c) arrayList.get(i13);
                long j15 = this.f93010r;
                long j16 = this.f93011s;
                c23487c.f92969E = j15;
                c23487c.f92970F = j16;
            }
            j7 = 0;
        } else {
            j7 = this.f93010r - j13;
            j14 = j14 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f93011s - j13;
        }
        try {
            C23493e c23493e2 = new C23493e(abstractC34609o0, j7, j14);
            this.f93008p = c23493e2;
            m68048l(c23493e2);
        } catch (ClippingMediaSource$IllegalClippingException e5) {
            this.f93009q = e5;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((C23487c) arrayList.get(i14)).f92971G = this.f93009q;
            }
        }
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: a */
    public final InterfaceC23482a0 mo36144a(C23488c0 c23488c0, C22631o c22631o, long j7) {
        C23487c c23487c = new C23487c(this.f93036k.mo36144a(c23488c0, c22631o, j7), this.f93005m, this.f93010r, this.f93011s);
        this.f93006n.add(c23487c);
        return c23487c;
    }

    @Override // p299l9.AbstractC23507j, p299l9.AbstractC23481a
    /* JADX INFO: renamed from: i */
    public final void mo36146i() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f93009q;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.mo36146i();
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: m */
    public final void mo36148m(InterfaceC23482a0 interfaceC23482a0) {
        ArrayList arrayList = this.f93006n;
        AbstractC35849g.m113807i(arrayList.remove(interfaceC23482a0));
        this.f93036k.mo36148m(((C23487c) interfaceC23482a0).f92972w);
        if (arrayList.isEmpty()) {
            C23493e c23493e = this.f93008p;
            c23493e.getClass();
            m68056B(c23493e.f93108b);
        }
    }

    @Override // p299l9.AbstractC23507j, p299l9.AbstractC23481a
    /* JADX INFO: renamed from: o */
    public final void mo36149o() {
        super.mo36149o();
        this.f93009q = null;
        this.f93008p = null;
    }

    @Override // p299l9.AbstractC23504h1
    /* JADX INFO: renamed from: y */
    public final void mo68057y(AbstractC34609o0 abstractC34609o0) {
        if (this.f93009q != null) {
            return;
        }
        m68056B(abstractC34609o0);
    }
}
