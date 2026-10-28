package u80;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: u80.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lu80/e;", "", "<init>", "()V", "", "code", "", "Lu80/a;", "countries", "b", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "query", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34635e {
    /* JADX INFO: renamed from: a */
    public final List<C34631a> m109469a(List<C34631a> countries, String query) {
        AbstractC22676k.m65750j(countries, "countries");
        AbstractC22676k.m65750j(query, "query");
        ArrayList arrayList = new ArrayList();
        for (Object obj : countries) {
            if (AbstractC39414r.m125876U(((C34631a) obj).getName(), query, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List<C34631a> m109470b(String code, List<C34631a> countries) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(countries, "countries");
        List<C34631a> list = countries;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C34631a c34631a : list) {
            arrayList.add(new C34631a(c34631a.getName(), c34631a.getCode(), c34631a.getFlag(), AbstractC22676k.m65745e(c34631a.getCode(), code), c34631a.getAgeLimit()));
        }
        return arrayList;
    }
}
