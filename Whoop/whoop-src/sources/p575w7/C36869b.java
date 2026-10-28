package p575w7;

import android.os.Parcel;
import android.os.SharedMemory;
import android.system.OsConstants;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: w7.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C36869b {

    /* JADX INFO: renamed from: a */
    public static final C36869b f157707a = new C36869b();

    /* JADX INFO: renamed from: a */
    public final <U> U m118255a(Parcel source, Function1 parser) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(parser, "parser");
        Closeable closeable = (Closeable) SharedMemory.CREATOR.createFromParcel(source);
        try {
            ByteBuffer byteBufferMapReadOnly = ((SharedMemory) closeable).mapReadOnly();
            AbstractC22676k.m65749i(byteBufferMapReadOnly, "memory.mapReadOnly()");
            byte[] bArr = new byte[byteBufferMapReadOnly.remaining()];
            byteBufferMapReadOnly.get(bArr);
            U u3 = (U) parser.invoke(bArr);
            AbstractC35854l.m113829i(closeable, null);
            return u3;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(closeable, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m118256b(String name, byte[] bytes, Parcel dest, int i13) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(bytes, "bytes");
        AbstractC22676k.m65750j(dest, "dest");
        SharedMemory sharedMemoryCreate = SharedMemory.create(name, bytes.length);
        try {
            int i14 = OsConstants.PROT_READ;
            sharedMemoryCreate.setProtect(OsConstants.PROT_WRITE | i14);
            sharedMemoryCreate.mapReadWrite().put(bytes);
            sharedMemoryCreate.setProtect(i14);
            sharedMemoryCreate.writeToParcel(dest, i13);
            AbstractC35854l.m113829i(sharedMemoryCreate, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(sharedMemoryCreate, th3);
                throw th4;
            }
        }
    }
}
