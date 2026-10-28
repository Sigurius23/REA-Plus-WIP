package io.getstream.chat.android.client.api2.model.requests;

import live.hms.video.utils.HMSFieldTrials;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/MarkReadRequest;", "", "message_id", "", "thread_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage_id", "()Ljava/lang/String;", "getThread_id", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MarkReadRequest {
    private final String message_id;
    private final String thread_id;

    /* JADX WARN: Multi-variable type inference failed */
    public MarkReadRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MarkReadRequest copy$default(MarkReadRequest markReadRequest, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = markReadRequest.message_id;
        }
        if ((i13 & 2) != 0) {
            str2 = markReadRequest.thread_id;
        }
        return markReadRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getThread_id() {
        return this.thread_id;
    }

    public final MarkReadRequest copy(String message_id, String thread_id) {
        AbstractC22676k.m65750j(message_id, "message_id");
        return new MarkReadRequest(message_id, thread_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkReadRequest)) {
            return false;
        }
        MarkReadRequest markReadRequest = (MarkReadRequest) other;
        return AbstractC22676k.m65745e(this.message_id, markReadRequest.message_id) && AbstractC22676k.m65745e(this.thread_id, markReadRequest.thread_id);
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getThread_id() {
        return this.thread_id;
    }

    public int hashCode() {
        int iHashCode = this.message_id.hashCode() * 31;
        String str = this.thread_id;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC2875y.m8300m("MarkReadRequest(message_id=", this.message_id, ", thread_id=", this.thread_id, ")");
    }

    public MarkReadRequest(String message_id, String str) {
        AbstractC22676k.m65750j(message_id, "message_id");
        this.message_id = message_id;
        this.thread_id = str;
    }

    public /* synthetic */ MarkReadRequest(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2);
    }
}
