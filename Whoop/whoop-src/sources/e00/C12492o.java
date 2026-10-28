package e00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.model.ConsumerSessionLookup;
import g30.C15296g;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import y00.C38880k6;
import y00.EnumC38796c2;
import y00.EnumC38884l0;

/* JADX INFO: renamed from: e00.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C12492o extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f42650E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String f42651F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f42652G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ String f42653H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ String f42654I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ String f42655J;

    /* JADX INFO: renamed from: K */
    public /* synthetic */ Object f42656K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Enum f42657L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object f42658M;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42659w = 1;

    /* JADX INFO: renamed from: x */
    public int f42660x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12500w f42661y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f42662z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12492o(C12500w c12500w, String str, String str2, String str3, String str4, String str5, Long l7, String str6, EnumC38884l0 enumC38884l0, String str7, String str8, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f42661y = c12500w;
        this.f42662z = str;
        this.f42650E = str2;
        this.f42651F = str3;
        this.f42652G = str4;
        this.f42653H = str5;
        this.f42656K = l7;
        this.f42654I = str6;
        this.f42657L = enumC38884l0;
        this.f42655J = str7;
        this.f42658M = str8;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f42659w) {
            case 0:
                C12492o c12492o = new C12492o(this.f42661y, this.f42662z, (EnumC38796c2) this.f42657L, this.f42650E, this.f42651F, this.f42652G, (List) this.f42658M, this.f42653H, this.f42654I, this.f42655J, interfaceC30057d);
                c12492o.f42656K = obj;
                return c12492o;
            default:
                return new C12492o(this.f42661y, this.f42662z, this.f42650E, this.f42651F, this.f42652G, this.f42653H, (Long) this.f42656K, this.f42654I, (EnumC38884l0) this.f42657L, this.f42655J, (String) this.f42658M, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f42659w) {
            case 0:
                break;
        }
        return ((C12492o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM107888l;
        Object objM43405e;
        Object obj2;
        switch (this.f42659w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f42660x;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C12500w c12500w = this.f42661y;
                        String str = this.f42662z;
                        EnumC38796c2 enumC38796c2 = (EnumC38796c2) this.f42657L;
                        String str2 = this.f42650E;
                        String str3 = this.f42651F;
                        String str4 = this.f42652G;
                        List list = (List) this.f42658M;
                        String str5 = this.f42653H;
                        String str6 = this.f42654I;
                        String str7 = this.f42655J;
                        C15296g c15296g = c12500w.f42688e;
                        String str8 = c12500w.f42684a.f8870w;
                        C39857f c39857fM35114b = c12500w.m35114b();
                        this.f42660x = 1;
                        objM43405e = c15296g.m43405e(str, enumC38796c2, str2, str8, str3, str4, list, c39857fM35114b, str5, str6, str7, this);
                        if (objM43405e == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        objM43405e = obj;
                    }
                    objM107888l = (ConsumerSessionLookup) objM43405e;
                    break;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                return new C23468n(objM107888l);
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f42660x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C12500w c12500w2 = this.f42661y;
                    C15296g c15296g2 = c12500w2.f42688e;
                    Locale locale = c12500w2.f42690g;
                    String str9 = c12500w2.f42684a.f8870w;
                    C38880k6 c38880k6 = new C38880k6(this.f42662z, this.f42650E, this.f42651F, this.f42652G, this.f42653H, locale, (Long) this.f42656K, this.f42654I, str9, (EnumC38884l0) this.f42657L, this.f42655J, (String) this.f42658M);
                    C39857f c39857fM35114b2 = c12500w2.m35114b();
                    this.f42660x = 1;
                    Object objM43406f = c15296g2.m43406f(c38880k6, c39857fM35114b2, this);
                    if (objM43406f == enumC31071a2) {
                        return enumC31071a2;
                    }
                    obj2 = objM43406f;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    obj2 = ((C23468n) obj).f92940w;
                }
                return new C23468n(obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12492o(C12500w c12500w, String str, EnumC38796c2 enumC38796c2, String str2, String str3, String str4, List list, String str5, String str6, String str7, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f42661y = c12500w;
        this.f42662z = str;
        this.f42657L = enumC38796c2;
        this.f42650E = str2;
        this.f42651F = str3;
        this.f42652G = str4;
        this.f42658M = list;
        this.f42653H = str5;
        this.f42654I = str6;
        this.f42655J = str7;
    }
}
