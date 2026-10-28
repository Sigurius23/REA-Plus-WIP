package io.getstream.video.android.core.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J:\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0018¨\u00062"}, m65681d2 = {"Lio/getstream/video/android/core/model/IceCandidate;", "", "", "sdpMid", "", "sdpMLineIndex", "candidate", "usernameFragment", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stream_video_android_core_release", "(Lio/getstream/video/android/core/model/IceCandidate;Lzc3/c;Lyc3/g;)V", "write$Self", "component1$stream_video_android_core_release", "()Ljava/lang/String;", "component1", "component2$stream_video_android_core_release", "()I", "component2", "component3$stream_video_android_core_release", "component3", "component4$stream_video_android_core_release", "component4", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lio/getstream/video/android/core/model/IceCandidate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSdpMid$stream_video_android_core_release", "I", "getSdpMLineIndex$stream_video_android_core_release", "getCandidate$stream_video_android_core_release", "getUsernameFragment$stream_video_android_core_release", "Companion", "$serializer", "io/getstream/video/android/core/model/a", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IceCandidate {
    public static final C19965a Companion = new C19965a();
    private final String candidate;
    private final int sdpMLineIndex;
    private final String sdpMid;
    private final String usernameFragment;

    @InterfaceC23457c
    public /* synthetic */ IceCandidate(int i13, String str, int i14, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, IceCandidate$$serializer.INSTANCE.getDescriptor());
        }
        this.sdpMid = str;
        this.sdpMLineIndex = i14;
        this.candidate = str2;
        this.usernameFragment = str3;
    }

    public static /* synthetic */ IceCandidate copy$default(IceCandidate iceCandidate, String str, int i13, String str2, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = iceCandidate.sdpMid;
        }
        if ((i14 & 2) != 0) {
            i13 = iceCandidate.sdpMLineIndex;
        }
        if ((i14 & 4) != 0) {
            str2 = iceCandidate.candidate;
        }
        if ((i14 & 8) != 0) {
            str3 = iceCandidate.usernameFragment;
        }
        return iceCandidate.copy(str, i13, str2, str3);
    }

    public static final /* synthetic */ void write$Self$stream_video_android_core_release(IceCandidate self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.sdpMid);
        output.encodeIntElement(serialDesc, 1, self.sdpMLineIndex);
        output.encodeStringElement(serialDesc, 2, self.candidate);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.usernameFragment);
    }

    /* JADX INFO: renamed from: component1$stream_video_android_core_release, reason: from getter */
    public final String getSdpMid() {
        return this.sdpMid;
    }

    /* JADX INFO: renamed from: component2$stream_video_android_core_release, reason: from getter */
    public final int getSdpMLineIndex() {
        return this.sdpMLineIndex;
    }

    /* JADX INFO: renamed from: component3$stream_video_android_core_release, reason: from getter */
    public final String getCandidate() {
        return this.candidate;
    }

    /* JADX INFO: renamed from: component4$stream_video_android_core_release, reason: from getter */
    public final String getUsernameFragment() {
        return this.usernameFragment;
    }

    public final IceCandidate copy(String sdpMid, int sdpMLineIndex, String candidate, String usernameFragment) {
        AbstractC22676k.m65750j(sdpMid, "sdpMid");
        AbstractC22676k.m65750j(candidate, "candidate");
        return new IceCandidate(sdpMid, sdpMLineIndex, candidate, usernameFragment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IceCandidate)) {
            return false;
        }
        IceCandidate iceCandidate = (IceCandidate) other;
        return AbstractC22676k.m65745e(this.sdpMid, iceCandidate.sdpMid) && this.sdpMLineIndex == iceCandidate.sdpMLineIndex && AbstractC22676k.m65745e(this.candidate, iceCandidate.candidate) && AbstractC22676k.m65745e(this.usernameFragment, iceCandidate.usernameFragment);
    }

    public final String getCandidate$stream_video_android_core_release() {
        return this.candidate;
    }

    public final int getSdpMLineIndex$stream_video_android_core_release() {
        return this.sdpMLineIndex;
    }

    public final String getSdpMid$stream_video_android_core_release() {
        return this.sdpMid;
    }

    public final String getUsernameFragment$stream_video_android_core_release() {
        return this.usernameFragment;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.sdpMLineIndex, this.sdpMid.hashCode() * 31, 31), 31, this.candidate);
        String str = this.usernameFragment;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.sdpMid;
        int i13 = this.sdpMLineIndex;
        return AbstractC11266d.m30464r(AbstractC11266d.m30467u(i13, "IceCandidate(sdpMid=", str, ", sdpMLineIndex=", ", candidate="), this.candidate, ", usernameFragment=", this.usernameFragment, ")");
    }

    public IceCandidate(String sdpMid, int i13, String candidate, String str) {
        AbstractC22676k.m65750j(sdpMid, "sdpMid");
        AbstractC22676k.m65750j(candidate, "candidate");
        this.sdpMid = sdpMid;
        this.sdpMLineIndex = i13;
        this.candidate = candidate;
        this.usernameFragment = str;
    }
}
