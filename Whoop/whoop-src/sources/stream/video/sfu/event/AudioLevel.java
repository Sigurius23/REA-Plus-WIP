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
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\"¨\u0006$"}, m65681d2 = {"Lstream/video/sfu/event/AudioLevel;", "Lcom/squareup/wire/l;", "", "", "user_id", "session_id", "", "level", "", "is_speaking", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;FZLne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;FZLne3/l;)Lstream/video/sfu/event/AudioLevel;", "Ljava/lang/String;", "getUser_id", "getSession_id", "F", "getLevel", "()F", "Z", "()Z", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class AudioLevel extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSpeaking", label = EnumC5595z.f22132F, tag = 4)
    private final boolean is_speaking;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = EnumC5595z.f22132F, tag = 3)
    private final float level;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, tag = 2)
    private final String session_id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = EnumC5595z.f22132F, tag = 1)
    private final String user_id;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(AudioLevel.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.AudioLevel$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public AudioLevel decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                float fFloatValue = 0.0f;
                boolean zBooleanValue = false;
                Object objDecode2 = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new AudioLevel((String) objDecode, (String) objDecode2, fFloatValue, zBooleanValue, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g == 2) {
                        objDecode2 = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g == 3) {
                        fFloatValue = ((Number) AbstractC5586q.FLOAT.decode(reader)).floatValue();
                    } else if (iM16810g != 4) {
                        reader.m16813j(iM16810g);
                    } else {
                        zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(AudioLevel value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getUser_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                if (!Float.valueOf(value.getLevel()).equals(Float.valueOf(0.0f))) {
                    iMo79253d += AbstractC5586q.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getLevel()));
                }
                return value.getIs_speaking() ? AbstractC5586q.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_speaking())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public AudioLevel redact(AudioLevel value) {
                AbstractC22676k.m65750j(value, "value");
                return AudioLevel.copy$default(value, null, null, 0.0f, false, C26624l.f105881E, 15, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, AudioLevel value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getUser_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                if (!Float.valueOf(value.getLevel()).equals(Float.valueOf(0.0f))) {
                    AbstractC5586q.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.getLevel()));
                }
                if (value.getIs_speaking()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getIs_speaking()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, AudioLevel value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getIs_speaking()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getIs_speaking()));
                }
                if (!Float.valueOf(value.getLevel()).equals(Float.valueOf(0.0f))) {
                    AbstractC5586q.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.getLevel()));
                }
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

    public AudioLevel() {
        this(null, null, 0.0f, false, null, 31, null);
    }

    public static /* synthetic */ AudioLevel copy$default(AudioLevel audioLevel, String str, String str2, float f13, boolean z4, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = audioLevel.user_id;
        }
        if ((i13 & 2) != 0) {
            str2 = audioLevel.session_id;
        }
        if ((i13 & 4) != 0) {
            f13 = audioLevel.level;
        }
        if ((i13 & 8) != 0) {
            z4 = audioLevel.is_speaking;
        }
        if ((i13 & 16) != 0) {
            c26624l = audioLevel.unknownFields();
        }
        C26624l c26624l2 = c26624l;
        float f14 = f13;
        return audioLevel.copy(str, str2, f14, z4, c26624l2);
    }

    public final AudioLevel copy(String user_id, String session_id, float level, boolean is_speaking, C26624l unknownFields) {
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new AudioLevel(user_id, session_id, level, is_speaking, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AudioLevel)) {
            return false;
        }
        AudioLevel audioLevel = (AudioLevel) other;
        return AbstractC22676k.m65745e(unknownFields(), audioLevel.unknownFields()) && AbstractC22676k.m65745e(this.user_id, audioLevel.user_id) && AbstractC22676k.m65745e(this.session_id, audioLevel.session_id) && this.level == audioLevel.level && this.is_speaking == audioLevel.is_speaking;
    }

    public final float getLevel() {
        return this.level;
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
        int iHashCode = Boolean.hashCode(this.is_speaking) + AbstractC11266d.m30447a(this.level, AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.user_id), 37, this.session_id), 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: is_speaking, reason: from getter */
    public final boolean getIs_speaking() {
        return this.is_speaking;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134481newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.user_id, "user_id=");
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        arrayList.add("level=" + this.level);
        AbstractC30007c.m91854x("is_speaking=", this.is_speaking, arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "AudioLevel{", "}", null, 56);
    }

    public /* synthetic */ AudioLevel(String str, String str2, float f13, boolean z4, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? 0.0f : f13, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134481newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioLevel(String user_id, String session_id, float f13, boolean z4, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.user_id = user_id;
        this.session_id = session_id;
        this.level = f13;
        this.is_speaking = z4;
    }
}
