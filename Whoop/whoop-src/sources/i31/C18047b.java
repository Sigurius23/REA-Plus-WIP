package i31;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i31.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C18047b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f70068E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f70069F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f70070w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f70071x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C18052g f70072y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f70073z;

    public /* synthetic */ C18047b(Modifier modifier, C18052g c18052g, Function1 function1, int i13, int i14, int i15) {
        this.f70070w = i15;
        this.f70071x = modifier;
        this.f70072y = c18052g;
        this.f70073z = function1;
        this.f70068E = i13;
        this.f70069F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f70070w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f70071x;
                return AbstractC18048c.m51832l(this.f70072y, this.f70073z, modifier, this.f70068E, this.f70069F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18053h.m51861j(this.f70071x, this.f70072y, this.f70073z, this.f70068E, this.f70069F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC18053h.m51866o(this.f70071x, this.f70072y, this.f70073z, this.f70068E, this.f70069F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C18047b(C18052g c18052g, Function1 function1, Modifier modifier, int i13, int i14) {
        this.f70070w = 0;
        this.f70072y = c18052g;
        this.f70073z = function1;
        this.f70071x = modifier;
        this.f70068E = i13;
        this.f70069F = i14;
    }
}
