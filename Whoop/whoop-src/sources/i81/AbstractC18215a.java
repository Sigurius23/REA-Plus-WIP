package i81;

import androidx.compose.runtime.Composer;
import c41.AbstractC4155y2;
import c41.C4141w2;
import c41.C4148x2;
import com.whoop.design.util.AbstractC8693b;
import hy0.EnumC17727b2;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.Metadata;
import x81.C38072d;

/* JADX INFO: renamed from: i81.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "Lc41/w2;", "a", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18215a {
    /* JADX INFO: renamed from: a */
    public static final List<C4141w2> m52400a(Composer composer, int i13) {
        ArrayList arrayList = new ArrayList(10);
        for (int i14 = 0; i14 < 10; i14++) {
            arrayList.add(new C4141w2(Integer.valueOf(i14), null, AbstractC4155y2.b.f16921a, C38072d.f163053a.m121951d().getVarious().getAttention(), null, new C4148x2(EnumC17727b2.NEGATIVE, AbstractC8693b.m21278l("this is a negative trend")), AbstractC8693b.m21278l("Title " + i14), null, AbstractC8693b.m21278l(String.valueOf(i14 * 10)), null, null, null, null, false, 16018, null));
        }
        return arrayList;
    }
}
