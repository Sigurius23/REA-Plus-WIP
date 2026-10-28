package mc2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mc2.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25431j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99612w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25429h f99613x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f99614y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f99615z;

    public /* synthetic */ C25431j(C25429h c25429h, Function1 function1, int i13, int i14) {
        this.f99612w = i14;
        this.f99613x = c25429h;
        this.f99614y = function1;
        this.f99615z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f99612w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC25433l.m74660l(this.f99613x, this.f99614y, this.f99615z, composer, iIntValue);
            default:
                return AbstractC25433l.m74666r(this.f99613x, this.f99614y, this.f99615z, composer, iIntValue);
        }
    }
}
