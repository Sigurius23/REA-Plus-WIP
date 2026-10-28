package d62;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import i93.C18284j;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25265s;
import p635y2.InterfaceC39140v1;
import p636y3.C39169a;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: d62.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C11739e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38002w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f38003x;

    public /* synthetic */ C11739e(List list, int i13) {
        this.f38002w = i13;
        this.f38003x = list;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0097 A[LOOP:0: B:20:0x0061->B:31:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0035  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13;
        int i14;
        int i15;
        Object next;
        C23465k c23465k;
        Object next2;
        String str;
        String str2;
        switch (this.f38002w) {
            case 0:
                return AbstractC11741g.m31400I(this.f38003x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC11741g.m31398G(this.f38003x, (InterfaceC39140v1) obj, (C39169a) obj2);
            default:
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                AbstractC22676k.m65750j(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = this.f38003x;
                if (list.size() == 1) {
                    String str3 = (String) AbstractC25265s.m74140o1(list);
                    int iM125888g0 = AbstractC39414r.m125888g0(DelimitedRangesSequence, str3, iIntValue, false, 4);
                    if (iM125888g0 < 0) {
                        c23465k = null;
                    } else {
                        c23465k = new C23465k(Integer.valueOf(iM125888g0), str3);
                    }
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    C18284j c18284j = new C18284j(iIntValue, DelimitedRangesSequence.length(), 1);
                    boolean z4 = DelimitedRangesSequence instanceof String;
                    int i16 = c18284j.f71135y;
                    int i17 = c18284j.f71134x;
                    if (z4) {
                        if ((i16 <= 0 || iIntValue > i17) && (i16 >= 0 || i17 > iIntValue)) {
                            c23465k = null;
                        } else {
                            int i18 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str2 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str = (String) next2;
                                    if (str != null) {
                                        c23465k = new C23465k(Integer.valueOf(i18), str);
                                    } else if (i18 != i17) {
                                        i18 += i16;
                                    } else {
                                        c23465k = null;
                                    }
                                } while (!AbstractC39421y.m125924I(0, i18, str2.length(), str2, (String) DelimitedRangesSequence, false));
                                str = (String) next2;
                                if (str != null) {
                                    c23465k = new C23465k(Integer.valueOf(i18), str);
                                } else if (i18 != i17) {
                                    i18 += i16;
                                } else {
                                    c23465k = null;
                                }
                            }
                        }
                    } else if ((i16 <= 0 || iIntValue > i17) && (i16 >= 0 || i17 > iIntValue)) {
                        c23465k = null;
                    } else {
                        while (true) {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    int i19 = i17;
                                    String str4 = (String) next;
                                    int i24 = i16;
                                    i13 = iIntValue;
                                    i14 = i24;
                                    i15 = i19;
                                    if (!AbstractC39414r.m125897p0(str4, 0, DelimitedRangesSequence, i13, str4.length(), false)) {
                                        i16 = i14;
                                        iIntValue = i13;
                                        i17 = i15;
                                    }
                                } else {
                                    int i25 = i16;
                                    i13 = iIntValue;
                                    i14 = i25;
                                    i15 = i17;
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                c23465k = new C23465k(Integer.valueOf(i13), str5);
                            } else if (i13 != i15) {
                                int i26 = i13 + i14;
                                i16 = i14;
                                iIntValue = i26;
                                i17 = i15;
                            } else {
                                c23465k = null;
                            }
                        }
                    }
                }
                if (c23465k != null) {
                    return new C23465k(c23465k.f92937w, Integer.valueOf(((String) c23465k.f92938x).length()));
                }
                return null;
        }
    }
}
