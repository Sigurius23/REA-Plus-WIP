package w73;

import ad3.C0783z;
import l73.AbstractC23412c;
import l73.InterfaceC23413d;
import p037bu.C3632c;

/* JADX INFO: renamed from: w73.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C36926l extends AbstractC36915a {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f157993x;

    /* JADX INFO: renamed from: y */
    public final Object f157994y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36926l(AbstractC23412c abstractC23412c, Object obj, int i13) {
        super(abstractC23412c);
        this.f157993x = i13;
        this.f157994y = obj;
    }

    @Override // l73.AbstractC23412c
    /* JADX INFO: renamed from: d */
    public final void mo43873d(InterfaceC23413d interfaceC23413d) {
        switch (this.f157993x) {
            case 0:
                this.f157958w.m67905c(new C36925k(interfaceC23413d, (C0783z) this.f157994y, 0));
                break;
            default:
                this.f157958w.m67905c(new C36925k(interfaceC23413d, (C3632c) this.f157994y, 1));
                break;
        }
    }
}
