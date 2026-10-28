package om0;

import com.whoop.cache.api.prefetch.PrefetchEntry;
import com.whoop.cache.api.prefetch.PrefetchList;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: om0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/cache/api/prefetch/PrefetchEntry;", "Lcom/whoop/cache/api/prefetch/PrefetchList;", "a", "(Lcom/whoop/cache/api/prefetch/PrefetchEntry;)Lcom/whoop/cache/api/prefetch/PrefetchList;", "cache_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28024a {
    /* JADX INFO: renamed from: a */
    public static final PrefetchList m84517a(PrefetchEntry prefetchEntry) {
        AbstractC22676k.m65750j(prefetchEntry, "<this>");
        return new PrefetchList(AbstractC37056f.m118958J(prefetchEntry));
    }
}
