package p000;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p132f0.InterfaceC13832v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0000a implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f0w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f1x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C18027i f2y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f3z;

    public /* synthetic */ C0000a(C18027i c18027i, boolean z4, InterfaceC4339a interfaceC4339a) {
        this.f2y = c18027i;
        this.f1x = z4;
        this.f3z = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifierM3360e;
        switch (this.f0w) {
            case 0:
                Modifier composed = (Modifier) obj;
                ((Integer) obj3).getClass();
                AbstractC22676k.m65750j(composed, "$this$composed");
                C28655q c28655q = (C28655q) ((Composer) obj2);
                c28655q.m87150e0(-636640037);
                boolean zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled(FeatureFlagRepositoryKt.TAPPABLE_EFFECT_CARDS);
                C18027i c18027i = this.f2y;
                boolean z4 = this.f1x;
                InterfaceC4339a onClick = this.f3z;
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(432313410);
                    c28655q.m87173q(false);
                    AbstractC22676k.m65750j(onClick, "onClick");
                    modifierM3360e = AbstractC37056f.m118997u(composed, new C0000a(z4, c18027i, onClick));
                } else if (z4) {
                    c28655q.m87150e0(432438185);
                    c28655q.m87173q(false);
                    modifierM3360e = AbstractC1092a.m3362g(composed, false, null, c18027i, onClick, 11);
                } else {
                    c28655q.m87150e0(432509919);
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    modifierM3360e = AbstractC1092a.m3360e(composed, (InterfaceC21083i) objM87133R, null, false, c18027i, onClick, 12);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                return modifierM3360e;
            default:
                Modifier composed2 = (Modifier) obj;
                ((Integer) obj3).getClass();
                AbstractC22676k.m65750j(composed2, "$this$composed");
                C28655q c28655q2 = (C28655q) ((Composer) obj2);
                c28655q2.m87150e0(1380743752);
                Object objM87133R2 = c28655q2.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                Object objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                Object objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R4;
                InterfaceC13832v0 interfaceC13832v0 = null;
                InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(((Boolean) interfaceC28601c1.getValue()).booleanValue() ? 0.97f : 1.0f, AbstractC11348f.m30574v(150, 0, null, 6), "bounceClickScale", null, c28655q2, 3072, 20);
                boolean zM87153g = c28655q2.m87153g(interfaceC28670t2M30588b);
                Object objM87133R5 = c28655q2.m87133R();
                if (zM87153g || objM87133R5 == c28676v0) {
                    objM87133R5 = new C2175b(interfaceC28670t2M30588b, 0);
                    c28655q2.m87172p0(objM87133R5);
                }
                Modifier modifierM3486a = AbstractC1127a.m3486a(composed2, (Function1) objM87133R5);
                if (this.f1x) {
                    c28655q2.m87150e0(-250127249);
                    interfaceC13832v0 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
                } else {
                    c28655q2.m87150e0(836002677);
                }
                c28655q2.m87173q(false);
                boolean zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87149e(150);
                InterfaceC4339a interfaceC4339a = this.f3z;
                boolean zM87153g2 = zM87157i | c28655q2.m87153g(interfaceC4339a);
                Object objM87133R6 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R6 == c28676v0) {
                    objM87133R6 = new C3718c(interfaceC2994c0, interfaceC4339a, interfaceC28601c1, 0);
                    c28655q2.m87172p0(objM87133R6);
                }
                Modifier modifierM3359d = AbstractC1092a.m3359d(modifierM3486a, interfaceC21083i, interfaceC13832v0, true, null, this.f2y, (InterfaceC4339a) objM87133R6);
                c28655q2.m87173q(false);
                return modifierM3359d;
        }
    }

    public /* synthetic */ C0000a(boolean z4, C18027i c18027i, InterfaceC4339a interfaceC4339a) {
        this.f1x = z4;
        this.f2y = c18027i;
        this.f3z = interfaceC4339a;
    }
}
