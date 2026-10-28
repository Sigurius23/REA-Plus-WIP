package u11;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: u11.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C34440f implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f144708E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f144709F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f144710G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144711w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f144712x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C34438d f144713y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ EnumC34435a f144714z;

    public /* synthetic */ C34440f(Modifier modifier, C34438d c34438d, EnumC34435a enumC34435a, Function1 function1, int i13, int i14, int i15) {
        this.f144711w = i15;
        this.f144712x = modifier;
        this.f144713y = c34438d;
        this.f144714z = enumC34435a;
        this.f144708E = function1;
        this.f144709F = i13;
        this.f144710G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f144711w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC34443i.m108836U(this.f144712x, this.f144713y, this.f144714z, this.f144708E, this.f144709F, this.f144710G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC34443i.m108832Q(this.f144712x, this.f144713y, this.f144714z, this.f144708E, this.f144709F, this.f144710G, (Composer) obj, iIntValue2);
        }
    }
}
