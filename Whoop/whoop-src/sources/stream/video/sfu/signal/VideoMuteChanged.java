package stream.video.sfu.signal;

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
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lstream/video/sfu/signal/VideoMuteChanged;", "Lcom/squareup/wire/l;", "", "", "muted", "Lne3/l;", "unknownFields", "<init>", "(ZLne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(ZLne3/l;)Lstream/video/sfu/signal/VideoMuteChanged;", "Z", "getMuted", "()Z", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class VideoMuteChanged extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = EnumC5595z.f22132F, tag = 2)
    private final boolean muted;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(VideoMuteChanged.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.signal.VideoMuteChanged$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public VideoMuteChanged decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                boolean zBooleanValue = false;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new VideoMuteChanged(zBooleanValue, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 2) {
                        zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    } else {
                        reader.m16813j(iM16810g);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(VideoMuteChanged value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                return value.getMuted() ? AbstractC5586q.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getMuted())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public VideoMuteChanged redact(VideoMuteChanged value) {
                AbstractC22676k.m65750j(value, "value");
                return VideoMuteChanged.copy$default(value, false, C26624l.f105881E, 1, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, VideoMuteChanged value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getMuted()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getMuted()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, VideoMuteChanged value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getMuted()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getMuted()));
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoMuteChanged() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VideoMuteChanged copy$default(VideoMuteChanged videoMuteChanged, boolean z4, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = videoMuteChanged.muted;
        }
        if ((i13 & 2) != 0) {
            c26624l = videoMuteChanged.unknownFields();
        }
        return videoMuteChanged.copy(z4, c26624l);
    }

    public final VideoMuteChanged copy(boolean muted, C26624l unknownFields) {
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new VideoMuteChanged(muted, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof VideoMuteChanged)) {
            return false;
        }
        VideoMuteChanged videoMuteChanged = (VideoMuteChanged) other;
        return AbstractC22676k.m65745e(unknownFields(), videoMuteChanged.unknownFields()) && this.muted == videoMuteChanged.muted;
    }

    public final boolean getMuted() {
        return this.muted;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = Boolean.hashCode(this.muted) + (unknownFields().hashCode() * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134573newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC30007c.m91854x("muted=", this.muted, arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "VideoMuteChanged{", "}", null, 56);
    }

    public /* synthetic */ VideoMuteChanged(boolean z4, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134573newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMuteChanged(boolean z4, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.muted = z4;
    }
}
