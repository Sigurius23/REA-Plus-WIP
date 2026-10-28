package p635y2;

import androidx.compose.p018ui.node.C1134a;
import java.util.Map;
import p005a3.C0230n0;
import p005a3.C0261w;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y2.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C39094g0 implements InterfaceC39130s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f168180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f168181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f168182c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function1 f168183d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C39097h0 f168184e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C39115n0 f168185f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Function1 f168186g;

    public C39094g0(int i13, int i14, Map map, Function1 function1, C39097h0 c39097h0, C39115n0 c39115n0, Function1 function2) {
        this.f168180a = i13;
        this.f168181b = i14;
        this.f168182c = map;
        this.f168183d = function1;
        this.f168184e = c39097h0;
        this.f168185f = c39115n0;
        this.f168186g = function2;
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: a */
    public final Map mo776a() {
        return this.f168182c;
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: b */
    public final void mo777b() {
        C0261w c0261w;
        C0230n0 c0230n0 = this.f168185f.f168240w;
        boolean zMo781A = this.f168184e.mo781A();
        Function1 function1 = this.f168186g;
        if (!zMo781A || (c0261w = ((C1134a) c0230n0.f783e0.f740d).f4882q0) == null) {
            function1.invoke(((C1134a) c0230n0.f783e0.f740d).f899L);
        } else {
            function1.invoke(c0261w.f899L);
        }
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: c */
    public final Function1 mo778c() {
        return this.f168183d;
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getHeight() {
        return this.f168181b;
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getWidth() {
        return this.f168180a;
    }
}
