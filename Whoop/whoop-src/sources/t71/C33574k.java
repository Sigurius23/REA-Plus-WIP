package t71;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: t71.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33574k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f140080E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f140081F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140082w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f140083x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33573j f140084y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f140085z;

    public /* synthetic */ C33574k(Modifier modifier, C33573j c33573j, Function1 function1, int i13, int i14, int i15) {
        this.f140082w = i15;
        this.f140083x = modifier;
        this.f140084y = c33573j;
        this.f140085z = function1;
        this.f140080E = i13;
        this.f140081F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f140082w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33576m.m106041k(this.f140083x, this.f140084y, this.f140085z, this.f140080E, this.f140081F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC33576m.m106044n(this.f140083x, this.f140084y, this.f140085z, this.f140080E, this.f140081F, (Composer) obj, iIntValue2);
        }
    }
}
