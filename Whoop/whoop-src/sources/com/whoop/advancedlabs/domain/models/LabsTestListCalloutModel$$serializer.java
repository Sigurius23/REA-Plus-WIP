package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/advancedlabs/domain/models/LabsTestListCalloutModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/advancedlabs/domain/models/LabsTestListCalloutModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/LabsTestListCalloutModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/LabsTestListCalloutModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class LabsTestListCalloutModel$$serializer implements GeneratedSerializer<LabsTestListCalloutModel> {
    public static final int $stable;
    public static final LabsTestListCalloutModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        LabsTestListCalloutModel$$serializer labsTestListCalloutModel$$serializer = new LabsTestListCalloutModel$$serializer();
        INSTANCE = labsTestListCalloutModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.advancedlabs.domain.models.LabsTestListCalloutModel", labsTestListCalloutModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryButton", false);
        pluginGeneratedSerialDescriptor.addElement("testItems", false);
        pluginGeneratedSerialDescriptor.addElement("expandText", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryTitle", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryTestItems", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LabsTestListCalloutModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = LabsTestListCalloutModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, SecondaryButtonModel$$serializer.INSTANCE, interfaceC23462hArr[3].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final LabsTestListCalloutModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        String str;
        String str2;
        String str3;
        SecondaryButtonModel secondaryButtonModel;
        List list2;
        String str4;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = LabsTestListCalloutModel.$childSerializers;
        int i14 = 5;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            SecondaryButtonModel secondaryButtonModel2 = (SecondaryButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, SecondaryButtonModel$$serializer.INSTANCE, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str2 = strDecodeStringElement2;
            str = str6;
            str4 = str5;
            secondaryButtonModel = secondaryButtonModel2;
            i13 = 127;
            list2 = list3;
            str3 = strDecodeStringElement3;
        } else {
            boolean z4 = true;
            int i15 = 0;
            List list4 = null;
            String str7 = null;
            String strDecodeStringElement4 = null;
            SecondaryButtonModel secondaryButtonModel3 = null;
            List list5 = null;
            String str8 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 5;
                        break;
                    case 1:
                        c3 = 2;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i15 |= 2;
                        i14 = 5;
                        break;
                    case 2:
                        c3 = 2;
                        secondaryButtonModel3 = (SecondaryButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, SecondaryButtonModel$$serializer.INSTANCE, secondaryButtonModel3);
                        i15 |= 4;
                        i14 = 5;
                        break;
                    case 3:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), list5);
                        i15 |= 8;
                        break;
                    case 4:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str8);
                        i15 |= 16;
                        break;
                    case 5:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str7);
                        i15 |= 32;
                        break;
                    case 6:
                        list4 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), list4);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            list = list4;
            str = str7;
            str2 = strDecodeStringElement;
            str3 = strDecodeStringElement4;
            secondaryButtonModel = secondaryButtonModel3;
            list2 = list5;
            str4 = str8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new LabsTestListCalloutModel(i13, str2, str3, secondaryButtonModel, list2, str4, str, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, LabsTestListCalloutModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        LabsTestListCalloutModel.write$Self$advanced_labs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
