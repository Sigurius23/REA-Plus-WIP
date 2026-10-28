package kotlinx.serialization.internal;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import l83.InterfaceC23462h;
import m83.AbstractC25260n;
import p714k80.C22275d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010\u000b\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lkotlinx/serialization/internal/EnumSerializer;", "", "T", "Lwc3/c;", "", "serialName", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "Lyc3/g;", "descriptor", "(Ljava/lang/String;[Ljava/lang/Enum;Lyc3/g;)V", "createUnmarkedDescriptor", "(Ljava/lang/String;)Lyc3/g;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Ljava/lang/Enum;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Ljava/lang/Enum;", "toString", "()Ljava/lang/String;", "[Ljava/lang/Enum;", "overriddenDescriptor", "Lyc3/g;", "descriptor$delegate", "Ll83/h;", "getDescriptor", "()Lyc3/g;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EnumSerializer<T extends Enum<T>> implements InterfaceC37138c {

    /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h descriptor;
    private InterfaceC39443g overriddenDescriptor;
    private final T[] values;

    public EnumSerializer(String serialName, T[] values) {
        AbstractC22676k.m65750j(serialName, "serialName");
        AbstractC22676k.m65750j(values, "values");
        this.values = values;
        this.descriptor = AbstractC30060g.m92088H(new C22275d(1, this, serialName));
    }

    private final InterfaceC39443g createUnmarkedDescriptor(String serialName) {
        EnumDescriptor enumDescriptor = new EnumDescriptor(serialName, this.values.length);
        for (T t14 : this.values) {
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, t14.name(), false, 2, null);
        }
        return enumDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC39443g descriptor_delegate$lambda$0(EnumSerializer enumSerializer, String str) {
        InterfaceC39443g interfaceC39443g = enumSerializer.overriddenDescriptor;
        return interfaceC39443g == null ? enumSerializer.createUnmarkedDescriptor(str) : interfaceC39443g;
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return (InterfaceC39443g) this.descriptor.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + '>';
    }

    @Override // wc3.InterfaceC37137b
    public T deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        int iDecodeEnum = decoder.decodeEnum(getDescriptor());
        if (iDecodeEnum >= 0) {
            T[] tArr = this.values;
            if (iDecodeEnum < tArr.length) {
                return tArr[iDecodeEnum];
            }
        }
        throw new SerializationException(iDecodeEnum + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, T value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        int iM74085z0 = AbstractC25260n.m74085z0(this.values, value);
        if (iM74085z0 != -1) {
            encoder.encodeEnum(getDescriptor(), iM74085z0);
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(value);
        sb4.append(" is not a valid enum ");
        sb4.append(getDescriptor().getSerialName());
        sb4.append(", must be one of ");
        String string = Arrays.toString(this.values);
        AbstractC22676k.m65749i(string, "toString(...)");
        sb4.append(string);
        throw new SerializationException(sb4.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(String serialName, T[] values, InterfaceC39443g descriptor) {
        this(serialName, values);
        AbstractC22676k.m65750j(serialName, "serialName");
        AbstractC22676k.m65750j(values, "values");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.overriddenDescriptor = descriptor;
    }
}
