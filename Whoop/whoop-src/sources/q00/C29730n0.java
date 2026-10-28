package q00;

import android.os.Parcelable;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p631xz.C38747x;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import y00.AbstractC38794c0;
import y00.C38774a0;
import y00.C38784b0;
import y00.C38854i0;
import y00.C38991x;

/* JADX INFO: renamed from: q00.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29730n0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121586w = 0;

    /* JADX INFO: renamed from: x */
    public int f121587x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC38794c0 f121588y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C29734p0 f121589z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29730n0(C29734p0 c29734p0, AbstractC38794c0 abstractC38794c0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f121589z = c29734p0;
        this.f121588y = abstractC38794c0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f121586w) {
            case 0:
                return new C29730n0(this.f121589z, this.f121588y, interfaceC30057d);
            default:
                return new C29730n0(this.f121588y, this.f121589z, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f121586w) {
            case 0:
                break;
        }
        return ((C29730n0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM124154e;
        C13045h2 c13045h2;
        Object value;
        Object obj2;
        Object value2;
        C29720i0 c29720i0;
        ArrayList arrayList;
        switch (this.f121586w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f121587x;
                C29734p0 c29734p0 = this.f121589z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC34132o.m107864I(obj);
                        objM124154e = ((C23468n) obj).f92940w;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    c13045h2 = c29734p0.f121607M;
                    do {
                        value = c13045h2.getValue();
                    } while (!c13045h2.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, false, null, null, null, null, null, null, null, 268369919)));
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                C38747x c38747x = c29734p0.f121613y;
                String id4 = this.f121588y.getId();
                this.f121587x = 1;
                objM124154e = c38747x.m124154e(id4, this);
                if (objM124154e == enumC31071a) {
                    return enumC31071a;
                }
                Throwable thM68037a = C23468n.m68037a(objM124154e);
                if (thM68037a == null) {
                    AbstractC38794c0 abstractC38794c0M91175d = ((C29720i0) c29734p0.f121608N.f45200w.getValue()).m91175d();
                    String id5 = abstractC38794c0M91175d != null ? abstractC38794c0M91175d.getId() : null;
                    this.f121587x = 2;
                    if (c29734p0.m91182o(id5, false, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    C29734p0.m91179l(c29734p0, thM68037a, "Failed to delete payment method");
                }
                c13045h2 = c29734p0.f121607M;
                do {
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, false, null, null, null, null, null, null, null, 268369919)));
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f121587x;
                AbstractC38794c0 abstractC38794c0 = this.f121588y;
                C29734p0 c29734p1 = this.f121589z;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C38854i0 c38854i0 = new C38854i0(abstractC38794c0.getId(), Boolean.TRUE, null, (LinkedHashMap) c29734p1.f121611w.f161635i0.mo124325c0());
                    C38747x c38747x2 = c29734p1.f121613y;
                    this.f121587x = 1;
                    Object objM124172x = c38747x2.m124172x(c38854i0, null, this);
                    if (objM124172x == enumC31071a2) {
                        return enumC31071a2;
                    }
                    obj2 = objM124172x;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    obj2 = ((C23468n) obj).f92940w;
                }
                Throwable thM68037a2 = C23468n.m68037a(obj2);
                if (thM68037a2 == null) {
                    C13045h2 c13045h3 = c29734p1.f121607M;
                    do {
                        value2 = c13045h3.getValue();
                        c29720i0 = (C29720i0) value2;
                        List<Parcelable> list = c29720i0.f121536a;
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                        for (Parcelable parcelableM124308i : list) {
                            if (parcelableM124308i instanceof C38991x) {
                                C38991x c38991x = (C38991x) parcelableM124308i;
                                parcelableM124308i = C38991x.m124404i(c38991x, AbstractC22676k.m65745e(abstractC38794c0.getId(), c38991x.f167837y), null, null, 251);
                            } else if (parcelableM124308i instanceof C38774a0) {
                                C38774a0 c38774a0 = (C38774a0) parcelableM124308i;
                                parcelableM124308i = C38774a0.m124308i(c38774a0, AbstractC22676k.m65745e(abstractC38794c0.getId(), c38774a0.f166896y), null, null, 4091);
                            } else if (!(parcelableM124308i instanceof C38784b0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            arrayList.add(parcelableM124308i);
                        }
                    } while (!c13045h3.m36569i(value2, C29720i0.m91172a(c29720i0, arrayList, null, false, null, null, null, null, null, null, null, 268369918)));
                } else {
                    C29734p0.m91179l(c29734p1, thM68037a2, "Failed to set payment method as default");
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29730n0(AbstractC38794c0 abstractC38794c0, C29734p0 c29734p0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f121588y = abstractC38794c0;
        this.f121589z = c29734p0;
    }
}
