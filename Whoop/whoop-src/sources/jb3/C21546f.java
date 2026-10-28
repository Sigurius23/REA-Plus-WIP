package jb3;

import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.C31154s;
import r93.InterfaceC31111c;
import u93.AbstractC34710x;
import ya3.AbstractC39373p;
import ya3.C39371n;

/* JADX INFO: renamed from: jb3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C21546f extends AbstractC39373p {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f82624b;

    public C21546f(ArrayList arrayList) {
        this.f82624b = arrayList;
    }

    @Override // ya3.AbstractC39373p
    /* JADX INFO: renamed from: b */
    public final void mo43949b(InterfaceC31111c fakeOverride) {
        AbstractC22676k.m65750j(fakeOverride, "fakeOverride");
        C39371n.m125562r(fakeOverride, null);
        this.f82624b.add(fakeOverride);
    }

    @Override // ya3.AbstractC39373p
    /* JADX INFO: renamed from: c */
    public final void mo43950c(InterfaceC31111c interfaceC31111c, InterfaceC31111c fromCurrent) {
        AbstractC22676k.m65750j(fromCurrent, "fromCurrent");
        if (fromCurrent instanceof AbstractC34710x) {
            ((AbstractC34710x) fromCurrent).m109632Q0(C31154s.f128369a, interfaceC31111c);
        }
    }
}
