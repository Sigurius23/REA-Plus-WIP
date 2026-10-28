package p579wc;

import a30.C0332w0;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.RegionDisabledException;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import gf.InterfaceC15761b;
import gm.C15990r;
import ie.EnumC18438a;
import p035bp.AbstractC3511b;
import p088dc.AbstractC11894a;
import p368og.InterfaceC27910g;
import p421qd.C30286a;
import p421qd.C30289d;
import p479s4.AbstractC32121b;
import p484s9.AbstractC32281f;
import p505ts.AbstractC34132o;
import p520ud.C34780a;
import p520ud.C34781b;
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
import s90.C32290f;
import s93.AbstractC32306h;
import ve.InterfaceC35921f;
import vg.C35966m;
import vg.InterfaceC35967n;
import w91.C36965l;

/* JADX INFO: renamed from: wc.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37079d1 implements InterfaceC35921f {

    /* JADX INFO: renamed from: w */
    public final InterfaceC35921f f158625w;

    /* JADX INFO: renamed from: x */
    public final C37068a f158626x;

    /* JADX INFO: renamed from: y */
    public final String f158627y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC29123a f158628z;

    public C37079d1(InterfaceC35921f bootstrapCredentialsProvider, String roleArn, String str, String str2, String str3, InterfaceC29123a interfaceC29123a) {
        Duration.Companion companion = Duration.INSTANCE;
        long duration = DurationKt.toDuration(900, DurationUnit.SECONDS);
        AbstractC22676k.m65750j(bootstrapCredentialsProvider, "bootstrapCredentialsProvider");
        AbstractC22676k.m65750j(roleArn, "roleArn");
        C37068a c37068a = new C37068a(roleArn, str2, str3, duration);
        this.f158625w = bootstrapCredentialsProvider;
        this.f158626x = c37068a;
        this.f158627y = str;
        this.f158628z = interfaceC29123a;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x010d  */
    /* JADX WARN: Code duplicated, block: B:64:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146 A[Catch: all -> 0x0034, TryCatch #3 {all -> 0x0034, blocks: (B:13:0x002f, B:53:0x00f4, B:70:0x0138, B:72:0x0146, B:73:0x0160, B:74:0x0161, B:75:0x0168), top: B:80:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0161 A[Catch: all -> 0x0034, TryCatch #3 {all -> 0x0034, blocks: (B:13:0x002f, B:53:0x00f4, B:70:0x0138, B:72:0x0146, B:73:0x0160, B:74:0x0161, B:75:0x0168), top: B:80:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0146, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [gf.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [qd.a] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) throws Throwable {
        C37076c1 c37076c1;
        InterfaceC27910g interfaceC27910g;
        C37079d1 c37079d1;
        C30286a c30286a;
        InterfaceC27910g interfaceC27910g2;
        C30286a c30286a2;
        C34781b c34781b;
        C34785f c34785f;
        C34784e c34784e;
        String str;
        String str2;
        if (abstractC32269c instanceof C37076c1) {
            c37076c1 = (C37076c1) abstractC32269c;
            int i13 = c37076c1.f158616F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37076c1.f158616F = i13 - Integer.MIN_VALUE;
            } else {
                c37076c1 = new C37076c1(this, abstractC32269c);
            }
        } else {
            c37076c1 = new C37076c1(this, abstractC32269c);
        }
        Object objM92541b = c37076c1.f158620z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37076c1.f158616F;
        try {
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(objM92541b);
                    InterfaceC30063j context = c37076c1.getContext();
                    String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37079d1.class).getQualifiedName();
                    if (qualifiedName == null) {
                        throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
                    }
                    C15990r c15990rM113984B = AbstractC35903f.m113984B(context, qualifiedName);
                    c15990rM113984B.mo396u(null, new C36965l(19));
                    C32290f c32290f = new C32290f(this, AbstractC3511b.m10394w(c37076c1.getContext()), (Object) interfaceC15761b, 29);
                    c37076c1.f158617w = c15990rM113984B;
                    c37076c1.f158618x = this;
                    c37076c1.f158616F = 1;
                    Object objM115319p = C30289d.f123864b.m115319p(c32290f, c37076c1);
                    if (objM115319p != enumC31071a) {
                        interfaceC27910g = c15990rM113984B;
                        objM92541b = objM115319p;
                        c37079d1 = this;
                    }
                    return enumC31071a;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c30286a2 = c37076c1.f158619y;
                    interfaceC27910g2 = c37076c1.f158617w;
                    try {
                        AbstractC34132o.m107864I(objM92541b);
                        c34781b = (C34781b) objM92541b;
                        c30286a2.close();
                        c34785f = c34781b.f146461b;
                        if (c34785f != null) {
                            throw new CredentialsProviderException(null, "STS credentials must not be null");
                        }
                        c34784e = c34781b.f146460a;
                        if (c34784e != null || (str2 = c34784e.f146476a) == null) {
                            str = null;
                        } else {
                            str = AbstractC32121b.m100018x(str2).f152716d;
                        }
                        interfaceC27910g2.mo396u(null, new C37073b1(c34785f, 0));
                        return AbstractC11894a.m31950R(AbstractC32306h.m100559g(c34785f.f146478a, c34785f.f146480c, c34785f.f146481d, c34785f.f146479b, "AssumeRoleProvider", str), EnumC18438a.CREDENTIALS_STS_ASSUME_ROLE);
                    } catch (Exception e5) {
                        e = e5;
                        interfaceC27910g2.mo396u(null, new C36965l(20));
                        if (e instanceof RegionDisabledException) {
                            throw new CredentialsProviderException("failed to assume role from STS", e);
                        }
                        throw new ProviderConfigurationException("STS is not activated in the requested region (" + c30286a2.f123853w.f123894z + "). Please check your configuration and activate STS in the target region if necessary", e);
                    }
                }
                c37079d1 = c37076c1.f158618x;
                interfaceC27910g = c37076c1.f158617w;
                AbstractC34132o.m107864I(objM92541b);
                C0332w0 c0332w0 = new C0332w0(16);
                C37068a c37068a = c37079d1.f158626x;
                c0332w0.f1164E = c37068a.f158582a;
                c0332w0.f1170z = c37068a.f158584c;
                String strM98686g = c37068a.f158583b;
                if (strM98686g == null) {
                    try {
                        try {
                            InterfaceC35967n.f153143a.getClass();
                            strM98686g = AbstractC31780b.m98686g(C35966m.f153142b);
                        } catch (Exception e13) {
                            e = e13;
                            interfaceC27910g2 = interfaceC27910g;
                            c30286a2 = c30286a;
                            interfaceC27910g2.mo396u(null, new C36965l(20));
                            if (e instanceof RegionDisabledException) {
                                throw new CredentialsProviderException("failed to assume role from STS", e);
                            }
                            throw new ProviderConfigurationException("STS is not activated in the requested region (" + c30286a2.f123853w.f123894z + "). Please check your configuration and activate STS in the target region if necessary", e);
                        } catch (Throwable th3) {
                            th = th3;
                            interfaceC15761b = c30286a;
                            interfaceC15761b.close();
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                c0332w0.f1165F = strM98686g;
                c0332w0.f1168x = new Integer((int) Duration.m134276getInWholeSecondsimpl(c37068a.f158585d));
                c0332w0.f1169y = c37068a.f158586e;
                c0332w0.f1166G = c37068a.f158587f;
                C34780a c34780a = new C34780a(c0332w0);
                c37076c1.f158617w = interfaceC27910g;
                c37076c1.f158618x = null;
                c37076c1.f158619y = c30286a;
                c37076c1.f158616F = 2;
                objM92541b = c30286a.m92541b(c34780a, c37076c1);
                if (objM92541b != enumC31071a) {
                    interfaceC27910g2 = interfaceC27910g;
                    c30286a2 = c30286a;
                    c34781b = (C34781b) objM92541b;
                    c30286a2.close();
                    c34785f = c34781b.f146461b;
                    if (c34785f != null) {
                        throw new CredentialsProviderException(null, "STS credentials must not be null");
                    }
                    c34784e = c34781b.f146460a;
                    if (c34784e != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    interfaceC27910g2.mo396u(null, new C37073b1(c34785f, 0));
                    return AbstractC11894a.m31950R(AbstractC32306h.m100559g(c34785f.f146478a, c34785f.f146480c, c34785f.f146481d, c34785f.f146479b, "AssumeRoleProvider", str), EnumC18438a.CREDENTIALS_STS_ASSUME_ROLE);
                }
                return enumC31071a;
            } catch (Exception e15) {
                e = e15;
            } catch (Throwable th5) {
                th = th5;
            }
            c30286a = (C30286a) objM92541b;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final String toString() {
        return AbstractC32281f.m100455w(this);
    }
}
