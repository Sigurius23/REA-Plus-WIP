package p180h0;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.p018ui.Modifier;
import p133f1.C13921a0;
import p238j0.InterfaceC21083i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: h0.k1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16412k1 {

    /* JADX INFO: renamed from: a */
    public static final C16407j1 f63074a;

    /* JADX INFO: renamed from: b */
    public static final C16407j1 f63075b;

    static {
        int i13 = 3;
        InterfaceC30057d interfaceC30057d = null;
        f63074a = new C16407j1(i13, 0, interfaceC30057d);
        f63075b = new C16407j1(i13, 1, interfaceC30057d);
    }

    /* JADX INFO: renamed from: a */
    public static Modifier m46598a(Modifier modifier, InterfaceC16427n1 interfaceC16427n1, EnumC16377d2 enumC16377d2, boolean z4, InterfaceC21083i interfaceC21083i, boolean z13, Function3 function3, Function3 function4, boolean z14, int i13) {
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        boolean z15 = z4;
        if ((i13 & 8) != 0) {
            interfaceC21083i = null;
        }
        return modifier.mo3471e(new DraggableElement(interfaceC16427n1, enumC16377d2, z15, interfaceC21083i, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? f63074a : function3, function4, (i13 & 128) != 0 ? false : z14));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC16427n1 m46599b(Function1 function1, C28655q c28655q) {
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q);
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            C16485z c16485z = new C16485z(new C13921a0(13, interfaceC28601c1M87238F));
            c28655q.m87172p0(c16485z);
            objM87133R = c16485z;
        }
        return (InterfaceC16427n1) objM87133R;
    }
}
