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
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lstream/video/sfu/models/RtpBase;", "Lcom/squareup/wire/l;", "", "", "ssrc", "", "kind", "", "timestamp_ms", "Lne3/l;", "unknownFields", "<init>", "(ILjava/lang/String;DLne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;DLne3/l;)Lstream/video/sfu/models/RtpBase;", "I", "getSsrc", "Ljava/lang/String;", "getKind", "D", "getTimestamp_ms", "()D", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class RtpBase extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 2)
    private final String kind;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = EnumC5595z.f22132F, tag = 1)
    private final int ssrc;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "timestampMs", label = EnumC5595z.f22132F, tag = 3)
    private final double timestamp_ms;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(RtpBase.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.RtpBase$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public RtpBase decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                double dDoubleValue = 0.0d;
                int iIntValue = 0;
                while (true) {
                    double d3 = dDoubleValue;
                    while (true) {
                        int iM16810g = reader.m16810g();
                        if (iM16810g == -1) {
                            return new RtpBase(iIntValue, (String) objDecode, d3, reader.m16808e(jM16807d));
                        }
                        if (iM16810g == 1) {
                            iIntValue = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                        } else if (iM16810g == 2) {
                            objDecode = AbstractC5586q.STRING.decode(reader);
                        } else if (iM16810g != 3) {
                            reader.m16813j(iM16810g);
                        }
                    }
                    dDoubleValue = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(RtpBase value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getSsrc() != 0) {
                    iMo79253d += AbstractC5586q.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getSsrc()));
                }
                if (!AbstractC22676k.m65745e(value.getKind(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getKind());
                }
                return !Double.valueOf(value.getTimestamp_ms()).equals(Double.valueOf(0.0d)) ? AbstractC5586q.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getTimestamp_ms())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public RtpBase redact(RtpBase value) {
                AbstractC22676k.m65750j(value, "value");
                return RtpBase.copy$default(value, 0, null, 0.0d, C26624l.f105881E, 7, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, RtpBase value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getSsrc() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getSsrc()));
                }
                if (!AbstractC22676k.m65745e(value.getKind(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getKind());
                }
                if (!Double.valueOf(value.getTimestamp_ms()).equals(Double.valueOf(0.0d))) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 3, Double.valueOf(value.getTimestamp_ms()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, RtpBase value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (!Double.valueOf(value.getTimestamp_ms()).equals(Double.valueOf(0.0d))) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 3, Double.valueOf(value.getTimestamp_ms()));
                }
                if (!AbstractC22676k.m65745e(value.getKind(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getKind());
                }
                if (value.getSsrc() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getSsrc()));
                }
            }
        };
    }

    public RtpBase() {
        this(0, null, 0.0d, null, 15, null);
    }

    public static /* synthetic */ RtpBase copy$default(RtpBase rtpBase, int i13, String str, double d3, C26624l c26624l, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = rtpBase.ssrc;
        }
        if ((i14 & 2) != 0) {
            str = rtpBase.kind;
        }
        if ((i14 & 4) != 0) {
            d3 = rtpBase.timestamp_ms;
        }
        if ((i14 & 8) != 0) {
            c26624l = rtpBase.unknownFields();
        }
        C26624l c26624l2 = c26624l;
        return rtpBase.copy(i13, str, d3, c26624l2);
    }

    public final RtpBase copy(int ssrc, String kind, double timestamp_ms, C26624l unknownFields) {
        AbstractC22676k.m65750j(kind, "kind");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new RtpBase(ssrc, kind, timestamp_ms, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RtpBase)) {
            return false;
        }
        RtpBase rtpBase = (RtpBase) other;
        return AbstractC22676k.m65745e(unknownFields(), rtpBase.unknownFields()) && this.ssrc == rtpBase.ssrc && AbstractC22676k.m65745e(this.kind, rtpBase.kind) && this.timestamp_ms == rtpBase.timestamp_ms;
    }

    public final String getKind() {
        return this.kind;
    }

    public final int getSsrc() {
        return this.ssrc;
    }

    public final double getTimestamp_ms() {
        return this.timestamp_ms;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = Double.hashCode(this.timestamp_ms) + AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.ssrc, unknownFields().hashCode() * 37, 37), 37, this.kind);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134542newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC38963t7.m124389s(this.ssrc, "ssrc=", arrayList);
        AbstractC21702c.m61149t(arrayList, this.kind, "kind=");
        arrayList.add("timestamp_ms=" + this.timestamp_ms);
        return AbstractC25265s.m74110N0(arrayList, ", ", "RtpBase{", "}", null, 56);
    }

    public /* synthetic */ RtpBase(int i13, String str, double d3, C26624l c26624l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? 0.0d : d3, (i14 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134542newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtpBase(int i13, String kind, double d3, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(kind, "kind");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.ssrc = i13;
        this.kind = kind;
        this.timestamp_ms = d3;
    }
}
