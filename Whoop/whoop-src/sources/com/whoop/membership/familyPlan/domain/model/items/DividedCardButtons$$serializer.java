package com.whoop.membership.familyPlan.domain.model.items;

import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.DividerModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/membership/familyPlan/domain/model/items/DividedCardButtons.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class DividedCardButtons$$serializer implements GeneratedSerializer<DividedCardButtons> {
    public static final int $stable;
    public static final DividedCardButtons$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        DividedCardButtons$$serializer dividedCardButtons$$serializer = new DividedCardButtons$$serializer();
        INSTANCE = dividedCardButtons$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.membership.familyPlan.domain.model.items.DividedCardButtons", dividedCardButtons$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("topButton", false);
        pluginGeneratedSerialDescriptor.addElement("divider", false);
        pluginGeneratedSerialDescriptor.addElement("bottomButton", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimerText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DividedCardButtons$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{cardButtonModel$$serializer, DividerModel$$serializer.INSTANCE, cardButtonModel$$serializer, StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final DividedCardButtons deserialize(InterfaceC40541d decoder) {
        int i13;
        CardButtonModel cardButtonModel;
        DividerModel dividerModel;
        CardButtonModel cardButtonModel2;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        CardButtonModel cardButtonModel3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
            CardButtonModel cardButtonModel4 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, cardButtonModel$$serializer, null);
            DividerModel dividerModel2 = (DividerModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, DividerModel$$serializer.INSTANCE, null);
            cardButtonModel2 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, cardButtonModel$$serializer, null);
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            i13 = 15;
            dividerModel = dividerModel2;
            cardButtonModel = cardButtonModel4;
        } else {
            boolean z4 = true;
            int i14 = 0;
            DividerModel dividerModel3 = null;
            CardButtonModel cardButtonModel5 = null;
            String strDecodeStringElement2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    cardButtonModel3 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, CardButtonModel$$serializer.INSTANCE, cardButtonModel3);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    dividerModel3 = (DividerModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, DividerModel$$serializer.INSTANCE, dividerModel3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    cardButtonModel5 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, CardButtonModel$$serializer.INSTANCE, cardButtonModel5);
                    i14 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                    i14 |= 8;
                }
            }
            i13 = i14;
            cardButtonModel = cardButtonModel3;
            dividerModel = dividerModel3;
            cardButtonModel2 = cardButtonModel5;
            strDecodeStringElement = strDecodeStringElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new DividedCardButtons(i13, cardButtonModel, dividerModel, cardButtonModel2, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, DividedCardButtons value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        DividedCardButtons.write$Self$membership_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
