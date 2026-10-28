package io.sentry;

import com.google.crypto.tink.internal.C5101l0;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.j1 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20390j1 {
    /* JADX INFO: renamed from: a */
    void mo56235a(Writer writer, Object obj);

    /* JADX INFO: renamed from: b */
    String mo56236b(ConcurrentHashMap concurrentHashMap);

    /* JADX INFO: renamed from: c */
    C5101l0 mo56237c(BufferedInputStream bufferedInputStream);

    /* JADX INFO: renamed from: d */
    void mo56238d(C5101l0 c5101l0, OutputStream outputStream);

    /* JADX INFO: renamed from: e */
    Object mo56239e(Reader reader, Class cls);
}
