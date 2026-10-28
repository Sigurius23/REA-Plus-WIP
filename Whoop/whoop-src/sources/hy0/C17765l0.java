package hy0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hy0.l0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17765l0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f69082E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f69083F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69084w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f69085x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C17777p0 f69086y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f69087z;

    public /* synthetic */ C17765l0(Modifier modifier, C17777p0 c17777p0, boolean z4, Function1 function1, int i13, int i14) {
        this.f69084w = i14;
        this.f69085x = modifier;
        this.f69086y = c17777p0;
        this.f69087z = z4;
        this.f69082E = function1;
        this.f69083F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69084w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17771n0.m51045g(this.f69085x, this.f69086y, this.f69087z, this.f69082E, this.f69083F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC17771n0.m51053o(this.f69085x, this.f69086y, this.f69087z, this.f69082E, this.f69083F, (Composer) obj, iIntValue2);
        }
    }
}
