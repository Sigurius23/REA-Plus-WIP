package p522uf;

import a30.C0332w0;
import bf.AbstractC3187b;
import bf.EnumC3188c;
import bf.InterfaceC3186a;
import cf.InterfaceC4526a;
import gf.C15760a;
import gf.C15762c;
import gf.C15768i;
import gf.InterfaceC15761b;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import nf.C26657k;
import nf.InterfaceC26651e;
import nf.InterfaceC26655i;
import p091dg.C12002a;
import p108e4.AbstractC12667a;
import p116ef.AbstractC13141b;
import p116ef.C13140a;
import p249jc.AbstractC21598x;
import p368og.EnumC27905b;
import p424qg.C30334c;
import p470rv.AbstractC31834n;
import p505ts.AbstractC34132o;
import p521ue.C34855a;
import p521ue.C34856b;
import p550vd.AbstractC35903f;
import p551vf.C35937b;
import p551vf.C35942g;
import p551vf.InterfaceC35936a;
import p613xf.InterfaceC38255a;
import p613xf.InterfaceC38257c;
import p647yf.InterfaceC39492e;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.TimeSource;
import p715kotlin.time.TimedValue;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import rs.AbstractC31780b;
import s83.AbstractC32269c;
import s93.AbstractC32306h;
import s93.AbstractC32309k;
import sc0.C32355c;

/* JADX INFO: renamed from: uf.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C34867b implements InterfaceC39492e {

    /* JADX INFO: renamed from: a */
    public final C34873e f146877a;

    /* JADX INFO: renamed from: b */
    public final C0332w0 f146878b;

    /* JADX INFO: renamed from: c */
    public final C34889p f146879c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC34875f f146880d;

    public C34867b(C34873e c34873e, C0332w0 c0332w0, C34889p authConfig, InterfaceC34875f interfaceC34875f) {
        AbstractC22676k.m65750j(authConfig, "authConfig");
        this.f146877a = c34873e;
        this.f146878b = c0332w0;
        this.f146879c = authConfig;
        this.f146880d = interfaceC34875f;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:102:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:104:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:106:0x0412  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x011e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0137 A[LOOP:4: B:23:0x0118->B:28:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0141  */
    /* JADX WARN: Code duplicated, block: B:34:0x0152  */
    /* JADX WARN: Code duplicated, block: B:37:0x019f  */
    /* JADX WARN: Code duplicated, block: B:40:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x01ed A[LOOP:3: B:41:0x01e7->B:43:0x01ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0208  */
    /* JADX WARN: Code duplicated, block: B:48:0x0218  */
    /* JADX WARN: Code duplicated, block: B:52:0x0241  */
    /* JADX WARN: Code duplicated, block: B:55:0x027b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0290  */
    /* JADX WARN: Code duplicated, block: B:61:0x029e  */
    /* JADX WARN: Code duplicated, block: B:67:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x0316  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:82:0x0327 A[LOOP:1: B:80:0x0321->B:82:0x0327, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x036a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0391  */
    /* JADX WARN: Code duplicated, block: B:92:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:95:0x03b7 A[LOOP:0: B:93:0x03b1->B:95:0x03b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x03e0 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x03f1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x0412, please report this as an issue */
    @Override // p647yf.InterfaceC39492e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object mo2061a(C34894u c34894u, InterfaceC30057d interfaceC30057d) {
        C34865a c34865a;
        List list;
        Iterator it;
        List list2;
        Object next;
        C34855a c34855a;
        String str;
        InterfaceC26651e interfaceC26651e;
        C15762c c15762c;
        C30334c c30334c;
        long jM134379markNowz9LOYto;
        C34894u c34894u2;
        Object objMo79294b;
        C30334c c30334c2;
        long j7;
        InterfaceC15761b interfaceC15761b;
        InterfaceC26651e interfaceC26651e2;
        C34894u c34894u3;
        Object obj;
        InterfaceC15761b interfaceC15761b2;
        C15768i c15768i;
        String str2;
        InterfaceC38255a interfaceC38255a;
        C12002a c12002a;
        Set set;
        C34896w c34896w;
        InterfaceC34875f interfaceC34875f;
        InterfaceC38255a interfaceC38255a2;
        C30334c c30334c3;
        InterfaceC15761b interfaceC15761b3;
        long jM134379markNowz9LOYto2;
        C34894u c34894u4;
        Object objMo8834c;
        Object obj2;
        C30334c c30334c4;
        Iterator it3;
        Object objM839B;
        C34894u c34894u5;
        InterfaceC38255a interfaceC38255a3;
        C13140a c13140a;
        InterfaceC30063j context;
        C32355c c32355c;
        EnumC27905b enumC27905b;
        String qualifiedName;
        Iterable iterable;
        Iterator it4;
        Object next2;
        C34855a c34855a2;
        InterfaceC15761b interfaceC15761b4;
        C34894u c34894uM110032a;
        C35937b c35937b;
        Iterator it5;
        C26657k c26657k;
        C30334c c30334c5;
        long jM134379markNowz9LOYto3;
        InterfaceC26655i interfaceC26655iMo79291b;
        C30334c c30334c6;
        InterfaceC15761b interfaceC15761b5;
        C34894u c34894u6;
        long j13;
        Iterator it6;
        Object objM110026b;
        C34894u c34894u7 = c34894u;
        C0332w0 c0332w0 = this.f146878b;
        List list3 = (List) c0332w0.f1169y;
        C12002a c12002a2 = (C12002a) c0332w0.f1168x;
        if (interfaceC30057d instanceof C34865a) {
            c34865a = (C34865a) interfaceC30057d;
            int i13 = c34865a.f146871M;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c34865a.f146871M = i13 - Integer.MIN_VALUE;
            } else {
                c34865a = new C34865a(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c34865a = new C34865a(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objMo1862f = c34865a.f146869K;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c34865a.f146871M;
        C15768i c15768i2 = C15768i.f59433w;
        String str3 = "executionContext";
        C34889p c34889p = this.f146879c;
        switch (i14) {
            case 0:
                AbstractC34132o.m107864I(objMo1862f);
                InterfaceC34869c interfaceC34869c = c34889p.f146933a;
                c34865a.f146872w = c34894u7;
                c34865a.f146871M = 1;
                objMo1862f = interfaceC34869c.mo1862f(c34894u7, c34865a);
                if (objMo1862f != enumC31071a) {
                    list = (List) objMo1862f;
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            list2 = list3;
                            if (c34889p.f146934b.containsKey(new C34856b(((C34855a) next).f146800a))) {
                                list3 = list2;
                            }
                        } else {
                            list2 = list3;
                            next = null;
                        }
                    }
                    c34855a = (C34855a) next;
                    if (c34855a != null) {
                        throw new IllegalStateException(("no auth scheme found for operation; candidates: " + list).toString());
                    }
                    str = c34855a.f146800a;
                    interfaceC26651e = (InterfaceC26651e) c34889p.f146934b.get(new C34856b(str));
                    if (interfaceC26651e != null) {
                        throw new IllegalStateException(("auth scheme " + ((Object) C34856b.m109935a(str)) + " not configured").toString());
                    }
                    c15762c = new C15762c();
                    String value = interfaceC26651e.mo79292c();
                    AbstractC22676k.m65750j(value, "value");
                    c15762c.mo33083c(new C15760a("auth.scheme_id"), value);
                    C12002a c12002a3 = c34894u7.f146958a;
                    AbstractC21598x.m60675c0(c12002a3, c34855a.f146801b);
                    InterfaceC38257c interfaceC38257cMo79290a = interfaceC26651e.mo79290a(c34889p.f146935c);
                    c30334c = AbstractC31780b.m98689j(c12002a3).f146954j;
                    jM134379markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                    c34865a.f146872w = c34894u7;
                    c34865a.f146873x = interfaceC26651e;
                    c34865a.f146874y = c15762c;
                    c34865a.f146875z = c30334c;
                    c34865a.f146863E = c15762c;
                    c34894u2 = c34894u7;
                    c34865a.f146864F = null;
                    c34865a.f146868J = jM134379markNowz9LOYto;
                    c34865a.f146871M = 2;
                    objMo79294b = interfaceC38257cMo79290a.mo79294b(c12002a3, c34865a);
                    if (objMo79294b != enumC31071a) {
                        c30334c2 = c30334c;
                        j7 = jM134379markNowz9LOYto;
                        interfaceC15761b = c15762c;
                        interfaceC26651e2 = interfaceC26651e;
                        c34894u3 = c34894u2;
                        obj = objMo79294b;
                        interfaceC15761b2 = interfaceC15761b;
                        c15768i = c15768i2;
                        str2 = "Required value was null.";
                        TimedValue timedValue = new TimedValue((InterfaceC38255a) obj, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j7), null);
                        AbstractC12667a.m35441M(c30334c2, timedValue.m134401getDurationUwyO8pc(), interfaceC15761b2, null);
                        interfaceC38255a = (InterfaceC38255a) timedValue.getValue();
                        c12002a = c34894u3.f146958a;
                        set = (Set) interfaceC38255a.getAttributes().mo33082b(AbstractC3187b.f12493a);
                        if (set != null) {
                            it3 = AbstractC25265s.m74138n1(AbstractC25265s.m74093D1(set)).iterator();
                            while (it3.hasNext()) {
                                AbstractC3187b.m9170b(c12002a, (InterfaceC3186a) it3.next());
                            }
                        }
                        c34896w = new C34896w(c12002a, AbstractC32306h.m100570s((C35937b) c34894u3.f146959b), interfaceC38255a);
                        interfaceC34875f = this.f146880d;
                        if (interfaceC34875f != null) {
                            c30334c3 = AbstractC31780b.m98689j(c12002a).f146953i;
                            interfaceC15761b3 = (InterfaceC15761b) c12002a.mo33082b(AbstractC34881i.f146920h);
                            if (interfaceC15761b3 == null) {
                                interfaceC15761b3 = c15768i;
                            }
                            jM134379markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                            c34865a.f146872w = c34894u3;
                            c34865a.f146873x = interfaceC26651e2;
                            c34865a.f146874y = interfaceC15761b;
                            c34865a.f146875z = interfaceC38255a;
                            c34894u4 = c34894u3;
                            c34865a.f146863E = null;
                            c34865a.f146864F = c30334c3;
                            c34865a.f146865G = interfaceC15761b3;
                            c34865a.f146866H = null;
                            c34865a.f146868J = jM134379markNowz9LOYto2;
                            c34865a.f146871M = 3;
                            objMo8834c = interfaceC34875f.mo8834c(c34896w, c34865a);
                            if (objMo8834c != enumC31071a) {
                                obj2 = objMo8834c;
                                c30334c4 = c30334c3;
                                c34894u3 = c34894u4;
                                interfaceC38255a3 = interfaceC38255a;
                                TimedValue timedValue2 = new TimedValue((C13140a) obj2, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(jM134379markNowz9LOYto2), null);
                                AbstractC12667a.m35441M(c30334c4, timedValue2.m134401getDurationUwyO8pc(), interfaceC15761b3, null);
                                c13140a = (C13140a) timedValue2.getValue();
                                context = c34865a.getContext();
                                c32355c = new C32355c(c13140a, 19);
                                enumC27905b = EnumC27905b.f112507z;
                                qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34867b.class).getQualifiedName();
                                if (qualifiedName != null) {
                                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                                }
                                AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c32355c);
                                AbstractC31834n.m98902k(c34894u3, c13140a);
                                C12002a c12002a4 = c34894u3.f146958a;
                                InterfaceC15761b interfaceC15761b6 = c13140a.f45449b;
                                iterable = (List) interfaceC15761b6.mo33082b(AbstractC13141b.f45450a);
                                if (iterable == null) {
                                    iterable = C25271y.f99162w;
                                }
                                it4 = iterable.iterator();
                                do {
                                    if (it4.hasNext()) {
                                        next2 = it4.next();
                                    } else {
                                        next2 = null;
                                    }
                                    c34855a2 = (C34855a) next2;
                                    if (c34855a2 != null) {
                                        interfaceC15761b4 = c34855a2.f146801b;
                                    } else {
                                        interfaceC15761b4 = c15768i;
                                    }
                                    AbstractC21598x.m60675c0(c12002a4, interfaceC15761b4);
                                    AbstractC21598x.m60675c0(c12002a4, interfaceC15761b6);
                                    interfaceC38255a2 = interfaceC38255a3;
                                    C35937b c35937b2 = (C35937b) c34894u3.f146959b;
                                    AbstractC22676k.m65750j(c35937b2, "<this>");
                                    C35942g c35942g = new C35942g(c35937b2, true);
                                    c34865a.f146872w = c34894u3;
                                    c34865a.f146873x = interfaceC26651e2;
                                    c34865a.f146874y = interfaceC15761b;
                                    c34865a.f146875z = interfaceC38255a2;
                                    c34865a.f146863E = null;
                                    c34865a.f146864F = null;
                                    c34865a.f146865G = null;
                                    c34865a.f146866H = null;
                                    c34865a.f146871M = 4;
                                    objM839B = c0332w0.m839B(c35942g, c34865a);
                                    if (objM839B != enumC31071a) {
                                        c34894u5 = c34894u3;
                                        objMo1862f = objM839B;
                                        c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                                        c35937b = (C35937b) c34894uM110032a.f146959b;
                                        c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                                        if (c0332w0.f1164E != null) {
                                            throw new IllegalStateException(str2);
                                        }
                                        AbstractC22676k.m65750j(c12002a2, str3);
                                        it5 = list2.iterator();
                                        while (it5.hasNext()) {
                                            ((InterfaceC4526a) it5.next()).getClass();
                                        }
                                        c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                                        c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                                        jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                                        interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                                        c34865a.f146872w = c34894u5;
                                        c34865a.f146873x = interfaceC26651e2;
                                        c34865a.f146874y = null;
                                        c34865a.f146875z = null;
                                        c34865a.f146863E = null;
                                        c34865a.f146864F = c34894uM110032a;
                                        c34865a.f146865G = null;
                                        c34865a.f146866H = c30334c5;
                                        c34865a.f146867I = interfaceC15761b;
                                        c34865a.f146868J = jM134379markNowz9LOYto3;
                                        c34865a.f146871M = 5;
                                        if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                                            C34894u c34894u8 = c34894u5;
                                            c30334c6 = c30334c5;
                                            interfaceC15761b5 = interfaceC15761b;
                                            c34894u6 = c34894u8;
                                            j13 = jM134379markNowz9LOYto3;
                                            TimedValue timedValue3 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                                            AbstractC12667a.m35441M(c30334c6, timedValue3.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                                            timedValue3.getValue();
                                            if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                                                AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                                            }
                                            c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                                            if (c0332w0.f1164E == null) {
                                                throw new IllegalStateException(str2);
                                            }
                                            AbstractC22676k.m65750j(c12002a2, str3);
                                            it6 = list2.iterator();
                                            while (it6.hasNext()) {
                                                ((InterfaceC4526a) it6.next()).getClass();
                                            }
                                            c34865a.f146872w = null;
                                            c34865a.f146873x = null;
                                            c34865a.f146874y = null;
                                            c34865a.f146875z = null;
                                            c34865a.f146863E = null;
                                            c34865a.f146864F = null;
                                            c34865a.f146865G = null;
                                            c34865a.f146866H = null;
                                            c34865a.f146867I = null;
                                            c34865a.f146871M = 6;
                                            objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                                            if (objM110026b == enumC31071a) {
                                                return objM110026b;
                                            }
                                        }
                                    }
                                } while (!AbstractC22676k.m65745e(((C34855a) next2).f146800a, interfaceC26651e2.mo79292c()));
                                c34855a2 = (C34855a) next2;
                                if (c34855a2 != null) {
                                    interfaceC15761b4 = c34855a2.f146801b;
                                } else {
                                    interfaceC15761b4 = c15768i;
                                }
                                AbstractC21598x.m60675c0(c12002a4, interfaceC15761b4);
                                AbstractC21598x.m60675c0(c12002a4, interfaceC15761b6);
                                interfaceC38255a2 = interfaceC38255a3;
                                C35937b c35937b3 = (C35937b) c34894u3.f146959b;
                                AbstractC22676k.m65750j(c35937b3, "<this>");
                                C35942g c35942g2 = new C35942g(c35937b3, true);
                                c34865a.f146872w = c34894u3;
                                c34865a.f146873x = interfaceC26651e2;
                                c34865a.f146874y = interfaceC15761b;
                                c34865a.f146875z = interfaceC38255a2;
                                c34865a.f146863E = null;
                                c34865a.f146864F = null;
                                c34865a.f146865G = null;
                                c34865a.f146866H = null;
                                c34865a.f146871M = 4;
                                objM839B = c0332w0.m839B(c35942g2, c34865a);
                                if (objM839B != enumC31071a) {
                                    c34894u5 = c34894u3;
                                    objMo1862f = objM839B;
                                    c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                                    c35937b = (C35937b) c34894uM110032a.f146959b;
                                    c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                                    if (c0332w0.f1164E != null) {
                                        throw new IllegalStateException(str2);
                                    }
                                    AbstractC22676k.m65750j(c12002a2, str3);
                                    it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        ((InterfaceC4526a) it5.next()).getClass();
                                    }
                                    c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                                    c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                                    jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                                    interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                                    c34865a.f146872w = c34894u5;
                                    c34865a.f146873x = interfaceC26651e2;
                                    c34865a.f146874y = null;
                                    c34865a.f146875z = null;
                                    c34865a.f146863E = null;
                                    c34865a.f146864F = c34894uM110032a;
                                    c34865a.f146865G = null;
                                    c34865a.f146866H = c30334c5;
                                    c34865a.f146867I = interfaceC15761b;
                                    c34865a.f146868J = jM134379markNowz9LOYto3;
                                    c34865a.f146871M = 5;
                                    if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                                        C34894u c34894u9 = c34894u5;
                                        c30334c6 = c30334c5;
                                        interfaceC15761b5 = interfaceC15761b;
                                        c34894u6 = c34894u9;
                                        j13 = jM134379markNowz9LOYto3;
                                        TimedValue timedValue4 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                                        AbstractC12667a.m35441M(c30334c6, timedValue4.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                                        timedValue4.getValue();
                                        if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                                            AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                                        }
                                        c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                                        if (c0332w0.f1164E == null) {
                                            throw new IllegalStateException(str2);
                                        }
                                        AbstractC22676k.m65750j(c12002a2, str3);
                                        it6 = list2.iterator();
                                        while (it6.hasNext()) {
                                            ((InterfaceC4526a) it6.next()).getClass();
                                        }
                                        c34865a.f146872w = null;
                                        c34865a.f146873x = null;
                                        c34865a.f146874y = null;
                                        c34865a.f146875z = null;
                                        c34865a.f146863E = null;
                                        c34865a.f146864F = null;
                                        c34865a.f146865G = null;
                                        c34865a.f146866H = null;
                                        c34865a.f146867I = null;
                                        c34865a.f146871M = 6;
                                        objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                                        if (objM110026b == enumC31071a) {
                                            return objM110026b;
                                        }
                                    }
                                }
                            }
                        } else {
                            str3 = "executionContext";
                            interfaceC38255a2 = interfaceC38255a;
                            C35937b c35937b4 = (C35937b) c34894u3.f146959b;
                            AbstractC22676k.m65750j(c35937b4, "<this>");
                            C35942g c35942g3 = new C35942g(c35937b4, true);
                            c34865a.f146872w = c34894u3;
                            c34865a.f146873x = interfaceC26651e2;
                            c34865a.f146874y = interfaceC15761b;
                            c34865a.f146875z = interfaceC38255a2;
                            c34865a.f146863E = null;
                            c34865a.f146864F = null;
                            c34865a.f146865G = null;
                            c34865a.f146866H = null;
                            c34865a.f146871M = 4;
                            objM839B = c0332w0.m839B(c35942g3, c34865a);
                            if (objM839B != enumC31071a) {
                                c34894u5 = c34894u3;
                                objMo1862f = objM839B;
                                c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                                c35937b = (C35937b) c34894uM110032a.f146959b;
                                c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                                if (c0332w0.f1164E != null) {
                                    throw new IllegalStateException(str2);
                                }
                                AbstractC22676k.m65750j(c12002a2, str3);
                                it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    ((InterfaceC4526a) it5.next()).getClass();
                                }
                                c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                                c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                                jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                                interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                                c34865a.f146872w = c34894u5;
                                c34865a.f146873x = interfaceC26651e2;
                                c34865a.f146874y = null;
                                c34865a.f146875z = null;
                                c34865a.f146863E = null;
                                c34865a.f146864F = c34894uM110032a;
                                c34865a.f146865G = null;
                                c34865a.f146866H = c30334c5;
                                c34865a.f146867I = interfaceC15761b;
                                c34865a.f146868J = jM134379markNowz9LOYto3;
                                c34865a.f146871M = 5;
                                if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                                    C34894u c34894u10 = c34894u5;
                                    c30334c6 = c30334c5;
                                    interfaceC15761b5 = interfaceC15761b;
                                    c34894u6 = c34894u10;
                                    j13 = jM134379markNowz9LOYto3;
                                    TimedValue timedValue5 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                                    AbstractC12667a.m35441M(c30334c6, timedValue5.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                                    timedValue5.getValue();
                                    if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                                        AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                                    }
                                    c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                                    if (c0332w0.f1164E == null) {
                                        throw new IllegalStateException(str2);
                                    }
                                    AbstractC22676k.m65750j(c12002a2, str3);
                                    it6 = list2.iterator();
                                    while (it6.hasNext()) {
                                        ((InterfaceC4526a) it6.next()).getClass();
                                    }
                                    c34865a.f146872w = null;
                                    c34865a.f146873x = null;
                                    c34865a.f146874y = null;
                                    c34865a.f146875z = null;
                                    c34865a.f146863E = null;
                                    c34865a.f146864F = null;
                                    c34865a.f146865G = null;
                                    c34865a.f146866H = null;
                                    c34865a.f146867I = null;
                                    c34865a.f146871M = 6;
                                    objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                                    if (objM110026b == enumC31071a) {
                                        return objM110026b;
                                    }
                                }
                            }
                        }
                    }
                }
                return enumC31071a;
            case 1:
                c34894u7 = c34865a.f146872w;
                AbstractC34132o.m107864I(objMo1862f);
                list = (List) objMo1862f;
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        list2 = list3;
                        if (c34889p.f146934b.containsKey(new C34856b(((C34855a) next).f146800a))) {
                            list3 = list2;
                        }
                    } else {
                        list2 = list3;
                        next = null;
                    }
                }
                c34855a = (C34855a) next;
                if (c34855a != null) {
                    throw new IllegalStateException(("no auth scheme found for operation; candidates: " + list).toString());
                }
                str = c34855a.f146800a;
                interfaceC26651e = (InterfaceC26651e) c34889p.f146934b.get(new C34856b(str));
                if (interfaceC26651e != null) {
                    throw new IllegalStateException(("auth scheme " + ((Object) C34856b.m109935a(str)) + " not configured").toString());
                }
                c15762c = new C15762c();
                String value2 = interfaceC26651e.mo79292c();
                AbstractC22676k.m65750j(value2, "value");
                c15762c.mo33083c(new C15760a("auth.scheme_id"), value2);
                C12002a c12002a5 = c34894u7.f146958a;
                AbstractC21598x.m60675c0(c12002a5, c34855a.f146801b);
                InterfaceC38257c interfaceC38257cMo79290a2 = interfaceC26651e.mo79290a(c34889p.f146935c);
                c30334c = AbstractC31780b.m98689j(c12002a5).f146954j;
                jM134379markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                c34865a.f146872w = c34894u7;
                c34865a.f146873x = interfaceC26651e;
                c34865a.f146874y = c15762c;
                c34865a.f146875z = c30334c;
                c34865a.f146863E = c15762c;
                c34894u2 = c34894u7;
                c34865a.f146864F = null;
                c34865a.f146868J = jM134379markNowz9LOYto;
                c34865a.f146871M = 2;
                objMo79294b = interfaceC38257cMo79290a2.mo79294b(c12002a5, c34865a);
                if (objMo79294b != enumC31071a) {
                    c30334c2 = c30334c;
                    j7 = jM134379markNowz9LOYto;
                    interfaceC15761b = c15762c;
                    interfaceC26651e2 = interfaceC26651e;
                    c34894u3 = c34894u2;
                    obj = objMo79294b;
                    interfaceC15761b2 = interfaceC15761b;
                    c15768i = c15768i2;
                    str2 = "Required value was null.";
                    TimedValue timedValue6 = new TimedValue((InterfaceC38255a) obj, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j7), null);
                    AbstractC12667a.m35441M(c30334c2, timedValue6.m134401getDurationUwyO8pc(), interfaceC15761b2, null);
                    interfaceC38255a = (InterfaceC38255a) timedValue6.getValue();
                    c12002a = c34894u3.f146958a;
                    set = (Set) interfaceC38255a.getAttributes().mo33082b(AbstractC3187b.f12493a);
                    if (set != null) {
                        it3 = AbstractC25265s.m74138n1(AbstractC25265s.m74093D1(set)).iterator();
                        while (it3.hasNext()) {
                            AbstractC3187b.m9170b(c12002a, (InterfaceC3186a) it3.next());
                        }
                    }
                    c34896w = new C34896w(c12002a, AbstractC32306h.m100570s((C35937b) c34894u3.f146959b), interfaceC38255a);
                    interfaceC34875f = this.f146880d;
                    if (interfaceC34875f != null) {
                        c30334c3 = AbstractC31780b.m98689j(c12002a).f146953i;
                        interfaceC15761b3 = (InterfaceC15761b) c12002a.mo33082b(AbstractC34881i.f146920h);
                        if (interfaceC15761b3 == null) {
                            interfaceC15761b3 = c15768i;
                        }
                        jM134379markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                        c34865a.f146872w = c34894u3;
                        c34865a.f146873x = interfaceC26651e2;
                        c34865a.f146874y = interfaceC15761b;
                        c34865a.f146875z = interfaceC38255a;
                        c34894u4 = c34894u3;
                        c34865a.f146863E = null;
                        c34865a.f146864F = c30334c3;
                        c34865a.f146865G = interfaceC15761b3;
                        c34865a.f146866H = null;
                        c34865a.f146868J = jM134379markNowz9LOYto2;
                        c34865a.f146871M = 3;
                        objMo8834c = interfaceC34875f.mo8834c(c34896w, c34865a);
                        if (objMo8834c != enumC31071a) {
                            obj2 = objMo8834c;
                            c30334c4 = c30334c3;
                            c34894u3 = c34894u4;
                            interfaceC38255a3 = interfaceC38255a;
                            TimedValue timedValue7 = new TimedValue((C13140a) obj2, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(jM134379markNowz9LOYto2), null);
                            AbstractC12667a.m35441M(c30334c4, timedValue7.m134401getDurationUwyO8pc(), interfaceC15761b3, null);
                            c13140a = (C13140a) timedValue7.getValue();
                            context = c34865a.getContext();
                            c32355c = new C32355c(c13140a, 19);
                            enumC27905b = EnumC27905b.f112507z;
                            qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34867b.class).getQualifiedName();
                            if (qualifiedName != null) {
                                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                            }
                            AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c32355c);
                            AbstractC31834n.m98902k(c34894u3, c13140a);
                            C12002a c12002a6 = c34894u3.f146958a;
                            InterfaceC15761b interfaceC15761b7 = c13140a.f45449b;
                            iterable = (List) interfaceC15761b7.mo33082b(AbstractC13141b.f45450a);
                            if (iterable == null) {
                                iterable = C25271y.f99162w;
                            }
                            it4 = iterable.iterator();
                            do {
                                if (it4.hasNext()) {
                                    next2 = it4.next();
                                } else {
                                    next2 = null;
                                }
                                c34855a2 = (C34855a) next2;
                                if (c34855a2 != null) {
                                    interfaceC15761b4 = c34855a2.f146801b;
                                } else {
                                    interfaceC15761b4 = c15768i;
                                }
                                AbstractC21598x.m60675c0(c12002a6, interfaceC15761b4);
                                AbstractC21598x.m60675c0(c12002a6, interfaceC15761b7);
                                interfaceC38255a2 = interfaceC38255a3;
                                C35937b c35937b5 = (C35937b) c34894u3.f146959b;
                                AbstractC22676k.m65750j(c35937b5, "<this>");
                                C35942g c35942g4 = new C35942g(c35937b5, true);
                                c34865a.f146872w = c34894u3;
                                c34865a.f146873x = interfaceC26651e2;
                                c34865a.f146874y = interfaceC15761b;
                                c34865a.f146875z = interfaceC38255a2;
                                c34865a.f146863E = null;
                                c34865a.f146864F = null;
                                c34865a.f146865G = null;
                                c34865a.f146866H = null;
                                c34865a.f146871M = 4;
                                objM839B = c0332w0.m839B(c35942g4, c34865a);
                                if (objM839B != enumC31071a) {
                                    c34894u5 = c34894u3;
                                    objMo1862f = objM839B;
                                    c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                                    c35937b = (C35937b) c34894uM110032a.f146959b;
                                    c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                                    if (c0332w0.f1164E != null) {
                                        throw new IllegalStateException(str2);
                                    }
                                    AbstractC22676k.m65750j(c12002a2, str3);
                                    it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        ((InterfaceC4526a) it5.next()).getClass();
                                    }
                                    c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                                    c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                                    jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                                    interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                                    c34865a.f146872w = c34894u5;
                                    c34865a.f146873x = interfaceC26651e2;
                                    c34865a.f146874y = null;
                                    c34865a.f146875z = null;
                                    c34865a.f146863E = null;
                                    c34865a.f146864F = c34894uM110032a;
                                    c34865a.f146865G = null;
                                    c34865a.f146866H = c30334c5;
                                    c34865a.f146867I = interfaceC15761b;
                                    c34865a.f146868J = jM134379markNowz9LOYto3;
                                    c34865a.f146871M = 5;
                                    if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                                        C34894u c34894u11 = c34894u5;
                                        c30334c6 = c30334c5;
                                        interfaceC15761b5 = interfaceC15761b;
                                        c34894u6 = c34894u11;
                                        j13 = jM134379markNowz9LOYto3;
                                        TimedValue timedValue8 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                                        AbstractC12667a.m35441M(c30334c6, timedValue8.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                                        timedValue8.getValue();
                                        if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                                            AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                                        }
                                        c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                                        if (c0332w0.f1164E == null) {
                                            throw new IllegalStateException(str2);
                                        }
                                        AbstractC22676k.m65750j(c12002a2, str3);
                                        it6 = list2.iterator();
                                        while (it6.hasNext()) {
                                            ((InterfaceC4526a) it6.next()).getClass();
                                        }
                                        c34865a.f146872w = null;
                                        c34865a.f146873x = null;
                                        c34865a.f146874y = null;
                                        c34865a.f146875z = null;
                                        c34865a.f146863E = null;
                                        c34865a.f146864F = null;
                                        c34865a.f146865G = null;
                                        c34865a.f146866H = null;
                                        c34865a.f146867I = null;
                                        c34865a.f146871M = 6;
                                        objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                                        if (objM110026b == enumC31071a) {
                                            return objM110026b;
                                        }
                                    }
                                }
                            } while (!AbstractC22676k.m65745e(((C34855a) next2).f146800a, interfaceC26651e2.mo79292c()));
                            c34855a2 = (C34855a) next2;
                            if (c34855a2 != null) {
                                interfaceC15761b4 = c34855a2.f146801b;
                            } else {
                                interfaceC15761b4 = c15768i;
                            }
                            AbstractC21598x.m60675c0(c12002a6, interfaceC15761b4);
                            AbstractC21598x.m60675c0(c12002a6, interfaceC15761b7);
                            interfaceC38255a2 = interfaceC38255a3;
                            C35937b c35937b6 = (C35937b) c34894u3.f146959b;
                            AbstractC22676k.m65750j(c35937b6, "<this>");
                            C35942g c35942g5 = new C35942g(c35937b6, true);
                            c34865a.f146872w = c34894u3;
                            c34865a.f146873x = interfaceC26651e2;
                            c34865a.f146874y = interfaceC15761b;
                            c34865a.f146875z = interfaceC38255a2;
                            c34865a.f146863E = null;
                            c34865a.f146864F = null;
                            c34865a.f146865G = null;
                            c34865a.f146866H = null;
                            c34865a.f146871M = 4;
                            objM839B = c0332w0.m839B(c35942g5, c34865a);
                            if (objM839B != enumC31071a) {
                                c34894u5 = c34894u3;
                                objMo1862f = objM839B;
                                c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                                c35937b = (C35937b) c34894uM110032a.f146959b;
                                c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                                if (c0332w0.f1164E != null) {
                                    throw new IllegalStateException(str2);
                                }
                                AbstractC22676k.m65750j(c12002a2, str3);
                                it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    ((InterfaceC4526a) it5.next()).getClass();
                                }
                                c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                                c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                                jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                                interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                                c34865a.f146872w = c34894u5;
                                c34865a.f146873x = interfaceC26651e2;
                                c34865a.f146874y = null;
                                c34865a.f146875z = null;
                                c34865a.f146863E = null;
                                c34865a.f146864F = c34894uM110032a;
                                c34865a.f146865G = null;
                                c34865a.f146866H = c30334c5;
                                c34865a.f146867I = interfaceC15761b;
                                c34865a.f146868J = jM134379markNowz9LOYto3;
                                c34865a.f146871M = 5;
                                if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                                    C34894u c34894u12 = c34894u5;
                                    c30334c6 = c30334c5;
                                    interfaceC15761b5 = interfaceC15761b;
                                    c34894u6 = c34894u12;
                                    j13 = jM134379markNowz9LOYto3;
                                    TimedValue timedValue9 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                                    AbstractC12667a.m35441M(c30334c6, timedValue9.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                                    timedValue9.getValue();
                                    if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                                        AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                                    }
                                    c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                                    if (c0332w0.f1164E == null) {
                                        throw new IllegalStateException(str2);
                                    }
                                    AbstractC22676k.m65750j(c12002a2, str3);
                                    it6 = list2.iterator();
                                    while (it6.hasNext()) {
                                        ((InterfaceC4526a) it6.next()).getClass();
                                    }
                                    c34865a.f146872w = null;
                                    c34865a.f146873x = null;
                                    c34865a.f146874y = null;
                                    c34865a.f146875z = null;
                                    c34865a.f146863E = null;
                                    c34865a.f146864F = null;
                                    c34865a.f146865G = null;
                                    c34865a.f146866H = null;
                                    c34865a.f146867I = null;
                                    c34865a.f146871M = 6;
                                    objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                                    if (objM110026b == enumC31071a) {
                                        return objM110026b;
                                    }
                                }
                            }
                        }
                    } else {
                        str3 = "executionContext";
                        interfaceC38255a2 = interfaceC38255a;
                        C35937b c35937b7 = (C35937b) c34894u3.f146959b;
                        AbstractC22676k.m65750j(c35937b7, "<this>");
                        C35942g c35942g6 = new C35942g(c35937b7, true);
                        c34865a.f146872w = c34894u3;
                        c34865a.f146873x = interfaceC26651e2;
                        c34865a.f146874y = interfaceC15761b;
                        c34865a.f146875z = interfaceC38255a2;
                        c34865a.f146863E = null;
                        c34865a.f146864F = null;
                        c34865a.f146865G = null;
                        c34865a.f146866H = null;
                        c34865a.f146871M = 4;
                        objM839B = c0332w0.m839B(c35942g6, c34865a);
                        if (objM839B != enumC31071a) {
                            c34894u5 = c34894u3;
                            objMo1862f = objM839B;
                            c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                            c35937b = (C35937b) c34894uM110032a.f146959b;
                            c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                            if (c0332w0.f1164E != null) {
                                throw new IllegalStateException(str2);
                            }
                            AbstractC22676k.m65750j(c12002a2, str3);
                            it5 = list2.iterator();
                            while (it5.hasNext()) {
                                ((InterfaceC4526a) it5.next()).getClass();
                            }
                            c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                            c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                            jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                            interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                            c34865a.f146872w = c34894u5;
                            c34865a.f146873x = interfaceC26651e2;
                            c34865a.f146874y = null;
                            c34865a.f146875z = null;
                            c34865a.f146863E = null;
                            c34865a.f146864F = c34894uM110032a;
                            c34865a.f146865G = null;
                            c34865a.f146866H = c30334c5;
                            c34865a.f146867I = interfaceC15761b;
                            c34865a.f146868J = jM134379markNowz9LOYto3;
                            c34865a.f146871M = 5;
                            if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                                C34894u c34894u13 = c34894u5;
                                c30334c6 = c30334c5;
                                interfaceC15761b5 = interfaceC15761b;
                                c34894u6 = c34894u13;
                                j13 = jM134379markNowz9LOYto3;
                                TimedValue timedValue10 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                                AbstractC12667a.m35441M(c30334c6, timedValue10.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                                timedValue10.getValue();
                                if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                                    AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                                }
                                c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                                if (c0332w0.f1164E == null) {
                                    throw new IllegalStateException(str2);
                                }
                                AbstractC22676k.m65750j(c12002a2, str3);
                                it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    ((InterfaceC4526a) it6.next()).getClass();
                                }
                                c34865a.f146872w = null;
                                c34865a.f146873x = null;
                                c34865a.f146874y = null;
                                c34865a.f146875z = null;
                                c34865a.f146863E = null;
                                c34865a.f146864F = null;
                                c34865a.f146865G = null;
                                c34865a.f146866H = null;
                                c34865a.f146867I = null;
                                c34865a.f146871M = 6;
                                objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                                if (objM110026b == enumC31071a) {
                                    return objM110026b;
                                }
                            }
                        }
                    }
                }
                return enumC31071a;
            case 2:
                j7 = c34865a.f146868J;
                C15762c c15762c2 = c34865a.f146863E;
                c30334c2 = (C30334c) c34865a.f146875z;
                interfaceC15761b = c34865a.f146874y;
                interfaceC26651e2 = c34865a.f146873x;
                C34894u c34894u14 = c34865a.f146872w;
                AbstractC34132o.m107864I(objMo1862f);
                c34894u3 = c34894u14;
                interfaceC15761b2 = c15762c2;
                list2 = list3;
                obj = objMo1862f;
                c15768i = c15768i2;
                str2 = "Required value was null.";
                TimedValue timedValue11 = new TimedValue((InterfaceC38255a) obj, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j7), null);
                AbstractC12667a.m35441M(c30334c2, timedValue11.m134401getDurationUwyO8pc(), interfaceC15761b2, null);
                interfaceC38255a = (InterfaceC38255a) timedValue11.getValue();
                c12002a = c34894u3.f146958a;
                set = (Set) interfaceC38255a.getAttributes().mo33082b(AbstractC3187b.f12493a);
                if (set != null) {
                    it3 = AbstractC25265s.m74138n1(AbstractC25265s.m74093D1(set)).iterator();
                    while (it3.hasNext()) {
                        AbstractC3187b.m9170b(c12002a, (InterfaceC3186a) it3.next());
                    }
                }
                c34896w = new C34896w(c12002a, AbstractC32306h.m100570s((C35937b) c34894u3.f146959b), interfaceC38255a);
                interfaceC34875f = this.f146880d;
                if (interfaceC34875f != null) {
                    c30334c3 = AbstractC31780b.m98689j(c12002a).f146953i;
                    interfaceC15761b3 = (InterfaceC15761b) c12002a.mo33082b(AbstractC34881i.f146920h);
                    if (interfaceC15761b3 == null) {
                        interfaceC15761b3 = c15768i;
                    }
                    jM134379markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                    c34865a.f146872w = c34894u3;
                    c34865a.f146873x = interfaceC26651e2;
                    c34865a.f146874y = interfaceC15761b;
                    c34865a.f146875z = interfaceC38255a;
                    c34894u4 = c34894u3;
                    c34865a.f146863E = null;
                    c34865a.f146864F = c30334c3;
                    c34865a.f146865G = interfaceC15761b3;
                    c34865a.f146866H = null;
                    c34865a.f146868J = jM134379markNowz9LOYto2;
                    c34865a.f146871M = 3;
                    objMo8834c = interfaceC34875f.mo8834c(c34896w, c34865a);
                    if (objMo8834c != enumC31071a) {
                        obj2 = objMo8834c;
                        c30334c4 = c30334c3;
                        c34894u3 = c34894u4;
                        interfaceC38255a3 = interfaceC38255a;
                        TimedValue timedValue12 = new TimedValue((C13140a) obj2, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(jM134379markNowz9LOYto2), null);
                        AbstractC12667a.m35441M(c30334c4, timedValue12.m134401getDurationUwyO8pc(), interfaceC15761b3, null);
                        c13140a = (C13140a) timedValue12.getValue();
                        context = c34865a.getContext();
                        c32355c = new C32355c(c13140a, 19);
                        enumC27905b = EnumC27905b.f112507z;
                        qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34867b.class).getQualifiedName();
                        if (qualifiedName != null) {
                            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                        }
                        AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c32355c);
                        AbstractC31834n.m98902k(c34894u3, c13140a);
                        C12002a c12002a7 = c34894u3.f146958a;
                        InterfaceC15761b interfaceC15761b8 = c13140a.f45449b;
                        iterable = (List) interfaceC15761b8.mo33082b(AbstractC13141b.f45450a);
                        if (iterable == null) {
                            iterable = C25271y.f99162w;
                        }
                        it4 = iterable.iterator();
                        do {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                            } else {
                                next2 = null;
                            }
                            c34855a2 = (C34855a) next2;
                            if (c34855a2 != null) {
                                interfaceC15761b4 = c34855a2.f146801b;
                            } else {
                                interfaceC15761b4 = c15768i;
                            }
                            AbstractC21598x.m60675c0(c12002a7, interfaceC15761b4);
                            AbstractC21598x.m60675c0(c12002a7, interfaceC15761b8);
                            interfaceC38255a2 = interfaceC38255a3;
                            C35937b c35937b8 = (C35937b) c34894u3.f146959b;
                            AbstractC22676k.m65750j(c35937b8, "<this>");
                            C35942g c35942g7 = new C35942g(c35937b8, true);
                            c34865a.f146872w = c34894u3;
                            c34865a.f146873x = interfaceC26651e2;
                            c34865a.f146874y = interfaceC15761b;
                            c34865a.f146875z = interfaceC38255a2;
                            c34865a.f146863E = null;
                            c34865a.f146864F = null;
                            c34865a.f146865G = null;
                            c34865a.f146866H = null;
                            c34865a.f146871M = 4;
                            objM839B = c0332w0.m839B(c35942g7, c34865a);
                            if (objM839B != enumC31071a) {
                                c34894u5 = c34894u3;
                                objMo1862f = objM839B;
                                c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                                c35937b = (C35937b) c34894uM110032a.f146959b;
                                c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                                if (c0332w0.f1164E != null) {
                                    throw new IllegalStateException(str2);
                                }
                                AbstractC22676k.m65750j(c12002a2, str3);
                                it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    ((InterfaceC4526a) it5.next()).getClass();
                                }
                                c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                                c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                                jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                                interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                                c34865a.f146872w = c34894u5;
                                c34865a.f146873x = interfaceC26651e2;
                                c34865a.f146874y = null;
                                c34865a.f146875z = null;
                                c34865a.f146863E = null;
                                c34865a.f146864F = c34894uM110032a;
                                c34865a.f146865G = null;
                                c34865a.f146866H = c30334c5;
                                c34865a.f146867I = interfaceC15761b;
                                c34865a.f146868J = jM134379markNowz9LOYto3;
                                c34865a.f146871M = 5;
                                if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                                    C34894u c34894u15 = c34894u5;
                                    c30334c6 = c30334c5;
                                    interfaceC15761b5 = interfaceC15761b;
                                    c34894u6 = c34894u15;
                                    j13 = jM134379markNowz9LOYto3;
                                    TimedValue timedValue13 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                                    AbstractC12667a.m35441M(c30334c6, timedValue13.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                                    timedValue13.getValue();
                                    if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                                        AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                                    }
                                    c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                                    if (c0332w0.f1164E == null) {
                                        throw new IllegalStateException(str2);
                                    }
                                    AbstractC22676k.m65750j(c12002a2, str3);
                                    it6 = list2.iterator();
                                    while (it6.hasNext()) {
                                        ((InterfaceC4526a) it6.next()).getClass();
                                    }
                                    c34865a.f146872w = null;
                                    c34865a.f146873x = null;
                                    c34865a.f146874y = null;
                                    c34865a.f146875z = null;
                                    c34865a.f146863E = null;
                                    c34865a.f146864F = null;
                                    c34865a.f146865G = null;
                                    c34865a.f146866H = null;
                                    c34865a.f146867I = null;
                                    c34865a.f146871M = 6;
                                    objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                                    if (objM110026b == enumC31071a) {
                                        return objM110026b;
                                    }
                                }
                            }
                        } while (!AbstractC22676k.m65745e(((C34855a) next2).f146800a, interfaceC26651e2.mo79292c()));
                        c34855a2 = (C34855a) next2;
                        if (c34855a2 != null) {
                            interfaceC15761b4 = c34855a2.f146801b;
                        } else {
                            interfaceC15761b4 = c15768i;
                        }
                        AbstractC21598x.m60675c0(c12002a7, interfaceC15761b4);
                        AbstractC21598x.m60675c0(c12002a7, interfaceC15761b8);
                        interfaceC38255a2 = interfaceC38255a3;
                        C35937b c35937b9 = (C35937b) c34894u3.f146959b;
                        AbstractC22676k.m65750j(c35937b9, "<this>");
                        C35942g c35942g8 = new C35942g(c35937b9, true);
                        c34865a.f146872w = c34894u3;
                        c34865a.f146873x = interfaceC26651e2;
                        c34865a.f146874y = interfaceC15761b;
                        c34865a.f146875z = interfaceC38255a2;
                        c34865a.f146863E = null;
                        c34865a.f146864F = null;
                        c34865a.f146865G = null;
                        c34865a.f146866H = null;
                        c34865a.f146871M = 4;
                        objM839B = c0332w0.m839B(c35942g8, c34865a);
                        if (objM839B != enumC31071a) {
                            c34894u5 = c34894u3;
                            objMo1862f = objM839B;
                            c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                            c35937b = (C35937b) c34894uM110032a.f146959b;
                            c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                            if (c0332w0.f1164E != null) {
                                throw new IllegalStateException(str2);
                            }
                            AbstractC22676k.m65750j(c12002a2, str3);
                            it5 = list2.iterator();
                            while (it5.hasNext()) {
                                ((InterfaceC4526a) it5.next()).getClass();
                            }
                            c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                            c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                            jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                            interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                            c34865a.f146872w = c34894u5;
                            c34865a.f146873x = interfaceC26651e2;
                            c34865a.f146874y = null;
                            c34865a.f146875z = null;
                            c34865a.f146863E = null;
                            c34865a.f146864F = c34894uM110032a;
                            c34865a.f146865G = null;
                            c34865a.f146866H = c30334c5;
                            c34865a.f146867I = interfaceC15761b;
                            c34865a.f146868J = jM134379markNowz9LOYto3;
                            c34865a.f146871M = 5;
                            if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                                C34894u c34894u16 = c34894u5;
                                c30334c6 = c30334c5;
                                interfaceC15761b5 = interfaceC15761b;
                                c34894u6 = c34894u16;
                                j13 = jM134379markNowz9LOYto3;
                                TimedValue timedValue14 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                                AbstractC12667a.m35441M(c30334c6, timedValue14.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                                timedValue14.getValue();
                                if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                                    AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                                }
                                c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                                if (c0332w0.f1164E == null) {
                                    throw new IllegalStateException(str2);
                                }
                                AbstractC22676k.m65750j(c12002a2, str3);
                                it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    ((InterfaceC4526a) it6.next()).getClass();
                                }
                                c34865a.f146872w = null;
                                c34865a.f146873x = null;
                                c34865a.f146874y = null;
                                c34865a.f146875z = null;
                                c34865a.f146863E = null;
                                c34865a.f146864F = null;
                                c34865a.f146865G = null;
                                c34865a.f146866H = null;
                                c34865a.f146867I = null;
                                c34865a.f146871M = 6;
                                objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                                if (objM110026b == enumC31071a) {
                                    return objM110026b;
                                }
                            }
                        }
                    }
                } else {
                    str3 = "executionContext";
                    interfaceC38255a2 = interfaceC38255a;
                    C35937b c35937b10 = (C35937b) c34894u3.f146959b;
                    AbstractC22676k.m65750j(c35937b10, "<this>");
                    C35942g c35942g9 = new C35942g(c35937b10, true);
                    c34865a.f146872w = c34894u3;
                    c34865a.f146873x = interfaceC26651e2;
                    c34865a.f146874y = interfaceC15761b;
                    c34865a.f146875z = interfaceC38255a2;
                    c34865a.f146863E = null;
                    c34865a.f146864F = null;
                    c34865a.f146865G = null;
                    c34865a.f146866H = null;
                    c34865a.f146871M = 4;
                    objM839B = c0332w0.m839B(c35942g9, c34865a);
                    if (objM839B != enumC31071a) {
                        c34894u5 = c34894u3;
                        objMo1862f = objM839B;
                        c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                        c35937b = (C35937b) c34894uM110032a.f146959b;
                        c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                        if (c0332w0.f1164E != null) {
                            throw new IllegalStateException(str2);
                        }
                        AbstractC22676k.m65750j(c12002a2, str3);
                        it5 = list2.iterator();
                        while (it5.hasNext()) {
                            ((InterfaceC4526a) it5.next()).getClass();
                        }
                        c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                        c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                        jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                        interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                        c34865a.f146872w = c34894u5;
                        c34865a.f146873x = interfaceC26651e2;
                        c34865a.f146874y = null;
                        c34865a.f146875z = null;
                        c34865a.f146863E = null;
                        c34865a.f146864F = c34894uM110032a;
                        c34865a.f146865G = null;
                        c34865a.f146866H = c30334c5;
                        c34865a.f146867I = interfaceC15761b;
                        c34865a.f146868J = jM134379markNowz9LOYto3;
                        c34865a.f146871M = 5;
                        if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                            C34894u c34894u17 = c34894u5;
                            c30334c6 = c30334c5;
                            interfaceC15761b5 = interfaceC15761b;
                            c34894u6 = c34894u17;
                            j13 = jM134379markNowz9LOYto3;
                            TimedValue timedValue15 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                            AbstractC12667a.m35441M(c30334c6, timedValue15.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                            timedValue15.getValue();
                            if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                                AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                            }
                            c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                            if (c0332w0.f1164E == null) {
                                throw new IllegalStateException(str2);
                            }
                            AbstractC22676k.m65750j(c12002a2, str3);
                            it6 = list2.iterator();
                            while (it6.hasNext()) {
                                ((InterfaceC4526a) it6.next()).getClass();
                            }
                            c34865a.f146872w = null;
                            c34865a.f146873x = null;
                            c34865a.f146874y = null;
                            c34865a.f146875z = null;
                            c34865a.f146863E = null;
                            c34865a.f146864F = null;
                            c34865a.f146865G = null;
                            c34865a.f146866H = null;
                            c34865a.f146867I = null;
                            c34865a.f146871M = 6;
                            objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                            if (objM110026b == enumC31071a) {
                                return objM110026b;
                            }
                        }
                    }
                }
                return enumC31071a;
            case 3:
                long j14 = c34865a.f146868J;
                InterfaceC15761b interfaceC15761b9 = c34865a.f146865G;
                c30334c4 = (C30334c) c34865a.f146864F;
                interfaceC38255a = (InterfaceC38255a) c34865a.f146875z;
                InterfaceC15761b interfaceC15761b10 = c34865a.f146874y;
                InterfaceC26651e interfaceC26651e3 = c34865a.f146873x;
                C34894u c34894u18 = c34865a.f146872w;
                AbstractC34132o.m107864I(objMo1862f);
                c15768i = c15768i2;
                str2 = "Required value was null.";
                interfaceC15761b3 = interfaceC15761b9;
                c34894u3 = c34894u18;
                obj2 = objMo1862f;
                list2 = list3;
                jM134379markNowz9LOYto2 = j14;
                interfaceC26651e2 = interfaceC26651e3;
                interfaceC15761b = interfaceC15761b10;
                interfaceC38255a3 = interfaceC38255a;
                TimedValue timedValue16 = new TimedValue((C13140a) obj2, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(jM134379markNowz9LOYto2), null);
                AbstractC12667a.m35441M(c30334c4, timedValue16.m134401getDurationUwyO8pc(), interfaceC15761b3, null);
                c13140a = (C13140a) timedValue16.getValue();
                context = c34865a.getContext();
                c32355c = new C32355c(c13140a, 19);
                enumC27905b = EnumC27905b.f112507z;
                qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34867b.class).getQualifiedName();
                if (qualifiedName != null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                }
                AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c32355c);
                AbstractC31834n.m98902k(c34894u3, c13140a);
                C12002a c12002a8 = c34894u3.f146958a;
                InterfaceC15761b interfaceC15761b11 = c13140a.f45449b;
                iterable = (List) interfaceC15761b11.mo33082b(AbstractC13141b.f45450a);
                if (iterable == null) {
                    iterable = C25271y.f99162w;
                }
                it4 = iterable.iterator();
                do {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                    } else {
                        next2 = null;
                    }
                    c34855a2 = (C34855a) next2;
                    if (c34855a2 != null) {
                        interfaceC15761b4 = c34855a2.f146801b;
                    } else {
                        interfaceC15761b4 = c15768i;
                    }
                    AbstractC21598x.m60675c0(c12002a8, interfaceC15761b4);
                    AbstractC21598x.m60675c0(c12002a8, interfaceC15761b11);
                    interfaceC38255a2 = interfaceC38255a3;
                    C35937b c35937b11 = (C35937b) c34894u3.f146959b;
                    AbstractC22676k.m65750j(c35937b11, "<this>");
                    C35942g c35942g10 = new C35942g(c35937b11, true);
                    c34865a.f146872w = c34894u3;
                    c34865a.f146873x = interfaceC26651e2;
                    c34865a.f146874y = interfaceC15761b;
                    c34865a.f146875z = interfaceC38255a2;
                    c34865a.f146863E = null;
                    c34865a.f146864F = null;
                    c34865a.f146865G = null;
                    c34865a.f146866H = null;
                    c34865a.f146871M = 4;
                    objM839B = c0332w0.m839B(c35942g10, c34865a);
                    if (objM839B != enumC31071a) {
                        c34894u5 = c34894u3;
                        objMo1862f = objM839B;
                        c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                        c35937b = (C35937b) c34894uM110032a.f146959b;
                        c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                        if (c0332w0.f1164E != null) {
                            throw new IllegalStateException(str2);
                        }
                        AbstractC22676k.m65750j(c12002a2, str3);
                        it5 = list2.iterator();
                        while (it5.hasNext()) {
                            ((InterfaceC4526a) it5.next()).getClass();
                        }
                        c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                        c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                        jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                        interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                        c34865a.f146872w = c34894u5;
                        c34865a.f146873x = interfaceC26651e2;
                        c34865a.f146874y = null;
                        c34865a.f146875z = null;
                        c34865a.f146863E = null;
                        c34865a.f146864F = c34894uM110032a;
                        c34865a.f146865G = null;
                        c34865a.f146866H = c30334c5;
                        c34865a.f146867I = interfaceC15761b;
                        c34865a.f146868J = jM134379markNowz9LOYto3;
                        c34865a.f146871M = 5;
                        if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                            C34894u c34894u19 = c34894u5;
                            c30334c6 = c30334c5;
                            interfaceC15761b5 = interfaceC15761b;
                            c34894u6 = c34894u19;
                            j13 = jM134379markNowz9LOYto3;
                            TimedValue timedValue17 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                            AbstractC12667a.m35441M(c30334c6, timedValue17.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                            timedValue17.getValue();
                            if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                                AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                            }
                            c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                            if (c0332w0.f1164E == null) {
                                throw new IllegalStateException(str2);
                            }
                            AbstractC22676k.m65750j(c12002a2, str3);
                            it6 = list2.iterator();
                            while (it6.hasNext()) {
                                ((InterfaceC4526a) it6.next()).getClass();
                            }
                            c34865a.f146872w = null;
                            c34865a.f146873x = null;
                            c34865a.f146874y = null;
                            c34865a.f146875z = null;
                            c34865a.f146863E = null;
                            c34865a.f146864F = null;
                            c34865a.f146865G = null;
                            c34865a.f146866H = null;
                            c34865a.f146867I = null;
                            c34865a.f146871M = 6;
                            objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                            if (objM110026b == enumC31071a) {
                                return objM110026b;
                            }
                        }
                    }
                    return enumC31071a;
                } while (!AbstractC22676k.m65745e(((C34855a) next2).f146800a, interfaceC26651e2.mo79292c()));
                c34855a2 = (C34855a) next2;
                if (c34855a2 != null) {
                    interfaceC15761b4 = c34855a2.f146801b;
                } else {
                    interfaceC15761b4 = c15768i;
                }
                AbstractC21598x.m60675c0(c12002a8, interfaceC15761b4);
                AbstractC21598x.m60675c0(c12002a8, interfaceC15761b11);
                interfaceC38255a2 = interfaceC38255a3;
                C35937b c35937b12 = (C35937b) c34894u3.f146959b;
                AbstractC22676k.m65750j(c35937b12, "<this>");
                C35942g c35942g11 = new C35942g(c35937b12, true);
                c34865a.f146872w = c34894u3;
                c34865a.f146873x = interfaceC26651e2;
                c34865a.f146874y = interfaceC15761b;
                c34865a.f146875z = interfaceC38255a2;
                c34865a.f146863E = null;
                c34865a.f146864F = null;
                c34865a.f146865G = null;
                c34865a.f146866H = null;
                c34865a.f146871M = 4;
                objM839B = c0332w0.m839B(c35942g11, c34865a);
                if (objM839B != enumC31071a) {
                    c34894u5 = c34894u3;
                    objMo1862f = objM839B;
                    c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                    c35937b = (C35937b) c34894uM110032a.f146959b;
                    c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                    if (c0332w0.f1164E != null) {
                        throw new IllegalStateException(str2);
                    }
                    AbstractC22676k.m65750j(c12002a2, str3);
                    it5 = list2.iterator();
                    while (it5.hasNext()) {
                        ((InterfaceC4526a) it5.next()).getClass();
                    }
                    c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                    c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                    jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                    interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                    c34865a.f146872w = c34894u5;
                    c34865a.f146873x = interfaceC26651e2;
                    c34865a.f146874y = null;
                    c34865a.f146875z = null;
                    c34865a.f146863E = null;
                    c34865a.f146864F = c34894uM110032a;
                    c34865a.f146865G = null;
                    c34865a.f146866H = c30334c5;
                    c34865a.f146867I = interfaceC15761b;
                    c34865a.f146868J = jM134379markNowz9LOYto3;
                    c34865a.f146871M = 5;
                    if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                        C34894u c34894u110 = c34894u5;
                        c30334c6 = c30334c5;
                        interfaceC15761b5 = interfaceC15761b;
                        c34894u6 = c34894u110;
                        j13 = jM134379markNowz9LOYto3;
                        TimedValue timedValue18 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                        AbstractC12667a.m35441M(c30334c6, timedValue18.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                        timedValue18.getValue();
                        if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                            AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                        }
                        c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                        if (c0332w0.f1164E == null) {
                            throw new IllegalStateException(str2);
                        }
                        AbstractC22676k.m65750j(c12002a2, str3);
                        it6 = list2.iterator();
                        while (it6.hasNext()) {
                            ((InterfaceC4526a) it6.next()).getClass();
                        }
                        c34865a.f146872w = null;
                        c34865a.f146873x = null;
                        c34865a.f146874y = null;
                        c34865a.f146875z = null;
                        c34865a.f146863E = null;
                        c34865a.f146864F = null;
                        c34865a.f146865G = null;
                        c34865a.f146866H = null;
                        c34865a.f146867I = null;
                        c34865a.f146871M = 6;
                        objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                        if (objM110026b == enumC31071a) {
                            return objM110026b;
                        }
                    }
                }
                return enumC31071a;
            case 4:
                interfaceC38255a2 = (InterfaceC38255a) c34865a.f146875z;
                InterfaceC15761b interfaceC15761b12 = c34865a.f146874y;
                InterfaceC26651e interfaceC26651e4 = c34865a.f146873x;
                c34894u5 = c34865a.f146872w;
                AbstractC34132o.m107864I(objMo1862f);
                list2 = list3;
                interfaceC15761b = interfaceC15761b12;
                interfaceC26651e2 = interfaceC26651e4;
                str2 = "Required value was null.";
                str3 = "executionContext";
                c34894uM110032a = C34894u.m110032a(c34894u5, AbstractC32309k.m100579i((InterfaceC35936a) objMo1862f));
                c35937b = (C35937b) c34894uM110032a.f146959b;
                c0332w0.f1165F = AbstractC32306h.m100570s(c35937b);
                if (c0332w0.f1164E != null) {
                    throw new IllegalStateException(str2);
                }
                AbstractC22676k.m65750j(c12002a2, str3);
                it5 = list2.iterator();
                while (it5.hasNext()) {
                    ((InterfaceC4526a) it5.next()).getClass();
                }
                c26657k = new C26657k(c35937b, interfaceC38255a2, c34894uM110032a.f146958a);
                c30334c5 = AbstractC31780b.m98689j(c34894u5.f146958a).f146955k;
                jM134379markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                interfaceC26655iMo79291b = interfaceC26651e2.mo79291b();
                c34865a.f146872w = c34894u5;
                c34865a.f146873x = interfaceC26651e2;
                c34865a.f146874y = null;
                c34865a.f146875z = null;
                c34865a.f146863E = null;
                c34865a.f146864F = c34894uM110032a;
                c34865a.f146865G = null;
                c34865a.f146866H = c30334c5;
                c34865a.f146867I = interfaceC15761b;
                c34865a.f146868J = jM134379markNowz9LOYto3;
                c34865a.f146871M = 5;
                if (interfaceC26655iMo79291b.mo79293a(c26657k, c34865a) != enumC31071a) {
                    C34894u c34894u111 = c34894u5;
                    c30334c6 = c30334c5;
                    interfaceC15761b5 = interfaceC15761b;
                    c34894u6 = c34894u111;
                    j13 = jM134379markNowz9LOYto3;
                    TimedValue timedValue19 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                    AbstractC12667a.m35441M(c30334c6, timedValue19.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                    timedValue19.getValue();
                    if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                        AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                    }
                    c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                    if (c0332w0.f1164E == null) {
                        throw new IllegalStateException(str2);
                    }
                    AbstractC22676k.m65750j(c12002a2, str3);
                    it6 = list2.iterator();
                    while (it6.hasNext()) {
                        ((InterfaceC4526a) it6.next()).getClass();
                    }
                    c34865a.f146872w = null;
                    c34865a.f146873x = null;
                    c34865a.f146874y = null;
                    c34865a.f146875z = null;
                    c34865a.f146863E = null;
                    c34865a.f146864F = null;
                    c34865a.f146865G = null;
                    c34865a.f146866H = null;
                    c34865a.f146867I = null;
                    c34865a.f146871M = 6;
                    objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                    if (objM110026b == enumC31071a) {
                        return objM110026b;
                    }
                }
                return enumC31071a;
            case 5:
                j13 = c34865a.f146868J;
                interfaceC15761b5 = c34865a.f146867I;
                c30334c6 = c34865a.f146866H;
                C34894u c34894u20 = (C34894u) c34865a.f146864F;
                interfaceC26651e2 = c34865a.f146873x;
                c34894u6 = c34865a.f146872w;
                AbstractC34132o.m107864I(objMo1862f);
                list2 = list3;
                str2 = "Required value was null.";
                c34894uM110032a = c34894u20;
                str3 = "executionContext";
                TimedValue timedValue110 = new TimedValue(C23454a0.f92919a, TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(j13), null);
                AbstractC12667a.m35441M(c30334c6, timedValue110.m134401getDurationUwyO8pc(), interfaceC15761b5, null);
                timedValue110.getValue();
                if (AbstractC22676k.m65745e(interfaceC26651e2.mo79292c(), "aws.auth#sigv4a")) {
                    AbstractC3187b.m9170b(c34894u6.f146958a, EnumC3188c.SIGV4A_SIGNING);
                }
                c0332w0.f1165F = AbstractC32306h.m100570s((C35937b) c34894uM110032a.f146959b);
                if (c0332w0.f1164E == null) {
                    throw new IllegalStateException(str2);
                }
                AbstractC22676k.m65750j(c12002a2, str3);
                it6 = list2.iterator();
                while (it6.hasNext()) {
                    ((InterfaceC4526a) it6.next()).getClass();
                }
                c34865a.f146872w = null;
                c34865a.f146873x = null;
                c34865a.f146874y = null;
                c34865a.f146875z = null;
                c34865a.f146863E = null;
                c34865a.f146864F = null;
                c34865a.f146865G = null;
                c34865a.f146866H = null;
                c34865a.f146867I = null;
                c34865a.f146871M = 6;
                objM110026b = this.f146877a.m110026b(c34894uM110032a, c34865a);
                if (objM110026b == enumC31071a) {
                    return enumC31071a;
                }
                return objM110026b;
            case 6:
                AbstractC34132o.m107864I(objMo1862f);
                return objMo1862f;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
