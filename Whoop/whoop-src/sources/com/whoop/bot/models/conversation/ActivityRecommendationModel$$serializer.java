package com.whoop.bot.models.conversation;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/bot/models/conversation/ActivityRecommendationModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ActivityRecommendationModel$$serializer implements GeneratedSerializer<ActivityRecommendationModel> {
    public static final int $stable;
    public static final ActivityRecommendationModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ActivityRecommendationModel$$serializer activityRecommendationModel$$serializer = new ActivityRecommendationModel$$serializer();
        INSTANCE = activityRecommendationModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.bot.models.conversation.ActivityRecommendationModel", activityRecommendationModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("recommendationId", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitles", false);
        pluginGeneratedSerialDescriptor.addElement("targetZones", false);
        pluginGeneratedSerialDescriptor.addElement("isSelected", false);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityRecommendationModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ActivityRecommendationModel.$childSerializers;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue());
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(ActivityRecommendationTargetZones$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue());
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(ActivityRecommendationCta$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, C25452a.f99689a, interfaceC37138cM122336d, interfaceC37138cM122336d2, BooleanSerializer.INSTANCE, interfaceC37138cM122336d3, interfaceC37138cM122336d4};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ActivityRecommendationModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        DesignSystemModel designSystemModel;
        ActivityRecommendationCta activityRecommendationCta;
        ActivityRecommendationTargetZones activityRecommendationTargetZones;
        List list;
        int i13;
        String str;
        String str2;
        TextResource textResource;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ActivityRecommendationModel.$childSerializers;
        int i14 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            TextResource textResource2 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            ActivityRecommendationTargetZones activityRecommendationTargetZones2 = (ActivityRecommendationTargetZones) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, ActivityRecommendationTargetZones$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            designSystemModel = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str = strDecodeStringElement;
            activityRecommendationCta = (ActivityRecommendationCta) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, ActivityRecommendationCta$$serializer.INSTANCE, null);
            z4 = zDecodeBooleanElement;
            activityRecommendationTargetZones = activityRecommendationTargetZones2;
            textResource = textResource2;
            i13 = 255;
            list = list2;
            str2 = strDecodeStringElement2;
        } else {
            int i15 = 3;
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            DesignSystemModel designSystemModel2 = null;
            ActivityRecommendationCta activityRecommendationCta2 = null;
            ActivityRecommendationTargetZones activityRecommendationTargetZones3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            TextResource textResource3 = null;
            int i16 = 0;
            List list3 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i15 = 3;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 7;
                        i15 = 3;
                        break;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 7;
                        i15 = 3;
                        break;
                    case 2:
                        textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource3);
                        i16 |= 4;
                        i14 = 7;
                        i15 = 3;
                        break;
                    case 3:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list3);
                        i16 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        activityRecommendationTargetZones3 = (ActivityRecommendationTargetZones) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, ActivityRecommendationTargetZones$$serializer.INSTANCE, activityRecommendationTargetZones3);
                        i16 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i16 |= 32;
                        break;
                    case 6:
                        designSystemModel2 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), designSystemModel2);
                        i16 |= 64;
                        break;
                    case 7:
                        activityRecommendationCta2 = (ActivityRecommendationCta) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, ActivityRecommendationCta$$serializer.INSTANCE, activityRecommendationCta2);
                        i16 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            designSystemModel = designSystemModel2;
            activityRecommendationCta = activityRecommendationCta2;
            activityRecommendationTargetZones = activityRecommendationTargetZones3;
            list = list3;
            i13 = i16;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            textResource = textResource3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ActivityRecommendationModel(i13, str, str2, textResource, list, activityRecommendationTargetZones, z4, designSystemModel, activityRecommendationCta, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ActivityRecommendationModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ActivityRecommendationModel.write$Self$bot_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
