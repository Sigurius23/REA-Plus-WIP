package io.sentry.android.core.anr;

import g73.C15553a;
import io.getstream.chat.android.client.ChatClient;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.cache.tape.AbstractC20289f;
import io.sentry.cache.tape.C20285b;
import io.sentry.cache.tape.C20287d;
import io.sentry.cache.tape.C20292i;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p085d9.C11803t;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: io.sentry.android.core.anr.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20056d implements AutoCloseable {

    /* JADX INFO: renamed from: w */
    public final AbstractC20289f f75351w;

    public C20056d(C20513q6 c20513q6, File file) {
        C20292i c20292i;
        InterfaceC20602v0 logger = c20513q6.getLogger();
        try {
            RandomAccessFile randomAccessFileM56275m = C20292i.m56275m(file);
            try {
                try {
                    c20292i = new C20292i(file, randomAccessFileM56275m, 120);
                } catch (Throwable th3) {
                    randomAccessFileM56275m.close();
                    throw th3;
                }
            } catch (IOException e5) {
                logger.mo16060j(EnumC20436n5.ERROR, "Failed to create stacktrace queue", e5);
                c20292i = null;
            }
        } catch (IOException unused) {
            if (!file.delete()) {
                throw new IOException("Could not delete file");
            }
            RandomAccessFile randomAccessFileM56275m2 = C20292i.m56275m(file);
            try {
                c20292i = new C20292i(file, randomAccessFileM56275m2, 120);
            } catch (Throwable th4) {
                randomAccessFileM56275m2.close();
                throw th4;
            }
        }
        if (c20292i == null) {
            this.f75351w = new C20285b();
        } else {
            this.f75351w = new C20287d(c20292i, new C15553a(8));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m55921b(C20058f c20058f) {
        this.f75351w.mo56270m(c20058f);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f75351w.close();
    }

    /* JADX INFO: renamed from: h */
    public final void m55922h() {
        this.f75351w.clear();
    }

    /* JADX INFO: renamed from: i */
    public final C11803t m55923i() {
        List<C20058f> listM56272F0 = this.f75351w.m56272F0();
        C11803t c11803t = new C11803t();
        c11803t.f38326c = new ArrayList(listM56272F0.size());
        for (C20058f c20058f : listM56272F0) {
            if (c20058f != null) {
                ((ArrayList) c11803t.f38326c).add(c20058f);
            }
        }
        Collections.sort((ArrayList) c11803t.f38326c);
        if (((ArrayList) c11803t.f38326c).isEmpty()) {
            c11803t.f38324a = 0L;
            c11803t.f38325b = 0L;
        } else {
            c11803t.f38324a = ((C20058f) ((ArrayList) c11803t.f38326c).get(0)).f75355x;
            c11803t.f38325b = ((C20058f) AbstractC25012a.m73371d((ArrayList) c11803t.f38326c, 1)).f75355x + ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
        }
        return c11803t;
    }
}
