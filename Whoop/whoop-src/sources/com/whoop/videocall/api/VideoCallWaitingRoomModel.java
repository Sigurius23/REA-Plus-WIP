package com.whoop.videocall.api;

import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationBarModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u001b¨\u00060"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;", "", "Lcom/whoop/design/models/items/NavigationBarModel;", "navigationBar", "", "header", "description", "primaryButtonTitle", "<init>", "(Lcom/whoop/design/models/items/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$video_call_release", "(Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/NavigationBarModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/whoop/design/models/items/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/NavigationBarModel;", "getNavigationBar", "Ljava/lang/String;", "getHeader", "getDescription", "getPrimaryButtonTitle", "Companion", "$serializer", "a", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VideoCallWaitingRoomModel {
    private final String description;
    private final String header;
    private final NavigationBarModel navigationBar;
    private final String primaryButtonTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = NavigationBarModel.$stable;

    /* JADX INFO: renamed from: com.whoop.videocall.api.VideoCallWaitingRoomModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallWaitingRoomModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;", "serializer", "()Lwc3/c;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VideoCallWaitingRoomModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoCallWaitingRoomModel(int i13, NavigationBarModel navigationBarModel, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, VideoCallWaitingRoomModel$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBar = navigationBarModel;
        this.header = str;
        this.description = str2;
        this.primaryButtonTitle = str3;
    }

    public static /* synthetic */ VideoCallWaitingRoomModel copy$default(VideoCallWaitingRoomModel videoCallWaitingRoomModel, NavigationBarModel navigationBarModel, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBarModel = videoCallWaitingRoomModel.navigationBar;
        }
        if ((i13 & 2) != 0) {
            str = videoCallWaitingRoomModel.header;
        }
        if ((i13 & 4) != 0) {
            str2 = videoCallWaitingRoomModel.description;
        }
        if ((i13 & 8) != 0) {
            str3 = videoCallWaitingRoomModel.primaryButtonTitle;
        }
        return videoCallWaitingRoomModel.copy(navigationBarModel, str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$video_call_release(VideoCallWaitingRoomModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeStringElement(serialDesc, 1, self.header);
        output.encodeStringElement(serialDesc, 2, self.description);
        output.encodeStringElement(serialDesc, 3, self.primaryButtonTitle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    public final VideoCallWaitingRoomModel copy(NavigationBarModel navigationBar, String header, String description, String primaryButtonTitle) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(primaryButtonTitle, "primaryButtonTitle");
        return new VideoCallWaitingRoomModel(navigationBar, header, description, primaryButtonTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCallWaitingRoomModel)) {
            return false;
        }
        VideoCallWaitingRoomModel videoCallWaitingRoomModel = (VideoCallWaitingRoomModel) other;
        return AbstractC22676k.m65745e(this.navigationBar, videoCallWaitingRoomModel.navigationBar) && AbstractC22676k.m65745e(this.header, videoCallWaitingRoomModel.header) && AbstractC22676k.m65745e(this.description, videoCallWaitingRoomModel.description) && AbstractC22676k.m65745e(this.primaryButtonTitle, videoCallWaitingRoomModel.primaryButtonTitle);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHeader() {
        return this.header;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    public int hashCode() {
        return this.primaryButtonTitle.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationBar.hashCode() * 31, 31, this.header), 31, this.description);
    }

    public String toString() {
        NavigationBarModel navigationBarModel = this.navigationBar;
        String str = this.header;
        String str2 = this.description;
        String str3 = this.primaryButtonTitle;
        StringBuilder sb4 = new StringBuilder("VideoCallWaitingRoomModel(navigationBar=");
        sb4.append(navigationBarModel);
        sb4.append(", header=");
        sb4.append(str);
        sb4.append(", description=");
        return AbstractC11266d.m30464r(sb4, str2, ", primaryButtonTitle=", str3, ")");
    }

    public VideoCallWaitingRoomModel(NavigationBarModel navigationBar, String header, String description, String primaryButtonTitle) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(primaryButtonTitle, "primaryButtonTitle");
        this.navigationBar = navigationBar;
        this.header = header;
        this.description = description;
        this.primaryButtonTitle = primaryButtonTitle;
    }
}
