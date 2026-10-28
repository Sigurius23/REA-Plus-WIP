package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import java.util.List;
import jg3.C21682i;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010JH\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0014R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b-\u0010\u0010¨\u0006."}, m65681d2 = {"Lio/getstream/android/video/generated/models/UpdatedCallPermissionsEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "", "Lio/getstream/android/video/generated/models/OwnCapability;", "ownCapabilities", "Lio/getstream/android/video/generated/models/UserResponse;", UserState.Sources.USER, "type", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "()Ljava/util/List;", "component4", "()Lio/getstream/android/video/generated/models/UserResponse;", "component5", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/UpdatedCallPermissionsEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "Ljava/util/List;", "getOwnCapabilities", "Lio/getstream/android/video/generated/models/UserResponse;", "getUser", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class UpdatedCallPermissionsEvent extends VideoEvent implements WSCallEvent {
    private final String callCid;
    private final C21682i createdAt;
    private final List<OwnCapability> ownCapabilities;
    private final String type;
    private final UserResponse user;

    public /* synthetic */ UpdatedCallPermissionsEvent(String str, C21682i c21682i, List list, UserResponse userResponse, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, (i13 & 4) != 0 ? C25271y.f99162w : list, userResponse, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdatedCallPermissionsEvent copy$default(UpdatedCallPermissionsEvent updatedCallPermissionsEvent, String str, C21682i c21682i, List list, UserResponse userResponse, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = updatedCallPermissionsEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = updatedCallPermissionsEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            list = updatedCallPermissionsEvent.ownCapabilities;
        }
        if ((i13 & 8) != 0) {
            userResponse = updatedCallPermissionsEvent.user;
        }
        if ((i13 & 16) != 0) {
            str2 = updatedCallPermissionsEvent.type;
        }
        String str3 = str2;
        List list2 = list;
        return updatedCallPermissionsEvent.copy(str, c21682i, list2, userResponse, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallCid() {
        return this.callCid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final List<OwnCapability> component3() {
        return this.ownCapabilities;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UserResponse getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final UpdatedCallPermissionsEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "own_capabilities") List<? extends OwnCapability> ownCapabilities, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        return new UpdatedCallPermissionsEvent(callCid, createdAt, ownCapabilities, user, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatedCallPermissionsEvent)) {
            return false;
        }
        UpdatedCallPermissionsEvent updatedCallPermissionsEvent = (UpdatedCallPermissionsEvent) other;
        return AbstractC22676k.m65745e(this.callCid, updatedCallPermissionsEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, updatedCallPermissionsEvent.createdAt) && AbstractC22676k.m65745e(this.ownCapabilities, updatedCallPermissionsEvent.ownCapabilities) && AbstractC22676k.m65745e(this.user, updatedCallPermissionsEvent.user) && AbstractC22676k.m65745e(this.type, updatedCallPermissionsEvent.type);
    }

    @Override // io.getstream.android.video.generated.models.WSCallEvent
    public String getCallCID() {
        return this.callCid;
    }

    public final String getCallCid() {
        return this.callCid;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return this.type;
    }

    public final List<OwnCapability> getOwnCapabilities() {
        return this.ownCapabilities;
    }

    public final String getType() {
        return this.type;
    }

    public final UserResponse getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.type.hashCode() + ((this.user.hashCode() + AbstractC11895b.m31983b(AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31, this.ownCapabilities)) * 31);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        List<OwnCapability> list = this.ownCapabilities;
        UserResponse userResponse = this.user;
        String str2 = this.type;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("UpdatedCallPermissionsEvent(callCid=", c21682i, str, ", createdAt=", ", ownCapabilities=");
        sbM94767p.append(list);
        sbM94767p.append(", user=");
        sbM94767p.append(userResponse);
        sbM94767p.append(", type=");
        return AbstractC25012a.m73376i(str2, ")", sbM94767p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdatedCallPermissionsEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "own_capabilities") List<? extends OwnCapability> ownCapabilities, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.ownCapabilities = ownCapabilities;
        this.user = user;
        this.type = type;
    }
}
