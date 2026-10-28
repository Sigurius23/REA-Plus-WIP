package p092dh;

import java.io.IOException;
import ne3.AbstractC26638s;
import ne3.C26616h;
import ne3.InterfaceC26620j;
import ne3.InterfaceC26633p0;
import pg3.C29225z;

/* JADX INFO: renamed from: dh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12015b extends AbstractC26638s {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f39746x = 0;

    /* JADX INFO: renamed from: y */
    public Object f39747y;

    public /* synthetic */ C12015b(InterfaceC26633p0 interfaceC26633p0) {
        super(interfaceC26633p0);
    }

    @Override // ne3.AbstractC26638s, ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h c26616h, long j7) throws Exception {
        switch (this.f39746x) {
            case 0:
                try {
                    return super.mo9164h1(c26616h, j7);
                } catch (Exception e5) {
                    this.f39747y = e5;
                    throw e5;
                }
            default:
                try {
                    return super.mo9164h1(c26616h, j7);
                } catch (IOException e13) {
                    ((C29225z) this.f39747y).f118296E = e13;
                    throw e13;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12015b(C29225z c29225z, InterfaceC26620j interfaceC26620j) {
        super(interfaceC26620j);
        this.f39747y = c29225z;
    }
}
