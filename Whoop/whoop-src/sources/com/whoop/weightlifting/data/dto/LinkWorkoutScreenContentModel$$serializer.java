package com.whoop.weightlifting.data.dto;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class LinkWorkoutScreenContentModel$$serializer implements GeneratedSerializer<LinkWorkoutScreenContentModel> {
    public static final int $stable;
    public static final LinkWorkoutScreenContentModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        LinkWorkoutScreenContentModel$$serializer linkWorkoutScreenContentModel$$serializer = new LinkWorkoutScreenContentModel$$serializer();
        INSTANCE = linkWorkoutScreenContentModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weightlifting.data.dto.LinkWorkoutScreenContentModel", linkWorkoutScreenContentModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("headline", false);
        pluginGeneratedSerialDescriptor.addElement("subtext", false);
        pluginGeneratedSerialDescriptor.addElement("ai_chat_callout", false);
        pluginGeneratedSerialDescriptor.addElement("add_tile", false);
        pluginGeneratedSerialDescriptor.addElement("builder_cta", false);
        pluginGeneratedSerialDescriptor.addElement("divider", false);
        pluginGeneratedSerialDescriptor.addElement("templates", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LinkWorkoutScreenContentModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = LinkWorkoutScreenContentModel.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, c25452a, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue()), AbstractC38195a.m122336d(AddTileModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), interfaceC23462hArr[6].getValue(), AbstractC38195a.m122336d(MetaData$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final LinkWorkoutScreenContentModel deserialize(InterfaceC40541d decoder) {
        int i13;
        MetaData metaData;
        List list;
        DesignSystemModel designSystemModel;
        DesignSystemModel designSystemModel2;
        TextResource textResource;
        TextResource textResource2;
        DesignSystemModel designSystemModel3;
        AddTileModel addTileModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = LinkWorkoutScreenContentModel.$childSerializers;
        int i14 = 7;
        int i15 = 4;
        TextResource textResource3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            DesignSystemModel designSystemModel4 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            AddTileModel addTileModel2 = (AddTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, AddTileModel$$serializer.INSTANCE, null);
            DesignSystemModel designSystemModel5 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            DesignSystemModel designSystemModel6 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            textResource2 = textResource5;
            metaData = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, MetaData$$serializer.INSTANCE, null);
            addTileModel = addTileModel2;
            i13 = 255;
            designSystemModel = designSystemModel6;
            designSystemModel2 = designSystemModel5;
            designSystemModel3 = designSystemModel4;
            textResource = textResource4;
        } else {
            int i16 = 2;
            boolean z4 = true;
            int i17 = 0;
            MetaData metaData2 = null;
            List list2 = null;
            DesignSystemModel designSystemModel7 = null;
            DesignSystemModel designSystemModel8 = null;
            TextResource textResource6 = null;
            DesignSystemModel designSystemModel9 = null;
            AddTileModel addTileModel3 = null;
            while (z4) {
                int i18 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        i15 = 4;
                        i16 = 2;
                        break;
                    case 0:
                        textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource3);
                        i17 |= 1;
                        i14 = 7;
                        i15 = 4;
                        i16 = 2;
                        break;
                    case 1:
                        textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource6);
                        i17 |= 2;
                        i14 = 7;
                        i15 = 4;
                        i16 = 2;
                        break;
                    case 2:
                        designSystemModel9 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), designSystemModel9);
                        i17 |= 4;
                        i14 = 7;
                        i15 = 4;
                        break;
                    case 3:
                        addTileModel3 = (AddTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, AddTileModel$$serializer.INSTANCE, addTileModel3);
                        i17 |= 8;
                        i14 = 7;
                        i15 = 4;
                        break;
                    case 4:
                        designSystemModel8 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), designSystemModel8);
                        i17 |= 16;
                        i15 = i18;
                        i14 = 7;
                        break;
                    case 5:
                        designSystemModel7 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), designSystemModel7);
                        i17 |= 32;
                        i15 = i18;
                        break;
                    case 6:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), list2);
                        i17 |= 64;
                        i15 = i18;
                        break;
                    case 7:
                        metaData2 = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, MetaData$$serializer.INSTANCE, metaData2);
                        i17 |= 128;
                        i15 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            metaData = metaData2;
            list = list2;
            designSystemModel = designSystemModel7;
            designSystemModel2 = designSystemModel8;
            textResource = textResource3;
            textResource2 = textResource6;
            designSystemModel3 = designSystemModel9;
            addTileModel = addTileModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new LinkWorkoutScreenContentModel(i13, textResource, textResource2, designSystemModel3, addTileModel, designSystemModel2, designSystemModel, list, metaData, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, LinkWorkoutScreenContentModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        LinkWorkoutScreenContentModel.write$Self$weightlifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
