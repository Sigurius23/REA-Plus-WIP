package r60;

import androidx.core.app.NotificationCompat;
import com.whoop.achievements.domain.models.AchievementsResponse;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import u60.InterfaceC34549a;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: r60.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001f\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b!\u0010'¨\u0006("}, m65681d2 = {"Lr60/c;", "", "Lr60/a;", "currentDialogType", "Lcom/whoop/achievements/domain/models/AchievementsResponse;", "response", "", "achievementType", "source", "", "manualRefresh", "displayRefreshingSpinner", "Lu60/a;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lr60/a;Lcom/whoop/achievements/domain/models/AchievementsResponse;Ljava/lang/String;Ljava/lang/String;ZZLu60/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lr60/a;", "b", "()Lr60/a;", "Lcom/whoop/achievements/domain/models/AchievementsResponse;", "f", "()Lcom/whoop/achievements/domain/models/AchievementsResponse;", "c", "Ljava/lang/String;", "d", "g", "e", "Z", "()Z", "Lu60/a;", "()Lu60/a;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30975c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC30973a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AchievementsResponse response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String achievementType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34549a event;

    public C30975c(InterfaceC30973a interfaceC30973a, AchievementsResponse achievementsResponse, String str, String str2, boolean z4, boolean z13, InterfaceC34549a interfaceC34549a) {
        this.currentDialogType = interfaceC30973a;
        this.response = achievementsResponse;
        this.achievementType = str;
        this.source = str2;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.event = interfaceC34549a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAchievementType() {
        return this.achievementType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC30973a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC34549a getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30975c)) {
            return false;
        }
        C30975c c30975c = (C30975c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c30975c.currentDialogType) && AbstractC22676k.m65745e(this.response, c30975c.response) && AbstractC22676k.m65745e(this.achievementType, c30975c.achievementType) && AbstractC22676k.m65745e(this.source, c30975c.source) && this.manualRefresh == c30975c.manualRefresh && this.displayRefreshingSpinner == c30975c.displayRefreshingSpinner && AbstractC22676k.m65745e(this.event, c30975c.event);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AchievementsResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        InterfaceC30973a interfaceC30973a = this.currentDialogType;
        int iHashCode = (interfaceC30973a == null ? 0 : interfaceC30973a.hashCode()) * 31;
        AchievementsResponse achievementsResponse = this.response;
        int iHashCode2 = (iHashCode + (achievementsResponse == null ? 0 : achievementsResponse.hashCode())) * 31;
        String str = this.achievementType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner);
        InterfaceC34549a interfaceC34549a = this.event;
        return iM8289b + (interfaceC34549a != null ? interfaceC34549a.hashCode() : 0);
    }

    public String toString() {
        InterfaceC30973a interfaceC30973a = this.currentDialogType;
        AchievementsResponse achievementsResponse = this.response;
        String str = this.achievementType;
        String str2 = this.source;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        InterfaceC34549a interfaceC34549a = this.event;
        StringBuilder sb4 = new StringBuilder("AchievementsDomainState(currentDialogType=");
        sb4.append(interfaceC30973a);
        sb4.append(", response=");
        sb4.append(achievementsResponse);
        sb4.append(", achievementType=");
        AbstractC11266d.m30444B(sb4, str, ", source=", str2, ", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", event=");
        sb4.append(interfaceC34549a);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C30975c(InterfaceC30973a interfaceC30973a, AchievementsResponse achievementsResponse, String str, String str2, boolean z4, boolean z13, InterfaceC34549a interfaceC34549a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC30973a, (i13 & 2) != 0 ? null : achievementsResponse, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? null : interfaceC34549a);
    }
}
