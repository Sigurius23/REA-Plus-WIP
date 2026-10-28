package p475s0;

import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.selection.AbstractC1110b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p132f0.InterfaceC13832v0;
import p238j0.InterfaceC21083i;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: s0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C32034a implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f132901w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f132902x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f132903y;

    public C32034a(boolean z4, boolean z13, InterfaceC4339a interfaceC4339a) {
        this.f132901w = z4;
        this.f132902x = z13;
        this.f132903y = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC21083i interfaceC21083i;
        ((Number) obj3).intValue();
        C28655q c28655q = (C28655q) ((Composer) obj2);
        c28655q.m87150e0(-2124609672);
        InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
        if (interfaceC13832v0 instanceof InterfaceC13832v0) {
            c28655q.m87150e0(686451247);
            c28655q.m87173q(false);
            interfaceC21083i = null;
        } else {
            c28655q.m87150e0(686583865);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R;
            c28655q.m87173q(false);
        }
        InterfaceC21083i interfaceC21083i2 = interfaceC21083i;
        Modifier modifierM3444a = AbstractC1110b.m3444a(C2314t.f9131w, this.f132901w, interfaceC21083i2, interfaceC13832v0, this.f132902x, null, this.f132903y);
        c28655q.m87173q(false);
        return modifierM3444a;
    }
}
