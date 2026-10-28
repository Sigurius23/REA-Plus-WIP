package pg3;

import java.util.Objects;

/* JADX INFO: renamed from: pg3.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29188g0 extends AbstractC29184e1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f118168c;

    /* JADX INFO: renamed from: d */
    public final String f118169d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC29201n f118170e;

    /* JADX INFO: renamed from: f */
    public final boolean f118171f;

    public C29188g0(String str, InterfaceC29201n interfaceC29201n, boolean z4, int i13) {
        this.f118168c = i13;
        switch (i13) {
            case 1:
                Objects.requireNonNull(str, "name == null");
                this.f118169d = str;
                this.f118170e = interfaceC29201n;
                this.f118171f = z4;
                break;
            default:
                Objects.requireNonNull(str, "name == null");
                this.f118169d = str;
                this.f118170e = interfaceC29201n;
                this.f118171f = z4;
                break;
        }
    }

    @Override // pg3.AbstractC29184e1
    /* JADX INFO: renamed from: a */
    public final void mo88679a(C29212s0 c29212s0, Object obj) {
        String str;
        String str2;
        switch (this.f118168c) {
            case 0:
                if (obj != null && (str = (String) this.f118170e.convert(obj)) != null) {
                    c29212s0.m88717a(this.f118169d, str, this.f118171f);
                }
                break;
            default:
                if (obj != null && (str2 = (String) this.f118170e.convert(obj)) != null) {
                    c29212s0.m88718b(this.f118169d, str2, this.f118171f);
                }
                break;
        }
    }
}
