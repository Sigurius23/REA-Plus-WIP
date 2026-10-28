package androidx.compose.foundation;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p132f0.InterfaceC13832v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: androidx.compose.foundation.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C1093b implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4339a f4510E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC13832v0 f4511w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f4512x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f4513y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C18027i f4514z;

    public C1093b(InterfaceC13832v0 interfaceC13832v0, boolean z4, String str, C18027i c18027i, InterfaceC4339a interfaceC4339a) {
        this.f4511w = interfaceC13832v0;
        this.f4512x = z4;
        this.f4513y = str;
        this.f4514z = c18027i;
        this.f4510E = interfaceC4339a;
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
        Modifier modifierMo3471e = AbstractC1095d.m3369a(C2314t.f9131w, interfaceC21083i, this.f4511w).mo3471e(new ClickableElement(interfaceC21083i, null, false, this.f4512x, this.f4513y, this.f4514z, this.f4510E));
        c28655q.m87173q(false);
        return modifierMo3471e;
    }
}
