package sv2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p163g1.C15199y3;
import p715kotlin.jvm.functions.Function1;
import rv2.InterfaceC31850h;

/* JADX INFO: renamed from: sv2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C33039b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f137608E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f137609w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC31850h.b f137610x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15199y3 f137611y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f137612z;

    public /* synthetic */ C33039b(InterfaceC31850h.b bVar, C15199y3 c15199y3, Function1 function1, int i13, int i14) {
        this.f137609w = i14;
        this.f137610x = bVar;
        this.f137611y = c15199y3;
        this.f137612z = function1;
        this.f137608E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f137609w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33042e.m104444D0(this.f137610x, this.f137611y, this.f137612z, this.f137608E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC33042e.m104452H0(this.f137610x, this.f137611y, this.f137612z, this.f137608E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC33042e.m104462M0(this.f137610x, this.f137611y, this.f137612z, this.f137608E, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC33042e.m104490a0(this.f137610x, this.f137611y, this.f137612z, this.f137608E, (Composer) obj, iIntValue4);
        }
    }
}
