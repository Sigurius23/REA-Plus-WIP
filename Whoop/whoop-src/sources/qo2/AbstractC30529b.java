package qo2;

import jo2.C21839b;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: qo2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Ljo2/b;", "", "stripeConfigurationId", "", "b", "(Ljo2/b;Ljava/lang/Long;)Z", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30529b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final boolean m93584b(C21839b c21839b, Long l7) {
        if (!c21839b.getIsConfigured() || l7 == null) {
            return false;
        }
        Long configuredId = c21839b.getConfiguredId();
        return configuredId != null && configuredId.longValue() == l7.longValue();
    }
}
