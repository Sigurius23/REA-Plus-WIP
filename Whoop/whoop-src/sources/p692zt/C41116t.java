package p692zt;

import android.util.Log;
import ih0.AbstractC18489d0;
import java.util.Arrays;
import java.util.regex.Pattern;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: zt.t */
/* JADX INFO: loaded from: classes.dex */
public final class C41116t {

    /* JADX INFO: renamed from: d */
    public static final Pattern f177235d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a */
    public final String f177236a;

    /* JADX INFO: renamed from: b */
    public final String f177237b;

    /* JADX INFO: renamed from: c */
    public final String f177238c;

    public C41116t(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f177235d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f177236a = strSubstring;
        this.f177237b = str;
        this.f177238c = AbstractC18489d0.m53370k(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C41116t)) {
            return false;
        }
        C41116t c41116t = (C41116t) obj;
        return this.f177236a.equals(c41116t.f177236a) && this.f177237b.equals(c41116t.f177237b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f177237b, this.f177236a});
    }
}
