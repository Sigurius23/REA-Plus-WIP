package com.whoop.design.models.items;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.DismissEventModel$$serializer;
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
import ny0.EnumC27267m0;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/SecondaryButtonModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/SecondaryButtonModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/SecondaryButtonModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SecondaryButtonModel$$serializer implements GeneratedSerializer<SecondaryButtonModel> {
    public static final int $stable;
    public static final SecondaryButtonModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SecondaryButtonModel$$serializer secondaryButtonModel$$serializer = new SecondaryButtonModel$$serializer();
        INSTANCE = secondaryButtonModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.SecondaryButtonModel", secondaryButtonModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("modal", true);
        pluginGeneratedSerialDescriptor.addElement("analyticEvent", true);
        pluginGeneratedSerialDescriptor.addElement("dismissEvent", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("alignment", true);
        pluginGeneratedSerialDescriptor.addElement("isEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SecondaryButtonModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SecondaryButtonModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), C25452a.f99689a, interfaceC23462hArr[2].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue()), AbstractC38195a.m122336d(AnalyticEventModel$$serializer.INSTANCE), AbstractC38195a.m122336d(DismissEventModel$$serializer.INSTANCE), interfaceC23462hArr[6].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SecondaryButtonModel deserialize(InterfaceC40541d decoder) {
        TextResource textResource;
        Map map;
        int i13;
        Map map2;
        String str;
        EnumC27267m0 enumC27267m0;
        Boolean bool;
        DismissEventModel dismissEventModel;
        AnalyticEventModel analyticEventModel;
        AnyModal anyModal;
        C9598e c9598e;
        String str2;
        InterfaceC23462h[] interfaceC23462hArr;
        InterfaceC23462h[] interfaceC23462hArr2;
        InterfaceC23462h[] interfaceC23462hArr3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr4 = SecondaryButtonModel.$childSerializers;
        int i14 = 9;
        String str3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            textResource = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr4[2].getValue(), null);
            AnyModal anyModal2 = (AnyModal) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr4[3].getValue(), null);
            AnalyticEventModel analyticEventModel2 = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, AnalyticEventModel$$serializer.INSTANCE, null);
            DismissEventModel dismissEventModel2 = (DismissEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, DismissEventModel$$serializer.INSTANCE, null);
            EnumC27267m0 enumC27267m1 = (EnumC27267m0) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr4[6].getValue(), null);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, BooleanSerializer.INSTANCE, null);
            Map map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr4[9].getValue(), null);
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, LenientAggregateBindingsSerializer.INSTANCE, null);
            map2 = map3;
            str = str5;
            bool = bool2;
            dismissEventModel = dismissEventModel2;
            analyticEventModel = analyticEventModel2;
            i13 = 2047;
            enumC27267m0 = enumC27267m1;
            anyModal = anyModal2;
            c9598e = c9598e2;
            str2 = str4;
        } else {
            int i15 = 6;
            int i16 = 3;
            int i17 = 2;
            boolean z4 = true;
            int i18 = 0;
            textResource = null;
            Map map4 = null;
            String str6 = null;
            map = null;
            EnumC27267m0 enumC27267m2 = null;
            Boolean bool3 = null;
            DismissEventModel dismissEventModel3 = null;
            AnalyticEventModel analyticEventModel3 = null;
            AnyModal anyModal3 = null;
            C9598e c9598e3 = null;
            while (z4) {
                int i19 = i14;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        interfaceC23462hArr4 = interfaceC23462hArr4;
                        i14 = 9;
                        i17 = 2;
                        i16 = 3;
                        i15 = 6;
                        break;
                    case 0:
                        str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str3);
                        i18 |= 1;
                        interfaceC23462hArr4 = interfaceC23462hArr4;
                        i14 = 9;
                        i17 = 2;
                        i16 = 3;
                        i15 = 6;
                        break;
                    case 1:
                        textResource = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource);
                        i18 |= 2;
                        interfaceC23462hArr4 = interfaceC23462hArr4;
                        i14 = 9;
                        i17 = 2;
                        i16 = 3;
                        i15 = 6;
                        break;
                    case 2:
                        InterfaceC23462h[] interfaceC23462hArr5 = interfaceC23462hArr4;
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr5[i17].getValue(), c9598e3);
                        i18 |= 4;
                        interfaceC23462hArr4 = interfaceC23462hArr5;
                        i14 = 9;
                        i16 = 3;
                        i15 = 6;
                        break;
                    case 3:
                        interfaceC23462hArr2 = interfaceC23462hArr4;
                        anyModal3 = (AnyModal) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr2[i16].getValue(), anyModal3);
                        i18 |= 8;
                        interfaceC23462hArr4 = interfaceC23462hArr2;
                        i14 = 9;
                        i15 = 6;
                        break;
                    case 4:
                        interfaceC23462hArr2 = interfaceC23462hArr4;
                        analyticEventModel3 = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, AnalyticEventModel$$serializer.INSTANCE, analyticEventModel3);
                        i18 |= 16;
                        interfaceC23462hArr4 = interfaceC23462hArr2;
                        i14 = 9;
                        i15 = 6;
                        break;
                    case 5:
                        interfaceC23462hArr2 = interfaceC23462hArr4;
                        dismissEventModel3 = (DismissEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, DismissEventModel$$serializer.INSTANCE, dismissEventModel3);
                        i18 |= 32;
                        interfaceC23462hArr4 = interfaceC23462hArr2;
                        i14 = 9;
                        i15 = 6;
                        break;
                    case 6:
                        interfaceC23462hArr3 = interfaceC23462hArr4;
                        enumC27267m2 = (EnumC27267m0) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr3[i15].getValue(), enumC27267m2);
                        i18 |= 64;
                        interfaceC23462hArr4 = interfaceC23462hArr3;
                        i14 = 9;
                        break;
                    case 7:
                        interfaceC23462hArr3 = interfaceC23462hArr4;
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str6);
                        i18 |= 128;
                        interfaceC23462hArr4 = interfaceC23462hArr3;
                        i14 = 9;
                        break;
                    case 8:
                        interfaceC23462hArr3 = interfaceC23462hArr4;
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, BooleanSerializer.INSTANCE, bool3);
                        i18 |= 256;
                        interfaceC23462hArr4 = interfaceC23462hArr3;
                        i14 = 9;
                        break;
                    case 9:
                        interfaceC23462hArr = interfaceC23462hArr4;
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), map4);
                        i18 |= 512;
                        i14 = i19;
                        interfaceC23462hArr4 = interfaceC23462hArr;
                        break;
                    case 10:
                        interfaceC23462hArr = interfaceC23462hArr4;
                        map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, LenientAggregateBindingsSerializer.INSTANCE, map);
                        i18 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i14 = i19;
                        interfaceC23462hArr4 = interfaceC23462hArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i18;
            map2 = map4;
            str = str6;
            enumC27267m0 = enumC27267m2;
            bool = bool3;
            dismissEventModel = dismissEventModel3;
            analyticEventModel = analyticEventModel3;
            anyModal = anyModal3;
            c9598e = c9598e3;
            str2 = str3;
        }
        TextResource textResource2 = textResource;
        Map map5 = map;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SecondaryButtonModel(i13, str2, textResource2, c9598e, anyModal, analyticEventModel, dismissEventModel, enumC27267m0, str, bool, map2, map5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SecondaryButtonModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SecondaryButtonModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
