package com.whoop.design.models.items;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/DateSelectorModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/DateSelectorModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/DateSelectorModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/DateSelectorModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class DateSelectorModel$$serializer implements GeneratedSerializer<DateSelectorModel> {
    public static final int $stable;
    public static final DateSelectorModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        DateSelectorModel$$serializer dateSelectorModel$$serializer = new DateSelectorModel$$serializer();
        INSTANCE = dateSelectorModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.DateSelectorModel", dateSelectorModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("next_date_time", false);
        pluginGeneratedSerialDescriptor.addElement("previous_date_time", false);
        pluginGeneratedSerialDescriptor.addElement("current_date_range_display", false);
        pluginGeneratedSerialDescriptor.addElement("previousInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("nextInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("labelInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("dateStrip", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DateSelectorModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, interfaceC37138cM122336d2, stringSerializer, AbstractC38195a.m122336d(genericInteraction$$serializer), AbstractC38195a.m122336d(genericInteraction$$serializer), AbstractC38195a.m122336d(genericInteraction$$serializer), AbstractC38195a.m122336d(DateStripModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final DateSelectorModel deserialize(InterfaceC40541d decoder) {
        int i13;
        DateStripModel dateStripModel;
        String str;
        String str2;
        String str3;
        GenericInteraction genericInteraction;
        GenericInteraction genericInteraction2;
        GenericInteraction genericInteraction3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 6;
        String str4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
            GenericInteraction genericInteraction4 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, genericInteraction$$serializer, null);
            GenericInteraction genericInteraction5 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, genericInteraction$$serializer, null);
            GenericInteraction genericInteraction6 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, genericInteraction$$serializer, null);
            str2 = str6;
            dateStripModel = (DateStripModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, DateStripModel$$serializer.INSTANCE, null);
            genericInteraction3 = genericInteraction6;
            genericInteraction = genericInteraction4;
            genericInteraction2 = genericInteraction5;
            str3 = strDecodeStringElement;
            i13 = 127;
            str = str5;
        } else {
            boolean z4 = true;
            int i15 = 0;
            DateStripModel dateStripModel2 = null;
            String str7 = null;
            String strDecodeStringElement2 = null;
            GenericInteraction genericInteraction7 = null;
            GenericInteraction genericInteraction8 = null;
            GenericInteraction genericInteraction9 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 6;
                        break;
                    case 0:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str4);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str7);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        genericInteraction7 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, GenericInteraction$$serializer.INSTANCE, genericInteraction7);
                        i15 |= 8;
                        break;
                    case 4:
                        genericInteraction8 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, GenericInteraction$$serializer.INSTANCE, genericInteraction8);
                        i15 |= 16;
                        break;
                    case 5:
                        genericInteraction9 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, GenericInteraction$$serializer.INSTANCE, genericInteraction9);
                        i15 |= 32;
                        break;
                    case 6:
                        dateStripModel2 = (DateStripModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, DateStripModel$$serializer.INSTANCE, dateStripModel2);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            dateStripModel = dateStripModel2;
            str = str4;
            str2 = str7;
            str3 = strDecodeStringElement2;
            genericInteraction = genericInteraction7;
            genericInteraction2 = genericInteraction8;
            genericInteraction3 = genericInteraction9;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new DateSelectorModel(i13, str, str2, str3, genericInteraction, genericInteraction2, genericInteraction3, dateStripModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, DateSelectorModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        DateSelectorModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
