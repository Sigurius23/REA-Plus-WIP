package com.whoop.design.models.items;

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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/CountrySelectorModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/CountrySelectorModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/CountrySelectorModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/CountrySelectorModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CountrySelectorModel$$serializer implements GeneratedSerializer<CountrySelectorModel> {
    public static final int $stable;
    public static final CountrySelectorModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CountrySelectorModel$$serializer countrySelectorModel$$serializer = new CountrySelectorModel$$serializer();
        INSTANCE = countrySelectorModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.CountrySelectorModel", countrySelectorModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("selectedCountry", false);
        pluginGeneratedSerialDescriptor.addElement("headerText", false);
        pluginGeneratedSerialDescriptor.addElement("searchPlaceholderText", false);
        pluginGeneratedSerialDescriptor.addElement("confirmButton", false);
        pluginGeneratedSerialDescriptor.addElement("cancelButton", false);
        pluginGeneratedSerialDescriptor.addElement("countries", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CountrySelectorModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CountrySelectorModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, CountryModel$$serializer.INSTANCE, stringSerializer, stringSerializer, cardButtonModel$$serializer, cardButtonModel$$serializer, interfaceC23462hArr[6].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CountrySelectorModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        CardButtonModel cardButtonModel;
        String str;
        CountryModel countryModel;
        String str2;
        String str3;
        CardButtonModel cardButtonModel2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CountrySelectorModel.$childSerializers;
        int i14 = 5;
        int i15 = 3;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            CountryModel countryModel2 = (CountryModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, CountryModel$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
            CardButtonModel cardButtonModel3 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, cardButtonModel$$serializer, null);
            CardButtonModel cardButtonModel4 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, cardButtonModel$$serializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str = strDecodeStringElement2;
            cardButtonModel = cardButtonModel4;
            str3 = strDecodeStringElement4;
            cardButtonModel2 = cardButtonModel3;
            str2 = strDecodeStringElement3;
            i13 = 127;
            countryModel = countryModel2;
        } else {
            boolean z4 = true;
            int i16 = 0;
            List list2 = null;
            CardButtonModel cardButtonModel5 = null;
            CountryModel countryModel3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            CardButtonModel cardButtonModel6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i14 = 5;
                        i15 = 3;
                        break;
                    case 1:
                        countryModel3 = (CountryModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, CountryModel$$serializer.INSTANCE, countryModel3);
                        i16 |= 2;
                        i14 = 5;
                        i15 = 3;
                        break;
                    case 2:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i15);
                        i16 |= 8;
                        break;
                    case 4:
                        cardButtonModel6 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, CardButtonModel$$serializer.INSTANCE, cardButtonModel6);
                        i16 |= 16;
                        break;
                    case 5:
                        cardButtonModel5 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, CardButtonModel$$serializer.INSTANCE, cardButtonModel5);
                        i16 |= 32;
                        break;
                    case 6:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), list2);
                        i16 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            list = list2;
            cardButtonModel = cardButtonModel5;
            str = strDecodeStringElement;
            countryModel = countryModel3;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            cardButtonModel2 = cardButtonModel6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CountrySelectorModel(i13, str, countryModel, str2, str3, cardButtonModel2, cardButtonModel, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CountrySelectorModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CountrySelectorModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
