package zc3;

import cd3.AbstractC4454f;
import wc3.InterfaceC37137b;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: zc3.b */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC40539b {
    boolean decodeBooleanElement(InterfaceC39443g interfaceC39443g, int i13);

    byte decodeByteElement(InterfaceC39443g interfaceC39443g, int i13);

    char decodeCharElement(InterfaceC39443g interfaceC39443g, int i13);

    int decodeCollectionSize(InterfaceC39443g interfaceC39443g);

    double decodeDoubleElement(InterfaceC39443g interfaceC39443g, int i13);

    int decodeElementIndex(InterfaceC39443g interfaceC39443g);

    float decodeFloatElement(InterfaceC39443g interfaceC39443g, int i13);

    InterfaceC40541d decodeInlineElement(InterfaceC39443g interfaceC39443g, int i13);

    int decodeIntElement(InterfaceC39443g interfaceC39443g, int i13);

    long decodeLongElement(InterfaceC39443g interfaceC39443g, int i13);

    Object decodeNullableSerializableElement(InterfaceC39443g interfaceC39443g, int i13, InterfaceC37137b interfaceC37137b, Object obj);

    boolean decodeSequentially();

    Object decodeSerializableElement(InterfaceC39443g interfaceC39443g, int i13, InterfaceC37137b interfaceC37137b, Object obj);

    short decodeShortElement(InterfaceC39443g interfaceC39443g, int i13);

    String decodeStringElement(InterfaceC39443g interfaceC39443g, int i13);

    void endStructure(InterfaceC39443g interfaceC39443g);

    AbstractC4454f getSerializersModule();
}
