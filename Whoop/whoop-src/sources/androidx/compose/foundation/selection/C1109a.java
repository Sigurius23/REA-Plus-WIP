package androidx.compose.foundation.selection;

import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import l83.InterfaceC23459e;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p132f0.InterfaceC13832v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C1109a implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C18027i f4649E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC23459e f4650F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f4651w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13832v0 f4652x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f4653y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f4654z;

    public /* synthetic */ C1109a(InterfaceC13832v0 interfaceC13832v0, boolean z4, boolean z13, C18027i c18027i, InterfaceC23459e interfaceC23459e, int i13) {
        this.f4651w = i13;
        this.f4652x = interfaceC13832v0;
        this.f4653y = z4;
        this.f4654z = z13;
        this.f4649E = c18027i;
        this.f4650F = interfaceC23459e;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4651w) {
            case 0:
                ((Number) obj3).intValue();
                C28655q c28655q = (C28655q) ((Composer) obj2);
                c28655q.m87150e0(-1525724089);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                Modifier modifierMo3471e = AbstractC1095d.m3369a(C2314t.f9131w, interfaceC21083i, this.f4652x).mo3471e(new SelectableElement(this.f4653y, interfaceC21083i, null, false, this.f4654z, this.f4649E, (InterfaceC4339a) this.f4650F));
                c28655q.m87173q(false);
                return modifierMo3471e;
            default:
                ((Number) obj3).intValue();
                C28655q c28655q2 = (C28655q) ((Composer) obj2);
                c28655q2.m87150e0(-1525724089);
                Object objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == C28635l.f115821a) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                Modifier modifierMo3471e2 = AbstractC1095d.m3369a(C2314t.f9131w, interfaceC21083i2, this.f4652x).mo3471e(new ToggleableElement(this.f4653y, interfaceC21083i2, null, false, this.f4654z, this.f4649E, (Function1) this.f4650F));
                c28655q2.m87173q(false);
                return modifierMo3471e2;
        }
    }
}
