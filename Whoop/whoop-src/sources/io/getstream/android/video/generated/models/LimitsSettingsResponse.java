package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0010JB\u0010\u0018\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/android/video/generated/models/LimitsSettingsResponse;", "", "maxParticipantsExcludeRoles", "", "", "maxDurationSeconds", "", "maxParticipants", "maxParticipantsExcludeOwner", "", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getMaxDurationSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxParticipants", "getMaxParticipantsExcludeOwner", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxParticipantsExcludeRoles", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/LimitsSettingsResponse;", "equals", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class LimitsSettingsResponse {
    private final Integer maxDurationSeconds;
    private final Integer maxParticipants;
    private final Boolean maxParticipantsExcludeOwner;
    private final List<String> maxParticipantsExcludeRoles;

    public LimitsSettingsResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LimitsSettingsResponse copy$default(LimitsSettingsResponse limitsSettingsResponse, List list, Integer num, Integer num2, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = limitsSettingsResponse.maxParticipantsExcludeRoles;
        }
        if ((i13 & 2) != 0) {
            num = limitsSettingsResponse.maxDurationSeconds;
        }
        if ((i13 & 4) != 0) {
            num2 = limitsSettingsResponse.maxParticipants;
        }
        if ((i13 & 8) != 0) {
            bool = limitsSettingsResponse.maxParticipantsExcludeOwner;
        }
        return limitsSettingsResponse.copy(list, num, num2, bool);
    }

    public final List<String> component1() {
        return this.maxParticipantsExcludeRoles;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMaxDurationSeconds() {
        return this.maxDurationSeconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getMaxParticipantsExcludeOwner() {
        return this.maxParticipantsExcludeOwner;
    }

    public final LimitsSettingsResponse copy(@InterfaceC30731q(name = "max_participants_exclude_roles") List<String> maxParticipantsExcludeRoles, @InterfaceC30731q(name = "max_duration_seconds") Integer maxDurationSeconds, @InterfaceC30731q(name = "max_participants") Integer maxParticipants, @InterfaceC30731q(name = "max_participants_exclude_owner") Boolean maxParticipantsExcludeOwner) {
        AbstractC22676k.m65750j(maxParticipantsExcludeRoles, "maxParticipantsExcludeRoles");
        return new LimitsSettingsResponse(maxParticipantsExcludeRoles, maxDurationSeconds, maxParticipants, maxParticipantsExcludeOwner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitsSettingsResponse)) {
            return false;
        }
        LimitsSettingsResponse limitsSettingsResponse = (LimitsSettingsResponse) other;
        return AbstractC22676k.m65745e(this.maxParticipantsExcludeRoles, limitsSettingsResponse.maxParticipantsExcludeRoles) && AbstractC22676k.m65745e(this.maxDurationSeconds, limitsSettingsResponse.maxDurationSeconds) && AbstractC22676k.m65745e(this.maxParticipants, limitsSettingsResponse.maxParticipants) && AbstractC22676k.m65745e(this.maxParticipantsExcludeOwner, limitsSettingsResponse.maxParticipantsExcludeOwner);
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
        int iHashCode = this.maxParticipantsExcludeRoles.hashCode() * 31;
        Integer num = this.maxDurationSeconds;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxParticipants;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.maxParticipantsExcludeOwner;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "LimitsSettingsResponse(maxParticipantsExcludeRoles=" + this.maxParticipantsExcludeRoles + ", maxDurationSeconds=" + this.maxDurationSeconds + ", maxParticipants=" + this.maxParticipants + ", maxParticipantsExcludeOwner=" + this.maxParticipantsExcludeOwner + ")";
    }

    public LimitsSettingsResponse(@InterfaceC30731q(name = "max_participants_exclude_roles") List<String> maxParticipantsExcludeRoles, @InterfaceC30731q(name = "max_duration_seconds") Integer num, @InterfaceC30731q(name = "max_participants") Integer num2, @InterfaceC30731q(name = "max_participants_exclude_owner") Boolean bool) {
        AbstractC22676k.m65750j(maxParticipantsExcludeRoles, "maxParticipantsExcludeRoles");
        this.maxParticipantsExcludeRoles = maxParticipantsExcludeRoles;
        this.maxDurationSeconds = num;
        this.maxParticipants = num2;
        this.maxParticipantsExcludeOwner = bool;
    }

    public /* synthetic */ LimitsSettingsResponse(List list, Integer num, Integer num2, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? null : bool);
    }
}
