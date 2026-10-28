package js1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l90.AbstractC23541a;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32626j1;

/* JADX INFO: renamed from: js1.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21919j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f84667E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84668w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f84669x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f84670y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f84671z;

    public /* synthetic */ C21919j(String str, Function1 function1, int i13, int i14, int i15) {
        this.f84668w = i15;
        this.f84669x = str;
        this.f84670y = function1;
        this.f84671z = i13;
        this.f84667E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f84668w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC21921l.m62399s(this.f84669x, this.f84670y, this.f84671z, this.f84667E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC23541a.m68148i(this.f84669x, this.f84670y, this.f84671z, this.f84667E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC32626j1.m101901k(this.f84669x, this.f84670y, this.f84671z, this.f84667E, (Composer) obj, iIntValue3);
        }
    }
}
