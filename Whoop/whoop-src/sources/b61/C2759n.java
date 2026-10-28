package b61;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b61.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lb61/n;", "", "<init>", "()V", "", "xInput", "", "points", "", "a", "(FLjava/util/List;)I", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2759n {
    /* JADX INFO: renamed from: a */
    public final int m7812a(float xInput, List<Float> points) {
        Object obj;
        AbstractC22676k.m65750j(points, "points");
        if (points.isEmpty()) {
            return -1;
        }
        if (points.size() == 1) {
            return 0;
        }
        int iM118986i = AbstractC37056f.m118986i(points, Float.valueOf(xInput));
        if (iM118986i >= 0) {
            return iM118986i;
        }
        int i13 = -(iM118986i + 1);
        List listM118959K = AbstractC37056f.m118959K(Integer.valueOf(i13 - 1), Integer.valueOf(i13));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listM118959K) {
            int iIntValue = ((Number) obj2).intValue();
            if (iIntValue >= 0 && iIntValue < points.size()) {
                arrayList.add(obj2);
            }
        }
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj3 : arrayList) {
            linkedHashMap.put(obj3, Float.valueOf(Math.abs(xInput - points.get(((Number) obj3).intValue()).floatValue())));
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
        AbstractC22676k.m65747g(entry);
        return ((Number) entry.getKey()).intValue();
    }
}
