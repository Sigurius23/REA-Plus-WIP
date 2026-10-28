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
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BC\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u0018R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b!\u0010\u0018¨\u0006#"}, m65681d2 = {"Lstream/video/sfu/models/Codec;", "Lcom/squareup/wire/l;", "", "", "payload_type", "", "name", "clock_rate", "encoding_parameters", "fmtp", "Lne3/l;", "unknownFields", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/models/Codec;", "I", "getPayload_type", "Ljava/lang/String;", "getName", "getClock_rate", "getEncoding_parameters", "getFmtp", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class Codec extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "clockRate", label = EnumC5595z.f22132F, schemaIndex = 2, tag = 14)
    private final int clock_rate;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "encodingParameters", label = EnumC5595z.f22132F, schemaIndex = 3, tag = 15)
    private final String encoding_parameters;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, schemaIndex = 4, tag = 12)
    private final String fmtp;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, schemaIndex = 1, tag = 10)
    private final String name;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "payloadType", label = EnumC5595z.f22132F, schemaIndex = 0, tag = 16)
    private final int payload_type;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(Codec.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.Codec$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public Codec decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                int iIntValue = 0;
                int iIntValue2 = 0;
                Object objDecode2 = "";
                Object objDecode3 = objDecode2;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new Codec(iIntValue, (String) objDecode, iIntValue2, (String) objDecode2, (String) objDecode3, reader.m16808e(jM16807d));
                    }
                    switch (iM16810g) {
                        case 10:
                            objDecode = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 11:
                        case 13:
                        default:
                            reader.m16813j(iM16810g);
                            break;
                        case 12:
                            objDecode3 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 14:
                            iIntValue2 = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                            break;
                        case 15:
                            objDecode2 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 16:
                            iIntValue = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(Codec value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getPayload_type() != 0) {
                    iMo79253d += AbstractC5586q.UINT32.encodedSizeWithTag(16, Integer.valueOf(value.getPayload_type()));
                }
                if (!AbstractC22676k.m65745e(value.getName(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(10, value.getName());
                }
                if (value.getClock_rate() != 0) {
                    iMo79253d += AbstractC5586q.UINT32.encodedSizeWithTag(14, Integer.valueOf(value.getClock_rate()));
                }
                if (!AbstractC22676k.m65745e(value.getEncoding_parameters(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(15, value.getEncoding_parameters());
                }
                return !AbstractC22676k.m65745e(value.getFmtp(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(12, value.getFmtp()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public Codec redact(Codec value) {
                AbstractC22676k.m65750j(value, "value");
                return Codec.copy$default(value, 0, null, 0, null, null, C26624l.f105881E, 31, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, Codec value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getPayload_type() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 16, Integer.valueOf(value.getPayload_type()));
                }
                if (!AbstractC22676k.m65745e(value.getName(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 10, value.getName());
                }
                if (value.getClock_rate() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 14, Integer.valueOf(value.getClock_rate()));
                }
                if (!AbstractC22676k.m65745e(value.getEncoding_parameters(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 15, value.getEncoding_parameters());
                }
                if (!AbstractC22676k.m65745e(value.getFmtp(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 12, value.getFmtp());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, Codec value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (!AbstractC22676k.m65745e(value.getFmtp(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 12, value.getFmtp());
                }
                if (!AbstractC22676k.m65745e(value.getEncoding_parameters(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 15, value.getEncoding_parameters());
                }
                if (value.getClock_rate() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 14, Integer.valueOf(value.getClock_rate()));
                }
                if (!AbstractC22676k.m65745e(value.getName(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 10, value.getName());
                }
                if (value.getPayload_type() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 16, Integer.valueOf(value.getPayload_type()));
                }
            }
        };
    }

    public Codec() {
        this(0, null, 0, null, null, null, 63, null);
    }

    public static /* synthetic */ Codec copy$default(Codec codec, int i13, String str, int i14, String str2, String str3, C26624l c26624l, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = codec.payload_type;
        }
        if ((i15 & 2) != 0) {
            str = codec.name;
        }
        if ((i15 & 4) != 0) {
            i14 = codec.clock_rate;
        }
        if ((i15 & 8) != 0) {
            str2 = codec.encoding_parameters;
        }
        if ((i15 & 16) != 0) {
            str3 = codec.fmtp;
        }
        if ((i15 & 32) != 0) {
            c26624l = codec.unknownFields();
        }
        String str4 = str3;
        C26624l c26624l2 = c26624l;
        return codec.copy(i13, str, i14, str2, str4, c26624l2);
    }

    public final Codec copy(int payload_type, String name, int clock_rate, String encoding_parameters, String fmtp, C26624l unknownFields) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(encoding_parameters, "encoding_parameters");
        AbstractC22676k.m65750j(fmtp, "fmtp");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new Codec(payload_type, name, clock_rate, encoding_parameters, fmtp, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Codec)) {
            return false;
        }
        Codec codec = (Codec) other;
        return AbstractC22676k.m65745e(unknownFields(), codec.unknownFields()) && this.payload_type == codec.payload_type && AbstractC22676k.m65745e(this.name, codec.name) && this.clock_rate == codec.clock_rate && AbstractC22676k.m65745e(this.encoding_parameters, codec.encoding_parameters) && AbstractC22676k.m65745e(this.fmtp, codec.fmtp);
    }

    public final int getClock_rate() {
        return this.clock_rate;
    }

    public final String getEncoding_parameters() {
        return this.encoding_parameters;
    }

    public final String getFmtp() {
        return this.fmtp;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPayload_type() {
        return this.payload_type;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.fmtp.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.clock_rate, AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.payload_type, unknownFields().hashCode() * 37, 37), 37, this.name), 37), 37, this.encoding_parameters);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134526newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC38963t7.m124389s(this.payload_type, "payload_type=", arrayList);
        AbstractC21702c.m61149t(arrayList, this.name, "name=");
        AbstractC38963t7.m124389s(this.clock_rate, "clock_rate=", arrayList);
        AbstractC21702c.m61149t(arrayList, this.encoding_parameters, "encoding_parameters=");
        AbstractC21702c.m61149t(arrayList, this.fmtp, "fmtp=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "Codec{", "}", null, 56);
    }

    public /* synthetic */ Codec(int i13, String str, int i14, String str2, String str3, C26624l c26624l, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? 0 : i14, (i15 & 8) != 0 ? "" : str2, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134526newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Codec(int i13, String name, int i14, String encoding_parameters, String fmtp, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(encoding_parameters, "encoding_parameters");
        AbstractC22676k.m65750j(fmtp, "fmtp");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.payload_type = i13;
        this.name = name;
        this.clock_rate = i14;
        this.encoding_parameters = encoding_parameters;
        this.fmtp = fmtp;
    }
}
