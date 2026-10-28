package b30;

import androidx.compose.material3.AbstractC1123d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import d30.C11568w;
import g40.C15397o;
import h20.C16659g1;
import java.util.List;
import l83.C23454a0;
import m40.C25046w;
import p023ay.C2140n;
import p108e4.AbstractC12667a;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p292l1.C23083d4;
import p390p1.AbstractC28683x;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.functions.Function1;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: b30.v */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2637v implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f10288E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f10289F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f10290G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f10291H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10292w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10293x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f10294y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f10295z;

    public /* synthetic */ C2637v(Modifier modifier, boolean z4, boolean z13, Function1 function1, C2140n c2140n, C15397o c15397o, int i13) {
        this.f10288E = modifier;
        this.f10293x = z4;
        this.f10294y = z13;
        this.f10291H = function1;
        this.f10289F = c2140n;
        this.f10290G = c15397o;
        this.f10295z = i13;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10292w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC34235f.m108217c((String) this.f10288E, (C2602q) this.f10289F, this.f10290G, this.f10293x, this.f10295z, (Function1) this.f10291H, this.f10294y, (Composer) obj, iM87244L);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC12667a.m35456h(this.f10293x, this.f10294y, (C11568w) this.f10288E, (C25046w) this.f10289F, (Modifier) this.f10290G, (C16659g1) this.f10291H, (Composer) obj, AbstractC28683x.m87244L(this.f10295z | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC37978j.m121644e((Modifier) this.f10288E, this.f10293x, this.f10294y, (Function1) this.f10291H, (C2140n) this.f10289F, (C15397o) this.f10290G, (Composer) obj, AbstractC28683x.m87244L(this.f10295z | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1123d.m3466b((Modifier) this.f10288E, this.f10293x, this.f10294y, (C23083d4) this.f10289F, (InterfaceC21083i) this.f10290G, (InterfaceC17869a1) this.f10291H, (Composer) obj, AbstractC28683x.m87244L(this.f10295z | 1));
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C2637v(Modifier modifier, boolean z4, boolean z13, C23083d4 c23083d4, InterfaceC21083i interfaceC21083i, InterfaceC17869a1 interfaceC17869a1, int i13) {
        this.f10288E = modifier;
        this.f10293x = z4;
        this.f10294y = z13;
        this.f10289F = c23083d4;
        this.f10290G = interfaceC21083i;
        this.f10291H = interfaceC17869a1;
        this.f10295z = i13;
    }

    public /* synthetic */ C2637v(String str, C2602q c2602q, List list, boolean z4, int i13, Function1 function1, boolean z13, int i14) {
        this.f10288E = str;
        this.f10289F = c2602q;
        this.f10290G = list;
        this.f10293x = z4;
        this.f10295z = i13;
        this.f10291H = function1;
        this.f10294y = z13;
    }

    public /* synthetic */ C2637v(boolean z4, boolean z13, C11568w c11568w, C25046w c25046w, Modifier modifier, C16659g1 c16659g1, int i13) {
        this.f10293x = z4;
        this.f10294y = z13;
        this.f10288E = c11568w;
        this.f10289F = c25046w;
        this.f10290G = modifier;
        this.f10291H = c16659g1;
        this.f10295z = i13;
    }
}
