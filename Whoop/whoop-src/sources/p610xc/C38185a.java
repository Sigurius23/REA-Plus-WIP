package p610xc;

import gf.InterfaceC15761b;
import java.io.IOException;
import p579wc.C37074c;
import p647yf.AbstractC39506s;
import s83.AbstractC32269c;
import ve.InterfaceC35918c;

/* JADX INFO: renamed from: xc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C38185a extends AbstractC39506s implements InterfaceC35918c {

    /* JADX INFO: renamed from: y */
    public final C37074c f163500y;

    public C38185a(C37074c c37074c) {
        super(c37074c);
        this.f163500y = c37074c;
    }

    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) {
        return this.f163500y.f158605E.mo79294b(interfaceC15761b, abstractC32269c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f163500y.close();
    }
}
