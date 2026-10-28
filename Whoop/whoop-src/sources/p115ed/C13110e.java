package p115ed;

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

/* JADX INFO: renamed from: ed.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C13110e implements InterfaceC39452c, InterfaceC26654h, InterfaceC4531f, InterfaceC4535j, InterfaceC25523e {

    /* JADX INFO: renamed from: d */
    public String f45310d;

    /* JADX INFO: renamed from: e */
    public List f45311e;

    /* JADX INFO: renamed from: g */
    public C4560o f45313g;

    /* JADX INFO: renamed from: i */
    public AbstractC4530e f45315i;

    /* JADX INFO: renamed from: j */
    public InterfaceC25526h f45316j;

    /* JADX INFO: renamed from: k */
    public Boolean f45317k;

    /* JADX INFO: renamed from: l */
    public Boolean f45318l;

    /* JADX INFO: renamed from: m */
    public String f45319m;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C41113q f45307a = new C41113q(17);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4533h f45308b = new C4533h();

    /* JADX INFO: renamed from: c */
    public final String f45309c = "SSO";

    /* JADX INFO: renamed from: f */
    public final C25271y f45312f = C25271y.f99162w;

    /* JADX INFO: renamed from: h */
    public final ArrayList f45314h = new ArrayList();

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: a */
    public final InterfaceC14422a mo36638a() {
        return null;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: b */
    public final Boolean mo36639b() {
        return this.f45318l;
    }

    @Override // vg.InterfaceC35954a
    public final Object build() {
        return new C13111f(this);
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: c */
    public final void mo36640c(Boolean bool) {
        this.f45318l = bool;
    }

    @Override // cf.InterfaceC4535j
    /* JADX INFO: renamed from: d */
    public final void mo14184d(AbstractC4530e abstractC4530e) {
        this.f45315i = abstractC4530e;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: e */
    public final Boolean mo36641e() {
        return this.f45317k;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: f */
    public final void mo36642f(String str) {
        this.f45319m = str;
    }

    @Override // nf.InterfaceC26654h
    /* JADX INFO: renamed from: g */
    public final List mo36643g() {
        return this.f45311e;
    }

    @Override // cf.InterfaceC4531f
    /* JADX INFO: renamed from: h */
    public final void mo14182h(C13166o c13166o) {
        this.f45308b.mo14182h(c13166o);
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: i */
    public final void mo36644i(Boolean bool) {
        this.f45317k = bool;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: j */
    public final void mo36645j(String str) {
        this.f45310d = str;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: k */
    public final String mo36646k() {
        return this.f45319m;
    }

    @Override // mg.InterfaceC25523e
    /* JADX INFO: renamed from: l */
    public final InterfaceC25526h mo36647l() {
        return this.f45316j;
    }

    @Override // nf.InterfaceC26654h
    /* JADX INFO: renamed from: m */
    public final void mo36648m(List list) {
        this.f45311e = list;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: n */
    public final String mo36649n() {
        return this.f45310d;
    }

    @Override // cf.InterfaceC4535j
    /* JADX INFO: renamed from: o */
    public final AbstractC4530e mo14185o() {
        return this.f45315i;
    }
}
