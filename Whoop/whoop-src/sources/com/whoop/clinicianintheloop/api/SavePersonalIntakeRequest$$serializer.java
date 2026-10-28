package com.whoop.clinicianintheloop.api;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/clinicianintheloop/api/SavePersonalIntakeRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SavePersonalIntakeRequest$$serializer implements GeneratedSerializer<SavePersonalIntakeRequest> {
    public static final int $stable;
    public static final SavePersonalIntakeRequest$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SavePersonalIntakeRequest$$serializer savePersonalIntakeRequest$$serializer = new SavePersonalIntakeRequest$$serializer();
        INSTANCE = savePersonalIntakeRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.clinicianintheloop.api.SavePersonalIntakeRequest", savePersonalIntakeRequest$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("firstName", false);
        pluginGeneratedSerialDescriptor.addElement("lastName", false);
        pluginGeneratedSerialDescriptor.addElement("dateOfBirth", false);
        pluginGeneratedSerialDescriptor.addElement("address_line_1", false);
        pluginGeneratedSerialDescriptor.addElement("address_line_2", false);
        pluginGeneratedSerialDescriptor.addElement("city", false);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        pluginGeneratedSerialDescriptor.addElement("zipCode", false);
        pluginGeneratedSerialDescriptor.addElement("country", false);
        pluginGeneratedSerialDescriptor.addElement("phoneNumber", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SavePersonalIntakeRequest$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SavePersonalIntakeRequest deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String strDecodeStringElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, null);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            str2 = strDecodeStringElement3;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            str8 = strDecodeStringElement9;
            str7 = strDecodeStringElement8;
            str6 = strDecodeStringElement7;
            str5 = strDecodeStringElement6;
            str9 = strDecodeStringElement10;
            str = str10;
            str4 = strDecodeStringElement5;
            str3 = strDecodeStringElement4;
            i13 = 1023;
        } else {
            boolean z4 = true;
            int i14 = 0;
            String str11 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i14 |= 1;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        continue;
                    case 1:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 |= 2;
                        continue;
                    case 2:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i14 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str11);
                        i14 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i14 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement15 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i14 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement16 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i14 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement17 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i14 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement18 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i14 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i14;
            str = str11;
            str2 = strDecodeStringElement2;
            str3 = strDecodeStringElement11;
            str4 = strDecodeStringElement12;
            str5 = strDecodeStringElement13;
            str6 = strDecodeStringElement14;
            str7 = strDecodeStringElement15;
            str8 = strDecodeStringElement16;
            str9 = strDecodeStringElement17;
            strDecodeStringElement = strDecodeStringElement18;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SavePersonalIntakeRequest(i13, str2, str3, str4, str5, str, str6, str7, str8, str9, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SavePersonalIntakeRequest value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SavePersonalIntakeRequest.write$Self$clinician_in_the_loop_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
