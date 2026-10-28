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
import java.util.List;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.C26624l;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import s30.AbstractC32103e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB1\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006 "}, m65681d2 = {"Lstream/video/sfu/event/ChangePublishQuality;", "Lcom/squareup/wire/l;", "", "", "Lstream/video/sfu/event/AudioSender;", "audio_senders", "Lstream/video/sfu/event/VideoSender;", "video_senders", "Lne3/l;", "unknownFields", "<init>", "(Ljava/util/List;Ljava/util/List;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Lne3/l;)Lstream/video/sfu/event/ChangePublishQuality;", "Ljava/util/List;", "getAudio_senders", "()Ljava/util/List;", "getVideo_senders", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ChangePublishQuality extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.AudioSender#ADAPTER", jsonName = "audioSenders", label = EnumC5595z.f22136y, tag = 1)
    private final List<AudioSender> audio_senders;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.VideoSender#ADAPTER", jsonName = "videoSenders", label = EnumC5595z.f22136y, tag = 2)
    private final List<VideoSender> video_senders;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(ChangePublishQuality.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.ChangePublishQuality$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public ChangePublishQuality decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jM16807d = reader.m16807d();
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new ChangePublishQuality(arrayList, arrayList2, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        arrayList.add(AudioSender.ADAPTER.decode(reader));
                    } else if (iM16810g != 2) {
                        reader.m16813j(iM16810g);
                    } else {
                        arrayList2.add(VideoSender.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(ChangePublishQuality value) {
                AbstractC22676k.m65750j(value, "value");
                return VideoSender.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getVideo_senders()) + AudioSender.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getAudio_senders()) + value.unknownFields().mo79253d();
            }

            @Override // com.squareup.wire.AbstractC5586q
            public ChangePublishQuality redact(ChangePublishQuality value) {
                AbstractC22676k.m65750j(value, "value");
                return value.copy(AbstractC32103e.m99879a(value.getAudio_senders(), AudioSender.ADAPTER), AbstractC32103e.m99879a(value.getVideo_senders(), VideoSender.ADAPTER), C26624l.f105881E);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, ChangePublishQuality value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                AudioSender.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.getAudio_senders());
                VideoSender.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getVideo_senders());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, ChangePublishQuality value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                VideoSender.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getVideo_senders());
                AudioSender.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.getAudio_senders());
            }
        };
    }

    public ChangePublishQuality() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangePublishQuality copy$default(ChangePublishQuality changePublishQuality, List list, List list2, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = changePublishQuality.audio_senders;
        }
        if ((i13 & 2) != 0) {
            list2 = changePublishQuality.video_senders;
        }
        if ((i13 & 4) != 0) {
            c26624l = changePublishQuality.unknownFields();
        }
        return changePublishQuality.copy(list, list2, c26624l);
    }

    public final ChangePublishQuality copy(List<AudioSender> audio_senders, List<VideoSender> video_senders, C26624l unknownFields) {
        AbstractC22676k.m65750j(audio_senders, "audio_senders");
        AbstractC22676k.m65750j(video_senders, "video_senders");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new ChangePublishQuality(audio_senders, video_senders, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChangePublishQuality)) {
            return false;
        }
        ChangePublishQuality changePublishQuality = (ChangePublishQuality) other;
        return AbstractC22676k.m65745e(unknownFields(), changePublishQuality.unknownFields()) && AbstractC22676k.m65745e(this.audio_senders, changePublishQuality.audio_senders) && AbstractC22676k.m65745e(this.video_senders, changePublishQuality.video_senders);
    }

    public final List<AudioSender> getAudio_senders() {
        return this.audio_senders;
    }

    public final List<VideoSender> getVideo_senders() {
        return this.video_senders;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.video_senders.hashCode() + AbstractC11895b.m31983b(unknownFields().hashCode() * 37, 37, this.audio_senders);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134488newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.audio_senders.isEmpty()) {
            AbstractC26725a.m79513q("audio_senders=", this.audio_senders, arrayList);
        }
        if (!this.video_senders.isEmpty()) {
            AbstractC26725a.m79513q("video_senders=", this.video_senders, arrayList);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "ChangePublishQuality{", "}", null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChangePublishQuality(List list, List list2, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2, (i13 & 4) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134488newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePublishQuality(List<AudioSender> audio_senders, List<VideoSender> video_senders, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(audio_senders, "audio_senders");
        AbstractC22676k.m65750j(video_senders, "video_senders");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.audio_senders = AbstractC32103e.m99886h("audio_senders", audio_senders);
        this.video_senders = AbstractC32103e.m99886h("video_senders", video_senders);
    }
}
