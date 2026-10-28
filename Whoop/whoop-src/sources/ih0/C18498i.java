package ih0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: ih0.i */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18498i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72043w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29891y f72044x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f72045y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f72046z;

    public /* synthetic */ C18498i(C29891y c29891y, String str, long j7, int i13) {
        this.f72043w = i13;
        this.f72044x = c29891y;
        this.f72045y = str;
        this.f72046z = j7;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f72043w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC18502l.m53575V(this.f72044x, this.f72045y, this.f72046z, (InterfaceC4351m) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC18502l.m53579Z(this.f72044x, this.f72045y, this.f72046z, (InterfaceC4351m) obj, (Composer) obj2, iIntValue2);
        }
    }
}
