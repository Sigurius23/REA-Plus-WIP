package p695zx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: zx.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C41185g extends AbstractC41187i {

    /* JADX INFO: renamed from: i */
    public static final Set f177694i = AbstractC25260n.m74059b1(new Character[]{'-', ' '});

    /* JADX INFO: renamed from: c */
    public final String f177695c;

    /* JADX INFO: renamed from: d */
    public final String f177696d;

    /* JADX INFO: renamed from: e */
    public final int f177697e;

    /* JADX INFO: renamed from: f */
    public final boolean f177698f;

    /* JADX INFO: renamed from: g */
    public final C41179a f177699g;

    /* JADX INFO: renamed from: h */
    public final boolean f177700h;

    public C41185g(String denormalized) throws IOException {
        AbstractC22676k.m65750j(denormalized, "denormalized");
        this.f177695c = denormalized;
        StringBuilder sb4 = new StringBuilder();
        boolean z4 = false;
        for (int i13 = 0; i13 < denormalized.length(); i13++) {
            char cCharAt = denormalized.charAt(i13);
            if (!f177694i.contains(Character.valueOf(cCharAt))) {
                sb4.append(cCharAt);
            }
        }
        String cardNumber = sb4.toString();
        this.f177696d = cardNumber;
        int length = cardNumber.length();
        this.f177697e = length;
        this.f177698f = length == 19;
        AbstractC22676k.m65750j(cardNumber, "cardNumber");
        String strM125866L0 = AbstractC39414r.m125866L0(6, cardNumber);
        strM125866L0 = strM125866L0.length() != 6 ? null : strM125866L0;
        this.f177699g = strM125866L0 != null ? new C41179a(strM125866L0) : null;
        if (cardNumber != null) {
            int length2 = cardNumber.length() - 1;
            int i14 = 0;
            boolean z13 = true;
            while (-1 < length2) {
                char cCharAt2 = cardNumber.charAt(length2);
                if (Character.isDigit(cCharAt2)) {
                    int numericValue = Character.getNumericValue(cCharAt2);
                    boolean z14 = !z13;
                    numericValue = z13 ? numericValue : numericValue * 2;
                    if (numericValue > 9) {
                        numericValue -= 9;
                    }
                    i14 += numericValue;
                    length2--;
                    z13 = z14;
                }
            }
            if (i14 % 10 == 0) {
                z4 = true;
            }
        }
        this.f177700h = z4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final String m133830a(int i13) {
        Set set = (Set) AbstractC41187i.f177703b.get(Integer.valueOf(i13));
        if (set == null) {
            set = AbstractC41187i.f177702a;
        }
        String strM125866L0 = AbstractC39414r.m125866L0(i13, this.f177696d);
        int size = set.size() + 1;
        String[] strArr = new String[size];
        int length = strM125866L0.length();
        Iterator it = AbstractC25265s.m74150t1(AbstractC25265s.m74093D1(set)).iterator();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                int i16 = 0;
                while (true) {
                    if (i16 >= size) {
                        i16 = -1;
                        break;
                    }
                    if (strArr[i16] == null) {
                        break;
                    }
                    i16++;
                }
                Integer numValueOf = i16 != -1 ? Integer.valueOf(i16) : null;
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    String strSubstring = strM125866L0.substring(i15);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    strArr[iIntValue] = strSubstring;
                }
                ArrayList arrayList = new ArrayList();
                for (int i17 = 0; i17 < size; i17++) {
                    String str = strArr[i17];
                    if (str == null) {
                        break;
                    }
                    arrayList.add(str);
                }
                return AbstractC25265s.m74110N0(arrayList, " ", null, null, null, 62);
            }
            Object next = it.next();
            int i18 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            int iIntValue2 = ((Number) next).intValue() - i14;
            if (length > iIntValue2) {
                String strSubstring2 = strM125866L0.substring(i15, iIntValue2);
                AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                strArr[i14] = strSubstring2;
                i15 = iIntValue2;
            }
            i14 = i18;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41185g) && AbstractC22676k.m65745e(this.f177695c, ((C41185g) obj).f177695c);
    }

    public final int hashCode() {
        return this.f177695c.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Unvalidated(denormalized=", this.f177695c, ")");
    }
}
