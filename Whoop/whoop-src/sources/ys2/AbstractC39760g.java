package ys2;

import java.util.List;
import java.util.regex.Pattern;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r51.C30936d;
import xb3.AbstractC38176k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ys2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "", "a", "(Ljava/lang/String;)Ljava/util/List;", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39760g {
    /* JADX INFO: renamed from: a */
    public static final List<String> m127274a(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        Pattern patternCompile = Pattern.compile("[\\[\\]]");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        String string = AbstractC39414r.m125869O0(AbstractC39421y.m125926K(strReplaceAll, " ", "", false)).toString();
        AbstractC22676k.m65750j(string, "<this>");
        return AbstractC38176k.m122276E(AbstractC38176k.m122272A(AbstractC39414r.m125896o0(string, new String[]{","}, 0), new C30936d(string, 14)));
    }
}
