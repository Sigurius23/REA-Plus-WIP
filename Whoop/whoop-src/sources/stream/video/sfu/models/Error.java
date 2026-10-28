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
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lstream/video/sfu/models/Error;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/ErrorCode;", "code", "", "message", "", "should_retry", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/ErrorCode;Ljava/lang/String;ZLne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/ErrorCode;Ljava/lang/String;ZLne3/l;)Lstream/video/sfu/models/Error;", "Lstream/video/sfu/models/ErrorCode;", "getCode", "()Lstream/video/sfu/models/ErrorCode;", "Ljava/lang/String;", "getMessage", "Z", "getShould_retry", "()Z", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class Error extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.ErrorCode#ADAPTER", label = EnumC5595z.f22132F, tag = 1)
    private final ErrorCode code;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 2)
    private final String message;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldRetry", label = EnumC5595z.f22132F, tag = 3)
    private final boolean should_retry;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(Error.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.Error$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public Error decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = ErrorCode.ERROR_CODE_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                Object objDecode2 = "";
                boolean zBooleanValue = false;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new Error((ErrorCode) objDecode, (String) objDecode2, zBooleanValue, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        try {
                            objDecode = ErrorCode.ADAPTER.decode(reader);
                        } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                            reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                        }
                    } else if (iM16810g == 2) {
                        objDecode2 = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g != 3) {
                        reader.m16813j(iM16810g);
                    } else {
                        zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(Error value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getCode() != ErrorCode.ERROR_CODE_UNSPECIFIED) {
                    iMo79253d += ErrorCode.ADAPTER.encodedSizeWithTag(1, value.getCode());
                }
                if (!AbstractC22676k.m65745e(value.getMessage(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getMessage());
                }
                return value.getShould_retry() ? AbstractC5586q.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getShould_retry())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public Error redact(Error value) {
                AbstractC22676k.m65750j(value, "value");
                return Error.copy$default(value, null, null, false, C26624l.f105881E, 7, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, Error value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getCode() != ErrorCode.ERROR_CODE_UNSPECIFIED) {
                    ErrorCode.ADAPTER.encodeWithTag(writer, 1, value.getCode());
                }
                if (!AbstractC22676k.m65745e(value.getMessage(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getMessage());
                }
                if (value.getShould_retry()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getShould_retry()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, Error value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getShould_retry()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getShould_retry()));
                }
                if (!AbstractC22676k.m65745e(value.getMessage(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getMessage());
                }
                if (value.getCode() != ErrorCode.ERROR_CODE_UNSPECIFIED) {
                    ErrorCode.ADAPTER.encodeWithTag(writer, 1, value.getCode());
                }
            }
        };
    }

    public Error() {
        this(null, null, false, null, 15, null);
    }

    public static /* synthetic */ Error copy$default(Error error, ErrorCode errorCode, String str, boolean z4, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            errorCode = error.code;
        }
        if ((i13 & 2) != 0) {
            str = error.message;
        }
        if ((i13 & 4) != 0) {
            z4 = error.should_retry;
        }
        if ((i13 & 8) != 0) {
            c26624l = error.unknownFields();
        }
        return error.copy(errorCode, str, z4, c26624l);
    }

    public final Error copy(ErrorCode code, String message, boolean should_retry, C26624l unknownFields) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new Error(code, message, should_retry, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return AbstractC22676k.m65745e(unknownFields(), error.unknownFields()) && this.code == error.code && AbstractC22676k.m65745e(this.message, error.message) && this.should_retry == error.should_retry;
    }

    public final ErrorCode getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getShould_retry() {
        return this.should_retry;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = Boolean.hashCode(this.should_retry) + AbstractC11266d.m30450d((this.code.hashCode() + (unknownFields().hashCode() * 37)) * 37, 37, this.message);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134528newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("code=" + this.code);
        AbstractC21702c.m61149t(arrayList, this.message, "message=");
        AbstractC30007c.m91854x("should_retry=", this.should_retry, arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "Error{", "}", null, 56);
    }

    public /* synthetic */ Error(ErrorCode errorCode, String str, boolean z4, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ErrorCode.ERROR_CODE_UNSPECIFIED : errorCode, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134528newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Error(ErrorCode code, String message, boolean z4, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.code = code;
        this.message = message;
        this.should_retry = z4;
    }
}
