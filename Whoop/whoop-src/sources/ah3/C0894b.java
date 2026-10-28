package ah3;

import java.io.PrintStream;
import java.io.PrintWriter;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: ah3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C0894b extends AbstractC37978j {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3278d;

    /* JADX INFO: renamed from: e */
    public final Object f3279e;

    public /* synthetic */ C0894b(Object obj, int i13) {
        this.f3278d = i13;
        this.f3279e = obj;
    }

    @Override // x43.AbstractC37978j
    /* JADX INFO: renamed from: N */
    public final Object mo2189N() {
        switch (this.f3278d) {
            case 0:
                return (PrintStream) this.f3279e;
            default:
                return (PrintWriter) this.f3279e;
        }
    }

    @Override // x43.AbstractC37978j
    /* JADX INFO: renamed from: T */
    public final void mo2190T(String str) {
        switch (this.f3278d) {
            case 0:
                ((PrintStream) this.f3279e).println((Object) str);
                break;
            default:
                ((PrintWriter) this.f3279e).println((Object) str);
                break;
        }
    }
}
