package p029b5;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: b5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2728g {

    /* JADX INFO: renamed from: b */
    public static final C2728g f10738b = m7699f(new LocaleList(new Locale[0]));

    /* JADX INFO: renamed from: a */
    public final C2729h f10739a;

    public C2728g(C2729h c2729h) {
        this.f10739a = c2729h;
    }

    /* JADX INFO: renamed from: a */
    public static C2728g m7698a(String str) {
        if (str == null || str.isEmpty()) {
            return f10738b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i13 = 0; i13 < length; i13++) {
            String str2 = strArrSplit[i13];
            int i14 = AbstractC2727f.f10737a;
            localeArr[i13] = Locale.forLanguageTag(str2);
        }
        return m7699f(new LocaleList(localeArr));
    }

    /* JADX INFO: renamed from: f */
    public static C2728g m7699f(LocaleList localeList) {
        return new C2728g(new C2729h(localeList));
    }

    /* JADX INFO: renamed from: b */
    public final Locale m7700b(int i13) {
        return this.f10739a.f10740a.get(i13);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7701c() {
        return this.f10739a.f10740a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final int m7702d() {
        return this.f10739a.f10740a.size();
    }

    /* JADX INFO: renamed from: e */
    public final String m7703e() {
        return this.f10739a.f10740a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2728g) {
            return this.f10739a.equals(((C2728g) obj).f10739a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10739a.f10740a.hashCode();
    }

    public final String toString() {
        return this.f10739a.f10740a.toString();
    }
}
