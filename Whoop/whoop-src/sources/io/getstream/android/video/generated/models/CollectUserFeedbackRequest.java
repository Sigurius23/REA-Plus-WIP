package io.getstream.android.video.generated.models;

import ih0.AbstractC18489d0;
import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0018\b\u0003\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nHÆ\u0003JY\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\u0018\b\u0003\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CollectUserFeedbackRequest;", "", "rating", "", "sdk", "", "sdkVersion", "reason", "userSessionId", "custom", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCustom", "()Ljava/util/Map;", "getRating", "()I", "getReason", "()Ljava/lang/String;", "getSdk", "getSdkVersion", "getUserSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CollectUserFeedbackRequest {
    private final Map<String, Object> custom;
    private final int rating;
    private final String reason;
    private final String sdk;
    private final String sdkVersion;
    private final String userSessionId;

    public CollectUserFeedbackRequest(@InterfaceC30731q(name = "rating") int i13, @InterfaceC30731q(name = "sdk") String sdk, @InterfaceC30731q(name = "sdk_version") String sdkVersion, @InterfaceC30731q(name = "reason") String str, @InterfaceC30731q(name = "user_session_id") String str2, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(sdk, "sdk");
        AbstractC22676k.m65750j(sdkVersion, "sdkVersion");
        this.rating = i13;
        this.sdk = sdk;
        this.sdkVersion = sdkVersion;
        this.reason = str;
        this.userSessionId = str2;
        this.custom = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollectUserFeedbackRequest copy$default(CollectUserFeedbackRequest collectUserFeedbackRequest, int i13, String str, String str2, String str3, String str4, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = collectUserFeedbackRequest.rating;
        }
        if ((i14 & 2) != 0) {
            str = collectUserFeedbackRequest.sdk;
        }
        if ((i14 & 4) != 0) {
            str2 = collectUserFeedbackRequest.sdkVersion;
        }
        if ((i14 & 8) != 0) {
            str3 = collectUserFeedbackRequest.reason;
        }
        if ((i14 & 16) != 0) {
            str4 = collectUserFeedbackRequest.userSessionId;
        }
        if ((i14 & 32) != 0) {
            map = collectUserFeedbackRequest.custom;
        }
        String str5 = str4;
        Map map2 = map;
        return collectUserFeedbackRequest.copy(i13, str, str2, str3, str5, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdk() {
        return this.sdk;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public final Map<String, Object> component6() {
        return this.custom;
    }

    public final CollectUserFeedbackRequest copy(@InterfaceC30731q(name = "rating") int rating, @InterfaceC30731q(name = "sdk") String sdk, @InterfaceC30731q(name = "sdk_version") String sdkVersion, @InterfaceC30731q(name = "reason") String reason, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom) {
        AbstractC22676k.m65750j(sdk, "sdk");
        AbstractC22676k.m65750j(sdkVersion, "sdkVersion");
        return new CollectUserFeedbackRequest(rating, sdk, sdkVersion, reason, userSessionId, custom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectUserFeedbackRequest)) {
            return false;
        }
        CollectUserFeedbackRequest collectUserFeedbackRequest = (CollectUserFeedbackRequest) other;
        return this.rating == collectUserFeedbackRequest.rating && AbstractC22676k.m65745e(this.sdk, collectUserFeedbackRequest.sdk) && AbstractC22676k.m65745e(this.sdkVersion, collectUserFeedbackRequest.sdkVersion) && AbstractC22676k.m65745e(this.reason, collectUserFeedbackRequest.reason) && AbstractC22676k.m65745e(this.userSessionId, collectUserFeedbackRequest.userSessionId) && AbstractC22676k.m65745e(this.custom, collectUserFeedbackRequest.custom);
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final int getRating() {
        return this.rating;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.rating) * 31, 31, this.sdk), 31, this.sdkVersion);
        String str = this.reason;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userSessionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.custom;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.rating;
        String str = this.sdk;
        String str2 = this.sdkVersion;
        String str3 = this.reason;
        String str4 = this.userSessionId;
        Map<String, Object> map = this.custom;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "CollectUserFeedbackRequest(rating=", ", sdk=", str, ", sdkVersion=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", reason=", str3, ", userSessionId=");
        return AbstractC30007c.m91842l(sbM53373n, str4, ", custom=", map, ")");
    }

    public /* synthetic */ CollectUserFeedbackRequest(int i13, String str, String str2, String str3, String str4, Map map, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? C25272z.f99163w : map);
    }
}
