package io.getstream.android.video.generated.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import p088dc.AbstractC11895b;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m65681d2 = {"Lio/getstream/android/video/generated/models/VideoSettingsRequest;", "", "accessRequestEnabled", "", "cameraDefaultOn", "cameraFacing", "Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;", "enabled", "targetResolution", "Lio/getstream/android/video/generated/models/TargetResolution;", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;)V", "getAccessRequestEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCameraDefaultOn", "getCameraFacing", "()Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;", "getEnabled", "getTargetResolution", "()Lio/getstream/android/video/generated/models/TargetResolution;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;)Lio/getstream/android/video/generated/models/VideoSettingsRequest;", "equals", "other", "hashCode", "", "toString", "", "CameraFacing", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class VideoSettingsRequest {
    private final Boolean accessRequestEnabled;
    private final Boolean cameraDefaultOn;
    private final CameraFacing cameraFacing;
    private final Boolean enabled;
    private final TargetResolution targetResolution;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Back", "CameraFacingAdapter", "Companion", "External", "Front", "Unknown", "Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$Back;", "Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$External;", "Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$Front;", "Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class CameraFacing {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$Back;", "Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Back extends CameraFacing {
            public static final Back INSTANCE = new Back();

            private Back() {
                super("back", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$CameraFacingAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class CameraFacingAdapter extends JsonAdapter<CameraFacing> {
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public CameraFacing fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                String strNextString = reader.nextString();
                if (strNextString == null) {
                    return null;
                }
                return CameraFacing.INSTANCE.fromString(strNextString);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, CameraFacing value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.mo94362F0(value != null ? value.getValue() : null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CameraFacing fromString(String s13) {
                AbstractC22676k.m65750j(s13, "s");
                int iHashCode = s13.hashCode();
                if (iHashCode != -1820761141) {
                    if (iHashCode != 3015911) {
                        if (iHashCode == 97705513 && s13.equals("front")) {
                            return Front.INSTANCE;
                        }
                    } else if (s13.equals("back")) {
                        return Back.INSTANCE;
                    }
                } else if (s13.equals("external")) {
                    return External.INSTANCE;
                }
                return new Unknown(s13);
            }

            private Companion() {
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$External;", "Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class External extends CameraFacing {
            public static final External INSTANCE = new External();

            private External() {
                super("external", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$Front;", "Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Front extends CameraFacing {
            public static final Front INSTANCE = new Front();

            private Front() {
                super("front", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$Unknown;", "Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final /* data */ class Unknown extends CameraFacing {
            private final String unknownValue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unknown(String unknownValue) {
                super(unknownValue, null);
                AbstractC22676k.m65750j(unknownValue, "unknownValue");
                this.unknownValue = unknownValue;
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = unknown.unknownValue;
                }
                return unknown.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUnknownValue() {
                return this.unknownValue;
            }

            public final Unknown copy(String unknownValue) {
                AbstractC22676k.m65750j(unknownValue, "unknownValue");
                return new Unknown(unknownValue);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unknown) && AbstractC22676k.m65745e(this.unknownValue, ((Unknown) other).unknownValue);
            }

            public final String getUnknownValue() {
                return this.unknownValue;
            }

            public int hashCode() {
                return this.unknownValue.hashCode();
            }

            @Override // io.getstream.android.video.generated.models.VideoSettingsRequest.CameraFacing
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        public /* synthetic */ CameraFacing(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }

        private CameraFacing(String str) {
            this.value = str;
        }
    }

    public VideoSettingsRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ VideoSettingsRequest copy$default(VideoSettingsRequest videoSettingsRequest, Boolean bool, Boolean bool2, CameraFacing cameraFacing, Boolean bool3, TargetResolution targetResolution, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = videoSettingsRequest.accessRequestEnabled;
        }
        if ((i13 & 2) != 0) {
            bool2 = videoSettingsRequest.cameraDefaultOn;
        }
        if ((i13 & 4) != 0) {
            cameraFacing = videoSettingsRequest.cameraFacing;
        }
        if ((i13 & 8) != 0) {
            bool3 = videoSettingsRequest.enabled;
        }
        if ((i13 & 16) != 0) {
            targetResolution = videoSettingsRequest.targetResolution;
        }
        TargetResolution targetResolution2 = targetResolution;
        CameraFacing cameraFacing2 = cameraFacing;
        return videoSettingsRequest.copy(bool, bool2, cameraFacing2, bool3, targetResolution2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAccessRequestEnabled() {
        return this.accessRequestEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCameraDefaultOn() {
        return this.cameraDefaultOn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CameraFacing getCameraFacing() {
        return this.cameraFacing;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TargetResolution getTargetResolution() {
        return this.targetResolution;
    }

    public final VideoSettingsRequest copy(@InterfaceC30731q(name = "access_request_enabled") Boolean accessRequestEnabled, @InterfaceC30731q(name = "camera_default_on") Boolean cameraDefaultOn, @InterfaceC30731q(name = "camera_facing") CameraFacing cameraFacing, @InterfaceC30731q(name = "enabled") Boolean enabled, @InterfaceC30731q(name = "target_resolution") TargetResolution targetResolution) {
        return new VideoSettingsRequest(accessRequestEnabled, cameraDefaultOn, cameraFacing, enabled, targetResolution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSettingsRequest)) {
            return false;
        }
        VideoSettingsRequest videoSettingsRequest = (VideoSettingsRequest) other;
        return AbstractC22676k.m65745e(this.accessRequestEnabled, videoSettingsRequest.accessRequestEnabled) && AbstractC22676k.m65745e(this.cameraDefaultOn, videoSettingsRequest.cameraDefaultOn) && AbstractC22676k.m65745e(this.cameraFacing, videoSettingsRequest.cameraFacing) && AbstractC22676k.m65745e(this.enabled, videoSettingsRequest.enabled) && AbstractC22676k.m65745e(this.targetResolution, videoSettingsRequest.targetResolution);
    }

    public final Boolean getAccessRequestEnabled() {
        return this.accessRequestEnabled;
    }

    public final Boolean getCameraDefaultOn() {
        return this.cameraDefaultOn;
    }

    public final CameraFacing getCameraFacing() {
        return this.cameraFacing;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final TargetResolution getTargetResolution() {
        return this.targetResolution;
    }

    public int hashCode() {
        Boolean bool = this.accessRequestEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.cameraDefaultOn;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CameraFacing cameraFacing = this.cameraFacing;
        int iHashCode3 = (iHashCode2 + (cameraFacing == null ? 0 : cameraFacing.hashCode())) * 31;
        Boolean bool3 = this.enabled;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        TargetResolution targetResolution = this.targetResolution;
        return iHashCode4 + (targetResolution != null ? targetResolution.hashCode() : 0);
    }

    public String toString() {
        return "VideoSettingsRequest(accessRequestEnabled=" + this.accessRequestEnabled + ", cameraDefaultOn=" + this.cameraDefaultOn + ", cameraFacing=" + this.cameraFacing + ", enabled=" + this.enabled + ", targetResolution=" + this.targetResolution + ")";
    }

    public VideoSettingsRequest(@InterfaceC30731q(name = "access_request_enabled") Boolean bool, @InterfaceC30731q(name = "camera_default_on") Boolean bool2, @InterfaceC30731q(name = "camera_facing") CameraFacing cameraFacing, @InterfaceC30731q(name = "enabled") Boolean bool3, @InterfaceC30731q(name = "target_resolution") TargetResolution targetResolution) {
        this.accessRequestEnabled = bool;
        this.cameraDefaultOn = bool2;
        this.cameraFacing = cameraFacing;
        this.enabled = bool3;
        this.targetResolution = targetResolution;
    }

    public /* synthetic */ VideoSettingsRequest(Boolean bool, Boolean bool2, CameraFacing cameraFacing, Boolean bool3, TargetResolution targetResolution, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : bool2, (i13 & 4) != 0 ? null : cameraFacing, (i13 & 8) != 0 ? null : bool3, (i13 & 16) != 0 ? null : targetResolution);
    }
}
