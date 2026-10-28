package bi;

import java.io.IOException;
import ne3.InterfaceC26620j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bi.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C3282t implements AutoCloseable {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26620j f12816w;

    public /* synthetic */ C3282t(InterfaceC26620j interfaceC26620j) {
        this.f12816w = interfaceC26620j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12816w.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3282t) {
            return AbstractC22676k.m65745e(this.f12816w, ((C3282t) obj).f12816w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12816w.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.f12816w + ')';
    }
}
