package ud3;

import ae3.AbstractC0797e;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ud3.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C34839s {

    /* JADX INFO: renamed from: k */
    public static final Pattern f146732k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f146733l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f146734m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n */
    public static final Pattern f146735n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f146736a;

    /* JADX INFO: renamed from: b */
    public final String f146737b;

    /* JADX INFO: renamed from: c */
    public final long f146738c;

    /* JADX INFO: renamed from: d */
    public final String f146739d;

    /* JADX INFO: renamed from: e */
    public final String f146740e;

    /* JADX INFO: renamed from: f */
    public final boolean f146741f;

    /* JADX INFO: renamed from: g */
    public final boolean f146742g;

    /* JADX INFO: renamed from: h */
    public final boolean f146743h;

    /* JADX INFO: renamed from: i */
    public final boolean f146744i;

    /* JADX INFO: renamed from: j */
    public final String f146745j;

    public C34839s(String str, String str2, long j7, String str3, String str4, boolean z4, boolean z13, boolean z14, boolean z15, String str5) {
        this.f146736a = str;
        this.f146737b = str2;
        this.f146738c = j7;
        this.f146739d = str3;
        this.f146740e = str4;
        this.f146741f = z4;
        this.f146742g = z13;
        this.f146743h = z14;
        this.f146744i = z15;
        this.f146745j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34839s)) {
            return false;
        }
        C34839s c34839s = (C34839s) obj;
        return AbstractC22676k.m65745e(c34839s.f146736a, this.f146736a) && AbstractC22676k.m65745e(c34839s.f146737b, this.f146737b) && c34839s.f146738c == this.f146738c && AbstractC22676k.m65745e(c34839s.f146739d, this.f146739d) && AbstractC22676k.m65745e(c34839s.f146740e, this.f146740e) && c34839s.f146741f == this.f146741f && c34839s.f146742g == this.f146742g && c34839s.f146743h == this.f146743h && c34839s.f146744i == this.f146744i && AbstractC22676k.m65745e(c34839s.f146745j, this.f146745j);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30451e(AbstractC11266d.m30450d(AbstractC11266d.m30450d(527, 31, this.f146736a), 31, this.f146737b), this.f146738c, 31), 31, this.f146739d), 31, this.f146740e), 31, this.f146741f), 31, this.f146742g), 31, this.f146743h), 31, this.f146744i);
        String str = this.f146745j;
        return iM8289b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f146736a);
        sb4.append('=');
        sb4.append(this.f146737b);
        if (this.f146743h) {
            long j7 = this.f146738c;
            if (j7 == Long.MIN_VALUE) {
                sb4.append("; max-age=0");
            } else {
                sb4.append("; expires=");
                String str = ((DateFormat) AbstractC0797e.f2946a.get()).format(new Date(j7));
                AbstractC22676k.m65749i(str, "format(...)");
                sb4.append(str);
            }
        }
        if (!this.f146744i) {
            sb4.append("; domain=");
            sb4.append(this.f146739d);
        }
        sb4.append("; path=");
        sb4.append(this.f146740e);
        if (this.f146741f) {
            sb4.append("; secure");
        }
        if (this.f146742g) {
            sb4.append("; httponly");
        }
        String str2 = this.f146745j;
        if (str2 != null) {
            sb4.append("; samesite=");
            sb4.append(str2);
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
