package p279kd;

import cf.AbstractC4530e;
import cf.C4533h;
import cf.InterfaceC4531f;
import cf.InterfaceC4535j;
import cg.C4560o;
import eg.C13166o;
import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import mg.InterfaceC25523e;
import mg.InterfaceC25526h;
import nf.InterfaceC26654h;
import p147ff.InterfaceC14422a;
import p646yd.InterfaceC39452c;
import p692zt.C41113q;

/* JADX INFO: renamed from: kd.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C22378e implements InterfaceC39452c, InterfaceC26654h, InterfaceC4531f, InterfaceC4535j, InterfaceC25523e {

    /* JADX INFO: renamed from: d */
    public String f87356d;

    /* JADX INFO: renamed from: e */
    public List f87357e;

    /* JADX INFO: renamed from: g */
    public C4560o f87359g;

    /* JADX INFO: renamed from: i */
    public AbstractC4530e f87361i;

    /* JADX INFO: renamed from: j */
    public InterfaceC25526h f87362j;

    /* JADX INFO: renamed from: k */
    public Boolean f87363k;

    /* JADX INFO: renamed from: l */
    public Boolean f87364l;

    /* JADX INFO: renamed from: m */
    public String f87365m;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C41113q f87353a = new C41113q(17);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4533h f87354b = new C4533h();

    /* JADX INFO: renamed from: c */
    public final String f87355c = "SSO OIDC";

    /* JADX INFO: renamed from: f */
    public final C25271y f87358f = C25271y.f99162w;

    /* JADX INFO: renamed from: h */
    public final ArrayList f87360h = new ArrayList();

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: a */
    public final InterfaceC14422a mo36638a() {
        return null;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: b */
    public final Boolean mo36639b() {
        return this.f87364l;
    }

    @Override // vg.InterfaceC35954a
    public final Object build() {
        return new C22380g(this);
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: c */
    public final void mo36640c(Boolean bool) {
        this.f87364l = bool;
    }

    @Override // cf.InterfaceC4535j
    /* JADX INFO: renamed from: d */
    public final void mo14184d(AbstractC4530e abstractC4530e) {
        this.f87361i = abstractC4530e;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: e */
    public final Boolean mo36641e() {
        return this.f87363k;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: f */
    public final void mo36642f(String str) {
        this.f87365m = str;
    }

    @Override // nf.InterfaceC26654h
    /* JADX INFO: renamed from: g */
    public final List mo36643g() {
        return this.f87357e;
    }

    @Override // cf.InterfaceC4531f
    /* JADX INFO: renamed from: h */
    public final void mo14182h(C13166o c13166o) {
        this.f87354b.mo14182h(c13166o);
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: i */
    public final void mo36644i(Boolean bool) {
        this.f87363k = bool;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: j */
    public final void mo36645j(String str) {
        this.f87356d = str;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: k */
    public final String mo36646k() {
        return this.f87365m;
    }

    @Override // mg.InterfaceC25523e
    /* JADX INFO: renamed from: l */
    public final InterfaceC25526h mo36647l() {
        return this.f87362j;
    }

    @Override // nf.InterfaceC26654h
    /* JADX INFO: renamed from: m */
    public final void mo36648m(List list) {
        this.f87357e = list;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: n */
    public final String mo36649n() {
        return this.f87356d;
    }

    @Override // cf.InterfaceC4535j
    /* JADX INFO: renamed from: o */
    public final AbstractC4530e mo14185o() {
        return this.f87361i;
    }
}
