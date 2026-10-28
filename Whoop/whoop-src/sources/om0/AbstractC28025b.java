package om0;

import a12.AbstractC0142b;
import a12.C0141a;
import com.whoop.cache.api.prefetch.PrefetchEntry;
import com.whoop.cache.api.prefetch.PrefetchRequest;
import com.whoop.network.request.GetApiRequest;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: om0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/cache/api/prefetch/PrefetchEntry;", "Lcom/whoop/network/request/GetApiRequest;", "a", "(Lcom/whoop/cache/api/prefetch/PrefetchEntry;)Lcom/whoop/network/request/GetApiRequest;", "cache_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28025b {
    /* JADX INFO: renamed from: a */
    public static final GetApiRequest m84518a(PrefetchEntry prefetchEntry) {
        AbstractC22676k.m65750j(prefetchEntry, "<this>");
        C0141a c0141aM360e = AbstractC0142b.m360e(prefetchEntry.getPath());
        return new PrefetchRequest(c0141aM360e.getBasePath(), c0141aM360e.m354b());
    }
}
