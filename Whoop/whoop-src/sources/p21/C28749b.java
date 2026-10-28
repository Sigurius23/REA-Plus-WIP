package p21;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import p163g1.C15183w7;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23004v;
import p715kotlin.jvm.functions.Function3;
import tp1.C34061a;
import vp1.AbstractC36272h;
import x31.AbstractC37947f;

/* JADX INFO: renamed from: p21.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C28749b implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116438w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f116439x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f116440y;

    public /* synthetic */ C28749b(float f13, C28754g c28754g) {
        this.f116438w = 0;
        this.f116439x = f13;
        this.f116440y = c28754g;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f116438w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC28752e.m87505q(this.f116439x, (C28754g) this.f116440y, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC36272h.m115858m0((C34061a) this.f116440y, this.f116439x, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC37947f.m121504K((C15183w7) this.f116440y, this.f116439x, (Modifier) obj, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ C28749b(Object obj, float f13, int i13) {
        this.f116438w = i13;
        this.f116440y = obj;
        this.f116439x = f13;
    }
}
