package gh0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import no0.AbstractC26971s;
import no0.AbstractC26979w;
import p62.AbstractC28944e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gh0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C15848c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f59858w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f59859x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f59860y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f59861z;

    public /* synthetic */ C15848c(String str, int i13, int i14, Function1 function1) {
        this.f59858w = i14;
        this.f59859x = str;
        this.f59860y = function1;
        this.f59861z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f59858w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC15850e.m44728o(this.f59859x, this.f59860y, this.f59861z, composer, iIntValue);
            case 1:
                return AbstractC26971s.m80793q(this.f59859x, this.f59860y, this.f59861z, composer, iIntValue);
            case 2:
                return AbstractC26971s.m80797u(this.f59859x, this.f59860y, this.f59861z, composer, iIntValue);
            case 3:
                return AbstractC26979w.m80841I(this.f59859x, this.f59860y, this.f59861z, composer, iIntValue);
            default:
                return AbstractC28944e.m87883e(this.f59859x, this.f59860y, this.f59861z, composer, iIntValue);
        }
    }
}
