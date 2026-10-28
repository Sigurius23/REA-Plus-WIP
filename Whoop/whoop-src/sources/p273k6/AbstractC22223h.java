package p273k6;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: renamed from: k6.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22223h {
    /* JADX INFO: renamed from: a */
    public static void m63714a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    /* JADX INFO: renamed from: b */
    public static FileDescriptor m63715b(FileDescriptor fileDescriptor) throws ErrnoException {
        return Os.dup(fileDescriptor);
    }

    /* JADX INFO: renamed from: c */
    public static long m63716c(FileDescriptor fileDescriptor, long j7, int i13) throws ErrnoException {
        return Os.lseek(fileDescriptor, j7, i13);
    }
}
