package p089dd;

import aa3.C0656u0;
import aws.sdk.kotlin.runtime.AwsServiceException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.signin.model.SigninException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.signin.model.TooManyRequestsError;
import aws.sdk.kotlin.runtime.auth.credentials.internal.signin.model.ValidationException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.model.ResourceNotFoundException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.model.SsoException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.model.TooManyRequestsException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.model.UnauthorizedException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AccessDeniedException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AuthorizationPendingException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.ExpiredTokenException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.InternalServerException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.InvalidClientException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.InvalidGrantException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.InvalidRequestException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.InvalidScopeException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.SlowDownException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.SsoOidcException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.UnauthorizedClientException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.UnsupportedGrantTypeException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.IdpCommunicationErrorException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.IdpRejectedClaimException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.InvalidIdentityTokenException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.StsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.MfaMethodNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.SoftwareTokenMfaNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedTokenTypeException;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import b30.C2570m;
import bi.AbstractC3269g;
import cd.AbstractC4434n;
import cd.C4421a;
import cd.C4422b;
import cd.C4425e;
import cd.C4426f;
import cd.C4430j;
import d13.AbstractC11478a;
import gf.C15774o;
import gm.C15990r;
import hc3.AbstractC17176i;
import hm.C17417d;
import id.C18405b;
import id.C18406c;
import io.sentry.internal.debugmeta.C20378c;
import io.seon.androidsdk.service.C20653c0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import l83.C23467m;
import l83.C23468n;
import m63.C25126d;
import m83.AbstractC25260n;
import m83.C25271y;
import p000.AbstractC11266d;
import p012ab.C0684i0;
import p031b9.C2817b;
import p078d1.C11457j;
import p091dg.C12002a;
import p141f9.C14279u;
import p194hg.C17248i;
import p194hg.C17251l;
import p194hg.InterfaceC17242c;
import p194hg.InterfaceC17243d;
import p251jg.C21649b;
import p251jg.C21652e;
import p255jk.C21745c;
import p326mf.C25500t;
import p326mf.EnumC25499s;
import p365od.AbstractC27824c;
import p365od.AbstractC27833l;
import p365od.C27822a;
import p365od.C27823b;
import p365od.C27826e;
import p365od.C27827f;
import p365od.C27828g;
import p365od.C27829h;
import p365od.C27830i;
import p365od.C27831j;
import p365od.C27832k;
import p408q.C29662f;
import p412q3.C29875i;
import p459rf.C31341l;
import p460rg.AbstractC31375j;
import p463rj.AbstractC31479j;
import p463rj.AbstractC31484o;
import p479s4.AbstractC32126g;
import p479s4.AbstractC32128i;
import p479s4.AbstractC32131l;
import p501te.C33738c;
import p501te.C33740e;
import p501te.EnumC33741f;
import p505ts.AbstractC34132o;
import p520ud.C34781b;
import p520ud.C34783d;
import p522uf.InterfaceC34879h;
import p550vd.AbstractC35903f;
import p558vp.AbstractC36259c;
import p579wc.AbstractC37095j;
import p579wc.C37118t;
import p579wc.C37120u;
import p619xl.C38445a;
import p678ze.AbstractC40581a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29934u0;
import qg3.C30352d;
import re.AbstractC31272g0;
import re.AbstractC31309z;
import re.C31253a;
import re.C31256b;
import re.C31257b0;
import re.C31264d1;
import re.C31270f1;
import re.C31280k0;
import re.C31284m0;
import re.C31288o0;
import re.C31290p0;
import re.C31296s0;
import re.C31300u0;
import re.C31306x0;
import ro.C31624i;
import rs.AbstractC31780b;
import s40.AbstractC32145e0;
import s93.AbstractC32306h;
import s93.AbstractC32309k;
import sb3.AbstractC32350a;
import se.AbstractC32412c;
import te0.AbstractC33745d;
import wf.C37236a;
import ye.C39476c;

/* JADX INFO: renamed from: dd.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C11942b implements InterfaceC34879h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39044a;

    public /* synthetic */ C11942b(int i13) {
        this.f39044a = i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:265:0x065e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0214  */
    /* JADX INFO: renamed from: b */
    private final Object m32247b(C12002a context, C31341l call, byte[] bArr) {
        AwsServiceException ssoOidcException;
        Object c27832k;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        C37236a c37236a = call.f128964x;
        boolean z4 = false;
        if (AbstractC3269g.m9483L(c37236a.f159235a)) {
            C0684i0 c0684i0 = new C0684i0(7, false);
            if (bArr != null) {
                C21649b c21649b = new C21649b(bArr);
                C17251l c17251l = C17251l.f66278i;
                C17248i c17248i = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("accessToken")}), 0);
                C17248i c17248i2 = new C17248i(C17251l.f66274e, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("expiresIn")}), 0);
                C17248i c17248i3 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("idToken")}), 0);
                C17248i c17248i4 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("refreshToken")}), 0);
                C17248i c17248i5 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("tokenType")}), 0);
                C38445a c38445a = new C38445a(13);
                c38445a.m123180p(c17248i);
                c38445a.m123180p(c17248i2);
                c38445a.m123180p(c17248i3);
                c38445a.m123180p(c17248i4);
                c38445a.m123180p(c17248i5);
                InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(c38445a, c21649b);
                while (true) {
                    Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                    int i13 = c17248i.f66267b;
                    if (numMo45167q == null || numMo45167q.intValue() != i13) {
                        int i14 = c17248i2.f66267b;
                        if (numMo45167q == null || numMo45167q.intValue() != i14) {
                            int i15 = c17248i3.f66267b;
                            if (numMo45167q == null || numMo45167q.intValue() != i15) {
                                int i16 = c17248i4.f66267b;
                                if (numMo45167q == null || numMo45167q.intValue() != i16) {
                                    int i17 = c17248i5.f66267b;
                                    if (numMo45167q == null || numMo45167q.intValue() != i17) {
                                        if (numMo45167q == null) {
                                            break;
                                        }
                                        interfaceC17242cM30855g.skipValue();
                                    } else {
                                        c0684i0.f2443F = interfaceC17242cM30855g.mo45166o();
                                    }
                                } else {
                                    c0684i0.f2442E = interfaceC17242cM30855g.mo45166o();
                                }
                            } else {
                                c0684i0.f2447z = interfaceC17242cM30855g.mo45166o();
                            }
                        } else {
                            c0684i0.f2445x = interfaceC17242cM30855g.mo45164h();
                        }
                    } else {
                        c0684i0.f2446y = interfaceC17242cM30855g.mo45166o();
                    }
                }
            }
            return new C27826e(c0684i0);
        }
        C37236a c37236aM100714v = AbstractC32350a.m100714v(c37236a, bArr);
        C31341l call2 = C31341l.m96420b(call, c37236aM100714v);
        try {
            C17248i c17248i6 = AbstractC40581a.f174777a;
            C39476c c39476cM131580a = AbstractC40581a.m131580a(c37236a.f159236b, bArr);
            String str = c39476cM131580a.f169859a;
            if (str != null) {
                switch (str) {
                    case "AuthorizationPendingException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        C21745c c21745c = new C21745c();
                        if (bArr != null) {
                            C21649b c21649b2 = new C21649b(bArr);
                            C17251l c17251l2 = C17251l.f66278i;
                            C17248i c17248i7 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                            C17248i c17248i8 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error_description")}), 0);
                            InterfaceC17242c interfaceC17242cM30855g2 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i7, c17248i8), c21649b2);
                            while (true) {
                                Integer numMo45167q2 = interfaceC17242cM30855g2.mo45167q();
                                int i18 = c17248i7.f66267b;
                                if (numMo45167q2 != null && numMo45167q2.intValue() == i18) {
                                    c21745c.f83655a = interfaceC17242cM30855g2.mo45166o();
                                } else {
                                    int i19 = c17248i8.f66267b;
                                    if (numMo45167q2 != null && numMo45167q2.intValue() == i19) {
                                        c21745c.f83656b = interfaceC17242cM30855g2.mo45166o();
                                    } else if (numMo45167q2 != null) {
                                        interfaceC17242cM30855g2.skipValue();
                                    }
                                }
                            }
                        }
                        ssoOidcException = new AuthorizationPendingException(c21745c);
                        break;
                    case "InvalidClientException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        C27827f c27827f = new C27827f();
                        if (bArr != null) {
                            C21649b c21649b3 = new C21649b(bArr);
                            C17251l c17251l3 = C17251l.f66278i;
                            C17248i c17248i9 = new C17248i(c17251l3, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                            C17248i c17248i10 = new C17248i(c17251l3, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error_description")}), 0);
                            InterfaceC17242c interfaceC17242cM30855g3 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i9, c17248i10), c21649b3);
                            while (true) {
                                Integer numMo45167q3 = interfaceC17242cM30855g3.mo45167q();
                                int i24 = c17248i9.f66267b;
                                if (numMo45167q3 != null && numMo45167q3.intValue() == i24) {
                                    c27827f.f112091a = interfaceC17242cM30855g3.mo45166o();
                                } else {
                                    int i25 = c17248i10.f66267b;
                                    if (numMo45167q3 != null && numMo45167q3.intValue() == i25) {
                                        c27827f.f112092b = interfaceC17242cM30855g3.mo45166o();
                                    } else if (numMo45167q3 != null) {
                                        interfaceC17242cM30855g3.skipValue();
                                    }
                                }
                            }
                        }
                        ssoOidcException = new InvalidClientException(c27827f);
                        break;
                    case "ExpiredTokenException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        C20653c0 c20653c0 = new C20653c0();
                        if (bArr != null) {
                            C21649b c21649b4 = new C21649b(bArr);
                            C17251l c17251l4 = C17251l.f66278i;
                            C17248i c17248i11 = new C17248i(c17251l4, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                            C17248i c17248i12 = new C17248i(c17251l4, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error_description")}), 0);
                            InterfaceC17242c interfaceC17242cM30855g4 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i11, c17248i12), c21649b4);
                            while (true) {
                                Integer numMo45167q4 = interfaceC17242cM30855g4.mo45167q();
                                int i26 = c17248i11.f66267b;
                                if (numMo45167q4 != null && numMo45167q4.intValue() == i26) {
                                    c20653c0.f77248a = interfaceC17242cM30855g4.mo45166o();
                                } else {
                                    int i27 = c17248i12.f66267b;
                                    if (numMo45167q4 != null && numMo45167q4.intValue() == i27) {
                                        c20653c0.f77249b = interfaceC17242cM30855g4.mo45166o();
                                    } else if (numMo45167q4 != null) {
                                        interfaceC17242cM30855g4.skipValue();
                                    }
                                }
                            }
                        }
                        ssoOidcException = new ExpiredTokenException(c20653c0);
                        break;
                    case "SlowDownException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        C14279u c14279u = new C14279u(2);
                        if (bArr != null) {
                            C21649b c21649b5 = new C21649b(bArr);
                            C17251l c17251l5 = C17251l.f66278i;
                            C17248i c17248i13 = new C17248i(c17251l5, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                            C17248i c17248i14 = new C17248i(c17251l5, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error_description")}), 0);
                            InterfaceC17242c interfaceC17242cM30855g5 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i13, c17248i14), c21649b5);
                            while (true) {
                                Integer numMo45167q5 = interfaceC17242cM30855g5.mo45167q();
                                int i28 = c17248i13.f66267b;
                                if (numMo45167q5 != null && numMo45167q5.intValue() == i28) {
                                    c14279u.f52138b = interfaceC17242cM30855g5.mo45166o();
                                } else {
                                    int i29 = c17248i14.f66267b;
                                    if (numMo45167q5 != null && numMo45167q5.intValue() == i29) {
                                        c14279u.f52139c = interfaceC17242cM30855g5.mo45166o();
                                    } else if (numMo45167q5 != null) {
                                        interfaceC17242cM30855g5.skipValue();
                                    }
                                }
                            }
                        }
                        ssoOidcException = new SlowDownException(c14279u);
                        break;
                    case "AccessDeniedException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        C15990r c15990r = new C15990r(26, z4);
                        if (bArr != null) {
                            C21649b c21649b6 = new C21649b(bArr);
                            C17251l c17251l6 = C17251l.f66278i;
                            C17248i c17248i15 = new C17248i(c17251l6, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                            C17248i c17248i16 = new C17248i(c17251l6, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error_description")}), 0);
                            C17248i c17248i17 = new C17248i(C17251l.f66273d, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("reason")}), 0);
                            C38445a c38445a2 = new C38445a(13);
                            c38445a2.m123180p(c17248i15);
                            c38445a2.m123180p(c17248i16);
                            c38445a2.m123180p(c17248i17);
                            InterfaceC17242c interfaceC17242cM30855g6 = AbstractC11478a.m30855g(c38445a2, c21649b6);
                            while (true) {
                                Integer numMo45167q6 = interfaceC17242cM30855g6.mo45167q();
                                int i34 = c17248i15.f66267b;
                                if (numMo45167q6 != null && numMo45167q6.intValue() == i34) {
                                    c15990r.f60512x = interfaceC17242cM30855g6.mo45166o();
                                } else {
                                    int i35 = c17248i16.f66267b;
                                    if (numMo45167q6 != null && numMo45167q6.intValue() == i35) {
                                        c15990r.f60513y = interfaceC17242cM30855g6.mo45166o();
                                    } else {
                                        int i36 = c17248i17.f66267b;
                                        if (numMo45167q6 != null && numMo45167q6.intValue() == i36) {
                                            String value = interfaceC17242cM30855g6.mo45166o();
                                            int i37 = AbstractC27824c.f112081a;
                                            AbstractC22676k.m65750j(value, "value");
                                            c15990r.f60514z = value.equals("KMS_AccessDeniedException") ? C27822a.f112079b : new C27823b(value);
                                        } else if (numMo45167q6 != null) {
                                            interfaceC17242cM30855g6.skipValue();
                                        }
                                    }
                                }
                            }
                        }
                        ssoOidcException = new AccessDeniedException(c15990r);
                        break;
                    case "UnauthorizedClientException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        C27827f c27827f2 = new C27827f();
                        if (bArr != null) {
                            C21649b c21649b7 = new C21649b(bArr);
                            C17251l c17251l7 = C17251l.f66278i;
                            C17248i c17248i18 = new C17248i(c17251l7, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                            C17248i c17248i19 = new C17248i(c17251l7, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error_description")}), 0);
                            InterfaceC17242c interfaceC17242cM30855g7 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i18, c17248i19), c21649b7);
                            while (true) {
                                Integer numMo45167q7 = interfaceC17242cM30855g7.mo45167q();
                                int i38 = c17248i18.f66267b;
                                if (numMo45167q7 != null && numMo45167q7.intValue() == i38) {
                                    c27827f2.f112091a = interfaceC17242cM30855g7.mo45166o();
                                } else {
                                    int i39 = c17248i19.f66267b;
                                    if (numMo45167q7 != null && numMo45167q7.intValue() == i39) {
                                        c27827f2.f112092b = interfaceC17242cM30855g7.mo45166o();
                                    } else if (numMo45167q7 != null) {
                                        interfaceC17242cM30855g7.skipValue();
                                    }
                                }
                            }
                        }
                        ssoOidcException = new UnauthorizedClientException(c27827f2);
                        break;
                    case "InternalServerException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        C14279u c14279u2 = new C14279u(1);
                        if (bArr != null) {
                            C21649b c21649b8 = new C21649b(bArr);
                            C17251l c17251l8 = C17251l.f66278i;
                            C17248i c17248i20 = new C17248i(c17251l8, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                            C17248i c17248i21 = new C17248i(c17251l8, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error_description")}), 0);
                            InterfaceC17242c interfaceC17242cM30855g8 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i20, c17248i21), c21649b8);
                            while (true) {
                                Integer numMo45167q8 = interfaceC17242cM30855g8.mo45167q();
                                int i44 = c17248i20.f66267b;
                                if (numMo45167q8 != null && numMo45167q8.intValue() == i44) {
                                    c14279u2.f52138b = interfaceC17242cM30855g8.mo45166o();
                                } else {
                                    int i45 = c17248i21.f66267b;
                                    if (numMo45167q8 != null && numMo45167q8.intValue() == i45) {
                                        c14279u2.f52139c = interfaceC17242cM30855g8.mo45166o();
                                    } else if (numMo45167q8 != null) {
                                        interfaceC17242cM30855g8.skipValue();
                                    }
                                }
                            }
                        }
                        ssoOidcException = new InternalServerException(c14279u2);
                        break;
                    case "InvalidScopeException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        C20653c0 c20653c1 = new C20653c0();
                        if (bArr != null) {
                            C21649b c21649b9 = new C21649b(bArr);
                            C17251l c17251l9 = C17251l.f66278i;
                            C17248i c17248i22 = new C17248i(c17251l9, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                            C17248i c17248i23 = new C17248i(c17251l9, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error_description")}), 0);
                            InterfaceC17242c interfaceC17242cM30855g9 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i22, c17248i23), c21649b9);
                            while (true) {
                                Integer numMo45167q9 = interfaceC17242cM30855g9.mo45167q();
                                int i46 = c17248i22.f66267b;
                                if (numMo45167q9 != null && numMo45167q9.intValue() == i46) {
                                    c20653c1.f77248a = interfaceC17242cM30855g9.mo45166o();
                                } else {
                                    int i47 = c17248i23.f66267b;
                                    if (numMo45167q9 != null && numMo45167q9.intValue() == i47) {
                                        c20653c1.f77249b = interfaceC17242cM30855g9.mo45166o();
                                    } else if (numMo45167q9 != null) {
                                        interfaceC17242cM30855g9.skipValue();
                                    }
                                }
                            }
                        }
                        ssoOidcException = new InvalidScopeException(c20653c1);
                        break;
                    case "InvalidRequestException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        C15990r c15990r2 = new C15990r(27, z4);
                        if (bArr != null) {
                            C21649b c21649b10 = new C21649b(bArr);
                            C17251l c17251l10 = C17251l.f66278i;
                            C17248i c17248i24 = new C17248i(c17251l10, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                            C17248i c17248i25 = new C17248i(c17251l10, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error_description")}), 0);
                            C17248i c17248i26 = new C17248i(C17251l.f66273d, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("reason")}), 0);
                            C38445a c38445a3 = new C38445a(13);
                            c38445a3.m123180p(c17248i24);
                            c38445a3.m123180p(c17248i25);
                            c38445a3.m123180p(c17248i26);
                            InterfaceC17242c interfaceC17242cM30855g10 = AbstractC11478a.m30855g(c38445a3, c21649b10);
                            while (true) {
                                Integer numMo45167q10 = interfaceC17242cM30855g10.mo45167q();
                                int i48 = c17248i24.f66267b;
                                if (numMo45167q10 != null && numMo45167q10.intValue() == i48) {
                                    c15990r2.f60512x = interfaceC17242cM30855g10.mo45166o();
                                } else {
                                    int i49 = c17248i25.f66267b;
                                    if (numMo45167q10 != null && numMo45167q10.intValue() == i49) {
                                        c15990r2.f60513y = interfaceC17242cM30855g10.mo45166o();
                                    } else {
                                        int i54 = c17248i26.f66267b;
                                        if (numMo45167q10 != null && numMo45167q10.intValue() == i54) {
                                            String value2 = interfaceC17242cM30855g10.mo45166o();
                                            int i55 = AbstractC27833l.f112098a;
                                            AbstractC22676k.m65750j(value2, "value");
                                            switch (value2) {
                                                case "KMS_NotFoundException":
                                                    c27832k = C27831j.f112096b;
                                                    break;
                                                case "KMS_InvalidKeyUsageException":
                                                    c27832k = C27829h.f112094b;
                                                    break;
                                                case "KMS_DisabledException":
                                                    c27832k = C27828g.f112093b;
                                                    break;
                                                case "KMS_InvalidStateException":
                                                    c27832k = C27830i.f112095b;
                                                    break;
                                                default:
                                                    c27832k = new C27832k(value2);
                                                    break;
                                            }
                                            c15990r2.f60514z = c27832k;
                                        } else if (numMo45167q10 != null) {
                                            interfaceC17242cM30855g10.skipValue();
                                        }
                                    }
                                }
                            }
                        }
                        ssoOidcException = new InvalidRequestException(c15990r2);
                        break;
                    case "InvalidGrantException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        C21745c c21745c2 = new C21745c();
                        if (bArr != null) {
                            C21649b c21649b11 = new C21649b(bArr);
                            C17251l c17251l11 = C17251l.f66278i;
                            C17248i c17248i27 = new C17248i(c17251l11, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                            C17248i c17248i28 = new C17248i(c17251l11, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error_description")}), 0);
                            InterfaceC17242c interfaceC17242cM30855g11 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i27, c17248i28), c21649b11);
                            while (true) {
                                Integer numMo45167q11 = interfaceC17242cM30855g11.mo45167q();
                                int i56 = c17248i27.f66267b;
                                if (numMo45167q11 != null && numMo45167q11.intValue() == i56) {
                                    c21745c2.f83655a = interfaceC17242cM30855g11.mo45166o();
                                } else {
                                    int i57 = c17248i28.f66267b;
                                    if (numMo45167q11 != null && numMo45167q11.intValue() == i57) {
                                        c21745c2.f83656b = interfaceC17242cM30855g11.mo45166o();
                                    } else if (numMo45167q11 != null) {
                                        interfaceC17242cM30855g11.skipValue();
                                    }
                                }
                            }
                        }
                        ssoOidcException = new InvalidGrantException(c21745c2);
                        break;
                    case "UnsupportedGrantTypeException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        C21745c c21745c3 = new C21745c();
                        if (bArr != null) {
                            C21649b c21649b12 = new C21649b(bArr);
                            C17251l c17251l12 = C17251l.f66278i;
                            C17248i c17248i29 = new C17248i(c17251l12, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                            C17248i c17248i30 = new C17248i(c17251l12, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error_description")}), 0);
                            InterfaceC17242c interfaceC17242cM30855g12 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i29, c17248i30), c21649b12);
                            while (true) {
                                Integer numMo45167q12 = interfaceC17242cM30855g12.mo45167q();
                                int i58 = c17248i29.f66267b;
                                if (numMo45167q12 != null && numMo45167q12.intValue() == i58) {
                                    c21745c3.f83655a = interfaceC17242cM30855g12.mo45166o();
                                } else {
                                    int i59 = c17248i30.f66267b;
                                    if (numMo45167q12 != null && numMo45167q12.intValue() == i59) {
                                        c21745c3.f83656b = interfaceC17242cM30855g12.mo45166o();
                                    } else if (numMo45167q12 != null) {
                                        interfaceC17242cM30855g12.skipValue();
                                    }
                                }
                            }
                        }
                        ssoOidcException = new UnsupportedGrantTypeException(c21745c3);
                        break;
                    default:
                        ssoOidcException = new SsoOidcException(c39476cM131580a.f169860b);
                        break;
                }
            } else {
                ssoOidcException = new SsoOidcException(c39476cM131580a.f169860b);
            }
            AbstractC32309k.m100578h(ssoOidcException, c37236aM100714v, c39476cM131580a);
            throw ssoOidcException;
        } catch (Exception e5) {
            SsoOidcException ssoOidcException2 = new SsoOidcException(e5, "Failed to parse response as 'restJson1' error");
            AbstractC32309k.m100578h(ssoOidcException2, call2.f128964x, null);
            throw ssoOidcException2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX INFO: renamed from: c */
    private final Object m32248c(C12002a context, C31341l call, byte[] bArr) {
        AwsServiceException cognitoIdentityProviderException;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        C37236a c37236a = call.f128964x;
        if (!AbstractC3269g.m9483L(c37236a.f159235a)) {
            C37236a c37236aM100714v = AbstractC32350a.m100714v(c37236a, bArr);
            C31341l c31341lM96420b = C31341l.m96420b(call, c37236aM100714v);
            try {
                C17248i c17248i = AbstractC40581a.f174777a;
                C39476c c39476cM131580a = AbstractC40581a.m131580a(c37236a.f159236b, bArr);
                String str = c39476cM131580a.f169859a;
                if (str != null) {
                    switch (str) {
                        case "NotAuthorizedException":
                            cognitoIdentityProviderException = AbstractC32412c.m101122i(context, c31341lM96420b, bArr);
                            break;
                        case "ForbiddenException":
                            cognitoIdentityProviderException = AbstractC11941a.m32240f(context, c31341lM96420b, bArr);
                            break;
                        case "UserNotFoundException":
                            cognitoIdentityProviderException = AbstractC32412c.m101131r(context, c31341lM96420b, bArr);
                            break;
                        case "UserNotConfirmedException":
                            cognitoIdentityProviderException = AbstractC32412c.m101130q(context, c31341lM96420b, bArr);
                            break;
                        case "InternalErrorException":
                            cognitoIdentityProviderException = AbstractC11941a.m32241g(context, c31341lM96420b, bArr);
                            break;
                        case "TooManyRequestsException":
                            cognitoIdentityProviderException = AbstractC32412c.m101126m(context, c31341lM96420b, bArr);
                            break;
                        case "InvalidParameterException":
                            cognitoIdentityProviderException = AbstractC11941a.m32244j(context, c31341lM96420b, bArr);
                            break;
                        case "ResourceNotFoundException":
                            cognitoIdentityProviderException = AbstractC32412c.m101125l(context, c31341lM96420b, bArr);
                            break;
                        case "PasswordResetRequiredException":
                            cognitoIdentityProviderException = AbstractC32412c.m101124k(context, c31341lM96420b, bArr);
                            break;
                        default:
                            cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
                            break;
                    }
                } else {
                    cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
                }
                AbstractC32309k.m100578h(cognitoIdentityProviderException, c37236aM100714v, c39476cM131580a);
                throw cognitoIdentityProviderException;
            } catch (Exception e5) {
                CognitoIdentityProviderException cognitoIdentityProviderException2 = new CognitoIdentityProviderException(e5, "Failed to parse response as 'awsJson1_1' error");
                AbstractC32309k.m100578h(cognitoIdentityProviderException2, c31341lM96420b.f128964x, null);
                throw cognitoIdentityProviderException2;
            }
        }
        C2570m c2570m = new C2570m(14);
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17251l c17251l = C17251l.f66275f;
            int i13 = 1;
            int i14 = 0;
            C17248i c17248i2 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("MFAOptions")}), 0);
            C17251l c17251l2 = C17251l.f66278i;
            C17248i c17248i3 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("PreferredMfaSetting")}), 0);
            C17248i c17248i4 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("UserAttributes")}), 0);
            C17248i c17248i5 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("UserMFASettingList")}), 0);
            C17248i c17248i6 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Username")}), 0);
            C38445a c38445a = new C38445a(13);
            c38445a.m123180p(c17248i2);
            c38445a.m123180p(c17248i3);
            c38445a.m123180p(c17248i4);
            c38445a.m123180p(c17248i5);
            c38445a.m123180p(c17248i6);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(c38445a, c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i15 = c17248i2.f66267b;
                if (numMo45167q != null && numMo45167q.intValue() == i15) {
                    c21649b.m60913a(c17248i2);
                    ArrayList arrayList = new ArrayList();
                    while (c21649b.m60917e()) {
                        if (c21649b.m60920i()) {
                            C29875i c29875i = new C29875i();
                            int i16 = i14;
                            InterfaceC17243d[] interfaceC17243dArr = new InterfaceC17243d[i13];
                            interfaceC17243dArr[i16] = new C21652e("AttributeName");
                            C17248i c17248i7 = new C17248i(c17251l2, AbstractC25260n.m74059b1(interfaceC17243dArr), i16);
                            C17251l c17251l3 = C17251l.f66273d;
                            C17248i c17248i8 = c17248i2;
                            InterfaceC17243d[] interfaceC17243dArr2 = new InterfaceC17243d[1];
                            interfaceC17243dArr2[i16] = new C21652e("DeliveryMedium");
                            C17248i c17248i9 = new C17248i(c17251l3, AbstractC25260n.m74059b1(interfaceC17243dArr2), i16);
                            InterfaceC17242c interfaceC17242cM30855g2 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i7, c17248i9), c21649b);
                            while (true) {
                                Integer numMo45167q2 = interfaceC17242cM30855g2.mo45167q();
                                int i17 = c17248i7.f66267b;
                                InterfaceC17242c interfaceC17242c = interfaceC17242cM30855g2;
                                if (numMo45167q2 == null || numMo45167q2.intValue() != i17) {
                                    int i18 = c17248i9.f66267b;
                                    if (numMo45167q2 == null || numMo45167q2.intValue() != i18) {
                                        if (numMo45167q2 == null) {
                                            break;
                                        }
                                        interfaceC17242c.skipValue();
                                    } else {
                                        String strMo45166o = interfaceC17242c.mo45166o();
                                        int i19 = AbstractC31272g0.f128790a;
                                        c29875i.f122096x = AbstractC36259c.m115672K(strMo45166o);
                                    }
                                } else {
                                    c29875i.f122095w = interfaceC17242c.mo45166o();
                                }
                                interfaceC17242cM30855g2 = interfaceC17242c;
                            }
                            arrayList.add(new C31290p0(c29875i));
                            c17248i2 = c17248i8;
                        } else {
                            c21649b.m60915c();
                        }
                        i13 = 1;
                        i14 = 0;
                    }
                    c2570m.f9987x = arrayList;
                } else {
                    C17248i c17248i10 = c17248i2;
                    int i24 = c17248i3.f66267b;
                    if (numMo45167q == null || numMo45167q.intValue() != i24) {
                        int i25 = c17248i4.f66267b;
                        if (numMo45167q == null || numMo45167q.intValue() != i25) {
                            int i26 = c17248i5.f66267b;
                            if (numMo45167q == null || numMo45167q.intValue() != i26) {
                                int i27 = c17248i6.f66267b;
                                if (numMo45167q == null || numMo45167q.intValue() != i27) {
                                    if (numMo45167q == null) {
                                        break;
                                    }
                                    interfaceC17242cM30855g.skipValue();
                                } else {
                                    c2570m.f9985F = interfaceC17242cM30855g.mo45166o();
                                }
                            } else {
                                c21649b.m60913a(c17248i5);
                                ArrayList arrayList2 = new ArrayList();
                                while (c21649b.m60917e()) {
                                    if (c21649b.m60920i()) {
                                        arrayList2.add(c21649b.mo45166o());
                                    } else {
                                        c21649b.m60915c();
                                    }
                                }
                                c2570m.f9984E = arrayList2;
                            }
                        } else {
                            c21649b.m60913a(c17248i4);
                            ArrayList arrayList3 = new ArrayList();
                            while (c21649b.m60917e()) {
                                if (c21649b.m60920i()) {
                                    C31253a c31253a = new C31253a();
                                    C17248i c17248i11 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Name")}), 0);
                                    C17248i c17248i12 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Value")}), 0);
                                    InterfaceC17242c interfaceC17242cM30855g3 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i11, c17248i12), c21649b);
                                    while (true) {
                                        Integer numMo45167q3 = interfaceC17242cM30855g3.mo45167q();
                                        int i28 = c17248i11.f66267b;
                                        if (numMo45167q3 == null || numMo45167q3.intValue() != i28) {
                                            int i29 = c17248i12.f66267b;
                                            if (numMo45167q3 == null || numMo45167q3.intValue() != i29) {
                                                if (numMo45167q3 == null) {
                                                    break;
                                                }
                                                interfaceC17242cM30855g3.skipValue();
                                            } else {
                                                c31253a.f128757b = interfaceC17242cM30855g3.mo45166o();
                                            }
                                        } else {
                                            c31253a.f128756a = interfaceC17242cM30855g3.mo45166o();
                                        }
                                    }
                                    if (c31253a.f128756a == null) {
                                        c31253a.f128756a = "";
                                    }
                                    arrayList3.add(new C31256b(c31253a));
                                } else {
                                    c21649b.m60915c();
                                }
                            }
                            c2570m.f9989z = arrayList3;
                        }
                    } else {
                        c2570m.f9988y = interfaceC17242cM30855g.mo45166o();
                    }
                    c17248i2 = c17248i10;
                }
                i13 = 1;
                i14 = 0;
            }
        }
        if (c2570m.f9989z == null) {
            c2570m.f9989z = C25271y.f99162w;
        }
        if (((String) c2570m.f9985F) == null) {
            c2570m.f9985F = "";
        }
        return new C31284m0(c2570m);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:79:0x0133  */
    /* JADX INFO: renamed from: d */
    private final Object m32249d(C12002a context, C31341l call, byte[] bArr) {
        AwsServiceException cognitoIdentityProviderException;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        C37236a c37236a = call.f128964x;
        if (AbstractC3269g.m9483L(c37236a.f159235a)) {
            C2570m c2570m = new C2570m(15);
            if (bArr != null) {
                C21649b c21649b = new C21649b(bArr);
                C17248i c17248i = new C17248i(C17251l.f66279j, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AuthenticationResult")}), 0);
                C17248i c17248i2 = new C17248i(C17251l.f66275f, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AvailableChallenges")}), 0);
                C17248i c17248i3 = new C17248i(C17251l.f66273d, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ChallengeName")}), 0);
                C17248i c17248i4 = new C17248i(C17251l.f66277h, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ChallengeParameters")}), 0);
                C17248i c17248i5 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Session")}), 0);
                C38445a c38445a = new C38445a(13);
                c38445a.m123180p(c17248i);
                c38445a.m123180p(c17248i2);
                c38445a.m123180p(c17248i3);
                c38445a.m123180p(c17248i4);
                c38445a.m123180p(c17248i5);
                InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(c38445a, c21649b);
                while (true) {
                    Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                    int i13 = c17248i.f66267b;
                    if (numMo45167q == null || numMo45167q.intValue() != i13) {
                        int i14 = c17248i2.f66267b;
                        if (numMo45167q == null || numMo45167q.intValue() != i14) {
                            int i15 = c17248i3.f66267b;
                            if (numMo45167q == null || numMo45167q.intValue() != i15) {
                                int i16 = c17248i4.f66267b;
                                if (numMo45167q == null || numMo45167q.intValue() != i16) {
                                    int i17 = c17248i5.f66267b;
                                    if (numMo45167q == null || numMo45167q.intValue() != i17) {
                                        if (numMo45167q == null) {
                                            break;
                                        }
                                        interfaceC17242cM30855g.skipValue();
                                    } else {
                                        c2570m.f9985F = interfaceC17242cM30855g.mo45166o();
                                    }
                                } else {
                                    c21649b.m60914b(c17248i4);
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    while (c21649b.m60918f()) {
                                        String strM60919g = c21649b.m60919g();
                                        if (c21649b.m60920i()) {
                                            linkedHashMap.put(strM60919g, c21649b.mo45166o());
                                        } else {
                                            c21649b.m60915c();
                                        }
                                    }
                                    c2570m.f9984E = linkedHashMap;
                                }
                            } else {
                                String strMo45166o = interfaceC17242cM30855g.mo45166o();
                                int i18 = AbstractC31309z.f128860a;
                                c2570m.f9989z = AbstractC35903f.m114020q(strMo45166o);
                            }
                        } else {
                            c21649b.m60913a(c17248i2);
                            ArrayList arrayList = new ArrayList();
                            while (c21649b.m60917e()) {
                                if (c21649b.m60920i()) {
                                    String strMo45166o2 = c21649b.mo45166o();
                                    int i19 = AbstractC31309z.f128860a;
                                    arrayList.add(AbstractC35903f.m114020q(strMo45166o2));
                                } else {
                                    c21649b.m60915c();
                                }
                            }
                            c2570m.f9988y = arrayList;
                        }
                    } else {
                        c2570m.f9987x = AbstractC31484o.m96966r(c21649b);
                    }
                }
            }
            return new C31288o0(c2570m);
        }
        C37236a c37236aM100714v = AbstractC32350a.m100714v(c37236a, bArr);
        C31341l c31341lM96420b = C31341l.m96420b(call, c37236aM100714v);
        try {
            C17248i c17248i6 = AbstractC40581a.f174777a;
            C39476c c39476cM131580a = AbstractC40581a.m131580a(c37236a.f159236b, bArr);
            String str = c39476cM131580a.f169859a;
            if (str != null) {
                switch (str) {
                    case "InvalidEmailRoleAccessPolicyException":
                        cognitoIdentityProviderException = AbstractC11941a.m32242h(context, c31341lM96420b, bArr);
                        break;
                    case "NotAuthorizedException":
                        cognitoIdentityProviderException = AbstractC32412c.m101122i(context, c31341lM96420b, bArr);
                        break;
                    case "InvalidLambdaResponseException":
                        cognitoIdentityProviderException = AbstractC11941a.m32243i(context, c31341lM96420b, bArr);
                        break;
                    case "InvalidSmsRoleAccessPolicyException":
                        cognitoIdentityProviderException = AbstractC11941a.m32246l(context, c31341lM96420b, bArr);
                        break;
                    case "InvalidSmsRoleTrustRelationshipException":
                        cognitoIdentityProviderException = AbstractC32412c.m101119f(context, c31341lM96420b, bArr);
                        break;
                    case "ForbiddenException":
                        cognitoIdentityProviderException = AbstractC11941a.m32240f(context, c31341lM96420b, bArr);
                        break;
                    case "UserNotFoundException":
                        cognitoIdentityProviderException = AbstractC32412c.m101131r(context, c31341lM96420b, bArr);
                        break;
                    case "UserNotConfirmedException":
                        cognitoIdentityProviderException = AbstractC32412c.m101130q(context, c31341lM96420b, bArr);
                        break;
                    case "InternalErrorException":
                        cognitoIdentityProviderException = AbstractC11941a.m32241g(context, c31341lM96420b, bArr);
                        break;
                    case "UserLambdaValidationException":
                        cognitoIdentityProviderException = AbstractC32412c.m101129p(context, c31341lM96420b, bArr);
                        break;
                    case "UnexpectedLambdaException":
                        cognitoIdentityProviderException = AbstractC32412c.m101127n(context, c31341lM96420b, bArr);
                        break;
                    case "TooManyRequestsException":
                        cognitoIdentityProviderException = AbstractC32412c.m101126m(context, c31341lM96420b, bArr);
                        break;
                    case "InvalidParameterException":
                        cognitoIdentityProviderException = AbstractC11941a.m32244j(context, c31341lM96420b, bArr);
                        break;
                    case "ResourceNotFoundException":
                        cognitoIdentityProviderException = AbstractC32412c.m101125l(context, c31341lM96420b, bArr);
                        break;
                    case "PasswordResetRequiredException":
                        cognitoIdentityProviderException = AbstractC32412c.m101124k(context, c31341lM96420b, bArr);
                        break;
                    case "UnsupportedOperationException":
                        cognitoIdentityProviderException = AbstractC32412c.m101128o(context, c31341lM96420b, bArr);
                        break;
                    case "InvalidUserPoolConfigurationException":
                        cognitoIdentityProviderException = AbstractC32412c.m101120g(context, c31341lM96420b, bArr);
                        break;
                    default:
                        cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
                        break;
                }
            } else {
                cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
            }
            AbstractC32309k.m100578h(cognitoIdentityProviderException, c37236aM100714v, c39476cM131580a);
            throw cognitoIdentityProviderException;
        } catch (Exception e5) {
            CognitoIdentityProviderException cognitoIdentityProviderException2 = new CognitoIdentityProviderException(e5, "Failed to parse response as 'awsJson1_1' error");
            AbstractC32309k.m100578h(cognitoIdentityProviderException2, c31341lM96420b.f128964x, null);
            throw cognitoIdentityProviderException2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x0233  */
    /* JADX INFO: renamed from: e */
    private final Object m32250e(C12002a context, C31341l call, byte[] bArr) {
        AwsServiceException cognitoIdentityProviderException;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        C37236a c37236a = call.f128964x;
        boolean z4 = false;
        if (AbstractC3269g.m9483L(c37236a.f159235a)) {
            C29662f c29662f = new C29662f(5, z4);
            if (bArr != null) {
                C21649b c21649b = new C21649b(bArr);
                C17248i c17248i = new C17248i(C17251l.f66279j, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AuthenticationResult")}), 0);
                C17248i c17248i2 = new C17248i(C17251l.f66273d, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ChallengeName")}), 0);
                C17248i c17248i3 = new C17248i(C17251l.f66277h, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ChallengeParameters")}), 0);
                C17248i c17248i4 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Session")}), 0);
                C38445a c38445a = new C38445a(13);
                c38445a.m123180p(c17248i);
                c38445a.m123180p(c17248i2);
                c38445a.m123180p(c17248i3);
                c38445a.m123180p(c17248i4);
                InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(c38445a, c21649b);
                while (true) {
                    Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                    int i13 = c17248i.f66267b;
                    if (numMo45167q == null || numMo45167q.intValue() != i13) {
                        int i14 = c17248i2.f66267b;
                        if (numMo45167q == null || numMo45167q.intValue() != i14) {
                            int i15 = c17248i3.f66267b;
                            if (numMo45167q == null || numMo45167q.intValue() != i15) {
                                int i16 = c17248i4.f66267b;
                                if (numMo45167q == null || numMo45167q.intValue() != i16) {
                                    if (numMo45167q == null) {
                                        break;
                                    }
                                    interfaceC17242cM30855g.skipValue();
                                } else {
                                    c29662f.f121228E = interfaceC17242cM30855g.mo45166o();
                                }
                            } else {
                                c21649b.m60914b(c17248i3);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                while (c21649b.m60918f()) {
                                    String strM60919g = c21649b.m60919g();
                                    if (c21649b.m60920i()) {
                                        linkedHashMap.put(strM60919g, c21649b.mo45166o());
                                    } else {
                                        c21649b.m60915c();
                                    }
                                }
                                c29662f.f121232z = linkedHashMap;
                            }
                        } else {
                            String strMo45166o = interfaceC17242cM30855g.mo45166o();
                            int i17 = AbstractC31309z.f128860a;
                            c29662f.f121231y = AbstractC35903f.m114020q(strMo45166o);
                        }
                    } else {
                        c29662f.f121230x = AbstractC31484o.m96966r(c21649b);
                    }
                }
            }
            return new C31296s0(c29662f);
        }
        C37236a c37236aM100714v = AbstractC32350a.m100714v(c37236a, bArr);
        C31341l call2 = C31341l.m96420b(call, c37236aM100714v);
        String strMo45166o2 = null;
        try {
            C17248i c17248i5 = AbstractC40581a.f174777a;
            C39476c c39476cM131580a = AbstractC40581a.m131580a(c37236a.f159236b, bArr);
            String str = c39476cM131580a.f169859a;
            if (str != null) {
                switch (str) {
                    case "InvalidEmailRoleAccessPolicyException":
                        cognitoIdentityProviderException = AbstractC11941a.m32242h(context, call2, bArr);
                        break;
                    case "InvalidPasswordException":
                        cognitoIdentityProviderException = AbstractC11941a.m32245k(context, call2, bArr);
                        break;
                    case "NotAuthorizedException":
                        cognitoIdentityProviderException = AbstractC32412c.m101122i(context, call2, bArr);
                        break;
                    case "InvalidLambdaResponseException":
                        cognitoIdentityProviderException = AbstractC11941a.m32243i(context, call2, bArr);
                        break;
                    case "InvalidSmsRoleAccessPolicyException":
                        cognitoIdentityProviderException = AbstractC11941a.m32246l(context, call2, bArr);
                        break;
                    case "InvalidSmsRoleTrustRelationshipException":
                        cognitoIdentityProviderException = AbstractC32412c.m101119f(context, call2, bArr);
                        break;
                    case "MFAMethodNotFoundException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        if (bArr != null) {
                            C21649b c21649b2 = new C21649b(bArr);
                            C17248i c17248i6 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                            InterfaceC17242c interfaceC17242cM30855g2 = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i6), c21649b2);
                            while (true) {
                                Integer numMo45167q2 = interfaceC17242cM30855g2.mo45167q();
                                int i18 = c17248i6.f66267b;
                                if (numMo45167q2 != null && numMo45167q2.intValue() == i18) {
                                    strMo45166o2 = interfaceC17242cM30855g2.mo45166o();
                                } else if (numMo45167q2 != null) {
                                    interfaceC17242cM30855g2.skipValue();
                                }
                            }
                        }
                        cognitoIdentityProviderException = new MfaMethodNotFoundException(strMo45166o2);
                        cognitoIdentityProviderException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
                        break;
                    case "PasswordHistoryPolicyViolationException":
                        cognitoIdentityProviderException = AbstractC32412c.m101123j(context, call2, bArr);
                        break;
                    case "ForbiddenException":
                        cognitoIdentityProviderException = AbstractC11941a.m32240f(context, call2, bArr);
                        break;
                    case "UserNotFoundException":
                        cognitoIdentityProviderException = AbstractC32412c.m101131r(context, call2, bArr);
                        break;
                    case "UserNotConfirmedException":
                        cognitoIdentityProviderException = AbstractC32412c.m101130q(context, call2, bArr);
                        break;
                    case "InternalErrorException":
                        cognitoIdentityProviderException = AbstractC11941a.m32241g(context, call2, bArr);
                        break;
                    case "SoftwareTokenMFANotFoundException":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        if (bArr != null) {
                            C21649b c21649b3 = new C21649b(bArr);
                            C17248i c17248i7 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                            InterfaceC17242c interfaceC17242cM30855g3 = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i7), c21649b3);
                            while (true) {
                                Integer numMo45167q3 = interfaceC17242cM30855g3.mo45167q();
                                int i19 = c17248i7.f66267b;
                                if (numMo45167q3 != null && numMo45167q3.intValue() == i19) {
                                    strMo45166o2 = interfaceC17242cM30855g3.mo45166o();
                                } else if (numMo45167q3 != null) {
                                    interfaceC17242cM30855g3.skipValue();
                                }
                            }
                        }
                        cognitoIdentityProviderException = new SoftwareTokenMfaNotFoundException(strMo45166o2);
                        cognitoIdentityProviderException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
                        break;
                    case "ExpiredCodeException":
                        cognitoIdentityProviderException = AbstractC11941a.m32239e(context, call2, bArr);
                        break;
                    case "UserLambdaValidationException":
                        cognitoIdentityProviderException = AbstractC32412c.m101129p(context, call2, bArr);
                        break;
                    case "UnexpectedLambdaException":
                        cognitoIdentityProviderException = AbstractC32412c.m101127n(context, call2, bArr);
                        break;
                    case "TooManyRequestsException":
                        cognitoIdentityProviderException = AbstractC32412c.m101126m(context, call2, bArr);
                        break;
                    case "InvalidParameterException":
                        cognitoIdentityProviderException = AbstractC11941a.m32244j(context, call2, bArr);
                        break;
                    case "ResourceNotFoundException":
                        cognitoIdentityProviderException = AbstractC32412c.m101125l(context, call2, bArr);
                        break;
                    case "CodeMismatchException":
                        cognitoIdentityProviderException = AbstractC11941a.m32238d(context, call2, bArr);
                        break;
                    case "PasswordResetRequiredException":
                        cognitoIdentityProviderException = AbstractC32412c.m101124k(context, call2, bArr);
                        break;
                    case "AliasExistsException":
                        cognitoIdentityProviderException = AbstractC11941a.m32236b(context, call2, bArr);
                        break;
                    case "InvalidUserPoolConfigurationException":
                        cognitoIdentityProviderException = AbstractC32412c.m101120g(context, call2, bArr);
                        break;
                    default:
                        cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
                        break;
                }
            } else {
                cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
            }
            AbstractC32309k.m100578h(cognitoIdentityProviderException, c37236aM100714v, c39476cM131580a);
            throw cognitoIdentityProviderException;
        } catch (Exception e5) {
            CognitoIdentityProviderException cognitoIdentityProviderException2 = new CognitoIdentityProviderException(e5, "Failed to parse response as 'awsJson1_1' error");
            AbstractC32309k.m100578h(cognitoIdentityProviderException2, call2.f128964x, null);
            throw cognitoIdentityProviderException2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX INFO: renamed from: f */
    private final Object m32251f(C12002a context, C31341l call, byte[] bArr) {
        AwsServiceException cognitoIdentityProviderException;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        C37236a c37236a = call.f128964x;
        if (AbstractC3269g.m9483L(c37236a.f159235a)) {
            return new C31306x0();
        }
        C37236a c37236aM100714v = AbstractC32350a.m100714v(c37236a, bArr);
        C31341l c31341lM96420b = C31341l.m96420b(call, c37236aM100714v);
        try {
            C17248i c17248i = AbstractC40581a.f174777a;
            C39476c c39476cM131580a = AbstractC40581a.m131580a(c37236a.f159236b, bArr);
            String str = c39476cM131580a.f169859a;
            if (str != null) {
                switch (str) {
                    case "NotAuthorizedException":
                        cognitoIdentityProviderException = AbstractC32412c.m101122i(context, c31341lM96420b, bArr);
                        break;
                    case "ForbiddenException":
                        cognitoIdentityProviderException = AbstractC11941a.m32240f(context, c31341lM96420b, bArr);
                        break;
                    case "UserNotFoundException":
                        cognitoIdentityProviderException = AbstractC32412c.m101131r(context, c31341lM96420b, bArr);
                        break;
                    case "UserNotConfirmedException":
                        cognitoIdentityProviderException = AbstractC32412c.m101130q(context, c31341lM96420b, bArr);
                        break;
                    case "InternalErrorException":
                        cognitoIdentityProviderException = AbstractC11941a.m32241g(context, c31341lM96420b, bArr);
                        break;
                    case "InvalidParameterException":
                        cognitoIdentityProviderException = AbstractC11941a.m32244j(context, c31341lM96420b, bArr);
                        break;
                    case "ResourceNotFoundException":
                        cognitoIdentityProviderException = AbstractC32412c.m101125l(context, c31341lM96420b, bArr);
                        break;
                    case "PasswordResetRequiredException":
                        cognitoIdentityProviderException = AbstractC32412c.m101124k(context, c31341lM96420b, bArr);
                        break;
                    default:
                        cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
                        break;
                }
            } else {
                cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
            }
            AbstractC32309k.m100578h(cognitoIdentityProviderException, c37236aM100714v, c39476cM131580a);
            throw cognitoIdentityProviderException;
        } catch (Exception e5) {
            CognitoIdentityProviderException cognitoIdentityProviderException2 = new CognitoIdentityProviderException(e5, "Failed to parse response as 'awsJson1_1' error");
            AbstractC32309k.m100578h(cognitoIdentityProviderException2, c31341lM96420b.f128964x, null);
            throw cognitoIdentityProviderException2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:87:0x0153  */
    /* JADX INFO: renamed from: g */
    private final Object m32252g(C12002a context, C31341l call, byte[] bArr) {
        AwsServiceException cognitoIdentityProviderException;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        C37236a c37236a = call.f128964x;
        if (AbstractC3269g.m9483L(c37236a.f159235a)) {
            C0656u0 c0656u0 = new C0656u0();
            if (bArr != null) {
                C21649b c21649b = new C21649b(bArr);
                C17248i c17248i = new C17248i(C17251l.f66275f, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("CodeDeliveryDetailsList")}), 0);
                InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
                while (true) {
                    Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                    int i13 = c17248i.f66267b;
                    if (numMo45167q == null || numMo45167q.intValue() != i13) {
                        if (numMo45167q == null) {
                            break;
                        }
                        interfaceC17242cM30855g.skipValue();
                    } else {
                        c21649b.m60913a(c17248i);
                        ArrayList arrayList = new ArrayList();
                        while (c21649b.m60917e()) {
                            if (c21649b.m60920i()) {
                                arrayList.add(AbstractC31780b.m98687h(c21649b));
                            } else {
                                c21649b.m60915c();
                            }
                        }
                        c0656u0.f2286a = arrayList;
                    }
                }
            }
            return new C31264d1(c0656u0);
        }
        C37236a c37236aM100714v = AbstractC32350a.m100714v(c37236a, bArr);
        C31341l c31341lM96420b = C31341l.m96420b(call, c37236aM100714v);
        try {
            C17248i c17248i2 = AbstractC40581a.f174777a;
            C39476c c39476cM131580a = AbstractC40581a.m131580a(c37236a.f159236b, bArr);
            String str = c39476cM131580a.f169859a;
            if (str != null) {
                switch (str) {
                    case "InvalidEmailRoleAccessPolicyException":
                        cognitoIdentityProviderException = AbstractC11941a.m32242h(context, c31341lM96420b, bArr);
                        break;
                    case "NotAuthorizedException":
                        cognitoIdentityProviderException = AbstractC32412c.m101122i(context, c31341lM96420b, bArr);
                        break;
                    case "InvalidLambdaResponseException":
                        cognitoIdentityProviderException = AbstractC11941a.m32243i(context, c31341lM96420b, bArr);
                        break;
                    case "InvalidSmsRoleAccessPolicyException":
                        cognitoIdentityProviderException = AbstractC11941a.m32246l(context, c31341lM96420b, bArr);
                        break;
                    case "InvalidSmsRoleTrustRelationshipException":
                        cognitoIdentityProviderException = AbstractC32412c.m101119f(context, c31341lM96420b, bArr);
                        break;
                    case "ForbiddenException":
                        cognitoIdentityProviderException = AbstractC11941a.m32240f(context, c31341lM96420b, bArr);
                        break;
                    case "UserNotFoundException":
                        cognitoIdentityProviderException = AbstractC32412c.m101131r(context, c31341lM96420b, bArr);
                        break;
                    case "UserNotConfirmedException":
                        cognitoIdentityProviderException = AbstractC32412c.m101130q(context, c31341lM96420b, bArr);
                        break;
                    case "InternalErrorException":
                        cognitoIdentityProviderException = AbstractC11941a.m32241g(context, c31341lM96420b, bArr);
                        break;
                    case "ExpiredCodeException":
                        cognitoIdentityProviderException = AbstractC11941a.m32239e(context, c31341lM96420b, bArr);
                        break;
                    case "UserLambdaValidationException":
                        cognitoIdentityProviderException = AbstractC32412c.m101129p(context, c31341lM96420b, bArr);
                        break;
                    case "UnexpectedLambdaException":
                        cognitoIdentityProviderException = AbstractC32412c.m101127n(context, c31341lM96420b, bArr);
                        break;
                    case "TooManyRequestsException":
                        cognitoIdentityProviderException = AbstractC32412c.m101126m(context, c31341lM96420b, bArr);
                        break;
                    case "InvalidParameterException":
                        cognitoIdentityProviderException = AbstractC11941a.m32244j(context, c31341lM96420b, bArr);
                        break;
                    case "ResourceNotFoundException":
                        cognitoIdentityProviderException = AbstractC32412c.m101125l(context, c31341lM96420b, bArr);
                        break;
                    case "CodeMismatchException":
                        cognitoIdentityProviderException = AbstractC11941a.m32238d(context, c31341lM96420b, bArr);
                        break;
                    case "PasswordResetRequiredException":
                        cognitoIdentityProviderException = AbstractC32412c.m101124k(context, c31341lM96420b, bArr);
                        break;
                    case "CodeDeliveryFailureException":
                        cognitoIdentityProviderException = AbstractC11941a.m32237c(context, c31341lM96420b, bArr);
                        break;
                    case "AliasExistsException":
                        cognitoIdentityProviderException = AbstractC11941a.m32236b(context, c31341lM96420b, bArr);
                        break;
                    default:
                        cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
                        break;
                }
            } else {
                cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
            }
            AbstractC32309k.m100578h(cognitoIdentityProviderException, c37236aM100714v, c39476cM131580a);
            throw cognitoIdentityProviderException;
        } catch (Exception e5) {
            CognitoIdentityProviderException cognitoIdentityProviderException2 = new CognitoIdentityProviderException(e5, "Failed to parse response as 'awsJson1_1' error");
            AbstractC32309k.m100578h(cognitoIdentityProviderException2, c31341lM96420b.f128964x, null);
            throw cognitoIdentityProviderException2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
    /* JADX INFO: renamed from: h */
    private final Object m32253h(C12002a context, C31341l call, byte[] bArr) {
        AwsServiceException cognitoIdentityProviderException;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        C37236a c37236a = call.f128964x;
        if (AbstractC3269g.m9483L(c37236a.f159235a)) {
            return new C31270f1();
        }
        C37236a c37236aM100714v = AbstractC32350a.m100714v(c37236a, bArr);
        C31341l c31341lM96420b = C31341l.m96420b(call, c37236aM100714v);
        try {
            C17248i c17248i = AbstractC40581a.f174777a;
            C39476c c39476cM131580a = AbstractC40581a.m131580a(c37236a.f159236b, bArr);
            String str = c39476cM131580a.f169859a;
            if (str != null) {
                switch (str) {
                    case "LimitExceededException":
                        cognitoIdentityProviderException = AbstractC32412c.m101121h(context, c31341lM96420b, bArr);
                        break;
                    case "NotAuthorizedException":
                        cognitoIdentityProviderException = AbstractC32412c.m101122i(context, c31341lM96420b, bArr);
                        break;
                    case "ForbiddenException":
                        cognitoIdentityProviderException = AbstractC11941a.m32240f(context, c31341lM96420b, bArr);
                        break;
                    case "UserNotFoundException":
                        cognitoIdentityProviderException = AbstractC32412c.m101131r(context, c31341lM96420b, bArr);
                        break;
                    case "UserNotConfirmedException":
                        cognitoIdentityProviderException = AbstractC32412c.m101130q(context, c31341lM96420b, bArr);
                        break;
                    case "InternalErrorException":
                        cognitoIdentityProviderException = AbstractC11941a.m32241g(context, c31341lM96420b, bArr);
                        break;
                    case "ExpiredCodeException":
                        cognitoIdentityProviderException = AbstractC11941a.m32239e(context, c31341lM96420b, bArr);
                        break;
                    case "TooManyRequestsException":
                        cognitoIdentityProviderException = AbstractC32412c.m101126m(context, c31341lM96420b, bArr);
                        break;
                    case "InvalidParameterException":
                        cognitoIdentityProviderException = AbstractC11941a.m32244j(context, c31341lM96420b, bArr);
                        break;
                    case "ResourceNotFoundException":
                        cognitoIdentityProviderException = AbstractC32412c.m101125l(context, c31341lM96420b, bArr);
                        break;
                    case "CodeMismatchException":
                        cognitoIdentityProviderException = AbstractC11941a.m32238d(context, c31341lM96420b, bArr);
                        break;
                    case "PasswordResetRequiredException":
                        cognitoIdentityProviderException = AbstractC32412c.m101124k(context, c31341lM96420b, bArr);
                        break;
                    case "AliasExistsException":
                        cognitoIdentityProviderException = AbstractC11941a.m32236b(context, c31341lM96420b, bArr);
                        break;
                    default:
                        cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
                        break;
                }
            } else {
                cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a.f169860b);
            }
            AbstractC32309k.m100578h(cognitoIdentityProviderException, c37236aM100714v, c39476cM131580a);
            throw cognitoIdentityProviderException;
        } catch (Exception e5) {
            CognitoIdentityProviderException cognitoIdentityProviderException2 = new CognitoIdentityProviderException(e5, "Failed to parse response as 'awsJson1_1' error");
            AbstractC32309k.m100578h(cognitoIdentityProviderException2, c31341lM96420b.f128964x, null);
            throw cognitoIdentityProviderException2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: i */
    private final Object m32254i(C12002a context, C31341l call, byte[] bArr) {
        Object objM107888l;
        Object objM107888l2;
        AwsServiceException stsException;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        C37236a c37236a = call.f128964x;
        if (!AbstractC3269g.m9483L(c37236a.f159235a)) {
            C37236a c37236aM100714v = AbstractC32350a.m100714v(c37236a, bArr);
            C31341l c31341lM96420b = C31341l.m96420b(call, c37236aM100714v);
            try {
                if (bArr == null) {
                    throw new IllegalStateException("unable to parse error from empty response");
                }
                C39476c c39476cM113987E = AbstractC35903f.m113987E(bArr);
                String str = c39476cM113987E.f169859a;
                if (str != null) {
                    switch (str) {
                        case "PackedPolicyTooLarge":
                            stsException = AbstractC32412c.m101117d(context, c31341lM96420b, bArr);
                            break;
                        case "ExpiredTokenException":
                            stsException = AbstractC32412c.m101115b(context, c31341lM96420b, bArr);
                            break;
                        case "RegionDisabledException":
                            stsException = AbstractC32412c.m101118e(context, c31341lM96420b, bArr);
                            break;
                        case "MalformedPolicyDocument":
                            stsException = AbstractC32412c.m101116c(context, c31341lM96420b, bArr);
                            break;
                        default:
                            stsException = new StsException(c39476cM113987E.f169860b);
                            break;
                    }
                } else {
                    stsException = new StsException(c39476cM113987E.f169860b);
                }
                AbstractC32309k.m100578h(stsException, c37236aM100714v, c39476cM113987E);
                throw stsException;
            } catch (Exception e5) {
                StsException stsException2 = new StsException(e5, "Failed to parse response as 'awsQuery' error");
                AbstractC32309k.m100578h(stsException2, c31341lM96420b.f128964x, null);
                throw stsException2;
            }
        }
        C29662f c29662f = new C29662f(16, false);
        if (bArr != null) {
            C2817b c2817bM100067v = AbstractC32128i.m100067v(AbstractC35903f.m114005Z(bArr), "AssumeRole");
            while (true) {
                C2817b c2817bM8017t = c2817bM100067v.m8017t();
                if (c2817bM8017t != null) {
                    String strM8014q = c2817bM8017t.m8014q();
                    switch (strM8014q.hashCode()) {
                        case -1787805543:
                            if (strM8014q.equals("AssumedRoleUser")) {
                                c29662f.f121230x = AbstractC32126g.m100042g(c2817bM8017t);
                            }
                            break;
                        case -1686485237:
                            if (strM8014q.equals("PackedPolicySize")) {
                                try {
                                    objM107888l = AbstractC35903f.m114017l(c2817bM8017t);
                                } catch (Throwable th3) {
                                    objM107888l = AbstractC34132o.m107888l(th3);
                                }
                                if (!(objM107888l instanceof C23467m)) {
                                    try {
                                        objM107888l = Integer.valueOf(Integer.parseInt((String) objM107888l));
                                    } catch (Throwable th4) {
                                        objM107888l = AbstractC34132o.m107888l(th4);
                                    }
                                }
                                Throwable thM68037a = C23468n.m68037a(objM107888l);
                                if (thM68037a != null) {
                                    objM107888l = AbstractC33745d.m106662u("expected (integer: `com.amazonaws.sts#nonNegativeIntegerType`)", thM68037a);
                                }
                                AbstractC34132o.m107864I(objM107888l);
                                c29662f.f121232z = (Integer) objM107888l;
                                break;
                            }
                            break;
                        case 1793703449:
                            if (strM8014q.equals("SourceIdentity")) {
                                try {
                                    objM107888l2 = AbstractC35903f.m114017l(c2817bM8017t);
                                } catch (Throwable th5) {
                                    objM107888l2 = AbstractC34132o.m107888l(th5);
                                }
                                Throwable thM68037a2 = C23468n.m68037a(objM107888l2);
                                if (thM68037a2 != null) {
                                    objM107888l2 = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#sourceIdentityType`)", thM68037a2);
                                }
                                AbstractC34132o.m107864I(objM107888l2);
                                c29662f.f121228E = (String) objM107888l2;
                                break;
                            }
                            break;
                        case 1956825820:
                            if (strM8014q.equals("Credentials")) {
                                c29662f.f121231y = AbstractC32131l.m100075i(c2817bM8017t);
                            }
                            break;
                    }
                    c2817bM8017t.m8009j();
                }
            }
        }
        return new C34781b(c29662f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:88:0x018f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j */
    private final Object m32255j(C12002a context, C31341l call, byte[] bArr) {
        Object objM107888l;
        Object objM107888l2;
        Object objM107888l3;
        Object objM107888l4;
        Object objM107888l5;
        AwsServiceException stsException;
        Object objM107888l6;
        Object objM107888l7;
        Object objM107888l8;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        C37236a c37236a = call.f128964x;
        if (AbstractC3269g.m9483L(c37236a.f159235a)) {
            C25126d c25126d = new C25126d(9);
            if (bArr != null) {
                C2817b c2817bM100067v = AbstractC32128i.m100067v(AbstractC35903f.m114005Z(bArr), "AssumeRoleWithWebIdentity");
                while (true) {
                    C2817b c2817bM8017t = c2817bM100067v.m8017t();
                    if (c2817bM8017t != null) {
                        String strM8014q = c2817bM8017t.m8014q();
                        switch (strM8014q.hashCode()) {
                            case -1787805543:
                                if (strM8014q.equals("AssumedRoleUser")) {
                                    c25126d.f98484x = AbstractC32126g.m100042g(c2817bM8017t);
                                }
                                break;
                            case -1686485237:
                                if (strM8014q.equals("PackedPolicySize")) {
                                    try {
                                        objM107888l = AbstractC35903f.m114017l(c2817bM8017t);
                                    } catch (Throwable th3) {
                                        objM107888l = AbstractC34132o.m107888l(th3);
                                    }
                                    if (!(objM107888l instanceof C23467m)) {
                                        try {
                                            objM107888l = Integer.valueOf(Integer.parseInt((String) objM107888l));
                                        } catch (Throwable th4) {
                                            objM107888l = AbstractC34132o.m107888l(th4);
                                        }
                                    }
                                    Throwable thM68037a = C23468n.m68037a(objM107888l);
                                    if (thM68037a != null) {
                                        objM107888l = AbstractC33745d.m106662u("expected (integer: `com.amazonaws.sts#nonNegativeIntegerType`)", thM68037a);
                                    }
                                    AbstractC34132o.m107864I(objM107888l);
                                    c25126d.f98479E = (Integer) objM107888l;
                                    break;
                                }
                                break;
                            case -996247587:
                                if (strM8014q.equals("SubjectFromWebIdentityToken")) {
                                    try {
                                        objM107888l2 = AbstractC35903f.m114017l(c2817bM8017t);
                                    } catch (Throwable th5) {
                                        objM107888l2 = AbstractC34132o.m107888l(th5);
                                    }
                                    Throwable thM68037a2 = C23468n.m68037a(objM107888l2);
                                    if (thM68037a2 != null) {
                                        objM107888l2 = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#webIdentitySubjectType`)", thM68037a2);
                                    }
                                    AbstractC34132o.m107864I(objM107888l2);
                                    c25126d.f98482H = (String) objM107888l2;
                                    break;
                                }
                                break;
                            case -922850799:
                                if (strM8014q.equals("Provider")) {
                                    try {
                                        objM107888l3 = AbstractC35903f.m114017l(c2817bM8017t);
                                    } catch (Throwable th6) {
                                        objM107888l3 = AbstractC34132o.m107888l(th6);
                                    }
                                    Throwable thM68037a3 = C23468n.m68037a(objM107888l3);
                                    if (thM68037a3 != null) {
                                        objM107888l3 = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#Issuer`)", thM68037a3);
                                    }
                                    AbstractC34132o.m107864I(objM107888l3);
                                    c25126d.f98480F = (String) objM107888l3;
                                    break;
                                }
                                break;
                            case 1040272932:
                                if (strM8014q.equals("Audience")) {
                                    try {
                                        objM107888l4 = AbstractC35903f.m114017l(c2817bM8017t);
                                    } catch (Throwable th7) {
                                        objM107888l4 = AbstractC34132o.m107888l(th7);
                                    }
                                    Throwable thM68037a4 = C23468n.m68037a(objM107888l4);
                                    if (thM68037a4 != null) {
                                        objM107888l4 = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#Audience`)", thM68037a4);
                                    }
                                    AbstractC34132o.m107864I(objM107888l4);
                                    c25126d.f98485y = (String) objM107888l4;
                                    break;
                                }
                                break;
                            case 1793703449:
                                if (strM8014q.equals("SourceIdentity")) {
                                    try {
                                        objM107888l5 = AbstractC35903f.m114017l(c2817bM8017t);
                                    } catch (Throwable th8) {
                                        objM107888l5 = AbstractC34132o.m107888l(th8);
                                    }
                                    Throwable thM68037a5 = C23468n.m68037a(objM107888l5);
                                    if (thM68037a5 != null) {
                                        objM107888l5 = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#sourceIdentityType`)", thM68037a5);
                                    }
                                    AbstractC34132o.m107864I(objM107888l5);
                                    c25126d.f98481G = (String) objM107888l5;
                                    break;
                                }
                                break;
                            case 1956825820:
                                if (strM8014q.equals("Credentials")) {
                                    c25126d.f98486z = AbstractC32131l.m100075i(c2817bM8017t);
                                }
                                break;
                        }
                        c2817bM8017t.m8009j();
                    }
                }
            }
            return new C34783d(c25126d);
        }
        C37236a c37236aM100714v = AbstractC32350a.m100714v(c37236a, bArr);
        C31341l call2 = C31341l.m96420b(call, c37236aM100714v);
        try {
            if (bArr == null) {
                throw new IllegalStateException("unable to parse error from empty response");
            }
            C39476c c39476cM113987E = AbstractC35903f.m113987E(bArr);
            String str = c39476cM113987E.f169859a;
            if (str != null) {
                switch (str) {
                    case "IDPCommunicationError":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        String str2 = null;
                        if (bArr != null) {
                            C2817b c2817bM100103j = AbstractC32145e0.m100103j(AbstractC35903f.m114005Z(bArr));
                            while (true) {
                                C2817b c2817bM8017t2 = c2817bM100103j.m8017t();
                                if (c2817bM8017t2 != null) {
                                    if (AbstractC22676k.m65745e(c2817bM8017t2.m8014q(), "message")) {
                                        try {
                                            objM107888l6 = AbstractC35903f.m114017l(c2817bM8017t2);
                                        } catch (Throwable th9) {
                                            objM107888l6 = AbstractC34132o.m107888l(th9);
                                        }
                                        Throwable thM68037a6 = C23468n.m68037a(objM107888l6);
                                        if (thM68037a6 != null) {
                                            objM107888l6 = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#idpCommunicationErrorMessage`)", thM68037a6);
                                        }
                                        AbstractC34132o.m107864I(objM107888l6);
                                        str2 = (String) objM107888l6;
                                        break;
                                    }
                                    c2817bM8017t2.m8009j();
                                }
                            }
                        }
                        stsException = new IdpCommunicationErrorException(str2);
                        stsException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
                        break;
                    case "PackedPolicyTooLarge":
                        stsException = AbstractC32412c.m101117d(context, call2, bArr);
                        break;
                    case "ExpiredTokenException":
                        stsException = AbstractC32412c.m101115b(context, call2, bArr);
                        break;
                    case "RegionDisabledException":
                        stsException = AbstractC32412c.m101118e(context, call2, bArr);
                        break;
                    case "MalformedPolicyDocument":
                        stsException = AbstractC32412c.m101116c(context, call2, bArr);
                        break;
                    case "InvalidIdentityToken":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        String str3 = null;
                        if (bArr != null) {
                            C2817b c2817bM100103j2 = AbstractC32145e0.m100103j(AbstractC35903f.m114005Z(bArr));
                            while (true) {
                                C2817b c2817bM8017t3 = c2817bM100103j2.m8017t();
                                if (c2817bM8017t3 != null) {
                                    if (AbstractC22676k.m65745e(c2817bM8017t3.m8014q(), "message")) {
                                        try {
                                            objM107888l7 = AbstractC35903f.m114017l(c2817bM8017t3);
                                        } catch (Throwable th10) {
                                            objM107888l7 = AbstractC34132o.m107888l(th10);
                                        }
                                        Throwable thM68037a7 = C23468n.m68037a(objM107888l7);
                                        if (thM68037a7 != null) {
                                            objM107888l7 = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#invalidIdentityTokenMessage`)", thM68037a7);
                                        }
                                        AbstractC34132o.m107864I(objM107888l7);
                                        str3 = (String) objM107888l7;
                                        break;
                                    }
                                    c2817bM8017t3.m8009j();
                                }
                            }
                        }
                        stsException = new InvalidIdentityTokenException(str3);
                        stsException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
                        break;
                    case "IDPRejectedClaim":
                        AbstractC22676k.m65750j(context, "context");
                        AbstractC22676k.m65750j(call2, "call");
                        String str4 = null;
                        if (bArr != null) {
                            C2817b c2817bM100103j3 = AbstractC32145e0.m100103j(AbstractC35903f.m114005Z(bArr));
                            while (true) {
                                C2817b c2817bM8017t4 = c2817bM100103j3.m8017t();
                                if (c2817bM8017t4 != null) {
                                    if (AbstractC22676k.m65745e(c2817bM8017t4.m8014q(), "message")) {
                                        try {
                                            objM107888l8 = AbstractC35903f.m114017l(c2817bM8017t4);
                                        } catch (Throwable th11) {
                                            objM107888l8 = AbstractC34132o.m107888l(th11);
                                        }
                                        Throwable thM68037a8 = C23468n.m68037a(objM107888l8);
                                        if (thM68037a8 != null) {
                                            objM107888l8 = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#idpRejectedClaimMessage`)", thM68037a8);
                                        }
                                        AbstractC34132o.m107864I(objM107888l8);
                                        str4 = (String) objM107888l8;
                                        break;
                                    }
                                    c2817bM8017t4.m8009j();
                                }
                            }
                        }
                        stsException = new IdpRejectedClaimException(str4);
                        stsException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
                        break;
                    default:
                        stsException = new StsException(c39476cM113987E.f169860b);
                        break;
                }
            } else {
                stsException = new StsException(c39476cM113987E.f169860b);
            }
            AbstractC32309k.m100578h(stsException, c37236aM100714v, c39476cM113987E);
            throw stsException;
        } catch (Exception e5) {
            StsException stsException2 = new StsException(e5, "Failed to parse response as 'awsQuery' error");
            AbstractC32309k.m100578h(stsException2, call2.f128964x, null);
            throw stsException2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x024e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0069  */
    /* JADX WARN: Code duplicated, block: B:17:0x0088  */
    /* JADX WARN: Code duplicated, block: B:194:0x039c  */
    /* JADX WARN: Code duplicated, block: B:270:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:349:0x069c  */
    /* JADX WARN: Code duplicated, block: B:508:0x0a6e  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0088, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // p522uf.InterfaceC34879h
    /* JADX INFO: renamed from: a */
    public final Object mo9053a(C12002a context, C31341l call, byte[] bArr) {
        C17248i c17248i;
        InterfaceC17242c interfaceC17242c;
        AwsServiceException signinException;
        AwsServiceException ssoException;
        String strMo45166o;
        String strMo45166o2;
        String strMo45166o3;
        String strMo45166o4;
        AwsServiceException cognitoIdentityProviderException;
        AwsServiceException cognitoIdentityProviderException2;
        AwsServiceException cognitoIdentityProviderException3;
        String strMo45166o5;
        String strMo45166o6;
        C37118t c37118t;
        String str;
        ?? r10 = 0;
        switch (this.f39044a) {
            case 0:
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(call, "call");
                C37236a c37236a = call.f128964x;
                if (AbstractC3269g.m9483L(c37236a.f159235a)) {
                    C31624i c31624i = new C31624i(13);
                    if (bArr != null) {
                        C21649b c21649b = new C21649b(bArr);
                        C2570m c2570m = new C2570m(2);
                        C17248i c17248i2 = new C17248i(C17251l.f66279j, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("accessToken")}), 0);
                        C17248i c17248i3 = new C17248i(C17251l.f66274e, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("expiresIn")}), 0);
                        C17251l c17251l = C17251l.f66278i;
                        C17248i c17248i4 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("idToken")}), 0);
                        C17248i c17248i5 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("refreshToken")}), 0);
                        C17248i c17248i6 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("tokenType")}), 0);
                        C38445a c38445a = new C38445a(13);
                        c38445a.m123180p(c17248i2);
                        c38445a.m123180p(c17248i3);
                        c38445a.m123180p(c17248i4);
                        c38445a.m123180p(c17248i5);
                        c38445a.m123180p(c17248i6);
                        InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(c38445a, c21649b);
                        while (true) {
                            Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                            int i13 = c17248i2.f66267b;
                            if (numMo45167q != null && numMo45167q.intValue() == i13) {
                                C4421a c4421a = new C4421a((int) r10);
                                ?? r17 = r10;
                                InterfaceC17243d[] interfaceC17243dArr = new InterfaceC17243d[1];
                                interfaceC17243dArr[r17 == true ? 1 : 0] = new C21652e("accessKeyId");
                                C17248i c17248i7 = new C17248i(c17251l, AbstractC25260n.m74059b1(interfaceC17243dArr), r17 == true ? 1 : 0);
                                c17248i = c17248i2;
                                InterfaceC17243d[] interfaceC17243dArr2 = new InterfaceC17243d[1];
                                interfaceC17243dArr2[r17 == true ? 1 : 0] = new C21652e("secretAccessKey");
                                C17248i c17248i8 = new C17248i(c17251l, AbstractC25260n.m74059b1(interfaceC17243dArr2), r17 == true ? 1 : 0);
                                interfaceC17242c = interfaceC17242cM30855g;
                                InterfaceC17243d[] interfaceC17243dArr3 = new InterfaceC17243d[1];
                                interfaceC17243dArr3[r17 == true ? 1 : 0] = new C21652e("sessionToken");
                                C17248i c17248i9 = new C17248i(c17251l, AbstractC25260n.m74059b1(interfaceC17243dArr3), r17 == true ? 1 : 0);
                                C38445a c38445a2 = new C38445a(13);
                                c38445a2.m123180p(c17248i7);
                                c38445a2.m123180p(c17248i8);
                                c38445a2.m123180p(c17248i9);
                                InterfaceC17242c interfaceC17242cM30855g2 = AbstractC11478a.m30855g(c38445a2, c21649b);
                                while (true) {
                                    Integer numMo45167q2 = interfaceC17242cM30855g2.mo45167q();
                                    int i14 = c17248i7.f66267b;
                                    if (numMo45167q2 != null && numMo45167q2.intValue() == i14) {
                                        c4421a.f17885b = interfaceC17242cM30855g2.mo45166o();
                                    } else {
                                        int i15 = c17248i8.f66267b;
                                        if (numMo45167q2 != null && numMo45167q2.intValue() == i15) {
                                            c4421a.f17886c = interfaceC17242cM30855g2.mo45166o();
                                        } else {
                                            int i16 = c17248i9.f66267b;
                                            if (numMo45167q2 != null && numMo45167q2.intValue() == i16) {
                                                c4421a.f17887d = interfaceC17242cM30855g2.mo45166o();
                                            } else if (numMo45167q2 != null) {
                                                interfaceC17242cM30855g2.skipValue();
                                            } else {
                                                if (c4421a.f17885b == null) {
                                                    c4421a.f17885b = "";
                                                }
                                                if (c4421a.f17886c == null) {
                                                    c4421a.f17886c = "";
                                                }
                                                if (c4421a.f17887d == null) {
                                                    c4421a.f17887d = "";
                                                }
                                                c2570m.f9987x = new C4422b(c4421a);
                                            }
                                        }
                                    }
                                }
                            } else {
                                c17248i = c17248i2;
                                interfaceC17242c = interfaceC17242cM30855g;
                                int i17 = c17248i3.f66267b;
                                if (numMo45167q != null && numMo45167q.intValue() == i17) {
                                    c2570m.f9988y = Integer.valueOf(interfaceC17242c.mo45164h());
                                } else {
                                    int i18 = c17248i4.f66267b;
                                    if (numMo45167q != null && numMo45167q.intValue() == i18) {
                                        c2570m.f9989z = interfaceC17242c.mo45166o();
                                    } else {
                                        int i19 = c17248i5.f66267b;
                                        if (numMo45167q != null && numMo45167q.intValue() == i19) {
                                            c2570m.f9984E = interfaceC17242c.mo45166o();
                                        } else {
                                            int i24 = c17248i6.f66267b;
                                            if (numMo45167q != null && numMo45167q.intValue() == i24) {
                                                c2570m.f9985F = interfaceC17242c.mo45166o();
                                            } else if (numMo45167q != null) {
                                                interfaceC17242c.skipValue();
                                            } else {
                                                if (((Integer) c2570m.f9988y) == null) {
                                                    c2570m.f9988y = 0;
                                                }
                                                if (((String) c2570m.f9984E) == null) {
                                                    c2570m.f9984E = "";
                                                }
                                                if (((String) c2570m.f9985F) == null) {
                                                    c2570m.f9985F = "";
                                                }
                                                c31624i.f130665x = new C4426f(c2570m);
                                            }
                                        }
                                    }
                                }
                            }
                            c17248i2 = c17248i;
                            interfaceC17242cM30855g = interfaceC17242c;
                            r10 = 0;
                        }
                    }
                    return new C4425e(c31624i);
                }
                C37236a c37236aM100714v = AbstractC32350a.m100714v(c37236a, bArr);
                C31341l call2 = C31341l.m96420b(call, c37236aM100714v);
                try {
                    C17248i c17248i10 = AbstractC40581a.f174777a;
                    C39476c c39476cM131580a = AbstractC40581a.m131580a(c37236a.f159236b, bArr);
                    String str2 = c39476cM131580a.f169859a;
                    if (str2 != null) {
                        switch (str2) {
                            case "AccessDeniedException":
                                AbstractC22676k.m65750j(context, "context");
                                AbstractC22676k.m65750j(call2, "call");
                                C38445a c38445a3 = new C38445a(5, (boolean) r10);
                                if (bArr != null) {
                                    C21649b c21649b2 = new C21649b(bArr);
                                    C17248i c17248i11 = new C17248i(C17251l.f66273d, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                                    C17248i c17248i12 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                                    InterfaceC17242c interfaceC17242cM30855g3 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i11, c17248i12), c21649b2);
                                    while (true) {
                                        Integer numMo45167q3 = interfaceC17242cM30855g3.mo45167q();
                                        int i25 = c17248i11.f66267b;
                                        if (numMo45167q3 != null && numMo45167q3.intValue() == i25) {
                                            String strMo45166o7 = interfaceC17242cM30855g3.mo45166o();
                                            int i26 = AbstractC4434n.f17908a;
                                            c38445a3.f164636x = AbstractC36259c.m115671H(strMo45166o7);
                                        } else {
                                            int i27 = c17248i12.f66267b;
                                            if (numMo45167q3 != null && numMo45167q3.intValue() == i27) {
                                                c38445a3.f164637y = interfaceC17242cM30855g3.mo45166o();
                                            } else if (numMo45167q3 != null) {
                                                interfaceC17242cM30855g3.skipValue();
                                            }
                                        }
                                    }
                                }
                                if (((AbstractC4434n) c38445a3.f164636x) == null) {
                                    c38445a3.f164636x = new C4430j("no value provided");
                                }
                                if (((String) c38445a3.f164637y) == null) {
                                    c38445a3.f164637y = "";
                                }
                                signinException = new aws.sdk.kotlin.runtime.auth.credentials.internal.signin.model.AccessDeniedException(c38445a3);
                                break;
                            case "InternalServerException":
                                AbstractC22676k.m65750j(context, "context");
                                AbstractC22676k.m65750j(call2, "call");
                                C11457j c11457j = new C11457j(7, (boolean) r10);
                                if (bArr != null) {
                                    C21649b c21649b3 = new C21649b(bArr);
                                    C17248i c17248i13 = new C17248i(C17251l.f66273d, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                                    C17248i c17248i14 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                                    InterfaceC17242c interfaceC17242cM30855g4 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i13, c17248i14), c21649b3);
                                    while (true) {
                                        Integer numMo45167q4 = interfaceC17242cM30855g4.mo45167q();
                                        int i28 = c17248i13.f66267b;
                                        if (numMo45167q4 != null && numMo45167q4.intValue() == i28) {
                                            String strMo45166o8 = interfaceC17242cM30855g4.mo45166o();
                                            int i29 = AbstractC4434n.f17908a;
                                            c11457j.f36753x = AbstractC36259c.m115671H(strMo45166o8);
                                        } else {
                                            int i34 = c17248i14.f66267b;
                                            if (numMo45167q4 != null && numMo45167q4.intValue() == i34) {
                                                c11457j.f36754y = interfaceC17242cM30855g4.mo45166o();
                                            } else if (numMo45167q4 != null) {
                                                interfaceC17242cM30855g4.skipValue();
                                            }
                                        }
                                    }
                                }
                                if (((AbstractC4434n) c11457j.f36753x) == null) {
                                    c11457j.f36753x = new C4430j("no value provided");
                                }
                                if (((String) c11457j.f36754y) == null) {
                                    c11457j.f36754y = "";
                                }
                                signinException = new aws.sdk.kotlin.runtime.auth.credentials.internal.signin.model.InternalServerException(c11457j);
                                break;
                            case "TooManyRequestsError":
                                AbstractC22676k.m65750j(context, "context");
                                AbstractC22676k.m65750j(call2, "call");
                                C20378c c20378c = new C20378c(7, 0 == true ? (char) 1 : (char) 0);
                                if (bArr != null) {
                                    C21649b c21649b4 = new C21649b(bArr);
                                    C17248i c17248i15 = new C17248i(C17251l.f66273d, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                                    C17248i c17248i16 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                                    InterfaceC17242c interfaceC17242cM30855g5 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i15, c17248i16), c21649b4);
                                    while (true) {
                                        Integer numMo45167q5 = interfaceC17242cM30855g5.mo45167q();
                                        int i35 = c17248i15.f66267b;
                                        if (numMo45167q5 != null && numMo45167q5.intValue() == i35) {
                                            String strMo45166o9 = interfaceC17242cM30855g5.mo45166o();
                                            int i36 = AbstractC4434n.f17908a;
                                            c20378c.f76422x = AbstractC36259c.m115671H(strMo45166o9);
                                        } else {
                                            int i37 = c17248i16.f66267b;
                                            if (numMo45167q5 != null && numMo45167q5.intValue() == i37) {
                                                c20378c.f76423y = interfaceC17242cM30855g5.mo45166o();
                                            } else if (numMo45167q5 != null) {
                                                interfaceC17242cM30855g5.skipValue();
                                            }
                                        }
                                    }
                                }
                                if (((AbstractC4434n) c20378c.f76422x) == null) {
                                    c20378c.f76422x = new C4430j("no value provided");
                                }
                                if (((String) c20378c.f76423y) == null) {
                                    c20378c.f76423y = "";
                                }
                                signinException = new TooManyRequestsError(c20378c);
                                break;
                            case "ValidationException":
                                AbstractC22676k.m65750j(context, "context");
                                AbstractC22676k.m65750j(call2, "call");
                                C30352d c30352d = new C30352d(6, 0 == true ? (char) 1 : (char) 0);
                                if (bArr != null) {
                                    C21649b c21649b5 = new C21649b(bArr);
                                    C17248i c17248i17 = new C17248i(C17251l.f66273d, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("error")}), 0);
                                    C17248i c17248i18 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                                    InterfaceC17242c interfaceC17242cM30855g6 = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i17, c17248i18), c21649b5);
                                    while (true) {
                                        Integer numMo45167q6 = interfaceC17242cM30855g6.mo45167q();
                                        int i38 = c17248i17.f66267b;
                                        if (numMo45167q6 != null && numMo45167q6.intValue() == i38) {
                                            String strMo45166o10 = interfaceC17242cM30855g6.mo45166o();
                                            int i39 = AbstractC4434n.f17908a;
                                            c30352d.f124535x = AbstractC36259c.m115671H(strMo45166o10);
                                        } else {
                                            int i44 = c17248i18.f66267b;
                                            if (numMo45167q6 != null && numMo45167q6.intValue() == i44) {
                                                c30352d.f124536y = interfaceC17242cM30855g6.mo45166o();
                                            } else if (numMo45167q6 != null) {
                                                interfaceC17242cM30855g6.skipValue();
                                            }
                                        }
                                    }
                                }
                                if (((AbstractC4434n) c30352d.f124535x) == null) {
                                    c30352d.f124535x = new C4430j("no value provided");
                                }
                                if (((String) c30352d.f124536y) == null) {
                                    c30352d.f124536y = "";
                                }
                                signinException = new ValidationException(c30352d);
                                break;
                            default:
                                signinException = new SigninException(c39476cM131580a.f169860b);
                                break;
                        }
                    } else {
                        signinException = new SigninException(c39476cM131580a.f169860b);
                    }
                    AbstractC32309k.m100578h(signinException, c37236aM100714v, c39476cM131580a);
                    throw signinException;
                } catch (Exception e5) {
                    SigninException signinException2 = new SigninException(e5, "Failed to parse response as 'restJson1' error");
                    AbstractC32309k.m100578h(signinException2, call2.f128964x, null);
                    throw signinException2;
                }
            case 1:
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(call, "call");
                C37236a c37236a2 = call.f128964x;
                if (AbstractC3269g.m9483L(c37236a2.f159235a)) {
                    C17417d c17417d = new C17417d(8);
                    if (bArr != null) {
                        C21649b c21649b6 = new C21649b(bArr);
                        C17248i c17248i19 = new C17248i(C17251l.f66279j, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("roleCredentials")}), 0);
                        InterfaceC17242c interfaceC17242cM30855g7 = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i19), c21649b6);
                        while (true) {
                            Integer numMo45167q7 = interfaceC17242cM30855g7.mo45167q();
                            int i45 = c17248i19.f66267b;
                            if (numMo45167q7 != null && numMo45167q7.intValue() == i45) {
                                C15774o c15774o = new C15774o();
                                C17251l c17251l2 = C17251l.f66278i;
                                C17248i c17248i20 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("accessKeyId")}), 0);
                                C17248i c17248i21 = new C17248i(C17251l.f66276g, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("expiration")}), 0);
                                C17248i c17248i22 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("secretAccessKey")}), 0);
                                C17248i c17248i23 = new C17248i(c17251l2, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("sessionToken")}), 0);
                                C38445a c38445a4 = new C38445a(13);
                                c38445a4.m123180p(c17248i20);
                                c38445a4.m123180p(c17248i21);
                                c38445a4.m123180p(c17248i22);
                                c38445a4.m123180p(c17248i23);
                                InterfaceC17242c interfaceC17242cM30855g8 = AbstractC11478a.m30855g(c38445a4, c21649b6);
                                while (true) {
                                    Integer numMo45167q8 = interfaceC17242cM30855g8.mo45167q();
                                    int i46 = c17248i20.f66267b;
                                    if (numMo45167q8 != null && numMo45167q8.intValue() == i46) {
                                        c15774o.f59444b = interfaceC17242cM30855g8.mo45166o();
                                    } else {
                                        int i47 = c17248i21.f66267b;
                                        if (numMo45167q8 != null && numMo45167q8.intValue() == i47) {
                                            c15774o.f59443a = interfaceC17242cM30855g8.mo45170v();
                                        } else {
                                            int i48 = c17248i22.f66267b;
                                            if (numMo45167q8 != null && numMo45167q8.intValue() == i48) {
                                                c15774o.f59445c = interfaceC17242cM30855g8.mo45166o();
                                            } else {
                                                int i49 = c17248i23.f66267b;
                                                if (numMo45167q8 != null && numMo45167q8.intValue() == i49) {
                                                    c15774o.f59446d = interfaceC17242cM30855g8.mo45166o();
                                                } else if (numMo45167q8 != null) {
                                                    interfaceC17242cM30855g8.skipValue();
                                                } else {
                                                    c17417d.f67507x = new C18406c(c15774o);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (numMo45167q7 != null) {
                                interfaceC17242cM30855g7.skipValue();
                            }
                        }
                    }
                    return new C18405b(c17417d);
                }
                C37236a c37236aM100714v2 = AbstractC32350a.m100714v(c37236a2, bArr);
                C31341l call3 = C31341l.m96420b(call, c37236aM100714v2);
                try {
                    C17248i c17248i24 = AbstractC40581a.f174777a;
                    C39476c c39476cM131580a2 = AbstractC40581a.m131580a(c37236a2.f159236b, bArr);
                    String str3 = c39476cM131580a2.f169859a;
                    if (str3 != null) {
                        switch (str3) {
                            case "UnauthorizedException":
                                AbstractC22676k.m65750j(context, "context");
                                AbstractC22676k.m65750j(call3, "call");
                                if (bArr != null) {
                                    C21649b c21649b7 = new C21649b(bArr);
                                    C17248i c17248i25 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                                    InterfaceC17242c interfaceC17242cM30855g9 = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i25), c21649b7);
                                    strMo45166o = null;
                                    while (true) {
                                        Integer numMo45167q9 = interfaceC17242cM30855g9.mo45167q();
                                        int i54 = c17248i25.f66267b;
                                        if (numMo45167q9 != null && numMo45167q9.intValue() == i54) {
                                            strMo45166o = interfaceC17242cM30855g9.mo45166o();
                                        } else if (numMo45167q9 != null) {
                                            interfaceC17242cM30855g9.skipValue();
                                        }
                                    }
                                } else {
                                    strMo45166o = null;
                                }
                                ssoException = new UnauthorizedException(strMo45166o);
                                ssoException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
                                break;
                            case "InvalidRequestException":
                                AbstractC22676k.m65750j(context, "context");
                                AbstractC22676k.m65750j(call3, "call");
                                if (bArr != null) {
                                    C21649b c21649b8 = new C21649b(bArr);
                                    C17248i c17248i26 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                                    InterfaceC17242c interfaceC17242cM30855g10 = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i26), c21649b8);
                                    strMo45166o2 = null;
                                    while (true) {
                                        Integer numMo45167q10 = interfaceC17242cM30855g10.mo45167q();
                                        int i55 = c17248i26.f66267b;
                                        if (numMo45167q10 != null && numMo45167q10.intValue() == i55) {
                                            strMo45166o2 = interfaceC17242cM30855g10.mo45166o();
                                        } else if (numMo45167q10 != null) {
                                            interfaceC17242cM30855g10.skipValue();
                                        }
                                    }
                                } else {
                                    strMo45166o2 = null;
                                }
                                ssoException = new aws.sdk.kotlin.runtime.auth.credentials.internal.sso.model.InvalidRequestException(strMo45166o2);
                                ssoException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
                                break;
                            case "TooManyRequestsException":
                                AbstractC22676k.m65750j(context, "context");
                                AbstractC22676k.m65750j(call3, "call");
                                if (bArr != null) {
                                    C21649b c21649b9 = new C21649b(bArr);
                                    C17248i c17248i27 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                                    InterfaceC17242c interfaceC17242cM30855g11 = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i27), c21649b9);
                                    strMo45166o3 = null;
                                    while (true) {
                                        Integer numMo45167q11 = interfaceC17242cM30855g11.mo45167q();
                                        int i56 = c17248i27.f66267b;
                                        if (numMo45167q11 != null && numMo45167q11.intValue() == i56) {
                                            strMo45166o3 = interfaceC17242cM30855g11.mo45166o();
                                        } else if (numMo45167q11 != null) {
                                            interfaceC17242cM30855g11.skipValue();
                                        }
                                    }
                                } else {
                                    strMo45166o3 = null;
                                }
                                ssoException = new TooManyRequestsException(strMo45166o3);
                                ssoException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
                                break;
                            case "ResourceNotFoundException":
                                AbstractC22676k.m65750j(context, "context");
                                AbstractC22676k.m65750j(call3, "call");
                                if (bArr != null) {
                                    C21649b c21649b10 = new C21649b(bArr);
                                    C17248i c17248i28 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                                    InterfaceC17242c interfaceC17242cM30855g12 = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i28), c21649b10);
                                    strMo45166o4 = null;
                                    while (true) {
                                        Integer numMo45167q12 = interfaceC17242cM30855g12.mo45167q();
                                        int i57 = c17248i28.f66267b;
                                        if (numMo45167q12 != null && numMo45167q12.intValue() == i57) {
                                            strMo45166o4 = interfaceC17242cM30855g12.mo45166o();
                                        } else if (numMo45167q12 != null) {
                                            interfaceC17242cM30855g12.skipValue();
                                        }
                                    }
                                } else {
                                    strMo45166o4 = null;
                                }
                                ssoException = new ResourceNotFoundException(strMo45166o4);
                                ssoException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
                                break;
                            default:
                                ssoException = new SsoException(c39476cM131580a2.f169860b);
                                break;
                        }
                    } else {
                        ssoException = new SsoException(c39476cM131580a2.f169860b);
                    }
                    AbstractC32309k.m100578h(ssoException, c37236aM100714v2, c39476cM131580a2);
                    throw ssoException;
                } catch (Exception e13) {
                    SsoException ssoException2 = new SsoException(e13, "Failed to parse response as 'restJson1' error");
                    AbstractC32309k.m100578h(ssoException2, call3.f128964x, null);
                    throw ssoException2;
                }
            case 2:
                return m32247b(context, call, bArr);
            case 3:
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(call, "call");
                C37236a c37236a3 = call.f128964x;
                if (AbstractC3269g.m9483L(c37236a3.f159235a)) {
                    return new C31257b0();
                }
                C37236a c37236aM100714v3 = AbstractC32350a.m100714v(c37236a3, bArr);
                C31341l c31341lM96420b = C31341l.m96420b(call, c37236aM100714v3);
                try {
                    C17248i c17248i29 = AbstractC40581a.f174777a;
                    C39476c c39476cM131580a3 = AbstractC40581a.m131580a(c37236a3.f159236b, bArr);
                    String str4 = c39476cM131580a3.f169859a;
                    if (str4 != null) {
                        switch (str4) {
                            case "LimitExceededException":
                                cognitoIdentityProviderException = AbstractC32412c.m101121h(context, c31341lM96420b, bArr);
                                break;
                            case "InvalidPasswordException":
                                cognitoIdentityProviderException = AbstractC11941a.m32245k(context, c31341lM96420b, bArr);
                                break;
                            case "NotAuthorizedException":
                                cognitoIdentityProviderException = AbstractC32412c.m101122i(context, c31341lM96420b, bArr);
                                break;
                            case "PasswordHistoryPolicyViolationException":
                                cognitoIdentityProviderException = AbstractC32412c.m101123j(context, c31341lM96420b, bArr);
                                break;
                            case "ForbiddenException":
                                cognitoIdentityProviderException = AbstractC11941a.m32240f(context, c31341lM96420b, bArr);
                                break;
                            case "UserNotFoundException":
                                cognitoIdentityProviderException = AbstractC32412c.m101131r(context, c31341lM96420b, bArr);
                                break;
                            case "UserNotConfirmedException":
                                cognitoIdentityProviderException = AbstractC32412c.m101130q(context, c31341lM96420b, bArr);
                                break;
                            case "InternalErrorException":
                                cognitoIdentityProviderException = AbstractC11941a.m32241g(context, c31341lM96420b, bArr);
                                break;
                            case "TooManyRequestsException":
                                cognitoIdentityProviderException = AbstractC32412c.m101126m(context, c31341lM96420b, bArr);
                                break;
                            case "InvalidParameterException":
                                cognitoIdentityProviderException = AbstractC11941a.m32244j(context, c31341lM96420b, bArr);
                                break;
                            case "ResourceNotFoundException":
                                cognitoIdentityProviderException = AbstractC32412c.m101125l(context, c31341lM96420b, bArr);
                                break;
                            case "PasswordResetRequiredException":
                                cognitoIdentityProviderException = AbstractC32412c.m101124k(context, c31341lM96420b, bArr);
                                break;
                            default:
                                cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a3.f169860b);
                                break;
                        }
                    } else {
                        cognitoIdentityProviderException = new CognitoIdentityProviderException(c39476cM131580a3.f169860b);
                    }
                    AbstractC32309k.m100578h(cognitoIdentityProviderException, c37236aM100714v3, c39476cM131580a3);
                    throw cognitoIdentityProviderException;
                } catch (Exception e14) {
                    CognitoIdentityProviderException cognitoIdentityProviderException4 = new CognitoIdentityProviderException(e14, "Failed to parse response as 'awsJson1_1' error");
                    AbstractC32309k.m100578h(cognitoIdentityProviderException4, c31341lM96420b.f128964x, null);
                    throw cognitoIdentityProviderException4;
                }
            case 4:
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(call, "call");
                C37236a c37236a4 = call.f128964x;
                if (AbstractC3269g.m9483L(c37236a4.f159235a)) {
                    C29934u0 c29934u0 = new C29934u0(8);
                    if (bArr != null) {
                        C21649b c21649b11 = new C21649b(bArr);
                        C17248i c17248i30 = new C17248i(C17251l.f66279j, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("CodeDeliveryDetails")}), 0);
                        InterfaceC17242c interfaceC17242cM30855g13 = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i30), c21649b11);
                        while (true) {
                            Integer numMo45167q13 = interfaceC17242cM30855g13.mo45167q();
                            int i58 = c17248i30.f66267b;
                            if (numMo45167q13 != null && numMo45167q13.intValue() == i58) {
                                c29934u0.f122249x = AbstractC31780b.m98687h(c21649b11);
                            } else if (numMo45167q13 != null) {
                                interfaceC17242cM30855g13.skipValue();
                            }
                        }
                    }
                    return new C31280k0(c29934u0);
                }
                C37236a c37236aM100714v4 = AbstractC32350a.m100714v(c37236a4, bArr);
                C31341l c31341lM96420b2 = C31341l.m96420b(call, c37236aM100714v4);
                try {
                    C17248i c17248i31 = AbstractC40581a.f174777a;
                    C39476c c39476cM131580a4 = AbstractC40581a.m131580a(c37236a4.f159236b, bArr);
                    String str5 = c39476cM131580a4.f169859a;
                    if (str5 != null) {
                        switch (str5) {
                            case "LimitExceededException":
                                cognitoIdentityProviderException2 = AbstractC32412c.m101121h(context, c31341lM96420b2, bArr);
                                break;
                            case "InvalidEmailRoleAccessPolicyException":
                                cognitoIdentityProviderException2 = AbstractC11941a.m32242h(context, c31341lM96420b2, bArr);
                                break;
                            case "NotAuthorizedException":
                                cognitoIdentityProviderException2 = AbstractC32412c.m101122i(context, c31341lM96420b2, bArr);
                                break;
                            case "InvalidLambdaResponseException":
                                cognitoIdentityProviderException2 = AbstractC11941a.m32243i(context, c31341lM96420b2, bArr);
                                break;
                            case "InvalidSmsRoleAccessPolicyException":
                                cognitoIdentityProviderException2 = AbstractC11941a.m32246l(context, c31341lM96420b2, bArr);
                                break;
                            case "InvalidSmsRoleTrustRelationshipException":
                                cognitoIdentityProviderException2 = AbstractC32412c.m101119f(context, c31341lM96420b2, bArr);
                                break;
                            case "ForbiddenException":
                                cognitoIdentityProviderException2 = AbstractC11941a.m32240f(context, c31341lM96420b2, bArr);
                                break;
                            case "UserNotFoundException":
                                cognitoIdentityProviderException2 = AbstractC32412c.m101131r(context, c31341lM96420b2, bArr);
                                break;
                            case "UserNotConfirmedException":
                                cognitoIdentityProviderException2 = AbstractC32412c.m101130q(context, c31341lM96420b2, bArr);
                                break;
                            case "InternalErrorException":
                                cognitoIdentityProviderException2 = AbstractC11941a.m32241g(context, c31341lM96420b2, bArr);
                                break;
                            case "UserLambdaValidationException":
                                cognitoIdentityProviderException2 = AbstractC32412c.m101129p(context, c31341lM96420b2, bArr);
                                break;
                            case "UnexpectedLambdaException":
                                cognitoIdentityProviderException2 = AbstractC32412c.m101127n(context, c31341lM96420b2, bArr);
                                break;
                            case "TooManyRequestsException":
                                cognitoIdentityProviderException2 = AbstractC32412c.m101126m(context, c31341lM96420b2, bArr);
                                break;
                            case "InvalidParameterException":
                                cognitoIdentityProviderException2 = AbstractC11941a.m32244j(context, c31341lM96420b2, bArr);
                                break;
                            case "ResourceNotFoundException":
                                cognitoIdentityProviderException2 = AbstractC32412c.m101125l(context, c31341lM96420b2, bArr);
                                break;
                            case "PasswordResetRequiredException":
                                cognitoIdentityProviderException2 = AbstractC32412c.m101124k(context, c31341lM96420b2, bArr);
                                break;
                            case "CodeDeliveryFailureException":
                                cognitoIdentityProviderException2 = AbstractC11941a.m32237c(context, c31341lM96420b2, bArr);
                                break;
                            default:
                                cognitoIdentityProviderException2 = new CognitoIdentityProviderException(c39476cM131580a4.f169860b);
                                break;
                        }
                    } else {
                        cognitoIdentityProviderException2 = new CognitoIdentityProviderException(c39476cM131580a4.f169860b);
                    }
                    AbstractC32309k.m100578h(cognitoIdentityProviderException2, c37236aM100714v4, c39476cM131580a4);
                    throw cognitoIdentityProviderException2;
                } catch (Exception e15) {
                    CognitoIdentityProviderException cognitoIdentityProviderException5 = new CognitoIdentityProviderException(e15, "Failed to parse response as 'awsJson1_1' error");
                    AbstractC32309k.m100578h(cognitoIdentityProviderException5, c31341lM96420b2.f128964x, null);
                    throw cognitoIdentityProviderException5;
                }
            case 5:
                return m32248c(context, call, bArr);
            case 6:
                return m32249d(context, call, bArr);
            case 7:
                return m32250e(context, call, bArr);
            case 8:
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(call, "call");
                C37236a c37236a5 = call.f128964x;
                if (AbstractC3269g.m9483L(c37236a5.f159235a)) {
                    return new C31300u0();
                }
                C37236a c37236aM100714v5 = AbstractC32350a.m100714v(c37236a5, bArr);
                C31341l call4 = C31341l.m96420b(call, c37236aM100714v5);
                try {
                    C17248i c17248i32 = AbstractC40581a.f174777a;
                    C39476c c39476cM131580a5 = AbstractC40581a.m131580a(c37236a5.f159236b, bArr);
                    String str6 = c39476cM131580a5.f169859a;
                    if (str6 != null) {
                        switch (str6) {
                            case "UnauthorizedException":
                                AbstractC22676k.m65750j(context, "context");
                                AbstractC22676k.m65750j(call4, "call");
                                if (bArr != null) {
                                    C21649b c21649b12 = new C21649b(bArr);
                                    C17248i c17248i33 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                                    InterfaceC17242c interfaceC17242cM30855g14 = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i33), c21649b12);
                                    strMo45166o5 = null;
                                    while (true) {
                                        Integer numMo45167q14 = interfaceC17242cM30855g14.mo45167q();
                                        int i59 = c17248i33.f66267b;
                                        if (numMo45167q14 != null && numMo45167q14.intValue() == i59) {
                                            strMo45166o5 = interfaceC17242cM30855g14.mo45166o();
                                        } else if (numMo45167q14 != null) {
                                            interfaceC17242cM30855g14.skipValue();
                                        }
                                    }
                                } else {
                                    strMo45166o5 = null;
                                }
                                cognitoIdentityProviderException3 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.UnauthorizedException(strMo45166o5);
                                cognitoIdentityProviderException3.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
                                break;
                            case "UnsupportedTokenTypeException":
                                AbstractC22676k.m65750j(context, "context");
                                AbstractC22676k.m65750j(call4, "call");
                                if (bArr != null) {
                                    C21649b c21649b13 = new C21649b(bArr);
                                    C17248i c17248i34 = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
                                    InterfaceC17242c interfaceC17242cM30855g15 = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i34), c21649b13);
                                    strMo45166o6 = null;
                                    while (true) {
                                        Integer numMo45167q15 = interfaceC17242cM30855g15.mo45167q();
                                        int i64 = c17248i34.f66267b;
                                        if (numMo45167q15 != null && numMo45167q15.intValue() == i64) {
                                            strMo45166o6 = interfaceC17242cM30855g15.mo45166o();
                                        } else if (numMo45167q15 != null) {
                                            interfaceC17242cM30855g15.skipValue();
                                        }
                                    }
                                } else {
                                    strMo45166o6 = null;
                                }
                                cognitoIdentityProviderException3 = new UnsupportedTokenTypeException(strMo45166o6);
                                cognitoIdentityProviderException3.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
                                break;
                            case "ForbiddenException":
                                cognitoIdentityProviderException3 = AbstractC11941a.m32240f(context, call4, bArr);
                                break;
                            case "InternalErrorException":
                                cognitoIdentityProviderException3 = AbstractC11941a.m32241g(context, call4, bArr);
                                break;
                            case "TooManyRequestsException":
                                cognitoIdentityProviderException3 = AbstractC32412c.m101126m(context, call4, bArr);
                                break;
                            case "InvalidParameterException":
                                cognitoIdentityProviderException3 = AbstractC11941a.m32244j(context, call4, bArr);
                                break;
                            case "UnsupportedOperationException":
                                cognitoIdentityProviderException3 = AbstractC32412c.m101128o(context, call4, bArr);
                                break;
                            default:
                                cognitoIdentityProviderException3 = new CognitoIdentityProviderException(c39476cM131580a5.f169860b);
                                break;
                        }
                    } else {
                        cognitoIdentityProviderException3 = new CognitoIdentityProviderException(c39476cM131580a5.f169860b);
                    }
                    AbstractC32309k.m100578h(cognitoIdentityProviderException3, c37236aM100714v5, c39476cM131580a5);
                    throw cognitoIdentityProviderException3;
                } catch (Exception e16) {
                    CognitoIdentityProviderException cognitoIdentityProviderException6 = new CognitoIdentityProviderException(e16, "Failed to parse response as 'awsJson1_1' error");
                    AbstractC32309k.m100578h(cognitoIdentityProviderException6, call4.f128964x, null);
                    throw cognitoIdentityProviderException6;
                }
            case 9:
                return m32251f(context, call, bArr);
            case 10:
                return m32252g(context, call, bArr);
            case 11:
                return m32253h(context, call, bArr);
            case 12:
                return m32254i(context, call, bArr);
            case 13:
                return m32255j(context, call, bArr);
            default:
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(call, "call");
                C37236a c37236a6 = call.f128964x;
                C25500t c25500t = c37236a6.f159235a;
                if (AbstractC3269g.m9483L(c25500t)) {
                    if (bArr == null) {
                        throw new CredentialsProviderException(null, "HTTP credentials response did not contain a payload");
                    }
                    AbstractC31479j abstractC31479jM96491g = AbstractC31375j.m96491g(new C21649b(bArr));
                    if (!(abstractC31479jM96491g instanceof C37120u)) {
                        throw new CredentialsProviderException(null, "HTTP credentials response was not of expected format");
                    }
                    C37120u c37120u = (C37120u) abstractC31479jM96491g;
                    return AbstractC32306h.m100559g(c37120u.f158803c, c37120u.f158804d, c37120u.f158805e, c37120u.f158806f, "EcsContainer", c37120u.f158807g);
                }
                Set set = AbstractC37095j.f158690a;
                if (!AbstractC22676k.m65745e(c37236a6.f159236b.get("Content-Type"), "application/json") || bArr == null) {
                    c37118t = null;
                } else {
                    AbstractC31479j abstractC31479jM96491g2 = AbstractC31375j.m96491g(new C21649b(bArr));
                    if (abstractC31479jM96491g2 instanceof C37118t) {
                        c37118t = (C37118t) abstractC31479jM96491g2;
                    } else {
                        c37118t = null;
                    }
                }
                if (c37118t != null) {
                    str = "code=" + c37118t.f158796c + "; message=" + c37118t.f158797d;
                    if (str == null) {
                        str = "HTTP " + c25500t;
                    }
                } else {
                    str = "HTTP " + c25500t;
                }
                CredentialsProviderException credentialsProviderException = new CredentialsProviderException(null, AbstractC11266d.m30461o("Error retrieving credentials from container service: ", str));
                C33738c c33738c = credentialsProviderException.f8399w;
                c33738c.f141122a.mo33083c(C33738c.f141121d, Boolean.valueOf(c25500t.equals(C25500t.f99853g)));
                c33738c.f141122a.mo33083c(C33738c.f141120c, Boolean.valueOf(c33738c.m106623d() || AbstractC3269g.m9506m(c25500t) == EnumC25499s.SERVER_ERROR));
                throw credentialsProviderException;
        }
    }
}
