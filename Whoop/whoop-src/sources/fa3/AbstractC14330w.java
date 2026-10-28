package fa3;

import p715kotlin.jvm.internal.AbstractC22676k;
import sb3.AbstractC32350a;
import va3.AbstractC35844b;
import va3.C35845c;
import va3.C35847e;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: fa3.w */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14330w {

    /* JADX INFO: renamed from: a */
    public static final C35847e f52304a;

    /* JADX INFO: renamed from: b */
    public static final C35845c f52305b;

    static {
        C35847e c35847e = new C35847e("kotlin.jvm.JvmField");
        f52304a = c35847e;
        AbstractC35844b.m113770k(c35847e);
        AbstractC35844b.m113770k(new C35847e("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f52305b = AbstractC35844b.m113763d("kotlin/jvm/internal/RepeatableContainer", false);
    }

    /* JADX INFO: renamed from: a */
    public static final String m40936a(String propertyName) {
        AbstractC22676k.m65750j(propertyName, "propertyName");
        if (m40939d(propertyName)) {
            return propertyName;
        }
        return "get" + AbstractC32350a.m100695b(propertyName);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m40937b(String str) {
        return AbstractC39421y.m125930O(str, "set", false);
    }

    /* JADX INFO: renamed from: c */
    public static final String m40938c(String str) {
        String strM100695b;
        StringBuilder sb4 = new StringBuilder("set");
        if (m40939d(str)) {
            strM100695b = str.substring(2);
            AbstractC22676k.m65749i(strM100695b, "substring(...)");
        } else {
            strM100695b = AbstractC32350a.m100695b(str);
        }
        sb4.append(strM100695b);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m40939d(String name) {
        AbstractC22676k.m65750j(name, "name");
        if (AbstractC39421y.m125930O(name, "is", false) && name.length() != 2) {
            char cCharAt = name.charAt(2);
            if (AbstractC22676k.m65751k(97, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
