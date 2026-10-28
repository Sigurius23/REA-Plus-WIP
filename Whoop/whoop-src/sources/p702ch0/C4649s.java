package p702ch0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import zg0.C40620c;

/* JADX INFO: renamed from: ch0.s */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4649s implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f18938E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f18939F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18940w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C40620c f18941x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f18942y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f18943z;

    public /* synthetic */ C4649s(C40620c c40620c, Function1 function1, Modifier modifier, int i13, int i14, int i15) {
        this.f18940w = i15;
        this.f18941x = c40620c;
        this.f18942y = function1;
        this.f18943z = modifier;
        this.f18938E = i13;
        this.f18939F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18940w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4653u.m14649o(this.f18941x, this.f18942y, this.f18943z, this.f18938E, this.f18939F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC4653u.m14654t(this.f18941x, this.f18942y, this.f18943z, this.f18938E, this.f18939F, (Composer) obj, iIntValue2);
        }
    }
}
