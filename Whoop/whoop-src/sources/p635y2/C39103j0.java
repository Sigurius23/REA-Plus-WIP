package p635y2;

import java.util.Map;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y2.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C39103j0 implements InterfaceC39130s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC39130s0 f168206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39115n0 f168207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f168208c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC39130s0 f168209d;

    public C39103j0(InterfaceC39130s0 interfaceC39130s0, C39115n0 c39115n0, int i13, InterfaceC39130s0 interfaceC39130s1) {
        this.f168207b = c39115n0;
        this.f168208c = i13;
        this.f168209d = interfaceC39130s1;
        this.f168206a = interfaceC39130s0;
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: a */
    public final Map mo776a() {
        return this.f168206a.mo776a();
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: b */
    public final void mo777b() {
        int i13 = this.f168208c;
        C39115n0 c39115n0 = this.f168207b;
        c39115n0.f168243z = i13;
        this.f168209d.mo777b();
        c39115n0.m124642c(c39115n0.f168243z);
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: c */
    public final Function1 mo778c() {
        return this.f168206a.mo778c();
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getHeight() {
        return this.f168206a.getHeight();
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getWidth() {
        return this.f168206a.getWidth();
    }
}
