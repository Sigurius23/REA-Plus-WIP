package com.whoop.design.models;

import b91.EnumC2888c;
import com.whoop.design.models.items.InfoCalloutStyle;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/InfoCalloutTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/InfoCalloutTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/InfoCalloutTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/InfoCalloutTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class InfoCalloutTileModel$$serializer implements GeneratedSerializer<InfoCalloutTileModel> {
    public static final int $stable;
    public static final InfoCalloutTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        InfoCalloutTileModel$$serializer infoCalloutTileModel$$serializer = new InfoCalloutTileModel$$serializer();
        INSTANCE = infoCalloutTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.InfoCalloutTileModel", infoCalloutTileModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("descriptionTypography", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("useFallbackIcon", true);
        pluginGeneratedSerialDescriptor.addElement("iconGradient", true);
        pluginGeneratedSerialDescriptor.addElement("iconSize", true);
        pluginGeneratedSerialDescriptor.addElement("componentDismissalId", true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement("itemsAlignment", true);
        pluginGeneratedSerialDescriptor.addElement("analyticsProperties", true);
        pluginGeneratedSerialDescriptor.addElement("dismissAction", true);
        pluginGeneratedSerialDescriptor.addElement("analyticEvents", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InfoCalloutTileModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = InfoCalloutTileModel.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(c25452a), c25452a, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue()), interfaceC23462hArr[3].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(StringSerializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue()), AbstractC38195a.m122336d(InfoCalloutTileAnalyticEvents$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final InfoCalloutTileModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        IconSize iconSize;
        InfoCalloutTileItemsAlignment infoCalloutTileItemsAlignment;
        EnumC2888c enumC2888c;
        Action action;
        Map map;
        List list;
        String str;
        Boolean bool;
        IconGradient iconGradient;
        EnumC16313m0 enumC16313m0;
        TextResource textResource2;
        InfoCalloutStyle infoCalloutStyle;
        InfoCalloutTileAnalyticEvents infoCalloutTileAnalyticEvents;
        TextResource textResource3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = InfoCalloutTileModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            EnumC2888c enumC2888c2 = (EnumC2888c) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            InfoCalloutStyle infoCalloutStyle2 = (InfoCalloutStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            EnumC16313m0 enumC16313m1 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BooleanSerializer.INSTANCE, null);
            IconGradient iconGradient2 = (IconGradient) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            IconSize iconSize2 = (IconSize) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            String str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            InfoCalloutTileItemsAlignment infoCalloutTileItemsAlignment2 = (InfoCalloutTileItemsAlignment) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            Map map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            Action action2 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            i13 = 16383;
            infoCalloutTileAnalyticEvents = (InfoCalloutTileAnalyticEvents) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, InfoCalloutTileAnalyticEvents$$serializer.INSTANCE, null);
            textResource2 = textResource5;
            enumC2888c = enumC2888c2;
            bool = bool2;
            str = str2;
            textResource = textResource4;
            infoCalloutTileItemsAlignment = infoCalloutTileItemsAlignment2;
            list = list2;
            iconSize = iconSize2;
            iconGradient = iconGradient2;
            infoCalloutStyle = infoCalloutStyle2;
            enumC16313m0 = enumC16313m1;
            action = action2;
            map = map2;
        } else {
            boolean z4 = true;
            InfoCalloutTileAnalyticEvents infoCalloutTileAnalyticEvents2 = null;
            TextResource textResource6 = null;
            InfoCalloutStyle infoCalloutStyle3 = null;
            IconSize iconSize3 = null;
            InfoCalloutTileItemsAlignment infoCalloutTileItemsAlignment3 = null;
            TextResource textResource7 = null;
            int i14 = 10;
            int i15 = 9;
            int i16 = 7;
            int i17 = 6;
            int i18 = 3;
            int i19 = 4;
            int i24 = 2;
            i13 = 0;
            EnumC2888c enumC2888c3 = null;
            Action action3 = null;
            Map map3 = null;
            List list3 = null;
            String str3 = null;
            Boolean bool3 = null;
            IconGradient iconGradient3 = null;
            EnumC16313m0 enumC16313m2 = null;
            while (z4) {
                TextResource textResource8 = textResource6;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        textResource3 = textResource8;
                        z4 = false;
                        textResource6 = textResource3;
                        infoCalloutStyle3 = infoCalloutStyle3;
                        infoCalloutTileAnalyticEvents2 = infoCalloutTileAnalyticEvents2;
                        i24 = 2;
                        i18 = 3;
                        i19 = 4;
                        i17 = 6;
                        i16 = 7;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 0:
                        textResource3 = textResource8;
                        textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource7);
                        i13 |= 1;
                        textResource6 = textResource3;
                        infoCalloutStyle3 = infoCalloutStyle3;
                        infoCalloutTileAnalyticEvents2 = infoCalloutTileAnalyticEvents2;
                        i24 = 2;
                        i18 = 3;
                        i19 = 4;
                        i17 = 6;
                        i16 = 7;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 1:
                        infoCalloutTileAnalyticEvents2 = infoCalloutTileAnalyticEvents2;
                        infoCalloutStyle3 = infoCalloutStyle3;
                        textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource8);
                        i13 |= 2;
                        infoCalloutStyle3 = infoCalloutStyle3;
                        infoCalloutTileAnalyticEvents2 = infoCalloutTileAnalyticEvents2;
                        i24 = 2;
                        i18 = 3;
                        i19 = 4;
                        i17 = 6;
                        i16 = 7;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 2:
                        EnumC2888c enumC2888c4 = enumC2888c3;
                        int i25 = i24;
                        enumC2888c3 = (EnumC2888c) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i25, (InterfaceC37137b) interfaceC23462hArr[i24].getValue(), enumC2888c4);
                        i13 |= 4;
                        i24 = i25;
                        infoCalloutTileAnalyticEvents2 = infoCalloutTileAnalyticEvents2;
                        textResource6 = textResource8;
                        i18 = 3;
                        i19 = 4;
                        i17 = 6;
                        i16 = 7;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 3:
                        infoCalloutStyle3 = (InfoCalloutStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), infoCalloutStyle3);
                        i13 |= 8;
                        textResource6 = textResource8;
                        enumC2888c3 = enumC2888c3;
                        i19 = 4;
                        i17 = 6;
                        i16 = 7;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 4:
                        enumC16313m2 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), enumC16313m2);
                        i13 |= 16;
                        textResource6 = textResource8;
                        enumC2888c3 = enumC2888c3;
                        i17 = 6;
                        i16 = 7;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 5:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BooleanSerializer.INSTANCE, bool3);
                        i13 |= 32;
                        textResource6 = textResource8;
                        enumC2888c3 = enumC2888c3;
                        i17 = 6;
                        i16 = 7;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 6:
                        iconGradient3 = (IconGradient) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), iconGradient3);
                        i13 |= 64;
                        textResource6 = textResource8;
                        enumC2888c3 = enumC2888c3;
                        i16 = 7;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 7:
                        iconSize3 = (IconSize) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), iconSize3);
                        i13 |= 128;
                        textResource6 = textResource8;
                        enumC2888c3 = enumC2888c3;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 8:
                        str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str3);
                        i13 |= 256;
                        textResource6 = textResource8;
                        enumC2888c3 = enumC2888c3;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 9:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list3);
                        i13 |= 512;
                        textResource6 = textResource8;
                        enumC2888c3 = enumC2888c3;
                        i14 = 10;
                        break;
                    case 10:
                        infoCalloutTileItemsAlignment3 = (InfoCalloutTileItemsAlignment) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), infoCalloutTileItemsAlignment3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        textResource6 = textResource8;
                        enumC2888c3 = enumC2888c3;
                        break;
                    case 11:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), map3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        textResource6 = textResource8;
                        enumC2888c3 = enumC2888c3;
                        break;
                    case 12:
                        action3 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), action3);
                        i13 |= 4096;
                        textResource6 = textResource8;
                        enumC2888c3 = enumC2888c3;
                        break;
                    case 13:
                        infoCalloutTileAnalyticEvents2 = (InfoCalloutTileAnalyticEvents) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, InfoCalloutTileAnalyticEvents$$serializer.INSTANCE, infoCalloutTileAnalyticEvents2);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        textResource6 = textResource8;
                        enumC2888c3 = enumC2888c3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            textResource = textResource7;
            iconSize = iconSize3;
            infoCalloutTileItemsAlignment = infoCalloutTileItemsAlignment3;
            enumC2888c = enumC2888c3;
            action = action3;
            map = map3;
            list = list3;
            str = str3;
            bool = bool3;
            iconGradient = iconGradient3;
            enumC16313m0 = enumC16313m2;
            textResource2 = textResource6;
            infoCalloutStyle = infoCalloutStyle3;
            infoCalloutTileAnalyticEvents = infoCalloutTileAnalyticEvents2;
        }
        int i26 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new InfoCalloutTileModel(i26, textResource, textResource2, enumC2888c, infoCalloutStyle, enumC16313m0, bool, iconGradient, iconSize, str, list, infoCalloutTileItemsAlignment, map, action, infoCalloutTileAnalyticEvents, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, InfoCalloutTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        InfoCalloutTileModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
