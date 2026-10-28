package ge;

import java.util.LinkedHashSet;
import java.util.Set;
import m83.AbstractC25260n;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ge.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15719d {

    /* JADX INFO: renamed from: a */
    public static final Set f59225a;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashSet f59226b;

    static {
        Set setM74059b1 = AbstractC25260n.m74059b1(new Character[]{'!', '$', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~'});
        f59225a = setM74059b1;
        f59226b = AbstractC12350b.m34555D('#', setM74059b1);
    }

    /* JADX INFO: renamed from: a */
    public static final String m44300a(String str, Set set) {
        StringBuilder sb4 = new StringBuilder(str.length());
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == ' ') {
                sb4.append("_");
            } else if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || (('0' <= cCharAt && cCharAt < ':') || set.contains(Character.valueOf(cCharAt))))) {
                sb4.append(cCharAt);
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final String m44301b(String category, String str, String str2) {
        AbstractC22676k.m65750j(category, "category");
        Set set = f59225a;
        if (str == null && str2 == null) {
            return m44300a(category, set);
        }
        if (str2 == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m44300a(category, set));
            sb4.append('/');
            AbstractC22676k.m65747g(str);
            sb4.append(m44300a(str, set));
            return sb4.toString();
        }
        LinkedHashSet linkedHashSet = f59226b;
        if (str == null) {
            return m44300a(category, set) + '/' + m44300a(str2, linkedHashSet);
        }
        return m44300a(category, set) + '/' + m44300a(str, set) + '#' + m44300a(str2, linkedHashSet);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m44302c(int i13, String str, String str2, String str3) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        return m44301b(str, str2, str3);
    }
}
