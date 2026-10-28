package iz0;

import af3.AbstractC0844t;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4353o;
import p291l0.InterfaceC23013y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: iz0.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C21043b implements InterfaceC4353o {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f79788E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79789w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21054m f79790x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f79791y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f79792z;

    public /* synthetic */ C21043b(Object obj, C21054m c21054m, Function1 function1, boolean z4, int i13) {
        this.f79789w = i13;
        this.f79788E = obj;
        this.f79790x = c21054m;
        this.f79791y = function1;
        this.f79792z = z4;
    }

    @Override // c93.InterfaceC4353o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f79789w) {
            case 0:
                int iIntValue = ((Integer) obj5).intValue();
                return AbstractC21048g.m58830e0((EnumC21051j) this.f79788E, this.f79790x, this.f79791y, this.f79792z, (InterfaceC23013y) obj, (AbstractC0844t) obj2, ((Integer) obj3).intValue(), (Composer) obj4, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj5).intValue();
                return AbstractC21048g.m58814T((String) this.f79788E, this.f79790x, this.f79791y, this.f79792z, (InterfaceC23013y) obj, (AbstractC0844t) obj2, ((Integer) obj3).intValue(), (Composer) obj4, iIntValue2);
        }
    }
}
