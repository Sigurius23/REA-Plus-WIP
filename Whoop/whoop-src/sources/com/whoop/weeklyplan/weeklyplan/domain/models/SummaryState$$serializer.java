package com.whoop.weeklyplan.weeklyplan.domain.models;

import ad3.C0771n;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/weeklyplan/domain/models/SummaryState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SummaryState$$serializer implements GeneratedSerializer<SummaryState> {
    public static final int $stable;
    public static final SummaryState$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SummaryState$$serializer summaryState$$serializer = new SummaryState$$serializer();
        INSTANCE = summaryState$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.weeklyplan.domain.models.SummaryState", summaryState$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("planId", false);
        pluginGeneratedSerialDescriptor.addElement("titleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("subtitleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("isDismissible", false);
        pluginGeneratedSerialDescriptor.addElement("animation", false);
        pluginGeneratedSerialDescriptor.addElement("headerDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("summaryV2", false);
        pluginGeneratedSerialDescriptor.addElement("primaryButton", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryButton", false);
        pluginGeneratedSerialDescriptor.addElement("summary", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SummaryState$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(NewSummary$$serializer.INSTANCE);
        ButtonInfo$$serializer buttonInfo$$serializer = ButtonInfo$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, C0771n.f2806a, StyledString$$serializer.INSTANCE, stringSerializer, interfaceC37138cM122336d3, buttonInfo$$serializer, AbstractC38195a.m122336d(buttonInfo$$serializer), Summary$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SummaryState deserialize(InterfaceC40541d decoder) {
        int i13;
        Summary summary;
        ButtonInfo buttonInfo;
        ButtonInfo buttonInfo2;
        StyledString styledString;
        NewSummary newSummary;
        JsonElement jsonElement;
        Boolean bool;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 10;
        int i15 = 9;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, BooleanSerializer.INSTANCE, null);
            JsonElement jsonElement2 = (JsonElement) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, C0771n.f2806a, null);
            StyledString styledString2 = (StyledString) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, StyledString$$serializer.INSTANCE, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            NewSummary newSummary2 = (NewSummary) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, NewSummary$$serializer.INSTANCE, null);
            ButtonInfo$$serializer buttonInfo$$serializer = ButtonInfo$$serializer.INSTANCE;
            ButtonInfo buttonInfo3 = (ButtonInfo) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, buttonInfo$$serializer, null);
            ButtonInfo buttonInfo4 = (ButtonInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, buttonInfo$$serializer, null);
            str2 = strDecodeStringElement2;
            summary = (Summary) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, Summary$$serializer.INSTANCE, null);
            buttonInfo = buttonInfo4;
            newSummary = newSummary2;
            str4 = strDecodeStringElement4;
            styledString = styledString2;
            bool = bool2;
            buttonInfo2 = buttonInfo3;
            jsonElement = jsonElement2;
            str = str5;
            str3 = strDecodeStringElement3;
            i13 = 2047;
        } else {
            boolean z4 = true;
            int i16 = 0;
            Summary summary2 = null;
            ButtonInfo buttonInfo5 = null;
            ButtonInfo buttonInfo6 = null;
            StyledString styledString3 = null;
            NewSummary newSummary3 = null;
            JsonElement jsonElement3 = null;
            Boolean bool3 = null;
            String str6 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 10;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 1:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 2:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str6);
                        i16 |= 4;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 3:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, BooleanSerializer.INSTANCE, bool3);
                        i16 |= 8;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 4:
                        jsonElement3 = (JsonElement) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, C0771n.f2806a, jsonElement3);
                        i16 |= 16;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 5:
                        styledString3 = (StyledString) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, StyledString$$serializer.INSTANCE, styledString3);
                        i16 |= 32;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 6:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i16 |= 64;
                        i14 = 10;
                        break;
                    case 7:
                        newSummary3 = (NewSummary) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, NewSummary$$serializer.INSTANCE, newSummary3);
                        i16 |= 128;
                        i14 = 10;
                        break;
                    case 8:
                        buttonInfo6 = (ButtonInfo) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, ButtonInfo$$serializer.INSTANCE, buttonInfo6);
                        i16 |= 256;
                        i14 = 10;
                        break;
                    case 9:
                        buttonInfo5 = (ButtonInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, ButtonInfo$$serializer.INSTANCE, buttonInfo5);
                        i16 |= 512;
                        break;
                    case 10:
                        summary2 = (Summary) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, Summary$$serializer.INSTANCE, summary2);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            summary = summary2;
            buttonInfo = buttonInfo5;
            buttonInfo2 = buttonInfo6;
            styledString = styledString3;
            newSummary = newSummary3;
            jsonElement = jsonElement3;
            bool = bool3;
            str = str6;
            str2 = strDecodeStringElement;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SummaryState(i13, str2, str3, str, bool, jsonElement, styledString, str4, newSummary, buttonInfo2, buttonInfo, summary, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SummaryState value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SummaryState.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
