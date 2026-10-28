package com.whoop.communityfollowercontainer.domain.model;

import com.whoop.design.models.DesignSystemModel;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "community-follower-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CommunityFilterBottomSheetModel$$serializer implements GeneratedSerializer<CommunityFilterBottomSheetModel> {
    public static final int $stable;
    public static final CommunityFilterBottomSheetModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CommunityFilterBottomSheetModel$$serializer communityFilterBottomSheetModel$$serializer = new CommunityFilterBottomSheetModel$$serializer();
        INSTANCE = communityFilterBottomSheetModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.communityfollowercontainer.domain.model.CommunityFilterBottomSheetModel", communityFilterBottomSheetModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("filters", true);
        pluginGeneratedSerialDescriptor.addElement("sorts", true);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommunityFilterBottomSheetModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CommunityFilterBottomSheetModel.$childSerializers;
        OptionSection$$serializer optionSection$$serializer = OptionSection$$serializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(optionSection$$serializer), AbstractC38195a.m122336d(optionSection$$serializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CommunityFilterBottomSheetModel deserialize(InterfaceC40541d decoder) {
        int i13;
        OptionSection optionSection;
        OptionSection optionSection2;
        DesignSystemModel designSystemModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CommunityFilterBottomSheetModel.$childSerializers;
        OptionSection optionSection3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            OptionSection$$serializer optionSection$$serializer = OptionSection$$serializer.INSTANCE;
            OptionSection optionSection4 = (OptionSection) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, optionSection$$serializer, null);
            OptionSection optionSection5 = (OptionSection) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, optionSection$$serializer, null);
            designSystemModel = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            optionSection2 = optionSection5;
            i13 = 7;
            optionSection = optionSection4;
        } else {
            boolean z4 = true;
            int i14 = 0;
            OptionSection optionSection6 = null;
            DesignSystemModel designSystemModel2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    optionSection3 = (OptionSection) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, OptionSection$$serializer.INSTANCE, optionSection3);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    optionSection6 = (OptionSection) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, OptionSection$$serializer.INSTANCE, optionSection6);
                    i14 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    designSystemModel2 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), designSystemModel2);
                    i14 |= 4;
                }
            }
            i13 = i14;
            optionSection = optionSection3;
            optionSection2 = optionSection6;
            designSystemModel = designSystemModel2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CommunityFilterBottomSheetModel(i13, optionSection, optionSection2, designSystemModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CommunityFilterBottomSheetModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CommunityFilterBottomSheetModel.write$Self$community_follower_container_arch_mini_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
