package p645yc;

import cf.AbstractC4530e;
import cf.C4533h;
import cf.InterfaceC4531f;
import cf.InterfaceC4535j;
import cg.C4560o;
import eg.C13166o;
import gg.InterfaceC15820g;
import java.util.ArrayList;
import java.util.List;
import kr.C22786e;
import m83.C25271y;
import mg.InterfaceC25523e;
import mg.InterfaceC25526h;
import nf.InterfaceC26654h;
import p145fd.C14395a;
import p147ff.InterfaceC14422a;
import p646yd.InterfaceC39452c;
import p692zt.C41113q;
import ve.InterfaceC35921f;

/* JADX INFO: renamed from: yc.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C39426e implements InterfaceC39452c, InterfaceC26654h, InterfaceC4531f, InterfaceC4535j, InterfaceC25523e {

    /* JADX INFO: renamed from: d */
    public String f169612d;

    /* JADX INFO: renamed from: e */
    public InterfaceC14422a f169613e;

    /* JADX INFO: renamed from: f */
    public List f169614f;

    /* JADX INFO: renamed from: h */
    public InterfaceC35921f f169616h;

    /* JADX INFO: renamed from: i */
    public C22786e f169617i;

    /* JADX INFO: renamed from: j */
    public C4560o f169618j;

    /* JADX INFO: renamed from: l */
    public AbstractC4530e f169620l;

    /* JADX INFO: renamed from: m */
    public InterfaceC15820g f169621m;

    /* JADX INFO: renamed from: n */
    public InterfaceC25526h f169622n;

    /* JADX INFO: renamed from: o */
    public Boolean f169623o;

    /* JADX INFO: renamed from: p */
    public Boolean f169624p;

    /* JADX INFO: renamed from: q */
    public String f169625q;

    /* JADX INFO: renamed from: r */
    public C14395a f169626r;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C41113q f169609a = new C41113q(17);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4533h f169610b = new C4533h();

    /* JADX INFO: renamed from: c */
    public String f169611c = "Signin";

    /* JADX INFO: renamed from: g */
    public C25271y f169615g = C25271y.f99162w;

    /* JADX INFO: renamed from: k */
    public ArrayList f169619k = new ArrayList();

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: a */
    public final InterfaceC14422a mo36638a() {
        return this.f169613e;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: b */
    public final Boolean mo36639b() {
        return this.f169624p;
    }

    @Override // vg.InterfaceC35954a
    public final Object build() {
        return new C39427f(this);
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: c */
    public final void mo36640c(Boolean bool) {
        this.f169624p = bool;
    }

    @Override // cf.InterfaceC4535j
    /* JADX INFO: renamed from: d */
    public final void mo14184d(AbstractC4530e abstractC4530e) {
        this.f169620l = abstractC4530e;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: e */
    public final Boolean mo36641e() {
        return this.f169623o;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: f */
    public final void mo36642f(String str) {
        this.f169625q = str;
    }

    @Override // nf.InterfaceC26654h
    /* JADX INFO: renamed from: g */
    public final List mo36643g() {
        return this.f169614f;
    }

    @Override // cf.InterfaceC4531f
    /* JADX INFO: renamed from: h */
    public final void mo14182h(C13166o c13166o) {
        this.f169610b.mo14182h(c13166o);
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: i */
    public final void mo36644i(Boolean bool) {
        this.f169623o = bool;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: j */
    public final void mo36645j(String str) {
        this.f169612d = str;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: k */
    public final String mo36646k() {
        return this.f169625q;
    }

    @Override // mg.InterfaceC25523e
    /* JADX INFO: renamed from: l */
    public final InterfaceC25526h mo36647l() {
        return this.f169622n;
    }

    @Override // nf.InterfaceC26654h
    /* JADX INFO: renamed from: m */
    public final void mo36648m(List list) {
        this.f169614f = list;
    }

    @Override // p646yd.InterfaceC39452c
    /* JADX INFO: renamed from: n */
    public final String mo36649n() {
        return this.f169612d;
    }

    @Override // cf.InterfaceC4535j
    /* JADX INFO: renamed from: o */
    public final AbstractC4530e mo14185o() {
        return this.f169620l;
    }
}
