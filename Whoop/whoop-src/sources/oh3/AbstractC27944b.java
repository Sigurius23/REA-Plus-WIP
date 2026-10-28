package oh3;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: oh3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC27944b extends AbstractC27946d {

    /* JADX INFO: renamed from: c */
    public static final C27943a f112714c = new C27943a();

    /* JADX INFO: renamed from: d */
    private static final Pattern f112715d = Pattern.compile("(\\$\\d+)+$");

    /* JADX INFO: renamed from: b */
    private final List<String> f112716b = AbstractC37056f.m118959K(AbstractC27947e.class.getName(), C27945c.class.getName(), AbstractC27946d.class.getName(), AbstractC27944b.class.getName());

    @Override // oh3.AbstractC27946d
    /* JADX INFO: renamed from: g */
    public String mo84365g() {
        String strMo84365g = super.mo84365g();
        if (strMo84365g != null) {
            return strMo84365g;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        AbstractC22676k.m65749i(stackTrace, "Throwable().stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!this.f112716b.contains(stackTraceElement.getClassName())) {
                return m84366o(stackTraceElement);
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: o */
    public String m84366o(StackTraceElement element) {
        AbstractC22676k.m65750j(element, "element");
        String className = element.getClassName();
        AbstractC22676k.m65749i(className, "element.className");
        String strM125860F0 = AbstractC39414r.m125860F0('.', className, className);
        Matcher matcher = f112715d.matcher(strM125860F0);
        if (!matcher.find()) {
            return strM125860F0;
        }
        String strReplaceAll = matcher.replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll, "m.replaceAll(\"\")");
        return strReplaceAll;
    }
}
