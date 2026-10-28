package bs1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.settings.AbstractC10104h;
import ih0.AbstractC18491e0;
import p734sl0.AbstractC32613g3;
import wr0.AbstractC37552s;

/* JADX INFO: renamed from: bs1.x */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3605x implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4339a f14629E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f14630F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14631w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f14632x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f14633y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f14634z;

    public /* synthetic */ C3605x(int i13, boolean z4, String str, InterfaceC4339a interfaceC4339a, int i14) {
        this.f14631w = 4;
        this.f14633y = i13;
        this.f14634z = z4;
        this.f14632x = str;
        this.f14629E = interfaceC4339a;
        this.f14630F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14631w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = this.f14633y;
                return AbstractC3583c0.m10879q1(this.f14634z, this.f14632x, this.f14629E, i13, this.f14630F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = this.f14633y;
                boolean z4 = this.f14634z;
                return AbstractC10104h.m25404k(this.f14632x, i14, z4, this.f14629E, this.f14630F, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                int i15 = this.f14633y;
                boolean z13 = this.f14634z;
                return AbstractC18491e0.m53534x1(this.f14632x, i15, z13, this.f14629E, this.f14630F, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                int i16 = this.f14633y;
                return AbstractC32613g3.m101805z(this.f14634z, i16, this.f14632x, this.f14629E, this.f14630F, (Composer) obj, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC37552s.m120469v(this.f14633y, this.f14634z, this.f14632x, this.f14629E, this.f14630F, (Composer) obj, iIntValue5);
        }
    }

    public /* synthetic */ C3605x(String str, int i13, boolean z4, InterfaceC4339a interfaceC4339a, int i14, int i15) {
        this.f14631w = i15;
        this.f14632x = str;
        this.f14633y = i13;
        this.f14634z = z4;
        this.f14629E = interfaceC4339a;
        this.f14630F = i14;
    }

    public /* synthetic */ C3605x(boolean z4, int i13, String str, InterfaceC4339a interfaceC4339a, int i14) {
        this.f14631w = 3;
        this.f14634z = z4;
        this.f14633y = i13;
        this.f14632x = str;
        this.f14629E = interfaceC4339a;
        this.f14630F = i14;
    }

    public /* synthetic */ C3605x(boolean z4, String str, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f14631w = 0;
        this.f14634z = z4;
        this.f14632x = str;
        this.f14629E = interfaceC4339a;
        this.f14633y = i13;
        this.f14630F = i14;
    }
}
