package vd2;

import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdNotificationHistoryResponse;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vd2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, m65681d2 = {"Lvd2/b;", "", "Lvd2/d;", "currentScreenType", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;", "settingsScreenResponse", "", "isLoadingMoreHistory", "", "accNextToken", "<init>", "(Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;)V", "a", "(Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;)Lvd2/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lvd2/d;", "c", "()Lvd2/d;", "b", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;", "d", "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;", "Z", "e", "()Z", "Ljava/lang/String;", "getAccNextToken", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35912b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC35914d currentScreenType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ShepherdNotificationHistoryResponse settingsScreenResponse;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isLoadingMoreHistory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String accNextToken;

    public C35912b(InterfaceC35914d currentScreenType, ShepherdNotificationHistoryResponse shepherdNotificationHistoryResponse, boolean z4, String str) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        this.currentScreenType = currentScreenType;
        this.settingsScreenResponse = shepherdNotificationHistoryResponse;
        this.isLoadingMoreHistory = z4;
        this.accNextToken = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35912b m114077b(C35912b c35912b, InterfaceC35914d interfaceC35914d, ShepherdNotificationHistoryResponse shepherdNotificationHistoryResponse, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC35914d = c35912b.currentScreenType;
        }
        if ((i13 & 2) != 0) {
            shepherdNotificationHistoryResponse = c35912b.settingsScreenResponse;
        }
        if ((i13 & 4) != 0) {
            z4 = c35912b.isLoadingMoreHistory;
        }
        if ((i13 & 8) != 0) {
            str = c35912b.accNextToken;
        }
        return c35912b.m114078a(interfaceC35914d, shepherdNotificationHistoryResponse, z4, str);
    }

    /* JADX INFO: renamed from: a */
    public final C35912b m114078a(InterfaceC35914d currentScreenType, ShepherdNotificationHistoryResponse settingsScreenResponse, boolean isLoadingMoreHistory, String accNextToken) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        return new C35912b(currentScreenType, settingsScreenResponse, isLoadingMoreHistory, accNextToken);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC35914d getCurrentScreenType() {
        return this.currentScreenType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ShepherdNotificationHistoryResponse getSettingsScreenResponse() {
        return this.settingsScreenResponse;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoadingMoreHistory() {
        return this.isLoadingMoreHistory;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35912b)) {
            return false;
        }
        C35912b c35912b = (C35912b) other;
        return AbstractC22676k.m65745e(this.currentScreenType, c35912b.currentScreenType) && AbstractC22676k.m65745e(this.settingsScreenResponse, c35912b.settingsScreenResponse) && this.isLoadingMoreHistory == c35912b.isLoadingMoreHistory && AbstractC22676k.m65745e(this.accNextToken, c35912b.accNextToken);
    }

    public int hashCode() {
        int iHashCode = this.currentScreenType.hashCode() * 31;
        ShepherdNotificationHistoryResponse shepherdNotificationHistoryResponse = this.settingsScreenResponse;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (shepherdNotificationHistoryResponse == null ? 0 : shepherdNotificationHistoryResponse.hashCode())) * 31, 31, this.isLoadingMoreHistory);
        String str = this.accNextToken;
        return iM8289b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        InterfaceC35914d interfaceC35914d = this.currentScreenType;
        ShepherdNotificationHistoryResponse shepherdNotificationHistoryResponse = this.settingsScreenResponse;
        boolean z4 = this.isLoadingMoreHistory;
        String str = this.accNextToken;
        StringBuilder sb4 = new StringBuilder("ShepherdNotificationHistoryDomainState(currentScreenType=");
        sb4.append(interfaceC35914d);
        sb4.append(", settingsScreenResponse=");
        sb4.append(shepherdNotificationHistoryResponse);
        sb4.append(", isLoadingMoreHistory=");
        return AbstractC21702c.m61139j(sb4, z4, ", accNextToken=", str, ")");
    }

    public /* synthetic */ C35912b(InterfaceC35914d interfaceC35914d, ShepherdNotificationHistoryResponse shepherdNotificationHistoryResponse, boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC35914d.g.f152970a : interfaceC35914d, (i13 & 2) != 0 ? null : shepherdNotificationHistoryResponse, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : str);
    }
}
