package p115ed;

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
import id.C18404a;
import id.C18405b;
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
import p145fd.C14396b;
import p192he.C17208c;
import p249jc.AbstractC21598x;
import p326mf.C25501u;
import p460rg.EnumC31369d;
import p474s.AbstractC32004s;
import p521ue.C34856b;
import p522uf.AbstractC34881i;
import p522uf.C34889p;
import p522uf.C34893t;
import p522uf.C34895v;
import p557vo.AbstractC36221c;
import p579wc.C37070a1;
import p579wc.C37109o0;
import p581we.AbstractC37185f;
import p581we.AbstractC37200p;
import p646yd.AbstractC39453d;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.InterfaceC29123a;
import ve.InterfaceC35918c;
import ye.AbstractC39474a;

/* JADX INFO: renamed from: ed.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C13106a implements InterfaceC4534i {

    /* JADX INFO: renamed from: E */
    public final Map f45290E;

    /* JADX INFO: renamed from: F */
    public final C14396b f45291F;

    /* JADX INFO: renamed from: G */
    public final String f45292G;

    /* JADX INFO: renamed from: H */
    public final C34893t f45293H;

    /* JADX INFO: renamed from: I */
    public final C15717b f45294I;

    /* JADX INFO: renamed from: w */
    public final C13111f f45295w;

    /* JADX INFO: renamed from: x */
    public final C25411h f45296x;

    /* JADX INFO: renamed from: y */
    public final C25501u f45297y;

    /* JADX INFO: renamed from: z */
    public final C14396b f45298z;

    public C13106a(C13111f config) {
        AbstractC22676k.m65750j(config, "config");
        this.f45295w = config;
        C25411h c25411h = new C25411h();
        this.f45296x = c25411h;
        C0783z c0783z = config.f45332w;
        this.f45297y = new C25501u((InterfaceC29123a) c0783z.f2818x);
        this.f45298z = new C14396b(config, 1);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(config.f45320E, 10));
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W));
        C34856b c34856b = new C34856b("aws.auth#sigv4");
        if (linkedHashMapM74003l0.get(c34856b) == null) {
            linkedHashMapM74003l0.put(c34856b, new C26656j("awsssoportal", AbstractC37200p.f159042a));
        }
        C34856b c34856b2 = new C34856b("smithy.api#noAuth");
        if (linkedHashMapM74003l0.get(c34856b2) == null) {
            linkedHashMapM74003l0.put(c34856b2, C26647a.f105935a);
        }
        this.f45290E = AbstractC25247g0.m74001j0(linkedHashMapM74003l0);
        this.f45291F = new C14396b(config, 0);
        this.f45292G = "aws.sdk.kotlin.runtime.auth.credentials.internal.sso";
        this.f45293H = new C34893t("aws.sdk.kotlin.runtime.auth.credentials.internal.sso", config.f45327L);
        AbstractC36221c.m115320a(c25411h, (InterfaceC29123a) c0783z.f2818x);
        AbstractC36221c.m115320a(c25411h, config.f45321F);
        this.f45294I = AbstractC21478l0.m60451v(new C15716a("SSO", "1.6.2"), config.f45330O);
    }

    /* JADX INFO: renamed from: b */
    public final Object m36631b(C18404a c18404a, C37109o0 c37109o0) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d inputType = c22673i0.getOrCreateKotlinClass(C18404a.class);
        InterfaceC21461d outputType = c22673i0.getOrCreateKotlinClass(C18405b.class);
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
        int i13 = 1;
        C11943c c11943c = new C11943c(i13);
        C11942b c11942b = new C11942b(i13);
        C13111f c13111f = this.f45295w;
        c2570m.m7484K(c13111f.f45327L);
        c2570m.f9985F = this.f45292G;
        c2570m.m7483J(this.f45293H);
        C15762c c15762c = new C15762c();
        c15762c.mo33083c(new C15760a("rpc.system"), "aws-api");
        c2570m.f9989z = c15762c;
        c20245d.f76049e = new C34889p(this.f45291F, this.f45290E, this.f45298z);
        c20245d.f76050f = new C14396b(c13111f, 2);
        c20245d.m56171n((C13166o) c13111f.f45333x.f3422w);
        c20245d.m56170m(c13111f.f45326K);
        c12002a.mo33083c(AbstractC4537l.f18268a, "GetRoleCredentials");
        c12002a.mo33083c(AbstractC4537l.f18269b, "SSO");
        C25126d c25126d = new C25126d(c20245d, c12002a, c11943c, c11942b, new C34895v(inputType, outputType), c2570m);
        AbstractC21598x.m60687k0(c12002a, AbstractC34881i.f146913a, null);
        AbstractC21598x.m60687k0(c12002a, AbstractC34881i.f146914b, null);
        AbstractC21598x.m60685j0(c12002a, AbstractC4537l.f18270c, c13111f.f45334y);
        AbstractC21598x.m60685j0(c12002a, AbstractC4537l.f18271d, c13111f.f45325J);
        C15760a c15760a = AbstractC39474a.f169853a;
        String str = c13111f.f45335z;
        AbstractC21598x.m60687k0(c12002a, c15760a, str);
        AbstractC21598x.m60687k0(c12002a, AbstractC37185f.f158988a, str);
        AbstractC21598x.m60685j0(c12002a, AbstractC37185f.f158991d, "awsssoportal");
        C15760a c15760a2 = AbstractC37185f.f158993f;
        InterfaceC35918c interfaceC35918c = c13111f.f45321F;
        AbstractC21598x.m60685j0(c12002a, c15760a2, interfaceC35918c);
        AbstractC21598x.m60687k0(c12002a, AbstractC39453d.f169734a, c13111f.f45330O);
        c25126d.m73683h(new C21615a());
        ArrayList arrayList = (ArrayList) c25126d.f98482H;
        arrayList.add(C17208c.f66103a);
        arrayList.add(new C18440c());
        if (interfaceC35918c instanceof C37070a1) {
            AbstractC3187b.m9170b(c12002a, EnumC18438a.CREDENTIALS_CODE);
        }
        new C17417d(this.f45294I).mo9061c(c25126d);
        new C21616b().mo9061c(c25126d);
        arrayList.addAll(c13111f.f45324I);
        return AbstractC32004s.m99554w(c25126d, this.f45297y, c18404a, c37109o0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f45296x.m74598a();
    }
}
