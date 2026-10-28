package f41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.Map;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p294l3.C23254g;
import p294l3.C23267m0;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p530up.AbstractC35148d;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: f41.m */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C14075m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f50531E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f50532F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f50533G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f50534H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f50535I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f50536J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f50537K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC23459e f50538L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50539w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f50540x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f50541y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f50542z;

    public /* synthetic */ C14075m(Modifier modifier, TextResource textResource, AbstractC22403o abstractC22403o, C14064b c14064b, long j7, int i13, boolean z4, String str, InterfaceC4351m interfaceC4351m, int i14, int i15) {
        this.f50541y = modifier;
        this.f50535I = textResource;
        this.f50536J = abstractC22403o;
        this.f50537K = c14064b;
        this.f50542z = j7;
        this.f50532F = i13;
        this.f50531E = z4;
        this.f50540x = str;
        this.f50538L = interfaceC4351m;
        this.f50533G = i14;
        this.f50534H = i15;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f50539w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC14078p.m40050A(this.f50541y, (TextResource) this.f50535I, (AbstractC22403o) this.f50536J, (C14064b) this.f50537K, this.f50542z, this.f50532F, this.f50531E, (String) this.f50540x, (InterfaceC4351m) this.f50538L, this.f50533G, this.f50534H, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(this.f50533G | 1);
                AbstractC35148d.m111173d((String) this.f50540x, this.f50541y, (Map) this.f50535I, this.f50542z, (C23285v0) this.f50536J, this.f50531E, (C23267m0) this.f50537K, this.f50532F, (InterfaceC4339a) this.f50538L, (Composer) obj, iM87244L, this.f50534H);
                return C23454a0.f92919a;
            default:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(this.f50534H | 1);
                AbstractC35148d.m111171b((C23254g) this.f50535I, this.f50542z, (C23285v0) this.f50536J, this.f50541y, this.f50537K, this.f50531E, this.f50532F, this.f50533G, (Function1) this.f50540x, (Function1) this.f50538L, (Composer) obj, iM87244L2);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C14075m(String str, Modifier modifier, Map map, long j7, C23285v0 c23285v0, boolean z4, C23267m0 c23267m0, int i13, InterfaceC4339a interfaceC4339a, int i14, int i15) {
        this.f50540x = str;
        this.f50541y = modifier;
        this.f50535I = map;
        this.f50542z = j7;
        this.f50536J = c23285v0;
        this.f50531E = z4;
        this.f50537K = c23267m0;
        this.f50532F = i13;
        this.f50538L = interfaceC4339a;
        this.f50533G = i14;
        this.f50534H = i15;
    }

    public /* synthetic */ C14075m(C23254g c23254g, long j7, C23285v0 c23285v0, Modifier modifier, Map map, boolean z4, int i13, int i14, Function1 function1, Function1 function2, int i15) {
        this.f50535I = c23254g;
        this.f50542z = j7;
        this.f50536J = c23285v0;
        this.f50541y = modifier;
        this.f50537K = map;
        this.f50531E = z4;
        this.f50532F = i13;
        this.f50533G = i14;
        this.f50540x = function1;
        this.f50538L = function2;
        this.f50534H = i15;
    }
}
