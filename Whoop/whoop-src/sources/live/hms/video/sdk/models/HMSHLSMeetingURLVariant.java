package live.hms.video.sdk.models;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSHLSMeetingURLVariant;", "", "meetingUrl", "", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMeetingUrl", "()Ljava/lang/String;", "getMetadata", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSHLSMeetingURLVariant {

    @SerializedName("meeting_url")
    private final String meetingUrl;

    @SerializedName("metadata")
    private final String metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public HMSHLSMeetingURLVariant() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HMSHLSMeetingURLVariant copy$default(HMSHLSMeetingURLVariant hMSHLSMeetingURLVariant, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSHLSMeetingURLVariant.meetingUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = hMSHLSMeetingURLVariant.metadata;
        }
        return hMSHLSMeetingURLVariant.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMeetingUrl() {
        return this.meetingUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    public final HMSHLSMeetingURLVariant copy(String meetingUrl, String metadata) {
        AbstractC22676k.m65750j(metadata, "metadata");
        return new HMSHLSMeetingURLVariant(meetingUrl, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSHLSMeetingURLVariant)) {
            return false;
        }
        HMSHLSMeetingURLVariant hMSHLSMeetingURLVariant = (HMSHLSMeetingURLVariant) other;
        return AbstractC22676k.m65745e(this.meetingUrl, hMSHLSMeetingURLVariant.meetingUrl) && AbstractC22676k.m65745e(this.metadata, hMSHLSMeetingURLVariant.metadata);
    }

    public final String getMeetingUrl() {
        return this.meetingUrl;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        String str = this.meetingUrl;
        return this.metadata.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSHLSMeetingURLVariant(meetingUrl=");
        sb4.append(this.meetingUrl);
        sb4.append(", metadata=");
        return AbstractC25012a.m73377j(sb4, this.metadata, ')');
    }

    public HMSHLSMeetingURLVariant(String str, String metadata) {
        AbstractC22676k.m65750j(metadata, "metadata");
        this.meetingUrl = str;
        this.metadata = metadata;
    }

    public /* synthetic */ HMSHLSMeetingURLVariant(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? "" : str2);
    }
}
