package zc3;

import cd3.AbstractC4454f;
import wc3.InterfaceC37137b;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: zc3.d */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC40541d {
    InterfaceC40539b beginStructure(InterfaceC39443g interfaceC39443g);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(InterfaceC39443g interfaceC39443g);

    float decodeFloat();

    InterfaceC40541d decodeInline(InterfaceC39443g interfaceC39443g);

    int decodeInt();

    long decodeLong();

    boolean decodeNotNullMark();

    Void decodeNull();

    Object decodeSerializableValue(InterfaceC37137b interfaceC37137b);

    short decodeShort();

    String decodeString();

    AbstractC4454f getSerializersModule();
}
