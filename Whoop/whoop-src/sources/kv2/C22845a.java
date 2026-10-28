package kv2;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import jv2.InterfaceC21972c;
import p291l0.InterfaceC23004v;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: kv2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C22845a implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90059w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC21972c.b f90060x;

    public /* synthetic */ C22845a(InterfaceC21972c.b bVar, int i13) {
        this.f90059w = i13;
        this.f90060x = bVar;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f90059w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC22846b.m66271v(this.f90060x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC22846b.m66272w(this.f90060x, (InterfaceC23004v) obj, (Composer) obj2, iIntValue2);
        }
    }
}
