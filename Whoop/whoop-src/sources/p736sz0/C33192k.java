package p736sz0;

import androidx.health.platform.client.proto.C1533u;
import b30.AbstractC2590o3;
import b30.C2598p3;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l40.C23328a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p040c0.InterfaceC3770q;
import p510u0.InterfaceC34345p0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r30.C30898c;
import t10.C33290j;
import t11.AbstractC33305e;
import t21.AbstractC33349g;
import t31.AbstractC33526b;
import t51.AbstractC33543b;
import t71.AbstractC33568e;
import y00.C38793c;

/* JADX INFO: renamed from: sz0.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33192k implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138381w;

    public /* synthetic */ C33192k(int i13) {
        this.f138381w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        boolean z4;
        switch (this.f138381w) {
            case 0:
                return AbstractC33195l.m105195f(obj);
            case 1:
                return AbstractC33181g0.m105133m(obj);
            case 2:
                return AbstractC33181g0.m105137q(obj);
            case 3:
                return AbstractC33191j1.m105172e(obj);
            case 4:
                return AbstractC33215r1.m105366s(obj);
            case 5:
                C33290j it = (C33290j) obj;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.valueOf(it.f138838d);
            case 6:
                return AbstractC33305e.m105646o(obj);
            case 7:
                return AbstractC33305e.m105619G((InterfaceC34345p0) obj);
            case 8:
                AbstractC22676k.m65750j((AbstractC2590o3) obj, "it");
                return C23454a0.f92919a;
            case 9:
                C23328a formFieldEntry = (C23328a) obj;
                AbstractC22676k.m65750j(formFieldEntry, "formFieldEntry");
                if (!formFieldEntry.f92492b) {
                    formFieldEntry = null;
                }
                return (formFieldEntry == null || (str = formFieldEntry.f92491a) == null) ? "" : str;
            case 10:
                C23328a it3 = (C23328a) obj;
                AbstractC22676k.m65750j(it3, "it");
                return Boolean.valueOf(it3.f92492b);
            case 11:
                C23328a it4 = (C23328a) obj;
                AbstractC22676k.m65750j(it4, "it");
                return Boolean.valueOf(it4.f92492b);
            case 12:
                C23328a it5 = (C23328a) obj;
                AbstractC22676k.m65750j(it5, "it");
                return Boolean.valueOf(it5.f92492b);
            case 13:
                List formFieldValues = (List) obj;
                AbstractC22676k.m65750j(formFieldValues, "formFieldValues");
                List list = formFieldValues;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z4 = true;
                } else {
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        if (!((C23328a) ((C23465k) it6.next()).f92938x).f92492b) {
                            z4 = false;
                        }
                    }
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 14:
                C23328a formFieldEntry2 = (C23328a) obj;
                AbstractC22676k.m65750j(formFieldEntry2, "formFieldEntry");
                if (!formFieldEntry2.f92492b) {
                    formFieldEntry2 = null;
                }
                if (formFieldEntry2 != null) {
                    return formFieldEntry2.f92491a;
                }
                return null;
            case 15:
                C23328a formFieldEntry3 = (C23328a) obj;
                AbstractC22676k.m65750j(formFieldEntry3, "formFieldEntry");
                if (!formFieldEntry3.f92492b) {
                    formFieldEntry3 = null;
                }
                if (formFieldEntry3 != null) {
                    return formFieldEntry3.f92491a;
                }
                return null;
            case 16:
                List formFieldValues2 = (List) obj;
                AbstractC22676k.m65750j(formFieldValues2, "formFieldValues");
                List list2 = formFieldValues2;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it7 = list2.iterator();
                    while (it7.hasNext()) {
                        if (!((C23328a) ((C23465k) it7.next()).f92938x).f92492b) {
                            formFieldValues2 = null;
                        }
                    }
                }
                if (formFieldValues2 == null) {
                    return null;
                }
                List<C23465k> list3 = formFieldValues2;
                int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list3, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                for (C23465k c23465k : list3) {
                    linkedHashMap.put(c23465k.f92937w, ((C23328a) c23465k.f92938x).f92491a);
                }
                IdentifierSpec.Companion.getClass();
                return new C38793c((String) linkedHashMap.get(IdentifierSpec.City), (String) linkedHashMap.get(IdentifierSpec.Country), (String) linkedHashMap.get(IdentifierSpec.Line1), (String) linkedHashMap.get(IdentifierSpec.Line2), (String) linkedHashMap.get(IdentifierSpec.PostalCode), (String) linkedHashMap.get(IdentifierSpec.State));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C2598p3 c2598p3 = (C2598p3) obj;
                if (c2598p3 != null) {
                    return C2598p3.m7511a(c2598p3, false);
                }
                return null;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return null;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC33349g.m105740Q(obj);
            case 20:
                return Integer.valueOf(AbstractC33349g.m105764u(((Integer) obj).intValue()));
            case 21:
                return Integer.valueOf(AbstractC33349g.m105765v(((Integer) obj).intValue()));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Integer.valueOf(AbstractC33349g.m105766w(((Integer) obj).intValue()));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Integer.valueOf(AbstractC33349g.m105767x(((Integer) obj).intValue()));
            case 24:
                return AbstractC33349g.m105731H(obj);
            case 25:
                return AbstractC33349g.m105727D((InterfaceC3770q) obj);
            case 26:
                C30898c it8 = (C30898c) obj;
                AbstractC22676k.m65750j(it8, "it");
                return it8.f127397w;
            case 27:
                return AbstractC33526b.m105900f(obj);
            case 28:
                return AbstractC33543b.m105916e(obj);
            default:
                return AbstractC33568e.m106005d(obj);
        }
    }
}
