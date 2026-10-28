package p313lz;

import android.net.Uri;
import android.util.Base64;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.financialconnections.lite.repository.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import ec3.C13045h2;
import ec3.C13096w1;
import kz.C22909f;
import kz.C22919p;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import p266jz.C22058f;
import p473rz.C31921a;
import p505ts.AbstractC34132o;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import y00.C38842g8;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: lz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C24804a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C24812i f97117E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97118w = 1;

    /* JADX INFO: renamed from: x */
    public Object f97119x;

    /* JADX INFO: renamed from: y */
    public int f97120y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f97121z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24804a(String str, C24812i c24812i, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f97121z = str;
        this.f97117E = c24812i;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f97118w) {
            case 0:
                C24804a c24804a = new C24804a(this.f97117E, this.f97121z, interfaceC30057d);
                c24804a.f97119x = obj;
                return c24804a;
            default:
                return new C24804a(this.f97121z, this.f97117E, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f97118w) {
            case 0:
                break;
        }
        return ((C24804a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:71:0x0160  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM107888l;
        Throwable thM68037a;
        Object objM123168E;
        C24812i c24812i;
        Object value;
        Object objM107888l2;
        Object obj2;
        Throwable thM68037a2;
        switch (this.f97118w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f97120y;
                C23454a0 c23454a0 = C23454a0.f92919a;
                C24812i c24812i2 = this.f97117E;
                try {
                    if (i13 != 0) {
                        if (i13 == 1) {
                            c24812i = (C24812i) this.f97119x;
                            AbstractC34132o.m107864I(obj);
                            objM123168E = ((C23468n) obj).f92940w;
                        } else {
                            if (i13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj);
                        }
                        objM107888l = c23454a0;
                        thM68037a = C23468n.m68037a(objM107888l);
                        if (thM68037a != null) {
                            c24812i2.m72715g("Failed to synchronize session", thM68037a);
                        }
                        return c23454a0;
                    }
                    AbstractC34132o.m107864I(obj);
                    String str = this.f97121z;
                    C38445a c38445a = c24812i2.f97139x;
                    C22058f c22058fMo66638b = c24812i2.f97141z.mo66638b();
                    this.f97119x = c24812i2;
                    this.f97120y = 1;
                    objM123168E = c38445a.m123168E(c22058fMo66638b, str, this);
                    if (objM123168E == enumC31071a) {
                        return enumC31071a;
                    }
                    c24812i = c24812i2;
                    AbstractC34132o.m107864I(objM123168E);
                    SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) objM123168E;
                    String strM99363a = C31921a.m99363a(c24812i.f97141z, synchronizeSessionResponse.getManifest().getHostedAuthUrl());
                    String successUrl = synchronizeSessionResponse.getManifest().getSuccessUrl();
                    if (successUrl == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String cancelUrl = synchronizeSessionResponse.getManifest().getCancelUrl();
                    if (cancelUrl == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (strM99363a == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    C24806c c24806c = new C24806c(successUrl, cancelUrl, strM99363a);
                    C13045h2 c13045h2 = c24812i.f97137G;
                    do {
                        value = c13045h2.getValue();
                    } while (!c13045h2.m36569i(value, c24806c));
                    C13096w1 c13096w1 = c24812i.f97135E;
                    C24808e c24808e = new C24808e(c24806c.f97125c);
                    this.f97119x = null;
                    this.f97120y = 2;
                    if (c13096w1.emit(c24808e, this) == enumC31071a) {
                        return enumC31071a;
                    }
                    objM107888l = c23454a0;
                    thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a != null) {
                        c24812i2.m72715g("Failed to synchronize session", thM68037a);
                    }
                    return c23454a0;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f97120y;
                C24812i c24812i3 = this.f97117E;
                String str2 = this.f97121z;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    Uri uri = Uri.parse(str2);
                    AbstractC22676k.m65750j(uri, "uri");
                    try {
                        String queryParameter = uri.getQueryParameter("payment_method");
                        if (queryParameter == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        byte[] bArrDecode = Base64.decode(queryParameter, 0);
                        AbstractC22676k.m65749i(bArrDecode, "decode(...)");
                        objM107888l2 = new C22919p(new String(bArrDecode, AbstractC39397a.f169546a), uri.getQueryParameter("last4"), uri.getQueryParameter("bank_name"), Boolean.parseBoolean(uri.getQueryParameter("incentive_eligible")));
                        if (!(objM107888l2 instanceof C23467m)) {
                            C13096w1 c13096w2 = c24812i3.f97135E;
                            C24807d c24807d = new C24807d(new C22909f((C22919p) objM107888l2, (FinancialConnectionsSession) null, (C38842g8) null));
                            this.f97119x = objM107888l2;
                            this.f97120y = 1;
                            if (c13096w2.emit(c24807d, this) == enumC31071a2) {
                                return enumC31071a2;
                            }
                            obj2 = objM107888l2;
                        }
                        thM68037a2 = C23468n.m68037a(objM107888l2);
                        if (thM68037a2 != null) {
                            c24812i3.m72715g("Failed to parse instant debits result from url: ".concat(str2), thM68037a2);
                        }
                        return C23454a0.f92919a;
                    } catch (Throwable th4) {
                        objM107888l2 = AbstractC34132o.m107888l(th4);
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f97119x;
                    AbstractC34132o.m107864I(obj);
                }
                objM107888l2 = obj2;
                thM68037a2 = C23468n.m68037a(objM107888l2);
                if (thM68037a2 != null) {
                    c24812i3.m72715g("Failed to parse instant debits result from url: ".concat(str2), thM68037a2);
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24804a(C24812i c24812i, String str, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f97117E = c24812i;
        this.f97121z = str;
    }
}
