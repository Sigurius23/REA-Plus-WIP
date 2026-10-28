package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;", "", "byMinute", "", "Lio/getstream/android/video/generated/models/ParticipantCountByMinuteResponse;", "(Ljava/util/List;)V", "getByMinute", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ParticipantCountOverTimeResponse {
    private final List<ParticipantCountByMinuteResponse> byMinute;

    /* JADX WARN: Multi-variable type inference failed */
    public ParticipantCountOverTimeResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParticipantCountOverTimeResponse copy$default(ParticipantCountOverTimeResponse participantCountOverTimeResponse, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = participantCountOverTimeResponse.byMinute;
        }
        return participantCountOverTimeResponse.copy(list);
    }

    public final List<ParticipantCountByMinuteResponse> component1() {
        return this.byMinute;
    }

    public final ParticipantCountOverTimeResponse copy(@InterfaceC30731q(name = "by_minute") List<ParticipantCountByMinuteResponse> byMinute) {
        return new ParticipantCountOverTimeResponse(byMinute);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ParticipantCountOverTimeResponse) && AbstractC22676k.m65745e(this.byMinute, ((ParticipantCountOverTimeResponse) other).byMinute);
    }

    public final List<ParticipantCountByMinuteResponse> getByMinute() {
        return this.byMinute;
    }

    public int hashCode() {
        List<ParticipantCountByMinuteResponse> list = this.byMinute;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("ParticipantCountOverTimeResponse(byMinute=", ")", this.byMinute);
    }

    public ParticipantCountOverTimeResponse(@InterfaceC30731q(name = "by_minute") List<ParticipantCountByMinuteResponse> list) {
        this.byMinute = list;
    }

    public /* synthetic */ ParticipantCountOverTimeResponse(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list);
    }
}
