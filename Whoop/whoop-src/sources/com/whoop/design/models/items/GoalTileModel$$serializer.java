package com.whoop.design.models.items;

import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/GoalTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/GoalTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/GoalTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/GoalTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class GoalTileModel$$serializer implements GeneratedSerializer<GoalTileModel> {
    public static final int $stable;
    public static final GoalTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        GoalTileModel$$serializer goalTileModel$$serializer = new GoalTileModel$$serializer();
        INSTANCE = goalTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.GoalTileModel", goalTileModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("titleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("checkmarkStyle", false);
        pluginGeneratedSerialDescriptor.addElement("progressDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("goalDays", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("days", false);
        pluginGeneratedSerialDescriptor.addElement("destination", true);
        pluginGeneratedSerialDescriptor.addElement("bottomInfoSheet", false);
        pluginGeneratedSerialDescriptor.addElement("circularProgressIndicator", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GoalTileModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = GoalTileModel.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, interfaceC23462hArr[1].getValue(), c25452a, IntSerializer.INSTANCE, AbstractC38195a.m122336d(c25452a), interfaceC23462hArr[5].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d(BottomSheetInfoModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), AbstractC38195a.m122336d(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final GoalTileModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        List list;
        C9598e c9598e;
        TextResource textResource;
        CircularProgressIndicator circularProgressIndicator;
        BottomSheetInfoModel bottomSheetInfoModel;
        TextResource textResource2;
        CheckmarkStyle checkmarkStyle;
        int i14;
        TextResource textResource3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = GoalTileModel.$childSerializers;
        int i15 = 9;
        int i16 = 8;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            CheckmarkStyle checkmarkStyle2 = (CheckmarkStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c25452a, null);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, c25452a, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            BottomSheetInfoModel bottomSheetInfoModel2 = (BottomSheetInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, BottomSheetInfoModel$$serializer.INSTANCE, null);
            circularProgressIndicator = (CircularProgressIndicator) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            textResource = textResource6;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, null);
            bottomSheetInfoModel = bottomSheetInfoModel2;
            i13 = iDecodeIntElement;
            list = list2;
            textResource2 = textResource5;
            c9598e = c9598e2;
            i14 = 1023;
            checkmarkStyle = checkmarkStyle2;
            textResource3 = textResource4;
        } else {
            int i17 = 6;
            int i18 = 5;
            int i19 = 1;
            boolean z4 = true;
            int iDecodeIntElement2 = 0;
            String str2 = null;
            List list3 = null;
            C9598e c9598e3 = null;
            TextResource textResource7 = null;
            CircularProgressIndicator circularProgressIndicator2 = null;
            BottomSheetInfoModel bottomSheetInfoModel3 = null;
            TextResource textResource8 = null;
            TextResource textResource9 = null;
            int i24 = 0;
            CheckmarkStyle checkmarkStyle3 = null;
            while (z4) {
                int i25 = i16;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i16 = 8;
                        i19 = 1;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 0:
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource9);
                        i24 |= 1;
                        i15 = 9;
                        i16 = 8;
                        i19 = 1;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 1:
                        checkmarkStyle3 = (CheckmarkStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), checkmarkStyle3);
                        i24 |= 2;
                        i15 = 9;
                        i16 = 8;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 2:
                        textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource8);
                        i24 |= 4;
                        i15 = 9;
                        i16 = 8;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 3:
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
                        i24 |= 8;
                        i15 = 9;
                        i16 = 8;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 4:
                        textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, C25452a.f99689a, textResource7);
                        i24 |= 16;
                        i15 = 9;
                        i16 = 8;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 5:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list3);
                        i24 |= 32;
                        i15 = 9;
                        i16 = 8;
                        i17 = 6;
                        break;
                    case 6:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), c9598e3);
                        i24 |= 64;
                        i15 = 9;
                        i16 = 8;
                        break;
                    case 7:
                        bottomSheetInfoModel3 = (BottomSheetInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, BottomSheetInfoModel$$serializer.INSTANCE, bottomSheetInfoModel3);
                        i24 |= 128;
                        i15 = 9;
                        i16 = 8;
                        break;
                    case 8:
                        circularProgressIndicator2 = (CircularProgressIndicator) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i25, (InterfaceC37137b) interfaceC23462hArr[i25].getValue(), circularProgressIndicator2);
                        i24 |= 256;
                        i16 = i25;
                        i15 = 9;
                        break;
                    case 9:
                        str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, StringSerializer.INSTANCE, str2);
                        i24 |= 512;
                        i16 = i25;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = iDecodeIntElement2;
            str = str2;
            list = list3;
            c9598e = c9598e3;
            textResource = textResource7;
            circularProgressIndicator = circularProgressIndicator2;
            bottomSheetInfoModel = bottomSheetInfoModel3;
            textResource2 = textResource8;
            checkmarkStyle = checkmarkStyle3;
            i14 = i24;
            textResource3 = textResource9;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new GoalTileModel(i14, textResource3, checkmarkStyle, textResource2, i13, textResource, list, c9598e, bottomSheetInfoModel, circularProgressIndicator, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, GoalTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        GoalTileModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
