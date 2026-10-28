package k71;

import androidx.compose.p018ui.Modifier;
import l83.C23454a0;
import p027b3.C2404l2;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: k71.f */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C22249f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f86746w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f86747x;

    public /* synthetic */ C22249f(float f13, int i13) {
        this.f86746w = i13;
        this.f86747x = f13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f86746w) {
            case 0:
                return AbstractC22253j.m63853w(this.f86747x, (Modifier) obj);
            default:
                C2404l2 c2404l2 = (C2404l2) obj;
                c2404l2.m7401c("padding");
                c2404l2.m7402d(new C39174f(this.f86747x));
                return C23454a0.f92919a;
        }
    }
}
