package com.whoop.weeklyplan.hubandspoke.domain.api;

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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MetricScreen$$serializer implements GeneratedSerializer<MetricScreen> {
    public static final int $stable;
    public static final MetricScreen$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MetricScreen$$serializer metricScreen$$serializer = new MetricScreen$$serializer();
        INSTANCE = metricScreen$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.hubandspoke.domain.api.MetricScreen", metricScreen$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("navigationTitleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("headerDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("selectedHeader", false);
        pluginGeneratedSerialDescriptor.addElement("unselectedHeader", false);
        pluginGeneratedSerialDescriptor.addElement("legend", false);
        pluginGeneratedSerialDescriptor.addElement("selectedEmptyState", false);
        pluginGeneratedSerialDescriptor.addElement("unselectedEmptyState", false);
        pluginGeneratedSerialDescriptor.addElement("timeRange", false);
        pluginGeneratedSerialDescriptor.addElement("buttonText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MetricScreen$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = MetricScreen.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, interfaceC23462hArr[5].getValue(), stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MetricScreen deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = MetricScreen.$childSerializers;
        int i14 = 9;
        String strDecodeStringElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            list = list2;
            str2 = strDecodeStringElement3;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            str7 = strDecodeStringElement7;
            str6 = strDecodeStringElement6;
            str4 = strDecodeStringElement4;
            str8 = strDecodeStringElement8;
            str5 = strDecodeStringElement5;
            str = str10;
            i13 = 1023;
            str3 = str9;
        } else {
            boolean z4 = true;
            int i15 = 0;
            List list3 = null;
            String str11 = null;
            String str12 = null;
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
                        break;
                    case 0:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 9;
                        break;
                    case 1:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str12);
                        i15 |= 2;
                        i14 = 9;
                        break;
                    case 2:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str11);
                        i15 |= 4;
                        i14 = 9;
                        break;
                    case 3:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), list3);
                        i15 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i15 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i15 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i15 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            list = list3;
            str = str11;
            str2 = strDecodeStringElement2;
            str3 = str12;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
            str6 = strDecodeStringElement11;
            str7 = strDecodeStringElement12;
            str8 = strDecodeStringElement13;
            strDecodeStringElement = strDecodeStringElement14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MetricScreen(i13, str2, str3, str, str4, str5, list, str6, str7, str8, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MetricScreen value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MetricScreen.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
