package sh;

import ne3.AbstractC26638s;
import ne3.C26616h;
import ne3.InterfaceC26633p0;
import ud3.C34806d;

/* JADX INFO: renamed from: sh.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C32476b extends AbstractC26638s {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f134490x = 0;

    /* JADX INFO: renamed from: y */
    public Object f134491y;

    public /* synthetic */ C32476b(InterfaceC26633p0 interfaceC26633p0) {
        super(interfaceC26633p0);
    }

    @Override // ne3.AbstractC26638s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f134490x) {
            case 1:
                ((C34806d) this.f134491y).f146545y.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // ne3.AbstractC26638s, ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public long mo9164h1(C26616h c26616h, long j7) throws Exception {
        switch (this.f134490x) {
            case 0:
                try {
                    return super.mo9164h1(c26616h, j7);
                } catch (Exception e5) {
                    this.f134491y = e5;
                    throw e5;
                }
            default:
                return super.mo9164h1(c26616h, j7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32476b(InterfaceC26633p0 interfaceC26633p0, C34806d c34806d) {
        super(interfaceC26633p0);
        this.f134491y = c34806d;
    }
}
