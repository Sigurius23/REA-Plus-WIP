package ud3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import ne3.C26637r0;
import ne3.C26645y;
import ne3.InterfaceC26618i;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: ud3.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34834p0 extends AbstractC34846v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C34818h0 f146718a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f146719b;

    public C34834p0(File file, C34818h0 c34818h0) {
        this.f146718a = c34818h0;
        this.f146719b = file;
    }

    @Override // ud3.AbstractC34846v0
    public final long contentLength() {
        return this.f146719b.length();
    }

    @Override // ud3.AbstractC34846v0
    public final C34818h0 contentType() {
        return this.f146718a;
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i interfaceC26618i) throws IOException {
        File file = this.f146719b;
        AbstractC22676k.m65750j(file, "<this>");
        C26645y c26645y = new C26645y(new FileInputStream(file), C26637r0.f105903d);
        try {
            interfaceC26618i.mo79189N0(c26645y);
            c26645y.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(c26645y, th3);
                throw th4;
            }
        }
    }
}
