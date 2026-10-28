package gm;

import f93.C14289a;
import java.io.Closeable;
import k83.InterfaceC22297a;
import p344nm.C26823e;
import p344nm.C26827i;
import p344nm.InterfaceC26822d;

/* JADX INFO: renamed from: gm.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C15983k implements Closeable {

    /* JADX INFO: renamed from: E */
    public InterfaceC22297a f60492E;

    /* JADX INFO: renamed from: F */
    public InterfaceC22297a f60493F;

    /* JADX INFO: renamed from: w */
    public InterfaceC22297a f60494w;

    /* JADX INFO: renamed from: x */
    public C14289a f60495x;

    /* JADX INFO: renamed from: y */
    public InterfaceC22297a f60496y;

    /* JADX INFO: renamed from: z */
    public C26823e f60497z;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C26827i) ((InterfaceC26822d) this.f60492E.get())).close();
    }
}
