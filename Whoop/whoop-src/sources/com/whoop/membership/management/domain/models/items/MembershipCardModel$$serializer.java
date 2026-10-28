package com.whoop.membership.management.domain.models.items;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/membership/management/domain/models/items/MembershipCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MembershipCardModel$$serializer implements GeneratedSerializer<MembershipCardModel> {
    public static final int $stable;
    public static final MembershipCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MembershipCardModel$$serializer membershipCardModel$$serializer = new MembershipCardModel$$serializer();
        INSTANCE = membershipCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.membership.management.domain.models.items.MembershipCardModel", membershipCardModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("tierImage", false);
        pluginGeneratedSerialDescriptor.addElement("profilePhoto", false);
        pluginGeneratedSerialDescriptor.addElement("membershipInfo", false);
        pluginGeneratedSerialDescriptor.addElement("downgradeInfo", false);
        pluginGeneratedSerialDescriptor.addElement("inactive", false);
        pluginGeneratedSerialDescriptor.addElement("switchBillingInfo", false);
        pluginGeneratedSerialDescriptor.addElement("additionalInfo", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MembershipCardModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = MembershipCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue()), AbstractC38195a.m122336d(DowngradeInfoModel$$serializer.INSTANCE), AbstractC38195a.m122336d(InactiveInfoModel$$serializer.INSTANCE), AbstractC38195a.m122336d(SwitchBillingInfoModel$$serializer.INSTANCE), AbstractC38195a.m122336d(AdditionalInfoModel$$serializer.INSTANCE), stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MembershipCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        AdditionalInfoModel additionalInfoModel;
        InactiveInfoModel inactiveInfoModel;
        SwitchBillingInfoModel switchBillingInfoModel;
        DowngradeInfoModel downgradeInfoModel;
        List list;
        String str;
        String str2;
        String str3;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = MembershipCardModel.$childSerializers;
        int i14 = 7;
        int i15 = 6;
        String str4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            DowngradeInfoModel downgradeInfoModel2 = (DowngradeInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, DowngradeInfoModel$$serializer.INSTANCE, null);
            InactiveInfoModel inactiveInfoModel2 = (InactiveInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, InactiveInfoModel$$serializer.INSTANCE, null);
            SwitchBillingInfoModel switchBillingInfoModel2 = (SwitchBillingInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, SwitchBillingInfoModel$$serializer.INSTANCE, null);
            list = list2;
            str3 = str6;
            additionalInfoModel = (AdditionalInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, AdditionalInfoModel$$serializer.INSTANCE, null);
            switchBillingInfoModel = switchBillingInfoModel2;
            inactiveInfoModel = inactiveInfoModel2;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            downgradeInfoModel = downgradeInfoModel2;
            i13 = 511;
            str2 = strDecodeStringElement2;
            str = str5;
        } else {
            int i16 = 3;
            boolean z4 = true;
            int i17 = 0;
            AdditionalInfoModel additionalInfoModel2 = null;
            InactiveInfoModel inactiveInfoModel3 = null;
            SwitchBillingInfoModel switchBillingInfoModel3 = null;
            DowngradeInfoModel downgradeInfoModel3 = null;
            List list3 = null;
            String strDecodeStringElement3 = null;
            String str7 = null;
            String strDecodeStringElement4 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 6;
                        i16 = 3;
                        break;
                    case 0:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str4);
                        i17 |= 1;
                        i14 = 7;
                        i15 = 6;
                        i16 = 3;
                        break;
                    case 1:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i14 = 7;
                        i16 = 3;
                        break;
                    case 2:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str7);
                        i17 |= 4;
                        i14 = 7;
                        i16 = 3;
                        break;
                    case 3:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list3);
                        i17 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        downgradeInfoModel3 = (DowngradeInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, DowngradeInfoModel$$serializer.INSTANCE, downgradeInfoModel3);
                        i17 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        inactiveInfoModel3 = (InactiveInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, InactiveInfoModel$$serializer.INSTANCE, inactiveInfoModel3);
                        i17 |= 32;
                        i14 = 7;
                        break;
                    case 6:
                        switchBillingInfoModel3 = (SwitchBillingInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, SwitchBillingInfoModel$$serializer.INSTANCE, switchBillingInfoModel3);
                        i17 |= 64;
                        break;
                    case 7:
                        additionalInfoModel2 = (AdditionalInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, AdditionalInfoModel$$serializer.INSTANCE, additionalInfoModel2);
                        i17 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i17 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            additionalInfoModel = additionalInfoModel2;
            inactiveInfoModel = inactiveInfoModel3;
            switchBillingInfoModel = switchBillingInfoModel3;
            downgradeInfoModel = downgradeInfoModel3;
            list = list3;
            str = str4;
            str2 = strDecodeStringElement3;
            str3 = str7;
            strDecodeStringElement = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MembershipCardModel(i13, str, str2, str3, list, downgradeInfoModel, inactiveInfoModel, switchBillingInfoModel, additionalInfoModel, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MembershipCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MembershipCardModel.write$Self$membership_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
