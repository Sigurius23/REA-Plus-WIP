package xd3;

import java.io.IOException;
import ne3.AbstractC26636r;
import ne3.C26616h;
import ne3.InterfaceC26629n0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xd3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C38224g extends AbstractC26636r {

    /* JADX INFO: renamed from: w */
    public final Function1 f163852w;

    /* JADX INFO: renamed from: x */
    public boolean f163853x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38224g(InterfaceC26629n0 delegate, Function1 function1) {
        super(delegate);
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f163852w = function1;
    }

    @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e5) {
            this.f163853x = true;
            this.f163852w.invoke(e5);
        }
    }

    @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
        if (this.f163853x) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e5) {
            this.f163853x = true;
            this.f163852w.invoke(e5);
        }
    }

    @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        if (this.f163853x) {
            source.skip(j7);
            return;
        }
        try {
            super.write(source, j7);
        } catch (IOException e5) {
            this.f163853x = true;
            this.f163852w.invoke(e5);
        }
    }
}
