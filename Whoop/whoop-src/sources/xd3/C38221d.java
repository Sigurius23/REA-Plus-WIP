package xd3;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import ne3.InterfaceC26633p0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37172f;

/* JADX INFO: renamed from: xd3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C38221d implements Closeable {

    /* JADX INFO: renamed from: w */
    public final String f163824w;

    /* JADX INFO: renamed from: x */
    public final long f163825x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f163826y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C38223f f163827z;

    public C38221d(C38223f c38223f, String key, long j7, ArrayList arrayList, long[] lengths) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(lengths, "lengths");
        this.f163827z = c38223f;
        this.f163824w = key;
        this.f163825x = j7;
        this.f163826y = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f163826y.iterator();
        while (it.hasNext()) {
            AbstractC37172f.m119117b((InterfaceC26633p0) it.next());
        }
    }
}
