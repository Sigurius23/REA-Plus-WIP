package k03;

import androidx.compose.runtime.Composer;
import p335n6.InterfaceC26398o;
import p545v6.InterfaceC35730s;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: k03.i */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C22104i implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f85755E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f85756F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85757w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f85758x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f85759y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f85760z;

    public /* synthetic */ C22104i(int i13, String str, String str2, long j7, int i14) {
        this.f85758x = i13;
        this.f85759y = str;
        this.f85756F = str2;
        this.f85760z = j7;
        this.f85755E = i14;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f85757w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC22109n.m63309v(this.f85758x, (InterfaceC26398o) this.f85756F, this.f85759y, this.f85760z, this.f85755E, (InterfaceC35730s) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC22109n.m63265B(this.f85758x, this.f85759y, (String) this.f85756F, this.f85760z, this.f85755E, (InterfaceC35730s) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C22104i(int i13, InterfaceC26398o interfaceC26398o, String str, long j7, int i14) {
        this.f85758x = i13;
        this.f85756F = interfaceC26398o;
        this.f85759y = str;
        this.f85760z = j7;
        this.f85755E = i14;
    }
}
