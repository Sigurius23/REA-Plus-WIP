package p741vn1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k31.C22174d;
import o01.C27347c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: vn1.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b(\u0010\u0010R\u0011\u0010)\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010%¨\u0006*"}, m65681d2 = {"Lvn1/q;", "Lm91/u;", "Lvn1/g;", "notificationsCenterViewState", "Lo01/c;", "aiChatEntryPointItem", "Lk31/d;", "replayViewState", "", "shouldShowReplayDefaultState", "", "path", "userCategory", "<init>", "(Lvn1/g;Lo01/c;Lk31/d;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lvn1/g;", "c", "()Lvn1/g;", "b", "Lo01/c;", "()Lo01/c;", "Lk31/d;", "f", "()Lk31/d;", "d", "Z", "g", "()Z", "e", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "hasBottomContent", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36213q implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f155039g = C22174d.f85992f | C27347c.f109538k;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC36203g notificationsCenterViewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27347c aiChatEntryPointItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C22174d replayViewState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean shouldShowReplayDefaultState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String userCategory;

    public C36213q(AbstractC36203g abstractC36203g, C27347c c27347c, C22174d c22174d, boolean z4, String str, String str2) {
        this.notificationsCenterViewState = abstractC36203g;
        this.aiChatEntryPointItem = c27347c;
        this.replayViewState = c22174d;
        this.shouldShowReplayDefaultState = z4;
        this.path = str;
        this.userCategory = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27347c getAiChatEntryPointItem() {
        return this.aiChatEntryPointItem;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m115262b() {
        return (this.aiChatEntryPointItem == null && this.replayViewState == null) ? false : true;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC36203g getNotificationsCenterViewState() {
        return this.notificationsCenterViewState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36213q)) {
            return false;
        }
        C36213q c36213q = (C36213q) other;
        return AbstractC22676k.m65745e(this.notificationsCenterViewState, c36213q.notificationsCenterViewState) && AbstractC22676k.m65745e(this.aiChatEntryPointItem, c36213q.aiChatEntryPointItem) && AbstractC22676k.m65745e(this.replayViewState, c36213q.replayViewState) && this.shouldShowReplayDefaultState == c36213q.shouldShowReplayDefaultState && AbstractC22676k.m65745e(this.path, c36213q.path) && AbstractC22676k.m65745e(this.userCategory, c36213q.userCategory);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C22174d getReplayViewState() {
        return this.replayViewState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShouldShowReplayDefaultState() {
        return this.shouldShowReplayDefaultState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUserCategory() {
        return this.userCategory;
    }

    public int hashCode() {
        AbstractC36203g abstractC36203g = this.notificationsCenterViewState;
        int iHashCode = (abstractC36203g == null ? 0 : abstractC36203g.hashCode()) * 31;
        C27347c c27347c = this.aiChatEntryPointItem;
        int iHashCode2 = (iHashCode + (c27347c == null ? 0 : c27347c.hashCode())) * 31;
        C22174d c22174d = this.replayViewState;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (c22174d == null ? 0 : c22174d.hashCode())) * 31, 31, this.shouldShowReplayDefaultState);
        String str = this.path;
        int iHashCode3 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userCategory;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        AbstractC36203g abstractC36203g = this.notificationsCenterViewState;
        C27347c c27347c = this.aiChatEntryPointItem;
        C22174d c22174d = this.replayViewState;
        boolean z4 = this.shouldShowReplayDefaultState;
        String str = this.path;
        String str2 = this.userCategory;
        StringBuilder sb4 = new StringBuilder("NotificationsWrapperState(notificationsCenterViewState=");
        sb4.append(abstractC36203g);
        sb4.append(", aiChatEntryPointItem=");
        sb4.append(c27347c);
        sb4.append(", replayViewState=");
        sb4.append(c22174d);
        sb4.append(", shouldShowReplayDefaultState=");
        sb4.append(z4);
        sb4.append(", path=");
        return AbstractC11266d.m30464r(sb4, str, ", userCategory=", str2, ")");
    }

    public /* synthetic */ C36213q(AbstractC36203g abstractC36203g, C27347c c27347c, C22174d c22174d, boolean z4, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC36203g, c27347c, c22174d, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : str2);
    }
}
