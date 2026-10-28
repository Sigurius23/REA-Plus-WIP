package com.whoop.communitymoments.domain.models;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/communitymoments/domain/models/MomentCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/communitymoments/domain/models/MomentCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/communitymoments/domain/models/MomentCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/communitymoments/domain/models/MomentCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MomentCardModel$$serializer implements GeneratedSerializer<MomentCardModel> {
    public static final int $stable;
    public static final MomentCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MomentCardModel$$serializer momentCardModel$$serializer = new MomentCardModel$$serializer();
        INSTANCE = momentCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.communitymoments.domain.models.MomentCardModel", momentCardModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("fillMode", true);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("dateBadge", false);
        pluginGeneratedSerialDescriptor.addElement("profile", false);
        pluginGeneratedSerialDescriptor.addElement("badge", false);
        pluginGeneratedSerialDescriptor.addElement("footer", false);
        pluginGeneratedSerialDescriptor.addElement("interaction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MomentCardModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = MomentCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[1].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(MomentCardModel$DateBadge$$serializer.INSTANCE), AbstractC38195a.m122336d(MomentCardModel$Profile$$serializer.INSTANCE), AbstractC38195a.m122336d(MomentCardModel$Badge$$serializer.INSTANCE), AbstractC38195a.m122336d(MomentCardModel$Footer$$serializer.INSTANCE), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MomentCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        GenericInteraction genericInteraction;
        MomentCardModel.Footer footer;
        MomentCardModel.Badge badge;
        MomentCardModel.Profile profile;
        String str;
        MomentCardFillMode momentCardFillMode;
        String str2;
        MomentCardModel.DateBadge dateBadge;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = MomentCardModel.$childSerializers;
        int i14 = 7;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            MomentCardFillMode momentCardFillMode2 = (MomentCardFillMode) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, null);
            MomentCardModel.DateBadge dateBadge2 = (MomentCardModel.DateBadge) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, MomentCardModel$DateBadge$$serializer.INSTANCE, null);
            MomentCardModel.Profile profile2 = (MomentCardModel.Profile) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, MomentCardModel$Profile$$serializer.INSTANCE, null);
            MomentCardModel.Badge badge2 = (MomentCardModel.Badge) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, MomentCardModel$Badge$$serializer.INSTANCE, null);
            MomentCardModel.Footer footer2 = (MomentCardModel.Footer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, MomentCardModel$Footer$$serializer.INSTANCE, null);
            momentCardFillMode = momentCardFillMode2;
            str = strDecodeStringElement2;
            genericInteraction = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, GenericInteraction$$serializer.INSTANCE, null);
            footer = footer2;
            badge = badge2;
            dateBadge = dateBadge2;
            profile = profile2;
            str2 = str3;
            i13 = 255;
        } else {
            boolean z4 = true;
            int i15 = 0;
            GenericInteraction genericInteraction2 = null;
            MomentCardModel.Footer footer3 = null;
            MomentCardModel.Badge badge3 = null;
            MomentCardModel.Profile profile3 = null;
            MomentCardFillMode momentCardFillMode3 = null;
            String str4 = null;
            MomentCardModel.DateBadge dateBadge3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 7;
                        break;
                    case 1:
                        momentCardFillMode3 = (MomentCardFillMode) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), momentCardFillMode3);
                        i15 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str4);
                        i15 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        dateBadge3 = (MomentCardModel.DateBadge) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, MomentCardModel$DateBadge$$serializer.INSTANCE, dateBadge3);
                        i15 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        profile3 = (MomentCardModel.Profile) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, MomentCardModel$Profile$$serializer.INSTANCE, profile3);
                        i15 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        badge3 = (MomentCardModel.Badge) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, MomentCardModel$Badge$$serializer.INSTANCE, badge3);
                        i15 |= 32;
                        break;
                    case 6:
                        footer3 = (MomentCardModel.Footer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, MomentCardModel$Footer$$serializer.INSTANCE, footer3);
                        i15 |= 64;
                        break;
                    case 7:
                        genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, GenericInteraction$$serializer.INSTANCE, genericInteraction2);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            genericInteraction = genericInteraction2;
            footer = footer3;
            badge = badge3;
            profile = profile3;
            str = strDecodeStringElement;
            momentCardFillMode = momentCardFillMode3;
            str2 = str4;
            dateBadge = dateBadge3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MomentCardModel(i13, str, momentCardFillMode, str2, dateBadge, profile, badge, footer, genericInteraction, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MomentCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MomentCardModel.write$Self$community_moments_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
