package j00;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.functions.Function1;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: j00.r */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C21115r implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Modifier f80108E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f80109F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80110w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21103h f80111x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f80112y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f80113z;

    public /* synthetic */ C21115r(C21103h c21103h, boolean z4, Function1 function1, Modifier modifier, int i13, int i14) {
        this.f80110w = i14;
        this.f80111x = c21103h;
        this.f80112y = z4;
        this.f80113z = function1;
        this.f80108E = modifier;
        this.f80109F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f80110w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC34870c0.m110013p(this.f80111x, this.f80112y, this.f80113z, this.f80108E, (Composer) obj, AbstractC28683x.m87244L(this.f80109F | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC34924m.m110144e(this.f80111x, this.f80112y, this.f80113z, this.f80108E, (Composer) obj, AbstractC28683x.m87244L(this.f80109F | 1));
                break;
        }
        return C23454a0.f92919a;
    }
}
