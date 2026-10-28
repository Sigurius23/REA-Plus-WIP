package b30;

import c93.InterfaceC4352n;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import g40.C15355g1;
import g40.C15426t3;
import g40.C15431u3;
import g40.C15436v3;
import g40.C15446x3;
import h20.C16657g;
import h20.C16687l;
import j00.C21108k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l40.C23328a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import o20.C27456a;
import o20.C27457b;
import p505ts.AbstractC34132o;
import p537ux.InterfaceC35322b;
import p695zx.C41182d;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.EnumC29820h;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import se.AbstractC32410a;
import u00.C34378f;
import v00.C35459c0;
import wb3.AbstractC37056f;
import x30.C37917p0;
import x30.C37938y;
import y00.C38783b;
import y00.EnumC38853i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: b30.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C2562l extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f9955E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9956w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f9957x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f9958y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f9959z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2562l(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(4, interfaceC30057d);
        this.f9956w = i13;
        this.f9955E = obj;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f9956w) {
            case 0:
                C2562l c2562l = new C2562l((C2570m) this.f9955E, (InterfaceC30057d) obj4, 0);
                c2562l.f9957x = (List) obj;
                c2562l.f9958y = (List) obj2;
                c2562l.f9959z = (Set) obj3;
                return c2562l.invokeSuspend(C23454a0.f92919a);
            case 1:
                C2562l c2562l2 = new C2562l((C16657g) this.f9955E, (InterfaceC30057d) obj4, 1);
                c2562l2.f9957x = (C23465k) obj;
                c2562l2.f9958y = (C21108k) obj2;
                c2562l2.f9959z = (C16687l) obj3;
                return c2562l2.invokeSuspend(C23454a0.f92919a);
            case 2:
                C2562l c2562l3 = new C2562l((C27456a) this.f9955E, (InterfaceC30057d) obj4, 2);
                c2562l3.f9957x = (Map) obj;
                c2562l3.f9959z = (Set) obj2;
                c2562l3.f9958y = (EnumC29820h) obj3;
                return c2562l3.invokeSuspend(C23454a0.f92919a);
            default:
                C2562l c2562l4 = new C2562l((C37917p0) this.f9955E, (InterfaceC30057d) obj4, 3);
                c2562l4.f9957x = (EnumC38853i) obj;
                c2562l4.f9958y = (String) obj2;
                c2562l4.f9959z = (C41182d) obj3;
                return c2562l4.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x02db  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object next;
        C23465k c23465k;
        Object obj2;
        Object[] objArr;
        int i13 = this.f9956w;
        boolean z4 = true;
        C23328a c23328aM7472f = null;
        c23328aM7472f = null;
        Object obj3 = this.f9955E;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                List list = (List) this.f9957x;
                List list2 = (List) this.f9958y;
                Set set = (Set) this.f9959z;
                C2570m c2570m = (C2570m) obj3;
                int iOrdinal = ((EnumC2625t1) c2570m.f9987x).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        IdentifierSpec.Companion.getClass();
                        c23328aM7472f = C2570m.m7472f(c2570m, list2, IdentifierSpec.Name, set);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Iterator it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                                obj2 = ((C23465k) next).f92937w;
                                IdentifierSpec.Companion.getClass();
                            } else {
                                next = null;
                            }
                            c23465k = (C23465k) next;
                            if (c23465k != null) {
                                c23328aM7472f = (C23328a) c23465k.f92938x;
                            }
                        } while (!AbstractC22676k.m65745e(obj2, IdentifierSpec.Name));
                        c23465k = (C23465k) next;
                        if (c23465k != null) {
                            c23328aM7472f = (C23328a) c23465k.f92938x;
                        }
                    }
                }
                C23328a c23328a = c23328aM7472f;
                IdentifierSpec.Companion.getClass();
                return new C2578n(c23328a, C2570m.m7472f(c2570m, list2, IdentifierSpec.Email, set), C2570m.m7472f(c2570m, list2, IdentifierSpec.Phone, set), C2570m.m7472f(c2570m, list2, IdentifierSpec.Line1, set), C2570m.m7472f(c2570m, list2, IdentifierSpec.Line2, set), C2570m.m7472f(c2570m, list2, IdentifierSpec.City, set), C2570m.m7472f(c2570m, list2, IdentifierSpec.PostalCode, set), C2570m.m7472f(c2570m, list2, IdentifierSpec.State, set), C2570m.m7472f(c2570m, list2, IdentifierSpec.Country, set));
            case 1:
                C35459c0 c35459c0 = ((C16657g) obj3).f64044d;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C23465k c23465k2 = (C23465k) this.f9957x;
                C21108k c21108k = (C21108k) this.f9958y;
                C16687l c16687l = (C16687l) this.f9959z;
                C27457b c27457b = (C27457b) c23465k2.f92937w;
                if (c27457b == null) {
                    return null;
                }
                C34378f c34378fM112534R = c35459c0.m112534R((String) c23465k2.f92938x);
                if (c34378fM112534R != null) {
                    return AbstractC32410a.m101037j0(c27457b, c34378fM112534R, c35459c0, c16687l != null ? c16687l.f64178b : null, c21108k);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                Map map = (Map) this.f9957x;
                Set set2 = (Set) this.f9959z;
                EnumC29820h enumC29820h = (EnumC29820h) this.f9958y;
                Map map2 = ((C27456a) obj3).f110654a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!set2.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(linkedHashMap);
                for (Map.Entry entry2 : map2.entrySet()) {
                    C23328a c23328a2 = (C23328a) linkedHashMapM74003l0.get(entry2.getKey());
                    String str = c23328a2 != null ? c23328a2.f92491a : null;
                    if (str == null || AbstractC39414r.m125890i0(str)) {
                        CharSequence charSequence = (CharSequence) entry2.getValue();
                        if (charSequence != null && !AbstractC39414r.m125890i0(charSequence)) {
                            linkedHashMapM74003l0.put(entry2.getKey(), new C23328a((String) entry2.getValue(), true));
                        }
                    }
                }
                C27457b c27457b2 = new C27457b(linkedHashMapM74003l0, enumC29820h);
                Collection collectionValues = linkedHashMapM74003l0.values();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collectionValues, 10));
                Iterator it3 = collectionValues.iterator();
                while (it3.hasNext()) {
                    arrayList.add(Boolean.valueOf(((C23328a) it3.next()).f92492b));
                }
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (!((Boolean) it4.next()).booleanValue()) {
                            return null;
                        }
                    }
                }
                return c27457b2;
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                EnumC38853i brand = (EnumC38853i) this.f9957x;
                String number = (String) this.f9958y;
                C37917p0 c37917p0 = (C37917p0) obj3;
                Object obj4 = ((C41182d) this.f9959z).f177692a;
                C37938y c37938y = c37917p0.f162347b;
                C38783b c38783bM133833a = c37917p0.f162351f.m133833a();
                int iM124354c = c38783bM133833a != null ? c38783bM133833a.f166933x : brand.m124354c(number);
                c37938y.getClass();
                AbstractC22676k.m65750j(brand, "brand");
                AbstractC22676k.m65750j(number, "number");
                if (AbstractC39414r.m125890i0(number)) {
                    return C15426t3.f57978b;
                }
                int i14 = 0;
                C15436v3 c15436v3 = (c37938y.f162411b.mo112179o(brand) || (c37938y.f162410a && number.length() <= c37938y.f162415f)) ? null : new C15436v3(R.string.stripe_disallowed_card_brand, AbstractC37056f.m118958J(brand.f167261x), false);
                if (c15436v3 != null) {
                    return c15436v3;
                }
                if (brand == EnumC38853i.Unknown) {
                    return new C15436v3(R.string.stripe_invalid_card_number, 2, (List) null);
                }
                Object[] objArr2 = brand.m124354c(number) != -1;
                InterfaceC35322b interfaceC35322b = c37938y.f162412c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : (Iterable) obj4) {
                    if (!((C38783b) obj5).f166932w.f167079y) {
                        arrayList2.add(obj5);
                    }
                }
                if (arrayList2.isEmpty()) {
                    objArr = false;
                } else {
                    Iterator it5 = arrayList2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            objArr = false;
                        } else if (interfaceC35322b.mo112183F(((C38783b) it5.next()).f166935z)) {
                            objArr = true;
                        }
                    }
                }
                Object[] objArr3 = (number.length() < c37938y.f162416g || arrayList2.isEmpty() || objArr == true) ? false : true;
                Integer numMo112182A = interfaceC35322b.mo112182A();
                if (numMo112182A == null || objArr3 == false) {
                    numMo112182A = null;
                }
                if (objArr2 == true && number.length() < iM124354c) {
                    return numMo112182A != null ? new C15436v3(new C15355g1(numMo112182A.intValue()), false) : new C15431u3(R.string.stripe_invalid_card_number);
                }
                int length = number.length() - 1;
                while (-1 < length) {
                    char cCharAt = number.charAt(length);
                    if (!Character.isDigit(cCharAt)) {
                        return new C15436v3(R.string.stripe_invalid_card_number, 2, (List) null);
                    }
                    int numericValue = Character.getNumericValue(cCharAt);
                    boolean z13 = !z4;
                    if (!z4) {
                        numericValue *= 2;
                    }
                    if (numericValue > 9) {
                        numericValue -= 9;
                    }
                    i14 += numericValue;
                    length--;
                    z4 = z13;
                }
                if (i14 % 10 == 0) {
                    if (objArr2 == true && number.length() == iM124354c) {
                        return numMo112182A != null ? new C15446x3(new C15355g1(numMo112182A.intValue())) : new C15446x3(null);
                    }
                    return new C15436v3(R.string.stripe_invalid_card_number, 6, (List) null);
                }
                return new C15436v3(R.string.stripe_invalid_card_number, 2, (List) null);
        }
    }
}
