package com.stripe.android.uicore.address;

import java.util.ArrayList;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/stripe/android/uicore/address/FieldSchema.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/uicore/address/FieldSchema;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/stripe/android/uicore/address/FieldSchema;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/stripe/android/uicore/address/FieldSchema;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "stripe-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class FieldSchema$$serializer implements GeneratedSerializer<FieldSchema> {
    public static final int $stable;
    public static final FieldSchema$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FieldSchema$$serializer fieldSchema$$serializer = new FieldSchema$$serializer();
        INSTANCE = fieldSchema$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.uicore.address.FieldSchema", fieldSchema$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("isNumeric", true);
        pluginGeneratedSerialDescriptor.addElement("examples", true);
        pluginGeneratedSerialDescriptor.addElement("nameType", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private FieldSchema$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = FieldSchema.$childSerializers;
        return new InterfaceC37138c[]{BooleanSerializer.INSTANCE, interfaceC37138cArr[1], interfaceC37138cArr[2]};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FieldSchema deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        int i13;
        ArrayList arrayList;
        NameType nameType;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC37138c[] interfaceC37138cArr = FieldSchema.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
            ArrayList arrayList2 = (ArrayList) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, interfaceC37138cArr[1], null);
            nameType = (NameType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, interfaceC37138cArr[2], null);
            i13 = 7;
            arrayList = arrayList2;
        } else {
            boolean z4 = true;
            zDecodeBooleanElement = false;
            ArrayList arrayList3 = null;
            NameType nameType2 = null;
            int i14 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    arrayList3 = (ArrayList) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, interfaceC37138cArr[1], arrayList3);
                    i14 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    nameType2 = (NameType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, interfaceC37138cArr[2], nameType2);
                    i14 |= 4;
                }
            }
            i13 = i14;
            arrayList = arrayList3;
            nameType = nameType2;
        }
        boolean z13 = zDecodeBooleanElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FieldSchema(i13, z13, arrayList, nameType, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FieldSchema value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FieldSchema.write$Self$stripe_ui_core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }
}
