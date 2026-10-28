package p076d;

import java.io.InputStream;

/* JADX INFO: renamed from: d.p */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11305p extends InputStream {

    /* JADX INFO: renamed from: w */
    public final InputStream f36234w;

    /* JADX INFO: renamed from: x */
    public final int f36235x;

    public AbstractC11305p(InputStream inputStream, int i13) {
        this.f36234w = inputStream;
        this.f36235x = i13;
    }

    /* JADX INFO: renamed from: b */
    public final void m30513b() {
        InputStream inputStream = this.f36234w;
        if (inputStream instanceof C11291i) {
            C11291i c11291i = (C11291i) inputStream;
            c11291i.f36217F = true;
            c11291i.m30508h();
        }
    }
}
