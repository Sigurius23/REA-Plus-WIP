package io.getstream.android.video.generated.models;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/android/video/generated/models/DeleteCallResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", NotificationCompat.CATEGORY_CALL, "Lio/getstream/android/video/generated/models/CallResponse;", "taskId", "(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;)V", "getCall", "()Lio/getstream/android/video/generated/models/CallResponse;", "getDuration", "()Ljava/lang/String;", "getTaskId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class DeleteCallResponse {
    private final CallResponse call;
    private final String duration;
    private final String taskId;

    public DeleteCallResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "task_id") String str) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(call, "call");
        this.duration = duration;
        this.call = call;
        this.taskId = str;
    }

    public static /* synthetic */ DeleteCallResponse copy$default(DeleteCallResponse deleteCallResponse, String str, CallResponse callResponse, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = deleteCallResponse.duration;
        }
        if ((i13 & 2) != 0) {
            callResponse = deleteCallResponse.call;
        }
        if ((i13 & 4) != 0) {
            str2 = deleteCallResponse.taskId;
        }
        return deleteCallResponse.copy(str, callResponse, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CallResponse getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    public final DeleteCallResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "task_id") String taskId) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(call, "call");
        return new DeleteCallResponse(duration, call, taskId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteCallResponse)) {
            return false;
        }
        DeleteCallResponse deleteCallResponse = (DeleteCallResponse) other;
        return AbstractC22676k.m65745e(this.duration, deleteCallResponse.duration) && AbstractC22676k.m65745e(this.call, deleteCallResponse.call) && AbstractC22676k.m65745e(this.taskId, deleteCallResponse.taskId);
    }

    public final CallResponse getCall() {
        return this.call;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        int iM11818b = AbstractC3855a.m11818b(this.call, this.duration.hashCode() * 31, 31);
        String str = this.taskId;
        return iM11818b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.duration;
        CallResponse callResponse = this.call;
        String str2 = this.taskId;
        StringBuilder sb4 = new StringBuilder("DeleteCallResponse(duration=");
        sb4.append(str);
        sb4.append(", call=");
        sb4.append(callResponse);
        sb4.append(", taskId=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public /* synthetic */ DeleteCallResponse(String str, CallResponse callResponse, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, callResponse, (i13 & 4) != 0 ? null : str2);
    }
}
