package com.whoop.videocall.api;

import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.ImageUrlModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallParticipantModel;", "", "", "id", "firstName", "lastName", "displayName", "Lcom/whoop/design/models/items/ImageUrlModel;", "profileImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$video_call_release", "(Lcom/whoop/videocall/api/VideoCallParticipantModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/ImageUrlModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;)Lcom/whoop/videocall/api/VideoCallParticipantModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getFirstName", "getLastName", "getDisplayName", "Lcom/whoop/design/models/items/ImageUrlModel;", "getProfileImage", "Companion", "$serializer", "a", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VideoCallParticipantModel {
    private final String displayName;
    private final String firstName;
    private final String id;
    private final String lastName;
    private final ImageUrlModel profileImage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ImageUrlModel.$stable;

    /* JADX INFO: renamed from: com.whoop.videocall.api.VideoCallParticipantModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallParticipantModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/videocall/api/VideoCallParticipantModel;", "serializer", "()Lwc3/c;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VideoCallParticipantModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoCallParticipantModel(int i13, String str, String str2, String str3, String str4, ImageUrlModel imageUrlModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, VideoCallParticipantModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.firstName = str2;
        this.lastName = str3;
        this.displayName = str4;
        this.profileImage = imageUrlModel;
    }

    public static /* synthetic */ VideoCallParticipantModel copy$default(VideoCallParticipantModel videoCallParticipantModel, String str, String str2, String str3, String str4, ImageUrlModel imageUrlModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoCallParticipantModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = videoCallParticipantModel.firstName;
        }
        if ((i13 & 4) != 0) {
            str3 = videoCallParticipantModel.lastName;
        }
        if ((i13 & 8) != 0) {
            str4 = videoCallParticipantModel.displayName;
        }
        if ((i13 & 16) != 0) {
            imageUrlModel = videoCallParticipantModel.profileImage;
        }
        ImageUrlModel imageUrlModel2 = imageUrlModel;
        String str5 = str3;
        return videoCallParticipantModel.copy(str, str2, str5, str4, imageUrlModel2);
    }

    public static final /* synthetic */ void write$Self$video_call_release(VideoCallParticipantModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.firstName);
        output.encodeStringElement(serialDesc, 2, self.lastName);
        output.encodeStringElement(serialDesc, 3, self.displayName);
        output.encodeNullableSerializableElement(serialDesc, 4, ImageUrlModel$$serializer.INSTANCE, self.profileImage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ImageUrlModel getProfileImage() {
        return this.profileImage;
    }

    public final VideoCallParticipantModel copy(String id4, String firstName, String lastName, String displayName, ImageUrlModel profileImage) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(displayName, "displayName");
        return new VideoCallParticipantModel(id4, firstName, lastName, displayName, profileImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCallParticipantModel)) {
            return false;
        }
        VideoCallParticipantModel videoCallParticipantModel = (VideoCallParticipantModel) other;
        return AbstractC22676k.m65745e(this.id, videoCallParticipantModel.id) && AbstractC22676k.m65745e(this.firstName, videoCallParticipantModel.firstName) && AbstractC22676k.m65745e(this.lastName, videoCallParticipantModel.lastName) && AbstractC22676k.m65745e(this.displayName, videoCallParticipantModel.displayName) && AbstractC22676k.m65745e(this.profileImage, videoCallParticipantModel.profileImage);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final ImageUrlModel getProfileImage() {
        return this.profileImage;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.firstName), 31, this.lastName), 31, this.displayName);
        ImageUrlModel imageUrlModel = this.profileImage;
        return iM30450d + (imageUrlModel == null ? 0 : imageUrlModel.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.displayName;
        ImageUrlModel imageUrlModel = this.profileImage;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("VideoCallParticipantModel(id=", str, ", firstName=", str2, ", lastName=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", displayName=", str4, ", profileImage=");
        sbM32001t.append(imageUrlModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public VideoCallParticipantModel(String id4, String firstName, String lastName, String displayName, ImageUrlModel imageUrlModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(displayName, "displayName");
        this.id = id4;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.profileImage = imageUrlModel;
    }
}
