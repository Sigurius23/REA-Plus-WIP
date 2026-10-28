package com.whoop.profile.domain.models.components;

import com.whoop.navigation.C9598e;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/profile/domain/models/components/ReferralsTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/profile/domain/models/components/ReferralsTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/profile/domain/models/components/ReferralsTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/profile/domain/models/components/ReferralsTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ReferralsTileModel$$serializer implements GeneratedSerializer<ReferralsTileModel> {
    public static final int $stable;
    public static final ReferralsTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ReferralsTileModel$$serializer referralsTileModel$$serializer = new ReferralsTileModel$$serializer();
        INSTANCE = referralsTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.profile.domain.models.components.ReferralsTileModel", referralsTileModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("referred_list", false);
        pluginGeneratedSerialDescriptor.addElement("footer", false);
        pluginGeneratedSerialDescriptor.addElement("button", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReferralsTileModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, ReferralsTileHeaderModel$$serializer.INSTANCE, AbstractC38195a.m122336d(ReferredListModel$$serializer.INSTANCE), AbstractC38195a.m122336d(ReferralsTileFooterModel$$serializer.INSTANCE), AbstractC38195a.m122336d(ReferralsTileButtonModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) ReferralsTileModel.$childSerializers[5].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ReferralsTileModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        ReferralsTileHeaderModel referralsTileHeaderModel;
        ReferredListModel referredListModel;
        ReferralsTileFooterModel referralsTileFooterModel;
        ReferralsTileButtonModel referralsTileButtonModel;
        C9598e c9598e;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ReferralsTileModel.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            ReferralsTileHeaderModel referralsTileHeaderModel2 = (ReferralsTileHeaderModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ReferralsTileHeaderModel$$serializer.INSTANCE, null);
            ReferredListModel referredListModel2 = (ReferredListModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, ReferredListModel$$serializer.INSTANCE, null);
            ReferralsTileFooterModel referralsTileFooterModel2 = (ReferralsTileFooterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, ReferralsTileFooterModel$$serializer.INSTANCE, null);
            ReferralsTileButtonModel referralsTileButtonModel2 = (ReferralsTileButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, ReferralsTileButtonModel$$serializer.INSTANCE, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            str = strDecodeStringElement2;
            referralsTileFooterModel = referralsTileFooterModel2;
            referralsTileButtonModel = referralsTileButtonModel2;
            referredListModel = referredListModel2;
            i13 = 63;
            referralsTileHeaderModel = referralsTileHeaderModel2;
        } else {
            boolean z4 = true;
            int i14 = 0;
            ReferralsTileHeaderModel referralsTileHeaderModel3 = null;
            ReferredListModel referredListModel3 = null;
            ReferralsTileFooterModel referralsTileFooterModel3 = null;
            ReferralsTileButtonModel referralsTileButtonModel3 = null;
            C9598e c9598e2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        continue;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 |= 1;
                        continue;
                    case 1:
                        referralsTileHeaderModel3 = (ReferralsTileHeaderModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ReferralsTileHeaderModel$$serializer.INSTANCE, referralsTileHeaderModel3);
                        i14 |= 2;
                        break;
                    case 2:
                        referredListModel3 = (ReferredListModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, ReferredListModel$$serializer.INSTANCE, referredListModel3);
                        i14 |= 4;
                        break;
                    case 3:
                        referralsTileFooterModel3 = (ReferralsTileFooterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, ReferralsTileFooterModel$$serializer.INSTANCE, referralsTileFooterModel3);
                        i14 |= 8;
                        break;
                    case 4:
                        referralsTileButtonModel3 = (ReferralsTileButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, ReferralsTileButtonModel$$serializer.INSTANCE, referralsTileButtonModel3);
                        i14 |= 16;
                        break;
                    case 5:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), c9598e2);
                        i14 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i14;
            str = strDecodeStringElement;
            referralsTileHeaderModel = referralsTileHeaderModel3;
            referredListModel = referredListModel3;
            referralsTileFooterModel = referralsTileFooterModel3;
            referralsTileButtonModel = referralsTileButtonModel3;
            c9598e = c9598e2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ReferralsTileModel(i13, str, referralsTileHeaderModel, referredListModel, referralsTileFooterModel, referralsTileButtonModel, c9598e, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ReferralsTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ReferralsTileModel.write$Self$profile_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
