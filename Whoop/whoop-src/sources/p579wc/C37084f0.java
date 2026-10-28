package p579wc;

import a33.C0351c;
import ar0.C1926a;
import aws.sdk.kotlin.runtime.auth.credentials.InvalidLoginTokenException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.signin.model.AccessDeniedException;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import cd.AbstractC4434n;
import cd.C4421a;
import cd.C4422b;
import cd.C4423c;
import cd.C4424d;
import cd.C4425e;
import cd.C4426f;
import cd.C4427g;
import cd.C4428h;
import cd.C4432l;
import cd.C4433m;
import com.whoop.service.network.model.UserSessionDtoKt;
import e73.C12803b;
import eg.C13166o;
import gf.InterfaceC15761b;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25265s;
import m83.C25271y;
import o23.C27486p;
import p012ab.C0682h0;
import p319m4.AbstractC25012a;
import p368og.EnumC27905b;
import p463rj.AbstractC31484o;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p645yc.C39422a;
import p645yc.C39426e;
import p645yc.C39427f;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pf.AbstractC29125c;
import pf.InterfaceC29123a;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import ro.C31624i;
import s83.AbstractC32269c;
import s93.AbstractC32306h;
import ug.C34912a;
import ug.C34913b;
import ug.EnumC34931t;
import ve.InterfaceC35921f;
import vg.InterfaceC35967n;
import w91.C36965l;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: wc.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37084f0 implements InterfaceC35921f {

    /* JADX INFO: renamed from: E */
    public final String f158643E;

    /* JADX INFO: renamed from: F */
    public final C39422a f158644F;

    /* JADX INFO: renamed from: G */
    public final C0682h0 f158645G;

    /* JADX INFO: renamed from: w */
    public final String f158646w;

    /* JADX INFO: renamed from: x */
    public final long f158647x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35967n f158648y;

    /* JADX INFO: renamed from: z */
    public final C34912a f158649z;

    public C37084f0(String loginSessionName, InterfaceC35967n platformProvider, C34912a clock, String cacheDirectory, C39422a client) {
        Duration.Companion companion = Duration.INSTANCE;
        long duration = DurationKt.toDuration(300, DurationUnit.SECONDS);
        AbstractC22676k.m65750j(loginSessionName, "loginSessionName");
        AbstractC22676k.m65750j(platformProvider, "platformProvider");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(cacheDirectory, "cacheDirectory");
        AbstractC22676k.m65750j(client, "client");
        this.f158646w = loginSessionName;
        this.f158647x = duration;
        this.f158648y = platformProvider;
        this.f158649z = clock;
        this.f158643E = cacheDirectory;
        this.f158644F = client;
        this.f158645G = new C0682h0(17, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m119008a(C37084f0 c37084f0, AbstractC32269c abstractC32269c) {
        C37072b0 c37072b0;
        C37126x c37126x;
        Throwable e5;
        InterfaceC30063j context;
        C37130z c37130z;
        EnumC27905b enumC27905b;
        String qualifiedName;
        C34912a c34912a = c37084f0.f158649z;
        if (abstractC32269c instanceof C37072b0) {
            c37072b0 = (C37072b0) abstractC32269c;
            int i13 = c37072b0.f158602z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37072b0.f158602z = i13 - Integer.MIN_VALUE;
            } else {
                c37072b0 = new C37072b0(c37084f0, abstractC32269c);
            }
        } else {
            c37072b0 = new C37072b0(c37084f0, abstractC32269c);
        }
        Object objM96948A = c37072b0.f158600x;
        Object obj = EnumC31071a.f128113w;
        int i14 = c37072b0.f158602z;
        int i15 = 0;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM96948A);
            String str = c37084f0.f158646w;
            InterfaceC35967n interfaceC35967n = c37084f0.f158648y;
            String str2 = c37084f0.f158643E;
            c37072b0.f158602z = 1;
            objM96948A = AbstractC31484o.m96948A(str, interfaceC35967n, str2, c37072b0);
            if (objM96948A != obj) {
            }
            return obj;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c37126x = c37072b0.f158599w;
            try {
                AbstractC34132o.m107864I(objM96948A);
                return (C37126x) objM96948A;
            } catch (Exception e13) {
                e5 = e13;
                c34912a.getClass();
                C33647p c33647p = C34913b.f147015x;
                if (C33647p.m106274t().compareTo(c37126x.f158834f) >= 0) {
                    c37126x = null;
                }
                if (c37126x != null) {
                    c37084f0.m119011e(null, e5);
                    throw null;
                }
                context = c37072b0.getContext();
                c37130z = new C37130z(c37126x, c37084f0, i15);
                enumC27905b = EnumC27905b.f112507z;
                qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37084f0.class).getQualifiedName();
                if (qualifiedName != null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                }
                AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c37130z);
                return c37126x;
            }
        }
        AbstractC34132o.m107864I(objM96948A);
        C37126x c37126x2 = (C37126x) objM96948A;
        c34912a.getClass();
        C33647p c33647p2 = C34913b.f147015x;
        if (C33647p.m106274t().compareTo(c37126x2.f158834f.m110114c(c37084f0.f158647x)) < 0) {
            InterfaceC30063j context2 = c37072b0.getContext();
            C37128y c37128y = new C37128y(c37084f0, 0);
            EnumC27905b enumC27905b2 = EnumC27905b.f112507z;
            String qualifiedName2 = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37084f0.class).getQualifiedName();
            if (qualifiedName2 == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
            }
            AbstractC35903f.m113983A(context2, enumC27905b2, qualifiedName2, null, c37128y);
            return c37126x2;
        }
        try {
            c37072b0.f158599w = c37126x2;
            c37072b0.f158602z = 2;
            Object objM119009c = c37084f0.m119009c(c37126x2, c37072b0);
            if (objM119009c != obj) {
                c37126x = c37126x2;
                objM96948A = objM119009c;
                return (C37126x) objM96948A;
            }
            return obj;
        } catch (Exception e14) {
            c37126x = c37126x2;
            e5 = e14;
            c34912a.getClass();
            C33647p c33647p3 = C34913b.f147015x;
            if (C33647p.m106274t().compareTo(c37126x.f158834f) >= 0) {
                c37126x = null;
            }
            if (c37126x != null) {
                c37084f0.m119011e(null, e5);
                throw null;
            }
            context = c37072b0.getContext();
            c37130z = new C37130z(c37126x, c37084f0, i15);
            enumC27905b = EnumC27905b.f112507z;
            qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37084f0.class).getQualifiedName();
            if (qualifiedName != null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
            }
            AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c37130z);
            return c37126x;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) {
        C37078d0 c37078d0;
        if (abstractC32269c instanceof C37078d0) {
            c37078d0 = (C37078d0) abstractC32269c;
            int i13 = c37078d0.f158624y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37078d0.f158624y = i13 - Integer.MIN_VALUE;
            } else {
                c37078d0 = new C37078d0(this, abstractC32269c);
            }
        } else {
            c37078d0 = new C37078d0(this, abstractC32269c);
        }
        Object objM1706v = c37078d0.f158622w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37078d0.f158624y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM1706v);
            C0351c c0351c = new C0351c(this, interfaceC15761b, null, 13);
            c37078d0.f158624y = 1;
            objM1706v = this.f158645G.m1706v(c0351c, c37078d0);
            if (objM1706v == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM1706v);
        }
        C37126x c37126x = (C37126x) objM1706v;
        return AbstractC32306h.m100559g(c37126x.f158829a, c37126x.f158830b, c37126x.f158831c, c37126x.f158834f, "LOGIN", c37126x.f158832d);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m119009c(C37126x c37126x, AbstractC32269c abstractC32269c) {
        C37069a0 c37069a0;
        Object objM107888l;
        C37126x c37126x2;
        Object obj;
        C37126x c37126x3;
        Throwable thM68037a;
        InterfaceC30063j context;
        C37130z c37130z;
        EnumC27905b enumC27905b;
        String qualifiedName;
        InterfaceC30063j context2;
        C36965l c36965l;
        EnumC27905b enumC27905b2;
        String qualifiedName2;
        if (abstractC32269c instanceof C37069a0) {
            c37069a0 = (C37069a0) abstractC32269c;
            int i13 = c37069a0.f158588E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37069a0.f158588E = i13 - Integer.MIN_VALUE;
            } else {
                c37069a0 = new C37069a0(this, abstractC32269c);
            }
        } else {
            c37069a0 = new C37069a0(this, abstractC32269c);
        }
        Object objM119010d = c37069a0.f158591y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c37069a0.f158588E;
        int i15 = 1;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM119010d);
                InterfaceC30063j context3 = c37069a0.getContext();
                C37128y c37128y = new C37128y(this, 1);
                EnumC27905b enumC27905b3 = EnumC27905b.f112507z;
                String qualifiedName3 = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37084f0.class).getQualifiedName();
                if (qualifiedName3 == null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                }
                AbstractC35903f.m113983A(context3, enumC27905b3, qualifiedName3, null, c37128y);
                c37069a0.f158589w = c37126x;
                c37069a0.f158588E = 1;
                objM119010d = m119010d(c37126x, c37069a0);
                if (objM119010d == obj2) {
                }
                return obj2;
            }
            if (i14 == 1) {
                c37126x = c37069a0.f158589w;
                AbstractC34132o.m107864I(objM119010d);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c37069a0.f158590x;
                c37126x3 = c37069a0.f158589w;
                AbstractC34132o.m107864I(objM119010d);
            }
            c37126x2 = c37126x3;
            thM68037a = C23468n.m68037a(obj);
            if (thM68037a == null) {
                return obj;
            }
            this.f158649z.getClass();
            C33647p c33647p = C34913b.f147015x;
            if (C33647p.m106274t().compareTo(c37126x2.f158834f) >= 0) {
                context = c37069a0.getContext();
                c37130z = new C37130z(c37126x2, this, i15);
                enumC27905b = EnumC27905b.f112507z;
                qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37084f0.class).getQualifiedName();
                if (qualifiedName != null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                }
                AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c37130z);
                return c37126x2;
            }
            context2 = c37069a0.getContext();
            c36965l = new C36965l(17);
            enumC27905b2 = EnumC27905b.f112504w;
            qualifiedName2 = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37084f0.class).getQualifiedName();
            if (qualifiedName2 == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
            }
            AbstractC35903f.m113983A(context2, enumC27905b2, qualifiedName2, thM68037a, c36965l);
            m119011e(null, thM68037a);
            throw null;
            objM107888l = (C37126x) objM119010d;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Object obj3 = objM107888l;
        c37126x2 = c37126x;
        obj = obj3;
        if (!(obj instanceof C23467m)) {
            c37069a0.f158589w = c37126x2;
            c37069a0.f158590x = obj;
            c37069a0.f158588E = 2;
            if (m119012f((C37126x) obj, c37069a0) != obj2) {
                c37126x3 = c37126x2;
                c37126x2 = c37126x3;
            }
            return obj2;
        }
        thM68037a = C23468n.m68037a(obj);
        if (thM68037a == null) {
            return obj;
        }
        this.f158649z.getClass();
        C33647p c33647p2 = C34913b.f147015x;
        if (C33647p.m106274t().compareTo(c37126x2.f158834f) >= 0) {
            context = c37069a0.getContext();
            c37130z = new C37130z(c37126x2, this, i15);
            enumC27905b = EnumC27905b.f112507z;
            qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37084f0.class).getQualifiedName();
            if (qualifiedName != null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
            }
            AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c37130z);
            return c37126x2;
        }
        context2 = c37069a0.getContext();
        c36965l = new C36965l(17);
        enumC27905b2 = EnumC27905b.f112504w;
        qualifiedName2 = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37084f0.class).getQualifiedName();
        if (qualifiedName2 == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
        }
        AbstractC35903f.m113983A(context2, enumC27905b2, qualifiedName2, thM68037a, c36965l);
        m119011e(null, thM68037a);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0153 A[Catch: all -> 0x002d, TryCatch #7 {all -> 0x002d, blocks: (B:12:0x0027, B:28:0x0102, B:47:0x014f, B:49:0x0153, B:51:0x015d, B:53:0x0161, B:55:0x0165, B:57:0x0169, B:58:0x016e, B:59:0x016f, B:60:0x0170, B:61:0x0175, B:62:0x0176, B:63:0x017b, B:64:0x017c, B:65:0x0181, B:66:0x0182), top: B:74:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x015d A[Catch: all -> 0x002d, TryCatch #7 {all -> 0x002d, blocks: (B:12:0x0027, B:28:0x0102, B:47:0x014f, B:49:0x0153, B:51:0x015d, B:53:0x0161, B:55:0x0165, B:57:0x0169, B:58:0x016e, B:59:0x016f, B:60:0x0170, B:61:0x0175, B:62:0x0176, B:63:0x017b, B:64:0x017c, B:65:0x0181, B:66:0x0182), top: B:74:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0161 A[Catch: all -> 0x002d, TryCatch #7 {all -> 0x002d, blocks: (B:12:0x0027, B:28:0x0102, B:47:0x014f, B:49:0x0153, B:51:0x015d, B:53:0x0161, B:55:0x0165, B:57:0x0169, B:58:0x016e, B:59:0x016f, B:60:0x0170, B:61:0x0175, B:62:0x0176, B:63:0x017b, B:64:0x017c, B:65:0x0181, B:66:0x0182), top: B:74:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0165 A[Catch: all -> 0x002d, TryCatch #7 {all -> 0x002d, blocks: (B:12:0x0027, B:28:0x0102, B:47:0x014f, B:49:0x0153, B:51:0x015d, B:53:0x0161, B:55:0x0165, B:57:0x0169, B:58:0x016e, B:59:0x016f, B:60:0x0170, B:61:0x0175, B:62:0x0176, B:63:0x017b, B:64:0x017c, B:65:0x0181, B:66:0x0182), top: B:74:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0169 A[Catch: all -> 0x002d, TryCatch #7 {all -> 0x002d, blocks: (B:12:0x0027, B:28:0x0102, B:47:0x014f, B:49:0x0153, B:51:0x015d, B:53:0x0161, B:55:0x0165, B:57:0x0169, B:58:0x016e, B:59:0x016f, B:60:0x0170, B:61:0x0175, B:62:0x0176, B:63:0x017b, B:64:0x017c, B:65:0x0181, B:66:0x0182), top: B:74:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:59:0x016f A[Catch: all -> 0x002d, TryCatch #7 {all -> 0x002d, blocks: (B:12:0x0027, B:28:0x0102, B:47:0x014f, B:49:0x0153, B:51:0x015d, B:53:0x0161, B:55:0x0165, B:57:0x0169, B:58:0x016e, B:59:0x016f, B:60:0x0170, B:61:0x0175, B:62:0x0176, B:63:0x017b, B:64:0x017c, B:65:0x0181, B:66:0x0182), top: B:74:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0170 A[Catch: all -> 0x002d, TryCatch #7 {all -> 0x002d, blocks: (B:12:0x0027, B:28:0x0102, B:47:0x014f, B:49:0x0153, B:51:0x015d, B:53:0x0161, B:55:0x0165, B:57:0x0169, B:58:0x016e, B:59:0x016f, B:60:0x0170, B:61:0x0175, B:62:0x0176, B:63:0x017b, B:64:0x017c, B:65:0x0181, B:66:0x0182), top: B:74:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0176 A[Catch: all -> 0x002d, TryCatch #7 {all -> 0x002d, blocks: (B:12:0x0027, B:28:0x0102, B:47:0x014f, B:49:0x0153, B:51:0x015d, B:53:0x0161, B:55:0x0165, B:57:0x0169, B:58:0x016e, B:59:0x016f, B:60:0x0170, B:61:0x0175, B:62:0x0176, B:63:0x017b, B:64:0x017c, B:65:0x0181, B:66:0x0182), top: B:74:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:64:0x017c A[Catch: all -> 0x002d, TryCatch #7 {all -> 0x002d, blocks: (B:12:0x0027, B:28:0x0102, B:47:0x014f, B:49:0x0153, B:51:0x015d, B:53:0x0161, B:55:0x0165, B:57:0x0169, B:58:0x016e, B:59:0x016f, B:60:0x0170, B:61:0x0175, B:62:0x0176, B:63:0x017b, B:64:0x017c, B:65:0x0181, B:66:0x0182), top: B:74:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0182 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #7 {all -> 0x002d, blocks: (B:12:0x0027, B:28:0x0102, B:47:0x014f, B:49:0x0153, B:51:0x015d, B:53:0x0161, B:55:0x0165, B:57:0x0169, B:58:0x016e, B:59:0x016f, B:60:0x0170, B:61:0x0175, B:62:0x0176, B:63:0x017b, B:64:0x017c, B:65:0x0181, B:66:0x0182), top: B:74:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX INFO: renamed from: d */
    public final Object m119010d(C37126x c37126x, AbstractC32269c abstractC32269c) throws Throwable {
        C37075c0 c37075c0;
        Throwable th3;
        ?? r10;
        Exception exc;
        Throwable th4;
        Exception exc2;
        C37126x c37126x2;
        C39422a c39422a;
        AbstractC4434n abstractC4434n;
        if (abstractC32269c instanceof C37075c0) {
            c37075c0 = (C37075c0) abstractC32269c;
            int i13 = c37075c0.f158610E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37075c0.f158610E = i13 - Integer.MIN_VALUE;
            } else {
                c37075c0 = new C37075c0(this, abstractC32269c);
            }
        } else {
            c37075c0 = new C37075c0(this, abstractC32269c);
        }
        Object objM125935b = c37075c0.f158613y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37075c0.f158610E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM125935b);
                C39422a c39422a2 = this.f158644F;
                AbstractC22676k.m65750j(c39422a2, "<this>");
                C39427f c39427f = c39422a2.f169597w;
                c39427f.getClass();
                C39426e c39426e = new C39426e();
                String str = c39427f.f169643y;
                AbstractC22676k.m65750j(str, "<set-?>");
                c39426e.f169611c = str;
                c39426e.f169612d = c39427f.f169644z;
                c39426e.f169613e = c39427f.f169627E;
                c39426e.f169614f = c39427f.f169628F;
                C25271y c25271y = c39427f.f169629G;
                AbstractC22676k.m65750j(c25271y, "<set-?>");
                c39426e.f169615g = c25271y;
                c39426e.f169616h = c39427f.f169630H;
                c39426e.f169617i = c39427f.f169631I;
                c39426e.f169618j = c39427f.f169632J;
                c39426e.f169609a.m133455G((InterfaceC29123a) c39427f.f169641w.f2818x);
                c39426e.f169619k = AbstractC25265s.m74097F1(c39427f.f169633K);
                c39426e.f169620l = c39427f.f169634L;
                c39426e.f169621m = c39427f.f169635M;
                c39426e.mo14182h((C13166o) c39427f.f169642x.f3422w);
                c39426e.f169622n = c39427f.f169636N;
                c39426e.f169623o = Boolean.valueOf(c39427f.f169637O);
                c39426e.f169624p = Boolean.valueOf(c39427f.f169638P);
                c39426e.f169625q = c39427f.f169639Q;
                c39426e.f169626r = c39427f.f169640R;
                c39426e.f169619k.add(new C37077d(c37126x.f158838j));
                C39422a c39422a3 = new C39422a(new C39427f(c39426e));
                try {
                    C31624i c31624i = new C31624i(12);
                    try {
                        C4421a c4421a = new C4421a(1);
                        c4421a.f17885b = c37126x.f158837i;
                        c4421a.f17886c = UserSessionDtoKt.REFRESH_TOKEN;
                        c4421a.f17887d = c37126x.f158835g;
                        c31624i.f130665x = new C4424d(c4421a);
                        try {
                            C4423c c4423c = new C4423c(c31624i);
                            c37075c0.f158611w = c37126x;
                            c37075c0.f158612x = c39422a3;
                            c37075c0.f158610E = 1;
                            objM125935b = c39422a3.m125935b(c4423c, c37075c0);
                            if (objM125935b == enumC31071a) {
                                return enumC31071a;
                            }
                            c37126x2 = c37126x;
                            c39422a = c39422a3;
                        } catch (Exception e5) {
                            exc2 = e5;
                            exc = exc2;
                            if (exc instanceof AccessDeniedException) {
                                throw exc;
                            }
                            abstractC4434n = ((AccessDeniedException) exc).f8369z;
                            if (!(abstractC4434n instanceof C4427g)) {
                                m119011e("Unable to complete the login process due to an expired authorization code. Please reauthenticate using 'aws login'.", exc);
                                throw null;
                            }
                            if (!(abstractC4434n instanceof C4432l)) {
                                m119011e("Your session has expired. Please reauthenticate.", exc);
                                throw null;
                            }
                            if (!(abstractC4434n instanceof C4433m)) {
                                m119011e("Unable to refresh credentials because of a change in your password. Please reauthenticate with your new password.", exc);
                                throw null;
                            }
                            if (abstractC4434n instanceof C4428h) {
                                throw exc;
                            }
                            m119011e("Unable to refresh credentials due to insufficient permissions. You may be missing permission for the 'CreateOAuth2Token' action.", exc);
                            throw null;
                        } catch (Throwable th5) {
                            th4 = th5;
                            th3 = th4;
                            r10 = c39422a3;
                            try {
                                r10.close();
                                throw th3;
                            } catch (Throwable th6) {
                                AbstractC29125c.m88530g(th3, th6);
                                throw th3;
                            }
                        }
                    } catch (Exception e13) {
                        exc2 = e13;
                    } catch (Throwable th7) {
                        th4 = th7;
                    }
                } catch (Exception e14) {
                    exc = e14;
                } catch (Throwable th8) {
                    th3 = th8;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c39422a = c37075c0.f158612x;
                C37126x c37126x3 = c37075c0.f158611w;
                try {
                    AbstractC34132o.m107864I(objM125935b);
                    c37126x2 = c37126x3;
                } catch (Exception e15) {
                    exc = e15;
                    if (exc instanceof AccessDeniedException) {
                        throw exc;
                    }
                    abstractC4434n = ((AccessDeniedException) exc).f8369z;
                    if (!(abstractC4434n instanceof C4427g)) {
                        m119011e("Unable to complete the login process due to an expired authorization code. Please reauthenticate using 'aws login'.", exc);
                        throw null;
                    }
                    if (!(abstractC4434n instanceof C4432l)) {
                        m119011e("Your session has expired. Please reauthenticate.", exc);
                        throw null;
                    }
                    if (!(abstractC4434n instanceof C4433m)) {
                        m119011e("Unable to refresh credentials because of a change in your password. Please reauthenticate with your new password.", exc);
                        throw null;
                    }
                    if (abstractC4434n instanceof C4428h) {
                        throw exc;
                    }
                    m119011e("Unable to refresh credentials due to insufficient permissions. You may be missing permission for the 'CreateOAuth2Token' action.", exc);
                    throw null;
                }
            }
            C4426f c4426f = ((C4425e) objM125935b).f17895a;
            AbstractC22676k.m65747g(c4426f);
            C4422b c4422b = c4426f.f17896a;
            AbstractC22676k.m65747g(c4422b);
            String str2 = c4422b.f17888a;
            C4422b c4422b2 = c4426f.f17896a;
            String str3 = c4422b2.f17889b;
            String str4 = c4422b2.f17890c;
            this.f158649z.getClass();
            C33647p c33647p = C34913b.f147015x;
            C34913b c34913bM106274t = C33647p.m106274t();
            Duration.Companion companion = Duration.INSTANCE;
            C37126x c37126xM119039a = C37126x.m119039a(c37126x2, str2, str3, str4, c34913bM106274t.m110115d(DurationKt.toDuration(c4426f.f17897b, DurationUnit.SECONDS)), c4426f.f17899d);
            c39422a.close();
            return c37126xM119039a;
        } catch (Throwable th9) {
            th3 = th9;
            r10 = c37126x;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m119011e(String message, Throwable th3) {
        if (message == null) {
            message = AbstractC25012a.m73376i(this.f158646w, " is expired", new StringBuilder("Login token for login-session: "));
        }
        AbstractC22676k.m65750j(message, "message");
        throw new InvalidLoginTokenException(message, th3);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m119012f(C37126x token, AbstractC32269c abstractC32269c) throws Exception {
        C37081e0 c37081e0;
        Exception e5;
        String str;
        InterfaceC30063j context;
        C1926a c1926a;
        EnumC27905b enumC27905b;
        String qualifiedName;
        if (abstractC32269c instanceof C37081e0) {
            c37081e0 = (C37081e0) abstractC32269c;
            int i13 = c37081e0.f158635z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37081e0.f158635z = i13 - Integer.MIN_VALUE;
            } else {
                c37081e0 = new C37081e0(this, abstractC32269c);
            }
        } else {
            c37081e0 = new C37081e0(this, abstractC32269c);
        }
        Object obj = c37081e0.f158633x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37081e0.f158635z;
        int i15 = 12;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c37081e0.f158632w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Exception e13) {
                e5 = e13;
                context = c37081e0.getContext();
                c1926a = new C1926a(str, i15);
                enumC27905b = EnumC27905b.f112507z;
                qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37084f0.class).getQualifiedName();
                if (qualifiedName == null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                }
                AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, e5, c1926a);
                throw e5;
            }
        }
        AbstractC34132o.m107864I(obj);
        String[] strArr = {this.f158643E, AbstractC31484o.m96970v(this.f158646w)};
        InterfaceC35967n interfaceC35967n = this.f158648y;
        String strM121486z = AbstractC37926s0.m121486z(AbstractC37131z0.m119045b(interfaceC35967n, strArr), interfaceC35967n);
        AbstractC22676k.m65750j(token, "token");
        C12803b c12803b = new C12803b(true);
        c12803b.m35863f();
        c12803b.m35874q("accessToken");
        c12803b.m35863f();
        String str2 = token.f158829a;
        c12803b.m35874q("accessKeyId");
        c12803b.m35875r(str2);
        String str3 = token.f158830b;
        c12803b.m35874q("secretAccessKey");
        c12803b.m35875r(str3);
        String str4 = token.f158831c;
        c12803b.m35874q("sessionToken");
        c12803b.m35875r(str4);
        String str5 = token.f158832d;
        c12803b.m35874q("accountId");
        c12803b.m35875r(str5);
        String strM110113b = token.f158834f.m110113b(EnumC34931t.f147048w);
        if (strM110113b != null) {
            c12803b.m35874q("expiresAt");
            c12803b.m35875r(strM110113b);
        }
        c12803b.m35868k();
        String str6 = token.f158833e;
        if (str6 != null) {
            c12803b.m35874q("tokenType");
            c12803b.m35875r(str6);
        }
        String str7 = token.f158835g;
        c12803b.m35874q("refreshToken");
        c12803b.m35875r(str7);
        String str8 = token.f158836h;
        if (str8 != null) {
            c12803b.m35874q("idToken");
            c12803b.m35875r(str8);
        }
        String str9 = token.f158837i;
        c12803b.m35874q("clientId");
        c12803b.m35875r(str9);
        String str10 = token.f158838j;
        c12803b.m35874q("dpopKey");
        c12803b.m35875r(str10);
        c12803b.m35868k();
        byte[] bArrM35869l = c12803b.m35869l();
        try {
            c37081e0.f158632w = strM121486z;
            c37081e0.f158635z = 1;
            C22365e c22365e = AbstractC3050q0.f12077a;
            Object objM8705K = AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new C27486p(strM121486z, bArrM35869l, null, i15), c37081e0);
            if (objM8705K != enumC31071a) {
                objM8705K = c23454a0;
            }
            return objM8705K == enumC31071a ? enumC31071a : c23454a0;
        } catch (Exception e14) {
            e5 = e14;
            str = strM121486z;
            context = c37081e0.getContext();
            c1926a = new C1926a(str, i15);
            enumC27905b = EnumC27905b.f112507z;
            qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37084f0.class).getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
            }
            AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, e5, c1926a);
            throw e5;
        }
    }
}
