package xd3;

import ne3.AbstractC26638s;
import ne3.InterfaceC26633p0;

/* JADX INFO: renamed from: xd3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C38219b extends AbstractC26638s {

    /* JADX INFO: renamed from: x */
    public boolean f163811x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38223f f163812y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C38220c f163813z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38219b(InterfaceC26633p0 interfaceC26633p0, C38223f c38223f, C38220c c38220c) {
        super(interfaceC26633p0);
        this.f163812y = c38223f;
        this.f163813z = c38220c;
    }

    @Override // ne3.AbstractC26638s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.f163811x) {
            return;
        }
        this.f163811x = true;
        C38223f c38223f = this.f163812y;
        C38220c c38220c = this.f163813z;
        synchronized (c38223f) {
            int i13 = c38220c.f163821h - 1;
            c38220c.f163821h = i13;
            if (i13 == 0 && c38220c.f163819f) {
                c38223f.m122496b0(c38220c);
            }
        }
    }
}
