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
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0012\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014¨\u0006!"}, m65681d2 = {"Lstream/video/sfu/event/SubscriberOffer;", "Lcom/squareup/wire/l;", "", "", "ice_restart", "", "sdp", "", "negotiation_id", "Lne3/l;", "unknownFields", "<init>", "(ZLjava/lang/String;ILne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;ILne3/l;)Lstream/video/sfu/event/SubscriberOffer;", "Z", "getIce_restart", "()Z", "Ljava/lang/String;", "getSdp", "I", "getNegotiation_id", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class SubscriberOffer extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "iceRestart", label = EnumC5595z.f22132F, tag = 1)
    private final boolean ice_restart;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "negotiationId", label = EnumC5595z.f22132F, tag = 3)
    private final int negotiation_id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 2)
    private final String sdp;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(SubscriberOffer.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.SubscriberOffer$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public SubscriberOffer decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                boolean zBooleanValue = false;
                Object objDecode = "";
                int iIntValue = 0;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new SubscriberOffer(zBooleanValue, (String) objDecode, iIntValue, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    } else if (iM16810g == 2) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g != 3) {
                        reader.m16813j(iM16810g);
                    } else {
                        iIntValue = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(SubscriberOffer value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getIce_restart()) {
                    iMo79253d += AbstractC5586q.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIce_restart()));
                }
                if (!AbstractC22676k.m65745e(value.getSdp(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSdp());
                }
                return value.getNegotiation_id() != 0 ? AbstractC5586q.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getNegotiation_id())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public SubscriberOffer redact(SubscriberOffer value) {
                AbstractC22676k.m65750j(value, "value");
                return SubscriberOffer.copy$default(value, false, null, 0, C26624l.f105881E, 7, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, SubscriberOffer value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getIce_restart()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getIce_restart()));
                }
                if (!AbstractC22676k.m65745e(value.getSdp(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSdp());
                }
                if (value.getNegotiation_id() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getNegotiation_id()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, SubscriberOffer value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getNegotiation_id() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getNegotiation_id()));
                }
                if (!AbstractC22676k.m65745e(value.getSdp(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSdp());
                }
                if (value.getIce_restart()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getIce_restart()));
                }
            }
        };
    }

    public SubscriberOffer() {
        this(false, null, 0, null, 15, null);
    }

    public static /* synthetic */ SubscriberOffer copy$default(SubscriberOffer subscriberOffer, boolean z4, String str, int i13, C26624l c26624l, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z4 = subscriberOffer.ice_restart;
        }
        if ((i14 & 2) != 0) {
            str = subscriberOffer.sdp;
        }
        if ((i14 & 4) != 0) {
            i13 = subscriberOffer.negotiation_id;
        }
        if ((i14 & 8) != 0) {
            c26624l = subscriberOffer.unknownFields();
        }
        return subscriberOffer.copy(z4, str, i13, c26624l);
    }

    public final SubscriberOffer copy(boolean ice_restart, String sdp, int negotiation_id, C26624l unknownFields) {
        AbstractC22676k.m65750j(sdp, "sdp");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new SubscriberOffer(ice_restart, sdp, negotiation_id, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubscriberOffer)) {
            return false;
        }
        SubscriberOffer subscriberOffer = (SubscriberOffer) other;
        return AbstractC22676k.m65745e(unknownFields(), subscriberOffer.unknownFields()) && this.ice_restart == subscriberOffer.ice_restart && AbstractC22676k.m65745e(this.sdp, subscriberOffer.sdp) && this.negotiation_id == subscriberOffer.negotiation_id;
    }

    public final boolean getIce_restart() {
        return this.ice_restart;
    }

    public final int getNegotiation_id() {
        return this.negotiation_id;
    }

    public final String getSdp() {
        return this.sdp;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = Integer.hashCode(this.negotiation_id) + AbstractC11266d.m30450d(AbstractC2875y.m8289b(unknownFields().hashCode() * 37, 37, this.ice_restart), 37, this.sdp);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134513newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC30007c.m91854x("ice_restart=", this.ice_restart, arrayList);
        AbstractC21702c.m61149t(arrayList, this.sdp, "sdp=");
        AbstractC38963t7.m124389s(this.negotiation_id, "negotiation_id=", arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "SubscriberOffer{", "}", null, 56);
    }

    public /* synthetic */ SubscriberOffer(boolean z4, String str, int i13, C26624l c26624l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? false : z4, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134513newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberOffer(boolean z4, String sdp, int i13, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(sdp, "sdp");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.ice_restart = z4;
        this.sdp = sdp;
        this.negotiation_id = i13;
    }
}
