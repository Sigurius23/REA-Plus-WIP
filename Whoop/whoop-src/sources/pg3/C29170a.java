package pg3;

import ne3.C26616h;
import ud3.AbstractC34799a1;
import ud3.C34818h0;
import ud3.C34854z0;

/* JADX INFO: renamed from: pg3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C29170a implements InterfaceC29201n {

    /* JADX INFO: renamed from: x */
    public static final C29170a f118126x = new C29170a(0);

    /* JADX INFO: renamed from: y */
    public static final C29170a f118127y = new C29170a(1);

    /* JADX INFO: renamed from: z */
    public static final C29170a f118128z = new C29170a(2);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118129w;

    public /* synthetic */ C29170a(int i13) {
        this.f118129w = i13;
    }

    @Override // pg3.InterfaceC29201n
    public final Object convert(Object obj) {
        switch (this.f118129w) {
            case 0:
                AbstractC34799a1 abstractC34799a1 = (AbstractC34799a1) obj;
                try {
                    C26616h c26616h = new C26616h();
                    abstractC34799a1.mo1940d1().mo79190P0(c26616h);
                    C34818h0 c34818h0Mo1942k = abstractC34799a1.mo1942k();
                    long jMo1941i = abstractC34799a1.mo1941i();
                    C34854z0 c34854z0 = AbstractC34799a1.f146522x;
                    return new C34854z0(c34818h0Mo1942k, jMo1941i, c26616h);
                } finally {
                    abstractC34799a1.close();
                }
            case 1:
                return (AbstractC34799a1) obj;
            default:
                ((AbstractC34799a1) obj).close();
                return null;
        }
    }
}
