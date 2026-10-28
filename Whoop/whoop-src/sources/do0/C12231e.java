package do0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm2.AbstractC4813a0;
import com.whoop.design.util.TextResource;
import com.whoop.payments.domain.models.Card;
import java.util.List;
import jx1.C22010d;
import mx1.AbstractC26007m;
import or2.C28205u0;
import p114eb.C12991u0;
import p412q3.InterfaceC29873g0;
import p715kotlin.jvm.functions.Function1;
import q22.C29855e;
import qz0.AbstractC30784c;
import yl2.AbstractC39639f;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: do0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12231e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f40919E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f40920F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f40921G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f40922H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f40923I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f40924J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f40925K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f40926L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object f40927M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Object f40928N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Object f40929O;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40930w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f40931x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f40932y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f40933z;

    public /* synthetic */ C12231e(Modifier modifier, TextResource textResource, TextResource textResource2, C2886a c2886a, TextResource textResource3, AbstractC30784c abstractC30784c, TextResource textResource4, InterfaceC29873g0 interfaceC29873g0, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, int i15) {
        this.f40921G = modifier;
        this.f40922H = textResource;
        this.f40923I = textResource2;
        this.f40926L = c2886a;
        this.f40924J = textResource3;
        this.f40927M = abstractC30784c;
        this.f40925K = textResource4;
        this.f40928N = interfaceC29873g0;
        this.f40931x = z4;
        this.f40929O = interfaceC4339a;
        this.f40933z = function1;
        this.f40932y = i13;
        this.f40919E = i14;
        this.f40920F = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40930w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC12232f.m34023i((Modifier) this.f40921G, (TextResource) this.f40922H, (TextResource) this.f40923I, (C2886a) this.f40926L, (TextResource) this.f40924J, (AbstractC30784c) this.f40927M, (TextResource) this.f40925K, (InterfaceC29873g0) this.f40928N, this.f40931x, (InterfaceC4339a) this.f40929O, this.f40933z, this.f40932y, this.f40919E, this.f40920F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC26007m.m77212D((String) this.f40921G, (String) this.f40922H, (String) this.f40923I, (String) this.f40924J, (String) this.f40925K, this.f40931x, (List) this.f40926L, (C22010d) this.f40927M, this.f40932y, (C29855e) this.f40928N, (Card) this.f40929O, this.f40933z, this.f40919E, this.f40920F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC39639f.m126721o((C12991u0) this.f40921G, (AbstractC4813a0) this.f40922H, (InterfaceC41070a) this.f40923I, (C28205u0) this.f40924J, this.f40933z, (Function1) this.f40925K, (Function1) this.f40926L, (InterfaceC4351m) this.f40927M, (Function1) this.f40928N, (Function1) this.f40929O, this.f40931x, this.f40932y, this.f40919E, this.f40920F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C12231e(C12991u0 c12991u0, AbstractC4813a0 abstractC4813a0, InterfaceC41070a interfaceC41070a, C28205u0 c28205u0, Function1 function1, Function1 function2, Function1 function3, InterfaceC4351m interfaceC4351m, Function1 function4, Function1 function5, boolean z4, int i13, int i14, int i15) {
        this.f40921G = c12991u0;
        this.f40922H = abstractC4813a0;
        this.f40923I = interfaceC41070a;
        this.f40924J = c28205u0;
        this.f40933z = function1;
        this.f40925K = function2;
        this.f40926L = function3;
        this.f40927M = interfaceC4351m;
        this.f40928N = function4;
        this.f40929O = function5;
        this.f40931x = z4;
        this.f40932y = i13;
        this.f40919E = i14;
        this.f40920F = i15;
    }

    public /* synthetic */ C12231e(String str, String str2, String str3, String str4, String str5, boolean z4, List list, C22010d c22010d, int i13, C29855e c29855e, Card card, Function1 function1, int i14, int i15) {
        this.f40921G = str;
        this.f40922H = str2;
        this.f40923I = str3;
        this.f40924J = str4;
        this.f40925K = str5;
        this.f40931x = z4;
        this.f40926L = list;
        this.f40927M = c22010d;
        this.f40932y = i13;
        this.f40928N = c29855e;
        this.f40929O = card;
        this.f40933z = function1;
        this.f40919E = i14;
        this.f40920F = i15;
    }
}
