package am0;

import androidx.compose.runtime.Composer;
import c41.AbstractC4017e4;
import c41.AbstractC4023f3;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import cr2.AbstractC11089e;
import no0.AbstractC26933a0;
import no0.AbstractC26952i0;
import no0.AbstractC26958l0;
import no0.AbstractC26979w;
import qj2.AbstractC30436a;
import ul0.AbstractC35061c;
import v90.AbstractC35814f;
import v90.AbstractC35825q;
import y01.AbstractC39019b;
import z50.AbstractC40088d;
import z51.AbstractC40093d;
import z51.AbstractC40098i;

/* JADX INFO: renamed from: am0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0999c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3755w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f3756x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f3757y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f3758z;

    public /* synthetic */ C0999c(TextResource textResource, TextResource textResource2, int i13, int i14) {
        this.f3755w = i14;
        this.f3756x = textResource;
        this.f3757y = textResource2;
        this.f3758z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f3755w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC1000d.m2690h(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 1:
                return AbstractC4023f3.m12262o(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 2:
                return AbstractC4017e4.m12209i(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 3:
                return AbstractC4017e4.m12211k(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 4:
                return AbstractC11089e.m29936k(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 5:
                return AbstractC26979w.m80843K(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 6:
                return AbstractC26933a0.m80411p(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 7:
                return AbstractC26952i0.m80561n(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 8:
                return AbstractC26958l0.m80680x0(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 9:
                return AbstractC30436a.m93085n(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 10:
                return AbstractC35061c.m110857u(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 11:
                return AbstractC35814f.m113551i(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 12:
                return AbstractC35825q.m113648i(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 13:
                return AbstractC39019b.m124422n(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 14:
                return AbstractC40088d.m128495n(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            case 15:
                return AbstractC40093d.m128542n(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
            default:
                return AbstractC40098i.m128600f(this.f3756x, this.f3757y, this.f3758z, composer, iIntValue);
        }
    }
}
