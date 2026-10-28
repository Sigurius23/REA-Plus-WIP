package p579wc;

import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bg.AbstractC3210e;
import bg.C3206a;
import bg.C3207b;
import bg.C3208c;
import bg.C3209d;
import bg.C3211f;
import bg.C3217l;
import bg.InterfaceC3212g;
import cg.C4559n;
import cg.C4560o;
import gf.InterfaceC15761b;
import gm.C15990r;
import ie.EnumC18438a;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import m63.C25126d;
import m83.AbstractC25265s;
import p088dc.AbstractC11894a;
import p088dc.AbstractC11895b;
import p089dd.C11942b;
import p127ev.C13668i;
import p250jf.AbstractC21636e;
import p250jf.C21632a;
import p319m4.AbstractC25012a;
import p326mf.C25501u;
import p368og.InterfaceC27910g;
import p474s.AbstractC32004s;
import p484s9.AbstractC32281f;
import p505ts.AbstractC34132o;
import p508ty.C34249c;
import p550vd.AbstractC35903f;
import p646yd.AbstractC39455f;
import p647yf.AbstractC39497j;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.InterfaceC29123a;
import q83.InterfaceC30063j;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import ve.C35920e;
import ve.InterfaceC35918c;
import vg.C35971r;
import vg.InterfaceC35967n;
import vv1.C36532c;
import w91.C36965l;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: wc.i */
/* JADX INFO: loaded from: classes.dex */
public final class C37092i implements InterfaceC35918c {

    /* JADX INFO: renamed from: w */
    public final InterfaceC35967n f158679w;

    /* JADX INFO: renamed from: x */
    public final C3207b f158680x;

    /* JADX INFO: renamed from: y */
    public final boolean f158681y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC29123a f158682z;

    public C37092i(InterfaceC35967n interfaceC35967n, InterfaceC29123a interfaceC29123a) {
        InterfaceC3212g.f12569a.getClass();
        C3207b c3207b = C3207b.f12563b;
        this.f158679w = interfaceC35967n;
        this.f158680x = c3207b;
        this.f158681y = false;
        this.f158682z = interfaceC29123a;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) throws Exception {
        C37086g c37086g;
        InterfaceC27910g interfaceC27910g;
        String str;
        String str2;
        C4560o c4560oM14242a;
        InterfaceC27910g interfaceC27910g2;
        if (abstractC32269c instanceof C37086g) {
            c37086g = (C37086g) abstractC32269c;
            int i13 = c37086g.f158650E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37086g.f158650E = i13 - Integer.MIN_VALUE;
            } else {
                c37086g = new C37086g(this, abstractC32269c);
            }
        } else {
            c37086g = new C37086g(this, abstractC32269c);
        }
        Object objM99554w = c37086g.f158653y;
        Object obj = EnumC31071a.f128113w;
        int i14 = c37086g.f158650E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM99554w);
            InterfaceC30063j context = c37086g.getContext();
            String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37092i.class).getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
            }
            C15990r c15990rM113984B = AbstractC35903f.m113984B(context, qualifiedName);
            c37086g.f158651w = c15990rM113984B;
            c37086g.f158650E = 1;
            Object objM119014h = m119014h(c37086g);
            if (objM119014h != obj) {
                interfaceC27910g = c15990rM113984B;
                objM99554w = objM119014h;
            }
            return obj;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC27910g2 = c37086g.f158651w;
                try {
                    AbstractC34132o.m107864I(objM99554w);
                    C35920e c35920e = (C35920e) objM99554w;
                    interfaceC27910g2.mo396u(null, new C36532c(c35920e, 6));
                    return AbstractC11894a.m31950R(c35920e, EnumC18438a.CREDENTIALS_HTTP);
                } catch (Exception e5) {
                    e = e5;
                    interfaceC27910g2.mo396u(null, new C36965l(13));
                    if (e instanceof CredentialsProviderException) {
                        throw e;
                    }
                    throw new CredentialsProviderException(e, "Failed to get credentials from container metadata service");
                }
            }
            str2 = c37086g.f158652x;
            interfaceC27910g = c37086g.f158651w;
            AbstractC34132o.m107864I(objM99554w);
            C4560o c4560o = (C4560o) objM99554w;
            str = str2;
            c4560oM14242a = c4560o;
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            C13668i c13668i = new C13668i(c22673i0.getOrCreateKotlinClass(C23454a0.class), c22673i0.getOrCreateKotlinClass(C35920e.class));
            c13668i.m38539j(new C37098k(str));
            c13668i.m38537h(new C11942b(14));
            c13668i.m38538i("EcsCredentialsProvider");
            c13668i.m38540k("EcsContainerMetadata");
            c13668i.m38534e().m56169l(new C34249c(c4560oM14242a, 17));
            C25126d c25126dM38530a = c13668i.m38530a();
            interfaceC27910g.mo396u(null, new C36965l(12));
            C25501u c25501u = new C25501u(this.f158682z);
            try {
                C23454a0 c23454a0 = C23454a0.f92919a;
                c37086g.f158651w = interfaceC27910g;
                c37086g.f158652x = null;
                c37086g.f158650E = 3;
                objM99554w = AbstractC32004s.m99554w(c25126dM38530a, c25501u, c23454a0, c37086g);
                if (objM99554w != obj) {
                    interfaceC27910g2 = interfaceC27910g;
                    C35920e c35920e2 = (C35920e) objM99554w;
                    interfaceC27910g2.mo396u(null, new C36532c(c35920e2, 6));
                    return AbstractC11894a.m31950R(c35920e2, EnumC18438a.CREDENTIALS_HTTP);
                }
                return obj;
            } catch (Exception e13) {
                e = e13;
                interfaceC27910g2 = interfaceC27910g;
                interfaceC27910g2.mo396u(null, new C36965l(13));
                if (e instanceof CredentialsProviderException) {
                    throw e;
                }
                throw new CredentialsProviderException(e, "Failed to get credentials from container metadata service");
            }
        }
        interfaceC27910g = c37086g.f158651w;
        AbstractC34132o.m107864I(objM99554w);
        str = (String) objM99554w;
        C21632a c21632aM125998d = AbstractC39455f.m125998d();
        InterfaceC35967n interfaceC35967n = this.f158679w;
        String str3 = (String) AbstractC21636e.m60881b(c21632aM125998d, interfaceC35967n);
        String str4 = (String) AbstractC21636e.m60881b(AbstractC39455f.m125997c(), interfaceC35967n);
        if (str3 != null && !AbstractC39414r.m125890i0(str3)) {
            try {
                c4560oM14242a = C4559n.m14242a(C4560o.f18367i, "http://169.254.170.2".concat(str3));
                C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                C13668i c13668i2 = new C13668i(c22673i1.getOrCreateKotlinClass(C23454a0.class), c22673i1.getOrCreateKotlinClass(C35920e.class));
                c13668i2.m38539j(new C37098k(str));
                c13668i2.m38537h(new C11942b(14));
                c13668i2.m38538i("EcsCredentialsProvider");
                c13668i2.m38540k("EcsContainerMetadata");
                c13668i2.m38534e().m56169l(new C34249c(c4560oM14242a, 17));
                C25126d c25126dM38530a2 = c13668i2.m38530a();
                interfaceC27910g.mo396u(null, new C36965l(12));
                C25501u c25501u2 = new C25501u(this.f158682z);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c37086g.f158651w = interfaceC27910g;
                c37086g.f158652x = null;
                c37086g.f158650E = 3;
                objM99554w = AbstractC32004s.m99554w(c25126dM38530a2, c25501u2, c23454a1, c37086g);
                if (objM99554w != obj) {
                    interfaceC27910g2 = interfaceC27910g;
                    C35920e c35920e3 = (C35920e) objM99554w;
                    interfaceC27910g2.mo396u(null, new C36532c(c35920e3, 6));
                    return AbstractC11894a.m31950R(c35920e3, EnumC18438a.CREDENTIALS_HTTP);
                }
            } catch (Exception e14) {
                throw new ProviderConfigurationException(AbstractC31061c.m95633i('`', "Invalid relativeUri `", str3), e14);
            }
        } else {
            if (str4 == null || AbstractC39414r.m125890i0(str4)) {
                throw new ProviderConfigurationException("Container credentials URI not set");
            }
            c37086g.f158651w = interfaceC27910g;
            c37086g.f158652x = str;
            c37086g.f158650E = 2;
            Object objM119016k = m119016k(str4, c37086g);
            if (objM119016k != obj) {
                objM99554w = objM119016k;
                str2 = str;
                C4560o c4560o2 = (C4560o) objM99554w;
                str = str2;
                c4560oM14242a = c4560o2;
                C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                C13668i c13668i3 = new C13668i(c22673i2.getOrCreateKotlinClass(C23454a0.class), c22673i2.getOrCreateKotlinClass(C35920e.class));
                c13668i3.m38539j(new C37098k(str));
                c13668i3.m38537h(new C11942b(14));
                c13668i3.m38538i("EcsCredentialsProvider");
                c13668i3.m38540k("EcsContainerMetadata");
                c13668i3.m38534e().m56169l(new C34249c(c4560oM14242a, 17));
                C25126d c25126dM38530a3 = c13668i3.m38530a();
                interfaceC27910g.mo396u(null, new C36965l(12));
                C25501u c25501u3 = new C25501u(this.f158682z);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c37086g.f158651w = interfaceC27910g;
                c37086g.f158652x = null;
                c37086g.f158650E = 3;
                objM99554w = AbstractC32004s.m99554w(c25126dM38530a3, c25501u3, c23454a2, c37086g);
                if (objM99554w != obj) {
                    interfaceC27910g2 = interfaceC27910g;
                    C35920e c35920e4 = (C35920e) objM99554w;
                    interfaceC27910g2.mo396u(null, new C36532c(c35920e4, 6));
                    return AbstractC11894a.m31950R(c35920e4, EnumC18438a.CREDENTIALS_HTTP);
                }
            }
        }
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f158681y) {
            AbstractC39497j.m126157b(this.f158682z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m119014h(AbstractC32269c abstractC32269c) {
        C37080e c37080e;
        String str;
        if (abstractC32269c instanceof C37080e) {
            c37080e = (C37080e) abstractC32269c;
            int i13 = c37080e.f158631y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37080e.f158631y = i13 - Integer.MIN_VALUE;
            } else {
                c37080e = new C37080e(this, abstractC32269c);
            }
        } else {
            c37080e = new C37080e(this, abstractC32269c);
        }
        Object objM119015i = c37080e.f158629w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c37080e.f158631y;
        InterfaceC35967n interfaceC35967n = this.f158679w;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM119015i);
            String str2 = (String) AbstractC21636e.m60881b(AbstractC39455f.m125996b(), interfaceC35967n);
            if (str2 != null) {
                c37080e.f158631y = 1;
                objM119015i = m119015i(str2, c37080e);
                if (objM119015i == obj) {
                    return obj;
                }
            } else {
                str = (String) AbstractC21636e.m60881b(AbstractC39455f.m125995a(), interfaceC35967n);
                if (str == null) {
                    return null;
                }
            }
            if (AbstractC39414r.m125876U(str, "\r\n", false)) {
                throw new CredentialsProviderException("Token contains illegal line break sequence.");
            }
            return str;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM119015i);
        str = (String) objM119015i;
        if (str == null) {
            str = (String) AbstractC21636e.m60881b(AbstractC39455f.m125995a(), interfaceC35967n);
            if (str == null) {
                return null;
            }
        }
        if (AbstractC39414r.m125876U(str, "\r\n", false)) {
            return str;
        }
        throw new CredentialsProviderException("Token contains illegal line break sequence.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m119015i(String str, AbstractC32269c abstractC32269c) {
        C37083f c37083f;
        if (abstractC32269c instanceof C37083f) {
            c37083f = (C37083f) abstractC32269c;
            int i13 = c37083f.f158642y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37083f.f158642y = i13 - Integer.MIN_VALUE;
            } else {
                c37083f = new C37083f(this, abstractC32269c);
            }
        } else {
            c37083f = new C37083f(this, abstractC32269c);
        }
        Object objM114209d = c37083f.f158640w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c37083f.f158642y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM114209d);
            c37083f.f158642y = 1;
            objM114209d = ((C35971r) this.f158679w).m114209d(str, c37083f);
            if (objM114209d == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM114209d);
        }
        byte[] bArr = (byte[]) objM114209d;
        if (bArr != null) {
            return AbstractC39421y.m125916A(bArr);
        }
        throw new CredentialsProviderException("Could not read token file.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m119016k(String str, AbstractC32269c abstractC32269c) {
        C37089h c37089h;
        C4560o c4560oM14242a;
        Object objM8705K;
        Throwable th3;
        String str2;
        if (abstractC32269c instanceof C37089h) {
            c37089h = (C37089h) abstractC32269c;
            int i13 = c37089h.f158666E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37089h.f158666E = i13 - Integer.MIN_VALUE;
            } else {
                c37089h = new C37089h(this, abstractC32269c);
            }
        } else {
            c37089h = new C37089h(this, abstractC32269c);
        }
        Object obj = c37089h.f158669y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37089h.f158666E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                c4560oM14242a = C4559n.m14242a(C4560o.f18367i, str);
                AbstractC3210e abstractC3210e = c4560oM14242a.f18369b;
                if (!AbstractC22676k.m65745e(c4560oM14242a.f18368a, C3217l.f12583c)) {
                    if (abstractC3210e instanceof C3209d) {
                        if (!AbstractC37095j.f158690a.contains(((C3209d) abstractC3210e).f12566a)) {
                            throw new ProviderConfigurationException(AbstractC25012a.m73376i(AbstractC25265s.m74110N0(AbstractC37095j.f158690a, null, null, null, null, 63), "].", AbstractC18489d0.m53375p("The container credentials full URI (", str, ") has an invalid host. Host can only be one of [")));
                        }
                    } else {
                        if (!(abstractC3210e instanceof C3208c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        try {
                            C3207b c3207b = this.f158680x;
                            String str3 = ((C3208c) abstractC3210e).f12565a;
                            c37089h.f158667w = str;
                            c37089h.f158668x = c4560oM14242a;
                            c37089h.f158666E = 1;
                            c3207b.getClass();
                            C22365e c22365e = AbstractC3050q0.f12077a;
                            objM8705K = AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new C3206a(0, str3, null), c37089h);
                            if (objM8705K == enumC31071a) {
                                return enumC31071a;
                            }
                        } catch (Throwable th4) {
                            str2 = str;
                            th3 = th4;
                            StringBuilder sbM53375p = AbstractC18489d0.m53375p("The container credentials full URI (", str2, ") is specified via a hostname whose IP address(es) could not be resolved. ");
                            sbM53375p.append(th3.getMessage());
                            throw new ProviderConfigurationException(sbM53375p.toString(), th3);
                        }
                    }
                }
                return c4560oM14242a;
            } catch (Exception e5) {
                throw new ProviderConfigurationException(AbstractC31061c.m95633i('`', "Invalid fullUri `", str), e5);
            }
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4560o c4560o = c37089h.f158668x;
        str2 = c37089h.f158667w;
        try {
            AbstractC34132o.m107864I(obj);
            objM8705K = obj;
            c4560oM14242a = c4560o;
            str = str2;
        } catch (Throwable th5) {
            th3 = th5;
            StringBuilder sbM53375p2 = AbstractC18489d0.m53375p("The container credentials full URI (", str2, ") is specified via a hostname whose IP address(es) could not be resolved. ");
            sbM53375p2.append(th3.getMessage());
            throw new ProviderConfigurationException(sbM53375p2.toString(), th3);
        }
        List list = (List) objM8705K;
        if (!list.isEmpty()) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((C3211f) it.next()).m9254a().mo5409C()) {
                    }
                }
            }
            return c4560oM14242a;
        }
        throw new ProviderConfigurationException(AbstractC11895b.m31996o("The container credentials full URI (", str, ") is specified via a hostname whose IP address(es) do not resolve to the loopback device."));
    }

    public final String toString() {
        return AbstractC32281f.m100455w(this);
    }
}
