package com.whoop.videocall.api;

import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006)"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallParticipantsModel;", "", "Lcom/whoop/videocall/api/VideoCallParticipantModel;", "localParticipant", "primaryRemoteParticipant", "<init>", "(Lcom/whoop/videocall/api/VideoCallParticipantModel;Lcom/whoop/videocall/api/VideoCallParticipantModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/videocall/api/VideoCallParticipantModel;Lcom/whoop/videocall/api/VideoCallParticipantModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$video_call_release", "(Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/videocall/api/VideoCallParticipantModel;", "component2", "copy", "(Lcom/whoop/videocall/api/VideoCallParticipantModel;Lcom/whoop/videocall/api/VideoCallParticipantModel;)Lcom/whoop/videocall/api/VideoCallParticipantsModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/videocall/api/VideoCallParticipantModel;", "getLocalParticipant", "getPrimaryRemoteParticipant", "Companion", "$serializer", "a", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VideoCallParticipantsModel {
    private final VideoCallParticipantModel localParticipant;
    private final VideoCallParticipantModel primaryRemoteParticipant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ImageUrlModel.$stable;

    /* JADX INFO: renamed from: com.whoop.videocall.api.VideoCallParticipantsModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallParticipantsModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/videocall/api/VideoCallParticipantsModel;", "serializer", "()Lwc3/c;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VideoCallParticipantsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoCallParticipantsModel(int i13, VideoCallParticipantModel videoCallParticipantModel, VideoCallParticipantModel videoCallParticipantModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, VideoCallParticipantsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.localParticipant = videoCallParticipantModel;
        this.primaryRemoteParticipant = videoCallParticipantModel2;
    }

    public static /* synthetic */ VideoCallParticipantsModel copy$default(VideoCallParticipantsModel videoCallParticipantsModel, VideoCallParticipantModel videoCallParticipantModel, VideoCallParticipantModel videoCallParticipantModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            videoCallParticipantModel = videoCallParticipantsModel.localParticipant;
        }
        if ((i13 & 2) != 0) {
            videoCallParticipantModel2 = videoCallParticipantsModel.primaryRemoteParticipant;
        }
        return videoCallParticipantsModel.copy(videoCallParticipantModel, videoCallParticipantModel2);
    }

    public static final /* synthetic */ void write$Self$video_call_release(VideoCallParticipantsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        VideoCallParticipantModel$$serializer videoCallParticipantModel$$serializer = VideoCallParticipantModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, videoCallParticipantModel$$serializer, self.localParticipant);
        output.encodeSerializableElement(serialDesc, 1, videoCallParticipantModel$$serializer, self.primaryRemoteParticipant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VideoCallParticipantModel getLocalParticipant() {
        return this.localParticipant;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoCallParticipantModel getPrimaryRemoteParticipant() {
        return this.primaryRemoteParticipant;
    }

    public final VideoCallParticipantsModel copy(VideoCallParticipantModel localParticipant, VideoCallParticipantModel primaryRemoteParticipant) {
        AbstractC22676k.m65750j(localParticipant, "localParticipant");
        AbstractC22676k.m65750j(primaryRemoteParticipant, "primaryRemoteParticipant");
        return new VideoCallParticipantsModel(localParticipant, primaryRemoteParticipant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCallParticipantsModel)) {
            return false;
        }
        VideoCallParticipantsModel videoCallParticipantsModel = (VideoCallParticipantsModel) other;
        return AbstractC22676k.m65745e(this.localParticipant, videoCallParticipantsModel.localParticipant) && AbstractC22676k.m65745e(this.primaryRemoteParticipant, videoCallParticipantsModel.primaryRemoteParticipant);
    }

    public final VideoCallParticipantModel getLocalParticipant() {
        return this.localParticipant;
    }

    public final VideoCallParticipantModel getPrimaryRemoteParticipant() {
        return this.primaryRemoteParticipant;
    }

    public int hashCode() {
        return this.primaryRemoteParticipant.hashCode() + (this.localParticipant.hashCode() * 31);
    }

    public String toString() {
        return "VideoCallParticipantsModel(localParticipant=" + this.localParticipant + ", primaryRemoteParticipant=" + this.primaryRemoteParticipant + ")";
    }

    public VideoCallParticipantsModel(VideoCallParticipantModel localParticipant, VideoCallParticipantModel primaryRemoteParticipant) {
        AbstractC22676k.m65750j(localParticipant, "localParticipant");
        AbstractC22676k.m65750j(primaryRemoteParticipant, "primaryRemoteParticipant");
        this.localParticipant = localParticipant;
        this.primaryRemoteParticipant = primaryRemoteParticipant;
    }
}
