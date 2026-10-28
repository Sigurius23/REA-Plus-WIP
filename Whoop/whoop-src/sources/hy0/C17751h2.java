package hy0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p163g1.AbstractC14961b3;
import p163g1.C15147t1;
import p208i2.InterfaceC17869a1;
import p390p1.AbstractC28683x;
import p602x1.C37816b;

/* JADX INFO: renamed from: hy0.h2 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17751h2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f69035E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ long f69036F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ long f69037G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f69038H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f69039I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f69040J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69041w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f69042x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f69043y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f69044z;

    public /* synthetic */ C17751h2(Modifier modifier, EnumC17744g enumC17744g, TextResource textResource, Float f13, long j7, long j13, C2886a c2886a, int i13, int i14, int i15) {
        this.f69041w = i15;
        this.f69042x = modifier;
        this.f69043y = enumC17744g;
        this.f69044z = textResource;
        this.f69035E = f13;
        this.f69036F = j7;
        this.f69037G = j13;
        this.f69038H = c2886a;
        this.f69039I = i13;
        this.f69040J = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69041w) {
            case 0:
                return AbstractC17755i2.m50944p(this.f69042x, (EnumC17744g) this.f69043y, (TextResource) this.f69044z, (Float) this.f69035E, this.f69036F, this.f69037G, (C2886a) this.f69038H, this.f69039I, this.f69040J, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC17755i2.m50940l(this.f69042x, (EnumC17744g) this.f69043y, (TextResource) this.f69044z, (Float) this.f69035E, this.f69036F, this.f69037G, (C2886a) this.f69038H, this.f69039I, this.f69040J, (Composer) obj, ((Integer) obj2).intValue());
            default:
                ((Integer) obj2).getClass();
                AbstractC14961b3.m43085a((InterfaceC4339a) this.f69043y, this.f69042x, (InterfaceC17869a1) this.f69044z, this.f69036F, this.f69037G, (C15147t1) this.f69035E, (C37816b) this.f69038H, (Composer) obj, AbstractC28683x.m87244L(this.f69039I | 1), this.f69040J);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C17751h2(InterfaceC4339a interfaceC4339a, Modifier modifier, InterfaceC17869a1 interfaceC17869a1, long j7, long j13, C15147t1 c15147t1, C37816b c37816b, int i13, int i14) {
        this.f69041w = 2;
        this.f69043y = interfaceC4339a;
        this.f69042x = modifier;
        this.f69044z = interfaceC17869a1;
        this.f69036F = j7;
        this.f69037G = j13;
        this.f69035E = c15147t1;
        this.f69038H = c37816b;
        this.f69039I = i13;
        this.f69040J = i14;
    }
}
