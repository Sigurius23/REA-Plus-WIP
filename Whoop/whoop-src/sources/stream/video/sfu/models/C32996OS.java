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

/* JADX INFO: renamed from: stream.video.sfu.models.OS */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001e"}, m65681d2 = {"Lstream/video/sfu/models/OS;", "Lcom/squareup/wire/l;", "", "", "name", "version", "architecture", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/models/OS;", "Ljava/lang/String;", "getName", "getVersion", "getArchitecture", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class C32996OS extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 3)
    private final String architecture;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 1)
    private final String name;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 2)
    private final String version;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32996OS.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.OS$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public C32996OS decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                Object objDecode2 = "";
                Object objDecode3 = objDecode2;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new C32996OS((String) objDecode, (String) objDecode2, (String) objDecode3, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g == 2) {
                        objDecode2 = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g != 3) {
                        reader.m16813j(iM16810g);
                    } else {
                        objDecode3 = AbstractC5586q.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(C32996OS value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getName(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getName());
                }
                if (!AbstractC22676k.m65745e(value.getVersion(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getVersion());
                }
                return !AbstractC22676k.m65745e(value.getArchitecture(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(3, value.getArchitecture()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public C32996OS redact(C32996OS value) {
                AbstractC22676k.m65750j(value, "value");
                return C32996OS.copy$default(value, null, null, null, C26624l.f105881E, 7, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, C32996OS value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getName(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getName());
                }
                if (!AbstractC22676k.m65745e(value.getVersion(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getVersion());
                }
                if (!AbstractC22676k.m65745e(value.getArchitecture(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 3, value.getArchitecture());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, C32996OS value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (!AbstractC22676k.m65745e(value.getArchitecture(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 3, value.getArchitecture());
                }
                if (!AbstractC22676k.m65745e(value.getVersion(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getVersion());
                }
                if (AbstractC22676k.m65745e(value.getName(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getName());
            }
        };
    }

    public C32996OS() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ C32996OS copy$default(C32996OS c32996os, String str, String str2, String str3, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c32996os.name;
        }
        if ((i13 & 2) != 0) {
            str2 = c32996os.version;
        }
        if ((i13 & 4) != 0) {
            str3 = c32996os.architecture;
        }
        if ((i13 & 8) != 0) {
            c26624l = c32996os.unknownFields();
        }
        return c32996os.copy(str, str2, str3, c26624l);
    }

    public final C32996OS copy(String name, String version, String architecture, C26624l unknownFields) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(architecture, "architecture");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new C32996OS(name, version, architecture, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof C32996OS)) {
            return false;
        }
        C32996OS c32996os = (C32996OS) other;
        return AbstractC22676k.m65745e(unknownFields(), c32996os.unknownFields()) && AbstractC22676k.m65745e(this.name, c32996os.name) && AbstractC22676k.m65745e(this.version, c32996os.version) && AbstractC22676k.m65745e(this.architecture, c32996os.architecture);
    }

    public final String getArchitecture() {
        return this.architecture;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.architecture.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.name), 37, this.version);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134532newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.name, "name=");
        AbstractC21702c.m61149t(arrayList, this.version, "version=");
        AbstractC21702c.m61149t(arrayList, this.architecture, "architecture=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "OS{", "}", null, 56);
    }

    public /* synthetic */ C32996OS(String str, String str2, String str3, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134532newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32996OS(String name, String version, String architecture, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(architecture, "architecture");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.name = name;
        this.version = version;
        this.architecture = architecture;
    }
}
