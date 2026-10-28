package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.DividerModel$$serializer;
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
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/advancedlabs/domain/models/EditBiomarkersResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class EditBiomarkersResponse$$serializer implements GeneratedSerializer<EditBiomarkersResponse> {
    public static final int $stable;
    public static final EditBiomarkersResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        EditBiomarkersResponse$$serializer editBiomarkersResponse$$serializer = new EditBiomarkersResponse$$serializer();
        INSTANCE = editBiomarkersResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.advancedlabs.domain.models.EditBiomarkersResponse", editBiomarkersResponse$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("navigationTitle", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("searchPlaceholder", false);
        pluginGeneratedSerialDescriptor.addElement("includedItemsHeader", false);
        pluginGeneratedSerialDescriptor.addElement("notIncludedItemsHeader", false);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("button", false);
        pluginGeneratedSerialDescriptor.addElement("bottomSheetButton", false);
        pluginGeneratedSerialDescriptor.addElement("exitDialog", false);
        pluginGeneratedSerialDescriptor.addElement("deleteDialog", false);
        pluginGeneratedSerialDescriptor.addElement("calculationEducationTitle", false);
        pluginGeneratedSerialDescriptor.addElement("calculationEducationDescription", false);
        pluginGeneratedSerialDescriptor.addElement("testDeletedModal", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EditBiomarkersResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = EditBiomarkersResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DividerModel$$serializer dividerModel$$serializer = DividerModel$$serializer.INSTANCE;
        PrimaryButtonModel$$serializer primaryButtonModel$$serializer = PrimaryButtonModel$$serializer.INSTANCE;
        EditBiomarkerDialog$$serializer editBiomarkerDialog$$serializer = EditBiomarkerDialog$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, dividerModel$$serializer, dividerModel$$serializer, interfaceC23462hArr[5].getValue(), primaryButtonModel$$serializer, primaryButtonModel$$serializer, editBiomarkerDialog$$serializer, editBiomarkerDialog$$serializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(TestDeletedModalItem$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final EditBiomarkersResponse deserialize(InterfaceC40541d decoder) {
        String strDecodeStringElement;
        int i13;
        DividerModel dividerModel;
        TestDeletedModalItem testDeletedModalItem;
        String str;
        EditBiomarkerDialog editBiomarkerDialog;
        PrimaryButtonModel primaryButtonModel;
        String str2;
        PrimaryButtonModel primaryButtonModel2;
        List list;
        EditBiomarkerDialog editBiomarkerDialog2;
        DividerModel dividerModel2;
        String str3;
        String str4;
        InterfaceC23462h[] interfaceC23462hArr;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr2 = EditBiomarkersResponse.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            DividerModel$$serializer dividerModel$$serializer = DividerModel$$serializer.INSTANCE;
            DividerModel dividerModel3 = (DividerModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, dividerModel$$serializer, null);
            DividerModel dividerModel4 = (DividerModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, dividerModel$$serializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr2[5].getValue(), null);
            PrimaryButtonModel$$serializer primaryButtonModel$$serializer = PrimaryButtonModel$$serializer.INSTANCE;
            PrimaryButtonModel primaryButtonModel3 = (PrimaryButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, primaryButtonModel$$serializer, null);
            PrimaryButtonModel primaryButtonModel4 = (PrimaryButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, primaryButtonModel$$serializer, null);
            EditBiomarkerDialog$$serializer editBiomarkerDialog$$serializer = EditBiomarkerDialog$$serializer.INSTANCE;
            EditBiomarkerDialog editBiomarkerDialog3 = (EditBiomarkerDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, editBiomarkerDialog$$serializer, null);
            EditBiomarkerDialog editBiomarkerDialog4 = (EditBiomarkerDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, editBiomarkerDialog$$serializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            i13 = 8191;
            testDeletedModalItem = (TestDeletedModalItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, TestDeletedModalItem$$serializer.INSTANCE, null);
            str3 = strDecodeStringElement2;
            str = str5;
            editBiomarkerDialog = editBiomarkerDialog4;
            primaryButtonModel2 = primaryButtonModel4;
            primaryButtonModel = primaryButtonModel3;
            dividerModel = dividerModel3;
            editBiomarkerDialog2 = editBiomarkerDialog3;
            dividerModel2 = dividerModel4;
            str4 = strDecodeStringElement3;
            str2 = str6;
            list = list2;
        } else {
            strDecodeStringElement = null;
            TestDeletedModalItem testDeletedModalItem2 = null;
            String str7 = null;
            EditBiomarkerDialog editBiomarkerDialog5 = null;
            PrimaryButtonModel primaryButtonModel5 = null;
            String str8 = null;
            PrimaryButtonModel primaryButtonModel6 = null;
            List list3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            int i14 = 5;
            boolean z4 = true;
            i13 = 0;
            DividerModel dividerModel5 = null;
            EditBiomarkerDialog editBiomarkerDialog6 = null;
            DividerModel dividerModel6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        i13 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 5;
                        break;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i13 |= 2;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 5;
                        break;
                    case 2:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i13 |= 4;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 5;
                        break;
                    case 3:
                        dividerModel5 = (DividerModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, DividerModel$$serializer.INSTANCE, dividerModel5);
                        i13 |= 8;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 5;
                        break;
                    case 4:
                        dividerModel6 = (DividerModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, DividerModel$$serializer.INSTANCE, dividerModel6);
                        i13 |= 16;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 5;
                        break;
                    case 5:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), list3);
                        i13 |= 32;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 6:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        primaryButtonModel5 = (PrimaryButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, PrimaryButtonModel$$serializer.INSTANCE, primaryButtonModel5);
                        i13 |= 64;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 7:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        primaryButtonModel6 = (PrimaryButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, PrimaryButtonModel$$serializer.INSTANCE, primaryButtonModel6);
                        i13 |= 128;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 8:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        editBiomarkerDialog6 = (EditBiomarkerDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, EditBiomarkerDialog$$serializer.INSTANCE, editBiomarkerDialog6);
                        i13 |= 256;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 9:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        editBiomarkerDialog5 = (EditBiomarkerDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, EditBiomarkerDialog$$serializer.INSTANCE, editBiomarkerDialog5);
                        i13 |= 512;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 10:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str7);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        break;
                    case 11:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str8);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 12:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        testDeletedModalItem2 = (TestDeletedModalItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, TestDeletedModalItem$$serializer.INSTANCE, testDeletedModalItem2);
                        i13 |= 4096;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            dividerModel = dividerModel5;
            testDeletedModalItem = testDeletedModalItem2;
            str = str7;
            editBiomarkerDialog = editBiomarkerDialog5;
            primaryButtonModel = primaryButtonModel5;
            str2 = str8;
            primaryButtonModel2 = primaryButtonModel6;
            list = list3;
            editBiomarkerDialog2 = editBiomarkerDialog6;
            dividerModel2 = dividerModel6;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
        }
        String str9 = strDecodeStringElement;
        int i15 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new EditBiomarkersResponse(i15, str9, str3, str4, dividerModel, dividerModel2, list, primaryButtonModel, primaryButtonModel2, editBiomarkerDialog2, editBiomarkerDialog, str, str2, testDeletedModalItem, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, EditBiomarkersResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        EditBiomarkersResponse.write$Self$advanced_labs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
