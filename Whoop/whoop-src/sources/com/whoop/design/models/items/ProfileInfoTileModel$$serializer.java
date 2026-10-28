package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/ProfileInfoTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/ProfileInfoTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/ProfileInfoTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/ProfileInfoTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ProfileInfoTileModel$$serializer implements GeneratedSerializer<ProfileInfoTileModel> {
    public static final int $stable;
    public static final ProfileInfoTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ProfileInfoTileModel$$serializer profileInfoTileModel$$serializer = new ProfileInfoTileModel$$serializer();
        INSTANCE = profileInfoTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.ProfileInfoTileModel", profileInfoTileModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("layout_style", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("image_url", false);
        pluginGeneratedSerialDescriptor.addElement("image_style", true);
        pluginGeneratedSerialDescriptor.addElement("top_item", false);
        pluginGeneratedSerialDescriptor.addElement("end_icon", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("family_plan_id", false);
        pluginGeneratedSerialDescriptor.addElement("user_id", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("interaction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProfileInfoTileModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ProfileInfoTileModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(LongSerializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ProfileInfoTileModel deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        GenericInteraction genericInteraction;
        C9598e c9598e;
        String str3;
        int i13;
        String str4;
        DesignSystemModel designSystemModel;
        String str5;
        Long l7;
        String str6;
        String str7;
        String str8;
        InterfaceC23462h[] interfaceC23462hArr;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr2 = ProfileInfoTileModel.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            DesignSystemModel designSystemModel2 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr2[5].getValue(), null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            Long l12 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, LongSerializer.INSTANCE, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr2[10].getValue(), null);
            str2 = strDecodeStringElement2;
            genericInteraction = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, GenericInteraction$$serializer.INSTANCE, null);
            l7 = l12;
            str8 = strDecodeStringElement4;
            str3 = str12;
            str7 = str10;
            str4 = str13;
            str6 = str11;
            str5 = str9;
            designSystemModel = designSystemModel2;
            i13 = 4095;
            str = strDecodeStringElement3;
        } else {
            String strDecodeStringElement5 = null;
            GenericInteraction genericInteraction2 = null;
            C9598e c9598e2 = null;
            String str14 = null;
            String str15 = null;
            DesignSystemModel designSystemModel3 = null;
            String str16 = null;
            String strDecodeStringElement6 = null;
            int i14 = 5;
            boolean z4 = true;
            int i15 = 0;
            Long l13 = null;
            String str17 = null;
            String str18 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 5;
                        break;
                    case 1:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i15 |= 2;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 5;
                        break;
                    case 2:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str16);
                        i15 |= 4;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 5;
                        break;
                    case 3:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str18);
                        i15 |= 8;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 5;
                        break;
                    case 4:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str17);
                        i15 |= 16;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 5;
                        break;
                    case 5:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        designSystemModel3 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), designSystemModel3);
                        i15 |= 32;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 6:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str14);
                        i15 |= 64;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 7:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i15 |= 128;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 8:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str15);
                        i15 |= 256;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 9:
                        l13 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, LongSerializer.INSTANCE, l13);
                        i15 |= 512;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        break;
                    case 10:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), c9598e2);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 11:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, GenericInteraction$$serializer.INSTANCE, genericInteraction2);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement;
            genericInteraction = genericInteraction2;
            c9598e = c9598e2;
            str3 = str14;
            i13 = i15;
            str4 = str15;
            designSystemModel = designSystemModel3;
            str5 = str16;
            l7 = l13;
            str6 = str17;
            str7 = str18;
            str8 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ProfileInfoTileModel(i13, str2, str, str5, str7, str6, designSystemModel, str3, str8, str4, l7, c9598e, genericInteraction, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ProfileInfoTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ProfileInfoTileModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
