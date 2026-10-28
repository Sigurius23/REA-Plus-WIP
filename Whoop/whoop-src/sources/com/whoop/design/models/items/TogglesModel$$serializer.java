package com.whoop.design.models.items;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/TogglesModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/TogglesModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/TogglesModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/TogglesModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TogglesModel$$serializer implements GeneratedSerializer<TogglesModel> {
    public static final int $stable;
    public static final TogglesModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TogglesModel$$serializer togglesModel$$serializer = new TogglesModel$$serializer();
        INSTANCE = togglesModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.TogglesModel", togglesModel$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("categories", false);
        pluginGeneratedSerialDescriptor.addElement("avoidTextDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("trend", false);
        pluginGeneratedSerialDescriptor.addElement("isToggled", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundImage", false);
        pluginGeneratedSerialDescriptor.addElement("selectedValue", false);
        pluginGeneratedSerialDescriptor.addElement("selected", false);
        pluginGeneratedSerialDescriptor.addElement("isAvoidChecked", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("dayOptions", false);
        pluginGeneratedSerialDescriptor.addElement("sortPriority", false);
        pluginGeneratedSerialDescriptor.addElement("weeklyPlanGoal", false);
        pluginGeneratedSerialDescriptor.addElement("bottom_info_sheet", false);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        pluginGeneratedSerialDescriptor.addElement("custom", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TogglesModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TogglesModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[4].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(ImpactModel$$serializer.INSTANCE), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer), interfaceC23462hArr[12].getValue(), AbstractC38195a.m122336d(DayOptions$$serializer.INSTANCE), AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(BottomSheetInfoModel$$serializer.INSTANCE), AbstractC38195a.m122336d(GoalSettingsTileTagModel$$serializer.INSTANCE), AbstractC38195a.m122336d(booleanSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TogglesModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        Boolean bool;
        Boolean bool2;
        BottomSheetInfoModel bottomSheetInfoModel;
        GoalSettingsTileTagModel goalSettingsTileTagModel;
        Boolean bool3;
        GoalSettingsTileStyle goalSettingsTileStyle;
        Boolean bool4;
        Integer num;
        String str2;
        Boolean bool5;
        String str3;
        List list;
        String str4;
        ImpactModel impactModel;
        Integer num2;
        DayOptions dayOptions;
        String str5;
        String str6;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = TogglesModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            ImpactModel impactModel2 = (ImpactModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, ImpactModel$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, booleanSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, intSerializer, null);
            Boolean bool7 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, booleanSerializer, null);
            Boolean bool8 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, booleanSerializer, null);
            GoalSettingsTileStyle goalSettingsTileStyle2 = (GoalSettingsTileStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            DayOptions dayOptions2 = (DayOptions) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, DayOptions$$serializer.INSTANCE, null);
            Integer num4 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, intSerializer, null);
            Boolean bool9 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, booleanSerializer, null);
            BottomSheetInfoModel bottomSheetInfoModel2 = (BottomSheetInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, BottomSheetInfoModel$$serializer.INSTANCE, null);
            i13 = 524287;
            goalSettingsTileTagModel = (GoalSettingsTileTagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, GoalSettingsTileTagModel$$serializer.INSTANCE, null);
            bool = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, booleanSerializer, null);
            str = str7;
            str2 = str10;
            str6 = strDecodeStringElement2;
            list = list2;
            bool3 = bool9;
            str4 = str9;
            num = num3;
            bool5 = bool6;
            impactModel = impactModel2;
            str3 = str8;
            bottomSheetInfoModel = bottomSheetInfoModel2;
            dayOptions = dayOptions2;
            num2 = num4;
            goalSettingsTileStyle = goalSettingsTileStyle2;
            str5 = strDecodeStringElement;
            bool4 = bool7;
            bool2 = bool8;
        } else {
            int i15 = 4;
            boolean z4 = true;
            DayOptions dayOptions3 = null;
            Integer num5 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            GoalSettingsTileTagModel goalSettingsTileTagModel2 = null;
            Boolean bool13 = null;
            GoalSettingsTileStyle goalSettingsTileStyle3 = null;
            Boolean bool14 = null;
            Integer num6 = null;
            String str11 = null;
            ImpactModel impactModel3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str12 = null;
            String str13 = null;
            List list3 = null;
            String str14 = null;
            i13 = 0;
            BottomSheetInfoModel bottomSheetInfoModel3 = null;
            while (z4) {
                ImpactModel impactModel4 = impactModel3;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        bool12 = bool12;
                        impactModel3 = impactModel4;
                        num5 = num5;
                        dayOptions3 = dayOptions3;
                        i15 = 4;
                        break;
                    case 0:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i13 |= 1;
                        bool12 = bool12;
                        impactModel3 = impactModel4;
                        num5 = num5;
                        dayOptions3 = dayOptions3;
                        i15 = 4;
                        break;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i13 |= 2;
                        bool12 = bool12;
                        impactModel3 = impactModel4;
                        num5 = num5;
                        dayOptions3 = dayOptions3;
                        i15 = 4;
                        break;
                    case 2:
                        dayOptions3 = dayOptions3;
                        num5 = num5;
                        impactModel4 = impactModel4;
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str12);
                        i13 |= 4;
                        bool12 = bool12;
                        str13 = str13;
                        impactModel3 = impactModel4;
                        num5 = num5;
                        dayOptions3 = dayOptions3;
                        i15 = 4;
                        break;
                    case 3:
                        dayOptions3 = dayOptions3;
                        num5 = num5;
                        impactModel4 = impactModel4;
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str13);
                        i13 |= 8;
                        bool12 = bool12;
                        list3 = list3;
                        impactModel3 = impactModel4;
                        num5 = num5;
                        dayOptions3 = dayOptions3;
                        i15 = 4;
                        break;
                    case 4:
                        DayOptions dayOptions4 = dayOptions3;
                        Boolean bool15 = bool12;
                        InterfaceC37137b interfaceC37137b = (InterfaceC37137b) interfaceC23462hArr[i15].getValue();
                        int i16 = i15;
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, interfaceC37137b, list3);
                        i13 |= 16;
                        bool12 = bool15;
                        str14 = str14;
                        impactModel3 = impactModel4;
                        dayOptions3 = dayOptions4;
                        i15 = i16;
                        num5 = num5;
                        break;
                    case 5:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str14);
                        i13 |= 32;
                        bool12 = bool12;
                        impactModel3 = impactModel4;
                        num5 = num5;
                        dayOptions3 = dayOptions3;
                        break;
                    case 6:
                        i13 |= 64;
                        bool12 = bool12;
                        num5 = num5;
                        impactModel3 = (ImpactModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, ImpactModel$$serializer.INSTANCE, impactModel4);
                        dayOptions3 = dayOptions3;
                        break;
                    case 7:
                        bool12 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, BooleanSerializer.INSTANCE, bool12);
                        i13 |= 128;
                        dayOptions3 = dayOptions3;
                        impactModel3 = impactModel4;
                        break;
                    case 8:
                        bool12 = bool12;
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str11);
                        i13 |= 256;
                        impactModel3 = impactModel4;
                        bool12 = bool12;
                        break;
                    case 9:
                        bool12 = bool12;
                        num6 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, IntSerializer.INSTANCE, num6);
                        i13 |= 512;
                        impactModel3 = impactModel4;
                        bool12 = bool12;
                        break;
                    case 10:
                        bool12 = bool12;
                        bool14 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, BooleanSerializer.INSTANCE, bool14);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        impactModel3 = impactModel4;
                        bool12 = bool12;
                        break;
                    case 11:
                        bool12 = bool12;
                        bool11 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, BooleanSerializer.INSTANCE, bool11);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        impactModel3 = impactModel4;
                        bool12 = bool12;
                        break;
                    case 12:
                        bool12 = bool12;
                        goalSettingsTileStyle3 = (GoalSettingsTileStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), goalSettingsTileStyle3);
                        i13 |= 4096;
                        impactModel3 = impactModel4;
                        bool12 = bool12;
                        break;
                    case 13:
                        bool12 = bool12;
                        dayOptions3 = (DayOptions) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, DayOptions$$serializer.INSTANCE, dayOptions3);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        impactModel3 = impactModel4;
                        bool12 = bool12;
                        break;
                    case 14:
                        bool12 = bool12;
                        num5 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, IntSerializer.INSTANCE, num5);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        impactModel3 = impactModel4;
                        bool12 = bool12;
                        break;
                    case 15:
                        bool13 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, BooleanSerializer.INSTANCE, bool13);
                        i14 = 32768;
                        i13 |= i14;
                        impactModel3 = impactModel4;
                        bool12 = bool12;
                        break;
                    case 16:
                        bottomSheetInfoModel3 = (BottomSheetInfoModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, BottomSheetInfoModel$$serializer.INSTANCE, bottomSheetInfoModel3);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i13 |= i14;
                        impactModel3 = impactModel4;
                        bool12 = bool12;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        goalSettingsTileTagModel2 = (GoalSettingsTileTagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, GoalSettingsTileTagModel$$serializer.INSTANCE, goalSettingsTileTagModel2);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i13 |= i14;
                        impactModel3 = impactModel4;
                        bool12 = bool12;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        bool10 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, BooleanSerializer.INSTANCE, bool10);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i13 |= i14;
                        impactModel3 = impactModel4;
                        bool12 = bool12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str12;
            bool = bool10;
            bool2 = bool11;
            bottomSheetInfoModel = bottomSheetInfoModel3;
            goalSettingsTileTagModel = goalSettingsTileTagModel2;
            bool3 = bool13;
            goalSettingsTileStyle = goalSettingsTileStyle3;
            bool4 = bool14;
            num = num6;
            str2 = str11;
            bool5 = bool12;
            str3 = str13;
            list = list3;
            str4 = str14;
            impactModel = impactModel3;
            num2 = num5;
            dayOptions = dayOptions3;
            str5 = strDecodeStringElement3;
            str6 = strDecodeStringElement4;
        }
        int i17 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TogglesModel(i17, str5, str6, str, str3, list, str4, impactModel, bool5, str2, num, bool4, bool2, goalSettingsTileStyle, dayOptions, num2, bool3, bottomSheetInfoModel, goalSettingsTileTagModel, bool, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TogglesModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TogglesModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
