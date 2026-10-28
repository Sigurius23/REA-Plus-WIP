package stream.video.sfu.event;

import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.C5587r;
import com.squareup.wire.C5588s;
import com.squareup.wire.C5591v;
import com.squareup.wire.EnumC5573d;
import com.squareup.wire.EnumC5593x;
import com.squareup.wire.EnumC5595z;
import com.squareup.wire.InterfaceC5570a0;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import stream.video.sfu.models.Codec;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001a\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BY\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ_\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b-\u0010\u001c¨\u0006/"}, m65681d2 = {"Lstream/video/sfu/event/VideoLayerSetting;", "Lcom/squareup/wire/l;", "", "", "name", "", "active", "", "max_bitrate", "", "scale_resolution_down_by", "Lstream/video/sfu/models/Codec;", "codec", "max_framerate", "scalability_mode", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;ZIFLstream/video/sfu/models/Codec;ILjava/lang/String;Lne3/l;)Lstream/video/sfu/event/VideoLayerSetting;", "Ljava/lang/String;", "getName", "Z", "getActive", "()Z", "I", "getMax_bitrate", "F", "getScale_resolution_down_by", "()F", "Lstream/video/sfu/models/Codec;", "getCodec", "()Lstream/video/sfu/models/Codec;", "getMax_framerate", "getScalability_mode", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class VideoLayerSetting extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = EnumC5595z.f22132F, tag = 2)
    private final boolean active;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Codec#ADAPTER", label = EnumC5595z.f22132F, tag = 6)
    private final Codec codec;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxBitrate", label = EnumC5595z.f22132F, tag = 3)
    private final int max_bitrate;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "maxFramerate", label = EnumC5595z.f22132F, tag = 7)
    private final int max_framerate;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 1)
    private final String name;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "scalabilityMode", label = EnumC5595z.f22132F, tag = 8)
    private final String scalability_mode;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "scaleResolutionDownBy", label = EnumC5595z.f22132F, tag = 4)
    private final float scale_resolution_down_by;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(VideoLayerSetting.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.VideoLayerSetting$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public VideoLayerSetting decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                Object objDecode2 = null;
                boolean zBooleanValue = false;
                int iIntValue = 0;
                int iIntValue2 = 0;
                float fFloatValue = 0.0f;
                Object objDecode3 = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new VideoLayerSetting((String) objDecode, zBooleanValue, iIntValue, fFloatValue, (Codec) objDecode2, iIntValue2, (String) objDecode3, reader.m16808e(jM16807d));
                    }
                    switch (iM16810g) {
                        case 1:
                            objDecode = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 2:
                            zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                            break;
                        case 3:
                            iIntValue = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                            break;
                        case 4:
                            fFloatValue = ((Number) AbstractC5586q.FLOAT.decode(reader)).floatValue();
                            break;
                        case 5:
                        default:
                            reader.m16813j(iM16810g);
                            break;
                        case 6:
                            objDecode2 = Codec.ADAPTER.decode(reader);
                            break;
                        case 7:
                            iIntValue2 = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                            break;
                        case 8:
                            objDecode3 = AbstractC5586q.STRING.decode(reader);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(VideoLayerSetting value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getName(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getName());
                }
                if (value.getActive()) {
                    iMo79253d += AbstractC5586q.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getActive()));
                }
                if (value.getMax_bitrate() != 0) {
                    iMo79253d += AbstractC5586q.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getMax_bitrate()));
                }
                if (!Float.valueOf(value.getScale_resolution_down_by()).equals(Float.valueOf(0.0f))) {
                    iMo79253d += AbstractC5586q.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getScale_resolution_down_by()));
                }
                if (value.getCodec() != null) {
                    iMo79253d += Codec.ADAPTER.encodedSizeWithTag(6, value.getCodec());
                }
                if (value.getMax_framerate() != 0) {
                    iMo79253d += AbstractC5586q.UINT32.encodedSizeWithTag(7, Integer.valueOf(value.getMax_framerate()));
                }
                return !AbstractC22676k.m65745e(value.getScalability_mode(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(8, value.getScalability_mode()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public VideoLayerSetting redact(VideoLayerSetting value) {
                AbstractC22676k.m65750j(value, "value");
                Codec codec = value.getCodec();
                return VideoLayerSetting.copy$default(value, null, false, 0, 0.0f, codec != null ? (Codec) Codec.ADAPTER.redact(codec) : null, 0, null, C26624l.f105881E, 111, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, VideoLayerSetting value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getName(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getName());
                }
                if (value.getActive()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getActive()));
                }
                if (value.getMax_bitrate() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getMax_bitrate()));
                }
                if (!Float.valueOf(value.getScale_resolution_down_by()).equals(Float.valueOf(0.0f))) {
                    AbstractC5586q.FLOAT.encodeWithTag(writer, 4, Float.valueOf(value.getScale_resolution_down_by()));
                }
                if (value.getCodec() != null) {
                    Codec.ADAPTER.encodeWithTag(writer, 6, value.getCodec());
                }
                if (value.getMax_framerate() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 7, Integer.valueOf(value.getMax_framerate()));
                }
                if (!AbstractC22676k.m65745e(value.getScalability_mode(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 8, value.getScalability_mode());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, VideoLayerSetting value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (!AbstractC22676k.m65745e(value.getScalability_mode(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 8, value.getScalability_mode());
                }
                if (value.getMax_framerate() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 7, Integer.valueOf(value.getMax_framerate()));
                }
                if (value.getCodec() != null) {
                    Codec.ADAPTER.encodeWithTag(writer, 6, value.getCodec());
                }
                if (!Float.valueOf(value.getScale_resolution_down_by()).equals(Float.valueOf(0.0f))) {
                    AbstractC5586q.FLOAT.encodeWithTag(writer, 4, Float.valueOf(value.getScale_resolution_down_by()));
                }
                if (value.getMax_bitrate() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getMax_bitrate()));
                }
                if (value.getActive()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getActive()));
                }
                if (AbstractC22676k.m65745e(value.getName(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getName());
            }
        };
    }

    public VideoLayerSetting() {
        this(null, false, 0, 0.0f, null, 0, null, null, 255, null);
    }

    public static /* synthetic */ VideoLayerSetting copy$default(VideoLayerSetting videoLayerSetting, String str, boolean z4, int i13, float f13, Codec codec, int i14, String str2, C26624l c26624l, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = videoLayerSetting.name;
        }
        if ((i15 & 2) != 0) {
            z4 = videoLayerSetting.active;
        }
        if ((i15 & 4) != 0) {
            i13 = videoLayerSetting.max_bitrate;
        }
        if ((i15 & 8) != 0) {
            f13 = videoLayerSetting.scale_resolution_down_by;
        }
        if ((i15 & 16) != 0) {
            codec = videoLayerSetting.codec;
        }
        if ((i15 & 32) != 0) {
            i14 = videoLayerSetting.max_framerate;
        }
        if ((i15 & 64) != 0) {
            str2 = videoLayerSetting.scalability_mode;
        }
        if ((i15 & 128) != 0) {
            c26624l = videoLayerSetting.unknownFields();
        }
        String str3 = str2;
        C26624l c26624l2 = c26624l;
        Codec codec2 = codec;
        int i16 = i14;
        return videoLayerSetting.copy(str, z4, i13, f13, codec2, i16, str3, c26624l2);
    }

    public final VideoLayerSetting copy(String name, boolean active, int max_bitrate, float scale_resolution_down_by, Codec codec, int max_framerate, String scalability_mode, C26624l unknownFields) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(scalability_mode, "scalability_mode");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new VideoLayerSetting(name, active, max_bitrate, scale_resolution_down_by, codec, max_framerate, scalability_mode, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof VideoLayerSetting)) {
            return false;
        }
        VideoLayerSetting videoLayerSetting = (VideoLayerSetting) other;
        return AbstractC22676k.m65745e(unknownFields(), videoLayerSetting.unknownFields()) && AbstractC22676k.m65745e(this.name, videoLayerSetting.name) && this.active == videoLayerSetting.active && this.max_bitrate == videoLayerSetting.max_bitrate && this.scale_resolution_down_by == videoLayerSetting.scale_resolution_down_by && AbstractC22676k.m65745e(this.codec, videoLayerSetting.codec) && this.max_framerate == videoLayerSetting.max_framerate && AbstractC22676k.m65745e(this.scalability_mode, videoLayerSetting.scalability_mode);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final Codec getCodec() {
        return this.codec;
    }

    public final int getMax_bitrate() {
        return this.max_bitrate;
    }

    public final int getMax_framerate() {
        return this.max_framerate;
    }

    public final String getName() {
        return this.name;
    }

    public final String getScalability_mode() {
        return this.scalability_mode;
    }

    public final float getScale_resolution_down_by() {
        return this.scale_resolution_down_by;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iM30447a = AbstractC11266d.m30447a(this.scale_resolution_down_by, AbstractC11266d.m30448b(this.max_bitrate, AbstractC2875y.m8289b(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.name), 37, this.active), 37), 37);
        Codec codec = this.codec;
        int iHashCode = this.scalability_mode.hashCode() + AbstractC11266d.m30448b(this.max_framerate, (iM30447a + (codec != null ? codec.hashCode() : 0)) * 37, 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134516newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.name, "name=");
        AbstractC30007c.m91854x("active=", this.active, arrayList);
        AbstractC38963t7.m124389s(this.max_bitrate, "max_bitrate=", arrayList);
        arrayList.add("scale_resolution_down_by=" + this.scale_resolution_down_by);
        Codec codec = this.codec;
        if (codec != null) {
            arrayList.add("codec=" + codec);
        }
        AbstractC38963t7.m124389s(this.max_framerate, "max_framerate=", arrayList);
        AbstractC21702c.m61149t(arrayList, this.scalability_mode, "scalability_mode=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "VideoLayerSetting{", "}", null, 56);
    }

    public /* synthetic */ VideoLayerSetting(String str, boolean z4, int i13, float f13, Codec codec, int i14, String str2, C26624l c26624l, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? false : z4, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0.0f : f13, (i15 & 16) != 0 ? null : codec, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? "" : str2, (i15 & 128) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134516newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoLayerSetting(String name, boolean z4, int i13, float f13, Codec codec, int i14, String scalability_mode, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(scalability_mode, "scalability_mode");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.name = name;
        this.active = z4;
        this.max_bitrate = i13;
        this.scale_resolution_down_by = f13;
        this.codec = codec;
        this.max_framerate = i14;
        this.scalability_mode = scalability_mode;
    }
}
