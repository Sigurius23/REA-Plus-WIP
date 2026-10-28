package io.getstream.video.android.core.socket;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, m65681d2 = {"Lio/getstream/video/android/core/socket/SocketError;", "", "Lio/getstream/video/android/core/socket/ErrorResponse;", "error", "<init>", "(Lio/getstream/video/android/core/socket/ErrorResponse;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILio/getstream/video/android/core/socket/ErrorResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stream_video_android_core_release", "(Lio/getstream/video/android/core/socket/SocketError;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lio/getstream/video/android/core/socket/ErrorResponse;", "copy", "(Lio/getstream/video/android/core/socket/ErrorResponse;)Lio/getstream/video/android/core/socket/SocketError;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/getstream/video/android/core/socket/ErrorResponse;", "getError", "Companion", "$serializer", "io/getstream/video/android/core/socket/b", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SocketError {
    public static final C19968b Companion = new C19968b();
    private final ErrorResponse error;

    @InterfaceC23457c
    public /* synthetic */ SocketError(int i13, ErrorResponse errorResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, SocketError$$serializer.INSTANCE.getDescriptor());
        }
        this.error = errorResponse;
    }

    public static /* synthetic */ SocketError copy$default(SocketError socketError, ErrorResponse errorResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            errorResponse = socketError.error;
        }
        return socketError.copy(errorResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ErrorResponse getError() {
        return this.error;
    }

    public final SocketError copy(ErrorResponse error) {
        AbstractC22676k.m65750j(error, "error");
        return new SocketError(error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SocketError) && AbstractC22676k.m65745e(this.error, ((SocketError) other).error);
    }

    public final ErrorResponse getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        return "SocketError(error=" + this.error + ")";
    }

    public SocketError(ErrorResponse error) {
        AbstractC22676k.m65750j(error, "error");
        this.error = error;
    }
}
