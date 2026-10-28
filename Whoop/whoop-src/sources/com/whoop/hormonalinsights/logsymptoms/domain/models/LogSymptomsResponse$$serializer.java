package com.whoop.hormonalinsights.logsymptoms.domain.models;

import com.whoop.design.models.anchorSelector.AnchorSelectorModel;
import com.whoop.design.models.anchorSelector.AnchorSelectorModel$$serializer;
import com.whoop.design.models.items.CyclePhaseStyle;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class LogSymptomsResponse$$serializer implements GeneratedSerializer<LogSymptomsResponse> {
    public static final int $stable;
    public static final LogSymptomsResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        LogSymptomsResponse$$serializer logSymptomsResponse$$serializer = new LogSymptomsResponse$$serializer();
        INSTANCE = logSymptomsResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsResponse", logSymptomsResponse$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("navigationBar", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("categorySelector", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("primaryButton", false);
        pluginGeneratedSerialDescriptor.addElement("suggestedTrackerIds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LogSymptomsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = LogSymptomsResponse.$childSerializers;
        return new InterfaceC37138c[]{NavigationBar$$serializer.INSTANCE, StringSerializer.INSTANCE, AnchorSelectorModel$$serializer.INSTANCE, interfaceC23462hArr[3].getValue(), PrimaryButtonModel$$serializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final LogSymptomsResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        NavigationBar navigationBar;
        String str;
        AnchorSelectorModel anchorSelectorModel;
        CyclePhaseStyle cyclePhaseStyle;
        PrimaryButtonModel primaryButtonModel;
        List list;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = LogSymptomsResponse.$childSerializers;
        int i14 = 4;
        NavigationBar navigationBar2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            NavigationBar navigationBar3 = (NavigationBar) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, NavigationBar$$serializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            AnchorSelectorModel anchorSelectorModel2 = (AnchorSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, AnchorSelectorModel$$serializer.INSTANCE, null);
            CyclePhaseStyle cyclePhaseStyle2 = (CyclePhaseStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            PrimaryButtonModel primaryButtonModel2 = (PrimaryButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, PrimaryButtonModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            navigationBar = navigationBar3;
            primaryButtonModel = primaryButtonModel2;
            anchorSelectorModel = anchorSelectorModel2;
            i13 = 63;
            cyclePhaseStyle = cyclePhaseStyle2;
            str = strDecodeStringElement;
        } else {
            boolean z4 = true;
            int i15 = 0;
            String strDecodeStringElement2 = null;
            AnchorSelectorModel anchorSelectorModel3 = null;
            CyclePhaseStyle cyclePhaseStyle3 = null;
            PrimaryButtonModel primaryButtonModel3 = null;
            List list2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 4;
                        break;
                    case 0:
                        navigationBar2 = (NavigationBar) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, NavigationBar$$serializer.INSTANCE, navigationBar2);
                        i15 |= 1;
                        i14 = 4;
                        break;
                    case 1:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        anchorSelectorModel3 = (AnchorSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, AnchorSelectorModel$$serializer.INSTANCE, anchorSelectorModel3);
                        i15 |= 4;
                        break;
                    case 3:
                        cyclePhaseStyle3 = (CyclePhaseStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), cyclePhaseStyle3);
                        i15 |= 8;
                        break;
                    case 4:
                        primaryButtonModel3 = (PrimaryButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, PrimaryButtonModel$$serializer.INSTANCE, primaryButtonModel3);
                        i15 |= 16;
                        break;
                    case 5:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), list2);
                        i15 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            navigationBar = navigationBar2;
            str = strDecodeStringElement2;
            anchorSelectorModel = anchorSelectorModel3;
            cyclePhaseStyle = cyclePhaseStyle3;
            primaryButtonModel = primaryButtonModel3;
            list = list2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new LogSymptomsResponse(i13, navigationBar, str, anchorSelectorModel, cyclePhaseStyle, primaryButtonModel, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, LogSymptomsResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        LogSymptomsResponse.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
