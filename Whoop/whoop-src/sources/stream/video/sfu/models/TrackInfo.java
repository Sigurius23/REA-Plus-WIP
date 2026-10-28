package stream.video.sfu.models;

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
import com.squareup.wire.ProtoAdapter$EnumConstantNotFoundException;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.C26624l;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import s30.AbstractC32103e;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b \u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u0087\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u008d\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b*\u0010\"R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b.\u0010-R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b/\u0010-R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b0\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u0010 R\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\b6\u0010-R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u00109¨\u0006;"}, m65681d2 = {"Lstream/video/sfu/models/TrackInfo;", "Lcom/squareup/wire/l;", "", "", "track_id", "Lstream/video/sfu/models/TrackType;", "track_type", "", "Lstream/video/sfu/models/VideoLayer;", "layers", "mid", "", "dtx", "stereo", "red", "muted", "Lstream/video/sfu/models/Codec;", "codec", "", "publish_option_id", "self_sub_audio_video", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;)Lstream/video/sfu/models/TrackInfo;", "Ljava/lang/String;", "getTrack_id", "Lstream/video/sfu/models/TrackType;", "getTrack_type", "()Lstream/video/sfu/models/TrackType;", "getMid", "Z", "getDtx", "()Z", "getStereo", "getRed", "getMuted", "Lstream/video/sfu/models/Codec;", "getCodec", "()Lstream/video/sfu/models/Codec;", "I", "getPublish_option_id", "getSelf_sub_audio_video", "Ljava/util/List;", "getLayers", "()Ljava/util/List;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class TrackInfo extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Codec#ADAPTER", label = EnumC5595z.f22132F, tag = 11)
    private final Codec codec;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = EnumC5595z.f22132F, tag = 7)
    private final boolean dtx;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.VideoLayer#ADAPTER", label = EnumC5595z.f22136y, tag = 5)
    private final List<VideoLayer> layers;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 6)
    private final String mid;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = EnumC5595z.f22132F, tag = 10)
    private final boolean muted;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "publishOptionId", label = EnumC5595z.f22132F, tag = 12)
    private final int publish_option_id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = EnumC5595z.f22132F, tag = 9)
    private final boolean red;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "selfSubAudioVideo", label = EnumC5595z.f22132F, tag = 13)
    private final boolean self_sub_audio_video;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = EnumC5595z.f22132F, tag = 8)
    private final boolean stereo;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "trackId", label = EnumC5595z.f22132F, tag = 1)
    private final String track_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackType#ADAPTER", jsonName = "trackType", label = EnumC5595z.f22132F, tag = 2)
    private final TrackType track_type;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(TrackInfo.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.TrackInfo$Companion$ADAPTER$1
            /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
            @Override // com.squareup.wire.AbstractC5586q
            public TrackInfo decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                TrackType trackType = TrackType.TRACK_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jM16807d = reader.m16807d();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                boolean zBooleanValue4 = false;
                int iIntValue = 0;
                boolean zBooleanValue5 = false;
                Object objDecode = null;
                Object objDecode2 = "";
                Object objDecode3 = objDecode2;
                Object objDecode4 = trackType;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new TrackInfo((String) objDecode2, (TrackType) objDecode4, arrayList, (String) objDecode3, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, (Codec) objDecode, iIntValue, zBooleanValue5, reader.m16808e(jM16807d));
                    }
                    if (iM16810g != 1) {
                        if (iM16810g != 2) {
                            switch (iM16810g) {
                                case 5:
                                    arrayList.add(VideoLayer.ADAPTER.decode(reader));
                                    objDecode4 = objDecode4;
                                    break;
                                case 6:
                                    objDecode3 = AbstractC5586q.STRING.decode(reader);
                                    break;
                                case 7:
                                    zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                                    break;
                                case 8:
                                    zBooleanValue2 = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                                    break;
                                case 9:
                                    zBooleanValue3 = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                                    break;
                                case 10:
                                    zBooleanValue4 = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                                    break;
                                case 11:
                                    objDecode = Codec.ADAPTER.decode(reader);
                                    break;
                                case 12:
                                    iIntValue = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                                    break;
                                case 13:
                                    zBooleanValue5 = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                                    break;
                                default:
                                    reader.m16813j(iM16810g);
                                    objDecode4 = objDecode4;
                                    break;
                            }
                        } else {
                            try {
                                objDecode4 = TrackType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                                reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                                objDecode4 = objDecode4;
                            }
                        }
                        arrayList = arrayList;
                    } else {
                        arrayList = arrayList;
                        objDecode2 = AbstractC5586q.STRING.decode(reader);
                    }
                    arrayList = arrayList;
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(TrackInfo value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getTrack_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getTrack_id());
                }
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    iMo79253d += TrackType.ADAPTER.encodedSizeWithTag(2, value.getTrack_type());
                }
                int iEncodedSizeWithTag = VideoLayer.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getLayers()) + iMo79253d;
                if (!AbstractC22676k.m65745e(value.getMid(), "")) {
                    iEncodedSizeWithTag += AbstractC5586q.STRING.encodedSizeWithTag(6, value.getMid());
                }
                if (value.getDtx()) {
                    iEncodedSizeWithTag += AbstractC5586q.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getDtx()));
                }
                if (value.getStereo()) {
                    iEncodedSizeWithTag += AbstractC5586q.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getStereo()));
                }
                if (value.getRed()) {
                    iEncodedSizeWithTag += AbstractC5586q.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getRed()));
                }
                if (value.getMuted()) {
                    iEncodedSizeWithTag += AbstractC5586q.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getMuted()));
                }
                if (value.getCodec() != null) {
                    iEncodedSizeWithTag += Codec.ADAPTER.encodedSizeWithTag(11, value.getCodec());
                }
                if (value.getPublish_option_id() != 0) {
                    iEncodedSizeWithTag += AbstractC5586q.INT32.encodedSizeWithTag(12, Integer.valueOf(value.getPublish_option_id()));
                }
                return value.getSelf_sub_audio_video() ? AbstractC5586q.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.getSelf_sub_audio_video())) + iEncodedSizeWithTag : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public TrackInfo redact(TrackInfo value) {
                AbstractC22676k.m65750j(value, "value");
                ArrayList arrayListM99879a = AbstractC32103e.m99879a(value.getLayers(), VideoLayer.ADAPTER);
                Codec codec = value.getCodec();
                return TrackInfo.copy$default(value, null, null, arrayListM99879a, null, false, false, false, false, codec != null ? (Codec) Codec.ADAPTER.redact(codec) : null, 0, false, C26624l.f105881E, 1787, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, TrackInfo value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getTrack_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getTrack_id());
                }
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 2, value.getTrack_type());
                }
                VideoLayer.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.getLayers());
                if (!AbstractC22676k.m65745e(value.getMid(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 6, value.getMid());
                }
                if (value.getDtx()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.getDtx()));
                }
                if (value.getStereo()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getStereo()));
                }
                if (value.getRed()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 9, Boolean.valueOf(value.getRed()));
                }
                if (value.getMuted()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 10, Boolean.valueOf(value.getMuted()));
                }
                if (value.getCodec() != null) {
                    Codec.ADAPTER.encodeWithTag(writer, 11, value.getCodec());
                }
                if (value.getPublish_option_id() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 12, Integer.valueOf(value.getPublish_option_id()));
                }
                if (value.getSelf_sub_audio_video()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 13, Boolean.valueOf(value.getSelf_sub_audio_video()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, TrackInfo value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getSelf_sub_audio_video()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 13, Boolean.valueOf(value.getSelf_sub_audio_video()));
                }
                if (value.getPublish_option_id() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 12, Integer.valueOf(value.getPublish_option_id()));
                }
                if (value.getCodec() != null) {
                    Codec.ADAPTER.encodeWithTag(writer, 11, value.getCodec());
                }
                if (value.getMuted()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 10, Boolean.valueOf(value.getMuted()));
                }
                if (value.getRed()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 9, Boolean.valueOf(value.getRed()));
                }
                if (value.getStereo()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getStereo()));
                }
                if (value.getDtx()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.getDtx()));
                }
                if (!AbstractC22676k.m65745e(value.getMid(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 6, value.getMid());
                }
                VideoLayer.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.getLayers());
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 2, value.getTrack_type());
                }
                if (AbstractC22676k.m65745e(value.getTrack_id(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getTrack_id());
            }
        };
    }

    public TrackInfo() {
        this(null, null, null, null, false, false, false, false, null, 0, false, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackInfo copy$default(TrackInfo trackInfo, String str, TrackType trackType, List list, String str2, boolean z4, boolean z13, boolean z14, boolean z15, Codec codec, int i13, boolean z16, C26624l c26624l, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = trackInfo.track_id;
        }
        if ((i14 & 2) != 0) {
            trackType = trackInfo.track_type;
        }
        if ((i14 & 4) != 0) {
            list = trackInfo.layers;
        }
        if ((i14 & 8) != 0) {
            str2 = trackInfo.mid;
        }
        if ((i14 & 16) != 0) {
            z4 = trackInfo.dtx;
        }
        if ((i14 & 32) != 0) {
            z13 = trackInfo.stereo;
        }
        if ((i14 & 64) != 0) {
            z14 = trackInfo.red;
        }
        if ((i14 & 128) != 0) {
            z15 = trackInfo.muted;
        }
        if ((i14 & 256) != 0) {
            codec = trackInfo.codec;
        }
        if ((i14 & 512) != 0) {
            i13 = trackInfo.publish_option_id;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z16 = trackInfo.self_sub_audio_video;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            c26624l = trackInfo.unknownFields();
        }
        boolean z17 = z16;
        C26624l c26624l2 = c26624l;
        Codec codec2 = codec;
        int i15 = i13;
        boolean z18 = z14;
        boolean z19 = z15;
        boolean z24 = z4;
        boolean z25 = z13;
        return trackInfo.copy(str, trackType, list, str2, z24, z25, z18, z19, codec2, i15, z17, c26624l2);
    }

    public final TrackInfo copy(String track_id, TrackType track_type, List<VideoLayer> layers, String mid, boolean dtx, boolean stereo, boolean red, boolean muted, Codec codec, int publish_option_id, boolean self_sub_audio_video, C26624l unknownFields) {
        AbstractC22676k.m65750j(track_id, "track_id");
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(layers, "layers");
        AbstractC22676k.m65750j(mid, "mid");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new TrackInfo(track_id, track_type, layers, mid, dtx, stereo, red, muted, codec, publish_option_id, self_sub_audio_video, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TrackInfo)) {
            return false;
        }
        TrackInfo trackInfo = (TrackInfo) other;
        return AbstractC22676k.m65745e(unknownFields(), trackInfo.unknownFields()) && AbstractC22676k.m65745e(this.track_id, trackInfo.track_id) && this.track_type == trackInfo.track_type && AbstractC22676k.m65745e(this.layers, trackInfo.layers) && AbstractC22676k.m65745e(this.mid, trackInfo.mid) && this.dtx == trackInfo.dtx && this.stereo == trackInfo.stereo && this.red == trackInfo.red && this.muted == trackInfo.muted && AbstractC22676k.m65745e(this.codec, trackInfo.codec) && this.publish_option_id == trackInfo.publish_option_id && this.self_sub_audio_video == trackInfo.self_sub_audio_video;
    }

    public final Codec getCodec() {
        return this.codec;
    }

    public final boolean getDtx() {
        return this.dtx;
    }

    public final List<VideoLayer> getLayers() {
        return this.layers;
    }

    public final String getMid() {
        return this.mid;
    }

    public final boolean getMuted() {
        return this.muted;
    }

    public final int getPublish_option_id() {
        return this.publish_option_id;
    }

    public final boolean getRed() {
        return this.red;
    }

    public final boolean getSelf_sub_audio_video() {
        return this.self_sub_audio_video;
    }

    public final boolean getStereo() {
        return this.stereo;
    }

    public final String getTrack_id() {
        return this.track_id;
    }

    public final TrackType getTrack_type() {
        return this.track_type;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11895b.m31983b((this.track_type.hashCode() + AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.track_id)) * 37, 37, this.layers), 37, this.mid), 37, this.dtx), 37, this.stereo), 37, this.red), 37, this.muted);
        Codec codec = this.codec;
        int iHashCode = Boolean.hashCode(this.self_sub_audio_video) + AbstractC11266d.m30448b(this.publish_option_id, (iM8289b + (codec != null ? codec.hashCode() : 0)) * 37, 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134546newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.track_id, "track_id=");
        arrayList.add("track_type=" + this.track_type);
        if (!this.layers.isEmpty()) {
            AbstractC26725a.m79513q("layers=", this.layers, arrayList);
        }
        AbstractC21702c.m61149t(arrayList, this.mid, "mid=");
        AbstractC30007c.m91854x("dtx=", this.dtx, arrayList);
        AbstractC30007c.m91854x("stereo=", this.stereo, arrayList);
        AbstractC30007c.m91854x("red=", this.red, arrayList);
        AbstractC30007c.m91854x("muted=", this.muted, arrayList);
        Codec codec = this.codec;
        if (codec != null) {
            arrayList.add("codec=" + codec);
        }
        AbstractC38963t7.m124389s(this.publish_option_id, "publish_option_id=", arrayList);
        AbstractC30007c.m91854x("self_sub_audio_video=", this.self_sub_audio_video, arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "TrackInfo{", "}", null, 56);
    }

    public /* synthetic */ TrackInfo(String str, TrackType trackType, List list, String str2, boolean z4, boolean z13, boolean z14, boolean z15, Codec codec, int i13, boolean z16, C26624l c26624l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? TrackType.TRACK_TYPE_UNSPECIFIED : trackType, (i14 & 4) != 0 ? C25271y.f99162w : list, (i14 & 8) != 0 ? "" : str2, (i14 & 16) != 0 ? false : z4, (i14 & 32) != 0 ? false : z13, (i14 & 64) != 0 ? false : z14, (i14 & 128) != 0 ? false : z15, (i14 & 256) != 0 ? null : codec, (i14 & 512) != 0 ? 0 : i13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z16, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134546newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackInfo(String track_id, TrackType track_type, List<VideoLayer> layers, String mid, boolean z4, boolean z13, boolean z14, boolean z15, Codec codec, int i13, boolean z16, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(track_id, "track_id");
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(layers, "layers");
        AbstractC22676k.m65750j(mid, "mid");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.track_id = track_id;
        this.track_type = track_type;
        this.mid = mid;
        this.dtx = z4;
        this.stereo = z13;
        this.red = z14;
        this.muted = z15;
        this.codec = codec;
        this.publish_option_id = i13;
        this.self_sub_audio_video = z16;
        this.layers = AbstractC32103e.m99886h("layers", layers);
    }
}
