package com.whoop.advancedlabs.domain.models;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
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
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/advancedlabs/domain/models/EditBiomarkerItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class EditBiomarkerItem$$serializer implements GeneratedSerializer<EditBiomarkerItem> {
    public static final int $stable;
    public static final EditBiomarkerItem$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        EditBiomarkerItem$$serializer editBiomarkerItem$$serializer = new EditBiomarkerItem$$serializer();
        INSTANCE = editBiomarkerItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.advancedlabs.domain.models.EditBiomarkerItem", editBiomarkerItem$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("biomarkerName", false);
        pluginGeneratedSerialDescriptor.addElement("biomarkerId", false);
        pluginGeneratedSerialDescriptor.addElement("calculatedFromBiomarkers", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("valueText", false);
        pluginGeneratedSerialDescriptor.addElement("unit", false);
        pluginGeneratedSerialDescriptor.addElement("included", false);
        pluginGeneratedSerialDescriptor.addElement("minValue", false);
        pluginGeneratedSerialDescriptor.addElement("maxValue", false);
        pluginGeneratedSerialDescriptor.addElement("infoCallout", false);
        pluginGeneratedSerialDescriptor.addElement("valueLabel", false);
        pluginGeneratedSerialDescriptor.addElement("unitLabel", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("warning", false);
        pluginGeneratedSerialDescriptor.addElement("rightIcon", false);
        pluginGeneratedSerialDescriptor.addElement("dependentOnBiomarkers", false);
        pluginGeneratedSerialDescriptor.addElement("dependentOnBiomarkersWarning", false);
        pluginGeneratedSerialDescriptor.addElement("categoricalOptions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EditBiomarkerItem$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = EditBiomarkerItem.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue());
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, interfaceC37138cM122336d, AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), BooleanSerializer.INSTANCE, doubleSerializer, doubleSerializer, AbstractC38195a.m122336d(InfoCalloutTileModel$$serializer.INSTANCE), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[15].getValue()), AbstractC38195a.m122336d(EditBiomarkerDialog$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[17].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final EditBiomarkerItem deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        Double d3;
        List list;
        List list2;
        EditBiomarkerDialog editBiomarkerDialog;
        String str2;
        String str3;
        String str4;
        String str5;
        InfoCalloutTileModel infoCalloutTileModel;
        List list3;
        String str6;
        String str7;
        boolean z4;
        double d14;
        double d15;
        String str8;
        String str9;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = EditBiomarkerItem.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            List list4 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            Double d16 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DoubleSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 7);
            double dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 8);
            InfoCalloutTileModel infoCalloutTileModel2 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, InfoCalloutTileModel$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), null);
            i13 = 262143;
            editBiomarkerDialog = (EditBiomarkerDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, EditBiomarkerDialog$$serializer.INSTANCE, null);
            list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, (InterfaceC37137b) interfaceC23462hArr[17].getValue(), null);
            str8 = strDecodeStringElement;
            list = list4;
            str9 = strDecodeStringElement2;
            d3 = d16;
            str6 = strDecodeStringElement3;
            infoCalloutTileModel = infoCalloutTileModel2;
            str7 = strDecodeStringElement4;
            z4 = zDecodeBooleanElement;
            str5 = str11;
            str = str10;
            str4 = str12;
            str2 = str14;
            list3 = list5;
            str3 = str13;
            d14 = dDecodeDoubleElement;
            d15 = dDecodeDoubleElement2;
        } else {
            double dDecodeDoubleElement3 = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String str15 = null;
            Double d17 = null;
            List list6 = null;
            EditBiomarkerDialog editBiomarkerDialog2 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            InfoCalloutTileModel infoCalloutTileModel3 = null;
            List list7 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            i13 = 0;
            List list8 = null;
            while (true) {
                String str20 = strDecodeStringElement5;
                if (z13) {
                    int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z13 = false;
                            strDecodeStringElement5 = str20;
                            break;
                        case 0:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            i13 |= 1;
                            strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 1:
                            i13 |= 2;
                            strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                            strDecodeStringElement5 = str20;
                            break;
                        case 2:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            list8 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), list8);
                            i13 |= 4;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 3:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            d17 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DoubleSerializer.INSTANCE, d17);
                            i13 |= 8;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 4:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str15);
                            i13 |= 16;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 5:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str19);
                            i13 |= 32;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 6:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                            i13 |= 64;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 7:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            dDecodeDoubleElement3 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 7);
                            i13 |= 128;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 8:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            dDecodeDoubleElement4 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 8);
                            i13 |= 256;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 9:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            infoCalloutTileModel3 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, InfoCalloutTileModel$$serializer.INSTANCE, infoCalloutTileModel3);
                            i13 |= 512;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 10:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
                            i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 11:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
                            i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 12:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str18);
                            i13 |= 4096;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 13:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str17);
                            i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 14:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str16);
                            i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 15:
                            strDecodeStringElement6 = strDecodeStringElement6;
                            list7 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), list7);
                            i13 |= 32768;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case 16:
                            editBiomarkerDialog2 = (EditBiomarkerDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, EditBiomarkerDialog$$serializer.INSTANCE, editBiomarkerDialog2);
                            i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            i13 |= i14;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            list6 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, (InterfaceC37137b) interfaceC23462hArr[17].getValue(), list6);
                            i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            i13 |= i14;
                            strDecodeStringElement5 = str20;
                            strDecodeStringElement6 = strDecodeStringElement6;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                } else {
                    str = str15;
                    d3 = d17;
                    list = list8;
                    list2 = list6;
                    editBiomarkerDialog = editBiomarkerDialog2;
                    str2 = str16;
                    str3 = str17;
                    str4 = str18;
                    str5 = str19;
                    infoCalloutTileModel = infoCalloutTileModel3;
                    list3 = list7;
                    str6 = strDecodeStringElement7;
                    str7 = strDecodeStringElement8;
                    z4 = zDecodeBooleanElement2;
                    d14 = dDecodeDoubleElement3;
                    d15 = dDecodeDoubleElement4;
                    str8 = str20;
                    str9 = strDecodeStringElement6;
                }
            }
        }
        int i15 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new EditBiomarkerItem(i15, str8, str9, list, d3, str, str5, z4, d14, d15, infoCalloutTileModel, str6, str7, str4, str3, str2, list3, editBiomarkerDialog, list2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, EditBiomarkerItem value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        EditBiomarkerItem.write$Self$advanced_labs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
