package iw0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.Map;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: iw0.u */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20989u implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f79298E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79299w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f79300x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f79301y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Map f79302z;

    public /* synthetic */ C20989u(boolean z4, Function1 function1, Map map, int i13, int i14) {
        this.f79299w = i14;
        this.f79300x = z4;
        this.f79301y = function1;
        this.f79302z = map;
        this.f79298E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f79299w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC20992x.m58455s1(this.f79300x, this.f79301y, this.f79302z, this.f79298E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC20992x.m58401a1(this.f79300x, this.f79301y, this.f79302z, this.f79298E, (Composer) obj, iIntValue2);
        }
    }
}
