package ud3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import ne3.InterfaceC26620j;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: ud3.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34852y0 extends Reader {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26620j f146793w;

    /* JADX INFO: renamed from: x */
    public final Charset f146794x;

    /* JADX INFO: renamed from: y */
    public boolean f146795y;

    /* JADX INFO: renamed from: z */
    public InputStreamReader f146796z;

    public C34852y0(InterfaceC26620j source, Charset charset) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(charset, "charset");
        this.f146793w = source;
        this.f146794x = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f146795y = true;
        InputStreamReader inputStreamReader = this.f146796z;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f146793w.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cbuf, int i13, int i14) throws IOException {
        AbstractC22676k.m65750j(cbuf, "cbuf");
        if (this.f146795y) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f146796z;
        if (inputStreamReader == null) {
            InterfaceC26620j interfaceC26620j = this.f146793w;
            inputStreamReader = new InputStreamReader(interfaceC26620j.mo79211i1(), AbstractC37174h.m119139f(interfaceC26620j, this.f146794x));
            this.f146796z = inputStreamReader;
        }
        return inputStreamReader.read(cbuf, i13, i14);
    }
}
