package com.whoop.design.models.items;

import com.mapbox.common.HttpHeaders;
import com.whoop.navigation.C9598e;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/AppointmentCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/AppointmentCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/AppointmentCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/AppointmentCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class AppointmentCardModel$$serializer implements GeneratedSerializer<AppointmentCardModel> {
    public static final int $stable;
    public static final AppointmentCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        AppointmentCardModel$$serializer appointmentCardModel$$serializer = new AppointmentCardModel$$serializer();
        INSTANCE = appointmentCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.AppointmentCardModel", appointmentCardModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("header", true);
        pluginGeneratedSerialDescriptor.addElement("iconButton", true);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("imageAlignment", true);
        pluginGeneratedSerialDescriptor.addElement(HttpHeaders.DATE, true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement("destination", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AppointmentCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = AppointmentCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(AppointmentCardIconButtonModel$$serializer.INSTANCE), AbstractC38195a.m122336d(TagModel$$serializer.INSTANCE), stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(AppointmentCardDateModel$$serializer.INSTANCE), interfaceC23462hArr[9].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final AppointmentCardModel deserialize(InterfaceC40541d decoder) {
        C9598e c9598e;
        List list;
        AppointmentCardDateModel appointmentCardDateModel;
        String str;
        String str2;
        String str3;
        int i13;
        TagModel tagModel;
        AppointmentCardIconButtonModel appointmentCardIconButtonModel;
        String str4;
        String str5;
        String str6;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = AppointmentCardModel.$childSerializers;
        String str7 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            AppointmentCardIconButtonModel appointmentCardIconButtonModel2 = (AppointmentCardIconButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, AppointmentCardIconButtonModel$$serializer.INSTANCE, null);
            TagModel tagModel2 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, TagModel$$serializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            AppointmentCardDateModel appointmentCardDateModel2 = (AppointmentCardDateModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, AppointmentCardDateModel$$serializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            str2 = str11;
            appointmentCardDateModel = appointmentCardDateModel2;
            str = str10;
            str6 = strDecodeStringElement2;
            str5 = strDecodeStringElement;
            list = list2;
            str3 = str9;
            tagModel = tagModel2;
            appointmentCardIconButtonModel = appointmentCardIconButtonModel2;
            i13 = 2047;
            str4 = str8;
        } else {
            int i14 = 10;
            boolean z4 = true;
            int i15 = 0;
            C9598e c9598e2 = null;
            List list3 = null;
            AppointmentCardDateModel appointmentCardDateModel3 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            TagModel tagModel3 = null;
            AppointmentCardIconButtonModel appointmentCardIconButtonModel3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str7);
                        i15 |= 1;
                        i14 = 10;
                        break;
                    case 1:
                        appointmentCardIconButtonModel3 = (AppointmentCardIconButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, AppointmentCardIconButtonModel$$serializer.INSTANCE, appointmentCardIconButtonModel3);
                        i15 |= 2;
                        i14 = 10;
                        break;
                    case 2:
                        tagModel3 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, TagModel$$serializer.INSTANCE, tagModel3);
                        i15 |= 4;
                        i14 = 10;
                        break;
                    case 3:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i15 |= 8;
                        i14 = 10;
                        break;
                    case 4:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str14);
                        i15 |= 16;
                        i14 = 10;
                        break;
                    case 5:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i15 |= 32;
                        i14 = 10;
                        break;
                    case 6:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str12);
                        i15 |= 64;
                        i14 = 10;
                        break;
                    case 7:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str13);
                        i15 |= 128;
                        i14 = 10;
                        break;
                    case 8:
                        appointmentCardDateModel3 = (AppointmentCardDateModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, AppointmentCardDateModel$$serializer.INSTANCE, appointmentCardDateModel3);
                        i15 |= 256;
                        i14 = 10;
                        break;
                    case 9:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), list3);
                        i15 |= 512;
                        break;
                    case 10:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), c9598e2);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            c9598e = c9598e2;
            list = list3;
            appointmentCardDateModel = appointmentCardDateModel3;
            str = str12;
            str2 = str13;
            str3 = str14;
            i13 = i15;
            tagModel = tagModel3;
            appointmentCardIconButtonModel = appointmentCardIconButtonModel3;
            str4 = str7;
            str5 = strDecodeStringElement3;
            str6 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new AppointmentCardModel(i13, str4, appointmentCardIconButtonModel, tagModel, str5, str3, str6, str, str2, appointmentCardDateModel, list, c9598e, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, AppointmentCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        AppointmentCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
