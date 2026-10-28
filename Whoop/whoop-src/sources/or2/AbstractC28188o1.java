package or2;

import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: or2.o1 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0010\r\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m65681d2 = {"", "", "d", "(Ljava/lang/String;)Z", "c", "", "", "element", "a", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;)Z", "e", "(Ljava/lang/String;)Ljava/lang/String;", "b", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28188o1 {
    /* JADX WARN: Code duplicated, block: B:10:0x002a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x002b A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static final boolean m85311a(Iterable<String> iterable, CharSequence element) {
        AbstractC22676k.m65750j(iterable, "<this>");
        AbstractC22676k.m65750j(element, "element");
        for (String str : iterable) {
            if (AbstractC39421y.m125921F(str, element.toString(), true)) {
                if (str != null) {
                    return true;
                }
                return false;
            }
        }
        str = null;
        if (str != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final String m85312b(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return AbstractC39421y.m125926K(str, "_", " ", false);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m85313c(String str) {
        return str != null;
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: d */
    public static final boolean m85314d(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX INFO: renamed from: e */
    public static final String m85315e(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return AbstractC39421y.m125926K(str, " ", "_", false);
    }
}
