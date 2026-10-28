package ad3;

import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ad3.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C0779v {
    /* JADX INFO: renamed from: a */
    public final String m1854a(InterfaceC39443g descriptor, String serialName) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(serialName, "serialName");
        StringBuilder sb4 = new StringBuilder(serialName.length() * 2);
        Character chValueOf = null;
        int i13 = 0;
        for (int i14 = 0; i14 < serialName.length(); i14++) {
            char cCharAt = serialName.charAt(i14);
            if (Character.isUpperCase(cCharAt)) {
                if (i13 == 0 && sb4.length() > 0 && AbstractC39414r.m125891j0(sb4) != '_') {
                    sb4.append('_');
                }
                if (chValueOf != null) {
                    sb4.append(chValueOf.charValue());
                }
                i13++;
                chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
            } else {
                if (chValueOf != null) {
                    if (i13 > 1 && Character.isLetter(cCharAt)) {
                        sb4.append('_');
                    }
                    sb4.append(chValueOf.charValue());
                    chValueOf = null;
                    i13 = 0;
                }
                sb4.append(cCharAt);
            }
        }
        if (chValueOf != null) {
            sb4.append(chValueOf.charValue());
        }
        return sb4.toString();
    }

    public final String toString() {
        return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
    }
}
