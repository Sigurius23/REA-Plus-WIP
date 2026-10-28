package zc3;

import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.NoOpEncoder;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: zc3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC40538a implements InterfaceC40542e, InterfaceC40540c {
    @Override // zc3.InterfaceC40542e
    public InterfaceC40540c beginCollection(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return beginStructure(descriptor);
    }

    @Override // zc3.InterfaceC40542e
    public InterfaceC40540c beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return this;
    }

    @Override // zc3.InterfaceC40542e
    public void encodeBoolean(boolean z4) {
        encodeValue(Boolean.valueOf(z4));
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeBooleanElement(InterfaceC39443g descriptor, int i13, boolean z4) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (encodeElement(descriptor, i13)) {
            encodeBoolean(z4);
        }
    }

    @Override // zc3.InterfaceC40542e
    public void encodeByte(byte b) {
        encodeValue(Byte.valueOf(b));
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeByteElement(InterfaceC39443g descriptor, int i13, byte b) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (encodeElement(descriptor, i13)) {
            encodeByte(b);
        }
    }

    @Override // zc3.InterfaceC40542e
    public void encodeChar(char c3) {
        encodeValue(Character.valueOf(c3));
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeCharElement(InterfaceC39443g descriptor, int i13, char c3) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (encodeElement(descriptor, i13)) {
            encodeChar(c3);
        }
    }

    @Override // zc3.InterfaceC40542e
    public void encodeDouble(double d3) {
        encodeValue(Double.valueOf(d3));
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeDoubleElement(InterfaceC39443g descriptor, int i13, double d3) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (encodeElement(descriptor, i13)) {
            encodeDouble(d3);
        }
    }

    public boolean encodeElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return true;
    }

    @Override // zc3.InterfaceC40542e
    public void encodeEnum(InterfaceC39443g enumDescriptor, int i13) {
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        encodeValue(Integer.valueOf(i13));
    }

    @Override // zc3.InterfaceC40542e
    public void encodeFloat(float f13) {
        encodeValue(Float.valueOf(f13));
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeFloatElement(InterfaceC39443g descriptor, int i13, float f13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (encodeElement(descriptor, i13)) {
            encodeFloat(f13);
        }
    }

    @Override // zc3.InterfaceC40542e
    public InterfaceC40542e encodeInline(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return this;
    }

    @Override // zc3.InterfaceC40540c
    public final InterfaceC40542e encodeInlineElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return encodeElement(descriptor, i13) ? encodeInline(descriptor.getElementDescriptor(i13)) : NoOpEncoder.INSTANCE;
    }

    @Override // zc3.InterfaceC40542e
    public void encodeInt(int i13) {
        encodeValue(Integer.valueOf(i13));
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeIntElement(InterfaceC39443g descriptor, int i13, int i14) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (encodeElement(descriptor, i13)) {
            encodeInt(i14);
        }
    }

    @Override // zc3.InterfaceC40542e
    public void encodeLong(long j7) {
        encodeValue(Long.valueOf(j7));
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeLongElement(InterfaceC39443g descriptor, int i13, long j7) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (encodeElement(descriptor, i13)) {
            encodeLong(j7);
        }
    }

    @Override // zc3.InterfaceC40542e
    public void encodeNotNullMark() {
    }

    @Override // zc3.InterfaceC40542e
    public void encodeNull() {
        throw new SerializationException("'null' is not supported by default");
    }

    public <T> void encodeNullableSerializableElement(InterfaceC39443g descriptor, int i13, InterfaceC37145j serializer, T t14) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(serializer, "serializer");
        if (encodeElement(descriptor, i13)) {
            encodeNullableSerializableValue(serializer, t14);
        }
    }

    @Override // zc3.InterfaceC40542e
    public <T> void encodeNullableSerializableValue(InterfaceC37145j interfaceC37145j, T t14) {
        super.encodeNullableSerializableValue(interfaceC37145j, t14);
    }

    @Override // zc3.InterfaceC40540c
    public <T> void encodeSerializableElement(InterfaceC39443g descriptor, int i13, InterfaceC37145j serializer, T t14) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(serializer, "serializer");
        if (encodeElement(descriptor, i13)) {
            encodeSerializableValue(serializer, t14);
        }
    }

    @Override // zc3.InterfaceC40542e
    public <T> void encodeSerializableValue(InterfaceC37145j serializer, T t14) {
        AbstractC22676k.m65750j(serializer, "serializer");
        serializer.serialize(this, t14);
    }

    @Override // zc3.InterfaceC40542e
    public void encodeShort(short s13) {
        encodeValue(Short.valueOf(s13));
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeShortElement(InterfaceC39443g descriptor, int i13, short s13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (encodeElement(descriptor, i13)) {
            encodeShort(s13);
        }
    }

    @Override // zc3.InterfaceC40542e
    public void encodeString(String value) {
        AbstractC22676k.m65750j(value, "value");
        encodeValue(value);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeStringElement(InterfaceC39443g descriptor, int i13, String value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(value, "value");
        if (encodeElement(descriptor, i13)) {
            encodeString(value);
        }
    }

    public void encodeValue(Object value) {
        AbstractC22676k.m65750j(value, "value");
        StringBuilder sb4 = new StringBuilder("Non-serializable ");
        Class<?> cls = value.getClass();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(cls));
        sb4.append(" is not supported by ");
        sb4.append(c22673i0.getOrCreateKotlinClass(getClass()));
        sb4.append(" encoder");
        throw new SerializationException(sb4.toString());
    }

    public void endStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
    }

    public boolean shouldEncodeElementDefault(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return true;
    }
}
