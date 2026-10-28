package kotlin;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import b91.EnumC2888c;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import java.util.List;
import km0.C22581e;
import l83.InterfaceC23459e;
import mm1.C25697k;
import p077d0.C11421z1;
import p164g2.InterfaceC15237i;
import p208i2.AbstractC17911t;
import p715kotlin.jvm.functions.Function1;
import pt2.AbstractC29516a;
import pt2.AbstractC29519b0;
import rm1.AbstractC31599m;
import rm1.C31587a;
import uw0.AbstractC35302l;
import v41.AbstractC35664f;
import x31.AbstractC37947f;
import x31.EnumC37944c;
import y31.AbstractC39195d;
import yi1.EnumC39580n;
import zi1.AbstractC40672d0;

/* JADX INFO: renamed from: at2.e1 */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2000e1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f7954E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC23459e f7955F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f7956G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f7957H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f7958I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7959w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f7960x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f7961y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f7962z;

    public /* synthetic */ C2000e1(int i13, List list, Modifier modifier, EnumC37944c enumC37944c, EnumC2888c enumC2888c, Function1 function1, int i14, int i15) {
        this.f7959w = 5;
        this.f7962z = i13;
        this.f7960x = list;
        this.f7961y = modifier;
        this.f7958I = enumC37944c;
        this.f7954E = enumC2888c;
        this.f7955F = function1;
        this.f7956G = i14;
        this.f7957H = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7959w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC2003f1.m6164m((C22581e) this.f7960x, (AbstractC35664f.a) this.f7961y, (AbstractC1986a) this.f7958I, this.f7962z, (InterfaceC2994c0) this.f7954E, (Function1) this.f7955F, this.f7956G, this.f7957H, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC29519b0.m90228m((C22581e) this.f7960x, (AbstractC35664f.a) this.f7961y, (AbstractC29516a) this.f7958I, this.f7962z, (InterfaceC2994c0) this.f7954E, (Function1) this.f7955F, this.f7956G, this.f7957H, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC31599m.m97490D((Modifier) this.f7960x, (C25697k) this.f7961y, (C31587a) this.f7958I, (C11421z1) this.f7954E, this.f7962z, (Function1) this.f7955F, this.f7956G, this.f7957H, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC35302l.m112008B((Modifier) this.f7961y, (C22581e) this.f7960x, this.f7962z, (Function1) this.f7955F, (Function1) this.f7958I, (InterfaceC15237i) this.f7954E, this.f7956G, this.f7957H, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC37947f.m121502I(this.f7962z, (List) this.f7960x, (C2886a) this.f7961y, (Function1) this.f7955F, (InterfaceC4351m) this.f7958I, (Function1) this.f7954E, this.f7956G, this.f7957H, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC37947f.m121527u(this.f7962z, (List) this.f7960x, (Modifier) this.f7961y, (EnumC37944c) this.f7958I, (EnumC2888c) this.f7954E, (Function1) this.f7955F, this.f7956G, this.f7957H, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC39195d.m124843D((Modifier) this.f7960x, this.f7962z, (TextResource) this.f7961y, (String) this.f7958I, (AbstractC17911t) this.f7954E, (InterfaceC4339a) this.f7955F, this.f7956G, this.f7957H, (Composer) obj, iIntValue7);
            default:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC40672d0.m132033l((C9598e) this.f7960x, (EnumC39580n) this.f7961y, (TextResource) this.f7958I, (TextResource) this.f7954E, this.f7962z, this.f7956G, (Function1) this.f7955F, this.f7957H, (Composer) obj, iIntValue8);
        }
    }

    public /* synthetic */ C2000e1(int i13, List list, C2886a c2886a, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, int i14, int i15) {
        this.f7959w = 4;
        this.f7962z = i13;
        this.f7960x = list;
        this.f7961y = c2886a;
        this.f7955F = function1;
        this.f7958I = interfaceC4351m;
        this.f7954E = function2;
        this.f7956G = i14;
        this.f7957H = i15;
    }

    public /* synthetic */ C2000e1(Modifier modifier, int i13, TextResource textResource, String str, AbstractC17911t abstractC17911t, InterfaceC4339a interfaceC4339a, int i14, int i15) {
        this.f7959w = 6;
        this.f7960x = modifier;
        this.f7962z = i13;
        this.f7961y = textResource;
        this.f7958I = str;
        this.f7954E = abstractC17911t;
        this.f7955F = interfaceC4339a;
        this.f7956G = i14;
        this.f7957H = i15;
    }

    public /* synthetic */ C2000e1(Modifier modifier, C22581e c22581e, int i13, Function1 function1, Function1 function2, InterfaceC15237i interfaceC15237i, int i14, int i15) {
        this.f7959w = 3;
        this.f7961y = modifier;
        this.f7960x = c22581e;
        this.f7962z = i13;
        this.f7955F = function1;
        this.f7958I = function2;
        this.f7954E = interfaceC15237i;
        this.f7956G = i14;
        this.f7957H = i15;
    }

    public /* synthetic */ C2000e1(Modifier modifier, C25697k c25697k, C31587a c31587a, C11421z1 c11421z1, int i13, Function1 function1, int i14, int i15) {
        this.f7959w = 2;
        this.f7960x = modifier;
        this.f7961y = c25697k;
        this.f7958I = c31587a;
        this.f7954E = c11421z1;
        this.f7962z = i13;
        this.f7955F = function1;
        this.f7956G = i14;
        this.f7957H = i15;
    }

    public /* synthetic */ C2000e1(C9598e c9598e, EnumC39580n enumC39580n, TextResource textResource, TextResource textResource2, int i13, int i14, Function1 function1, int i15) {
        this.f7959w = 7;
        this.f7960x = c9598e;
        this.f7961y = enumC39580n;
        this.f7958I = textResource;
        this.f7954E = textResource2;
        this.f7962z = i13;
        this.f7956G = i14;
        this.f7955F = function1;
        this.f7957H = i15;
    }

    public /* synthetic */ C2000e1(C22581e c22581e, AbstractC35664f.a aVar, Object obj, int i13, InterfaceC2994c0 interfaceC2994c0, Function1 function1, int i14, int i15, int i16) {
        this.f7959w = i16;
        this.f7960x = c22581e;
        this.f7961y = aVar;
        this.f7958I = obj;
        this.f7962z = i13;
        this.f7954E = interfaceC2994c0;
        this.f7955F = function1;
        this.f7956G = i14;
        this.f7957H = i15;
    }
}
