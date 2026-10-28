package og3;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: og3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C27924c {

    /* JADX INFO: renamed from: a */
    public final String f112626a;

    /* JADX INFO: renamed from: b */
    public final String[] f112627b;

    /* JADX INFO: renamed from: c */
    public final short[] f112628c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceArray f112629d;

    public C27924c(String str, String[] strArr, short[] sArr, AtomicReferenceArray atomicReferenceArray) {
        this.f112629d = atomicReferenceArray;
        this.f112626a = str;
        this.f112627b = strArr;
        this.f112628c = sArr;
    }

    public final String toString() {
        return this.f112626a;
    }
}
