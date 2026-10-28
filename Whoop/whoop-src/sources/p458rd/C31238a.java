package p458rd;

import androidx.room.AbstractC1772c1;
import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import bf.AbstractC3187b;
import bf.EnumC3188c;
import cf.AbstractC4537l;
import cg.C4559n;
import cg.C4560o;
import gf.C15760a;
import gf.C15762c;
import gf.InterfaceC15761b;
import ie.EnumC18439b;
import java.util.List;
import nf.C26650d;
import ng3.C26702o;
import p097ds.AbstractC12313p;
import p116ef.AbstractC13141b;
import p116ef.C13140a;
import p145fd.C14395a;
import p146fe.C14410b;
import p249jc.AbstractC21598x;
import p421qd.C30291f;
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
import td.AbstractC33701b;
import td.C33700a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rd.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C31238a implements InterfaceC34869c, InterfaceC38260f, InterfaceC34875f {

    /* JADX INFO: renamed from: w */
    public final C30291f f128621w;

    public C31238a(C30291f config, int i13) {
        switch (i13) {
            case 1:
                AbstractC22676k.m65750j(config, "config");
                this.f128621w = config;
                break;
            case 2:
                AbstractC22676k.m65750j(config, "config");
                this.f128621w = config;
                break;
            default:
                AbstractC22676k.m65750j(config, "config");
                this.f128621w = config;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x04d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:128:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p522uf.InterfaceC34875f
    /* JADX INFO: renamed from: c */
    public Object mo8834c(C34896w request, InterfaceC30057d interfaceC30057d) {
        C33700a c33700a;
        C14410b c14410bM108214X;
        C13140a c13140a;
        EnumC31071a enumC31071a;
        C34896w c34896w;
        C13140a c13140a2;
        if (interfaceC30057d instanceof C33700a) {
            c33700a = (C33700a) interfaceC30057d;
            int i13 = c33700a.f140888z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33700a.f140888z = i13 - Integer.MIN_VALUE;
            } else {
                c33700a = new C33700a(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c33700a = new C33700a(this, (AbstractC32269c) interfaceC30057d);
        }
        Object c13140a3 = c33700a.f140886x;
        EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
        int i14 = c33700a.f140888z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(c13140a3);
            C30291f config = this.f128621w;
            AbstractC22676k.m65750j(config, "config");
            AbstractC22676k.m65750j(request, "request");
            Boolean bool = Boolean.FALSE;
            String str = config.f123894z;
            Boolean boolValueOf = Boolean.valueOf(config.f123887M);
            Boolean boolValueOf2 = Boolean.valueOf(config.f123888N);
            C4560o c4560o = config.f123882H;
            String str2 = c4560o != null ? c4560o.f18375h : null;
            C26702o c26702o = config.f123881G;
            c33700a.f140885w = request;
            c33700a.f140888z = 1;
            c26702o.getClass();
            List list = AbstractC33701b.f140889a;
            C14410b c14410bM108214X2 = AbstractC34235f.m108214X(str, list);
            C4559n c4559n = C4560o.f18367i;
            if (c14410bM108214X2 != null && AbstractC22676k.m65745e(bool, Boolean.TRUE) && str2 == null && str != null && AbstractC22676k.m65745e(boolValueOf2, bool) && AbstractC22676k.m65745e(boolValueOf, bool)) {
                if (str.equals("ap-northeast-1")) {
                    C4560o c4560oM14242a = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c = new C15762c();
                    C15760a c15760a = AbstractC13141b.f45450a;
                    List listM118958J = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a, "<this>");
                    c15762c.mo33083c(c15760a, listM118958J);
                    c13140a2 = new C13140a(c4560oM14242a, c15762c);
                } else if (str.equals("ap-south-1")) {
                    C4560o c4560oM14242a2 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c2 = new C15762c();
                    C15760a c15760a2 = AbstractC13141b.f45450a;
                    List listM118958J2 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a2, "<this>");
                    c15762c2.mo33083c(c15760a2, listM118958J2);
                    c13140a2 = new C13140a(c4560oM14242a2, c15762c2);
                } else if (str.equals("ap-southeast-1")) {
                    C4560o c4560oM14242a3 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c3 = new C15762c();
                    C15760a c15760a3 = AbstractC13141b.f45450a;
                    List listM118958J3 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a3, "<this>");
                    c15762c3.mo33083c(c15760a3, listM118958J3);
                    c13140a2 = new C13140a(c4560oM14242a3, c15762c3);
                } else if (str.equals("ap-southeast-2")) {
                    C4560o c4560oM14242a4 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c4 = new C15762c();
                    C15760a c15760a4 = AbstractC13141b.f45450a;
                    List listM118958J4 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a4, "<this>");
                    c15762c4.mo33083c(c15760a4, listM118958J4);
                    c13140a2 = new C13140a(c4560oM14242a4, c15762c4);
                } else if (str.equals("aws-global")) {
                    C4560o c4560oM14242a5 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c5 = new C15762c();
                    C15760a c15760a5 = AbstractC13141b.f45450a;
                    List listM118958J5 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a5, "<this>");
                    c15762c5.mo33083c(c15760a5, listM118958J5);
                    c13140a2 = new C13140a(c4560oM14242a5, c15762c5);
                } else if (str.equals("ca-central-1")) {
                    C4560o c4560oM14242a6 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c6 = new C15762c();
                    C15760a c15760a6 = AbstractC13141b.f45450a;
                    List listM118958J6 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a6, "<this>");
                    c15762c6.mo33083c(c15760a6, listM118958J6);
                    c13140a2 = new C13140a(c4560oM14242a6, c15762c6);
                } else if (str.equals("eu-central-1")) {
                    C4560o c4560oM14242a7 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c7 = new C15762c();
                    C15760a c15760a7 = AbstractC13141b.f45450a;
                    List listM118958J7 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a7, "<this>");
                    c15762c7.mo33083c(c15760a7, listM118958J7);
                    c13140a2 = new C13140a(c4560oM14242a7, c15762c7);
                } else if (str.equals("eu-north-1")) {
                    C4560o c4560oM14242a8 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c8 = new C15762c();
                    C15760a c15760a8 = AbstractC13141b.f45450a;
                    List listM118958J8 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a8, "<this>");
                    c15762c8.mo33083c(c15760a8, listM118958J8);
                    c13140a2 = new C13140a(c4560oM14242a8, c15762c8);
                } else if (str.equals("eu-west-1")) {
                    C4560o c4560oM14242a9 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c9 = new C15762c();
                    C15760a c15760a9 = AbstractC13141b.f45450a;
                    List listM118958J9 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a9, "<this>");
                    c15762c9.mo33083c(c15760a9, listM118958J9);
                    c13140a2 = new C13140a(c4560oM14242a9, c15762c9);
                } else if (str.equals("eu-west-2")) {
                    C4560o c4560oM14242a10 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c10 = new C15762c();
                    C15760a c15760a10 = AbstractC13141b.f45450a;
                    List listM118958J10 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a10, "<this>");
                    c15762c10.mo33083c(c15760a10, listM118958J10);
                    c13140a2 = new C13140a(c4560oM14242a10, c15762c10);
                } else if (str.equals("eu-west-3")) {
                    C4560o c4560oM14242a11 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c11 = new C15762c();
                    C15760a c15760a11 = AbstractC13141b.f45450a;
                    List listM118958J11 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a11, "<this>");
                    c15762c11.mo33083c(c15760a11, listM118958J11);
                    c13140a2 = new C13140a(c4560oM14242a11, c15762c11);
                } else if (str.equals("sa-east-1")) {
                    C4560o c4560oM14242a12 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c12 = new C15762c();
                    C15760a c15760a12 = AbstractC13141b.f45450a;
                    List listM118958J12 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a12, "<this>");
                    c15762c12.mo33083c(c15760a12, listM118958J12);
                    c13140a2 = new C13140a(c4560oM14242a12, c15762c12);
                } else if (str.equals("us-east-1")) {
                    C4560o c4560oM14242a13 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c13 = new C15762c();
                    C15760a c15760a13 = AbstractC13141b.f45450a;
                    List listM118958J13 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a13, "<this>");
                    c15762c13.mo33083c(c15760a13, listM118958J13);
                    c13140a2 = new C13140a(c4560oM14242a13, c15762c13);
                } else if (str.equals("us-east-2")) {
                    C4560o c4560oM14242a14 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c14 = new C15762c();
                    C15760a c15760a14 = AbstractC13141b.f45450a;
                    List listM118958J14 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a14, "<this>");
                    c15762c14.mo33083c(c15760a14, listM118958J14);
                    c13140a2 = new C13140a(c4560oM14242a14, c15762c14);
                } else if (str.equals("us-west-1")) {
                    C4560o c4560oM14242a15 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c15 = new C15762c();
                    C15760a c15760a15 = AbstractC13141b.f45450a;
                    List listM118958J15 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a15, "<this>");
                    c15762c15.mo33083c(c15760a15, listM118958J15);
                    c13140a2 = new C13140a(c4560oM14242a15, c15762c15);
                } else if (str.equals("us-west-2")) {
                    C4560o c4560oM14242a16 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                    C15762c c15762c16 = new C15762c();
                    C15760a c15760a16 = AbstractC13141b.f45450a;
                    List listM118958J16 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                    AbstractC22676k.m65750j(c15760a16, "<this>");
                    c15762c16.mo33083c(c15760a16, listM118958J16);
                    c13140a2 = new C13140a(c4560oM14242a16, c15762c16);
                } else {
                    C4560o c4560oM14242a17 = C4559n.m14242a(c4559n, "https://sts." + str + '.' + c14410bM108214X2.f52562b);
                    C15762c c15762c17 = new C15762c();
                    C15760a c15760a17 = AbstractC13141b.f45450a;
                    List listM118958J17 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, str));
                    AbstractC22676k.m65750j(c15760a17, "<this>");
                    c15762c17.mo33083c(c15760a17, listM118958J17);
                    c13140a2 = new C13140a(c4560oM14242a17, c15762c17);
                }
                c13140a3 = c13140a2;
            } else {
                if (str2 != null) {
                    Boolean bool2 = Boolean.TRUE;
                    if (AbstractC22676k.m65745e(boolValueOf2, bool2)) {
                        throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
                    }
                    if (AbstractC22676k.m65745e(boolValueOf, bool2)) {
                        throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
                    }
                    C4560o c4560oM14242a18 = C4559n.m14242a(c4559n, str2);
                    C15762c c15762c18 = new C15762c();
                    C15760a c15760a18 = AbstractC3187b.f12495c;
                    AbstractC22676k.m65750j(c15760a18, "<this>");
                    c15762c18.mo33083c(c15760a18, bool2);
                    c13140a3 = new C13140a(c4560oM14242a18, c15762c18);
                } else {
                    if (str == null || (c14410bM108214X = AbstractC34235f.m108214X(str, list)) == null) {
                        throw new EndpointProviderException("Invalid Configuration: Missing Region");
                    }
                    String str3 = c14410bM108214X.f52562b;
                    String str4 = c14410bM108214X.f52563c;
                    Boolean bool3 = c14410bM108214X.f52565e;
                    Boolean bool4 = c14410bM108214X.f52564d;
                    Boolean bool5 = Boolean.TRUE;
                    if (AbstractC22676k.m65745e(boolValueOf2, bool5) && AbstractC22676k.m65745e(boolValueOf, bool5)) {
                        if (!bool5.equals(bool4) || !bool5.equals(bool3)) {
                            throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
                        }
                        c13140a = new C13140a(C4559n.m14242a(c4559n, "https://sts-fips." + str + '.' + str4));
                    } else if (AbstractC22676k.m65745e(boolValueOf2, bool5)) {
                        if (!AbstractC22676k.m65745e(bool4, bool5)) {
                            throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
                        }
                        if (AbstractC22676k.m65745e(c14410bM108214X.f52561a, "aws-us-gov")) {
                            c13140a = new C13140a(C4559n.m14242a(c4559n, "https://sts." + str + ".amazonaws.com"));
                        } else {
                            c13140a = new C13140a(C4559n.m14242a(c4559n, "https://sts-fips." + str + '.' + str3));
                        }
                    } else if (!AbstractC22676k.m65745e(boolValueOf, bool5)) {
                        if (str.equals("aws-global")) {
                            C4560o c4560oM14242a19 = C4559n.m14242a(c4559n, "https://sts.amazonaws.com");
                            C15762c c15762c19 = new C15762c();
                            C15760a c15760a19 = AbstractC13141b.f45450a;
                            List listM118958J18 = AbstractC37056f.m118958J(AbstractC1772c1.m5380Q(17, "us-east-1"));
                            AbstractC22676k.m65750j(c15760a19, "<this>");
                            c15762c19.mo33083c(c15760a19, listM118958J18);
                            c13140a3 = new C13140a(c4560oM14242a19, c15762c19);
                        } else {
                            c13140a = new C13140a(C4559n.m14242a(c4559n, "https://sts." + str + '.' + str3));
                        }
                        enumC31071a = enumC31071a2;
                    } else {
                        if (!bool5.equals(bool3)) {
                            throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
                        }
                        c13140a = new C13140a(C4559n.m14242a(c4559n, "https://sts." + str + '.' + str4));
                    }
                    c13140a3 = c13140a;
                    enumC31071a = enumC31071a2;
                }
                if (c13140a3 == enumC31071a) {
                    return enumC31071a;
                }
                c34896w = request;
            }
            enumC31071a = enumC31071a2;
            if (c13140a3 == enumC31071a) {
                return enumC31071a;
            }
            c34896w = request;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c34896w = c33700a.f140885w;
            AbstractC34132o.m107864I(c13140a3);
        }
        C13140a c13140a4 = (C13140a) c13140a3;
        InterfaceC15761b interfaceC15761b = c13140a4.f45449b;
        if (interfaceC15761b.mo33084d(AbstractC3187b.f12495c)) {
            AbstractC3187b.m9170b(c34896w.f146962a, EnumC3188c.SERVICE_ENDPOINT_OVERRIDE);
        }
        if (interfaceC15761b.mo33084d(AbstractC3187b.f12494b)) {
            AbstractC3187b.m9170b(c34896w.f146962a, EnumC3188c.ACCOUNT_ID_BASED_ENDPOINT);
        }
        C15760a c15760a20 = AbstractC37185f.f158991d;
        if (interfaceC15761b.mo33084d(c15760a20) && AbstractC21598x.m60654J(interfaceC15761b, c15760a20).equals("s3express")) {
            AbstractC3187b.m9170b(c34896w.f146962a, EnumC18439b.S3_EXPRESS_BUCKET);
        }
        if (c34896w.f146964c.getAttributes().mo33084d(AbstractC38196a.f163563b)) {
            AbstractC3187b.m9170b(c34896w.f146962a, EnumC3188c.RESOLVED_ACCOUNT_ID);
        }
        return c13140a4;
    }

    @Override // p522uf.InterfaceC34869c
    /* JADX INFO: renamed from: f */
    public Object mo1862f(C34894u c34894u, C34865a c34865a) {
        String str = (String) AbstractC21598x.m60654J(c34894u.f146958a, AbstractC4537l.f18268a);
        C14395a c14395a = this.f128621w.f123890P;
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
            return this.f128621w.f123880F;
        }
        if (schemeId.equals("smithy.api#noAuth")) {
            return C26650d.f105939w;
        }
        throw new IllegalStateException(("auth scheme " + ((Object) C34856b.m109935a(schemeId)) + " not configured for client").toString());
    }
}
