package y10;

import b10.C2273z0;
import java.util.List;
import l83.C23467m;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;
import y00.C38810d6;
import y00.C38827f3;
import y00.C38840g6;
import y00.C38887l3;

/* JADX INFO: renamed from: y10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C39041c {

    /* JADX INFO: renamed from: b */
    public static final List f168016b = AbstractC37056f.m118958J("payment_method");

    /* JADX INFO: renamed from: a */
    public final C2273z0 f168017a;

    public C39041c(C2273z0 c2273z0) {
        this.f168017a = c2273z0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m124462a(String str, String str2, String str3, String str4, AbstractC32269c abstractC32269c) {
        C39039a c39039a;
        Object objM107888l;
        Object objM107888l2;
        Object objM7079a;
        if (abstractC32269c instanceof C39039a) {
            c39039a = (C39039a) abstractC32269c;
            int i13 = c39039a.f168012y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39039a.f168012y = i13 - Integer.MIN_VALUE;
            } else {
                c39039a = new C39039a(this, abstractC32269c);
            }
        } else {
            c39039a = new C39039a(this, abstractC32269c);
        }
        C39039a c39039a2 = c39039a;
        Object obj = c39039a2.f168010w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39039a2.f168012y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    objM107888l2 = new C38827f3(str3);
                } catch (Throwable th3) {
                    objM107888l2 = AbstractC34132o.m107888l(th3);
                }
                if (objM107888l2 instanceof C23467m) {
                    return objM107888l2;
                }
                C38827f3 c38827f3 = (C38827f3) objM107888l2;
                C2273z0 c2273z0 = this.f168017a;
                String str5 = c38827f3.f167086a;
                String str6 = c38827f3.f167087b;
                C39857f c39857f = new C39857f(str, str4, 4);
                List list = f168016b;
                c39039a2.f168012y = 1;
                objM7079a = c2273z0.m7079a(str5, str6, str2, c39857f, list, c39039a2);
                if (objM7079a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM7079a = ((C23468n) obj).f92940w;
            }
            AbstractC34132o.m107864I(objM7079a);
            objM107888l = (C38887l3) objM7079a;
        } catch (Throwable th4) {
            objM107888l = AbstractC34132o.m107888l(th4);
        }
        return objM107888l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m124463b(String str, String str2, String str3, String str4, AbstractC32269c abstractC32269c) {
        C39040b c39040b;
        Object objM107888l;
        Object objM107888l2;
        Object objM7080b;
        if (abstractC32269c instanceof C39040b) {
            c39040b = (C39040b) abstractC32269c;
            int i13 = c39040b.f168015y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39040b.f168015y = i13 - Integer.MIN_VALUE;
            } else {
                c39040b = new C39040b(this, abstractC32269c);
            }
        } else {
            c39040b = new C39040b(this, abstractC32269c);
        }
        C39040b c39040b2 = c39040b;
        Object obj = c39040b2.f168013w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39040b2.f168015y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    objM107888l2 = new C38810d6(str3);
                } catch (Throwable th3) {
                    objM107888l2 = AbstractC34132o.m107888l(th3);
                }
                if (objM107888l2 instanceof C23467m) {
                    return objM107888l2;
                }
                C38810d6 c38810d6 = (C38810d6) objM107888l2;
                C2273z0 c2273z0 = this.f168017a;
                String str5 = c38810d6.f167031a;
                String str6 = c38810d6.f167032b;
                C39857f c39857f = new C39857f(str, str4, 4);
                List list = f168016b;
                c39040b2.f168015y = 1;
                objM7080b = c2273z0.m7080b(str5, str6, str2, c39857f, list, c39040b2);
                if (objM7080b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM7080b = ((C23468n) obj).f92940w;
            }
            AbstractC34132o.m107864I(objM7080b);
            objM107888l = (C38840g6) objM7080b;
        } catch (Throwable th4) {
            objM107888l = AbstractC34132o.m107888l(th4);
        }
        return objM107888l;
    }
}
