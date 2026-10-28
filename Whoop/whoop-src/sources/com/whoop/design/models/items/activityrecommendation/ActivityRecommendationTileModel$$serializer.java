package com.whoop.design.models.items.activityrecommendation;

import com.whoop.design.models.DesignSystemModel;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ActivityRecommendationTileModel$$serializer implements GeneratedSerializer<ActivityRecommendationTileModel> {
    public static final int $stable;
    public static final ActivityRecommendationTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ActivityRecommendationTileModel$$serializer activityRecommendationTileModel$$serializer = new ActivityRecommendationTileModel$$serializer();
        INSTANCE = activityRecommendationTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.activityrecommendation.ActivityRecommendationTileModel", activityRecommendationTileModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("is_selected", false);
        pluginGeneratedSerialDescriptor.addElement("icon_url", false);
        pluginGeneratedSerialDescriptor.addElement("activity_title", false);
        pluginGeneratedSerialDescriptor.addElement("activity_strain", false);
        pluginGeneratedSerialDescriptor.addElement("activity_duration", false);
        pluginGeneratedSerialDescriptor.addElement("activity_duration_unit", false);
        pluginGeneratedSerialDescriptor.addElement("activity_duration_label", false);
        pluginGeneratedSerialDescriptor.addElement("intensity_style", false);
        pluginGeneratedSerialDescriptor.addElement("intensity_title", false);
        pluginGeneratedSerialDescriptor.addElement("intensity_subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("target_zones", false);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("button_view_state", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityRecommendationTileModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ActivityRecommendationTileModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(TargetZonesModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue()), AbstractC38195a.m122336d(ActivityRecommendationButtonModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ActivityRecommendationTileModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        ActivityRecommendationButtonModel activityRecommendationButtonModel;
        DesignSystemModel designSystemModel;
        String str2;
        String str3;
        String str4;
        String str5;
        TargetZonesModel targetZonesModel;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z4;
        String str10;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ActivityRecommendationTileModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            TargetZonesModel targetZonesModel2 = (TargetZonesModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, TargetZonesModel$$serializer.INSTANCE, null);
            DesignSystemModel designSystemModel2 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            i13 = 16383;
            activityRecommendationButtonModel = (ActivityRecommendationButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, ActivityRecommendationButtonModel$$serializer.INSTANCE, null);
            str10 = strDecodeStringElement;
            z4 = zDecodeBooleanElement;
            str2 = str18;
            str3 = str17;
            str6 = str15;
            str5 = str14;
            str7 = str13;
            str9 = strDecodeStringElement2;
            str4 = str16;
            str = str12;
            str8 = str11;
            designSystemModel = designSystemModel2;
            targetZonesModel = targetZonesModel2;
        } else {
            boolean z13 = true;
            String strDecodeStringElement3 = null;
            String str19 = null;
            ActivityRecommendationButtonModel activityRecommendationButtonModel2 = null;
            DesignSystemModel designSystemModel3 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            TargetZonesModel targetZonesModel3 = null;
            String str24 = null;
            String str25 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement2 = false;
            String str26 = null;
            i13 = 0;
            while (true) {
                boolean z14 = zDecodeBooleanElement2;
                if (z13) {
                    int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z13 = false;
                            zDecodeBooleanElement2 = z14;
                            break;
                        case 0:
                            i13 |= 1;
                            strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                            zDecodeBooleanElement2 = z14;
                            break;
                        case 1:
                            strDecodeStringElement3 = strDecodeStringElement3;
                            i13 |= 2;
                            zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 2:
                            str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str26);
                            i13 |= 4;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 3:
                            strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                            i13 |= 8;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 4:
                            str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str19);
                            i13 |= 16;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 5:
                            str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str25);
                            i13 |= 32;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 6:
                            str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str23);
                            i13 |= 64;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 7:
                            str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str24);
                            i13 |= 128;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 8:
                            str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str22);
                            i13 |= 256;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 9:
                            str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str21);
                            i13 |= 512;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 10:
                            str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str20);
                            i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 11:
                            targetZonesModel3 = (TargetZonesModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, TargetZonesModel$$serializer.INSTANCE, targetZonesModel3);
                            i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 12:
                            designSystemModel3 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), designSystemModel3);
                            i13 |= 4096;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        case 13:
                            activityRecommendationButtonModel2 = (ActivityRecommendationButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, ActivityRecommendationButtonModel$$serializer.INSTANCE, activityRecommendationButtonModel2);
                            i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                            zDecodeBooleanElement2 = z14;
                            strDecodeStringElement3 = strDecodeStringElement3;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                } else {
                    str = str19;
                    activityRecommendationButtonModel = activityRecommendationButtonModel2;
                    designSystemModel = designSystemModel3;
                    str2 = str20;
                    str3 = str21;
                    str4 = str22;
                    str5 = str23;
                    targetZonesModel = targetZonesModel3;
                    str6 = str24;
                    str7 = str25;
                    str8 = str26;
                    str9 = strDecodeStringElement4;
                    z4 = z14;
                    str10 = strDecodeStringElement3;
                }
            }
        }
        int i14 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ActivityRecommendationTileModel(i14, str10, z4, str8, str9, str, str7, str5, str6, str4, str3, str2, targetZonesModel, designSystemModel, activityRecommendationButtonModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ActivityRecommendationTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ActivityRecommendationTileModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
