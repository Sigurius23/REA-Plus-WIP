package w73;

import l73.AbstractC23412c;
import l73.AbstractC23416g;
import l73.InterfaceC23413d;
import y73.AbstractC39305q;

/* JADX INFO: renamed from: w73.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C36930p extends AbstractC36915a {

    /* JADX INFO: renamed from: x */
    public final AbstractC23416g f158007x;

    /* JADX INFO: renamed from: y */
    public final int f158008y;

    public C36930p(AbstractC23412c abstractC23412c, AbstractC23416g abstractC23416g, int i13) {
        super(abstractC23412c);
        this.f158007x = abstractC23416g;
        this.f158008y = i13;
    }

    @Override // l73.AbstractC23412c
    /* JADX INFO: renamed from: d */
    public final void mo43873d(InterfaceC23413d interfaceC23413d) {
        AbstractC23416g abstractC23416g = this.f158007x;
        boolean z4 = abstractC23416g instanceof AbstractC39305q;
        AbstractC23412c abstractC23412c = this.f157958w;
        if (z4) {
            abstractC23412c.m67905c(interfaceC23413d);
        } else {
            abstractC23412c.m67905c(new RunnableC36929o(interfaceC23413d, abstractC23416g.mo67908a(), this.f158008y));
        }
    }
}
