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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001c"}, m65681d2 = {"Lstream/video/sfu/event/DominantSpeakerChanged;", "Lcom/squareup/wire/l;", "", "", "user_id", "session_id", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/event/DominantSpeakerChanged;", "Ljava/lang/String;", "getUser_id", "getSession_id", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class DominantSpeakerChanged extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, tag = 2)
    private final String session_id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = EnumC5595z.f22132F, tag = 1)
    private final String user_id;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(DominantSpeakerChanged.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.DominantSpeakerChanged$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public DominantSpeakerChanged decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                Object objDecode2 = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new DominantSpeakerChanged((String) objDecode, (String) objDecode2, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g != 2) {
                        reader.m16813j(iM16810g);
                    } else {
                        objDecode2 = AbstractC5586q.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(DominantSpeakerChanged value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getUser_id());
                }
                return !AbstractC22676k.m65745e(value.getSession_id(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSession_id()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public DominantSpeakerChanged redact(DominantSpeakerChanged value) {
                AbstractC22676k.m65750j(value, "value");
                return DominantSpeakerChanged.copy$default(value, null, null, C26624l.f105881E, 3, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, DominantSpeakerChanged value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getUser_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, DominantSpeakerChanged value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                if (AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getUser_id());
            }
        };
    }

    public DominantSpeakerChanged() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DominantSpeakerChanged copy$default(DominantSpeakerChanged dominantSpeakerChanged, String str, String str2, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dominantSpeakerChanged.user_id;
        }
        if ((i13 & 2) != 0) {
            str2 = dominantSpeakerChanged.session_id;
        }
        if ((i13 & 4) != 0) {
            c26624l = dominantSpeakerChanged.unknownFields();
        }
        return dominantSpeakerChanged.copy(str, str2, c26624l);
    }

    public final DominantSpeakerChanged copy(String user_id, String session_id, C26624l unknownFields) {
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new DominantSpeakerChanged(user_id, session_id, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DominantSpeakerChanged)) {
            return false;
        }
        DominantSpeakerChanged dominantSpeakerChanged = (DominantSpeakerChanged) other;
        return AbstractC22676k.m65745e(unknownFields(), dominantSpeakerChanged.unknownFields()) && AbstractC22676k.m65745e(this.user_id, dominantSpeakerChanged.user_id) && AbstractC22676k.m65745e(this.session_id, dominantSpeakerChanged.session_id);
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.session_id.hashCode() + AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.user_id);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134491newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.user_id, "user_id=");
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "DominantSpeakerChanged{", "}", null, 56);
    }

    public /* synthetic */ DominantSpeakerChanged(String str, String str2, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134491newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DominantSpeakerChanged(String user_id, String session_id, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.user_id = user_id;
        this.session_id = session_id;
    }
}
