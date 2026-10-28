package y10;

import b10.C2273z0;
import l83.C23467m;
import l83.C23468n;
import m83.C25271y;
import p266jz.C22057e;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import p715kotlin.NoWhenBranchMatchedException;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import w10.C36689a;
import w10.C36690b;
import w10.C36691c;
import w10.InterfaceC36692d;
import y00.C38810d6;
import y00.C38826f2;
import y00.C38827f3;
import y00.C38893m0;
import y00.C38902n0;
import y00.C38911o0;
import y00.EnumC38862i8;
import y00.EnumC38922p2;
import y00.InterfaceC38920p0;

/* JADX INFO: renamed from: y10.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C39046h {

    /* JADX INFO: renamed from: a */
    public final C2273z0 f168028a;

    public /* synthetic */ C39046h(C2273z0 c2273z0) {
        this.f168028a = c2273z0;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC38920p0 m124464e(InterfaceC36692d interfaceC36692d, String str, String str2) {
        if (interfaceC36692d instanceof C36690b) {
            C36690b c36690b = (C36690b) interfaceC36692d;
            return new C38911o0(str, c36690b.f157128w, c36690b.f157129x, str2, null);
        }
        if (interfaceC36692d instanceof C36691c) {
            C36691c c36691c = (C36691c) interfaceC36692d;
            String str3 = c36691c.f157130w;
            String str4 = c36691c.f157131x;
            C22057e c22057e = c36691c.f157132y;
            return new C38911o0(str, str3, str4, str2, c22057e != null ? c22057e.f85566y : null);
        }
        if (!(interfaceC36692d instanceof C36689a)) {
            throw new NoWhenBranchMatchedException();
        }
        C36689a c36689a = (C36689a) interfaceC36692d;
        String str5 = c36689a.f157126w;
        C22057e c22057e2 = c36689a.f157127x;
        return new C38902n0(str, str5, str2, c22057e2 != null ? c22057e2.f85566y : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public Object m124465a(String str, String str2, String str3, String str4, String str5, String str6, EnumC38922p2 enumC38922p2, Integer num, String str7, String str8, AbstractC32269c abstractC32269c) {
        C39043e c39043e;
        if (abstractC32269c instanceof C39043e) {
            c39043e = (C39043e) abstractC32269c;
            int i13 = c39043e.f168021y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39043e.f168021y = i13 - Integer.MIN_VALUE;
            } else {
                c39043e = new C39043e(this, abstractC32269c);
            }
        } else {
            c39043e = new C39043e(this, abstractC32269c);
        }
        Object obj = c39043e.f168019w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39043e.f168021y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        EnumC38862i8 enumC38862i8 = EnumC38862i8.Automatic;
        C38893m0 c38893m0 = new C38893m0(str3, str6, str4, str5, enumC38922p2, str8, num, str7);
        C39857f c39857f = new C39857f(str, str2, 4);
        c39043e.f168021y = 1;
        Object objM7091n = this.f168028a.m7091n(c38893m0, c39857f, c39043e);
        return objM7091n == enumC31071a ? enumC31071a : objM7091n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m124466b(String str, String str2, String str3, String str4, InterfaceC36692d interfaceC36692d, AbstractC32269c abstractC32269c) {
        C39044f c39044f;
        Object objM107888l;
        Object objM107888l2;
        Object objM7092o;
        if (abstractC32269c instanceof C39044f) {
            c39044f = (C39044f) abstractC32269c;
            int i13 = c39044f.f168024y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39044f.f168024y = i13 - Integer.MIN_VALUE;
            } else {
                c39044f = new C39044f(this, abstractC32269c);
            }
        } else {
            c39044f = new C39044f(this, abstractC32269c);
        }
        Object obj = c39044f.f168022w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39044f.f168024y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    objM107888l2 = new C38827f3(str2);
                } catch (Throwable th3) {
                    objM107888l2 = AbstractC34132o.m107888l(th3);
                }
                if (objM107888l2 instanceof C23467m) {
                    return objM107888l2;
                }
                C2273z0 c2273z0 = this.f168028a;
                String str5 = ((C38827f3) objM107888l2).f167087b;
                InterfaceC38920p0 interfaceC38920p0M124464e = m124464e(interfaceC36692d, str2, str4);
                C39857f c39857f = new C39857f(str, str3, 4);
                c39044f.f168024y = 1;
                objM7092o = c2273z0.m7092o(str5, interfaceC38920p0M124464e, c39857f, c39044f);
                if (objM7092o == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM7092o = ((C23468n) obj).f92940w;
            }
            AbstractC34132o.m107864I(objM7092o);
            objM107888l = (C38826f2) objM7092o;
        } catch (Throwable th4) {
            objM107888l = AbstractC34132o.m107888l(th4);
        }
        return objM107888l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m124467c(String str, String str2, String str3, String str4, InterfaceC36692d interfaceC36692d, AbstractC32269c abstractC32269c) {
        C39045g c39045g;
        Object objM107888l;
        Object objM107888l2;
        Object objM7095r;
        if (abstractC32269c instanceof C39045g) {
            c39045g = (C39045g) abstractC32269c;
            int i13 = c39045g.f168027y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39045g.f168027y = i13 - Integer.MIN_VALUE;
            } else {
                c39045g = new C39045g(this, abstractC32269c);
            }
        } else {
            c39045g = new C39045g(this, abstractC32269c);
        }
        Object obj = c39045g.f168025w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39045g.f168027y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    objM107888l2 = new C38810d6(str2);
                } catch (Throwable th3) {
                    objM107888l2 = AbstractC34132o.m107888l(th3);
                }
                if (objM107888l2 instanceof C23467m) {
                    return objM107888l2;
                }
                C2273z0 c2273z0 = this.f168028a;
                String str5 = ((C38810d6) objM107888l2).f167032b;
                InterfaceC38920p0 interfaceC38920p0M124464e = m124464e(interfaceC36692d, str2, str4);
                C39857f c39857f = new C39857f(str, str3, 4);
                c39045g.f168027y = 1;
                objM7095r = c2273z0.m7095r(str5, interfaceC38920p0M124464e, c39857f, c39045g);
                if (objM7095r == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM7095r = ((C23468n) obj).f92940w;
            }
            AbstractC34132o.m107864I(objM7095r);
            objM107888l = (C38826f2) objM7095r;
        } catch (Throwable th4) {
            objM107888l = AbstractC34132o.m107888l(th4);
        }
        return objM107888l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m124468d(String str, String str2, String str3, AbstractC32269c abstractC32269c) {
        C39047i c39047i;
        if (abstractC32269c instanceof C39047i) {
            c39047i = (C39047i) abstractC32269c;
            int i13 = c39047i.f168031y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39047i.f168031y = i13 - Integer.MIN_VALUE;
            } else {
                c39047i = new C39047i(this, abstractC32269c);
            }
        } else {
            c39047i = new C39047i(this, abstractC32269c);
        }
        Object obj = c39047i.f168029w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39047i.f168031y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39857f c39857f = new C39857f(str, str2, 4);
        c39047i.f168031y = 1;
        Object objM7073S = this.f168028a.m7073S(str3, c39857f, C25271y.f99162w, c39047i);
        return objM7073S == enumC31071a ? enumC31071a : objM7073S;
    }
}
