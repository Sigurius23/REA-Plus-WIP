package io.getstream.android.video.generated.models;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006%"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallStatsMapPublisher;", "", "isLive", "", "userId", "", "userSessionId", "publishedTracks", "Lio/getstream/android/video/generated/models/PublishedTrackFlags;", "name", "publisherType", "location", "Lio/getstream/android/video/generated/models/CallStatsLocation;", "(ZLjava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)V", "()Z", "getLocation", "()Lio/getstream/android/video/generated/models/CallStatsLocation;", "getName", "()Ljava/lang/String;", "getPublishedTracks", "()Lio/getstream/android/video/generated/models/PublishedTrackFlags;", "getPublisherType", "getUserId", "getUserSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallStatsMapPublisher {
    private final boolean isLive;
    private final CallStatsLocation location;
    private final String name;
    private final PublishedTrackFlags publishedTracks;
    private final String publisherType;
    private final String userId;
    private final String userSessionId;

    public CallStatsMapPublisher(@InterfaceC30731q(name = "is_live") boolean z4, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "published_tracks") PublishedTrackFlags publishedTracks, @InterfaceC30731q(name = "name") String str, @InterfaceC30731q(name = "publisher_type") String str2, @InterfaceC30731q(name = "location") CallStatsLocation callStatsLocation) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        AbstractC22676k.m65750j(publishedTracks, "publishedTracks");
        this.isLive = z4;
        this.userId = userId;
        this.userSessionId = userSessionId;
        this.publishedTracks = publishedTracks;
        this.name = str;
        this.publisherType = str2;
        this.location = callStatsLocation;
    }

    public static /* synthetic */ CallStatsMapPublisher copy$default(CallStatsMapPublisher callStatsMapPublisher, boolean z4, String str, String str2, PublishedTrackFlags publishedTrackFlags, String str3, String str4, CallStatsLocation callStatsLocation, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = callStatsMapPublisher.isLive;
        }
        if ((i13 & 2) != 0) {
            str = callStatsMapPublisher.userId;
        }
        if ((i13 & 4) != 0) {
            str2 = callStatsMapPublisher.userSessionId;
        }
        if ((i13 & 8) != 0) {
            publishedTrackFlags = callStatsMapPublisher.publishedTracks;
        }
        if ((i13 & 16) != 0) {
            str3 = callStatsMapPublisher.name;
        }
        if ((i13 & 32) != 0) {
            str4 = callStatsMapPublisher.publisherType;
        }
        if ((i13 & 64) != 0) {
            callStatsLocation = callStatsMapPublisher.location;
        }
        String str5 = str4;
        CallStatsLocation callStatsLocation2 = callStatsLocation;
        String str6 = str3;
        String str7 = str2;
        return callStatsMapPublisher.copy(z4, str, str7, publishedTrackFlags, str6, str5, callStatsLocation2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PublishedTrackFlags getPublishedTracks() {
        return this.publishedTracks;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPublisherType() {
        return this.publisherType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CallStatsLocation getLocation() {
        return this.location;
    }

    public final CallStatsMapPublisher copy(@InterfaceC30731q(name = "is_live") boolean isLive, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "published_tracks") PublishedTrackFlags publishedTracks, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "publisher_type") String publisherType, @InterfaceC30731q(name = "location") CallStatsLocation location) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        AbstractC22676k.m65750j(publishedTracks, "publishedTracks");
        return new CallStatsMapPublisher(isLive, userId, userSessionId, publishedTracks, name, publisherType, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallStatsMapPublisher)) {
            return false;
        }
        CallStatsMapPublisher callStatsMapPublisher = (CallStatsMapPublisher) other;
        return this.isLive == callStatsMapPublisher.isLive && AbstractC22676k.m65745e(this.userId, callStatsMapPublisher.userId) && AbstractC22676k.m65745e(this.userSessionId, callStatsMapPublisher.userSessionId) && AbstractC22676k.m65745e(this.publishedTracks, callStatsMapPublisher.publishedTracks) && AbstractC22676k.m65745e(this.name, callStatsMapPublisher.name) && AbstractC22676k.m65745e(this.publisherType, callStatsMapPublisher.publisherType) && AbstractC22676k.m65745e(this.location, callStatsMapPublisher.location);
    }

    public final CallStatsLocation getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final PublishedTrackFlags getPublishedTracks() {
        return this.publishedTracks;
    }

    public final String getPublisherType() {
        return this.publisherType;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public int hashCode() {
        int iHashCode = (this.publishedTracks.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.isLive) * 31, 31, this.userId), 31, this.userSessionId)) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.publisherType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CallStatsLocation callStatsLocation = this.location;
        return iHashCode3 + (callStatsLocation != null ? callStatsLocation.hashCode() : 0);
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public String toString() {
        boolean z4 = this.isLive;
        String str = this.userId;
        String str2 = this.userSessionId;
        PublishedTrackFlags publishedTrackFlags = this.publishedTracks;
        String str3 = this.name;
        String str4 = this.publisherType;
        CallStatsLocation callStatsLocation = this.location;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("CallStatsMapPublisher(isLive=", ", userId=", str, ", userSessionId=", z4);
        sbM38567n.append(str2);
        sbM38567n.append(", publishedTracks=");
        sbM38567n.append(publishedTrackFlags);
        sbM38567n.append(", name=");
        AbstractC11266d.m30444B(sbM38567n, str3, ", publisherType=", str4, ", location=");
        sbM38567n.append(callStatsLocation);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public /* synthetic */ CallStatsMapPublisher(boolean z4, String str, String str2, PublishedTrackFlags publishedTrackFlags, String str3, String str4, CallStatsLocation callStatsLocation, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, str, str2, publishedTrackFlags, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : callStatsLocation);
    }
}
