package mf2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32658p3;
import ql0.InterfaceC30468c;

/* JADX INFO: renamed from: mf2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25513d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f99907E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f99908F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f99909G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99910w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f99911x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f99912y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f99913z;

    public /* synthetic */ C25513d(int i13, boolean z4, boolean z13, C29891y c29891y, InterfaceC30468c interfaceC30468c, boolean z14) {
        this.f99911x = i13;
        this.f99912y = z4;
        this.f99913z = z13;
        this.f99908F = c29891y;
        this.f99909G = interfaceC30468c;
        this.f99907E = z14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f99910w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC25515f.m75056i0(this.f99912y, this.f99913z, this.f99907E, (Function1) this.f99908F, (Function1) this.f99909G, this.f99911x, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC32658p3.m102218r(this.f99911x, this.f99912y, this.f99913z, (C29891y) this.f99908F, (InterfaceC30468c) this.f99909G, this.f99907E, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C25513d(boolean z4, boolean z13, boolean z14, Function1 function1, Function1 function2, int i13) {
        this.f99912y = z4;
        this.f99913z = z13;
        this.f99907E = z14;
        this.f99908F = function1;
        this.f99909G = function2;
        this.f99911x = i13;
    }
}
