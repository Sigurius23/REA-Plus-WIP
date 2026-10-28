package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/android/video/generated/models/UserRatingReportResponse;", "", "average", "", "count", "", "(FI)V", "getAverage", "()F", "getCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class UserRatingReportResponse {
    private final float average;
    private final int count;

    public UserRatingReportResponse(@InterfaceC30731q(name = "average") float f13, @InterfaceC30731q(name = "count") int i13) {
        this.average = f13;
        this.count = i13;
    }

    public static /* synthetic */ UserRatingReportResponse copy$default(UserRatingReportResponse userRatingReportResponse, float f13, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            f13 = userRatingReportResponse.average;
        }
        if ((i14 & 2) != 0) {
            i13 = userRatingReportResponse.count;
        }
        return userRatingReportResponse.copy(f13, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getAverage() {
        return this.average;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final UserRatingReportResponse copy(@InterfaceC30731q(name = "average") float average, @InterfaceC30731q(name = "count") int count) {
        return new UserRatingReportResponse(average, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRatingReportResponse)) {
            return false;
        }
        UserRatingReportResponse userRatingReportResponse = (UserRatingReportResponse) other;
        return Float.compare(this.average, userRatingReportResponse.average) == 0 && this.count == userRatingReportResponse.count;
    }

    public final float getAverage() {
        return this.average;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + (Float.hashCode(this.average) * 31);
    }

    public String toString() {
        return "UserRatingReportResponse(average=" + this.average + ", count=" + this.count + ")";
    }
}
