package hu1;

import java.util.ArrayList;
import java.util.List;
import mt0.C25937g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hu1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "Lmt0/g;", "", "versionId", "Lhu1/b;", "a", "(Ljava/util/List;I)Ljava/util/List;", "labrador-service_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17653j {
    /* JADX INFO: renamed from: a */
    public static final List<C17645b> m50295a(List<C25937g> list, int i13) {
        AbstractC22676k.m65750j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (C25937g c25937g : list) {
            arrayList.add(new C17645b(c25937g.m72396Y().m41583j(), c25937g.m72392U(), c25937g.getRawData(), i13));
        }
        return arrayList;
    }
}
