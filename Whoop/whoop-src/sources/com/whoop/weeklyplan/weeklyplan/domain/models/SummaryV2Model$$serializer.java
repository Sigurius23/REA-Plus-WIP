package com.whoop.weeklyplan.weeklyplan.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SummaryV2Model$$serializer implements GeneratedSerializer<SummaryV2Model> {
    public static final int $stable;
    public static final SummaryV2Model$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SummaryV2Model$$serializer summaryV2Model$$serializer = new SummaryV2Model$$serializer();
        INSTANCE = summaryV2Model$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.weeklyplan.domain.models.SummaryV2Model", summaryV2Model$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("titleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("subtitleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("headerDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("summaryV2", false);
        pluginGeneratedSerialDescriptor.addElement("primaryButton", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryButton", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SummaryV2Model$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(NewSummary$$serializer.INSTANCE);
        ButtonInfo$$serializer buttonInfo$$serializer = ButtonInfo$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, interfaceC37138cM122336d, StyledString$$serializer.INSTANCE, stringSerializer, interfaceC37138cM122336d2, AbstractC38195a.m122336d(buttonInfo$$serializer), AbstractC38195a.m122336d(buttonInfo$$serializer), AbstractC38195a.m122336d(MetaData$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SummaryV2Model deserialize(InterfaceC40541d decoder) {
        int i13;
        MetaData metaData;
        ButtonInfo buttonInfo;
        ButtonInfo buttonInfo2;
        String str;
        String str2;
        StyledString styledString;
        String str3;
        NewSummary newSummary;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        int i15 = 6;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, null);
            StyledString styledString2 = (StyledString) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, StyledString$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            NewSummary newSummary2 = (NewSummary) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, NewSummary$$serializer.INSTANCE, null);
            ButtonInfo$$serializer buttonInfo$$serializer = ButtonInfo$$serializer.INSTANCE;
            ButtonInfo buttonInfo3 = (ButtonInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, buttonInfo$$serializer, null);
            ButtonInfo buttonInfo4 = (ButtonInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, buttonInfo$$serializer, null);
            str = strDecodeStringElement2;
            metaData = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, MetaData$$serializer.INSTANCE, null);
            buttonInfo = buttonInfo4;
            buttonInfo2 = buttonInfo3;
            str3 = strDecodeStringElement3;
            newSummary = newSummary2;
            styledString = styledString2;
            str2 = str4;
            i13 = 255;
        } else {
            boolean z4 = true;
            int i16 = 0;
            MetaData metaData2 = null;
            ButtonInfo buttonInfo5 = null;
            ButtonInfo buttonInfo6 = null;
            String str5 = null;
            StyledString styledString3 = null;
            String strDecodeStringElement4 = null;
            NewSummary newSummary3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 1:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str5);
                        i16 |= 2;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 2:
                        styledString3 = (StyledString) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, StyledString$$serializer.INSTANCE, styledString3);
                        i16 |= 4;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 3:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        break;
                    case 4:
                        newSummary3 = (NewSummary) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, NewSummary$$serializer.INSTANCE, newSummary3);
                        i16 |= 16;
                        break;
                    case 5:
                        buttonInfo6 = (ButtonInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, ButtonInfo$$serializer.INSTANCE, buttonInfo6);
                        i16 |= 32;
                        break;
                    case 6:
                        buttonInfo5 = (ButtonInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, ButtonInfo$$serializer.INSTANCE, buttonInfo5);
                        i16 |= 64;
                        break;
                    case 7:
                        metaData2 = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, MetaData$$serializer.INSTANCE, metaData2);
                        i16 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            metaData = metaData2;
            buttonInfo = buttonInfo5;
            buttonInfo2 = buttonInfo6;
            str = strDecodeStringElement;
            str2 = str5;
            styledString = styledString3;
            str3 = strDecodeStringElement4;
            newSummary = newSummary3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SummaryV2Model(i13, str, str2, styledString, str3, newSummary, buttonInfo2, buttonInfo, metaData, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SummaryV2Model value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SummaryV2Model.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
