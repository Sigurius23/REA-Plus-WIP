package p006a4;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0355b {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m987a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static String m988b(int i13, String str, List list, Function1 function1) {
        if ((i13 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i13 & 2) != 0 ? "" : "[\n\t";
        String str3 = (i13 & 4) == 0 ? "\n]" : "";
        if ((i13 & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append((CharSequence) str2);
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Object obj = list.get(i15);
            i14++;
            if (i14 > 1) {
                sb4.append((CharSequence) str);
            }
            if (function1 != null) {
                sb4.append((CharSequence) function1.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb4.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb4.append(((Character) obj).charValue());
            } else {
                sb4.append((CharSequence) obj.toString());
            }
        }
        sb4.append((CharSequence) str3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final Void m989c(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX INFO: renamed from: d */
    public static final void m990d(String str) {
        throw new UnsupportedOperationException(str);
    }
}
