package p279kd;

import ad3.C0783z;
import b30.C2570m;
import bf.AbstractC3187b;
import cf.AbstractC4537l;
import cf.InterfaceC4534i;
import eg.C13166o;
import ge.C15716a;
import ge.C15717b;
import gf.C15760a;
import gf.C15762c;
import gf.C15768i;
import hm.C17417d;
import ie.C18440c;
import ie.EnumC18438a;
import io.sentry.android.replay.video.C20245d;
import j93.AbstractC21478l0;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import je.C21615a;
import je.C21616b;
import m63.C25126d;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import mc.C25411h;
import mg.C25525g;
import mg.InterfaceC25526h;
import nf.C26647a;
import nf.C26656j;
import p089dd.C11942b;
import p089dd.C11943c;
import p091dg.C12002a;
import p192he.C17208c;
import p249jc.AbstractC21598x;
import p300ld.C23841a;
import p326mf.C25501u;
import p365od.C27825d;
import p365od.C27826e;
import p460rg.EnumC31369d;
import p474s.AbstractC32004s;
import p521ue.C34856b;
import p522uf.AbstractC34881i;
import p522uf.C34889p;
import p522uf.C34893t;
import p522uf.C34895v;
import p557vo.AbstractC36221c;
import p579wc.C37070a1;
import p579wc.C37123v0;
import p581we.AbstractC37185f;
import p581we.AbstractC37200p;
import p646yd.AbstractC39453d;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.InterfaceC29123a;
import ve.InterfaceC35918c;
import ye.AbstractC39474a;

/* JADX INFO: renamed from: kd.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C22374a implements InterfaceC4534i {

    /* JADX INFO: renamed from: E */
    public final Map f87336E;

    /* JADX INFO: renamed from: F */
    public final C23841a f87337F;

    /* JADX INFO: renamed from: G */
    public final String f87338G;

    /* JADX INFO: renamed from: H */
    public final C34893t f87339H;

    /* JADX INFO: renamed from: I */
    public final C15717b f87340I;

    /* JADX INFO: renamed from: w */
    public final C22380g f87341w;

    /* JADX INFO: renamed from: x */
    public final C25411h f87342x;

    /* JADX INFO: renamed from: y */
    public final C25501u f87343y;

    /* JADX INFO: renamed from: z */
    public final C23841a f87344z;

    public C22374a(C22380g config) {
        AbstractC22676k.m65750j(config, "config");
        this.f87341w = config;
        C25411h c25411h = new C25411h();
        this.f87342x = c25411h;
        C0783z c0783z = config.f87381w;
        this.f87343y = new C25501u((InterfaceC29123a) c0783z.f2818x);
        this.f87344z = new C23841a(config, 1);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(config.f87369E, 10));
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W));
        C34856b c34856b = new C34856b("aws.auth#sigv4");
        if (linkedHashMapM74003l0.get(c34856b) == null) {
            linkedHashMapM74003l0.put(c34856b, new C26656j("sso-oauth", AbstractC37200p.f159042a));
        }
        C34856b c34856b2 = new C34856b("smithy.api#noAuth");
        if (linkedHashMapM74003l0.get(c34856b2) == null) {
            linkedHashMapM74003l0.put(c34856b2, C26647a.f105935a);
        }
        this.f87336E = AbstractC25247g0.m74001j0(linkedHashMapM74003l0);
        this.f87337F = new C23841a(config, 0);
        this.f87338G = "aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc";
        this.f87339H = new C34893t("aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc", config.f87376L);
        AbstractC36221c.m115320a(c25411h, (InterfaceC29123a) c0783z.f2818x);
        AbstractC36221c.m115320a(c25411h, config.f87370F);
        this.f87340I = AbstractC21478l0.m60451v(new C15716a("SSO OIDC", "1.6.2"), config.f87379O);
    }

    /* JADX INFO: renamed from: b */
    public final Object m64294b(C27825d c27825d, C37123v0 c37123v0) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d inputType = c22673i0.getOrCreateKotlinClass(C27825d.class);
        InterfaceC21461d outputType = c22673i0.getOrCreateKotlinClass(C27826e.class);
        AbstractC22676k.m65750j(inputType, "inputType");
        AbstractC22676k.m65750j(outputType, "outputType");
        C2570m c2570m = new C2570m(20);
        InterfaceC25526h.f99937a.getClass();
        c2570m.f9987x = C25525g.f99936b;
        c2570m.f9988y = EnumC31369d.f129030x;
        c2570m.f9989z = C15768i.f59433w;
        c2570m.f9984E = C34893t.f146944n;
        C20245d c20245d = new C20245d(4);
        C12002a c12002a = new C12002a();
        int i13 = 2;
        C11943c c11943c = new C11943c(i13);
        C11942b c11942b = new C11942b(i13);
        C22380g c22380g = this.f87341w;
        c2570m.m7484K(c22380g.f87376L);
        c2570m.f9985F = this.f87338G;
        c2570m.m7483J(this.f87339H);
        C15762c c15762c = new C15762c();
        c15762c.mo33083c(new C15760a("rpc.system"), "aws-api");
        c2570m.f9989z = c15762c;
        c20245d.f76049e = new C34889p(this.f87337F, this.f87336E, this.f87344z);
        c20245d.f76050f = new C23841a(c22380g, 2);
        c20245d.m56171n((C13166o) c22380g.f87382x.f3422w);
        c20245d.m56170m(c22380g.f87375K);
        c12002a.mo33083c(AbstractC4537l.f18268a, "CreateToken");
        c12002a.mo33083c(AbstractC4537l.f18269b, "SSO OIDC");
        C25126d c25126d = new C25126d(c20245d, c12002a, c11943c, c11942b, new C34895v(inputType, outputType), c2570m);
        AbstractC21598x.m60687k0(c12002a, AbstractC34881i.f146913a, null);
        AbstractC21598x.m60687k0(c12002a, AbstractC34881i.f146914b, null);
        AbstractC21598x.m60685j0(c12002a, AbstractC4537l.f18270c, c22380g.f87383y);
        AbstractC21598x.m60685j0(c12002a, AbstractC4537l.f18271d, c22380g.f87374J);
        C15760a c15760a = AbstractC39474a.f169853a;
        String str = c22380g.f87384z;
        AbstractC21598x.m60687k0(c12002a, c15760a, str);
        AbstractC21598x.m60687k0(c12002a, AbstractC37185f.f158988a, str);
        AbstractC21598x.m60685j0(c12002a, AbstractC37185f.f158991d, "sso-oauth");
        C15760a c15760a2 = AbstractC37185f.f158993f;
        InterfaceC35918c interfaceC35918c = c22380g.f87370F;
        AbstractC21598x.m60685j0(c12002a, c15760a2, interfaceC35918c);
        AbstractC21598x.m60687k0(c12002a, AbstractC39453d.f169734a, c22380g.f87379O);
        c25126d.m73683h(new C21615a());
        ArrayList arrayList = (ArrayList) c25126d.f98482H;
        arrayList.add(C17208c.f66103a);
        arrayList.add(new C18440c());
        if (interfaceC35918c instanceof C37070a1) {
            AbstractC3187b.m9170b(c12002a, EnumC18438a.CREDENTIALS_CODE);
        }
        new C17417d(this.f87340I).mo9061c(c25126d);
        new C21616b().mo9061c(c25126d);
        arrayList.addAll(c22380g.f87373I);
        return AbstractC32004s.m99554w(c25126d, this.f87343y, c27825d, c37123v0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f87342x.m74598a();
    }
}
