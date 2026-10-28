package p579wc;

import aws.sdk.kotlin.runtime.auth.credentials.CredentialsNotLoadedException;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import cd.C4421a;
import gf.InterfaceC15761b;
import gm.C15990r;
import id.C18404a;
import id.C18405b;
import id.C18406c;
import ie.EnumC18438a;
import p035bp.AbstractC3511b;
import p088dc.AbstractC11894a;
import p115ed.C13106a;
import p115ed.C13109d;
import p484s9.AbstractC32281f;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.InterfaceC29123a;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s90.C32290f;
import s93.AbstractC32306h;
import ug.AbstractC34914c;
import ug.C34912a;
import ug.C34913b;
import ve.C35920e;
import ve.InterfaceC35921f;
import vg.InterfaceC35967n;
import vv1.C36532c;
import w91.C36965l;

/* JADX INFO: renamed from: wc.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37111p0 implements InterfaceC35921f {

    /* JADX INFO: renamed from: E */
    public final String f158755E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC29123a f158756F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC35967n f158757G;

    /* JADX INFO: renamed from: H */
    public final C34912a f158758H;

    /* JADX INFO: renamed from: I */
    public final C37127x0 f158759I;

    /* JADX INFO: renamed from: w */
    public final String f158760w;

    /* JADX INFO: renamed from: x */
    public final String f158761x;

    /* JADX INFO: renamed from: y */
    public final String f158762y;

    /* JADX INFO: renamed from: z */
    public final String f158763z;

    public C37111p0(String accountId, String roleName, String startUrl, String ssoRegion, String str, InterfaceC29123a interfaceC29123a, InterfaceC35967n interfaceC35967n, int i13) {
        str = (i13 & 16) != 0 ? null : str;
        AbstractC22676k.m65750j(accountId, "accountId");
        AbstractC22676k.m65750j(roleName, "roleName");
        AbstractC22676k.m65750j(startUrl, "startUrl");
        AbstractC22676k.m65750j(ssoRegion, "ssoRegion");
        this.f158760w = accountId;
        this.f158761x = roleName;
        this.f158762y = startUrl;
        this.f158763z = ssoRegion;
        this.f158755E = str;
        this.f158756F = interfaceC29123a;
        this.f158757G = interfaceC35967n;
        String str2 = str;
        C34912a c34912a = C34912a.f147012a;
        this.f158758H = c34912a;
        this.f158759I = str2 != null ? new C37127x0(str2, startUrl, ssoRegion, interfaceC29123a, interfaceC35967n, c34912a) : null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m119030a(AbstractC32269c abstractC32269c) {
        C37107n0 c37107n0;
        if (abstractC32269c instanceof C37107n0) {
            c37107n0 = (C37107n0) abstractC32269c;
            int i13 = c37107n0.f158738y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37107n0.f158738y = i13 - Integer.MIN_VALUE;
            } else {
                c37107n0 = new C37107n0(this, abstractC32269c);
            }
        } else {
            c37107n0 = new C37107n0(this, abstractC32269c);
        }
        Object objM119047d = c37107n0.f158736w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37107n0.f158738y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM119047d);
            c37107n0.f158738y = 1;
            objM119047d = AbstractC37131z0.m119047d(this.f158762y, this.f158757G, c37107n0);
            if (objM119047d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM119047d);
        }
        C37113q0 c37113q0 = (C37113q0) objM119047d;
        this.f158758H.getClass();
        C33647p c33647p = C34913b.f147015x;
        if (C33647p.m106274t().compareTo(c37113q0.f158773b) <= 0) {
            return c37113q0;
        }
        throw new ProviderConfigurationException("The SSO session has expired. To refresh this SSO session run `aws sso login` with the corresponding profile.", null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0133  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) throws Throwable {
        C37109o0 c37109o0;
        InterfaceC15761b interfaceC15761b2;
        C37113q0 c37113q0;
        C37113q0 c37113q1;
        C13106a c13106a;
        C13106a c13106a2;
        Object objM36631b;
        C18406c c18406c;
        String str;
        String str2;
        if (abstractC32269c instanceof C37109o0) {
            c37109o0 = (C37109o0) abstractC32269c;
            int i13 = c37109o0.f158747F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37109o0.f158747F = i13 - Integer.MIN_VALUE;
            } else {
                c37109o0 = new C37109o0(this, abstractC32269c);
            }
        } else {
            c37109o0 = new C37109o0(this, abstractC32269c);
        }
        Object objM119030a = c37109o0.f158751z;
        Object obj = EnumC31071a.f128113w;
        int i14 = c37109o0.f158747F;
        C37127x0 c37127x0 = this.f158759I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM119030a);
            InterfaceC30063j context = c37109o0.getContext();
            String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37111p0.class).getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
            }
            C15990r c15990rM113984B = AbstractC35903f.m113984B(context, qualifiedName);
            if (c37127x0 != null) {
                c15990rM113984B.mo394s(null, new C36532c(this, 10));
                c37109o0.f158748w = interfaceC15761b;
                c37109o0.f158747F = 1;
                objM119030a = c37127x0.mo79294b(interfaceC15761b, c37109o0);
                if (objM119030a != obj) {
                    interfaceC15761b2 = interfaceC15761b;
                    c37113q0 = (C37113q0) objM119030a;
                }
            } else {
                c15990rM113984B.mo394s(null, new C36965l(18));
                c37109o0.f158748w = interfaceC15761b;
                c37109o0.f158747F = 2;
                objM119030a = m119030a(c37109o0);
                if (objM119030a != obj) {
                    interfaceC15761b2 = interfaceC15761b;
                    c37113q0 = (C37113q0) objM119030a;
                }
            }
            return obj;
        }
        if (i14 == 1) {
            interfaceC15761b2 = c37109o0.f158748w;
            AbstractC34132o.m107864I(objM119030a);
            c37113q0 = (C37113q0) objM119030a;
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c13106a2 = c37109o0.f158750y;
                    try {
                        try {
                            AbstractC34132o.m107864I(objM119030a);
                            C18405b c18405b = (C18405b) objM119030a;
                            c13106a2.close();
                            c18406c = c18405b.f71591a;
                            if (c18406c == null) {
                                throw new CredentialsProviderException(null, "Expected SSO roleCredentials to not be null");
                            }
                            str = c18406c.f71592a;
                            if (str == null) {
                                throw new IllegalStateException("Expected accessKeyId in SSO roleCredentials response");
                            }
                            str2 = c18406c.f71594c;
                            if (str2 == null) {
                                throw new IllegalStateException("Expected secretAccessKey in SSO roleCredentials response");
                            }
                            C35920e c35920eM100559g = AbstractC32306h.m100559g(str, str2, c18406c.f71595d, AbstractC34914c.m110116a(C34913b.f147015x, c18406c.f71593b), "SSO", this.f158760w);
                            return c37127x0 != null ? AbstractC11894a.m31950R(c35920eM100559g, EnumC18438a.CREDENTIALS_SSO) : AbstractC11894a.m31950R(c35920eM100559g, EnumC18438a.CREDENTIALS_SSO_LEGACY);
                        } catch (Exception e5) {
                            e = e5;
                            throw new CredentialsNotLoadedException("GetRoleCredentials operation failed", e);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c13106a2.close();
                        throw th;
                    }
                }
                c37113q1 = c37109o0.f158749x;
                AbstractC34132o.m107864I(objM119030a);
                c13106a = (C13106a) objM119030a;
                try {
                    C4421a c4421a = new C4421a(2);
                    c4421a.f17886c = this.f158760w;
                    c4421a.f17887d = this.f158761x;
                    c4421a.f17885b = c37113q1.f158772a;
                    C18404a c18404a = new C18404a(c4421a);
                    c37109o0.f158748w = null;
                    c37109o0.f158749x = null;
                    c37109o0.f158750y = c13106a;
                    c37109o0.f158747F = 4;
                    objM36631b = c13106a.m36631b(c18404a, c37109o0);
                    if (objM36631b != obj) {
                        c13106a2 = c13106a;
                        objM119030a = objM36631b;
                        C18405b c18405b2 = (C18405b) objM119030a;
                        c13106a2.close();
                        c18406c = c18405b2.f71591a;
                        if (c18406c == null) {
                            throw new CredentialsProviderException(null, "Expected SSO roleCredentials to not be null");
                        }
                        str = c18406c.f71592a;
                        if (str == null) {
                            throw new IllegalStateException("Expected accessKeyId in SSO roleCredentials response");
                        }
                        str2 = c18406c.f71594c;
                        if (str2 == null) {
                            throw new IllegalStateException("Expected secretAccessKey in SSO roleCredentials response");
                        }
                        C35920e c35920eM100559g2 = AbstractC32306h.m100559g(str, str2, c18406c.f71595d, AbstractC34914c.m110116a(C34913b.f147015x, c18406c.f71593b), "SSO", this.f158760w);
                        if (c37127x0 != null) {
                        }
                    }
                    return obj;
                } catch (Exception e13) {
                    e = e13;
                    c13106a2 = c13106a;
                    throw new CredentialsNotLoadedException("GetRoleCredentials operation failed", e);
                } catch (Throwable th4) {
                    th = th4;
                    c13106a2 = c13106a;
                    c13106a2.close();
                    throw th;
                }
            }
            interfaceC15761b2 = c37109o0.f158748w;
            AbstractC34132o.m107864I(objM119030a);
            c37113q0 = (C37113q0) objM119030a;
        }
        C37113q0 c37113q2 = c37113q0;
        InterfaceC15761b interfaceC15761b3 = interfaceC15761b2;
        c37113q1 = c37113q2;
        C32290f c32290f = new C32290f(this, AbstractC3511b.m10394w(c37109o0.getContext()), interfaceC15761b3, 28);
        c37109o0.f158748w = null;
        c37109o0.f158749x = c37113q1;
        c37109o0.f158747F = 3;
        objM119030a = C13109d.f45306b.m115319p(c32290f, c37109o0);
        if (objM119030a != obj) {
            c13106a = (C13106a) objM119030a;
            C4421a c4421a2 = new C4421a(2);
            c4421a2.f17886c = this.f158760w;
            c4421a2.f17887d = this.f158761x;
            c4421a2.f17885b = c37113q1.f158772a;
            C18404a c18404a2 = new C18404a(c4421a2);
            c37109o0.f158748w = null;
            c37109o0.f158749x = null;
            c37109o0.f158750y = c13106a;
            c37109o0.f158747F = 4;
            objM36631b = c13106a.m36631b(c18404a2, c37109o0);
            if (objM36631b != obj) {
                c13106a2 = c13106a;
                objM119030a = objM36631b;
                C18405b c18405b3 = (C18405b) objM119030a;
                c13106a2.close();
                c18406c = c18405b3.f71591a;
                if (c18406c == null) {
                    throw new CredentialsProviderException(null, "Expected SSO roleCredentials to not be null");
                }
                str = c18406c.f71592a;
                if (str == null) {
                    throw new IllegalStateException("Expected accessKeyId in SSO roleCredentials response");
                }
                str2 = c18406c.f71594c;
                if (str2 == null) {
                    throw new IllegalStateException("Expected secretAccessKey in SSO roleCredentials response");
                }
                C35920e c35920eM100559g3 = AbstractC32306h.m100559g(str, str2, c18406c.f71595d, AbstractC34914c.m110116a(C34913b.f147015x, c18406c.f71593b), "SSO", this.f158760w);
                if (c37127x0 != null) {
                }
            }
        }
        return obj;
    }

    public final String toString() {
        return AbstractC32281f.m100455w(this);
    }
}
