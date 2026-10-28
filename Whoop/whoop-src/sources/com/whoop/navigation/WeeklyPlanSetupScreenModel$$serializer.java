package com.whoop.navigation;

import com.mapbox.common.HttpHeaders;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/navigation/WeeklyPlanSetupScreenModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WeeklyPlanSetupScreenModel$$serializer implements GeneratedSerializer<WeeklyPlanSetupScreenModel> {
    public static final int $stable;
    public static final WeeklyPlanSetupScreenModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WeeklyPlanSetupScreenModel$$serializer weeklyPlanSetupScreenModel$$serializer = new WeeklyPlanSetupScreenModel$$serializer();
        INSTANCE = weeklyPlanSetupScreenModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.navigation.WeeklyPlanSetupScreenModel", weeklyPlanSetupScreenModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("planName", false);
        pluginGeneratedSerialDescriptor.addElement("locked", true);
        pluginGeneratedSerialDescriptor.addElement("noPlanShowMetricSelection", true);
        pluginGeneratedSerialDescriptor.addElement("analyticsSource", false);
        pluginGeneratedSerialDescriptor.addElement("initialSelection", true);
        pluginGeneratedSerialDescriptor.addElement(HttpHeaders.DATE, true);
        pluginGeneratedSerialDescriptor.addElement("source", true);
        pluginGeneratedSerialDescriptor.addElement("presetPlanCategory", true);
        pluginGeneratedSerialDescriptor.addElement("planTitle", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("explanationTitle", true);
        pluginGeneratedSerialDescriptor.addElement("explanation", true);
        pluginGeneratedSerialDescriptor.addElement("templateId", true);
        pluginGeneratedSerialDescriptor.addElement("category", true);
        pluginGeneratedSerialDescriptor.addElement("carouselPlacement", true);
        pluginGeneratedSerialDescriptor.addElement("dismissalType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WeeklyPlanSetupScreenModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(InitialSelectionModel$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d8 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d9 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d10 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d11 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d12 = AbstractC38195a.m122336d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, interfaceC37138cM122336d7, interfaceC37138cM122336d8, interfaceC37138cM122336d9, interfaceC37138cM122336d10, interfaceC37138cM122336d11, interfaceC37138cM122336d12};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WeeklyPlanSetupScreenModel deserialize(InterfaceC40541d decoder) {
        String str;
        InitialSelectionModel initialSelectionModel;
        int i13;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        boolean z4;
        boolean z13;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            InitialSelectionModel initialSelectionModel2 = (InitialSelectionModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, InitialSelectionModel$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            String str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            String str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            String str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, stringSerializer, null);
            z4 = zDecodeBooleanElement2;
            z13 = zDecodeBooleanElement;
            str12 = strDecodeStringElement2;
            i13 = 65535;
            str9 = str20;
            str5 = str19;
            str6 = str18;
            str10 = str16;
            str8 = str15;
            str = str14;
            initialSelectionModel = initialSelectionModel2;
            str7 = str17;
            str2 = str23;
            str3 = str22;
            str4 = str21;
            str11 = strDecodeStringElement;
        } else {
            boolean z14 = true;
            boolean zDecodeBooleanElement3 = false;
            String str24 = null;
            String str25 = null;
            InitialSelectionModel initialSelectionModel3 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z14) {
                boolean z15 = zDecodeBooleanElement4;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        str24 = str24;
                        zDecodeBooleanElement4 = z15;
                        break;
                    case 0:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 |= 1;
                        str24 = str24;
                        zDecodeBooleanElement4 = z15;
                        break;
                    case 1:
                        i14 |= 2;
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
                        str24 = str24;
                        break;
                    case 2:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                        i14 |= 4;
                        str24 = str24;
                        zDecodeBooleanElement4 = z15;
                        break;
                    case 3:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i14 |= 8;
                        str24 = str24;
                        zDecodeBooleanElement4 = z15;
                        break;
                    case 4:
                        initialSelectionModel3 = (InitialSelectionModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, InitialSelectionModel$$serializer.INSTANCE, initialSelectionModel3);
                        i14 |= 16;
                        str24 = str24;
                        zDecodeBooleanElement4 = z15;
                        break;
                    case 5:
                        str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str25);
                        i14 |= 32;
                        zDecodeBooleanElement4 = z15;
                        initialSelectionModel3 = initialSelectionModel3;
                        break;
                    case 6:
                        str32 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str32);
                        i14 |= 64;
                        zDecodeBooleanElement4 = z15;
                        initialSelectionModel3 = initialSelectionModel3;
                        break;
                    case 7:
                        str34 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str34);
                        i14 |= 128;
                        zDecodeBooleanElement4 = z15;
                        initialSelectionModel3 = initialSelectionModel3;
                        break;
                    case 8:
                        str31 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str31);
                        i14 |= 256;
                        zDecodeBooleanElement4 = z15;
                        initialSelectionModel3 = initialSelectionModel3;
                        break;
                    case 9:
                        str30 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str30);
                        i14 |= 512;
                        zDecodeBooleanElement4 = z15;
                        initialSelectionModel3 = initialSelectionModel3;
                        break;
                    case 10:
                        str29 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str29);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        zDecodeBooleanElement4 = z15;
                        initialSelectionModel3 = initialSelectionModel3;
                        break;
                    case 11:
                        str33 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str33);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        zDecodeBooleanElement4 = z15;
                        initialSelectionModel3 = initialSelectionModel3;
                        break;
                    case 12:
                        str28 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str28);
                        i14 |= 4096;
                        zDecodeBooleanElement4 = z15;
                        initialSelectionModel3 = initialSelectionModel3;
                        break;
                    case 13:
                        str27 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str27);
                        i14 |= DfuBaseService.ERROR_REMOTE_MASK;
                        zDecodeBooleanElement4 = z15;
                        initialSelectionModel3 = initialSelectionModel3;
                        break;
                    case 14:
                        str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str26);
                        i14 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        zDecodeBooleanElement4 = z15;
                        initialSelectionModel3 = initialSelectionModel3;
                        break;
                    case 15:
                        str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, StringSerializer.INSTANCE, str24);
                        i14 |= 32768;
                        zDecodeBooleanElement4 = z15;
                        initialSelectionModel3 = initialSelectionModel3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str25;
            initialSelectionModel = initialSelectionModel3;
            i13 = i14;
            str2 = str26;
            str3 = str27;
            str4 = str28;
            str5 = str29;
            str6 = str30;
            str7 = str31;
            str8 = str32;
            str9 = str33;
            str10 = str34;
            str11 = strDecodeStringElement3;
            str12 = strDecodeStringElement4;
            str13 = str24;
            z4 = zDecodeBooleanElement3;
            z13 = zDecodeBooleanElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WeeklyPlanSetupScreenModel(i13, str11, z13, z4, str12, initialSelectionModel, str, str8, str10, str7, str6, str5, str9, str4, str3, str2, str13, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WeeklyPlanSetupScreenModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WeeklyPlanSetupScreenModel.write$Self$navigation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
