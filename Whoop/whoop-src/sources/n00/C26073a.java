package n00;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p390p1.C28655q;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C26073a implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103247w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26075c f103248x;

    public /* synthetic */ C26073a(C26075c c26075c, int i13) {
        this.f103247w = i13;
        this.f103248x = c26075c;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strMo133889M;
        String strMo133889M2;
        switch (this.f103247w) {
            case 0:
                InterfaceC3747i0 AnimatedVisibility = (InterfaceC3747i0) obj;
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
                InterfaceC41211c interfaceC41211c = this.f103248x.f103264g;
                if (interfaceC41211c == null) {
                    strMo133889M = null;
                } else {
                    strMo133889M = interfaceC41211c.mo133889M((Context) ((C28655q) composer).m87161k(AndroidCompositionLocals_androidKt.f4976b));
                }
                if (strMo133889M == null) {
                    strMo133889M = "";
                }
                AbstractC22674j.m65716b(strMo133889M, AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(C2314t.f9131w, "signUpErrorTag")), null, null, composer, 48, 12);
                break;
            default:
                InterfaceC3747i0 AnimatedVisibility2 = (InterfaceC3747i0) obj;
                Composer composer2 = (Composer) obj2;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(AnimatedVisibility2, "$this$AnimatedVisibility");
                InterfaceC41211c interfaceC41211c2 = this.f103248x.f103264g;
                if (interfaceC41211c2 == null) {
                    strMo133889M2 = null;
                } else {
                    strMo133889M2 = interfaceC41211c2.mo133889M((Context) ((C28655q) composer2).m87161k(AndroidCompositionLocals_androidKt.f4976b));
                }
                if (strMo133889M2 == null) {
                    strMo133889M2 = "";
                }
                AbstractC22674j.m65716b(strMo133889M2, AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), "signUpErrorTag"), null, null, composer2, 48, 12);
                break;
        }
        return C23454a0.f92919a;
    }
}
