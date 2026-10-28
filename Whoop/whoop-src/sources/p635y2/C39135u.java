package p635y2;

import java.util.Map;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y2.u */
/* JADX INFO: loaded from: classes.dex */
public final class C39135u implements InterfaceC39130s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f168275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f168276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f168277c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function1 f168278d;

    public C39135u(int i13, int i14, Map map, Function1 function1) {
        this.f168275a = i13;
        this.f168276b = i14;
        this.f168277c = map;
        this.f168278d = function1;
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: a */
    public final Map mo776a() {
        return this.f168277c;
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: b */
    public final void mo777b() {
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: c */
    public final Function1 mo778c() {
        return this.f168278d;
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getHeight() {
        return this.f168276b;
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getWidth() {
        return this.f168275a;
    }
}
