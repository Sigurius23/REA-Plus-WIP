package cz0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cz0.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcz0/i;", "", "<init>", "()V", "", "xInput", "", "Lcz0/s;", "found", "", "", "a", "(FLjava/util/List;)Ljava/util/Map;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11248i {
    /* JADX INFO: renamed from: a */
    public final Map<String, AbstractC11258s> m30368a(float xInput, List<? extends AbstractC11258s> found) {
        Object obj;
        AbstractC11258s abstractC11258s;
        AbstractC22676k.m65750j(found, "found");
        List<? extends AbstractC11258s> list = found;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (AbstractC11258s abstractC11258s2 : list) {
            linkedHashMap.put(abstractC11258s2, Float.valueOf(Math.abs(abstractC11258s2.getX() - xInput)));
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                        next = next2;
                        fFloatValue = fFloatValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (abstractC11258s = (AbstractC11258s) entry.getKey()) == null) {
            return C25272z.f99163w;
        }
        float x3 = abstractC11258s.getX();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((AbstractC11258s) obj2).getX() == x3) {
                arrayList.add(obj2);
            }
        }
        int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
        for (Object obj3 : arrayList) {
            linkedHashMap2.put(((AbstractC11258s) obj3).getId(), obj3);
        }
        return linkedHashMap2;
    }
}
