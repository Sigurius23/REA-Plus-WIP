package com.whoop.home.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/home/domain/models/JournalMetaData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/home/domain/models/JournalMetaData;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/home/domain/models/JournalMetaData;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/home/domain/models/JournalMetaData;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class JournalMetaData$$serializer implements GeneratedSerializer<JournalMetaData> {
    public static final int $stable;
    public static final JournalMetaData$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        JournalMetaData$$serializer journalMetaData$$serializer = new JournalMetaData$$serializer();
        INSTANCE = journalMetaData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.home.domain.models.JournalMetaData", journalMetaData$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("journalCompleted", false);
        pluginGeneratedSerialDescriptor.addElement("hasRecovery", false);
        pluginGeneratedSerialDescriptor.addElement("hasCycle", false);
        pluginGeneratedSerialDescriptor.addElement("journalEnabled", false);
        pluginGeneratedSerialDescriptor.addElement("displayCycleState", false);
        pluginGeneratedSerialDescriptor.addElement("previousCycleDuring", false);
        pluginGeneratedSerialDescriptor.addElement("shouldAutoPop", false);
        pluginGeneratedSerialDescriptor.addElement("hasEnoughRecoveries", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JournalMetaData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, StringSerializer.INSTANCE, CycleDays$$serializer.INSTANCE, booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final JournalMetaData deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        CycleDays cycleDays;
        boolean zDecodeBooleanElement2;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i13 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
            boolean zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            boolean zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            CycleDays cycleDays2 = (CycleDays) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, CycleDays$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            i13 = 255;
            zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
            z4 = zDecodeBooleanElement6;
            cycleDays = cycleDays2;
            z13 = zDecodeBooleanElement5;
            str = strDecodeStringElement;
            z14 = zDecodeBooleanElement4;
            z15 = zDecodeBooleanElement3;
        } else {
            boolean z16 = true;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            CycleDays cycleDays3 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement11 = false;
            while (z16) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z16 = false;
                        break;
                    case 0:
                        i13 |= 1;
                        zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
                        continue;
                    case 1:
                        i13 |= 2;
                        zDecodeBooleanElement10 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
                        continue;
                    case 2:
                        zDecodeBooleanElement9 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                        i13 |= 4;
                        continue;
                    case 3:
                        zDecodeBooleanElement8 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        cycleDays3 = (CycleDays) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, CycleDays$$serializer.INSTANCE, cycleDays3);
                        i13 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement7 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i13 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement11 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
                        i13 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            cycleDays = cycleDays3;
            zDecodeBooleanElement2 = zDecodeBooleanElement11;
            z4 = zDecodeBooleanElement7;
            z13 = zDecodeBooleanElement8;
            z14 = zDecodeBooleanElement9;
            z15 = zDecodeBooleanElement10;
            str = strDecodeStringElement2;
        }
        boolean z17 = zDecodeBooleanElement;
        int i14 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new JournalMetaData(i14, z17, z15, z14, z13, str, cycleDays, z4, zDecodeBooleanElement2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, JournalMetaData value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        JournalMetaData.write$Self$home_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
