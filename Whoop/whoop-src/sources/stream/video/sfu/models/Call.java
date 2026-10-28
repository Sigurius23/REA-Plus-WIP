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
import java.time.Instant;
import java.util.ArrayList;
import java.util.Map;
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import s30.AbstractC32103e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Bs\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJy\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b$\u0010\u001dR\"\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\"\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b(\u0010'R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Lstream/video/sfu/models/Call;", "Lcom/squareup/wire/l;", "", "", "type", "id", "created_by_user_id", "host_user_id", "", "custom", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/time/Instant;Ljava/time/Instant;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/time/Instant;Ljava/time/Instant;Lne3/l;)Lstream/video/sfu/models/Call;", "Ljava/lang/String;", "getType", "getId", "getCreated_by_user_id", "getHost_user_id", "Ljava/time/Instant;", "getCreated_at", "()Ljava/time/Instant;", "getUpdated_at", "Ljava/util/Map;", "getCustom", "()Ljava/util/Map;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class Call extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = EnumC5595z.f22132F, tag = 6)
    private final Instant created_at;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdByUserId", label = EnumC5595z.f22132F, tag = 3)
    private final String created_by_user_id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = EnumC5595z.f22132F, tag = 5)
    private final Map<String, ?> custom;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "hostUserId", label = EnumC5595z.f22132F, tag = 4)
    private final String host_user_id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 2)
    private final String id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 1)
    private final String type;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = EnumC5595z.f22132F, tag = 7)
    private final Instant updated_at;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(Call.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.Call$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public Call decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                Object objDecode2 = "";
                Object objDecode3 = objDecode2;
                Object objDecode4 = null;
                Object objDecode5 = null;
                Object objDecode6 = null;
                Object objDecode7 = objDecode3;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new Call((String) objDecode, (String) objDecode7, (String) objDecode2, (String) objDecode3, (Map) objDecode4, (Instant) objDecode5, (Instant) objDecode6, reader.m16808e(jM16807d));
                    }
                    switch (iM16810g) {
                        case 1:
                            objDecode = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 2:
                            objDecode7 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 3:
                            objDecode2 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 4:
                            objDecode3 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 5:
                            objDecode4 = AbstractC5586q.STRUCT_MAP.decode(reader);
                            break;
                        case 6:
                            objDecode5 = AbstractC5586q.INSTANT.decode(reader);
                            break;
                        case 7:
                            objDecode6 = AbstractC5586q.INSTANT.decode(reader);
                            break;
                        default:
                            reader.m16813j(iM16810g);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(Call value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getType(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getType());
                }
                if (!AbstractC22676k.m65745e(value.getId(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getId());
                }
                if (!AbstractC22676k.m65745e(value.getCreated_by_user_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(3, value.getCreated_by_user_id());
                }
                if (!AbstractC22676k.m65745e(value.getHost_user_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(4, value.getHost_user_id());
                }
                if (value.getCustom() != null) {
                    iMo79253d += AbstractC5586q.STRUCT_MAP.encodedSizeWithTag(5, value.getCustom());
                }
                if (value.getCreated_at() != null) {
                    iMo79253d += AbstractC5586q.INSTANT.encodedSizeWithTag(6, value.getCreated_at());
                }
                return value.getUpdated_at() != null ? AbstractC5586q.INSTANT.encodedSizeWithTag(7, value.getUpdated_at()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public Call redact(Call value) {
                AbstractC22676k.m65750j(value, "value");
                Map<String, ?> custom = value.getCustom();
                Map map = custom != null ? (Map) AbstractC5586q.STRUCT_MAP.redact(custom) : null;
                Instant created_at = value.getCreated_at();
                Instant instant = created_at != null ? (Instant) AbstractC5586q.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                return Call.copy$default(value, null, null, null, null, map, instant, updated_at != null ? (Instant) AbstractC5586q.INSTANT.redact(updated_at) : null, C26624l.f105881E, 15, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, Call value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getType(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getType());
                }
                if (!AbstractC22676k.m65745e(value.getId(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getId());
                }
                if (!AbstractC22676k.m65745e(value.getCreated_by_user_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 3, value.getCreated_by_user_id());
                }
                if (!AbstractC22676k.m65745e(value.getHost_user_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 4, value.getHost_user_id());
                }
                if (value.getCustom() != null) {
                    AbstractC5586q.STRUCT_MAP.encodeWithTag(writer, 5, value.getCustom());
                }
                if (value.getCreated_at() != null) {
                    AbstractC5586q.INSTANT.encodeWithTag(writer, 6, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    AbstractC5586q.INSTANT.encodeWithTag(writer, 7, value.getUpdated_at());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, Call value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getUpdated_at() != null) {
                    AbstractC5586q.INSTANT.encodeWithTag(writer, 7, value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    AbstractC5586q.INSTANT.encodeWithTag(writer, 6, value.getCreated_at());
                }
                if (value.getCustom() != null) {
                    AbstractC5586q.STRUCT_MAP.encodeWithTag(writer, 5, value.getCustom());
                }
                if (!AbstractC22676k.m65745e(value.getHost_user_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 4, value.getHost_user_id());
                }
                if (!AbstractC22676k.m65745e(value.getCreated_by_user_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 3, value.getCreated_by_user_id());
                }
                if (!AbstractC22676k.m65745e(value.getId(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getId());
                }
                if (AbstractC22676k.m65745e(value.getType(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getType());
            }
        };
    }

    public Call() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Call copy$default(Call call, String str, String str2, String str3, String str4, Map map, Instant instant, Instant instant2, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = call.type;
        }
        if ((i13 & 2) != 0) {
            str2 = call.id;
        }
        if ((i13 & 4) != 0) {
            str3 = call.created_by_user_id;
        }
        if ((i13 & 8) != 0) {
            str4 = call.host_user_id;
        }
        if ((i13 & 16) != 0) {
            map = call.custom;
        }
        if ((i13 & 32) != 0) {
            instant = call.created_at;
        }
        if ((i13 & 64) != 0) {
            instant2 = call.updated_at;
        }
        if ((i13 & 128) != 0) {
            c26624l = call.unknownFields();
        }
        Instant instant3 = instant2;
        C26624l c26624l2 = c26624l;
        Map map2 = map;
        Instant instant4 = instant;
        return call.copy(str, str2, str3, str4, map2, instant4, instant3, c26624l2);
    }

    public final Call copy(String type, String id4, String created_by_user_id, String host_user_id, Map<String, ?> custom, Instant created_at, Instant updated_at, C26624l unknownFields) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(created_by_user_id, "created_by_user_id");
        AbstractC22676k.m65750j(host_user_id, "host_user_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new Call(type, id4, created_by_user_id, host_user_id, custom, created_at, updated_at, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Call)) {
            return false;
        }
        Call call = (Call) other;
        return AbstractC22676k.m65745e(unknownFields(), call.unknownFields()) && AbstractC22676k.m65745e(this.type, call.type) && AbstractC22676k.m65745e(this.id, call.id) && AbstractC22676k.m65745e(this.created_by_user_id, call.created_by_user_id) && AbstractC22676k.m65745e(this.host_user_id, call.host_user_id) && AbstractC22676k.m65745e(this.custom, call.custom) && AbstractC22676k.m65745e(this.created_at, call.created_at) && AbstractC22676k.m65745e(this.updated_at, call.updated_at);
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final String getCreated_by_user_id() {
        return this.created_by_user_id;
    }

    public final Map<String, ?> getCustom() {
        return this.custom;
    }

    public final String getHost_user_id() {
        return this.host_user_id;
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.type), 37, this.id), 37, this.created_by_user_id), 37, this.host_user_id);
        Map<String, ?> map = this.custom;
        int iHashCode = (iM30450d + (map != null ? map.hashCode() : 0)) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134522newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.type, "type=");
        AbstractC21702c.m61149t(arrayList, this.id, "id=");
        AbstractC21702c.m61149t(arrayList, this.created_by_user_id, "created_by_user_id=");
        AbstractC21702c.m61149t(arrayList, this.host_user_id, "host_user_id=");
        Map<String, ?> map = this.custom;
        if (map != null) {
            arrayList.add("custom=" + map);
        }
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "Call{", "}", null, 56);
    }

    public /* synthetic */ Call(String str, String str2, String str3, String str4, Map map, Instant instant, Instant instant2, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? null : map, (i13 & 32) != 0 ? null : instant, (i13 & 64) != 0 ? null : instant2, (i13 & 128) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134522newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Call(String type, String id4, String created_by_user_id, String host_user_id, Map<String, ?> map, Instant instant, Instant instant2, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(created_by_user_id, "created_by_user_id");
        AbstractC22676k.m65750j(host_user_id, "host_user_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.type = type;
        this.id = id4;
        this.created_by_user_id = created_by_user_id;
        this.host_user_id = host_user_id;
        this.created_at = instant;
        this.updated_at = instant2;
        this.custom = (Map) AbstractC32103e.m99887i(map);
    }
}
