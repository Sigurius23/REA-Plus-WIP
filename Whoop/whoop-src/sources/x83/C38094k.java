package x83;

import d93.InterfaceC11820a;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p027b3.C2365d3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x83.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C38094k implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public String f163143w;

    /* JADX INFO: renamed from: x */
    public boolean f163144x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2365d3 f163145y;

    public C38094k(C2365d3 c2365d3) {
        this.f163145y = c2365d3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f163143w == null && !this.f163144x) {
            String line = ((BufferedReader) this.f163145y.f9337b).readLine();
            this.f163143w = line;
            if (line == null) {
                this.f163144x = true;
            }
        }
        return this.f163143w != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f163143w;
        this.f163143w = null;
        AbstractC22676k.m65747g(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
