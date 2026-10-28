package id2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import mq2.AbstractC25894g;
import mq2.C25889b;
import p719m22.AbstractC24955j;
import qt0.C30586b;

/* JADX INFO: renamed from: id2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C18421f implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f71666E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f71667F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f71668G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f71669H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71670w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f71671x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f71672y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f71673z;

    public /* synthetic */ C18421f(int i13, int i14, int i15, Modifier modifier, InterfaceC4339a interfaceC4339a, String str, boolean z4) {
        this.f71671x = i13;
        this.f71668G = str;
        this.f71672y = z4;
        this.f71673z = interfaceC4339a;
        this.f71669H = modifier;
        this.f71666E = i14;
        this.f71667F = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f71670w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18422g.m53013h(this.f71671x, (String) this.f71668G, this.f71672y, this.f71673z, (Modifier) this.f71669H, this.f71666E, this.f71667F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC24955j.m73201s((C30586b) this.f71668G, this.f71671x, this.f71672y, this.f71673z, (InterfaceC4339a) this.f71669H, this.f71666E, this.f71667F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC25894g.m76601w((C25889b) this.f71668G, this.f71672y, this.f71671x, this.f71673z, (InterfaceC4351m) this.f71669H, this.f71666E, this.f71667F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C18421f(C25889b c25889b, boolean z4, int i13, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, int i14, int i15) {
        this.f71668G = c25889b;
        this.f71672y = z4;
        this.f71671x = i13;
        this.f71673z = interfaceC4339a;
        this.f71669H = interfaceC4351m;
        this.f71666E = i14;
        this.f71667F = i15;
    }

    public /* synthetic */ C18421f(C30586b c30586b, int i13, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i14, int i15) {
        this.f71668G = c30586b;
        this.f71671x = i13;
        this.f71672y = z4;
        this.f71673z = interfaceC4339a;
        this.f71669H = interfaceC4339a2;
        this.f71666E = i14;
        this.f71667F = i15;
    }
}
