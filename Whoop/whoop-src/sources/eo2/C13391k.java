package eo2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import iw0.AbstractC20992x;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32656p1;
import se1.AbstractC32421a;
import u11.AbstractC34443i;
import zq2.AbstractC40991d;

/* JADX INFO: renamed from: eo2.k */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C13391k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f46898w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f46899x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f46900y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f46901z;

    public /* synthetic */ C13391k(int i13, int i14, List list, Function1 function1) {
        this.f46898w = i14;
        this.f46899x = list;
        this.f46900y = function1;
        this.f46901z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f46898w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC13393m.m37809n(this.f46899x, this.f46900y, this.f46901z, composer, iIntValue);
            case 1:
                return AbstractC20992x.m58390V0(this.f46899x, this.f46900y, this.f46901z, composer, iIntValue);
            case 2:
                return AbstractC32421a.m101226f(this.f46899x, this.f46900y, this.f46901z, composer, iIntValue);
            case 3:
                return AbstractC32656p1.m102151w(this.f46899x, this.f46900y, this.f46901z, composer, iIntValue);
            case 4:
                return AbstractC34443i.m108822G(this.f46899x, this.f46900y, this.f46901z, composer, iIntValue);
            default:
                return AbstractC40991d.m133107g(this.f46899x, this.f46900y, this.f46901z, composer, iIntValue);
        }
    }
}
