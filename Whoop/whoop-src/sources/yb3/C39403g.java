package yb3;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import p000.AbstractC11266d;
import s40.AbstractC32145e0;

/* JADX INFO: renamed from: yb3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C39403g {

    /* JADX INFO: renamed from: a */
    public static final C39403g f169569a;

    static {
        C39403g c39403g = new C39403g();
        if (!AbstractC32145e0.m100094a("")) {
            AbstractC32145e0.m100094a("");
        }
        f169569a = c39403g;
    }

    /* JADX INFO: renamed from: a */
    public final void m125841a(StringBuilder sb4, String str) {
        AbstractC11266d.m30444B(sb4, str, "prefix = \"", "", "\",");
        sb4.append('\n');
        sb4.append(str);
        sb4.append("suffix = \"");
        sb4.append("");
        sb4.append("\",");
        sb4.append('\n');
        sb4.append(str);
        sb4.append("removeLeadingZeros = ");
        sb4.append(false);
        sb4.append(DateTimeRange.lowerUpperDelimiter);
        sb4.append('\n');
        sb4.append(str);
        sb4.append("minLength = ");
        sb4.append(1);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append("NumberHexFormat(\n");
        m125841a(sb4, "    ");
        sb4.append('\n');
        sb4.append(")");
        return sb4.toString();
    }
}
