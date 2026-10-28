package com.squareup.wire;

import j93.InterfaceC21461d;
import java.io.IOException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.squareup.wire.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5572c extends AbstractC5586q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5572c(InterfaceC21461d type, EnumC5593x syntax, InterfaceC5594y interfaceC5594y) {
        super(EnumC5573d.VARINT, type, null, syntax, interfaceC5594y);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(syntax, "syntax");
    }

    public abstract InterfaceC5594y fromValue(int i13);

    @Override // com.squareup.wire.AbstractC5586q
    public InterfaceC5594y decode(C5587r reader) throws IOException {
        AbstractC22676k.m65750j(reader, "reader");
        int iM16814k = reader.m16814k();
        InterfaceC5594y interfaceC5594yFromValue = fromValue(iM16814k);
        if (interfaceC5594yFromValue != null) {
            return interfaceC5594yFromValue;
        }
        throw new ProtoAdapter$EnumConstantNotFoundException(iM16814k, getType());
    }

    @Override // com.squareup.wire.AbstractC5586q
    public int encodedSize(InterfaceC5594y value) {
        AbstractC22676k.m65750j(value, "value");
        int value2 = value.getValue();
        if ((value2 & (-128)) == 0) {
            return 1;
        }
        if ((value2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & value2) == 0) {
            return 3;
        }
        return (value2 & (-268435456)) == 0 ? 4 : 5;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public InterfaceC5594y redact(InterfaceC5594y value) {
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.AbstractC5586q
    public void encode(C5588s writer, InterfaceC5594y value) throws IOException {
        AbstractC22676k.m65750j(writer, "writer");
        AbstractC22676k.m65750j(value, "value");
        writer.m16820c(value.getValue());
    }

    @Override // com.squareup.wire.AbstractC5586q
    public void encode(C5591v writer, InterfaceC5594y value) {
        AbstractC22676k.m65750j(writer, "writer");
        AbstractC22676k.m65750j(value, "value");
        writer.m16829h(value.getValue());
    }
}
