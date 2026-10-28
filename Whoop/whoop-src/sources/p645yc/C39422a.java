package p645yc;

import b30.C2570m;
import bd.C3080b;
import bf.AbstractC3187b;
import cd.C4423c;
import cd.C4425e;
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
import m83.C25271y;
import mc.C25411h;
import mg.C25525g;
import mg.InterfaceC25526h;
import nf.C26647a;
import nf.C26656j;
import nf.InterfaceC26651e;
import p089dd.C11942b;
import p089dd.C11943c;
import p091dg.C12002a;
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
import p579wc.C37075c0;
import p581we.AbstractC37185f;
import p581we.AbstractC37200p;
import p646yd.AbstractC39453d;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.InterfaceC29123a;
import ve.InterfaceC35921f;
import ye.AbstractC39474a;

/* JADX INFO: renamed from: yc.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C39422a implements InterfaceC4534i {

    /* JADX INFO: renamed from: E */
    public final Map f169592E;

    /* JADX INFO: renamed from: F */
    public final C3080b f169593F;

    /* JADX INFO: renamed from: G */
    public final String f169594G;

    /* JADX INFO: renamed from: H */
    public final C34893t f169595H;

    /* JADX INFO: renamed from: I */
    public final C15717b f169596I;

    /* JADX INFO: renamed from: w */
    public final C39427f f169597w;

    /* JADX INFO: renamed from: x */
    public final C25411h f169598x;

    /* JADX INFO: renamed from: y */
    public final C25501u f169599y;

    /* JADX INFO: renamed from: z */
    public final C3080b f169600z;

    public C39422a(C39427f config) {
        AbstractC22676k.m65750j(config, "config");
        this.f169597w = config;
        this.f169598x = new C25411h();
        this.f169599y = new C25501u((InterfaceC29123a) config.f169641w.f2818x);
        this.f169600z = new C3080b(config, 2);
        C25271y c25271y = config.f169629G;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25271y, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W);
        for (Object obj : c25271y) {
            linkedHashMap.put(new C34856b(((InterfaceC26651e) obj).mo79292c()), obj);
        }
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(linkedHashMap);
        C34856b c34856b = new C34856b("aws.auth#sigv4");
        if (linkedHashMapM74003l0.get(c34856b) == null) {
            linkedHashMapM74003l0.put(c34856b, new C26656j("signin", AbstractC37200p.f159042a));
        }
        C34856b c34856b2 = new C34856b("smithy.api#noAuth");
        if (linkedHashMapM74003l0.get(c34856b2) == null) {
            linkedHashMapM74003l0.put(c34856b2, C26647a.f105935a);
        }
        this.f169592E = AbstractC25247g0.m74001j0(linkedHashMapM74003l0);
        this.f169593F = new C3080b(this.f169597w, 1);
        this.f169594G = "aws.sdk.kotlin.runtime.auth.credentials.internal.signin";
        this.f169595H = new C34893t("aws.sdk.kotlin.runtime.auth.credentials.internal.signin", this.f169597w.f169636N);
        AbstractC36221c.m115320a(this.f169598x, (InterfaceC29123a) this.f169597w.f169641w.f2818x);
        AbstractC36221c.m115320a(this.f169598x, this.f169597w.f169630H);
        this.f169596I = AbstractC21478l0.m60451v(new C15716a("Signin", "1.6.2"), this.f169597w.f169639Q);
    }

    /* JADX INFO: renamed from: b */
    public final Object m125935b(C4423c c4423c, C37075c0 c37075c0) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d inputType = c22673i0.getOrCreateKotlinClass(C4423c.class);
        InterfaceC21461d outputType = c22673i0.getOrCreateKotlinClass(C4425e.class);
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
        int i13 = 0;
        C11943c c11943c = new C11943c(i13);
        C11942b c11942b = new C11942b(i13);
        C39427f c39427f = this.f169597w;
        c2570m.m7484K(c39427f.f169636N);
        c2570m.f9985F = this.f169594G;
        c2570m.m7483J(this.f169595H);
        C15762c c15762c = new C15762c();
        c15762c.mo33083c(new C15760a("rpc.system"), "aws-api");
        c2570m.f9989z = c15762c;
        c20245d.f76049e = new C34889p(this.f169593F, this.f169592E, this.f169600z);
        c20245d.f76050f = new C3080b(c39427f, 0);
        c20245d.m56171n((C13166o) c39427f.f169642x.f3422w);
        c20245d.m56170m(c39427f.f169635M);
        c12002a.mo33083c(AbstractC4537l.f18268a, "CreateOAuth2Token");
        c12002a.mo33083c(AbstractC4537l.f18269b, "Signin");
        C25126d c25126d = new C25126d(c20245d, c12002a, c11943c, c11942b, new C34895v(inputType, outputType), c2570m);
        AbstractC21598x.m60687k0(c12002a, AbstractC34881i.f146913a, null);
        AbstractC21598x.m60687k0(c12002a, AbstractC34881i.f146914b, null);
        AbstractC21598x.m60685j0(c12002a, AbstractC4537l.f18270c, c39427f.f169643y);
        AbstractC21598x.m60685j0(c12002a, AbstractC4537l.f18271d, c39427f.f169634L);
        C15760a c15760a = AbstractC39474a.f169853a;
        String str = c39427f.f169644z;
        AbstractC21598x.m60687k0(c12002a, c15760a, str);
        AbstractC21598x.m60687k0(c12002a, AbstractC37185f.f158988a, str);
        AbstractC21598x.m60685j0(c12002a, AbstractC37185f.f158991d, "signin");
        C15760a c15760a2 = AbstractC37185f.f158993f;
        InterfaceC35921f interfaceC35921f = c39427f.f169630H;
        AbstractC21598x.m60685j0(c12002a, c15760a2, interfaceC35921f);
        AbstractC21598x.m60687k0(c12002a, AbstractC39453d.f169734a, c39427f.f169639Q);
        c25126d.m73683h(new C21615a());
        ArrayList arrayList = (ArrayList) c25126d.f98482H;
        arrayList.add(C17208c.f66103a);
        arrayList.add(new C18440c());
        if (interfaceC35921f instanceof C37070a1) {
            AbstractC3187b.m9170b(c12002a, EnumC18438a.CREDENTIALS_CODE);
        }
        new C17417d(this.f169596I).mo9061c(c25126d);
        new C21616b().mo9061c(c25126d);
        arrayList.addAll(c39427f.f169633K);
        return AbstractC32004s.m99554w(c25126d, this.f169599y, c4423c, c37075c0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f169598x.m74598a();
    }
}
