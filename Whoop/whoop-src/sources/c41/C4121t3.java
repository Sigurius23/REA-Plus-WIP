package c41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import ox2.AbstractC28456b;
import ox2.AbstractC28463i;

/* JADX INFO: renamed from: c41.t3 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4121t3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f16724E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f16725F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16726w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f16727x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f16728y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f16729z;

    public /* synthetic */ C4121t3(TextResource textResource, long j7, long j13, EnumC16313m0 enumC16313m0, int i13) {
        this.f16724E = textResource;
        this.f16728y = j7;
        this.f16729z = j13;
        this.f16725F = enumC16313m0;
        this.f16727x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16726w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4128u3.m12744i((TextResource) this.f16724E, this.f16728y, (TextResource) this.f16725F, this.f16729z, this.f16727x, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC28456b.m86265d(this.f16727x, this.f16728y, this.f16729z, (String) this.f16724E, (String) this.f16725F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC28463i.m86375f((TextResource) this.f16724E, this.f16728y, this.f16729z, (EnumC16313m0) this.f16725F, this.f16727x, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C4121t3(TextResource textResource, long j7, TextResource textResource2, long j13, int i13) {
        this.f16724E = textResource;
        this.f16728y = j7;
        this.f16725F = textResource2;
        this.f16729z = j13;
        this.f16727x = i13;
    }

    public /* synthetic */ C4121t3(String str, String str2, int i13, long j7, long j13) {
        this.f16727x = i13;
        this.f16728y = j7;
        this.f16729z = j13;
        this.f16724E = str;
        this.f16725F = str2;
    }
}
