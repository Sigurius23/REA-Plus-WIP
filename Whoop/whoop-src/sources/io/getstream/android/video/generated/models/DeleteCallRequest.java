package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/android/video/generated/models/DeleteCallRequest;", "", "hard", "", "(Ljava/lang/Boolean;)V", "getHard", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/DeleteCallRequest;", "equals", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class DeleteCallRequest {
    private final Boolean hard;

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteCallRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DeleteCallRequest copy$default(DeleteCallRequest deleteCallRequest, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = deleteCallRequest.hard;
        }
        return deleteCallRequest.copy(bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getHard() {
        return this.hard;
    }

    public final DeleteCallRequest copy(@InterfaceC30731q(name = "hard") Boolean hard) {
        return new DeleteCallRequest(hard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeleteCallRequest) && AbstractC22676k.m65745e(this.hard, ((DeleteCallRequest) other).hard);
    }

    public final Boolean getHard() {
        return this.hard;
    }

    public int hashCode() {
        Boolean bool = this.hard;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106651j("DeleteCallRequest(hard=", this.hard, ")");
    }

    public DeleteCallRequest(@InterfaceC30731q(name = "hard") Boolean bool) {
        this.hard = bool;
    }

    public /* synthetic */ DeleteCallRequest(Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool);
    }
}
