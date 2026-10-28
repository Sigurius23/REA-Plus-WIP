package sr2;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: sr2.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\r\u001a\u00020\u00048\u0016X\u0097D¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u0010"}, m65681d2 = {"Lsr2/q;", "Lsr2/y;", "<init>", "()V", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "webBaseUrl", "b", "c", "getUpgradeBaseUrl$annotations", "upgradeBaseUrl", "checkoutBaseUrl", "apiBaseUrl", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32935q extends AbstractC32943y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String webBaseUrl = "https://app.whoop.com/";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String upgradeBaseUrl = "https://join.whoop.com/";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String checkoutBaseUrl = "https://join.whoop.com/";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String apiBaseUrl = "https://api.prod.whoop.com";

    @Override // sr2.AbstractC32943y
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    @Override // sr2.AbstractC32943y
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getCheckoutBaseUrl() {
        return this.checkoutBaseUrl;
    }

    @Override // sr2.AbstractC32943y
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getUpgradeBaseUrl() {
        return this.upgradeBaseUrl;
    }

    @Override // sr2.AbstractC32943y
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getWebBaseUrl() {
        return this.webBaseUrl;
    }
}
