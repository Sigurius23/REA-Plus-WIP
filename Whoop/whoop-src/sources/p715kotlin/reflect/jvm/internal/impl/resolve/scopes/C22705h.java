package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31111c;
import ya3.AbstractC39373p;
import ya3.C39371n;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C22705h extends AbstractC39373p {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f89372b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC22706i f89373c;

    public C22705h(ArrayList arrayList, AbstractC22706i abstractC22706i) {
        this.f89372b = arrayList;
        this.f89373c = abstractC22706i;
    }

    @Override // ya3.AbstractC39373p
    /* JADX INFO: renamed from: b */
    public final void mo43949b(InterfaceC31111c fakeOverride) {
        AbstractC22676k.m65750j(fakeOverride, "fakeOverride");
        C39371n.m125562r(fakeOverride, null);
        this.f89372b.add(fakeOverride);
    }

    @Override // ya3.AbstractC39373p
    /* JADX INFO: renamed from: c */
    public final void mo43950c(InterfaceC31111c interfaceC31111c, InterfaceC31111c fromCurrent) {
        AbstractC22676k.m65750j(fromCurrent, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f89373c.getContainingClass() + ": " + interfaceC31111c + " vs " + fromCurrent).toString());
    }
}
