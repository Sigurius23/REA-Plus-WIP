package com.whoop.training.data.network.response.hrsettings;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/training/data/network/response/hrsettings/HeartRateEntryRow.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HeartRateEntryRow$$serializer implements GeneratedSerializer<HeartRateEntryRow> {
    public static final int $stable;
    public static final HeartRateEntryRow$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HeartRateEntryRow$$serializer heartRateEntryRow$$serializer = new HeartRateEntryRow$$serializer();
        INSTANCE = heartRateEntryRow$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.training.data.network.response.hrsettings.HeartRateEntryRow", heartRateEntryRow$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("units", false);
        pluginGeneratedSerialDescriptor.addElement("editable", false);
        pluginGeneratedSerialDescriptor.addElement("minValue", false);
        pluginGeneratedSerialDescriptor.addElement("maxValue", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HeartRateEntryRow$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, intSerializer, stringSerializer, BooleanSerializer.INSTANCE, intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HeartRateEntryRow deserialize(InterfaceC40541d decoder) {
        String strDecodeStringElement;
        int iDecodeIntElement;
        int i13;
        String str;
        boolean z4;
        int i14;
        String str2;
        int i15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            int iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 5);
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 6);
            i13 = iDecodeIntElement3;
            str = strDecodeStringElement3;
            z4 = zDecodeBooleanElement;
            i14 = iDecodeIntElement2;
            str2 = strDecodeStringElement2;
            i15 = 127;
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            boolean z13 = true;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement6 = 0;
            int i16 = 0;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        continue;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement6 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
                        i16 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        iDecodeIntElement5 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 5);
                        i16 |= 32;
                        break;
                    case 6:
                        iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 6);
                        i16 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement4;
            i13 = iDecodeIntElement5;
            str = strDecodeStringElement4;
            z4 = zDecodeBooleanElement2;
            i14 = iDecodeIntElement6;
            str2 = strDecodeStringElement5;
            i15 = i16;
        }
        String str3 = strDecodeStringElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HeartRateEntryRow(i15, str3, str2, i14, str, z4, i13, iDecodeIntElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HeartRateEntryRow value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HeartRateEntryRow.write$Self$training_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
