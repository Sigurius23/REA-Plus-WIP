package b21;

import java.util.ArrayList;
import java.util.List;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b21.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00002\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "Ll83/k;", "", "intervals", "Lb21/e;", "a", "(Ljava/util/List;)Ljava/util/List;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2333f {
    /* JADX INFO: renamed from: a */
    public static final List<C2332e> m7193a(List<C23465k> intervals) {
        AbstractC22676k.m65750j(intervals, "intervals");
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : intervals) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C23465k c23465k = (C23465k) obj;
            float fFloatValue = ((Number) c23465k.f92937w).floatValue();
            arrayList.add(new C2332e(i13 == 0 ? fFloatValue / 100 : (fFloatValue - ((Number) intervals.get(i13 - 1).f92938x).floatValue()) / 100, (((Number) c23465k.f92938x).floatValue() - fFloatValue) / 100));
            i13 = i14;
        }
        return arrayList;
    }
}
