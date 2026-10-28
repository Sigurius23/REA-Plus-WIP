package k50;

import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.C25271y;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: k50.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\"&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"", "", "", "state", "unitKey", "", "Lk50/c;", "b", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;", "Ll83/k;", "Lk50/d;", "a", "Ljava/util/List;", "SIBLING_MEASUREMENTS", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22198a {

    /* JADX INFO: renamed from: a */
    private static final List<C23465k> f86195a = AbstractC37056f.m118959K(new C23465k("$height", EnumC22201d.LENGTH), new C23465k("$weight", EnumC22201d.MASS));

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final List<C22200c> m63628b(Map<String, ? extends Object> map, String str) {
        Object obj = str != null ? map.get(str) : null;
        UnitSystem unitSystemUnitSystemFromString = UnitSystemExtKt.unitSystemFromString(obj instanceof String ? (String) obj : null);
        if (unitSystemUnitSystemFromString == null) {
            return C25271y.f99162w;
        }
        List<C23465k> list = f86195a;
        ArrayList arrayList = new ArrayList();
        for (C23465k c23465k : list) {
            String str2 = (String) c23465k.f92937w;
            EnumC22201d enumC22201d = (EnumC22201d) c23465k.f92938x;
            Object obj2 = map.get(str2);
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            C22200c c22200c = number != null ? new C22200c(str2, enumC22201d, enumC22201d.toCanonical(number.intValue(), unitSystemUnitSystemFromString)) : null;
            if (c22200c != null) {
                arrayList.add(c22200c);
            }
        }
        return arrayList;
    }
}
