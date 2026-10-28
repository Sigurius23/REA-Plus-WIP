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
import com.squareup.wire.ProtoAdapter$EnumConstantNotFoundException;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u0018R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010\u0018¨\u0006#"}, m65681d2 = {"Lstream/video/sfu/models/Sdk;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/SdkType;", "type", "", "major", "minor", "patch", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/SdkType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/SdkType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/models/Sdk;", "Lstream/video/sfu/models/SdkType;", "getType", "()Lstream/video/sfu/models/SdkType;", "Ljava/lang/String;", "getMajor", "getMinor", "getPatch", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class Sdk extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 2)
    private final String major;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 3)
    private final String minor;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 4)
    private final String patch;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.SdkType#ADAPTER", label = EnumC5595z.f22132F, tag = 1)
    private final SdkType type;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(Sdk.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.Sdk$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public Sdk decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = SdkType.SDK_TYPE_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                Object objDecode2 = "";
                Object objDecode3 = objDecode2;
                Object objDecode4 = objDecode3;
                while (true) {
                    Object obj = objDecode;
                    while (true) {
                        int iM16810g = reader.m16810g();
                        if (iM16810g == -1) {
                            return new Sdk((SdkType) obj, (String) objDecode2, (String) objDecode3, (String) objDecode4, reader.m16808e(jM16807d));
                        }
                        if (iM16810g == 1) {
                            try {
                                objDecode = SdkType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                                reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                            }
                        } else if (iM16810g == 2) {
                            objDecode2 = AbstractC5586q.STRING.decode(reader);
                        } else if (iM16810g == 3) {
                            objDecode3 = AbstractC5586q.STRING.decode(reader);
                        } else if (iM16810g != 4) {
                            reader.m16813j(iM16810g);
                        } else {
                            objDecode4 = AbstractC5586q.STRING.decode(reader);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(Sdk value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getType() != SdkType.SDK_TYPE_UNSPECIFIED) {
                    iMo79253d += SdkType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                if (!AbstractC22676k.m65745e(value.getMajor(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getMajor());
                }
                if (!AbstractC22676k.m65745e(value.getMinor(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(3, value.getMinor());
                }
                return !AbstractC22676k.m65745e(value.getPatch(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(4, value.getPatch()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public Sdk redact(Sdk value) {
                AbstractC22676k.m65750j(value, "value");
                return Sdk.copy$default(value, null, null, null, null, C26624l.f105881E, 15, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, Sdk value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getType() != SdkType.SDK_TYPE_UNSPECIFIED) {
                    SdkType.ADAPTER.encodeWithTag(writer, 1, value.getType());
                }
                if (!AbstractC22676k.m65745e(value.getMajor(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getMajor());
                }
                if (!AbstractC22676k.m65745e(value.getMinor(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 3, value.getMinor());
                }
                if (!AbstractC22676k.m65745e(value.getPatch(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 4, value.getPatch());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, Sdk value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (!AbstractC22676k.m65745e(value.getPatch(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 4, value.getPatch());
                }
                if (!AbstractC22676k.m65745e(value.getMinor(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 3, value.getMinor());
                }
                if (!AbstractC22676k.m65745e(value.getMajor(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getMajor());
                }
                if (value.getType() != SdkType.SDK_TYPE_UNSPECIFIED) {
                    SdkType.ADAPTER.encodeWithTag(writer, 1, value.getType());
                }
            }
        };
    }

    public Sdk() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Sdk copy$default(Sdk sdk, SdkType sdkType, String str, String str2, String str3, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            sdkType = sdk.type;
        }
        if ((i13 & 2) != 0) {
            str = sdk.major;
        }
        if ((i13 & 4) != 0) {
            str2 = sdk.minor;
        }
        if ((i13 & 8) != 0) {
            str3 = sdk.patch;
        }
        if ((i13 & 16) != 0) {
            c26624l = sdk.unknownFields();
        }
        C26624l c26624l2 = c26624l;
        String str4 = str2;
        return sdk.copy(sdkType, str, str4, str3, c26624l2);
    }

    public final Sdk copy(SdkType type, String major, String minor, String patch, C26624l unknownFields) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(major, "major");
        AbstractC22676k.m65750j(minor, "minor");
        AbstractC22676k.m65750j(patch, "patch");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new Sdk(type, major, minor, patch, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Sdk)) {
            return false;
        }
        Sdk sdk = (Sdk) other;
        return AbstractC22676k.m65745e(unknownFields(), sdk.unknownFields()) && this.type == sdk.type && AbstractC22676k.m65745e(this.major, sdk.major) && AbstractC22676k.m65745e(this.minor, sdk.minor) && AbstractC22676k.m65745e(this.patch, sdk.patch);
    }

    public final String getMajor() {
        return this.major;
    }

    public final String getMinor() {
        return this.minor;
    }

    public final String getPatch() {
        return this.patch;
    }

    public final SdkType getType() {
        return this.type;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.patch.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.type.hashCode() + (unknownFields().hashCode() * 37)) * 37, 37, this.major), 37, this.minor);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134543newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        AbstractC21702c.m61149t(arrayList, this.major, "major=");
        AbstractC21702c.m61149t(arrayList, this.minor, "minor=");
        AbstractC21702c.m61149t(arrayList, this.patch, "patch=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "Sdk{", "}", null, 56);
    }

    public /* synthetic */ Sdk(SdkType sdkType, String str, String str2, String str3, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? SdkType.SDK_TYPE_UNSPECIFIED : sdkType, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134543newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sdk(SdkType type, String major, String minor, String patch, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(major, "major");
        AbstractC22676k.m65750j(minor, "minor");
        AbstractC22676k.m65750j(patch, "patch");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.type = type;
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }
}
