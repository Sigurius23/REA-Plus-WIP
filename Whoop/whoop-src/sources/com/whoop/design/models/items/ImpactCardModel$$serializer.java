package com.whoop.design.models.items;

import java.util.List;
import java.util.UUID;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import o91.C27690g;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/ImpactCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/ImpactCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/ImpactCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/ImpactCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ImpactCardModel$$serializer implements GeneratedSerializer<ImpactCardModel> {
    public static final int $stable;
    public static final ImpactCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ImpactCardModel$$serializer impactCardModel$$serializer = new ImpactCardModel$$serializer();
        INSTANCE = impactCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.ImpactCardModel", impactCardModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("impactCardTitleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("impactCardSubtitleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("impactPercentageDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("yesAnswerCount", false);
        pluginGeneratedSerialDescriptor.addElement("noAnswerCount", false);
        pluginGeneratedSerialDescriptor.addElement("impactStyle", false);
        pluginGeneratedSerialDescriptor.addElement("tileTag", false);
        pluginGeneratedSerialDescriptor.addElement("tileTags", false);
        pluginGeneratedSerialDescriptor.addElement("impactBarSegment", false);
        pluginGeneratedSerialDescriptor.addElement("cardBackgroundStyle", false);
        pluginGeneratedSerialDescriptor.addElement("impactUuid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ImpactCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ImpactCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InsufficientAnswerCount$$serializer insufficientAnswerCount$$serializer = InsufficientAnswerCount$$serializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(insufficientAnswerCount$$serializer), AbstractC38195a.m122336d(insufficientAnswerCount$$serializer), interfaceC23462hArr[5].getValue(), AbstractC38195a.m122336d(TileTagModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), ImpactBarSegmentModel$$serializer.INSTANCE, interfaceC23462hArr[9].getValue(), C27690g.f111466a};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ImpactCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        InsufficientAnswerCount insufficientAnswerCount;
        BackgroundStyle backgroundStyle;
        ImpactStyle impactStyle;
        InsufficientAnswerCount insufficientAnswerCount2;
        UUID uuid;
        ImpactBarSegmentModel impactBarSegmentModel;
        TileTagModel tileTagModel;
        String str;
        String str2;
        String str3;
        InterfaceC23462h[] interfaceC23462hArr;
        InterfaceC23462h[] interfaceC23462hArr2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr3 = ImpactCardModel.$childSerializers;
        String str4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            InsufficientAnswerCount$$serializer insufficientAnswerCount$$serializer = InsufficientAnswerCount$$serializer.INSTANCE;
            InsufficientAnswerCount insufficientAnswerCount3 = (InsufficientAnswerCount) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, insufficientAnswerCount$$serializer, null);
            InsufficientAnswerCount insufficientAnswerCount4 = (InsufficientAnswerCount) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, insufficientAnswerCount$$serializer, null);
            ImpactStyle impactStyle2 = (ImpactStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr3[5].getValue(), null);
            TileTagModel tileTagModel2 = (TileTagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, TileTagModel$$serializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr3[7].getValue(), null);
            ImpactBarSegmentModel impactBarSegmentModel2 = (ImpactBarSegmentModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, ImpactBarSegmentModel$$serializer.INSTANCE, null);
            backgroundStyle = (BackgroundStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr3[9].getValue(), null);
            str = str7;
            uuid = (UUID) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, C27690g.f111466a, null);
            tileTagModel = tileTagModel2;
            insufficientAnswerCount2 = insufficientAnswerCount3;
            impactBarSegmentModel = impactBarSegmentModel2;
            insufficientAnswerCount = insufficientAnswerCount4;
            impactStyle = impactStyle2;
            i13 = 2047;
            list = list2;
            str2 = str6;
            str3 = str5;
        } else {
            int i14 = 9;
            int i15 = 7;
            int i16 = 5;
            boolean z4 = true;
            int i17 = 0;
            List list3 = null;
            InsufficientAnswerCount insufficientAnswerCount5 = null;
            BackgroundStyle backgroundStyle2 = null;
            ImpactStyle impactStyle3 = null;
            InsufficientAnswerCount insufficientAnswerCount6 = null;
            UUID uuid2 = null;
            ImpactBarSegmentModel impactBarSegmentModel3 = null;
            TileTagModel tileTagModel3 = null;
            String str8 = null;
            String str9 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i16 = 5;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 0:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str4);
                        i17 |= 1;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i16 = 5;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 1:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str9);
                        i17 |= 2;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i16 = 5;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 2:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str8);
                        i17 |= 4;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i16 = 5;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 3:
                        insufficientAnswerCount6 = (InsufficientAnswerCount) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, InsufficientAnswerCount$$serializer.INSTANCE, insufficientAnswerCount6);
                        i17 |= 8;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i16 = 5;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 4:
                        insufficientAnswerCount5 = (InsufficientAnswerCount) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, InsufficientAnswerCount$$serializer.INSTANCE, insufficientAnswerCount5);
                        i17 |= 16;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i16 = 5;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 5:
                        interfaceC23462hArr = interfaceC23462hArr3;
                        impactStyle3 = (ImpactStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), impactStyle3);
                        i17 |= 32;
                        interfaceC23462hArr3 = interfaceC23462hArr;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 6:
                        interfaceC23462hArr = interfaceC23462hArr3;
                        tileTagModel3 = (TileTagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, TileTagModel$$serializer.INSTANCE, tileTagModel3);
                        i17 |= 64;
                        interfaceC23462hArr3 = interfaceC23462hArr;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 7:
                        interfaceC23462hArr2 = interfaceC23462hArr3;
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr2[i15].getValue(), list3);
                        i17 |= 128;
                        interfaceC23462hArr3 = interfaceC23462hArr2;
                        i14 = 9;
                        break;
                    case 8:
                        interfaceC23462hArr2 = interfaceC23462hArr3;
                        impactBarSegmentModel3 = (ImpactBarSegmentModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, ImpactBarSegmentModel$$serializer.INSTANCE, impactBarSegmentModel3);
                        i17 |= 256;
                        interfaceC23462hArr3 = interfaceC23462hArr2;
                        i14 = 9;
                        break;
                    case 9:
                        InterfaceC23462h[] interfaceC23462hArr4 = interfaceC23462hArr3;
                        backgroundStyle2 = (BackgroundStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr4[i14].getValue(), backgroundStyle2);
                        i17 |= 512;
                        interfaceC23462hArr3 = interfaceC23462hArr4;
                        break;
                    case 10:
                        uuid2 = (UUID) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, C27690g.f111466a, uuid2);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            list = list3;
            insufficientAnswerCount = insufficientAnswerCount5;
            backgroundStyle = backgroundStyle2;
            impactStyle = impactStyle3;
            insufficientAnswerCount2 = insufficientAnswerCount6;
            uuid = uuid2;
            impactBarSegmentModel = impactBarSegmentModel3;
            tileTagModel = tileTagModel3;
            str = str8;
            str2 = str9;
            str3 = str4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ImpactCardModel(i13, str3, str2, str, insufficientAnswerCount2, insufficientAnswerCount, impactStyle, tileTagModel, list, impactBarSegmentModel, backgroundStyle, uuid, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ImpactCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ImpactCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
