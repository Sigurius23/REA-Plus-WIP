package com.whoop.design.models.items;

import gz0.EnumC16313m0;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/NavigationBarModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/NavigationBarModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/NavigationBarModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/NavigationBarModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class NavigationBarModel$$serializer implements GeneratedSerializer<NavigationBarModel> {
    public static final int $stable;
    public static final NavigationBarModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        NavigationBarModel$$serializer navigationBarModel$$serializer = new NavigationBarModel$$serializer();
        INSTANCE = navigationBarModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.NavigationBarModel", navigationBarModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("leftButton", true);
        pluginGeneratedSerialDescriptor.addElement("rightButton", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("fixedHeader", true);
        pluginGeneratedSerialDescriptor.addElement("header", true);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NavigationBarModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = NavigationBarModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue());
        NavigationButtonModel$$serializer navigationButtonModel$$serializer = NavigationButtonModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, AbstractC38195a.m122336d(navigationButtonModel$$serializer), AbstractC38195a.m122336d(navigationButtonModel$$serializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d(NavigationBarFixedHeader$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final NavigationBarModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        NavigationBarFixedHeader navigationBarFixedHeader;
        String str;
        NavigationBarStyle navigationBarStyle;
        NavigationButtonModel navigationButtonModel;
        NavigationButtonModel navigationButtonModel2;
        String str2;
        String str3;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = NavigationBarModel.$childSerializers;
        int i14 = 7;
        int i15 = 6;
        String str4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            EnumC16313m0 enumC16313m1 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            NavigationButtonModel$$serializer navigationButtonModel$$serializer = NavigationButtonModel$$serializer.INSTANCE;
            NavigationButtonModel navigationButtonModel3 = (NavigationButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, navigationButtonModel$$serializer, null);
            NavigationButtonModel navigationButtonModel4 = (NavigationButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, navigationButtonModel$$serializer, null);
            NavigationBarStyle navigationBarStyle2 = (NavigationBarStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            NavigationBarFixedHeader navigationBarFixedHeader2 = (NavigationBarFixedHeader) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, NavigationBarFixedHeader$$serializer.INSTANCE, null);
            list = list2;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            navigationBarFixedHeader = navigationBarFixedHeader2;
            navigationButtonModel2 = navigationButtonModel3;
            i13 = 511;
            navigationButtonModel = navigationButtonModel4;
            navigationBarStyle = navigationBarStyle2;
            enumC16313m0 = enumC16313m1;
            str3 = str6;
            str2 = str5;
        } else {
            int i16 = 5;
            int i17 = 2;
            boolean z4 = true;
            int i18 = 0;
            List list3 = null;
            NavigationBarFixedHeader navigationBarFixedHeader3 = null;
            String str7 = null;
            NavigationBarStyle navigationBarStyle3 = null;
            NavigationButtonModel navigationButtonModel5 = null;
            NavigationButtonModel navigationButtonModel6 = null;
            String str8 = null;
            EnumC16313m0 enumC16313m2 = null;
            while (z4) {
                int i19 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        i15 = 6;
                        i17 = 2;
                        i16 = 5;
                        break;
                    case 0:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str4);
                        i18 |= 1;
                        i14 = 7;
                        i15 = 6;
                        i17 = 2;
                        i16 = 5;
                        break;
                    case 1:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str8);
                        i18 |= 2;
                        i14 = 7;
                        i15 = 6;
                        i17 = 2;
                        i16 = 5;
                        break;
                    case 2:
                        enumC16313m2 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), enumC16313m2);
                        i18 |= 4;
                        i14 = 7;
                        i15 = 6;
                        i16 = 5;
                        break;
                    case 3:
                        navigationButtonModel6 = (NavigationButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, NavigationButtonModel$$serializer.INSTANCE, navigationButtonModel6);
                        i18 |= 8;
                        i14 = 7;
                        i15 = 6;
                        i16 = 5;
                        break;
                    case 4:
                        navigationButtonModel5 = (NavigationButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, NavigationButtonModel$$serializer.INSTANCE, navigationButtonModel5);
                        i18 |= 16;
                        i14 = 7;
                        i15 = 6;
                        i16 = 5;
                        break;
                    case 5:
                        navigationBarStyle3 = (NavigationBarStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), navigationBarStyle3);
                        i18 |= 32;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 6:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), list3);
                        i18 |= 64;
                        i15 = i19;
                        i14 = 7;
                        break;
                    case 7:
                        navigationBarFixedHeader3 = (NavigationBarFixedHeader) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, NavigationBarFixedHeader$$serializer.INSTANCE, navigationBarFixedHeader3);
                        i18 |= 128;
                        i15 = i19;
                        break;
                    case 8:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str7);
                        i18 |= 256;
                        i15 = i19;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i18;
            list = list3;
            navigationBarFixedHeader = navigationBarFixedHeader3;
            str = str7;
            navigationBarStyle = navigationBarStyle3;
            navigationButtonModel = navigationButtonModel5;
            navigationButtonModel2 = navigationButtonModel6;
            str2 = str4;
            str3 = str8;
            enumC16313m0 = enumC16313m2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new NavigationBarModel(i13, str2, str3, enumC16313m0, navigationButtonModel2, navigationButtonModel, navigationBarStyle, list, navigationBarFixedHeader, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, NavigationBarModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        NavigationBarModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
