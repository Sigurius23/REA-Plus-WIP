package com.whoop.clinicianintheloop.domain.models;

import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.ImageUrlModel$$serializer;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ClinicianHeaderModel$$serializer implements GeneratedSerializer<ClinicianHeaderModel> {
    public static final int $stable;
    public static final ClinicianHeaderModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ClinicianHeaderModel$$serializer clinicianHeaderModel$$serializer = new ClinicianHeaderModel$$serializer();
        INSTANCE = clinicianHeaderModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.clinicianintheloop.domain.models.ClinicianHeaderModel", clinicianHeaderModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("headshot", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("tag", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("useTileBackground", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ClinicianHeaderModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(ImageUrlModel$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(TagModel$$serializer.INSTANCE), AbstractC38195a.m122336d(TappableIconModel$$serializer.INSTANCE), BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ClinicianHeaderModel deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        TappableIconModel tappableIconModel;
        int i13;
        String str;
        ImageUrlModel imageUrlModel;
        String str2;
        String str3;
        TagModel tagModel;
        boolean z4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            ImageUrlModel imageUrlModel2 = (ImageUrlModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ImageUrlModel$$serializer.INSTANCE, null);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            TagModel tagModel2 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, TagModel$$serializer.INSTANCE, null);
            TappableIconModel tappableIconModel2 = (TappableIconModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, TappableIconModel$$serializer.INSTANCE, null);
            str = strDecodeStringElement;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            tappableIconModel = tappableIconModel2;
            str3 = strDecodeStringElement2;
            tagModel = tagModel2;
            str2 = str4;
            imageUrlModel = imageUrlModel2;
            i13 = 127;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement3 = null;
            ImageUrlModel imageUrlModel3 = null;
            String str5 = null;
            String strDecodeStringElement4 = null;
            TagModel tagModel3 = null;
            int i15 = 0;
            TappableIconModel tappableIconModel3 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        z4 = true;
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        z4 = true;
                        imageUrlModel3 = (ImageUrlModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ImageUrlModel$$serializer.INSTANCE, imageUrlModel3);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str5);
                        i15 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        tagModel3 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, TagModel$$serializer.INSTANCE, tagModel3);
                        i15 |= 16;
                        break;
                    case 5:
                        tappableIconModel3 = (TappableIconModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, TappableIconModel$$serializer.INSTANCE, tappableIconModel3);
                        i15 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i14);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            tappableIconModel = tappableIconModel3;
            i13 = i15;
            str = strDecodeStringElement3;
            imageUrlModel = imageUrlModel3;
            str2 = str5;
            str3 = strDecodeStringElement4;
            tagModel = tagModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ClinicianHeaderModel(i13, str, imageUrlModel, str2, str3, tagModel, tappableIconModel, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ClinicianHeaderModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ClinicianHeaderModel.write$Self$clinician_in_the_loop_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
