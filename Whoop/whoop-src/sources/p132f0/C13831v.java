package p132f0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p238j0.InterfaceC21083i;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: f0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C13831v implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f49354w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f49355x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f49356y;

    public C13831v(InterfaceC4339a interfaceC4339a, String str, boolean z4) {
        this.f49354w = z4;
        this.f49355x = str;
        this.f49356y = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC21083i interfaceC21083i;
        ((Number) obj3).intValue();
        C28655q c28655q = (C28655q) ((Composer) obj2);
        c28655q.m87150e0(-756081143);
        InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
        if (interfaceC13832v0 instanceof InterfaceC13832v0) {
            c28655q.m87150e0(-1604682242);
            c28655q.m87173q(false);
            interfaceC21083i = null;
        } else {
            c28655q.m87150e0(-1604549624);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R;
            c28655q.m87173q(false);
        }
        InterfaceC21083i interfaceC21083i2 = interfaceC21083i;
        Modifier modifierM3359d = AbstractC1092a.m3359d(C2314t.f9131w, interfaceC21083i2, interfaceC13832v0, this.f49354w, this.f49355x, null, this.f49356y);
        c28655q.m87173q(false);
        return modifierM3359d;
    }
}
