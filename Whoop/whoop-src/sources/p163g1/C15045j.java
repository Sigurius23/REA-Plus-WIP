package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p208i2.InterfaceC17869a1;
import p390p1.C28655q;
import p602x1.C37816b;

/* JADX INFO: renamed from: g1.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C15045j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC17869a1 f56320E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ long f56321F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ long f56322G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C37816b f56323w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f56324x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4351m f56325y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f56326z;

    public C15045j(C37816b c37816b, Modifier modifier, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC17869a1 interfaceC17869a1, long j7, long j13) {
        this.f56323w = c37816b;
        this.f56324x = modifier;
        this.f56325y = interfaceC4351m;
        this.f56326z = interfaceC4351m2;
        this.f56320E = interfaceC17869a1;
        this.f56321F = j7;
        this.f56322G = j13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC15055k.m43141b(this.f56323w, this.f56324x, this.f56325y, this.f56326z, this.f56320E, this.f56321F, this.f56322G, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
