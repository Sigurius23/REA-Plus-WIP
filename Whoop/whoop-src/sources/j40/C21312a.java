package j40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import nq2.AbstractC27062e;
import p390p1.AbstractC28683x;
import p547v8.AbstractC35785b;

/* JADX INFO: renamed from: j40.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C21312a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f81496E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f81497F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81498w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f81499x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f81500y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f81501z;

    public /* synthetic */ C21312a(Modifier modifier, boolean z4, boolean z13, int i13, int i14) {
        this.f81499x = modifier;
        this.f81500y = z4;
        this.f81501z = z13;
        this.f81496E = i13;
        this.f81497F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f81498w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC35785b.m113409d(this.f81499x, this.f81500y, this.f81501z, (Composer) obj, AbstractC28683x.m87244L(this.f81496E | 1), this.f81497F);
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC27062e.m81305C(this.f81499x, this.f81500y, this.f81501z, this.f81496E, this.f81497F, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C21312a(boolean z4, Modifier modifier, boolean z13, int i13, int i14) {
        this.f81500y = z4;
        this.f81499x = modifier;
        this.f81501z = z13;
        this.f81496E = i13;
        this.f81497F = i14;
    }
}
