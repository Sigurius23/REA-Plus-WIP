package hh1;

import com.whoop.gifting.feature.gifted.domain.models.GiftedModels;
import hb1.C17085h;
import java.util.LinkedHashMap;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hh1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;", "", "", "e", "(Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;)Ljava/util/Map;", "Ljb1/a;", "a", "Ljb1/a;", "itemReducer", "gifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17289b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f66457a = AbstractC21537c.m60554d(new C17085h(15));

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m48970d(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final Map<String, String> m48971e(GiftedModels giftedModels) {
        Map<String, String> analytics = giftedModels.getAnalytics();
        if (analytics == null) {
            return C25272z.f99163w;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : analytics.entrySet()) {
            if (entry.getValue().length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
