package io.sentry.android.core.anr;

import io.sentry.util.AbstractC20591m;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.android.core.anr.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20058f implements Comparable {

    /* JADX INFO: renamed from: w */
    public final StackTraceElement[] f75354w;

    /* JADX INFO: renamed from: x */
    public final long f75355x;

    public C20058f(long j7, StackTraceElement[] stackTraceElementArr) {
        this.f75355x = j7;
        this.f75354w = stackTraceElementArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m55926a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(1);
        dataOutputStream.writeLong(this.f75355x);
        StackTraceElement[] stackTraceElementArr = this.f75354w;
        dataOutputStream.writeInt(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            Charset charset = AbstractC20591m.f77097a;
            String str = "";
            if (className == null) {
                className = "";
            }
            dataOutputStream.writeUTF(className);
            String methodName = stackTraceElement.getMethodName();
            if (methodName == null) {
                methodName = "";
            }
            dataOutputStream.writeUTF(methodName);
            String fileName = stackTraceElement.getFileName();
            dataOutputStream.writeBoolean(fileName == null);
            if (fileName != null) {
                str = fileName;
            }
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeInt(stackTraceElement.getLineNumber());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f75355x, ((C20058f) obj).f75355x);
    }
}
