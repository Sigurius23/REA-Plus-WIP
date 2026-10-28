package io.getstream.android.video.generated.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserSessionDto;
import d13.AbstractC11478a;
import p088dc.AbstractC11895b;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;", "", "bitrate", "", "channels", "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;", "enableDtx", "", "(ILio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;Ljava/lang/Boolean;)V", "getBitrate", "()I", "getChannels", "()Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;", "getEnableDtx", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(ILio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;", "equals", "other", "hashCode", "toString", "", "Channels", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class IngressAudioEncodingOptionsRequest {
    private final int bitrate;
    private final Channels channels;
    private final Boolean enableDtx;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0005\b\t\n\u000b\fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Channels1", "Channels2", "ChannelsAdapter", "Companion", "Unknown", "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels$Channels1;", "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels$Channels2;", "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Channels {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels$Channels1;", "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Channels1 extends Channels {
            public static final Channels1 INSTANCE = new Channels1();

            private Channels1() {
                super(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels$Channels2;", "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Channels2 extends Channels {
            public static final Channels2 INSTANCE = new Channels2();

            private Channels2() {
                super("2", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels$ChannelsAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class ChannelsAdapter extends JsonAdapter<Channels> {
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public Channels fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                String strNextString = reader.nextString();
                if (strNextString == null) {
                    return null;
                }
                return Channels.INSTANCE.fromString(strNextString);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, Channels value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.mo94362F0(value != null ? value.getValue() : null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Channels fromString(String s13) {
                AbstractC22676k.m65750j(s13, "s");
                if (s13.equals(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE)) {
                    return Channels1.INSTANCE;
                }
                return s13.equals("2") ? Channels2.INSTANCE : new Unknown(s13);
            }

            private Companion() {
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels$Unknown;", "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final /* data */ class Unknown extends Channels {
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

            @Override // io.getstream.android.video.generated.models.IngressAudioEncodingOptionsRequest.Channels
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        public /* synthetic */ Channels(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }

        private Channels(String str) {
            this.value = str;
        }
    }

    public IngressAudioEncodingOptionsRequest(@InterfaceC30731q(name = "bitrate") int i13, @InterfaceC30731q(name = "channels") Channels channels, @InterfaceC30731q(name = "enable_dtx") Boolean bool) {
        AbstractC22676k.m65750j(channels, "channels");
        this.bitrate = i13;
        this.channels = channels;
        this.enableDtx = bool;
    }

    public static /* synthetic */ IngressAudioEncodingOptionsRequest copy$default(IngressAudioEncodingOptionsRequest ingressAudioEncodingOptionsRequest, int i13, Channels channels, Boolean bool, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = ingressAudioEncodingOptionsRequest.bitrate;
        }
        if ((i14 & 2) != 0) {
            channels = ingressAudioEncodingOptionsRequest.channels;
        }
        if ((i14 & 4) != 0) {
            bool = ingressAudioEncodingOptionsRequest.enableDtx;
        }
        return ingressAudioEncodingOptionsRequest.copy(i13, channels, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBitrate() {
        return this.bitrate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Channels getChannels() {
        return this.channels;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getEnableDtx() {
        return this.enableDtx;
    }

    public final IngressAudioEncodingOptionsRequest copy(@InterfaceC30731q(name = "bitrate") int bitrate, @InterfaceC30731q(name = "channels") Channels channels, @InterfaceC30731q(name = "enable_dtx") Boolean enableDtx) {
        AbstractC22676k.m65750j(channels, "channels");
        return new IngressAudioEncodingOptionsRequest(bitrate, channels, enableDtx);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IngressAudioEncodingOptionsRequest)) {
            return false;
        }
        IngressAudioEncodingOptionsRequest ingressAudioEncodingOptionsRequest = (IngressAudioEncodingOptionsRequest) other;
        return this.bitrate == ingressAudioEncodingOptionsRequest.bitrate && AbstractC22676k.m65745e(this.channels, ingressAudioEncodingOptionsRequest.channels) && AbstractC22676k.m65745e(this.enableDtx, ingressAudioEncodingOptionsRequest.enableDtx);
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final Channels getChannels() {
        return this.channels;
    }

    public final Boolean getEnableDtx() {
        return this.enableDtx;
    }

    public int hashCode() {
        int iHashCode = (this.channels.hashCode() + (Integer.hashCode(this.bitrate) * 31)) * 31;
        Boolean bool = this.enableDtx;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        int i13 = this.bitrate;
        Channels channels = this.channels;
        Boolean bool = this.enableDtx;
        StringBuilder sb4 = new StringBuilder("IngressAudioEncodingOptionsRequest(bitrate=");
        sb4.append(i13);
        sb4.append(", channels=");
        sb4.append(channels);
        sb4.append(", enableDtx=");
        return AbstractC11478a.m30858j(sb4, bool, ")");
    }

    public /* synthetic */ IngressAudioEncodingOptionsRequest(int i13, Channels channels, Boolean bool, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, channels, (i14 & 4) != 0 ? null : bool);
    }
}
