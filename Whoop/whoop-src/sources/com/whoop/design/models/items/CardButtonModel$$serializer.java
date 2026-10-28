package com.whoop.design.models.items;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.DismissEventModel$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.whoopaction.domain.models.Action;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/CardButtonModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/CardButtonModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/CardButtonModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/CardButtonModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CardButtonModel$$serializer implements GeneratedSerializer<CardButtonModel> {
    public static final int $stable;
    public static final CardButtonModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CardButtonModel$$serializer cardButtonModel$$serializer = new CardButtonModel$$serializer();
        INSTANCE = cardButtonModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.CardButtonModel", cardButtonModel$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("card_name", true);
        pluginGeneratedSerialDescriptor.addElement("feature_type", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundStyle", true);
        pluginGeneratedSerialDescriptor.addElement("destination", true);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("analyticEvent", true);
        pluginGeneratedSerialDescriptor.addElement("modal", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("textStyle", true);
        pluginGeneratedSerialDescriptor.addElement("cornerRadius", true);
        pluginGeneratedSerialDescriptor.addElement("iconConfiguration", true);
        pluginGeneratedSerialDescriptor.addElement("dismiss_event", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("genericInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CardButtonModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CardButtonModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), C25452a.f99689a, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), AbstractC38195a.m122336d(AnalyticEventModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(DismissEventModel$$serializer.INSTANCE), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[18].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CardButtonModel deserialize(InterfaceC40541d decoder) {
        String str;
        Map map;
        String str2;
        String str3;
        Map map2;
        GenericInteraction genericInteraction;
        String str4;
        String str5;
        AnyModal anyModal;
        AnalyticEventModel analyticEventModel;
        String str6;
        Boolean bool;
        TextResource textResource;
        String str7;
        String str8;
        String str9;
        String str10;
        int i13;
        C9598e c9598e;
        Action action;
        DismissEventModel dismissEventModel;
        int i14;
        C9598e c9598e2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CardButtonModel.$childSerializers;
        String str11 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            TextResource textResource2 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            C9598e c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            Action action2 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            AnalyticEventModel analyticEventModel2 = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, AnalyticEventModel$$serializer.INSTANCE, null);
            AnyModal anyModal2 = (AnyModal) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            String str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            String str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            String str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            DismissEventModel dismissEventModel2 = (DismissEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, DismissEventModel$$serializer.INSTANCE, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, BooleanSerializer.INSTANCE, null);
            GenericInteraction genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, GenericInteraction$$serializer.INSTANCE, null);
            Map map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, (InterfaceC37137b) interfaceC23462hArr[18].getValue(), null);
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, LenientAggregateBindingsSerializer.INSTANCE, null);
            i13 = 1048575;
            str6 = str15;
            str7 = str13;
            c9598e = c9598e3;
            action = action2;
            textResource = textResource2;
            str = str12;
            analyticEventModel = analyticEventModel2;
            str10 = str16;
            str8 = strDecodeStringElement;
            str9 = str14;
            str2 = str17;
            genericInteraction = genericInteraction2;
            bool = bool2;
            map2 = map3;
            dismissEventModel = dismissEventModel2;
            str4 = str20;
            str5 = str19;
            str3 = str18;
            anyModal = anyModal2;
        } else {
            int i15 = 7;
            int i16 = 8;
            boolean z4 = true;
            int i17 = 0;
            DismissEventModel dismissEventModel3 = null;
            Action action3 = null;
            Map map4 = null;
            String str21 = null;
            String str22 = null;
            Map map5 = null;
            GenericInteraction genericInteraction3 = null;
            String str23 = null;
            AnyModal anyModal3 = null;
            AnalyticEventModel analyticEventModel3 = null;
            C9598e c9598e4 = null;
            Boolean bool3 = null;
            String strDecodeStringElement2 = null;
            String str24 = null;
            TextResource textResource3 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            while (z4) {
                C9598e c9598e5 = c9598e4;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i17 = i17;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        i15 = 7;
                        i16 = 8;
                        break;
                    case 0:
                        c9598e2 = c9598e5;
                        str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str24);
                        i17 |= 1;
                        textResource3 = textResource3;
                        c9598e4 = c9598e2;
                        action3 = action3;
                        dismissEventModel3 = dismissEventModel3;
                        i15 = 7;
                        i16 = 8;
                        break;
                    case 1:
                        c9598e2 = c9598e5;
                        textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource3);
                        i17 |= 2;
                        str25 = str25;
                        c9598e4 = c9598e2;
                        action3 = action3;
                        dismissEventModel3 = dismissEventModel3;
                        i15 = 7;
                        i16 = 8;
                        break;
                    case 2:
                        c9598e2 = c9598e5;
                        str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str25);
                        i17 |= 4;
                        str26 = str26;
                        c9598e4 = c9598e2;
                        action3 = action3;
                        dismissEventModel3 = dismissEventModel3;
                        i15 = 7;
                        i16 = 8;
                        break;
                    case 3:
                        c9598e2 = c9598e5;
                        str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str26);
                        i17 |= 8;
                        str28 = str28;
                        c9598e4 = c9598e2;
                        action3 = action3;
                        dismissEventModel3 = dismissEventModel3;
                        i15 = 7;
                        i16 = 8;
                        break;
                    case 4:
                        c9598e2 = c9598e5;
                        str27 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str27);
                        i17 |= 16;
                        c9598e4 = c9598e2;
                        action3 = action3;
                        dismissEventModel3 = dismissEventModel3;
                        i15 = 7;
                        i16 = 8;
                        break;
                    case 5:
                        c9598e2 = c9598e5;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i17 |= 32;
                        c9598e4 = c9598e2;
                        action3 = action3;
                        dismissEventModel3 = dismissEventModel3;
                        i15 = 7;
                        i16 = 8;
                        break;
                    case 6:
                        c9598e2 = c9598e5;
                        str28 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str28);
                        i17 |= 64;
                        c9598e4 = c9598e2;
                        action3 = action3;
                        dismissEventModel3 = dismissEventModel3;
                        i15 = 7;
                        i16 = 8;
                        break;
                    case 7:
                        DismissEventModel dismissEventModel4 = dismissEventModel3;
                        InterfaceC37137b interfaceC37137b = (InterfaceC37137b) interfaceC23462hArr[i15].getValue();
                        int i18 = i15;
                        c9598e4 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i18, interfaceC37137b, c9598e5);
                        i17 |= 128;
                        i15 = i18;
                        action3 = action3;
                        dismissEventModel3 = dismissEventModel4;
                        i16 = 8;
                        break;
                    case 8:
                        Action action4 = action3;
                        int i19 = i16;
                        action3 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), action4);
                        i17 |= 256;
                        i16 = i19;
                        dismissEventModel3 = dismissEventModel3;
                        c9598e4 = c9598e5;
                        break;
                    case 9:
                        action3 = action3;
                        analyticEventModel3 = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, AnalyticEventModel$$serializer.INSTANCE, analyticEventModel3);
                        i17 |= 512;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        break;
                    case 10:
                        action3 = action3;
                        anyModal3 = (AnyModal) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), anyModal3);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        break;
                    case 11:
                        action3 = action3;
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str21);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        break;
                    case 12:
                        action3 = action3;
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str22);
                        i17 |= 4096;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        break;
                    case 13:
                        action3 = action3;
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str23);
                        i17 |= DfuBaseService.ERROR_REMOTE_MASK;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        break;
                    case 14:
                        action3 = action3;
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str11);
                        i17 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        break;
                    case 15:
                        dismissEventModel3 = (DismissEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, DismissEventModel$$serializer.INSTANCE, dismissEventModel3);
                        i14 = 32768;
                        i17 |= i14;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        break;
                    case 16:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, BooleanSerializer.INSTANCE, bool3);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i17 |= i14;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, GenericInteraction$$serializer.INSTANCE, genericInteraction3);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i17 |= i14;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        map5 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, (InterfaceC37137b) interfaceC23462hArr[18].getValue(), map5);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i17 |= i14;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        action3 = action3;
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, LenientAggregateBindingsSerializer.INSTANCE, map4);
                        i17 |= 524288;
                        c9598e4 = c9598e5;
                        action3 = action3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str24;
            map = map4;
            str2 = str21;
            str3 = str22;
            map2 = map5;
            genericInteraction = genericInteraction3;
            str4 = str11;
            str5 = str23;
            anyModal = anyModal3;
            analyticEventModel = analyticEventModel3;
            str6 = str27;
            bool = bool3;
            textResource = textResource3;
            str7 = str25;
            str8 = strDecodeStringElement2;
            str9 = str26;
            str10 = str28;
            i13 = i17;
            c9598e = c9598e4;
            action = action3;
            dismissEventModel = dismissEventModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CardButtonModel(i13, str, textResource, str7, str9, str6, str8, str10, c9598e, action, analyticEventModel, anyModal, str2, str3, str5, str4, dismissEventModel, bool, genericInteraction, map2, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CardButtonModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CardButtonModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
