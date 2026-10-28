package p525uj;

import java.util.Locale;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import yb3.AbstractC39414r;
import yb3.C39406j;
import yb3.C39409m;
import yb3.C39410n;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: uj.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C35030h extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C35030h f148275x;

    /* JADX INFO: renamed from: y */
    public static final C35030h f148276y;

    /* JADX INFO: renamed from: z */
    public static final C35030h f148277z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f148278w;

    static {
        int i13 = 1;
        f148275x = new C35030h(i13, 0);
        f148276y = new C35030h(i13, 1);
        f148277z = new C35030h(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35030h(int i13, int i14) {
        super(i13);
        this.f148278w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.f148278w) {
            case 0:
                InterfaceC39407k match = (InterfaceC39407k) obj;
                AbstractC22676k.m65750j(match, "match");
                C39409m c39409m = ((C39410n) match).f169585c;
                C39406j c39406jM125842c = c39409m.m125842c(1);
                if (c39406jM125842c != null && (str = c39406jM125842c.f169579a) != null) {
                    return str;
                }
                C39406j c39406jM125842c2 = c39409m.m125842c(2);
                if (c39406jM125842c2 != null) {
                    return c39406jM125842c2.f169579a;
                }
                C39406j c39406jM125842c3 = c39409m.m125842c(3);
                if (c39406jM125842c3 != null) {
                    return c39406jM125842c3.f169579a;
                }
                return null;
            case 1:
                String it = (String) obj;
                AbstractC22676k.m65750j(it, "it");
                String lowerCase = AbstractC39414r.m125869O0(it).toString().toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                return lowerCase;
            default:
                String it3 = (String) obj;
                AbstractC22676k.m65750j(it3, "it");
                return Boolean.valueOf(it3.length() > 0);
        }
    }
}
