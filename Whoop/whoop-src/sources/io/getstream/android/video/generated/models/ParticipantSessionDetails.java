package io.getstream.android.video.generated.models;

import java.util.List;
import jg3.C21682i;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018Jb\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b-\u0010\u0018¨\u0006."}, m65681d2 = {"Lio/getstream/android/video/generated/models/ParticipantSessionDetails;", "", "", "publisherType", "userId", "userSessionId", "", "roles", "", "durationInSeconds", "Ljg3/i;", "joinedAt", "leftAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljg3/i;Ljg3/i;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Integer;", "component6", "()Ljg3/i;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/ParticipantSessionDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPublisherType", "getUserId", "getUserSessionId", "Ljava/util/List;", "getRoles", "Ljava/lang/Integer;", "getDurationInSeconds", "Ljg3/i;", "getJoinedAt", "getLeftAt", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ParticipantSessionDetails {
    private final Integer durationInSeconds;
    private final C21682i joinedAt;
    private final C21682i leftAt;
    private final String publisherType;
    private final List<String> roles;
    private final String userId;
    private final String userSessionId;

    public ParticipantSessionDetails(@InterfaceC30731q(name = "publisher_type") String publisherType, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "roles") List<String> roles, @InterfaceC30731q(name = "duration_in_seconds") Integer num, @InterfaceC30731q(name = "joined_at") C21682i c21682i, @InterfaceC30731q(name = "left_at") C21682i c21682i2) {
        AbstractC22676k.m65750j(publisherType, "publisherType");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        AbstractC22676k.m65750j(roles, "roles");
        this.publisherType = publisherType;
        this.userId = userId;
        this.userSessionId = userSessionId;
        this.roles = roles;
        this.durationInSeconds = num;
        this.joinedAt = c21682i;
        this.leftAt = c21682i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParticipantSessionDetails copy$default(ParticipantSessionDetails participantSessionDetails, String str, String str2, String str3, List list, Integer num, C21682i c21682i, C21682i c21682i2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = participantSessionDetails.publisherType;
        }
        if ((i13 & 2) != 0) {
            str2 = participantSessionDetails.userId;
        }
        if ((i13 & 4) != 0) {
            str3 = participantSessionDetails.userSessionId;
        }
        if ((i13 & 8) != 0) {
            list = participantSessionDetails.roles;
        }
        if ((i13 & 16) != 0) {
            num = participantSessionDetails.durationInSeconds;
        }
        if ((i13 & 32) != 0) {
            c21682i = participantSessionDetails.joinedAt;
        }
        if ((i13 & 64) != 0) {
            c21682i2 = participantSessionDetails.leftAt;
        }
        C21682i c21682i3 = c21682i;
        C21682i c21682i4 = c21682i2;
        Integer num2 = num;
        String str4 = str3;
        return participantSessionDetails.copy(str, str2, str4, list, num2, c21682i3, c21682i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPublisherType() {
        return this.publisherType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public final List<String> component4() {
        return this.roles;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C21682i getJoinedAt() {
        return this.joinedAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C21682i getLeftAt() {
        return this.leftAt;
    }

    public final ParticipantSessionDetails copy(@InterfaceC30731q(name = "publisher_type") String publisherType, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "roles") List<String> roles, @InterfaceC30731q(name = "duration_in_seconds") Integer durationInSeconds, @InterfaceC30731q(name = "joined_at") C21682i joinedAt, @InterfaceC30731q(name = "left_at") C21682i leftAt) {
        AbstractC22676k.m65750j(publisherType, "publisherType");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        AbstractC22676k.m65750j(roles, "roles");
        return new ParticipantSessionDetails(publisherType, userId, userSessionId, roles, durationInSeconds, joinedAt, leftAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipantSessionDetails)) {
            return false;
        }
        ParticipantSessionDetails participantSessionDetails = (ParticipantSessionDetails) other;
        return AbstractC22676k.m65745e(this.publisherType, participantSessionDetails.publisherType) && AbstractC22676k.m65745e(this.userId, participantSessionDetails.userId) && AbstractC22676k.m65745e(this.userSessionId, participantSessionDetails.userSessionId) && AbstractC22676k.m65745e(this.roles, participantSessionDetails.roles) && AbstractC22676k.m65745e(this.durationInSeconds, participantSessionDetails.durationInSeconds) && AbstractC22676k.m65745e(this.joinedAt, participantSessionDetails.joinedAt) && AbstractC22676k.m65745e(this.leftAt, participantSessionDetails.leftAt);
    }

    public final Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    public final C21682i getJoinedAt() {
        return this.joinedAt;
    }

    public final C21682i getLeftAt() {
        return this.leftAt;
    }

    public final String getPublisherType() {
        return this.publisherType;
    }

    public final List<String> getRoles() {
        return this.roles;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.publisherType.hashCode() * 31, 31, this.userId), 31, this.userSessionId), 31, this.roles);
        Integer num = this.durationInSeconds;
        int iHashCode = (iM31983b + (num == null ? 0 : num.hashCode())) * 31;
        C21682i c21682i = this.joinedAt;
        int iHashCode2 = (iHashCode + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        C21682i c21682i2 = this.leftAt;
        return iHashCode2 + (c21682i2 != null ? c21682i2.hashCode() : 0);
    }

    public String toString() {
        String str = this.publisherType;
        String str2 = this.userId;
        String str3 = this.userSessionId;
        List<String> list = this.roles;
        Integer num = this.durationInSeconds;
        C21682i c21682i = this.joinedAt;
        C21682i c21682i2 = this.leftAt;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ParticipantSessionDetails(publisherType=", str, ", userId=", str2, ", userSessionId=");
        AbstractC36095b.m114694v(str3, ", roles=", ", durationInSeconds=", sbM32001t, list);
        sbM32001t.append(num);
        sbM32001t.append(", joinedAt=");
        sbM32001t.append(c21682i);
        sbM32001t.append(", leftAt=");
        sbM32001t.append(c21682i2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ParticipantSessionDetails(String str, String str2, String str3, List list, Integer num, C21682i c21682i, C21682i c21682i2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : c21682i, (i13 & 64) != 0 ? null : c21682i2);
    }
}
