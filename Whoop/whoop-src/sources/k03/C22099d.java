package k03;

import androidx.compose.runtime.Composer;
import p545v6.InterfaceC35730s;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: k03.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C22099d implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f85727E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85728w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f85729x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f85730y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f85731z;

    public /* synthetic */ C22099d(float f13, boolean z4, String str, String str2) {
        this.f85729x = f13;
        this.f85730y = z4;
        this.f85731z = str;
        this.f85727E = str2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f85728w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                float f13 = this.f85729x;
                boolean z4 = this.f85730y;
                return AbstractC22109n.m63277N(this.f85731z, f13, z4, this.f85727E, (InterfaceC35730s) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC22109n.m63274K(this.f85729x, this.f85730y, this.f85731z, this.f85727E, (InterfaceC35730s) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C22099d(String str, float f13, boolean z4, String str2) {
        this.f85731z = str;
        this.f85729x = f13;
        this.f85730y = z4;
        this.f85727E = str2;
    }
}
