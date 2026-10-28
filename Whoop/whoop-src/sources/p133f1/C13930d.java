package p133f1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2395j3;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p602x1.AbstractC37817c;

/* JADX INFO: renamed from: f1.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C13930d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC13957m f49664E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC2395j3 f49665w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f49666x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f49667y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f49668z;

    public C13930d(InterfaceC2395j3 interfaceC2395j3, long j7, boolean z4, Modifier modifier, InterfaceC13957m interfaceC13957m) {
        this.f49665w = interfaceC2395j3;
        this.f49666x = j7;
        this.f49667y = z4;
        this.f49668z = modifier;
        this.f49664E = interfaceC13957m;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC28683x.m87247a(AbstractC2453v1.f9580s.mo86977a(this.f49665w), AbstractC37817c.m121344e(1260045569, c28655q, new C13927c(this.f49666x, this.f49667y, this.f49668z, this.f49664E)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
