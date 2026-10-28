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
import java.util.List;
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.C26624l;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p507tx.C34234e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import s30.AbstractC32103e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B5\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\b\u0010\u001dR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lstream/video/sfu/models/InputDevices;", "Lcom/squareup/wire/l;", "", "", "", "available_devices", "current_device", "", "is_permitted", "Lne3/l;", "unknownFields", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;ZLne3/l;)Lstream/video/sfu/models/InputDevices;", "Ljava/lang/String;", "getCurrent_device", "Z", "()Z", "Ljava/util/List;", "getAvailable_devices", "()Ljava/util/List;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class InputDevices extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "availableDevices", label = EnumC5595z.f22136y, tag = 1)
    private final List<String> available_devices;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currentDevice", label = EnumC5595z.f22132F, tag = 2)
    private final String current_device;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPermitted", label = EnumC5595z.f22132F, tag = 3)
    private final boolean is_permitted;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(InputDevices.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.InputDevices$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public InputDevices decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                boolean zBooleanValue = false;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new InputDevices(arrayList, (String) objDecode, zBooleanValue, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        arrayList.add(AbstractC5586q.STRING.decode(reader));
                    } else if (iM16810g == 2) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g != 3) {
                        reader.m16813j(iM16810g);
                    } else {
                        zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(InputDevices value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                AbstractC5586q abstractC5586q = AbstractC5586q.STRING;
                int iEncodedSizeWithTag = abstractC5586q.asRepeated().encodedSizeWithTag(1, value.getAvailable_devices()) + iMo79253d;
                if (!AbstractC22676k.m65745e(value.getCurrent_device(), "")) {
                    iEncodedSizeWithTag += abstractC5586q.encodedSizeWithTag(2, value.getCurrent_device());
                }
                return value.getIs_permitted() ? AbstractC5586q.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_permitted())) + iEncodedSizeWithTag : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public InputDevices redact(InputDevices value) {
                AbstractC22676k.m65750j(value, "value");
                return InputDevices.copy$default(value, null, null, false, C26624l.f105881E, 7, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, InputDevices value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                AbstractC5586q abstractC5586q = AbstractC5586q.STRING;
                abstractC5586q.asRepeated().encodeWithTag(writer, 1, value.getAvailable_devices());
                if (!AbstractC22676k.m65745e(value.getCurrent_device(), "")) {
                    abstractC5586q.encodeWithTag(writer, 2, value.getCurrent_device());
                }
                if (value.getIs_permitted()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getIs_permitted()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, InputDevices value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getIs_permitted()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getIs_permitted()));
                }
                if (!AbstractC22676k.m65745e(value.getCurrent_device(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getCurrent_device());
                }
                AbstractC5586q.STRING.asRepeated().encodeWithTag(writer, 1, value.getAvailable_devices());
            }
        };
    }

    public InputDevices() {
        this(null, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputDevices copy$default(InputDevices inputDevices, List list, String str, boolean z4, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = inputDevices.available_devices;
        }
        if ((i13 & 2) != 0) {
            str = inputDevices.current_device;
        }
        if ((i13 & 4) != 0) {
            z4 = inputDevices.is_permitted;
        }
        if ((i13 & 8) != 0) {
            c26624l = inputDevices.unknownFields();
        }
        return inputDevices.copy(list, str, z4, c26624l);
    }

    public final InputDevices copy(List<String> available_devices, String current_device, boolean is_permitted, C26624l unknownFields) {
        AbstractC22676k.m65750j(available_devices, "available_devices");
        AbstractC22676k.m65750j(current_device, "current_device");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new InputDevices(available_devices, current_device, is_permitted, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InputDevices)) {
            return false;
        }
        InputDevices inputDevices = (InputDevices) other;
        return AbstractC22676k.m65745e(unknownFields(), inputDevices.unknownFields()) && AbstractC22676k.m65745e(this.available_devices, inputDevices.available_devices) && AbstractC22676k.m65745e(this.current_device, inputDevices.current_device) && this.is_permitted == inputDevices.is_permitted;
    }

    public final List<String> getAvailable_devices() {
        return this.available_devices;
    }

    public final String getCurrent_device() {
        return this.current_device;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = Boolean.hashCode(this.is_permitted) + AbstractC11266d.m30450d(AbstractC11895b.m31983b(unknownFields().hashCode() * 37, 37, this.available_devices), 37, this.current_device);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: is_permitted, reason: from getter */
    public final boolean getIs_permitted() {
        return this.is_permitted;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134531newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.available_devices.isEmpty()) {
            List<String> values = this.available_devices;
            AbstractC22676k.m65750j(values, "values");
            arrayList.add("available_devices=" + AbstractC25265s.m74110N0(values, null, "[", "]", C34234e.f143614w, 25));
        }
        AbstractC21702c.m61149t(arrayList, this.current_device, "current_device=");
        AbstractC30007c.m91854x("is_permitted=", this.is_permitted, arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "InputDevices{", "}", null, 56);
    }

    public /* synthetic */ InputDevices(List list, String str, boolean z4, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134531newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputDevices(List<String> available_devices, String current_device, boolean z4, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(available_devices, "available_devices");
        AbstractC22676k.m65750j(current_device, "current_device");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.current_device = current_device;
        this.is_permitted = z4;
        this.available_devices = AbstractC32103e.m99886h("available_devices", available_devices);
    }
}
