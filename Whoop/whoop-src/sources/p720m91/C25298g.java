package p720m91;

import js2.C21930h;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import vc1.C35877a;

/* JADX INFO: renamed from: m91.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lm91/g;", "", "<init>", "()V", "Lm91/o;", "itemWrapper", "Lkotlin/Function1;", "Ll83/a0;", "action", "Lvc1/a;", "itemTapReporter", "b", "(Lm91/o;Lkotlin/jvm/functions/Function1;Lvc1/a;)Lkotlin/jvm/functions/Function1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25298g {

    /* JADX INFO: renamed from: a */
    public static final C25298g f99287a = new C25298g();

    private C25298g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m74260c(C35877a c35877a, C25306o c25306o, Function1 function1, Object argument) {
        AbstractC22676k.m65750j(argument, "argument");
        if (c35877a != null) {
            c35877a.m113921a(c25306o);
        }
        function1.invoke(AbstractC25299h.m74262a(argument, c25306o.getPrimaryAnalyticEvent()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Function1 m74261b(C25306o itemWrapper, Function1 action, C35877a itemTapReporter) {
        AbstractC22676k.m65750j(itemWrapper, "itemWrapper");
        AbstractC22676k.m65750j(action, "action");
        return new C21930h(itemTapReporter, itemWrapper, action, 18);
    }
}
