package ty1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ty1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34259d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143694w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34266k f143695x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f143696y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f143697z;

    public /* synthetic */ C34259d(int i13, String str, Function1 function1, C34266k c34266k) {
        this.f143694w = i13;
        this.f143695x = c34266k;
        this.f143696y = str;
        this.f143697z = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f143694w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC34264i.m108337N(this.f143695x, this.f143696y, this.f143697z, composer, iIntValue);
            default:
                return AbstractC34264i.m108353b0(this.f143695x, this.f143696y, this.f143697z, composer, iIntValue);
        }
    }
}
