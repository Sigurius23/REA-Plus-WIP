package zc3;

import cd3.AbstractC4454f;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: zc3.e */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC40542e {
    InterfaceC40540c beginCollection(InterfaceC39443g interfaceC39443g, int i13);

    InterfaceC40540c beginStructure(InterfaceC39443g interfaceC39443g);

    void encodeBoolean(boolean z4);

    void encodeByte(byte b);

    void encodeChar(char c3);

    void encodeDouble(double d3);

    void encodeEnum(InterfaceC39443g interfaceC39443g, int i13);

    void encodeFloat(float f13);

    InterfaceC40542e encodeInline(InterfaceC39443g interfaceC39443g);

    void encodeInt(int i13);

    void encodeLong(long j7);

    void encodeNotNullMark();

    void encodeNull();

    default void encodeNullableSerializableValue(InterfaceC37145j serializer, Object obj) {
        AbstractC22676k.m65750j(serializer, "serializer");
        if (serializer.getDescriptor().isNullable()) {
            encodeSerializableValue(serializer, obj);
        } else if (obj == null) {
            encodeNull();
        } else {
            encodeNotNullMark();
            encodeSerializableValue(serializer, obj);
        }
    }

    void encodeSerializableValue(InterfaceC37145j interfaceC37145j, Object obj);

    void encodeShort(short s13);

    void encodeString(String str);

    AbstractC4454f getSerializersModule();
}
