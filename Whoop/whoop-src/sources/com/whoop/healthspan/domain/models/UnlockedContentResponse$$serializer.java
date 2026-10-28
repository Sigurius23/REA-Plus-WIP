package com.whoop.healthspan.domain.models;

import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/healthspan/domain/models/UnlockedContentResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class UnlockedContentResponse$$serializer implements GeneratedSerializer<UnlockedContentResponse> {
    public static final int $stable;
    public static final UnlockedContentResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        UnlockedContentResponse$$serializer unlockedContentResponse$$serializer = new UnlockedContentResponse$$serializer();
        INSTANCE = unlockedContentResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.healthspan.domain.models.UnlockedContentResponse", unlockedContentResponse$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("datePicker", false);
        pluginGeneratedSerialDescriptor.addElement("isCalibrating", false);
        pluginGeneratedSerialDescriptor.addElement("whoopAgeAmoeba", false);
        pluginGeneratedSerialDescriptor.addElement("previousWhoopAgeAmoeba", false);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("featuredHighlights", false);
        pluginGeneratedSerialDescriptor.addElement("hasBeenSeenByUser", false);
        pluginGeneratedSerialDescriptor.addElement("amoebaOnboardingSteps", false);
        pluginGeneratedSerialDescriptor.addElement("hasOnboarded", false);
        pluginGeneratedSerialDescriptor.addElement("healthspanLabsIntroEnabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UnlockedContentResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = UnlockedContentResponse.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        WhoopAgeAmoeba$$serializer whoopAgeAmoeba$$serializer = WhoopAgeAmoeba$$serializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(DateSelectorModel$$serializer.INSTANCE), booleanSerializer, whoopAgeAmoeba$$serializer, AbstractC38195a.m122336d(whoopAgeAmoeba$$serializer), interfaceC23462hArr[4].getValue(), interfaceC23462hArr[5].getValue(), booleanSerializer, interfaceC23462hArr[7].getValue(), booleanSerializer, AbstractC38195a.m122336d(booleanSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final UnlockedContentResponse deserialize(InterfaceC40541d decoder) {
        boolean z4;
        DateSelectorModel dateSelectorModel;
        List list;
        List list2;
        Boolean bool;
        List list3;
        WhoopAgeAmoeba whoopAgeAmoeba;
        WhoopAgeAmoeba whoopAgeAmoeba2;
        boolean z13;
        int i13;
        boolean z14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = UnlockedContentResponse.$childSerializers;
        int i14 = 9;
        int i15 = 8;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            DateSelectorModel dateSelectorModel2 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, DateSelectorModel$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
            WhoopAgeAmoeba$$serializer whoopAgeAmoeba$$serializer = WhoopAgeAmoeba$$serializer.INSTANCE;
            WhoopAgeAmoeba whoopAgeAmoeba3 = (WhoopAgeAmoeba) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, whoopAgeAmoeba$$serializer, null);
            WhoopAgeAmoeba whoopAgeAmoeba4 = (WhoopAgeAmoeba) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, whoopAgeAmoeba$$serializer, null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            List list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
            list3 = list6;
            dateSelectorModel = dateSelectorModel2;
            bool = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, BooleanSerializer.INSTANCE, null);
            z4 = zDecodeBooleanElement2;
            whoopAgeAmoeba = whoopAgeAmoeba4;
            z13 = zDecodeBooleanElement3;
            whoopAgeAmoeba2 = whoopAgeAmoeba3;
            i13 = 1023;
            list = list5;
            list2 = list4;
            z14 = zDecodeBooleanElement;
        } else {
            int i16 = 5;
            int i17 = 4;
            boolean z15 = true;
            boolean zDecodeBooleanElement4 = false;
            int i18 = 0;
            boolean zDecodeBooleanElement5 = false;
            List list7 = null;
            List list8 = null;
            Boolean bool2 = null;
            List list9 = null;
            WhoopAgeAmoeba whoopAgeAmoeba5 = null;
            DateSelectorModel dateSelectorModel3 = null;
            boolean zDecodeBooleanElement6 = false;
            WhoopAgeAmoeba whoopAgeAmoeba6 = null;
            while (z15) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z15 = false;
                        i15 = 8;
                        i17 = 4;
                        i16 = 5;
                        break;
                    case 0:
                        dateSelectorModel3 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, DateSelectorModel$$serializer.INSTANCE, dateSelectorModel3);
                        i18 |= 1;
                        i14 = 9;
                        i15 = 8;
                        i17 = 4;
                        i16 = 5;
                        break;
                    case 1:
                        zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
                        i18 |= 2;
                        i14 = 9;
                        i17 = 4;
                        i16 = 5;
                        break;
                    case 2:
                        whoopAgeAmoeba6 = (WhoopAgeAmoeba) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, WhoopAgeAmoeba$$serializer.INSTANCE, whoopAgeAmoeba6);
                        i18 |= 4;
                        i14 = 9;
                        i17 = 4;
                        i16 = 5;
                        break;
                    case 3:
                        whoopAgeAmoeba5 = (WhoopAgeAmoeba) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, WhoopAgeAmoeba$$serializer.INSTANCE, whoopAgeAmoeba5);
                        i18 |= 8;
                        i14 = 9;
                        i17 = 4;
                        i16 = 5;
                        break;
                    case 4:
                        list8 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list8);
                        i18 |= 16;
                        i14 = 9;
                        i16 = 5;
                        break;
                    case 5:
                        list7 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list7);
                        i18 |= 32;
                        i14 = 9;
                        break;
                    case 6:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i18 |= 64;
                        break;
                    case 7:
                        list9 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), list9);
                        i18 |= 128;
                        break;
                    case 8:
                        zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i15);
                        i18 |= 256;
                        break;
                    case 9:
                        bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, BooleanSerializer.INSTANCE, bool2);
                        i18 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement4;
            dateSelectorModel = dateSelectorModel3;
            list = list7;
            list2 = list8;
            bool = bool2;
            list3 = list9;
            whoopAgeAmoeba = whoopAgeAmoeba5;
            whoopAgeAmoeba2 = whoopAgeAmoeba6;
            z13 = zDecodeBooleanElement6;
            i13 = i18;
            z14 = zDecodeBooleanElement5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new UnlockedContentResponse(i13, dateSelectorModel, z14, whoopAgeAmoeba2, whoopAgeAmoeba, list2, list, z4, list3, z13, bool, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, UnlockedContentResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        UnlockedContentResponse.write$Self$healthspan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
