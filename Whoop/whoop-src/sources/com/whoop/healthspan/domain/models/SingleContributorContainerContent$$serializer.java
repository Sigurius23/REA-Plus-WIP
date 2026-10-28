package com.whoop.healthspan.domain.models;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/healthspan/domain/models/SingleContributorContainerContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SingleContributorContainerContent$$serializer implements GeneratedSerializer<SingleContributorContainerContent> {
    public static final int $stable;
    public static final SingleContributorContainerContent$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SingleContributorContainerContent$$serializer singleContributorContainerContent$$serializer = new SingleContributorContainerContent$$serializer();
        INSTANCE = singleContributorContainerContent$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.healthspan.domain.models.SingleContributorContainerContent", singleContributorContainerContent$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("rangeDivisions", false);
        pluginGeneratedSerialDescriptor.addElement("rangeLeftLabelDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("rangeLeftLabelStyle", false);
        pluginGeneratedSerialDescriptor.addElement("rangeRightLabelDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("rangeRightLabelStyle", false);
        pluginGeneratedSerialDescriptor.addElement("topRangeValue", false);
        pluginGeneratedSerialDescriptor.addElement("impactValueDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("impactValueLabelDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("impactValueStyle", false);
        pluginGeneratedSerialDescriptor.addElement("expandedBottomRangeValue", false);
        pluginGeneratedSerialDescriptor.addElement("expandedItems", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SingleContributorContainerContent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SingleContributorContainerContent.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        ContributorRangeValue$$serializer contributorRangeValue$$serializer = ContributorRangeValue$$serializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), stringSerializer, stringSerializer, stringSerializer, stringSerializer, contributorRangeValue$$serializer, stringSerializer, stringSerializer, stringSerializer, contributorRangeValue$$serializer, interfaceC23462hArr[10].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SingleContributorContainerContent deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        ContributorRangeValue contributorRangeValue;
        ContributorRangeValue contributorRangeValue2;
        List list2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SingleContributorContainerContent.$childSerializers;
        int i14 = 9;
        int i15 = 7;
        List list3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            ContributorRangeValue$$serializer contributorRangeValue$$serializer = ContributorRangeValue$$serializer.INSTANCE;
            ContributorRangeValue contributorRangeValue3 = (ContributorRangeValue) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, contributorRangeValue$$serializer, null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            ContributorRangeValue contributorRangeValue4 = (ContributorRangeValue) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, contributorRangeValue$$serializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            list2 = list4;
            contributorRangeValue = contributorRangeValue4;
            str6 = strDecodeStringElement6;
            str5 = strDecodeStringElement5;
            contributorRangeValue2 = contributorRangeValue3;
            str3 = strDecodeStringElement3;
            str7 = strDecodeStringElement7;
            str4 = strDecodeStringElement4;
            str2 = strDecodeStringElement2;
            i13 = 2047;
            str = strDecodeStringElement;
        } else {
            boolean z4 = true;
            int i16 = 0;
            List list5 = null;
            ContributorRangeValue contributorRangeValue5 = null;
            ContributorRangeValue contributorRangeValue6 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 7;
                        break;
                    case 0:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), list3);
                        i16 |= 1;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 1:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 9;
                        break;
                    case 2:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i14 = 9;
                        break;
                    case 3:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        contributorRangeValue6 = (ContributorRangeValue) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, ContributorRangeValue$$serializer.INSTANCE, contributorRangeValue6);
                        i16 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i16 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i15);
                        i16 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i16 |= 256;
                        break;
                    case 9:
                        contributorRangeValue5 = (ContributorRangeValue) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, ContributorRangeValue$$serializer.INSTANCE, contributorRangeValue5);
                        i16 |= 512;
                        break;
                    case 10:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), list5);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            list = list5;
            contributorRangeValue = contributorRangeValue5;
            contributorRangeValue2 = contributorRangeValue6;
            list2 = list3;
            str = strDecodeStringElement8;
            str2 = strDecodeStringElement9;
            str3 = strDecodeStringElement10;
            str4 = strDecodeStringElement11;
            str5 = strDecodeStringElement12;
            str6 = strDecodeStringElement13;
            str7 = strDecodeStringElement14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SingleContributorContainerContent(i13, list2, str, str2, str3, str4, contributorRangeValue2, str5, str6, str7, contributorRangeValue, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SingleContributorContainerContent value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SingleContributorContainerContent.write$Self$healthspan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
