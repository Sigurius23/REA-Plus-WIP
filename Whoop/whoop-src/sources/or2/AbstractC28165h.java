package or2;

import java.util.Iterator;
import java.util.Locale;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: or2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"", "Lor2/i;", "c", "(Ljava/lang/String;)Lor2/i;", "Lor2/g;", "a", "(Lor2/g;)Ljava/lang/String;", "buildVariant", "", "b", "(Lor2/g;)Z", "isMemberFacing", "essentials_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28165h {
    /* JADX INFO: renamed from: a */
    public static final String m85265a(C28162g c28162g) {
        String strValueOf;
        AbstractC22676k.m65750j(c28162g, "<this>");
        String buildType = c28162g.getBuildType();
        if (buildType.length() > 0) {
            StringBuilder sb4 = new StringBuilder();
            char cCharAt = buildType.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                Locale US = Locale.US;
                AbstractC22676k.m65749i(US, "US");
                String strValueOf2 = String.valueOf(cCharAt);
                AbstractC22676k.m65748h(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                strValueOf = strValueOf2.toUpperCase(US);
                AbstractC22676k.m65749i(strValueOf, "toUpperCase(...)");
                if (strValueOf.length() <= 1) {
                    String strValueOf3 = String.valueOf(cCharAt);
                    AbstractC22676k.m65748h(strValueOf3, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = strValueOf3.toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    if (strValueOf.equals(upperCase)) {
                        strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                    }
                } else if (cCharAt != 329) {
                    char cCharAt2 = strValueOf.charAt(0);
                    String strSubstring = strValueOf.substring(1);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                    strValueOf = cCharAt2 + lowerCase;
                }
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb4.append((Object) strValueOf);
            String strSubstring2 = buildType.substring(1);
            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
            sb4.append(strSubstring2);
            buildType = sb4.toString();
        }
        return AbstractC2875y.m8299l(c28162g.getBuildFlavor(), buildType);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m85266b(C28162g c28162g) {
        AbstractC22676k.m65750j(c28162g, "<this>");
        return AbstractC39421y.m125921F(c28162g.getBuildType(), "release", true) && m85267c(c28162g.getBuildDistribution()) == EnumC28168i.PLAY_PROD_MEMBER;
    }

    /* JADX INFO: renamed from: c */
    public static final EnumC28168i m85267c(String str) {
        Object next;
        AbstractC22676k.m65750j(str, "<this>");
        Iterator<E> it = EnumC28168i.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC39421y.m125921F(((EnumC28168i) next).getRawString(), str, true));
        EnumC28168i enumC28168i = (EnumC28168i) next;
        return enumC28168i == null ? EnumC28168i.UNKNOWN : enumC28168i;
    }
}
