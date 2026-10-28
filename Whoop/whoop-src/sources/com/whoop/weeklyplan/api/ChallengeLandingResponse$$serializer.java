package com.whoop.weeklyplan.api;

import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/api/ChallengeLandingResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ChallengeLandingResponse$$serializer implements GeneratedSerializer<ChallengeLandingResponse> {
    public static final int $stable;
    public static final ChallengeLandingResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ChallengeLandingResponse$$serializer challengeLandingResponse$$serializer = new ChallengeLandingResponse$$serializer();
        INSTANCE = challengeLandingResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.api.ChallengeLandingResponse", challengeLandingResponse$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("navigation_title", false);
        pluginGeneratedSerialDescriptor.addElement("hero_image_url", false);
        pluginGeneratedSerialDescriptor.addElement("january_jumpstart_image_url", false);
        pluginGeneratedSerialDescriptor.addElement("header_section", false);
        pluginGeneratedSerialDescriptor.addElement("custom_plan_card", false);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("ai_context_metadata", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChallengeLandingResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ChallengeLandingResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, ChallengeLandingHeaderSection$$serializer.INSTANCE, interfaceC23462hArr[4].getValue(), interfaceC23462hArr[5].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ChallengeLandingResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        AiContextMetadata aiContextMetadata;
        List list;
        String str;
        String str2;
        String str3;
        ChallengeLandingHeaderSection challengeLandingHeaderSection;
        DesignSystemModel designSystemModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ChallengeLandingResponse.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            ChallengeLandingHeaderSection challengeLandingHeaderSection2 = (ChallengeLandingHeaderSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, ChallengeLandingHeaderSection$$serializer.INSTANCE, null);
            DesignSystemModel designSystemModel2 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            aiContextMetadata = (AiContextMetadata) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str = strDecodeStringElement2;
            challengeLandingHeaderSection = challengeLandingHeaderSection2;
            str3 = strDecodeStringElement4;
            i13 = 127;
            list = list2;
            designSystemModel = designSystemModel2;
            str2 = strDecodeStringElement3;
        } else {
            boolean z4 = true;
            int i14 = 0;
            AiContextMetadata aiContextMetadata2 = null;
            List list3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            ChallengeLandingHeaderSection challengeLandingHeaderSection3 = null;
            DesignSystemModel designSystemModel3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i14 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        continue;
                    case 1:
                        i14 |= 2;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        continue;
                    case 2:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i14 |= 4;
                        continue;
                    case 3:
                        challengeLandingHeaderSection3 = (ChallengeLandingHeaderSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, ChallengeLandingHeaderSection$$serializer.INSTANCE, challengeLandingHeaderSection3);
                        i14 |= 8;
                        break;
                    case 4:
                        designSystemModel3 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), designSystemModel3);
                        i14 |= 16;
                        break;
                    case 5:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), list3);
                        i14 |= 32;
                        break;
                    case 6:
                        aiContextMetadata2 = (AiContextMetadata) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), aiContextMetadata2);
                        i14 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i14;
            aiContextMetadata = aiContextMetadata2;
            list = list3;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            challengeLandingHeaderSection = challengeLandingHeaderSection3;
            designSystemModel = designSystemModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ChallengeLandingResponse(i13, str, str2, str3, challengeLandingHeaderSection, designSystemModel, list, aiContextMetadata, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ChallengeLandingResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ChallengeLandingResponse.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
