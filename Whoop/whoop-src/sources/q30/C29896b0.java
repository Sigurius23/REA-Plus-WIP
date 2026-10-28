package q30;

import ai.C0904j;
import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import ec3.C13045h2;
import gm.C15990r;
import java.io.Serializable;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l30.C23292a;
import l83.C23454a0;
import l83.C23468n;
import n30.C26212c;
import o30.EnumC27505c;
import org.json.JSONObject;
import p088dc.AbstractC11895b;
import p127ev.C13668i;
import p335n6.AbstractC26394k;
import p350nw.C27180a;
import p350nw.C27181b;
import p350nw.C27188i;
import p390p1.C28688y1;
import p390p1.EnumC28681w1;
import p395p6.C28894l;
import p395p6.C28899m1;
import p505ts.AbstractC34132o;
import p605x6.C38015t;
import p605x6.C38017v;
import p605x6.InterfaceC38016u;
import p628xw.AbstractC38674d;
import p628xw.C38672b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22667f0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import yb3.AbstractC39414r;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: q30.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29896b0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f122139E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Serializable f122140F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f122141G;

    /* JADX INFO: renamed from: H */
    public Object f122142H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f122143I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f122144J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f122145K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f122146L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122147w = 1;

    /* JADX INFO: renamed from: x */
    public int f122148x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f122149y;

    /* JADX INFO: renamed from: z */
    public Object f122150z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29896b0(C28894l c28894l, C28688y1 c28688y1, C22667f0 c22667f0, C13045h2 c13045h2, Context context, C28899m1 c28899m1, InterfaceC38016u interfaceC38016u, C38015t c38015t, InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f122150z = c28894l;
        this.f122139E = c28688y1;
        this.f122140F = c22667f0;
        this.f122141G = c13045h2;
        this.f122142H = context;
        this.f122143I = c28899m1;
        this.f122144J = interfaceC38016u;
        this.f122145K = c38015t;
        this.f122146L = interfaceC2994c0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f122147w) {
            case 0:
                C29896b0 c29896b0 = new C29896b0((C29926q0) this.f122143I, (C13668i) this.f122144J, (PublicKey) this.f122145K, (String) this.f122140F, (String) this.f122141G, (PublicKey) this.f122146L, interfaceC30057d);
                c29896b0.f122149y = obj;
                return c29896b0;
            default:
                C29896b0 c29896b1 = new C29896b0((C28894l) this.f122150z, (C28688y1) this.f122139E, (C22667f0) this.f122140F, (C13045h2) this.f122141G, (Context) this.f122142H, (C28899m1) this.f122143I, (InterfaceC38016u) this.f122144J, (C38015t) this.f122145K, (InterfaceC2994c0) this.f122146L, interfaceC30057d);
                c29896b1.f122149y = obj;
                return c29896b1;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f122147w) {
            case 0:
                return ((C29896b0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C29896b0) create((EnumC28681w1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x020f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0219  */
    /* JADX WARN: Code duplicated, block: B:86:0x023f  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bf A[SYNTHETIC] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM107888l;
        String str;
        Object objM2221h;
        Iterator it;
        Object next;
        EnumC27505c enumC27505c;
        C27188i c27188i;
        String str2;
        C15990r c15990r;
        Object objM38533d;
        String str3;
        PublicKey publicKey;
        String str4;
        Object objM87812a;
        switch (this.f122147w) {
            case 0:
                String str5 = (String) this.f122140F;
                String directoryServerId = (String) this.f122141G;
                C29926q0 c29926q0 = (C29926q0) this.f122143I;
                C13668i c13668i = (C13668i) this.f122144J;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f122148x;
                try {
                    if (i13 != 0) {
                        if (i13 == 1) {
                            c15990r = (C15990r) this.f122142H;
                            String str6 = (String) this.f122139E;
                            String str7 = (String) ((Serializable) this.f122150z);
                            PublicKey publicKey2 = (PublicKey) this.f122149y;
                            AbstractC34132o.m107864I(obj);
                            publicKey = publicKey2;
                            str4 = str7;
                            str3 = str6;
                            objM38533d = obj;
                        } else {
                            if (i13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c29926q0 = (C29926q0) ((Serializable) this.f122150z);
                            str = (String) this.f122149y;
                            AbstractC34132o.m107864I(obj);
                            objM2221h = obj;
                        }
                        String str8 = str;
                        C29926q0 c29926q1 = c29926q0;
                        String str9 = ((C23292a) objM2221h).f92280w;
                        String str10 = (String) c13668i.f48460g;
                        PublicKey publicKey3 = (PublicKey) this.f122145K;
                        AbstractC22676k.m65750j(directoryServerId, "directoryServerId");
                        it = EnumC27505c.f110775z.iterator();
                        try {
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                enumC27505c = (EnumC27505c) next;
                                if (enumC27505c != null) {
                                    c27188i = enumC27505c.f110777x;
                                } else {
                                    c27188i = C27188i.f108836x;
                                }
                                C27188i c27188i2 = c27188i;
                                C27180a c27180a = C27180a.f108790y;
                                ECPublicKey eCPublicKey = (ECPublicKey) publicKey3;
                                C38672b c38672bM81763e = C27181b.m81763e(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX());
                                C38672b c38672bM81763e2 = C27181b.m81763e(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY());
                                Objects.requireNonNull(c27180a, "The curve must not be null");
                                if (str5 != null || AbstractC39414r.m125890i0(str5)) {
                                    str2 = null;
                                } else {
                                    str2 = str5;
                                }
                                C27181b c27181b = new C27181b(c27180a, c38672bM81763e, c38672bM81763e2, c27188i2, null, null, str2, null, null, null, null, null, null, null, null);
                                List list = c27181b.f108807I;
                                String strM124060j = AbstractC38674d.m124060j(new C27181b(c27181b.f108795O, c27181b.f108796P, c27181b.f108797Q, c27181b.f108814x, c27181b.f108815y, c27181b.f108816z, c27181b.f108803E, c27181b.f108804F, c27181b.f108805G, c27181b.f108806H, list != null ? Collections.unmodifiableList(list) : null, c27181b.f108808J, c27181b.f108809K, c27181b.f108810L, c27181b.f108811M).mo81767d());
                                AbstractC22676k.m65749i(strM124060j, "toJSONString(...)");
                                ((C29924p0) c13668i.f48459f).getClass();
                                return new C29895b(str8, c29926q1, str9, str10, strM124060j, "2.2.0");
                            } while (!((EnumC27505c) next).f110776w.contains(directoryServerId));
                            C27181b c27181b2 = new C27181b(c27180a, c38672bM81763e, c38672bM81763e2, c27188i2, null, null, str2, null, null, null, null, null, null, null, null);
                            List list2 = c27181b2.f108807I;
                            String strM124060j2 = AbstractC38674d.m124060j(new C27181b(c27181b2.f108795O, c27181b2.f108796P, c27181b2.f108797Q, c27181b2.f108814x, c27181b2.f108815y, c27181b2.f108816z, c27181b2.f108803E, c27181b2.f108804F, c27181b2.f108805G, c27181b2.f108806H, list2 != null ? Collections.unmodifiableList(list2) : null, c27181b2.f108808J, c27181b2.f108809K, c27181b2.f108810L, c27181b2.f108811M).mo81767d());
                            AbstractC22676k.m65749i(strM124060j2, "toJSONString(...)");
                            ((C29924p0) c13668i.f48459f).getClass();
                            return new C29895b(str8, c29926q1, str9, str10, strM124060j2, "2.2.0");
                        } catch (IllegalArgumentException e5) {
                            throw new IllegalStateException(e5.getMessage(), e5);
                        }
                        enumC27505c = (EnumC27505c) next;
                        if (enumC27505c != null) {
                            c27188i = enumC27505c.f110777x;
                        } else {
                            c27188i = C27188i.f108836x;
                        }
                        C27188i c27188i3 = c27188i;
                        C27180a c27180a2 = C27180a.f108790y;
                        ECPublicKey eCPublicKey2 = (ECPublicKey) publicKey3;
                        C38672b c38672bM81763e3 = C27181b.m81763e(eCPublicKey2.getParams().getCurve().getField().getFieldSize(), eCPublicKey2.getW().getAffineX());
                        C38672b c38672bM81763e4 = C27181b.m81763e(eCPublicKey2.getParams().getCurve().getField().getFieldSize(), eCPublicKey2.getW().getAffineY());
                        Objects.requireNonNull(c27180a2, "The curve must not be null");
                        if (str5 != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                    } else {
                        AbstractC34132o.m107864I(obj);
                        PublicKey publicKey4 = (PublicKey) this.f122146L;
                        c15990r = (C15990r) c13668i.f48458e;
                        this.f122149y = publicKey4;
                        this.f122150z = directoryServerId;
                        this.f122139E = str5;
                        this.f122142H = c15990r;
                        this.f122148x = 1;
                        objM38533d = c13668i.m38533d(c29926q0, this);
                        if (objM38533d == enumC31071a) {
                            return enumC31071a;
                        }
                        str3 = str5;
                        publicKey = publicKey4;
                        str4 = directoryServerId;
                    }
                    String string = ((JSONObject) objM38533d).toString();
                    AbstractC22676k.m65749i(string, "toString(...)");
                    objM107888l = c15990r.m45139B(string, publicKey, str4, str3);
                    break;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                Throwable thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    C26212c c26212c = (C26212c) c13668i.f48461h;
                    StringBuilder sbM32001t = AbstractC11895b.m32001t("\n                    Failed to encrypt AReq parameters.\n                        \n                    directoryServerId=", directoryServerId, "\n                    keyId=", str5, "\n                    sdkTransactionId=");
                    sbM32001t.append(c29926q0);
                    sbM32001t.append("\n                    ");
                    c26212c.m77828c(new RuntimeException(AbstractC39415s.m125909s(sbM32001t.toString()), thM68037a));
                }
                Throwable thM68037a2 = C23468n.m68037a(objM107888l);
                if (thM68037a2 != null) {
                    throw new SDKRuntimeException(thM68037a2);
                }
                str = (String) objM107888l;
                C0904j c0904j = (C0904j) c13668i.f48457d;
                this.f122149y = str;
                this.f122150z = c29926q0;
                this.f122139E = null;
                this.f122142H = null;
                this.f122148x = 2;
                objM2221h = c0904j.m2221h(this);
                if (objM2221h == enumC31071a) {
                    return enumC31071a;
                }
                String str11 = str;
                C29926q0 c29926q2 = c29926q0;
                String str12 = ((C23292a) objM2221h).f92280w;
                String str13 = (String) c13668i.f48460g;
                PublicKey publicKey5 = (PublicKey) this.f122145K;
                AbstractC22676k.m65750j(directoryServerId, "directoryServerId");
                it = EnumC27505c.f110775z.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    enumC27505c = (EnumC27505c) next;
                    if (enumC27505c != null) {
                        c27188i = enumC27505c.f110777x;
                    } else {
                        c27188i = C27188i.f108836x;
                    }
                    C27188i c27188i4 = c27188i;
                    C27180a c27180a3 = C27180a.f108790y;
                    ECPublicKey eCPublicKey3 = (ECPublicKey) publicKey5;
                    C38672b c38672bM81763e5 = C27181b.m81763e(eCPublicKey3.getParams().getCurve().getField().getFieldSize(), eCPublicKey3.getW().getAffineX());
                    C38672b c38672bM81763e6 = C27181b.m81763e(eCPublicKey3.getParams().getCurve().getField().getFieldSize(), eCPublicKey3.getW().getAffineY());
                    Objects.requireNonNull(c27180a3, "The curve must not be null");
                    if (str5 != null) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    C27181b c27181b3 = new C27181b(c27180a3, c38672bM81763e5, c38672bM81763e6, c27188i4, null, null, str2, null, null, null, null, null, null, null, null);
                    List list3 = c27181b3.f108807I;
                    String strM124060j3 = AbstractC38674d.m124060j(new C27181b(c27181b3.f108795O, c27181b3.f108796P, c27181b3.f108797Q, c27181b3.f108814x, c27181b3.f108815y, c27181b3.f108816z, c27181b3.f108803E, c27181b3.f108804F, c27181b3.f108805G, c27181b3.f108806H, list3 != null ? Collections.unmodifiableList(list3) : null, c27181b3.f108808J, c27181b3.f108809K, c27181b3.f108810L, c27181b3.f108811M).mo81767d());
                    AbstractC22676k.m65749i(strM124060j3, "toJSONString(...)");
                    ((C29924p0) c13668i.f48459f).getClass();
                    return new C29895b(str11, c29926q2, str12, str13, strM124060j3, "2.2.0");
                } while (!((EnumC27505c) next).f110776w.contains(directoryServerId));
                enumC27505c = (EnumC27505c) next;
                if (enumC27505c != null) {
                    c27188i = enumC27505c.f110777x;
                } else {
                    c27188i = C27188i.f108836x;
                }
                C27188i c27188i5 = c27188i;
                C27180a c27180a4 = C27180a.f108790y;
                ECPublicKey eCPublicKey4 = (ECPublicKey) publicKey5;
                C38672b c38672bM81763e7 = C27181b.m81763e(eCPublicKey4.getParams().getCurve().getField().getFieldSize(), eCPublicKey4.getW().getAffineX());
                C38672b c38672bM81763e8 = C27181b.m81763e(eCPublicKey4.getParams().getCurve().getField().getFieldSize(), eCPublicKey4.getW().getAffineY());
                Objects.requireNonNull(c27180a4, "The curve must not be null");
                if (str5 != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                C27181b c27181b4 = new C27181b(c27180a4, c38672bM81763e7, c38672bM81763e8, c27188i5, null, null, str2, null, null, null, null, null, null, null, null);
                List list4 = c27181b4.f108807I;
                String strM124060j4 = AbstractC38674d.m124060j(new C27181b(c27181b4.f108795O, c27181b4.f108796P, c27181b4.f108797Q, c27181b4.f108814x, c27181b4.f108815y, c27181b4.f108816z, c27181b4.f108803E, c27181b4.f108804F, c27181b4.f108805G, c27181b4.f108806H, list4 != null ? Collections.unmodifiableList(list4) : null, c27181b4.f108808J, c27181b4.f108809K, c27181b4.f108810L, c27181b4.f108811M).mo81767d());
                AbstractC22676k.m65749i(strM124060j4, "toJSONString(...)");
                ((C29924p0) c13668i.f48459f).getClass();
                return new C29895b(str11, c29926q2, str12, str13, strM124060j4, "2.2.0");
            default:
                C22667f0 c22667f0 = (C22667f0) this.f122140F;
                C28688y1 c28688y1 = (C28688y1) this.f122139E;
                C13045h2 c13045h2 = (C13045h2) this.f122141G;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f122148x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AbstractC34132o.m107864I(obj);
                        objM87812a = obj;
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    ((C38017v) ((InterfaceC38016u) this.f122144J)).m121747b(((C38015t) this.f122145K).f162838a);
                    c22667f0.f89335w = c28688y1.f116035a;
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                int iOrdinal = ((EnumC28681w1) this.f122149y).ordinal();
                if (iOrdinal == 0) {
                    AbstractC3006f0.m8714h((InterfaceC2994c0) this.f122146L, null);
                } else if (iOrdinal == 4) {
                    if (c28688y1.f116035a > c22667f0.f89335w || !((Boolean) c13045h2.getValue()).booleanValue()) {
                        C28894l c28894l = (C28894l) this.f122150z;
                        Context context = (Context) this.f122142H;
                        AbstractC26394k abstractC26394k = (AbstractC26394k) ((C28899m1) this.f122143I).mo78103a();
                        this.f122148x = 1;
                        c28894l.getClass();
                        objM87812a = C28894l.m87812a(c28894l, context, abstractC26394k, this);
                        if (objM87812a == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                    c22667f0.f89335w = c28688y1.f116035a;
                }
                return c23454a0;
                boolean zBooleanValue = ((Boolean) objM87812a).booleanValue();
                if (!((Boolean) c13045h2.getValue()).booleanValue() && zBooleanValue) {
                    Boolean bool = Boolean.TRUE;
                    this.f122148x = 2;
                    c13045h2.emit(bool, this);
                    if (c23454a0 == enumC31071a2) {
                        return enumC31071a2;
                    }
                    ((C38017v) ((InterfaceC38016u) this.f122144J)).m121747b(((C38015t) this.f122145K).f162838a);
                }
                c22667f0.f89335w = c28688y1.f116035a;
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29896b0(C29926q0 c29926q0, C13668i c13668i, PublicKey publicKey, String str, String str2, PublicKey publicKey2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f122143I = c29926q0;
        this.f122144J = c13668i;
        this.f122145K = publicKey;
        this.f122140F = str;
        this.f122141G = str2;
        this.f122146L = publicKey2;
    }
}
