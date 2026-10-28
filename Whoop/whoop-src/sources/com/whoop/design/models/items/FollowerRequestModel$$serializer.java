package com.whoop.design.models.items;

import com.whoop.navigation.C9598e;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/FollowerRequestModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/FollowerRequestModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/FollowerRequestModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/FollowerRequestModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class FollowerRequestModel$$serializer implements GeneratedSerializer<FollowerRequestModel> {
    public static final int $stable;
    public static final FollowerRequestModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FollowerRequestModel$$serializer followerRequestModel$$serializer = new FollowerRequestModel$$serializer();
        INSTANCE = followerRequestModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.FollowerRequestModel", followerRequestModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("subtext", true);
        pluginGeneratedSerialDescriptor.addElement("avatarUrl", true);
        pluginGeneratedSerialDescriptor.addElement("startButton", true);
        pluginGeneratedSerialDescriptor.addElement("endButton", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryStartButton", true);
        pluginGeneratedSerialDescriptor.addElement("tertiaryStartButton", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryEndButton", true);
        pluginGeneratedSerialDescriptor.addElement("tertiaryEndButton", true);
        pluginGeneratedSerialDescriptor.addElement("destination", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FollowerRequestModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = FollowerRequestModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        FollowerRequestButtonModel$$serializer followerRequestButtonModel$$serializer = FollowerRequestButtonModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, AbstractC38195a.m122336d(followerRequestButtonModel$$serializer), AbstractC38195a.m122336d(followerRequestButtonModel$$serializer), AbstractC38195a.m122336d(followerRequestButtonModel$$serializer), AbstractC38195a.m122336d(followerRequestButtonModel$$serializer), AbstractC38195a.m122336d(followerRequestButtonModel$$serializer), AbstractC38195a.m122336d(followerRequestButtonModel$$serializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FollowerRequestModel deserialize(InterfaceC40541d decoder) {
        int i13;
        C9598e c9598e;
        FollowerRequestButtonModel followerRequestButtonModel;
        FollowerRequestButtonModel followerRequestButtonModel2;
        FollowerRequestButtonModel followerRequestButtonModel3;
        FollowerRequestButtonModel followerRequestButtonModel4;
        String str;
        FollowerRequestButtonModel followerRequestButtonModel5;
        FollowerRequestButtonModel followerRequestButtonModel6;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = FollowerRequestModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            FollowerRequestButtonModel$$serializer followerRequestButtonModel$$serializer = FollowerRequestButtonModel$$serializer.INSTANCE;
            FollowerRequestButtonModel followerRequestButtonModel7 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, followerRequestButtonModel$$serializer, null);
            FollowerRequestButtonModel followerRequestButtonModel8 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, followerRequestButtonModel$$serializer, null);
            FollowerRequestButtonModel followerRequestButtonModel9 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, followerRequestButtonModel$$serializer, null);
            FollowerRequestButtonModel followerRequestButtonModel10 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, followerRequestButtonModel$$serializer, null);
            FollowerRequestButtonModel followerRequestButtonModel11 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, followerRequestButtonModel$$serializer, null);
            FollowerRequestButtonModel followerRequestButtonModel12 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, followerRequestButtonModel$$serializer, null);
            i13 = 4095;
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            str5 = strDecodeStringElement;
            followerRequestButtonModel = followerRequestButtonModel12;
            followerRequestButtonModel5 = followerRequestButtonModel11;
            followerRequestButtonModel3 = followerRequestButtonModel9;
            followerRequestButtonModel4 = followerRequestButtonModel8;
            followerRequestButtonModel6 = followerRequestButtonModel7;
            str2 = str8;
            followerRequestButtonModel2 = followerRequestButtonModel10;
            str = str9;
            str3 = str7;
            str4 = str6;
        } else {
            int i14 = 11;
            C9598e c9598e2 = null;
            FollowerRequestButtonModel followerRequestButtonModel13 = null;
            FollowerRequestButtonModel followerRequestButtonModel14 = null;
            FollowerRequestButtonModel followerRequestButtonModel15 = null;
            FollowerRequestButtonModel followerRequestButtonModel16 = null;
            String str10 = null;
            FollowerRequestButtonModel followerRequestButtonModel17 = null;
            FollowerRequestButtonModel followerRequestButtonModel18 = null;
            String str11 = null;
            String strDecodeStringElement2 = null;
            boolean z4 = true;
            String str12 = null;
            i13 = 0;
            String str13 = null;
            while (z4) {
                int i15 = i14;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 11;
                        break;
                    case 0:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i13 |= 1;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 11;
                        break;
                    case 1:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str13);
                        i13 |= 2;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 11;
                        break;
                    case 2:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str12);
                        i13 |= 4;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 11;
                        break;
                    case 3:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str11);
                        i13 |= 8;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 11;
                        break;
                    case 4:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str10);
                        i13 |= 16;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 11;
                        break;
                    case 5:
                        followerRequestButtonModel18 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, FollowerRequestButtonModel$$serializer.INSTANCE, followerRequestButtonModel18);
                        i13 |= 32;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 11;
                        break;
                    case 6:
                        followerRequestButtonModel16 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, FollowerRequestButtonModel$$serializer.INSTANCE, followerRequestButtonModel16);
                        i13 |= 64;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 11;
                        break;
                    case 7:
                        followerRequestButtonModel15 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, FollowerRequestButtonModel$$serializer.INSTANCE, followerRequestButtonModel15);
                        i13 |= 128;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 11;
                        break;
                    case 8:
                        followerRequestButtonModel14 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, FollowerRequestButtonModel$$serializer.INSTANCE, followerRequestButtonModel14);
                        i13 |= 256;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 11;
                        break;
                    case 9:
                        followerRequestButtonModel17 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, FollowerRequestButtonModel$$serializer.INSTANCE, followerRequestButtonModel17);
                        i13 |= 512;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 11;
                        break;
                    case 10:
                        followerRequestButtonModel13 = (FollowerRequestButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, FollowerRequestButtonModel$$serializer.INSTANCE, followerRequestButtonModel13);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 11;
                        break;
                    case 11:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), c9598e2);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i14 = i15;
                        interfaceC23462hArr = interfaceC23462hArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            c9598e = c9598e2;
            followerRequestButtonModel = followerRequestButtonModel13;
            followerRequestButtonModel2 = followerRequestButtonModel14;
            followerRequestButtonModel3 = followerRequestButtonModel15;
            followerRequestButtonModel4 = followerRequestButtonModel16;
            str = str10;
            followerRequestButtonModel5 = followerRequestButtonModel17;
            followerRequestButtonModel6 = followerRequestButtonModel18;
            str2 = str11;
            str3 = str12;
            str4 = str13;
            str5 = strDecodeStringElement2;
        }
        int i16 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FollowerRequestModel(i16, str5, str4, str3, str2, str, followerRequestButtonModel6, followerRequestButtonModel4, followerRequestButtonModel3, followerRequestButtonModel2, followerRequestButtonModel5, followerRequestButtonModel, c9598e, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FollowerRequestModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FollowerRequestModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
