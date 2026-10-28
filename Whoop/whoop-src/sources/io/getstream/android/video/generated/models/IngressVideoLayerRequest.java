package io.getstream.android.video.generated.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;", "", "bitrate", "", "codec", "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;", "frameRateLimit", "maxDimension", "minDimension", "(ILio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;III)V", "getBitrate", "()I", "getCodec", "()Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;", "getFrameRateLimit", "getMaxDimension", "getMinDimension", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "Codec", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class IngressVideoLayerRequest {
    private final int bitrate;
    private final Codec codec;
    private final int frameRateLimit;
    private final int maxDimension;
    private final int minDimension;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0005\b\t\n\u000b\fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "CodecAdapter", "Companion", "H264", "Unknown", "Vp8", "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec$H264;", "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec$Unknown;", "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec$Vp8;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Codec {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec$CodecAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class CodecAdapter extends JsonAdapter<Codec> {
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public Codec fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                String strNextString = reader.nextString();
                if (strNextString == null) {
                    return null;
                }
                return Codec.INSTANCE.fromString(strNextString);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, Codec value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.mo94362F0(value != null ? value.getValue() : null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Codec fromString(String s13) {
                AbstractC22676k.m65750j(s13, "s");
                if (s13.equals("h264")) {
                    return H264.INSTANCE;
                }
                return s13.equals("vp8") ? Vp8.INSTANCE : new Unknown(s13);
            }

            private Companion() {
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec$H264;", "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class H264 extends Codec {
            public static final H264 INSTANCE = new H264();

            private H264() {
                super("h264", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec$Unknown;", "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final /* data */ class Unknown extends Codec {
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

            @Override // io.getstream.android.video.generated.models.IngressVideoLayerRequest.Codec
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec$Vp8;", "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Vp8 extends Codec {
            public static final Vp8 INSTANCE = new Vp8();

            private Vp8() {
                super("vp8", null);
            }
        }

        public /* synthetic */ Codec(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }

        private Codec(String str) {
            this.value = str;
        }
    }

    public IngressVideoLayerRequest(@InterfaceC30731q(name = "bitrate") int i13, @InterfaceC30731q(name = "codec") Codec codec, @InterfaceC30731q(name = "frame_rate_limit") int i14, @InterfaceC30731q(name = "max_dimension") int i15, @InterfaceC30731q(name = "min_dimension") int i16) {
        AbstractC22676k.m65750j(codec, "codec");
        this.bitrate = i13;
        this.codec = codec;
        this.frameRateLimit = i14;
        this.maxDimension = i15;
        this.minDimension = i16;
    }

    public static /* synthetic */ IngressVideoLayerRequest copy$default(IngressVideoLayerRequest ingressVideoLayerRequest, int i13, Codec codec, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = ingressVideoLayerRequest.bitrate;
        }
        if ((i17 & 2) != 0) {
            codec = ingressVideoLayerRequest.codec;
        }
        if ((i17 & 4) != 0) {
            i14 = ingressVideoLayerRequest.frameRateLimit;
        }
        if ((i17 & 8) != 0) {
            i15 = ingressVideoLayerRequest.maxDimension;
        }
        if ((i17 & 16) != 0) {
            i16 = ingressVideoLayerRequest.minDimension;
        }
        int i18 = i16;
        int i19 = i14;
        return ingressVideoLayerRequest.copy(i13, codec, i19, i15, i18);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBitrate() {
        return this.bitrate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Codec getCodec() {
        return this.codec;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFrameRateLimit() {
        return this.frameRateLimit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxDimension() {
        return this.maxDimension;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMinDimension() {
        return this.minDimension;
    }

    public final IngressVideoLayerRequest copy(@InterfaceC30731q(name = "bitrate") int bitrate, @InterfaceC30731q(name = "codec") Codec codec, @InterfaceC30731q(name = "frame_rate_limit") int frameRateLimit, @InterfaceC30731q(name = "max_dimension") int maxDimension, @InterfaceC30731q(name = "min_dimension") int minDimension) {
        AbstractC22676k.m65750j(codec, "codec");
        return new IngressVideoLayerRequest(bitrate, codec, frameRateLimit, maxDimension, minDimension);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IngressVideoLayerRequest)) {
            return false;
        }
        IngressVideoLayerRequest ingressVideoLayerRequest = (IngressVideoLayerRequest) other;
        return this.bitrate == ingressVideoLayerRequest.bitrate && AbstractC22676k.m65745e(this.codec, ingressVideoLayerRequest.codec) && this.frameRateLimit == ingressVideoLayerRequest.frameRateLimit && this.maxDimension == ingressVideoLayerRequest.maxDimension && this.minDimension == ingressVideoLayerRequest.minDimension;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final Codec getCodec() {
        return this.codec;
    }

    public final int getFrameRateLimit() {
        return this.frameRateLimit;
    }

    public final int getMaxDimension() {
        return this.maxDimension;
    }

    public final int getMinDimension() {
        return this.minDimension;
    }

    public int hashCode() {
        return Integer.hashCode(this.minDimension) + AbstractC11266d.m30448b(this.maxDimension, AbstractC11266d.m30448b(this.frameRateLimit, (this.codec.hashCode() + (Integer.hashCode(this.bitrate) * 31)) * 31, 31), 31);
    }

    public String toString() {
        int i13 = this.bitrate;
        Codec codec = this.codec;
        int i14 = this.frameRateLimit;
        int i15 = this.maxDimension;
        int i16 = this.minDimension;
        StringBuilder sb4 = new StringBuilder("IngressVideoLayerRequest(bitrate=");
        sb4.append(i13);
        sb4.append(", codec=");
        sb4.append(codec);
        sb4.append(", frameRateLimit=");
        AbstractC30802r.m94773v(sb4, i14, ", maxDimension=", i15, ", minDimension=");
        return AbstractC18489d0.m53371l(sb4, i16, ")");
    }
}
