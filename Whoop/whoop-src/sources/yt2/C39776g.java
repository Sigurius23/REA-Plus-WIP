package yt2;

import androidx.compose.runtime.Composer;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC23013y;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function3;
import wt2.AbstractC37630k;

/* JADX INFO: renamed from: yt2.g */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C39776g implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171330w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f171331x;

    public /* synthetic */ C39776g(Object obj, int i13) {
        this.f171330w = i13;
        this.f171331x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f171330w) {
            case 0:
                return AbstractC39780k.m127372N((AbstractC37630k.c) this.f171331x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC39782m.m127439O((InterfaceC28601c1) this.f171331x, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
