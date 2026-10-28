package com.whoop.design.models.items;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.DismissEventModel$$serializer;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/NavigationButtonModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/NavigationButtonModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/NavigationButtonModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/NavigationButtonModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class NavigationButtonModel$$serializer implements GeneratedSerializer<NavigationButtonModel> {
    public static final int $stable;
    public static final NavigationButtonModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        NavigationButtonModel$$serializer navigationButtonModel$$serializer = new NavigationButtonModel$$serializer();
        INSTANCE = navigationButtonModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.NavigationButtonModel", navigationButtonModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("iconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("contentDescription", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("dismissEvent", true);
        pluginGeneratedSerialDescriptor.addElement("dismissModal", true);
        pluginGeneratedSerialDescriptor.addElement("analyticEvent", true);
        pluginGeneratedSerialDescriptor.addElement("glow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NavigationButtonModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = NavigationButtonModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[1].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d(DismissEventModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(AnalyticEventModel$$serializer.INSTANCE), AbstractC38195a.m122336d(GlowModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final NavigationButtonModel deserialize(InterfaceC40541d decoder) {
        int i13;
        AnalyticEventModel analyticEventModel;
        Action action;
        C9598e c9598e;
        GlowModel glowModel;
        AnyModal anyModal;
        DismissEventModel dismissEventModel;
        String str;
        String str2;
        String str3;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = NavigationButtonModel.$childSerializers;
        int i14 = 9;
        String str4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            EnumC16313m0 enumC16313m1 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            Action action2 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            DismissEventModel dismissEventModel2 = (DismissEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, DismissEventModel$$serializer.INSTANCE, null);
            AnyModal anyModal2 = (AnyModal) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            AnalyticEventModel analyticEventModel2 = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, AnalyticEventModel$$serializer.INSTANCE, null);
            anyModal = anyModal2;
            str = str7;
            glowModel = (GlowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, GlowModel$$serializer.INSTANCE, null);
            dismissEventModel = dismissEventModel2;
            c9598e = c9598e2;
            analyticEventModel = analyticEventModel2;
            str2 = str6;
            i13 = 1023;
            action = action2;
            enumC16313m0 = enumC16313m1;
            str3 = str5;
        } else {
            int i15 = 7;
            int i16 = 5;
            int i17 = 4;
            int i18 = 1;
            boolean z4 = true;
            int i19 = 0;
            AnalyticEventModel analyticEventModel3 = null;
            Action action3 = null;
            C9598e c9598e3 = null;
            GlowModel glowModel2 = null;
            AnyModal anyModal3 = null;
            DismissEventModel dismissEventModel3 = null;
            String str8 = null;
            String str9 = null;
            EnumC16313m0 enumC16313m2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 9;
                        i18 = 1;
                        i17 = 4;
                        i16 = 5;
                        i15 = 7;
                        break;
                    case 0:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str4);
                        i19 |= 1;
                        i14 = 9;
                        i18 = 1;
                        i17 = 4;
                        i16 = 5;
                        i15 = 7;
                        break;
                    case 1:
                        enumC16313m2 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), enumC16313m2);
                        i19 |= 2;
                        i14 = 9;
                        i17 = 4;
                        i16 = 5;
                        i15 = 7;
                        break;
                    case 2:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str9);
                        i19 |= 4;
                        i14 = 9;
                        i17 = 4;
                        i16 = 5;
                        i15 = 7;
                        break;
                    case 3:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str8);
                        i19 |= 8;
                        i14 = 9;
                        i17 = 4;
                        i16 = 5;
                        i15 = 7;
                        break;
                    case 4:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), c9598e3);
                        i19 |= 16;
                        i14 = 9;
                        i16 = 5;
                        i15 = 7;
                        break;
                    case 5:
                        action3 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), action3);
                        i19 |= 32;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 6:
                        dismissEventModel3 = (DismissEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, DismissEventModel$$serializer.INSTANCE, dismissEventModel3);
                        i19 |= 64;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 7:
                        anyModal3 = (AnyModal) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), anyModal3);
                        i19 |= 128;
                        i14 = 9;
                        break;
                    case 8:
                        analyticEventModel3 = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, AnalyticEventModel$$serializer.INSTANCE, analyticEventModel3);
                        i19 |= 256;
                        i14 = 9;
                        break;
                    case 9:
                        glowModel2 = (GlowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, GlowModel$$serializer.INSTANCE, glowModel2);
                        i19 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i19;
            analyticEventModel = analyticEventModel3;
            action = action3;
            c9598e = c9598e3;
            glowModel = glowModel2;
            anyModal = anyModal3;
            dismissEventModel = dismissEventModel3;
            str = str8;
            str2 = str9;
            str3 = str4;
            enumC16313m0 = enumC16313m2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new NavigationButtonModel(i13, str3, enumC16313m0, str2, str, c9598e, action, dismissEventModel, anyModal, analyticEventModel, glowModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, NavigationButtonModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        NavigationButtonModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
