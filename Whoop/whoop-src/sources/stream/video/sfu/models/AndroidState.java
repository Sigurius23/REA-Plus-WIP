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
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lstream/video/sfu/models/AndroidState;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/AndroidThermalState;", "thermal_state", "", "is_power_saver_mode", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/AndroidThermalState;ZLne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/AndroidThermalState;ZLne3/l;)Lstream/video/sfu/models/AndroidState;", "Lstream/video/sfu/models/AndroidThermalState;", "getThermal_state", "()Lstream/video/sfu/models/AndroidThermalState;", "Z", "()Z", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class AndroidState extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPowerSaverMode", label = EnumC5595z.f22132F, tag = 2)
    private final boolean is_power_saver_mode;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.AndroidThermalState#ADAPTER", jsonName = "thermalState", label = EnumC5595z.f22132F, tag = 1)
    private final AndroidThermalState thermal_state;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(AndroidState.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.AndroidState$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public AndroidState decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = AndroidThermalState.ANDROID_THERMAL_STATE_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                boolean zBooleanValue = false;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new AndroidState((AndroidThermalState) objDecode, zBooleanValue, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        try {
                            objDecode = AndroidThermalState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                            reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                        }
                    } else if (iM16810g != 2) {
                        reader.m16813j(iM16810g);
                    } else {
                        zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(AndroidState value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getThermal_state() != AndroidThermalState.ANDROID_THERMAL_STATE_UNSPECIFIED) {
                    iMo79253d += AndroidThermalState.ADAPTER.encodedSizeWithTag(1, value.getThermal_state());
                }
                return value.getIs_power_saver_mode() ? AbstractC5586q.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_power_saver_mode())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public AndroidState redact(AndroidState value) {
                AbstractC22676k.m65750j(value, "value");
                return AndroidState.copy$default(value, null, false, C26624l.f105881E, 3, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, AndroidState value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getThermal_state() != AndroidThermalState.ANDROID_THERMAL_STATE_UNSPECIFIED) {
                    AndroidThermalState.ADAPTER.encodeWithTag(writer, 1, value.getThermal_state());
                }
                if (value.getIs_power_saver_mode()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getIs_power_saver_mode()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, AndroidState value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getIs_power_saver_mode()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getIs_power_saver_mode()));
                }
                if (value.getThermal_state() != AndroidThermalState.ANDROID_THERMAL_STATE_UNSPECIFIED) {
                    AndroidThermalState.ADAPTER.encodeWithTag(writer, 1, value.getThermal_state());
                }
            }
        };
    }

    public AndroidState() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ AndroidState copy$default(AndroidState androidState, AndroidThermalState androidThermalState, boolean z4, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            androidThermalState = androidState.thermal_state;
        }
        if ((i13 & 2) != 0) {
            z4 = androidState.is_power_saver_mode;
        }
        if ((i13 & 4) != 0) {
            c26624l = androidState.unknownFields();
        }
        return androidState.copy(androidThermalState, z4, c26624l);
    }

    public final AndroidState copy(AndroidThermalState thermal_state, boolean is_power_saver_mode, C26624l unknownFields) {
        AbstractC22676k.m65750j(thermal_state, "thermal_state");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new AndroidState(thermal_state, is_power_saver_mode, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AndroidState)) {
            return false;
        }
        AndroidState androidState = (AndroidState) other;
        return AbstractC22676k.m65745e(unknownFields(), androidState.unknownFields()) && this.thermal_state == androidState.thermal_state && this.is_power_saver_mode == androidState.is_power_saver_mode;
    }

    public final AndroidThermalState getThermal_state() {
        return this.thermal_state;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = Boolean.hashCode(this.is_power_saver_mode) + ((this.thermal_state.hashCode() + (unknownFields().hashCode() * 37)) * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: is_power_saver_mode, reason: from getter */
    public final boolean getIs_power_saver_mode() {
        return this.is_power_saver_mode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134518newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("thermal_state=" + this.thermal_state);
        AbstractC30007c.m91854x("is_power_saver_mode=", this.is_power_saver_mode, arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "AndroidState{", "}", null, 56);
    }

    public /* synthetic */ AndroidState(AndroidThermalState androidThermalState, boolean z4, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AndroidThermalState.ANDROID_THERMAL_STATE_UNSPECIFIED : androidThermalState, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134518newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidState(AndroidThermalState thermal_state, boolean z4, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(thermal_state, "thermal_state");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.thermal_state = thermal_state;
        this.is_power_saver_mode = z4;
    }
}
