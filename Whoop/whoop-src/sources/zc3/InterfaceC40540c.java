package zc3;

import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: zc3.c */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC40540c {
    void encodeBooleanElement(InterfaceC39443g interfaceC39443g, int i13, boolean z4);

    void encodeByteElement(InterfaceC39443g interfaceC39443g, int i13, byte b);

    void encodeCharElement(InterfaceC39443g interfaceC39443g, int i13, char c3);

    void encodeDoubleElement(InterfaceC39443g interfaceC39443g, int i13, double d3);

    void encodeFloatElement(InterfaceC39443g interfaceC39443g, int i13, float f13);

    InterfaceC40542e encodeInlineElement(InterfaceC39443g interfaceC39443g, int i13);

    void encodeIntElement(InterfaceC39443g interfaceC39443g, int i13, int i14);

    void encodeLongElement(InterfaceC39443g interfaceC39443g, int i13, long j7);

    void encodeNullableSerializableElement(InterfaceC39443g interfaceC39443g, int i13, InterfaceC37145j interfaceC37145j, Object obj);

    void encodeSerializableElement(InterfaceC39443g interfaceC39443g, int i13, InterfaceC37145j interfaceC37145j, Object obj);

    void encodeShortElement(InterfaceC39443g interfaceC39443g, int i13, short s13);

    void encodeStringElement(InterfaceC39443g interfaceC39443g, int i13, String str);

    void endStructure(InterfaceC39443g interfaceC39443g);

    boolean shouldEncodeElementDefault(InterfaceC39443g interfaceC39443g, int i13);
}
