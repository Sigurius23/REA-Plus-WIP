package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.QueryParams;
import jg3.C21682i;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010\u000e¨\u0006#"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallTranscription;", "", "Ljg3/i;", "endTime", "", "filename", "sessionId", "startTime", QueryParams.URL, "<init>", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;)V", "component1", "()Ljg3/i;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallTranscription;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljg3/i;", "getEndTime", "Ljava/lang/String;", "getFilename", "getSessionId", "getStartTime", "getUrl", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallTranscription {
    private final C21682i endTime;
    private final String filename;
    private final String sessionId;
    private final C21682i startTime;
    private final String url;

    public CallTranscription(@InterfaceC30731q(name = "end_time") C21682i endTime, @InterfaceC30731q(name = "filename") String filename, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = "start_time") C21682i startTime, @InterfaceC30731q(name = QueryParams.URL) String url) {
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(filename, "filename");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(url, "url");
        this.endTime = endTime;
        this.filename = filename;
        this.sessionId = sessionId;
        this.startTime = startTime;
        this.url = url;
    }

    public static /* synthetic */ CallTranscription copy$default(CallTranscription callTranscription, C21682i c21682i, String str, String str2, C21682i c21682i2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c21682i = callTranscription.endTime;
        }
        if ((i13 & 2) != 0) {
            str = callTranscription.filename;
        }
        if ((i13 & 4) != 0) {
            str2 = callTranscription.sessionId;
        }
        if ((i13 & 8) != 0) {
            c21682i2 = callTranscription.startTime;
        }
        if ((i13 & 16) != 0) {
            str3 = callTranscription.url;
        }
        String str4 = str3;
        String str5 = str2;
        return callTranscription.copy(c21682i, str, str5, c21682i2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C21682i getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C21682i getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final CallTranscription copy(@InterfaceC30731q(name = "end_time") C21682i endTime, @InterfaceC30731q(name = "filename") String filename, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = "start_time") C21682i startTime, @InterfaceC30731q(name = QueryParams.URL) String url) {
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(filename, "filename");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(url, "url");
        return new CallTranscription(endTime, filename, sessionId, startTime, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallTranscription)) {
            return false;
        }
        CallTranscription callTranscription = (CallTranscription) other;
        return AbstractC22676k.m65745e(this.endTime, callTranscription.endTime) && AbstractC22676k.m65745e(this.filename, callTranscription.filename) && AbstractC22676k.m65745e(this.sessionId, callTranscription.sessionId) && AbstractC22676k.m65745e(this.startTime, callTranscription.startTime) && AbstractC22676k.m65745e(this.url, callTranscription.url);
    }

    public final C21682i getEndTime() {
        return this.endTime;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final C21682i getStartTime() {
        return this.startTime;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + AbstractC3855a.m11822f(this.startTime, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.endTime.hashCode() * 31, 31, this.filename), 31, this.sessionId), 31);
    }

    public String toString() {
        C21682i c21682i = this.endTime;
        String str = this.filename;
        String str2 = this.sessionId;
        C21682i c21682i2 = this.startTime;
        String str3 = this.url;
        StringBuilder sb4 = new StringBuilder("CallTranscription(endTime=");
        sb4.append(c21682i);
        sb4.append(", filename=");
        sb4.append(str);
        sb4.append(", sessionId=");
        sb4.append(str2);
        sb4.append(", startTime=");
        sb4.append(c21682i2);
        sb4.append(", url=");
        return AbstractC25012a.m73376i(str3, ")", sb4);
    }
}
