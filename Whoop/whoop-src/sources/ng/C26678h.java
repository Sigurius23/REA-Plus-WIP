package ng;

import bc3.InterfaceC3008f2;
import java.io.IOException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30054a;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: ng.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C26678h extends AbstractC30054a implements InterfaceC3008f2 {

    /* JADX INFO: renamed from: x */
    public static final C26676f f106054x = new C26676f();

    /* JADX INFO: renamed from: w */
    public final C26676f f106055w;

    public C26678h(C26676f c26676f) {
        super(f106054x);
        this.f106055w = c26676f;
    }

    @Override // bc3.InterfaceC3008f2
    /* JADX INFO: renamed from: J */
    public final Object mo8734J(InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        this.f106055w.getClass();
        return C26676f.f106053w;
    }

    @Override // bc3.InterfaceC3008f2
    /* JADX INFO: renamed from: x */
    public final void mo8735x(InterfaceC30063j context, Object obj) throws IOException {
        InterfaceC26677g oldState = (InterfaceC26677g) obj;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(oldState, "oldState");
        oldState.close();
    }
}
