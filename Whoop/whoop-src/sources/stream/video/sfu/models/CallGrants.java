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
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, m65681d2 = {"Lstream/video/sfu/models/CallGrants;", "Lcom/squareup/wire/l;", "", "", "can_publish_audio", "can_publish_video", "can_screenshare", "Lne3/l;", "unknownFields", "<init>", "(ZZZLne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(ZZZLne3/l;)Lstream/video/sfu/models/CallGrants;", "Z", "getCan_publish_audio", "()Z", "getCan_publish_video", "getCan_screenshare", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class CallGrants extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "canPublishAudio", label = EnumC5595z.f22132F, tag = 1)
    private final boolean can_publish_audio;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "canPublishVideo", label = EnumC5595z.f22132F, tag = 2)
    private final boolean can_publish_video;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "canScreenshare", label = EnumC5595z.f22132F, tag = 3)
    private final boolean can_screenshare;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(CallGrants.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.CallGrants$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public CallGrants decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new CallGrants(zBooleanValue, zBooleanValue2, zBooleanValue3, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    } else if (iM16810g == 2) {
                        zBooleanValue2 = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    } else if (iM16810g != 3) {
                        reader.m16813j(iM16810g);
                    } else {
                        zBooleanValue3 = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(CallGrants value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getCan_publish_audio()) {
                    iMo79253d += AbstractC5586q.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getCan_publish_audio()));
                }
                if (value.getCan_publish_video()) {
                    iMo79253d += AbstractC5586q.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getCan_publish_video()));
                }
                return value.getCan_screenshare() ? AbstractC5586q.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getCan_screenshare())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public CallGrants redact(CallGrants value) {
                AbstractC22676k.m65750j(value, "value");
                return CallGrants.copy$default(value, false, false, false, C26624l.f105881E, 7, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, CallGrants value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getCan_publish_audio()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getCan_publish_audio()));
                }
                if (value.getCan_publish_video()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getCan_publish_video()));
                }
                if (value.getCan_screenshare()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getCan_screenshare()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, CallGrants value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getCan_screenshare()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getCan_screenshare()));
                }
                if (value.getCan_publish_video()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getCan_publish_video()));
                }
                if (value.getCan_publish_audio()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getCan_publish_audio()));
                }
            }
        };
    }

    public CallGrants() {
        this(false, false, false, null, 15, null);
    }

    public static /* synthetic */ CallGrants copy$default(CallGrants callGrants, boolean z4, boolean z13, boolean z14, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = callGrants.can_publish_audio;
        }
        if ((i13 & 2) != 0) {
            z13 = callGrants.can_publish_video;
        }
        if ((i13 & 4) != 0) {
            z14 = callGrants.can_screenshare;
        }
        if ((i13 & 8) != 0) {
            c26624l = callGrants.unknownFields();
        }
        return callGrants.copy(z4, z13, z14, c26624l);
    }

    public final CallGrants copy(boolean can_publish_audio, boolean can_publish_video, boolean can_screenshare, C26624l unknownFields) {
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new CallGrants(can_publish_audio, can_publish_video, can_screenshare, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CallGrants)) {
            return false;
        }
        CallGrants callGrants = (CallGrants) other;
        return AbstractC22676k.m65745e(unknownFields(), callGrants.unknownFields()) && this.can_publish_audio == callGrants.can_publish_audio && this.can_publish_video == callGrants.can_publish_video && this.can_screenshare == callGrants.can_screenshare;
    }

    public final boolean getCan_publish_audio() {
        return this.can_publish_audio;
    }

    public final boolean getCan_publish_video() {
        return this.can_publish_video;
    }

    public final boolean getCan_screenshare() {
        return this.can_screenshare;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = Boolean.hashCode(this.can_screenshare) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(unknownFields().hashCode() * 37, 37, this.can_publish_audio), 37, this.can_publish_video);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134523newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC30007c.m91854x("can_publish_audio=", this.can_publish_audio, arrayList);
        AbstractC30007c.m91854x("can_publish_video=", this.can_publish_video, arrayList);
        AbstractC30007c.m91854x("can_screenshare=", this.can_screenshare, arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "CallGrants{", "}", null, 56);
    }

    public /* synthetic */ CallGrants(boolean z4, boolean z13, boolean z14, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134523newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallGrants(boolean z4, boolean z13, boolean z14, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.can_publish_audio = z4;
        this.can_publish_video = z13;
        this.can_screenshare = z14;
    }
}
