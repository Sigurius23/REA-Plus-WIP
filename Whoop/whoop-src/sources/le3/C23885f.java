package le3;

import c93.InterfaceC4339a;
import java.io.IOException;
import ne3.AbstractC26604b;
import ne3.C26610e;
import ne3.C26617h0;
import p319m4.AbstractC25012a;
import wd3.AbstractC37172f;
import xd3.C38223f;
import yd3.AbstractC39470a;

/* JADX INFO: renamed from: le3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C23885f extends AbstractC39470a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f94442e = 2;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f94443f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23885f(String str, InterfaceC4339a interfaceC4339a) {
        super(str, true);
        this.f94443f = interfaceC4339a;
    }

    @Override // yd3.AbstractC39470a
    /* JADX INFO: renamed from: a */
    public final long mo70158a() {
        switch (this.f94442e) {
            case 0:
                C23886g c23886g = (C23886g) this.f94443f;
                try {
                    return c23886g.m70167i() ? 0L : -1L;
                } catch (IOException e5) {
                    C23886g.m70159d(c23886g, e5, null, 2);
                }
                break;
            case 1:
                C38223f c38223f = (C38223f) this.f94443f;
                synchronized (c38223f) {
                    if (c38223f.f163841M && !c38223f.f163842N) {
                        try {
                            c38223f.m122501o0();
                        } catch (IOException unused) {
                            c38223f.f163843O = true;
                        }
                        try {
                            if (c38223f.m122502s()) {
                                c38223f.m122494a0();
                                c38223f.f163838J = 0;
                            }
                        } catch (IOException unused2) {
                            c38223f.f163844P = true;
                            C26617h0 c26617h0 = c38223f.f163836H;
                            if (c26617h0 != null) {
                                AbstractC37172f.m119117b(c26617h0);
                            }
                            c38223f.f163836H = AbstractC26604b.m79157b(new C26610e());
                        }
                    }
                    break;
                }
                return -1L;
            default:
                return ((Number) ((InterfaceC4339a) this.f94443f).invoke()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23885f(C38223f c38223f, String str) {
        super(str, true);
        this.f94443f = c38223f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23885f(C23886g c23886g) {
        super(AbstractC25012a.m73376i(c23886g.f94458n, " writer", new StringBuilder()), true);
        this.f94443f = c23886g;
    }
}
