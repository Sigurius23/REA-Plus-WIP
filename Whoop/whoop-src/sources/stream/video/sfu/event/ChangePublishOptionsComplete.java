package stream.video.sfu.event;

import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.C5587r;
import com.squareup.wire.C5588s;
import com.squareup.wire.C5591v;
import com.squareup.wire.EnumC5573d;
import com.squareup.wire.EnumC5593x;
import j93.InterfaceC21461d;
import l83.InterfaceC23457c;
import ne3.C26624l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lstream/video/sfu/event/ChangePublishOptionsComplete;", "Lcom/squareup/wire/l;", "", "Lne3/l;", "unknownFields", "<init>", "(Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lne3/l;)Lstream/video/sfu/event/ChangePublishOptionsComplete;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ChangePublishOptionsComplete extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(ChangePublishOptionsComplete.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.ChangePublishOptionsComplete$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public ChangePublishOptionsComplete decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new ChangePublishOptionsComplete(reader.m16808e(jM16807d));
                    }
                    reader.m16813j(iM16810g);
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(ChangePublishOptionsComplete value) {
                AbstractC22676k.m65750j(value, "value");
                return value.unknownFields().mo79253d();
            }

            @Override // com.squareup.wire.AbstractC5586q
            public ChangePublishOptionsComplete redact(ChangePublishOptionsComplete value) {
                AbstractC22676k.m65750j(value, "value");
                return value.copy(C26624l.f105881E);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, ChangePublishOptionsComplete value) {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, ChangePublishOptionsComplete value) {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangePublishOptionsComplete() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChangePublishOptionsComplete copy$default(ChangePublishOptionsComplete changePublishOptionsComplete, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c26624l = changePublishOptionsComplete.unknownFields();
        }
        return changePublishOptionsComplete.copy(c26624l);
    }

    public final ChangePublishOptionsComplete copy(C26624l unknownFields) {
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new ChangePublishOptionsComplete(unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof ChangePublishOptionsComplete) && AbstractC22676k.m65745e(unknownFields(), ((ChangePublishOptionsComplete) other).unknownFields());
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134487newBuilder();
    }

    public String toString() {
        return "ChangePublishOptionsComplete{}";
    }

    public /* synthetic */ ChangePublishOptionsComplete(C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134487newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePublishOptionsComplete(C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
    }
}
