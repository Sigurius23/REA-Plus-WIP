package p300ld;

import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import bf.AbstractC3187b;
import bf.EnumC3188c;
import cf.AbstractC4537l;
import cg.C4559n;
import cg.C4560o;
import g73.C15556d;
import gf.C15760a;
import gf.C15762c;
import gf.InterfaceC15761b;
import ie.EnumC18439b;
import java.util.List;
import nf.C26650d;
import p097ds.AbstractC12313p;
import p116ef.C13140a;
import p145fd.C14395a;
import p146fe.C14410b;
import p249jc.AbstractC21598x;
import p279kd.C22380g;
import p340nd.AbstractC26573b;
import p340nd.C26572a;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p521ue.C34856b;
import p522uf.C34865a;
import p522uf.C34894u;
import p522uf.C34896w;
import p522uf.InterfaceC34869c;
import p522uf.InterfaceC34875f;
import p581we.AbstractC37185f;
import p611xd.AbstractC38196a;
import p613xf.InterfaceC38257c;
import p613xf.InterfaceC38260f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ld.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C23841a implements InterfaceC34869c, InterfaceC38260f, InterfaceC34875f {

    /* JADX INFO: renamed from: w */
    public final C22380g f94300w;

    public C23841a(C22380g config, int i13) {
        switch (i13) {
            case 1:
                AbstractC22676k.m65750j(config, "config");
                this.f94300w = config;
                break;
            case 2:
                AbstractC22676k.m65750j(config, "config");
                this.f94300w = config;
                break;
            default:
                AbstractC22676k.m65750j(config, "config");
                this.f94300w = config;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p522uf.InterfaceC34875f
    /* JADX INFO: renamed from: c */
    public Object mo8834c(C34896w request, InterfaceC30057d interfaceC30057d) {
        C26572a c26572a;
        C14410b c14410bM108214X;
        C13140a c13140a;
        if (interfaceC30057d instanceof C26572a) {
            c26572a = (C26572a) interfaceC30057d;
            int i13 = c26572a.f105680z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26572a.f105680z = i13 - Integer.MIN_VALUE;
            } else {
                c26572a = new C26572a(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c26572a = new C26572a(this, (AbstractC32269c) interfaceC30057d);
        }
        Object c13140a2 = c26572a.f105678x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26572a.f105680z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(c13140a2);
            C22380g config = this.f94300w;
            AbstractC22676k.m65750j(config, "config");
            AbstractC22676k.m65750j(request, "request");
            String str = config.f87384z;
            Boolean boolValueOf = Boolean.valueOf(config.f87377M);
            Boolean boolValueOf2 = Boolean.valueOf(config.f87378N);
            C4560o c4560o = config.f87372H;
            String str2 = c4560o != null ? c4560o.f18375h : null;
            C15556d c15556d = config.f87371G;
            c26572a.f105677w = request;
            c26572a.f105680z = 1;
            c15556d.getClass();
            C4559n c4559n = C4560o.f18367i;
            if (str2 != null) {
                Boolean bool = Boolean.TRUE;
                if (AbstractC22676k.m65745e(boolValueOf2, bool)) {
                    throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
                }
                if (AbstractC22676k.m65745e(boolValueOf, bool)) {
                    throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
                }
                C4560o c4560oM14242a = C4559n.m14242a(c4559n, str2);
                C15762c c15762c = new C15762c();
                C15760a c15760a = AbstractC3187b.f12495c;
                AbstractC22676k.m65750j(c15760a, "<this>");
                c15762c.mo33083c(c15760a, bool);
                c13140a2 = new C13140a(c4560oM14242a, c15762c);
            } else {
                if (str == null || (c14410bM108214X = AbstractC34235f.m108214X(str, AbstractC26573b.f105681a)) == null) {
                    throw new EndpointProviderException("Invalid Configuration: Missing Region");
                }
                String str3 = c14410bM108214X.f52562b;
                String str4 = c14410bM108214X.f52563c;
                Boolean bool2 = c14410bM108214X.f52565e;
                Boolean bool3 = c14410bM108214X.f52564d;
                Boolean bool4 = Boolean.TRUE;
                if (AbstractC22676k.m65745e(boolValueOf2, bool4) && AbstractC22676k.m65745e(boolValueOf, bool4)) {
                    if (!bool4.equals(bool3) || !bool4.equals(bool2)) {
                        throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
                    }
                    c13140a = new C13140a(C4559n.m14242a(c4559n, "https://oidc-fips." + str + '.' + str4));
                } else if (AbstractC22676k.m65745e(boolValueOf2, bool4)) {
                    if (!AbstractC22676k.m65745e(bool3, bool4)) {
                        throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
                    }
                    if (AbstractC22676k.m65745e(c14410bM108214X.f52561a, "aws-us-gov")) {
                        c13140a = new C13140a(C4559n.m14242a(c4559n, "https://oidc." + str + ".amazonaws.com"));
                    } else {
                        c13140a = new C13140a(C4559n.m14242a(c4559n, "https://oidc-fips." + str + '.' + str3));
                    }
                } else if (!AbstractC22676k.m65745e(boolValueOf, bool4)) {
                    c13140a = new C13140a(C4559n.m14242a(c4559n, "https://oidc." + str + '.' + str3));
                } else {
                    if (!bool4.equals(bool2)) {
                        throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
                    }
                    c13140a = new C13140a(C4559n.m14242a(c4559n, "https://oidc." + str + '.' + str4));
                }
                c13140a2 = c13140a;
            }
            if (c13140a2 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            request = c26572a.f105677w;
            AbstractC34132o.m107864I(c13140a2);
        }
        C13140a c13140a3 = (C13140a) c13140a2;
        InterfaceC15761b interfaceC15761b = c13140a3.f45449b;
        if (interfaceC15761b.mo33084d(AbstractC3187b.f12495c)) {
            AbstractC3187b.m9170b(request.f146962a, EnumC3188c.SERVICE_ENDPOINT_OVERRIDE);
        }
        if (interfaceC15761b.mo33084d(AbstractC3187b.f12494b)) {
            AbstractC3187b.m9170b(request.f146962a, EnumC3188c.ACCOUNT_ID_BASED_ENDPOINT);
        }
        C15760a c15760a2 = AbstractC37185f.f158991d;
        if (interfaceC15761b.mo33084d(c15760a2) && AbstractC21598x.m60654J(interfaceC15761b, c15760a2).equals("s3express")) {
            AbstractC3187b.m9170b(request.f146962a, EnumC18439b.S3_EXPRESS_BUCKET);
        }
        if (request.f146964c.getAttributes().mo33084d(AbstractC38196a.f163563b)) {
            AbstractC3187b.m9170b(request.f146962a, EnumC3188c.RESOLVED_ACCOUNT_ID);
        }
        return c13140a3;
    }

    @Override // p522uf.InterfaceC34869c
    /* JADX INFO: renamed from: f */
    public Object mo1862f(C34894u c34894u, C34865a c34865a) {
        String str = (String) AbstractC21598x.m60654J(c34894u.f146958a, AbstractC4537l.f18268a);
        C14395a c14395a = this.f94300w.f87380P;
        c14395a.getClass();
        Object obj = c14395a.f52538b.get(str);
        if (obj == null) {
            obj = c14395a.f52539c;
        }
        List list = (List) obj;
        List list2 = c14395a.f52537a;
        return list2 != null ? AbstractC12313p.m34264P(list2, list) : list;
    }

    @Override // p613xf.InterfaceC38260f
    /* JADX INFO: renamed from: j */
    public InterfaceC38257c mo2324j(String schemeId) {
        AbstractC22676k.m65750j(schemeId, "schemeId");
        if (schemeId.equals("aws.auth#sigv4")) {
            return this.f94300w.f87370F;
        }
        if (schemeId.equals("smithy.api#noAuth")) {
            return C26650d.f105939w;
        }
        throw new IllegalStateException(("auth scheme " + ((Object) C34856b.m109935a(schemeId)) + " not configured for client").toString());
    }
}
