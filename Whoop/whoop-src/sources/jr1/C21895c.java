package jr1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gr1.C16110q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jr1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21895c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f84595E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84596w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16110q f84597x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f84598y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f84599z;

    public /* synthetic */ C21895c(C16110q c16110q, Function1 function1, Function1 function2, int i13, int i14) {
        this.f84596w = i14;
        this.f84597x = c16110q;
        this.f84598y = function1;
        this.f84599z = function2;
        this.f84595E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f84596w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC21896d.m62218y(this.f84597x, this.f84598y, this.f84599z, this.f84595E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC21896d.m62184L(this.f84597x, this.f84598y, this.f84599z, this.f84595E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC21897e.m62253y(this.f84597x, this.f84598y, this.f84599z, this.f84595E, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC21898f.m62274s(this.f84597x, this.f84598y, this.f84599z, this.f84595E, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC21899g.m62298x(this.f84597x, this.f84598y, this.f84599z, this.f84595E, (Composer) obj, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC21899g.m62289o(this.f84597x, this.f84598y, this.f84599z, this.f84595E, (Composer) obj, iIntValue6);
        }
    }
}
