package p421qd;

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
import p326mf.C25483c;
import p326mf.C25501u;
import p458rd.C31238a;
import p460rg.EnumC31369d;
import p474s.AbstractC32004s;
import p520ud.C34780a;
import p520ud.C34781b;
import p520ud.C34782c;
import p520ud.C34783d;
import p521ue.C34856b;
import p522uf.AbstractC34881i;
import p522uf.C34889p;
import p522uf.C34893t;
import p522uf.C34895v;
import p557vo.AbstractC36221c;
import p579wc.C37070a1;
import p579wc.C37076c1;
import p579wc.C37088g1;
import p581we.AbstractC37185f;
import p581we.AbstractC37200p;
import p646yd.AbstractC39453d;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.InterfaceC29123a;
import q30.C29938w0;
import ye.AbstractC39474a;

/* JADX INFO: renamed from: qd.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C30286a implements InterfaceC4534i {

    /* JADX INFO: renamed from: E */
    public final Map f123848E;

    /* JADX INFO: renamed from: F */
    public final C31238a f123849F;

    /* JADX INFO: renamed from: G */
    public final String f123850G;

    /* JADX INFO: renamed from: H */
    public final C34893t f123851H;

    /* JADX INFO: renamed from: I */
    public final C15717b f123852I;

    /* JADX INFO: renamed from: w */
    public final C30291f f123853w;

    /* JADX INFO: renamed from: x */
    public final C25411h f123854x;

    /* JADX INFO: renamed from: y */
    public final C25501u f123855y;

    /* JADX INFO: renamed from: z */
    public final C31238a f123856z;

    public C30286a(C30291f config) {
        AbstractC22676k.m65750j(config, "config");
        this.f123853w = config;
        C25411h c25411h = new C25411h();
        this.f123854x = c25411h;
        C0783z c0783z = config.f123891w;
        this.f123855y = new C25501u((InterfaceC29123a) c0783z.f2818x);
        this.f123856z = new C31238a(config, 1);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(config.f123879E, 10));
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W));
        C34856b c34856b = new C34856b("aws.auth#sigv4");
        if (linkedHashMapM74003l0.get(c34856b) == null) {
            linkedHashMapM74003l0.put(c34856b, new C26656j("sts", AbstractC37200p.f159042a));
        }
        C34856b c34856b2 = new C34856b("smithy.api#noAuth");
        if (linkedHashMapM74003l0.get(c34856b2) == null) {
            linkedHashMapM74003l0.put(c34856b2, C26647a.f105935a);
        }
        this.f123848E = AbstractC25247g0.m74001j0(linkedHashMapM74003l0);
        this.f123849F = new C31238a(config, 0);
        this.f123850G = "aws.sdk.kotlin.runtime.auth.credentials.internal.sts";
        this.f123851H = new C34893t("aws.sdk.kotlin.runtime.auth.credentials.internal.sts", config.f123886L);
        AbstractC36221c.m115320a(c25411h, (InterfaceC29123a) c0783z.f2818x);
        AbstractC36221c.m115320a(c25411h, config.f123880F);
        this.f123852I = AbstractC21478l0.m60451v(new C15716a("STS", "1.6.2"), config.f123889O);
    }

    /* JADX INFO: renamed from: b */
    public final Object m92541b(C34780a c34780a, C37076c1 c37076c1) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d inputType = c22673i0.getOrCreateKotlinClass(C34780a.class);
        InterfaceC21461d outputType = c22673i0.getOrCreateKotlinClass(C34781b.class);
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
        int i13 = 12;
        C11943c c11943c = new C11943c(i13);
        C11942b c11942b = new C11942b(i13);
        C30291f c30291f = this.f123853w;
        c2570m.m7484K(c30291f.f123886L);
        c2570m.f9985F = this.f123850G;
        c2570m.m7483J(this.f123851H);
        C15762c c15762c = new C15762c();
        c15762c.mo33083c(new C15760a("rpc.system"), "aws-api");
        c2570m.f9989z = c15762c;
        c20245d.f76049e = new C34889p(this.f123849F, this.f123848E, this.f123856z);
        c20245d.f76050f = new C31238a(c30291f, 2);
        c20245d.m56171n((C13166o) c30291f.f123892x.f3422w);
        c20245d.m56170m(c30291f.f123885K);
        c12002a.mo33083c(AbstractC4537l.f18268a, "AssumeRole");
        c12002a.mo33083c(AbstractC4537l.f18269b, "STS");
        C25126d c25126d = new C25126d(c20245d, c12002a, c11943c, c11942b, new C34895v(inputType, outputType), c2570m);
        m92543i(c12002a);
        c25126d.m73683h(new C21615a());
        ArrayList arrayList = (ArrayList) c25126d.f98482H;
        arrayList.add(C17208c.f66103a);
        arrayList.add(new C18440c());
        if (c30291f.f123880F instanceof C37070a1) {
            AbstractC3187b.m9170b(c12002a, EnumC18438a.CREDENTIALS_CODE);
        }
        C29938w0 c29938w0 = new C29938w0(14);
        ((C25483c) c29938w0.f122262z).m386f("application/x-www-form-urlencoded", "Content-Type");
        c29938w0.mo9061c(c25126d);
        new C17417d(this.f123852I).mo9061c(c25126d);
        new C21616b().mo9061c(c25126d);
        arrayList.addAll(c30291f.f123883I);
        return AbstractC32004s.m99554w(c25126d, this.f123855y, c34780a, c37076c1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f123854x.m74598a();
    }

    /* JADX INFO: renamed from: h */
    public final Object m92542h(C34782c c34782c, C37088g1 c37088g1) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d inputType = c22673i0.getOrCreateKotlinClass(C34782c.class);
        InterfaceC21461d outputType = c22673i0.getOrCreateKotlinClass(C34783d.class);
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
        int i13 = 13;
        C11943c c11943c = new C11943c(i13);
        C11942b c11942b = new C11942b(i13);
        C30291f c30291f = this.f123853w;
        c2570m.m7484K(c30291f.f123886L);
        c2570m.f9985F = this.f123850G;
        c2570m.m7483J(this.f123851H);
        C15762c c15762c = new C15762c();
        c15762c.mo33083c(new C15760a("rpc.system"), "aws-api");
        c2570m.f9989z = c15762c;
        c20245d.f76049e = new C34889p(this.f123849F, this.f123848E, this.f123856z);
        c20245d.f76050f = new C31238a(c30291f, 2);
        c20245d.m56171n((C13166o) c30291f.f123892x.f3422w);
        c20245d.m56170m(c30291f.f123885K);
        c12002a.mo33083c(AbstractC4537l.f18268a, "AssumeRoleWithWebIdentity");
        c12002a.mo33083c(AbstractC4537l.f18269b, "STS");
        C25126d c25126d = new C25126d(c20245d, c12002a, c11943c, c11942b, new C34895v(inputType, outputType), c2570m);
        m92543i(c12002a);
        c25126d.m73683h(new C21615a());
        ArrayList arrayList = (ArrayList) c25126d.f98482H;
        arrayList.add(C17208c.f66103a);
        arrayList.add(new C18440c());
        if (c30291f.f123880F instanceof C37070a1) {
            AbstractC3187b.m9170b(c12002a, EnumC18438a.CREDENTIALS_CODE);
        }
        C29938w0 c29938w0 = new C29938w0(14);
        ((C25483c) c29938w0.f122262z).m386f("application/x-www-form-urlencoded", "Content-Type");
        c29938w0.mo9061c(c25126d);
        new C17417d(this.f123852I).mo9061c(c25126d);
        new C21616b().mo9061c(c25126d);
        arrayList.addAll(c30291f.f123883I);
        return AbstractC32004s.m99554w(c25126d, this.f123855y, c34782c, c37088g1);
    }

    /* JADX INFO: renamed from: i */
    public final void m92543i(C12002a c12002a) {
        C15760a c15760a = AbstractC34881i.f146913a;
        C30291f c30291f = this.f123853w;
        c30291f.getClass();
        AbstractC21598x.m60687k0(c12002a, c15760a, null);
        AbstractC21598x.m60687k0(c12002a, AbstractC34881i.f146914b, null);
        AbstractC21598x.m60685j0(c12002a, AbstractC4537l.f18270c, c30291f.f123893y);
        AbstractC21598x.m60685j0(c12002a, AbstractC4537l.f18271d, c30291f.f123884J);
        C15760a c15760a2 = AbstractC39474a.f169853a;
        String str = c30291f.f123894z;
        AbstractC21598x.m60687k0(c12002a, c15760a2, str);
        AbstractC21598x.m60687k0(c12002a, AbstractC37185f.f158988a, str);
        AbstractC21598x.m60685j0(c12002a, AbstractC37185f.f158991d, "sts");
        AbstractC21598x.m60685j0(c12002a, AbstractC37185f.f158993f, c30291f.f123880F);
        AbstractC21598x.m60687k0(c12002a, AbstractC39453d.f169734a, c30291f.f123889O);
    }
}
