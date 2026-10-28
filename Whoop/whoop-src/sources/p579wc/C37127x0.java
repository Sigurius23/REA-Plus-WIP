package p579wc;

import a33.C0351c;
import ar0.C1926a;
import aws.sdk.kotlin.runtime.auth.credentials.InvalidSsoTokenException;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import com.whoop.service.network.model.UserSessionDtoKt;
import gf.InterfaceC15761b;
import java.io.Closeable;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import o23.C27486p;
import p012ab.C0682h0;
import p035bp.AbstractC3511b;
import p088dc.AbstractC11895b;
import p255jk.C21746d;
import p279kd.C22374a;
import p279kd.C22377d;
import p319m4.AbstractC25012a;
import p365od.C27825d;
import p365od.C27826e;
import p368og.EnumC27905b;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p613xf.InterfaceC38257c;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pf.AbstractC29125c;
import pf.InterfaceC29123a;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import ug.C34912a;
import ug.C34913b;
import um0.C35076b;
import vg.InterfaceC35967n;
import w91.C36965l;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: wc.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37127x0 implements InterfaceC38257c {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35967n f158839E;

    /* JADX INFO: renamed from: F */
    public final C34912a f158840F;

    /* JADX INFO: renamed from: G */
    public final C0682h0 f158841G;

    /* JADX INFO: renamed from: w */
    public final String f158842w;

    /* JADX INFO: renamed from: x */
    public final String f158843x;

    /* JADX INFO: renamed from: y */
    public final long f158844y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC29123a f158845z;

    public C37127x0(String str, String startUrl, String ssoRegion, InterfaceC29123a interfaceC29123a, InterfaceC35967n interfaceC35967n, C34912a c34912a) {
        Duration.Companion companion = Duration.INSTANCE;
        long duration = DurationKt.toDuration(300, DurationUnit.SECONDS);
        AbstractC22676k.m65750j(startUrl, "startUrl");
        AbstractC22676k.m65750j(ssoRegion, "ssoRegion");
        this.f158842w = str;
        this.f158843x = ssoRegion;
        this.f158844y = duration;
        this.f158845z = interfaceC29123a;
        this.f158839E = interfaceC35967n;
        this.f158840F = c34912a;
        this.f158841G = new C0682h0(17, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public static final Object m119040a(C37127x0 c37127x0, AbstractC32269c abstractC32269c) {
        C37121u0 c37121u0;
        String str = c37127x0.f158842w;
        C34912a c34912a = c37127x0.f158840F;
        if (abstractC32269c instanceof C37121u0) {
            c37121u0 = (C37121u0) abstractC32269c;
            int i13 = c37121u0.f158810y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37121u0.f158810y = i13 - Integer.MIN_VALUE;
            } else {
                c37121u0 = new C37121u0(c37127x0, abstractC32269c);
            }
        } else {
            c37121u0 = new C37121u0(c37127x0, abstractC32269c);
        }
        Object objM119047d = c37121u0.f158808w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c37121u0.f158810y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM119047d);
            InterfaceC35967n interfaceC35967n = c37127x0.f158839E;
            c37121u0.f158810y = 1;
            objM119047d = AbstractC37131z0.m119047d(str, interfaceC35967n, c37121u0);
            if (objM119047d != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM119047d);
            return objM119047d;
        }
        AbstractC34132o.m107864I(objM119047d);
        C37113q0 c37113q0 = (C37113q0) objM119047d;
        c34912a.getClass();
        C33647p c33647p = C34913b.f147015x;
        if (C33647p.m106274t().compareTo(c37113q0.f158773b.m110114c(c37127x0.f158844y)) < 0) {
            InterfaceC30063j context = c37121u0.getContext();
            C37115r0 c37115r0 = new C37115r0(c37127x0, 0);
            EnumC27905b enumC27905b = EnumC27905b.f112507z;
            String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37127x0.class).getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
            }
            AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c37115r0);
            return c37113q0;
        }
        if (c37113q0.f158775d != null && c37113q0.f158776e != null && c37113q0.f158774c != null) {
            c37121u0.f158810y = 2;
            Object objM119041c = c37127x0.m119041c(c37113q0, c37121u0);
            return objM119041c == obj ? obj : objM119041c;
        }
        if (C33647p.m106274t().compareTo(c37113q0.f158773b) >= 0) {
            c37113q0 = null;
        }
        if (c37113q0 == null) {
            throw new InvalidSsoTokenException(AbstractC11895b.m31996o("SSO token for sso-session: ", str, " is expired"), null);
        }
        InterfaceC30063j context2 = c37121u0.getContext();
        C37117s0 c37117s0 = new C37117s0(c37113q0, c37127x0, 0);
        EnumC27905b enumC27905b2 = EnumC27905b.f112507z;
        String qualifiedName2 = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37127x0.class).getQualifiedName();
        if (qualifiedName2 == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
        }
        AbstractC35903f.m113983A(context2, enumC27905b2, qualifiedName2, null, c37117s0);
        return c37113q0;
    }

    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) {
        return this.f158841G.m1706v(new C0351c(this, interfaceC15761b, null, 14), abstractC32269c);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m119041c(C37113q0 c37113q0, AbstractC32269c abstractC32269c) {
        C37119t0 c37119t0;
        Object objM107888l;
        C37113q0 c37113q1;
        Object obj;
        C37113q0 c37113q2;
        Throwable thM68037a;
        InterfaceC30063j context;
        C37117s0 c37117s0;
        EnumC27905b enumC27905b;
        String qualifiedName;
        InterfaceC30063j context2;
        C36965l c36965l;
        EnumC27905b enumC27905b2;
        String qualifiedName2;
        if (abstractC32269c instanceof C37119t0) {
            c37119t0 = (C37119t0) abstractC32269c;
            int i13 = c37119t0.f158798E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37119t0.f158798E = i13 - Integer.MIN_VALUE;
            } else {
                c37119t0 = new C37119t0(this, abstractC32269c);
            }
        } else {
            c37119t0 = new C37119t0(this, abstractC32269c);
        }
        Object objM119042d = c37119t0.f158801y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c37119t0.f158798E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM119042d);
                InterfaceC30063j context3 = c37119t0.getContext();
                C37115r0 c37115r0 = new C37115r0(this, 1);
                EnumC27905b enumC27905b3 = EnumC27905b.f112507z;
                String qualifiedName3 = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37127x0.class).getQualifiedName();
                if (qualifiedName3 == null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                }
                AbstractC35903f.m113983A(context3, enumC27905b3, qualifiedName3, null, c37115r0);
                c37119t0.f158799w = c37113q0;
                c37119t0.f158798E = 1;
                objM119042d = m119042d(c37113q0, c37119t0);
                if (objM119042d == obj2) {
                }
                return obj2;
            }
            if (i14 == 1) {
                c37113q0 = c37119t0.f158799w;
                AbstractC34132o.m107864I(objM119042d);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c37119t0.f158800x;
                c37113q2 = c37119t0.f158799w;
                AbstractC34132o.m107864I(objM119042d);
            }
            c37113q1 = c37113q2;
            thM68037a = C23468n.m68037a(obj);
            if (thM68037a == null) {
                return obj;
            }
            this.f158840F.getClass();
            C33647p c33647p = C34913b.f147015x;
            if (C33647p.m106274t().compareTo(c37113q1.f158773b) >= 0) {
                context = c37119t0.getContext();
                c37117s0 = new C37117s0(c37113q1, this, 1);
                enumC27905b = EnumC27905b.f112507z;
                qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37127x0.class).getQualifiedName();
                if (qualifiedName != null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                }
                AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c37117s0);
                return c37113q1;
            }
            context2 = c37119t0.getContext();
            c36965l = new C36965l(17);
            enumC27905b2 = EnumC27905b.f112504w;
            qualifiedName2 = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37127x0.class).getQualifiedName();
            if (qualifiedName2 == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
            }
            AbstractC35903f.m113983A(context2, enumC27905b2, qualifiedName2, thM68037a, c36965l);
            throw new InvalidSsoTokenException(AbstractC25012a.m73376i(this.f158842w, " is expired", new StringBuilder("SSO token for sso-session: ")), thM68037a);
            objM107888l = (C37113q0) objM119042d;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Object obj3 = objM107888l;
        c37113q1 = c37113q0;
        obj = obj3;
        if (!(obj instanceof C23467m)) {
            c37119t0.f158799w = c37113q1;
            c37119t0.f158800x = obj;
            c37119t0.f158798E = 2;
            if (m119043e((C37113q0) obj, c37119t0) != obj2) {
                c37113q2 = c37113q1;
                c37113q1 = c37113q2;
            }
            return obj2;
        }
        thM68037a = C23468n.m68037a(obj);
        if (thM68037a == null) {
            return obj;
        }
        this.f158840F.getClass();
        C33647p c33647p2 = C34913b.f147015x;
        if (C33647p.m106274t().compareTo(c37113q1.f158773b) >= 0) {
            context = c37119t0.getContext();
            c37117s0 = new C37117s0(c37113q1, this, 1);
            enumC27905b = EnumC27905b.f112507z;
            qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37127x0.class).getQualifiedName();
            if (qualifiedName != null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
            }
            AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c37117s0);
            return c37113q1;
        }
        context2 = c37119t0.getContext();
        c36965l = new C36965l(17);
        enumC27905b2 = EnumC27905b.f112504w;
        qualifiedName2 = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37127x0.class).getQualifiedName();
        if (qualifiedName2 == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
        }
        AbstractC35903f.m113983A(context2, enumC27905b2, qualifiedName2, thM68037a, c36965l);
        throw new InvalidSsoTokenException(AbstractC25012a.m73376i(this.f158842w, " is expired", new StringBuilder("SSO token for sso-session: ")), thM68037a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m119042d(C37113q0 c37113q0, AbstractC32269c abstractC32269c) throws Throwable {
        C37123v0 c37123v0;
        Closeable closeable;
        Throwable th3;
        Closeable closeable2;
        C37113q0 c37113q1;
        if (abstractC32269c instanceof C37123v0) {
            c37123v0 = (C37123v0) abstractC32269c;
            int i13 = c37123v0.f158814E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37123v0.f158814E = i13 - Integer.MIN_VALUE;
            } else {
                c37123v0 = new C37123v0(this, abstractC32269c);
            }
        } else {
            c37123v0 = new C37123v0(this, abstractC32269c);
        }
        Object objM115319p = c37123v0.f158817y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37123v0.f158814E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM115319p);
                C35076b c35076b = new C35076b(23, this, AbstractC3511b.m10394w(c37123v0.getContext()));
                c37123v0.f158815w = c37113q0;
                c37123v0.f158814E = 1;
                objM115319p = C22377d.f87352b.m115319p(c35076b, c37123v0);
                if (objM115319p != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable2 = c37123v0.f158816x;
                c37113q1 = c37123v0.f158815w;
                try {
                    AbstractC34132o.m107864I(objM115319p);
                    C37113q0 c37113q0M119044a = AbstractC37131z0.m119044a((C27826e) objM115319p, c37113q1, this.f158840F);
                    closeable2.close();
                    return c37113q0M119044a;
                } catch (Throwable th4) {
                    th3 = th4;
                    try {
                        closeable2.close();
                    } catch (Throwable th5) {
                        AbstractC29125c.m88530g(th3, th5);
                    }
                    throw th3;
                }
            }
            c37113q0 = c37123v0.f158815w;
            AbstractC34132o.m107864I(objM115319p);
            C21746d c21746d = new C21746d();
            c21746d.f83657a = c37113q0.f158775d;
            c21746d.f83658b = c37113q0.f158776e;
            c21746d.f83660d = c37113q0.f158774c;
            c21746d.f83659c = UserSessionDtoKt.REFRESH_TOKEN;
            C27825d c27825d = new C27825d(c21746d);
            c37123v0.f158815w = c37113q0;
            c37123v0.f158816x = closeable;
            c37123v0.f158814E = 2;
            Object objM64294b = ((C22374a) closeable).m64294b(c27825d, c37123v0);
            if (objM64294b != enumC31071a) {
                c37113q1 = c37113q0;
                closeable2 = closeable;
                objM115319p = objM64294b;
                C37113q0 c37113q0M119044a2 = AbstractC37131z0.m119044a((C27826e) objM115319p, c37113q1, this.f158840F);
                closeable2.close();
                return c37113q0M119044a2;
            }
            return enumC31071a;
        } catch (Throwable th6) {
            th3 = th6;
            closeable2 = closeable;
            closeable2.close();
            throw th3;
        }
        closeable = (Closeable) objM115319p;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m119043e(C37113q0 c37113q0, AbstractC32269c abstractC32269c) throws Throwable {
        C37125w0 c37125w0;
        Exception e5;
        String str;
        InterfaceC30063j context;
        C1926a c1926a;
        EnumC27905b enumC27905b;
        String qualifiedName;
        if (abstractC32269c instanceof C37125w0) {
            c37125w0 = (C37125w0) abstractC32269c;
            int i13 = c37125w0.f158828z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37125w0.f158828z = i13 - Integer.MIN_VALUE;
            } else {
                c37125w0 = new C37125w0(this, abstractC32269c);
            }
        } else {
            c37125w0 = new C37125w0(this, abstractC32269c);
        }
        Object obj = c37125w0.f158826x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37125w0.f158828z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            String[] strArr = {"~", ".aws", "sso", "cache", AbstractC37131z0.m119046c(this.f158842w)};
            InterfaceC35967n interfaceC35967n = this.f158839E;
            String strM121486z = AbstractC37926s0.m121486z(AbstractC37131z0.m119045b(interfaceC35967n, strArr), interfaceC35967n);
            try {
                byte[] bArrM119048e = AbstractC37131z0.m119048e(c37113q0);
                c37125w0.f158825w = strM121486z;
                c37125w0.f158828z = 1;
                C22365e c22365e = AbstractC3050q0.f12077a;
                Object objM8705K = AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new C27486p(strM121486z, bArrM119048e, null, 12), c37125w0);
                if (objM8705K != enumC31071a) {
                    objM8705K = c23454a0;
                }
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } catch (Exception e13) {
                e5 = e13;
                str = strM121486z;
                context = c37125w0.getContext();
                c1926a = new C1926a(str, 13);
                enumC27905b = EnumC27905b.f112507z;
                qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37127x0.class).getQualifiedName();
                if (qualifiedName != null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                }
                AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, e5, c1926a);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c37125w0.f158825w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Exception e14) {
                e5 = e14;
                context = c37125w0.getContext();
                c1926a = new C1926a(str, 13);
                enumC27905b = EnumC27905b.f112507z;
                qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37127x0.class).getQualifiedName();
                if (qualifiedName != null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                }
                AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, e5, c1926a);
            }
        }
        return c23454a0;
    }
}
