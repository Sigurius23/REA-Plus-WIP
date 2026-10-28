package com.whoop.communityhighlights.domain.models;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/communityhighlights/domain/models/HighlightCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "community-highlights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HighlightCardModel$$serializer implements GeneratedSerializer<HighlightCardModel> {
    public static final int $stable;
    public static final HighlightCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HighlightCardModel$$serializer highlightCardModel$$serializer = new HighlightCardModel$$serializer();
        INSTANCE = highlightCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.communityhighlights.domain.models.HighlightCardModel", highlightCardModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("badge", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("footer", false);
        pluginGeneratedSerialDescriptor.addElement("interaction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HighlightCardModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(HighlightCardLabelModel$$serializer.INSTANCE), AbstractC38195a.m122336d(HighlightCardBadgeModel$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(HighlightCardFooterModel$$serializer.INSTANCE), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HighlightCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        HighlightCardLabelModel highlightCardLabelModel;
        HighlightCardBadgeModel highlightCardBadgeModel;
        String str2;
        HighlightCardFooterModel highlightCardFooterModel;
        GenericInteraction genericInteraction;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            HighlightCardLabelModel highlightCardLabelModel2 = (HighlightCardLabelModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, HighlightCardLabelModel$$serializer.INSTANCE, null);
            HighlightCardBadgeModel highlightCardBadgeModel2 = (HighlightCardBadgeModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, HighlightCardBadgeModel$$serializer.INSTANCE, null);
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, null);
            HighlightCardFooterModel highlightCardFooterModel2 = (HighlightCardFooterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, HighlightCardFooterModel$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            genericInteraction = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, GenericInteraction$$serializer.INSTANCE, null);
            str2 = str3;
            highlightCardFooterModel = highlightCardFooterModel2;
            highlightCardBadgeModel = highlightCardBadgeModel2;
            highlightCardLabelModel = highlightCardLabelModel2;
            i13 = 63;
        } else {
            boolean z4 = true;
            int i14 = 0;
            HighlightCardLabelModel highlightCardLabelModel3 = null;
            HighlightCardBadgeModel highlightCardBadgeModel3 = null;
            String str4 = null;
            HighlightCardFooterModel highlightCardFooterModel3 = null;
            GenericInteraction genericInteraction2 = null;
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
                        highlightCardLabelModel3 = (HighlightCardLabelModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, HighlightCardLabelModel$$serializer.INSTANCE, highlightCardLabelModel3);
                        i14 |= 2;
                        break;
                    case 2:
                        highlightCardBadgeModel3 = (HighlightCardBadgeModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, HighlightCardBadgeModel$$serializer.INSTANCE, highlightCardBadgeModel3);
                        i14 |= 4;
                        break;
                    case 3:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str4);
                        i14 |= 8;
                        break;
                    case 4:
                        highlightCardFooterModel3 = (HighlightCardFooterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, HighlightCardFooterModel$$serializer.INSTANCE, highlightCardFooterModel3);
                        i14 |= 16;
                        break;
                    case 5:
                        genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, GenericInteraction$$serializer.INSTANCE, genericInteraction2);
                        i14 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i14;
            str = strDecodeStringElement;
            highlightCardLabelModel = highlightCardLabelModel3;
            highlightCardBadgeModel = highlightCardBadgeModel3;
            str2 = str4;
            highlightCardFooterModel = highlightCardFooterModel3;
            genericInteraction = genericInteraction2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HighlightCardModel(i13, str, highlightCardLabelModel, highlightCardBadgeModel, str2, highlightCardFooterModel, genericInteraction, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HighlightCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HighlightCardModel.write$Self$community_highlights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
