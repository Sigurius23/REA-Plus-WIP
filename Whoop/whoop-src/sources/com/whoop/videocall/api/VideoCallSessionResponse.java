package com.whoop.videocall.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallSessionResponse;", "", "", "userId", "jwt", "callType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$video_call_release", "(Lcom/whoop/videocall/api/VideoCallSessionResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/videocall/api/VideoCallSessionResponse;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getJwt", "getCallType", "Companion", "$serializer", "a", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VideoCallSessionResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String callType;
    private final String jwt;
    private final String userId;

    /* JADX INFO: renamed from: com.whoop.videocall.api.VideoCallSessionResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallSessionResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/videocall/api/VideoCallSessionResponse;", "serializer", "()Lwc3/c;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VideoCallSessionResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoCallSessionResponse(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, VideoCallSessionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        this.jwt = str2;
        this.callType = str3;
    }

    public static /* synthetic */ VideoCallSessionResponse copy$default(VideoCallSessionResponse videoCallSessionResponse, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoCallSessionResponse.userId;
        }
        if ((i13 & 2) != 0) {
            str2 = videoCallSessionResponse.jwt;
        }
        if ((i13 & 4) != 0) {
            str3 = videoCallSessionResponse.callType;
        }
        return videoCallSessionResponse.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$video_call_release(VideoCallSessionResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.userId);
        output.encodeStringElement(serialDesc, 1, self.jwt);
        output.encodeStringElement(serialDesc, 2, self.callType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCallType() {
        return this.callType;
    }

    public final VideoCallSessionResponse copy(String userId, String jwt, String callType) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(jwt, "jwt");
        AbstractC22676k.m65750j(callType, "callType");
        return new VideoCallSessionResponse(userId, jwt, callType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCallSessionResponse)) {
            return false;
        }
        VideoCallSessionResponse videoCallSessionResponse = (VideoCallSessionResponse) other;
        return AbstractC22676k.m65745e(this.userId, videoCallSessionResponse.userId) && AbstractC22676k.m65745e(this.jwt, videoCallSessionResponse.jwt) && AbstractC22676k.m65745e(this.callType, videoCallSessionResponse.callType);
    }

    public final String getCallType() {
        return this.callType;
    }

    public final String getJwt() {
        return this.jwt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.callType.hashCode() + AbstractC11266d.m30450d(this.userId.hashCode() * 31, 31, this.jwt);
    }

    public String toString() {
        return AbstractC2875y.m8300m("VideoCallCredentialsResponse(userId=", this.userId, ", jwt=***, callType=", this.callType, ")");
    }

    public VideoCallSessionResponse(String userId, String jwt, String callType) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(jwt, "jwt");
        AbstractC22676k.m65750j(callType, "callType");
        this.userId = userId;
        this.jwt = jwt;
        this.callType = callType;
    }
}
