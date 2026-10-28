package p001a;

import java.io.IOException;

/* JADX INFO: renamed from: a.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C0001h extends IOException {

    /* JADX INFO: renamed from: w */
    public final RuntimeException f4w;

    public C0001h(RuntimeException runtimeException, String str) {
        super(str);
        this.f4w = runtimeException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f4w;
    }
}
