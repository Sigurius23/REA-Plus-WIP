package v10;

import a30.C0323s;
import android.content.Context;
import b10.InterfaceC2227c1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import com.stripe.android.model.StripeIntent$NextActionType;
import com.stripe.android.model.StripeIntent$Status;
import gm.C15982j;
import java.util.List;
import java.util.Set;
import k83.InterfaceC22297a;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25265s;
import p442qy.C30765d;
import p470rv.C31821a;
import p505ts.AbstractC34132o;
import p537ux.AbstractC35345m0;
import p664yy.C39857f;
import p715kotlin.jvm.internal.C22667f0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;
import y00.AbstractC38812d8;
import y00.C38887l3;
import y00.C38915o4;
import y00.EnumC38828f4;
import y00.InterfaceC38802c8;
import y00.InterfaceC38932q3;

/* JADX INFO: renamed from: v10.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35531g {

    /* JADX INFO: renamed from: f */
    public static final List f151174f = AbstractC37056f.m118958J("payment_method");

    /* JADX INFO: renamed from: a */
    public final InterfaceC22297a f151175a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2227c1 f151176b;

    /* JADX INFO: renamed from: c */
    public final C30765d f151177c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC30063j f151178d;

    /* JADX INFO: renamed from: e */
    public final C15982j f151179e;

    public AbstractC35531g(Context context, InterfaceC22297a interfaceC22297a, InterfaceC2227c1 interfaceC2227c1, C30765d c30765d, InterfaceC30063j interfaceC30063j) {
        this.f151175a = interfaceC22297a;
        this.f151176b = interfaceC2227c1;
        this.f151177c = c30765d;
        this.f151178d = interfaceC30063j;
        this.f151179e = new C15982j(context, 5);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: a */
    public static final Object m112684a(AbstractC35531g abstractC35531g, InterfaceC38802c8 interfaceC38802c8, String str, C39857f c39857f, long j7, AbstractC32269c abstractC32269c) {
        C35529e c35529e;
        String str2;
        AbstractC35531g abstractC35531g2;
        C22669g0 c22669g0;
        C39857f c39857f2;
        EnumC38828f4 enumC38828f4;
        InterfaceC38932q3 interfaceC38932q3;
        Object objMo112691g;
        C22669g0 c22669g1;
        if (abstractC32269c instanceof C35529e) {
            c35529e = (C35529e) abstractC32269c;
            int i13 = c35529e.f151166G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35529e.f151166G = i13 - Integer.MIN_VALUE;
            } else {
                c35529e = new C35529e(abstractC35531g, abstractC32269c);
            }
        } else {
            c35529e = new C35529e(abstractC35531g, abstractC32269c);
        }
        C35529e c35529e2 = c35529e;
        Object obj = c35529e2.f151164E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35529e2.f151166G;
        if (i14 != 0) {
            if (i14 == 1) {
                c22669g0 = c35529e2.f151170z;
                c39857f2 = c35529e2.f151169y;
                String str3 = (String) c35529e2.f151168x;
                AbstractC35531g abstractC35531g3 = (AbstractC35531g) c35529e2.f151167w;
                AbstractC34132o.m107864I(obj);
                str2 = str3;
                abstractC35531g2 = abstractC35531g3;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22669g0 = (C22669g0) c35529e2.f151168x;
                c22669g1 = (C22669g0) c35529e2.f151167w;
                AbstractC34132o.m107864I(obj);
                objMo112691g = ((C23468n) obj).f92940w;
            }
            c22669g0.f89336w = new C23468n(objMo112691g);
            c22669g0 = c22669g1;
            return ((C23468n) c22669g0.f89336w).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C22667f0 c22667f0 = new C22667f0();
        c22667f0.f89335w = j7;
        C22669g0 c22669g2 = new C22669g0();
        C38915o4 c38915o4Mo124330Y = interfaceC38802c8.mo124330Y();
        long jMo124362u = ((c38915o4Mo124330Y == null || (enumC38828f4 = c38915o4Mo124330Y.f167511E) == null || (interfaceC38932q3 = enumC38828f4.f167131F) == null) ? 15000L : interfaceC38932q3.mo124362u()) - (System.currentTimeMillis() - j7);
        str2 = str;
        C0323s c0323s = new C0323s(c22669g2, abstractC35531g, str2, c39857f, c22667f0, null, 5);
        c35529e2.f151167w = abstractC35531g;
        c35529e2.f151168x = str2;
        c35529e2.f151169y = c39857f;
        c35529e2.f151170z = c22669g2;
        c35529e2.f151166G = 1;
        if (AbstractC3028k2.m8750d(jMo124362u, c0323s, c35529e2) != enumC31071a) {
            abstractC35531g2 = abstractC35531g;
            c22669g0 = c22669g2;
            c39857f2 = c39857f;
        }
        return enumC31071a;
        C23468n c23468n = (C23468n) c22669g0.f89336w;
        abstractC35531g2.getClass();
        if (m112686h(c23468n) || c22669g0.f89336w == null) {
            c35529e2.f151167w = c22669g0;
            c35529e2.f151168x = c22669g0;
            c35529e2.f151169y = null;
            c35529e2.f151170z = null;
            c35529e2.f151166G = 2;
            objMo112691g = abstractC35531g2.mo112691g(str2, c39857f2, f151174f, c35529e2);
            if (objMo112691g != enumC31071a) {
                c22669g1 = c22669g0;
                c22669g0.f89336w = new C23468n(objMo112691g);
                c22669g0 = c22669g1;
            }
            return enumC31071a;
        }
        return ((C23468n) c22669g0.f89336w).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX INFO: renamed from: b */
    public static final boolean m112685b(AbstractC35531g abstractC35531g, InterfaceC38802c8 interfaceC38802c8, int i13) {
        boolean z4;
        boolean z13;
        boolean z14;
        C38915o4 c38915o4Mo124330Y;
        EnumC38828f4 enumC38828f4;
        InterfaceC38932q3 interfaceC38932q3;
        if (i13 == 1) {
            Set set = AbstractC38812d8.f167042a;
            if (interfaceC38802c8 instanceof C38887l3) {
                Set set2 = AbstractC38812d8.f167042a;
                C38887l3 c38887l3 = (C38887l3) interfaceC38802c8;
                C38915o4 c38915o4 = c38887l3.f167379N;
                if (AbstractC25265s.m74155w0(set2, c38915o4 != null ? c38915o4.f167511E : null) && c38887l3.mo124339z()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        if (i13 == 3 && interfaceC38802c8.mo124331c() == StripeIntent$Status.Processing) {
            C38915o4 c38915o4Mo124330Y2 = interfaceC38802c8.mo124330Y();
            if ((c38915o4Mo124330Y2 != null ? c38915o4Mo124330Y2.f167511E : null) == EnumC38828f4.f167090I) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        if (i13 == 3 && interfaceC38802c8.mo124331c() == StripeIntent$Status.RequiresAction) {
            C38915o4 c38915o4Mo124330Y3 = interfaceC38802c8.mo124330Y();
            if ((c38915o4Mo124330Y3 != null ? c38915o4Mo124330Y3.f167511E : null) == EnumC38828f4.f167090I && interfaceC38802c8.mo124328O() == StripeIntent$NextActionType.UseStripeSdk) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        return z4 || z13 || z14 || (interfaceC38802c8.mo124339z() && (c38915o4Mo124330Y = interfaceC38802c8.mo124330Y()) != null && (enumC38828f4 = c38915o4Mo124330Y.f167511E) != null && (interfaceC38932q3 = enumC38828f4.f167131F) != null && interfaceC38932q3.mo124361I());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX INFO: renamed from: h */
    public static boolean m112686h(C23468n c23468n) {
        boolean z4;
        if (c23468n != null) {
            Object obj = c23468n.f92940w;
            if (obj instanceof C23467m) {
                obj = null;
            }
            InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) obj;
            if (interfaceC38802c8 != null) {
                boolean zMo124339z = interfaceC38802c8.mo124339z();
                if (interfaceC38802c8.mo124331c() != StripeIntent$Status.Processing) {
                    z4 = false;
                } else {
                    C38915o4 c38915o4Mo124330Y = interfaceC38802c8.mo124330Y();
                    if ((c38915o4Mo124330Y != null ? c38915o4Mo124330Y.f167511E : null) == EnumC38828f4.f167090I) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (!zMo124339z && !z4) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo112687c(String str, String str2, AbstractC32269c abstractC32269c, C39857f c39857f);

    /* JADX INFO: renamed from: d */
    public abstract AbstractC35345m0 mo112688d(InterfaceC38802c8 interfaceC38802c8, int i13, String str);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m112689e(C35526b c35526b, AbstractC32269c abstractC32269c) {
        C35530f c35530f;
        if (abstractC32269c instanceof C35530f) {
            c35530f = (C35530f) abstractC32269c;
            int i13 = c35530f.f151173y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35530f.f151173y = i13 - Integer.MIN_VALUE;
            } else {
                c35530f = new C35530f(this, abstractC32269c);
            }
        } else {
            c35530f = new C35530f(this, abstractC32269c);
        }
        Object objM8705K = c35530f.f151171w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35530f.f151173y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C31821a c31821a = new C31821a(this, c35526b, null);
            c35530f.f151173y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f151178d, c31821a, c35530f);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo112690f(String str, C39857f c39857f, AbstractC32269c abstractC32269c);

    /* JADX INFO: renamed from: g */
    public abstract Object mo112691g(String str, C39857f c39857f, List list, AbstractC32269c abstractC32269c);
}
