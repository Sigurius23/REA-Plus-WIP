package ne;

import ad3.C0783z;
import b30.C2570m;
import bf.AbstractC3187b;
import cf.AbstractC4537l;
import e10.C12554k0;
import eg.C13166o;
import ge.C15716a;
import ge.C15717b;
import gf.C15760a;
import hm.C17417d;
import ie.C18440c;
import ie.EnumC18438a;
import j93.AbstractC21478l0;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import je.C21615a;
import je.C21616b;
import m63.C25126d;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import mc.C25411h;
import nf.C26647a;
import nf.C26656j;
import p014aj.C0928c;
import p089dd.C11942b;
import p089dd.C11943c;
import p091dg.C12002a;
import p127ev.C13668i;
import p192he.C17208c;
import p249jc.AbstractC21598x;
import p326mf.C25501u;
import p474s.AbstractC32004s;
import p521ue.C34856b;
import p522uf.AbstractC34881i;
import p522uf.C34889p;
import p522uf.C34893t;
import p557vo.AbstractC36221c;
import p579wc.C37070a1;
import p581we.AbstractC37185f;
import p581we.AbstractC37200p;
import p646yd.AbstractC39453d;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.InterfaceC29123a;
import q30.C29934u0;
import q83.InterfaceC30057d;
import re.C31254a0;
import re.C31257b0;
import re.C31261c1;
import re.C31264d1;
import re.C31267e1;
import re.C31270f1;
import re.C31278j0;
import re.C31280k0;
import re.C31282l0;
import re.C31284m0;
import re.C31286n0;
import re.C31288o0;
import re.C31294r0;
import re.C31296s0;
import re.C31298t0;
import re.C31300u0;
import re.C31304w0;
import re.C31306x0;
import s83.AbstractC32269c;
import ye.AbstractC39474a;
import z40.C40062i;

/* JADX INFO: renamed from: ne.d */
/* JADX INFO: loaded from: classes.dex */
public final class C26595d implements InterfaceC26594c {

    /* JADX INFO: renamed from: E */
    public final Map f105786E;

    /* JADX INFO: renamed from: F */
    public final C0783z f105787F;

    /* JADX INFO: renamed from: G */
    public final String f105788G;

    /* JADX INFO: renamed from: H */
    public final C34893t f105789H;

    /* JADX INFO: renamed from: I */
    public final C15717b f105790I;

    /* JADX INFO: renamed from: w */
    public final C26593b f105791w;

    /* JADX INFO: renamed from: x */
    public final C25411h f105792x;

    /* JADX INFO: renamed from: y */
    public final C25501u f105793y;

    /* JADX INFO: renamed from: z */
    public final C0928c f105794z;

    public C26595d(C26593b config) {
        AbstractC22676k.m65750j(config, "config");
        this.f105791w = config;
        C25411h c25411h = new C25411h();
        this.f105792x = c25411h;
        C0783z c0783z = config.f105782w;
        this.f105793y = new C25501u((InterfaceC29123a) c0783z.f2818x);
        this.f105794z = new C0928c(config);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(config.f105770E, 10));
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W));
        C34856b c34856b = new C34856b("aws.auth#sigv4");
        if (linkedHashMapM74003l0.get(c34856b) == null) {
            linkedHashMapM74003l0.put(c34856b, new C26656j("cognito-idp", AbstractC37200p.f159042a));
        }
        C34856b c34856b2 = new C34856b("smithy.api#noAuth");
        if (linkedHashMapM74003l0.get(c34856b2) == null) {
            linkedHashMapM74003l0.put(c34856b2, C26647a.f105935a);
        }
        this.f105786E = AbstractC25247g0.m74001j0(linkedHashMapM74003l0);
        this.f105787F = new C0783z(config);
        this.f105788G = "aws.sdk.kotlin.services.cognitoidentityprovider";
        this.f105789H = new C34893t("aws.sdk.kotlin.services.cognitoidentityprovider", config.f105777L);
        AbstractC36221c.m115320a(c25411h, (InterfaceC29123a) c0783z.f2818x);
        AbstractC36221c.m115320a(c25411h, config.f105771F);
        this.f105790I = AbstractC21478l0.m60451v(new C15716a("Cognito Identity Provider", "1.6.2"), config.f105780O);
    }

    /* JADX INFO: renamed from: J */
    public final Object m79090J(C31304w0 c31304w0, AbstractC32269c abstractC32269c) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C13668i c13668i = new C13668i(c22673i0.getOrCreateKotlinClass(C31304w0.class), c22673i0.getOrCreateKotlinClass(C31306x0.class));
        int i13 = 9;
        c13668i.m38539j(new C11943c(i13));
        c13668i.m38537h(new C11942b(i13));
        c13668i.m38538i("SetUserMFAPreference");
        c13668i.m38540k("Cognito Identity Provider");
        C2570m c2570mM38535f = c13668i.m38535f();
        C26593b c26593b = this.f105791w;
        c2570mM38535f.m7484K(c26593b.f105777L);
        c2570mM38535f.m7485L(this.f105788G);
        c2570mM38535f.m7483J(this.f105789H);
        C12554k0 c12554k0 = new C12554k0(22);
        c12554k0.m35225N();
        c2570mM38535f.m7481H(c12554k0.m35241y());
        c13668i.m38534e().m56168k(new C34889p(this.f105787F, this.f105786E, this.f105794z));
        c13668i.m38534e().m56169l(new C29934u0(c26593b));
        c13668i.m38534e().m56171n((C13166o) c26593b.f105783x.f3422w);
        c13668i.m38534e().m56170m(c26593b.f105776K);
        C25126d c25126dM38530a = c13668i.m38530a();
        m79097m(c25126dM38530a.m73681d());
        c25126dM38530a.m73683h(new C21615a());
        c25126dM38530a.m73682f().add(C17208c.f66103a);
        c25126dM38530a.m73682f().add(new C18440c());
        if (c26593b.f105771F instanceof C37070a1) {
            AbstractC3187b.m9170b(c25126dM38530a.m73681d(), EnumC18438a.CREDENTIALS_CODE);
        }
        c25126dM38530a.m73684i(new C40062i());
        c25126dM38530a.m73684i(new C17417d(this.f105790I));
        c25126dM38530a.m73684i(new C21616b());
        c25126dM38530a.m73682f().addAll(c26593b.f105774I);
        return AbstractC32004s.m99554w(c25126dM38530a, this.f105793y, c31304w0, abstractC32269c);
    }

    /* JADX INFO: renamed from: T */
    public final Object m79091T(C31261c1 c31261c1, AbstractC32269c abstractC32269c) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C13668i c13668i = new C13668i(c22673i0.getOrCreateKotlinClass(C31261c1.class), c22673i0.getOrCreateKotlinClass(C31264d1.class));
        int i13 = 10;
        c13668i.m38539j(new C11943c(i13));
        c13668i.m38537h(new C11942b(i13));
        c13668i.m38538i("UpdateUserAttributes");
        c13668i.m38540k("Cognito Identity Provider");
        C2570m c2570mM38535f = c13668i.m38535f();
        C26593b c26593b = this.f105791w;
        c2570mM38535f.m7484K(c26593b.f105777L);
        c2570mM38535f.m7485L(this.f105788G);
        c2570mM38535f.m7483J(this.f105789H);
        C12554k0 c12554k0 = new C12554k0(22);
        c12554k0.m35225N();
        c2570mM38535f.m7481H(c12554k0.m35241y());
        c13668i.m38534e().m56168k(new C34889p(this.f105787F, this.f105786E, this.f105794z));
        c13668i.m38534e().m56169l(new C29934u0(c26593b));
        c13668i.m38534e().m56171n((C13166o) c26593b.f105783x.f3422w);
        c13668i.m38534e().m56170m(c26593b.f105776K);
        C25126d c25126dM38530a = c13668i.m38530a();
        m79097m(c25126dM38530a.m73681d());
        c25126dM38530a.m73683h(new C21615a());
        c25126dM38530a.m73682f().add(C17208c.f66103a);
        c25126dM38530a.m73682f().add(new C18440c());
        if (c26593b.f105771F instanceof C37070a1) {
            AbstractC3187b.m9170b(c25126dM38530a.m73681d(), EnumC18438a.CREDENTIALS_CODE);
        }
        c25126dM38530a.m73684i(new C40062i());
        c25126dM38530a.m73684i(new C17417d(this.f105790I));
        c25126dM38530a.m73684i(new C21616b());
        c25126dM38530a.m73682f().addAll(c26593b.f105774I);
        return AbstractC32004s.m99554w(c25126dM38530a, this.f105793y, c31261c1, abstractC32269c);
    }

    /* JADX INFO: renamed from: a0 */
    public final Object m79092a0(C31267e1 c31267e1, InterfaceC30057d interfaceC30057d) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C13668i c13668i = new C13668i(c22673i0.getOrCreateKotlinClass(C31267e1.class), c22673i0.getOrCreateKotlinClass(C31270f1.class));
        int i13 = 11;
        c13668i.m38539j(new C11943c(i13));
        c13668i.m38537h(new C11942b(i13));
        c13668i.m38538i("VerifyUserAttribute");
        c13668i.m38540k("Cognito Identity Provider");
        C2570m c2570mM38535f = c13668i.m38535f();
        C26593b c26593b = this.f105791w;
        c2570mM38535f.m7484K(c26593b.f105777L);
        c2570mM38535f.m7485L(this.f105788G);
        c2570mM38535f.m7483J(this.f105789H);
        C12554k0 c12554k0 = new C12554k0(22);
        c12554k0.m35225N();
        c2570mM38535f.m7481H(c12554k0.m35241y());
        c13668i.m38534e().m56168k(new C34889p(this.f105787F, this.f105786E, this.f105794z));
        c13668i.m38534e().m56169l(new C29934u0(c26593b));
        c13668i.m38534e().m56171n((C13166o) c26593b.f105783x.f3422w);
        c13668i.m38534e().m56170m(c26593b.f105776K);
        C25126d c25126dM38530a = c13668i.m38530a();
        m79097m(c25126dM38530a.m73681d());
        c25126dM38530a.m73683h(new C21615a());
        c25126dM38530a.m73682f().add(C17208c.f66103a);
        c25126dM38530a.m73682f().add(new C18440c());
        if (c26593b.f105771F instanceof C37070a1) {
            AbstractC3187b.m9170b(c25126dM38530a.m73681d(), EnumC18438a.CREDENTIALS_CODE);
        }
        c25126dM38530a.m73684i(new C40062i());
        c25126dM38530a.m73684i(new C17417d(this.f105790I));
        c25126dM38530a.m73684i(new C21616b());
        c25126dM38530a.m73682f().addAll(c26593b.f105774I);
        return AbstractC32004s.m99554w(c25126dM38530a, this.f105793y, c31267e1, interfaceC30057d);
    }

    /* JADX INFO: renamed from: b */
    public final Object m79093b(C31254a0 c31254a0, InterfaceC30057d interfaceC30057d) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C13668i c13668i = new C13668i(c22673i0.getOrCreateKotlinClass(C31254a0.class), c22673i0.getOrCreateKotlinClass(C31257b0.class));
        int i13 = 3;
        c13668i.m38539j(new C11943c(i13));
        c13668i.m38537h(new C11942b(i13));
        c13668i.m38538i("ChangePassword");
        c13668i.m38540k("Cognito Identity Provider");
        C2570m c2570mM38535f = c13668i.m38535f();
        C26593b c26593b = this.f105791w;
        c2570mM38535f.m7484K(c26593b.f105777L);
        c2570mM38535f.m7485L(this.f105788G);
        c2570mM38535f.m7483J(this.f105789H);
        C12554k0 c12554k0 = new C12554k0(22);
        c12554k0.m35225N();
        c2570mM38535f.m7481H(c12554k0.m35241y());
        c13668i.m38534e().m56168k(new C34889p(this.f105787F, this.f105786E, this.f105794z));
        c13668i.m38534e().m56169l(new C29934u0(c26593b));
        c13668i.m38534e().m56171n((C13166o) c26593b.f105783x.f3422w);
        c13668i.m38534e().m56170m(c26593b.f105776K);
        C25126d c25126dM38530a = c13668i.m38530a();
        m79097m(c25126dM38530a.m73681d());
        c25126dM38530a.m73683h(new C21615a());
        c25126dM38530a.m73682f().add(C17208c.f66103a);
        c25126dM38530a.m73682f().add(new C18440c());
        if (c26593b.f105771F instanceof C37070a1) {
            AbstractC3187b.m9170b(c25126dM38530a.m73681d(), EnumC18438a.CREDENTIALS_CODE);
        }
        c25126dM38530a.m73684i(new C40062i());
        c25126dM38530a.m73684i(new C17417d(this.f105790I));
        c25126dM38530a.m73684i(new C21616b());
        c25126dM38530a.m73682f().addAll(c26593b.f105774I);
        return AbstractC32004s.m99554w(c25126dM38530a, this.f105793y, c31254a0, interfaceC30057d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f105792x.m74598a();
    }

    /* JADX INFO: renamed from: h */
    public final Object m79094h(C31282l0 c31282l0, InterfaceC30057d interfaceC30057d) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C13668i c13668i = new C13668i(c22673i0.getOrCreateKotlinClass(C31282l0.class), c22673i0.getOrCreateKotlinClass(C31284m0.class));
        int i13 = 5;
        c13668i.m38539j(new C11943c(i13));
        c13668i.m38537h(new C11942b(i13));
        c13668i.m38538i("GetUser");
        c13668i.m38540k("Cognito Identity Provider");
        C2570m c2570mM38535f = c13668i.m38535f();
        C26593b c26593b = this.f105791w;
        c2570mM38535f.m7484K(c26593b.f105777L);
        c2570mM38535f.m7485L(this.f105788G);
        c2570mM38535f.m7483J(this.f105789H);
        C12554k0 c12554k0 = new C12554k0(22);
        c12554k0.m35225N();
        c2570mM38535f.m7481H(c12554k0.m35241y());
        c13668i.m38534e().m56168k(new C34889p(this.f105787F, this.f105786E, this.f105794z));
        c13668i.m38534e().m56169l(new C29934u0(c26593b));
        c13668i.m38534e().m56171n((C13166o) c26593b.f105783x.f3422w);
        c13668i.m38534e().m56170m(c26593b.f105776K);
        C25126d c25126dM38530a = c13668i.m38530a();
        m79097m(c25126dM38530a.m73681d());
        c25126dM38530a.m73683h(new C21615a());
        c25126dM38530a.m73682f().add(C17208c.f66103a);
        c25126dM38530a.m73682f().add(new C18440c());
        if (c26593b.f105771F instanceof C37070a1) {
            AbstractC3187b.m9170b(c25126dM38530a.m73681d(), EnumC18438a.CREDENTIALS_CODE);
        }
        c25126dM38530a.m73684i(new C40062i());
        c25126dM38530a.m73684i(new C17417d(this.f105790I));
        c25126dM38530a.m73684i(new C21616b());
        c25126dM38530a.m73682f().addAll(c26593b.f105774I);
        return AbstractC32004s.m99554w(c25126dM38530a, this.f105793y, c31282l0, interfaceC30057d);
    }

    /* JADX INFO: renamed from: i */
    public final Object m79095i(C31278j0 c31278j0, InterfaceC30057d interfaceC30057d) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C13668i c13668i = new C13668i(c22673i0.getOrCreateKotlinClass(C31278j0.class), c22673i0.getOrCreateKotlinClass(C31280k0.class));
        int i13 = 4;
        c13668i.m38539j(new C11943c(i13));
        c13668i.m38537h(new C11942b(i13));
        c13668i.m38538i("GetUserAttributeVerificationCode");
        c13668i.m38540k("Cognito Identity Provider");
        C2570m c2570mM38535f = c13668i.m38535f();
        C26593b c26593b = this.f105791w;
        c2570mM38535f.m7484K(c26593b.f105777L);
        c2570mM38535f.m7485L(this.f105788G);
        c2570mM38535f.m7483J(this.f105789H);
        C12554k0 c12554k0 = new C12554k0(22);
        c12554k0.m35225N();
        c2570mM38535f.m7481H(c12554k0.m35241y());
        c13668i.m38534e().m56168k(new C34889p(this.f105787F, this.f105786E, this.f105794z));
        c13668i.m38534e().m56169l(new C29934u0(c26593b));
        c13668i.m38534e().m56171n((C13166o) c26593b.f105783x.f3422w);
        c13668i.m38534e().m56170m(c26593b.f105776K);
        C25126d c25126dM38530a = c13668i.m38530a();
        m79097m(c25126dM38530a.m73681d());
        c25126dM38530a.m73683h(new C21615a());
        c25126dM38530a.m73682f().add(C17208c.f66103a);
        c25126dM38530a.m73682f().add(new C18440c());
        if (c26593b.f105771F instanceof C37070a1) {
            AbstractC3187b.m9170b(c25126dM38530a.m73681d(), EnumC18438a.CREDENTIALS_CODE);
        }
        c25126dM38530a.m73684i(new C40062i());
        c25126dM38530a.m73684i(new C17417d(this.f105790I));
        c25126dM38530a.m73684i(new C21616b());
        c25126dM38530a.m73682f().addAll(c26593b.f105774I);
        return AbstractC32004s.m99554w(c25126dM38530a, this.f105793y, c31278j0, interfaceC30057d);
    }

    /* JADX INFO: renamed from: k */
    public final Object m79096k(C31286n0 c31286n0, AbstractC32269c abstractC32269c) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C13668i c13668i = new C13668i(c22673i0.getOrCreateKotlinClass(C31286n0.class), c22673i0.getOrCreateKotlinClass(C31288o0.class));
        int i13 = 6;
        c13668i.m38539j(new C11943c(i13));
        c13668i.m38537h(new C11942b(i13));
        c13668i.m38538i("InitiateAuth");
        c13668i.m38540k("Cognito Identity Provider");
        C2570m c2570mM38535f = c13668i.m38535f();
        C26593b c26593b = this.f105791w;
        c2570mM38535f.m7484K(c26593b.f105777L);
        c2570mM38535f.m7485L(this.f105788G);
        c2570mM38535f.m7483J(this.f105789H);
        C12554k0 c12554k0 = new C12554k0(22);
        c12554k0.m35225N();
        c2570mM38535f.m7481H(c12554k0.m35241y());
        c13668i.m38534e().m56168k(new C34889p(this.f105787F, this.f105786E, this.f105794z));
        c13668i.m38534e().m56169l(new C29934u0(c26593b));
        c13668i.m38534e().m56171n((C13166o) c26593b.f105783x.f3422w);
        c13668i.m38534e().m56170m(c26593b.f105776K);
        C25126d c25126dM38530a = c13668i.m38530a();
        m79097m(c25126dM38530a.m73681d());
        c25126dM38530a.m73683h(new C21615a());
        c25126dM38530a.m73682f().add(C17208c.f66103a);
        c25126dM38530a.m73682f().add(new C18440c());
        if (c26593b.f105771F instanceof C37070a1) {
            AbstractC3187b.m9170b(c25126dM38530a.m73681d(), EnumC18438a.CREDENTIALS_CODE);
        }
        c25126dM38530a.m73684i(new C40062i());
        c25126dM38530a.m73684i(new C17417d(this.f105790I));
        c25126dM38530a.m73684i(new C21616b());
        c25126dM38530a.m73682f().addAll(c26593b.f105774I);
        return AbstractC32004s.m99554w(c25126dM38530a, this.f105793y, c31286n0, abstractC32269c);
    }

    /* JADX INFO: renamed from: m */
    public final void m79097m(C12002a c12002a) {
        C15760a c15760aM110027a = AbstractC34881i.m110027a();
        C26593b c26593b = this.f105791w;
        c26593b.getClass();
        AbstractC21598x.m60687k0(c12002a, c15760aM110027a, null);
        AbstractC21598x.m60687k0(c12002a, AbstractC34881i.m110028b(), null);
        AbstractC21598x.m60685j0(c12002a, AbstractC4537l.m14186a(), c26593b.f105784y);
        AbstractC21598x.m60685j0(c12002a, AbstractC4537l.m14187b(), c26593b.f105775J);
        C15760a c15760aM126128a = AbstractC39474a.m126128a();
        String str = c26593b.f105785z;
        AbstractC21598x.m60687k0(c12002a, c15760aM126128a, str);
        AbstractC21598x.m60687k0(c12002a, AbstractC37185f.m119157j(), str);
        AbstractC21598x.m60685j0(c12002a, AbstractC37185f.m119159l(), "cognito-idp");
        AbstractC21598x.m60685j0(c12002a, AbstractC37185f.m119149b(), c26593b.f105771F);
        AbstractC21598x.m60687k0(c12002a, AbstractC39453d.m125994a(), c26593b.f105780O);
    }

    /* JADX INFO: renamed from: s */
    public final Object m79098s(C31294r0 c31294r0, InterfaceC30057d interfaceC30057d) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C13668i c13668i = new C13668i(c22673i0.getOrCreateKotlinClass(C31294r0.class), c22673i0.getOrCreateKotlinClass(C31296s0.class));
        int i13 = 7;
        c13668i.m38539j(new C11943c(i13));
        c13668i.m38537h(new C11942b(i13));
        c13668i.m38538i("RespondToAuthChallenge");
        c13668i.m38540k("Cognito Identity Provider");
        C2570m c2570mM38535f = c13668i.m38535f();
        C26593b c26593b = this.f105791w;
        c2570mM38535f.m7484K(c26593b.f105777L);
        c2570mM38535f.m7485L(this.f105788G);
        c2570mM38535f.m7483J(this.f105789H);
        C12554k0 c12554k0 = new C12554k0(22);
        c12554k0.m35225N();
        c2570mM38535f.m7481H(c12554k0.m35241y());
        c13668i.m38534e().m56168k(new C34889p(this.f105787F, this.f105786E, this.f105794z));
        c13668i.m38534e().m56169l(new C29934u0(c26593b));
        c13668i.m38534e().m56171n((C13166o) c26593b.f105783x.f3422w);
        c13668i.m38534e().m56170m(c26593b.f105776K);
        C25126d c25126dM38530a = c13668i.m38530a();
        m79097m(c25126dM38530a.m73681d());
        c25126dM38530a.m73683h(new C21615a());
        c25126dM38530a.m73682f().add(C17208c.f66103a);
        c25126dM38530a.m73682f().add(new C18440c());
        if (c26593b.f105771F instanceof C37070a1) {
            AbstractC3187b.m9170b(c25126dM38530a.m73681d(), EnumC18438a.CREDENTIALS_CODE);
        }
        c25126dM38530a.m73684i(new C40062i());
        c25126dM38530a.m73684i(new C17417d(this.f105790I));
        c25126dM38530a.m73684i(new C21616b());
        c25126dM38530a.m73682f().addAll(c26593b.f105774I);
        return AbstractC32004s.m99554w(c25126dM38530a, this.f105793y, c31294r0, interfaceC30057d);
    }

    /* JADX INFO: renamed from: x */
    public final Object m79099x(C31298t0 c31298t0, InterfaceC30057d interfaceC30057d) {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C13668i c13668i = new C13668i(c22673i0.getOrCreateKotlinClass(C31298t0.class), c22673i0.getOrCreateKotlinClass(C31300u0.class));
        int i13 = 8;
        c13668i.m38539j(new C11943c(i13));
        c13668i.m38537h(new C11942b(i13));
        c13668i.m38538i("RevokeToken");
        c13668i.m38540k("Cognito Identity Provider");
        C2570m c2570mM38535f = c13668i.m38535f();
        C26593b c26593b = this.f105791w;
        c2570mM38535f.m7484K(c26593b.f105777L);
        c2570mM38535f.m7485L(this.f105788G);
        c2570mM38535f.m7483J(this.f105789H);
        C12554k0 c12554k0 = new C12554k0(22);
        c12554k0.m35225N();
        c2570mM38535f.m7481H(c12554k0.m35241y());
        c13668i.m38534e().m56168k(new C34889p(this.f105787F, this.f105786E, this.f105794z));
        c13668i.m38534e().m56169l(new C29934u0(c26593b));
        c13668i.m38534e().m56171n((C13166o) c26593b.f105783x.f3422w);
        c13668i.m38534e().m56170m(c26593b.f105776K);
        C25126d c25126dM38530a = c13668i.m38530a();
        m79097m(c25126dM38530a.m73681d());
        c25126dM38530a.m73683h(new C21615a());
        c25126dM38530a.m73682f().add(C17208c.f66103a);
        c25126dM38530a.m73682f().add(new C18440c());
        if (c26593b.f105771F instanceof C37070a1) {
            AbstractC3187b.m9170b(c25126dM38530a.m73681d(), EnumC18438a.CREDENTIALS_CODE);
        }
        c25126dM38530a.m73684i(new C40062i());
        c25126dM38530a.m73684i(new C17417d(this.f105790I));
        c25126dM38530a.m73684i(new C21616b());
        c25126dM38530a.m73682f().addAll(c26593b.f105774I);
        return AbstractC32004s.m99554w(c25126dM38530a, this.f105793y, c31298t0, interfaceC30057d);
    }
}
