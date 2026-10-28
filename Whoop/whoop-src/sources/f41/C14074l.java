package f41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import eq2.C13564b;
import java.util.Map;
import kd1.AbstractC22403o;
import ot2.AbstractC28344m;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p717lq2.AbstractC24686r;
import pt2.AbstractC29540v;
import v41.AbstractC35664f;

/* JADX INFO: renamed from: f41.l */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C14074l implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f50520E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f50521F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f50522G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f50523H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f50524I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f50525J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f50526K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50527w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f50528x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f50529y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f50530z;

    public /* synthetic */ C14074l(Modifier modifier, AbstractC22403o abstractC22403o, TextResource textResource, String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c2, C14064b c14064b, Map map, InterfaceC28601c1 interfaceC28601c3) {
        this.f50530z = modifier;
        this.f50520E = abstractC22403o;
        this.f50521F = textResource;
        this.f50522G = str;
        this.f50528x = interfaceC28601c1;
        this.f50524I = interfaceC4351m;
        this.f50529y = interfaceC28601c2;
        this.f50525J = c14064b;
        this.f50526K = map;
        this.f50523H = interfaceC28601c3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f50527w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC14078p.m40101v((Modifier) this.f50530z, (AbstractC22403o) this.f50520E, (TextResource) this.f50521F, (String) this.f50522G, this.f50528x, (InterfaceC4351m) this.f50524I, this.f50529y, (C14064b) this.f50525J, (Map) this.f50526K, (InterfaceC28601c1) this.f50523H, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC24686r.m72202Y((C13564b) this.f50530z, this.f50528x, (InterfaceC4339a) this.f50520E, this.f50529y, (InterfaceC4339a) this.f50521F, (InterfaceC4339a) this.f50522G, (Function1) this.f50523H, (InterfaceC4339a) this.f50524I, (Function1) this.f50525J, (InterfaceC4339a) this.f50526K, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC29540v.m90442r0((AbstractC28344m.i) this.f50530z, (Function1) this.f50520E, (Function1) this.f50521F, (InterfaceC2994c0) this.f50522G, (AbstractC35664f.a) this.f50524I, this.f50528x, this.f50529y, (InterfaceC28601c1) this.f50523H, (InterfaceC28601c1) this.f50525J, (InterfaceC28601c1) this.f50526K, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C14074l(C13564b c13564b, InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c2, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Function1 function1, InterfaceC4339a interfaceC4339a4, Function1 function2, InterfaceC4339a interfaceC4339a5) {
        this.f50530z = c13564b;
        this.f50528x = interfaceC28601c1;
        this.f50520E = interfaceC4339a;
        this.f50529y = interfaceC28601c2;
        this.f50521F = interfaceC4339a2;
        this.f50522G = interfaceC4339a3;
        this.f50523H = function1;
        this.f50524I = interfaceC4339a4;
        this.f50525J = function2;
        this.f50526K = interfaceC4339a5;
    }

    public /* synthetic */ C14074l(AbstractC28344m.i iVar, Function1 function1, Function1 function2, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5) {
        this.f50530z = iVar;
        this.f50520E = function1;
        this.f50521F = function2;
        this.f50522G = interfaceC2994c0;
        this.f50524I = aVar;
        this.f50528x = interfaceC28601c1;
        this.f50529y = interfaceC28601c2;
        this.f50523H = interfaceC28601c3;
        this.f50525J = interfaceC28601c4;
        this.f50526K = interfaceC28601c5;
    }
}
