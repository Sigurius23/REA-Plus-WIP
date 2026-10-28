package iq2;

import ad3.AbstractC0757c;
import ad3.C0764g;
import cd3.C4452d;
import mu2.C25961f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: iq2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C20855a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78452w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC0757c f78453x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C4452d f78454y;

    public /* synthetic */ C20855a(AbstractC0757c abstractC0757c, C4452d c4452d, int i13) {
        this.f78452w = i13;
        this.f78453x = abstractC0757c;
        this.f78454y = c4452d;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f78452w) {
            case 0:
                return AbstractC20856b.m57608c(this.f78453x, this.f78454y, (C0764g) obj);
            default:
                return C25961f.m76911d1(this.f78453x, this.f78454y, (C0764g) obj);
        }
    }
}
