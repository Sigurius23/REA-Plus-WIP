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
import jh3.AbstractC21702c;
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
import stream.video.sfu.models.PublishOption;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB+\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lstream/video/sfu/event/ChangePublishOptions;", "Lcom/squareup/wire/l;", "", "", "Lstream/video/sfu/models/PublishOption;", "publish_options", "", "reason", "Lne3/l;", "unknownFields", "<init>", "(Ljava/util/List;Ljava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/event/ChangePublishOptions;", "Ljava/lang/String;", "getReason", "Ljava/util/List;", "getPublish_options", "()Ljava/util/List;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ChangePublishOptions extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.PublishOption#ADAPTER", jsonName = "publishOptions", label = EnumC5595z.f22136y, tag = 1)
    private final List<PublishOption> publish_options;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 2)
    private final String reason;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(ChangePublishOptions.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.ChangePublishOptions$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public ChangePublishOptions decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new ChangePublishOptions(arrayList, (String) objDecode, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        arrayList.add(PublishOption.ADAPTER.decode(reader));
                    } else if (iM16810g != 2) {
                        reader.m16813j(iM16810g);
                    } else {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(ChangePublishOptions value) {
                AbstractC22676k.m65750j(value, "value");
                int iEncodedSizeWithTag = PublishOption.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getPublish_options()) + value.unknownFields().mo79253d();
                return !AbstractC22676k.m65745e(value.getReason(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(2, value.getReason()) + iEncodedSizeWithTag : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public ChangePublishOptions redact(ChangePublishOptions value) {
                AbstractC22676k.m65750j(value, "value");
                return ChangePublishOptions.copy$default(value, AbstractC32103e.m99879a(value.getPublish_options(), PublishOption.ADAPTER), null, C26624l.f105881E, 2, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, ChangePublishOptions value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                PublishOption.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.getPublish_options());
                if (!AbstractC22676k.m65745e(value.getReason(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getReason());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, ChangePublishOptions value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (!AbstractC22676k.m65745e(value.getReason(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getReason());
                }
                PublishOption.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.getPublish_options());
            }
        };
    }

    public ChangePublishOptions() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangePublishOptions copy$default(ChangePublishOptions changePublishOptions, List list, String str, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = changePublishOptions.publish_options;
        }
        if ((i13 & 2) != 0) {
            str = changePublishOptions.reason;
        }
        if ((i13 & 4) != 0) {
            c26624l = changePublishOptions.unknownFields();
        }
        return changePublishOptions.copy(list, str, c26624l);
    }

    public final ChangePublishOptions copy(List<PublishOption> publish_options, String reason, C26624l unknownFields) {
        AbstractC22676k.m65750j(publish_options, "publish_options");
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new ChangePublishOptions(publish_options, reason, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChangePublishOptions)) {
            return false;
        }
        ChangePublishOptions changePublishOptions = (ChangePublishOptions) other;
        return AbstractC22676k.m65745e(unknownFields(), changePublishOptions.unknownFields()) && AbstractC22676k.m65745e(this.publish_options, changePublishOptions.publish_options) && AbstractC22676k.m65745e(this.reason, changePublishOptions.reason);
    }

    public final List<PublishOption> getPublish_options() {
        return this.publish_options;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.reason.hashCode() + AbstractC11895b.m31983b(unknownFields().hashCode() * 37, 37, this.publish_options);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134486newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.publish_options.isEmpty()) {
            AbstractC26725a.m79513q("publish_options=", this.publish_options, arrayList);
        }
        AbstractC21702c.m61149t(arrayList, this.reason, "reason=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "ChangePublishOptions{", "}", null, 56);
    }

    public /* synthetic */ ChangePublishOptions(List list, String str, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134486newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePublishOptions(List<PublishOption> publish_options, String reason, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(publish_options, "publish_options");
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.reason = reason;
        this.publish_options = AbstractC32103e.m99886h("publish_options", publish_options);
    }
}
