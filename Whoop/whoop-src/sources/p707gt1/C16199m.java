package p707gt1;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.TextResource;
import ft1.InterfaceC14770c;
import j02.C21148j;
import j11.AbstractC21211n;
import kd1.AbstractC22390d;
import p132f0.C13821r1;
import p132f0.C13825t;
import p163g1.C15199y3;
import p163g1.InterfaceC15156u0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: gt1.m */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16199m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f61506E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f61507F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f61508G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f61509H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f61510I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f61511J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f61512K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61513w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f61514x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f61515y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f61516z;

    public /* synthetic */ C16199m(InterfaceC4339a interfaceC4339a, Function1 function1, C13821r1 c13821r1, InterfaceC14770c.g gVar, Function1 function2, boolean z4, Function1 function3, InterfaceC4339a interfaceC4339a2, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        this.f61515y = interfaceC4339a;
        this.f61506E = function1;
        this.f61509H = c13821r1;
        this.f61510I = gVar;
        this.f61507F = function2;
        this.f61514x = z4;
        this.f61508G = function3;
        this.f61516z = interfaceC4339a2;
        this.f61511J = interfaceC2994c0;
        this.f61512K = c15199y3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f61513w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC16200n.m45839u(this.f61515y, (Function1) this.f61506E, (C13821r1) this.f61509H, (InterfaceC14770c.g) this.f61510I, (Function1) this.f61507F, this.f61514x, (Function1) this.f61508G, (InterfaceC4339a) this.f61516z, (InterfaceC2994c0) this.f61511J, (C15199y3) this.f61512K, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC21211n.m59506x((TextResource) this.f61506E, (InterfaceC39332e) this.f61507F, (TextResource) this.f61508G, this.f61514x, (InterfaceC15156u0) this.f61509H, (C13825t) this.f61510I, (C13825t) this.f61511J, this.f61515y, (InterfaceC4339a) this.f61516z, (InterfaceC4339a) this.f61512K, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC22390d.m64395F((String) this.f61516z, (String) this.f61506E, this.f61514x, (C21148j) this.f61507F, this.f61515y, (FeatureFlagChecker) this.f61508G, (InterfaceC28601c1) this.f61509H, (InterfaceC28601c1) this.f61510I, (InterfaceC28601c1) this.f61511J, (InterfaceC28601c1) this.f61512K, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C16199m(TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, boolean z4, InterfaceC15156u0 interfaceC15156u0, C13825t c13825t, C13825t c13825t2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3) {
        this.f61506E = textResource;
        this.f61507F = interfaceC39332e;
        this.f61508G = textResource2;
        this.f61514x = z4;
        this.f61509H = interfaceC15156u0;
        this.f61510I = c13825t;
        this.f61511J = c13825t2;
        this.f61515y = interfaceC4339a;
        this.f61516z = interfaceC4339a2;
        this.f61512K = interfaceC4339a3;
    }

    public /* synthetic */ C16199m(String str, String str2, boolean z4, C21148j c21148j, InterfaceC4339a interfaceC4339a, FeatureFlagChecker featureFlagChecker, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4) {
        this.f61516z = str;
        this.f61506E = str2;
        this.f61514x = z4;
        this.f61507F = c21148j;
        this.f61515y = interfaceC4339a;
        this.f61508G = featureFlagChecker;
        this.f61509H = interfaceC28601c1;
        this.f61510I = interfaceC28601c2;
        this.f61511J = interfaceC28601c3;
        this.f61512K = interfaceC28601c4;
    }
}
