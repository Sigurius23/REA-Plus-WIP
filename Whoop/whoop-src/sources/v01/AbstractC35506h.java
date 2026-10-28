package v01;

import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v01.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "Lv01/d;", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35506h {
    /* JADX INFO: renamed from: a */
    public static final String m112621a(List<C35502d> list) {
        Object next;
        String value;
        AbstractC22676k.m65750j(list, "<this>");
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((C35502d) next).getIsSelected());
        C35502d c35502d = (C35502d) next;
        if (c35502d != null && (value = c35502d.getValue()) != null) {
            return value;
        }
        C35502d c35502d2 = (C35502d) AbstractC25265s.m74100H0(list);
        String value2 = c35502d2 != null ? c35502d2.getValue() : null;
        return value2 == null ? "" : value2;
    }
}
