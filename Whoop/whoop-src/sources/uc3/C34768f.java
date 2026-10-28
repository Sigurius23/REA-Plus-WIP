package uc3;

import h02.C16561a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.C22665e0;
import rc3.AbstractC31237b;
import s51.C32209f;
import sc0.C32355c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: uc3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C34768f implements InterfaceC34773k {

    /* JADX INFO: renamed from: a */
    public final List f146433a;

    /* JADX INFO: renamed from: b */
    public final int f146434b;

    /* JADX INFO: renamed from: c */
    public final boolean f146435c;

    public C34768f(List list) {
        boolean z4;
        boolean z13;
        int i13;
        this.f146433a = list;
        Iterator it = list.iterator();
        int i14 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((AbstractC34765c) it.next()).f146430a;
            if (num != null) {
                iIntValue = num.intValue();
            }
            i14 += iIntValue;
        }
        this.f146434b = i14;
        List list2 = this.f146433a;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((AbstractC34765c) it3.next()).f146430a == null) {
                        z4 = true;
                        break;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
        } else {
            z4 = false;
            break;
        }
        this.f146435c = z4;
        List list3 = this.f146433a;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it4 = list3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z13 = true;
                    break;
                }
                Integer num2 = ((AbstractC34765c) it4.next()).f146430a;
                if (!((num2 != null ? num2.intValue() : Integer.MAX_VALUE) > 0)) {
                    z13 = false;
                    break;
                }
            }
        } else {
            z13 = true;
            break;
        }
        if (!z13) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List list4 = this.f146433a;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            i13 = 0;
        } else {
            Iterator it5 = list4.iterator();
            i13 = 0;
            while (it5.hasNext()) {
                if ((((AbstractC34765c) it5.next()).f146430a == null) && (i13 = i13 + 1) < 0) {
                    AbstractC37056f.m118976c0();
                    throw null;
                }
            }
        }
        if (i13 <= 1) {
            return;
        }
        List list5 = this.f146433a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((AbstractC34765c) obj).f146430a == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((AbstractC34765c) it6.next()).f146431b);
        }
        throw new IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    @Override // uc3.InterfaceC34773k
    /* JADX INFO: renamed from: a */
    public final Object mo109777a(InterfaceC34764b interfaceC34764b, String str, int i13) {
        int i14 = this.f146434b;
        if (i13 + i14 > str.length()) {
            return new C34769g(i13, new C32355c(this, 16));
        }
        C22665e0 c22665e0 = new C22665e0();
        while (c22665e0.f89334w + i13 < str.length() && AbstractC31237b.m96190b(str.charAt(c22665e0.f89334w + i13))) {
            c22665e0.f89334w++;
        }
        if (c22665e0.f89334w < i14) {
            return new C34769g(i13, new C32209f(26, c22665e0, this));
        }
        List list = this.f146433a;
        int size = list.size();
        int i15 = 0;
        while (i15 < size) {
            Integer num = ((AbstractC34765c) list.get(i15)).f146430a;
            int iIntValue = (num != null ? num.intValue() : (c22665e0.f89334w - i14) + 1) + i13;
            InterfaceC34767e interfaceC34767eMo109776a = ((AbstractC34765c) list.get(i15)).mo109776a(i13, iIntValue, interfaceC34764b, str);
            if (interfaceC34767eMo109776a != null) {
                return new C34769g(i13, new C16561a0(str.subSequence(i13, iIntValue).toString(), this, i15, interfaceC34767eMo109776a));
            }
            i15++;
            i13 = iIntValue;
        }
        return Integer.valueOf(i13);
    }

    /* JADX INFO: renamed from: b */
    public final String m109778b() {
        List<AbstractC34765c> list = this.f146433a;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (AbstractC34765c abstractC34765c : list) {
            StringBuilder sb4 = new StringBuilder();
            Integer num = abstractC34765c.f146430a;
            sb4.append(num == null ? "at least one digit" : num + " digits");
            sb4.append(" for ");
            sb4.append(abstractC34765c.f146431b);
            arrayList.add(sb4.toString());
        }
        boolean z4 = this.f146435c;
        int i13 = this.f146434b;
        if (z4) {
            return "a number with at least " + i13 + " digits: " + arrayList;
        }
        return "a number with exactly " + i13 + " digits: " + arrayList;
    }

    public final String toString() {
        return m109778b();
    }
}
