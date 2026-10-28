package com.whoop.clinicianintheloop.api;

import com.whoop.design.models.items.form.FormTextFieldModel;
import com.whoop.design.models.items.form.FormTextFieldModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/clinicianintheloop/api/PersonalIntakeForm.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class PersonalIntakeForm$$serializer implements GeneratedSerializer<PersonalIntakeForm> {
    public static final int $stable;
    public static final PersonalIntakeForm$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        PersonalIntakeForm$$serializer personalIntakeForm$$serializer = new PersonalIntakeForm$$serializer();
        INSTANCE = personalIntakeForm$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.clinicianintheloop.api.PersonalIntakeForm", personalIntakeForm$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("firstName", false);
        pluginGeneratedSerialDescriptor.addElement("lastName", false);
        pluginGeneratedSerialDescriptor.addElement("dateOfBirth", false);
        pluginGeneratedSerialDescriptor.addElement("address_line_1", false);
        pluginGeneratedSerialDescriptor.addElement("address_line_2", false);
        pluginGeneratedSerialDescriptor.addElement("city", false);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        pluginGeneratedSerialDescriptor.addElement("zipCode", false);
        pluginGeneratedSerialDescriptor.addElement("country", false);
        pluginGeneratedSerialDescriptor.addElement("phoneNumber", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PersonalIntakeForm$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        FormTextFieldModel$$serializer formTextFieldModel$$serializer = FormTextFieldModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{formTextFieldModel$$serializer, formTextFieldModel$$serializer, formTextFieldModel$$serializer, formTextFieldModel$$serializer, formTextFieldModel$$serializer, formTextFieldModel$$serializer, formTextFieldModel$$serializer, formTextFieldModel$$serializer, formTextFieldModel$$serializer, formTextFieldModel$$serializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final PersonalIntakeForm deserialize(InterfaceC40541d decoder) {
        int i13;
        FormTextFieldModel formTextFieldModel;
        FormTextFieldModel formTextFieldModel2;
        FormTextFieldModel formTextFieldModel3;
        FormTextFieldModel formTextFieldModel4;
        FormTextFieldModel formTextFieldModel5;
        FormTextFieldModel formTextFieldModel6;
        FormTextFieldModel formTextFieldModel7;
        FormTextFieldModel formTextFieldModel8;
        FormTextFieldModel formTextFieldModel9;
        FormTextFieldModel formTextFieldModel10;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 9;
        FormTextFieldModel formTextFieldModel11 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            FormTextFieldModel$$serializer formTextFieldModel$$serializer = FormTextFieldModel$$serializer.INSTANCE;
            FormTextFieldModel formTextFieldModel12 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, formTextFieldModel$$serializer, null);
            FormTextFieldModel formTextFieldModel13 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, formTextFieldModel$$serializer, null);
            FormTextFieldModel formTextFieldModel14 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, formTextFieldModel$$serializer, null);
            FormTextFieldModel formTextFieldModel15 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, formTextFieldModel$$serializer, null);
            FormTextFieldModel formTextFieldModel16 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, formTextFieldModel$$serializer, null);
            FormTextFieldModel formTextFieldModel17 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, formTextFieldModel$$serializer, null);
            FormTextFieldModel formTextFieldModel18 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, formTextFieldModel$$serializer, null);
            FormTextFieldModel formTextFieldModel19 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, formTextFieldModel$$serializer, null);
            FormTextFieldModel formTextFieldModel20 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, formTextFieldModel$$serializer, null);
            formTextFieldModel = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, formTextFieldModel$$serializer, null);
            i13 = 1023;
            formTextFieldModel4 = formTextFieldModel19;
            formTextFieldModel3 = formTextFieldModel18;
            formTextFieldModel5 = formTextFieldModel17;
            formTextFieldModel7 = formTextFieldModel15;
            formTextFieldModel2 = formTextFieldModel20;
            formTextFieldModel6 = formTextFieldModel16;
            formTextFieldModel10 = formTextFieldModel14;
            formTextFieldModel9 = formTextFieldModel13;
            formTextFieldModel8 = formTextFieldModel12;
        } else {
            boolean z4 = true;
            int i15 = 0;
            FormTextFieldModel formTextFieldModel21 = null;
            FormTextFieldModel formTextFieldModel22 = null;
            FormTextFieldModel formTextFieldModel23 = null;
            FormTextFieldModel formTextFieldModel24 = null;
            FormTextFieldModel formTextFieldModel25 = null;
            FormTextFieldModel formTextFieldModel26 = null;
            FormTextFieldModel formTextFieldModel27 = null;
            FormTextFieldModel formTextFieldModel28 = null;
            FormTextFieldModel formTextFieldModel29 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 9;
                        break;
                    case 0:
                        formTextFieldModel11 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, FormTextFieldModel$$serializer.INSTANCE, formTextFieldModel11);
                        i15 |= 1;
                        i14 = 9;
                        break;
                    case 1:
                        formTextFieldModel28 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, FormTextFieldModel$$serializer.INSTANCE, formTextFieldModel28);
                        i15 |= 2;
                        i14 = 9;
                        break;
                    case 2:
                        formTextFieldModel29 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, FormTextFieldModel$$serializer.INSTANCE, formTextFieldModel29);
                        i15 |= 4;
                        i14 = 9;
                        break;
                    case 3:
                        formTextFieldModel27 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, FormTextFieldModel$$serializer.INSTANCE, formTextFieldModel27);
                        i15 |= 8;
                        i14 = 9;
                        break;
                    case 4:
                        formTextFieldModel26 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, FormTextFieldModel$$serializer.INSTANCE, formTextFieldModel26);
                        i15 |= 16;
                        i14 = 9;
                        break;
                    case 5:
                        formTextFieldModel25 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, FormTextFieldModel$$serializer.INSTANCE, formTextFieldModel25);
                        i15 |= 32;
                        i14 = 9;
                        break;
                    case 6:
                        formTextFieldModel23 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, FormTextFieldModel$$serializer.INSTANCE, formTextFieldModel23);
                        i15 |= 64;
                        i14 = 9;
                        break;
                    case 7:
                        formTextFieldModel24 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, FormTextFieldModel$$serializer.INSTANCE, formTextFieldModel24);
                        i15 |= 128;
                        i14 = 9;
                        break;
                    case 8:
                        formTextFieldModel22 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, FormTextFieldModel$$serializer.INSTANCE, formTextFieldModel22);
                        i15 |= 256;
                        break;
                    case 9:
                        formTextFieldModel21 = (FormTextFieldModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, FormTextFieldModel$$serializer.INSTANCE, formTextFieldModel21);
                        i15 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            formTextFieldModel = formTextFieldModel21;
            formTextFieldModel2 = formTextFieldModel22;
            formTextFieldModel3 = formTextFieldModel23;
            formTextFieldModel4 = formTextFieldModel24;
            formTextFieldModel5 = formTextFieldModel25;
            formTextFieldModel6 = formTextFieldModel26;
            formTextFieldModel7 = formTextFieldModel27;
            formTextFieldModel8 = formTextFieldModel11;
            formTextFieldModel9 = formTextFieldModel28;
            formTextFieldModel10 = formTextFieldModel29;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new PersonalIntakeForm(i13, formTextFieldModel8, formTextFieldModel9, formTextFieldModel10, formTextFieldModel7, formTextFieldModel6, formTextFieldModel5, formTextFieldModel3, formTextFieldModel4, formTextFieldModel2, formTextFieldModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, PersonalIntakeForm value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        PersonalIntakeForm.write$Self$clinician_in_the_loop_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
