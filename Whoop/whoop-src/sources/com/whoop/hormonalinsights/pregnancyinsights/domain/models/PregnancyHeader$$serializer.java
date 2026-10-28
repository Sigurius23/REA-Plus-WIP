package com.whoop.hormonalinsights.pregnancyinsights.domain.models;

import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class PregnancyHeader$$serializer implements GeneratedSerializer<PregnancyHeader> {
    public static final int $stable;
    public static final PregnancyHeader$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        PregnancyHeader$$serializer pregnancyHeader$$serializer = new PregnancyHeader$$serializer();
        INSTANCE = pregnancyHeader$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyHeader", pregnancyHeader$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("currentWeek", false);
        pluginGeneratedSerialDescriptor.addElement("trimesterDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("weeksRemainingDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("datePicker", false);
        pluginGeneratedSerialDescriptor.addElement("pregnancyIcon", false);
        pluginGeneratedSerialDescriptor.addElement("haveYouDelivered", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PregnancyHeader$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DateSelectorModel$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(PregnancyInsightsHeaderButton$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, interfaceC37138cM122336d, stringSerializer, interfaceC37138cM122336d2};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final PregnancyHeader deserialize(InterfaceC40541d decoder) {
        int i13;
        PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton;
        String str;
        String str2;
        String str3;
        String str4;
        DateSelectorModel dateSelectorModel;
        String str5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            DateSelectorModel dateSelectorModel2 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, DateSelectorModel$$serializer.INSTANCE, null);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            str = strDecodeStringElement2;
            pregnancyInsightsHeaderButton = (PregnancyInsightsHeaderButton) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, PregnancyInsightsHeaderButton$$serializer.INSTANCE, null);
            str5 = strDecodeStringElement6;
            str4 = strDecodeStringElement5;
            dateSelectorModel = dateSelectorModel2;
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i13 = 127;
        } else {
            boolean z4 = true;
            int i14 = 0;
            PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton2 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            DateSelectorModel dateSelectorModel3 = null;
            String strDecodeStringElement10 = null;
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
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 |= 2;
                        continue;
                    case 2:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i14 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        dateSelectorModel3 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, DateSelectorModel$$serializer.INSTANCE, dateSelectorModel3);
                        i14 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i14 |= 32;
                        break;
                    case 6:
                        pregnancyInsightsHeaderButton2 = (PregnancyInsightsHeaderButton) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, PregnancyInsightsHeaderButton$$serializer.INSTANCE, pregnancyInsightsHeaderButton2);
                        i14 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i14;
            pregnancyInsightsHeaderButton = pregnancyInsightsHeaderButton2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            dateSelectorModel = dateSelectorModel3;
            str5 = strDecodeStringElement10;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new PregnancyHeader(i13, str, str2, str3, str4, dateSelectorModel, str5, pregnancyInsightsHeaderButton, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, PregnancyHeader value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        PregnancyHeader.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
