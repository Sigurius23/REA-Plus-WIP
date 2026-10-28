package ud3;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import ne3.AbstractC26604b;
import ne3.InterfaceC26618i;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: ud3.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C34840s0 extends AbstractC34846v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C34818h0 f146746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FileDescriptor f146747b;

    public C34840s0(FileDescriptor fileDescriptor, C34818h0 c34818h0) {
        this.f146746a = c34818h0;
        this.f146747b = fileDescriptor;
    }

    @Override // ud3.AbstractC34846v0
    /* JADX INFO: renamed from: contentType */
    public final C34818h0 getContentType() {
        return this.f146746a;
    }

    @Override // ud3.AbstractC34846v0
    public final boolean isOneShot() {
        return true;
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i interfaceC26618i) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.f146747b);
        try {
            interfaceC26618i.mo79205f().mo79189N0(AbstractC26604b.m79166k(fileInputStream));
            fileInputStream.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(fileInputStream, th3);
                throw th4;
            }
        }
    }
}
