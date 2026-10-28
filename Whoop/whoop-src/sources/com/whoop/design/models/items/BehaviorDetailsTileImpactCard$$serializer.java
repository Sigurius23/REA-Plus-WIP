package com.whoop.design.models.items;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/BehaviorDetailsTileImpactCard.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class BehaviorDetailsTileImpactCard$$serializer implements GeneratedSerializer<BehaviorDetailsTileImpactCard> {
    public static final int $stable;
    public static final BehaviorDetailsTileImpactCard$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        BehaviorDetailsTileImpactCard$$serializer behaviorDetailsTileImpactCard$$serializer = new BehaviorDetailsTileImpactCard$$serializer();
        INSTANCE = behaviorDetailsTileImpactCard$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.BehaviorDetailsTileImpactCard", behaviorDetailsTileImpactCard$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("titleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("impactStyle", false);
        pluginGeneratedSerialDescriptor.addElement("tileTag", false);
        pluginGeneratedSerialDescriptor.addElement("impactPercentageValue", false);
        pluginGeneratedSerialDescriptor.addElement("impactPercentageSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("subBarLabel", false);
        pluginGeneratedSerialDescriptor.addElement("subBarPercent", false);
        pluginGeneratedSerialDescriptor.addElement("impactBarSegment", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BehaviorDetailsTileImpactCard$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = BehaviorDetailsTileImpactCard.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[1].getValue(), AbstractC38195a.m122336d(TileTagModel$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(ImpactBarSegmentModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final BehaviorDetailsTileImpactCard deserialize(InterfaceC40541d decoder) {
        int i13;
        ImpactBarSegmentModel impactBarSegmentModel;
        String str;
        String str2;
        String str3;
        String str4;
        ImpactStyle impactStyle;
        TileTagModel tileTagModel;
        String str5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = BehaviorDetailsTileImpactCard.$childSerializers;
        int i14 = 7;
        String str6 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            ImpactStyle impactStyle2 = (ImpactStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            TileTagModel tileTagModel2 = (TileTagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, TileTagModel$$serializer.INSTANCE, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            impactStyle = impactStyle2;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            impactBarSegmentModel = (ImpactBarSegmentModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, ImpactBarSegmentModel$$serializer.INSTANCE, null);
            i13 = 255;
            str2 = str10;
            str5 = str8;
            str3 = str9;
            tileTagModel = tileTagModel2;
            str4 = str7;
        } else {
            int i15 = 1;
            boolean z4 = true;
            int i16 = 0;
            ImpactBarSegmentModel impactBarSegmentModel2 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            ImpactStyle impactStyle3 = null;
            TileTagModel tileTagModel3 = null;
            String str14 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        i15 = 1;
                        break;
                    case 0:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str6);
                        i16 |= 1;
                        i14 = 7;
                        i15 = 1;
                        break;
                    case 1:
                        impactStyle3 = (ImpactStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), impactStyle3);
                        i16 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        tileTagModel3 = (TileTagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, TileTagModel$$serializer.INSTANCE, tileTagModel3);
                        i16 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str14);
                        i16 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str13);
                        i16 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str12);
                        i16 |= 32;
                        break;
                    case 6:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str11);
                        i16 |= 64;
                        break;
                    case 7:
                        impactBarSegmentModel2 = (ImpactBarSegmentModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, ImpactBarSegmentModel$$serializer.INSTANCE, impactBarSegmentModel2);
                        i16 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            impactBarSegmentModel = impactBarSegmentModel2;
            str = str11;
            str2 = str12;
            str3 = str13;
            str4 = str6;
            impactStyle = impactStyle3;
            tileTagModel = tileTagModel3;
            str5 = str14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new BehaviorDetailsTileImpactCard(i13, str4, impactStyle, tileTagModel, str5, str3, str2, str, impactBarSegmentModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, BehaviorDetailsTileImpactCard value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        BehaviorDetailsTileImpactCard.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
