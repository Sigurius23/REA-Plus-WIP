package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JD\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/android/video/generated/models/LimitsSettingsRequest;", "", "maxDurationSeconds", "", "maxParticipants", "maxParticipantsExcludeOwner", "", "maxParticipantsExcludeRoles", "", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)V", "getMaxDurationSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxParticipants", "getMaxParticipantsExcludeOwner", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxParticipantsExcludeRoles", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)Lio/getstream/android/video/generated/models/LimitsSettingsRequest;", "equals", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class LimitsSettingsRequest {
    private final Integer maxDurationSeconds;
    private final Integer maxParticipants;
    private final Boolean maxParticipantsExcludeOwner;
    private final List<String> maxParticipantsExcludeRoles;

    public LimitsSettingsRequest() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LimitsSettingsRequest copy$default(LimitsSettingsRequest limitsSettingsRequest, Integer num, Integer num2, Boolean bool, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = limitsSettingsRequest.maxDurationSeconds;
        }
        if ((i13 & 2) != 0) {
            num2 = limitsSettingsRequest.maxParticipants;
        }
        if ((i13 & 4) != 0) {
            bool = limitsSettingsRequest.maxParticipantsExcludeOwner;
        }
        if ((i13 & 8) != 0) {
            list = limitsSettingsRequest.maxParticipantsExcludeRoles;
        }
        return limitsSettingsRequest.copy(num, num2, bool, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMaxDurationSeconds() {
        return this.maxDurationSeconds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getMaxParticipantsExcludeOwner() {
        return this.maxParticipantsExcludeOwner;
    }

    public final List<String> component4() {
        return this.maxParticipantsExcludeRoles;
    }

    public final LimitsSettingsRequest copy(@InterfaceC30731q(name = "max_duration_seconds") Integer maxDurationSeconds, @InterfaceC30731q(name = "max_participants") Integer maxParticipants, @InterfaceC30731q(name = "max_participants_exclude_owner") Boolean maxParticipantsExcludeOwner, @InterfaceC30731q(name = "max_participants_exclude_roles") List<String> maxParticipantsExcludeRoles) {
        return new LimitsSettingsRequest(maxDurationSeconds, maxParticipants, maxParticipantsExcludeOwner, maxParticipantsExcludeRoles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitsSettingsRequest)) {
            return false;
        }
        LimitsSettingsRequest limitsSettingsRequest = (LimitsSettingsRequest) other;
        return AbstractC22676k.m65745e(this.maxDurationSeconds, limitsSettingsRequest.maxDurationSeconds) && AbstractC22676k.m65745e(this.maxParticipants, limitsSettingsRequest.maxParticipants) && AbstractC22676k.m65745e(this.maxParticipantsExcludeOwner, limitsSettingsRequest.maxParticipantsExcludeOwner) && AbstractC22676k.m65745e(this.maxParticipantsExcludeRoles, limitsSettingsRequest.maxParticipantsExcludeRoles);
    }

    public final Integer getMaxDurationSeconds() {
        return this.maxDurationSeconds;
    }

    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    public final Boolean getMaxParticipantsExcludeOwner() {
        return this.maxParticipantsExcludeOwner;
    }

    public final List<String> getMaxParticipantsExcludeRoles() {
        return this.maxParticipantsExcludeRoles;
    }

    public int hashCode() {
        Integer num = this.maxDurationSeconds;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxParticipants;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.maxParticipantsExcludeOwner;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.maxParticipantsExcludeRoles;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.maxDurationSeconds;
        Integer num2 = this.maxParticipants;
        Boolean bool = this.maxParticipantsExcludeOwner;
        List<String> list = this.maxParticipantsExcludeRoles;
        StringBuilder sbM114684l = AbstractC36095b.m114684l("LimitsSettingsRequest(maxDurationSeconds=", num, ", maxParticipants=", num2, ", maxParticipantsExcludeOwner=");
        sbM114684l.append(bool);
        sbM114684l.append(", maxParticipantsExcludeRoles=");
        sbM114684l.append(list);
        sbM114684l.append(")");
        return sbM114684l.toString();
    }

    public LimitsSettingsRequest(@InterfaceC30731q(name = "max_duration_seconds") Integer num, @InterfaceC30731q(name = "max_participants") Integer num2, @InterfaceC30731q(name = "max_participants_exclude_owner") Boolean bool, @InterfaceC30731q(name = "max_participants_exclude_roles") List<String> list) {
        this.maxDurationSeconds = num;
        this.maxParticipants = num2;
        this.maxParticipantsExcludeOwner = bool;
        this.maxParticipantsExcludeRoles = list;
    }

    public /* synthetic */ LimitsSettingsRequest(Integer num, Integer num2, Boolean bool, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : num2, (i13 & 4) != 0 ? null : bool, (i13 & 8) != 0 ? C25271y.f99162w : list);
    }
}
