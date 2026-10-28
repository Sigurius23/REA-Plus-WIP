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
import hc3.AbstractC17176i;
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
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ]\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u001bR\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b&\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b'\u0010\u001bR\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b(\u0010\u001b¨\u0006*"}, m65681d2 = {"Lstream/video/sfu/models/RTMPIngress;", "Lcom/squareup/wire/l;", "", "", "width", "height", "", "frame_rate", "", "software", "version", "encoder", "remote_addr", "Lne3/l;", "unknownFields", "<init>", "(IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/models/RTMPIngress;", "I", "getWidth", "getHeight", "D", "getFrame_rate", "()D", "Ljava/lang/String;", "getSoftware", "getVersion", "getEncoder", "getRemote_addr", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class RTMPIngress extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 6)
    private final String encoder;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "frameRate", label = EnumC5595z.f22132F, tag = 3)
    private final double frame_rate;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = EnumC5595z.f22132F, tag = 2)
    private final int height;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "remoteAddr", label = EnumC5595z.f22132F, tag = 7)
    private final String remote_addr;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 4)
    private final String software;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 5)
    private final String version;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = EnumC5595z.f22132F, tag = 1)
    private final int width;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(RTMPIngress.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.RTMPIngress$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public RTMPIngress decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                int iIntValue = 0;
                int iIntValue2 = 0;
                double dDoubleValue = 0.0d;
                Object objDecode2 = "";
                Object objDecode3 = objDecode2;
                Object objDecode4 = objDecode3;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new RTMPIngress(iIntValue, iIntValue2, dDoubleValue, (String) objDecode, (String) objDecode2, (String) objDecode3, (String) objDecode4, reader.m16808e(jM16807d));
                    }
                    switch (iM16810g) {
                        case 1:
                            iIntValue = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                            break;
                        case 2:
                            iIntValue2 = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                            break;
                        case 3:
                            dDoubleValue = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                            break;
                        case 4:
                            objDecode = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 5:
                            objDecode2 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 6:
                            objDecode3 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 7:
                            objDecode4 = AbstractC5586q.STRING.decode(reader);
                            break;
                        default:
                            reader.m16813j(iM16810g);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(RTMPIngress value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getWidth() != 0) {
                    iMo79253d += AbstractC5586q.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getWidth()));
                }
                if (value.getHeight() != 0) {
                    iMo79253d += AbstractC5586q.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getHeight()));
                }
                if (!Double.valueOf(value.getFrame_rate()).equals(Double.valueOf(0.0d))) {
                    iMo79253d += AbstractC5586q.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getFrame_rate()));
                }
                if (!AbstractC22676k.m65745e(value.getSoftware(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(4, value.getSoftware());
                }
                if (!AbstractC22676k.m65745e(value.getVersion(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(5, value.getVersion());
                }
                if (!AbstractC22676k.m65745e(value.getEncoder(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(6, value.getEncoder());
                }
                return !AbstractC22676k.m65745e(value.getRemote_addr(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(7, value.getRemote_addr()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public RTMPIngress redact(RTMPIngress value) {
                AbstractC22676k.m65750j(value, "value");
                return RTMPIngress.copy$default(value, 0, 0, 0.0d, null, null, null, null, C26624l.f105881E, 127, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, RTMPIngress value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getWidth() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getWidth()));
                }
                if (value.getHeight() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getHeight()));
                }
                if (!Double.valueOf(value.getFrame_rate()).equals(Double.valueOf(0.0d))) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 3, Double.valueOf(value.getFrame_rate()));
                }
                if (!AbstractC22676k.m65745e(value.getSoftware(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 4, value.getSoftware());
                }
                if (!AbstractC22676k.m65745e(value.getVersion(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 5, value.getVersion());
                }
                if (!AbstractC22676k.m65745e(value.getEncoder(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 6, value.getEncoder());
                }
                if (!AbstractC22676k.m65745e(value.getRemote_addr(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 7, value.getRemote_addr());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, RTMPIngress value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (!AbstractC22676k.m65745e(value.getRemote_addr(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 7, value.getRemote_addr());
                }
                if (!AbstractC22676k.m65745e(value.getEncoder(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 6, value.getEncoder());
                }
                if (!AbstractC22676k.m65745e(value.getVersion(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 5, value.getVersion());
                }
                if (!AbstractC22676k.m65745e(value.getSoftware(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 4, value.getSoftware());
                }
                if (!Double.valueOf(value.getFrame_rate()).equals(Double.valueOf(0.0d))) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 3, Double.valueOf(value.getFrame_rate()));
                }
                if (value.getHeight() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getHeight()));
                }
                if (value.getWidth() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getWidth()));
                }
            }
        };
    }

    public RTMPIngress() {
        this(0, 0, 0.0d, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ RTMPIngress copy$default(RTMPIngress rTMPIngress, int i13, int i14, double d3, String str, String str2, String str3, String str4, C26624l c26624l, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = rTMPIngress.width;
        }
        if ((i15 & 2) != 0) {
            i14 = rTMPIngress.height;
        }
        if ((i15 & 4) != 0) {
            d3 = rTMPIngress.frame_rate;
        }
        if ((i15 & 8) != 0) {
            str = rTMPIngress.software;
        }
        if ((i15 & 16) != 0) {
            str2 = rTMPIngress.version;
        }
        if ((i15 & 32) != 0) {
            str3 = rTMPIngress.encoder;
        }
        if ((i15 & 64) != 0) {
            str4 = rTMPIngress.remote_addr;
        }
        if ((i15 & 128) != 0) {
            c26624l = rTMPIngress.unknownFields();
        }
        C26624l c26624l2 = c26624l;
        String str5 = str3;
        String str6 = str;
        double d14 = d3;
        return rTMPIngress.copy(i13, i14, d14, str6, str2, str5, str4, c26624l2);
    }

    public final RTMPIngress copy(int width, int height, double frame_rate, String software, String version, String encoder, String remote_addr, C26624l unknownFields) {
        AbstractC22676k.m65750j(software, "software");
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(remote_addr, "remote_addr");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new RTMPIngress(width, height, frame_rate, software, version, encoder, remote_addr, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RTMPIngress)) {
            return false;
        }
        RTMPIngress rTMPIngress = (RTMPIngress) other;
        return AbstractC22676k.m65745e(unknownFields(), rTMPIngress.unknownFields()) && this.width == rTMPIngress.width && this.height == rTMPIngress.height && this.frame_rate == rTMPIngress.frame_rate && AbstractC22676k.m65745e(this.software, rTMPIngress.software) && AbstractC22676k.m65745e(this.version, rTMPIngress.version) && AbstractC22676k.m65745e(this.encoder, rTMPIngress.encoder) && AbstractC22676k.m65745e(this.remote_addr, rTMPIngress.remote_addr);
    }

    public final String getEncoder() {
        return this.encoder;
    }

    public final double getFrame_rate() {
        return this.frame_rate;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getRemote_addr() {
        return this.remote_addr;
    }

    public final String getSoftware() {
        return this.software;
    }

    public final String getVersion() {
        return this.version;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.remote_addr.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC17176i.m48499a(AbstractC11266d.m30448b(this.height, AbstractC11266d.m30448b(this.width, unknownFields().hashCode() * 37, 37), 37), 37, this.frame_rate), 37, this.software), 37, this.version), 37, this.encoder);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134539newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC38963t7.m124389s(this.width, "width=", arrayList);
        AbstractC38963t7.m124389s(this.height, "height=", arrayList);
        arrayList.add("frame_rate=" + this.frame_rate);
        AbstractC21702c.m61149t(arrayList, this.software, "software=");
        AbstractC21702c.m61149t(arrayList, this.version, "version=");
        AbstractC21702c.m61149t(arrayList, this.encoder, "encoder=");
        AbstractC21702c.m61149t(arrayList, this.remote_addr, "remote_addr=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "RTMPIngress{", "}", null, 56);
    }

    public /* synthetic */ RTMPIngress(int i13, int i14, double d3, String str, String str2, String str3, String str4, C26624l c26624l, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? 0.0d : d3, (i15 & 8) != 0 ? "" : str, (i15 & 16) != 0 ? "" : str2, (i15 & 32) != 0 ? "" : str3, (i15 & 64) != 0 ? "" : str4, (i15 & 128) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134539newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTMPIngress(int i13, int i14, double d3, String software, String version, String encoder, String remote_addr, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(software, "software");
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(remote_addr, "remote_addr");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.width = i13;
        this.height = i14;
        this.frame_rate = d3;
        this.software = software;
        this.version = version;
        this.encoder = encoder;
        this.remote_addr = remote_addr;
    }
}
