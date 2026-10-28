package p113ea;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: ea.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C12891b {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f44384a;

    /* JADX INFO: renamed from: b */
    public final DataOutputStream f44385b;

    public C12891b(int i13) {
        switch (i13) {
            case 1:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f44384a = byteArrayOutputStream;
                this.f44385b = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
                this.f44384a = byteArrayOutputStream2;
                this.f44385b = new DataOutputStream(byteArrayOutputStream2);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m36299a(C12890a c12890a) {
        DataOutputStream dataOutputStream = this.f44385b;
        ByteArrayOutputStream byteArrayOutputStream = this.f44384a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(c12890a.f44378a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(c12890a.f44379b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c12890a.f44380c);
            dataOutputStream.writeLong(c12890a.f44381d);
            dataOutputStream.write(c12890a.f44382e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }
}
