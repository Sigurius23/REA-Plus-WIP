package bp0;

import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.ArrayList;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ly0.AbstractC24801e;
import p163g1.C15186x0;
import p180h0.C16430o;
import p180h0.InterfaceC16356a;
import p181h2.C16617b;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28690z0;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39140v1;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22663d0;
import p720m91.InterfaceC25305n;
import p741vn1.AbstractC36212p;
import p741vn1.C36213q;
import p741vn1.EnumC36197a;
import um1.AbstractC35086d;
import wm1.AbstractC37389k;

/* JADX INFO: renamed from: bp0.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3529q implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14056w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f14057x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f14058y;

    public /* synthetic */ C3529q(int i13, Object obj, Object obj2) {
        this.f14056w = i13;
        this.f14057x = obj;
        this.f14058y = obj2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14056w) {
            case 0:
                return AbstractC3531s.m10415D0((InterfaceC28601c1) this.f14057x, (InterfaceC28690z0) this.f14058y, (C16617b) obj, ((Float) obj2).floatValue());
            case 1:
                InterfaceC16356a interfaceC16356a = (InterfaceC16356a) this.f14057x;
                C22663d0 c22663d0 = (C22663d0) this.f14058y;
                float fFloatValue = ((Float) obj).floatValue();
                ((C16430o) interfaceC16356a).m46600b(fFloatValue, ((Float) obj2).floatValue());
                c22663d0.f89331w = fFloatValue;
                return C23454a0.f92919a;
            case 2:
                InterfaceC39140v1 interfaceC39140v1 = (InterfaceC39140v1) obj;
                C39169a c39169a = (C39169a) obj2;
                return ((InterfaceC39127r0) this.f14057x).mo521a(interfaceC39140v1, interfaceC39140v1.mo124616s0(C23454a0.f92919a, new C37816b(new C15186x0((Function3) this.f14058y, new C1101c(interfaceC39140v1, c39169a.f168407a)), true, -431986394)), c39169a.f168407a);
            case 3:
                return AbstractC24801e.m72691k((TextResource) this.f14057x, (C2886a) this.f14058y, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return AbstractC35086d.m110965u((AbstractC23864c) this.f14057x, (C36213q) this.f14058y, (String) obj, (EnumC36197a) obj2);
            case 5:
                return AbstractC36212p.m115259y((InterfaceC25305n) this.f14057x, (Function1) this.f14058y, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC37389k.m119736y((ArrayList) this.f14057x, (Modifier) this.f14058y, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
