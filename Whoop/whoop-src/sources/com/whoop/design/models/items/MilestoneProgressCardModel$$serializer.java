package com.whoop.design.models.items;

import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorThemeModel$$serializer;
import com.whoop.design.util.TextResource;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/MilestoneProgressCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/MilestoneProgressCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/MilestoneProgressCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/MilestoneProgressCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MilestoneProgressCardModel$$serializer implements GeneratedSerializer<MilestoneProgressCardModel> {
    public static final int $stable;
    public static final MilestoneProgressCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MilestoneProgressCardModel$$serializer milestoneProgressCardModel$$serializer = new MilestoneProgressCardModel$$serializer();
        INSTANCE = milestoneProgressCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.MilestoneProgressCardModel", milestoneProgressCardModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("colors", true);
        pluginGeneratedSerialDescriptor.addElement("currentMilestone", true);
        pluginGeneratedSerialDescriptor.addElement("nextMilestone", true);
        pluginGeneratedSerialDescriptor.addElement("progressPercent", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MilestoneProgressCardModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(ColorThemeModel$$serializer.INSTANCE);
        MilestoneItem$$serializer milestoneItem$$serializer = MilestoneItem$$serializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(milestoneItem$$serializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(milestoneItem$$serializer);
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, c25452a, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, DoubleSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MilestoneProgressCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        TextResource textResource2;
        String str;
        ColorThemeModel colorThemeModel;
        MilestoneItem milestoneItem;
        MilestoneItem milestoneItem2;
        double dDecodeDoubleElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 6;
        TextResource textResource3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            String str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, null);
            ColorThemeModel colorThemeModel2 = (ColorThemeModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, ColorThemeModel$$serializer.INSTANCE, null);
            MilestoneItem$$serializer milestoneItem$$serializer = MilestoneItem$$serializer.INSTANCE;
            MilestoneItem milestoneItem3 = (MilestoneItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, milestoneItem$$serializer, null);
            textResource2 = textResource5;
            i13 = 127;
            milestoneItem2 = (MilestoneItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, milestoneItem$$serializer, null);
            colorThemeModel = colorThemeModel2;
            milestoneItem = milestoneItem3;
            str = str2;
            textResource = textResource4;
            dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 6);
        } else {
            boolean z4 = true;
            int i15 = 0;
            ColorThemeModel colorThemeModel3 = null;
            MilestoneItem milestoneItem4 = null;
            MilestoneItem milestoneItem5 = null;
            double dDecodeDoubleElement2 = 0.0d;
            TextResource textResource6 = null;
            String str3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 6;
                        break;
                    case 0:
                        textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource3);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource6);
                        i15 |= 2;
                        break;
                    case 2:
                        str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str3);
                        i15 |= 4;
                        break;
                    case 3:
                        colorThemeModel3 = (ColorThemeModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, ColorThemeModel$$serializer.INSTANCE, colorThemeModel3);
                        i15 |= 8;
                        break;
                    case 4:
                        milestoneItem4 = (MilestoneItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, MilestoneItem$$serializer.INSTANCE, milestoneItem4);
                        i15 |= 16;
                        break;
                    case 5:
                        milestoneItem5 = (MilestoneItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, MilestoneItem$$serializer.INSTANCE, milestoneItem5);
                        i15 |= 32;
                        break;
                    case 6:
                        dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, i14);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            textResource = textResource3;
            textResource2 = textResource6;
            str = str3;
            colorThemeModel = colorThemeModel3;
            milestoneItem = milestoneItem4;
            milestoneItem2 = milestoneItem5;
            dDecodeDoubleElement = dDecodeDoubleElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MilestoneProgressCardModel(i13, textResource, textResource2, str, colorThemeModel, milestoneItem, milestoneItem2, dDecodeDoubleElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MilestoneProgressCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MilestoneProgressCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
