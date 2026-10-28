package androidx.compose.foundation.selection;

import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p132f0.InterfaceC13832v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p271k3.EnumC22167a;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C1111c implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4339a f4655E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC13832v0 f4656w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EnumC22167a f4657x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f4658y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C18027i f4659z;

    public C1111c(InterfaceC13832v0 interfaceC13832v0, EnumC22167a enumC22167a, boolean z4, C18027i c18027i, InterfaceC4339a interfaceC4339a) {
        this.f4656w = interfaceC13832v0;
        this.f4657x = enumC22167a;
        this.f4658y = z4;
        this.f4659z = c18027i;
        this.f4655E = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C28655q c28655q = (C28655q) ((Composer) obj2);
        c28655q.m87150e0(-1525724089);
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = AbstractC11266d.m30453g(c28655q);
        }
        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
        Modifier modifierMo3471e = AbstractC1095d.m3369a(C2314t.f9131w, interfaceC21083i, this.f4656w).mo3471e(new TriStateToggleableElement(this.f4657x, interfaceC21083i, null, this.f4658y, this.f4659z, this.f4655E));
        c28655q.m87173q(false);
        return modifierMo3471e;
    }
}
