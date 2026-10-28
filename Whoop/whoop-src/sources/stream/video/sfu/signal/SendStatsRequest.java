package stream.video.sfu.signal;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
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
import java.util.List;
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.C26624l;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import s30.AbstractC32103e;
import stream.video.sfu.models.AndroidState;
import stream.video.sfu.models.AppleState;
import stream.video.sfu.models.InputDevices;
import stream.video.sfu.models.PerformanceStats;
import stream.video.sfu.models.RTMPIngress;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\u0018\u0000 Q2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001QBÝ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0017¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010,Jã\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010,R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b1\u0010,R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b2\u0010,R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b3\u0010,R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b4\u0010,R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b5\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b9\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010ER \u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010/\u0012\u0004\bG\u0010H\u001a\u0004\bF\u0010,R \u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010/\u0012\u0004\bJ\u0010H\u001a\u0004\bI\u0010,R\u001a\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\bK\u0010,R\u001a\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010/\u001a\u0004\bL\u0010,R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010M\u001a\u0004\bN\u0010OR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010M\u001a\u0004\bP\u0010O¨\u0006R"}, m65681d2 = {"Lstream/video/sfu/signal/SendStatsRequest;", "Lcom/squareup/wire/l;", "", "", "session_id", "subscriber_stats", "publisher_stats", "webrtc_version", "sdk", "sdk_version", "Lstream/video/sfu/models/InputDevices;", "audio_devices", "video_devices", "Lstream/video/sfu/models/AndroidState;", "android", "Lstream/video/sfu/models/AppleState;", "apple", "Lstream/video/sfu/signal/Telemetry;", "telemetry", "Lstream/video/sfu/models/RTMPIngress;", "rtmp", "subscriber_rtc_stats", "publisher_rtc_stats", "rtc_stats", "", "Lstream/video/sfu/models/PerformanceStats;", "encode_stats", "decode_stats", "unified_session_id", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/signal/SendStatsRequest;", "Ljava/lang/String;", "getSession_id", "getSubscriber_stats", "getPublisher_stats", "getWebrtc_version", "getSdk", "getSdk_version", "Lstream/video/sfu/models/InputDevices;", "getAudio_devices", "()Lstream/video/sfu/models/InputDevices;", "getVideo_devices", "Lstream/video/sfu/models/AndroidState;", "getAndroid", "()Lstream/video/sfu/models/AndroidState;", "Lstream/video/sfu/models/AppleState;", "getApple", "()Lstream/video/sfu/models/AppleState;", "Lstream/video/sfu/signal/Telemetry;", "getTelemetry", "()Lstream/video/sfu/signal/Telemetry;", "Lstream/video/sfu/models/RTMPIngress;", "getRtmp", "()Lstream/video/sfu/models/RTMPIngress;", "getSubscriber_rtc_stats", "getSubscriber_rtc_stats$annotations", "()V", "getPublisher_rtc_stats", "getPublisher_rtc_stats$annotations", "getRtc_stats", "getUnified_session_id", "Ljava/util/List;", "getEncode_stats", "()Ljava/util/List;", "getDecode_stats", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class SendStatsRequest extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.AndroidState#ADAPTER", oneofName = "device_state", schemaIndex = 8, tag = 9)
    private final AndroidState android;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.AppleState#ADAPTER", oneofName = "device_state", schemaIndex = 9, tag = 10)
    private final AppleState apple;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.InputDevices#ADAPTER", jsonName = "audioDevices", label = EnumC5595z.f22132F, schemaIndex = 6, tag = 7)
    private final InputDevices audio_devices;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.PerformanceStats#ADAPTER", jsonName = "decodeStats", label = EnumC5595z.f22136y, schemaIndex = 16, tag = C1533u.MAX_FIELD_NUMBER)
    private final List<PerformanceStats> decode_stats;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.PerformanceStats#ADAPTER", jsonName = "encodeStats", label = EnumC5595z.f22136y, schemaIndex = 15, tag = 16)
    private final List<PerformanceStats> encode_stats;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publisherRtcStats", label = EnumC5595z.f22132F, schemaIndex = 13, tag = 14)
    private final String publisher_rtc_stats;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publisherStats", label = EnumC5595z.f22132F, schemaIndex = 2, tag = 3)
    private final String publisher_stats;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rtcStats", label = EnumC5595z.f22132F, schemaIndex = 14, tag = 15)
    private final String rtc_stats;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.RTMPIngress#ADAPTER", label = EnumC5595z.f22132F, schemaIndex = 11, tag = 12)
    private final RTMPIngress rtmp;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, schemaIndex = 4, tag = 5)
    private final String sdk;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sdkVersion", label = EnumC5595z.f22132F, schemaIndex = 5, tag = 6)
    private final String sdk_version;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, schemaIndex = 0, tag = 1)
    private final String session_id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subscriberRtcStats", label = EnumC5595z.f22132F, schemaIndex = 12, tag = 13)
    private final String subscriber_rtc_stats;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subscriberStats", label = EnumC5595z.f22132F, schemaIndex = 1, tag = 2)
    private final String subscriber_stats;

    @InterfaceC5570a0(adapter = "stream.video.sfu.signal.Telemetry#ADAPTER", label = EnumC5595z.f22132F, schemaIndex = 10, tag = 11)
    private final Telemetry telemetry;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "unifiedSessionId", label = EnumC5595z.f22132F, schemaIndex = C1533u.MAX_FIELD_NUMBER, tag = C1533u.AVG_FIELD_NUMBER)
    private final String unified_session_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.InputDevices#ADAPTER", jsonName = "videoDevices", label = EnumC5595z.f22132F, schemaIndex = 7, tag = 8)
    private final InputDevices video_devices;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webrtcVersion", label = EnumC5595z.f22132F, schemaIndex = 3, tag = 4)
    private final String webrtc_version;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(SendStatsRequest.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.signal.SendStatsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public SendStatsRequest decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                Object objDecode2 = objDecode;
                Object objDecode3 = objDecode2;
                Object objDecode4 = objDecode3;
                Object objDecode5 = objDecode4;
                Object objDecode6 = objDecode5;
                Object objDecode7 = objDecode6;
                Object objDecode8 = objDecode7;
                Object objDecode9 = objDecode8;
                Object objDecode10 = null;
                Object objDecode11 = null;
                Object objDecode12 = null;
                Object objDecode13 = null;
                Object objDecode14 = null;
                Object objDecode15 = null;
                Object objDecode16 = objDecode9;
                while (true) {
                    int iM16810g = reader.m16810g();
                    Object obj = objDecode16;
                    if (iM16810g == -1) {
                        return new SendStatsRequest((String) objDecode9, (String) obj, (String) objDecode, (String) objDecode2, (String) objDecode3, (String) objDecode4, (InputDevices) objDecode10, (InputDevices) objDecode11, (AndroidState) objDecode12, (AppleState) objDecode13, (Telemetry) objDecode14, (RTMPIngress) objDecode15, (String) objDecode5, (String) objDecode6, (String) objDecode7, arrayList, arrayList2, (String) objDecode8, reader.m16808e(jM16807d));
                    }
                    switch (iM16810g) {
                        case 1:
                            objDecode9 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 2:
                            objDecode16 = AbstractC5586q.STRING.decode(reader);
                            continue;
                        case 3:
                            objDecode = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 4:
                            objDecode2 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 5:
                            objDecode3 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 6:
                            objDecode4 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 7:
                            objDecode10 = InputDevices.ADAPTER.decode(reader);
                            break;
                        case 8:
                            objDecode11 = InputDevices.ADAPTER.decode(reader);
                            break;
                        case 9:
                            objDecode12 = AndroidState.ADAPTER.decode(reader);
                            break;
                        case 10:
                            objDecode13 = AppleState.ADAPTER.decode(reader);
                            break;
                        case 11:
                            objDecode14 = Telemetry.ADAPTER.decode(reader);
                            break;
                        case 12:
                            objDecode15 = RTMPIngress.ADAPTER.decode(reader);
                            break;
                        case 13:
                            objDecode5 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 14:
                            objDecode6 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 15:
                            objDecode7 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 16:
                            arrayList.add(PerformanceStats.ADAPTER.decode(reader));
                            break;
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            arrayList2.add(PerformanceStats.ADAPTER.decode(reader));
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            objDecode8 = AbstractC5586q.STRING.decode(reader);
                            break;
                        default:
                            reader.m16813j(iM16810g);
                            break;
                    }
                    objDecode16 = obj;
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(SendStatsRequest value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getSession_id());
                }
                if (!AbstractC22676k.m65745e(value.getSubscriber_stats(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSubscriber_stats());
                }
                if (!AbstractC22676k.m65745e(value.getPublisher_stats(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(3, value.getPublisher_stats());
                }
                if (!AbstractC22676k.m65745e(value.getWebrtc_version(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(4, value.getWebrtc_version());
                }
                if (!AbstractC22676k.m65745e(value.getSdk(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(5, value.getSdk());
                }
                if (!AbstractC22676k.m65745e(value.getSdk_version(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(6, value.getSdk_version());
                }
                if (value.getAudio_devices() != null) {
                    iMo79253d += InputDevices.ADAPTER.encodedSizeWithTag(7, value.getAudio_devices());
                }
                if (value.getVideo_devices() != null) {
                    iMo79253d += InputDevices.ADAPTER.encodedSizeWithTag(8, value.getVideo_devices());
                }
                int iEncodedSizeWithTag = AppleState.ADAPTER.encodedSizeWithTag(10, value.getApple()) + AndroidState.ADAPTER.encodedSizeWithTag(9, value.getAndroid()) + iMo79253d;
                if (value.getTelemetry() != null) {
                    iEncodedSizeWithTag += Telemetry.ADAPTER.encodedSizeWithTag(11, value.getTelemetry());
                }
                if (value.getRtmp() != null) {
                    iEncodedSizeWithTag += RTMPIngress.ADAPTER.encodedSizeWithTag(12, value.getRtmp());
                }
                if (!AbstractC22676k.m65745e(value.getSubscriber_rtc_stats(), "")) {
                    iEncodedSizeWithTag += AbstractC5586q.STRING.encodedSizeWithTag(13, value.getSubscriber_rtc_stats());
                }
                if (!AbstractC22676k.m65745e(value.getPublisher_rtc_stats(), "")) {
                    iEncodedSizeWithTag += AbstractC5586q.STRING.encodedSizeWithTag(14, value.getPublisher_rtc_stats());
                }
                if (!AbstractC22676k.m65745e(value.getRtc_stats(), "")) {
                    iEncodedSizeWithTag += AbstractC5586q.STRING.encodedSizeWithTag(15, value.getRtc_stats());
                }
                AbstractC5586q abstractC5586q = PerformanceStats.ADAPTER;
                int iEncodedSizeWithTag2 = abstractC5586q.asRepeated().encodedSizeWithTag(17, value.getDecode_stats()) + abstractC5586q.asRepeated().encodedSizeWithTag(16, value.getEncode_stats()) + iEncodedSizeWithTag;
                return !AbstractC22676k.m65745e(value.getUnified_session_id(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(18, value.getUnified_session_id()) + iEncodedSizeWithTag2 : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public SendStatsRequest redact(SendStatsRequest value) {
                AbstractC22676k.m65750j(value, "value");
                InputDevices audio_devices = value.getAudio_devices();
                InputDevices inputDevices = audio_devices != null ? (InputDevices) InputDevices.ADAPTER.redact(audio_devices) : null;
                InputDevices video_devices = value.getVideo_devices();
                InputDevices inputDevices2 = video_devices != null ? (InputDevices) InputDevices.ADAPTER.redact(video_devices) : null;
                AndroidState android2 = value.getAndroid();
                AndroidState androidState = android2 != null ? (AndroidState) AndroidState.ADAPTER.redact(android2) : null;
                AppleState apple = value.getApple();
                AppleState appleState = apple != null ? (AppleState) AppleState.ADAPTER.redact(apple) : null;
                Telemetry telemetry = value.getTelemetry();
                Telemetry telemetry2 = telemetry != null ? (Telemetry) Telemetry.ADAPTER.redact(telemetry) : null;
                RTMPIngress rtmp = value.getRtmp();
                RTMPIngress rTMPIngress = rtmp != null ? (RTMPIngress) RTMPIngress.ADAPTER.redact(rtmp) : null;
                List<PerformanceStats> encode_stats = value.getEncode_stats();
                AbstractC5586q abstractC5586q = PerformanceStats.ADAPTER;
                return value.copy((159807 & 1) != 0 ? value.session_id : null, (159807 & 2) != 0 ? value.subscriber_stats : null, (159807 & 4) != 0 ? value.publisher_stats : null, (159807 & 8) != 0 ? value.webrtc_version : null, (159807 & 16) != 0 ? value.sdk : null, (159807 & 32) != 0 ? value.sdk_version : null, (159807 & 64) != 0 ? value.audio_devices : inputDevices, (159807 & 128) != 0 ? value.video_devices : inputDevices2, (159807 & 256) != 0 ? value.android : androidState, (159807 & 512) != 0 ? value.apple : appleState, (159807 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? value.telemetry : telemetry2, (159807 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? value.rtmp : rTMPIngress, (159807 & 4096) != 0 ? value.subscriber_rtc_stats : null, (159807 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? value.publisher_rtc_stats : null, (159807 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? value.rtc_stats : null, (159807 & 32768) != 0 ? value.encode_stats : AbstractC32103e.m99879a(encode_stats, abstractC5586q), (159807 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? value.decode_stats : AbstractC32103e.m99879a(value.getDecode_stats(), abstractC5586q), (159807 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? value.unified_session_id : null, (159807 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? value.unknownFields() : C26624l.f105881E);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, SendStatsRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getSession_id());
                }
                if (!AbstractC22676k.m65745e(value.getSubscriber_stats(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSubscriber_stats());
                }
                if (!AbstractC22676k.m65745e(value.getPublisher_stats(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 3, value.getPublisher_stats());
                }
                if (!AbstractC22676k.m65745e(value.getWebrtc_version(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 4, value.getWebrtc_version());
                }
                if (!AbstractC22676k.m65745e(value.getSdk(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 5, value.getSdk());
                }
                if (!AbstractC22676k.m65745e(value.getSdk_version(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 6, value.getSdk_version());
                }
                if (value.getAudio_devices() != null) {
                    InputDevices.ADAPTER.encodeWithTag(writer, 7, value.getAudio_devices());
                }
                if (value.getVideo_devices() != null) {
                    InputDevices.ADAPTER.encodeWithTag(writer, 8, value.getVideo_devices());
                }
                if (value.getTelemetry() != null) {
                    Telemetry.ADAPTER.encodeWithTag(writer, 11, value.getTelemetry());
                }
                if (value.getRtmp() != null) {
                    RTMPIngress.ADAPTER.encodeWithTag(writer, 12, value.getRtmp());
                }
                if (!AbstractC22676k.m65745e(value.getSubscriber_rtc_stats(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 13, value.getSubscriber_rtc_stats());
                }
                if (!AbstractC22676k.m65745e(value.getPublisher_rtc_stats(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 14, value.getPublisher_rtc_stats());
                }
                if (!AbstractC22676k.m65745e(value.getRtc_stats(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 15, value.getRtc_stats());
                }
                AbstractC5586q abstractC5586q = PerformanceStats.ADAPTER;
                abstractC5586q.asRepeated().encodeWithTag(writer, 16, value.getEncode_stats());
                abstractC5586q.asRepeated().encodeWithTag(writer, 17, value.getDecode_stats());
                if (!AbstractC22676k.m65745e(value.getUnified_session_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 18, value.getUnified_session_id());
                }
                AndroidState.ADAPTER.encodeWithTag(writer, 9, value.getAndroid());
                AppleState.ADAPTER.encodeWithTag(writer, 10, value.getApple());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, SendStatsRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                AppleState.ADAPTER.encodeWithTag(writer, 10, value.getApple());
                AndroidState.ADAPTER.encodeWithTag(writer, 9, value.getAndroid());
                if (!AbstractC22676k.m65745e(value.getUnified_session_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 18, value.getUnified_session_id());
                }
                AbstractC5586q abstractC5586q = PerformanceStats.ADAPTER;
                abstractC5586q.asRepeated().encodeWithTag(writer, 17, value.getDecode_stats());
                abstractC5586q.asRepeated().encodeWithTag(writer, 16, value.getEncode_stats());
                if (!AbstractC22676k.m65745e(value.getRtc_stats(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 15, value.getRtc_stats());
                }
                if (!AbstractC22676k.m65745e(value.getPublisher_rtc_stats(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 14, value.getPublisher_rtc_stats());
                }
                if (!AbstractC22676k.m65745e(value.getSubscriber_rtc_stats(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 13, value.getSubscriber_rtc_stats());
                }
                if (value.getRtmp() != null) {
                    RTMPIngress.ADAPTER.encodeWithTag(writer, 12, value.getRtmp());
                }
                if (value.getTelemetry() != null) {
                    Telemetry.ADAPTER.encodeWithTag(writer, 11, value.getTelemetry());
                }
                if (value.getVideo_devices() != null) {
                    InputDevices.ADAPTER.encodeWithTag(writer, 8, value.getVideo_devices());
                }
                if (value.getAudio_devices() != null) {
                    InputDevices.ADAPTER.encodeWithTag(writer, 7, value.getAudio_devices());
                }
                if (!AbstractC22676k.m65745e(value.getSdk_version(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 6, value.getSdk_version());
                }
                if (!AbstractC22676k.m65745e(value.getSdk(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 5, value.getSdk());
                }
                if (!AbstractC22676k.m65745e(value.getWebrtc_version(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 4, value.getWebrtc_version());
                }
                if (!AbstractC22676k.m65745e(value.getPublisher_stats(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 3, value.getPublisher_stats());
                }
                if (!AbstractC22676k.m65745e(value.getSubscriber_stats(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSubscriber_stats());
                }
                if (AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getSession_id());
            }
        };
    }

    public SendStatsRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    @InterfaceC23457c
    public static /* synthetic */ void getPublisher_rtc_stats$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getSubscriber_rtc_stats$annotations() {
    }

    public final SendStatsRequest copy(String session_id, String subscriber_stats, String publisher_stats, String webrtc_version, String sdk, String sdk_version, InputDevices audio_devices, InputDevices video_devices, AndroidState android2, AppleState apple, Telemetry telemetry, RTMPIngress rtmp, String subscriber_rtc_stats, String publisher_rtc_stats, String rtc_stats, List<PerformanceStats> encode_stats, List<PerformanceStats> decode_stats, String unified_session_id, C26624l unknownFields) {
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(subscriber_stats, "subscriber_stats");
        AbstractC22676k.m65750j(publisher_stats, "publisher_stats");
        AbstractC22676k.m65750j(webrtc_version, "webrtc_version");
        AbstractC22676k.m65750j(sdk, "sdk");
        AbstractC22676k.m65750j(sdk_version, "sdk_version");
        AbstractC22676k.m65750j(subscriber_rtc_stats, "subscriber_rtc_stats");
        AbstractC22676k.m65750j(publisher_rtc_stats, "publisher_rtc_stats");
        AbstractC22676k.m65750j(rtc_stats, "rtc_stats");
        AbstractC22676k.m65750j(encode_stats, "encode_stats");
        AbstractC22676k.m65750j(decode_stats, "decode_stats");
        AbstractC22676k.m65750j(unified_session_id, "unified_session_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new SendStatsRequest(session_id, subscriber_stats, publisher_stats, webrtc_version, sdk, sdk_version, audio_devices, video_devices, android2, apple, telemetry, rtmp, subscriber_rtc_stats, publisher_rtc_stats, rtc_stats, encode_stats, decode_stats, unified_session_id, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SendStatsRequest)) {
            return false;
        }
        SendStatsRequest sendStatsRequest = (SendStatsRequest) other;
        return AbstractC22676k.m65745e(unknownFields(), sendStatsRequest.unknownFields()) && AbstractC22676k.m65745e(this.session_id, sendStatsRequest.session_id) && AbstractC22676k.m65745e(this.subscriber_stats, sendStatsRequest.subscriber_stats) && AbstractC22676k.m65745e(this.publisher_stats, sendStatsRequest.publisher_stats) && AbstractC22676k.m65745e(this.webrtc_version, sendStatsRequest.webrtc_version) && AbstractC22676k.m65745e(this.sdk, sendStatsRequest.sdk) && AbstractC22676k.m65745e(this.sdk_version, sendStatsRequest.sdk_version) && AbstractC22676k.m65745e(this.audio_devices, sendStatsRequest.audio_devices) && AbstractC22676k.m65745e(this.video_devices, sendStatsRequest.video_devices) && AbstractC22676k.m65745e(this.android, sendStatsRequest.android) && AbstractC22676k.m65745e(this.apple, sendStatsRequest.apple) && AbstractC22676k.m65745e(this.telemetry, sendStatsRequest.telemetry) && AbstractC22676k.m65745e(this.rtmp, sendStatsRequest.rtmp) && AbstractC22676k.m65745e(this.subscriber_rtc_stats, sendStatsRequest.subscriber_rtc_stats) && AbstractC22676k.m65745e(this.publisher_rtc_stats, sendStatsRequest.publisher_rtc_stats) && AbstractC22676k.m65745e(this.rtc_stats, sendStatsRequest.rtc_stats) && AbstractC22676k.m65745e(this.encode_stats, sendStatsRequest.encode_stats) && AbstractC22676k.m65745e(this.decode_stats, sendStatsRequest.decode_stats) && AbstractC22676k.m65745e(this.unified_session_id, sendStatsRequest.unified_session_id);
    }

    public final AndroidState getAndroid() {
        return this.android;
    }

    public final AppleState getApple() {
        return this.apple;
    }

    public final InputDevices getAudio_devices() {
        return this.audio_devices;
    }

    public final List<PerformanceStats> getDecode_stats() {
        return this.decode_stats;
    }

    public final List<PerformanceStats> getEncode_stats() {
        return this.encode_stats;
    }

    public final String getPublisher_rtc_stats() {
        return this.publisher_rtc_stats;
    }

    public final String getPublisher_stats() {
        return this.publisher_stats;
    }

    public final String getRtc_stats() {
        return this.rtc_stats;
    }

    public final RTMPIngress getRtmp() {
        return this.rtmp;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getSdk_version() {
        return this.sdk_version;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getSubscriber_rtc_stats() {
        return this.subscriber_rtc_stats;
    }

    public final String getSubscriber_stats() {
        return this.subscriber_stats;
    }

    public final Telemetry getTelemetry() {
        return this.telemetry;
    }

    public final String getUnified_session_id() {
        return this.unified_session_id;
    }

    public final InputDevices getVideo_devices() {
        return this.video_devices;
    }

    public final String getWebrtc_version() {
        return this.webrtc_version;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.session_id), 37, this.subscriber_stats), 37, this.publisher_stats), 37, this.webrtc_version), 37, this.sdk), 37, this.sdk_version);
        InputDevices inputDevices = this.audio_devices;
        int iHashCode = (iM30450d + (inputDevices != null ? inputDevices.hashCode() : 0)) * 37;
        InputDevices inputDevices2 = this.video_devices;
        int iHashCode2 = (iHashCode + (inputDevices2 != null ? inputDevices2.hashCode() : 0)) * 37;
        AndroidState androidState = this.android;
        int iHashCode3 = (iHashCode2 + (androidState != null ? androidState.hashCode() : 0)) * 37;
        AppleState appleState = this.apple;
        int iHashCode4 = (iHashCode3 + (appleState != null ? appleState.hashCode() : 0)) * 37;
        Telemetry telemetry = this.telemetry;
        int iHashCode5 = (iHashCode4 + (telemetry != null ? telemetry.hashCode() : 0)) * 37;
        RTMPIngress rTMPIngress = this.rtmp;
        int iHashCode6 = this.unified_session_id.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode5 + (rTMPIngress != null ? rTMPIngress.hashCode() : 0)) * 37, 37, this.subscriber_rtc_stats), 37, this.publisher_rtc_stats), 37, this.rtc_stats), 37, this.encode_stats), 37, this.decode_stats);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134558newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        AbstractC21702c.m61149t(arrayList, this.subscriber_stats, "subscriber_stats=");
        AbstractC21702c.m61149t(arrayList, this.publisher_stats, "publisher_stats=");
        AbstractC21702c.m61149t(arrayList, this.webrtc_version, "webrtc_version=");
        AbstractC21702c.m61149t(arrayList, this.sdk, "sdk=");
        AbstractC21702c.m61149t(arrayList, this.sdk_version, "sdk_version=");
        InputDevices inputDevices = this.audio_devices;
        if (inputDevices != null) {
            arrayList.add("audio_devices=" + inputDevices);
        }
        InputDevices inputDevices2 = this.video_devices;
        if (inputDevices2 != null) {
            arrayList.add("video_devices=" + inputDevices2);
        }
        AndroidState androidState = this.android;
        if (androidState != null) {
            arrayList.add("android=" + androidState);
        }
        AppleState appleState = this.apple;
        if (appleState != null) {
            arrayList.add("apple=" + appleState);
        }
        Telemetry telemetry = this.telemetry;
        if (telemetry != null) {
            arrayList.add("telemetry=" + telemetry);
        }
        RTMPIngress rTMPIngress = this.rtmp;
        if (rTMPIngress != null) {
            arrayList.add("rtmp=" + rTMPIngress);
        }
        AbstractC21702c.m61149t(arrayList, this.subscriber_rtc_stats, "subscriber_rtc_stats=");
        AbstractC21702c.m61149t(arrayList, this.publisher_rtc_stats, "publisher_rtc_stats=");
        AbstractC21702c.m61149t(arrayList, this.rtc_stats, "rtc_stats=");
        if (!this.encode_stats.isEmpty()) {
            AbstractC26725a.m79513q("encode_stats=", this.encode_stats, arrayList);
        }
        if (!this.decode_stats.isEmpty()) {
            AbstractC26725a.m79513q("decode_stats=", this.decode_stats, arrayList);
        }
        AbstractC21702c.m61149t(arrayList, this.unified_session_id, "unified_session_id=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "SendStatsRequest{", "}", null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SendStatsRequest(String str, String str2, String str3, String str4, String str5, String str6, InputDevices inputDevices, InputDevices inputDevices2, AndroidState androidState, AppleState appleState, Telemetry telemetry, RTMPIngress rTMPIngress, String str7, String str8, String str9, List list, List list2, String str10, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        String str11 = (i13 & 1) != 0 ? "" : str;
        String str12 = (i13 & 2) != 0 ? "" : str2;
        String str13 = (i13 & 4) != 0 ? "" : str3;
        String str14 = (i13 & 8) != 0 ? "" : str4;
        String str15 = (i13 & 16) != 0 ? "" : str5;
        String str16 = (i13 & 32) != 0 ? "" : str6;
        InputDevices inputDevices3 = (i13 & 64) != 0 ? null : inputDevices;
        InputDevices inputDevices4 = (i13 & 128) != 0 ? null : inputDevices2;
        AndroidState androidState2 = (i13 & 256) != 0 ? null : androidState;
        AppleState appleState2 = (i13 & 512) != 0 ? null : appleState;
        Telemetry telemetry2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : telemetry;
        RTMPIngress rTMPIngress2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? rTMPIngress : null;
        String str17 = (i13 & 4096) != 0 ? "" : str7;
        String str18 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? "" : str8;
        String str19 = str11;
        String str20 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? "" : str9;
        int i14 = i13 & 32768;
        List list3 = C25271y.f99162w;
        this(str19, str12, str13, str14, str15, str16, inputDevices3, inputDevices4, androidState2, appleState2, telemetry2, rTMPIngress2, str17, str18, str20, i14 != 0 ? list3 : list, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0 ? list2 : list3, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 0 ? str10 : "", (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134558newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendStatsRequest(String session_id, String subscriber_stats, String publisher_stats, String webrtc_version, String sdk, String sdk_version, InputDevices inputDevices, InputDevices inputDevices2, AndroidState androidState, AppleState appleState, Telemetry telemetry, RTMPIngress rTMPIngress, String subscriber_rtc_stats, String publisher_rtc_stats, String rtc_stats, List<PerformanceStats> encode_stats, List<PerformanceStats> decode_stats, String unified_session_id, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(subscriber_stats, "subscriber_stats");
        AbstractC22676k.m65750j(publisher_stats, "publisher_stats");
        AbstractC22676k.m65750j(webrtc_version, "webrtc_version");
        AbstractC22676k.m65750j(sdk, "sdk");
        AbstractC22676k.m65750j(sdk_version, "sdk_version");
        AbstractC22676k.m65750j(subscriber_rtc_stats, "subscriber_rtc_stats");
        AbstractC22676k.m65750j(publisher_rtc_stats, "publisher_rtc_stats");
        AbstractC22676k.m65750j(rtc_stats, "rtc_stats");
        AbstractC22676k.m65750j(encode_stats, "encode_stats");
        AbstractC22676k.m65750j(decode_stats, "decode_stats");
        AbstractC22676k.m65750j(unified_session_id, "unified_session_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.session_id = session_id;
        this.subscriber_stats = subscriber_stats;
        this.publisher_stats = publisher_stats;
        this.webrtc_version = webrtc_version;
        this.sdk = sdk;
        this.sdk_version = sdk_version;
        this.audio_devices = inputDevices;
        this.video_devices = inputDevices2;
        this.android = androidState;
        this.apple = appleState;
        this.telemetry = telemetry;
        this.rtmp = rTMPIngress;
        this.subscriber_rtc_stats = subscriber_rtc_stats;
        this.publisher_rtc_stats = publisher_rtc_stats;
        this.rtc_stats = rtc_stats;
        this.unified_session_id = unified_session_id;
        this.encode_stats = AbstractC32103e.m99886h("encode_stats", encode_stats);
        this.decode_stats = AbstractC32103e.m99886h("decode_stats", decode_stats);
        if ((androidState != null ? 1 : 0) + (appleState != null ? 1 : 0) > 1) {
            throw new IllegalArgumentException("At most one of android, apple may be non-null");
        }
    }
}
