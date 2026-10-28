package p609xb;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: xb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C38160a {

    /* JADX INFO: renamed from: e */
    public static final HashMap f163407e = new HashMap();

    /* JADX INFO: renamed from: a */
    public final boolean f163408a;

    /* JADX INFO: renamed from: b */
    public final File f163409b;

    /* JADX INFO: renamed from: c */
    public final Lock f163410c;

    /* JADX INFO: renamed from: d */
    public FileChannel f163411d;

    public C38160a(boolean z4, File file, String str) {
        Lock lock;
        this.f163408a = z4;
        this.f163409b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f163407e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f163410c = lock;
    }

    /* JADX INFO: renamed from: a */
    public final void m122224a(boolean z4) {
        this.f163410c.lock();
        if (z4) {
            File file = this.f163409b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f163411d = channel;
            } catch (IOException e5) {
                this.f163411d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e5);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m122225b() {
        try {
            FileChannel fileChannel = this.f163411d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f163410c.unlock();
    }
}
