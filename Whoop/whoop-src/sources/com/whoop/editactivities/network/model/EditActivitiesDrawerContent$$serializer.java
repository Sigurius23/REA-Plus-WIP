package com.whoop.editactivities.network.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import java.util.List;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/editactivities/network/model/EditActivitiesDrawerContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/editactivities/network/model/EditActivitiesDrawerContent;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/editactivities/network/model/EditActivitiesDrawerContent;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/editactivities/network/model/EditActivitiesDrawerContent;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class EditActivitiesDrawerContent$$serializer implements GeneratedSerializer<EditActivitiesDrawerContent> {
    public static final int $stable;
    public static final EditActivitiesDrawerContent$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        EditActivitiesDrawerContent$$serializer editActivitiesDrawerContent$$serializer = new EditActivitiesDrawerContent$$serializer();
        INSTANCE = editActivitiesDrawerContent$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.editactivities.network.model.EditActivitiesDrawerContent", editActivitiesDrawerContent$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement("footer", true);
        pluginGeneratedSerialDescriptor.addElement("gpsTextInfoCallout", true);
        pluginGeneratedSerialDescriptor.addElement("maxDurationInfoCallout", true);
        pluginGeneratedSerialDescriptor.addElement("maxSelectionInfoCallout", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EditActivitiesDrawerContent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = EditActivitiesDrawerContent.$childSerializers;
        InfoCalloutTileModel$$serializer infoCalloutTileModel$$serializer = InfoCalloutTileModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(StringSerializer.INSTANCE), interfaceC23462hArr[1].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue()), AbstractC38195a.m122336d(infoCalloutTileModel$$serializer), AbstractC38195a.m122336d(infoCalloutTileModel$$serializer), AbstractC38195a.m122336d(infoCalloutTileModel$$serializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final EditActivitiesDrawerContent deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        List list;
        DesignSystemModel designSystemModel;
        InfoCalloutTileModel infoCalloutTileModel;
        InfoCalloutTileModel infoCalloutTileModel2;
        InfoCalloutTileModel infoCalloutTileModel3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = EditActivitiesDrawerContent.$childSerializers;
        int i14 = 5;
        String str2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            DesignSystemModel designSystemModel2 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            InfoCalloutTileModel$$serializer infoCalloutTileModel$$serializer = InfoCalloutTileModel$$serializer.INSTANCE;
            InfoCalloutTileModel infoCalloutTileModel4 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, infoCalloutTileModel$$serializer, null);
            InfoCalloutTileModel infoCalloutTileModel5 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, infoCalloutTileModel$$serializer, null);
            designSystemModel = designSystemModel2;
            str = str3;
            infoCalloutTileModel3 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, infoCalloutTileModel$$serializer, null);
            infoCalloutTileModel = infoCalloutTileModel4;
            infoCalloutTileModel2 = infoCalloutTileModel5;
            i13 = 63;
            list = list2;
        } else {
            boolean z4 = true;
            int i15 = 0;
            List list3 = null;
            DesignSystemModel designSystemModel3 = null;
            InfoCalloutTileModel infoCalloutTileModel6 = null;
            InfoCalloutTileModel infoCalloutTileModel7 = null;
            InfoCalloutTileModel infoCalloutTileModel8 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str2);
                        i15 |= 1;
                        i14 = 5;
                        break;
                    case 1:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), list3);
                        i15 |= 2;
                        break;
                    case 2:
                        designSystemModel3 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), designSystemModel3);
                        i15 |= 4;
                        break;
                    case 3:
                        infoCalloutTileModel6 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, InfoCalloutTileModel$$serializer.INSTANCE, infoCalloutTileModel6);
                        i15 |= 8;
                        break;
                    case 4:
                        infoCalloutTileModel7 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, InfoCalloutTileModel$$serializer.INSTANCE, infoCalloutTileModel7);
                        i15 |= 16;
                        break;
                    case 5:
                        infoCalloutTileModel8 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, InfoCalloutTileModel$$serializer.INSTANCE, infoCalloutTileModel8);
                        i15 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            str = str2;
            list = list3;
            designSystemModel = designSystemModel3;
            infoCalloutTileModel = infoCalloutTileModel6;
            infoCalloutTileModel2 = infoCalloutTileModel7;
            infoCalloutTileModel3 = infoCalloutTileModel8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new EditActivitiesDrawerContent(i13, str, list, designSystemModel, infoCalloutTileModel, infoCalloutTileModel2, infoCalloutTileModel3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, EditActivitiesDrawerContent value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        EditActivitiesDrawerContent.write$Self$add_activity_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
