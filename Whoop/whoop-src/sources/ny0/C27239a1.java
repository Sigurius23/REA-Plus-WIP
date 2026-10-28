package ny0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c03.C3815c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import g80.C15565f;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p294l3.C23254g;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p737t90.AbstractC33658a;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: ny0.a1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C27239a1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f109019E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f109020F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f109021G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f109022H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f109023w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f109024x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f109025y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f109026z;

    public /* synthetic */ C27239a1(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23459e interfaceC23459e, int i13, int i14, int i15) {
        this.f109023w = i15;
        this.f109026z = obj;
        this.f109019E = obj2;
        this.f109020F = obj3;
        this.f109021G = obj4;
        this.f109022H = interfaceC23459e;
        this.f109024x = i13;
        this.f109025y = i14;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f109023w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC27242b1.m82096h((C27270o) this.f109026z, (String) this.f109019E, (Modifier) this.f109020F, (Modifier) this.f109021G, (InterfaceC4339a) this.f109022H, this.f109024x, this.f109025y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC33658a.m106302e((C15565f) this.f109026z, (C3815c) this.f109019E, (Function1) this.f109020F, (Function1) this.f109021G, (Function1) this.f109022H, this.f109024x, this.f109025y, (Composer) obj, iIntValue2);
            default:
                ((Integer) obj2).getClass();
                AbstractC30060g.m92109c((C23254g) this.f109026z, (Modifier) this.f109020F, (C23285v0) this.f109019E, (Function1) this.f109021G, this.f109024x, this.f109022H, (Composer) obj, AbstractC28683x.m87244L(this.f109025y | 1));
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C27239a1(C23254g c23254g, Modifier modifier, C23285v0 c23285v0, Function1 function1, int i13, Map map, int i14) {
        this.f109023w = 2;
        this.f109026z = c23254g;
        this.f109020F = modifier;
        this.f109019E = c23285v0;
        this.f109021G = function1;
        this.f109024x = i13;
        this.f109022H = map;
        this.f109025y = i14;
    }
}
