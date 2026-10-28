package p579wc;

import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import b30.C2570m;
import gf.InterfaceC15761b;
import gm.C15990r;
import ie.EnumC18438a;
import java.io.Serializable;
import p035bp.AbstractC3511b;
import p088dc.AbstractC11894a;
import p368og.InterfaceC27910g;
import p421qd.C30286a;
import p421qd.C30289d;
import p479s4.AbstractC32121b;
import p484s9.AbstractC32281f;
import p505ts.AbstractC34132o;
import p520ud.C34782c;
import p520ud.C34783d;
import p520ud.C34784e;
import p520ud.C34785f;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pf.InterfaceC29123a;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import rs.AbstractC31780b;
import s83.AbstractC32269c;
import s93.AbstractC32306h;
import ve.InterfaceC35921f;
import vg.C35971r;
import vg.InterfaceC35967n;
import w91.C36965l;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: wc.h1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37091h1 implements InterfaceC35921f {

    /* JADX INFO: renamed from: w */
    public final C37071b f158675w;

    /* JADX INFO: renamed from: x */
    public final String f158676x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35967n f158677y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC29123a f158678z;

    public C37091h1(String roleArn, String webIdentityTokenFilePath, String str, String str2, long j7, InterfaceC35967n interfaceC35967n, InterfaceC29123a interfaceC29123a) {
        AbstractC22676k.m65750j(roleArn, "roleArn");
        AbstractC22676k.m65750j(webIdentityTokenFilePath, "webIdentityTokenFilePath");
        this.f158675w = new C37071b(roleArn, webIdentityTokenFilePath, str2, j7);
        this.f158676x = str;
        this.f158677y = interfaceC35967n;
        this.f158678z = interfaceC29123a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f0 A[Catch: all -> 0x00f5, Exception -> 0x00fc, TryCatch #4 {Exception -> 0x00fc, all -> 0x00f5, blocks: (B:37:0x00d1, B:39:0x00f0, B:44:0x0103), top: B:71:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Code duplicated, block: B:51:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x013d  */
    /* JADX WARN: Code duplicated, block: B:58:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [qd.a] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v31 */
    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) throws Throwable {
        C37088g1 c37088g1;
        Throwable th3;
        ?? r14;
        C37071b c37071b;
        InterfaceC27910g interfaceC27910g;
        C37091h1 c37091h1;
        InterfaceC15761b interfaceC15761b2;
        String str;
        InterfaceC27910g interfaceC27910g2;
        C30286a c30286a;
        Exception exc;
        InterfaceC27910g interfaceC27910g3;
        String strM98686g;
        Object objM92542h;
        C30286a c30286a2;
        C34783d c34783d;
        C34785f c34785f;
        C34784e c34784e;
        String str2;
        if (abstractC32269c instanceof C37088g1) {
            c37088g1 = (C37088g1) abstractC32269c;
            int i13 = c37088g1.f158661I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37088g1.f158661I = i13 - Integer.MIN_VALUE;
            } else {
                c37088g1 = new C37088g1(this, abstractC32269c);
            }
        } else {
            c37088g1 = new C37088g1(this, abstractC32269c);
        }
        Object obj = c37088g1.f158659G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37088g1.f158661I;
        InterfaceC35967n interfaceC35967n = this.f158677y;
        String str3 = null;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30063j context = c37088g1.getContext();
                String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37079d1.class).getQualifiedName();
                if (qualifiedName == null) {
                    throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
                }
                C15990r c15990rM113984B = AbstractC35903f.m113984B(context, qualifiedName);
                c15990rM113984B.mo396u(null, new C36965l(21));
                c37071b = this.f158675w;
                String str4 = c37071b.f158595b;
                c37088g1.f158662w = interfaceC15761b;
                c37088g1.f158663x = c15990rM113984B;
                c37088g1.f158664y = this;
                c37088g1.f158665z = c37071b;
                c37088g1.f158661I = 1;
                Serializable serializableM114209d = ((C35971r) interfaceC35967n).m114209d(str4, c37088g1);
                if (serializableM114209d != enumC31071a) {
                    interfaceC27910g = c15990rM113984B;
                    obj = serializableM114209d;
                    c37091h1 = this;
                    interfaceC15761b2 = interfaceC15761b;
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c30286a2 = c37088g1.f158658F;
                    interfaceC27910g3 = c37088g1.f158663x;
                    try {
                        AbstractC34132o.m107864I(obj);
                        c34783d = (C34783d) obj;
                        c30286a2.close();
                        c34785f = c34783d.f146471c;
                        if (c34785f == null) {
                            throw new CredentialsProviderException(null, "STS credentials must not be null");
                        }
                        interfaceC27910g3.mo396u(null, new C37073b1(c34785f, 1));
                        c34784e = c34783d.f146469a;
                        if (c34784e != null && (str2 = c34784e.f146476a) != null) {
                            str3 = AbstractC32121b.m100018x(str2).f152716d;
                        }
                        return AbstractC11894a.m31950R(AbstractC32306h.m100559g(c34785f.f146478a, c34785f.f146480c, c34785f.f146481d, c34785f.f146479b, "WebIdentityToken", str3), EnumC18438a.CREDENTIALS_STS_ASSUME_ROLE_WEB_ID);
                    } catch (Exception e5) {
                        exc = e5;
                        interfaceC27910g3.mo396u(null, new C36965l(22));
                        throw new CredentialsProviderException("STS failed to assume role from web identity", exc);
                    }
                }
                str = c37088g1.f158657E;
                c37071b = c37088g1.f158665z;
                interfaceC27910g2 = c37088g1.f158663x;
                AbstractC34132o.m107864I(obj);
                c30286a = (C30286a) obj;
                try {
                    C2570m c2570m = new C2570m(19);
                    c2570m.f9989z = c37071b.f158594a;
                    c2570m.f9985F = str;
                    c2570m.f9987x = new Integer((int) Duration.m134276getInWholeSecondsimpl(c37071b.f158597d));
                    strM98686g = c37071b.f158596c;
                    if (strM98686g == null) {
                        strM98686g = AbstractC31780b.m98686g(interfaceC35967n);
                    }
                    c2570m.f9984E = strM98686g;
                    c2570m.f9988y = c37071b.f158598e;
                    C34782c c34782c = new C34782c(c2570m);
                    c37088g1.f158662w = null;
                    c37088g1.f158663x = interfaceC27910g2;
                    c37088g1.f158664y = null;
                    c37088g1.f158665z = null;
                    c37088g1.f158657E = null;
                    c37088g1.f158658F = c30286a;
                    c37088g1.f158661I = 3;
                    objM92542h = c30286a.m92542h(c34782c, c37088g1);
                    if (objM92542h != enumC31071a) {
                        obj = objM92542h;
                        c30286a2 = c30286a;
                        interfaceC27910g3 = interfaceC27910g2;
                        c34783d = (C34783d) obj;
                        c30286a2.close();
                        c34785f = c34783d.f146471c;
                        if (c34785f == null) {
                            throw new CredentialsProviderException(null, "STS credentials must not be null");
                        }
                        interfaceC27910g3.mo396u(null, new C37073b1(c34785f, 1));
                        c34784e = c34783d.f146469a;
                        if (c34784e != null) {
                            str3 = AbstractC32121b.m100018x(str2).f152716d;
                        }
                        return AbstractC11894a.m31950R(AbstractC32306h.m100559g(c34785f.f146478a, c34785f.f146480c, c34785f.f146481d, c34785f.f146479b, "WebIdentityToken", str3), EnumC18438a.CREDENTIALS_STS_ASSUME_ROLE_WEB_ID);
                    }
                    return enumC31071a;
                } catch (Exception e13) {
                    exc = e13;
                    interfaceC27910g3 = interfaceC27910g2;
                    interfaceC27910g3.mo396u(null, new C36965l(22));
                    throw new CredentialsProviderException("STS failed to assume role from web identity", exc);
                } catch (Throwable th4) {
                    th3 = th4;
                    r14 = c30286a;
                    r14.close();
                    throw th3;
                }
            }
            C37071b c37071b2 = c37088g1.f158665z;
            C37091h1 c37091h2 = c37088g1.f158664y;
            InterfaceC27910g interfaceC27910g4 = c37088g1.f158663x;
            InterfaceC15761b interfaceC15761b3 = c37088g1.f158662w;
            AbstractC34132o.m107864I(obj);
            c37071b = c37071b2;
            interfaceC15761b2 = interfaceC15761b3;
            interfaceC27910g = interfaceC27910g4;
            c37091h1 = c37091h2;
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                throw new CredentialsProviderException(null, "failed to read webIdentityToken from " + c37071b.f158595b);
            }
            String strM125916A = AbstractC39421y.m125916A(bArr);
            C37082e1 c37082e1 = new C37082e1(c37091h1, AbstractC3511b.m10394w(c37088g1.getContext()), interfaceC15761b2, 0);
            c37088g1.f158662w = null;
            c37088g1.f158663x = interfaceC27910g;
            c37088g1.f158664y = null;
            c37088g1.f158665z = c37071b;
            c37088g1.f158657E = strM125916A;
            c37088g1.f158661I = 2;
            Object objM115319p = C30289d.f123864b.m115319p(c37082e1, c37088g1);
            if (objM115319p != enumC31071a) {
                obj = objM115319p;
                str = strM125916A;
                interfaceC27910g2 = interfaceC27910g;
                c30286a = (C30286a) obj;
                C2570m c2570m2 = new C2570m(19);
                c2570m2.f9989z = c37071b.f158594a;
                c2570m2.f9985F = str;
                c2570m2.f9987x = new Integer((int) Duration.m134276getInWholeSecondsimpl(c37071b.f158597d));
                strM98686g = c37071b.f158596c;
                if (strM98686g == null) {
                    strM98686g = AbstractC31780b.m98686g(interfaceC35967n);
                }
                c2570m2.f9984E = strM98686g;
                c2570m2.f9988y = c37071b.f158598e;
                C34782c c34782c2 = new C34782c(c2570m2);
                c37088g1.f158662w = null;
                c37088g1.f158663x = interfaceC27910g2;
                c37088g1.f158664y = null;
                c37088g1.f158665z = null;
                c37088g1.f158657E = null;
                c37088g1.f158658F = c30286a;
                c37088g1.f158661I = 3;
                objM92542h = c30286a.m92542h(c34782c2, c37088g1);
                if (objM92542h != enumC31071a) {
                    obj = objM92542h;
                    c30286a2 = c30286a;
                    interfaceC27910g3 = interfaceC27910g2;
                    c34783d = (C34783d) obj;
                    c30286a2.close();
                    c34785f = c34783d.f146471c;
                    if (c34785f == null) {
                        throw new CredentialsProviderException(null, "STS credentials must not be null");
                    }
                    interfaceC27910g3.mo396u(null, new C37073b1(c34785f, 1));
                    c34784e = c34783d.f146469a;
                    if (c34784e != null) {
                        str3 = AbstractC32121b.m100018x(str2).f152716d;
                    }
                    return AbstractC11894a.m31950R(AbstractC32306h.m100559g(c34785f.f146478a, c34785f.f146480c, c34785f.f146481d, c34785f.f146479b, "WebIdentityToken", str3), EnumC18438a.CREDENTIALS_STS_ASSUME_ROLE_WEB_ID);
                }
            }
            return enumC31071a;
        } catch (Throwable th5) {
            th3 = th5;
            r14 = interfaceC15761b;
        }
    }

    public final String toString() {
        return AbstractC32281f.m100455w(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37091h1(String str, String str2, String str3, String str4, InterfaceC35967n interfaceC35967n, InterfaceC29123a interfaceC29123a) {
        this(str, str2, str3, str4, DurationKt.toDuration(900, DurationUnit.SECONDS), interfaceC35967n, interfaceC29123a);
        Duration.Companion companion = Duration.INSTANCE;
    }
}
