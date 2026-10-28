package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/JournalEntryWidgetModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/JournalEntryWidgetModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/JournalEntryWidgetModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/JournalEntryWidgetModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class JournalEntryWidgetModel$$serializer implements GeneratedSerializer<JournalEntryWidgetModel> {
    public static final int $stable;
    public static final JournalEntryWidgetModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        JournalEntryWidgetModel$$serializer journalEntryWidgetModel$$serializer = new JournalEntryWidgetModel$$serializer();
        INSTANCE = journalEntryWidgetModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.JournalEntryWidgetModel", journalEntryWidgetModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, true);
        pluginGeneratedSerialDescriptor.addElement("answeredYesQuestion", true);
        pluginGeneratedSerialDescriptor.addElement("magnitudeQuestion", true);
        pluginGeneratedSerialDescriptor.addElement("timeQuestion", true);
        pluginGeneratedSerialDescriptor.addElement("button", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JournalEntryWidgetModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = JournalEntryWidgetModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, interfaceC23462hArr[2].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), interfaceC23462hArr[6].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final JournalEntryWidgetModel deserialize(InterfaceC40541d decoder) {
        int i13;
        DesignSystemModel designSystemModel;
        DesignSystemModel designSystemModel2;
        String str;
        String str2;
        JournalEntryStatus journalEntryStatus;
        DesignSystemModel designSystemModel3;
        DesignSystemModel designSystemModel4;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = JournalEntryWidgetModel.$childSerializers;
        int i15 = 6;
        int i16 = 2;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            JournalEntryStatus journalEntryStatus2 = (JournalEntryStatus) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            DesignSystemModel designSystemModel5 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            DesignSystemModel designSystemModel6 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            DesignSystemModel designSystemModel7 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            designSystemModel = (DesignSystemModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str = strDecodeStringElement2;
            i13 = 127;
            designSystemModel2 = designSystemModel7;
            designSystemModel3 = designSystemModel5;
            designSystemModel4 = designSystemModel6;
            journalEntryStatus = journalEntryStatus2;
            str2 = strDecodeStringElement3;
        } else {
            boolean z4 = true;
            int i17 = 0;
            DesignSystemModel designSystemModel8 = null;
            DesignSystemModel designSystemModel9 = null;
            String strDecodeStringElement4 = null;
            JournalEntryStatus journalEntryStatus3 = null;
            DesignSystemModel designSystemModel10 = null;
            DesignSystemModel designSystemModel11 = null;
            while (z4) {
                int i18 = i16;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i16 = i18;
                        break;
                    case 0:
                        i17 |= 1;
                        i16 = i18;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 = 6;
                        break;
                    case 1:
                        i14 = i18;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i16 = i14;
                        i15 = 6;
                        break;
                    case 2:
                        i14 = i18;
                        journalEntryStatus3 = (JournalEntryStatus) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), journalEntryStatus3);
                        i17 |= 4;
                        i16 = i14;
                        i15 = 6;
                        break;
                    case 3:
                        designSystemModel10 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), designSystemModel10);
                        i17 |= 8;
                        i16 = i18;
                        break;
                    case 4:
                        designSystemModel11 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), designSystemModel11);
                        i17 |= 16;
                        i16 = i18;
                        break;
                    case 5:
                        designSystemModel9 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), designSystemModel9);
                        i17 |= 32;
                        i16 = i18;
                        break;
                    case 6:
                        designSystemModel8 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), designSystemModel8);
                        i17 |= 64;
                        i16 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            designSystemModel = designSystemModel8;
            designSystemModel2 = designSystemModel9;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            journalEntryStatus = journalEntryStatus3;
            designSystemModel3 = designSystemModel10;
            designSystemModel4 = designSystemModel11;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new JournalEntryWidgetModel(i13, str, str2, journalEntryStatus, designSystemModel3, designSystemModel4, designSystemModel2, designSystemModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, JournalEntryWidgetModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        JournalEntryWidgetModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
