package io.getstream.android.video.generated.models;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/android/video/generated/models/LocalCallMissedEvent;", "Lio/getstream/android/video/generated/models/LocalEvent;", "callCid", "", "createdById", "(Ljava/lang/String;Ljava/lang/String;)V", "getCallCid", "()Ljava/lang/String;", "getCreatedById", "component1", "component2", "copy", "equals", "", "other", "", "getCallCID", "getEventType", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class LocalCallMissedEvent extends LocalEvent {
    private final String callCid;
    private final String createdById;

    public /* synthetic */ LocalCallMissedEvent(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ LocalCallMissedEvent copy$default(LocalCallMissedEvent localCallMissedEvent, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = localCallMissedEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            str2 = localCallMissedEvent.createdById;
        }
        return localCallMissedEvent.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallCid() {
        return this.callCid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedById() {
        return this.createdById;
    }

    public final LocalCallMissedEvent copy(String callCid, String createdById) {
        AbstractC22676k.m65750j(callCid, "callCid");
        return new LocalCallMissedEvent(callCid, createdById);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalCallMissedEvent)) {
            return false;
        }
        LocalCallMissedEvent localCallMissedEvent = (LocalCallMissedEvent) other;
        return AbstractC22676k.m65745e(this.callCid, localCallMissedEvent.callCid) && AbstractC22676k.m65745e(this.createdById, localCallMissedEvent.createdById);
    }

    @Override // io.getstream.android.video.generated.models.WSCallEvent
    public String getCallCID() {
        return this.callCid;
    }

    public final String getCallCid() {
        return this.callCid;
    }

    public final String getCreatedById() {
        return this.createdById;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return "local.call.reject";
    }

    public int hashCode() {
        int iHashCode = this.callCid.hashCode() * 31;
        String str = this.createdById;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC2875y.m8300m("LocalCallMissedEvent(callCid=", this.callCid, ", createdById=", this.createdById, ")");
    }

    public LocalCallMissedEvent(String callCid, String str) {
        AbstractC22676k.m65750j(callCid, "callCid");
        this.callCid = callCid;
        this.createdById = str;
    }
}
